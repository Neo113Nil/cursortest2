package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public class AgentTracer {

    public static class NoopAgentTrace implements com.datadog.trace.bootstrap.instrumentation.api.AgentTrace {
        public static final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentTrace INSTANCE = new com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentTrace();

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTrace
        public void cancelContinuation(com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation continuation) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTrace
        public void registerContinuation(com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation continuation) {
        }
    }

    public static class NoopPathwayContext implements com.datadog.trace.bootstrap.instrumentation.api.PathwayContext {
        public static final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopPathwayContext INSTANCE = new com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopPathwayContext();

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public byte[] encode() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public long getHash() {
            return 0L;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public com.datadog.trace.bootstrap.instrumentation.api.StatsPoint getSavedStats() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public boolean isStarted() {
            return false;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public void saveStats(com.datadog.trace.bootstrap.instrumentation.api.StatsPoint statsPoint) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public void setCheckpoint(java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, com.datadog.android.trace.internal.compat.function.Consumer<com.datadog.trace.bootstrap.instrumentation.api.StatsPoint> consumer) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public void setCheckpoint(java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, com.datadog.android.trace.internal.compat.function.Consumer<com.datadog.trace.bootstrap.instrumentation.api.StatsPoint> consumer, long j) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public void setCheckpoint(java.util.LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap, com.datadog.android.trace.internal.compat.function.Consumer<com.datadog.trace.bootstrap.instrumentation.api.StatsPoint> consumer, long j, long j2) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.PathwayContext
        public java.lang.String strEncode() {
            return null;
        }
    }

    public interface SpanBuilder {
        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder asChildOf(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder ignoreActiveSpan();

        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan start();

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withErrorFlag();

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withLink(com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withOrigin(java.lang.String str);

        <T> com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withRequestContextData(com.datadog.trace.api.gateway.RequestContextSlot requestContextSlot, T t);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withResourceName(java.lang.String str);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withServiceName(java.lang.String str);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withSpanType(java.lang.CharSequence charSequence);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withStartTimestamp(long j);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withTag(java.lang.String str, java.lang.Number number);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withTag(java.lang.String str, java.lang.Object obj);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withTag(java.lang.String str, java.lang.String str2);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withTag(java.lang.String str, boolean z);
    }

    private AgentTracer() {
    }

    public interface TracerAPI extends com.datadog.trace.api.EndpointCheckpointer {
        com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateSpan(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource);

        com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateSpan(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource, boolean z);

        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan activeSpan();

        void addScopeListener(com.datadog.trace.api.scopemanager.ScopeListener scopeListener);

        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder buildSpan(java.lang.String str, java.lang.CharSequence charSequence);

        com.datadog.trace.api.TraceConfig captureTraceConfig();

        void close();

        java.lang.String getSpanId(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan);

        java.lang.String getTraceId(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan);

        com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation propagate();

        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence);

        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence, long j);

        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context);

        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context, long j);

        @java.lang.Deprecated
        default com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder buildSpan(java.lang.CharSequence charSequence) {
            return buildSpan("datadog", charSequence);
        }
    }

    public static final class NoopAgentSpan implements com.datadog.trace.bootstrap.instrumentation.api.AgentSpan {
        public static final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentSpan INSTANCE = new com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentSpan();

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void addLink(com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: addThrowable */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10033addThrowable(java.lang.Throwable th) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan addThrowable(java.lang.Throwable th, byte b) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void beginEndToEnd() {
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final void drop() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final boolean eligibleForDropping() {
            return true;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void finish() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void finish(long j) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void finishWithDuration(long j) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void finishWithEndToEnd() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final java.lang.Integer forceSamplingDecision() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final java.lang.String getBaggageItem(java.lang.String str) {
            return null;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final long getDurationNano() {
            return 0L;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final short getHttpStatusCode() {
            return (short) 0;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        /* renamed from: getLocalRootSpan */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10034getLocalRootSpan() {
            return this;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final java.lang.String getOperationName() {
            return null;
        }

        @Override // com.datadog.trace.api.gateway.IGSpanInfo
        public final com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction getRequestBlockingAction() {
            return null;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final java.lang.CharSequence getResourceName() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final byte getResourceNamePriority() {
            return Byte.MAX_VALUE;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getRootSpan() {
            return this;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final java.lang.String getServiceName() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.gateway.IGSpanInfo
        public final long getSpanId() {
            return 0L;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final java.lang.String getSpanType() {
            return null;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final long getStartTime() {
            return 0L;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        public final java.lang.Object getTag(java.lang.String str) {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final boolean hasResourceName() {
            return false;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final boolean isError() {
            return false;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final boolean phasedFinish() {
            return false;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void publish() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setBaggageItem(java.lang.String str, java.lang.String str2) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setError(boolean z) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setError(boolean z, byte b) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setErrorMessage */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10035setErrorMessage(java.lang.String str) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setHttpStatusCode(int i) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setMeasured */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10036setMeasured(boolean z) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        /* renamed from: setMetric */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10037setMetric(java.lang.CharSequence charSequence, double d) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        /* renamed from: setMetric */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10038setMetric(java.lang.CharSequence charSequence, int i) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        /* renamed from: setMetric */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10039setMetric(java.lang.CharSequence charSequence, long j) {
            return this;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setOperationName(java.lang.CharSequence charSequence) {
            return this;
        }

        @Override // com.datadog.trace.api.gateway.IGSpanInfo
        public final void setRequestBlockingAction(com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction requestBlockingAction) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setResourceName(java.lang.CharSequence charSequence) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setResourceName(java.lang.CharSequence charSequence, byte b) {
            return this;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setSamplingPriority(int i) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setSamplingPriority */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10040setSamplingPriority(int i, int i2) {
            return this;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setServiceName(java.lang.String str) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final void setSpanName(java.lang.CharSequence charSequence) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setSpanType(java.lang.CharSequence charSequence) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10041setTag(java.lang.String str, double d) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10042setTag(java.lang.String str, int i) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10043setTag(java.lang.String str, long j) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10044setTag(java.lang.String str, java.lang.CharSequence charSequence) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10045setTag(java.lang.String str, java.lang.Number number) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10046setTag(java.lang.String str, java.lang.Object obj) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10047setTag(java.lang.String str, java.lang.String str2) {
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
        /* renamed from: setTag */
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan mo10048setTag(java.lang.String str, boolean z) {
            return this;
        }

        private NoopAgentSpan() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.gateway.IGSpanInfo
        public final com.datadog.trace.api.DDTraceId getTraceId() {
            return com.datadog.trace.api.DDTraceId.ZERO;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.api.gateway.RequestContext getRequestContext() {
            return com.datadog.trace.api.gateway.RequestContext.Noop.INSTANCE;
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan
        public final java.lang.Integer getTraceSamplingPriority() {
            return java.lang.Integer.valueOf(androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
        }

        @Override // com.datadog.trace.api.interceptor.MutableSpan, com.datadog.trace.api.gateway.IGSpanInfo
        public final java.util.Map<java.lang.String, java.lang.Object> getTags() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final boolean isSameTrace(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
            return agentSpan == INSTANCE;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopContext.INSTANCE;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final java.lang.String getSpanName() {
            return "";
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
        public final com.datadog.trace.api.TraceConfig traceConfig() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopTraceConfig.INSTANCE;
        }
    }

    /* loaded from: classes8.dex */
    public static final class NoopAgentScope implements com.datadog.trace.bootstrap.instrumentation.api.AgentScope {
        public static final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentScope INSTANCE = new com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentScope();

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // com.datadog.trace.context.TraceScope
        public final boolean isAsyncPropagating() {
            return false;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope
        public final void setAsyncPropagation(boolean z) {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope
        public final byte source() {
            return (byte) 0;
        }

        private NoopAgentScope() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentSpan span() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentSpan.INSTANCE;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation capture() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopContinuation.getHighSpeedVideoSizes;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope, com.datadog.trace.context.TraceScope
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation captureConcurrent() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopContinuation.getHighSpeedVideoSizes;
        }
    }

    /* loaded from: classes8.dex */
    static class NoopContinuation implements com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation {
        static final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopContinuation getHighSpeedVideoSizes = new com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopContinuation();

        @Override // com.datadog.trace.context.TraceScope.Continuation
        public void cancel() {
        }

        NoopContinuation() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation, com.datadog.trace.context.TraceScope.Continuation
        public com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentScope.INSTANCE;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation
        public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getSpan() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentSpan.INSTANCE;
        }
    }

    public static final class NoopContext implements com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted {
        public static final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopContext INSTANCE = new com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopContext();

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getCfConnectingIp() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getCfConnectingIpv6() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getCustomIpHeader() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getFastlyClientIp() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getForwarded() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getForwardedFor() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
        public final long getSpanId() {
            return 0L;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
        public final int getTraceSamplingPriority() {
            return androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getTrueClientIp() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getUserAgent() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXClientIp() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXClusterClientIp() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXForwarded() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXForwardedFor() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXForwardedHost() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXForwardedPort() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXForwardedProto() {
            return null;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.lang.String getXRealIp() {
            return null;
        }

        private NoopContext() {
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
        public final com.datadog.trace.api.DDTraceId getTraceId() {
            return com.datadog.trace.api.DDTraceId.ZERO;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
        public final com.datadog.trace.bootstrap.instrumentation.api.AgentTrace getTrace() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentTrace.INSTANCE;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
        public final java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>> baggageItems() {
            return java.util.Collections.emptyList();
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
        public final com.datadog.trace.bootstrap.instrumentation.api.PathwayContext getPathwayContext() {
            return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopPathwayContext.INSTANCE;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
        public final java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> getTerminatedContextLinks() {
            return java.util.Collections.emptyList();
        }
    }

    public static final class NoopTraceConfig implements com.datadog.trace.api.TraceConfig {
        public static final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopTraceConfig INSTANCE = new com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopTraceConfig();

        @Override // com.datadog.trace.api.TraceConfig
        public final java.lang.Double getTraceSampleRate() {
            return null;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final boolean isDataStreamsEnabled() {
            return false;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final boolean isLogsInjectionEnabled() {
            return false;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final boolean isRuntimeMetricsEnabled() {
            return false;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final java.util.Map<java.lang.String, java.lang.String> getServiceMapping() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final java.util.Map<java.lang.String, java.lang.String> getRequestHeaderTags() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final java.util.Map<java.lang.String, java.lang.String> getResponseHeaderTags() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final java.util.Map<java.lang.String, java.lang.String> getBaggageMapping() {
            return java.util.Collections.emptyMap();
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule> getSpanSamplingRules() {
            return java.util.Collections.emptyList();
        }

        @Override // com.datadog.trace.api.TraceConfig
        public final java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.TraceSamplingRule> getTraceSamplingRules() {
            return java.util.Collections.emptyList();
        }
    }
}
