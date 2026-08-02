package F0;

import B0.EnumC2526y0;
import E0.Z0;
import E0.a1;
import E0.c1;
import I0.B0;
import K1.Q;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* renamed from: F0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2984e {

    /* renamed from: F0.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8222a;

        static {
            int[] iArr = new int[EnumC2526y0.values().length];
            try {
                iArr[EnumC2526y0.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2526y0.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2526y0.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8222a = iArr;
        }
    }

    public static final long a(@NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull Z0 z02, long j11) {
        long j12;
        long O11 = c2990k.O();
        if (P9.a.e(O11) || c1Var.j().length() == 0) {
            return 9205357640488583168L;
        }
        long d11 = c1Var.j().d();
        EnumC2526y0 N11 = c2990k.N();
        int i11 = N11 == null ? -1 : a.f8222a[N11.ordinal()];
        if (i11 == -1) {
            return 9205357640488583168L;
        }
        if (i11 == 1 || i11 == 2) {
            int i12 = Q.f15010c;
            j12 = d11 >> 32;
        } else {
            if (i11 != 3) {
                throw new Sc.o();
            }
            int i13 = Q.f15010c;
            j12 = 4294967295L & d11;
        }
        int i14 = (int) j12;
        K1.K f7 = z02.f();
        if (f7 == null) {
            return 9205357640488583168L;
        }
        float g10 = C7459e.g(O11);
        int p11 = f7.p(i14);
        float r11 = f7.r(p11);
        float s11 = f7.s(p11);
        float d12 = kotlin.ranges.h.d(g10, Math.min(r11, s11), Math.max(r11, s11));
        if (!Z1.q.c(j11, 0L) && Math.abs(g10 - d12) > ((int) (j11 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        float u11 = f7.u(p11);
        long a11 = P9.a.a(d12, ((f7.l(p11) - u11) / 2) + u11);
        B1.B i15 = z02.i();
        C7459e c7459e = null;
        if (i15 != null) {
            if (!i15.I()) {
                i15 = null;
            }
            if (i15 != null) {
                a11 = a1.a(a11, B0.f(i15));
            }
        }
        B1.B i16 = z02.i();
        if (i16 == null) {
            return a11;
        }
        if (!i16.I()) {
            i16 = null;
        }
        if (i16 == null) {
            return a11;
        }
        B1.B d13 = z02.d();
        if (d13 != null) {
            if (!d13.I()) {
                d13 = null;
            }
            if (d13 != null) {
                c7459e = C7459e.a(d13.W(i16, a11));
            }
        }
        return c7459e != null ? c7459e.n() : a11;
    }
}
