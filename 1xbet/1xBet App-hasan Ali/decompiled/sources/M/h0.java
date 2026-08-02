package M;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.e1;
import u.z0;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f3344a = new e1(C0250v.f3559t);

    /* renamed from: b, reason: collision with root package name */
    public static final P.D f3345b = new P.D(C0250v.f3558s);

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f3346c;

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f3347d;

    static {
        long j5 = i0.p.f17293g;
        f3346c = new i0(true, Float.NaN, j5);
        f3347d = new i0(false, Float.NaN, j5);
    }

    public static final v.T a(float f, C0315s c0315s, int i, int i5) {
        v.T i0Var;
        boolean z3 = true;
        boolean z5 = (i5 & 1) != 0;
        if ((i5 & 2) != 0) {
            f = Float.NaN;
        }
        long j5 = i0.p.f17293g;
        c0315s.X(-1280632857);
        if (((Boolean) c0315s.j(f3344a)).booleanValue()) {
            z0 z0Var = L.u.f2978a;
            InterfaceC0289e0 w5 = AbstractC0329z.w(new i0.p(j5), c0315s);
            boolean z6 = (((i & 14) ^ 6) > 4 && c0315s.g(z5)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !c0315s.c(f)) && (i & 48) != 32) {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            Object M5 = c0315s.M();
            if (z7 || M5 == C0302l.f4480a) {
                M5 = new L.f(z5, f, w5);
                c0315s.i0(M5);
            }
            i0Var = (L.f) M5;
        } else if (W0.f.a(f, Float.NaN) && i0.p.c(j5, j5)) {
            i0Var = z5 ? f3346c : f3347d;
        } else {
            i0Var = new i0(z5, f, j5);
        }
        c0315s.q(false);
        return i0Var;
    }
}
