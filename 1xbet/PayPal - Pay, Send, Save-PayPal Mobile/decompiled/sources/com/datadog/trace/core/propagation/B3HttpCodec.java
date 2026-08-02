package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class B3HttpCodec {
    public static final java.lang.String B3_KEY = "b3";
    public static final java.lang.String SAMPLING_PRIORITY_KEY = "X-B3-Sampled";
    public static final java.lang.String SPAN_ID_KEY = "X-B3-SpanId";
    public static final java.lang.String TRACE_ID_KEY = "X-B3-TraceId";
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.B3HttpCodec.class);
    private static final java.lang.String getHighSpeedVideoFpsRanges = "1";
    private static final java.lang.String Camera2StreamConfigurationMap = "0";

    private B3HttpCodec() {
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector newCombinedInjector(boolean z) {
        return new com.datadog.trace.core.propagation.HttpCodec.CompoundInjector(java.util.Arrays.asList(newSingleInjector(z), newMultiInjector(z)));
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector newMultiInjector(boolean z) {
        return new com.datadog.trace.core.propagation.B3HttpCodec.B3MultiInjector(z);
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector newSingleInjector(boolean z) {
        return new com.datadog.trace.core.propagation.B3HttpCodec.B3SingleInjector(z);
    }

    static abstract class B3Injector implements com.datadog.trace.core.propagation.HttpCodec.Injector {
        private final boolean getHighSpeedVideoFpsRanges;

        public B3Injector(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
        }

        protected final java.lang.String getHighSpeedVideoSizes(com.datadog.trace.core.DDSpanContext dDSpanContext) {
            com.datadog.trace.api.DDTraceId traceId = dDSpanContext.getTraceId();
            if (this.getHighSpeedVideoFpsRanges || (traceId instanceof com.datadog.trace.api.DD128bTraceId)) {
                return traceId.toHexString();
            }
            if (traceId instanceof com.datadog.trace.core.propagation.B3TraceId) {
                return ((com.datadog.trace.core.propagation.B3TraceId) traceId).getOriginal();
            }
            return com.datadog.trace.api.DDSpanId.toHexString(traceId.toLong());
        }

        protected final java.lang.String getHighSpeedVideoFpsRangesFor(com.datadog.trace.core.DDSpanContext dDSpanContext) {
            long spanId = dDSpanContext.getSpanId();
            if (this.getHighSpeedVideoFpsRanges) {
                return com.datadog.trace.api.DDSpanId.toHexStringPadded(spanId);
            }
            return com.datadog.trace.api.DDSpanId.toHexString(spanId);
        }
    }

    static final class B3MultiInjector extends com.datadog.trace.core.propagation.B3HttpCodec.B3Injector {
        public B3MultiInjector(boolean z) {
            super(z);
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public final <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(dDSpanContext);
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(dDSpanContext);
            setter.set(c, "X-B3-TraceId", highSpeedVideoSizes);
            setter.set(c, "X-B3-SpanId", highSpeedVideoFpsRangesFor);
            if (dDSpanContext.lockSamplingPriority()) {
                setter.set(c, "X-B3-Sampled", com.datadog.trace.core.propagation.B3HttpCodec.Camera2StreamConfigurationMap(dDSpanContext.getTraceSamplingPriority()));
            }
            com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoSizes.debug("{} - B3 parent context injected - {} {}", dDSpanContext.getTraceId(), highSpeedVideoSizes, highSpeedVideoFpsRangesFor);
        }
    }

    static final class B3SingleInjector extends com.datadog.trace.core.propagation.B3HttpCodec.B3Injector {
        public B3SingleInjector(boolean z) {
            super(z);
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public final <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
            java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(dDSpanContext);
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(dDSpanContext);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
            sb.append(highSpeedVideoSizes);
            sb.append('-');
            sb.append(highSpeedVideoFpsRangesFor);
            if (dDSpanContext.lockSamplingPriority()) {
                java.lang.String Camera2StreamConfigurationMap = com.datadog.trace.core.propagation.B3HttpCodec.Camera2StreamConfigurationMap(dDSpanContext.getTraceSamplingPriority());
                sb.append('-');
                sb.append(Camera2StreamConfigurationMap);
            }
            java.lang.String obj = sb.toString();
            setter.set(c, "b3", obj);
            com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoSizes.debug("{} - B3 parent context injected - {}", dDSpanContext.getTraceId(), obj);
        }
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Extractor newMultiExtractor(final com.datadog.trace.api.Config config, com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier) {
        return new com.datadog.trace.core.propagation.TagContextExtractor(supplier, new com.datadog.trace.core.propagation.ContextInterpreter.Factory() { // from class: com.datadog.trace.core.propagation.B3HttpCodec$$ExternalSyntheticLambda1
            @Override // com.datadog.trace.core.propagation.ContextInterpreter.Factory
            public final com.datadog.trace.core.propagation.ContextInterpreter create() {
                return com.datadog.trace.core.propagation.B3HttpCodec.Camera2StreamConfigurationMap(com.datadog.trace.api.Config.this);
            }
        });
    }

    static /* synthetic */ com.datadog.trace.core.propagation.ContextInterpreter Camera2StreamConfigurationMap(com.datadog.trace.api.Config config) {
        return new com.datadog.trace.core.propagation.B3HttpCodec.B3MultiContextInterpreter(config, (byte) 0);
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Extractor newSingleExtractor(final com.datadog.trace.api.Config config, com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier) {
        return new com.datadog.trace.core.propagation.TagContextExtractor(supplier, new com.datadog.trace.core.propagation.ContextInterpreter.Factory() { // from class: com.datadog.trace.core.propagation.B3HttpCodec$$ExternalSyntheticLambda0
            @Override // com.datadog.trace.core.propagation.ContextInterpreter.Factory
            public final com.datadog.trace.core.propagation.ContextInterpreter create() {
                return com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoFpsRangesFor(com.datadog.trace.api.Config.this);
            }
        });
    }

    static /* synthetic */ com.datadog.trace.core.propagation.ContextInterpreter getHighSpeedVideoFpsRangesFor(com.datadog.trace.api.Config config) {
        return new com.datadog.trace.core.propagation.B3HttpCodec.B3SingleContextInterpreter(config);
    }

    static abstract class B3BaseContextInterpreter extends com.datadog.trace.core.propagation.ContextInterpreter {
        public B3BaseContextInterpreter(com.datadog.trace.api.Config config) {
            super(config);
        }

        protected final void getHighSpeedVideoSizes(java.lang.String str) {
            this.spanId = com.datadog.trace.api.DDSpanId.fromHex(str);
            if (this.tags.isEmpty()) {
                this.tags = new java.util.TreeMap();
            }
            this.tags.put("b3.spanid", str);
        }

        protected final boolean Camera2StreamConfigurationMap(java.lang.String str) {
            if (str.length() <= 32) {
                com.datadog.trace.api.DDTraceId fromHex = com.datadog.trace.core.propagation.B3TraceId.fromHex(str);
                if (fromHex.toLong() == 0) {
                    fromHex = com.datadog.trace.api.DDTraceId.ZERO;
                }
                this.traceId = fromHex;
                if (this.tags.isEmpty()) {
                    this.tags = new java.util.TreeMap();
                }
                this.tags.put("b3.traceid", str);
                return true;
            }
            com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoSizes.debug("Header {} exceeded max length of 32: {}", "X-B3-TraceId", str);
            this.traceId = com.datadog.trace.api.DDTraceId.ZERO;
            return false;
        }
    }

    static final class B3MultiContextInterpreter extends com.datadog.trace.core.propagation.B3HttpCodec.B3BaseContextInterpreter {
        private B3MultiContextInterpreter(com.datadog.trace.api.Config config) {
            super(config);
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public final com.datadog.trace.api.TracePropagationStyle style() {
            return com.datadog.trace.api.TracePropagationStyle.B3MULTI;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier
        public final boolean accept(java.lang.String str, java.lang.String str2) {
            if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                return true;
            }
            if (LOG_EXTRACT_HEADER_NAMES) {
                com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoSizes.debug("Header: {}", str);
            }
            try {
                char lowerCase = java.lang.Character.toLowerCase(str.charAt(0));
                if (lowerCase != 'f') {
                    if (lowerCase != 'u') {
                        if (lowerCase == 'x') {
                            if ("X-B3-TraceId".equalsIgnoreCase(str)) {
                                Camera2StreamConfigurationMap(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                return true;
                            }
                            if ("X-B3-SpanId".equalsIgnoreCase(str)) {
                                getHighSpeedVideoSizes(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                return true;
                            }
                            if ("X-B3-Sampled".equalsIgnoreCase(str)) {
                                this.samplingPriority = com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoFpsRanges(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                return true;
                            }
                            if (handledXForwarding(str, str2)) {
                                return true;
                            }
                        }
                    } else if (handledUserAgent(str, str2)) {
                        return true;
                    }
                } else if (handledForwarding(str, str2)) {
                    return true;
                }
                if (handledIpHeaders(str, str2)) {
                    return true;
                }
                handleTags(str, str2);
                return true;
            } catch (java.lang.RuntimeException e) {
                invalidateContext();
                com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoSizes.debug("Exception when extracting context", (java.lang.Throwable) e);
                return false;
            }
        }

        /* synthetic */ B3MultiContextInterpreter(com.datadog.trace.api.Config config, byte b) {
            this(config);
        }
    }

    static final class B3SingleContextInterpreter extends com.datadog.trace.core.propagation.B3HttpCodec.B3BaseContextInterpreter {
        public B3SingleContextInterpreter(com.datadog.trace.api.Config config) {
            super(config);
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public final com.datadog.trace.api.TracePropagationStyle style() {
            return com.datadog.trace.api.TracePropagationStyle.B3SINGLE;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier
        public final boolean accept(java.lang.String str, java.lang.String str2) {
            if (str != null) {
                try {
                    if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
                        if (LOG_EXTRACT_HEADER_NAMES) {
                            com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoSizes.debug("Header: {}", str);
                        }
                        if ("b3".equals(str)) {
                            java.lang.String Camera2StreamConfigurationMap = com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2);
                            if (Camera2StreamConfigurationMap.length() == 1) {
                                this.samplingPriority = com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
                            } else {
                                int indexOf = Camera2StreamConfigurationMap.indexOf("-");
                                int i = indexOf + 1;
                                int indexOf2 = Camera2StreamConfigurationMap.indexOf("-", i);
                                if (indexOf != -1 && !Camera2StreamConfigurationMap(Camera2StreamConfigurationMap.substring(0, indexOf))) {
                                    return false;
                                }
                                if (indexOf2 == -1) {
                                    getHighSpeedVideoSizes(Camera2StreamConfigurationMap.substring(i));
                                } else {
                                    getHighSpeedVideoSizes(Camera2StreamConfigurationMap.substring(i, indexOf2));
                                    this.samplingPriority = com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap.substring(indexOf2 + 1));
                                }
                            }
                            return true;
                        }
                        char lowerCase = java.lang.Character.toLowerCase(str.charAt(0));
                        if (lowerCase != 'f') {
                            if (lowerCase != 'u') {
                                if (lowerCase == 'x' && handledXForwarding(str, str2)) {
                                    return true;
                                }
                            } else if (handledUserAgent(str, str2)) {
                                return true;
                            }
                        } else if (handledForwarding(str, str2)) {
                            return true;
                        }
                        if (handledIpHeaders(str, str2)) {
                            return true;
                        }
                        handleTags(str, str2);
                        return true;
                    }
                } catch (java.lang.RuntimeException e) {
                    invalidateContext();
                    com.datadog.trace.core.propagation.B3HttpCodec.getHighSpeedVideoSizes.debug("Exception when extracting context", (java.lang.Throwable) e);
                    return false;
                }
            }
            return true;
        }
    }

    static /* synthetic */ int getHighSpeedVideoFpsRanges(java.lang.String str) {
        return "1".equals(str) ? 1 : 0;
    }

    static /* bridge */ /* synthetic */ java.lang.String Camera2StreamConfigurationMap(int i) {
        return i > 0 ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap;
    }
}
