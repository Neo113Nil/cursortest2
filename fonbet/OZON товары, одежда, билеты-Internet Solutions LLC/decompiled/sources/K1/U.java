package K1;

import B0.S1;
import K1.z;
import P1.AbstractC3809p;
import l1.C7811b0;
import l1.H0;
import l1.I0;
import n1.AbstractC8413f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class U {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15016a;

        static {
            int[] iArr = new int[Z1.s.values().length];
            try {
                iArr[Z1.s.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z1.s.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15016a = iArr;
        }
    }

    @NotNull
    public static final T a(@NotNull T t2, @NotNull T t11, float f7) {
        z zVar;
        y yVar;
        D H11 = t2.H();
        D H12 = t11.H();
        int i11 = E.f14980e;
        V1.l b11 = V1.k.b(H11.s(), H12.s(), f7);
        AbstractC3809p abstractC3809p = (AbstractC3809p) E.c(f7, H11.h(), H12.h());
        long d11 = E.d(H11.j(), H12.j(), f7);
        P1.F m11 = H11.m();
        if (m11 == null) {
            m11 = P1.F.f21509g;
        }
        P1.F m12 = H12.m();
        if (m12 == null) {
            m12 = P1.F.f21509g;
        }
        P1.F a11 = P1.H.a(m11, m12, f7);
        P1.A a12 = (P1.A) E.c(f7, H11.k(), H12.k());
        P1.B b12 = (P1.B) E.c(f7, H11.l(), H12.l());
        String str = (String) E.c(f7, H11.i(), H12.i());
        long d12 = E.d(H11.n(), H12.n(), f7);
        V1.a d13 = H11.d();
        float b13 = d13 != null ? d13.b() : 0.0f;
        V1.a d14 = H12.d();
        float c11 = S1.c(b13, d14 != null ? d14.b() : 0.0f, f7);
        V1.m t12 = H11.t();
        if (t12 == null) {
            t12 = V1.m.f27923c;
        }
        V1.m t13 = H12.t();
        if (t13 == null) {
            t13 = V1.m.f27923c;
        }
        V1.m a13 = V1.n.a(t12, t13, f7);
        R1.c cVar = (R1.c) E.c(f7, H11.o(), H12.o());
        long g10 = C7811b0.g(H11.c(), H12.c(), f7);
        V1.i iVar = (V1.i) E.c(f7, H11.r(), H12.r());
        H0 q11 = H11.q();
        if (q11 == null) {
            q11 = new H0();
        }
        H0 q12 = H12.q();
        if (q12 == null) {
            q12 = new H0();
        }
        H0 a14 = I0.a(q11, q12, f7);
        z p11 = H11.p();
        z p12 = H12.p();
        y yVar2 = null;
        if (p11 == null && p12 == null) {
            zVar = null;
        } else {
            if (p11 == null) {
                p11 = z.a.a();
            }
            zVar = p11;
        }
        D d15 = new D(b11, d11, a11, a12, b12, abstractC3809p, str, d12, V1.a.a(c11), a13, cVar, g10, iVar, a14, zVar, (AbstractC8413f) E.c(f7, H11.g(), H12.g()));
        C3440u G11 = t2.G();
        C3440u G12 = t11.G();
        int i12 = C3441v.f15100b;
        int c12 = ((V1.h) E.c(f7, V1.h.a(G11.g()), V1.h.a(G12.g()))).c();
        int c13 = ((V1.j) E.c(f7, V1.j.a(G11.h()), V1.j.a(G12.h()))).c();
        long d16 = E.d(G11.d(), G12.d(), f7);
        V1.o i13 = G11.i();
        if (i13 == null) {
            i13 = V1.o.f27926c;
        }
        V1.o i14 = G12.i();
        if (i14 == null) {
            i14 = V1.o.f27926c;
        }
        V1.o a15 = V1.p.a(i13, i14, f7);
        y f11 = G11.f();
        y f12 = G12.f();
        if (f11 != null || f12 != null) {
            if (f11 == null) {
                f11 = y.f15101c;
            }
            yVar2 = f11;
            if (f12 == null) {
                f12 = y.f15101c;
            }
            if (yVar2.c() != f12.c()) {
                yVar = new y(((C3427g) E.c(f7, C3427g.a(yVar2.b()), C3427g.a(f12.b()))).c(), ((Boolean) E.c(f7, Boolean.valueOf(yVar2.c()), Boolean.valueOf(f12.c()))).booleanValue());
                return new T(d15, new C3440u(c12, c13, d16, a15, yVar, (V1.f) E.c(f7, G11.e(), G12.e()), ((V1.e) E.c(f7, V1.e.c(G11.c()), V1.e.c(G12.c()))).e(), ((V1.d) E.c(f7, V1.d.a(G11.b()), V1.d.a(G12.b()))).c(), (V1.q) E.c(f7, G11.j(), G12.j())));
            }
        }
        yVar = yVar2;
        return new T(d15, new C3440u(c12, c13, d16, a15, yVar, (V1.f) E.c(f7, G11.e(), G12.e()), ((V1.e) E.c(f7, V1.e.c(G11.c()), V1.e.c(G12.c()))).e(), ((V1.d) E.c(f7, V1.d.a(G11.b()), V1.d.a(G12.b()))).c(), (V1.q) E.c(f7, G11.j(), G12.j())));
    }

    @NotNull
    public static final T b(@NotNull T t2, @NotNull Z1.s sVar) {
        return new T(E.e(t2.u()), C3441v.b(t2.r(), sVar), t2.s());
    }
}
