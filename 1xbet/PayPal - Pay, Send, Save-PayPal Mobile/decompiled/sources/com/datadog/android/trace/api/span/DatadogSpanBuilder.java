package com.datadog.android.trace.api.span;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010 H&¢\u0006\u0004\b\u001e\u0010!J!\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001e\u0010\""}, d2 = {"Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "ignoreActiveSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/android/trace/api/span/DatadogSpanLink;", "link", "withLink", "(Lcom/datadog/android/trace/api/span/DatadogSpanLink;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "origin", "withOrigin", "(Ljava/lang/String;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "parentContext", "withParentContext", "(Lcom/datadog/android/trace/api/span/DatadogSpanContext;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "parentSpan", "withParentSpan", "(Lcom/datadog/android/trace/api/span/DatadogSpan;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "resourceName", "withResourceName", "", "micros", "withStartTimestamp", "(J)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "withTag", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DatadogSpanBuilder {
    com.datadog.android.trace.api.span.DatadogSpanBuilder ignoreActiveSpan();

    com.datadog.android.trace.api.span.DatadogSpan start();

    com.datadog.android.trace.api.span.DatadogSpanBuilder withLink(com.datadog.android.trace.api.span.DatadogSpanLink link);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withOrigin(java.lang.String origin);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withParentContext(com.datadog.android.trace.api.span.DatadogSpanContext parentContext);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withParentSpan(com.datadog.android.trace.api.span.DatadogSpan parentSpan);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withResourceName(java.lang.String resourceName);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withStartTimestamp(long micros);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Double value);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Long value);

    com.datadog.android.trace.api.span.DatadogSpanBuilder withTag(java.lang.String key, java.lang.Object value);
}
