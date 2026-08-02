package v2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long f17149a;

    /* renamed from: b, reason: collision with root package name */
    public long f17150b;

    /* renamed from: c, reason: collision with root package name */
    public long f17151c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f17152d = new ThreadLocal();

    public s(long j) {
        d(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f17150b == -9223372036854775807L) {
                long j3 = this.f17149a;
                if (j3 == 9223372036854775806L) {
                    Long l7 = (Long) this.f17152d.get();
                    l7.getClass();
                    j3 = l7.longValue();
                }
                this.f17150b = j3 - j;
                notifyAll();
            }
            this.f17151c = j;
            return j + this.f17150b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f17151c;
            if (j3 != -9223372036854775807L) {
                long j7 = (j3 * 90000) / 1000000;
                long j8 = (4294967296L + j7) / 8589934592L;
                long j9 = ((j8 - 1) * 8589934592L) + j;
                long j10 = (j8 * 8589934592L) + j;
                j = Math.abs(j9 - j7) < Math.abs(j10 - j7) ? j9 : j10;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j;
        j = this.f17149a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void d(long j) {
        this.f17149a = j;
        this.f17150b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f17151c = -9223372036854775807L;
    }
}
