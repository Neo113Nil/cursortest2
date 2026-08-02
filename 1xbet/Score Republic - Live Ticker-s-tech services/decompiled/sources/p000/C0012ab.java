package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ab */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0012ab {

    /* JADX INFO: renamed from: e */
    public static final Logger f121e = Logger.getLogger(C0012ab.class.getName());

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f122a;

    /* JADX INFO: renamed from: b */
    public final gc1 f123b;

    /* JADX INFO: renamed from: c */
    public C0598py f124c;

    /* JADX INFO: renamed from: d */
    public a81 f125d;

    public C0012ab(o31 o31Var, hl0 hl0Var, gc1 gc1Var) {
        this.f122a = hl0Var;
        this.f123b = gc1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m169a(RunnableC0897y0 runnableC0897y0) {
        this.f123b.m2028d();
        if (this.f124c == null) {
            this.f124c = o31.m3627m();
        }
        a81 a81Var = this.f125d;
        if (a81Var != null) {
            fc1 fc1Var = (fc1) a81Var.f63k;
            if (!fc1Var.f2377l && !fc1Var.f2376k) {
                return;
            }
        }
        long jM4006a = this.f124c.m4006a();
        this.f125d = this.f123b.m2027c(runnableC0897y0, jM4006a, TimeUnit.NANOSECONDS, this.f122a);
        f121e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jM4006a));
    }
}
