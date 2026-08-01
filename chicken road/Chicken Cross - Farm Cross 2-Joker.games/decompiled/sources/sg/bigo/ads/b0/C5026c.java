package sg.bigo.ads.b0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.lang.ref.WeakReference;
import sg.bigo.ads.X0.j;

/* renamed from: sg.bigo.ads.b0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5026c extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public static C5026c f12690a;
    public static WeakReference b;

    public C5026c(Context context) {
        super(context, "bigo_ads_sdk.db", (SQLiteDatabase.CursorFactory) null, 6);
        b = new WeakReference(context);
    }

    public static synchronized C5026c a(Context context) {
        C5026c c5026c;
        synchronized (C5026c.class) {
            if (f12690a == null) {
                f12690a = new C5026c(context);
            }
            c5026c = f12690a;
        }
        return c5026c;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_event (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_action TEXT NOT NULL,event_info TEXT NOT NULL,states INTEGER DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_tracker (_id INTEGER PRIMARY KEY AUTOINCREMENT,ad_data TEXT NOT NULL,tracker_imp TEXT,tracker_cli TEXT,tracker_nurl TEXT,tracker_lurl TEXT,tracker_type INTEGER DEFAULT 0 NOT NULL,last_retry_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_stat (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_id TEXT NOT NULL,event_info TEXT NOT NULL,expired_ts LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_resource (_id INTEGER PRIMARY KEY AUTOINCREMENT,res_file_name TEXT NOT NULL,sdk_init_millis LONG DEFAULT 0 NOT NULL,res_delete_millis LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_webview (_id INTEGER PRIMARY KEY AUTOINCREMENT,session_id TEXT,sid TEXT,dsp TEXT,ad_id TEXT,creative_id TEXT,url TEXT,ad_type INTEGER DEFAULT 0,adx_type INTEGER DEFAULT 0,click_index INTEGER DEFAULT 0,resolution TEXT,cost LONG DEFAULT 0,action INTEGER DEFAULT 0,click_trace TEXT,touch_trace TEXT,scroll_trace TEXT,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Context context;
        String str = "onDowngrade oldVersion=" + i + ",newVersion=" + i2;
        super.onDowngrade(sQLiteDatabase, i, i2);
        WeakReference weakReference = b;
        if (weakReference == null || (context = (Context) weakReference.get()) == null) {
            return;
        }
        AbstractC5025b.a(str, context);
        AbstractC5025b.b.set(false);
        AbstractC5025b.f12689a = null;
        AbstractC5025b.a(context, (j) null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_report (_id INTEGER PRIMARY KEY AUTOINCREMENT,pkg_name TEXT NOT NULL,status INTEGER DEFAULT 0,source INTEGER DEFAULT 0,check_ts LONG DEFAULT 0,result INTEGER DEFAULT 0,install_ts LONG DEFAULT 0,valid_date_ts LONG DEFAULT 0,sid LONG DEFAULT 0,ad_id TEXT,dsp TEXT,ext TEXT,mtime LONG DEFAULT 0 NOT NULL,ctime DATETIME DEFAULT CURRENT_TIMESTAMP,UNIQUE (pkg_name,status,source,sid));");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_addata (_id INTEGER PRIMARY KEY AUTOINCREMENT,slot TEXT NOT NULL UNIQUE,log_id TEXT,start_time LONG DEFAULT 0,end_time LONG DEFAULT 0,ad_data TEXT NOT NULL,ext TEXT,mtime LONG DEFAULT 0,ctime DATETIME DEFAULT CURRENT_TIMESTAMP);");
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_nurl TEXT");
            sQLiteDatabase.execSQL("ALTER TABLE tb_tracker ADD tracker_lurl TEXT");
        }
        if (i < 5) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_resource (_id INTEGER PRIMARY KEY AUTOINCREMENT,res_file_name TEXT NOT NULL,sdk_init_millis LONG DEFAULT 0 NOT NULL,res_delete_millis LONG DEFAULT 0 NOT NULL,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        }
        if (i < 6) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tb_webview (_id INTEGER PRIMARY KEY AUTOINCREMENT,session_id TEXT,sid TEXT,dsp TEXT,ad_id TEXT,creative_id TEXT,url TEXT,ad_type INTEGER DEFAULT 0,adx_type INTEGER DEFAULT 0,click_index INTEGER DEFAULT 0,resolution TEXT,cost LONG DEFAULT 0,action INTEGER DEFAULT 0,click_trace TEXT,touch_trace TEXT,scroll_trace TEXT,ext TEXT,ctime LONG DEFAULT 0 NOT NULL,mtime LONG DEFAULT 0 NOT NULL);");
        }
    }
}
