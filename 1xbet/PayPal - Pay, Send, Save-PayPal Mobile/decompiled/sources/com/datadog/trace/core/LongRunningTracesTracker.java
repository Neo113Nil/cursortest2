package com.datadog.trace.core;

/* loaded from: classes3.dex */
public class LongRunningTracesTracker {
    public static final int EXPIRED = 4;
    public static final int NOT_TRACKED = -1;
    public static final int TO_TRACK = 1;
    public static final int TRACKED = 2;
    public static final int UNDEFINED = 0;
    public static final int WRITE_RUNNING_SPANS = 3;
    private final com.datadog.trace.core.monitor.HealthMetrics getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizesFor;
    private long Camera2StreamConfigurationMap = 0;
    private final long getInputSizeshNQ4ISI = java.util.concurrent.TimeUnit.HOURS.toMillis(12);
    private final java.util.List<com.datadog.trace.core.PendingTrace> getOutputMinFrameDuration = new java.util.ArrayList(16);
    private int getHighSpeedVideoSizes = 0;
    private int getInputFormats = 0;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;

    public LongRunningTracesTracker(com.datadog.trace.api.Config config, int i, com.datadog.trace.core.monitor.HealthMetrics healthMetrics) {
        this.getHighSpeedVideoSizesFor = i;
        this.getHighSpeedVideoFpsRangesFor = (int) java.util.concurrent.TimeUnit.SECONDS.toMillis(config.getLongRunningTraceFlushInterval());
        this.getHighSpeedVideoFpsRanges = healthMetrics;
    }

    public boolean add(com.datadog.trace.core.PendingTraceBuffer.Element element) {
        if (!(element instanceof com.datadog.trace.core.PendingTrace)) {
            return false;
        }
        com.datadog.trace.core.PendingTrace pendingTrace = (com.datadog.trace.core.PendingTrace) element;
        if (!pendingTrace.compareAndSetLongRunningState(1, 2)) {
            return false;
        }
        if (com.datadog.trace.core.PendingTrace.getHighSpeedVideoFpsRanges.get(pendingTrace) + com.datadog.trace.core.PendingTrace.getHighSpeedVideoFpsRangesFor.get(pendingTrace) > 0) {
            if (this.getOutputMinFrameDuration.size() == this.getHighSpeedVideoSizesFor) {
                this.getHighSpeedVideoSizes++;
            } else {
                this.getOutputMinFrameDuration.add(pendingTrace);
            }
        }
        return true;
    }

    public void flushAndCompact(long j) {
        if (j < this.Camera2StreamConfigurationMap + java.util.concurrent.TimeUnit.SECONDS.toMillis(1L)) {
            return;
        }
        int i = 0;
        while (i < this.getOutputMinFrameDuration.size()) {
            com.datadog.trace.core.PendingTrace pendingTrace = this.getOutputMinFrameDuration.get(i);
            if (pendingTrace == null) {
                getHighSpeedVideoFpsRanges(i);
            } else if (com.datadog.trace.core.PendingTrace.getHighSpeedVideoFpsRanges.get(pendingTrace) + com.datadog.trace.core.PendingTrace.getHighSpeedVideoFpsRangesFor.get(pendingTrace) <= 0) {
                pendingTrace.compareAndSetLongRunningState(3, -1);
                getHighSpeedVideoFpsRanges(i);
            } else if (j - java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(pendingTrace.getRunningTraceStartTime()) > this.getInputSizeshNQ4ISI) {
                pendingTrace.compareAndSetLongRunningState(3, 4);
                this.getHighResolutionOutputSizeshNQ4ISI++;
                getHighSpeedVideoFpsRanges(i);
            } else {
                if (j - java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.Math.max(pendingTrace.getRunningTraceStartTime(), pendingTrace.getLastWriteTime())) > this.getHighSpeedVideoFpsRangesFor) {
                    java.lang.Integer evaluateSamplingPriority = pendingTrace.evaluateSamplingPriority();
                    if (evaluateSamplingPriority == null || evaluateSamplingPriority.intValue() <= 0) {
                        pendingTrace.compareAndSetLongRunningState(2, -1);
                        getHighSpeedVideoFpsRanges(i);
                    } else {
                        pendingTrace.compareAndSetLongRunningState(2, 3);
                        this.getInputFormats++;
                        pendingTrace.write();
                    }
                }
                i++;
            }
        }
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges.onLongRunningUpdate(this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes = 0;
        this.getInputFormats = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        int size = this.getOutputMinFrameDuration.size() - 1;
        java.util.List<com.datadog.trace.core.PendingTrace> list = this.getOutputMinFrameDuration;
        list.set(i, list.get(size));
        this.getOutputMinFrameDuration.remove(size);
    }
}
