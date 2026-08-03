package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001a\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0005Jb\u0010\u001a\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u0002H\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00190!2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00160!H\u0083\b¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00162\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0004J\b\u0010*\u001a\u00020\u0003H\u0002J\u0006\u0010+\u001a\u00020\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\f\u00100\u001a\u00020\u0019*\u00020\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000bX\u0082\u0004R\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "permits", "", "acquiredPermits", "<init>", "(II)V", "head", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "tail", "enqIdx", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "onCancellationRelease", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "tryAcquire", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "waiter", "Lkotlinx/coroutines/CancellableContinuation;", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "suspend", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "decPermits", "release", "coerceAvailablePermitsAtMaximum", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SemaphoreAndMutexImpl {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private final kotlin.jvm.functions.Function3<java.lang.Throwable, kotlin.Unit, kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ java.lang.Object tail$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater head$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, java.lang.Object.class, "head$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater deqIdx$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater tail$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, java.lang.Object.class, "tail$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater enqIdx$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _availablePermits$volatile$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.class, "_availablePermits$volatile");

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ java.lang.Object getHead$volatile() {
        return this.head$volatile;
    }

    private final /* synthetic */ java.lang.Object getTail$volatile() {
        return this.tail$volatile;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long j) {
        this.deqIdx$volatile = j;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long j) {
        this.enqIdx$volatile = j;
    }

    private final /* synthetic */ void setHead$volatile(java.lang.Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void setTail$volatile(java.lang.Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int i) {
        this._availablePermits$volatile = i;
    }

    public SemaphoreAndMutexImpl(int i, int i2) {
        this.permits = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new java.lang.IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = new kotlinx.coroutines.sync.SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i2;
        this.onCancellationRelease = new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.sync.SemaphoreAndMutexImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit onCancellationRelease$lambda$2;
                onCancellationRelease$lambda$2 = kotlinx.coroutines.sync.SemaphoreAndMutexImpl.onCancellationRelease$lambda$2(kotlinx.coroutines.sync.SemaphoreAndMutexImpl.this, (java.lang.Throwable) obj, (kotlin.Unit) obj2, (kotlin.coroutines.CoroutineContext) obj3);
                return onCancellationRelease$lambda$2;
            }
        };
    }

    public final int getAvailablePermits() {
        return java.lang.Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onCancellationRelease$lambda$2(kotlinx.coroutines.sync.SemaphoreAndMutexImpl semaphoreAndMutexImpl, java.lang.Throwable th, kotlin.Unit unit, kotlin.coroutines.CoroutineContext coroutineContext) {
        semaphoreAndMutexImpl.release();
        return kotlin.Unit.INSTANCE;
    }

    public final boolean tryAcquire() {
        while (true) {
            int i = _availablePermits$volatile$FU.get(this);
            if (i > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final java.lang.Object acquire(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (decPermits() > 0) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object acquireSlowPath = acquireSlowPath(continuation);
        return acquireSlowPath == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? acquireSlowPath : kotlin.Unit.INSTANCE;
    }

    private final <W> void acquire(W waiter, kotlin.jvm.functions.Function1<? super W, java.lang.Boolean> suspend, kotlin.jvm.functions.Function1<? super W, kotlin.Unit> onAcquired) {
        while (decPermits() <= 0) {
            if (suspend.invoke(waiter).booleanValue()) {
                return;
            }
        }
        onAcquired.invoke(waiter);
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    public final void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new java.lang.IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i;
        do {
            i = _availablePermits$volatile$FU.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i, this.permits));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(kotlinx.coroutines.Waiter waiter) {
        int i;
        java.lang.Object findSegmentInternal;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = (kotlinx.coroutines.sync.SemaphoreSegment) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        i = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        long j = andIncrement / i;
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m12376getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m12376getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m12376getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment2 = (kotlinx.coroutines.sync.SemaphoreSegment) kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
        i2 = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        int i3 = (int) (andIncrement % i2);
        if (!com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i3, null, waiter)) {
            symbol = kotlinx.coroutines.sync.SemaphoreKt.PERMIT;
            symbol2 = kotlinx.coroutines.sync.SemaphoreKt.TAKEN;
            if (com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i3, symbol, symbol2)) {
                if (waiter instanceof kotlinx.coroutines.CancellableContinuation) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    ((kotlinx.coroutines.CancellableContinuation) waiter).resume((kotlinx.coroutines.CancellableContinuation) kotlin.Unit.INSTANCE, (kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super kotlinx.coroutines.CancellableContinuation, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>) this.onCancellationRelease);
                } else if (waiter instanceof kotlinx.coroutines.selects.SelectInstance) {
                    ((kotlinx.coroutines.selects.SelectInstance) waiter).selectInRegistrationPhase(kotlin.Unit.INSTANCE);
                } else {
                    throw new java.lang.IllegalStateException(("unexpected: " + waiter).toString());
                }
                return true;
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                return false;
            }
            java.lang.Object obj = semaphoreSegment2.getAcquirers().get(i3);
            symbol3 = kotlinx.coroutines.sync.SemaphoreKt.BROKEN;
            if (obj == symbol3) {
                return false;
            }
            throw new java.lang.AssertionError();
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i3);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        int i;
        java.lang.Object findSegmentInternal;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        int i3;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = (kotlinx.coroutines.sync.SemaphoreSegment) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        i = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        long j = andIncrement / i;
        kotlinx.coroutines.sync.SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = kotlinx.coroutines.sync.SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (kotlinx.coroutines.internal.SegmentOrClosed.m12378isClosedimpl(findSegmentInternal)) {
                break;
            }
            kotlinx.coroutines.internal.Segment m12376getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
            while (true) {
                kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m12376getSegmentimpl.id) {
                    break loop0;
                }
                if (!m12376getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m12376getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m12376getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m12376getSegmentimpl.remove();
                }
            }
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment2 = (kotlinx.coroutines.sync.SemaphoreSegment) kotlinx.coroutines.internal.SegmentOrClosed.m12376getSegmentimpl(findSegmentInternal);
        semaphoreSegment2.cleanPrev();
        if (semaphoreSegment2.id > j) {
            return false;
        }
        i2 = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        int i4 = (int) (andIncrement % i2);
        symbol = kotlinx.coroutines.sync.SemaphoreKt.PERMIT;
        java.lang.Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i4, symbol);
        if (andSet == null) {
            i3 = kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES;
            for (int i5 = 0; i5 < i3; i5++) {
                java.lang.Object obj = semaphoreSegment2.getAcquirers().get(i4);
                symbol5 = kotlinx.coroutines.sync.SemaphoreKt.TAKEN;
                if (obj == symbol5) {
                    return true;
                }
            }
            symbol3 = kotlinx.coroutines.sync.SemaphoreKt.PERMIT;
            symbol4 = kotlinx.coroutines.sync.SemaphoreKt.BROKEN;
            return !com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i4, symbol3, symbol4);
        }
        symbol2 = kotlinx.coroutines.sync.SemaphoreKt.CANCELLED;
        if (andSet == symbol2) {
            return false;
        }
        return tryResumeAcquire(andSet);
    }

    private final boolean tryResumeAcquire(java.lang.Object obj) {
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            kotlinx.coroutines.CancellableContinuation cancellableContinuation = (kotlinx.coroutines.CancellableContinuation) obj;
            java.lang.Object tryResume = cancellableContinuation.tryResume(kotlin.Unit.INSTANCE, null, this.onCancellationRelease);
            if (tryResume == null) {
                return false;
            }
            cancellableContinuation.completeResume(tryResume);
            return true;
        }
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            return ((kotlinx.coroutines.selects.SelectInstance) obj).trySelect(this, kotlin.Unit.INSTANCE);
        }
        throw new java.lang.IllegalStateException(("unexpected: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object acquireSlowPath(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
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

    protected final void acquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> waiter) {
        while (decPermits() <= 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((kotlinx.coroutines.Waiter) waiter)) {
                return;
            }
        }
        waiter.resume((kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>) kotlin.Unit.INSTANCE, this.onCancellationRelease);
    }

    protected final void onAcquireRegFunction(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        while (decPermits() <= 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((kotlinx.coroutines.Waiter) select)) {
                return;
            }
        }
        select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
    }
}
