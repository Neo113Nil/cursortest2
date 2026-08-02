package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public class TagContext implements com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted {
    private static final com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders Camera2StreamConfigurationMap = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders getHighSpeedVideoFpsRanges;
    private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;
    private com.datadog.trace.bootstrap.instrumentation.api.PathwayContext getHighSpeedVideoSizesFor;
    private java.lang.Object getInputFormats;
    private final com.datadog.trace.api.TracePropagationStyle getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private java.lang.Object getOutputMinFrameDuration;
    private final com.datadog.trace.api.TraceConfig getOutputSizes;
    private final java.util.Map<java.lang.String, java.lang.String> getOutputStallDuration;
    private java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> getOutputStallDurationlomOqCM;

    public static class HttpHeaders {
        public java.lang.String cfConnectingIp;
        public java.lang.String cfConnectingIpv6;
        public java.lang.String customIpHeader;
        public java.lang.String fastlyClientIp;
        public java.lang.String forwarded;
        public java.lang.String forwardedFor;
        public java.lang.String trueClientIp;
        public java.lang.String userAgent;
        public java.lang.String xClientIp;
        public java.lang.String xClusterClientIp;
        public java.lang.String xForwarded;
        public java.lang.String xForwardedFor;
        public java.lang.String xForwardedHost;
        public java.lang.String xForwardedPort;
        public java.lang.String xForwardedProto;
        public java.lang.String xRealIp;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public long getSpanId() {
        return 0L;
    }

    public TagContext() {
        this(null, null);
    }

    public TagContext(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this(str, map, null, null, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, null, com.datadog.trace.api.TracePropagationStyle.NONE);
    }

    public TagContext(java.lang.CharSequence charSequence, java.util.Map<java.lang.String, java.lang.String> map, com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders httpHeaders, java.util.Map<java.lang.String, java.lang.String> map2, int i, com.datadog.trace.api.TraceConfig traceConfig, com.datadog.trace.api.TracePropagationStyle tracePropagationStyle) {
        this.getHighSpeedVideoFpsRangesFor = charSequence;
        this.getOutputStallDuration = map;
        this.getOutputStallDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = httpHeaders == null ? Camera2StreamConfigurationMap : httpHeaders;
        this.getHighSpeedVideoSizes = map2 == null ? java.util.Collections.emptyMap() : map2;
        this.getOutputFormats = i;
        this.getOutputSizes = traceConfig;
        this.getInputSizeshNQ4ISI = tracePropagationStyle;
    }

    public com.datadog.trace.api.TraceConfig getTraceConfig() {
        return this.getOutputSizes;
    }

    public com.datadog.trace.api.TracePropagationStyle getPropagationStyle() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.lang.CharSequence getOrigin() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> getTerminatedContextLinks() {
        java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> list = this.getOutputStallDurationlomOqCM;
        return list == null ? java.util.Collections.emptyList() : list;
    }

    public void addTerminatedContextLink(com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink) {
        if (this.getOutputStallDurationlomOqCM == null) {
            this.getOutputStallDurationlomOqCM = new java.util.ArrayList();
        }
        this.getOutputStallDurationlomOqCM.add(agentSpanLink);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getForwarded() {
        return this.getHighSpeedVideoFpsRanges.forwarded;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getFastlyClientIp() {
        return this.getHighSpeedVideoFpsRanges.fastlyClientIp;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getCfConnectingIp() {
        return this.getHighSpeedVideoFpsRanges.cfConnectingIp;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getCfConnectingIpv6() {
        return this.getHighSpeedVideoFpsRanges.cfConnectingIpv6;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXForwardedProto() {
        return this.getHighSpeedVideoFpsRanges.xForwardedProto;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXForwardedHost() {
        return this.getHighSpeedVideoFpsRanges.xForwardedHost;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXForwardedPort() {
        return this.getHighSpeedVideoFpsRanges.xForwardedPort;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getForwardedFor() {
        return this.getHighSpeedVideoFpsRanges.forwardedFor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXForwarded() {
        return this.getHighSpeedVideoFpsRanges.xForwarded;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXForwardedFor() {
        return this.getHighSpeedVideoFpsRanges.xForwardedFor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXClusterClientIp() {
        return this.getHighSpeedVideoFpsRanges.xClusterClientIp;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXRealIp() {
        return this.getHighSpeedVideoFpsRanges.xRealIp;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getXClientIp() {
        return this.getHighSpeedVideoFpsRanges.xClientIp;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getUserAgent() {
        return this.getHighSpeedVideoFpsRanges.userAgent;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getTrueClientIp() {
        return this.getHighSpeedVideoFpsRanges.trueClientIp;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted
    public java.lang.String getCustomIpHeader() {
        return this.getHighSpeedVideoFpsRanges.customIpHeader;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getTags() {
        return this.getOutputStallDuration;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public final int getTraceSamplingPriority() {
        return this.getOutputFormats;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getBaggage() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>> baggageItems() {
        return this.getHighSpeedVideoSizes.entrySet();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public com.datadog.trace.api.DDTraceId getTraceId() {
        return com.datadog.trace.api.DDTraceId.ZERO;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentTrace getTrace() {
        return com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopAgentTrace.INSTANCE;
    }

    public final java.lang.Object getRequestContextDataAppSec() {
        return this.getOutputMinFrameDuration;
    }

    public final com.datadog.trace.bootstrap.instrumentation.api.TagContext withRequestContextDataAppSec(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        return this;
    }

    public final java.lang.Object getRequestContextDataIast() {
        return this.getInputFormats;
    }

    public final com.datadog.trace.bootstrap.instrumentation.api.TagContext withRequestContextDataIast(java.lang.Object obj) {
        this.getInputFormats = obj;
        return this;
    }

    public java.lang.Object getCiVisibilityContextData() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.datadog.trace.bootstrap.instrumentation.api.TagContext withCiVisibilityContextData(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        return this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public com.datadog.trace.bootstrap.instrumentation.api.PathwayContext getPathwayContext() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.datadog.trace.bootstrap.instrumentation.api.TagContext withPathwayContext(com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext) {
        this.getHighSpeedVideoSizesFor = pathwayContext;
        return this;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TagContext{");
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            sb.append("origin=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", ");
        }
        if (this.getOutputStallDuration != null) {
            sb.append("tags=");
            sb.append(this.getOutputStallDuration);
            sb.append(", ");
        }
        if (this.getHighSpeedVideoSizes != null) {
            sb.append("baggage=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", ");
        }
        if (this.getOutputFormats != -128) {
            sb.append("samplingPriority=");
            sb.append(this.getOutputFormats);
            sb.append(", ");
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
