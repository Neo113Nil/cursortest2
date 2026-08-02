package Z1;

import B3.D;
import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f35316a;

    public static final class a {
        public static long a(int i11) {
            if (i11 >= 0) {
                return c.i(i11, i11, 0, Integer.MAX_VALUE);
            }
            l.a("width(" + i11 + ") must be >= 0");
            throw null;
        }
    }

    private /* synthetic */ b(long j11) {
        this.f35316a = j11;
    }

    public static final /* synthetic */ b a(long j11) {
        return new b(j11);
    }

    public static final long b(int i11, int i12, int i13, int i14) {
        if (!(i13 >= 0 && i11 >= 0)) {
            l.a("minHeight(" + i13 + ") and minWidth(" + i11 + ") must be >= 0");
            throw null;
        }
        if (!(i12 >= i11)) {
            l.a("maxWidth(" + i12 + ") must be >= minWidth(" + i11 + ')');
            throw null;
        }
        if (i14 >= i13) {
            return c.i(i11, i12, i13, i14);
        }
        l.a("maxHeight(" + i14 + ") must be >= minHeight(" + i13 + ')');
        throw null;
    }

    public static /* synthetic */ long c(int i11, int i12, int i13, int i14, int i15, long j11) {
        if ((i15 & 1) != 0) {
            i11 = m(j11);
        }
        if ((i15 & 2) != 0) {
            i12 = k(j11);
        }
        if ((i15 & 4) != 0) {
            i13 = l(j11);
        }
        if ((i15 & 8) != 0) {
            i14 = j(j11);
        }
        return b(i11, i12, i13, i14);
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof b) && j11 == ((b) obj).f35316a;
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean f(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return (((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1)) != 0;
    }

    public static final boolean g(long j11) {
        int i11 = (int) (3 & j11);
        return (((int) (j11 >> 33)) & ((1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean h(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        int i13 = (1 << (18 - i12)) - 1;
        int i14 = ((int) (j11 >> (i12 + 15))) & i13;
        int i15 = ((int) (j11 >> (i12 + 46))) & i13;
        return i14 == (i15 == 0 ? Integer.MAX_VALUE : i15 - 1);
    }

    public static final boolean i(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1;
        int i13 = ((int) (j11 >> 2)) & i12;
        int i14 = ((int) (j11 >> 33)) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final int j(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        int i13 = ((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1);
        if (i13 == 0) {
            return Integer.MAX_VALUE;
        }
        return i13 - 1;
    }

    public static final int k(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (int) (j11 >> 33);
        int i13 = i12 & ((1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1);
        if (i13 == 0) {
            return Integer.MAX_VALUE;
        }
        return i13 - 1;
    }

    public static final int l(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return ((int) (j11 >> (i12 + 15))) & ((1 << (18 - i12)) - 1);
    }

    public static final int m(long j11) {
        int i11 = (int) (3 & j11);
        return ((int) (j11 >> 2)) & ((1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1);
    }

    public static final boolean n(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return (((int) (j11 >> 33)) & ((1 << (i12 + 13)) - 1)) - 1 == 0 || (((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1)) - 1 == 0;
    }

    @NotNull
    public static String o(long j11) {
        int k11 = k(j11);
        String valueOf = k11 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(k11);
        int j12 = j(j11);
        String valueOf2 = j12 != Integer.MAX_VALUE ? String.valueOf(j12) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(m(j11));
        sb2.append(", maxWidth = ");
        sb2.append(valueOf);
        sb2.append(", minHeight = ");
        sb2.append(l(j11));
        sb2.append(", maxHeight = ");
        return D.c(sb2, valueOf2, ')');
    }

    public final boolean equals(Object obj) {
        return d(this.f35316a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f35316a);
    }

    public final /* synthetic */ long p() {
        return this.f35316a;
    }

    @NotNull
    public final String toString() {
        return o(this.f35316a);
    }
}
