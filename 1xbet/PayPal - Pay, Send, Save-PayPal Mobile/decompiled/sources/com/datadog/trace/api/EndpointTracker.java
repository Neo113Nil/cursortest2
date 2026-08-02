package com.datadog.trace.api;

/* loaded from: classes3.dex */
public interface EndpointTracker {
    public static final com.datadog.trace.api.EndpointTracker NO_OP = new com.datadog.trace.api.EndpointTracker() { // from class: com.datadog.trace.api.EndpointTracker$$ExternalSyntheticLambda0
        @Override // com.datadog.trace.api.EndpointTracker
        public final void endpointWritten(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
            com.datadog.trace.api.EndpointTracker.lambda$static$0(agentSpan);
        }
    };

    static /* synthetic */ void lambda$static$0(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
    }

    void endpointWritten(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan);
}
