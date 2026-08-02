package com.datadog.trace.core.scopemanager;

/* loaded from: classes3.dex */
final class ScopeStack {
    final java.util.ArrayDeque<com.datadog.trace.core.scopemanager.ContinuableScope> Camera2StreamConfigurationMap = new java.util.ArrayDeque<>();
    private final com.datadog.trace.relocate.api.RatelimitedLogger getHighResolutionOutputSizeshNQ4ISI;
    volatile com.datadog.trace.core.scopemanager.ContinuableScope getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration getHighSpeedVideoFpsRangesFor;
    com.datadog.trace.core.scopemanager.ContinuableScope getHighSpeedVideoSizes;

    ScopeStack(com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration profilingContextIntegration, com.datadog.trace.relocate.api.RatelimitedLogger ratelimitedLogger) {
        this.getHighSpeedVideoFpsRangesFor = profilingContextIntegration;
        this.getHighResolutionOutputSizeshNQ4ISI = ratelimitedLogger;
    }

    final void getHighSpeedVideoFpsRanges() {
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope = this.getHighSpeedVideoSizes;
        boolean z = false;
        while (continuableScope != null && continuableScope.getHighResolutionOutputSizeshNQ4ISI <= 0) {
            continuableScope.getHighSpeedVideoFpsRangesFor();
            continuableScope = this.Camera2StreamConfigurationMap.poll();
            z = true;
        }
        if (continuableScope != null && continuableScope == this.getHighSpeedVideoFpsRanges) {
            continuableScope.getHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = null;
        } else if (z) {
            this.getHighSpeedVideoSizes = continuableScope;
            if (continuableScope != null) {
                continuableScope.getHighSpeedVideoFpsRanges();
                continuableScope.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
        if (this.getHighSpeedVideoSizes == null) {
            Camera2StreamConfigurationMap();
        }
    }

    final void getHighSpeedVideoFpsRanges(com.datadog.trace.core.scopemanager.ContinuableScope continuableScope) {
        continuableScope.getHighSpeedVideoFpsRanges();
        com.datadog.trace.core.scopemanager.ContinuableScope continuableScope2 = this.getHighSpeedVideoSizes;
        if (continuableScope2 != null) {
            this.Camera2StreamConfigurationMap.push(continuableScope2);
        } else {
            getHighSpeedVideoSizes();
        }
        this.getHighSpeedVideoSizes = continuableScope;
        continuableScope.getHighResolutionOutputSizeshNQ4ISI();
    }

    private void getHighSpeedVideoSizes() {
        try {
            this.getHighSpeedVideoFpsRangesFor.onAttach();
        } catch (java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.warn("Unexpected profiling exception", th);
        }
    }

    private void Camera2StreamConfigurationMap() {
        try {
            this.getHighSpeedVideoFpsRangesFor.onDetach();
        } catch (java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.warn("Unexpected profiling exception", th);
        }
    }
}
