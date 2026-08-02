package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g51 {
    static {
        Boolean.getBoolean("rx2.scheduler.use-nanotime");
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    /* JADX INFO: renamed from: a */
    public abstract f51 mo1301a();

    /* JADX INFO: renamed from: b */
    public InterfaceC0187eu m1987b(Runnable runnable) {
        return mo1988c(runnable);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0187eu mo1988c(Runnable runnable) {
        f51 f51VarMo1301a = mo1301a();
        e51 e51Var = new e51(runnable, f51VarMo1301a);
        f51VarMo1301a.mo1498a(e51Var, TimeUnit.NANOSECONDS);
        return e51Var;
    }
}
