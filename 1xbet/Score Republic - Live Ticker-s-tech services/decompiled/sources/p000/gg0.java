package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends eg0 {

    /* JADX INFO: renamed from: h */
    public final ig0 f2722h;

    /* JADX INFO: renamed from: i */
    public final hg0 f2723i;

    /* JADX INFO: renamed from: j */
    public final C0469mg f2724j;

    /* JADX INFO: renamed from: k */
    public final Object f2725k;

    public gg0(ig0 ig0Var, hg0 hg0Var, C0469mg c0469mg, Object obj) {
        this.f2722h = ig0Var;
        this.f2723i = hg0Var;
        this.f2724j = c0469mg;
        this.f2725k = obj;
    }

    @Override // p000.eg0
    /* JADX INFO: renamed from: r */
    public final boolean mo1414r() {
        return false;
    }

    @Override // p000.eg0
    /* JADX INFO: renamed from: s */
    public final void mo1415s(Throwable th) {
        C0469mg c0469mg = this.f2724j;
        C0469mg c0469mgM2601M = ig0.m2601M(c0469mg);
        ig0 ig0Var = this.f2722h;
        hg0 hg0Var = this.f2723i;
        Object obj = this.f2725k;
        if (c0469mgM2601M == null || !ig0Var.m2624Z(hg0Var, c0469mgM2601M, obj)) {
            hg0Var.f3206a.m5339e(new li0(2), 2);
            C0469mg c0469mgM2601M2 = ig0.m2601M(c0469mg);
            if (c0469mgM2601M2 == null || !ig0Var.m2624Z(hg0Var, c0469mgM2601M2, obj)) {
                ig0Var.mo2625o(ig0Var.m2634y(hg0Var, obj));
            }
        }
    }
}
