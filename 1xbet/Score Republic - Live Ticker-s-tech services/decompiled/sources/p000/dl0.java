package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 extends wo1 {

    /* JADX INFO: renamed from: d */
    public final cl0 f1677d;

    /* JADX INFO: renamed from: e */
    public final vt1 f1678e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ jl0 f1679f;

    public dl0(jl0 jl0Var, cl0 cl0Var, n31 n31Var) {
        this.f1679f = jl0Var;
        this.f1677d = cl0Var;
        a90.m127k(n31Var, "resolver");
        this.f1678e = n31Var;
    }

    @Override // p000.wo1
    /* JADX INFO: renamed from: q */
    public final void mo1230q(ja1 ja1Var) {
        a90.m122f("the error status must not be OK", !ja1Var.m2838f());
        this.f1679f.f4012m.execute(new RunnableC0529o2(22, this, ja1Var));
    }

    @Override // p000.wo1
    /* JADX INFO: renamed from: r */
    public final void mo1231r(er0 er0Var) {
        this.f1679f.f4012m.execute(new RunnableC0529o2(23, this, er0Var));
    }
}
