package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j81 extends g51 {

    /* JADX INFO: renamed from: b */
    public static final b41 f3852b;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f3853a;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f3852b = new b41(Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), "RxSingleScheduler", true);
    }

    public j81() {
        AtomicReference atomicReference = new AtomicReference();
        this.f3853a = atomicReference;
        boolean z = i51.f3438a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f3852b);
        if (i51.f3438a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i51.f3441d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: a */
    public final f51 mo1301a() {
        return new i81((ScheduledExecutorService) this.f3853a.get());
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: c */
    public final InterfaceC0187eu mo1988c(Runnable runnable) {
        c51 c51Var = new c51(runnable);
        try {
            c51Var.m885a(((ScheduledExecutorService) this.f3853a.get()).submit(c51Var));
            return c51Var;
        } catch (RejectedExecutionException e) {
            vt1.m5196h(e);
            return EnumC0336iw.f3682j;
        }
    }
}
