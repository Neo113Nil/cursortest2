package com.datadog.trace.core.scopemanager;

/* loaded from: classes8.dex */
abstract class AbstractContinuation implements com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation {
    final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan Camera2StreamConfigurationMap;
    final com.datadog.trace.core.scopemanager.ContinuableScopeManager getHighResolutionOutputSizeshNQ4ISI;
    final byte getHighSpeedVideoFpsRanges;
    protected final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor;
    final com.datadog.trace.bootstrap.instrumentation.api.AgentTrace getHighSpeedVideoSizes;

    abstract void getHighSpeedVideoFpsRangesFor();

    public AbstractContinuation(com.datadog.trace.core.scopemanager.ContinuableScopeManager continuableScopeManager, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, byte b, com.datadog.trace.logger.Logger logger) {
        this.getHighResolutionOutputSizeshNQ4ISI = continuableScopeManager;
        this.Camera2StreamConfigurationMap = agentSpan;
        this.getHighSpeedVideoFpsRanges = b;
        this.getHighSpeedVideoSizes = agentSpan.context().getTrace();
        this.getHighSpeedVideoFpsRangesFor = logger;
    }
}
