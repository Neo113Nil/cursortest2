package com.datadog.trace.relocate.api;

/* loaded from: classes3.dex */
public class RatelimitedLogger {
    private final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap;
    private final com.datadog.trace.logger.Logger getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;
    private final com.datadog.trace.api.time.TimeSource getHighSpeedVideoSizes;

    public RatelimitedLogger(com.datadog.trace.logger.Logger logger, int i, java.util.concurrent.TimeUnit timeUnit) {
        this(logger, i, timeUnit, com.datadog.trace.api.time.SystemTimeSource.INSTANCE);
    }

    private RatelimitedLogger(com.datadog.trace.logger.Logger logger, int i, java.util.concurrent.TimeUnit timeUnit, com.datadog.trace.api.time.TimeSource timeSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = logger;
        this.getHighSpeedVideoFpsRangesFor = timeUnit.toNanos(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" (Will not log warnings for ");
        sb.append(i);
        sb.append(' ');
        java.lang.String lowerCase = timeUnit.name().toLowerCase(java.util.Locale.ROOT);
        sb.append(i == 1 ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase);
        sb.append(")");
        this.getHighSpeedVideoFpsRanges = sb.toString();
        this.getHighSpeedVideoSizes = timeSource;
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong(timeSource.getNanoTicks());
    }

    public boolean warn(java.lang.String str, java.lang.Object... objArr) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isDebugEnabled()) {
            this.getHighResolutionOutputSizeshNQ4ISI.warn(str, objArr);
            return true;
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isWarnEnabled()) {
            return false;
        }
        long j = this.Camera2StreamConfigurationMap.get();
        long nanoTicks = this.getHighSpeedVideoSizes.getNanoTicks();
        if (nanoTicks - j < 0 || !this.Camera2StreamConfigurationMap.compareAndSet(j, nanoTicks + this.getHighSpeedVideoFpsRangesFor)) {
            return false;
        }
        com.datadog.trace.logger.Logger logger = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(this.getHighSpeedVideoFpsRanges);
        logger.warn(sb.toString(), objArr);
        return true;
    }
}
