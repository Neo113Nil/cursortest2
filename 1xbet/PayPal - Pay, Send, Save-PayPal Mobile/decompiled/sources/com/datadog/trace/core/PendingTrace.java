package com.datadog.trace.core;

/* loaded from: classes3.dex */
public class PendingTrace implements com.datadog.trace.bootstrap.instrumentation.api.AgentTrace, com.datadog.trace.core.PendingTraceBuffer.Element {
    private volatile long ArtificialStackFrames;
    private volatile int CoroutineDebuggingKt;
    private final com.datadog.trace.api.time.TimeSource _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final com.datadog.trace.api.DDTraceId f2928a;
    private volatile int accessartificialFrame;
    private final boolean b;
    private volatile boolean coroutineBoundary;
    private volatile com.datadog.trace.core.DDSpan coroutineCreation;
    final java.util.concurrent.ConcurrentLinkedDeque<com.datadog.trace.core.DDSpan> getHighSpeedVideoSizesFor;
    final com.datadog.trace.core.monitor.HealthMetrics getInputFormats;
    final com.datadog.trace.core.PendingTraceBuffer getInputSizeshNQ4ISI;
    final com.datadog.trace.core.CoreTracer getOutputFormats;
    final com.datadog.trace.core.CoreTracer.ConfigSnapshot getOutputMinFrameDuration;
    private volatile int getOutputSizeshNQ4ISI;
    private final com.datadog.trace.logger.Logger getValidOutputFormatsForInputhNQ4ISI;
    private volatile long isOutputSupportedFor;
    private volatile long isOutputSupportedForhNQ4ISI;
    private volatile long toString;
    private volatile int unwrapAs;
    private static final java.util.List<com.datadog.trace.core.DDSpan> getOutputMinFrameDurationlomOqCM = new java.util.ArrayList(0);
    static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.PendingTrace> getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, "getOutputSizeshNQ4ISI");
    static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.PendingTrace> getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, "CoroutineDebuggingKt");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.PendingTrace> getOutputStallDuration = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, "unwrapAs");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<com.datadog.trace.core.PendingTrace> getOutputStallDurationlomOqCM = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, "accessartificialFrame");
    static final java.util.concurrent.atomic.AtomicLongFieldUpdater<com.datadog.trace.core.PendingTrace> getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, "ArtificialStackFrames");
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater<com.datadog.trace.core.PendingTrace> getOutputSizes = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, "isOutputSupportedForhNQ4ISI");
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.datadog.trace.core.PendingTrace, com.datadog.trace.core.DDSpan> getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, com.datadog.trace.core.DDSpan.class, "coroutineCreation");
    static final java.util.concurrent.atomic.AtomicLongFieldUpdater<com.datadog.trace.core.PendingTrace> Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(com.datadog.trace.core.PendingTrace.class, "toString");

    enum PublishState {
        WRITTEN,
        PARTIAL_FLUSH,
        ROOT_BUFFERED,
        BUFFERED,
        PENDING
    }

    static class Factory {
        final boolean Camera2StreamConfigurationMap;
        final com.datadog.trace.core.CoreTracer getHighResolutionOutputSizeshNQ4ISI;
        final com.datadog.trace.core.PendingTraceBuffer getHighSpeedVideoFpsRanges;
        final com.datadog.trace.api.time.TimeSource getHighSpeedVideoFpsRangesFor;
        final com.datadog.trace.core.monitor.HealthMetrics getHighSpeedVideoSizes;

        Factory(com.datadog.trace.core.CoreTracer coreTracer, com.datadog.trace.core.PendingTraceBuffer pendingTraceBuffer, com.datadog.trace.api.time.TimeSource timeSource, boolean z, com.datadog.trace.core.monitor.HealthMetrics healthMetrics) {
            this.getHighResolutionOutputSizeshNQ4ISI = coreTracer;
            this.getHighSpeedVideoFpsRanges = pendingTraceBuffer;
            this.getHighSpeedVideoFpsRangesFor = timeSource;
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoSizes = healthMetrics;
        }
    }

    private PendingTrace(com.datadog.trace.core.CoreTracer coreTracer, com.datadog.trace.api.DDTraceId dDTraceId, com.datadog.trace.core.PendingTraceBuffer pendingTraceBuffer, com.datadog.trace.api.time.TimeSource timeSource, com.datadog.trace.core.CoreTracer.ConfigSnapshot configSnapshot, boolean z, com.datadog.trace.core.monitor.HealthMetrics healthMetrics) {
        this.getOutputSizeshNQ4ISI = 0;
        this.CoroutineDebuggingKt = 0;
        this.unwrapAs = 0;
        this.accessartificialFrame = 0;
        this.ArtificialStackFrames = 0L;
        this.isOutputSupportedForhNQ4ISI = 0L;
        this.coroutineCreation = null;
        this.coroutineBoundary = false;
        this.isOutputSupportedFor = 0L;
        this.getOutputFormats = coreTracer;
        this.f2928a = dDTraceId;
        this.getInputSizeshNQ4ISI = pendingTraceBuffer;
        this._CREATION = timeSource;
        this.getOutputMinFrameDuration = configSnapshot == null ? coreTracer.captureTraceConfig() : configSnapshot;
        this.b = z;
        this.getInputFormats = healthMetrics;
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.ConcurrentLinkedDeque<>();
        this.getValidOutputFormatsForInputhNQ4ISI = com.datadog.trace.logger.LoggerFactory.getLogger("PendingTrace", coreTracer.getHighResolutionOutputSizeshNQ4ISI);
    }

    public long getCurrentTimeNano() {
        long nanoTicks = this._CREATION.getNanoTicks();
        this.isOutputSupportedFor = nanoTicks;
        com.datadog.trace.core.CoreTracer coreTracer = this.getOutputFormats;
        long max = coreTracer.getOutputMinFrameDurationlomOqCM + java.lang.Math.max(0L, nanoTicks - coreTracer.getOutputSizeshNQ4ISI);
        if (nanoTicks - coreTracer.getOutputFormats >= coreTracer.getHighSpeedVideoFpsRangesFor) {
            long currentTimeNanos = max - coreTracer.getOutputStallDurationlomOqCM.getCurrentTimeNanos();
            if (java.lang.Math.abs(coreTracer.Camera2StreamConfigurationMap + currentTimeNanos) >= 1000000) {
                coreTracer.Camera2StreamConfigurationMap = -java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(currentTimeNanos));
            }
            coreTracer.getOutputFormats = nanoTicks;
        }
        return max + coreTracer.Camera2StreamConfigurationMap;
    }

    public com.datadog.trace.api.time.TimeSource getTimeSource() {
        return this._CREATION;
    }

    public void touch() {
        this.isOutputSupportedFor = this._CREATION.getNanoTicks();
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public boolean lastReferencedNanosAgo(long j) {
        return j < this._CREATION.getNanoTicks() - this.isOutputSupportedFor;
    }

    public java.lang.Integer evaluateSamplingPriority() {
        com.datadog.trace.core.DDSpan peek = this.getHighSpeedVideoSizesFor.peek();
        if (peek == null) {
            return null;
        }
        java.lang.Integer traceSamplingPriority = peek.getTraceSamplingPriority();
        return traceSamplingPriority == null ? peek.forceSamplingDecision() : traceSamplingPriority;
    }

    public boolean compareAndSetLongRunningState(int i, int i2) {
        return getOutputStallDurationlomOqCM.compareAndSet(this, i, i2);
    }

    final com.datadog.trace.core.PendingTrace.PublishState Camera2StreamConfigurationMap(com.datadog.trace.core.DDSpan dDSpan) {
        if (!this.getInputSizeshNQ4ISI.longRunningSpansEnabled()) {
            this.getHighSpeedVideoSizesFor.addFirst(dDSpan);
        }
        this.getInputFormats.onFinishSpan();
        getHighSpeedVideoFpsRanges.incrementAndGet(this);
        return getHighSpeedVideoFpsRangesFor(dDSpan == getRootSpan());
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public com.datadog.trace.core.DDSpan getRootSpan() {
        return this.coroutineCreation;
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public long oldestFinishedTime() {
        java.util.Iterator<com.datadog.trace.core.DDSpan> it = this.getHighSpeedVideoSizesFor.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            com.datadog.trace.core.DDSpan next = it.next();
            if (next.isFinished()) {
                j = java.lang.Math.min(j, next.getStartTime() + next.getDurationNano());
            }
        }
        return j;
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTrace
    public void registerContinuation(com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation continuation) {
        getHighSpeedVideoFpsRangesFor.incrementAndGet(this);
    }

    @Override // com.datadog.trace.bootstrap.instrumentation.api.AgentTrace
    public void cancelContinuation(com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation continuation) {
        getHighSpeedVideoFpsRangesFor(false);
        this.getInputFormats.onCancelContinuation();
    }

    private com.datadog.trace.core.PendingTrace.PublishState getHighSpeedVideoFpsRangesFor(boolean z) {
        int decrementAndGet = getHighSpeedVideoFpsRangesFor.decrementAndGet(this);
        if (this.b && decrementAndGet < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pending reference count ");
            sb.append(decrementAndGet);
            sb.append(" is negative");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        int partialFlushMinSpans = this.getOutputFormats.getPartialFlushMinSpans();
        if (decrementAndGet == 0 && (this.b || !this.coroutineBoundary)) {
            write();
            return com.datadog.trace.core.PendingTrace.PublishState.WRITTEN;
        }
        if (z) {
            this.getInputSizeshNQ4ISI.enqueue(this);
            return com.datadog.trace.core.PendingTrace.PublishState.ROOT_BUFFERED;
        }
        if (partialFlushMinSpans <= 0 || size() <= partialFlushMinSpans) {
            if (this.coroutineBoundary) {
                this.getInputSizeshNQ4ISI.enqueue(this);
                return com.datadog.trace.core.PendingTrace.PublishState.BUFFERED;
            }
            return com.datadog.trace.core.PendingTrace.PublishState.PENDING;
        }
        int highSpeedVideoSizes = getHighSpeedVideoSizes(true);
        this.getInputFormats.onPartialFlush(highSpeedVideoSizes);
        if (this.getValidOutputFormatsForInputhNQ4ISI.isDebugEnabled()) {
            this.getValidOutputFormatsForInputhNQ4ISI.debug("t_id={} -> wrote partial trace of size {}", this.f2928a, java.lang.Integer.valueOf(highSpeedVideoSizes));
        }
        return com.datadog.trace.core.PendingTrace.PublishState.PARTIAL_FLUSH;
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public void write() {
        getHighSpeedVideoSizes(false);
    }

    private int getHighSpeedVideoSizes(boolean z) {
        java.util.List<com.datadog.trace.core.DDSpan> list;
        int i;
        if (!this.getHighSpeedVideoSizesFor.isEmpty()) {
            com.datadog.trace.monitor.Recording start = this.getOutputFormats.toString.start();
            try {
                synchronized (this) {
                    boolean z2 = true;
                    if (!z) {
                        this.coroutineBoundary = true;
                    }
                    int size = size();
                    if (3 != getOutputStallDurationlomOqCM.get(this)) {
                        z2 = false;
                    }
                    if (z2) {
                        size += this.CoroutineDebuggingKt;
                    }
                    if (size > 0 && (!z || size >= this.getOutputFormats.getPartialFlushMinSpans())) {
                        list = new java.util.ArrayList<>(size);
                        i = enqueueSpansToWrite(list, z2);
                    } else {
                        list = getOutputMinFrameDurationlomOqCM;
                        i = 0;
                    }
                }
                if (!list.isEmpty()) {
                    getHighSpeedVideoFpsRanges.addAndGet(this, -i);
                    com.datadog.trace.core.CoreTracer coreTracer = this.getOutputFormats;
                    if (!list.isEmpty()) {
                        boolean publish = coreTracer.getOutputMinFrameDuration.publish(list);
                        com.datadog.trace.core.PendingTrace trace = list.get(0).context().getTrace();
                        trace.setSamplingPriorityIfNecessary();
                        com.datadog.trace.core.DDSpan rootSpan = trace.getRootSpan();
                        com.datadog.trace.core.DDSpan dDSpan = rootSpan == null ? list.get(0) : rootSpan;
                        dDSpan.forceKeep(publish);
                        if (publish || trace.sample(dDSpan)) {
                            coreTracer.isOutputSupportedFor.write(list);
                        } else {
                            coreTracer.isOutputSupportedFor.incrementDropCounts(list.size());
                        }
                        if (rootSpan != null) {
                            coreTracer.onRootSpanFinished(rootSpan, rootSpan.getEndpointTracker());
                            com.datadog.trace.api.gateway.RequestContext requestContext = rootSpan.getRequestContext();
                            if (requestContext != null) {
                                try {
                                    requestContext.close();
                                } catch (java.io.IOException e) {
                                    coreTracer.getInputFormats.warn("Error closing request context data", (java.lang.Throwable) e);
                                }
                            }
                        }
                    }
                    this.getInputFormats.onCreateTrace();
                    if (start != null) {
                        start.close();
                    }
                    return i;
                }
                if (start != null) {
                    start.close();
                }
            } catch (java.lang.Throwable th) {
                if (start != null) {
                    try {
                        start.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return 0;
    }

    public int enqueueSpansToWrite(java.util.List<com.datadog.trace.core.DDSpan> list, boolean z) {
        long j;
        long j2 = 0;
        if (z) {
            j = getCurrentTimeNano();
            setLastWriteTime(j);
        } else {
            j = 0;
        }
        com.datadog.trace.core.DDSpan pollFirst = this.getHighSpeedVideoSizesFor.pollFirst();
        int i = 0;
        boolean z2 = false;
        while (pollFirst != null) {
            if (z2 && pollFirst.getSpanId() == j2) {
                this.getHighSpeedVideoSizesFor.addFirst(pollFirst);
                return i;
            }
            if (pollFirst.isFinished()) {
                list.add(pollFirst);
                i++;
            } else {
                this.getHighSpeedVideoSizesFor.add(pollFirst);
                if (!z2) {
                    j2 = pollFirst.getSpanId();
                    z2 = true;
                }
                if (z) {
                    pollFirst.setLongRunningVersion((int) java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j - pollFirst.getStartTime()));
                    list.add(pollFirst);
                }
            }
            pollFirst = this.getHighSpeedVideoSizesFor.pollFirst();
        }
        return i;
    }

    public int size() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void beginEndToEnd() {
        Camera2StreamConfigurationMap.compareAndSet(this, 0L, getCurrentTimeNano());
    }

    public long getEndToEndStartTime() {
        return this.toString;
    }

    public long getLastWriteTime() {
        return getOutputSizes.get(this);
    }

    public long getRunningTraceStartTime() {
        return getHighResolutionOutputSizeshNQ4ISI.get(this);
    }

    public void setLastWriteTime(long j) {
        getOutputSizes.set(this, j);
    }

    public int getPendingReferenceCount() {
        return this.CoroutineDebuggingKt;
    }

    public boolean isRootSpanWritten() {
        return this.coroutineBoundary;
    }

    public java.util.List<com.datadog.trace.core.DDSpan> getSpans() {
        return this.getHighSpeedVideoSizesFor.isEmpty() ? getOutputMinFrameDurationlomOqCM : new java.util.ArrayList(this.getHighSpeedVideoSizesFor);
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public boolean setEnqueued(boolean z) {
        int i = !z ? 1 : 0;
        return getOutputStallDuration.compareAndSet(this, i, 1 - i);
    }

    @Override // com.datadog.trace.core.PendingTraceBuffer.Element
    public boolean writeOnBufferFull() {
        return !compareAndSetLongRunningState(1, -1);
    }

    public static long getDurationNano(com.datadog.trace.core.CoreSpan<?> coreSpan) {
        long durationNano = coreSpan.getDurationNano();
        return (durationNano > 0 || !(coreSpan instanceof com.datadog.trace.core.DDSpan)) ? durationNano : ((com.datadog.trace.core.DDSpan) coreSpan).context().getTrace().getLastWriteTime() - coreSpan.getStartTime();
    }

    public void setSamplingPriorityIfNecessary() {
        if ((this.getOutputMinFrameDuration.getOutputSizes instanceof com.datadog.trace.common.sampling.PrioritySampler) && this.coroutineCreation != null && this.coroutineCreation.context().getTraceSamplingPriority() == -128) {
            ((com.datadog.trace.common.sampling.PrioritySampler) this.getOutputMinFrameDuration.getOutputSizes).setSamplingPriority(this.coroutineCreation);
        }
    }

    public boolean sample(com.datadog.trace.core.DDSpan dDSpan) {
        return this.getOutputMinFrameDuration.getOutputSizes.sample(dDSpan);
    }

    /* synthetic */ PendingTrace(com.datadog.trace.core.CoreTracer coreTracer, com.datadog.trace.api.DDTraceId dDTraceId, com.datadog.trace.core.PendingTraceBuffer pendingTraceBuffer, com.datadog.trace.api.time.TimeSource timeSource, com.datadog.trace.core.CoreTracer.ConfigSnapshot configSnapshot, boolean z, com.datadog.trace.core.monitor.HealthMetrics healthMetrics, byte b) {
        this(coreTracer, dDTraceId, pendingTraceBuffer, timeSource, configSnapshot, z, healthMetrics);
    }
}
