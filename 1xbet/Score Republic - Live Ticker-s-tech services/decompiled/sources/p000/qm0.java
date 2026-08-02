package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qm0 extends AbstractC0306i0 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f6537k;

    /* JADX INFO: renamed from: l */
    public final r60 f6538l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm0(hm0 hm0Var, r60 r60Var, int i) {
        super(hm0Var);
        this.f6537k = i;
        this.f6538l = r60Var;
    }

    @Override // p000.hm0
    /* JADX INFO: renamed from: c */
    public final void mo2294c(xm0 xm0Var) {
        int i = this.f6537k;
        r60 r60Var = this.f6538l;
        hm0 hm0Var = this.f3366j;
        switch (i) {
            case 0:
                hm0Var.m2293b(new im0(xm0Var, r60Var));
                break;
            case 1:
                hm0Var.m2293b(new C0472mj(xm0Var, r60Var, 1));
                break;
            default:
                hm0Var.m2293b(new C0546oj(xm0Var, r60Var));
                break;
        }
    }
}
