package z;

import E.D0;
import a.AbstractC0444a;
import n.AbstractC2107A;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2720v extends b0.o implements InterfaceC2765w {

    /* renamed from: y, reason: collision with root package name */
    public int f21572y;

    /* renamed from: z, reason: collision with root package name */
    public float f21573z;

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
        int j6;
        int h3;
        int g5;
        int i;
        if (!W0.a.d(j5) || this.f21572y == 1) {
            j6 = W0.a.j(j5);
            h3 = W0.a.h(j5);
        } else {
            j6 = AbstractC0444a.t(Math.round(W0.a.h(j5) * this.f21573z), W0.a.j(j5), W0.a.h(j5));
            h3 = j6;
        }
        if (!W0.a.c(j5) || this.f21572y == 2) {
            int i5 = W0.a.i(j5);
            g5 = W0.a.g(j5);
            i = i5;
        } else {
            i = AbstractC0444a.t(Math.round(W0.a.g(j5) * this.f21573z), W0.a.i(j5), W0.a.g(j5));
            g5 = i;
        }
        Z e3 = n5.e(W0.b.a(j6, h3, i, g5));
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new D0(e3, 8));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }
}
