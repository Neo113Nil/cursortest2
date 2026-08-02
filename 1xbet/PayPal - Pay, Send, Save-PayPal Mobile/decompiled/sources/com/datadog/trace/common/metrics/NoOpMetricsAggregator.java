package com.datadog.trace.common.metrics;

/* loaded from: classes3.dex */
public final class NoOpMetricsAggregator implements com.datadog.trace.common.metrics.MetricsAggregator {
    public static final com.datadog.trace.common.metrics.NoOpMetricsAggregator INSTANCE = new com.datadog.trace.common.metrics.NoOpMetricsAggregator();

    @Override // com.datadog.trace.common.metrics.MetricsAggregator, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.datadog.trace.common.metrics.MetricsAggregator
    public final boolean publish(java.util.List<? extends com.datadog.trace.core.CoreSpan<?>> list) {
        return false;
    }

    @Override // com.datadog.trace.common.metrics.MetricsAggregator
    public final boolean report() {
        return false;
    }

    @Override // com.datadog.trace.common.metrics.MetricsAggregator
    public final void start() {
    }

    @Override // com.datadog.trace.common.metrics.MetricsAggregator
    public final java.util.concurrent.Future<java.lang.Boolean> forceReport() {
        return new java.util.concurrent.Future<java.lang.Boolean>() { // from class: com.datadog.trace.common.metrics.NoOpMetricsAggregator.1
            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z) {
                return false;
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return false;
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return false;
            }

            @Override // java.util.concurrent.Future
            public /* bridge */ /* synthetic */ java.lang.Boolean get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
                return java.lang.Boolean.FALSE;
            }

            @Override // java.util.concurrent.Future
            public /* bridge */ /* synthetic */ java.lang.Boolean get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
                return java.lang.Boolean.FALSE;
            }
        };
    }
}
