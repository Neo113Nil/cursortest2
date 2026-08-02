package com.datadog.trace.api.metrics;

/* loaded from: classes3.dex */
public interface SpanMetrics {
    public static final com.datadog.trace.api.metrics.SpanMetrics NOOP = new com.datadog.trace.api.metrics.SpanMetrics() { // from class: com.datadog.trace.api.metrics.SpanMetrics.1
        @Override // com.datadog.trace.api.metrics.SpanMetrics
        public void onSpanCreated() {
        }

        @Override // com.datadog.trace.api.metrics.SpanMetrics
        public void onSpanFinished() {
        }
    };

    void onSpanCreated();

    void onSpanFinished();
}
