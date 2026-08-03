package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class SystemTimeProvider implements io.appmetrica.analytics.coreutils.internal.time.TimeProvider {
    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long currentTimeMillis() {
        return java.lang.System.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long currentTimeSeconds() {
        return java.lang.System.currentTimeMillis() / io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long systemNanoTime() {
        return java.lang.System.nanoTime();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}
