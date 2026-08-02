package kotlinx.coroutines.sync;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001a\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0005Jb\u0010\u001a\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u0002H\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00190!2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00160!H\u0083\b¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00162\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0004J\b\u0010*\u001a\u00020\u0003H\u0002J\u0006\u0010+\u001a\u00020\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\f\u00100\u001a\u00020\u0019*\u00020\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000bX\u0082\u0004R\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "permits", "", "acquiredPermits", "<init>", "(II)V", "head", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "tail", "enqIdx", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "onCancellationRelease", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "tryAcquire", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "waiter", "Lkotlinx/coroutines/CancellableContinuation;", "W", "suspend", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "decPermits", "release", "coerceAvailablePermitsAtMaximum", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public class SemaphoreAndMutexImpl {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private final kotlin.jvm.functions.Function3<java.lang.Throwable, kotlin.Unit, kotlin.coroutines.CoroutineContext, kotlin.Unit> getInputSizeshNQ4ISI;
    private final int getOutputMinFrameDuration;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, java.lang.Object.class, "head$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, java.lang.Object.class, "tail$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, "_availablePermits$volatile");

    public SemaphoreAndMutexImpl(int i, int i2) {
        this.getOutputMinFrameDuration = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Semaphore should have at least 1 permit, but had ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new java.lang.IllegalArgumentException("The number of acquired permits should be in 0..".concat(java.lang.String.valueOf(i)).toString());
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = new kotlinx.coroutines.sync.SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i2;
        this.getInputSizeshNQ4ISI = new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.sync.SemaphoreAndMutexImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return kotlinx.coroutines.sync.SemaphoreAndMutexImpl.$r8$lambda$quHWd3GaEfdSVzfk9OcZcQLfclQ(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.this, (java.lang.Throwable) obj, (kotlin.Unit) obj2, (kotlin.coroutines.CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            if (!getHighSpeedVideoFpsRanges(orCreateCancellableContinuation)) {
                acquire((kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>) orCreateCancellableContinuation);
            }
            java.lang.Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$quHWd3GaEfdSVzfk9OcZcQLfclQ(kotlinx.coroutines.sync.SemaphoreAndMutexImpl semaphoreAndMutexImpl, java.lang.Throwable th, kotlin.Unit unit, kotlin.coroutines.CoroutineContext coroutineContext) {
        semaphoreAndMutexImpl.release();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges(kotlinx.coroutines.Waiter waiter) {
        int i;
        java.lang.Object findSegmentInternal;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoSizes;
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = (kotlinx.coroutines.sync.SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = getHighResolutionOutputSizeshNQ4ISI.getAndIncrement(this);
        kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.Camera2StreamConfigurationMap;
        i = kotlinx.coroutines.sync.SemaphoreKt.getHighResolutionOutputSizeshNQ4ISI;
        long j = andIncrement / i;
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
                break;
            }
            kotlinx.coroutines.internal.Segment m24124getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
            while (true) {
                kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m24124getSegmentimpl.id) {
                    break loop0;
                }
                if (m24124getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m24124getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m24124getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m24124getSegmentimpl.remove();
                    }
                }
            }
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment2 = (kotlinx.coroutines.sync.SemaphoreSegment) kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
        i2 = kotlinx.coroutines.sync.SemaphoreKt.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (int) (andIncrement % i2);
        if (!com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getHighSpeedVideoSizes, i3, null, waiter)) {
            symbol = kotlinx.coroutines.sync.SemaphoreKt.getHighSpeedVideoFpsRangesFor;
            symbol2 = kotlinx.coroutines.sync.SemaphoreKt.getOutputMinFrameDuration;
            if (com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getHighSpeedVideoSizes, i3, symbol, symbol2)) {
                if (waiter instanceof kotlinx.coroutines.CancellableContinuation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(waiter, "");
                    ((kotlinx.coroutines.CancellableContinuation) waiter).resume((kotlinx.coroutines.CancellableContinuation) kotlin.Unit.INSTANCE, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuation, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) this.getInputSizeshNQ4ISI);
                } else if (waiter instanceof kotlinx.coroutines.selects.SelectInstance) {
                    ((kotlinx.coroutines.selects.SelectInstance) waiter).selectInRegistrationPhase(kotlin.Unit.INSTANCE);
                } else {
                    throw new java.lang.IllegalStateException("unexpected: ".concat(java.lang.String.valueOf(waiter)).toString());
                }
                return true;
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                return false;
            }
            java.lang.Object obj = semaphoreSegment2.getHighSpeedVideoSizes.get(i3);
            symbol3 = kotlinx.coroutines.sync.SemaphoreKt.getHighSpeedVideoFpsRanges;
            if (obj == symbol3) {
                return false;
            }
            throw new java.lang.AssertionError();
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i3);
        return true;
    }

    public final java.lang.Object acquire(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        int andDecrement;
        do {
            andDecrement = getHighSpeedVideoFpsRanges.getAndDecrement(this);
        } while (andDecrement > this.getOutputMinFrameDuration);
        if (andDecrement > 0) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    protected final void acquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> waiter) {
        while (true) {
            int andDecrement = getHighSpeedVideoFpsRanges.getAndDecrement(this);
            if (andDecrement <= this.getOutputMinFrameDuration) {
                if (andDecrement <= 0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(waiter, "");
                    if (getHighSpeedVideoFpsRanges((kotlinx.coroutines.Waiter) waiter)) {
                        return;
                    }
                } else {
                    waiter.resume((kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>) kotlin.Unit.INSTANCE, this.getInputSizeshNQ4ISI);
                    return;
                }
            }
        }
    }

    public final int getAvailablePermits() {
        return java.lang.Math.max(getHighSpeedVideoFpsRanges.get(this), 0);
    }

    protected final void onAcquireRegFunction(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        while (true) {
            int andDecrement = getHighSpeedVideoFpsRanges.getAndDecrement(this);
            if (andDecrement <= this.getOutputMinFrameDuration) {
                if (andDecrement <= 0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(select, "");
                    if (getHighSpeedVideoFpsRanges((kotlinx.coroutines.Waiter) select)) {
                        return;
                    }
                } else {
                    select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
                    return;
                }
            }
        }
    }

    public final void release() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        int i3;
        java.lang.Object findSegmentInternal;
        int i4;
        kotlinx.coroutines.internal.Symbol symbol;
        int i5;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        boolean z;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        while (true) {
            int andIncrement = getHighSpeedVideoFpsRanges.getAndIncrement(this);
            if (andIncrement >= this.getOutputMinFrameDuration) {
                do {
                    atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
                    i = atomicIntegerFieldUpdater.get(this);
                    i2 = this.getOutputMinFrameDuration;
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The number of released permits cannot be greater than ");
                sb.append(this.getOutputMinFrameDuration);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = (kotlinx.coroutines.sync.SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = Camera2StreamConfigurationMap.getAndIncrement(this);
            i3 = kotlinx.coroutines.sync.SemaphoreKt.getHighResolutionOutputSizeshNQ4ISI;
            long j = andIncrement2 / i3;
            kotlinx.coroutines.sync.SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = kotlinx.coroutines.sync.SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.getHighSpeedVideoFpsRanges;
            while (true) {
                findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (kotlinx.coroutines.internal.SegmentOrClosed.m24126isClosedimpl(findSegmentInternal)) {
                    break;
                }
                kotlinx.coroutines.internal.Segment m24124getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m24124getSegmentimpl.id) {
                        break;
                    }
                    if (m24124getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m24124getSegmentimpl)) {
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                            }
                        } else if (m24124getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            m24124getSegmentimpl.remove();
                        }
                    }
                }
            }
            kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment2 = (kotlinx.coroutines.sync.SemaphoreSegment) kotlinx.coroutines.internal.SegmentOrClosed.m24124getSegmentimpl(findSegmentInternal);
            semaphoreSegment2.cleanPrev();
            if (semaphoreSegment2.id <= j) {
                i4 = kotlinx.coroutines.sync.SemaphoreKt.getHighResolutionOutputSizeshNQ4ISI;
                int i6 = (int) (andIncrement2 % i4);
                symbol = kotlinx.coroutines.sync.SemaphoreKt.getHighSpeedVideoFpsRangesFor;
                java.lang.Object andSet = semaphoreSegment2.getHighSpeedVideoSizes.getAndSet(i6, symbol);
                if (andSet == null) {
                    i5 = kotlinx.coroutines.sync.SemaphoreKt.Camera2StreamConfigurationMap;
                    for (int i7 = 0; i7 < i5; i7++) {
                        java.lang.Object obj = semaphoreSegment2.getHighSpeedVideoSizes.get(i6);
                        symbol4 = kotlinx.coroutines.sync.SemaphoreKt.getOutputMinFrameDuration;
                        if (obj == symbol4) {
                            return;
                        }
                    }
                    symbol2 = kotlinx.coroutines.sync.SemaphoreKt.getHighSpeedVideoFpsRangesFor;
                    symbol3 = kotlinx.coroutines.sync.SemaphoreKt.getHighSpeedVideoFpsRanges;
                    z = !com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getHighSpeedVideoSizes, i6, symbol2, symbol3);
                } else {
                    symbol5 = kotlinx.coroutines.sync.SemaphoreKt.getHighSpeedVideoSizes;
                    if (andSet == symbol5) {
                        continue;
                    } else if (andSet instanceof kotlinx.coroutines.CancellableContinuation) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(andSet, "");
                        kotlinx.coroutines.CancellableContinuation cancellableContinuation = (kotlinx.coroutines.CancellableContinuation) andSet;
                        java.lang.Object tryResume = cancellableContinuation.tryResume(kotlin.Unit.INSTANCE, null, this.getInputSizeshNQ4ISI);
                        if (tryResume != null) {
                            cancellableContinuation.completeResume(tryResume);
                            return;
                        }
                    } else if (andSet instanceof kotlinx.coroutines.selects.SelectInstance) {
                        z = ((kotlinx.coroutines.selects.SelectInstance) andSet).trySelect(this, kotlin.Unit.INSTANCE);
                    } else {
                        throw new java.lang.IllegalStateException("unexpected: ".concat(java.lang.String.valueOf(andSet)).toString());
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public final boolean tryAcquire() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = getHighSpeedVideoFpsRanges;
            int i3 = atomicIntegerFieldUpdater2.get(this);
            if (i3 > this.getOutputMinFrameDuration) {
                do {
                    atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
                    i = atomicIntegerFieldUpdater.get(this);
                    i2 = this.getOutputMinFrameDuration;
                    if (i > i2) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
            } else {
                if (i3 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater2.compareAndSet(this, i3, i3 - 1)) {
                    return true;
                }
            }
        }
    }
}
