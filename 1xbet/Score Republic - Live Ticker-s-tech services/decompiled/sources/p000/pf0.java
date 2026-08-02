package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends g51 {

    /* JADX INFO: renamed from: b */
    public static final b41 f6126b;

    /* JADX INFO: renamed from: c */
    public static final b41 f6127c;

    /* JADX INFO: renamed from: d */
    public static final long f6128d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: renamed from: e */
    public static final of0 f6129e;

    /* JADX INFO: renamed from: f */
    public static final boolean f6130f;

    /* JADX INFO: renamed from: g */
    public static final mf0 f6131g;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f6132a;

    static {
        of0 of0Var = new of0(new b41("RxCachedThreadSchedulerShutdown"));
        f6129e = of0Var;
        of0Var.mo480c();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        b41 b41Var = new b41(iMax, "RxCachedThreadScheduler", false);
        f6126b = b41Var;
        f6127c = new b41(iMax, "RxCachedWorkerPoolEvictor", false);
        f6130f = Boolean.getBoolean("rx2.io-scheduled-release");
        mf0 mf0Var = new mf0(0L, null, b41Var);
        f6131g = mf0Var;
        mf0Var.f5036l.mo480c();
        ScheduledFuture scheduledFuture = mf0Var.f5038n;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = mf0Var.f5037m;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public pf0() {
        mf0 mf0Var = f6131g;
        AtomicReference atomicReference = new AtomicReference(mf0Var);
        this.f6132a = atomicReference;
        mf0 mf0Var2 = new mf0(f6128d, TimeUnit.SECONDS, f6126b);
        while (!atomicReference.compareAndSet(mf0Var, mf0Var2)) {
            if (atomicReference.get() != mf0Var) {
                mf0Var2.f5036l.mo480c();
                ScheduledFuture scheduledFuture = mf0Var2.f5038n;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = mf0Var2.f5037m;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: a */
    public final f51 mo1301a() {
        return new nf0((mf0) this.f6132a.get());
    }
}
