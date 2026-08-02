package com.datadog.trace.api;

/* loaded from: classes3.dex */
public interface EndpointCheckpointer {
    void onRootSpanFinished(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.api.EndpointTracker endpointTracker);

    com.datadog.trace.api.EndpointTracker onRootSpanStarted(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan);
}
