package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class na1 {

    /* JADX INFO: renamed from: a */
    public final jd1 f5350a = kd1.f4353a;

    /* JADX INFO: renamed from: b */
    public boolean f5351b;

    /* JADX INFO: renamed from: c */
    public long f5352c;

    /* JADX INFO: renamed from: a */
    public final long m3509a() {
        if (!this.f5351b) {
            return 0L;
        }
        this.f5350a.getClass();
        return System.nanoTime() - this.f5352c;
    }

    /* JADX INFO: renamed from: b */
    public final void m3510b() {
        a90.m132p("This stopwatch is already running.", !this.f5351b);
        this.f5351b = true;
        this.f5350a.getClass();
        this.f5352c = System.nanoTime();
    }

    public final String toString() {
        long jNanoTime;
        TimeUnit timeUnit;
        String str;
        if (this.f5351b) {
            this.f5350a.getClass();
            jNanoTime = System.nanoTime() - this.f5352c;
        } else {
            jNanoTime = 0;
        }
        long j = jNanoTime / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jNanoTime / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jNanoTime / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jNanoTime / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jNanoTime / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jNanoTime / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        int i = gw0.f2952a;
        sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
        sb.append(" ");
        switch (ma1.f5016a[timeUnit.ordinal()]) {
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
    }
}
