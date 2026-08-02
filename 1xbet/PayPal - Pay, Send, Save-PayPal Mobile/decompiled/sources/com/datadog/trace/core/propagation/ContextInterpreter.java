package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public abstract class ContextInterpreter implements com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier {
    protected static final boolean LOG_EXTRACT_HEADER_NAMES = com.datadog.trace.api.Config.get().isLogExtractHeaderNames();
    private static final com.datadog.trace.api.cache.DDCache<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.api.cache.DDCaches.newFixedSizeCache(64);
    private final boolean Camera2StreamConfigurationMap;
    protected java.util.Map<java.lang.String, java.lang.String> baggage;
    protected java.util.Map<java.lang.String, java.lang.String> baggageMapping;
    protected long endToEndStartTime;
    protected boolean fullContext;
    private final boolean getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders getHighSpeedVideoSizesFor;
    private com.datadog.trace.api.TraceConfig getInputFormats;
    private final boolean getOutputFormats;
    protected java.util.Map<java.lang.String, java.lang.String> headerTags;
    protected java.lang.CharSequence origin;
    protected com.datadog.trace.core.propagation.PropagationTags propagationTags;
    protected final com.datadog.trace.core.propagation.PropagationTags.Factory propagationTagsFactory;
    protected int samplingPriority;
    protected long spanId;
    protected java.util.Map<java.lang.String, java.lang.String> tags;
    protected com.datadog.trace.api.DDTraceId traceId;
    protected boolean valid;

    public interface Factory {
        com.datadog.trace.core.propagation.ContextInterpreter create();
    }

    protected int defaultSamplingPriority() {
        return androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
    }

    public abstract com.datadog.trace.api.TracePropagationStyle style();

    protected static java.lang.String toLowerCase(java.lang.String str) {
        return getHighResolutionOutputSizeshNQ4ISI.computeIfAbsent(str, com.datadog.trace.api.Functions.LowerCase.INSTANCE);
    }

    protected ContextInterpreter(com.datadog.trace.api.Config config) {
        this.getHighSpeedVideoFpsRangesFor = config.getTraceClientIpHeader();
        this.getHighSpeedVideoFpsRanges = config.isTraceClientIpResolverEnabled();
        this.Camera2StreamConfigurationMap = config.isClientIpEnabled();
        this.propagationTagsFactory = com.datadog.trace.core.propagation.PropagationTags.factory(config);
        this.getOutputFormats = config.isRequestHeaderTagsCommaAllowed();
    }

    protected final boolean handledForwarding(java.lang.String str, java.lang.String str2) {
        if (str2 == null || !this.getHighSpeedVideoSizes) {
            return false;
        }
        if (!"forwarded".equalsIgnoreCase(str)) {
            if (!"forwarded-for".equalsIgnoreCase(str)) {
                return false;
            }
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
            }
            this.getHighSpeedVideoSizesFor.forwardedFor = str2;
            return true;
        }
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
        }
        this.getHighSpeedVideoSizesFor.forwarded = str2;
        return true;
    }

    protected final boolean handledXForwarding(java.lang.String str, java.lang.String str2) {
        if (str2 == null || !this.getHighSpeedVideoSizes) {
            return false;
        }
        if (!"x-forwarded-proto".equalsIgnoreCase(str)) {
            if (!"x-forwarded-host".equalsIgnoreCase(str)) {
                if (!"x-forwarded-for".equalsIgnoreCase(str)) {
                    if (!"x-forwarded-port".equalsIgnoreCase(str)) {
                        if (!"x-forwarded".equalsIgnoreCase(str)) {
                            return false;
                        }
                        if (this.getHighSpeedVideoSizesFor == null) {
                            this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                        }
                        this.getHighSpeedVideoSizesFor.xForwarded = str2;
                        return true;
                    }
                    if (this.getHighSpeedVideoSizesFor == null) {
                        this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                    }
                    this.getHighSpeedVideoSizesFor.xForwardedPort = str2;
                    return true;
                }
                if (this.getHighSpeedVideoSizesFor == null) {
                    this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                }
                this.getHighSpeedVideoSizesFor.xForwardedFor = str2;
                return true;
            }
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
            }
            this.getHighSpeedVideoSizesFor.xForwardedHost = str2;
            return true;
        }
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
        }
        this.getHighSpeedVideoSizesFor.xForwardedProto = str2;
        return true;
    }

    protected final boolean handledUserAgent(java.lang.String str, java.lang.String str2) {
        if (str2 == null || !"user-agent".equalsIgnoreCase(str)) {
            return false;
        }
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
        }
        this.getHighSpeedVideoSizesFor.userAgent = str2;
        return true;
    }

    protected final boolean handledIpHeaders(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str2 == null || (str3 = this.getHighSpeedVideoFpsRangesFor) == null || !str3.equalsIgnoreCase(str)) {
            if (str2 == null || !this.getHighSpeedVideoSizes) {
                return false;
            }
            if (java.lang.Character.toLowerCase(str.charAt(str.length() - 1)) == 'p') {
                if (!"x-cluster-client-ip".equalsIgnoreCase(str)) {
                    if (!"x-real-ip".equalsIgnoreCase(str)) {
                        if (!"x-client-ip".equalsIgnoreCase(str)) {
                            if (!"true-client-ip".equalsIgnoreCase(str)) {
                                if (!"fastly-client-ip".equalsIgnoreCase(str)) {
                                    if (!"cf-connecting-ip".equalsIgnoreCase(str)) {
                                        return false;
                                    }
                                    if (this.getHighSpeedVideoSizesFor == null) {
                                        this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                                    }
                                    this.getHighSpeedVideoSizesFor.cfConnectingIp = str2;
                                    return true;
                                }
                                if (this.getHighSpeedVideoSizesFor == null) {
                                    this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                                }
                                this.getHighSpeedVideoSizesFor.fastlyClientIp = str2;
                                return true;
                            }
                            if (this.getHighSpeedVideoSizesFor == null) {
                                this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                            }
                            this.getHighSpeedVideoSizesFor.trueClientIp = str2;
                            return true;
                        }
                        if (this.getHighSpeedVideoSizesFor == null) {
                            this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                        }
                        this.getHighSpeedVideoSizesFor.xClientIp = str2;
                        return true;
                    }
                    if (this.getHighSpeedVideoSizesFor == null) {
                        this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                    }
                    this.getHighSpeedVideoSizesFor.xRealIp = str2;
                    return true;
                }
                if (this.getHighSpeedVideoSizesFor == null) {
                    this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
                }
                this.getHighSpeedVideoSizesFor.xClusterClientIp = str2;
                return true;
            }
            if (!"cf-connecting-ipv6".equalsIgnoreCase(str)) {
                return false;
            }
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
            }
            this.getHighSpeedVideoSizesFor.cfConnectingIpv6 = str2;
            return true;
        }
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders();
        }
        this.getHighSpeedVideoSizesFor.customIpHeader = str2;
        return true;
    }

    protected final boolean handleTags(java.lang.String str, java.lang.String str2) {
        if (this.headerTags.isEmpty() || str2 == null) {
            return false;
        }
        java.lang.String str3 = this.headerTags.get(toLowerCase(str));
        if (str3 == null) {
            return false;
        }
        if (this.tags.isEmpty()) {
            this.tags = new java.util.TreeMap();
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.tags;
        if (!this.getOutputFormats) {
            str2 = com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2);
        }
        map.put(str3, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoSizes(str2));
        return true;
    }

    protected final boolean handleMappedBaggage(java.lang.String str, java.lang.String str2) {
        if (this.baggageMapping.isEmpty() || str2 == null) {
            return false;
        }
        java.lang.String str3 = this.baggageMapping.get(toLowerCase(str));
        if (str3 == null) {
            return false;
        }
        if (this.baggage.isEmpty()) {
            this.baggage = new java.util.TreeMap();
        }
        this.baggage.put(str3, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoSizes(str2));
        return true;
    }

    public com.datadog.trace.core.propagation.ContextInterpreter reset(com.datadog.trace.api.TraceConfig traceConfig) {
        this.getInputFormats = traceConfig;
        this.traceId = com.datadog.trace.api.DDTraceId.ZERO;
        this.spanId = 0L;
        this.samplingPriority = androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        this.origin = null;
        this.endToEndStartTime = 0L;
        this.tags = java.util.Collections.emptyMap();
        this.baggage = java.util.Collections.emptyMap();
        boolean z = true;
        this.valid = true;
        this.fullContext = true;
        this.getHighSpeedVideoSizesFor = null;
        if (!this.Camera2StreamConfigurationMap && (!this.getHighSpeedVideoFpsRanges || !com.datadog.trace.bootstrap.ActiveSubsystems.APPSEC_ACTIVE)) {
            z = false;
        }
        this.getHighSpeedVideoSizes = z;
        this.headerTags = traceConfig.getRequestHeaderTags();
        this.baggageMapping = traceConfig.getBaggageMapping();
        return this;
    }

    protected com.datadog.trace.bootstrap.instrumentation.api.TagContext build() {
        if (!this.valid) {
            return null;
        }
        if (this.fullContext && !com.datadog.trace.api.DDTraceId.ZERO.equals(this.traceId)) {
            if (this.propagationTags == null) {
                this.propagationTags = this.propagationTagsFactory.empty();
            }
            com.datadog.trace.api.DDTraceId dDTraceId = this.traceId;
            long j = this.spanId;
            int i = this.samplingPriority;
            if (i == -128 || com.datadog.trace.api.DDTraceId.ZERO.equals(dDTraceId)) {
                i = defaultSamplingPriority();
            }
            return new com.datadog.trace.core.propagation.ExtractedContext(dDTraceId, j, i, this.origin, this.endToEndStartTime, this.baggage, this.tags, this.getHighSpeedVideoSizesFor, this.propagationTags, this.getInputFormats, style());
        }
        if (this.origin == null && this.tags.isEmpty() && this.getHighSpeedVideoSizesFor == null && this.baggage.isEmpty() && this.samplingPriority == -128) {
            return null;
        }
        java.lang.CharSequence charSequence = this.origin;
        java.util.Map<java.lang.String, java.lang.String> map = this.tags;
        com.datadog.trace.bootstrap.instrumentation.api.TagContext.HttpHeaders httpHeaders = this.getHighSpeedVideoSizesFor;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.baggage;
        com.datadog.trace.api.DDTraceId dDTraceId2 = this.traceId;
        int i2 = this.samplingPriority;
        return new com.datadog.trace.bootstrap.instrumentation.api.TagContext(charSequence, map, httpHeaders, map2, (i2 == -128 || com.datadog.trace.api.DDTraceId.ZERO.equals(dDTraceId2)) ? defaultSamplingPriority() : i2, this.getInputFormats, style());
    }

    protected void invalidateContext() {
        this.valid = false;
    }

    protected void onlyTagContext() {
        this.fullContext = false;
    }
}
