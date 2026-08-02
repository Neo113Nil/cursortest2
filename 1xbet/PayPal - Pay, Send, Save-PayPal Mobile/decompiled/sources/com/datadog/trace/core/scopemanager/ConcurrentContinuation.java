package com.datadog.trace.core.scopemanager;

/* loaded from: classes8.dex */
final class ConcurrentContinuation extends com.datadog.trace.core.scopemanager.AbstractContinuation {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.scopemanager.ConcurrentContinuation> getInputFormats = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.datadog.trace.core.scopemanager.ConcurrentContinuation.class, "getHighSpeedVideoSizesFor");
    private volatile int getHighSpeedVideoSizesFor;

    public ConcurrentContinuation(com.datadog.trace.core.scopemanager.ContinuableScopeManager continuableScopeManager, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, byte b, com.datadog.trace.logger.Logger logger) {
        super(continuableScopeManager, agentSpan, b, logger);
        this.getHighSpeedVideoSizesFor = 1;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getSpan() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.trace.core.scopemanager.AbstractContinuation
    final void getHighSpeedVideoFpsRangesFor() {
        cancel();
    }

    public final java.lang.String toString() {
        int i = getInputFormats.get(this);
        java.lang.String valueOf = i < -536870912 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS : java.lang.String.valueOf(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(java.lang.Integer.toHexString(hashCode()));
        sb.append("(");
        sb.append(valueOf);
        sb.append(")->");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation, com.datadog.trace.context.TraceScope.Continuation
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.scopemanager.ConcurrentContinuation> atomicIntegerFieldUpdater = getInputFormats;
        int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
        if (incrementAndGet <= 0) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
        }
        if (incrementAndGet > 1) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }
        return null;
    }

    @Override // com.datadog.trace.context.TraceScope.Continuation
    public final void cancel() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.scopemanager.ConcurrentContinuation> atomicIntegerFieldUpdater = getInputFormats;
        if (atomicIntegerFieldUpdater.get(this) >= -536870912) {
            int decrementAndGet = atomicIntegerFieldUpdater.decrementAndGet(this);
            while (true) {
                if (decrementAndGet > 0 || decrementAndGet <= -536870912) {
                    break;
                }
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.scopemanager.ConcurrentContinuation> atomicIntegerFieldUpdater2 = getInputFormats;
                if (atomicIntegerFieldUpdater2.compareAndSet(this, decrementAndGet, -1073741824)) {
                    this.getHighSpeedVideoSizes.cancelContinuation(this);
                    break;
                }
                decrementAndGet = atomicIntegerFieldUpdater2.get(this);
            }
        }
        this.getHighSpeedVideoFpsRangesFor.debug("t_id={} -> canceling continuation {}", this.Camera2StreamConfigurationMap.getTraceId(), this);
    }
}
