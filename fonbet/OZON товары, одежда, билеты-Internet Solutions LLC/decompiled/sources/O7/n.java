package O7;

import Bl0.k0;
import O7.s;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final s f20035a = s.b();

    /* renamed from: b, reason: collision with root package name */
    private boolean f20036b;

    /* renamed from: c, reason: collision with root package name */
    private long f20037c;

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20038a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f20038a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20038a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20038a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20038a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20038a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20038a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20038a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    n() {
    }

    public static n a() {
        return new n();
    }

    public final long b() {
        long j11;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f20036b) {
            ((s.a) this.f20035a).getClass();
            j11 = System.nanoTime() - this.f20037c;
        } else {
            j11 = 0;
        }
        return timeUnit.convert(j11, timeUnit);
    }

    public final void c() {
        k0.l("This stopwatch is already running.", !this.f20036b);
        this.f20036b = true;
        ((s.a) this.f20035a).getClass();
        this.f20037c = System.nanoTime();
    }

    public final String toString() {
        long j11;
        String str;
        if (this.f20036b) {
            ((s.a) this.f20035a).getClass();
            j11 = System.nanoTime() - this.f20037c;
        } else {
            j11 = 0;
        }
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j11, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(j11, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(j11, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(j11, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(j11, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(j11, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        double convert = j11 / timeUnit2.convert(1L, timeUnit);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(convert)));
        sb2.append(" ");
        switch (a.f20038a[timeUnit.ordinal()]) {
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
        sb2.append(str);
        return sb2.toString();
    }
}
