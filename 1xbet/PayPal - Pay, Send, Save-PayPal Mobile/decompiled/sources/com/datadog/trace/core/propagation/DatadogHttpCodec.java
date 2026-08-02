package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class DatadogHttpCodec {
    private static final com.datadog.trace.logger.Logger Camera2StreamConfigurationMap = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.DatadogHttpCodec.class);
    public static final java.lang.String DATADOG_TAGS_KEY = "x-datadog-tags";
    public static final java.lang.String ORIGIN_KEY = "x-datadog-origin";
    public static final java.lang.String SAMPLING_PRIORITY_KEY = "x-datadog-sampling-priority";
    public static final java.lang.String SPAN_ID_KEY = "x-datadog-parent-id";
    public static final java.lang.String TRACE_ID_KEY = "x-datadog-trace-id";

    private DatadogHttpCodec() {
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector newInjector(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.datadog.trace.core.propagation.DatadogHttpCodec.Injector(map);
    }

    static class Injector implements com.datadog.trace.core.propagation.HttpCodec.Injector {
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;

        public Injector(java.util.Map<java.lang.String, java.lang.String> map) {
            this.getHighSpeedVideoFpsRangesFor = map;
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
            setter.set(c, "x-datadog-trace-id", dDSpanContext.getTraceId().toString());
            setter.set(c, "x-datadog-parent-id", com.datadog.trace.api.DDSpanId.toString(dDSpanContext.getSpanId()));
            if (dDSpanContext.lockSamplingPriority()) {
                setter.set(c, "x-datadog-sampling-priority", java.lang.String.valueOf(dDSpanContext.getTraceSamplingPriority()));
            }
            java.lang.CharSequence origin = dDSpanContext.getOrigin();
            if (origin != null) {
                setter.set(c, "x-datadog-origin", origin.toString());
            }
            long endToEndStartTime = dDSpanContext.getEndToEndStartTime();
            if (endToEndStartTime > 0) {
                setter.set(c, "ot-baggage-t0", java.lang.Long.toString(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(endToEndStartTime)));
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : dDSpanContext.baggageItems()) {
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor.get(entry.getKey());
                if (str == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ot-baggage-");
                    sb.append(entry.getKey());
                    str = sb.toString();
                }
                setter.set(c, str, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRangesFor(entry.getValue()));
            }
            java.lang.String headerValue = dDSpanContext.getPropagationTags().headerValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG);
            if (headerValue != null) {
                setter.set(c, "x-datadog-tags", headerValue);
            }
            com.datadog.trace.core.propagation.Baggage highSpeedVideoFpsRanges = com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRanges(dDSpanContext);
            if (highSpeedVideoFpsRanges.isEmpty()) {
                return;
            }
            setter.set(c, "baggage", highSpeedVideoFpsRanges.toString());
        }
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Extractor newExtractor(final com.datadog.trace.api.Config config, com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier) {
        return new com.datadog.trace.core.propagation.TagContextExtractor(supplier, new com.datadog.trace.core.propagation.ContextInterpreter.Factory() { // from class: com.datadog.trace.core.propagation.DatadogHttpCodec$$ExternalSyntheticLambda0
            @Override // com.datadog.trace.core.propagation.ContextInterpreter.Factory
            public final com.datadog.trace.core.propagation.ContextInterpreter create() {
                return com.datadog.trace.core.propagation.DatadogHttpCodec.getHighSpeedVideoFpsRanges(com.datadog.trace.api.Config.this);
            }
        });
    }

    static /* synthetic */ com.datadog.trace.core.propagation.ContextInterpreter getHighSpeedVideoFpsRanges(com.datadog.trace.api.Config config) {
        return new com.datadog.trace.core.propagation.DatadogHttpCodec.DatadogContextInterpreter(config, (byte) 0);
    }

    static class DatadogContextInterpreter extends com.datadog.trace.core.propagation.ContextInterpreter {
        private final boolean getHighSpeedVideoFpsRanges;

        private DatadogContextInterpreter(com.datadog.trace.api.Config config) {
            super(config);
            this.getHighSpeedVideoFpsRanges = config.isAwsPropagationEnabled();
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public com.datadog.trace.api.TracePropagationStyle style() {
            return com.datadog.trace.api.TracePropagationStyle.DATADOG;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean accept(java.lang.String str, java.lang.String str2) {
            char c;
            if (str != null && !str.isEmpty()) {
                if (LOG_EXTRACT_HEADER_NAMES) {
                    com.datadog.trace.core.propagation.DatadogHttpCodec.Camera2StreamConfigurationMap.debug("Header: {}", str);
                }
                char lowerCase = java.lang.Character.toLowerCase(str.charAt(0));
                java.lang.String str3 = null;
                if (lowerCase != 'f') {
                    if (lowerCase == 'o') {
                        str3 = toLowerCase(str);
                        if ("ot-baggage-t0".equals(str3)) {
                            c = 5;
                        } else if (str3.startsWith("ot-baggage-")) {
                            c = 4;
                        }
                        if (c != 65535) {
                        }
                    } else if (lowerCase != 'u') {
                        if (lowerCase == 'x') {
                            if ("x-datadog-trace-id".equalsIgnoreCase(str)) {
                                c = 0;
                            } else if ("x-datadog-parent-id".equalsIgnoreCase(str)) {
                                c = 1;
                            } else if ("x-datadog-sampling-priority".equalsIgnoreCase(str)) {
                                c = 3;
                            } else if ("x-datadog-origin".equalsIgnoreCase(str)) {
                                c = 2;
                            } else {
                                if (this.getHighSpeedVideoFpsRanges && "X-Amzn-Trace-Id".equalsIgnoreCase(str)) {
                                    com.datadog.trace.core.propagation.XRayHttpCodec.XRayContextInterpreter.getHighSpeedVideoSizes(this, str2);
                                    return true;
                                }
                                if (handledXForwarding(str, str2)) {
                                    return true;
                                }
                                if ("x-datadog-tags".equalsIgnoreCase(str)) {
                                    c = 6;
                                }
                            }
                            if (c != 65535) {
                                if (str2 != null) {
                                    try {
                                        switch (c) {
                                            case 0:
                                                this.traceId = com.datadog.trace.api.DDTraceId.from(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                                break;
                                            case 1:
                                                this.spanId = com.datadog.trace.api.DDSpanId.from(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                                break;
                                            case 2:
                                                this.origin = com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2);
                                                break;
                                            case 3:
                                                this.samplingPriority = java.lang.Integer.parseInt(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                                break;
                                            case 4:
                                                if (this.baggage.isEmpty()) {
                                                    this.baggage = new java.util.TreeMap();
                                                }
                                                this.baggage.put(str3.substring(11), com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoSizes(str2));
                                                break;
                                            case 5:
                                                this.endToEndStartTime = getHighSpeedVideoSizes(com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2));
                                                break;
                                            case 6:
                                                this.propagationTags = this.propagationTagsFactory.fromHeaderValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG, str2);
                                                break;
                                        }
                                    } catch (java.lang.RuntimeException e) {
                                        invalidateContext();
                                        com.datadog.trace.core.propagation.DatadogHttpCodec.Camera2StreamConfigurationMap.debug("Exception when extracting context", (java.lang.Throwable) e);
                                        return false;
                                    }
                                }
                            } else {
                                if (handledIpHeaders(str, str2) || handleTags(str, str2)) {
                                    return true;
                                }
                                handleMappedBaggage(str, str2);
                            }
                        }
                    } else if (handledUserAgent(str, str2)) {
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

        private static long getHighSpeedVideoSizes(java.lang.String str) {
            try {
                return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.Long.parseLong(str));
            } catch (java.lang.RuntimeException e) {
                com.datadog.trace.core.propagation.DatadogHttpCodec.Camera2StreamConfigurationMap.debug("Ignoring invalid end-to-end start time {}", str, e);
                return 0L;
            }
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        protected com.datadog.trace.bootstrap.instrumentation.api.TagContext build() {
            if (this.traceId != com.datadog.trace.api.DDTraceId.ZERO && this.propagationTags != null) {
                long traceIdHighOrderBits = this.propagationTags.getTraceIdHighOrderBits();
                if (traceIdHighOrderBits != 0) {
                    this.traceId = com.datadog.trace.api.DD128bTraceId.from(traceIdHighOrderBits, this.traceId.toLong());
                }
            }
            return super.build();
        }

        /* synthetic */ DatadogContextInterpreter(com.datadog.trace.api.Config config, byte b) {
            this(config);
        }
    }
}
