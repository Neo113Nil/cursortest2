package com.datadog.trace.core;

/* loaded from: classes3.dex */
public class DDSpan implements com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.core.CoreSpan<com.datadog.trace.core.DDSpan>, com.datadog.trace.api.profiling.TransientProfilingContextHolder, com.datadog.trace.bootstrap.instrumentation.api.AttachableWrapper {
    private volatile long getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.trace.core.DDSpanContext getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizesFor;
    private final java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> getInputFormats;
    private volatile com.datadog.trace.api.EndpointTracker getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private final com.datadog.trace.logger.Logger getOutputMinFrameDuration;
    private final long getOutputMinFrameDurationlomOqCM;
    private volatile java.lang.Object getOutputSizes;
    private volatile com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction getOutputSizeshNQ4ISI;
    private volatile int getOutputStallDuration = 0;
    private final com.datadog.trace.api.metrics.SpanMetrics getOutputStallDurationlomOqCM;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<com.datadog.trace.core.DDSpan> getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(com.datadog.trace.core.DDSpan.class, "getHighResolutionOutputSizeshNQ4ISI");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.datadog.trace.core.DDSpan, java.lang.Object> Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.datadog.trace.core.DDSpan.class, java.lang.Object.class, "getOutputSizes");
    private static final boolean getHighSpeedVideoSizes = com.datadog.trace.api.Config.get().isEndToEndDurationEnabled(false, "legacy");

    static com.datadog.trace.core.DDSpan Camera2StreamConfigurationMap(java.lang.String str, long j, com.datadog.trace.core.DDSpanContext dDSpanContext, java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> list, com.datadog.android.api.InternalLogger internalLogger) {
        com.datadog.trace.core.DDSpan dDSpan = new com.datadog.trace.core.DDSpan(str, j, dDSpanContext, list, internalLogger);
        com.datadog.trace.core.PendingTrace trace = dDSpanContext.getTrace();
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(com.datadog.trace.core.PendingTrace.getHighSpeedVideoSizes, trace, null, dDSpan);
        com.datadog.trace.core.PendingTrace.getHighSpeedVideoFpsRangesFor.incrementAndGet(trace);
        trace.getInputFormats.onCreateSpan();
        if (trace.getInputSizeshNQ4ISI.longRunningSpansEnabled()) {
            trace.getHighSpeedVideoSizesFor.addFirst(dDSpan);
            if (trace.compareAndSetLongRunningState(0, 1)) {
                com.datadog.trace.core.PendingTrace.getHighResolutionOutputSizeshNQ4ISI.set(trace, dDSpan.getStartTime());
                trace.getInputSizeshNQ4ISI.enqueue(trace);
            }
        }
        return dDSpan;
    }

    public DDSpan(java.lang.String str, long j, com.datadog.trace.core.DDSpanContext dDSpanContext, java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> list, com.datadog.android.api.InternalLogger internalLogger) {
        this.getHighSpeedVideoFpsRangesFor = dDSpanContext;
        com.datadog.trace.api.metrics.SpanMetrics spanMetrics = com.datadog.trace.api.metrics.SpanMetricRegistry.getInstance().get(str);
        this.getOutputStallDurationlomOqCM = spanMetrics;
        spanMetrics.onSpanCreated();
        if (j <= 0) {
            this.getOutputMinFrameDurationlomOqCM = dDSpanContext.getTrace().getCurrentTimeNano();
            this.getHighSpeedVideoSizesFor = false;
        } else {
            this.getOutputMinFrameDurationlomOqCM = java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(j);
            this.getHighSpeedVideoSizesFor = true;
            dDSpanContext.getTrace().touch();
        }
        this.getInputFormats = list == null ? new java.util.concurrent.CopyOnWriteArrayList() : new java.util.concurrent.CopyOnWriteArrayList(list);
        com.datadog.trace.logger.Logger logger = com.datadog.trace.logger.LoggerFactory.getLogger("DDSpan", internalLogger);
        this.getOutputMinFrameDuration = logger;
        logger.debug("Started span: {}", this);
    }

    public boolean isFinished() {
        return this.getHighResolutionOutputSizeshNQ4ISI != 0;
    }

    private void getHighSpeedVideoFpsRangesFor(long j) {
        if (getHighSpeedVideoFpsRanges.compareAndSet(this, 0L, java.lang.Math.max(1L, j))) {
            setLongRunningVersion(-this.getOutputStallDuration);
            this.getOutputStallDurationlomOqCM.onSpanFinished();
            this.getOutputMinFrameDuration.debug("Finished span ({}): {}", this.getHighSpeedVideoFpsRangesFor.getTrace().Camera2StreamConfigurationMap(this), this);
            return;
        }
        this.getOutputMinFrameDuration.debug("Already finished: {}", this);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public void finish() {
        if (!this.getHighSpeedVideoSizesFor) {
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor.getTrace().getCurrentTimeNano() - this.getOutputMinFrameDurationlomOqCM);
        } else {
            finish(this.getHighSpeedVideoFpsRangesFor.getTrace().getTimeSource().getCurrentTimeMicros());
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public void finish(long j) {
        long nanos;
        if (!this.getHighSpeedVideoSizesFor) {
            long currentTimeMicros = this.getHighSpeedVideoFpsRangesFor.getTrace().getTimeSource().getCurrentTimeMicros();
            nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.getHighSpeedVideoFpsRangesFor.getTrace().getCurrentTimeNano() - this.getOutputMinFrameDurationlomOqCM)) + java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(j - currentTimeMicros);
        } else {
            nanos = java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(j) - this.getOutputMinFrameDurationlomOqCM;
            this.getHighSpeedVideoFpsRangesFor.getTrace().touch();
        }
        getHighSpeedVideoFpsRangesFor(nanos);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public final void finishWithDuration(long j) {
        getHighSpeedVideoFpsRangesFor(j);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public void beginEndToEnd() {
        if (getHighSpeedVideoSizes) {
            if (getBaggageItem(com.datadog.trace.api.DDTags.TRACE_START_TIME) == null) {
                setBaggageItem(com.datadog.trace.api.DDTags.TRACE_START_TIME, java.lang.Long.toString(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.getOutputMinFrameDurationlomOqCM)));
                return;
            }
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.beginEndToEnd();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public void finishWithEndToEnd() {
        long endToEndStartTime;
        if (getHighSpeedVideoSizes) {
            java.lang.String baggageItem = this.getHighSpeedVideoFpsRangesFor.getBaggageItem(com.datadog.trace.api.DDTags.TRACE_START_TIME);
            if (baggageItem != null) {
                try {
                    endToEndStartTime = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.Long.parseLong(baggageItem));
                } catch (java.lang.RuntimeException e) {
                    this.getOutputMinFrameDuration.debug("Ignoring invalid end-to-end start time {}", baggageItem, e);
                }
            }
            endToEndStartTime = 0;
        } else {
            endToEndStartTime = this.getHighSpeedVideoFpsRangesFor.getEndToEndStartTime();
        }
        if (endToEndStartTime > 0) {
            phasedFinish();
            mo10043setTag(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.RECORD_END_TO_END_DURATION_MS, java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.Math.max(0L, (this.getOutputMinFrameDurationlomOqCM + (this.getHighResolutionOutputSizeshNQ4ISI & Long.MAX_VALUE)) - endToEndStartTime)));
            publish();
            return;
        }
        finish();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public final boolean phasedFinish() {
        long currentTimeNanos;
        if (!this.getHighSpeedVideoSizesFor) {
            currentTimeNanos = this.getHighSpeedVideoFpsRangesFor.getTrace().getCurrentTimeNano() - this.getOutputMinFrameDurationlomOqCM;
        } else {
            currentTimeNanos = this.getHighSpeedVideoFpsRangesFor.getTrace().getTimeSource().getCurrentTimeNanos() - this.getOutputMinFrameDurationlomOqCM;
            this.getHighSpeedVideoFpsRangesFor.getTrace().touch();
        }
        if (getHighSpeedVideoFpsRanges.compareAndSet(this, 0L, Long.MIN_VALUE | java.lang.Math.max(1L, currentTimeNanos))) {
            this.getOutputMinFrameDuration.debug("Finished span (PHASED): {}", this);
            return true;
        }
        this.getOutputMinFrameDuration.debug("Already finished: {}", this);
        return false;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public final void publish() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        if (j == 0) {
            this.getOutputMinFrameDuration.debug("Can't publish unfinished span: {}", this);
            return;
        }
        if (j > 0) {
            this.getOutputMinFrameDuration.debug("Already published: {}", this);
        } else if (getHighSpeedVideoFpsRanges.compareAndSet(this, j, Long.MAX_VALUE & j)) {
            this.getOutputMinFrameDuration.debug("Published span ({}): {}", this.getHighSpeedVideoFpsRangesFor.getTrace().Camera2StreamConfigurationMap(this), this);
        }
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
    public com.datadog.trace.core.DDSpan setError(boolean z) {
        return setError(z, (byte) 0);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public com.datadog.trace.core.DDSpan setError(boolean z, byte b) {
        this.getHighSpeedVideoFpsRangesFor.setErrorFlag(z, b);
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setMeasured, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10036setMeasured(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setMeasured(z);
        return this;
    }

    public com.datadog.trace.core.DDSpan forceKeep(boolean z) {
        this.getOutputFormats = z;
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public boolean isForceKeep() {
        return this.getOutputFormats;
    }

    public final boolean isRootSpan() {
        return this.getHighSpeedVideoFpsRangesFor.getParentId() == 0;
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    @java.lang.Deprecated
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getRootSpan() {
        return mo10034getLocalRootSpan();
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: getLocalRootSpan, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10034getLocalRootSpan() {
        return this.getHighSpeedVideoFpsRangesFor.getTrace().getRootSpan();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public void drop() {
        com.datadog.trace.core.PendingTrace trace = this.getHighSpeedVideoFpsRangesFor.getTrace();
        com.datadog.trace.core.PendingTrace.getHighSpeedVideoFpsRangesFor.decrementAndGet(trace);
        if (trace.getInputSizeshNQ4ISI.longRunningSpansEnabled()) {
            trace.getHighSpeedVideoSizesFor.remove(this);
        }
    }

    public boolean isLocalRootSpan() {
        return mo10034getLocalRootSpan().equals(this);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public boolean isSameTrace(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan) {
        if (agentSpan instanceof com.datadog.trace.core.DDSpan) {
            return getTraceId().equals(agentSpan.getTraceId());
        }
        return false;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setErrorMessage, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10035setErrorMessage(java.lang.String str) {
        return mo10047setTag("error.message", str);
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: addThrowable, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10033addThrowable(java.lang.Throwable th) {
        return addThrowable(th, (byte) 0);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public com.datadog.trace.core.DDSpan addThrowable(java.lang.Throwable th, byte b) {
        if (th != null) {
            java.lang.String message = th.getMessage();
            if (!"broken pipe".equalsIgnoreCase(message) && (th.getCause() == null || !"broken pipe".equalsIgnoreCase(th.getCause().getMessage()))) {
                setError(true, b);
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                th.printStackTrace(new java.io.PrintWriter(stringWriter));
                mo10047setTag("error.stack", stringWriter.toString());
            }
            mo10047setTag("error.message", message);
            mo10047setTag("error.type", th.getClass().getName());
        }
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public final com.datadog.trace.core.DDSpan mo10047setTag(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str2.isEmpty()) {
            this.getHighSpeedVideoFpsRangesFor.setTag(str, null);
            return this;
        }
        this.getHighSpeedVideoFpsRangesFor.setTag(str, str2);
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public final com.datadog.trace.core.DDSpan mo10048setTag(java.lang.String str, boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setTag(str, java.lang.Boolean.valueOf(z));
        return this;
    }

    @Override // com.datadog.trace.api.gateway.IGSpanInfo
    public void setRequestBlockingAction(com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction requestBlockingAction) {
        this.getOutputSizeshNQ4ISI = requestBlockingAction;
    }

    @Override // com.datadog.trace.api.gateway.IGSpanInfo
    public com.datadog.trace.api.gateway.Flow.Action.RequestBlockingAction getRequestBlockingAction() {
        return this.getOutputSizeshNQ4ISI;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10042setTag(java.lang.String str, int i) {
        if ("http.status_code".equals(str)) {
            this.getHighSpeedVideoFpsRangesFor.setHttpStatusCode((short) i);
        }
        this.getHighSpeedVideoFpsRangesFor.setTag(str, java.lang.Integer.valueOf(i));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10043setTag(java.lang.String str, long j) {
        this.getHighSpeedVideoFpsRangesFor.setTag(str, java.lang.Long.valueOf(j));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10041setTag(java.lang.String str, double d) {
        this.getHighSpeedVideoFpsRangesFor.setTag(str, java.lang.Double.valueOf(d));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10045setTag(java.lang.String str, java.lang.Number number) {
        this.getHighSpeedVideoFpsRangesFor.setTag(str, number);
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setMetric, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10038setMetric(java.lang.CharSequence charSequence, int i) {
        this.getHighSpeedVideoFpsRangesFor.setMetric(charSequence, java.lang.Integer.valueOf(i));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public com.datadog.trace.core.DDSpan setMetric(java.lang.CharSequence charSequence, float f) {
        this.getHighSpeedVideoFpsRangesFor.setMetric(charSequence, java.lang.Float.valueOf(f));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setMetric, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10039setMetric(java.lang.CharSequence charSequence, long j) {
        this.getHighSpeedVideoFpsRangesFor.setMetric(charSequence, java.lang.Long.valueOf(j));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setMetric, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10037setMetric(java.lang.CharSequence charSequence, double d) {
        this.getHighSpeedVideoFpsRangesFor.setMetric(charSequence, java.lang.Double.valueOf(d));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public com.datadog.trace.core.DDSpan setFlag(java.lang.CharSequence charSequence, boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setMetric(charSequence, java.lang.Integer.valueOf(z ? 1 : 0));
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10044setTag(java.lang.String str, java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            this.getHighSpeedVideoFpsRangesFor.setTag(str, null);
            return this;
        }
        this.getHighSpeedVideoFpsRangesFor.setTag(str, charSequence);
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setTag, reason: merged with bridge method [inline-methods] */
    public com.datadog.trace.core.DDSpan mo10046setTag(java.lang.String str, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor.setTag(str, obj);
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public com.datadog.trace.core.DDSpan removeTag(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.setTag(str, null);
        return this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
    public java.lang.Object getTag(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(str);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public final com.datadog.trace.core.DDSpanContext context() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public final java.lang.String getBaggageItem(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.getBaggageItem(str);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public final com.datadog.trace.core.DDSpan setBaggageItem(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRangesFor.setBaggageItem(str, str2);
        return this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public com.datadog.trace.bootstrap.instrumentation.api.AgentSpan setHttpStatusCode(int i) {
        this.getHighSpeedVideoFpsRangesFor.setHttpStatusCode((short) i);
        return this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public short getHttpStatusCode() {
        return this.getHighSpeedVideoFpsRangesFor.getHttpStatusCode();
    }

    @Override // com.datadog.trace.core.CoreSpan
    public java.lang.CharSequence getOrigin() {
        return this.getHighSpeedVideoFpsRangesFor.getOrigin();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public final com.datadog.trace.core.DDSpan setOperationName(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setOperationName(charSequence);
        return this;
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public final com.datadog.trace.core.DDSpan setServiceName(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor.setServiceName(str);
        return this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
    public final com.datadog.trace.core.DDSpan setResourceName(java.lang.CharSequence charSequence) {
        return setResourceName(charSequence, (byte) 0);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public final com.datadog.trace.core.DDSpan setResourceName(java.lang.CharSequence charSequence, byte b) {
        this.getHighSpeedVideoFpsRangesFor.setResourceName(charSequence, b);
        return this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public boolean eligibleForDropping() {
        int traceSamplingPriority = this.getHighSpeedVideoFpsRangesFor.getTraceSamplingPriority();
        return traceSamplingPriority == -1 || traceSamplingPriority == 0;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public com.datadog.trace.api.gateway.RequestContext getRequestContext() {
        return this.getHighSpeedVideoFpsRangesFor.getRequestContext();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public java.lang.Integer forceSamplingDecision() {
        com.datadog.trace.core.PendingTrace trace = this.getHighSpeedVideoFpsRangesFor.getTrace();
        com.datadog.trace.core.DDSpan rootSpan = trace.getRootSpan();
        trace.setSamplingPriorityIfNecessary();
        if (rootSpan == null) {
            return null;
        }
        return rootSpan.getTraceSamplingPriority();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    @java.lang.Deprecated
    public final com.datadog.trace.core.DDSpan setSamplingPriority(int i) {
        return mo10040setSamplingPriority(i, -1);
    }

    @Override // com.datadog.trace.core.CoreSpan
    /* renamed from: setSamplingPriority, reason: merged with bridge method [inline-methods] */
    public final com.datadog.trace.core.DDSpan mo10040setSamplingPriority(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.setSamplingPriority(i, i2);
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public com.datadog.trace.core.DDSpan setSamplingPriority(int i, java.lang.CharSequence charSequence, double d, int i2) {
        if (this.getHighSpeedVideoFpsRangesFor.setSamplingPriority(i, i2)) {
            mo10037setMetric(charSequence, d);
        }
        return this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public com.datadog.trace.core.DDSpan setSpanSamplingPriority(double d, int i) {
        this.getHighSpeedVideoFpsRangesFor.setSpanSamplingPriority(d, i);
        return this;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.interceptor.MutableSpan
    public final com.datadog.trace.core.DDSpan setSpanType(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setSpanType(charSequence);
        return this;
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public long getStartTime() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public long getDurationNano() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public java.lang.String getServiceName() {
        return this.getHighSpeedVideoFpsRangesFor.getServiceName();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.gateway.IGSpanInfo
    public com.datadog.trace.api.DDTraceId getTraceId() {
        return this.getHighSpeedVideoFpsRangesFor.getTraceId();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan, com.datadog.trace.api.gateway.IGSpanInfo
    public long getSpanId() {
        return this.getHighSpeedVideoFpsRangesFor.getSpanId();
    }

    @Override // com.datadog.trace.core.CoreSpan
    public long getParentId() {
        return this.getHighSpeedVideoFpsRangesFor.getParentId();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public java.lang.CharSequence getResourceName() {
        return this.getHighSpeedVideoFpsRangesFor.getResourceName();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public java.lang.CharSequence getOperationName() {
        return this.getHighSpeedVideoFpsRangesFor.getOperationName();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public java.lang.CharSequence getSpanName() {
        return this.getHighSpeedVideoFpsRangesFor.getOperationName();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public void setSpanName(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoFpsRangesFor.setOperationName(charSequence);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public boolean hasResourceName() {
        return this.getHighSpeedVideoFpsRangesFor.hasResourceName();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public byte getResourceNamePriority() {
        return this.getHighSpeedVideoFpsRangesFor.getResourceNamePriority();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public java.lang.Integer getTraceSamplingPriority() {
        int traceSamplingPriority = this.getHighSpeedVideoFpsRangesFor.getTraceSamplingPriority();
        if (traceSamplingPriority == -128) {
            return null;
        }
        return java.lang.Integer.valueOf(traceSamplingPriority);
    }

    public int getSpanSamplingPriority() {
        return this.getHighSpeedVideoFpsRangesFor.getSpanSamplingPriority();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public java.lang.String getSpanType() {
        java.lang.CharSequence spanType = this.getHighSpeedVideoFpsRangesFor.getSpanType();
        if (spanType == null) {
            return null;
        }
        return spanType.toString();
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan, com.datadog.trace.api.gateway.IGSpanInfo
    public java.util.Map<java.lang.String, java.lang.Object> getTags() {
        return this.getHighSpeedVideoFpsRangesFor.getTags();
    }

    @Override // com.datadog.trace.core.CoreSpan
    public java.lang.CharSequence getType() {
        return this.getHighSpeedVideoFpsRangesFor.getSpanType();
    }

    @Override // com.datadog.trace.core.CoreSpan
    public void processTagsAndBaggage(com.datadog.trace.core.MetadataConsumer metadataConsumer) {
        this.getHighSpeedVideoFpsRangesFor.processTagsAndBaggage(metadataConsumer, this.getOutputStallDuration, this.getInputFormats);
    }

    @Override // com.datadog.trace.api.interceptor.MutableSpan
    public boolean isError() {
        return this.getHighSpeedVideoFpsRangesFor.getErrorFlag();
    }

    @Override // com.datadog.trace.core.CoreSpan
    public int getError() {
        return this.getHighSpeedVideoFpsRangesFor.getErrorFlag() ? 1 : 0;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public <U> U getTag(java.lang.CharSequence charSequence, U u) {
        U u2 = (U) getTag(java.lang.String.valueOf(charSequence));
        return u2 == null ? u : u2;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public <U> U getTag(java.lang.CharSequence charSequence) {
        return (U) getTag(charSequence, null);
    }

    @Override // com.datadog.trace.core.CoreSpan
    public boolean hasSamplingPriority() {
        return this.getHighSpeedVideoFpsRangesFor.getTrace().getRootSpan() == this;
    }

    @Override // com.datadog.trace.core.CoreSpan
    public boolean isMeasured() {
        return this.getHighSpeedVideoFpsRangesFor.isMeasured();
    }

    @Override // com.datadog.trace.core.CoreSpan
    public boolean isTopLevel() {
        return this.getHighSpeedVideoFpsRangesFor.isTopLevel();
    }

    public com.datadog.trace.api.EndpointTracker getEndpointTracker() {
        com.datadog.trace.core.DDSpan mo10034getLocalRootSpan = mo10034getLocalRootSpan();
        if (mo10034getLocalRootSpan == null) {
            return null;
        }
        if (equals(mo10034getLocalRootSpan)) {
            return this.getInputSizeshNQ4ISI;
        }
        return mo10034getLocalRootSpan.getInputSizeshNQ4ISI;
    }

    public void setEndpointTracker(com.datadog.trace.api.EndpointTracker endpointTracker) {
        com.datadog.trace.core.DDSpan mo10034getLocalRootSpan = mo10034getLocalRootSpan();
        if (mo10034getLocalRootSpan == null) {
            this.getOutputMinFrameDuration.warn("Span {} has no associated local root span", this);
        } else if (equals(mo10034getLocalRootSpan)) {
            this.getInputSizeshNQ4ISI = endpointTracker;
        } else {
            mo10034getLocalRootSpan.getInputSizeshNQ4ISI = endpointTracker;
        }
    }

    public java.util.List<com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink> getLinks() {
        return this.getInputFormats;
    }

    public java.util.Map<java.lang.String, java.lang.String> getBaggage() {
        return java.util.Collections.unmodifiableMap(this.getHighSpeedVideoFpsRangesFor.getBaggageItems());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
        sb.append(", duration_ns=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", forceKeep=");
        sb.append(this.getOutputFormats);
        sb.append(", links=");
        sb.append(this.getInputFormats);
        return sb.toString();
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AttachableWrapper
    public void attachWrapper(java.lang.Object obj) {
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, null, obj);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AttachableWrapper
    public java.lang.Object getWrapper() {
        return Camera2StreamConfigurationMap.get(this);
    }

    public void setLongRunningVersion(int i) {
        if (this.getOutputStallDuration < 0) {
            return;
        }
        this.getOutputStallDuration = i;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public com.datadog.trace.api.TraceConfig traceConfig() {
        return this.getHighSpeedVideoFpsRangesFor.getTrace().getOutputMinFrameDuration;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentSpan
    public void addLink(com.datadog.trace.bootstrap.instrumentation.api.AgentSpanLink agentSpanLink) {
        if (agentSpanLink != null) {
            this.getInputFormats.add(agentSpanLink);
        }
    }

    public long getStartTimeNano() {
        return this.getOutputMinFrameDurationlomOqCM;
    }
}
