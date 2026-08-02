package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class es0 extends f51 {

    /* JADX INFO: renamed from: j */
    public final ScheduledExecutorService f2177j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f2178k;

    public es0(ThreadFactory threadFactory) {
        boolean z = i51.f3438a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (i51.f3438a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i51.f3441d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f2177j = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: a */
    public final InterfaceC0187eu mo1498a(Runnable runnable, TimeUnit timeUnit) {
        return this.f2178k ? EnumC0336iw.f3682j : m1500d(runnable, timeUnit, null);
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: b */
    public final void mo1499b(n30 n30Var) {
        mo1498a(n30Var, null);
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        if (this.f2178k) {
            return;
        }
        this.f2178k = true;
        this.f2177j.shutdownNow();
    }

    /* JADX INFO: renamed from: d */
    public final d51 m1500d(Runnable runnable, TimeUnit timeUnit, C0584pk c0584pk) {
        d51 d51Var = new d51(runnable, c0584pk);
        if (c0584pk != null && !c0584pk.m3948a(d51Var)) {
            return d51Var;
        }
        try {
            d51Var.m1094a(this.f2177j.submit((Callable) d51Var));
            return d51Var;
        } catch (RejectedExecutionException e) {
            if (c0584pk != null) {
                c0584pk.m3950d(d51Var);
            }
            vt1.m5196h(e);
            return d51Var;
        }
    }
}
