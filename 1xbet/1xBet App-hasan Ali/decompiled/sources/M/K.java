package M;

import n.AbstractC2107A;
import z0.AbstractC2739O;
import z0.AbstractC2749f;
import z0.InterfaceC2754k;
import z0.InterfaceC2765w;

/* loaded from: classes.dex */
public final class K extends b0.o implements InterfaceC2754k, InterfaceC2765w {
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
        float f = ((W0.f) AbstractC2749f.i(this, H.f3157a)).f6006k;
        float f5 = 0;
        if (f < f5) {
            f = f5;
        }
        x0.Z e3 = n5.e(j5);
        boolean z3 = this.f7175x && !Float.isNaN(f) && Float.compare(f, f5) > 0;
        int K = Float.isNaN(f) ? 0 : q5.K(f);
        int max = z3 ? Math.max(e3.f20973k, K) : e3.f20973k;
        int max2 = z3 ? Math.max(e3.f20974l, K) : e3.f20974l;
        return q5.i(max, max2, X3.w.f6091k, new F.c(max, e3, max2));
    }

    @Override // z0.InterfaceC2765w
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.l(this, abstractC2739O, n5, i);
    }
}
