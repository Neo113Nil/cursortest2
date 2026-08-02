package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wz0 implements InterfaceC0254gm, r60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8723j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xz0 f8724k;

    public /* synthetic */ wz0(xz0 xz0Var, int i) {
        this.f8723j = i;
        this.f8724k = xz0Var;
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        int i = this.f8723j;
        xz0 xz0Var = this.f8724k;
        switch (i) {
            case 0:
                xz0Var.f9114c = hm0.m2292a((uz0) obj);
                break;
            default:
                xz0Var.f9114c = lm0.f4838j;
                break;
        }
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        uz0 uz0Var = (uz0) obj;
        xz0 xz0Var = this.f8724k;
        by0 by0Var = xz0Var.f9112a;
        by0Var.getClass();
        return new C0398kj(1, new CallableC0340iz(2, by0Var, uz0Var)).m1872a(new C0615qe(15, xz0Var, uz0Var));
    }
}
