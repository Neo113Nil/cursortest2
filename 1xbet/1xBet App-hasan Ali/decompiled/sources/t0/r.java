package t0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f19499a;

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static String b(long j5) {
        return "PointerId(value=" + j5 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f19499a == ((r) obj).f19499a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f19499a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return b(this.f19499a);
    }
}
