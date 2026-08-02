package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface AgentSpan extends com.datadog.trace.api.interceptor.MutableSpan, com.datadog.trace.api.gateway.IGSpanInfo {

    public interface Context {

        public interface Extracted extends com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context {
            java.lang.String getCfConnectingIp();

            java.lang.String getCfConnectingIpv6();

            java.lang.String getCustomIpHeader();

            java.lang.String getFastlyClientIp();

            java.lang.String getForwarded();

            java.lang.String getForwardedFor();

            java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> getTerminatedContextLinks();

            java.lang.String getTrueClientIp();

            java.lang.String getUserAgent();

            java.lang.String getXClientIp();

            java.lang.String getXClusterClientIp();

            java.lang.String getXForwarded();

            java.lang.String getXForwardedFor();

            java.lang.String getXForwardedHost();

            java.lang.String getXForwardedPort();

            java.lang.String getXForwardedProto();

            java.lang.String getXRealIp();
        }

        java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>> baggageItems();

        com.datadog.trace.bootstrap.instrumentation.api.PathwayContext getPathwayContext();

        long getSpanId();

        com.datadog.trace.bootstrap.instrumentation.api.AgentTrace getTrace();

        com.datadog.trace.api.DDTraceId getTraceId();

        int getTraceSamplingPriority();

        default void mergePathwayContext(com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext) {
        }
    }

    void addLink(com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan addThrowable(java.lang.Throwable th);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan addThrowable(java.lang.Throwable th, byte b);

    void beginEndToEnd();

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context();

    boolean eligibleForDropping();

    void finish();

    void finish(long j);

    void finishWithDuration(long j);

    void finishWithEndToEnd();

    java.lang.Integer forceSamplingDecision();

    java.lang.String getBaggageItem(java.lang.String str);

    short getHttpStatusCode();

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getLocalRootSpan();

    com.datadog.trace.api.gateway.RequestContext getRequestContext();

    byte getResourceNamePriority();

    @Override // com.datadog.trace.api.gateway.IGSpanInfo
    long getSpanId();

    java.lang.CharSequence getSpanName();

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    java.lang.Object getTag(java.lang.String str);

    @Override // com.datadog.trace.api.gateway.IGSpanInfo
    com.datadog.trace.api.DDTraceId getTraceId();

    @java.lang.Deprecated
    boolean hasResourceName();

    boolean isSameTrace(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan);

    boolean phasedFinish();

    void publish();

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setBaggageItem(java.lang.String str, java.lang.String str2);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setError(boolean z);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setError(boolean z, byte b);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setErrorMessage(java.lang.String str);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setHttpStatusCode(int i);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setMeasured(boolean z);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setMetric(java.lang.CharSequence charSequence, double d);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setMetric(java.lang.CharSequence charSequence, int i);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setMetric(java.lang.CharSequence charSequence, long j);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setResourceName(java.lang.CharSequence charSequence);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setResourceName(java.lang.CharSequence charSequence, byte b);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setSamplingPriority(int i, int i2);

    void setSpanName(java.lang.CharSequence charSequence);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setSpanType(java.lang.CharSequence charSequence);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, double d);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, int i);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, long j);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, java.lang.CharSequence charSequence);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, java.lang.Number number);

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, java.lang.Object obj);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, java.lang.String str2);

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setTag(java.lang.String str, boolean z);

    com.datadog.trace.api.TraceConfig traceConfig();
}
