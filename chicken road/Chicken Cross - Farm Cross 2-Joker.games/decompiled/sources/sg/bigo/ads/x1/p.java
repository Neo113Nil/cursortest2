package sg.bigo.ads.x1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class p {
    public static boolean g = false;
    public static final p h = new p();
    public sg.bigo.ads.P.u c;
    public sg.bigo.ads.V0.i d;
    public Context e;

    /* renamed from: a, reason: collision with root package name */
    public final Set f13400a = H.a(50);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final n f = new n(this);

    public final void a(s sVar) {
        Cursor cursor = null;
        if (!g) {
            g = true;
            AbstractC5446j.a(this.f);
            AbstractC5446j.a(1, null, this.f, 20000L);
        }
        this.f13400a.add(sVar);
        sVar.toString();
        boolean z = false;
        String str = new String[]{"_id"}[0] + "=? ";
        String[] strArr = {String.valueOf(sVar.f13403a)};
        AbstractC5025b.a();
        SQLiteDatabase sQLiteDatabase = AbstractC5025b.c;
        if (sQLiteDatabase != null) {
            try {
                cursor = sQLiteDatabase.query("tb_tracker", null, str, strArr, null, null, null);
            } catch (Throwable unused) {
            }
        }
        if (cursor != null) {
            z = cursor.moveToNext();
            cursor.close();
        }
        if (z) {
            sg.bigo.ads.d0.b.b(sVar);
        } else {
            sVar.toString();
            sVar.f13403a = AbstractC5025b.a("tb_tracker", sg.bigo.ads.d0.b.a(sVar));
        }
    }
}
