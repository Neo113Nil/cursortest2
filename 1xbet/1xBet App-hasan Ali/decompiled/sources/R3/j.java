package R3;

import M.AbstractC0230a;
import M.AbstractC0248t;
import M.AbstractC0251w;
import M.C0238i;
import M.C0249u;
import M.G;
import M.p0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import P.e1;
import a.AbstractC0444a;
import i0.y;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import v.AbstractC2527w;
import v.C2526v;
import x0.O;
import z.AbstractC2710l;
import z.C2696U;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final D.d f5218a;

    /* renamed from: b, reason: collision with root package name */
    public static final D.d f5219b;

    /* renamed from: c, reason: collision with root package name */
    public static final D.d f5220c;

    static {
        int i = V3.a.f5971L;
        float f = 28;
        float f5 = 10;
        D.d dVar = D.e.f920a;
        f5218a = new D.d(new D.b(f), new D.b(f5), new D.b(f), new D.b(f5));
        float f6 = 18;
        float f7 = 8;
        f5219b = new D.d(new D.b(f6), new D.b(f7), new D.b(f6), new D.b(f7));
        f5220c = D.e.a(12);
    }

    public static final y a() {
        return new y(X3.n.O(new i0.p(V3.a.f5972a), new i0.p(V3.a.f5973b), new i0.p(V3.a.f5974c)), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(Float.POSITIVE_INFINITY)));
    }

    public static final void b(final C2201e c2201e, b0.p pVar, final long j5, final int i, C0315s c0315s, final int i5) {
        int i6;
        c0315s.Z(2067874568);
        if ((i5 & 6) == 0) {
            i6 = (c0315s.f(c2201e) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        int i7 = i6 | 48;
        if ((i5 & 384) == 0) {
            i7 |= c0315s.e(j5) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c0315s.d(i) ? 2048 : 1024;
        }
        if ((i7 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
        } else {
            pVar = b0.m.f7161k;
            G.a(c2201e, null, androidx.compose.foundation.layout.c.f(pVar, i), j5, c0315s, (i7 & 14) | 48 | ((i7 << 3) & 7168), 0);
        }
        final b0.p pVar2 = pVar;
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e() { // from class: R3.c
                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(i5 | 1);
                    C2201e c2201e2 = C2201e.this;
                    long j6 = j5;
                    int i8 = i;
                    j.b(c2201e2, pVar2, j6, i8, (C0315s) obj, B5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, b0.m mVar, final long j5, long j6, C0315s c0315s, final int i, final int i5) {
        int i6;
        long j7;
        final b0.m mVar2;
        final long j8;
        C0326x0 s2;
        kotlin.jvm.internal.l.f("text", str);
        c0315s.Z(1616172573);
        if ((i & 6) == 0) {
            i6 = (c0315s.f(str) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        int i7 = i6 | 48;
        if ((i & 384) == 0) {
            i7 |= c0315s.e(j5) ? 256 : 128;
        }
        int i8 = i5 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i & 3072) == 0) {
            j7 = j6;
            i7 |= c0315s.e(j7) ? 2048 : 1024;
            if ((i7 & 1171) == 1170 || !c0315s.B()) {
                b0.m mVar3 = b0.m.f7161k;
                if (i8 != 0) {
                    j7 = V3.a.f5981l;
                }
                long j9 = j7;
                p0.a(mVar3, f5220c, j5, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.3f, V3.a.f5993x)), X.e.d(1787333154, new f(str, androidx.compose.foundation.layout.b.g(mVar3, 8, 3), j9), c0315s), c0315s, ((i7 >> 3) & 14) | 14155824 | (i7 & 896), 56);
                mVar2 = mVar3;
                j8 = j9;
            } else {
                c0315s.S();
                mVar2 = mVar;
                j8 = j7;
            }
            s2 = c0315s.s();
            if (s2 == null) {
                s2.f4578d = new i4.e() { // from class: R3.d
                    @Override // i4.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int B5 = AbstractC0329z.B(i | 1);
                        long j10 = j8;
                        j.c(str, mVar2, j5, j10, (C0315s) obj, B5, i5);
                        return W3.o.f6046a;
                    }
                };
                return;
            }
            return;
        }
        j7 = j6;
        if ((i7 & 1171) == 1170) {
        }
        b0.m mVar32 = b0.m.f7161k;
        if (i8 != 0) {
        }
        long j92 = j7;
        p0.a(mVar32, f5220c, j5, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.3f, V3.a.f5993x)), X.e.d(1787333154, new f(str, androidx.compose.foundation.layout.b.g(mVar32, 8, 3), j92), c0315s), c0315s, ((i7 >> 3) & 14) | 14155824 | (i7 & 896), 56);
        mVar2 = mVar32;
        j8 = j92;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    public static final void d(b0.p pVar, X.d dVar, C0315s c0315s, int i) {
        b0.p pVar2;
        C0315s c0315s2 = c0315s;
        int i5 = 2;
        c0315s2.Z(-1252553840);
        if (((i | 6) & 19) == 18 && c0315s2.B()) {
            c0315s2.S();
            pVar2 = pVar;
        } else {
            pVar2 = b0.m.f7161k;
            y yVar = new y(X3.n.O(new i0.p(i0.p.b(0.09f, V3.a.f5963B)), new i0.p(i0.p.b(0.05f, V3.a.f5972a)), new i0.p(V3.a.f5964C)), 0L, 9187343241974906880L);
            b0.p a5 = b0.a.a(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f6868c, a()), new C2696U(3));
            O e3 = AbstractC2710l.e(b0.c.f7137k, false);
            int p5 = AbstractC0329z.p(c0315s2);
            InterfaceC0314r0 l5 = c0315s2.l();
            b0.p c5 = b0.a.c(c0315s2, a5);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s2.b0();
            if (c0315s2.f4530S) {
                c0315s2.k(c2768z);
            } else {
                c0315s2.l0();
            }
            AbstractC0329z.y(c0315s2, C2752i.f21833e, e3);
            AbstractC0329z.y(c0315s2, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s2, p5, c2751h);
            }
            AbstractC0329z.y(c0315s2, C2752i.f21831c, c5);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f6865a;
            AbstractC2710l.a(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.b(pVar2, 1.0f), 9999, 200), yVar), c0315s2, 0);
            G.a(G4.d.x(), null, N4.b.h(AbstractC2036a.S(androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.b.d(aVar.a(b0.c.f7139m), 42, 54), 176), 18.0f), 0.055f), V3.a.f5975d, c0315s2, 3120, 0);
            c0315s2 = c0315s;
            G.a(AbstractC0444a.O(), null, N4.b.h(AbstractC2036a.S(androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.b.d(aVar.a(b0.c.f7143q), -36, -24), 150), -16.0f), 0.04f), V3.a.f5993x, c0315s2, 3120, 0);
            dVar.invoke(c0315s2, 6);
            c0315s2.q(true);
        }
        C0326x0 s2 = c0315s2.s();
        if (s2 != null) {
            s2.f4578d = new O3.o(i, i5, pVar2, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, b0.p pVar, final String str2, final String str3, final C2201e c2201e, final int i, C0315s c0315s, final int i5, final int i6) {
        int i7;
        b0.p pVar2;
        String str4;
        final b0.p pVar3;
        C0326x0 s2;
        kotlin.jvm.internal.l.f("ti_par_tle", str);
        c0315s.Z(98446626);
        if ((i5 & 6) == 0) {
            i7 = (c0315s.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i8 = i6 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            pVar2 = pVar;
            i7 |= c0315s.f(pVar2) ? 32 : 16;
            if ((i5 & 384) == 0) {
                i7 |= c0315s.f(str2) ? 256 : 128;
            }
            if ((i5 & 3072) != 0) {
                str4 = str3;
                i7 |= c0315s.f(str4) ? 2048 : 1024;
            } else {
                str4 = str3;
            }
            if (((i7 | (!c0315s.f(c2201e) ? 16384 : 8192)) & 74899) == 74898 || !c0315s.B()) {
                b0.p pVar4 = i8 == 0 ? b0.m.f7161k : pVar2;
                e1 e1Var = AbstractC0251w.f3578a;
                p0.a(androidx.compose.foundation.layout.c.b(pVar4, 1.0f), f5218a, ((C0249u) c0315s.j(e1Var)).f3540p, 4, 12, AbstractC2527w.a(1, i0.p.b(0.5f, V3.a.f5995z)), X.e.d(-631191065, new i(str4, c2201e, i, str, ((C0249u) c0315s.j(e1Var)).f3539o, str2, ((C0249u) c0315s.j(e1Var)).f3543s), c0315s), c0315s, 14377008, 8);
                pVar3 = pVar4;
            } else {
                c0315s.S();
                pVar3 = pVar2;
            }
            s2 = c0315s.s();
            if (s2 == null) {
                s2.f4578d = new i4.e() { // from class: R3.e
                    @Override // i4.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int B5 = AbstractC0329z.B(i5 | 1);
                        int i9 = i;
                        j.e(str, pVar3, str2, str3, c2201e, i9, (C0315s) obj, B5, i6);
                        return W3.o.f6046a;
                    }
                };
                return;
            }
            return;
        }
        pVar2 = pVar;
        if ((i5 & 384) == 0) {
        }
        if ((i5 & 3072) != 0) {
        }
        if (((i7 | (!c0315s.f(c2201e) ? 16384 : 8192)) & 74899) == 74898) {
        }
        if (i8 == 0) {
        }
        e1 e1Var2 = AbstractC0251w.f3578a;
        p0.a(androidx.compose.foundation.layout.c.b(pVar4, 1.0f), f5218a, ((C0249u) c0315s.j(e1Var2)).f3540p, 4, 12, AbstractC2527w.a(1, i0.p.b(0.5f, V3.a.f5995z)), X.e.d(-631191065, new i(str4, c2201e, i, str, ((C0249u) c0315s.j(e1Var2)).f3539o, str2, ((C0249u) c0315s.j(e1Var2)).f3543s), c0315s), c0315s, 14377008, 8);
        pVar3 = pVar4;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    public static final void f(b0.p pVar, C0315s c0315s, final int i, final int i5) {
        b0.p pVar2;
        int i6;
        final b0.p pVar3;
        c0315s.Z(1674612843);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i | 6;
            pVar2 = pVar;
        } else if ((i & 6) == 0) {
            pVar2 = pVar;
            i6 = (c0315s.f(pVar2) ? 4 : 2) | i;
        } else {
            pVar2 = pVar;
            i6 = i;
        }
        if ((i6 & 3) == 2 && c0315s.B()) {
            c0315s.S();
            pVar3 = pVar2;
        } else {
            pVar3 = i7 != 0 ? b0.m.f7161k : pVar2;
            b0.p g5 = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.b(pVar3, 1.0f), 9999, 1);
            long j5 = V3.a.f5964C;
            AbstractC2710l.a(androidx.compose.foundation.a.a(g5, new y(X3.n.O(new i0.p(j5), new i0.p(i0.p.b(0.5f, V3.a.f5975d)), new i0.p(j5)), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), c0315s, 0);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e() { // from class: R3.b
                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(i | 1);
                    j.f(b0.p.this, (C0315s) obj, B5, i5);
                    return W3.o.f6046a;
                }
            };
        }
    }

    public static final void g(final String str, b0.p pVar, final long j5, final long j6, C2201e c2201e, C0315s c0315s, final int i, final int i5) {
        int i6;
        b0.p pVar2;
        int i7;
        C2201e c2201e2;
        int i8;
        long j7;
        long j8;
        long j9;
        int i9;
        long j10;
        final C2201e c2201e3;
        final b0.p pVar3;
        int i10 = 1;
        kotlin.jvm.internal.l.f("la_par_bel", str);
        c0315s.Z(1986399604);
        if ((i & 6) == 0) {
            i6 = i | (c0315s.f(str) ? 4 : 2);
        } else {
            i6 = i;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 = i6 | 48;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            i7 = i6 | (c0315s.f(pVar2) ? 32 : 16);
        }
        int i12 = i5 & 16;
        if (i12 != 0) {
            i8 = i7 | 24576;
            c2201e2 = c2201e;
        } else {
            c2201e2 = c2201e;
            i8 = i7 | (c0315s.f(c2201e2) ? 16384 : 8192);
        }
        if ((i8 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
            pVar3 = pVar2;
            c2201e3 = c2201e2;
        } else {
            b0.p pVar4 = i11 != 0 ? b0.m.f7161k : pVar2;
            C2201e c2201e4 = i12 != 0 ? null : c2201e2;
            X.d d5 = X.e.d(-314082758, new P.r(i10, str), c0315s);
            c0315s.X(-643062999);
            X.d d6 = c2201e4 != null ? X.e.d(-170848546, new h(c2201e4, i10), c0315s) : null;
            c0315s.q(false);
            float f = AbstractC0230a.f3282a;
            long j11 = i0.p.f17293g;
            C0249u c0249u = (C0249u) c0315s.j(AbstractC0251w.f3578a);
            C0238i c0238i = c0249u.f3524M;
            if (c0238i == null) {
                long j12 = i0.p.f;
                long c5 = AbstractC0251w.c(c0249u, O.a.f3802e);
                int i13 = O.a.f3804h;
                long c6 = AbstractC0251w.c(c0249u, i13);
                long c7 = AbstractC0251w.c(c0249u, i13);
                j7 = j11;
                long b3 = i0.p.b(0.38f, AbstractC0251w.c(c0249u, 18));
                int i14 = O.a.f3803g;
                long c8 = AbstractC0251w.c(c0249u, i14);
                float f5 = O.a.f3801d;
                C0238i c0238i2 = new C0238i(j12, c5, c6, c7, j12, b3, i0.p.b(f5, c8), i0.p.b(f5, AbstractC0251w.c(c0249u, i14)));
                c0249u.f3524M = c0238i2;
                c0238i = c0238i2;
            } else {
                j7 = j11;
            }
            long j13 = j5 != 16 ? j5 : c0238i.f3348a;
            if (j6 != 16) {
                j8 = 16;
                j9 = j6;
            } else {
                j8 = 16;
                j9 = c0238i.f3349b;
            }
            long j14 = j6 != 16 ? j6 : c0238i.f3350c;
            if (j7 != j8) {
                i9 = i8;
                j10 = j7;
            } else {
                i9 = i8;
                j10 = c0238i.f3351d;
            }
            C0238i c0238i3 = new C0238i(j13, j9, j14, j10, j7 != j8 ? j7 : c0238i.f3352e, j7 != j8 ? j7 : c0238i.f, j7 != j8 ? j7 : c0238i.f3353g, j7 != j8 ? j7 : c0238i.f3354h);
            C2526v a5 = AbstractC2527w.a(1, i0.p.b(0.5f, V3.a.f5995z));
            c0315s.X(-643049128);
            Object M5 = c0315s.M();
            if (M5 == C0302l.f4480a) {
                M5 = new B1.h(5);
                c0315s.i0(M5);
            }
            c0315s.q(false);
            b0.p pVar5 = pVar4;
            AbstractC0248t.a((InterfaceC2015a) M5, d5, pVar5, false, d6, f5220c, c0238i3, null, a5, c0315s, ((i9 << 3) & 896) | 806879286);
            c2201e3 = c2201e4;
            pVar3 = pVar5;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new i4.e() { // from class: R3.a
                @Override // i4.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int B5 = AbstractC0329z.B(i | 1);
                    C2201e c2201e5 = c2201e3;
                    j.g(str, pVar3, j5, j6, c2201e5, (C0315s) obj, B5, i5);
                    return W3.o.f6046a;
                }
            };
        }
    }
}
