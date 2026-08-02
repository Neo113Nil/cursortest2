package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class DynamicConfig<S extends com.datadog.trace.api.DynamicConfig.Snapshot> {
    com.datadog.android.trace.internal.compat.function.BiFunction<com.datadog.trace.api.DynamicConfig<S>.Builder, S, S> getHighSpeedVideoSizesFor;
    volatile S getOutputFormats;
    S getOutputMinFrameDuration;
    static final com.datadog.trace.logger.Logger getInputSizeshNQ4ISI = com.datadog.trace.logger.LoggerFactory.getLogger("ROOT");
    static final com.datadog.android.trace.internal.compat.function.Function<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> Camera2StreamConfigurationMap = new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.DynamicConfig$$ExternalSyntheticLambda0
        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.datadog.trace.api.DynamicConfig.getHighResolutionOutputSizeshNQ4ISI((java.util.Map.Entry) obj);
        }
    };
    static final com.datadog.android.trace.internal.compat.function.Function<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> getHighSpeedVideoFpsRanges = new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.DynamicConfig$$ExternalSyntheticLambda1
        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRangesFor((java.util.Map.Entry) obj);
        }
    };
    static final com.datadog.android.trace.internal.compat.function.Function<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> getHighSpeedVideoFpsRangesFor = new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.DynamicConfig$$ExternalSyntheticLambda2
        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.datadog.trace.api.DynamicConfig.getHighSpeedVideoSizes((java.util.Map.Entry) obj);
        }
    };
    static final com.datadog.android.trace.internal.compat.function.Function<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> getHighSpeedVideoSizes = new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.DynamicConfig$$ExternalSyntheticLambda3
        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.datadog.trace.api.DynamicConfig.Camera2StreamConfigurationMap((java.util.Map.Entry<java.lang.String, java.lang.String>) obj);
        }
    };
    static final com.datadog.android.trace.internal.compat.function.Function<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.trace.internal.compat.function.Function() { // from class: com.datadog.trace.api.DynamicConfig$$ExternalSyntheticLambda4
        @Override // com.datadog.android.trace.internal.compat.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRanges((java.util.Map.Entry) obj);
        }
    };

    private DynamicConfig(com.datadog.android.trace.internal.compat.function.BiFunction<com.datadog.trace.api.DynamicConfig<S>.Builder, S, S> biFunction) {
        this.getHighSpeedVideoSizesFor = biFunction;
    }

    public static com.datadog.trace.api.DynamicConfig<com.datadog.trace.api.DynamicConfig.Snapshot>.Builder create() {
        return new com.datadog.trace.api.DynamicConfig.Builder();
    }

    public static <S extends com.datadog.trace.api.DynamicConfig.Snapshot> com.datadog.trace.api.DynamicConfig<S>.Builder create(com.datadog.android.trace.internal.compat.function.BiFunction<com.datadog.trace.api.DynamicConfig<S>.Builder, S, S> biFunction) {
        return new com.datadog.trace.api.DynamicConfig.Builder();
    }

    public final S captureTraceConfig() {
        return this.getOutputFormats;
    }

    public final com.datadog.trace.api.DynamicConfig<S>.Builder initial() {
        return new com.datadog.trace.api.DynamicConfig.Builder(this.getOutputMinFrameDuration);
    }

    public final com.datadog.trace.api.DynamicConfig<S>.Builder current() {
        return new com.datadog.trace.api.DynamicConfig.Builder(this.getOutputFormats);
    }

    public final void resetTraceConfig() {
        this.getOutputFormats = this.getOutputMinFrameDuration;
        Camera2StreamConfigurationMap(this.getOutputMinFrameDuration);
    }

    public final java.lang.String toString() {
        return this.getOutputFormats.toString();
    }

    public final class Builder {
        java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
        java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;
        java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule> getHighSpeedVideoSizesFor;
        java.lang.Double getInputFormats;
        boolean getInputSizeshNQ4ISI;
        java.util.Map<java.lang.String, java.lang.String> getOutputMinFrameDuration;
        java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.TraceSamplingRule> getOutputStallDurationlomOqCM;

        Builder() {
        }

        Builder(com.datadog.trace.api.DynamicConfig.Snapshot snapshot) {
            this.getInputSizeshNQ4ISI = snapshot.getOutputMinFrameDuration;
            this.getHighSpeedVideoFpsRanges = snapshot.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = snapshot.getHighSpeedVideoFpsRangesFor;
            this.getOutputMinFrameDuration = snapshot.getHighSpeedVideoSizesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = snapshot.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = snapshot.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = snapshot.getHighResolutionOutputSizeshNQ4ISI;
            this.getInputFormats = snapshot.getInputSizeshNQ4ISI;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setRuntimeMetricsEnabled(boolean z) {
            this.getInputSizeshNQ4ISI = z;
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setLogsInjectionEnabled(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setDataStreamsEnabled(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setServiceMapping(java.util.Map<java.lang.String, java.lang.String> map) {
            return setServiceMapping(map.entrySet());
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setHeaderTags(java.util.Map<java.lang.String, java.lang.String> map) {
            if (com.datadog.trace.api.Config.get().getRequestHeaderTags().equals(map) && !com.datadog.trace.api.Config.get().getResponseHeaderTags().equals(map)) {
                this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.api.Config.get().getRequestHeaderTags();
                this.Camera2StreamConfigurationMap = com.datadog.trace.api.Config.get().getResponseHeaderTags();
                return this;
            }
            return setHeaderTags(map.entrySet());
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setBaggageMapping(java.util.Map<java.lang.String, java.lang.String> map) {
            return setBaggageMapping(map.entrySet());
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setServiceMapping(java.util.Collection<? extends java.util.Map.Entry<java.lang.String, java.lang.String>> collection) {
            this.getOutputMinFrameDuration = com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRanges(collection, com.datadog.trace.api.DynamicConfig.Camera2StreamConfigurationMap, com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRanges);
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setHeaderTags(java.util.Collection<? extends java.util.Map.Entry<java.lang.String, java.lang.String>> collection) {
            this.getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRanges(collection, com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRangesFor, com.datadog.trace.api.DynamicConfig.getHighSpeedVideoSizes);
            this.Camera2StreamConfigurationMap = com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRanges(collection, com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRangesFor, com.datadog.trace.api.DynamicConfig.getHighResolutionOutputSizeshNQ4ISI);
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setBaggageMapping(java.util.Collection<? extends java.util.Map.Entry<java.lang.String, java.lang.String>> collection) {
            this.getHighSpeedVideoSizes = com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRanges(collection, com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRangesFor, com.datadog.trace.api.DynamicConfig.getHighSpeedVideoFpsRanges);
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setTraceSampleRate(java.lang.Double d) {
            this.getInputFormats = d;
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setSpanSamplingRules(java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule> list) {
            this.getHighSpeedVideoSizesFor = list;
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S>.Builder setTraceSamplingRules(java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.TraceSamplingRule> list) {
            this.getOutputStallDurationlomOqCM = list;
            return this;
        }

        public final com.datadog.trace.api.DynamicConfig<S> apply() {
            S s = com.datadog.trace.api.DynamicConfig.this.getOutputFormats;
            S apply = com.datadog.trace.api.DynamicConfig.this.getHighSpeedVideoSizesFor.apply(this, s);
            if (s == null) {
                com.datadog.trace.api.DynamicConfig.this.getOutputMinFrameDuration = apply;
                com.datadog.trace.api.DynamicConfig.this.getOutputFormats = apply;
            } else {
                com.datadog.trace.api.DynamicConfig.this.getOutputFormats = apply;
                com.datadog.trace.api.DynamicConfig.Camera2StreamConfigurationMap(apply);
            }
            return com.datadog.trace.api.DynamicConfig.this;
        }
    }

    static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(java.util.Collection<? extends java.util.Map.Entry<java.lang.String, java.lang.String>> collection, com.datadog.android.trace.internal.compat.function.Function<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> function, com.datadog.android.trace.internal.compat.function.Function<java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.String> function2) {
        java.util.HashMap hashMap = new java.util.HashMap((collection.size() * 4) / 3);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : collection) {
            hashMap.put(function.apply(entry), function2.apply(entry));
        }
        return com.datadog.trace.util.CollectionUtils.tryMakeImmutableMap(hashMap);
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        return com.datadog.trace.util.Strings.trim(entry.getKey());
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        return com.datadog.trace.util.Strings.trim(entry.getValue());
    }

    static void Camera2StreamConfigurationMap(com.datadog.trace.api.DynamicConfig.Snapshot snapshot) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.datadog.trace.api.config.GeneralConfig.TRACE_DEBUG, java.lang.Boolean.valueOf(getInputSizeshNQ4ISI.isDebugEnabled()));
        hashMap.put(com.datadog.trace.api.config.GeneralConfig.RUNTIME_METRICS_ENABLED, java.lang.Boolean.valueOf(snapshot.getOutputMinFrameDuration));
        hashMap.put(com.datadog.trace.api.config.TraceInstrumentationConfig.LOGS_INJECTION_ENABLED, java.lang.Boolean.valueOf(snapshot.getHighSpeedVideoFpsRanges));
        hashMap.put(com.datadog.trace.api.config.GeneralConfig.DATA_STREAMS_ENABLED, java.lang.Boolean.valueOf(snapshot.getHighSpeedVideoFpsRangesFor));
        hashMap.put(com.datadog.trace.api.config.TracerConfig.SERVICE_MAPPING, snapshot.getHighSpeedVideoSizesFor);
        hashMap.put(com.datadog.trace.api.config.TracerConfig.REQUEST_HEADER_TAGS, snapshot.Camera2StreamConfigurationMap);
        hashMap.put(com.datadog.trace.api.config.TracerConfig.RESPONSE_HEADER_TAGS, snapshot.getHighSpeedVideoSizes);
        hashMap.put(com.datadog.trace.api.config.TracerConfig.BAGGAGE_MAPPING, snapshot.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.Double d = snapshot.getInputSizeshNQ4ISI;
        if (d != null) {
            hashMap.put("trace.sample.rate", d);
        }
        com.datadog.trace.api.ConfigCollector.get().putAll(hashMap, com.datadog.trace.api.ConfigOrigin.REMOTE);
    }

    public static class Snapshot implements com.datadog.trace.api.TraceConfig {
        final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
        final java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;
        final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizesFor;
        final java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.TraceSamplingRule> getInputFormats;
        final java.lang.Double getInputSizeshNQ4ISI;
        final java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule> getOutputFormats;
        final boolean getOutputMinFrameDuration;

        public Snapshot(com.datadog.trace.api.DynamicConfig<?>.Builder builder, com.datadog.trace.api.DynamicConfig.Snapshot snapshot) {
            this.getOutputMinFrameDuration = builder.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoFpsRangesFor;
            java.util.Map<java.lang.String, java.lang.String> map = builder.getOutputMinFrameDuration;
            this.getHighSpeedVideoSizesFor = map == null ? java.util.Collections.emptyMap() : map;
            java.util.Map<java.lang.String, java.lang.String> map2 = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = map2 == null ? java.util.Collections.emptyMap() : map2;
            java.util.Map<java.lang.String, java.lang.String> map3 = builder.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = map3 == null ? java.util.Collections.emptyMap() : map3;
            java.util.Map<java.lang.String, java.lang.String> map4 = builder.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = map4 == null ? java.util.Collections.emptyMap() : map4;
            this.getInputSizeshNQ4ISI = builder.getInputFormats;
            this.getOutputFormats = builder.getHighSpeedVideoSizesFor;
            this.getInputFormats = builder.getOutputStallDurationlomOqCM;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public boolean isRuntimeMetricsEnabled() {
            return this.getOutputMinFrameDuration;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public boolean isLogsInjectionEnabled() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public boolean isDataStreamsEnabled() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public java.util.Map<java.lang.String, java.lang.String> getServiceMapping() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public java.util.Map<java.lang.String, java.lang.String> getRequestHeaderTags() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public java.util.Map<java.lang.String, java.lang.String> getResponseHeaderTags() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public java.util.Map<java.lang.String, java.lang.String> getBaggageMapping() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public java.lang.Double getTraceSampleRate() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.SpanSamplingRule> getSpanSamplingRules() {
            return this.getOutputFormats;
        }

        @Override // com.datadog.trace.api.TraceConfig
        public java.util.List<? extends com.datadog.trace.api.sampling.SamplingRule.TraceSamplingRule> getTraceSamplingRules() {
            return this.getInputFormats;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicConfig{debugEnabled=");
            sb.append(com.datadog.trace.api.DynamicConfig.getInputSizeshNQ4ISI.isDebugEnabled());
            sb.append(", runtimeMetricsEnabled=");
            sb.append(this.getOutputMinFrameDuration);
            sb.append(", logsInjectionEnabled=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", dataStreamsEnabled=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", serviceMapping=");
            sb.append(this.getHighSpeedVideoSizesFor);
            sb.append(", requestHeaderTags=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", responseHeaderTags=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", baggageMapping=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", spanSamplingRules=");
            sb.append(this.getOutputFormats);
            sb.append(", traceSamplingRules=");
            sb.append(this.getInputFormats);
            sb.append(", traceSampleRate=");
            sb.append(this.getInputSizeshNQ4ISI);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    static java.lang.String getHighSpeedVideoSizes(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        return com.datadog.trace.util.Strings.trim(entry.getKey()).toLowerCase(java.util.Locale.ROOT);
    }

    static java.lang.String Camera2StreamConfigurationMap(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        java.lang.String trim = com.datadog.trace.util.Strings.trim(entry.getValue());
        if (!trim.isEmpty()) {
            return trim;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("http.request.headers.");
        sb.append(com.datadog.trace.util.Strings.normalizedHeaderTag(entry.getKey()));
        return sb.toString();
    }

    static java.lang.String getHighSpeedVideoFpsRanges(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        java.lang.String trim = com.datadog.trace.util.Strings.trim(entry.getValue());
        if (!trim.isEmpty()) {
            return trim;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("http.response.headers.");
        sb.append(com.datadog.trace.util.Strings.normalizedHeaderTag(entry.getKey()));
        return sb.toString();
    }
}
