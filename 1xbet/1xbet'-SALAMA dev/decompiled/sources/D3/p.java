package D3;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1739c;

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f1738b ? System.nanoTime() - this.f1739c : 0L, TimeUnit.NANOSECONDS);
    }

    public void b() {
        p113p3.f.q("This stopwatch is already running.", !this.f1738b);
        this.f1738b = true;
        this.f1739c = System.nanoTime();
    }

    public String toString() {
        String str;
        switch (this.f1737a) {
            case 0:
                long jNanoTime = this.f1738b ? System.nanoTime() - this.f1739c : 0L;
                TimeUnit timeUnit = TimeUnit.DAYS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.HOURS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MINUTES;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.SECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = TimeUnit.MILLISECONDS;
                                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                    timeUnit = TimeUnit.MICROSECONDS;
                                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                        timeUnit = timeUnit2;
                                    }
                                }
                            }
                        }
                    }
                }
                double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
                StringBuilder sb = new StringBuilder();
                int i7 = k.f1727a;
                sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
                sb.append(" ");
                switch (o.f1736a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = "d";
                        break;
                    default:
                        throw new AssertionError();
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public p(long j, boolean z4) {
        this.f1737a = 1;
        this.f1738b = z4;
        this.f1739c = j;
    }
}
