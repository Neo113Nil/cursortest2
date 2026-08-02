package com.datadog.trace.core.scopemanager;

/* loaded from: classes8.dex */
final class ContinuingScope extends com.datadog.trace.core.scopemanager.ContinuableScope {
    private final com.datadog.trace.core.scopemanager.AbstractContinuation Camera2StreamConfigurationMap;

    ContinuingScope(com.datadog.trace.core.scopemanager.ContinuableScopeManager continuableScopeManager, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, byte b, com.datadog.trace.core.scopemanager.AbstractContinuation abstractContinuation, com.datadog.trace.api.Stateful stateful, com.datadog.trace.logger.Logger logger, com.datadog.trace.relocate.api.RatelimitedLogger ratelimitedLogger) {
        super(continuableScopeManager, agentSpan, b, true, stateful, logger, ratelimitedLogger);
        this.Camera2StreamConfigurationMap = abstractContinuation;
    }

    @Override // com.datadog.trace.core.scopemanager.ContinuableScope
    final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.scopemanager.ScopeStack scopeStack) {
        super.getHighResolutionOutputSizeshNQ4ISI(scopeStack);
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
    }
}
