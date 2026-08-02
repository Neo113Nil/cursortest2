package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\fJ\u0019\u0010(\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b(\u0010%J\u001f\u0010,\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b.\u0010/J!\u0010.\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010+\u001a\u000200H\u0016¢\u0006\u0004\b.\u00101J#\u0010.\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010+\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b.\u00103J#\u0010.\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b.\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R(\u0010;\u001a\u0004\u0018\u0001002\b\u0010+\u001a\u0004\u0018\u0001008W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010C\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR$\u0010G\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010%R\u0016\u0010J\u001a\u0004\u0018\u00010\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR(\u0010M\u001a\u0004\u0018\u00010\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u0010E\"\u0004\bL\u0010%R\u0016\u0010P\u001a\u0004\u0018\u00010*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR$\u0010S\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010E\"\u0004\bR\u0010%R\u0014\u0010V\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u00109R\u0014\u0010\\\u001a\u00020Y8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010["}, d2 = {"Lcom/datadog/android/trace/internal/DatadogSpanAdapter;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan;", "delegate", "Lcom/datadog/android/trace/internal/DatadogSpanLogger;", "spanLogger", "<init>", "(Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan;Lcom/datadog/android/trace/internal/DatadogSpanLogger;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "addThrowable", "(Ljava/lang/Throwable;)V", "", "errorPriority", "addThrowable$dd_sdk_android_trace_release", "(Ljava/lang/Throwable;B)V", "Lcom/datadog/android/trace/internal/DatadogSpanContextAdapter;", "context", "()Lcom/datadog/android/trace/internal/DatadogSpanContextAdapter;", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "()V", "finish", "", "finishMicros", "(J)V", "", "tag", "", "getTag", "(Ljava/lang/String;)Ljava/lang/Object;", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "logAttributes", "(Ljava/util/Map;)V", "message", "logErrorMessage", "(Ljava/lang/String;)V", "logMessage", "logThrowable", "setErrorMessage", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setMetric", "(Ljava/lang/String;I)V", "setTag", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;Ljava/lang/Number;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan;", "getDelegate$dd_sdk_android_trace_release", "()Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan;", "getDurationNano", "()J", "durationNano", "isError", "()Ljava/lang/Boolean;", "setError", "(Ljava/lang/Boolean;)V", "isRootSpan", "()Z", "getLocalRootSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "localRootSpan", "getOperationName", "()Ljava/lang/String;", "setOperationName", "operationName", "getParentSpanId", "()Ljava/lang/Long;", "parentSpanId", "getResourceName", "setResourceName", "resourceName", "getSamplingPriority", "()Ljava/lang/Integer;", "samplingPriority", "getServiceName", "setServiceName", "serviceName", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/trace/internal/DatadogSpanLogger;", "getHighResolutionOutputSizeshNQ4ISI", "getStartTimeNanos", "startTimeNanos", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "getTraceId", "()Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogSpanAdapter implements com.datadog.android.trace.api.span.DatadogSpan {
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan delegate;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.trace.internal.DatadogSpanLogger getHighResolutionOutputSizeshNQ4ISI;

    public DatadogSpanAdapter(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.android.trace.internal.DatadogSpanLogger datadogSpanLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agentSpan, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpanLogger, "");
        this.delegate = agentSpan;
        this.getHighResolutionOutputSizeshNQ4ISI = datadogSpanLogger;
    }

    /* renamed from: getDelegate$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getDelegate() {
        return this.delegate;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    /* renamed from: isRootSpan */
    public final boolean getIsRootSpan() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan = this.delegate;
        return (agentSpan instanceof com.datadog.trace.core.DDSpan) && ((com.datadog.trace.core.DDSpan) agentSpan).isRootSpan();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final com.datadog.android.trace.api.trace.DatadogTraceId getTraceId() {
        com.datadog.trace.api.DDTraceId traceId = this.delegate.getTraceId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(traceId, "");
        return new com.datadog.android.trace.internal.DatadogTraceIdAdapter(traceId);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.Long getParentSpanId() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan = this.delegate;
        com.datadog.trace.core.DDSpan dDSpan = agentSpan instanceof com.datadog.trace.core.DDSpan ? (com.datadog.trace.core.DDSpan) agentSpan : null;
        if (dDSpan != null) {
            return java.lang.Long.valueOf(dDSpan.getParentId());
        }
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.Integer getSamplingPriority() {
        return this.delegate.getTraceSamplingPriority();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final long getDurationNano() {
        return this.delegate.getDurationNano();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final long getStartTimeNanos() {
        return this.delegate.getStartTime();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final com.datadog.android.trace.api.span.DatadogSpan getLocalRootSpan() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10034getLocalRootSpan = this.delegate.mo10034getLocalRootSpan();
        return mo10034getLocalRootSpan != null ? new com.datadog.android.trace.internal.DatadogSpanAdapter(mo10034getLocalRootSpan, this.getHighResolutionOutputSizeshNQ4ISI) : null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    /* renamed from: isError */
    public final java.lang.Boolean getIsError() {
        return java.lang.Boolean.valueOf(this.delegate.isError());
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setError(java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        this.delegate.setError(bool.booleanValue());
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.String getResourceName() {
        java.lang.CharSequence resourceName = this.delegate.getResourceName();
        if (resourceName != null) {
            return resourceName.toString();
        }
        return null;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setResourceName(java.lang.String str) {
        this.delegate.setResourceName((java.lang.CharSequence) str);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.String getServiceName() {
        java.lang.String serviceName = this.delegate.getServiceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serviceName, "");
        return serviceName;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setServiceName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.delegate.setServiceName(str);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.String getOperationName() {
        return this.delegate.getOperationName().toString();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setOperationName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.delegate.setOperationName(str);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void drop() {
        this.delegate.drop();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish() {
        this.delegate.finish();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void finish(long finishMicros) {
        this.delegate.finish(finishMicros);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final com.datadog.android.trace.internal.DatadogSpanContextAdapter context() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context = this.delegate.context();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        return new com.datadog.android.trace.internal.DatadogSpanContextAdapter(context);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, java.lang.String value) {
        this.delegate.mo10047setTag(tag, value);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, boolean value) {
        this.delegate.mo10048setTag(tag, value);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, java.lang.Number value) {
        this.delegate.mo10045setTag(tag, value);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setTag(java.lang.String tag, java.lang.Object value) {
        this.delegate.mo10046setTag(tag, value);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final java.lang.Object getTag(java.lang.String tag) {
        return this.delegate.getTag(tag);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setMetric(java.lang.String key, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.delegate.mo10038setMetric((java.lang.CharSequence) key, value);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void setErrorMessage(java.lang.String message) {
        this.delegate.mo10035setErrorMessage(message);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void addThrowable(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        this.delegate.mo10033addThrowable(throwable);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logThrowable(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        this.getHighResolutionOutputSizeshNQ4ISI.log(throwable, this);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logErrorMessage(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        this.getHighResolutionOutputSizeshNQ4ISI.logErrorMessage(message, this);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logMessage(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        this.getHighResolutionOutputSizeshNQ4ISI.log(message, this);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpan
    public final void logAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        this.getHighResolutionOutputSizeshNQ4ISI.log(attributes, this);
    }

    public final void addThrowable$dd_sdk_android_trace_release(java.lang.Throwable throwable, byte errorPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        this.delegate.addThrowable(throwable, errorPriority);
    }
}
