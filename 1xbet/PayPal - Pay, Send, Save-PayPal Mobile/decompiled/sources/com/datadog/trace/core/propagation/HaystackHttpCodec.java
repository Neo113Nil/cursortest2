package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
class HaystackHttpCodec {
    private static final com.datadog.trace.logger.Logger getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.HaystackHttpCodec.class);

    private HaystackHttpCodec() {
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.datadog.trace.core.propagation.HaystackHttpCodec.Injector(map);
    }

    static class Injector implements com.datadog.trace.core.propagation.HttpCodec.Injector {
        private final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;

        public Injector(java.util.Map<java.lang.String, java.lang.String> map) {
            this.Camera2StreamConfigurationMap = map;
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
            java.lang.String str;
            try {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = dDSpanContext.getBaggageItems().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                    if ("Haystack-Trace-ID".equalsIgnoreCase(next.getKey())) {
                        str = next.getValue();
                        break;
                    }
                }
                if (str == null || !com.datadog.trace.api.DDTraceId.fromHex(com.datadog.trace.core.propagation.HaystackHttpCodec.Camera2StreamConfigurationMap(str)).equals(dDSpanContext.getTraceId())) {
                    str = com.datadog.trace.core.propagation.HaystackHttpCodec.getHighResolutionOutputSizeshNQ4ISI(dDSpanContext.getTraceId().toLong());
                }
                setter.set(c, "Trace-ID", str);
                dDSpanContext.setTag("Haystack-Trace-ID", str);
                setter.set(c, "Baggage-Datadog-Trace-Id", com.datadog.trace.core.propagation.HttpCodec.getHighResolutionOutputSizeshNQ4ISI(dDSpanContext.getTraceId().toString()));
                setter.set(c, "Span-ID", com.datadog.trace.core.propagation.HaystackHttpCodec.getHighResolutionOutputSizeshNQ4ISI(dDSpanContext.getSpanId()));
                setter.set(c, "Baggage-Datadog-Span-Id", com.datadog.trace.core.propagation.HttpCodec.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.api.DDSpanId.toString(dDSpanContext.getSpanId())));
                setter.set(c, "Parent-ID", com.datadog.trace.core.propagation.HaystackHttpCodec.getHighResolutionOutputSizeshNQ4ISI(dDSpanContext.getParentId()));
                setter.set(c, "Baggage-Datadog-Parent-Id", com.datadog.trace.core.propagation.HttpCodec.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.api.DDSpanId.toString(dDSpanContext.getParentId())));
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : dDSpanContext.baggageItems()) {
                    java.lang.String str2 = this.Camera2StreamConfigurationMap.get(entry.getKey());
                    if (str2 == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Baggage-");
                        sb.append(entry.getKey());
                        str2 = sb.toString();
                    }
                    setter.set(c, str2, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRangesFor(entry.getValue()));
                }
                com.datadog.trace.core.propagation.HaystackHttpCodec.getHighResolutionOutputSizeshNQ4ISI.debug("{} - Haystack parent context injected - {}", dDSpanContext.getTraceId(), str);
            } catch (java.lang.NumberFormatException e) {
                com.datadog.trace.core.propagation.HaystackHttpCodec.getHighResolutionOutputSizeshNQ4ISI.debug("Cannot parse context id(s): {} {}", dDSpanContext.getTraceId(), java.lang.Long.valueOf(dDSpanContext.getSpanId()), e);
            }
        }
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Extractor getHighSpeedVideoSizes(final com.datadog.trace.api.Config config, com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier) {
        return new com.datadog.trace.core.propagation.TagContextExtractor(supplier, new com.datadog.trace.core.propagation.ContextInterpreter.Factory() { // from class: com.datadog.trace.core.propagation.HaystackHttpCodec$$ExternalSyntheticLambda0
            @Override // com.datadog.trace.core.propagation.ContextInterpreter.Factory
            public final com.datadog.trace.core.propagation.ContextInterpreter create() {
                return com.datadog.trace.core.propagation.HaystackHttpCodec.Camera2StreamConfigurationMap(com.datadog.trace.api.Config.this);
            }
        });
    }

    static /* synthetic */ com.datadog.trace.core.propagation.ContextInterpreter Camera2StreamConfigurationMap(com.datadog.trace.api.Config config) {
        return new com.datadog.trace.core.propagation.HaystackHttpCodec.HaystackContextInterpreter(config, (byte) 0);
    }

    static class HaystackContextInterpreter extends com.datadog.trace.core.propagation.ContextInterpreter {
        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        protected int defaultSamplingPriority() {
            return 1;
        }

        private HaystackContextInterpreter(com.datadog.trace.api.Config config) {
            super(config);
        }

        @Override // com.datadog.trace.core.propagation.ContextInterpreter
        public com.datadog.trace.api.TracePropagationStyle style() {
            return com.datadog.trace.api.TracePropagationStyle.HAYSTACK;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean accept(java.lang.String str, java.lang.String str2) {
            java.lang.String lowerCase;
            char c;
            if (str != null && !str.isEmpty()) {
                if (LOG_EXTRACT_HEADER_NAMES) {
                    com.datadog.trace.core.propagation.HaystackHttpCodec.getHighResolutionOutputSizeshNQ4ISI.debug("Header: {}", str);
                }
                char lowerCase2 = java.lang.Character.toLowerCase(str.charAt(0));
                if (lowerCase2 != 'b') {
                    lowerCase = null;
                    if (lowerCase2 != 'f') {
                        if (lowerCase2 != 'p') {
                            if (lowerCase2 != 'x') {
                                switch (lowerCase2) {
                                    case 's':
                                        if ("Span-ID".equalsIgnoreCase(str)) {
                                            c = 1;
                                            if (65535 == c) {
                                                try {
                                                    if (com.datadog.trace.core.propagation.HttpCodec.Camera2StreamConfigurationMap(str2) != null) {
                                                        if (c == 0) {
                                                            this.traceId = com.datadog.trace.api.DD64bTraceId.fromHex(com.datadog.trace.core.propagation.HaystackHttpCodec.Camera2StreamConfigurationMap(str2));
                                                            getHighSpeedVideoFpsRanges("Haystack-Trace-ID", str2);
                                                        } else if (c == 1) {
                                                            this.spanId = com.datadog.trace.api.DDSpanId.fromHex(com.datadog.trace.core.propagation.HaystackHttpCodec.Camera2StreamConfigurationMap(str2));
                                                            getHighSpeedVideoFpsRanges("Haystack-Span-ID", str2);
                                                        } else if (c == 2) {
                                                            getHighSpeedVideoFpsRanges("Haystack-Parent-ID", str2);
                                                        } else if (c == 3) {
                                                            getHighSpeedVideoFpsRanges(lowerCase.substring(8), str2);
                                                        }
                                                    }
                                                    break;
                                                } catch (java.lang.RuntimeException e) {
                                                    invalidateContext();
                                                    com.datadog.trace.core.propagation.HaystackHttpCodec.getHighResolutionOutputSizeshNQ4ISI.debug("Exception when extracting context", (java.lang.Throwable) e);
                                                    return false;
                                                }
                                            } else if (!handledIpHeaders(str, str2) && !handleTags(str, str2)) {
                                                handleMappedBaggage(str, str2);
                                                break;
                                            }
                                        }
                                        break;
                                    case 't':
                                        if ("Trace-ID".equalsIgnoreCase(str)) {
                                            c = 0;
                                            if (65535 == c) {
                                            }
                                        }
                                        break;
                                    case 'u':
                                        if (handledUserAgent(str, str2)) {
                                        }
                                        break;
                                }
                                return true;
                            }
                            if (handledXForwarding(str, str2)) {
                                return true;
                            }
                        } else if ("Parent-ID".equalsIgnoreCase(str)) {
                            c = 2;
                            if (65535 == c) {
                            }
                        }
                    } else if (handledForwarding(str, str2)) {
                        return true;
                    }
                    c = 65535;
                    if (65535 == c) {
                    }
                } else {
                    lowerCase = toLowerCase(str);
                    if (lowerCase.startsWith("baggage-")) {
                        c = 3;
                        if (65535 == c) {
                        }
                    }
                    c = 65535;
                    if (65535 == c) {
                    }
                }
            }
            return true;
        }

        private void getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
            if (this.baggage.isEmpty()) {
                this.baggage = new java.util.TreeMap();
            }
            this.baggage.put(str, com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoSizes(str2));
        }

        /* synthetic */ HaystackContextInterpreter(com.datadog.trace.api.Config config, byte b) {
            this(config);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            if (!str.contains("-")) {
                return str.length() == 32 ? str.substring(16) : str;
            }
            java.lang.String[] split = str.split("-");
            if (split.length == 5) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(split[3]);
                sb.append(split[4]);
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid UUID format: ");
            sb2.append(str);
            throw new java.lang.NumberFormatException(sb2.toString());
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException("Exception when converting UUID to BigInteger: ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(long j) {
        java.lang.String format = java.lang.String.format("%016x", java.lang.Long.valueOf(j));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("44617461-646f-6721-");
        sb.append(format.substring(0, 4));
        sb.append("-");
        sb.append(format.substring(4));
        return sb.toString();
    }
}
