package W5;

import U5.AbstractC0438e;

/* loaded from: classes2.dex */
public final class J0 extends AbstractC0438e {

    /* renamed from: d, reason: collision with root package name */
    public final I0 f6827d;

    /* renamed from: e, reason: collision with root package name */
    public final R1 f6828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q0 f6829f;

    public J0(Q0 q02, I0 i02, R1 r12) {
        this.f6829f = q02;
        this.f6827d = i02;
        p3.f.k(r12, "resolver");
        this.f6828e = r12;
    }

    @Override // U5.AbstractC0438e
    public final void o(U5.l0 l0Var) {
        p3.f.d("the error status must not be OK", !l0Var.e());
        this.f6829f.f6972p.execute(new E(16, this, l0Var));
    }

    @Override // U5.AbstractC0438e
    public final void p(U5.f0 f0Var) {
        this.f6829f.f6972p.execute(new E(17, this, f0Var));
    }
}
