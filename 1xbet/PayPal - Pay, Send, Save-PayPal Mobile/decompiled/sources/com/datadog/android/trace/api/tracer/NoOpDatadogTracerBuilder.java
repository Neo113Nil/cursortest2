package com.datadog.android.trace.api.tracer;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/trace/api/tracer/NoOpDatadogTracerBuilder;", "Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "<init>", "()V", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "build", "()Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "", "enabled", "setBundleWithRumEnabled", "(Z)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "", "traceRateLimit", "setTraceRateLimit", "(I)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "partialFlushMinSpans", "withPartialFlushMinSpans", "", "sampleRate", "withSampleRate", "(D)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "", "serviceName", "withServiceName", "(Ljava/lang/String;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "withTag", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracingHeadersTypes", "withTracingHeadersTypes", "(Ljava/util/Set;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpDatadogTracerBuilder implements com.datadog.android.trace.api.tracer.DatadogTracerBuilder {
    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracer build() {
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracer();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder withTracingHeadersTypes(java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> tracingHeadersTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracingHeadersTypes, "");
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder withServiceName(java.lang.String serviceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceName, "");
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder withSampleRate(double sampleRate) {
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder withPartialFlushMinSpans(int partialFlushMinSpans) {
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder withTag(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder setBundleWithRumEnabled(boolean enabled) {
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracerBuilder setTraceRateLimit(int traceRateLimit) {
        return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
    }
}
