package com.datadog.trace.core.scopemanager;

/* loaded from: classes8.dex */
final class SingleContinuation extends com.datadog.trace.core.scopemanager.AbstractContinuation {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.scopemanager.SingleContinuation> getOutputFormats = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.datadog.trace.core.scopemanager.SingleContinuation.class, "getHighSpeedVideoSizesFor");
    private volatile int getHighSpeedVideoSizesFor;

    SingleContinuation(com.datadog.trace.core.scopemanager.ContinuableScopeManager continuableScopeManager, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, byte b, com.datadog.trace.logger.Logger logger) {
        super(continuableScopeManager, agentSpan, b, logger);
        this.getHighSpeedVideoSizesFor = 0;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation, com.datadog.trace.context.TraceScope.Continuation
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate() {
        if (getOutputFormats.compareAndSet(this, 0, 1)) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }
        this.getHighSpeedVideoFpsRangesFor.debug("Failed to activate continuation. Reusing a continuation not allowed. Spans may be reported separately.");
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.datadog.trace.context.TraceScope.Continuation
    public final void cancel() {
        if (getOutputFormats.compareAndSet(this, 0, 1)) {
            this.getHighSpeedVideoSizes.cancelContinuation(this);
        } else {
            this.getHighSpeedVideoFpsRangesFor.debug("Failed to close continuation {}. Already used.", this);
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getSpan() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.trace.core.scopemanager.AbstractContinuation
    final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoSizes.cancelContinuation(this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append("->");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }
}
