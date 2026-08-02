package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qv0 extends kj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6620a;

    /* JADX INFO: renamed from: b */
    public final ij0 f6621b;

    public qv0(ij0 ij0Var, int i) {
        this.f6620a = i;
        switch (i) {
            case 1:
                a90.m127k(ij0Var, "result");
                this.f6621b = ij0Var;
                break;
            default:
                a90.m127k(ij0Var, "result");
                this.f6621b = ij0Var;
                break;
        }
    }

    @Override // p000.kj0
    /* JADX INFO: renamed from: a */
    public final ij0 mo1140a(yv0 yv0Var) {
        switch (this.f6620a) {
            case 0:
                break;
        }
        return this.f6621b;
    }

    public final String toString() {
        int i = this.f6620a;
        ij0 ij0Var = this.f6621b;
        switch (i) {
            case 0:
                C0809vn c0809vn = new C0809vn(qv0.class.getSimpleName());
                c0809vn.m5172c(ij0Var, "result");
                return c0809vn.toString();
            default:
                return "FixedResultPicker(" + ij0Var + ")";
        }
    }
}
