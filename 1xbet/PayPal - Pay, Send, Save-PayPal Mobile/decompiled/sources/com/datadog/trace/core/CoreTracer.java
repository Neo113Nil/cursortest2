package com.datadog.trace.core;

/* loaded from: classes3.dex */
public class CoreTracer implements com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI {
    private final com.datadog.trace.core.taginterceptor.TagInterceptor AMEXKernel;
    private final com.datadog.trace.api.EndpointCheckpointerHolder ArtificialStackFrames;
    volatile long Camera2StreamConfigurationMap;
    private final com.datadog.trace.core.monitor.HealthMetrics CoroutineDebuggingKt;
    private final boolean _BOUNDARY;
    private final java.util.Map<java.lang.String, ?> _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final com.datadog.trace.core.PendingTraceBuffer f2926a;
    private final com.datadog.trace.api.IdGenerationStrategy accessartificialFrame;
    private final int b;
    private com.datadog.trace.api.profiling.Timer c;
    private final com.datadog.trace.api.DynamicConfig<com.datadog.trace.core.CoreTracer.ConfigSnapshot> coroutineBoundary;
    private boolean coroutineCreation;
    private final java.lang.Thread d;
    private final com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration getARTIFICIAL_FRAME_PACKAGE_NAME;
    final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;
    final com.datadog.trace.api.Config getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    final com.datadog.trace.common.sampling.Sampler getHighSpeedVideoSizes;
    final com.datadog.trace.core.PendingTrace.Factory getHighSpeedVideoSizesFor;
    final com.datadog.trace.logger.Logger getInputFormats;
    final com.datadog.trace.core.propagation.PropagationTags.Factory getInputSizeshNQ4ISI;
    volatile long getOutputFormats;
    final com.datadog.trace.common.metrics.MetricsAggregator getOutputMinFrameDuration;
    final long getOutputMinFrameDurationlomOqCM;
    final com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager getOutputSizes;
    final long getOutputSizeshNQ4ISI;
    final java.lang.String getOutputStallDuration;
    final com.datadog.trace.api.time.TimeSource getOutputStallDurationlomOqCM;
    private final boolean getValidOutputFormatsForInputhNQ4ISI;
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation init;
    final com.datadog.trace.common.writer.Writer isOutputSupportedFor;
    private final java.util.Map<java.lang.String, ?> isOutputSupportedForhNQ4ISI;
    private final com.datadog.trace.api.StatsDClient kernelVersion;
    final com.datadog.trace.monitor.Recording toString;
    private final boolean unwrapAs;

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.core.CoreTracer.ConfigSnapshot captureTraceConfig() {
        return this.coroutineBoundary.captureTraceConfig();
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public void onRootSpanFinished(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.api.EndpointTracker endpointTracker) {
        this.ArtificialStackFrames.onRootSpanFinished(agentSpan, endpointTracker);
    }

    @Override // com.datadog.trace.api.EndpointCheckpointer
    public com.datadog.trace.api.EndpointTracker onRootSpanStarted(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        return this.ArtificialStackFrames.onRootSpanStarted(agentSpan);
    }

    public static class CoreTracerBuilder {
        private com.datadog.trace.api.IdGenerationStrategy Camera2StreamConfigurationMap;
        private com.datadog.trace.core.propagation.HttpCodec.Extractor getHighResolutionOutputSizeshNQ4ISI;
        private com.datadog.trace.api.Config getHighSpeedVideoFpsRanges;
        private java.util.Map<java.lang.String, ?> getHighSpeedVideoFpsRangesFor;
        private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;
        private java.util.Map<java.lang.String, ?> getHighSpeedVideoSizesFor;
        private com.datadog.android.api.InternalLogger getInputFormats;
        private int getInputSizeshNQ4ISI;
        private boolean getOutputFormats;
        private com.datadog.trace.core.propagation.HttpCodec.Injector getOutputMinFrameDuration;
        private java.util.Map<java.lang.String, java.lang.String> getOutputMinFrameDurationlomOqCM;
        private com.datadog.trace.common.sampling.Sampler getOutputSizes;
        private java.lang.String getOutputSizeshNQ4ISI;
        private com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager getOutputStallDurationlomOqCM;
        private boolean isOutputSupportedFor;
        private com.datadog.trace.core.taginterceptor.TagInterceptor isOutputSupportedForhNQ4ISI;
        private com.datadog.trace.api.time.TimeSource toString;
        private java.util.Map<java.lang.String, java.lang.String> unwrapAs;
        private com.datadog.trace.common.writer.Writer getValidOutputFormatsForInputhNQ4ISI = new com.datadog.trace.common.writer.NoOpWriter();
        private com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration getOutputStallDuration = com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration.NoOp.INSTANCE;

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder serviceName(java.lang.String str) {
            this.getOutputSizeshNQ4ISI = str;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder writer(com.datadog.trace.common.writer.Writer writer) {
            this.getValidOutputFormatsForInputhNQ4ISI = writer;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder idGenerationStrategy(com.datadog.trace.api.IdGenerationStrategy idGenerationStrategy) {
            this.Camera2StreamConfigurationMap = idGenerationStrategy;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder sampler(com.datadog.trace.common.sampling.Sampler sampler) {
            this.getOutputSizes = sampler;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder extractor(com.datadog.trace.core.propagation.HttpCodec.Extractor extractor) {
            this.getHighResolutionOutputSizeshNQ4ISI = extractor;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder injector(com.datadog.trace.core.propagation.HttpCodec.Injector injector) {
            this.getOutputMinFrameDuration = injector;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder scopeManager(com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager agentScopeManager) {
            this.getOutputStallDurationlomOqCM = agentScopeManager;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder localRootSpanTags(java.util.Map<java.lang.String, ?> map) {
            this.getHighSpeedVideoSizesFor = com.datadog.trace.util.CollectionUtils.tryMakeImmutableMap(map);
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder defaultSpanTags(java.util.Map<java.lang.String, ?> map) {
            this.getHighSpeedVideoFpsRangesFor = com.datadog.trace.util.CollectionUtils.tryMakeImmutableMap(map);
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder serviceNameMappings(java.util.Map<java.lang.String, java.lang.String> map) {
            this.getOutputMinFrameDurationlomOqCM = com.datadog.trace.util.CollectionUtils.tryMakeImmutableMap(map);
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder taggedHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            this.unwrapAs = com.datadog.trace.util.CollectionUtils.tryMakeImmutableMap(map);
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder baggageMapping(java.util.Map<java.lang.String, java.lang.String> map) {
            this.getHighSpeedVideoSizes = com.datadog.trace.util.CollectionUtils.tryMakeImmutableMap(map);
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder partialFlushMinSpans(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder tagInterceptor(com.datadog.trace.core.taginterceptor.TagInterceptor tagInterceptor) {
            this.isOutputSupportedForhNQ4ISI = tagInterceptor;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder strictTraceWrites(boolean z) {
            this.isOutputSupportedFor = z;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder timeSource(com.datadog.trace.api.time.TimeSource timeSource) {
            this.toString = timeSource;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder injectBaggageAsTags(boolean z) {
            this.getOutputFormats = z;
            return this;
        }

        public CoreTracerBuilder(com.datadog.android.api.InternalLogger internalLogger) {
            config(com.datadog.trace.api.Config.get());
            this.getInputFormats = internalLogger;
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder withProperties(java.util.Properties properties) {
            return config(com.datadog.trace.api.Config.get(properties));
        }

        public com.datadog.trace.core.CoreTracer.CoreTracerBuilder config(com.datadog.trace.api.Config config) {
            this.getHighSpeedVideoFpsRanges = config;
            serviceName(config.getServiceName());
            sampler(com.datadog.trace.common.sampling.Sampler.Builder.forConfig(config, null));
            localRootSpanTags(config.getLocalRootSpanTags());
            defaultSpanTags(config.getMergedSpanTags());
            serviceNameMappings(config.getServiceMapping());
            taggedHeaders(config.getRequestHeaderTags());
            baggageMapping(config.getBaggageMapping());
            partialFlushMinSpans(config.getPartialFlushMinSpans());
            strictTraceWrites(config.isTraceStrictWritesEnabled());
            injectBaggageAsTags(config.isInjectBaggageAsTagsEnabled());
            injector(com.datadog.trace.core.propagation.HttpCodec.createInjector(config, config.getTracePropagationStylesToInject(), com.datadog.trace.core.CoreTracer.getHighSpeedVideoSizes(config.getBaggageMapping())));
            return this;
        }

        public com.datadog.trace.core.CoreTracer build() {
            return new com.datadog.trace.core.CoreTracer(this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputSizes, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDurationlomOqCM, this.unwrapAs, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.isOutputSupportedForhNQ4ISI, this.isOutputSupportedFor, this.toString, this.getOutputStallDuration, this.getOutputFormats, this.getInputFormats, (byte) 0);
        }
    }

    private CoreTracer(com.datadog.trace.api.Config config, java.lang.String str, com.datadog.trace.common.writer.Writer writer, com.datadog.trace.api.IdGenerationStrategy idGenerationStrategy, com.datadog.trace.common.sampling.Sampler sampler, com.datadog.trace.core.propagation.HttpCodec.Injector injector, com.datadog.trace.core.propagation.HttpCodec.Extractor extractor, com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager agentScopeManager, java.util.Map<java.lang.String, ?> map, java.util.Map<java.lang.String, ?> map2, java.util.Map<java.lang.String, java.lang.String> map3, java.util.Map<java.lang.String, java.lang.String> map4, java.util.Map<java.lang.String, java.lang.String> map5, int i, com.datadog.trace.core.taginterceptor.TagInterceptor tagInterceptor, boolean z, com.datadog.trace.api.time.TimeSource timeSource, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration profilingContextIntegration, boolean z2, com.datadog.android.api.InternalLogger internalLogger) {
        com.datadog.trace.common.sampling.TraceSamplingRules deserialize;
        com.datadog.trace.core.PendingTraceBuffer delaying;
        this.c = com.datadog.trace.api.profiling.Timer.NoOp.INSTANCE;
        this.getInputFormats = com.datadog.trace.logger.LoggerFactory.getLogger("CoreTracer", internalLogger);
        com.datadog.trace.api.time.TimeSource timeSource2 = timeSource == null ? com.datadog.trace.api.time.SystemTimeSource.INSTANCE : timeSource;
        this.getOutputStallDurationlomOqCM = timeSource2;
        this.getOutputMinFrameDurationlomOqCM = timeSource2.getCurrentTimeNanos();
        long nanoTicks = timeSource2.getNanoTicks();
        this.getOutputSizeshNQ4ISI = nanoTicks;
        this.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(1000000L, java.util.concurrent.TimeUnit.SECONDS.toNanos(config.getClockSyncPeriod()));
        this.getOutputFormats = nanoTicks;
        this.ArtificialStackFrames = com.datadog.trace.api.EndpointCheckpointerHolder.create();
        this.getOutputStallDuration = str;
        this.getHighSpeedVideoFpsRanges = config;
        this.getHighSpeedVideoSizes = sampler;
        if (config.getTraceSamplingRules() == null) {
            deserialize = com.datadog.trace.common.sampling.TraceSamplingRules.EMPTY;
        } else {
            deserialize = com.datadog.trace.common.sampling.TraceSamplingRules.deserialize(config.getTraceSamplingRules());
        }
        java.lang.String spanSamplingRules = config.getSpanSamplingRules();
        java.lang.String spanSamplingRulesFile = config.getSpanSamplingRulesFile();
        com.datadog.trace.common.sampling.SpanSamplingRules spanSamplingRules2 = com.datadog.trace.common.sampling.SpanSamplingRules.EMPTY;
        if (spanSamplingRules != null) {
            spanSamplingRules2 = com.datadog.trace.common.sampling.SpanSamplingRules.deserialize(spanSamplingRules);
        } else if (spanSamplingRulesFile != null) {
            spanSamplingRules2 = com.datadog.trace.common.sampling.SpanSamplingRules.deserializeFile(spanSamplingRulesFile);
        }
        this.coroutineBoundary = com.datadog.trace.api.DynamicConfig.create(new com.datadog.android.trace.internal.compat.function.BiFunction() { // from class: com.datadog.trace.core.CoreTracer$$ExternalSyntheticLambda0
            @Override // com.datadog.android.trace.internal.compat.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return com.datadog.trace.core.CoreTracer.this.getHighSpeedVideoFpsRangesFor((com.datadog.trace.api.DynamicConfig.Builder) obj, (com.datadog.trace.core.CoreTracer.ConfigSnapshot) obj2);
            }
        }).setRuntimeMetricsEnabled(config.isRuntimeMetricsEnabled()).setLogsInjectionEnabled(config.isLogsInjectionEnabled()).setDataStreamsEnabled(config.isDataStreamsEnabled()).setServiceMapping(map3).setHeaderTags(map4).setBaggageMapping(map5).setTraceSampleRate(config.getTraceSampleRate()).setSpanSamplingRules(spanSamplingRules2.getRules()).setTraceSamplingRules(deserialize.getRules()).apply();
        this._BOUNDARY = com.datadog.trace.api.InstrumenterConfig.get().isLogs128bTraceIdEnabled();
        this.isOutputSupportedForhNQ4ISI = map2;
        this.b = i;
        this.accessartificialFrame = idGenerationStrategy == null ? com.datadog.trace.api.Config.get().getIdGenerationStrategy() : idGenerationStrategy;
        this.kernelVersion = com.datadog.trace.api.StatsDClient.NO_OP;
        this.toString = com.datadog.trace.monitor.NoOpRecording.NO_OP;
        com.datadog.trace.core.monitor.HealthMetrics healthMetrics = com.datadog.trace.core.monitor.HealthMetrics.NO_OP;
        this.CoroutineDebuggingKt = healthMetrics;
        if (agentScopeManager == null) {
            this.getOutputSizes = new com.datadog.trace.core.scopemanager.ContinuableScopeManager(config.getScopeDepthLimit(), config.isScopeStrictMode(), config.isScopeInheritAsyncPropagation(), profilingContextIntegration, healthMetrics, internalLogger);
        } else {
            this.getOutputSizes = agentScopeManager;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = config.isSamplingMechanismValidationDisabled();
        this.isOutputSupportedFor = writer;
        if (z) {
            delaying = com.datadog.trace.core.PendingTraceBuffer.discarding(internalLogger);
        } else {
            delaying = com.datadog.trace.core.PendingTraceBuffer.delaying(timeSource2, config, healthMetrics);
        }
        com.datadog.trace.core.PendingTraceBuffer pendingTraceBuffer = delaying;
        this.f2926a = pendingTraceBuffer;
        this.getHighSpeedVideoSizesFor = new com.datadog.trace.core.PendingTrace.Factory(this, pendingTraceBuffer, timeSource2, z, healthMetrics);
        pendingTraceBuffer.start();
        writer.start();
        this.getOutputMinFrameDuration = com.datadog.trace.common.metrics.NoOpMetricsAggregator.INSTANCE;
        this.init = new com.datadog.trace.core.propagation.CorePropagation(extractor == null ? com.datadog.trace.core.propagation.HttpCodec.createExtractor(config, new com.datadog.android.trace.internal.compat.function.Supplier() { // from class: com.datadog.trace.core.CoreTracer$$ExternalSyntheticLambda1
            @Override // com.datadog.android.trace.internal.compat.function.Supplier
            public final java.lang.Object get() {
                return com.datadog.trace.core.CoreTracer.this.captureTraceConfig();
            }
        }) : extractor, injector, com.datadog.trace.core.propagation.HttpCodec.allInjectorsFor(config, getHighSpeedVideoSizes(map5)));
        this.AMEXKernel = tagInterceptor == null ? new com.datadog.trace.core.taginterceptor.TagInterceptor(new com.datadog.trace.core.taginterceptor.RuleFlags(config)) : tagInterceptor;
        com.datadog.trace.core.CoreTracer.ShutdownHook shutdownHook = new com.datadog.trace.core.CoreTracer.ShutdownHook(this, (byte) 0);
        this.d = shutdownHook;
        try {
            java.lang.Runtime.getRuntime().addShutdownHook(shutdownHook);
        } catch (java.lang.IllegalStateException unused) {
        }
        this.getInputSizeshNQ4ISI = com.datadog.trace.core.propagation.PropagationTags.factory(config);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = profilingContextIntegration;
        this.coroutineCreation = z2;
        this.unwrapAs = com.datadog.trace.api.naming.SpanNaming.instance().namingSchema().allowInferredServices();
        if (profilingContextIntegration != com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration.NoOp.INSTANCE) {
            java.util.HashMap hashMap = new java.util.HashMap(map);
            hashMap.put(com.datadog.trace.api.DDTags.PROFILING_CONTEXT_ENGINE, profilingContextIntegration.name());
            this._CREATION = com.datadog.trace.util.CollectionUtils.tryMakeImmutableMap(hashMap);
        } else {
            this._CREATION = map;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    final /* synthetic */ com.datadog.trace.core.CoreTracer.ConfigSnapshot getHighSpeedVideoFpsRangesFor(com.datadog.trace.api.DynamicConfig.Builder builder, com.datadog.trace.core.CoreTracer.ConfigSnapshot configSnapshot) {
        return new com.datadog.trace.core.CoreTracer.ConfigSnapshot(builder, configSnapshot);
    }

    protected void finalize() {
        java.lang.Thread thread = this.d;
        if (thread != null) {
            try {
                thread.run();
                java.lang.Runtime.getRuntime().removeShutdownHook(this.d);
            } catch (java.lang.IllegalStateException unused) {
            } catch (java.lang.Exception e) {
                this.getInputFormats.error("Error while finalizing DDTracer.", (java.lang.Throwable) e);
            }
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.core.CoreTracer.CoreSpanBuilder buildSpan(java.lang.String str, java.lang.CharSequence charSequence) {
        return new com.datadog.trace.core.CoreTracer.CoreSpanBuilder(str, charSequence, this);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence) {
        return buildSpan(str, charSequence).start();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence, long j) {
        return buildSpan(str, charSequence).withStartTimestamp(j).start();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context) {
        return buildSpan(str, charSequence).ignoreActiveSpan().asChildOf(context).start();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan startSpan(java.lang.String str, java.lang.CharSequence charSequence, com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context, long j) {
        return buildSpan(str, charSequence).ignoreActiveSpan().asChildOf(context).withStartTimestamp(j).start();
    }

    public com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateSpan(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        return this.getOutputSizes.activate(agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.INSTRUMENTATION, true);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateSpan(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource) {
        return this.getOutputSizes.activate(agentSpan, scopeSource);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateSpan(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, com.datadog.trace.bootstrap.instrumentation.api.ScopeSource scopeSource, boolean z) {
        return this.getOutputSizes.activate(agentSpan, scopeSource, z);
    }

    public com.datadog.trace.core.taginterceptor.TagInterceptor getTagInterceptor() {
        return this.AMEXKernel;
    }

    public int getPartialFlushMinSpans() {
        return this.b;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan activeSpan() {
        return this.getOutputSizes.activeSpan();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation propagate() {
        return this.init;
    }

    public java.lang.String getTraceId() {
        return getTraceId(activeSpan());
    }

    public java.lang.String getSpanId() {
        return getSpanId(activeSpan());
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public java.lang.String getTraceId(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        if (agentSpan != null && agentSpan.getTraceId() != null) {
            com.datadog.trace.api.DDTraceId traceId = agentSpan.getTraceId();
            if (this._BOUNDARY && traceId.toHighOrderLong() != 0) {
                return traceId.toHexString();
            }
            return traceId.toString();
        }
        return "0";
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public java.lang.String getSpanId(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        if (agentSpan != null) {
            return com.datadog.trace.api.DDSpanId.toString(agentSpan.getSpanId());
        }
        return "0";
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public void addScopeListener(com.datadog.trace.api.scopemanager.ScopeListener scopeListener) {
        com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager agentScopeManager = this.getOutputSizes;
        if (agentScopeManager instanceof com.datadog.trace.core.scopemanager.ContinuableScopeManager) {
            ((com.datadog.trace.core.scopemanager.ContinuableScopeManager) agentScopeManager).addScopeListener(scopeListener);
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI
    public void close() {
        this.f2926a.close();
        this.isOutputSupportedFor.close();
        this.kernelVersion.close();
        this.getOutputMinFrameDuration.close();
    }

    public void flush() {
        this.f2926a.flush();
        this.isOutputSupportedFor.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> java.util.Map<V, K> getHighSpeedVideoSizes(java.util.Map<K, V> map) {
        java.util.HashMap hashMap = new java.util.HashMap(map.size());
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public class CoreSpanBuilder implements com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder {
        private java.lang.Object Camera2StreamConfigurationMap;
        private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private java.lang.Object getHighSpeedVideoFpsRangesFor;
        private final java.lang.CharSequence getHighSpeedVideoSizesFor;
        private java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> getInputFormats;
        private final java.lang.String getInputSizeshNQ4ISI;
        private boolean getOutputFormats = false;
        private java.lang.String getOutputMinFrameDuration;
        private java.lang.String getOutputMinFrameDurationlomOqCM;
        private com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context getOutputSizes;
        private java.lang.CharSequence getOutputSizeshNQ4ISI;
        private java.lang.String getOutputStallDuration;
        private java.util.Map<java.lang.String, java.lang.Object> getOutputStallDurationlomOqCM;
        private long getValidOutputFormatsForInputhNQ4ISI;
        private final com.datadog.trace.core.CoreTracer isOutputSupportedFor;

        CoreSpanBuilder(java.lang.String str, java.lang.CharSequence charSequence, com.datadog.trace.core.CoreTracer coreTracer) {
            this.getInputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizesFor = charSequence;
            this.isOutputSupportedFor = coreTracer;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder ignoreActiveSpan() {
            this.getOutputFormats = true;
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withTag(java.lang.String str, java.lang.Number number) {
            return withTag(str, (java.lang.Object) number);
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withTag(java.lang.String str, java.lang.String str2) {
            if (str2 == null || str2.isEmpty()) {
                str2 = null;
            }
            return withTag(str, (java.lang.Object) str2);
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withTag(java.lang.String str, boolean z) {
            return withTag(str, (java.lang.Object) java.lang.Boolean.valueOf(z));
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withStartTimestamp(long j) {
            this.getValidOutputFormatsForInputhNQ4ISI = j;
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withServiceName(java.lang.String str) {
            this.getOutputMinFrameDurationlomOqCM = str;
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withResourceName(java.lang.String str) {
            this.getOutputStallDuration = str;
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withErrorFlag() {
            this.getHighSpeedVideoFpsRanges = true;
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withSpanType(java.lang.CharSequence charSequence) {
            this.getOutputSizeshNQ4ISI = charSequence;
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder asChildOf(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context) {
            this.getOutputSizes = context;
            return this;
        }

        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder asChildOf(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
            this.getOutputSizes = agentSpan.context();
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.core.CoreTracer.CoreSpanBuilder withTag(java.lang.String str, java.lang.Object obj) {
            if (str == null) {
                return this;
            }
            java.util.Map map = this.getOutputStallDurationlomOqCM;
            if (map == null) {
                map = new java.util.LinkedHashMap();
                this.getOutputStallDurationlomOqCM = map;
            }
            if (obj == null) {
                map.remove(str);
                return this;
            }
            map.put(str, obj);
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public <T> com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withRequestContextData(com.datadog.trace.api.gateway.RequestContextSlot requestContextSlot, T t) {
            int i = com.datadog.trace.core.CoreTracer.AnonymousClass1.getHighSpeedVideoFpsRangesFor[requestContextSlot.ordinal()];
            if (i == 1) {
                this.Camera2StreamConfigurationMap = t;
                return this;
            }
            if (i == 2) {
                this.getHighResolutionOutputSizeshNQ4ISI = t;
                return this;
            }
            if (i != 3) {
                return this;
            }
            this.getHighSpeedVideoFpsRangesFor = t;
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withLink(com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink) {
            if (agentSpanLink != null) {
                if (this.getInputFormats == null) {
                    this.getInputFormats = new java.util.ArrayList();
                }
                this.getInputFormats.add(agentSpanLink);
            }
            return this;
        }

        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder withOrigin(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.CharSequence] */
        @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder
        public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan start() {
            long j;
            int i;
            com.datadog.trace.api.DDTraceId dDTraceId;
            com.datadog.trace.core.propagation.PropagationTags propagationTags;
            int i2;
            long j2;
            com.datadog.trace.api.DDTraceId traceId;
            com.datadog.trace.core.propagation.PropagationTags propagationTags2;
            java.lang.String str;
            java.lang.Object obj;
            java.lang.Object obj2;
            java.lang.Object obj3;
            com.datadog.trace.core.CoreTracer.ConfigSnapshot configSnapshot;
            java.util.Map<java.lang.String, java.lang.String> map;
            java.util.Map<java.lang.String, java.lang.String> map2;
            com.datadog.trace.core.PendingTrace pendingTrace;
            long j3;
            java.lang.Object obj4;
            java.util.Map<java.lang.String, java.lang.String> map3;
            java.lang.String str2;
            com.datadog.trace.core.propagation.PropagationTags propagationTags3;
            java.util.Map<java.lang.String, ?> map4;
            java.lang.Object obj5;
            java.lang.Object obj6;
            java.lang.String str3;
            int i3;
            com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext;
            com.datadog.trace.bootstrap.instrumentation.api.AgentSpan activeSpan;
            com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context = this.getOutputSizes;
            if (context instanceof com.datadog.trace.bootstrap.instrumentation.api.TagContext) {
                java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> terminatedContextLinks = ((com.datadog.trace.bootstrap.instrumentation.api.TagContext) context).getTerminatedContextLinks();
                if (!terminatedContextLinks.isEmpty()) {
                    if (this.getInputFormats == null) {
                        this.getInputFormats = new java.util.ArrayList();
                    }
                    this.getInputFormats.addAll(terminatedContextLinks);
                }
            }
            java.lang.String str4 = this.getInputSizeshNQ4ISI;
            long j4 = this.getValidOutputFormatsForInputhNQ4ISI;
            long generateSpanId = com.datadog.trace.core.CoreTracer.this.accessartificialFrame.generateSpanId();
            com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context2 = this.getOutputSizes;
            if (context2 == null && !this.getOutputFormats && (activeSpan = com.datadog.trace.core.CoreTracer.this.getOutputSizes.activeSpan()) != null) {
                context2 = activeSpan.context();
            }
            if (context2 instanceof com.datadog.trace.core.DDSpanContext) {
                com.datadog.trace.core.DDSpanContext dDSpanContext = (com.datadog.trace.core.DDSpanContext) context2;
                dDTraceId = dDSpanContext.getTraceId();
                long spanId = dDSpanContext.getSpanId();
                java.util.Map<java.lang.String, java.lang.String> baggageItems = dDSpanContext.getBaggageItems();
                com.datadog.trace.core.PendingTrace trace = dDSpanContext.getTrace();
                java.lang.String serviceName = dDSpanContext.getServiceName();
                if (this.getOutputMinFrameDurationlomOqCM == null) {
                    this.getOutputMinFrameDurationlomOqCM = serviceName;
                }
                com.datadog.trace.api.gateway.RequestContext requestContext = dDSpanContext.getRequestContext();
                if (requestContext != null) {
                    java.lang.Object data = requestContext.getData(com.datadog.trace.api.gateway.RequestContextSlot.APPSEC);
                    obj4 = requestContext.getData(com.datadog.trace.api.gateway.RequestContextSlot.IAST);
                    obj6 = data;
                    obj5 = requestContext.getData(com.datadog.trace.api.gateway.RequestContextSlot.CI_VISIBILITY);
                } else {
                    obj6 = null;
                    obj4 = null;
                    obj5 = null;
                }
                propagationTags3 = com.datadog.trace.core.CoreTracer.this.getInputSizeshNQ4ISI.empty();
                j3 = spanId;
                map2 = baggageItems;
                pendingTrace = trace;
                str3 = serviceName;
                map4 = null;
                map3 = null;
                i3 = androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                str2 = null;
            } else {
                if (context2 instanceof com.datadog.trace.core.propagation.ExtractedContext) {
                    com.datadog.trace.core.propagation.ExtractedContext extractedContext = (com.datadog.trace.core.propagation.ExtractedContext) context2;
                    dDTraceId = extractedContext.getTraceId();
                    j = extractedContext.getSpanId();
                    i2 = extractedContext.getTraceSamplingPriority();
                    j2 = extractedContext.getEndToEndStartTime();
                    propagationTags = extractedContext.getPropagationTags();
                } else {
                    if (context2 != null) {
                        if (context2.getTraceId() != com.datadog.trace.api.DDTraceId.ZERO) {
                            traceId = context2.getTraceId();
                        } else {
                            traceId = com.datadog.trace.core.CoreTracer.this.accessartificialFrame.generateTraceId();
                        }
                        long spanId2 = context2.getSpanId();
                        i = context2.getTraceSamplingPriority();
                        j = spanId2;
                        dDTraceId = traceId;
                        propagationTags = com.datadog.trace.core.CoreTracer.this.getInputSizeshNQ4ISI.empty();
                    } else {
                        com.datadog.trace.api.DDTraceId generateTraceId = com.datadog.trace.core.CoreTracer.this.accessartificialFrame.generateTraceId();
                        com.datadog.trace.core.propagation.PropagationTags empty = com.datadog.trace.core.CoreTracer.this.getInputSizeshNQ4ISI.empty();
                        j = 0;
                        i = androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                        dDTraceId = generateTraceId;
                        propagationTags = empty;
                    }
                    i2 = i;
                    j2 = 0;
                }
                if (context2 instanceof com.datadog.trace.bootstrap.instrumentation.api.TagContext) {
                    com.datadog.trace.bootstrap.instrumentation.api.TagContext tagContext = (com.datadog.trace.bootstrap.instrumentation.api.TagContext) context2;
                    com.datadog.trace.core.CoreTracer.ConfigSnapshot configSnapshot2 = (com.datadog.trace.core.CoreTracer.ConfigSnapshot) tagContext.getTraceConfig();
                    java.util.Map<java.lang.String, java.lang.String> tags = tagContext.getTags();
                    ?? origin = tagContext.getOrigin();
                    java.util.Map<java.lang.String, java.lang.String> baggage = tagContext.getBaggage();
                    java.lang.Object requestContextDataAppSec = tagContext.getRequestContextDataAppSec();
                    java.lang.Object requestContextDataIast = tagContext.getRequestContextDataIast();
                    obj = tagContext.getCiVisibilityContextData();
                    propagationTags2 = propagationTags;
                    configSnapshot = configSnapshot2;
                    map = tags;
                    str = origin;
                    map2 = baggage;
                    obj2 = requestContextDataAppSec;
                    obj3 = requestContextDataIast;
                } else {
                    propagationTags2 = propagationTags;
                    str = this.getOutputMinFrameDuration;
                    obj = null;
                    obj2 = null;
                    obj3 = null;
                    configSnapshot = null;
                    map = null;
                    map2 = null;
                }
                java.util.Map<java.lang.String, ?> map5 = com.datadog.trace.core.CoreTracer.this._CREATION;
                com.datadog.trace.core.PendingTrace.Factory factory = com.datadog.trace.core.CoreTracer.this.getHighSpeedVideoSizesFor;
                java.lang.Object obj7 = obj;
                java.lang.Object obj8 = obj2;
                j3 = j;
                pendingTrace = new com.datadog.trace.core.PendingTrace(factory.getHighResolutionOutputSizeshNQ4ISI, dDTraceId, factory.getHighSpeedVideoFpsRanges, factory.getHighSpeedVideoFpsRangesFor, configSnapshot, factory.Camera2StreamConfigurationMap, factory.getHighSpeedVideoSizes, (byte) 0);
                if (j2 > 0) {
                    com.datadog.trace.core.PendingTrace.Camera2StreamConfigurationMap.compareAndSet(pendingTrace, 0L, j2);
                }
                obj4 = obj3;
                map3 = map;
                str2 = str;
                propagationTags3 = propagationTags2;
                map4 = map5;
                obj5 = obj7;
                obj6 = obj8;
                str3 = null;
                i3 = i2;
            }
            if (context2 != null && context2.getPathwayContext() != null && context2.getPathwayContext().isStarted()) {
                pathwayContext = context2.getPathwayContext();
            } else {
                pathwayContext = com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.NoopPathwayContext.INSTANCE;
            }
            com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext2 = pathwayContext;
            if (!com.datadog.trace.core.CoreTracer.this.unwrapAs) {
                com.datadog.trace.core.DDSpan rootSpan = pendingTrace.getRootSpan();
                this.getOutputMinFrameDurationlomOqCM = rootSpan != null ? rootSpan.getServiceName() : null;
            }
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                this.getOutputMinFrameDurationlomOqCM = com.datadog.trace.core.CoreTracer.this.getOutputStallDuration;
            }
            java.lang.CharSequence charSequence = this.getHighSpeedVideoSizesFor;
            if (charSequence == null) {
                charSequence = this.getOutputStallDuration;
            }
            java.util.Map<java.lang.String, java.lang.Object> map6 = this.getOutputStallDurationlomOqCM;
            int size = map6 == null ? 0 : map6.size();
            int size2 = com.datadog.trace.core.CoreTracer.this.isOutputSupportedForhNQ4ISI.size();
            int size3 = map3 == null ? 0 : map3.size();
            int size4 = map4 != null ? map4.size() : 0;
            java.lang.Object obj9 = this.Camera2StreamConfigurationMap;
            java.lang.Object obj10 = obj9 != null ? obj9 : obj6;
            java.lang.Object obj11 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj12 = obj11 != null ? obj11 : obj5;
            java.lang.Object obj13 = this.getHighSpeedVideoFpsRangesFor;
            com.datadog.trace.core.DDSpanContext dDSpanContext2 = new com.datadog.trace.core.DDSpanContext(dDTraceId, generateSpanId, j3, str3, this.getOutputMinFrameDurationlomOqCM, charSequence, this.getOutputStallDuration, i3, str2, map2, this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI, size + size2 + size3 + size4, pendingTrace, obj10, obj13 != null ? obj13 : obj4, obj12, pathwayContext2, com.datadog.trace.core.CoreTracer.this.getValidOutputFormatsForInputhNQ4ISI, propagationTags3, com.datadog.trace.core.CoreTracer.this.getARTIFICIAL_FRAME_PACKAGE_NAME, com.datadog.trace.core.CoreTracer.this.coroutineCreation);
            dDSpanContext2.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.CoreTracer.this.isOutputSupportedForhNQ4ISI);
            dDSpanContext2.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM);
            dDSpanContext2.getHighResolutionOutputSizeshNQ4ISI(map3);
            dDSpanContext2.getHighResolutionOutputSizeshNQ4ISI(map4);
            com.datadog.trace.core.DDSpan Camera2StreamConfigurationMap = com.datadog.trace.core.DDSpan.Camera2StreamConfigurationMap(str4, j4, dDSpanContext2, this.getInputFormats, this.isOutputSupportedFor.getHighResolutionOutputSizeshNQ4ISI);
            if (Camera2StreamConfigurationMap.isLocalRootSpan()) {
                Camera2StreamConfigurationMap.setEndpointTracker(this.isOutputSupportedFor.onRootSpanStarted(Camera2StreamConfigurationMap));
            }
            return Camera2StreamConfigurationMap;
        }
    }

    /* renamed from: com.datadog.trace.core.CoreTracer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.datadog.trace.api.gateway.RequestContextSlot.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.datadog.trace.api.gateway.RequestContextSlot.APPSEC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.gateway.RequestContextSlot.CI_VISIBILITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.datadog.trace.api.gateway.RequestContextSlot.IAST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static class ShutdownHook extends java.lang.Thread {
        private final java.lang.ref.WeakReference<com.datadog.trace.core.CoreTracer> getHighSpeedVideoFpsRangesFor;

        private ShutdownHook(com.datadog.trace.core.CoreTracer coreTracer) {
            super(com.datadog.trace.util.AgentThreadFactory.AGENT_THREAD_GROUP, "dd-tracer-shutdown-hook");
            this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(coreTracer);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.datadog.trace.core.CoreTracer coreTracer = this.getHighSpeedVideoFpsRangesFor.get();
            if (coreTracer != null) {
                coreTracer.close();
            }
        }

        /* synthetic */ ShutdownHook(com.datadog.trace.core.CoreTracer coreTracer, byte b) {
            this(coreTracer);
        }
    }

    protected class ConfigSnapshot extends com.datadog.trace.api.DynamicConfig.Snapshot {
        final com.datadog.trace.common.sampling.Sampler getOutputSizes;

        protected ConfigSnapshot(com.datadog.trace.api.DynamicConfig<com.datadog.trace.core.CoreTracer.ConfigSnapshot>.Builder builder, com.datadog.trace.core.CoreTracer.ConfigSnapshot configSnapshot) {
            super(builder, configSnapshot);
            if (configSnapshot == null) {
                this.getOutputSizes = com.datadog.trace.core.CoreTracer.this.getHighSpeedVideoSizes;
            } else if (java.util.Objects.equals(getTraceSampleRate(), configSnapshot.getTraceSampleRate())) {
                this.getOutputSizes = configSnapshot.getOutputSizes;
            } else {
                this.getOutputSizes = com.datadog.trace.common.sampling.Sampler.Builder.forConfig(com.datadog.trace.core.CoreTracer.this.getHighSpeedVideoFpsRanges, this);
            }
        }
    }

    /* synthetic */ CoreTracer(com.datadog.trace.api.Config config, java.lang.String str, com.datadog.trace.common.writer.Writer writer, com.datadog.trace.api.IdGenerationStrategy idGenerationStrategy, com.datadog.trace.common.sampling.Sampler sampler, com.datadog.trace.core.propagation.HttpCodec.Injector injector, com.datadog.trace.core.propagation.HttpCodec.Extractor extractor, com.datadog.trace.bootstrap.instrumentation.api.AgentScopeManager agentScopeManager, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, java.util.Map map5, int i, com.datadog.trace.core.taginterceptor.TagInterceptor tagInterceptor, boolean z, com.datadog.trace.api.time.TimeSource timeSource, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration profilingContextIntegration, boolean z2, com.datadog.android.api.InternalLogger internalLogger, byte b) {
        this(config, str, writer, idGenerationStrategy, sampler, injector, extractor, agentScopeManager, map, map2, map3, map4, map5, i, tagInterceptor, z, timeSource, profilingContextIntegration, z2, internalLogger);
    }
}
