package com.datadog.trace.core.scopemanager;

/* loaded from: classes3.dex */
public final class ContinuableScopeManager implements com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager {
    static final long getHighSpeedVideoSizes = java.util.concurrent.TimeUnit.SECONDS.toMillis(com.datadog.trace.api.Config.get().getScopeIterationKeepAlive());
    volatile java.util.concurrent.ConcurrentMap<com.datadog.trace.core.scopemanager.ScopeStack, com.datadog.trace.core.scopemanager.ContinuableScope> Camera2StreamConfigurationMap;
    final java.util.List<com.datadog.trace.api.scopemanager.ScopeListener> getHighResolutionOutputSizeshNQ4ISI;
    final com.datadog.trace.core.monitor.HealthMetrics getHighSpeedVideoFpsRanges;
    final java.util.List<com.datadog.trace.api.scopemanager.ExtendedScopeListener> getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizesFor;
    final com.datadog.trace.core.scopemanager.ContinuableScopeManager.ScopeStackThreadLocal getInputFormats;
    final boolean getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final com.datadog.trace.logger.Logger getOutputMinFrameDuration;
    private final com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration getOutputSizeshNQ4ISI;
    private final com.datadog.trace.relocate.api.RatelimitedLogger getOutputStallDuration;

    public ContinuableScopeManager(int i, boolean z, boolean z2, com.datadog.android.api.InternalLogger internalLogger) {
        this(i, z, z2, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration.NoOp.INSTANCE, com.datadog.trace.core.monitor.HealthMetrics.NO_OP, internalLogger);
    }

