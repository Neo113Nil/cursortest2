package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class TimePassedChecker {

    /* renamed from: a, reason: collision with root package name */
    private final TimeProvider f5478a;

    public TimePassedChecker(TimeProvider timeProvider) {
        this.f5478a = timeProvider;
    }

    public final boolean didTimePassMillis(long j3, long j4, String str) {
        long currentTimeMillis = this.f5478a.currentTimeMillis();
        return currentTimeMillis < j3 || currentTimeMillis - j3 >= j4;
    }

    public final boolean didTimePassSeconds(long j3, long j4, String str) {
        long currentTimeSeconds = this.f5478a.currentTimeSeconds();
        return currentTimeSeconds < j3 || currentTimeSeconds - j3 >= j4;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
