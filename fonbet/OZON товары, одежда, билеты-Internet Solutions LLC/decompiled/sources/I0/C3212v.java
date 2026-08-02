package I0;

import I0.C3220z;
import k1.C7459e;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3212v {
    public static final void a(@NotNull C3200o0 c3200o0, @NotNull K1.K k11, long j11, long j12, long j13) {
        EnumC3197n b11;
        EnumC3197n enumC3197n;
        EnumC3197n enumC3197n2;
        EnumC3197n enumC3197n3;
        EnumC3197n enumC3197n4;
        int i11;
        C3220z.a d11;
        C3220z.a b12;
        C7460f c7460f = new C7460f(0.0f, 0.0f, (int) (k11.A() >> 32), (int) (k11.A() & 4294967295L));
        EnumC3197n enumC3197n5 = C7459e.g(j11) < c7460f.n() ? EnumC3197n.BEFORE : C7459e.g(j11) > c7460f.o() ? EnumC3197n.AFTER : EnumC3197n.ON;
        EnumC3197n enumC3197n6 = C7459e.h(j11) < c7460f.q() ? EnumC3197n.BEFORE : C7459e.h(j11) > c7460f.h() ? EnumC3197n.AFTER : EnumC3197n.ON;
        if (c3200o0.h()) {
            C3220z f7 = c3200o0.f();
            b11 = b(enumC3197n5, enumC3197n6, c3200o0, j13, f7 != null ? f7.b() : null);
            enumC3197n3 = b11;
            enumC3197n4 = enumC3197n3;
            enumC3197n = enumC3197n5;
            enumC3197n2 = enumC3197n6;
        } else {
            C3220z f11 = c3200o0.f();
            b11 = b(enumC3197n5, enumC3197n6, c3200o0, j13, f11 != null ? f11.d() : null);
            enumC3197n = b11;
            enumC3197n2 = enumC3197n;
            enumC3197n3 = enumC3197n5;
            enumC3197n4 = enumC3197n6;
        }
        EnumC3197n d12 = C3202p0.d(enumC3197n5, enumC3197n6);
        if (d12 == EnumC3197n.ON || d12 != b11) {
            int length = k11.k().j().length();
            if (c3200o0.h()) {
                i11 = c(j11, k11);
                C3220z f12 = c3200o0.f();
                if (f12 == null || (b12 = f12.b()) == null) {
                    length = i11;
                } else {
                    int compare = ((C3219y0) c3200o0.g()).compare(Long.valueOf(b12.d()), Long.valueOf(j13));
                    if (compare < 0) {
                        length = 0;
                    } else if (compare <= 0) {
                        length = b12.c();
                    }
                }
            } else {
                int c11 = c(j11, k11);
                C3220z f13 = c3200o0.f();
                if (f13 == null || (d11 = f13.d()) == null) {
                    length = c11;
                } else {
                    int compare2 = ((C3219y0) c3200o0.g()).compare(Long.valueOf(d11.d()), Long.valueOf(j13));
                    if (compare2 < 0) {
                        length = 0;
                    } else if (compare2 <= 0) {
                        length = d11.c();
                    }
                }
                int i12 = length;
                length = c11;
                i11 = i12;
            }
            c3200o0.a(j13, i11, enumC3197n, enumC3197n2, length, enumC3197n3, enumC3197n4, P9.a.e(j12) ? -1 : c(j12, k11), k11);
        }
    }

    private static final EnumC3197n b(EnumC3197n enumC3197n, EnumC3197n enumC3197n2, C3200o0 c3200o0, long j11, C3220z.a aVar) {
        if (aVar != null) {
            int compare = ((C3219y0) c3200o0.g()).compare(Long.valueOf(aVar.d()), Long.valueOf(j11));
            EnumC3197n enumC3197n3 = compare < 0 ? EnumC3197n.BEFORE : compare > 0 ? EnumC3197n.AFTER : EnumC3197n.ON;
            if (enumC3197n3 != null) {
                return enumC3197n3;
            }
        }
        return C3202p0.d(enumC3197n, enumC3197n2);
    }

    private static final int c(long j11, K1.K k11) {
        if (C7459e.h(j11) <= 0.0f) {
            return 0;
        }
        return C7459e.h(j11) >= k11.v().g() ? k11.k().j().length() : k11.w(j11);
    }
}
