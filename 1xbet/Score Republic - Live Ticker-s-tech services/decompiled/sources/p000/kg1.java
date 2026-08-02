package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg1 implements ic1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4368j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ g41 f4369k;

    public /* synthetic */ kg1(g41 g41Var, int i) {
        this.f4368j = i;
        this.f4369k = g41Var;
    }

    @Override // p000.ic1
    /* JADX INFO: renamed from: c */
    public final Object mo1085c() {
        int i = this.f4368j;
        g41 g41Var = this.f4369k;
        switch (i) {
            case 0:
                g41Var.getClass();
                int i2 = C0396kh.f4370e;
                f71 f71Var = new f71(5);
                f71Var.f2335l = null;
                f71Var.f2336m = new ArrayList();
                f71Var.f2337n = null;
                f71Var.f2334k = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM1980a = g41Var.m1980a();
                sQLiteDatabaseM1980a.beginTransaction();
                try {
                    C0396kh c0396kh = (C0396kh) g41.m1979p(sQLiteDatabaseM1980a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0923yq(g41Var, map, f71Var, 6));
                    sQLiteDatabaseM1980a.setTransactionSuccessful();
                    return c0396kh;
                } finally {
                    sQLiteDatabaseM1980a.endTransaction();
                }
            default:
                long jMo159g = g41Var.f2611k.mo159g() - g41Var.f2613m.f9225d;
                SQLiteDatabase sQLiteDatabaseM1980a2 = g41Var.m1980a();
                sQLiteDatabaseM1980a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jMo159g)};
                    Cursor cursorRawQuery = sQLiteDatabaseM1980a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            g41Var.m1983l(cursorRawQuery.getInt(0), ck0.f1273l, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM1980a2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM1980a2.setTransactionSuccessful();
                    sQLiteDatabaseM1980a2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseM1980a2.endTransaction();
                    throw th2;
                }
        }
    }
}
