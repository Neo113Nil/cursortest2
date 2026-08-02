package z;

import a.AbstractC0444a;
import n.AbstractC2107A;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: z.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2698W extends b0.o implements InterfaceC2765w {

    /* renamed from: y, reason: collision with root package name */
    public int f21522y;

    /* renamed from: z, reason: collision with root package name */
    public kotlin.jvm.internal.m f21523z;

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.c(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.f(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.i(this, abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        Z e3 = n5.e(W0.b.a(this.f21522y != 1 ? 0 : W0.a.j(j5), W0.a.h(j5), this.f21522y == 2 ? W0.a.i(j5) : 0, W0.a.g(j5)));
        int t5 = AbstractC0444a.t(e3.f20973k, W0.a.j(j5), W0.a.h(j5));
        int t6 = AbstractC0444a.t(e3.f20974l, W0.a.i(j5), W0.a.g(j5));
        return q5.i(t5, t6, X3.w.f6091k, new C2697V(this, t5, e3, t6, q5));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }
}
