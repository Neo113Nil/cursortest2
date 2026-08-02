package t;

import P.InterfaceC0289e0;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import u.o0;
import x0.InterfaceC2639z;
import x0.P;
import x0.Q;
import x0.Z;
import z0.AbstractC2739O;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2399k implements InterfaceC2639z {

    /* renamed from: k, reason: collision with root package name */
    public final o0 f19382k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0289e0 f19383l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2400l f19384m;

    public C2399k(C2400l c2400l, o0 o0Var, InterfaceC0289e0 interfaceC0289e0) {
        this.f19384m = c2400l;
        this.f19382k = o0Var;
        this.f19383l = interfaceC0289e0;
    }

    @Override // x0.InterfaceC2639z
    public final int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.f(i);
    }

    @Override // x0.InterfaceC2639z
    public final int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.T(i);
    }

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // x0.InterfaceC2639z
    public final int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.U(i);
    }

    @Override // x0.InterfaceC2639z
    public final P f(Q q5, x0.N n5, long j5) {
        Z e3 = n5.e(j5);
        C2400l c2400l = this.f19384m;
        long b3 = q5.t() ? AbstractC0444a.b(e3.f20973k, e3.f20974l) : ((W0.l) this.f19382k.a(new i0.K(2, c2400l, this), new A.B(27, c2400l)).getValue()).f6015a;
        return q5.i((int) (b3 >> 32), (int) (4294967295L & b3), X3.w.f6091k, new C2398j(c2400l, e3, b3));
    }

    @Override // x0.InterfaceC2639z
    public final int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.L(i);
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
