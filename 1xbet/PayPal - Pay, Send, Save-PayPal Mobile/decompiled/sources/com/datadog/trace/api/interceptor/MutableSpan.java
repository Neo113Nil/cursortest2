package com.datadog.trace.api.interceptor;

/* loaded from: classes3.dex */
public interface MutableSpan {
    void drop();

    long getDurationNano();

    com.datadog.trace.api.interceptor.MutableSpan getLocalRootSpan();

    java.lang.CharSequence getOperationName();

    java.lang.CharSequence getResourceName();

    @java.lang.Deprecated
    com.datadog.trace.api.interceptor.MutableSpan getRootSpan();

    java.lang.String getServiceName();

    java.lang.String getSpanType();

    long getStartTime();

    java.util.Map<java.lang.String, java.lang.Object> getTags();

    java.lang.Integer getTraceSamplingPriority();

    boolean isError();

    com.datadog.trace.api.interceptor.MutableSpan setError(boolean z);

    com.datadog.trace.api.interceptor.MutableSpan setMetric(java.lang.CharSequence charSequence, double d);

    com.datadog.trace.api.interceptor.MutableSpan setMetric(java.lang.CharSequence charSequence, int i);

    com.datadog.trace.api.interceptor.MutableSpan setMetric(java.lang.CharSequence charSequence, long j);

    com.datadog.trace.api.interceptor.MutableSpan setOperationName(java.lang.CharSequence charSequence);

    com.datadog.trace.api.interceptor.MutableSpan setResourceName(java.lang.CharSequence charSequence);

    @java.lang.Deprecated
    com.datadog.trace.api.interceptor.MutableSpan setSamplingPriority(int i);

    com.datadog.trace.api.interceptor.MutableSpan setServiceName(java.lang.String str);

    com.datadog.trace.api.interceptor.MutableSpan setSpanType(java.lang.CharSequence charSequence);

    com.datadog.trace.api.interceptor.MutableSpan setTag(java.lang.String str, java.lang.Number number);

    com.datadog.trace.api.interceptor.MutableSpan setTag(java.lang.String str, java.lang.String str2);

    com.datadog.trace.api.interceptor.MutableSpan setTag(java.lang.String str, boolean z);

    default java.lang.Object getTag(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> tags = getTags();
        if (tags == null) {
            return null;
        }
        return tags.get(str);
    }
}
