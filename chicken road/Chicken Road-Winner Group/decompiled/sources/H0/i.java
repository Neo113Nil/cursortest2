package H0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import x0.C1249b;

/* loaded from: classes.dex */
public final class i implements d, I0.c, c {
    public static final C1249b f = new C1249b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final k f498a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.j f499b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.j f500c;

    /* renamed from: d, reason: collision with root package name */
    public final a f501d;

    /* renamed from: e, reason: collision with root package name */
    public final c2.a f502e;

    public i(P0.j jVar, P0.j jVar2, a aVar, k kVar, c2.a aVar2) {
        this.f498a = kVar;
        this.f499b = jVar;
        this.f500c = jVar2;
        this.f501d = aVar;
        this.f502e = aVar2;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, A0.k kVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(kVar.f69a, String.valueOf(K0.a.a(kVar.f71c))));
        byte[] bArr = kVar.f70b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = query;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String g(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f490a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object h(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        k kVar = this.f498a;
        Objects.requireNonNull(kVar);
        P0.j jVar = this.f500c;
        long c3 = jVar.c();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e3) {
                if (jVar.c() >= this.f501d.f487c + c3) {
                    throw new I0.a("Timed out while trying to open db.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(g gVar) {
        SQLiteDatabase a3 = a();
        a3.beginTransaction();
        try {
            Object apply = gVar.apply(a3);
            a3.setTransactionSuccessful();
            return apply;
        } finally {
            a3.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f498a.close();
    }

    public final ArrayList d(SQLiteDatabase sQLiteDatabase, A0.k kVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Long b3 = b(sQLiteDatabase, kVar);
        if (b3 == null) {
            return arrayList;
        }
        h(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b3.toString()}, null, null, null, String.valueOf(i3)), new F0.b(this, (Object) arrayList, kVar, 3));
        return arrayList;
    }

    public final void e(long j3, D0.d dVar, String str) {
        c(new G0.k(j3, str, dVar));
    }

    public final Object f(I0.b bVar) {
        SQLiteDatabase a3 = a();
        P0.j jVar = this.f500c;
        long c3 = jVar.c();
        while (true) {
            try {
                a3.beginTransaction();
                try {
                    Object execute = bVar.execute();
                    a3.setTransactionSuccessful();
                    return execute;
                } finally {
                    a3.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e3) {
                if (jVar.c() >= this.f501d.f487c + c3) {
                    throw new I0.a("Timed out while trying to acquire the lock.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
