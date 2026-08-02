package com.datadog.trace.api.metrics;

/* loaded from: classes3.dex */
public class SpanMetricRegistryImpl implements com.datadog.trace.api.metrics.SpanMetricRegistry {
    private static final com.datadog.trace.api.metrics.SpanMetricRegistryImpl Camera2StreamConfigurationMap = new com.datadog.trace.api.metrics.SpanMetricRegistryImpl();
    private final java.util.Map<java.lang.String, com.datadog.trace.api.metrics.SpanMetricsImpl> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.ConcurrentHashMap();

    public static com.datadog.trace.api.metrics.SpanMetricRegistryImpl getInstance() {
        return Camera2StreamConfigurationMap;
    }

    private SpanMetricRegistryImpl() {
    }

    @Override // com.datadog.trace.api.metrics.SpanMetricRegistry
    public com.datadog.trace.api.metrics.SpanMetrics get(java.lang.String str) {
        return (com.datadog.trace.api.metrics.SpanMetrics) com.datadog.trace.core.util.MapUtils.computeIfAbsent(str, this.getHighSpeedVideoFpsRangesFor, new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.metrics.SpanMetricRegistryImpl$$ExternalSyntheticLambda0
            @Override // com.datadog.android.trace.internal.compat.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return new com.datadog.trace.api.metrics.SpanMetricsImpl((java.lang.String) obj);
            }
        });
    }

    @Override // com.datadog.trace.api.metrics.SpanMetricRegistry
    public java.lang.String summary() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.datadog.trace.api.metrics.SpanMetricsImpl spanMetricsImpl : this.getHighSpeedVideoFpsRangesFor.values()) {
            sb.append(spanMetricsImpl.getInstrumentationName());
            java.lang.String str = ": ";
            for (com.datadog.trace.api.metrics.CoreCounter coreCounter : spanMetricsImpl.getCounters()) {
                sb.append(str);
                sb.append(coreCounter.getName());
                sb.append('=');
                sb.append(coreCounter.getValue());
                str = ", ";
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public java.util.Collection<com.datadog.trace.api.metrics.SpanMetricsImpl> getSpanMetrics() {
        return this.getHighSpeedVideoFpsRangesFor.values();
    }
}
