package com.datadog.trace.api.gateway;

/* loaded from: classes3.dex */
public interface IGSpanInfo {
    com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction getRequestBlockingAction();

    long getSpanId();

    java.util.Map<java.lang.String, java.lang.Object> getTags();

    com.datadog.trace.api.DDTraceId getTraceId();

    void setRequestBlockingAction(com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction requestBlockingAction);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, boolean z);
}
