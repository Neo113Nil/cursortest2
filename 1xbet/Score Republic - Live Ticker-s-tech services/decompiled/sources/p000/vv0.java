package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vv0 extends kj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8274a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f8275b;

    public vv0(ij0 ij0Var) {
        a90.m127k(ij0Var, "result");
        this.f8275b = ij0Var;
    }

    @Override // p000.kj0
    /* JADX INFO: renamed from: a */
    public final ij0 mo1140a(yv0 yv0Var) {
        int i = this.f8274a;
        Object obj = this.f8275b;
        switch (i) {
            case 0:
                return (ij0) obj;
            default:
                ij0 ij0VarMo1140a = ((kj0) obj).mo1140a(yv0Var);
                AbstractC0959zp abstractC0959zp = ij0VarMo1140a.f3586a;
                if (abstractC0959zp == null) {
                    return ij0VarMo1140a;
                }
                C0831w8 c0831w8Mo2156e = abstractC0959zp.mo2156e();
                return ij0.m2653b(abstractC0959zp, new fv0((yu0) c0831w8Mo2156e.f8455a.get(hv0.f3339n), ij0VarMo1140a.f3587b));
        }
    }

    public String toString() {
        switch (this.f8274a) {
            case 0:
                C0809vn c0809vn = new C0809vn(vv0.class.getSimpleName());
                c0809vn.m5172c((ij0) this.f8275b, "result");
                return c0809vn.toString();
            default:
                return super.toString();
        }
    }

    public vv0(kj0 kj0Var) {
        this.f8275b = kj0Var;
    }
}
