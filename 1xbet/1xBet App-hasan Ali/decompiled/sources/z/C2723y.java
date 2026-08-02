package z;

import P.AbstractC0329z;
import P.C0305m0;
import a3.AbstractC0467k;
import n.AbstractC2107A;
import x0.InterfaceC2639z;
import x0.Z;
import z0.AbstractC2739O;

/* renamed from: z.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2723y implements InterfaceC2639z, y0.e, b0.n {

    /* renamed from: k, reason: collision with root package name */
    public final C2699a f21578k;

    /* renamed from: l, reason: collision with root package name */
    public final C0305m0 f21579l;

    /* renamed from: m, reason: collision with root package name */
    public final C0305m0 f21580m;

    public C2723y(C2699a c2699a) {
        this.f21578k = c2699a;
        this.f21579l = AbstractC0329z.t(c2699a);
        this.f21580m = AbstractC0329z.t(c2699a);
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.a(this, abstractC2739O, n5, i);
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
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
    public final /* synthetic */ int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.g(this, abstractC2739O, n5, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2723y) {
            return kotlin.jvm.internal.l.a(((C2723y) obj).f21578k, this.f21578k);
        }
        return false;
    }

    @Override // x0.InterfaceC2639z
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        C0305m0 c0305m0 = this.f21579l;
        int b3 = ((InterfaceC2692P) c0305m0.getValue()).b(q5, q5.getLayoutDirection());
        int a5 = ((InterfaceC2692P) c0305m0.getValue()).a(q5);
        int c5 = ((InterfaceC2692P) c0305m0.getValue()).c(q5, q5.getLayoutDirection()) + b3;
        int d5 = ((InterfaceC2692P) c0305m0.getValue()).d(q5) + a5;
        Z e3 = n5.e(W0.b.i(-c5, -d5, j5));
        return q5.i(W0.b.g(e3.f20973k + c5, j5), W0.b.f(e3.f20974l + d5, j5), X3.w.f6091k, new F.c(e3, b3, a5, 2));
    }

    @Override // y0.e
    public final y0.g getKey() {
        return AbstractC2695T.f21516a;
    }

    @Override // y0.e
    public final Object getValue() {
        return (InterfaceC2692P) this.f21580m.getValue();
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.j(this, abstractC2739O, n5, i);
    }

    public final int hashCode() {
        return this.f21578k.hashCode();
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
