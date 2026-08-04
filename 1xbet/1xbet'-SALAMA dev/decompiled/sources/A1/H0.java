package A1;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H0 f100c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102b;

    static {
        H0 h6 = new H0(0L, 0L);
        new H0(Long.MAX_VALUE, Long.MAX_VALUE);
        new H0(Long.MAX_VALUE, 0L);
        new H0(0L, Long.MAX_VALUE);
        f100c = h6;
    }

    public H0(long j, long j3) {
        p151v2.a.f(j >= 0);
        p151v2.a.f(j3 >= 0);
        this.f101a = j;
        this.f102b = j3;
    }

    public final long a(long j, long j3, long j7) {
        long j8 = this.f101a;
        long j9 = this.f102b;
        if (j8 == 0 && j9 == 0) {
            return j;
        }
        int i7 = p151v2.t.f17159a;
        long j10 = j - j8;
        if (((j8 ^ j) & (j ^ j10)) < 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j + j9;
        if (((j9 ^ j11) & (j ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        boolean z4 = false;
        boolean z7 = j10 <= j3 && j3 <= j11;
        if (j10 <= j7 && j7 <= j11) {
            z4 = true;
        }
        if (z7 && z4) {
            return Math.abs(j3 - j) <= Math.abs(j7 - j) ? j3 : j7;
        }
        if (z7) {
            return j3;
        }
        return z4 ? j7 : j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H0.class != obj.getClass()) {
            return false;
        }
        H0 h6 = (H0) obj;
        return this.f101a == h6.f101a && this.f102b == h6.f102b;
    }

    public final int hashCode() {
        return (((int) this.f101a) * 31) + ((int) this.f102b);
    }
}
