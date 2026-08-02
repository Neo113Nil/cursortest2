package h0;

import t3.AbstractC2425d;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988b {

    /* renamed from: a, reason: collision with root package name */
    public final long f17191a;

    public static long a(long j5, float f, int i) {
        float intBitsToFloat = (i & 1) != 0 ? Float.intBitsToFloat((int) (j5 >> 32)) : 0.0f;
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    public static final boolean b(long j5, long j6) {
        return j5 == j6;
    }

    public static final float c(long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float d(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float e(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static int f(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static final long g(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long h(long j5, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long i(float f, long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String j(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC2425d.M(Float.intBitsToFloat((int) (j5 >> 32))) + ", " + AbstractC2425d.M(Float.intBitsToFloat((int) (j5 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1988b) {
            return this.f17191a == ((C1988b) obj).f17191a;
        }
        return false;
    }

    public final int hashCode() {
        return f(this.f17191a);
    }

    public final String toString() {
        return j(this.f17191a);
    }
}
