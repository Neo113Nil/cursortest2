package W0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f6008a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6008a == ((h) obj).f6008a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6008a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        long j5 = this.f6008a;
        if (j5 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.b(Float.intBitsToFloat((int) (j5 >> 32)))) + " x " + ((Object) f.b(Float.intBitsToFloat((int) (j5 & 4294967295L))));
    }
}
