package W0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6007a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6007a == ((g) obj).f6007a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6007a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        long j5 = this.f6007a;
        if (j5 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.b(Float.intBitsToFloat((int) (j5 >> 32)))) + ", " + ((Object) f.b(Float.intBitsToFloat((int) (j5 & 4294967295L)))) + ')';
    }
}
