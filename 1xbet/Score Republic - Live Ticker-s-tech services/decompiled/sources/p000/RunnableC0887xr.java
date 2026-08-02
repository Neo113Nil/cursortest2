package p000;

/* JADX INFO: renamed from: xr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0887xr implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9041j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ nu1 f9042k;

    public /* synthetic */ RunnableC0887xr(nu1 nu1Var, int i) {
        this.f9041j = i;
        this.f9042k = nu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9041j;
        nu1 nu1Var = this.f9042k;
        switch (i) {
            case 0:
                nu1Var.m3592o(true);
                break;
            case 1:
                nu1Var.m3592o(false);
                break;
            default:
                jl0 jl0Var = (jl0) nu1Var.f5551k;
                a90.m132p("Channel must have been shut down", jl0Var.f3978G.get());
                jl0Var.f3979H = true;
                jl0Var.m2924k(false);
                jl0.m2920g(jl0Var);
                break;
        }
    }
}
