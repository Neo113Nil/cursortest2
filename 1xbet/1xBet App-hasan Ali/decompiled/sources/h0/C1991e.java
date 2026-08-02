package h0;

import t3.AbstractC2425d;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1991e {

    /* renamed from: a, reason: collision with root package name */
    public final long f17204a;

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static final float b(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static final float c(long j5) {
        return Math.min(Float.intBitsToFloat((int) ((j5 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j5 & 2147483647L)));
    }

    public static final float d(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final boolean e(long j5) {
        return (j5 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j5 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j5 & 4294967295L)) <= 0.0f);
    }

    public static String f(long j5) {
        if (j5 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC2425d.M(Float.intBitsToFloat((int) (j5 >> 32))) + ", " + AbstractC2425d.M(Float.intBitsToFloat((int) (j5 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1991e) {
            return this.f17204a == ((C1991e) obj).f17204a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f17204a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return f(this.f17204a);
    }
}
