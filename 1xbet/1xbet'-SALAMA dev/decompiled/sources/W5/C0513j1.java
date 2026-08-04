package W5;

/* JADX INFO: renamed from: W5.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0513j1 extends U5.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7258a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7259b;

    public C0513j1(U5.J j) {
        p113p3.f.k(j, "result");
        this.f7259b = j;
    }

    @Override // U5.L
    public final U5.J a(C0539s1 c0539s1) {
        switch (this.f7258a) {
            case 0:
                return (U5.J) this.f7259b;
            default:
                return U5.J.a((U5.l0) this.f7259b);
        }
    }

    public String toString() {
        switch (this.f7258a) {
            case 0:
                D3.j jVar = new D3.j(C0513j1.class.getSimpleName());
                jVar.a((U5.J) this.f7259b, "result");
                return jVar.toString();
            default:
                return super.toString();
        }
    }

    public C0513j1(U5.l0 l0Var) {
        this.f7259b = l0Var;
    }
}
