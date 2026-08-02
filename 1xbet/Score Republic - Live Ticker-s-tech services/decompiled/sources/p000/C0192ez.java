package p000;

/* JADX INFO: renamed from: ez */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0192ez implements InterfaceC0655rh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2210a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f2211b;

    /* JADX INFO: renamed from: c */
    public final Object f2212c;

    public C0192ez(ja1 ja1Var, EnumC0544oh enumC0544oh) {
        a90.m122f("error must not be OK", !ja1Var.m2838f());
        this.f2211b = ja1Var;
        this.f2212c = enumC0544oh;
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: c */
    public final me0 mo1526c() {
        switch (this.f2210a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((ul0) this.f2212c).mo1526c();
        }
    }

    @Override // p000.InterfaceC0655rh
    /* JADX INFO: renamed from: d */
    public final InterfaceC0507nh mo1527d(wp0 wp0Var, np0 np0Var, C0095ce c0095ce, o80[] o80VarArr) {
        int i = this.f2210a;
        Object obj = this.f2212c;
        Object obj2 = this.f2211b;
        switch (i) {
            case 0:
                return new C0155dz((ja1) obj2, (EnumC0544oh) obj, o80VarArr);
            default:
                C0095ce c0095ce2 = C0095ce.f1224h;
                a90.m127k(c0095ce, "callOptions cannot be null");
                o80 o80VarMo1894a = ((AbstractC0618qh) obj2).mo1894a(new C0120d(c0095ce, 0, false), np0Var);
                a90.m132p("lb tracer already assigned", o80VarArr[o80VarArr.length - 1] == ca0.f1195o);
                o80VarArr[o80VarArr.length - 1] = o80VarMo1894a;
                return ((ul0) obj).mo1527d(wp0Var, np0Var, c0095ce, o80VarArr);
        }
    }

    public C0192ez(AbstractC0618qh abstractC0618qh, ul0 ul0Var) {
        this.f2211b = abstractC0618qh;
        this.f2212c = ul0Var;
    }
}
