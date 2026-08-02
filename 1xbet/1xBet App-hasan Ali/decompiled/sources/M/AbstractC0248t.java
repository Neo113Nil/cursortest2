package M;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0322v0;
import P.C0326x0;
import P.InterfaceC0289e0;
import i4.InterfaceC2015a;
import u.AbstractC2462i;
import u.B0;
import u.C2451c;
import u.C2465l;
import v.C2526v;
import y.C2646b;
import y.C2648d;
import y.C2651g;
import y.C2654j;
import y.InterfaceC2653i;
import z.C2681E;

/* renamed from: M.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0248t {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3496a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2681E f3497b;

    static {
        float f = 8;
        f3496a = f;
        f3497b = androidx.compose.foundation.layout.b.a(f, 0.0f, 2);
        androidx.compose.foundation.layout.b.a(f, 0.0f, 2);
        androidx.compose.foundation.layout.b.a(f, 0.0f, 2);
    }

    public static final void a(InterfaceC2015a interfaceC2015a, X.d dVar, b0.p pVar, boolean z3, X.d dVar2, i0.J j5, C0238i c0238i, C0241l c0241l, C2526v c2526v, C0315s c0315s, int i) {
        InterfaceC2015a interfaceC2015a2;
        int i5;
        X.d dVar3;
        i0.J j6;
        C2526v c2526v2;
        int i6;
        C0241l c0241l2;
        K0.O o5;
        boolean z5;
        C0241l c0241l3;
        boolean z6 = true;
        c0315s.Z(313450168);
        if ((i & 6) == 0) {
            interfaceC2015a2 = interfaceC2015a;
            i5 = (c0315s.h(interfaceC2015a2) ? 4 : 2) | i;
        } else {
            interfaceC2015a2 = interfaceC2015a;
            i5 = i;
        }
        if ((i & 48) == 0) {
            dVar3 = dVar;
            i5 |= c0315s.h(dVar3) ? 32 : 16;
        } else {
            dVar3 = dVar;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(pVar) ? 256 : 128;
        }
        int i7 = i5 | 3072;
        if ((i & 24576) == 0) {
            i7 |= c0315s.h(dVar2) ? 16384 : 8192;
        }
        int i8 = i7 | 196608;
        if ((1572864 & i) == 0) {
            j6 = j5;
            i8 |= c0315s.f(j6) ? 1048576 : 524288;
        } else {
            j6 = j5;
        }
        if ((12582912 & i) == 0) {
            i8 |= c0315s.f(c0238i) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i8 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            c2526v2 = c2526v;
            i8 |= c0315s.f(c2526v2) ? 536870912 : 268435456;
        } else {
            c2526v2 = c2526v;
        }
        if ((306783379 & i8) == 306783378 && c0315s.B()) {
            c0315s.S();
            z5 = z3;
            c0241l3 = c0241l;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                float f = AbstractC0230a.f3282a;
                float f5 = O.a.f3800c;
                i6 = i8 & (-234881025);
                c0241l2 = new C0241l(f5, f5, f5, f5, O.a.f3799b, f5);
            } else {
                c0315s.S();
                c0241l2 = c0241l;
                i6 = i8 & (-234881025);
                z6 = z3;
            }
            c0315s.r();
            int i9 = O.a.f;
            v0 v0Var = (v0) c0315s.j(w0.f3580a);
            switch (AbstractC2462i.b(i9)) {
                case 0:
                    o5 = v0Var.f3572j;
                    break;
                case 1:
                    o5 = v0Var.f3573k;
                    break;
                case 2:
                    o5 = v0Var.f3574l;
                    break;
                case 3:
                    o5 = v0Var.f3565a;
                    break;
                case 4:
                    o5 = v0Var.f3566b;
                    break;
                case 5:
                    o5 = v0Var.f3567c;
                    break;
                case 6:
                    o5 = v0Var.f3568d;
                    break;
                case 7:
                    o5 = v0Var.f3569e;
                    break;
                case 8:
                    o5 = v0Var.f;
                    break;
                case 9:
                    o5 = v0Var.f3575m;
                    break;
                case 10:
                    o5 = v0Var.f3576n;
                    break;
                case 11:
                    o5 = v0Var.f3577o;
                    break;
                case 12:
                    o5 = v0Var.f3570g;
                    break;
                case 13:
                    o5 = v0Var.f3571h;
                    break;
                case 14:
                    o5 = v0Var.i;
                    break;
                default:
                    throw new D2.e();
            }
            long j7 = z6 ? c0238i.f3349b : c0238i.f;
            int i10 = i6 << 6;
            boolean z7 = z6;
            int i11 = (i10 & 1879048192) | ((i6 >> 6) & 14) | ((i6 << 3) & 112) | ((i6 >> 3) & 896) | (i10 & 7168) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024);
            int i12 = ((i6 >> 24) & 112) | 28032;
            b(pVar, interfaceC2015a2, z7, dVar3, o5, j7, dVar2, j6, c0238i, c0241l2, c2526v2, AbstractC0230a.f3282a, f3497b, c0315s, i11, i12);
            z5 = z7;
            c0241l3 = c0241l2;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0242m(interfaceC2015a, dVar, pVar, z5, dVar2, j5, c0238i, c0241l3, c2526v, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    public static final void b(b0.p pVar, InterfaceC2015a interfaceC2015a, boolean z3, X.d dVar, K0.O o5, long j5, X.d dVar2, i0.J j6, C0238i c0238i, C0241l c0241l, C2526v c2526v, float f, C2681E c2681e, C0315s c0315s, int i, int i5) {
        int i6;
        int i7;
        InterfaceC0289e0 interfaceC0289e0;
        C2654j c2654j;
        C2451c c2451c;
        int i8;
        boolean z5;
        C2465l c2465l;
        ?? r9;
        c0315s.Z(1400504719);
        if ((i & 6) == 0) {
            i6 = (c0315s.f(pVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i & 48) == 0) {
            i6 |= c0315s.h(interfaceC2015a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= c0315s.g(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= c0315s.h(dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= c0315s.f(o5) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i6 |= c0315s.e(j5) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i6 |= c0315s.h(dVar2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= c0315s.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= c0315s.f(j6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= c0315s.f(c0238i) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (c0315s.f(c0241l) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0315s.f(c2526v) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= c0315s.c(f) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c0315s.f(c2681e) ? 2048 : 1024;
        }
        int i9 = i6;
        if ((i5 & 24576) == 0) {
            i7 |= c0315s.f(null) ? 16384 : 8192;
        }
        int i10 = i7;
        if ((i9 & 306783379) == 306783378 && (i10 & 9363) == 9362 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.X(1985614987);
            Object obj = C0302l.f4480a;
            Object M5 = c0315s.M();
            if (M5 == obj) {
                M5 = new C2654j();
                c0315s.i0(M5);
            }
            C2654j c2654j2 = (C2654j) M5;
            c0315s.q(false);
            b0.p a5 = H0.k.a(pVar, false, C0237h.f3340n);
            long j7 = z3 ? c0238i.f3348a : c0238i.f3352e;
            c0315s.X(1985624506);
            if (c0241l == null) {
                c2654j = c2654j2;
                i8 = i9;
                c2465l = null;
                r9 = 0;
            } else {
                int i11 = ((i9 >> 6) & 14) | ((i10 << 6) & 896);
                Object M6 = c0315s.M();
                if (M6 == obj) {
                    M6 = new Z.p();
                    c0315s.i0(M6);
                }
                Z.p pVar2 = (Z.p) M6;
                Object M7 = c0315s.M();
                if (M7 == obj) {
                    M7 = AbstractC0329z.t(null);
                    c0315s.i0(M7);
                }
                InterfaceC0289e0 interfaceC0289e02 = (InterfaceC0289e0) M7;
                boolean f5 = c0315s.f(c2654j2);
                Object M8 = c0315s.M();
                if (f5 || M8 == obj) {
                    interfaceC0289e0 = interfaceC0289e02;
                    M8 = new C0239j(c2654j2, pVar2, null);
                    c0315s.i0(M8);
                } else {
                    interfaceC0289e0 = interfaceC0289e02;
                }
                AbstractC0329z.e(c0315s, (i4.e) M8, c2654j2);
                InterfaceC2653i interfaceC2653i = (InterfaceC2653i) X3.m.f0(pVar2);
                float f6 = !z3 ? c0241l.f : interfaceC2653i instanceof y.l ? c0241l.f3378b : interfaceC2653i instanceof C2651g ? c0241l.f3380d : interfaceC2653i instanceof C2648d ? c0241l.f3379c : interfaceC2653i instanceof C2646b ? c0241l.f3381e : c0241l.f3377a;
                Object M9 = c0315s.M();
                if (M9 == obj) {
                    c2654j = c2654j2;
                    M9 = new C2451c(new W0.f(f6), B0.f19647c, null, 12);
                    c0315s.i0(M9);
                } else {
                    c2654j = c2654j2;
                }
                C2451c c2451c2 = (C2451c) M9;
                W0.f fVar = new W0.f(f6);
                boolean h3 = c0315s.h(c2451c2) | c0315s.c(f6) | ((((i11 & 14) ^ 6) > 4 && c0315s.g(z3)) || (i11 & 6) == 4) | c0315s.h(interfaceC2653i);
                Object M10 = c0315s.M();
                if (h3 || M10 == obj) {
                    c2451c = c2451c2;
                    i8 = i9;
                    z5 = false;
                    C0240k c0240k = new C0240k(c2451c, f6, z3, interfaceC2653i, interfaceC0289e0, null);
                    c0315s.i0(c0240k);
                    M10 = c0240k;
                } else {
                    c2451c = c2451c2;
                    i8 = i9;
                    z5 = false;
                }
                AbstractC0329z.e(c0315s, (i4.e) M10, fVar);
                c2465l = c2451c.f19762c;
                r9 = z5;
            }
            c0315s.q(r9);
            p0.b(interfaceC2015a, a5, z3, j6, j7, 0L, c2465l != null ? ((W0.f) c2465l.f19846l.getValue()).f6006k : (float) r9, c2526v, c2654j, X.e.d(-1985962652, new C0243n(dVar, o5, j5, dVar2, c0238i, z3, f, c2681e), c0315s), c0315s, ((i8 >> 15) & 7168) | ((i8 >> 3) & 14) | (i8 & 896) | ((i10 << 21) & 234881024), 96);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0244o(pVar, interfaceC2015a, z3, dVar, o5, j5, dVar2, j6, c0238i, c0241l, c2526v, f, c2681e, i, i5);
        }
    }

    public static final void c(X.d dVar, K0.O o5, long j5, X.d dVar2, long j6, long j7, float f, C2681E c2681e, C0315s c0315s, int i) {
        X.d dVar3;
        int i5;
        X.d dVar4;
        long j8;
        long j9;
        c0315s.Z(-782878228);
        if ((i & 6) == 0) {
            dVar3 = dVar;
            i5 = (c0315s.h(dVar3) ? 4 : 2) | i;
        } else {
            dVar3 = dVar;
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.f(o5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.e(j5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            dVar4 = dVar2;
            i5 |= c0315s.h(dVar4) ? 2048 : 1024;
        } else {
            dVar4 = dVar2;
        }
        if ((i & 24576) == 0) {
            i5 |= c0315s.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= c0315s.h(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            j8 = j6;
            i5 |= c0315s.e(j8) ? 1048576 : 524288;
        } else {
            j8 = j6;
        }
        if ((12582912 & i) == 0) {
            j9 = j7;
            i5 |= c0315s.e(j9) ? 8388608 : 4194304;
        } else {
            j9 = j7;
        }
        if ((100663296 & i) == 0) {
            i5 |= c0315s.c(f) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= c0315s.f(c2681e) ? 536870912 : 268435456;
        }
        if ((i5 & 306783379) == 306783378 && c0315s.B()) {
            c0315s.S();
        } else {
            AbstractC0329z.b(new C0322v0[]{AbstractC0253y.f3582a.a(new i0.p(j5)), u0.f3551a.a(o5)}, X.e.d(1748799148, new r(f, c2681e, dVar4, j8, dVar3, j9), c0315s), c0315s, 56);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0247s(dVar, o5, j5, dVar2, j6, j7, f, c2681e, i);
        }
    }
}
