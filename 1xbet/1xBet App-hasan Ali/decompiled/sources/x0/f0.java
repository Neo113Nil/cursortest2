package x0;

import P.AbstractC0329z;
import P.C0302l;
import P.C0310p;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import h0.C1989c;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import z0.AbstractC2740P;
import z0.C2731G;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final U f20995a = new U(4);

    public static final void a(b0.p pVar, i4.e eVar, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(-1298353104);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(pVar) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(eVar) ? 32 : 16;
        }
        if (c0315s.P(i5 & 1, (i5 & 19) != 18)) {
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = new i0(U.f20966l);
                c0315s.i0(M5);
            }
            b((i0) M5, pVar, eVar, c0315s, (i5 << 3) & 1008);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new a1.f(pVar, eVar, i, 1);
        }
    }

    public static final void b(i0 i0Var, b0.p pVar, i4.e eVar, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(-511989831);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(i0Var) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(eVar) ? 256 : 128;
        }
        if (c0315s.P(i5 & 1, (i5 & 147) != 146)) {
            long j5 = c0315s.f4531T;
            int i6 = (int) (j5 ^ (j5 >>> 32));
            C0310p v4 = AbstractC0329z.v(c0315s);
            b0.p c5 = b0.a.c(c0315s, pVar);
            InterfaceC0314r0 l5 = c0315s.l();
            C2768z c2768z = C2768z.f21875l;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, i0Var.f21006c, i0Var);
            AbstractC0329z.y(c0315s, i0Var.f21007d, v4);
            AbstractC0329z.y(c0315s, i0Var.f21008e, eVar);
            InterfaceC2753j.f21834j.getClass();
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(i6))) {
                AbstractC2107A.y(i6, c0315s, i6, c2751h);
            }
            c0315s.q(true);
            if (c0315s.B()) {
                c0315s.X(-1259216055);
                c0315s.q(false);
            } else {
                c0315s.X(-1259274676);
                boolean h3 = c0315s.h(i0Var);
                Object M5 = c0315s.M();
                if (h3 || M5 == C0302l.f4480a) {
                    M5 = new J(1, i0Var);
                    c0315s.i0(M5);
                }
                AbstractC0329z.g((InterfaceC2015a) M5, c0315s);
                c0315s.q(false);
            }
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new B.I(i0Var, pVar, eVar, i, 5);
        }
    }

    public static final float c(long j5, long j6) {
        return Math.min(Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L)));
    }

    public static final float d(Y y5, boolean z3, C2630p[] c2630pArr, float f) {
        float f5 = Float.NaN;
        for (C2630p c2630p : c2630pArr) {
            float b3 = y5.b(c2630p);
            if (!Float.isNaN(f5)) {
                int i = z3 != (b3 > f5) ? i + 1 : 0;
            }
            f5 = b3;
        }
        return Float.isNaN(f5) ? f : f5;
    }

    public static final C1989c e(InterfaceC2637x interfaceC2637x) {
        InterfaceC2637x l5 = interfaceC2637x.l();
        return l5 != null ? l5.s(interfaceC2637x, true) : new C1989c(0.0f, 0.0f, (int) (interfaceC2637x.I() >> 32), (int) (interfaceC2637x.I() & 4294967295L));
    }

    public static final C1989c f(InterfaceC2637x interfaceC2637x) {
        InterfaceC2637x h3 = h(interfaceC2637x);
        float I5 = (int) (h3.I() >> 32);
        float I6 = (int) (h3.I() & 4294967295L);
        C1989c s2 = h3.s(interfaceC2637x, true);
        float f = s2.f17193a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > I5) {
            f = I5;
        }
        float f5 = s2.f17194b;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > I6) {
            f5 = I6;
        }
        float f6 = s2.f17195c;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 <= I5) {
            I5 = f6;
        }
        float f7 = s2.f17196d;
        float f8 = f7 >= 0.0f ? f7 : 0.0f;
        if (f8 <= I6) {
            I6 = f8;
        }
        if (f == I5 || f5 == I6) {
            return C1989c.f17192e;
        }
        long h4 = h3.h((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        long h5 = h3.h((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(I5) << 32));
        long h6 = h3.h((Float.floatToRawIntBits(I5) << 32) | (Float.floatToRawIntBits(I6) & 4294967295L));
        long h7 = h3.h((Float.floatToRawIntBits(I6) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (h4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h5 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (h7 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (h6 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (h4 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (h5 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (h7 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (4294967295L & h6));
        return new C1989c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean g(long j5, long j6) {
        return j5 == j6;
    }

    public static final InterfaceC2637x h(InterfaceC2637x interfaceC2637x) {
        InterfaceC2637x interfaceC2637x2;
        InterfaceC2637x l5 = interfaceC2637x.l();
        while (true) {
            InterfaceC2637x interfaceC2637x3 = l5;
            interfaceC2637x2 = interfaceC2637x;
            interfaceC2637x = interfaceC2637x3;
            if (interfaceC2637x == null) {
                break;
            }
            l5 = interfaceC2637x.l();
        }
        z0.e0 e0Var = interfaceC2637x2 instanceof z0.e0 ? (z0.e0) interfaceC2637x2 : null;
        if (e0Var == null) {
            return interfaceC2637x2;
        }
        z0.e0 e0Var2 = e0Var.f21795A;
        while (true) {
            z0.e0 e0Var3 = e0Var2;
            z0.e0 e0Var4 = e0Var;
            e0Var = e0Var3;
            if (e0Var == null) {
                return e0Var4;
            }
            e0Var2 = e0Var.f21795A;
        }
    }

    public static final AbstractC2740P i(AbstractC2740P abstractC2740P) {
        C2731G c2731g = abstractC2740P.f21691y.f21812y;
        while (true) {
            C2731G u5 = c2731g.u();
            C2731G c2731g2 = null;
            if ((u5 != null ? u5.f21630q : null) == null) {
                AbstractC2740P G02 = c2731g.f21612O.f21769d.G0();
                kotlin.jvm.internal.l.c(G02);
                return G02;
            }
            C2731G u6 = c2731g.u();
            if (u6 != null) {
                c2731g2 = u6.f21630q;
            }
            kotlin.jvm.internal.l.c(c2731g2);
            C2731G u7 = c2731g.u();
            kotlin.jvm.internal.l.c(u7);
            c2731g = u7.f21630q;
            kotlin.jvm.internal.l.c(c2731g);
        }
    }

    public static final long j(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
