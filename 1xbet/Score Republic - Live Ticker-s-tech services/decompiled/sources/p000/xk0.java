package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 extends kj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8979a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f8980b;

    public xk0(Throwable th) {
        ja1 ja1VarM2839g = ja1.f3882l.m2840h("Panic! This is a bug!").m2839g(th);
        ij0 ij0Var = ij0.f3585e;
        a90.m122f("drop status shouldn't be OK", !ja1VarM2839g.m2838f());
        this.f8980b = new ij0(null, null, ja1VarM2839g, true);
    }

    @Override // p000.kj0
    /* JADX INFO: renamed from: a */
    public final ij0 mo1140a(yv0 yv0Var) {
        int i = this.f8979a;
        Object obj = this.f8980b;
        switch (i) {
            case 0:
                return (ij0) obj;
            default:
                return ij0.m2652a((ja1) obj);
        }
    }

    public String toString() {
        switch (this.f8979a) {
            case 0:
                C0809vn c0809vn = new C0809vn(xk0.class.getSimpleName());
                c0809vn.m5172c((ij0) this.f8980b, "panicPickResult");
                return c0809vn.toString();
            default:
                return super.toString();
        }
    }

    public xk0(ja1 ja1Var) {
        this.f8980b = ja1Var;
    }
}
