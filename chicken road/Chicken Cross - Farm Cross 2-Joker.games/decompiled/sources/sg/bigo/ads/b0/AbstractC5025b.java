package sg.bigo.ads.b0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.X0.j;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.b0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5025b {

    /* renamed from: a, reason: collision with root package name */
    public static g f12689a;
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static SQLiteDatabase c;

    public static void a() {
        Runnable runnable;
        g gVar = f12689a;
        if (gVar == null || b.get()) {
            return;
        }
        while (true) {
            synchronized (gVar.b) {
                runnable = (Runnable) gVar.f12694a.poll();
            }
            if (runnable == null) {
                return;
            } else {
                runnable.run();
            }
        }
    }

    public static long b(String str, ContentValues contentValues) {
        a();
        if (c != null && !sg.bigo.ads.F0.a.f()) {
            try {
                return c.insertWithOnConflict(str, null, contentValues, 5);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static int a(String str, String str2, String[] strArr) {
        a();
        SQLiteDatabase sQLiteDatabase = c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void a(String str, Context context) {
        File databasePath = context.getDatabasePath("bigo_ads_sdk.db");
        boolean exists = databasePath.exists();
        boolean isFile = databasePath.isFile();
        boolean canRead = databasePath.canRead();
        boolean canWrite = databasePath.canWrite();
        boolean canExecute = databasePath.canExecute();
        boolean isHidden = databasePath.isHidden();
        AbstractC5496a.a("DbHelper", "exception path:" + databasePath.getPath() + " exists:" + exists + " isfile:" + isFile + " read:" + canRead + " write:" + canWrite + " exec:" + canExecute + " hidden:" + isHidden + " errormsg:" + str);
        context.deleteDatabase("bigo_ads_sdk.db");
        C5026c.f12690a = null;
    }

    public static void a(Context context, j jVar) {
        g gVar = new g();
        f12689a = gVar;
        f fVar = new f(new RunnableC5024a(context, jVar));
        e eVar = fVar.c;
        synchronized (gVar.b) {
            gVar.f12694a.add(eVar);
        }
        gVar.c.execute(new RunnableC5027d(gVar, fVar, eVar));
    }

    public static long a(String str, ContentValues contentValues) {
        a();
        if (c != null && !sg.bigo.ads.F0.a.f()) {
            try {
                return c.insert(str, null, contentValues);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static Cursor a(String str, String str2, String[] strArr, String str3, int i) {
        String num;
        a();
        if (c == null) {
            return null;
        }
        if (i < 0) {
            num = null;
        } else {
            try {
                num = Integer.toString(i);
            } catch (Throwable unused) {
                return null;
            }
        }
        return c.query(str, null, str2, strArr, null, null, str3, num);
    }
}
