package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface AgentTrace {
    void cancelContinuation(com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation continuation);

    void registerContinuation(com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation continuation);
}
