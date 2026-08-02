package W0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f6000a;

    public static long a(long j5, int i, int i5, int i6, int i7, int i8) {
        if ((i8 & 1) != 0) {
            i = j(j5);
        }
        if ((i8 & 2) != 0) {
            i5 = h(j5);
        }
        if ((i8 & 4) != 0) {
            i6 = i(j5);
        }
        if ((i8 & 8) != 0) {
            i7 = g(j5);
        }
        if (i5 < i || i7 < i6 || i < 0 || i6 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i, i5, i6, i7);
    }

    public static final boolean b(long j5, long j6) {
        return j5 == j6;
    }

    public static final boolean c(long j5) {
        int i = (int) (3 & j5);
        int i5 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j5 >> (i5 + 46))) & ((1 << (18 - i5)) - 1)) != 0;
    }

    public static final boolean d(long j5) {
        int i = (int) (3 & j5);
        return (((int) (j5 >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j5) {
        int i = (int) (3 & j5);
        int i5 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i6 = (1 << (18 - i5)) - 1;
        int i7 = ((int) (j5 >> (i5 + 15))) & i6;
        int i8 = ((int) (j5 >> (i5 + 46))) & i6;
        return i7 == (i8 == 0 ? Integer.MAX_VALUE : i8 - 1);
    }

    public static final boolean f(long j5) {
        int i = (int) (3 & j5);
        int i5 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i6 = ((int) (j5 >> 2)) & i5;
        int i7 = ((int) (j5 >> 33)) & i5;
        return i6 == (i7 == 0 ? Integer.MAX_VALUE : i7 - 1);
    }

    public static final int g(long j5) {
        int i = (int) (3 & j5);
        int i5 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i6 = ((int) (j5 >> (i5 + 46))) & ((1 << (18 - i5)) - 1);
        if (i6 == 0) {
            return Integer.MAX_VALUE;
        }
        return i6 - 1;
    }

    public static final int h(long j5) {
        int i = (int) (3 & j5);
        int i5 = (int) (j5 >> 33);
        int i6 = i5 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i6 == 0) {
            return Integer.MAX_VALUE;
        }
        return i6 - 1;
    }

    public static final int i(long j5) {
        int i = (int) (3 & j5);
        int i5 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j5 >> (i5 + 15))) & ((1 << (18 - i5)) - 1);
    }

    public static final int j(long j5) {
        int i = (int) (3 & j5);
        return ((int) (j5 >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static final boolean k(long j5) {
        int i = (int) (3 & j5);
        int i5 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j5 >> 33)) & ((1 << (i5 + 13)) - 1)) - 1 == 0) | ((((int) (j5 >> (i5 + 46))) & ((1 << (18 - i5)) - 1)) - 1 == 0);
    }

    public static String l(long j5) {
        int h3 = h(j5);
        String valueOf = h3 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h3);
        int g5 = g(j5);
        String valueOf2 = g5 != Integer.MAX_VALUE ? String.valueOf(g5) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j5));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(i(j5));
        sb.append(", maxHeight = ");
        return L1.a.p(sb, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f6000a == ((a) obj).f6000a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6000a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return l(this.f6000a);
    }
}
