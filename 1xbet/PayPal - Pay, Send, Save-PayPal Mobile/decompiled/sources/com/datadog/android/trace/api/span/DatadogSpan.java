package com.datadog.android.trace.api.span;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\f\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H&¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u001d\u0010\u001aJ\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b#\u0010$J!\u0010#\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020%H&¢\u0006\u0004\b#\u0010&J#\u0010#\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010'H&¢\u0006\u0004\b#\u0010(J#\u0010#\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b#\u0010)R\u0014\u0010,\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001e\u0010-\u001a\u0004\u0018\u00010%8'@'X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020%8'X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001c\u00109\u001a\u00020\u00108'@'X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u001aR\u0016\u0010<\u001a\u0004\u0018\u00010\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001e\u0010?\u001a\u0004\u0018\u00010\u00108'@'X¦\u000e¢\u0006\f\u001a\u0004\b=\u00107\"\u0004\b>\u0010\u001aR\u0016\u0010B\u001a\u0004\u0018\u00010\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001c\u0010E\u001a\u00020\u00108'@'X¦\u000e¢\u0006\f\u001a\u0004\bC\u00107\"\u0004\bD\u0010\u001aR\u0014\u0010G\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010+R\u0014\u0010K\u001a\u00020H8'X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J"}, d2 = {"Lcom/datadog/android/trace/api/span/DatadogSpan;", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "addThrowable", "(Ljava/lang/Throwable;)V", "Lcom/datadog/android/trace/api/span/DatadogSpanContext;", "context", "()Lcom/datadog/android/trace/api/span/DatadogSpanContext;", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "()V", "finish", "", "finishMicros", "(J)V", "", "tag", "getTag", "(Ljava/lang/String;)Ljava/lang/Object;", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "logAttributes", "(Ljava/util/Map;)V", "message", "logErrorMessage", "(Ljava/lang/String;)V", "logMessage", "logThrowable", "setErrorMessage", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setMetric", "(Ljava/lang/String;I)V", "setTag", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "(Ljava/lang/String;Z)V", "", "(Ljava/lang/String;Ljava/lang/Number;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getDurationNano", "()J", "durationNano", "isError", "()Ljava/lang/Boolean;", "setError", "(Ljava/lang/Boolean;)V", "isRootSpan", "()Z", "getLocalRootSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "localRootSpan", "getOperationName", "()Ljava/lang/String;", "setOperationName", "operationName", "getParentSpanId", "()Ljava/lang/Long;", "parentSpanId", "getResourceName", "setResourceName", "resourceName", "getSamplingPriority", "()Ljava/lang/Integer;", "samplingPriority", "getServiceName", "setServiceName", "serviceName", "getStartTimeNanos", "startTimeNanos", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "getTraceId", "()Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "traceId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DatadogSpan {
    void addThrowable(java.lang.Throwable throwable);

    com.datadog.android.trace.api.span.DatadogSpanContext context();

    void drop();

    void finish();

    void finish(long finishMicros);

    long getDurationNano();

    com.datadog.android.trace.api.span.DatadogSpan getLocalRootSpan();

    java.lang.String getOperationName();

    java.lang.Long getParentSpanId();

    java.lang.String getResourceName();

    java.lang.Integer getSamplingPriority();

    java.lang.String getServiceName();

    long getStartTimeNanos();

    java.lang.Object getTag(java.lang.String tag);

    com.datadog.android.trace.api.trace.DatadogTraceId getTraceId();

    java.lang.Boolean isError();

    boolean isRootSpan();

    void logAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void logErrorMessage(java.lang.String message);

    void logMessage(java.lang.String message);

    void logThrowable(java.lang.Throwable throwable);

    void setError(java.lang.Boolean bool);

    void setErrorMessage(java.lang.String message);

    void setMetric(java.lang.String key, int value);

    void setOperationName(java.lang.String str);

    void setResourceName(java.lang.String str);

    void setServiceName(java.lang.String str);

    void setTag(java.lang.String tag, java.lang.Number value);

    void setTag(java.lang.String tag, java.lang.Object value);

    void setTag(java.lang.String tag, java.lang.String value);

    void setTag(java.lang.String tag, boolean value);
}
