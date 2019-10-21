package com.yogiapp.biodatapresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir soekarno", "Presiden Pertama", R.drawable.soekarno))
        list.add(Model("Soeharto", "Presiden Kedua", R.drawable.suharto))
        list.add(Model("BJ Habibie", "Presiden Ketiga", R.drawable.habibi))
        list.add(Model("Abdurrahman Wahid", "Presiden Keempat", R.drawable.gusdur))
        list.add(Model("Megawati", "Presiden Kelima", R.drawable.megawati))
        list.add(Model("Susilo Bambang Yudhoyono", "Presiden Keenam", R.drawable.sby))
        list.add(Model("Joko Widodo", "Presiden Ketujuh", R.drawable.jokowi))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "Bung Karno adalah nama populer dari Soekarno. Lahir pada 6 Juni 1901 di Blitar, Jawa Timur. Ketika Soekarno kecil, ia tidak tinggal bersama dengan orang tuanya yang berada di Blitar. Ia tinggal bersama dengan kakeknya yang bernama Raden Hardjokromo di Tulung Agung, Jawa Timur.", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "Jend. Besar TNI Purn. Haji Muhammad Soeharto adalah Presiden kedua Republik Indonesia. Beliau lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921. Bapaknya bernama Kertosudiro seorang petani yang juga sebagai pembantu lurah dalam pengairan sawah desa, sedangkan ibunya bernama Sukirah.", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Bacharuddin Jusuf Habibie atau yang lebih dikenal dengan BJ Habibie adalah salah satu tokoh panutan dan disegani di Indonesia. Beliau berkiprah tidak hanya di Indonesia saja, melainkan juga di luar negeri.", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "Pertama kali belajar, Gus Dur kecil belajar pada sang kakek, K.H. Hasyim Asy'ari. Saat serumah dengan kakeknya, ia diajari mengaji dan membaca al-Qur'an. Dalam usia lima tahun ia telah lancar membaca al-Qur'an. Pada saat sang ayah pindah ke Jakarta, di samping belajar formal di sekolah, Gus Dur masuk juga mengikuti les privat Bahasa Belanda. ", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Bernama Lengkap Diah Permata Megawati Setiawati Soekarnoputri atau akrab di sapa Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947.", Toast.LENGTH_LONG).show()
            }
            if (position == 5 ){
                Toast.makeText(this@MainActivity, "Jenderal TNI (Purn) Susilo Bambang Yudhoyono adalah presiden Republik Indonesia keenam. Berbeda dengan presiden sebelumnya, Susilo Bambang Yudhoyono merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses Pemilu Presiden putaran II 20 September 2004.", Toast.LENGTH_LONG).show()
            }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Jokowi dilahirkan dengan nama lengkap Joko Widodo. Ia lahir di Surakarta, 21 Juni 1961. Ia merupakan Putera dari pasangan Noto Mihardjo dan Sudhiatmi dan anak sulung dari empat bersaudara.", Toast.LENGTH_LONG).show()
            }
        }
    }
}
