package g0;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0.p f1120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f1121d;

    public n(o oVar, e eVar, String str, C0.p pVar) {
        this.f1121d = oVar;
        this.f1118a = eVar;
        this.f1119b = str;
        this.f1120c = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (o.f1125f) {
            e eVar = this.f1118a;
            if (eVar != null) {
                o.a(this.f1121d, eVar);
            }
            try {
                if (AbstractC0061a.b(o.f1126g)) {
                    Log.d("Sqflite", "delete database " + this.f1119b);
                }
                SQLiteDatabase.deleteDatabase(new File(this.f1119b));
            } catch (Exception e2) {
                Log.e("Sqflite", "error " + e2 + " while closing database " + o.f1130k);
            }
        }
        this.f1120c.c(null);
    }
}
