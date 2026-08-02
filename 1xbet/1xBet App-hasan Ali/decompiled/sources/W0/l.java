package W0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f6015a;

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static String b(long j5) {
        return ((int) (j5 >> 32)) + " x " + ((int) (j5 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f6015a == ((l) obj).f6015a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6015a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return b(this.f6015a);
    }
}
