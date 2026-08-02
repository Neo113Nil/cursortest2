package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class CorePropagation implements com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation {
    private final com.datadog.trace.core.propagation.HttpCodec.Extractor getHighSpeedVideoFpsRanges;
    private final java.util.Map<com.datadog.trace.api.TracePropagationStyle, com.datadog.trace.core.propagation.HttpCodec.Injector> getHighSpeedVideoFpsRangesFor;
    private final com.datadog.trace.core.propagation.HttpCodec.Injector getHighSpeedVideoSizes;

    public CorePropagation(com.datadog.trace.core.propagation.HttpCodec.Extractor extractor, com.datadog.trace.core.propagation.HttpCodec.Injector injector, java.util.Map<com.datadog.trace.api.TracePropagationStyle, com.datadog.trace.core.propagation.HttpCodec.Injector> map) {
        this.getHighSpeedVideoFpsRanges = extractor;
        this.getHighSpeedVideoSizes = injector;
        this.getHighSpeedVideoFpsRangesFor = map;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
        getHighSpeedVideoFpsRanges(agentSpan.context(), c, setter, null);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
        getHighSpeedVideoFpsRanges(context, c, setter, null);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter, com.datadog.trace.api.TracePropagationStyle tracePropagationStyle) {
        getHighSpeedVideoFpsRanges(agentSpan.context(), c, setter, tracePropagationStyle);
    }

    private <C> void getHighSpeedVideoFpsRanges(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter, com.datadog.trace.api.TracePropagationStyle tracePropagationStyle) {
        if (context instanceof com.datadog.trace.core.DDSpanContext) {
            com.datadog.trace.core.DDSpanContext dDSpanContext = (com.datadog.trace.core.DDSpanContext) context;
            dDSpanContext.getTrace().setSamplingPriorityIfNecessary();
            if (tracePropagationStyle == null) {
                this.getHighSpeedVideoSizes.inject(dDSpanContext, c, setter);
            } else {
                this.getHighSpeedVideoFpsRangesFor.get(tracePropagationStyle).inject(dDSpanContext, c, setter);
            }
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation
    public <C> com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor) {
        return this.getHighSpeedVideoFpsRanges.extract(c, contextVisitor);
    }
}
