package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u20 extends AbstractC0637r {

    /* JADX INFO: renamed from: l */
    public final C0042ay f7647l;

    /* JADX INFO: renamed from: m */
    public final nc1 f7648m;

    /* JADX INFO: renamed from: n */
    public final o31 f7649n;

    /* JADX INFO: renamed from: o */
    public final o31 f7650o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(g20 g20Var, C0042ay c0042ay) {
        super(g20Var);
        nc1 nc1Var = t22.f7260e;
        o31 o31Var = t22.f7259d;
        this.f7647l = c0042ay;
        this.f7648m = nc1Var;
        this.f7649n = o31Var;
        this.f7650o = o31Var;
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: e */
    public final void mo844e(y30 y30Var) {
        boolean z = y30Var instanceof InterfaceC0142dl;
        g20 g20Var = this.f6642k;
        C0042ay c0042ay = this.f7647l;
        if (z) {
            g20Var.m1973d(new s20((InterfaceC0142dl) y30Var, c0042ay, this.f7648m, this.f7649n, this.f7650o));
        } else {
            g20Var.m1973d(new t20(y30Var, c0042ay, this.f7648m, this.f7649n, this.f7650o));
        }
    }
}
