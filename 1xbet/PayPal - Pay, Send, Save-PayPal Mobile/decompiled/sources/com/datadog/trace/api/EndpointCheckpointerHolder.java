package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class EndpointCheckpointerHolder implements com.datadog.trace.api.EndpointCheckpointer {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.api.EndpointCheckpointerHolder.class);
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.datadog.trace.api.EndpointCheckpointerHolder, com.datadog.trace.api.EndpointCheckpointer> getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.datadog.trace.api.EndpointCheckpointerHolder.class, com.datadog.trace.api.EndpointCheckpointer.class, "getHighSpeedVideoFpsRanges");
    private volatile com.datadog.trace.api.EndpointCheckpointer getHighSpeedVideoFpsRanges;

    public static com.datadog.trace.api.EndpointCheckpointerHolder create() {
        return new com.datadog.trace.api.EndpointCheckpointerHolder(com.datadog.trace.api.EndpointCheckpointerHolder.NoOpCheckpointer.getHighSpeedVideoFpsRangesFor);
    }

    public EndpointCheckpointerHolder(com.datadog.trace.api.EndpointCheckpointer endpointCheckpointer) {
        this.getHighSpeedVideoFpsRanges = endpointCheckpointer;
    }

    public final void register(com.datadog.trace.api.EndpointCheckpointer endpointCheckpointer) {
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, this, com.datadog.trace.api.EndpointCheckpointerHolder.NoOpCheckpointer.getHighSpeedVideoFpsRangesFor, endpointCheckpointer)) {
            getHighSpeedVideoFpsRangesFor.debug("failed to register root span checkpointer {} - {} already registered", endpointCheckpointer.getClass(), this.getHighSpeedVideoFpsRanges.getClass());
        } else {
            getHighSpeedVideoFpsRangesFor.debug("Registered root span checkpointer implementation: {}", endpointCheckpointer);
        }
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public final void onRootSpanFinished(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.api.EndpointTracker endpointTracker) {
        this.getHighSpeedVideoFpsRanges.onRootSpanFinished(agentSpan, endpointTracker);
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public final com.datadog.trace.api.EndpointTracker onRootSpanStarted(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        return this.getHighSpeedVideoFpsRanges.onRootSpanStarted(agentSpan);
    }

    static final class NoOpCheckpointer implements com.datadog.trace.api.EndpointCheckpointer {
        static final com.datadog.trace.api.EndpointCheckpointerHolder.NoOpCheckpointer getHighSpeedVideoFpsRangesFor = new com.datadog.trace.api.EndpointCheckpointerHolder.NoOpCheckpointer();

        @Override // com.datadog.trace.api.EndpointCheckpointer
        public final void onRootSpanFinished(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.api.EndpointTracker endpointTracker) {
        }

        @Override // com.datadog.trace.api.EndpointCheckpointer
        public final com.datadog.trace.api.EndpointTracker onRootSpanStarted(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
            return null;
        }

        private NoOpCheckpointer() {
        }
    }
}
