package com.datadog.trace.common.metrics;

/* loaded from: classes3.dex */
public interface MetricsAggregator extends java.lang.AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    java.util.concurrent.Future<java.lang.Boolean> forceReport();

    boolean publish(java.util.List<? extends com.datadog.trace.core.CoreSpan<?>> list);

    boolean report();

    void start();
}
