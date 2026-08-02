package W0;

import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f6020b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f6021c = AbstractC2036a.M(Float.NaN, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f6022a;

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static final long b(long j5) {
        return f6020b[(int) ((j5 & 1095216660480L) >>> 32)].f6023a;
    }

    public static final float c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static int d(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static String e(long j5) {
        long b3 = b(j5);
        if (p.a(b3, 0L)) {
            return "Unspecified";
        }
        if (p.a(b3, 4294967296L)) {
            return c(j5) + ".sp";
        }
        if (!p.a(b3, 8589934592L)) {
            return "Invalid";
        }
        return c(j5) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f6022a == ((o) obj).f6022a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.f6022a);
    }

    public final String toString() {
        return e(this.f6022a);
    }
}
