package v;

import P.C0299j0;
import z0.AbstractC2739O;
import z0.InterfaceC2765w;

/* loaded from: classes.dex */
public final class x0 extends b0.o implements InterfaceC2765w {

    /* renamed from: y, reason: collision with root package name */
    public v0 f20329y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20330z;

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return this.f20330z ? n5.f(i) : n5.f(Integer.MAX_VALUE);
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return this.f20330z ? n5.T(Integer.MAX_VALUE) : n5.T(i);
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return this.f20330z ? n5.U(i) : n5.U(Integer.MAX_VALUE);
    }

    @Override // z0.InterfaceC2765w
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        AbstractC2529y.a(j5, this.f20330z ? x.P.f20695k : x.P.f20696l);
        x0.Z e3 = n5.e(W0.a.a(j5, 0, this.f20330z ? W0.a.h(j5) : Integer.MAX_VALUE, 0, this.f20330z ? Integer.MAX_VALUE : W0.a.g(j5), 5));
        int i = e3.f20973k;
        int h3 = W0.a.h(j5);
        if (i > h3) {
            i = h3;
        }
        int i5 = e3.f20974l;
        int g5 = W0.a.g(j5);
        if (i5 > g5) {
            i5 = g5;
        }
        int i6 = e3.f20974l - i5;
        int i7 = e3.f20973k - i;
        if (!this.f20330z) {
            i6 = i7;
        }
        v0 v0Var = this.f20329y;
        C0299j0 c0299j0 = v0Var.f20325d;
        C0299j0 c0299j02 = v0Var.f20322a;
        c0299j0.i(i6);
        Z.f d5 = Z.q.d();
        i4.c e5 = d5 != null ? d5.e() : null;
        Z.f g6 = Z.q.g(d5);
        try {
            if (c0299j02.h() > i6) {
                c0299j02.i(i6);
            }
            Z.q.k(d5, g6, e5);
            this.f20329y.f20323b.i(this.f20330z ? i5 : i);
            return q5.i(i, i5, X3.w.f6091k, new E.o0(this, i6, e3));
        } catch (Throwable th) {
            Z.q.k(d5, g6, e5);
            throw th;
        }
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return this.f20330z ? n5.L(Integer.MAX_VALUE) : n5.L(i);
    }
}
