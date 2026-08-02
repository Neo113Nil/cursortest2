package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i81 extends f51 {

    /* JADX INFO: renamed from: j */
    public final ScheduledExecutorService f3474j;

    /* JADX INFO: renamed from: k */
    public final C0584pk f3475k = new C0584pk(0);

    /* JADX INFO: renamed from: l */
    public volatile boolean f3476l;

    public i81(ScheduledExecutorService scheduledExecutorService) {
        this.f3474j = scheduledExecutorService;
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: a */
    public final InterfaceC0187eu mo1498a(Runnable runnable, TimeUnit timeUnit) {
        EnumC0336iw enumC0336iw = EnumC0336iw.f3682j;
        if (this.f3476l) {
            return enumC0336iw;
        }
        d51 d51Var = new d51(runnable, this.f3475k);
        this.f3475k.m3948a(d51Var);
        try {
            d51Var.m1094a(this.f3474j.submit((Callable) d51Var));
            return d51Var;
        } catch (RejectedExecutionException e) {
            mo480c();
            vt1.m5196h(e);
            return enumC0336iw;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        if (this.f3476l) {
            return;
        }
        this.f3476l = true;
        this.f3475k.mo480c();
    }
}
