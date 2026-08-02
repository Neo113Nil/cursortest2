package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2592j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ i31 f2593k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ f50 f2594l;

    public /* synthetic */ g31(f50 f50Var, i31 i31Var, int i) {
        this.f2592j = i;
        this.f2594l = f50Var;
        this.f2593k = i31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2592j;
        f50 f50Var = this.f2594l;
        switch (i) {
            case 0:
                ((zk0) f50Var.f2314l).f9833k.execute(new RunnableC0897y0(23, this));
                break;
            default:
                zk0 zk0Var = (zk0) f50Var.f2314l;
                jp0 jp0Var = zk0.f9815N;
                zk0Var.m5929g(this.f2593k);
                break;
        }
    }
}
