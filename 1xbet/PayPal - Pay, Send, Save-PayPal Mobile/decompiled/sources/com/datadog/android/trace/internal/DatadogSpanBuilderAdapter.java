package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010&\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b&\u0010)J!\u0010&\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b&\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogSpanBuilderAdapter;", "Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$SpanBuilder;", "delegate", "Lcom/datadog/android/trace/internal/DatadogSpanLogger;", "spanLogger", "<init>", "(Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$SpanBuilder;Lcom/datadog/android/trace/internal/DatadogSpanLogger;)V", "ignoreActiveSpan", "()Lcom/datadog/android/trace/internal/DatadogSpanBuilderAdapter;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/android/trace/api/span/DatadogSpanLink;", "link", "withLink", "(Lcom/datadog/android/trace/api/span/DatadogSpanLink;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "origin", "withOrigin", "(Ljava/lang/String;)Lcom/datadog/android/trace/internal/DatadogSpanBuilderAdapter;", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "parentContext", "withParentContext", "(Lcom/datadog/android/trace/api/span/DatadogSpanContext;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "parentSpan", "withParentSpan", "(Lcom/datadog/android/trace/api/span/DatadogSpan;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "resourceName", "withResourceName", "(Ljava/lang/String;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "micros", "withStartTimestamp", "(J)Lcom/datadog/android/trace/internal/DatadogSpanBuilderAdapter;", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "withTag", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "getHighSpeedVideoSizes", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$SpanBuilder;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/datadog/android/trace/internal/DatadogSpanLogger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogSpanBuilderAdapter implements com.datadog.android.trace.api.span.DatadogSpanBuilder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.trace.internal.DatadogSpanLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder getHighSpeedVideoFpsRangesFor;

    public DatadogSpanBuilderAdapter(com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder spanBuilder, com.datadog.android.trace.internal.DatadogSpanLogger datadogSpanLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpanLogger, "");
        this.getHighSpeedVideoFpsRangesFor = spanBuilder;
        this.getHighSpeedVideoSizes = datadogSpanLogger;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.internal.DatadogSpanBuilderAdapter ignoreActiveSpan() {
        this.getHighSpeedVideoFpsRangesFor.ignoreActiveSpan();
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpan start() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan start = this.getHighSpeedVideoFpsRangesFor.start();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(start, "");
        return new com.datadog.android.trace.internal.DatadogSpanAdapter(start, this.getHighSpeedVideoSizes);
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.internal.DatadogSpanBuilderAdapter withOrigin(java.lang.String origin) {
        this.getHighSpeedVideoFpsRangesFor.withOrigin(origin);
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.internal.DatadogSpanBuilderAdapter withStartTimestamp(long micros) {
        this.getHighSpeedVideoFpsRangesFor.withStartTimestamp(micros);
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRangesFor.withTag(key, (java.lang.Number) value);
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRangesFor.withTag(key, (java.lang.Number) value);
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRangesFor.withTag(key, value);
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withLink(com.datadog.android.trace.api.span.DatadogSpanLink link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        this.getHighSpeedVideoFpsRangesFor.withLink(new com.datadog.android.trace.internal.DatadogSpanLinkAdapter(link));
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withResourceName(java.lang.String resourceName) {
        this.getHighSpeedVideoFpsRangesFor.withResourceName(resourceName);
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withParentContext(com.datadog.android.trace.api.span.DatadogSpanContext parentContext) {
        if (parentContext instanceof com.datadog.android.trace.internal.DatadogSpanContextAdapter) {
            this.getHighSpeedVideoFpsRangesFor.asChildOf(((com.datadog.android.trace.internal.DatadogSpanContextAdapter) parentContext).getDelegate());
        }
        return this;
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withParentSpan(com.datadog.android.trace.api.span.DatadogSpan parentSpan) {
        return withParentContext(parentSpan != null ? parentSpan.context() : null);
    }
}
