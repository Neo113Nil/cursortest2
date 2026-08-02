package com.datadog.trace.api.metrics;

@java.lang.FunctionalInterface
/* loaded from: classes3.dex */
public interface SpanMetricRegistry {
    public static final com.datadog.trace.api.metrics.SpanMetricRegistry NOOP = new com.datadog.trace.api.metrics.SpanMetricRegistry() { // from class: com.datadog.trace.api.metrics.SpanMetricRegistry$$ExternalSyntheticLambda0
        @Override // com.datadog.trace.api.metrics.SpanMetricRegistry
        public final com.datadog.trace.api.metrics.SpanMetrics get(java.lang.String str) {
            com.datadog.trace.api.metrics.SpanMetrics spanMetrics;
            spanMetrics = com.datadog.trace.api.metrics.SpanMetrics.NOOP;
            return spanMetrics;
        }
    };

    com.datadog.trace.api.metrics.SpanMetrics get(java.lang.String str);

    default java.lang.String summary() {
        return "";
    }

    static com.datadog.trace.api.metrics.SpanMetricRegistry getInstance() {
        if (com.datadog.trace.api.InstrumenterConfig.get().isTelemetryEnabled()) {
            return com.datadog.trace.api.metrics.SpanMetricRegistryImpl.getInstance();
        }
        return NOOP;
    }
}
