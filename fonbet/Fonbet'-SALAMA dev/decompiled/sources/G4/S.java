package G4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteProgram;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import n1.C1450e;
import w1.C1726n0;
import w1.C1759x1;
import w1.P2;

/* loaded from: classes2.dex */
public final class S extends P6.b {

    /* renamed from: c, reason: collision with root package name */
    public final P f2929c;

    /* renamed from: d, reason: collision with root package name */
    public final R4.c f2930d;

    /* renamed from: e, reason: collision with root package name */
    public final W f2931e;

    /* renamed from: f, reason: collision with root package name */
    public final P2 f2932f;

    /* renamed from: g, reason: collision with root package name */
    public final C1759x1 f2933g;

    /* renamed from: h, reason: collision with root package name */
    public final M f2934h;

    /* renamed from: i, reason: collision with root package name */
    public final O f2935i;
    public SQLiteDatabase j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2936k;

    public S(Context context, String str, H4.f fVar, R4.c cVar, E4.y yVar) {
        P p5 = new P(context, cVar, a0(str, fVar));
        this.f2935i = new O(this);
        this.f2929c = p5;
        this.f2930d = cVar;
        this.f2931e = new W(this, cVar);
        this.f2932f = new P2(11, this, cVar, false);
        this.f2933g = new C1759x1(this, cVar);
        this.f2934h = new M(this, yVar);
    }

    public static void Y(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (obj == null) {
                sQLiteProgram.bindNull(i7 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i7 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i7 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i7 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i7 + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    p3.f.F("Unknown argument %s of type %s", obj, obj.getClass());
                    throw null;
                }
                sQLiteProgram.bindBlob(i7 + 1, (byte[]) obj);
            }
        }
    }

    public static void Z(Context context, H4.f fVar, String str) {
        String path = context.getDatabasePath(a0(str, fVar)).getPath();
        String e7 = e1.k.e(path, "-journal");
        String e8 = e1.k.e(path, "-wal");
        File file = new File(path);
        File file2 = new File(e7);
        File file3 = new File(e8);
        try {
            P6.b.j(file);
            P6.b.j(file2);
            P6.b.j(file3);
        } catch (IOException e9) {
            throw new B4.I("Failed to clear persistence." + e9, B4.H.UNKNOWN);
        }
    }

    public static String a0(String str, H4.f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f3313a, "utf-8") + "." + URLEncoder.encode(fVar.f3314b, "utf-8");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // P6.b
    public final Object G(String str, L4.p pVar) {
        Q0.a.v(1, "b", "Starting transaction: %s", str);
        this.j.beginTransactionWithListener(this.f2935i);
        try {
            Object obj = pVar.get();
            this.j.setTransactionSuccessful();
            return obj;
        } finally {
            this.j.endTransaction();
        }
    }

    @Override // P6.b
    public final void H(Runnable runnable, String str) {
        Q0.a.v(1, "b", "Starting transaction: %s", str);
        this.j.beginTransactionWithListener(this.f2935i);
        try {
            runnable.run();
            this.j.setTransactionSuccessful();
        } finally {
            this.j.endTransaction();
        }
    }

    @Override // P6.b
    public final void L() {
        p3.f.O("SQLitePersistence shutdown without start!", this.f2936k, new Object[0]);
        this.f2936k = false;
        this.j.close();
        this.j = null;
    }

    @Override // P6.b
    public final void M() {
        boolean z4;
        p3.f.O("SQLitePersistence double-started!", !this.f2936k, new Object[0]);
        this.f2936k = true;
        try {
            this.j = this.f2929c.getWritableDatabase();
            W w7 = this.f2931e;
            C1726n0 c0 = w7.f2947a.c0("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1");
            I i7 = new I(w7, 2);
            Cursor J5 = c0.J();
            try {
                if (J5.moveToFirst()) {
                    i7.accept(J5);
                    J5.close();
                    z4 = true;
                } else {
                    J5.close();
                    z4 = false;
                }
                p3.f.O("Missing target_globals entry", z4, new Object[0]);
                long j = w7.f2950d;
                M m7 = this.f2934h;
                m7.getClass();
                E4.y yVar = new E4.y();
                yVar.f2247a = j;
                m7.f2917c = yVar;
            } catch (Throwable th) {
                if (J5 != null) {
                    try {
                        J5.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e7) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e7);
        }
    }

    public final void b0(String str, Object... objArr) {
        this.j.execSQL(str, objArr);
    }

    public final C1726n0 c0(String str) {
        return new C1726n0(this.j, str);
    }

    @Override // P6.b
    public final P2 l() {
        return this.f2932f;
    }

    @Override // P6.b
    public final InterfaceC0268a n(C4.e eVar) {
        return new android.support.v4.media.session.t(this, this.f2930d, eVar);
    }

    @Override // P6.b
    public final InterfaceC0273f o(C4.e eVar) {
        return new K(this, this.f2930d, eVar);
    }

    @Override // P6.b
    public final InterfaceC0290x p(C4.e eVar, InterfaceC0273f interfaceC0273f) {
        R4.c cVar = this.f2930d;
        E4.L l7 = new E4.L();
        l7.f2142b = this;
        l7.f2143c = cVar;
        String str = eVar.f1580a;
        if (str == null) {
            str = "";
        }
        l7.f2145e = str;
        l7.f2146f = K4.H.f3985u;
        l7.f2144d = interfaceC0273f;
        return l7;
    }

    @Override // P6.b
    public final InterfaceC0291y q() {
        return new C1450e(this, 3);
    }

    @Override // P6.b
    public final C r() {
        return this.f2934h;
    }

    @Override // P6.b
    public final D s() {
        return this.f2933g;
    }

    @Override // P6.b
    public final Y t() {
        return this.f2931e;
    }

    @Override // P6.b
    public final boolean y() {
        return this.f2936k;
    }
}
