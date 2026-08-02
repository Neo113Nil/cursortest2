package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r11 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f6657a;

    /* JADX INFO: renamed from: b */
    public final gc1 f6658b;

    /* JADX INFO: renamed from: c */
    public final RunnableC0897y0 f6659c;

    /* JADX INFO: renamed from: d */
    public final na1 f6660d;

    /* JADX INFO: renamed from: e */
    public long f6661e;

    /* JADX INFO: renamed from: f */
    public boolean f6662f;

    /* JADX INFO: renamed from: g */
    public ScheduledFuture f6663g;

    public r11(RunnableC0897y0 runnableC0897y0, gc1 gc1Var, ScheduledExecutorService scheduledExecutorService, na1 na1Var) {
        this.f6659c = runnableC0897y0;
        this.f6658b = gc1Var;
        this.f6657a = scheduledExecutorService;
        this.f6660d = na1Var;
        na1Var.m3510b();
    }
}
