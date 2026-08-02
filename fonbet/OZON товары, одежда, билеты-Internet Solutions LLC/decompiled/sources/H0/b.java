package H0;

import B0.C2474g1;

/* loaded from: classes.dex */
public final class b {
    public static final long a(long j11, boolean z11, int i11, float f7) {
        int k11 = ((z11 || i11 == 2) && Z1.b.g(j11)) ? Z1.b.k(j11) : Integer.MAX_VALUE;
        if (Z1.b.m(j11) != k11) {
            k11 = kotlin.ranges.h.e(C2474g1.a(f7), Z1.b.m(j11), k11);
        }
        int j12 = Z1.b.j(j11);
        int min = Math.min(0, 262142);
        int min2 = k11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(k11, 262142);
        int c11 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        return Z1.c.a(min, min2, Math.min(c11, 0), j12 != Integer.MAX_VALUE ? Math.min(c11, j12) : Integer.MAX_VALUE);
    }
}
