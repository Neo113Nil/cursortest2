package W0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f6024a;

    public static long a(long j5, float f, float f5, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j5 >> 32));
        }
        if ((i & 2) != 0) {
            f5 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    public static final float b(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final long d(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String f(long j5) {
        return "(" + b(j5) + ", " + c(j5) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f6024a == ((q) obj).f6024a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6024a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return f(this.f6024a);
    }
}
