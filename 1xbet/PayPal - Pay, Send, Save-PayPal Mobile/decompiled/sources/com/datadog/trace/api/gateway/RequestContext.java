package com.datadog.trace.api.gateway;

/* loaded from: classes3.dex */
public interface RequestContext extends java.io.Closeable {
    com.datadog.trace.api.gateway.BlockResponseFunction getBlockResponseFunction();

    <T> T getData(com.datadog.trace.api.gateway.RequestContextSlot requestContextSlot);

    com.datadog.trace.api.internal.TraceSegment getTraceSegment();

    void setBlockResponseFunction(com.datadog.trace.api.gateway.BlockResponseFunction blockResponseFunction);

    /* loaded from: classes8.dex */
    public static class Noop implements com.datadog.trace.api.gateway.RequestContext {
        public static final com.datadog.trace.api.gateway.RequestContext INSTANCE = new com.datadog.trace.api.gateway.RequestContext.Noop();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
        }

        @Override // com.datadog.trace.api.gateway.RequestContext
        public com.datadog.trace.api.gateway.BlockResponseFunction getBlockResponseFunction() {
            return null;
        }

        @Override // com.datadog.trace.api.gateway.RequestContext
        public <T> T getData(com.datadog.trace.api.gateway.RequestContextSlot requestContextSlot) {
            return null;
        }

        @Override // com.datadog.trace.api.gateway.RequestContext
        public void setBlockResponseFunction(com.datadog.trace.api.gateway.BlockResponseFunction blockResponseFunction) {
        }

        private Noop() {
        }

        @Override // com.datadog.trace.api.gateway.RequestContext
        public com.datadog.trace.api.internal.TraceSegment getTraceSegment() {
            return com.datadog.trace.api.internal.TraceSegment.NoOp.INSTANCE;
        }
    }
}
