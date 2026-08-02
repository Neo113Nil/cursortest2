package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogSpanContextAdapter;", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan$Context;", "delegate", "<init>", "(Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan$Context;)V", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setMetric", "(Ljava/lang/CharSequence;D)V", "", "samplingPriority", "", "setSamplingPriority", "(I)Z", "setTracingSamplingPriorityIfNecessary$dd_sdk_android_trace_release", "()V", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan$Context;", "getDelegate$dd_sdk_android_trace_release", "()Lcom/datadog/trace/bootstrap/instrumentation/api/AgentSpan$Context;", "getSamplingPriority", "()I", "", "getSpanId", "()J", "spanId", "", "", "", "getTags", "()Ljava/util/Map;", "tags", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "getTraceId", "()Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogSpanContextAdapter implements com.datadog.android.trace.api.span.DatadogSpanContext {
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context delegate;

    public DatadogSpanContextAdapter(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.delegate = context;
    }

    /* renamed from: getDelegate$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context getDelegate() {
        return this.delegate;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final long getSpanId() {
        return this.delegate.getSpanId();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final int getSamplingPriority() {
        return this.delegate.getTraceSamplingPriority();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final com.datadog.android.trace.api.trace.DatadogTraceId getTraceId() {
        com.datadog.trace.api.DDTraceId traceId = this.delegate.getTraceId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(traceId, "");
        return new com.datadog.android.trace.internal.DatadogTraceIdAdapter(traceId);
    }

    public final void setTracingSamplingPriorityIfNecessary$dd_sdk_android_trace_release() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentTrace trace = this.delegate.getTrace();
        com.datadog.trace.core.PendingTrace pendingTrace = trace instanceof com.datadog.trace.core.PendingTrace ? (com.datadog.trace.core.PendingTrace) trace : null;
        if (pendingTrace != null) {
            pendingTrace.setSamplingPriorityIfNecessary();
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final java.util.Map<java.lang.String, java.lang.Object> getTags() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context = this.delegate;
        com.datadog.trace.core.DDSpanContext dDSpanContext = context instanceof com.datadog.trace.core.DDSpanContext ? (com.datadog.trace.core.DDSpanContext) context : null;
        java.util.Map<java.lang.String, java.lang.Object> tags = dDSpanContext != null ? dDSpanContext.getTags() : null;
        return tags == null ? kotlin.collections.MapsKt.emptyMap() : tags;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final void setMetric(java.lang.CharSequence key, double value) {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context = this.delegate;
        com.datadog.trace.core.DDSpanContext dDSpanContext = context instanceof com.datadog.trace.core.DDSpanContext ? (com.datadog.trace.core.DDSpanContext) context : null;
        if (dDSpanContext != null) {
            dDSpanContext.setMetric(key, java.lang.Double.valueOf(value));
        }
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanContext
    public final boolean setSamplingPriority(int samplingPriority) {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context = this.delegate;
        com.datadog.trace.core.DDSpanContext dDSpanContext = context instanceof com.datadog.trace.core.DDSpanContext ? (com.datadog.trace.core.DDSpanContext) context : null;
        if (dDSpanContext != null) {
            return dDSpanContext.setSamplingPriority(samplingPriority, 0);
        }
        return false;
    }
}
