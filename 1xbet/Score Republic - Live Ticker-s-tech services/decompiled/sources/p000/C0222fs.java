package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fs */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0222fs implements InterfaceC0370js {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2483j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ScheduledExecutorServiceC0333is f2484k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Runnable f2485l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f2486m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f2487n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ TimeUnit f2488o;

    public /* synthetic */ C0222fs(ScheduledExecutorServiceC0333is scheduledExecutorServiceC0333is, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f2483j = i;
        this.f2484k = scheduledExecutorServiceC0333is;
        this.f2485l = runnable;
        this.f2486m = j;
        this.f2487n = j2;
        this.f2488o = timeUnit;
    }

    @Override // p000.InterfaceC0370js
    /* JADX INFO: renamed from: a */
    public final ScheduledFuture mo1300a(nu1 nu1Var) {
        int i = this.f2483j;
        Runnable runnable = this.f2485l;
        ScheduledExecutorServiceC0333is scheduledExecutorServiceC0333is = this.f2484k;
        switch (i) {
            case 0:
                return scheduledExecutorServiceC0333is.f3642k.scheduleAtFixedRate(new RunnableC0260gs(scheduledExecutorServiceC0333is, runnable, nu1Var, 0), this.f2486m, this.f2487n, this.f2488o);
            default:
                return scheduledExecutorServiceC0333is.f3642k.scheduleWithFixedDelay(new RunnableC0260gs(scheduledExecutorServiceC0333is, runnable, nu1Var, 2), this.f2486m, this.f2487n, this.f2488o);
        }
    }
}
