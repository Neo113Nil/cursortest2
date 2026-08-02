package com.datadog.trace.core;

/* loaded from: classes3.dex */
public class DDSpanContext implements com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context, com.datadog.trace.api.gateway.RequestContext, com.datadog.trace.api.internal.TraceSegment, com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext {
    public static final java.lang.String PRIORITY_SAMPLING_KEY = "_sampling_priority_v1";
    public static final java.lang.String SAMPLE_RATE_KEY = "_sample_rate";
    public static final java.lang.String SPAN_SAMPLING_MAX_PER_SECOND_TAG = "_dd.span_sampling.max_per_second";
    public static final java.lang.String SPAN_SAMPLING_MECHANISM_TAG = "_dd.span_sampling.mechanism";
    public static final java.lang.String SPAN_SAMPLING_RULE_RATE_TAG = "_dd.span_sampling.rule_rate";
    private volatile boolean AMEXKernel;
    private volatile java.lang.CharSequence ArtificialStackFrames;
    private volatile java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap;
    private final com.datadog.trace.core.propagation.PropagationTags CoroutineDebuggingKt;
    private volatile byte _BOUNDARY;
    private final long _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private volatile java.lang.String f2927a;
    private final java.lang.Object accessartificialFrame;
    private volatile java.lang.CharSequence b;
    private final long c;
    private final com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration coroutineBoundary;
    private final java.lang.Object coroutineCreation;
    private final com.datadog.trace.core.PendingTrace d;
    private volatile int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private volatile com.datadog.trace.api.gateway.BlockResponseFunction getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private volatile int getInputSizeshNQ4ISI;
    private final java.lang.Object getOutputFormats;
    private volatile int getOutputMinFrameDuration;
    private volatile boolean getOutputMinFrameDurationlomOqCM;
    private final boolean getOutputSizes;
    private volatile boolean getOutputSizeshNQ4ISI;
    private volatile byte getOutputStallDuration;
    private volatile short getOutputStallDurationlomOqCM;
    private volatile java.lang.CharSequence getValidOutputFormatsForInputhNQ4ISI;
    private final com.datadog.trace.api.DDTraceId init;
    private volatile com.datadog.trace.bootstrap.instrumentation.api.PathwayContext isOutputSupportedFor;
    private final java.lang.String isOutputSupportedForhNQ4ISI;
    private final com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString kernelVersion;
    private final java.util.Map<java.lang.String, java.lang.Object> release;
    private volatile java.lang.CharSequence toString;
    private final long unwrapAs;
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRangesFor = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.DDSpanContext.class);
    private static final com.datadog.trace.api.cache.DDCache<java.lang.String, com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString> getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.api.cache.DDCaches.newFixedSizeCache(256);
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes = java.util.Collections.emptyMap();
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.DDSpanContext> getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.datadog.trace.core.DDSpanContext.class, "getARTIFICIAL_FRAME_PACKAGE_NAME");

    public com.datadog.trace.api.gateway.RequestContext getRequestContext() {
        return this;
    }

    @Override // com.datadog.trace.api.gateway.RequestContext
    public com.datadog.trace.api.internal.TraceSegment getTraceSegment() {
        return this;
    }

    public DDSpanContext(com.datadog.trace.api.DDTraceId dDTraceId, long j, long j2, java.lang.CharSequence charSequence, java.lang.String str, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, java.util.Map<java.lang.String, java.lang.String> map, boolean z, java.lang.CharSequence charSequence5, int i2, com.datadog.trace.core.PendingTrace pendingTrace, java.lang.Object obj, java.lang.Object obj2, com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext, boolean z2, com.datadog.trace.core.propagation.PropagationTags propagationTags) {
        this(dDTraceId, j, j2, charSequence, str, charSequence2, charSequence3, i, charSequence4, map, z, charSequence5, i2, pendingTrace, obj, obj2, null, pathwayContext, z2, propagationTags, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration.NoOp.INSTANCE, true);
    }

    public DDSpanContext(com.datadog.trace.api.DDTraceId dDTraceId, long j, long j2, java.lang.CharSequence charSequence, java.lang.String str, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, java.util.Map<java.lang.String, java.lang.String> map, boolean z, java.lang.CharSequence charSequence5, int i2, com.datadog.trace.core.PendingTrace pendingTrace, java.lang.Object obj, java.lang.Object obj2, com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext, boolean z2, com.datadog.trace.core.propagation.PropagationTags propagationTags, boolean z3) {
        this(dDTraceId, j, j2, charSequence, str, charSequence2, charSequence3, i, charSequence4, map, z, charSequence5, i2, pendingTrace, obj, obj2, null, pathwayContext, z2, propagationTags, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration.NoOp.INSTANCE, z3);
    }

    public DDSpanContext(com.datadog.trace.api.DDTraceId dDTraceId, long j, long j2, java.lang.CharSequence charSequence, java.lang.String str, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, java.util.Map<java.lang.String, java.lang.String> map, boolean z, java.lang.CharSequence charSequence5, int i2, com.datadog.trace.core.PendingTrace pendingTrace, java.lang.Object obj, java.lang.Object obj2, com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext, boolean z2, com.datadog.trace.core.propagation.PropagationTags propagationTags, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration profilingContextIntegration) {
        this(dDTraceId, j, j2, charSequence, str, charSequence2, charSequence3, i, charSequence4, map, z, charSequence5, i2, pendingTrace, obj, obj2, null, pathwayContext, z2, propagationTags, profilingContextIntegration, true);
    }

    public DDSpanContext(com.datadog.trace.api.DDTraceId dDTraceId, long j, long j2, java.lang.CharSequence charSequence, java.lang.String str, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, java.util.Map<java.lang.String, java.lang.String> map, boolean z, java.lang.CharSequence charSequence5, int i2, com.datadog.trace.core.PendingTrace pendingTrace, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext, boolean z2, com.datadog.trace.core.propagation.PropagationTags propagationTags, com.datadog.trace.bootstrap.instrumentation.api.ProfilingContextIntegration profilingContextIntegration, boolean z3) {
        this._BOUNDARY = (byte) 0;
        this.getOutputStallDuration = Byte.MIN_VALUE;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        this.d = pendingTrace;
        this.init = dDTraceId;
        this._CREATION = j;
        this.unwrapAs = j2;
        this.isOutputSupportedForhNQ4ISI = java.lang.String.valueOf(charSequence);
        if (map == null || map.isEmpty()) {
            this.Camera2StreamConfigurationMap = getHighSpeedVideoSizes;
        } else {
            this.Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap(map);
        }
        this.accessartificialFrame = obj;
        this.coroutineCreation = obj2;
        this.getOutputFormats = obj3;
        this.isOutputSupportedFor = pathwayContext;
        this.release = new java.util.HashMap(java.lang.Math.max(((i2 <= 0 ? 3 : i2 + 1) * 4) / 3, 8));
        this.coroutineBoundary = profilingContextIntegration;
        this.getInputSizeshNQ4ISI = profilingContextIntegration.encodeOperationName(charSequence2);
        setServiceName(str);
        this.getValidOutputFormatsForInputhNQ4ISI = charSequence2;
        setResourceName(charSequence3, (byte) 0);
        this.getOutputSizeshNQ4ISI = z;
        this.b = charSequence5;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        this.c = currentThread.getId();
        this.kernelVersion = getHighResolutionOutputSizeshNQ4ISI.computeIfAbsent(currentThread.getName(), com.datadog.trace.api.Functions.UTF8_ENCODE);
        this.getInputFormats = z2;
        com.datadog.trace.core.propagation.PropagationTags empty = propagationTags == null ? pendingTrace.getOutputFormats.getInputSizeshNQ4ISI.empty() : propagationTags;
        this.CoroutineDebuggingKt = empty;
        empty.updateTraceIdHighOrderBits(dDTraceId.toHighOrderLong());
        this.getOutputSizes = z3;
        if (charSequence4 != null) {
            setOrigin(charSequence4);
        }
        if (i != -128) {
            setSamplingPriority(i, -1);
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public com.datadog.trace.api.DDTraceId getTraceId() {
        return this.init;
    }

    public long getParentId() {
        return this.unwrapAs;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public long getSpanId() {
        return this._CREATION;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext
    public long getRootSpanId() {
        return Camera2StreamConfigurationMap()._CREATION;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext
    public int getEncodedOperationName() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext
    public int getEncodedResourceName() {
        return this.getOutputMinFrameDuration;
    }

    public java.lang.String getServiceName() {
        return this.f2927a;
    }

    public void setServiceName(java.lang.String str) {
        com.datadog.trace.core.PendingTrace pendingTrace = this.d;
        if (pendingTrace.getOutputMinFrameDuration.getServiceMapping().containsKey(str)) {
            str = pendingTrace.getOutputMinFrameDuration.getServiceMapping().get(str);
        }
        this.f2927a = str;
        java.lang.String str2 = this.isOutputSupportedForhNQ4ISI;
        this.AMEXKernel = str2 == null || str2.length() == 0 || !str2.equals(this.f2927a);
    }

    public byte getResourceNamePriority() {
        return this._BOUNDARY;
    }

    public void setResourceName(java.lang.CharSequence charSequence, byte b) {
        if (charSequence == null || b < this._BOUNDARY) {
            return;
        }
        this._BOUNDARY = b;
        this.ArtificialStackFrames = charSequence;
        this.getOutputMinFrameDuration = this.coroutineBoundary.encodeResourceName(charSequence);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext
    public java.lang.CharSequence getOperationName() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void setOperationName(java.lang.CharSequence charSequence) {
        this.getValidOutputFormatsForInputhNQ4ISI = charSequence;
        this.getInputSizeshNQ4ISI = this.coroutineBoundary.encodeOperationName(charSequence);
    }

    public boolean getErrorFlag() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setErrorFlag(boolean z, byte b) {
        if (b <= Byte.MIN_VALUE || b < this.getOutputStallDuration) {
            return;
        }
        this.getOutputSizeshNQ4ISI = z;
        this.getOutputStallDuration = b;
    }

    public boolean isMeasured() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setMeasured(boolean z) {
        if (z != this.getOutputMinFrameDurationlomOqCM) {
            this.getOutputMinFrameDurationlomOqCM = z;
        }
    }

    public boolean isTopLevel() {
        return this.AMEXKernel;
    }

    public java.lang.CharSequence getSpanType() {
        return this.b;
    }

    public void setSpanType(java.lang.CharSequence charSequence) {
        this.b = charSequence;
    }

    public void forceKeep() {
        com.datadog.trace.core.DDSpanContext Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (getHighSpeedVideoFpsRanges.getAndSet(Camera2StreamConfigurationMap, 2) == -128) {
            Camera2StreamConfigurationMap.CoroutineDebuggingKt.updateTraceSamplingPriority(2, 4);
        }
    }

    public boolean setSamplingPriority(int i, int i2) {
        com.datadog.trace.core.DDSpanContext Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (i == -128) {
            getHighSpeedVideoFpsRangesFor.debug("{}: Refusing to set samplingPriority to UNSET", Camera2StreamConfigurationMap);
        } else {
            if (!com.datadog.trace.api.sampling.SamplingMechanism.validateWithSamplingPriority(i2, i)) {
                if (Camera2StreamConfigurationMap.getInputFormats) {
                    getHighSpeedVideoFpsRangesFor.debug("{}: Bypassing setting setSamplingPriority check (trace.sampling.mechanism.validation.disabled) for a non valid combination of samplingMechanism {} and samplingPriority {}.", Camera2StreamConfigurationMap, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
                } else {
                    getHighSpeedVideoFpsRangesFor.debug("{}: Refusing to set samplingMechanism to {}. Provided samplingPriority {} is not allowed.", Camera2StreamConfigurationMap, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
                }
            }
            if (!getHighSpeedVideoFpsRanges.compareAndSet(Camera2StreamConfigurationMap, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, i)) {
                com.datadog.trace.logger.Logger logger = getHighSpeedVideoFpsRangesFor;
                if (logger.isDebugEnabled()) {
                    logger.debug("samplingPriority locked at priority: {}. Refusing to set to priority: {} mechanism: {}", java.lang.Integer.valueOf(Camera2StreamConfigurationMap.getARTIFICIAL_FRAME_PACKAGE_NAME), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
                }
                return false;
            }
            Camera2StreamConfigurationMap.CoroutineDebuggingKt.updateTraceSamplingPriority(i, i2);
            return true;
        }
        return false;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public int getTraceSamplingPriority() {
        return Camera2StreamConfigurationMap().getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public int getSpanSamplingPriority() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public void setSpanSamplingPriority(double d, int i) {
        synchronized (this.release) {
            this.release.put(SPAN_SAMPLING_MECHANISM_TAG, (byte) 8);
            this.release.put(SPAN_SAMPLING_RULE_RATE_TAG, java.lang.Double.valueOf(d));
            if (i != Integer.MAX_VALUE) {
                this.release.put(SPAN_SAMPLING_MAX_PER_SECOND_TAG, java.lang.Integer.valueOf(i));
            }
        }
    }

    @java.lang.Deprecated
    public boolean lockSamplingPriority() {
        com.datadog.trace.core.DDSpan rootSpan = this.d.getRootSpan();
        if (rootSpan == null || rootSpan.context() == this) {
            return getHighSpeedVideoFpsRanges.get(this) != -128;
        }
        return rootSpan.context().lockSamplingPriority();
    }

    public java.lang.CharSequence getOrigin() {
        return Camera2StreamConfigurationMap().toString;
    }

    public void beginEndToEnd() {
        this.d.beginEndToEnd();
    }

    public long getEndToEndStartTime() {
        return this.d.getEndToEndStartTime();
    }

    public void setBaggageItem(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, java.lang.String> map = this.Camera2StreamConfigurationMap;
        java.util.Map<java.lang.String, java.lang.String> map2 = getHighSpeedVideoSizes;
        if (map == map2) {
            synchronized (this) {
                if (this.Camera2StreamConfigurationMap == map2) {
                    this.Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap(4);
                }
            }
        }
        this.Camera2StreamConfigurationMap.put(str, str2);
    }

    public java.lang.String getBaggageItem(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.String> getBaggageItems() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>> baggageItems() {
        return this.Camera2StreamConfigurationMap.entrySet();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public com.datadog.trace.core.PendingTrace getTrace() {
        return this.d;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public com.datadog.trace.bootstrap.instrumentation.api.PathwayContext getPathwayContext() {
        return this.isOutputSupportedFor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context
    public void mergePathwayContext(com.datadog.trace.bootstrap.instrumentation.api.PathwayContext pathwayContext) {
        if (pathwayContext != null) {
            if (this.isOutputSupportedFor.isStarted()) {
                if (java.util.concurrent.ThreadLocalRandom.current().nextInt(2) == 1) {
                    this.isOutputSupportedFor = pathwayContext;
                    return;
                }
                return;
            }
            this.isOutputSupportedFor = pathwayContext;
        }
    }

    public com.datadog.trace.core.CoreTracer getTracer() {
        return this.d.getOutputFormats;
    }

    public void setHttpStatusCode(short s) {
        this.getOutputStallDurationlomOqCM = s;
    }

    public short getHttpStatusCode() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setOrigin(java.lang.CharSequence charSequence) {
        com.datadog.trace.core.DDSpanContext Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap.toString = charSequence;
        Camera2StreamConfigurationMap.CoroutineDebuggingKt.updateTraceOrigin(charSequence);
    }

    public void setMetric(java.lang.CharSequence charSequence, java.lang.Number number) {
        synchronized (this.release) {
            this.release.put(charSequence.toString(), number);
        }
    }

    public void setTag(java.lang.String str, java.lang.Object obj) {
        if (str != null) {
            if (obj == null) {
                synchronized (this.release) {
                    this.release.remove(str);
                }
            } else {
                if (this.d.getOutputFormats.getTagInterceptor().interceptTag(this, str, obj)) {
                    return;
                }
                synchronized (this.release) {
                    this.release.put(str, obj);
                }
            }
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, ?> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        com.datadog.trace.core.taginterceptor.TagInterceptor tagInterceptor = this.d.getOutputFormats.getTagInterceptor();
        synchronized (this.release) {
            for (java.util.Map.Entry<java.lang.String, ?> entry : map.entrySet()) {
                if (!tagInterceptor.interceptTag(this, entry.getKey(), entry.getValue())) {
                    this.release.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    final java.lang.Object getHighSpeedVideoSizes(java.lang.String str) {
        char c;
        java.lang.Object unsafeGetTag;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1562282113) {
            if (str.equals(com.datadog.trace.api.DDTags.THREAD_ID)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 960885172) {
            if (hashCode == 1885592559 && str.equals(com.datadog.trace.api.DDTags.THREAD_NAME)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("http.status_code")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return java.lang.Long.valueOf(this.c);
        }
        if (c == 1) {
            if (this.getOutputStallDurationlomOqCM == 0) {
                return null;
            }
            return java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM);
        }
        if (c == 2) {
            return this.kernelVersion.toString();
        }
        synchronized (this.release) {
            unsafeGetTag = unsafeGetTag(str);
        }
        if (unsafeGetTag == null) {
            return null;
        }
        return "http.url".equals(str) ? unsafeGetTag.toString() : unsafeGetTag;
    }

    public java.lang.Object unsafeGetTag(java.lang.String str) {
        return this.release.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getTags() {
        java.util.Map<java.lang.String, java.lang.Object> unmodifiableMap;
        synchronized (this.release) {
            java.util.HashMap hashMap = new java.util.HashMap(this.release);
            hashMap.put(com.datadog.trace.api.DDTags.THREAD_ID, java.lang.Long.valueOf(this.c));
            hashMap.put(com.datadog.trace.api.DDTags.THREAD_NAME, this.kernelVersion.toString());
            if (this.getARTIFICIAL_FRAME_PACKAGE_NAME != -128) {
                hashMap.put(SAMPLE_RATE_KEY, java.lang.Integer.valueOf(this.getARTIFICIAL_FRAME_PACKAGE_NAME));
            }
            if (this.getOutputStallDurationlomOqCM != 0) {
                hashMap.put("http.status_code", java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM));
            }
            java.lang.Object obj = hashMap.get("http.url");
            if (obj != null) {
                hashMap.put("http.url", obj.toString());
            }
            unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
        }
        return unmodifiableMap;
    }

    public void processTagsAndBaggage(com.datadog.trace.core.MetadataConsumer metadataConsumer, int i, java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> list) {
        java.util.HashMap<java.lang.String, java.lang.String> createTagMap;
        synchronized (this.release) {
            java.util.Map<java.lang.String, java.lang.Object> processTagsWithContext = com.datadog.trace.core.tagprocessor.TagsPostProcessorFactory.instance().processTagsWithContext(this.release, this);
            java.lang.String tag = com.datadog.trace.core.DDSpanLink.toTag(list);
            if (tag != null) {
                processTagsWithContext.put("_dd.span_links", tag);
            }
            if (this.getOutputSizes) {
                createTagMap = new java.util.HashMap<>(this.Camera2StreamConfigurationMap);
                this.CoroutineDebuggingKt.fillTagMap(createTagMap);
            } else {
                createTagMap = this.CoroutineDebuggingKt.createTagMap();
            }
            metadataConsumer.accept(new com.datadog.trace.core.Metadata(this.c, this.kernelVersion, processTagsWithContext, createTagMap, this.getARTIFICIAL_FRAME_PACKAGE_NAME != -128 ? this.getARTIFICIAL_FRAME_PACKAGE_NAME : getTraceSamplingPriority(), this.getOutputMinFrameDurationlomOqCM, this.AMEXKernel, this.getOutputStallDurationlomOqCM == 0 ? null : com.datadog.trace.api.cache.RadixTreeCache.HTTP_STATUSES.get(this.getOutputStallDurationlomOqCM), getOrigin(), i));
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DDSpan [ t_id=");
        sb.append(this.init);
        sb.append(", s_id=");
        sb.append(this._CREATION);
        sb.append(", p_id=");
        sb.append(this.unwrapAs);
        sb.append(" ] trace=");
        sb.append(getServiceName());
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(getOperationName());
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(getResourceName());
        if (this.getOutputSizeshNQ4ISI) {
            sb.append(" *errored*");
        }
        if (this.getOutputMinFrameDurationlomOqCM) {
            sb.append(" *measured*");
        }
        synchronized (this.release) {
            sb.append(" tags=");
            sb.append(new java.util.TreeMap(getTags()));
        }
        return sb.toString();
    }

    @Override // com.datadog.trace.api.gateway.RequestContext
    public java.lang.Object getData(com.datadog.trace.api.gateway.RequestContextSlot requestContextSlot) {
        if (requestContextSlot == com.datadog.trace.api.gateway.RequestContextSlot.APPSEC) {
            return this.accessartificialFrame;
        }
        if (requestContextSlot == com.datadog.trace.api.gateway.RequestContextSlot.CI_VISIBILITY) {
            return this.getOutputFormats;
        }
        if (requestContextSlot == com.datadog.trace.api.gateway.RequestContextSlot.IAST) {
            return this.coroutineCreation;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.lang.Object obj = this.accessartificialFrame;
        if (obj instanceof java.io.Closeable) {
            try {
                ((java.io.Closeable) obj).close();
            } catch (java.io.IOException e) {
                e = e;
            } catch (java.lang.RuntimeException e2) {
                e = e2;
            }
        }
        e = null;
        java.lang.Object obj2 = this.coroutineCreation;
        if (obj2 instanceof java.io.Closeable) {
            try {
                ((java.io.Closeable) obj2).close();
            } catch (java.io.IOException e3) {
                e = e3;
            } catch (java.lang.RuntimeException e4) {
                e = e4;
            }
        }
        if (e != null) {
            if (e instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e);
            }
            throw ((java.io.IOException) e);
        }
    }

    @Override // com.datadog.trace.api.gateway.RequestContext
    public void setBlockResponseFunction(com.datadog.trace.api.gateway.BlockResponseFunction blockResponseFunction) {
        Camera2StreamConfigurationMap().getHighSpeedVideoSizesFor = blockResponseFunction;
    }

    @Override // com.datadog.trace.api.gateway.RequestContext
    public com.datadog.trace.api.gateway.BlockResponseFunction getBlockResponseFunction() {
        return Camera2StreamConfigurationMap().getHighSpeedVideoSizesFor;
    }

    public com.datadog.trace.core.propagation.PropagationTags getPropagationTags() {
        return Camera2StreamConfigurationMap().CoroutineDebuggingKt;
    }

    @Override // com.datadog.trace.api.internal.TraceSegment
    public void setTagTop(java.lang.String str, java.lang.Object obj, boolean z) {
        Camera2StreamConfigurationMap().setTagCurrent(str, obj, z);
    }

    @Override // com.datadog.trace.api.internal.TraceSegment
    public void setTagCurrent(java.lang.String str, java.lang.Object obj, boolean z) {
        if (z) {
            str = com.datadog.trace.util.TagsHelper.sanitize(str);
        }
        setTag(str, obj);
    }

    @Override // com.datadog.trace.api.internal.TraceSegment
    public void setDataTop(java.lang.String str, java.lang.Object obj) {
        Camera2StreamConfigurationMap().setDataCurrent(str, obj);
    }

    @Override // com.datadog.trace.api.internal.TraceSegment
    public void effectivelyBlocked() {
        setTag("appsec.blocked", "true");
    }

    @Override // com.datadog.trace.api.internal.TraceSegment
    public void setDataCurrent(java.lang.String str, java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("_dd.");
        sb.append(str);
        sb.append(".json");
        setTag(sb.toString(), obj);
    }

    private com.datadog.trace.core.DDSpanContext Camera2StreamConfigurationMap() {
        com.datadog.trace.core.DDSpan rootSpan;
        com.datadog.trace.core.PendingTrace pendingTrace = this.d;
        com.datadog.trace.core.DDSpanContext context = (pendingTrace == null || (rootSpan = pendingTrace.getRootSpan()) == null || rootSpan.context() == this) ? null : rootSpan.context();
        return context != null ? context : this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.ProfilerContext
    public java.lang.CharSequence getResourceName() {
        return (this.ArtificialStackFrames == null || this.ArtificialStackFrames.length() == 0) ? this.getValidOutputFormatsForInputhNQ4ISI : this.ArtificialStackFrames;
    }

    public boolean hasResourceName() {
        return ((this.ArtificialStackFrames == null || this.ArtificialStackFrames.length() == 0) && getHighSpeedVideoSizes("resource.name") == null) ? false : true;
    }
}
