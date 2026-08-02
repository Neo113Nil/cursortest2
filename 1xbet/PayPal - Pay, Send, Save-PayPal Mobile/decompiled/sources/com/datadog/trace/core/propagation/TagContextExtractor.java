package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class TagContextExtractor implements com.datadog.trace.core.propagation.HttpCodec.Extractor {
    private final com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.core.propagation.ContextInterpreter.Factory getHighSpeedVideoFpsRangesFor;
    private final java.lang.ThreadLocal<com.datadog.trace.core.propagation.ContextInterpreter> getHighSpeedVideoSizes = new java.lang.ThreadLocal<>();

    public TagContextExtractor(com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier, com.datadog.trace.core.propagation.ContextInterpreter.Factory factory) {
        this.getHighSpeedVideoFpsRangesFor = factory;
        this.getHighSpeedVideoFpsRanges = supplier;
    }

    @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
    public void cleanup() {
        this.getHighSpeedVideoSizes.remove();
    }

    @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
    public <C> com.datadog.trace.bootstrap.instrumentation.api.TagContext extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor) {
        com.datadog.trace.core.propagation.ContextInterpreter contextInterpreter = this.getHighSpeedVideoSizes.get();
        if (contextInterpreter == null) {
            contextInterpreter = this.getHighSpeedVideoFpsRangesFor.create();
            this.getHighSpeedVideoSizes.set(contextInterpreter);
        }
        com.datadog.trace.core.propagation.ContextInterpreter reset = contextInterpreter.reset(this.getHighSpeedVideoFpsRanges.get());
        contextVisitor.forEachKey(c, reset);
        return reset.build();
    }
}
