package u2;

import a3.AbstractC0467k;
import n.AbstractC2107A;
import s4.M;
import t2.C2418f;
import x0.InterfaceC2639z;
import x0.N;
import x0.P;
import x0.Q;
import x0.Z;
import z0.AbstractC2739O;

/* loaded from: classes.dex */
public final class r implements F2.i, InterfaceC2639z {

    /* renamed from: k, reason: collision with root package name */
    public final M f20031k = s4.C.b(new W0.a(AbstractC2485C.f19985a));

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int a(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.a(this, abstractC2739O, n5, i);
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int b(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.d(this, abstractC2739O, n5, i);
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
    public final /* synthetic */ int e(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.g(this, abstractC2739O, n5, i);
    }

    @Override // x0.InterfaceC2639z
    public final P f(Q q5, N n5, long j5) {
        W0.a aVar = new W0.a(j5);
        M m5 = this.f20031k;
        m5.getClass();
        m5.j(null, aVar);
        Z e3 = n5.e(j5);
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new p(e3, 0));
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, N n5, int i) {
        return AbstractC2107A.j(this, abstractC2739O, n5, i);
    }

    @Override // F2.i
    public final Object i(C2418f c2418f) {
        return s4.C.g(new C2496k(this.f20031k, 1), c2418f);
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
