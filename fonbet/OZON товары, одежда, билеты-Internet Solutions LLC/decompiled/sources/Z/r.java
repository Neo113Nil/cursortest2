package Z;

import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class r {
    public static long a(int i11, long j11) {
        long j12 = i11;
        x2.i.a("sampleRate must be greater than 0.", j12 > 0);
        return (TimeUnit.SECONDS.toNanos(1L) * j11) / j12;
    }

    public static long b(int i11, long j11) {
        long j12 = i11;
        x2.i.a("bytesPerFrame must be greater than 0.", j12 > 0);
        return j11 / j12;
    }

    public static long c() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
