package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements InterfaceC0060bf, pi1 {

    /* JADX INFO: renamed from: j */
    public final C0136df f613j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ br0 f614k;

    public ar0(br0 br0Var, C0136df c0136df) {
        this.f614k = br0Var;
        this.f613j = c0136df;
    }

    @Override // p000.pi1
    /* JADX INFO: renamed from: a */
    public final void mo474a(g61 g61Var, int i) {
        this.f613j.mo474a(g61Var, i);
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        return this.f613j.f1640n;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: f */
    public final void mo476f(Object obj) {
        this.f613j.mo476f(obj);
    }

    @Override // p000.InterfaceC0060bf
    /* JADX INFO: renamed from: h */
    public final g72 mo477h(Object obj, x60 x60Var) {
        br0 br0Var = this.f614k;
        C0096cf c0096cf = new C0096cf(br0Var, this);
        g72 g72VarM1180H = this.f613j.m1180H((kf1) obj, c0096cf);
        if (g72VarM1180H != null) {
            br0.f966i.set(br0Var, null);
        }
        return g72VarM1180H;
    }

    @Override // p000.InterfaceC0060bf
    /* JADX INFO: renamed from: n */
    public final void mo478n(Object obj) {
        this.f613j.mo478n(obj);
    }
}