    public ContinuableScopeManager(int i, boolean z, boolean z2, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration profilingContextIntegration, com.datadog.trace.core.monitor.HealthMetrics healthMetrics, com.datadog.android.api.InternalLogger internalLogger) {
        this.getOutputFormats = i == 0 ? Integer.MAX_VALUE : i;
        this.getInputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizesFor = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.CopyOnWriteArrayList();
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.CopyOnWriteArrayList();
        this.getHighSpeedVideoFpsRanges = healthMetrics;
        this.getOutputSizeshNQ4ISI = profilingContextIntegration;
        com.datadog.trace.logger.Logger logger = com.datadog.trace.logger.LoggerFactory.getLogger("ContinuableScopeManager", internalLogger);
        this.getOutputMinFrameDuration = logger;
        com.datadog.trace.relocate.api.RatelimitedLogger ratelimitedLogger = new com.datadog.trace.relocate.api.RatelimitedLogger(logger, 1, java.util.concurrent.TimeUnit.SECONDS);
        this.getOutputStallDuration = ratelimitedLogger;
        this.getInputFormats = new com.datadog.trace.core.scopemanager.ContinuableScopeManager.ScopeStackThreadLocal(profilingContextIntegration, ratelimitedLogger);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource) {
        return getHighSpeedVideoFpsRanges(agentSpan, scopeSource.id(), false, false);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource, boolean z) {
        return getHighSpeedVideoFpsRanges(agentSpan, scopeSource.id(), true, z);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation captureSpan(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        com.datadog.trace.core.scopemanager.SingleContinuation singleContinuation = new com.datadog.trace.core.scopemanager.SingleContinuation(this, agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.INSTRUMENTATION.id(), this.getOutputMinFrameDuration);
        singleContinuation.getHighSpeedVideoSizes.registerContinuation(singleContinuation);
        this.getHighSpeedVideoFpsRanges.onCaptureContinuation();
        return singleContinuation;
    }

    public final void addScopeListener(com.datadog.trace.api.scopemanager.ScopeListener scopeListener) {
        if (scopeListener instanceof com.datadog.trace.api.scopemanager.ExtendedScopeListener) {
            com.datadog.trace.api.scopemanager.ExtendedScopeListener extendedScopeListener = (com.datadog.trace.api.scopemanager.ExtendedScopeListener) scopeListener;
            this.getHighSpeedVideoFpsRangesFor.add(extendedScopeListener);
            this.getOutputMinFrameDuration.debug("Added scope listener {}", extendedScopeListener);
            com.datadog.trace.bootstrap.instrumentation.api.AgentSpan activeSpan = activeSpan();
            if (activeSpan == null || activeSpan == com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentSpan.INSTANCE) {
                return;
            }
            extendedScopeListener.afterScopeActivated(activeSpan.getTraceId(), activeSpan.mo10034getLocalRootSpan().getSpanId(), activeSpan.context().getSpanId(), activeSpan.traceConfig());
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.add(scopeListener);
        this.getOutputMinFrameDuration.debug("Added scope listener {}", scopeListener);
        if (activeSpan() != null) {
            scopeListener.afterScopeActivated();
        }
    }

    private com.datadog.trace.api.Stateful getHighSpeedVideoFpsRanges(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        if (agentSpan.context() instanceof com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext) {
            return this.getOutputSizeshNQ4ISI.newScopeState((com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext) agentSpan.context());
        }
        return com.datadog.trace.api.Stateful.DEFAULT;
    }

    static final class ScopeStackThreadLocal extends java.lang.ThreadLocal<com.datadog.trace.core.scopemanager.ScopeStack> {
        private final com.datadog.trace.relocate.api.RatelimitedLogger Camera2StreamConfigurationMap;
        private final com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration getHighSpeedVideoSizes;

        ScopeStackThreadLocal(com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration profilingContextIntegration, com.datadog.trace.relocate.api.RatelimitedLogger ratelimitedLogger) {
            this.getHighSpeedVideoSizes = profilingContextIntegration;
            this.Camera2StreamConfigurationMap = ratelimitedLogger;
        }

        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ com.datadog.trace.core.scopemanager.ScopeStack initialValue() {
            return new com.datadog.trace.core.scopemanager.ScopeStack(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        }
    }

    /* loaded from: classes8.dex */
    static final class RootIterationCleaner implements com.datadog.trace.util.AgentTaskScheduler.Task<java.util.Map<com.datadog.trace.core.scopemanager.ScopeStack, com.datadog.trace.core.scopemanager.ContinuableScope>> {
        private static final com.datadog.trace.core.scopemanager.ContinuableScopeManager.RootIterationCleaner Camera2StreamConfigurationMap = new com.datadog.trace.core.scopemanager.ContinuableScopeManager.RootIterationCleaner();

        private RootIterationCleaner() {
        }

        @Override // com.datadog.trace.util.AgentTaskScheduler.Task
        public final /* synthetic */ void run(java.util.Map<com.datadog.trace.core.scopemanager.ScopeStack, com.datadog.trace.core.scopemanager.ContinuableScope> map) {
            java.util.Iterator<java.util.Map.Entry<com.datadog.trace.core.scopemanager.ScopeStack, com.datadog.trace.core.scopemanager.ContinuableScope>> it = map.entrySet().iterator();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j = com.datadog.trace.core.scopemanager.ContinuableScopeManager.getHighSpeedVideoSizes;
            while (it.hasNext()) {
                java.util.Map.Entry<com.datadog.trace.core.scopemanager.ScopeStack, com.datadog.trace.core.scopemanager.ContinuableScope> next = it.next();
                com.datadog.trace.core.scopemanager.ScopeStack key = next.getKey();
                com.datadog.trace.core.scopemanager.ContinuableScope value = next.getValue();
                if (value.getHighResolutionOutputSizeshNQ4ISI <= 0) {
                    it.remove();
                } else if (java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(value.getHighSpeedVideoFpsRangesFor.getStartTime()) < currentTimeMillis - j) {
                    key.getHighSpeedVideoFpsRanges = value;
                    value.getHighSpeedVideoFpsRangesFor.finishWithEndToEnd();
                    it.remove();
                }
            }
        }

        public static void Camera2StreamConfigurationMap(java.util.Map<com.datadog.trace.core.scopemanager.ScopeStack, com.datadog.trace.core.scopemanager.ContinuableScope> map) {
            com.datadog.trace.util.AgentTaskScheduler.INSTANCE.scheduleAtFixedRate(Camera2StreamConfigurationMap, map, com.datadog.trace.core.scopemanager.ContinuableScopeManager.getHighSpeedVideoSizes, java.lang.Math.min(com.datadog.trace.core.scopemanager.ContinuableScopeManager.getHighSpeedVideoSizes, 10000L), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    private com.datadog.trace.bootstrap.instrumentation.api.AgentScope getHighSpeedVideoFpsRanges(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, byte b, boolean z, boolean z2) {
        boolean z3;
        com.datadog.trace.core.scopemanager.ScopeStack scopeStack = this.getInputFormats.get();
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope = scopeStack.getHighSpeedVideoSizes;
        if (continuableScope != null && continuableScope.getHighSpeedVideoFpsRangesFor.equals(agentSpan)) {
            continuableScope.getHighResolutionOutputSizeshNQ4ISI = (short) (continuableScope.getHighResolutionOutputSizeshNQ4ISI + 1);
            return continuableScope;
        }
        int size = scopeStack.getHighSpeedVideoSizes != null ? scopeStack.Camera2StreamConfigurationMap.size() + 1 : 0;
        if (this.getOutputFormats <= size) {
            this.getHighSpeedVideoFpsRanges.onScopeStackOverflow();
            this.getOutputMinFrameDuration.debug("Scope depth limit exceeded ({}).  Returning NoopScope.", java.lang.Integer.valueOf(size));
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentScope.INSTANCE;
        }
        if (!z) {
            if (this.getHighSpeedVideoSizesFor && continuableScope != null) {
                z2 = continuableScope.isAsyncPropagating();
            } else {
                z3 = true;
                com.datadog.trace.core.scopemanager.ContinuableScope continuableScope2 = new com.datadog.trace.core.scopemanager.ContinuableScope(this, agentSpan, b, z3, getHighSpeedVideoFpsRanges(agentSpan), this.getOutputMinFrameDuration, this.getOutputStallDuration);
                scopeStack.getHighSpeedVideoFpsRanges(continuableScope2);
                this.getHighSpeedVideoFpsRanges.onActivateScope();
                return continuableScope2;
            }
        }
        z3 = z2;
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope22 = new com.datadog.trace.core.scopemanager.ContinuableScope(this, agentSpan, b, z3, getHighSpeedVideoFpsRanges(agentSpan), this.getOutputMinFrameDuration, this.getOutputStallDuration);
        scopeStack.getHighSpeedVideoFpsRanges(continuableScope22);
        this.getHighSpeedVideoFpsRanges.onActivateScope();
        return continuableScope22;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateNext(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        com.datadog.trace.core.scopemanager.ScopeStack scopeStack = this.getInputFormats.get();
        boolean z = true;
        int size = scopeStack.getHighSpeedVideoSizes != null ? scopeStack.Camera2StreamConfigurationMap.size() + 1 : 0;
        if (this.getOutputFormats <= size) {
            this.getHighSpeedVideoFpsRanges.onScopeStackOverflow();
            this.getOutputMinFrameDuration.debug("Scope depth limit exceeded ({}).  Returning NoopScope.", java.lang.Integer.valueOf(size));
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentScope.INSTANCE;
        }
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope = scopeStack.getHighSpeedVideoSizes;
        if (this.getHighSpeedVideoSizesFor && continuableScope != null) {
            z = continuableScope.isAsyncPropagating();
        }
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope2 = new com.datadog.trace.core.scopemanager.ContinuableScope(this, agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.ITERATION.id(), z, getHighSpeedVideoFpsRanges(agentSpan), this.getOutputMinFrameDuration, this.getOutputStallDuration);
        if (getHighSpeedVideoSizes > 0 && size == 0) {
            if (this.Camera2StreamConfigurationMap == null) {
                synchronized (this) {
                    if (this.Camera2StreamConfigurationMap == null) {
                        this.Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap();
                        com.datadog.trace.core.scopemanager.ContinuableScopeManager.RootIterationCleaner.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
                    }
                }
            }
            this.Camera2StreamConfigurationMap.put(scopeStack, continuableScope2);
        }
        scopeStack.getHighSpeedVideoFpsRanges(continuableScope2);
        return continuableScope2;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope active() {
        com.datadog.trace.core.scopemanager.ScopeStack scopeStack = this.getInputFormats.get();
        if (scopeStack.getHighSpeedVideoSizes != scopeStack.getHighSpeedVideoFpsRanges) {
            return scopeStack.getHighSpeedVideoSizes;
        }
        return null;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan activeSpan() {
        com.datadog.trace.core.scopemanager.ScopeStack scopeStack = this.getInputFormats.get();
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope = scopeStack.getHighSpeedVideoSizes != scopeStack.getHighSpeedVideoFpsRanges ? scopeStack.getHighSpeedVideoSizes : null;
        if (continuableScope == null) {
            return null;
        }
        return continuableScope.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager
    public final void closePrevious(boolean z) {
        com.datadog.trace.core.scopemanager.ScopeStack scopeStack = this.getInputFormats.get();
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope = scopeStack.getHighSpeedVideoSizes;
        if (continuableScope == null || continuableScope.source() != com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.ITERATION.id()) {
            return;
        }
        if (getHighSpeedVideoSizes > 0 && this.Camera2StreamConfigurationMap != null) {
            this.Camera2StreamConfigurationMap.remove(scopeStack, continuableScope);
        }
        continuableScope.close();
        scopeStack.getHighSpeedVideoFpsRanges();
        if (z) {
            continuableScope.getHighSpeedVideoFpsRangesFor.finishWithEndToEnd();
            this.getHighSpeedVideoFpsRanges.onFinishContinuation();
        }
    }

    final com.datadog.trace.core.scopemanager.ContinuableScope getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.scopemanager.AbstractContinuation abstractContinuation, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, byte b) {
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope;
        com.datadog.trace.core.scopemanager.ScopeStack scopeStack = this.getInputFormats.get();
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope2 = scopeStack.getHighSpeedVideoSizes;
        if (continuableScope2 == null || !continuableScope2.getHighSpeedVideoFpsRangesFor.equals(agentSpan)) {
            com.datadog.trace.api.Stateful highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(agentSpan);
            if (abstractContinuation != null) {
                continuableScope = new com.datadog.trace.core.scopemanager.ContinuingScope(this, agentSpan, b, abstractContinuation, highSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getOutputStallDuration);
            } else {
                continuableScope = new com.datadog.trace.core.scopemanager.ContinuableScope(this, agentSpan, b, true, highSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getOutputStallDuration);
            }
            scopeStack.getHighSpeedVideoFpsRanges(continuableScope);
            return continuableScope;
        }
        continuableScope2.getHighResolutionOutputSizeshNQ4ISI = (short) (continuableScope2.getHighResolutionOutputSizeshNQ4ISI + 1);
        if (abstractContinuation != null) {
            abstractContinuation.getHighSpeedVideoFpsRangesFor();
        }
        return continuableScope2;
    }
}
