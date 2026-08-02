package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class W3CHttpCodec {
    public static final java.lang.String BAGGAGE_KEY = "baggage";
    public static final java.lang.String TRACE_PARENT_KEY = "traceparent";
    public static final java.lang.String TRACE_STATE_KEY = "tracestate";
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.W3CHttpCodec.class);

    private W3CHttpCodec() {
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector newInjector(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.datadog.trace.core.propagation.W3CHttpCodec.Injector(map);
    }

    static class Injector implements com.datadog.trace.core.propagation.HttpCodec.Injector {
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;

        public Injector(java.util.Map<java.lang.String, java.lang.String> map) {
            this.getHighSpeedVideoFpsRangesFor = map;
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(55);
            sb.append("00-");
            sb.append(dDSpanContext.getTraceId().toHexString());
            sb.append("-");
            sb.append(com.datadog.trace.api.DDSpanId.toHexStringPadded(dDSpanContext.getSpanId()));
            sb.append(dDSpanContext.getTraceSamplingPriority() > 0 ? "-01" : "-00");
            setter.set(c, "traceparent", sb.toString());
            java.lang.String headerValue = dDSpanContext.getPropagationTags().headerValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C);
            if (headerValue != null && !headerValue.isEmpty()) {
                setter.set(c, "tracestate", headerValue);
            }
            long endToEndStartTime = dDSpanContext.getEndToEndStartTime();
            if (endToEndStartTime > 0) {
                setter.set(c, "ot-baggage-t0", java.lang.Long.toString(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(endToEndStartTime)));
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : dDSpanContext.baggageItems()) {
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor.get(entry.getKey());
                if (str == null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ot-baggage-");
                    sb2.append(entry.getKey());
                    str = sb2.toString();
                }
                setter.set(c, str, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRangesFor(entry.getValue()));
            }
            com.datadog.trace.core.propagation.Baggage highSpeedVideoFpsRanges = com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRanges(dDSpanContext);
            if (highSpeedVideoFpsRanges.isEmpty()) {
                return;
            }
            setter.set(c, "baggage", highSpeedVideoFpsRanges.toString());
        }
    }

    static /* synthetic */ com.datadog.trace.core.propagation.ContextInterpreter getHighSpeedVideoSizes(com.datadog.trace.api.Config config) {
        return new com.datadog.trace.core.propagation.W3CHttpCodec.W3CContextInterpreter(config, (byte) 0);
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Extractor newExtractor(final com.datadog.trace.api.Config config, com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier) {
        return new com.datadog.trace.core.propagation.TagContextExtractor(supplier, new com.datadog.trace.core.propagation.ContextInterpreter.Factory() { // from class: com.datadog.trace.core.propagation.W3CHttpCodec$$ExternalSyntheticLambda0
            @Override // com.datadog.trace.core.propagation.ContextInterpreter.Factory
            public final com.datadog.trace.core.propagation.ContextInterpreter create() {
                return com.datadog.trace.core.propagation.W3CHttpCodec.getHighSpeedVideoSizes(com.datadog.trace.api.Config.this);
            }
        });
    }

    static class W3CContextInterpreter extends com.datadog.trace.core.propagation.ContextInterpreter {
        private java.lang.String Camera2StreamConfigurationMap;
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        private W3CContextInterpreter(com.datadog.trace.api.Config config) {
            super(config);
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public com.datadog.trace.api.TracePropagationStyle style() {
            return com.datadog.trace.api.TracePropagationStyle.TRACECONTEXT;
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public com.datadog.trace.core.propagation.ContextInterpreter reset(com.datadog.trace.api.TraceConfig traceConfig) {
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            return super.reset(traceConfig);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean accept(java.lang.String str, java.lang.String str2) {
            char c;
            if (str != null && !str.isEmpty()) {
                if (LOG_EXTRACT_HEADER_NAMES) {
                    com.datadog.trace.core.propagation.W3CHttpCodec.getHighSpeedVideoFpsRangesFor.debug("Header: {}", str);
                }
                char lowerCase = java.lang.Character.toLowerCase(str.charAt(0));
                java.lang.String str3 = null;
                if (lowerCase != 'f') {
                    if (lowerCase == 'o') {
                        str3 = toLowerCase(str);
                        if ("ot-baggage-t0".equals(str3)) {
                            c = 3;
                        } else if (str3.startsWith("ot-baggage-")) {
                            c = 2;
                        }
                        if (c != 65535) {
                        }
                    } else if (lowerCase != 'x') {
                        if (lowerCase == 't') {
                            if ("traceparent".equalsIgnoreCase(str)) {
                                c = 0;
                            } else if ("tracestate".equalsIgnoreCase(str)) {
                                c = 1;
                            }
                            if (c != 65535) {
                                if (str2 != null) {
                                    try {
                                        if (c == 0) {
                                            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str2);
                                            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                                                this.getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
                                            } else {
                                                if (com.datadog.trace.core.propagation.W3CHttpCodec.getHighSpeedVideoFpsRangesFor.isDebugEnabled()) {
                                                    com.datadog.trace.core.propagation.W3CHttpCodec.getHighSpeedVideoFpsRangesFor.debug("Multiple traceparent headers. Had '{}' and got '{}'", this.getHighResolutionOutputSizeshNQ4ISI, Camera2StreamConfigurationMap);
                                                }
                                                onlyTagContext();
                                            }
                                            return true;
                                        }
                                        if (c == 1) {
                                            java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str2);
                                            if (!Camera2StreamConfigurationMap2.isEmpty()) {
                                                if (this.Camera2StreamConfigurationMap != null) {
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    sb.append(this.Camera2StreamConfigurationMap);
                                                    sb.append(",");
                                                    sb.append(Camera2StreamConfigurationMap2);
                                                    Camera2StreamConfigurationMap2 = sb.toString();
                                                }
                                                this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2;
                                            }
                                            return true;
                                        }
                                        if (c == 2) {
                                            if (this.baggage.isEmpty()) {
                                                this.baggage = new java.util.TreeMap();
                                            }
                                            this.baggage.put(str3.substring(11), com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoSizes(str2));
                                        } else if (c == 3) {
                                            this.endToEndStartTime = getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                        }
                                    } catch (java.lang.RuntimeException e) {
                                        invalidateContext();
                                        com.datadog.trace.core.propagation.W3CHttpCodec.getHighSpeedVideoFpsRangesFor.debug("Exception when extracting context", (java.lang.Throwable) e);
                                        return false;
                                    }
                                }
                            } else {
                                if (handledIpHeaders(str, str2) || handleTags(str, str2)) {
                                    return true;
                                }
                                handleMappedBaggage(str, str2);
                            }
                        } else if (lowerCase == 'u' && handledUserAgent(str, str2)) {
                            return true;
                        }
                    } else if (handledXForwarding(str, str2)) {
                        return true;
                    }
                } else if (handledForwarding(str, str2)) {
                    return true;
                }
                c = 65535;
                if (c != 65535) {
                }
            }
            return true;
        }

        private static long getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            try {
                return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.Long.parseLong(str));
            } catch (java.lang.RuntimeException e) {
                com.datadog.trace.core.propagation.W3CHttpCodec.getHighSpeedVideoFpsRangesFor.debug("Ignoring invalid end-to-end start time {}", str, e);
                return 0L;
            }
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        protected com.datadog.trace.bootstrap.instrumentation.api.TagContext build() {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null && this.Camera2StreamConfigurationMap == null) {
                onlyTagContext();
            }
            if (this.valid && this.fullContext) {
                try {
                    java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (str == null && this.Camera2StreamConfigurationMap != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Found no traceparent header but tracestate header '");
                        sb.append(this.Camera2StreamConfigurationMap);
                        sb.append("'");
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    int length = str == null ? 0 : str.length();
                    if (length < 55) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The length of traceparent '");
                        sb2.append(str);
                        sb2.append("' is too short");
                        throw new java.lang.IllegalStateException(sb2.toString());
                    }
                    long parseUnsignedLongHex = com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str, 0, 2, true);
                    if (parseUnsignedLongHex == 255) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Illegal version number ");
                        sb3.append(str.substring(0, 2));
                        throw new java.lang.IllegalStateException(sb3.toString());
                    }
                    if (parseUnsignedLongHex == 0 && length > 55) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("The length of traceparent '");
                        sb4.append(str);
                        sb4.append("' is too long");
                        throw new java.lang.IllegalStateException(sb4.toString());
                    }
                    com.datadog.trace.api.DD128bTraceId fromHex = com.datadog.trace.api.DD128bTraceId.fromHex(str, 3, 32, true);
                    if (fromHex.toLong() == 0) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Illegal all zero 64 bit trace id ");
                        sb5.append(str.substring(3, 35));
                        throw new java.lang.IllegalStateException(sb5.toString());
                    }
                    this.traceId = fromHex;
                    this.spanId = com.datadog.trace.api.DDSpanId.fromHex(str, 36, 16, true);
                    if (this.spanId == 0) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Illegal all zero span id ");
                        sb6.append(str.substring(36, 52));
                        throw new java.lang.IllegalStateException(sb6.toString());
                    }
                    if (parseUnsignedLongHex != 0 && length > 55 && str.charAt(55) != '-') {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Illegal character after flags in '");
                        sb7.append(str);
                        sb7.append("'");
                        throw new java.lang.IllegalStateException(sb7.toString());
                    }
                    if ((com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str, 53, 2, true) & 1) != 0) {
                        this.samplingPriority = 1;
                    } else {
                        this.samplingPriority = 0;
                    }
                    java.lang.String str2 = this.Camera2StreamConfigurationMap;
                    if (str2 == null || str2.isEmpty()) {
                        this.propagationTags = this.propagationTagsFactory.empty();
                    } else {
                        this.propagationTags = this.propagationTagsFactory.fromHeaderValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C, str2);
                    }
                    int samplingPriority = this.propagationTags.getSamplingPriority();
                    int i = this.samplingPriority;
                    if ((i == 0 && samplingPriority > 0) || ((i == 1 && samplingPriority <= 0) || samplingPriority == -128)) {
                        this.propagationTags.updateTraceSamplingPriority(i, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    } else {
                        this.samplingPriority = samplingPriority;
                    }
                    this.origin = this.propagationTags.getOrigin();
                    this.propagationTags.updateTraceIdHighOrderBits(this.traceId.toHighOrderLong());
                } catch (java.lang.RuntimeException e) {
                    onlyTagContext();
                    com.datadog.trace.core.propagation.W3CHttpCodec.getHighSpeedVideoFpsRangesFor.debug("Exception when building context", (java.lang.Throwable) e);
                }
            }
            return super.build();
        }

        private static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
            char charAt;
            if (str == null) {
                return "";
            }
            int length = str.length() - 1;
            if (length == 0) {
                return str;
            }
            int i = 0;
            while (i <= length && ((charAt = str.charAt(i)) == '\t' || charAt == ' ')) {
                i++;
            }
            int i2 = length;
            while (i2 > i) {
                char charAt2 = str.charAt(i2);
                if (charAt2 != '\t' && charAt2 != ' ') {
                    break;
                }
                i2--;
            }
            return (i == 0 && i2 == length) ? str : str.substring(i, i2 + 1);
        }

        /* synthetic */ W3CContextInterpreter(com.datadog.trace.api.Config config, byte b) {
            this(config);
        }
    }
}
