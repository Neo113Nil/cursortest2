package W5;

import U5.C0435b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y implements A {
    @Override // W5.Y0
    public final Runnable b(X0 x1) {
        return g().b(x1);
    }

    @Override // W5.Y0
    public void c(U5.l0 l0Var) {
        g().c(l0Var);
    }

    @Override // W5.A
    public final C0435b d() {
        return g().d();
    }

    @Override // W5.Y0
    public void e(U5.l0 l0Var) {
        g().e(l0Var);
    }

    @Override // U5.E
    public final U5.F f() {
        return g().f();
    }

    public abstract A g();

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(g(), "delegate");
        return jVarU0.toString();
    }
}
