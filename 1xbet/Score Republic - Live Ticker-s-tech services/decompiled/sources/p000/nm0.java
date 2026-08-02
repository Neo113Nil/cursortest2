package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nm0 extends AbstractC0306i0 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f5456k;

    /* JADX INFO: renamed from: l */
    public final Object f5457l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm0(hm0 hm0Var, Object obj, int i) {
        super(hm0Var);
        this.f5456k = i;
        this.f5457l = obj;
    }

    @Override // p000.hm0
    /* JADX INFO: renamed from: c */
    public final void mo2294c(xm0 xm0Var) {
        int i = this.f5456k;
        Object obj = this.f5457l;
        hm0 hm0Var = this.f3366j;
        switch (i) {
            case 0:
                hm0Var.m2293b(new mm0(xm0Var, (nw0) obj, 0));
                break;
            case 1:
                hm0Var.m2293b(new wm0(xm0Var, (g51) obj));
                break;
            default:
                hm0Var.m2293b(new C0251gj(4, xm0Var, (hm0) obj));
                break;
        }
    }
}
