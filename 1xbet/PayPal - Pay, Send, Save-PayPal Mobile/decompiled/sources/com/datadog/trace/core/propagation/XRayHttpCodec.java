package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
class XRayHttpCodec {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRanges = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.XRayHttpCodec.class);
    static final int getHighResolutionOutputSizeshNQ4ISI = 15;

    private XRayHttpCodec() {
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.datadog.trace.core.propagation.XRayHttpCodec.Injector(map);
    }

    static class Injector implements com.datadog.trace.core.propagation.HttpCodec.Injector {
        private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;

        public Injector(java.util.Map<java.lang.String, java.lang.String> map) {
            this.getHighSpeedVideoFpsRangesFor = map;
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
            long seconds;
            long endToEndStartTime = dDSpanContext.getEndToEndStartTime();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Root=1-");
            if (endToEndStartTime > 0) {
                seconds = java.util.concurrent.TimeUnit.NANOSECONDS.toSeconds(endToEndStartTime);
            } else {
                seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(dDSpanContext.getTrace().getTimeSource().getCurrentTimeMillis());
            }
            sb.append(java.lang.String.format("%08x", java.lang.Long.valueOf(seconds)));
            sb.append("-00000000");
            sb.append(dDSpanContext.getTraceId().toHexStringPadded(16));
            sb.append(";Parent=");
            sb.append(com.datadog.trace.api.DDSpanId.toHexStringPadded(dDSpanContext.getSpanId()));
            if (dDSpanContext.lockSamplingPriority()) {
                sb.append(";Sampled=");
                sb.append(dDSpanContext.getTraceSamplingPriority() > 0 ? '1' : com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            }
            int length = sb.length() + 256;
            java.lang.CharSequence origin = dDSpanContext.getOrigin();
            if (origin != null) {
                getHighResolutionOutputSizeshNQ4ISI(sb, com.datadog.trace.api.DDTags.ORIGIN_KEY, origin.toString(), length);
            }
            if (endToEndStartTime > 0) {
                getHighResolutionOutputSizeshNQ4ISI(sb, com.datadog.trace.api.DDTags.TRACE_START_TIME, java.lang.Long.toString(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(endToEndStartTime)), length);
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : dDSpanContext.baggageItems()) {
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor.get(entry.getKey());
                if (str == null) {
                    str = entry.getKey();
                }
                if (!"Root".equals(str) && !"Parent".equals(str) && !"Sampled".equals(str) && !"Self".equals(str)) {
                    getHighResolutionOutputSizeshNQ4ISI(sb, str, com.datadog.trace.core.propagation.HttpCodec.getHighResolutionOutputSizeshNQ4ISI(entry.getValue()), length);
                }
            }
            setter.set(c, "X-Amzn-Trace-Id", sb.toString());
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2, int i) {
            if (sb.length() + str.length() + str2.length() + 2 <= i) {
                sb.append(';');
                sb.append(str);
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static /* synthetic */ com.datadog.trace.core.propagation.ContextInterpreter getHighSpeedVideoFpsRanges(com.datadog.trace.api.Config config) {
        return new com.datadog.trace.core.propagation.XRayHttpCodec.XRayContextInterpreter(config, (byte) 0);
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Extractor getHighSpeedVideoFpsRanges(final com.datadog.trace.api.Config config, com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier) {
        return new com.datadog.trace.core.propagation.TagContextExtractor(supplier, new com.datadog.trace.core.propagation.ContextInterpreter.Factory() { // from class: com.datadog.trace.core.propagation.XRayHttpCodec$$ExternalSyntheticLambda0
            @Override // com.datadog.trace.core.propagation.ContextInterpreter.Factory
            public final com.datadog.trace.core.propagation.ContextInterpreter create() {
                return com.datadog.trace.core.propagation.XRayHttpCodec.getHighSpeedVideoFpsRanges(com.datadog.trace.api.Config.this);
            }
        });
    }

    static class XRayContextInterpreter extends com.datadog.trace.core.propagation.ContextInterpreter {
        private XRayContextInterpreter(com.datadog.trace.api.Config config) {
            super(config);
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public com.datadog.trace.api.TracePropagationStyle style() {
            return com.datadog.trace.api.TracePropagationStyle.XRAY;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier
        public boolean accept(java.lang.String str, java.lang.String str2) {
            java.lang.String str3;
            if (str == null || str.isEmpty()) {
                return true;
            }
            if (LOG_EXTRACT_HEADER_NAMES) {
                com.datadog.trace.core.propagation.XRayHttpCodec.getHighSpeedVideoFpsRanges.debug("Header: {}", str);
            }
            try {
                char lowerCase = java.lang.Character.toLowerCase(str.charAt(0));
                if (lowerCase != 'f') {
                    if (lowerCase != 'u') {
                        if (lowerCase == 'x') {
                            if ("X-Amzn-Trace-Id".equalsIgnoreCase(str)) {
                                getHighSpeedVideoSizes(this, str2);
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
                if (!this.baggageMapping.isEmpty() && (str3 = this.baggageMapping.get(toLowerCase(str))) != null) {
                    getHighSpeedVideoSizes(this, str3, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoSizes(str2));
                }
                return true;
            } catch (java.lang.RuntimeException e) {
                invalidateContext();
                com.datadog.trace.core.propagation.XRayHttpCodec.getHighSpeedVideoFpsRanges.debug("Exception when extracting context", (java.lang.Throwable) e);
                return false;
            }
        }

        static void getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ContextInterpreter contextInterpreter, java.lang.String str) {
            int indexOf;
            if (str == null || (indexOf = str.indexOf("Root=1-")) < 0 || !str.regionMatches(indexOf + com.datadog.trace.core.propagation.XRayHttpCodec.getHighResolutionOutputSizeshNQ4ISI, "-00000000", 0, 9)) {
                return;
            }
            int length = str.length();
            int i = 0;
            while (i < length) {
                int indexOf2 = str.indexOf(59, i);
                if (indexOf2 < 0) {
                    indexOf2 = length;
                }
                java.lang.String trim = str.substring(i, indexOf2).trim();
                if (trim.startsWith("Root=1-")) {
                    if (contextInterpreter.traceId == null || contextInterpreter.traceId == com.datadog.trace.api.DDTraceId.ZERO) {
                        contextInterpreter.traceId = com.datadog.trace.api.DD64bTraceId.fromHex(trim.substring(com.datadog.trace.core.propagation.XRayHttpCodec.getHighResolutionOutputSizeshNQ4ISI + 9));
                    }
                } else if (trim.startsWith("Parent=")) {
                    if (contextInterpreter.spanId == 0) {
                        contextInterpreter.spanId = com.datadog.trace.api.DDSpanId.fromHex(trim.substring(7));
                    }
                } else if (trim.startsWith("Sampled=")) {
                    if (contextInterpreter.samplingPriority == -128) {
                        contextInterpreter.samplingPriority = '1' == trim.charAt(8) ? 1 : 0;
                    }
                } else if (!trim.startsWith("Self=")) {
                    if (trim.startsWith("_dd.origin=")) {
                        contextInterpreter.origin = trim.substring(11);
                    } else if (trim.startsWith("t0=")) {
                        contextInterpreter.endToEndStartTime = getHighSpeedVideoFpsRanges(trim.substring(3));
                    } else {
                        int indexOf3 = trim.indexOf(61);
                        if (indexOf3 > 0) {
                            getHighSpeedVideoSizes(contextInterpreter, trim.substring(0, indexOf3), trim.substring(indexOf3 + 1));
                        }
                    }
                }
                i = indexOf2 + 1;
            }
        }

        private static long getHighSpeedVideoFpsRanges(java.lang.String str) {
            try {
                return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.Long.parseLong(str));
            } catch (java.lang.RuntimeException e) {
                com.datadog.trace.core.propagation.XRayHttpCodec.getHighSpeedVideoFpsRanges.debug("Ignoring invalid end-to-end start time {}", str, e);
                return 0L;
            }
        }

        private static void getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ContextInterpreter contextInterpreter, java.lang.String str, java.lang.String str2) {
            if (contextInterpreter.baggage.isEmpty()) {
                contextInterpreter.baggage = new java.util.TreeMap();
            }
            contextInterpreter.baggage.put(str, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoSizes(str2));
        }

        /* synthetic */ XRayContextInterpreter(com.datadog.trace.api.Config config, byte b) {
            this(config);
        }
    }
}
