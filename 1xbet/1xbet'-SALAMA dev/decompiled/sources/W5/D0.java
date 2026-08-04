package W5;

/* JADX INFO: loaded from: classes2.dex */
public final class D0 extends U5.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6756a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5.J f6757b;

    public D0(U5.J j) {
        p113p3.f.k(j, "result");
        this.f6757b = j;
    }

    @Override // U5.L
    public final U5.J a(C0539s1 c0539s1) {
        switch (this.f6756a) {
            case 0:
                break;
        }
        return this.f6757b;
    }

    public final String toString() {
        switch (this.f6756a) {
            case 0:
                D3.j jVar = new D3.j(D0.class.getSimpleName());
                jVar.a(this.f6757b, "panicPickResult");
                return jVar.toString();
            default:
                return "FixedResultPicker(" + this.f6757b + ")";
        }
    }

    public D0(Throwable th) {
        U5.l0 l0VarF = U5.l0.f6543m.g("Panic! This is a bug!").f(th);
        U5.J j = U5.J.f6425e;
        p113p3.f.d("drop status shouldn't be OK", !l0VarF.e());
        this.f6757b = new U5.J(null, null, l0VarF, true);
    }
}
