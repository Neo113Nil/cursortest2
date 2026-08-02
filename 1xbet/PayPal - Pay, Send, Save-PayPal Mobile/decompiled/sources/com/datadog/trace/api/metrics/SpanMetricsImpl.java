package com.datadog.trace.api.metrics;

/* loaded from: classes3.dex */
public class SpanMetricsImpl implements com.datadog.trace.api.metrics.SpanMetrics {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.util.Collection<com.datadog.trace.api.metrics.CoreCounter> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;

    public SpanMetricsImpl(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(0L);
        this.getHighSpeedVideoSizes = atomicLong;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong(0L);
        this.getHighSpeedVideoFpsRangesFor = atomicLong2;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        byte b = 0;
        arrayList.add(new com.datadog.trace.api.metrics.SpanMetricsImpl.SpanCounter("spans_created", atomicLong, b));
        arrayList.add(new com.datadog.trace.api.metrics.SpanMetricsImpl.SpanCounter("spans_finished", atomicLong2, b));
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.datadog.trace.api.metrics.SpanMetrics
    public void onSpanCreated() {
        this.getHighSpeedVideoSizes.incrementAndGet();
    }

    @Override // com.datadog.trace.api.metrics.SpanMetrics
    public void onSpanFinished() {
        this.getHighSpeedVideoFpsRangesFor.incrementAndGet();
    }

    public java.lang.String getInstrumentationName() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.Collection<com.datadog.trace.api.metrics.CoreCounter> getCounters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static class SpanCounter implements com.datadog.trace.api.metrics.CoreCounter {
        private final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap;
        private long getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        private SpanCounter(java.lang.String str, java.util.concurrent.atomic.AtomicLong atomicLong) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = atomicLong;
        }

        @Override // com.datadog.trace.api.metrics.CoreCounter
        public java.lang.String getName() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // com.datadog.trace.api.metrics.CoreCounter
        public long getValue() {
            return this.Camera2StreamConfigurationMap.get();
        }

        @Override // com.datadog.trace.api.metrics.CoreCounter
        public long getValueAndReset() {
            long j = this.Camera2StreamConfigurationMap.get();
            long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            return j - j2;
        }

        /* synthetic */ SpanCounter(java.lang.String str, java.util.concurrent.atomic.AtomicLong atomicLong, byte b) {
            this(str, atomicLong);
        }
    }
}
