package com.datadog.android.trace.api.span;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\n\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setMetric", "(Ljava/lang/CharSequence;D)V", "", "samplingPriority", "", "setSamplingPriority", "(I)Z", "getSamplingPriority", "()I", "", "getSpanId", "()J", "spanId", "", "", "getTags", "()Ljava/util/Map;", "tags", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "getTraceId", "()Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DatadogSpanContext {
    int getSamplingPriority();

    long getSpanId();

    java.util.Map<java.lang.String, java.lang.Object> getTags();

    com.datadog.android.trace.api.trace.DatadogTraceId getTraceId();

    void setMetric(java.lang.CharSequence key, double value);

    boolean setSamplingPriority(int samplingPriority);
}
