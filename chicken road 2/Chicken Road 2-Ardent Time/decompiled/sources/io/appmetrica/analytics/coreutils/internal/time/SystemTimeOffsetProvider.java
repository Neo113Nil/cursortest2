package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f3794a;

    public SystemTimeOffsetProvider(io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider) {
        this.f3794a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.f3794a.elapsedRealtime() - timeUnit.toMillis(j2);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j2, java.util.concurrent.TimeUnit timeUnit) {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j2, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j2, java.util.concurrent.TimeUnit timeUnit) {
        if (j2 == 0) {
            return 0L;
        }
        return this.f3794a.currentTimeSeconds() - timeUnit.toSeconds(j2);
    }

    public final long systemNanoTimeOffsetInNanos(long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.f3794a.systemNanoTime() - timeUnit.toNanos(j2);
    }

    public final long systemNanoTimeOffsetInSeconds(long j2, java.util.concurrent.TimeUnit timeUnit) {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j2, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }
}
