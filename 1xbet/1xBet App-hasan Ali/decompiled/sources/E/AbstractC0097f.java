package E;

import I.InterfaceC0159l;
import P.C0302l;
import P.C0315s;
import P.C0326x0;
import k4.AbstractC2036a;
import z.AbstractC2701c;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0097f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1138a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1139b;

    static {
        float f = 25;
        f1138a = f;
        f1139b = (f * 2.0f) / 2.4142137f;
    }

    public static final void a(InterfaceC0159l interfaceC0159l, b0.p pVar, long j5, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(1776202187);
        int i6 = (c0315s.f(interfaceC0159l) ? 4 : 2) | i | (c0315s.f(pVar) ? 32 : 16) | 128;
        if ((i6 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            c0315s.U();
            if ((i & 1) == 0 || c0315s.z()) {
                i5 = i6 & (-897);
                j5 = 9205357640488583168L;
            } else {
                c0315s.S();
                i5 = i6 & (-897);
            }
            c0315s.r();
            int i7 = i5 & 14;
            boolean z3 = i7 == 4;
            Object M5 = c0315s.M();
            if (z3 || M5 == C0302l.f4480a) {
                M5 = new A.B(9, interfaceC0159l);
                c0315s.i0(M5);
            }
            AbstractC2036a.a(interfaceC0159l, b0.c.f7138l, X.e.d(-1653527038, new N.g(2, j5, H0.k.a(pVar, false, (i4.c) M5)), c0315s), c0315s, i7 | 432);
        }
        long j6 = j5;
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0087a(interfaceC0159l, pVar, j6, i);
        }
    }

    public static final void b(b0.p pVar, C0315s c0315s, int i, int i5) {
        int i6;
        c0315s.Z(694251107);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i | 6;
        } else if ((i & 6) == 0) {
            i6 = (c0315s.f(pVar) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        if ((i6 & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            if (i7 != 0) {
                pVar = b0.m.f7161k;
            }
            AbstractC2701c.b(c0315s, b0.a.a(androidx.compose.foundation.layout.c.g(pVar, f1139b, f1138a), C0095e.f1135l));
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0089b(pVar, i, i5);
        }
    }
}
