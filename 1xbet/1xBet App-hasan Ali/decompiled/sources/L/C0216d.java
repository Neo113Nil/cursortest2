package L;

import M.C0254z;
import a3.AbstractC0467k;
import h0.C1988b;
import h0.C1991e;
import k0.C2022b;
import k0.C2023c;
import p4.AbstractC2282w;
import r.C2321G;
import u.C2451c;
import y.C2654j;
import z0.AbstractC2749f;
import z0.C2733I;

/* renamed from: L.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216d extends w {

    /* renamed from: I, reason: collision with root package name */
    public final C2321G f2927I;

    public C0216d(C2654j c2654j, boolean z3, float f, C0254z c0254z, M.A a5) {
        super(c2654j, z3, f, c0254z, a5);
        this.f2927I = new C2321G();
    }

    @Override // L.w
    public final void B0(y.l lVar) {
        p pVar = (p) this.f2927I.g(lVar);
        if (pVar != null) {
            pVar.f2964k.setValue(Boolean.TRUE);
            pVar.i.Q(W3.o.f6046a);
        }
    }

    @Override // b0.o
    public final void q0() {
        this.f2927I.a();
    }

    @Override // L.w
    public final void y0(y.l lVar, long j5, float f) {
        C2321G c2321g = this.f2927I;
        Object[] objArr = c2321g.f18929b;
        Object[] objArr2 = c2321g.f18930c;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j6 = jArr[i];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j6) < 128) {
                            int i7 = (i << 3) + i6;
                            Object obj = objArr[i7];
                            p pVar = (p) objArr2[i7];
                            pVar.f2964k.setValue(Boolean.TRUE);
                            pVar.i.Q(W3.o.f6046a);
                        }
                        j6 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        boolean z3 = this.f2991z;
        p pVar2 = new p(z3 ? new C1988b(lVar.f21125a) : null, f, z3);
        c2321g.m(lVar, pVar2);
        AbstractC2282w.p(k0(), null, new C0215c(pVar2, this, lVar, null), 3);
        AbstractC2749f.m(this);
    }

    @Override // L.w
    public final void z0(C2733I c2733i) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i;
        C0216d c0216d = this;
        c0216d.f2984C.invoke();
        float f = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        C2321G c2321g = c0216d.f2927I;
        Object[] objArr3 = c2321g.f18929b;
        Object[] objArr4 = c2321g.f18930c;
        long[] jArr3 = c2321g.f18928a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr3[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j5) < 128) {
                        int i9 = (i5 << 3) + i8;
                        Object obj = objArr3[i9];
                        p pVar = (p) objArr4[i9];
                        long b3 = i0.p.b(f, c0216d.f2983B.a());
                        if (pVar.f2959d == null) {
                            long d5 = c2733i.d();
                            float f5 = q.f2965a;
                            pVar.f2959d = Float.valueOf(Math.max(C1991e.d(d5), C1991e.b(d5)) * 0.3f);
                        }
                        C1988b c1988b = pVar.f2956a;
                        i = i6;
                        C2022b c2022b = c2733i.f21647k;
                        if (c1988b == null) {
                            jArr2 = jArr3;
                            pVar.f2956a = new C1988b(c2022b.Q());
                        } else {
                            jArr2 = jArr3;
                        }
                        if (pVar.f2960e == null) {
                            pVar.f2960e = new C1988b(G4.d.d(C1991e.d(c2733i.d()) / 2.0f, C1991e.b(c2733i.d()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) pVar.f2964k.getValue()).booleanValue() || ((Boolean) pVar.f2963j.getValue()).booleanValue()) ? ((Number) pVar.f.d()).floatValue() : 1.0f;
                        Float f6 = pVar.f2959d;
                        kotlin.jvm.internal.l.c(f6);
                        float f7 = floatValue;
                        float F5 = G4.d.F(f6.floatValue(), pVar.f2957b, ((Number) pVar.f2961g.d()).floatValue());
                        C1988b c1988b2 = pVar.f2956a;
                        kotlin.jvm.internal.l.c(c1988b2);
                        float d6 = C1988b.d(c1988b2.f17191a);
                        C1988b c1988b3 = pVar.f2960e;
                        kotlin.jvm.internal.l.c(c1988b3);
                        float d7 = C1988b.d(c1988b3.f17191a);
                        C2451c c2451c = pVar.f2962h;
                        float F6 = G4.d.F(d6, d7, ((Number) c2451c.d()).floatValue());
                        C1988b c1988b4 = pVar.f2956a;
                        kotlin.jvm.internal.l.c(c1988b4);
                        float e3 = C1988b.e(c1988b4.f17191a);
                        C1988b c1988b5 = pVar.f2960e;
                        kotlin.jvm.internal.l.c(c1988b5);
                        objArr2 = objArr3;
                        long d8 = G4.d.d(F6, G4.d.F(e3, C1988b.e(c1988b5.f17191a), ((Number) c2451c.d()).floatValue()));
                        long b5 = i0.p.b(i0.p.d(b3) * f7, b3);
                        if (pVar.f2958c) {
                            float d9 = C1991e.d(c2733i.d());
                            float b6 = C1991e.b(c2733i.d());
                            v3.e eVar = c2022b.f17540l;
                            long A3 = eVar.A();
                            eVar.v().k();
                            ((v3.e) ((C2023c) eVar.f20432l).f17544l).v().f(0.0f, 0.0f, d9, b6, 1);
                            AbstractC0467k.h(c2733i, b5, F5, d8, 120);
                            eVar.v().j();
                            eVar.P(A3);
                        } else {
                            AbstractC0467k.h(c2733i, b5, F5, d8, 120);
                        }
                    } else {
                        jArr2 = jArr3;
                        objArr2 = objArr3;
                        i = i6;
                    }
                    j5 >>= i;
                    i8++;
                    c0216d = this;
                    i6 = i;
                    jArr3 = jArr2;
                    objArr3 = objArr2;
                    f = 0.1f;
                }
                jArr = jArr3;
                objArr = objArr3;
                if (i7 != i6) {
                    return;
                }
            } else {
                jArr = jArr3;
                objArr = objArr3;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            c0216d = this;
            jArr3 = jArr;
            objArr3 = objArr;
            f = 0.1f;
        }
    }
}
