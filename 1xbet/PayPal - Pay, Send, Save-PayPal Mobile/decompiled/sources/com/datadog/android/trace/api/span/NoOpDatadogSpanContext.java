package com.datadog.android.trace.api.span;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\f\u001a\u00020\u000b8\u0017X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/trace/api/span/NoOpDatadogSpanContext;", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "<init>", "()V", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setMetric", "(Ljava/lang/CharSequence;D)V", "", "samplingPriority", "", "setSamplingPriority", "(I)Z", com.visa.cbp.getEncExpo.warmup, "getSamplingPriority", "()I", "", "spanId", "J", "getSpanId", "()J", "", "", "", "tags", "Ljava/util/Map;", "getTags", "()Ljava/util/Map;", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceId", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "getTraceId", "()Lcom/datadog/android/trace/api/trace/DatadogTraceId;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpDatadogSpanContext implements com.datadog.android.trace.api.span.DatadogSpanContext {
    private final int samplingPriority;
    private final long spanId;
    private final com.datadog.android.trace.api.trace.DatadogTraceId traceId = new com.datadog.android.trace.api.trace.NoOpDatadogTraceId();
    private final java.util.Map<java.lang.String, java.lang.Object> tags = kotlin.collections.MapsKt.emptyMap();

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final void setMetric(java.lang.CharSequence key, double value) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final boolean setSamplingPriority(int samplingPriority) {
        return false;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final com.datadog.android.trace.api.trace.DatadogTraceId getTraceId() {
        return this.traceId;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final long getSpanId() {
        return this.spanId;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final int getSamplingPriority() {
        return this.samplingPriority;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final java.util.Map<java.lang.String, java.lang.Object> getTags() {
        return this.tags;
    }
}
