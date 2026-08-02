package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ds */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0148ds implements InterfaceC0370js, ic1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1805j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1806k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f1807l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1808m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1809n;

    public /* synthetic */ C0148ds(ng1 ng1Var, Iterable iterable, C0648ra c0648ra, long j) {
        this.f1805j = 2;
        this.f1806k = ng1Var;
        this.f1809n = iterable;
        this.f1808m = c0648ra;
        this.f1807l = j;
    }

    @Override // p000.InterfaceC0370js
    /* JADX INFO: renamed from: a */
    public ScheduledFuture mo1300a(final nu1 nu1Var) {
        int i = this.f1805j;
        Object obj = this.f1808m;
        long j = this.f1807l;
        Object obj2 = this.f1809n;
        final ScheduledExecutorServiceC0333is scheduledExecutorServiceC0333is = (ScheduledExecutorServiceC0333is) this.f1806k;
        switch (i) {
            case 0:
                return scheduledExecutorServiceC0333is.f3642k.schedule(new RunnableC0260gs(scheduledExecutorServiceC0333is, (Runnable) obj2, nu1Var, 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return scheduledExecutorServiceC0333is.f3642k.schedule(new Callable() { // from class: hs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return scheduledExecutorServiceC0333is.f3641j.submit(new RunnableC0195f1(8, callable, nu1Var));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    @Override // p000.ic1
    /* JADX INFO: renamed from: c */
    public Object mo1085c() {
        ng1 ng1Var = (ng1) this.f1806k;
        Iterable iterable = (Iterable) this.f1809n;
        C0648ra c0648ra = (C0648ra) this.f1808m;
        g41 g41Var = ng1Var.f5432c;
        g41Var.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(g41.m1978o(iterable));
            SQLiteDatabase sQLiteDatabaseM1980a = g41Var.m1980a();
            sQLiteDatabaseM1980a.beginTransaction();
            try {
                sQLiteDatabaseM1980a.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM1980a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        g41Var.m1983l(cursorRawQuery.getInt(0), ck0.f1276o, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM1980a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM1980a.setTransactionSuccessful();
                sQLiteDatabaseM1980a.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseM1980a.endTransaction();
                throw th2;
            }
        }
        g41Var.m1981i(new c41(ng1Var.f5436g.mo159g() + this.f1807l, c0648ra));
        return null;
    }

    public /* synthetic */ C0148ds(ScheduledExecutorServiceC0333is scheduledExecutorServiceC0333is, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f1805j = i;
        this.f1806k = scheduledExecutorServiceC0333is;
        this.f1809n = obj;
        this.f1807l = j;
        this.f1808m = timeUnit;
    }
}
