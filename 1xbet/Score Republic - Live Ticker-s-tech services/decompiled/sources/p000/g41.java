package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g41 implements Closeable {

    /* JADX INFO: renamed from: o */
    public static final C0818vw f2609o = new C0818vw("proto");

    /* JADX INFO: renamed from: j */
    public final u51 f2610j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0766uh f2611k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0766uh f2612l;

    /* JADX INFO: renamed from: m */
    public final C0906y9 f2613m;

    /* JADX INFO: renamed from: n */
    public final ny0 f2614n;

    public g41(InterfaceC0766uh interfaceC0766uh, InterfaceC0766uh interfaceC0766uh2, C0906y9 c0906y9, u51 u51Var, ny0 ny0Var) {
        this.f2610j = u51Var;
        this.f2611k = interfaceC0766uh;
        this.f2612l = interfaceC0766uh2;
        this.f2613m = c0906y9;
        this.f2614n = ny0Var;
    }

    /* JADX INFO: renamed from: e */
    public static Long m1977e(SQLiteDatabase sQLiteDatabase, C0648ra c0648ra) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c0648ra.f6760a, String.valueOf(gx0.m2162a(c0648ra.f6762c))));
        byte[] bArr = c0648ra.f6761b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m1978o(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C0316ia) it.next()).f3500a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static Object m1979p(Cursor cursor, e41 e41Var) {
        try {
            return e41Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m1980a() {
        u51 u51Var = this.f2610j;
        Objects.requireNonNull(u51Var);
        InterfaceC0766uh interfaceC0766uh = this.f2612l;
        long jMo159g = interfaceC0766uh.mo159g();
        while (true) {
            try {
                return u51Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC0766uh.mo159g() >= ((long) this.f2613m.f9224c) + jMo159g) {
                    throw new hc1("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2610j.close();
    }

    /* JADX INFO: renamed from: i */
    public final Object m1981i(e41 e41Var) {
        SQLiteDatabase sQLiteDatabaseM1980a = m1980a();
        sQLiteDatabaseM1980a.beginTransaction();
        try {
            Object objApply = e41Var.apply(sQLiteDatabaseM1980a);
            sQLiteDatabaseM1980a.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM1980a.endTransaction();
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m1982j(SQLiteDatabase sQLiteDatabase, C0648ra c0648ra, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM1977e = m1977e(sQLiteDatabase, c0648ra);
        if (lM1977e == null) {
            return arrayList;
        }
        m1979p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM1977e.toString()}, null, null, null, String.valueOf(i)), new C0923yq(this, (Object) arrayList, c0648ra, 4));
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m1983l(long j, ck0 ck0Var, String str) {
        m1981i(new d41(j, str, ck0Var));
    }

    /* JADX INFO: renamed from: m */
    public final Object m1984m(ic1 ic1Var) {
        SQLiteDatabase sQLiteDatabaseM1980a = m1980a();
        InterfaceC0766uh interfaceC0766uh = this.f2612l;
        long jMo159g = interfaceC0766uh.mo159g();
        while (true) {
            try {
                sQLiteDatabaseM1980a.beginTransaction();
                try {
                    Object objMo1085c = ic1Var.mo1085c();
                    sQLiteDatabaseM1980a.setTransactionSuccessful();
                    return objMo1085c;
                } finally {
                    sQLiteDatabaseM1980a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC0766uh.mo159g() >= ((long) this.f2613m.f9224c) + jMo159g) {
                    throw new hc1("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
