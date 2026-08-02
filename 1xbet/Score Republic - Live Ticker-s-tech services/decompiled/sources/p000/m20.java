package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 extends AbstractC0637r {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f4959l = 0;

    /* JADX INFO: renamed from: m */
    public final int f4960m;

    /* JADX INFO: renamed from: n */
    public final int f4961n;

    /* JADX INFO: renamed from: o */
    public final r60 f4962o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(r20 r20Var, int i) {
        super(r20Var);
        wa0 wa0Var = t22.f7257b;
        this.f4962o = wa0Var;
        this.f4960m = 3;
        this.f4961n = i;
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: e */
    public final void mo844e(y30 y30Var) {
        y30 i20Var;
        switch (this.f4959l) {
            case 0:
                cd0 cd0Var = (cd0) this.f4962o;
                g20 g20Var = this.f6642k;
                if (!AbstractC0477mo.m3411n(g20Var, y30Var, cd0Var)) {
                    int iM292o = AbstractC0024an.m292o(this.f4961n);
                    int i = this.f4960m;
                    if (iM292o != 1) {
                        i20Var = iM292o != 2 ? new j20(y30Var, cd0Var, i) : new i20(y30Var, cd0Var, i, true);
                    } else {
                        i20Var = new i20(y30Var, cd0Var, i, false);
                    }
                    g20Var.m1973d(i20Var);
                    break;
                }
                break;
            default:
                wa0 wa0Var = (wa0) this.f4962o;
                g20 g20Var2 = this.f6642k;
                if (!AbstractC0477mo.m3411n(g20Var2, y30Var, wa0Var)) {
                    g20Var2.m1973d(new e30(y30Var, wa0Var, this.f4960m, this.f4961n));
                    break;
                }
                break;
        }
    }

    public m20(g30 g30Var, cd0 cd0Var) {
        super(g30Var);
        this.f4962o = cd0Var;
        this.f4960m = 2;
        this.f4961n = 1;
    }
}
