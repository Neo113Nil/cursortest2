package Z1;

import T7.E;

/* loaded from: classes.dex */
public final class c {
    public static final long a(int i11, int i12, int i13, int i14) {
        boolean z11 = false;
        if (!(i12 >= i11)) {
            l.a("maxWidth(" + i12 + ") must be >= than minWidth(" + i11 + ')');
            throw null;
        }
        if (!(i14 >= i13)) {
            l.a("maxHeight(" + i14 + ") must be >= than minHeight(" + i13 + ')');
            throw null;
        }
        if (i11 >= 0 && i13 >= 0) {
            z11 = true;
        }
        if (z11) {
            return i(i11, i12, i13, i14);
        }
        l.a("minWidth(" + i11 + ") and minHeight(" + i13 + ") must be >= 0");
        throw null;
    }

    public static /* synthetic */ long b(int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return a(0, i11, 0, i12);
    }

    public static final int c(int i11) {
        if (i11 < 8191) {
            return 262142;
        }
        if (i11 < 32767) {
            return 65534;
        }
        if (i11 < 65535) {
            return 32766;
        }
        if (i11 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException(E.a(i11, "Can't represent a size of ", " in Constraints"));
    }

    private static final int d(int i11) {
        if (i11 < 8191) {
            return 13;
        }
        if (i11 < 32767) {
            return 15;
        }
        if (i11 < 65535) {
            return 16;
        }
        return i11 < 262143 ? 18 : 255;
    }

    public static final long e(long j11, long j12) {
        return r.a(kotlin.ranges.h.e((int) (j12 >> 32), b.m(j11), b.k(j11)), kotlin.ranges.h.e((int) (j12 & 4294967295L), b.l(j11), b.j(j11)));
    }

    public static final long f(long j11, long j12) {
        return a(kotlin.ranges.h.e(b.m(j12), b.m(j11), b.k(j11)), kotlin.ranges.h.e(b.k(j12), b.m(j11), b.k(j11)), kotlin.ranges.h.e(b.l(j12), b.l(j11), b.j(j11)), kotlin.ranges.h.e(b.j(j12), b.l(j11), b.j(j11)));
    }

    public static final int g(int i11, long j11) {
        return kotlin.ranges.h.e(i11, b.l(j11), b.j(j11));
    }

    public static final int h(int i11, long j11) {
        return kotlin.ranges.h.e(i11, b.m(j11), b.k(j11));
    }

    public static final long i(int i11, int i12, int i13, int i14) {
        int i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int d11 = d(i15);
        int i16 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int d12 = d(i16);
        if (d11 + d12 > 31) {
            throw new IllegalArgumentException(Cm.e.c("Can't represent a width of ", i16, " and height of ", " in Constraints", i15));
        }
        int i17 = i12 + 1;
        int i18 = i17 & (~(i17 >> 31));
        int i19 = i14 + 1;
        int i21 = i19 & (~(i19 >> 31));
        int i22 = 0;
        if (d12 != 13) {
            if (d12 == 18) {
                i22 = 3;
            } else if (d12 == 15) {
                i22 = 1;
            } else if (d12 == 16) {
                i22 = 2;
            }
        }
        int i23 = (((i22 & 2) >> 1) * 3) + ((i22 & 1) << 1);
        return (i18 << 33) | i22 | (i11 << 2) | (i13 << (i23 + 15)) | (i21 << (i23 + 46));
    }

    public static final boolean j(long j11, long j12) {
        int m11 = b.m(j11);
        int k11 = b.k(j11);
        int i11 = (int) (j12 >> 32);
        if (m11 > i11 || i11 > k11) {
            return false;
        }
        int i12 = (int) (j12 & 4294967295L);
        return b.l(j11) <= i12 && i12 <= b.j(j11);
    }

    public static final long k(int i11, int i12, long j11) {
        int m11 = b.m(j11) + i11;
        if (m11 < 0) {
            m11 = 0;
        }
        int k11 = b.k(j11);
        if (k11 != Integer.MAX_VALUE && (k11 = k11 + i11) < 0) {
            k11 = 0;
        }
        int l11 = b.l(j11) + i12;
        if (l11 < 0) {
            l11 = 0;
        }
        int j12 = b.j(j11);
        return a(m11, k11, l11, (j12 == Integer.MAX_VALUE || (j12 = j12 + i12) >= 0) ? j12 : 0);
    }

    public static /* synthetic */ long l(int i11, int i12, int i13, long j11) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return k(i11, i12, j11);
    }
}
