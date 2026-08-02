package z;

import E.D0;
import x0.Z;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2677A extends b0.o implements InterfaceC2765w {

    /* renamed from: y, reason: collision with root package name */
    public int f21462y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21463z;

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.f(i);
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return this.f21462y == 1 ? n5.L(i) : n5.T(i);
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return n5.U(i);
    }

    @Override // z0.InterfaceC2765w
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        int L5 = this.f21462y == 1 ? n5.L(W0.a.g(j5)) : n5.T(W0.a.g(j5));
        if (L5 < 0) {
            L5 = 0;
        }
        if (L5 < 0) {
            W0.i.a("width must be >= 0");
        }
        long h3 = W0.b.h(L5, L5, 0, Integer.MAX_VALUE);
        if (this.f21463z) {
            h3 = W0.b.e(j5, h3);
        }
        Z e3 = n5.e(h3);
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new D0(e3, 9));
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return this.f21462y == 1 ? n5.L(i) : n5.T(i);
    }
}
