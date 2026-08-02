package i0;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: b, reason: collision with root package name */
    public static final long f17263b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17264c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f17265a;

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static final float b(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    public static final float c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    public static String d(long j5) {
        return "TransformOrigin(packedValue=" + j5 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            return this.f17265a == ((N) obj).f17265a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f17265a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return d(this.f17265a);
    }
}
