package W0;

/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i, int i5, int i6, int i7) {
        if (!((i6 >= 0) & (i5 >= i) & (i7 >= i6) & (i >= 0))) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i, i5, i6, i7);
    }

    public static /* synthetic */ long b(int i, int i5, int i6) {
        if ((i6 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i5);
    }

    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final long d(long j5, long j6) {
        int i = (int) (j6 >> 32);
        int j7 = a.j(j5);
        int h3 = a.h(j5);
        if (i < j7) {
            i = j7;
        }
        if (i <= h3) {
            h3 = i;
        }
        int i5 = (int) (j6 & 4294967295L);
        int i6 = a.i(j5);
        int g5 = a.g(j5);
        if (i5 < i6) {
            i5 = i6;
        }
        if (i5 <= g5) {
            g5 = i5;
        }
        return (h3 << 32) | (4294967295L & g5);
    }

    public static final long e(long j5, long j6) {
        int j7 = a.j(j5);
        int h3 = a.h(j5);
        int i = a.i(j5);
        int g5 = a.g(j5);
        int j8 = a.j(j6);
        if (j8 < j7) {
            j8 = j7;
        }
        if (j8 > h3) {
            j8 = h3;
        }
        int h4 = a.h(j6);
        if (h4 >= j7) {
            j7 = h4;
        }
        if (j7 <= h3) {
            h3 = j7;
        }
        int i5 = a.i(j6);
        if (i5 < i) {
            i5 = i;
        }
        if (i5 > g5) {
            i5 = g5;
        }
        int g6 = a.g(j6);
        if (g6 >= i) {
            i = g6;
        }
        if (i <= g5) {
            g5 = i;
        }
        return a(j8, h3, i5, g5);
    }

    public static final int f(int i, long j5) {
        int i5 = a.i(j5);
        int g5 = a.g(j5);
        if (i < i5) {
            i = i5;
        }
        return i > g5 ? g5 : i;
    }

    public static final int g(int i, long j5) {
        int j6 = a.j(j5);
        int h3 = a.h(j5);
        if (i < j6) {
            i = j6;
        }
        return i > h3 ? h3 : i;
    }

    public static final long h(int i, int i5, int i6, int i7) {
        int i8 = i7 == Integer.MAX_VALUE ? i6 : i7;
        int c5 = c(i8);
        int i9 = i5 == Integer.MAX_VALUE ? i : i5;
        int c6 = c(i9);
        if (c5 + c6 > 31) {
            k(i9, i8);
        }
        int i10 = i5 + 1;
        int i11 = i7 + 1;
        int i12 = c6 - 13;
        return ((i10 & (~(i10 >> 31))) << 33) | ((i12 >> 1) + (i12 & 1)) | (i << 2) | (i6 << (c6 + 2)) | ((i11 & (~(i11 >> 31))) << (c6 + 33));
    }

    public static final long i(int i, int i5, long j5) {
        int j6 = a.j(j5) + i;
        if (j6 < 0) {
            j6 = 0;
        }
        int h3 = a.h(j5);
        if (h3 != Integer.MAX_VALUE && (h3 = h3 + i) < 0) {
            h3 = 0;
        }
        int i6 = a.i(j5) + i5;
        if (i6 < 0) {
            i6 = 0;
        }
        int g5 = a.g(j5);
        return a(j6, h3, i6, (g5 == Integer.MAX_VALUE || (g5 = g5 + i5) >= 0) ? g5 : 0);
    }

    public static /* synthetic */ long j(int i, int i5, int i6, long j5) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return i(i, i5, j5);
    }

    public static final void k(int i, int i5) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i5 + " in Constraints");
    }

    public static final Void l(int i) {
        throw new IllegalArgumentException(L1.a.l(i, "Can't represent a size of ", " in Constraints"));
    }
}
