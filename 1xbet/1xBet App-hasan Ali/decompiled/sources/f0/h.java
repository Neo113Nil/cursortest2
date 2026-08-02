package f0;

import E.D0;
import X3.w;
import b0.o;
import h0.C1991e;
import i0.C2006k;
import k0.C2022b;
import k0.C2023c;
import o0.C2195B;
import x0.N;
import x0.P;
import x0.Q;
import x0.U;
import x0.Z;
import x0.f0;
import z0.AbstractC2739O;
import z0.C2733I;
import z0.InterfaceC2757n;
import z0.InterfaceC2765w;

/* loaded from: classes.dex */
public final class h extends o implements InterfaceC2765w, InterfaceC2757n {

    /* renamed from: A, reason: collision with root package name */
    public b0.h f16930A;

    /* renamed from: B, reason: collision with root package name */
    public U f16931B;

    /* renamed from: C, reason: collision with root package name */
    public float f16932C;

    /* renamed from: D, reason: collision with root package name */
    public C2006k f16933D;

    /* renamed from: y, reason: collision with root package name */
    public C2195B f16934y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16935z;

    public static boolean A0(long j5) {
        return !C1991e.a(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean z0(long j5) {
        return !C1991e.a(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final long B0(long j5) {
        boolean z3 = false;
        boolean z5 = W0.a.d(j5) && W0.a.c(j5);
        if (W0.a.f(j5) && W0.a.e(j5)) {
            z3 = true;
        }
        if ((!y0() && z5) || z3) {
            return W0.a.a(j5, W0.a.h(j5), 0, W0.a.g(j5), 0, 10);
        }
        long h3 = this.f16934y.h();
        int round = A0(h3) ? Math.round(Float.intBitsToFloat((int) (h3 >> 32))) : W0.a.j(j5);
        int round2 = z0(h3) ? Math.round(Float.intBitsToFloat((int) (h3 & 4294967295L))) : W0.a.i(j5);
        int g5 = W0.b.g(round, j5);
        long floatToRawIntBits = (Float.floatToRawIntBits(W0.b.f(round2, j5)) & 4294967295L) | (Float.floatToRawIntBits(g5) << 32);
        if (y0()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!A0(this.f16934y.h()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f16934y.h() >> 32))) << 32) | (Float.floatToRawIntBits(!z0(this.f16934y.h()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f16934y.h() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : f0.j(floatToRawIntBits2, this.f16931B.a(floatToRawIntBits2, floatToRawIntBits));
        }
        return W0.a.a(j5, W0.b.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j5), 0, W0.b.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j5), 0, 10);
    }

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, N n5, int i) {
        if (!y0()) {
            return n5.f(i);
        }
        long B0 = B0(W0.b.b(i, 0, 13));
        return Math.max(W0.a.i(B0), n5.f(i));
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, N n5, int i) {
        if (!y0()) {
            return n5.T(i);
        }
        long B0 = B0(W0.b.b(0, i, 7));
        return Math.max(W0.a.j(B0), n5.T(i));
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, N n5, int i) {
        if (!y0()) {
            return n5.U(i);
        }
        long B0 = B0(W0.b.b(i, 0, 13));
        return Math.max(W0.a.i(B0), n5.U(i));
    }

    @Override // z0.InterfaceC2765w
    public final P f(Q q5, N n5, long j5) {
        Z e3 = n5.e(B0(j5));
        return q5.i(e3.f20973k, e3.f20974l, w.f6091k, new D0(e3, 3));
    }

    @Override // z0.InterfaceC2757n
    public final /* synthetic */ void f0() {
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        long h3 = this.f16934y.h();
        boolean A02 = A0(h3);
        C2022b c2022b = c2733i.f21647k;
        float intBitsToFloat = A02 ? Float.intBitsToFloat((int) (h3 >> 32)) : Float.intBitsToFloat((int) (c2022b.f17540l.A() >> 32));
        float intBitsToFloat2 = z0(h3) ? Float.intBitsToFloat((int) (h3 & 4294967295L)) : Float.intBitsToFloat((int) (c2022b.f17540l.A() & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        long j5 = (Float.intBitsToFloat((int) (c2022b.f17540l.A() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c2022b.f17540l.A() & 4294967295L)) == 0.0f) ? 0L : f0.j(floatToRawIntBits, this.f16931B.a(floatToRawIntBits, c2022b.f17540l.A()));
        long a5 = this.f16930A.a((Math.round(Float.intBitsToFloat((int) (j5 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j5 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (c2022b.f17540l.A() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (c2022b.f17540l.A() & 4294967295L))) & 4294967295L), c2733i.getLayoutDirection());
        float f = (int) (a5 >> 32);
        float f5 = (int) (a5 & 4294967295L);
        ((C2023c) c2022b.f17540l.f20432l).B(f, f5);
        try {
            this.f16934y.g(c2733i, j5, this.f16932C, this.f16933D);
            ((C2023c) c2022b.f17540l.f20432l).B(-f, -f5);
            c2733i.a();
        } catch (Throwable th) {
            ((C2023c) c2022b.f17540l.f20432l).B(-f, -f5);
            throw th;
        }
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, N n5, int i) {
        if (!y0()) {
            return n5.L(i);
        }
        long B0 = B0(W0.b.b(0, i, 7));
        return Math.max(W0.a.j(B0), n5.L(i));
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f16934y + ", sizeToIntrinsics=" + this.f16935z + ", alignment=" + this.f16930A + ", alpha=" + this.f16932C + ", colorFilter=" + this.f16933D + ')';
    }

    public final boolean y0() {
        return this.f16935z && this.f16934y.h() != 9205357640488583168L;
    }
}
