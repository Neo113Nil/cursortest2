package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 {

    /* JADX INFO: renamed from: c */
    public static final C0800ve f9271c = C0800ve.m5150p();

    /* JADX INFO: renamed from: a */
    public final by0 f9272a;

    /* JADX INFO: renamed from: b */
    public hm0 f9273b = lm0.f4838j;

    public yc0(by0 by0Var) {
        this.f9272a = by0Var;
    }

    /* JADX INFO: renamed from: a */
    public final hm0 m5754a() {
        hm0 hm0Var = this.f9273b;
        rm0 rm0VarM798a = this.f9272a.m798a(C0800ve.m5153s());
        final int i = 0;
        InterfaceC0254gm interfaceC0254gm = new InterfaceC0254gm(this) { // from class: wc0

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ yc0 f8505k;

            {
                this.f8505k = this;
            }

            @Override // p000.InterfaceC0254gm
            public final void accept(Object obj) {
                int i2 = i;
                yc0 yc0Var = this.f8505k;
                switch (i2) {
                    case 0:
                        yc0Var.f9273b = hm0.m2292a((C0800ve) obj);
                        break;
                    default:
                        yc0Var.f9273b = lm0.f4838j;
                        break;
                }
            }
        };
        nc1 nc1Var = t22.f7260e;
        hm0 hm0VarM2295d = hm0Var.m2295d(new ym0(rm0VarM798a, interfaceC0254gm, nc1Var));
        final int i2 = 1;
        return new ym0(hm0VarM2295d, nc1Var, new InterfaceC0254gm(this) { // from class: wc0

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ yc0 f8505k;

            {
                this.f8505k = this;
            }

            @Override // p000.InterfaceC0254gm
            public final void accept(Object obj) {
                int i3 = i2;
                yc0 yc0Var = this.f8505k;
                switch (i3) {
                    case 0:
                        yc0Var.f9273b = hm0.m2292a((C0800ve) obj);
                        break;
                    default:
                        yc0Var.f9273b = lm0.f4838j;
                        break;
                }
            }
        });
    }
}
