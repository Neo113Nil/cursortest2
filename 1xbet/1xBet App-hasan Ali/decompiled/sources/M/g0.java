package M;

import E.C0087a;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import P.InterfaceC0314r0;
import P.e1;
import a.AbstractC0444a;
import androidx.compose.material3.MinimumInteractiveModifier;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import u.B0;
import u.C2451c;
import u.C2465l;
import y.C2648d;
import y.C2651g;
import y.C2654j;
import y.InterfaceC2653i;
import z.AbstractC2710l;
import z.C2681E;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final L.h f3338a = new L.h(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Removed duplicated region for block: B:138:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(InterfaceC2015a interfaceC2015a, b0.p pVar, boolean z3, i0.J j5, C0231b c0231b, C0236g c0236g, C2681E c2681e, X.d dVar, C0315s c0315s, int i, int i5) {
        int i6;
        boolean z5;
        C0236g c0236g2;
        int i7;
        C2681E c2681e2;
        C0236g c0236g3;
        C2681E c2681e3;
        Object obj;
        Object M5;
        C2681E c2681e4;
        C2654j c2654j;
        int i8;
        C0236g c0236g4;
        boolean z6;
        C2465l c2465l;
        C2681E c2681e5;
        boolean z7;
        C0236g c0236g5;
        C0326x0 s2;
        int i9;
        c0315s.Z(650121315);
        if ((i & 6) == 0) {
            i6 = (c0315s.h(interfaceC2015a) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            i6 |= c0315s.f(pVar) ? 32 : 16;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i & 384) == 0) {
            z5 = z3;
            i6 |= c0315s.g(z5) ? 256 : 128;
            if ((i & 3072) == 0) {
                i6 |= c0315s.f(j5) ? 2048 : 1024;
            }
            boolean z8 = true;
            if ((i & 24576) == 0) {
                i6 |= c0315s.f(c0231b) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i5 & 32) == 0) {
                    c0236g2 = c0236g;
                    if (c0315s.f(c0236g2)) {
                        i9 = 131072;
                        i6 |= i9;
                    }
                } else {
                    c0236g2 = c0236g;
                }
                i9 = 65536;
                i6 |= i9;
            } else {
                c0236g2 = c0236g;
            }
            if ((i5 & 64) == 0) {
                i6 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i6 |= c0315s.f(null) ? 1048576 : 524288;
            }
            i7 = 128 & i5;
            if (i7 == 0) {
                i6 |= 12582912;
                c2681e2 = c2681e;
            } else {
                c2681e2 = c2681e;
                if ((i & 12582912) == 0) {
                    i6 |= c0315s.f(c2681e2) ? 8388608 : 4194304;
                }
            }
            if ((i5 & 256) == 0) {
                i6 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i6 |= c0315s.f(null) ? 67108864 : 33554432;
            }
            if ((805306368 & i) == 0) {
                i6 |= c0315s.h(dVar) ? 536870912 : 268435456;
            }
            if ((306783379 & i6) == 306783378 || !c0315s.B()) {
                c0315s.U();
                if ((i & 1) != 0 || c0315s.z()) {
                    if (i10 != 0) {
                        z5 = true;
                    }
                    if ((i5 & 32) == 0) {
                        C2681E c2681e6 = AbstractC0232c.f3301a;
                        c0236g3 = new C0236g(O.e.f3858a, O.e.f3864h, O.e.f3862e, O.e.f, O.e.f3860c);
                        i6 &= -458753;
                    } else {
                        c0236g3 = c0236g2;
                    }
                    if (i7 != 0) {
                        c2681e2 = AbstractC0232c.f3301a;
                    }
                    c2681e3 = c2681e2;
                    c0236g2 = c0236g3;
                } else {
                    c0315s.S();
                    if ((i5 & 32) != 0) {
                        i6 &= -458753;
                    }
                    c2681e3 = c2681e2;
                }
                c0315s.r();
                c0315s.X(-239156623);
                obj = C0302l.f4480a;
                M5 = c0315s.M();
                if (M5 == obj) {
                    M5 = new C2654j();
                    c0315s.i0(M5);
                }
                C2654j c2654j2 = (C2654j) M5;
                c0315s.q(false);
                long j6 = !z5 ? c0231b.f3291a : c0231b.f3293c;
                long j7 = !z5 ? c0231b.f3292b : c0231b.f3294d;
                c0315s.X(-239150048);
                if (c0236g2 != null) {
                    c0236g4 = c0236g2;
                    c2681e4 = c2681e3;
                    c2654j = c2654j2;
                    i8 = i6;
                    z6 = z5;
                    c2465l = null;
                } else {
                    int i11 = ((i6 >> 9) & 896) | ((i6 >> 6) & 14);
                    Object M6 = c0315s.M();
                    if (M6 == obj) {
                        M6 = new Z.p();
                        c0315s.i0(M6);
                    }
                    Z.p pVar2 = (Z.p) M6;
                    boolean f = c0315s.f(c2654j2);
                    Object M7 = c0315s.M();
                    if (f || M7 == obj) {
                        M7 = new C0234e(c2654j2, pVar2, null);
                        c0315s.i0(M7);
                    }
                    AbstractC0329z.e(c0315s, (i4.e) M7, c2654j2);
                    InterfaceC2653i interfaceC2653i = (InterfaceC2653i) X3.m.f0(pVar2);
                    float f5 = !z5 ? c0236g2.f3337e : interfaceC2653i instanceof y.l ? c0236g2.f3334b : interfaceC2653i instanceof C2651g ? c0236g2.f3336d : interfaceC2653i instanceof C2648d ? c0236g2.f3335c : c0236g2.f3333a;
                    Object M8 = c0315s.M();
                    if (M8 == obj) {
                        c2654j = c2654j2;
                        i8 = i6;
                        c2681e4 = c2681e3;
                        M8 = new C2451c(new W0.f(f5), B0.f19647c, null, 12);
                        c0315s.i0(M8);
                    } else {
                        c2681e4 = c2681e3;
                        c2654j = c2654j2;
                        i8 = i6;
                    }
                    C2451c c2451c = (C2451c) M8;
                    W0.f fVar = new W0.f(f5);
                    boolean h3 = c0315s.h(c2451c) | c0315s.c(f5) | ((((i11 & 14) ^ 6) > 4 && c0315s.g(z5)) || (i11 & 6) == 4);
                    if ((((i11 & 896) ^ 384) <= 256 || !c0315s.f(c0236g2)) && (i11 & 384) != 256) {
                        z8 = false;
                    }
                    boolean h4 = h3 | z8 | c0315s.h(interfaceC2653i);
                    Object M9 = c0315s.M();
                    if (h4 || M9 == obj) {
                        c0236g4 = c0236g2;
                        z6 = z5;
                        M9 = new C0235f(c2451c, f5, z6, c0236g4, interfaceC2653i, null);
                        c0315s.i0(M9);
                    } else {
                        c0236g4 = c0236g2;
                        z6 = z5;
                    }
                    AbstractC0329z.e(c0315s, (i4.e) M9, fVar);
                    c2465l = c2451c.f19762c;
                }
                c0315s.q(false);
                C2681E c2681e7 = c2681e4;
                int i12 = i8;
                p0.b(interfaceC2015a, H0.k.a(pVar, false, C0237h.f3339m), z6, j5, j6, j7, c2465l == null ? ((W0.f) c2465l.f19846l.getValue()).f6006k : 0, null, c2654j, X.e.d(956488494, new C0087a(j7, c2681e7, dVar), c0315s), c0315s, (i12 & 8078) | (234881024 & (i12 << 6)), 64);
                c2681e5 = c2681e7;
                z7 = z6;
                c0236g5 = c0236g4;
            } else {
                c0315s.S();
                c0236g5 = c0236g2;
                c2681e5 = c2681e2;
                z7 = z5;
            }
            s2 = c0315s.s();
            if (s2 == null) {
                s2.f4578d = new A.o(interfaceC2015a, pVar, z7, j5, c0231b, c0236g5, c2681e5, dVar, i, i5);
                return;
            }
            return;
        }
        z5 = z3;
        if ((i & 3072) == 0) {
        }
        boolean z82 = true;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((i5 & 64) == 0) {
        }
        i7 = 128 & i5;
        if (i7 == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if ((306783379 & i6) == 306783378) {
        }
        c0315s.U();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i5 & 32) == 0) {
        }
        if (i7 != 0) {
        }
        c2681e3 = c2681e2;
        c0236g2 = c0236g3;
        c0315s.r();
        c0315s.X(-239156623);
        obj = C0302l.f4480a;
        M5 = c0315s.M();
        if (M5 == obj) {
        }
        C2654j c2654j22 = (C2654j) M5;
        c0315s.q(false);
        long j62 = !z5 ? c0231b.f3291a : c0231b.f3293c;
        if (!z5) {
        }
        c0315s.X(-239150048);
        if (c0236g2 != null) {
        }
        c0315s.q(false);
        C2681E c2681e72 = c2681e4;
        int i122 = i8;
        p0.b(interfaceC2015a, H0.k.a(pVar, false, C0237h.f3339m), z6, j5, j62, j7, c2465l == null ? ((W0.f) c2465l.f19846l.getValue()).f6006k : 0, null, c2654j, X.e.d(956488494, new C0087a(j7, c2681e72, dVar), c0315s), c0315s, (i122 & 8078) | (234881024 & (i122 << 6)), 64);
        c2681e5 = c2681e72;
        z7 = z6;
        c0236g5 = c0236g4;
        s2 = c0315s.s();
        if (s2 == null) {
        }
    }

    public static final void b(InterfaceC2015a interfaceC2015a, b0.p pVar, boolean z3, i0.J j5, C0231b c0231b, C0236g c0236g, C2681E c2681e, C0315s c0315s, int i) {
        C2681E c2681e2;
        C0236g c0236g2;
        boolean z5;
        int i5;
        boolean z6;
        C0236g c0236g3;
        C2681E c2681e3;
        X.d dVar = S3.f0.f5485a;
        c0315s.Z(-1717924381);
        int i6 = i | (c0315s.h(interfaceC2015a) ? 4 : 2) | 384 | (c0315s.f(c0231b) ? 16384 : 8192) | 114884608;
        if ((306783379 & i6) == 306783378 && c0315s.B()) {
            c0315s.S();
            z6 = z3;
            c0236g3 = c0236g;
            c2681e3 = c2681e;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                C2681E c2681e4 = AbstractC0232c.f3301a;
                C0236g c0236g4 = new C0236g(O.f.f3865a, O.f.f3870g, O.f.f3868d, O.f.f3869e, 0);
                c2681e2 = AbstractC0232c.f3301a;
                c0236g2 = c0236g4;
                z5 = true;
                i5 = i6 & (-458753);
            } else {
                c0315s.S();
                i5 = i6 & (-458753);
                z5 = z3;
                c0236g2 = c0236g;
                c2681e2 = c2681e;
            }
            c0315s.r();
            a(interfaceC2015a, pVar, z5, j5, c0231b, c0236g2, c2681e2, dVar, c0315s, i5 & 2147483646, 0);
            z6 = z5;
            c0236g3 = c0236g2;
            c2681e3 = c2681e2;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new A.q(interfaceC2015a, pVar, z6, j5, c0231b, c0236g3, c2681e3, i);
        }
    }

    public static final void c(InterfaceC2015a interfaceC2015a, b0.p pVar, boolean z3, C c5, X.d dVar, C0315s c0315s, int i, int i5) {
        boolean z5;
        int i6;
        float f;
        long j5;
        boolean z6;
        b0.p pVar2;
        C c6;
        X.d dVar2;
        b0.p pVar3;
        C c7;
        c0315s.Z(-1142896114);
        int i7 = i | (c0315s.h(interfaceC2015a) ? 4 : 2);
        int i8 = i7 | 48;
        int i9 = i5 & 4;
        if (i9 != 0) {
            i6 = i7 | 432;
            z5 = z3;
        } else {
            z5 = z3;
            i6 = i8 | (c0315s.g(z5) ? 256 : 128);
        }
        if (((i6 | 25600) & 74899) == 74898 && c0315s.B()) {
            c0315s.S();
            pVar3 = pVar;
            c7 = c5;
            dVar2 = dVar;
            z6 = z5;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                b0.m mVar = b0.m.f7161k;
                if (i9 != 0) {
                    z5 = true;
                }
                c0315s.X(-1519621781);
                long j6 = ((i0.p) c0315s.j(AbstractC0253y.f3582a)).f17295a;
                C0249u c0249u = (C0249u) c0315s.j(AbstractC0251w.f3578a);
                C c8 = c0249u.f3525N;
                if (c8 == null) {
                    long j7 = i0.p.f;
                    long b3 = i0.p.b(0.38f, j6);
                    f = 0.38f;
                    c8 = new C(j7, j6, j7, b3);
                    j5 = j6;
                    c0249u.f3525N = c8;
                } else {
                    f = 0.38f;
                    j5 = j6;
                }
                long j8 = c8.f3136b;
                if (i0.p.c(j8, j5)) {
                    c0315s.q(false);
                } else {
                    long b5 = i0.p.b(f, j5);
                    long j9 = j5 != 16 ? j5 : j8;
                    if (b5 == 16) {
                        b5 = c8.f3138d;
                    }
                    C c9 = new C(c8.f3135a, j9, c8.f3137c, b5);
                    c0315s.q(false);
                    c8 = c9;
                }
                z6 = z5;
                pVar2 = mVar;
                c6 = c8;
            } else {
                c0315s.S();
                c6 = c5;
                z6 = z5;
                pVar2 = pVar;
            }
            c0315s.r();
            e1 e1Var = H.f3157a;
            b0.p c10 = pVar2.c(MinimumInteractiveModifier.f6903k);
            float f5 = O.g.f3872b;
            b0.p c11 = androidx.compose.foundation.a.c(androidx.compose.foundation.a.b(AbstractC0444a.n(androidx.compose.foundation.layout.c.f(c10, f5), l0.a(5, c0315s)), z6 ? c6.f3135a : c6.f3137c, i0.F.f17222a), null, h0.a(f5 / 2, c0315s, 54, 4), z6, new H0.g(0), interfaceC2015a, 8);
            x0.O e3 = AbstractC2710l.e(b0.c.f7141o, false);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c12 = b0.a.c(c0315s, c11);
            InterfaceC2753j.f21834j.getClass();
            C2768z c2768z = C2752i.f21830b;
            c0315s.b0();
            if (c0315s.f4530S) {
                c0315s.k(c2768z);
            } else {
                c0315s.l0();
            }
            AbstractC0329z.y(c0315s, C2752i.f21833e, e3);
            AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
            C2751h c2751h = C2752i.f;
            if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                AbstractC2107A.y(p5, c0315s, p5, c2751h);
            }
            AbstractC0329z.y(c0315s, C2752i.f21831c, c12);
            dVar2 = dVar;
            AbstractC0329z.a(AbstractC0253y.f3582a.a(new i0.p(z6 ? c6.f3136b : c6.f3138d)), dVar2, c0315s, 56);
            c0315s.q(true);
            pVar3 = pVar2;
            c7 = c6;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new D(interfaceC2015a, pVar3, z6, c7, dVar2, i, i5);
        }
    }
}
