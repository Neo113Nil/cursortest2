package com.datadog.android.trace.api.span;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\r\u0010\u0010J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b%\u0010&J!\u0010%\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\"\u001a\u00020'H\u0016¢\u0006\u0004\b%\u0010(J#\u0010%\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b%\u0010*J#\u0010%\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b%\u0010+R\u001a\u0010,\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u00100\u001a\u0004\u0018\u00010'8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020'8\u0017X\u0097D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00118\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u001cR\u001c\u0010A\u001a\u0004\u0018\u00010\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR$\u0010E\u001a\u0004\u0018\u00010\u00118\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bE\u0010=\u001a\u0004\bF\u0010?\"\u0004\bG\u0010\u001cR\u001c\u0010H\u001a\u0004\u0018\u00010!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\u00118\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bL\u0010=\u001a\u0004\bM\u0010?\"\u0004\bN\u0010\u001cR\u001a\u0010O\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\bO\u0010-\u001a\u0004\bP\u0010/R\u001a\u0010R\u001a\u00020Q8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U"}, d2 = {"Lcom/datadog/android/trace/api/span/NoOpDatadogSpan;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "<init>", "()V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "addThrowable", "(Ljava/lang/Throwable;)V", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "context", "()Lcom/datadog/android/trace/api/span/DatadogSpanContext;", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "finish", "", "finishMicros", "(J)V", "", "tag", "", "getTag", "(Ljava/lang/String;)Ljava/lang/Object;", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "logAttributes", "(Ljava/util/Map;)V", "message", "logErrorMessage", "(Ljava/lang/String;)V", "logMessage", "logThrowable", "setErrorMessage", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setMetric", "(Ljava/lang/String;I)V", "setTag", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;Ljava/lang/Number;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "durationNano", "J", "getDurationNano", "()J", "isError", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setError", "(Ljava/lang/Boolean;)V", "isRootSpan", "Z", "()Z", "localRootSpan", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "getLocalRootSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "operationName", "Ljava/lang/String;", "getOperationName", "()Ljava/lang/String;", "setOperationName", "parentSpanId", "Ljava/lang/Long;", "getParentSpanId", "()Ljava/lang/Long;", "resourceName", "getResourceName", "setResourceName", "samplingPriority", "Ljava/lang/Integer;", "getSamplingPriority", "()Ljava/lang/Integer;", "serviceName", "getServiceName", "setServiceName", "startTimeNanos", "getStartTimeNanos", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceId", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "getTraceId", "()Lcom/datadog/android/trace/api/trace/DatadogTraceId;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpDatadogSpan implements com.datadog.android.trace.api.span.DatadogSpan {
    private final long durationNano;
    private java.lang.Boolean isError;
    private final boolean isRootSpan;
    private final com.datadog.android.trace.api.span.DatadogSpan localRootSpan;
    private final java.lang.Long parentSpanId;
    private java.lang.String resourceName;
    private final java.lang.Integer samplingPriority;
    private final long startTimeNanos;
    private final com.datadog.android.trace.api.trace.DatadogTraceId traceId = new com.datadog.android.trace.api.trace.NoOpDatadogTraceId();
    private java.lang.String serviceName = "";
    private java.lang.String operationName = "";

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void drop() {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish() {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish(long finishMicros) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.Object getTag(java.lang.String tag) {
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setErrorMessage(java.lang.String message) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, java.lang.Number value) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, java.lang.Object value) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, java.lang.String value) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, boolean value) {
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    /* renamed from: isError, reason: from getter */
    public final java.lang.Boolean getIsError() {
        return this.isError;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setError(java.lang.Boolean bool) {
        this.isError = bool;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    /* renamed from: isRootSpan, reason: from getter */
    public final boolean getIsRootSpan() {
        return this.isRootSpan;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.Integer getSamplingPriority() {
        return this.samplingPriority;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final com.datadog.android.trace.api.trace.DatadogTraceId getTraceId() {
        return this.traceId;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.Long getParentSpanId() {
        return this.parentSpanId;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.String getResourceName() {
        return this.resourceName;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setResourceName(java.lang.String str) {
        this.resourceName = str;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.String getServiceName() {
        return this.serviceName;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setServiceName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.serviceName = str;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.String getOperationName() {
        return this.operationName;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setOperationName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.operationName = str;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final long getDurationNano() {
        return this.durationNano;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final com.datadog.android.trace.api.span.DatadogSpan getLocalRootSpan() {
        return this.localRootSpan;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final com.datadog.android.trace.api.span.DatadogSpanContext context() {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanContext();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setMetric(java.lang.String key, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logThrowable(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logMessage(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logErrorMessage(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void addThrowable(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
    }
}
