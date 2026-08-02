package p000;

/* JADX INFO: renamed from: dz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0155dz extends nc1 {

    /* JADX INFO: renamed from: t */
    public boolean f1884t;

    /* JADX INFO: renamed from: u */
    public final ja1 f1885u;

    /* JADX INFO: renamed from: v */
    public final EnumC0544oh f1886v;

    /* JADX INFO: renamed from: w */
    public final o80[] f1887w;

    public C0155dz(ja1 ja1Var, EnumC0544oh enumC0544oh, o80[] o80VarArr) {
        super(4);
        a90.m122f("error must not be OK", !ja1Var.m2838f());
        this.f1885u = ja1Var;
        this.f1886v = enumC0544oh;
        this.f1887w = o80VarArr;
    }

    @Override // p000.nc1, p000.InterfaceC0507nh
    /* JADX INFO: renamed from: n */
    public final void mo1326n(InterfaceC0581ph interfaceC0581ph) {
        a90.m132p("already started", !this.f1884t);
        this.f1884t = true;
        o80[] o80VarArr = this.f1887w;
        int length = o80VarArr.length;
        int i = 0;
        while (true) {
            ja1 ja1Var = this.f1885u;
            if (i >= length) {
                interfaceC0581ph.mo1035g(ja1Var, this.f1886v, new np0());
                return;
            } else {
                o80VarArr[i].mo1308A(ja1Var);
                i++;
            }
        }
    }

    @Override // p000.nc1, p000.InterfaceC0507nh
    /* JADX INFO: renamed from: s */
    public final void mo1327s(xd0 xd0Var) {
        xd0Var.m5619a(this.f1885u, "error");
        xd0Var.m5619a(this.f1886v, "progress");
    }
}
