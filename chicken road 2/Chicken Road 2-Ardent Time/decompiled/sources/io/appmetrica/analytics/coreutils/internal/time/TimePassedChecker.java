package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class TimePassedChecker {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.time.TimeProvider f3795a;

    public TimePassedChecker(io.appmetrica.analytics.coreutils.internal.time.TimeProvider timeProvider) {
        this.f3795a = timeProvider;
    }

    public final boolean didTimePassMillis(long j2, long j3, java.lang.String str) {
        long currentTimeMillis = this.f3795a.currentTimeMillis();
        return currentTimeMillis < j2 || currentTimeMillis - j2 >= j3;
    }

    public final boolean didTimePassSeconds(long j2, long j3, java.lang.String str) {
        long currentTimeSeconds = this.f3795a.currentTimeSeconds();
        return currentTimeSeconds < j2 || currentTimeSeconds - j2 >= j3;
    }

    public TimePassedChecker() {
        this(new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }
}
