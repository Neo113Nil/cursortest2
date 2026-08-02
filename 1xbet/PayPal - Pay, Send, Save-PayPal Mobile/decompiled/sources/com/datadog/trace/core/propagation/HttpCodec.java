package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class HttpCodec {
    public static final java.lang.String RUM_KEY_ACCOUNT_ID = "account_id";
    public static final java.lang.String RUM_KEY_USER_ID = "user_id";
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRanges = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.HttpCodec.class);

    public interface Extractor {
        default void cleanup() {
        }

        <C> com.datadog.trace.bootstrap.instrumentation.api.TagContext extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor);
    }

    public interface Injector {
        <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter);
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Injector createInjector(com.datadog.trace.api.Config config, java.util.Set<com.datadog.trace.api.TracePropagationStyle> set, java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.datadog.trace.core.propagation.HttpCodec.CompoundInjector(new java.util.ArrayList(getHighSpeedVideoFpsRanges(config, set, map).values()));
    }

    public static java.util.Map<com.datadog.trace.api.TracePropagationStyle, com.datadog.trace.core.propagation.HttpCodec.Injector> allInjectorsFor(com.datadog.trace.api.Config config, java.util.Map<java.lang.String, java.lang.String> map) {
        return getHighSpeedVideoFpsRanges(config, java.util.EnumSet.allOf(com.datadog.trace.api.TracePropagationStyle.class), map);
    }

    private static java.util.Map<com.datadog.trace.api.TracePropagationStyle, com.datadog.trace.core.propagation.HttpCodec.Injector> getHighSpeedVideoFpsRanges(com.datadog.trace.api.Config config, java.util.Set<com.datadog.trace.api.TracePropagationStyle> set, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.datadog.trace.api.TracePropagationStyle.class);
        for (com.datadog.trace.api.TracePropagationStyle tracePropagationStyle : set) {
            switch (com.datadog.trace.core.propagation.HttpCodec.AnonymousClass1.getHighSpeedVideoFpsRangesFor[tracePropagationStyle.ordinal()]) {
                case 1:
                    enumMap.put((java.util.EnumMap) tracePropagationStyle, (com.datadog.trace.api.TracePropagationStyle) com.datadog.trace.core.propagation.DatadogHttpCodec.newInjector(map));
                    break;
                case 2:
                    enumMap.put((java.util.EnumMap) tracePropagationStyle, (com.datadog.trace.api.TracePropagationStyle) com.datadog.trace.core.propagation.B3HttpCodec.newSingleInjector(config.isTracePropagationStyleB3PaddingEnabled()));
                    break;
                case 3:
                    enumMap.put((java.util.EnumMap) tracePropagationStyle, (com.datadog.trace.api.TracePropagationStyle) com.datadog.trace.core.propagation.B3HttpCodec.newMultiInjector(config.isTracePropagationStyleB3PaddingEnabled()));
                    break;
                case 4:
                    enumMap.put((java.util.EnumMap) tracePropagationStyle, (com.datadog.trace.api.TracePropagationStyle) com.datadog.trace.core.propagation.HaystackHttpCodec.Camera2StreamConfigurationMap(map));
                    break;
                case 5:
                    enumMap.put((java.util.EnumMap) tracePropagationStyle, (com.datadog.trace.api.TracePropagationStyle) com.datadog.trace.core.propagation.XRayHttpCodec.getHighSpeedVideoFpsRangesFor(map));
                    break;
                case 6:
                    enumMap.put((java.util.EnumMap) tracePropagationStyle, (com.datadog.trace.api.TracePropagationStyle) com.datadog.trace.core.propagation.NoneCodec.INJECTOR);
                    break;
                case 7:
                    enumMap.put((java.util.EnumMap) tracePropagationStyle, (com.datadog.trace.api.TracePropagationStyle) com.datadog.trace.core.propagation.W3CHttpCodec.newInjector(map));
                    break;
                default:
                    getHighSpeedVideoFpsRanges.debug("No implementation found to inject propagation style: {}", tracePropagationStyle);
                    break;
            }
        }
        return enumMap;
    }

    /* renamed from: com.datadog.trace.core.propagation.HttpCodec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.datadog.trace.api.TracePropagationStyle.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.datadog.trace.api.TracePropagationStyle.DATADOG.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.TracePropagationStyle.B3SINGLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.TracePropagationStyle.B3MULTI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.TracePropagationStyle.HAYSTACK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.TracePropagationStyle.XRAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.TracePropagationStyle.NONE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.TracePropagationStyle.TRACECONTEXT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static com.datadog.trace.core.propagation.HttpCodec.Extractor createExtractor(com.datadog.trace.api.Config config, com.datadog.android.trace.internal.compat.function.Supplier<com.datadog.trace.api.TraceConfig> supplier) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.datadog.trace.api.TracePropagationStyle tracePropagationStyle : config.getTracePropagationStylesToExtract()) {
            switch (com.datadog.trace.core.propagation.HttpCodec.AnonymousClass1.getHighSpeedVideoFpsRangesFor[tracePropagationStyle.ordinal()]) {
                case 1:
                    arrayList.add(com.datadog.trace.core.propagation.DatadogHttpCodec.newExtractor(config, supplier));
                    break;
                case 2:
                    arrayList.add(com.datadog.trace.core.propagation.B3HttpCodec.newSingleExtractor(config, supplier));
                    break;
                case 3:
                    arrayList.add(com.datadog.trace.core.propagation.B3HttpCodec.newMultiExtractor(config, supplier));
                    break;
                case 4:
                    arrayList.add(com.datadog.trace.core.propagation.HaystackHttpCodec.getHighSpeedVideoSizes(config, supplier));
                    break;
                case 5:
                    arrayList.add(com.datadog.trace.core.propagation.XRayHttpCodec.getHighSpeedVideoFpsRanges(config, supplier));
                    break;
                case 6:
                    arrayList.add(com.datadog.trace.core.propagation.NoneCodec.EXTRACTOR);
                    break;
                case 7:
                    arrayList.add(com.datadog.trace.core.propagation.W3CHttpCodec.newExtractor(config, supplier));
                    break;
                default:
                    getHighSpeedVideoFpsRanges.debug("No implementation found to extract propagation style: {}", tracePropagationStyle);
                    break;
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return com.datadog.trace.core.propagation.HttpCodec.StubExtractor.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (size == 1) {
            return (com.datadog.trace.core.propagation.HttpCodec.Extractor) arrayList.get(0);
        }
        return new com.datadog.trace.core.propagation.HttpCodec.CompoundExtractor(arrayList, config.isTracePropagationExtractFirst());
    }

    public static class CompoundInjector implements com.datadog.trace.core.propagation.HttpCodec.Injector {
        private final java.util.List<com.datadog.trace.core.propagation.HttpCodec.Injector> getHighSpeedVideoSizes;

        public CompoundInjector(java.util.List<com.datadog.trace.core.propagation.HttpCodec.Injector> list) {
            this.getHighSpeedVideoSizes = list;
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
            com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRanges.debug("Inject context {}", dDSpanContext);
            java.lang.String str = (java.lang.String) dDSpanContext.getTags().get("session_id");
            if (str != null) {
                dDSpanContext.getPropagationTags().updateRumSessionId(str);
            }
            java.util.Iterator<com.datadog.trace.core.propagation.HttpCodec.Injector> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                it.next().inject(dDSpanContext, c, setter);
            }
        }
    }

    static class StubExtractor implements com.datadog.trace.core.propagation.HttpCodec.Extractor {
        private static final com.datadog.trace.core.propagation.HttpCodec.StubExtractor getHighResolutionOutputSizeshNQ4ISI = new com.datadog.trace.core.propagation.HttpCodec.StubExtractor();

        @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
        public <C> com.datadog.trace.bootstrap.instrumentation.api.TagContext extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor) {
            return null;
        }

        private StubExtractor() {
        }
    }

    public static class CompoundExtractor implements com.datadog.trace.core.propagation.HttpCodec.Extractor {
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<com.datadog.trace.core.propagation.HttpCodec.Extractor> getHighSpeedVideoFpsRanges;

        public CompoundExtractor(java.util.List<com.datadog.trace.core.propagation.HttpCodec.Extractor> list, boolean z) {
            this.getHighSpeedVideoFpsRanges = list;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
        public <C> com.datadog.trace.bootstrap.instrumentation.api.TagContext extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor) {
            com.datadog.trace.core.propagation.HttpCodec.ExtractionCache extractionCache = new com.datadog.trace.core.propagation.HttpCodec.ExtractionCache(c, contextVisitor);
            java.util.Iterator<com.datadog.trace.core.propagation.HttpCodec.Extractor> it = this.getHighSpeedVideoFpsRanges.iterator();
            com.datadog.trace.core.propagation.ExtractedContext extractedContext = null;
            com.datadog.trace.bootstrap.instrumentation.api.TagContext tagContext = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.datadog.trace.bootstrap.instrumentation.api.TagContext extract = it.next().extract(extractionCache, extractionCache);
                if (extract instanceof com.datadog.trace.core.propagation.ExtractedContext) {
                    com.datadog.trace.core.propagation.ExtractedContext extractedContext2 = (com.datadog.trace.core.propagation.ExtractedContext) extract;
                    if (extractedContext == null) {
                        if (this.getHighResolutionOutputSizeshNQ4ISI) {
                            extractedContext = extractedContext2;
                            break;
                        }
                        extractedContext = extractedContext2;
                    } else if (com.datadog.trace.core.propagation.HttpCodec.getHighResolutionOutputSizeshNQ4ISI(extractedContext.getTraceId(), extractedContext2.getTraceId())) {
                        if (extract.getPropagationStyle() == com.datadog.trace.api.TracePropagationStyle.TRACECONTEXT) {
                            extractedContext.getPropagationTags().updateW3CTracestate(extractedContext2.getPropagationTags().getW3CTracestate());
                        }
                    } else {
                        extractedContext.addTerminatedContextLink(com.datadog.trace.core.DDSpanLink.from(extractedContext2));
                    }
                } else if (extract != null && tagContext == null) {
                    tagContext = extract;
                }
            }
            if (extractedContext != null) {
                com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRanges.debug("Extract complete context {}", extractedContext);
                return extractedContext;
            }
            if (tagContext != null) {
                com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRanges.debug("Extract incomplete context {}", tagContext);
                return tagContext;
            }
            com.datadog.trace.core.propagation.HttpCodec.getHighSpeedVideoFpsRanges.debug("Extract no context");
            return null;
        }
    }

    static class ExtractionCache<C> implements com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<com.datadog.trace.core.propagation.HttpCodec.ExtractionCache<?>> {
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(32);

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor
        public /* synthetic */ void forEachKey(com.datadog.trace.core.propagation.HttpCodec.ExtractionCache<?> extractionCache, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier keyClassifier) {
            java.util.List<java.lang.String> list = extractionCache.getHighSpeedVideoFpsRangesFor;
            for (int i = 0; i < list.size(); i += 2) {
                keyClassifier.accept(list.get(i), list.get(i + 1));
            }
        }

        public ExtractionCache(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor) {
            contextVisitor.forEachKey(c, this);
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier
        public boolean accept(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRangesFor.add(str);
            this.getHighSpeedVideoFpsRangesFor.add(str2);
            return true;
        }
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        try {
            return java.net.URLEncoder.encode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException unused) {
            getHighSpeedVideoFpsRanges.debug("Failed to encode value - {}", str);
            return str;
        }
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        return getHighResolutionOutputSizeshNQ4ISI(str).replace("+", "%20");
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, "UTF-8");
        } catch (java.io.UnsupportedEncodingException | java.lang.IllegalArgumentException unused) {
            getHighSpeedVideoFpsRanges.debug("Failed to decode value - {}", str);
            return str;
        }
    }

    static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        return indexOf == -1 ? str : str.substring(0, indexOf).trim();
    }

    static com.datadog.trace.core.propagation.Baggage getHighSpeedVideoFpsRanges(com.datadog.trace.core.DDSpanContext dDSpanContext) {
        com.datadog.trace.core.propagation.Baggage baggage = new com.datadog.trace.core.propagation.Baggage();
        java.lang.String str = (java.lang.String) dDSpanContext.getTags().get("session_id");
        if (str != null) {
            baggage.put("session.id", str);
        }
        java.lang.String str2 = (java.lang.String) dDSpanContext.getTags().get("user_id");
        if (str2 != null) {
            baggage.put("user.id", str2);
        }
        java.lang.String str3 = (java.lang.String) dDSpanContext.getTags().get(RUM_KEY_ACCOUNT_ID);
        if (str3 != null) {
            baggage.put(com.datadog.android.log.LogAttributes.ACCOUNT_ID, str3);
        }
        return baggage;
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.api.DDTraceId dDTraceId, com.datadog.trace.api.DDTraceId dDTraceId2) {
        if (((dDTraceId instanceof com.datadog.trace.api.DD128bTraceId) && (dDTraceId2 instanceof com.datadog.trace.api.DD128bTraceId)) || ((dDTraceId instanceof com.datadog.trace.api.DD64bTraceId) && (dDTraceId2 instanceof com.datadog.trace.api.DD64bTraceId))) {
            return dDTraceId.equals(dDTraceId2);
        }
        return dDTraceId.toLong() == dDTraceId2.toLong();
    }
}
