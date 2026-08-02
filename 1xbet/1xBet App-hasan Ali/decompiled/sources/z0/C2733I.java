package z0;

import a.AbstractC0444a;
import a3.AbstractC0467k;
import i0.C2001f;
import i0.C2003h;
import i0.C2006k;
import i0.InterfaceC2009n;
import k0.AbstractC2024d;
import k0.C2021a;
import k0.C2022b;
import k0.InterfaceC2025e;
import l0.C2041b;

/* renamed from: z0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2733I implements InterfaceC2025e {

    /* renamed from: k, reason: collision with root package name */
    public final C2022b f21647k = new C2022b();

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC2757n f21648l;

    @Override // k0.InterfaceC2025e
    public final v3.e B() {
        return this.f21647k.f17540l;
    }

    @Override // W0.c
    public final float D(long j5) {
        C2022b c2022b = this.f21647k;
        c2022b.getClass();
        return L1.a.c(j5, c2022b);
    }

    @Override // k0.InterfaceC2025e
    public final void H(long j5, long j6, long j7, int i) {
        this.f21647k.H(j5, j6, j7, i);
    }

    @Override // W0.c
    public final int K(float f) {
        C2022b c2022b = this.f21647k;
        c2022b.getClass();
        return L1.a.b(f, c2022b);
    }

    @Override // k0.InterfaceC2025e
    public final void M(C2003h c2003h, i0.F f, float f5, AbstractC2024d abstractC2024d, int i) {
        this.f21647k.M(c2003h, f, f5, abstractC2024d, i);
    }

    @Override // k0.InterfaceC2025e
    public final void N(long j5, float f, float f5, long j6, long j7, AbstractC2024d abstractC2024d) {
        this.f21647k.N(j5, f, f5, j6, j7, abstractC2024d);
    }

    @Override // k0.InterfaceC2025e
    public final void P(long j5, long j6, long j7, float f, int i) {
        this.f21647k.P(j5, j6, j7, f, i);
    }

    @Override // k0.InterfaceC2025e
    public final long Q() {
        return this.f21647k.Q();
    }

    @Override // W0.c
    public final long S(long j5) {
        C2022b c2022b = this.f21647k;
        c2022b.getClass();
        return L1.a.f(j5, c2022b);
    }

    @Override // W0.c
    public final float V(long j5) {
        C2022b c2022b = this.f21647k;
        c2022b.getClass();
        return L1.a.e(j5, c2022b);
    }

    public final void a() {
        C2022b c2022b = this.f21647k;
        InterfaceC2009n v4 = c2022b.f17540l.v();
        InterfaceC2755l interfaceC2755l = this.f21648l;
        if (interfaceC2755l == null) {
            throw AbstractC0467k.u("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        b0.o oVar = (b0.o) interfaceC2755l;
        b0.o oVar2 = oVar.f7162k.f7167p;
        if (oVar2 != null && (oVar2.f7165n & 4) != 0) {
            while (oVar2 != null) {
                int i = oVar2.f7164m;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    oVar2 = oVar2.f7167p;
                }
            }
        }
        oVar2 = null;
        if (oVar2 == null) {
            e0 t5 = AbstractC2749f.t(interfaceC2755l, 4);
            if (t5.I0() == oVar.f7162k) {
                t5 = t5.f21813z;
                kotlin.jvm.internal.l.c(t5);
            }
            t5.X0(v4, (C2041b) c2022b.f17540l.f20433m);
            return;
        }
        R.e eVar = null;
        while (oVar2 != null) {
            if (oVar2 instanceof InterfaceC2757n) {
                InterfaceC2757n interfaceC2757n = (InterfaceC2757n) oVar2;
                C2041b c2041b = (C2041b) c2022b.f17540l.f20433m;
                e0 t6 = AbstractC2749f.t(interfaceC2757n, 4);
                long d02 = AbstractC0444a.d0(t6.f20975m);
                C2731G c2731g = t6.f21812y;
                c2731g.getClass();
                ((A0.F) AbstractC2734J.a(c2731g)).getSharedDrawScope().b(v4, d02, t6, interfaceC2757n, c2041b);
            } else if ((oVar2.f7164m & 4) != 0 && (oVar2 instanceof AbstractC2756m)) {
                int i5 = 0;
                for (b0.o oVar3 = ((AbstractC2756m) oVar2).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                    if ((oVar3.f7164m & 4) != 0) {
                        i5++;
                        if (i5 == 1) {
                            oVar2 = oVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new R.e(new b0.o[16]);
                            }
                            if (oVar2 != null) {
                                eVar.c(oVar2);
                                oVar2 = null;
                            }
                            eVar.c(oVar3);
                        }
                    }
                }
                if (i5 == 1) {
                }
            }
            oVar2 = AbstractC2749f.f(eVar);
        }
    }

    @Override // k0.InterfaceC2025e
    public final void a0(C2001f c2001f, long j5, long j6, long j7, float f, C2006k c2006k, int i) {
        this.f21647k.a0(c2001f, j5, j6, j7, f, c2006k, i);
    }

    public final void b(InterfaceC2009n interfaceC2009n, long j5, e0 e0Var, InterfaceC2757n interfaceC2757n, C2041b c2041b) {
        InterfaceC2757n interfaceC2757n2 = this.f21648l;
        this.f21648l = interfaceC2757n;
        W0.m mVar = e0Var.f21812y.f21608I;
        C2022b c2022b = this.f21647k;
        v3.e eVar = c2022b.f17540l;
        C2021a c2021a = ((C2022b) eVar.f20434n).f17539k;
        W0.c cVar = c2021a.f17535a;
        W0.m mVar2 = c2021a.f17536b;
        InterfaceC2009n v4 = eVar.v();
        v3.e eVar2 = c2022b.f17540l;
        long A3 = eVar2.A();
        C2041b c2041b2 = (C2041b) eVar2.f20433m;
        eVar2.N(e0Var);
        eVar2.O(mVar);
        eVar2.M(interfaceC2009n);
        eVar2.P(j5);
        eVar2.f20433m = c2041b;
        interfaceC2009n.k();
        try {
            interfaceC2757n.g(this);
            interfaceC2009n.j();
            eVar2.N(cVar);
            eVar2.O(mVar2);
            eVar2.M(v4);
            eVar2.P(A3);
            eVar2.f20433m = c2041b2;
            this.f21648l = interfaceC2757n2;
        } catch (Throwable th) {
            interfaceC2009n.j();
            eVar2.N(cVar);
            eVar2.O(mVar2);
            eVar2.M(v4);
            eVar2.P(A3);
            eVar2.f20433m = c2041b2;
            throw th;
        }
    }

    @Override // W0.c
    public final long b0(float f) {
        return this.f21647k.b0(f);
    }

    @Override // W0.c
    public final float c() {
        return this.f21647k.c();
    }

    @Override // k0.InterfaceC2025e
    public final long d() {
        return this.f21647k.f17540l.A();
    }

    @Override // k0.InterfaceC2025e
    public final void d0(C2003h c2003h, long j5, AbstractC2024d abstractC2024d) {
        this.f21647k.d0(c2003h, j5, abstractC2024d);
    }

    public final void e(i0.F f, long j5, long j6, float f5, AbstractC2024d abstractC2024d) {
        C2022b c2022b = this.f21647k;
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        c2022b.f17539k.f17537c.t(Float.intBitsToFloat(i), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat(i5) + Float.intBitsToFloat((int) (j6 & 4294967295L)), c2022b.b(f, abstractC2024d, f5, null, 3, 1));
    }

    public final void f(i0.F f, long j5, long j6, long j7, float f5, AbstractC2024d abstractC2024d) {
        C2022b c2022b = this.f21647k;
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        c2022b.f17539k.f17537c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), c2022b.b(f, abstractC2024d, f5, null, 3, 1));
    }

    @Override // k0.InterfaceC2025e
    public final W0.m getLayoutDirection() {
        return this.f21647k.f17539k.f17536b;
    }

    @Override // W0.c
    public final float h0(int i) {
        return this.f21647k.h0(i);
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / this.f21647k.c();
    }

    @Override // W0.c
    public final float n() {
        return this.f21647k.n();
    }

    @Override // k0.InterfaceC2025e
    public final void q(float f, long j5, long j6) {
        this.f21647k.q(f, j5, j6);
    }

    @Override // k0.InterfaceC2025e
    public final void w(long j5, long j6, long j7, long j8) {
        this.f21647k.w(j5, j6, j7, j8);
    }

    @Override // W0.c
    public final long x(long j5) {
        C2022b c2022b = this.f21647k;
        c2022b.getClass();
        return L1.a.d(j5, c2022b);
    }

    @Override // W0.c
    public final float y(float f) {
        return this.f21647k.c() * f;
    }
}
