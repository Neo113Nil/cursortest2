package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface AgentScopeManager {
    com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource);

    com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource, boolean z);

    com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateNext(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan);

    com.datadog.trace.bootstrap.instrumentation.api.AgentScope active();

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan activeSpan();

    com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation captureSpan(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan);

    void closePrevious(boolean z);
}
