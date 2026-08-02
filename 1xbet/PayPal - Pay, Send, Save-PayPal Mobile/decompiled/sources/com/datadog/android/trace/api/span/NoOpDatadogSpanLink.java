package com.datadog.android.trace.api.span;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/trace/api/span/NoOpDatadogSpanLink;", "Lcom/datadog/android/trace/api/span/DatadogSpanLink;", "<init>", "()V", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Ljava/util/Map;", "getAttributes", "()Ljava/util/Map;", "", "sampled", "Z", "getSampled", "()Z", "", "spanId", "J", "getSpanId", "()J", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceId", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "getTraceId", "()Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceStrace", "Ljava/lang/String;", "getTraceStrace", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpDatadogSpanLink implements com.datadog.android.trace.api.span.DatadogSpanLink {
    private final java.util.Map<java.lang.String, java.lang.String> attributes;
    private final boolean sampled;
    private final long spanId;
    private final com.datadog.android.trace.api.trace.DatadogTraceId traceId = new com.datadog.android.trace.api.trace.NoOpDatadogTraceId();
    private final java.lang.String traceStrace = "";

    @Override // com.datadog.android.trace.api.span.DatadogSpanLink
    public final long getSpanId() {
        return this.spanId;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanLink
    public final boolean getSampled() {
        return this.sampled;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanLink
    public final com.datadog.android.trace.api.trace.DatadogTraceId getTraceId() {
        return this.traceId;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanLink
    public final java.lang.String getTraceStrace() {
        return this.traceStrace;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanLink
    public final java.util.Map<java.lang.String, java.lang.String> getAttributes() {
        return this.attributes;
    }
}
