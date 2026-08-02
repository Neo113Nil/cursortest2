package u2;

import a.AbstractC0444a;
import h0.C1991e;
import k0.C2022b;
import k0.C2023c;
import k4.AbstractC2036a;
import x0.InterfaceC2624j;
import x0.N;
import x0.P;
import x0.Q;
import x0.Z;
import x0.e0;
import x0.f0;
import z0.AbstractC2739O;
import z0.C2733I;
import z0.InterfaceC2757n;
import z0.InterfaceC2765w;

/* loaded from: classes.dex */
public final class s extends b0.o implements InterfaceC2757n, InterfaceC2765w {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC2624j f20032A;

    /* renamed from: B, reason: collision with root package name */
    public float f20033B;

    /* renamed from: y, reason: collision with root package name */
    public C2497l f20034y;

    /* renamed from: z, reason: collision with root package name */
    public b0.d f20035z;

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, N n5, int i) {
        if (this.f20034y.h() == 9205357640488583168L) {
            return n5.f(i);
        }
        int f = n5.f(W0.a.h(z0(W0.b.b(i, 0, 13))));
        return Math.max(AbstractC2036a.U(C1991e.b(y0(AbstractC0444a.d(i, f)))), f);
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, N n5, int i) {
        if (this.f20034y.h() == 9205357640488583168L) {
            return n5.T(i);
        }
        int T4 = n5.T(W0.a.g(z0(W0.b.b(0, i, 7))));
        return Math.max(AbstractC2036a.U(C1991e.d(y0(AbstractC0444a.d(T4, i)))), T4);
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, N n5, int i) {
        if (this.f20034y.h() == 9205357640488583168L) {
            return n5.U(i);
        }
        int U4 = n5.U(W0.a.h(z0(W0.b.b(i, 0, 13))));
        return Math.max(AbstractC2036a.U(C1991e.b(y0(AbstractC0444a.d(i, U4)))), U4);
    }

    @Override // z0.InterfaceC2765w
    public final P f(Q q5, N n5, long j5) {
        Z e3 = n5.e(z0(j5));
        return q5.i(e3.f20973k, e3.f20974l, X3.w.f6091k, new p(e3, 1));
    }

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        C2022b c2022b = c2733i.f21647k;
        long y02 = y0(c2022b.f17540l.A());
        b0.d dVar = this.f20035z;
        F2.e eVar = AbstractC2485C.f19986b;
        long b3 = AbstractC0444a.b(AbstractC2036a.U(C1991e.d(y02)), AbstractC2036a.U(C1991e.b(y02)));
        long A3 = c2022b.f17540l.A();
        long a5 = dVar.a(b3, AbstractC0444a.b(AbstractC2036a.U(C1991e.d(A3)), AbstractC2036a.U(C1991e.b(A3))), c2733i.getLayoutDirection());
        float f = (int) (a5 >> 32);
        float f5 = (int) (a5 & 4294967295L);
        ((C2023c) c2022b.f17540l.f20432l).B(f, f5);
        this.f20034y.g(c2733i, y02, this.f20033B, null);
        ((C2023c) c2022b.f17540l.f20432l).B(-f, -f5);
        c2733i.a();
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, N n5, int i) {
        if (this.f20034y.h() == 9205357640488583168L) {
            return n5.L(i);
        }
        int L5 = n5.L(W0.a.g(z0(W0.b.b(0, i, 7))));
        return Math.max(AbstractC2036a.U(C1991e.d(y0(AbstractC0444a.d(L5, i)))), L5);
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    public final long y0(long j5) {
        if (C1991e.e(j5)) {
            return 0L;
        }
        long h3 = this.f20034y.h();
        if (h3 == 9205357640488583168L) {
            return j5;
        }
        float d5 = C1991e.d(h3);
        if (Float.isInfinite(d5) || Float.isNaN(d5)) {
            d5 = C1991e.d(j5);
        }
        float b3 = C1991e.b(h3);
        if (Float.isInfinite(b3) || Float.isNaN(b3)) {
            b3 = C1991e.b(j5);
        }
        long d6 = AbstractC0444a.d(d5, b3);
        long a5 = this.f20032A.a(d6, j5);
        int i = e0.f20993a;
        float intBitsToFloat = Float.intBitsToFloat((int) (a5 >> 32));
        if (Float.isInfinite(intBitsToFloat) || Float.isNaN(intBitsToFloat)) {
            return j5;
        }
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & a5));
        return (Float.isInfinite(intBitsToFloat2) || Float.isNaN(intBitsToFloat2)) ? j5 : f0.j(d6, a5);
    }

    public final long z0(long j5) {
        float j6;
        int i;
        float s2;
        boolean f = W0.a.f(j5);
        boolean e3 = W0.a.e(j5);
        if (!f || !e3) {
            boolean z3 = W0.a.d(j5) && W0.a.c(j5);
            long h3 = this.f20034y.h();
            if (h3 != 9205357640488583168L) {
                if (z3 && (f || e3)) {
                    j6 = W0.a.h(j5);
                    i = W0.a.g(j5);
                } else {
                    float d5 = C1991e.d(h3);
                    float b3 = C1991e.b(h3);
                    if (Float.isInfinite(d5) || Float.isNaN(d5)) {
                        j6 = W0.a.j(j5);
                    } else {
                        F2.e eVar = AbstractC2485C.f19986b;
                        j6 = AbstractC0444a.s(d5, W0.a.j(j5), W0.a.h(j5));
                    }
                    if (!Float.isInfinite(b3) && !Float.isNaN(b3)) {
                        F2.e eVar2 = AbstractC2485C.f19986b;
                        s2 = AbstractC0444a.s(b3, W0.a.i(j5), W0.a.g(j5));
                        long y02 = y0(AbstractC0444a.d(j6, s2));
                        return W0.a.a(j5, W0.b.g(AbstractC2036a.U(C1991e.d(y02)), j5), 0, W0.b.f(AbstractC2036a.U(C1991e.b(y02)), j5), 0, 10);
                    }
                    i = W0.a.i(j5);
                }
                s2 = i;
                long y022 = y0(AbstractC0444a.d(j6, s2));
                return W0.a.a(j5, W0.b.g(AbstractC2036a.U(C1991e.d(y022)), j5), 0, W0.b.f(AbstractC2036a.U(C1991e.b(y022)), j5), 0, 10);
            }
            if (z3) {
                return W0.a.a(j5, W0.a.h(j5), 0, W0.a.g(j5), 0, 10);
            }
        }
        return j5;
    }
}
