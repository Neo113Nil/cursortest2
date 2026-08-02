package com.datadog.android.trace.api.span;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b!\u0010$J!\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b!\u0010%"}, d2 = {"Lcom/datadog/android/trace/api/span/NoOpDatadogSpanBuilder;", "Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "<init>", "()V", "ignoreActiveSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/android/trace/api/span/DatadogSpanLink;", "link", "withLink", "(Lcom/datadog/android/trace/api/span/DatadogSpanLink;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "origin", "withOrigin", "(Ljava/lang/String;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "parentContext", "withParentContext", "(Lcom/datadog/android/trace/api/span/DatadogSpanContext;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "parentSpan", "withParentSpan", "(Lcom/datadog/android/trace/api/span/DatadogSpan;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "resourceName", "withResourceName", "", "micros", "withStartTimestamp", "(J)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "withTag", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpDatadogSpanBuilder implements com.datadog.android.trace.api.span.DatadogSpanBuilder {
    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpan start() {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpan();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withOrigin(java.lang.String origin) {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withResourceName(java.lang.String resourceName) {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withParentContext(com.datadog.android.trace.api.span.DatadogSpanContext parentContext) {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withParentSpan(com.datadog.android.trace.api.span.DatadogSpan parentSpan) {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withStartTimestamp(long micros) {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder ignoreActiveSpan() {
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.span.DatadogSpanBuilder
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder withLink(com.datadog.android.trace.api.span.DatadogSpanLink link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }
}
