package c1;

import a1.C0178b;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b1.C0272i;
import e1.InterfaceC0410a;
import e4.InterfaceC0412a;
import f1.AbstractC0416a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i implements d, d1.c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final S0.c f4907f = new S0.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final k f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0410a f4909b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0410a f4910c;

    /* renamed from: d, reason: collision with root package name */
    public final C0308a f4911d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0412a f4912e;

    public i(InterfaceC0410a interfaceC0410a, InterfaceC0410a interfaceC0410a2, C0308a c0308a, k kVar, InterfaceC0412a interfaceC0412a) {
        this.f4908a = kVar;
        this.f4909b = interfaceC0410a;
        this.f4910c = interfaceC0410a2;
        this.f4911d = c0308a;
        this.f4912e = interfaceC0412a;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, V0.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f3208a, String.valueOf(AbstractC0416a.a(iVar.f3210c))));
        byte[] bArr = iVar.f3209b;
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

    public static String q(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C0309b) it.next()).f4899a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object y(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        k kVar = this.f4908a;
        Objects.requireNonNull(kVar);
        InterfaceC0410a interfaceC0410a = this.f4910c;
        long e3 = interfaceC0410a.e();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e6) {
                if (interfaceC0410a.e() >= this.f4911d.f4896c + e3) {
                    throw new d1.a("Timed out while trying to open db.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object c(g gVar) {
        SQLiteDatabase a6 = a();
        a6.beginTransaction();
        try {
            Object apply = gVar.apply(a6);
            a6.setTransactionSuccessful();
            return apply;
        } finally {
            a6.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4908a.close();
    }

    public final ArrayList g(SQLiteDatabase sQLiteDatabase, V0.i iVar, int i2) {
        ArrayList arrayList = new ArrayList();
        Long b6 = b(sQLiteDatabase, iVar);
        if (b6 == null) {
            return arrayList;
        }
        y(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b6.toString()}, null, null, null, String.valueOf(i2)), new C0178b(this, (Object) arrayList, iVar, 2));
        return arrayList;
    }

    public final void o(long j2, Y0.c cVar, String str) {
        c(new C0272i(j2, str, cVar));
    }

    public final Object p(d1.b bVar) {
        SQLiteDatabase a6 = a();
        InterfaceC0410a interfaceC0410a = this.f4910c;
        long e3 = interfaceC0410a.e();
        while (true) {
            try {
                a6.beginTransaction();
                try {
                    Object execute = bVar.execute();
                    a6.setTransactionSuccessful();
                    return execute;
                } finally {
                    a6.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e6) {
                if (interfaceC0410a.e() >= this.f4911d.f4896c + e3) {
                    throw new d1.a("Timed out while trying to acquire the lock.", e6);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
