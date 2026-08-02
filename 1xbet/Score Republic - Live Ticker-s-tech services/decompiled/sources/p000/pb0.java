package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6070j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ vg0 f6071k;

    public pb0(vg0 vg0Var, long j) {
        this.f6071k = vg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6070j;
        vg0 vg0Var = this.f6071k;
        switch (i) {
            case 0:
                vg0Var.getClass();
                break;
            default:
                ((ot0) vg0Var.f8195a.f5551k).m3782q(ja1.f3883m.m2840h("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public pb0(vg0 vg0Var, Throwable th) {
        this.f6071k = vg0Var;
    }
}
