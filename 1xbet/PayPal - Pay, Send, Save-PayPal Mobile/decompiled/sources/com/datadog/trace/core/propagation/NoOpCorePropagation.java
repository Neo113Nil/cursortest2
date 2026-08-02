package com.datadog.trace.core.propagation;

/* loaded from: classes8.dex */
public class NoOpCorePropagation implements com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation {
    private final com.datadog.trace.core.propagation.HttpCodec.Extractor getHighSpeedVideoSizes;

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter, com.datadog.trace.api.TracePropagationStyle tracePropagationStyle) {
    }

    public NoOpCorePropagation(com.datadog.trace.core.propagation.HttpCodec.Extractor extractor) {
        this.getHighSpeedVideoSizes = extractor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor) {
        return this.getHighSpeedVideoSizes.extract(c, contextVisitor);
    }
}
