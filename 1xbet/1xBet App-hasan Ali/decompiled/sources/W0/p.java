package W0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f6023a;

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f6023a == ((p) obj).f6023a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6023a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        long j5 = this.f6023a;
        return a(j5, 0L) ? "Unspecified" : a(j5, 4294967296L) ? "Sp" : a(j5, 8589934592L) ? "Em" : "Invalid";
    }
}
