package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class re0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6830j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xe0 f6831k;

    public /* synthetic */ re0(xe0 xe0Var, int i) {
        this.f6830j = i;
        this.f6831k = xe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6830j) {
            case 0:
                xe0 xe0Var = this.f6831k;
                xe0Var.f8926p = null;
                xe0Var.f8919i.mo5321i("CONNECTING after backoff", 2);
                xe0.m5630e(xe0Var, EnumC0474ml.f5071j);
                xe0.m5631f(xe0Var);
                break;
            case 1:
                if (this.f6831k.f8933w.f5453a == EnumC0474ml.f5074m) {
                    this.f6831k.f8919i.mo5321i("CONNECTING as requested", 2);
                    xe0.m5630e(this.f6831k, EnumC0474ml.f5071j);
                    xe0.m5631f(this.f6831k);
                }
                break;
            default:
                xe0 xe0Var2 = this.f6831k;
                xe0Var2.f8919i.mo5321i("Terminated", 2);
                jl0 jl0Var = ((il0) xe0Var2.f8914d.f2314l).f3605F;
                jl0Var.f3972A.remove(xe0Var2);
                jl0.m2920g(jl0Var);
                break;
        }
    }
}
