package M;

import A0.I0;
import A0.o1;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import v.AbstractC2528x;
import y.C2654j;
import z.AbstractC2710l;
import z.C2681E;
import z0.C2751h;
import z0.C2752i;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3256a = 4;

    static {
        long j5 = O.k.f3971l;
        W0.p[] pVarArr = W0.o.f6020b;
        long j6 = 1095216660480L & j5;
        if (j6 == 0) {
            W0.i.a("Cannot perform operation for Unspecified type.");
        }
        AbstractC2036a.M(W0.o.c(j5) / 2, j6);
    }

    public static final void a(String str, i4.c cVar, b0.p pVar, boolean z3, K0.O o5, X.d dVar, X.d dVar2, X.d dVar3, o1 o1Var, E.Y y5, E.X x5, boolean z5, int i, int i5, i0.J j5, q0 q0Var, C0315s c0315s, int i6) {
        K0.O o6;
        o1 o1Var2;
        int i7;
        int i8;
        E.Y y6;
        E.X x6;
        boolean z6;
        C0315s c0315s2;
        E.X x7;
        o1 o1Var3;
        int i9;
        boolean z7;
        E.Y y7;
        int i10;
        K0.O o7;
        c0315s.Z(-1922450045);
        int i11 = i6 | (c0315s.f(str) ? 4 : 2) | (c0315s.h(cVar) ? 32 : 16) | 1666048;
        int i12 = 6 | (c0315s.f(j5) ? ' ' : (char) 16) | (c0315s.f(q0Var) ? 256 : 128);
        if ((i11 & 306783379) == 306783378 && (i12 & 147) == 146 && c0315s.B()) {
            c0315s.S();
            z7 = z3;
            o7 = o5;
            o1Var3 = o1Var;
            y7 = y5;
            x7 = x5;
            i9 = i;
            i10 = i5;
            c0315s2 = c0315s;
        } else {
            c0315s.U();
            if ((i6 & 1) == 0 || c0315s.z()) {
                o6 = (K0.O) c0315s.j(u0.f3551a);
                o1 o1Var4 = P0.E.f4620a;
                E.Y y8 = E.Y.f1087a;
                E.X x8 = E.X.f1086a;
                o1Var2 = o1Var4;
                i7 = 1;
                i8 = z5 ? 1 : Integer.MAX_VALUE;
                y6 = y8;
                x6 = x8;
                z6 = true;
            } else {
                c0315s.S();
                z6 = z3;
                o6 = o5;
                o1Var2 = o1Var;
                y6 = y5;
                x6 = x5;
                i8 = i;
                i7 = i5;
            }
            c0315s.r();
            c0315s.X(30062948);
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = new C2654j();
                c0315s.i0(M5);
            }
            C2654j c2654j = (C2654j) M5;
            boolean z8 = false;
            c0315s.q(false);
            c0315s.X(30069058);
            long b3 = o6.b();
            if (b3 == 16) {
                b3 = !z6 ? q0Var.f3459c : ((Boolean) AbstractC2528x.b(c2654j, c0315s, 0).getValue()).booleanValue() ? q0Var.f3457a : q0Var.f3458b;
                z8 = false;
            }
            long j6 = b3;
            c0315s.q(z8);
            K0.O d5 = o6.d(new K0.O(j6, 0L, null, 0L, 0, 0L, 16777214));
            K0.O o8 = o6;
            c0315s2 = c0315s;
            AbstractC0329z.a(I.X.f2457a.a(q0Var.f3465k), X.e.d(-1886965181, new Q(pVar, (W0.c) c0315s.j(I0.f287h), q0Var, str, cVar, z6, d5, y6, x6, z5, i8, i7, o1Var2, c2654j, dVar, dVar2, dVar3, j5), c0315s2), c0315s2, 56);
            int i13 = i8;
            x7 = x6;
            o1Var3 = o1Var2;
            i9 = i13;
            z7 = z6;
            y7 = y6;
            i10 = i7;
            o7 = o8;
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new S(str, cVar, pVar, z7, o7, dVar, dVar2, dVar3, o1Var3, y7, x7, z5, i9, i10, j5, q0Var, i6);
        }
    }

    public static final void b(i4.e eVar, X.d dVar, X.d dVar2, X.d dVar3, X.d dVar4, X.d dVar5, X.d dVar6, boolean z3, float f, i4.c cVar, X.d dVar7, X.d dVar8, C2681E c2681e, C0315s c0315s, int i, int i5) {
        int i6;
        int i7;
        C2681E c2681e2;
        W0.m mVar;
        X.d dVar9;
        X.d dVar10;
        float f5;
        X.d dVar11;
        X.d dVar12;
        float f6;
        X.d dVar13;
        boolean z5;
        b0.m mVar2 = b0.m.f7161k;
        c0315s.Z(1408290209);
        if ((i & 6) == 0) {
            i6 = i | (c0315s.f(mVar2) ? 4 : 2);
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            i6 |= c0315s.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= c0315s.h(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= c0315s.h(dVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= c0315s.h(dVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= c0315s.h(dVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= c0315s.h(dVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= c0315s.h(dVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i6 |= c0315s.g(z3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= c0315s.c(f) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (c0315s.h(cVar) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0315s.h(dVar7) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= c0315s.h(dVar8) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            c2681e2 = c2681e;
            i7 |= c0315s.f(c2681e2) ? 2048 : 1024;
        } else {
            c2681e2 = c2681e;
        }
        int i8 = i7;
        if ((i6 & 306783379) == 306783378 && (i8 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
            dVar12 = dVar2;
            dVar13 = dVar8;
            dVar11 = dVar;
            f6 = f;
        } else {
            boolean z6 = ((i8 & 14) == 4) | ((i6 & 234881024) == 67108864) | ((i6 & 1879048192) == 536870912) | ((i8 & 7168) == 2048);
            Object M5 = c0315s.M();
            if (z6 || M5 == C0302l.f4480a) {
                M5 = new Y(cVar, z3, f, c2681e2);
                c0315s.i0(M5);
            }
            Y y5 = (Y) M5;
            W0.m mVar3 = (W0.m) c0315s.j(I0.f292n);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, mVar2);
            InterfaceC2753j.f21834j.getClass();
            InterfaceC2015a interfaceC2015a = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(interfaceC2015a);
            } else {
                c0315s.l0();
            }
            C2751h c2751h = C2752i.f21833e;
            AbstractC0329z.y(c0315s, c2751h, y5);
            C2751h c2751h2 = C2752i.f21832d;
            AbstractC0329z.y(c0315s, c2751h2, l5);
            C2751h c2751h3 = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h3);
            }
            C2751h c2751h4 = C2752i.f21831c;
            AbstractC0329z.y(c0315s, c2751h4, c5);
            dVar7.invoke(c0315s, Integer.valueOf((i8 >> 3) & 14));
            c0315s.X(250370369);
            b0.h hVar = b0.c.f7141o;
            if (dVar3 != null) {
                b0.p c6 = androidx.compose.ui.layout.a.c(mVar2, "Leading").c(N.n.i);
                x0.O e3 = AbstractC2710l.e(hVar, false);
                int p6 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l6 = c0315s.l();
                b0.p c7 = b0.a.c(c0315s, c6);
                c0315s.b0();
                mVar = mVar3;
                if (c0315s.f4530S) {
                    c0315s.k(interfaceC2015a);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, c2751h, e3);
                AbstractC0329z.y(c0315s, c2751h2, l6);
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p6))) {
                    AbstractC2107A.y(p6, c0315s, p6, c2751h3);
                }
                AbstractC0329z.y(c0315s, c2751h4, c7);
                dVar3.invoke(c0315s, Integer.valueOf((i6 >> 12) & 14));
                c0315s.q(true);
            } else {
                mVar = mVar3;
            }
            boolean z7 = false;
            c0315s.q(false);
            c0315s.X(250379492);
            if (dVar4 != null) {
                b0.p c8 = androidx.compose.ui.layout.a.c(mVar2, "Trailing").c(N.n.i);
                x0.O e5 = AbstractC2710l.e(hVar, false);
                int p7 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l7 = c0315s.l();
                b0.p c9 = b0.a.c(c0315s, c8);
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(interfaceC2015a);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, c2751h, e5);
                AbstractC0329z.y(c0315s, c2751h2, l7);
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p7))) {
                    AbstractC2107A.y(p7, c0315s, p7, c2751h3);
                }
                AbstractC0329z.y(c0315s, c2751h4, c9);
                dVar4.invoke(c0315s, Integer.valueOf((i6 >> 15) & 14));
                c0315s.q(true);
                z7 = false;
            }
            c0315s.q(z7);
            W0.m mVar4 = mVar;
            float c10 = androidx.compose.foundation.layout.b.c(c2681e2, mVar4);
            float b3 = mVar4 == W0.m.f6016k ? c2681e2.b(mVar4) : c2681e2.a(mVar4);
            if (dVar3 != null) {
                c10 -= N.n.f3710c;
                float f7 = 0;
                if (c10 < f7) {
                    c10 = f7;
                }
            }
            if (dVar4 != null) {
                b3 -= N.n.f3710c;
                float f8 = 0;
                if (b3 < f8) {
                    b3 = f8;
                }
            }
            c0315s.X(250410106);
            b0.h hVar2 = b0.c.f7137k;
            if (dVar5 != null) {
                b0.p i9 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(mVar2, "Prefix"), N.n.f, Float.NaN)), c10, 0.0f, N.n.f3712e, 10);
                x0.O e6 = AbstractC2710l.e(hVar2, false);
                int p8 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l8 = c0315s.l();
                b0.p c11 = b0.a.c(c0315s, i9);
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(interfaceC2015a);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, c2751h, e6);
                AbstractC0329z.y(c0315s, c2751h2, l8);
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p8))) {
                    AbstractC2107A.y(p8, c0315s, p8, c2751h3);
                }
                AbstractC0329z.y(c0315s, c2751h4, c11);
                dVar9 = dVar5;
                dVar9.invoke(c0315s, Integer.valueOf((i6 >> 18) & 14));
                c0315s.q(true);
            } else {
                dVar9 = dVar5;
            }
            c0315s.q(false);
            c0315s.X(250422072);
            if (dVar6 != null) {
                b0.p i10 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(mVar2, "Suffix"), N.n.f, Float.NaN)), N.n.f3712e, 0.0f, b3, 10);
                x0.O e7 = AbstractC2710l.e(hVar2, false);
                int p9 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l9 = c0315s.l();
                b0.p c12 = b0.a.c(c0315s, i10);
                c0315s.b0();
                f5 = b3;
                if (c0315s.f4530S) {
                    c0315s.k(interfaceC2015a);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, c2751h, e7);
                AbstractC0329z.y(c0315s, c2751h2, l9);
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p9))) {
                    AbstractC2107A.y(p9, c0315s, p9, c2751h3);
                }
                AbstractC0329z.y(c0315s, c2751h4, c12);
                dVar10 = dVar6;
                dVar10.invoke(c0315s, Integer.valueOf((i6 >> 21) & 14));
                c0315s.q(true);
            } else {
                dVar10 = dVar6;
                f5 = b3;
            }
            c0315s.q(false);
            float f9 = N.n.f;
            b0.p j5 = androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.c.d(mVar2, f9, Float.NaN));
            if (dVar9 != null) {
                c10 = 0;
            }
            b0.p i11 = androidx.compose.foundation.layout.b.i(j5, c10, 0.0f, dVar10 == null ? f5 : 0, 10);
            c0315s.X(250444361);
            if (dVar != null) {
                dVar11 = dVar;
                dVar11.b(androidx.compose.ui.layout.a.c(mVar2, "Hint").c(i11), c0315s, Integer.valueOf((i6 >> 3) & 112));
            } else {
                dVar11 = dVar;
            }
            c0315s.q(false);
            b0.p c13 = androidx.compose.ui.layout.a.c(mVar2, "TextField").c(i11);
            x0.O e8 = AbstractC2710l.e(hVar2, true);
            int p10 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l10 = c0315s.l();
            b0.p c14 = b0.a.c(c0315s, c13);
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(interfaceC2015a);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, c2751h, e8);
            AbstractC0329z.y(c0315s, c2751h2, l10);
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p10))) {
                AbstractC2107A.y(p10, c0315s, p10, c2751h3);
            }
            AbstractC0329z.y(c0315s, c2751h4, c14);
            eVar.invoke(c0315s, Integer.valueOf((i6 >> 3) & 14));
            c0315s.q(true);
            c0315s.X(250455481);
            if (dVar2 != null) {
                f6 = f;
                b0.p c15 = androidx.compose.ui.layout.a.c(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.c.d(mVar2, G4.d.F(f9, N.n.f3713g, f6), Float.NaN)), "Label");
                x0.O e9 = AbstractC2710l.e(hVar2, false);
                int p11 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l11 = c0315s.l();
                b0.p c16 = b0.a.c(c0315s, c15);
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(interfaceC2015a);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, c2751h, e9);
                AbstractC0329z.y(c0315s, c2751h2, l11);
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p11))) {
                    AbstractC2107A.y(p11, c0315s, p11, c2751h3);
                }
                AbstractC0329z.y(c0315s, c2751h4, c16);
                dVar12 = dVar2;
                dVar12.invoke(c0315s, Integer.valueOf((i6 >> 9) & 14));
                c0315s.q(true);
            } else {
                dVar12 = dVar2;
                f6 = f;
            }
            c0315s.q(false);
            c0315s.X(250473414);
            if (dVar8 != null) {
                b0.p j6 = androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.c.d(androidx.compose.ui.layout.a.c(mVar2, "Supporting"), N.n.f3714h, Float.NaN));
                float f10 = N.n.f3709b;
                b0.p e10 = androidx.compose.foundation.layout.b.e(j6, new C2681E(f10, N.n.f3711d, f10, 0));
                x0.O e11 = AbstractC2710l.e(hVar2, false);
                int p12 = AbstractC0329z.p(c0315s);
                InterfaceC0314r0 l12 = c0315s.l();
                b0.p c17 = b0.a.c(c0315s, e10);
                c0315s.b0();
                if (c0315s.f4530S) {
                    c0315s.k(interfaceC2015a);
                } else {
                    c0315s.l0();
                }
                AbstractC0329z.y(c0315s, c2751h, e11);
                AbstractC0329z.y(c0315s, c2751h2, l12);
                if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p12))) {
                    AbstractC2107A.y(p12, c0315s, p12, c2751h3);
                }
                AbstractC0329z.y(c0315s, c2751h4, c17);
                dVar13 = dVar8;
                dVar13.invoke(c0315s, Integer.valueOf((i8 >> 6) & 14));
                z5 = true;
                c0315s.q(true);
            } else {
                dVar13 = dVar8;
                z5 = true;
            }
            c0315s.q(false);
            c0315s.q(z5);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new T(eVar, dVar11, dVar12, dVar3, dVar4, dVar5, dVar6, z3, f6, cVar, dVar7, dVar13, c2681e2, i, i5);
        }
    }

    public static final int c(int i, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f, long j5, float f5, C2681E c2681e) {
        int[] iArr = {i10, i6, i7, G4.d.G(f, i9, 0)};
        for (int i12 = 0; i12 < 4; i12++) {
            i8 = Math.max(i8, iArr[i12]);
        }
        float f6 = c2681e.f21475b * f5;
        return Math.max(W0.a.i(j5), Math.max(i, Math.max(i5, AbstractC2036a.U(G4.d.F(f6, Math.max(f6, i9 / 2.0f), f) + i8 + (c2681e.f21477d * f5)))) + i11);
    }

    public static final int d(int i, int i5, int i6, int i7, int i8, int i9, int i10, float f, long j5, float f5, C2681E c2681e) {
        int i11 = i6 + i7;
        int max = Math.max(i8 + i11, Math.max(i10 + i11, G4.d.G(f, i9, 0))) + i + i5;
        W0.m mVar = W0.m.f6016k;
        return Math.max(max, Math.max(AbstractC2036a.U((i9 + ((c2681e.b(mVar) + c2681e.a(mVar)) * f5)) * f), W0.a.j(j5)));
    }

    public static final int e(boolean z3, int i, int i5, x0.Z z5, x0.Z z6) {
        if (z3) {
            i5 = Math.round((1 + 0.0f) * ((i - z6.f20974l) / 2.0f));
        }
        float f = N.n.f3709b;
        return Math.max(i5, (z5 != null ? z5.f20974l : 0) / 2);
    }
}
