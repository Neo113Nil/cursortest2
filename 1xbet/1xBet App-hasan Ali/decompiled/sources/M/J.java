package M;

import A0.C0022e0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0322v0;
import P.C0326x0;

/* loaded from: classes.dex */
public abstract class J {
    static {
        new P.Y(C0250v.f3557r);
    }

    public static final void a(C0249u c0249u, k0 k0Var, v0 v0Var, X.d dVar, C0315s c0315s, int i) {
        int i5;
        k0 k0Var2;
        char c5;
        char c6;
        k0 k0Var3;
        c0315s.Z(-2127166334);
        if ((i & 6) == 0) {
            i5 = (c0315s.f(c0249u) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.f(v0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= c0315s.h(dVar) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0315s.B()) {
            c0315s.S();
            k0Var3 = k0Var;
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                k0Var2 = (k0) c0315s.j(l0.f3382a);
            } else {
                c0315s.S();
                k0Var2 = k0Var;
            }
            c0315s.r();
            v.T a5 = h0.a(0.0f, c0315s, 0, 7);
            long j5 = c0249u.f3527a;
            boolean e3 = c0315s.e(j5);
            Object M5 = c0315s.M();
            if (e3 || M5 == C0302l.f4480a) {
                c5 = 1;
                c6 = 2;
                M5 = new I.W(j5, i0.p.b(0.4f, j5));
                c0315s.i0(M5);
            } else {
                c5 = 1;
                c6 = 2;
            }
            C0322v0 a6 = AbstractC0251w.f3578a.a(c0249u);
            C0322v0 a7 = androidx.compose.foundation.e.f6832a.a(a5);
            C0322v0 a8 = L.z.f2993a.a(C0252x.f3581a);
            C0322v0 a9 = l0.f3382a.a(k0Var2);
            C0322v0 a10 = I.X.f2457a.a((I.W) M5);
            C0322v0 a11 = w0.f3580a.a(v0Var);
            C0322v0[] c0322v0Arr = new C0322v0[6];
            c0322v0Arr[0] = a6;
            c0322v0Arr[c5] = a7;
            c0322v0Arr[c6] = a8;
            c0322v0Arr[3] = a9;
            c0322v0Arr[4] = a10;
            c0322v0Arr[5] = a11;
            AbstractC0329z.b(c0322v0Arr, X.e.d(-1066563262, new C0022e0(10, v0Var, dVar), c0315s), c0315s, 56);
            k0Var3 = k0Var2;
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new I(c0249u, k0Var3, v0Var, dVar, i, 0);
        }
    }
}
