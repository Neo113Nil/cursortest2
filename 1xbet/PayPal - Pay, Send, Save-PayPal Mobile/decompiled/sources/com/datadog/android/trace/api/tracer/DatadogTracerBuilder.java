package com.datadog.android.trace.api.tracer;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH&¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "build", "()Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "", "enabled", "setBundleWithRumEnabled", "(Z)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "", "traceRateLimit", "setTraceRateLimit", "(I)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "partialFlushMinSpans", "withPartialFlushMinSpans", "", "sampleRate", "withSampleRate", "(D)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "", "serviceName", "withServiceName", "(Ljava/lang/String;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "withTag", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracingHeadersTypes", "withTracingHeadersTypes", "(Ljava/util/Set;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DatadogTracerBuilder {
    com.datadog.android.trace.api.tracer.DatadogTracer build();

    com.datadog.android.trace.api.tracer.DatadogTracerBuilder setBundleWithRumEnabled(boolean enabled);

    com.datadog.android.trace.api.tracer.DatadogTracerBuilder setTraceRateLimit(int traceRateLimit);

    com.datadog.android.trace.api.tracer.DatadogTracerBuilder withPartialFlushMinSpans(int partialFlushMinSpans);

    com.datadog.android.trace.api.tracer.DatadogTracerBuilder withSampleRate(double sampleRate);

    com.datadog.android.trace.api.tracer.DatadogTracerBuilder withServiceName(java.lang.String serviceName);

    com.datadog.android.trace.api.tracer.DatadogTracerBuilder withTag(java.lang.String key, java.lang.String value);

    com.datadog.android.trace.api.tracer.DatadogTracerBuilder withTracingHeadersTypes(java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> tracingHeadersTypes);
}
