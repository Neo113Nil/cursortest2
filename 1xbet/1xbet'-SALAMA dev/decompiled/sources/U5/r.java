package U5;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0443j f6575d = new C0443j(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f6576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6577f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f6578x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0443j f6579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f6581c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f6576e = nanos;
        f6577f = -nanos;
        f6578x = TimeUnit.SECONDS.toNanos(1L);
    }

    public r(long j) {
        C0443j c0443j = f6575d;
        long jNanoTime = System.nanoTime();
        this.f6579a = c0443j;
        long jMin = Math.min(f6576e, Math.max(f6577f, j));
        this.f6580b = jNanoTime + jMin;
        this.f6581c = jMin <= 0;
    }

    public final boolean a() {
        if (!this.f6581c) {
            long j = this.f6580b;
            this.f6579a.getClass();
            if (j - System.nanoTime() > 0) {
                return false;
            }
            this.f6581c = true;
        }
        return true;
    }

    public final long b(TimeUnit timeUnit) {
        this.f6579a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f6581c && this.f6580b - jNanoTime <= 0) {
            this.f6581c = true;
        }
        return timeUnit.convert(this.f6580b - jNanoTime, TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        C0443j c0443j = rVar.f6579a;
        C0443j c0443j2 = this.f6579a;
        if (c0443j2 == c0443j) {
            long j = this.f6580b - rVar.f6580b;
            if (j < 0) {
                return -1;
            }
            return j > 0 ? 1 : 0;
        }
        throw new AssertionError("Tickers (" + c0443j2 + " and " + rVar.f6579a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        C0443j c0443j = this.f6579a;
        if (c0443j != null ? c0443j == rVar.f6579a : rVar.f6579a == null) {
            return this.f6580b == rVar.f6580b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f6579a, Long.valueOf(this.f6580b)).hashCode();
    }

    public final String toString() {
        long jB = b(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jB);
        long j = f6578x;
        long j3 = jAbs / j;
        long jAbs2 = Math.abs(jB) % j;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j3);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        C0443j c0443j = f6575d;
        C0443j c0443j2 = this.f6579a;
        if (c0443j2 != c0443j) {
            sb.append(" (ticker=" + c0443j2 + ")");
        }
        return sb.toString();
    }
}
