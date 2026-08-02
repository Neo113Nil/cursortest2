package com.datadog.trace.core.scopemanager;

/* loaded from: classes3.dex */
class ContinuableScope implements com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.bootstrap.instrumentation.api.AttachableWrapper {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.datadog.trace.core.scopemanager.ContinuableScope, java.lang.Object> getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.datadog.trace.core.scopemanager.ContinuableScope.class, java.lang.Object.class, "getOutputFormats");
    private final byte Camera2StreamConfigurationMap;
    short getHighResolutionOutputSizeshNQ4ISI = 1;
    final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private final com.datadog.trace.relocate.api.RatelimitedLogger getHighSpeedVideoSizesFor;
    private final com.datadog.trace.core.scopemanager.ContinuableScopeManager getInputFormats;
    private final com.datadog.trace.logger.Logger getInputSizeshNQ4ISI;
    private volatile java.lang.Object getOutputFormats;
    private final com.datadog.trace.api.Stateful getOutputMinFrameDuration;

    ContinuableScope(com.datadog.trace.core.scopemanager.ContinuableScopeManager continuableScopeManager, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, byte b, boolean z, com.datadog.trace.api.Stateful stateful, com.datadog.trace.logger.Logger logger, com.datadog.trace.relocate.api.RatelimitedLogger ratelimitedLogger) {
        this.getInputFormats = continuableScopeManager;
        this.getHighSpeedVideoFpsRangesFor = agentSpan;
        this.Camera2StreamConfigurationMap = b;
        this.getHighSpeedVideoSizes = z;
        this.getOutputMinFrameDuration = stateful;
        this.getInputSizeshNQ4ISI = logger;
        this.getHighSpeedVideoSizesFor = ratelimitedLogger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (equals(r3) == false) goto L17;
     */
    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        com.datadog.trace.core.scopemanager.ScopeStack scopeStack = this.getInputFormats.getInputFormats.get();
        if (!equals(scopeStack.getHighSpeedVideoSizes)) {
            com.datadog.trace.core.scopemanager.ContinuableScope continuableScope = scopeStack.getHighSpeedVideoSizes;
            if (continuableScope != null && continuableScope.source() == com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.ITERATION.id()) {
                scopeStack.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI = (short) 0;
                scopeStack.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.finishWithEndToEnd();
                java.util.Iterator<com.datadog.trace.core.scopemanager.ContinuableScope> it = scopeStack.Camera2StreamConfigurationMap.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.datadog.trace.core.scopemanager.ContinuableScope next = it.next();
                    if (next.source() == com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.ITERATION.id()) {
                        next.getHighResolutionOutputSizeshNQ4ISI = (short) 0;
                        next.getHighSpeedVideoFpsRangesFor.finishWithEndToEnd();
                    }
                }
            }
            if (this.getInputSizeshNQ4ISI.isDebugEnabled()) {
                this.getInputSizeshNQ4ISI.debug("Tried to close {} scope when not on top.  Current top: {}", this, scopeStack.getHighSpeedVideoSizes);
            }
            byte source = source();
            this.getInputFormats.getHighSpeedVideoFpsRanges.onScopeCloseError(source);
            if (source == com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.MANUAL.id() && this.getInputFormats.getInputSizeshNQ4ISI) {
                throw new java.lang.RuntimeException("Tried to close scope when not on top");
            }
        }
        short s = (short) (this.getHighResolutionOutputSizeshNQ4ISI - 1);
        this.getHighResolutionOutputSizeshNQ4ISI = s;
        boolean z = s > 0;
        this.getInputFormats.getHighSpeedVideoFpsRanges.onCloseScope();
        if (!z) {
            getHighResolutionOutputSizeshNQ4ISI(scopeStack);
        }
        this.getOutputMinFrameDuration.close();
    }

    void getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.scopemanager.ScopeStack scopeStack) {
        scopeStack.getHighSpeedVideoFpsRanges();
    }

    final void getHighSpeedVideoFpsRangesFor() {
        java.util.Iterator<com.datadog.trace.api.scopemanager.ScopeListener> it = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            try {
                it.next().afterScopeClosed();
            } catch (java.lang.Exception e) {
                this.getInputSizeshNQ4ISI.debug("ScopeListener threw exception in close()", (java.lang.Throwable) e);
            }
        }
        java.util.Iterator<com.datadog.trace.api.scopemanager.ExtendedScopeListener> it2 = this.getInputFormats.getHighSpeedVideoFpsRangesFor.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().afterScopeClosed();
            } catch (java.lang.Exception e2) {
                this.getInputSizeshNQ4ISI.debug("ScopeListener threw exception in close()", (java.lang.Throwable) e2);
            }
        }
    }

    @Override // com.datadog.trace.context.TraceScope
    public final boolean isAsyncPropagating() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan span() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope
    public final void setAsyncPropagation(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.scopemanager.AbstractContinuation capture() {
        if (!this.getHighSpeedVideoSizes) {
            return null;
        }
        com.datadog.trace.core.scopemanager.SingleContinuation singleContinuation = new com.datadog.trace.core.scopemanager.SingleContinuation(this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, source(), this.getInputSizeshNQ4ISI);
        singleContinuation.getHighSpeedVideoSizes.registerContinuation(singleContinuation);
        return singleContinuation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.scopemanager.AbstractContinuation captureConcurrent() {
        if (!this.getHighSpeedVideoSizes) {
            return null;
        }
        com.datadog.trace.core.scopemanager.ConcurrentContinuation concurrentContinuation = new com.datadog.trace.core.scopemanager.ConcurrentContinuation(this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, source(), this.getInputSizeshNQ4ISI);
        concurrentContinuation.getHighSpeedVideoSizes.registerContinuation(concurrentContinuation);
        return concurrentContinuation;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("->");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        return sb.toString();
    }

    public final void getHighSpeedVideoFpsRanges() {
        try {
            this.getOutputMinFrameDuration.activate(this.getHighSpeedVideoFpsRangesFor.context());
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoSizesFor.warn("ScopeState {} threw exception in beforeActivated()", this.getOutputMinFrameDuration.getClass(), th);
        }
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Iterator<com.datadog.trace.api.scopemanager.ScopeListener> it = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            try {
                it.next().afterScopeActivated();
            } catch (java.lang.Throwable th) {
                this.getInputSizeshNQ4ISI.debug("ScopeListener threw exception in afterActivated()", th);
            }
        }
        java.util.Iterator<com.datadog.trace.api.scopemanager.ExtendedScopeListener> it2 = this.getInputFormats.getHighSpeedVideoFpsRangesFor.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().afterScopeActivated(this.getHighSpeedVideoFpsRangesFor.getTraceId(), this.getHighSpeedVideoFpsRangesFor.getLocalRootSpan().getSpanId(), this.getHighSpeedVideoFpsRangesFor.context().getSpanId(), this.getHighSpeedVideoFpsRangesFor.traceConfig());
            } catch (java.lang.Throwable th2) {
                this.getInputSizeshNQ4ISI.debug("ExtendedScopeListener threw exception in afterActivated()", th2);
            }
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope
    public byte source() {
        return (byte) (this.Camera2StreamConfigurationMap & Byte.MAX_VALUE);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AttachableWrapper
    public void attachWrapper(java.lang.Object obj) {
        getHighSpeedVideoFpsRanges.set(this, obj);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AttachableWrapper
    public java.lang.Object getWrapper() {
        return getHighSpeedVideoFpsRanges.get(this);
    }
}
