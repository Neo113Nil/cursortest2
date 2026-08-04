package p151v2;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f17158d = new ThreadLocal();

    public s(long j) {
        d(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f17156b == -9223372036854775807L) {
                long jLongValue = this.f17155a;
                if (jLongValue == 9223372036854775806L) {
                    Long l7 = (Long) this.f17158d.get();
                    l7.getClass();
                    jLongValue = l7.longValue();
                }
                this.f17156b = jLongValue - j;
                notifyAll();
            }
            this.f17157c = j;
            return j + this.f17156b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j3 = this.f17157c;
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
        j = this.f17155a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void d(long j) {
        this.f17155a = j;
        this.f17156b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f17157c = -9223372036854775807L;
    }
}
