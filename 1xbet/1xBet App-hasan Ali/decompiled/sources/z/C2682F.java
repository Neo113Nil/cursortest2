package z;

import n.AbstractC2107A;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: z.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2682F extends b0.o implements InterfaceC2765w {

    /* renamed from: y, reason: collision with root package name */
    public C2681E f21478y;

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
        float f = 0;
        if (Float.compare(this.f21478y.a(q5.getLayoutDirection()), f) < 0 || Float.compare(this.f21478y.f21475b, f) < 0 || Float.compare(this.f21478y.b(q5.getLayoutDirection()), f) < 0 || Float.compare(this.f21478y.f21477d, f) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int K = q5.K(this.f21478y.b(q5.getLayoutDirection())) + q5.K(this.f21478y.a(q5.getLayoutDirection()));
        int K5 = q5.K(this.f21478y.f21477d) + q5.K(this.f21478y.f21475b);
        Z e3 = n5.e(W0.b.i(-K, -K5, j5));
        return q5.i(W0.b.g(e3.f20973k + K, j5), W0.b.f(e3.f20974l + K5, j5), X3.w.f6091k, new A.s(e3, q5, this, 14));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }
}
