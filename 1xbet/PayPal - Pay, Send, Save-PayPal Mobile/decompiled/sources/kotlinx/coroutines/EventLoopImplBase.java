package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004:;<=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00142\n\u0010\u001f\u001a\u00060 j\u0002`!H\u0004¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0014H\u0016J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\n\u0010\u001f\u001a\u00060 j\u0002`!¢\u0006\u0002\u0010'J\u0019\u0010(\u001a\u00020\u00182\n\u0010)\u001a\u00060 j\u0002`!H\u0016¢\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020\r2\n\u0010)\u001a\u00060 j\u0002`!H\u0002¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0002¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0018H\u0002J\b\u00100\u001a\u00020\u0018H\u0002J\u0016\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u00020\r2\u0006\u0010)\u001a\u000204H\u0002J\u0018\u00106\u001a\u0002072\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u000204H\u0002J\b\u00108\u001a\u00020\u0018H\u0004J\b\u00109\u001a\u00020\u0018H\u0002R\u0011\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004R\u0011\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006>"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "<init>", "()V", "_queue", "Lkotlinx/atomicfu/AtomicRef;", "", "_delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_isCompleted", "Lkotlinx/atomicfu/AtomicBoolean;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "nextTime", "", "getNextTime", "()J", "shutdown", "", "scheduleResumeAfterDelay", "timeMillis", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "scheduleInvokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "processNextEvent", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "enqueue", "task", "(Ljava/lang/Runnable;)V", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "dequeue", "()Ljava/lang/Runnable;", "enqueueDelayedTasks", "closeQueue", "schedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "shouldUnpark", "scheduleImpl", "", "resetAll", "rescheduleAllDelayed", "DelayedTask", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoopImplPlatform implements kotlinx.coroutines.Delay {
    private volatile /* synthetic */ java.lang.Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ java.lang.Object _queue$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, java.lang.Object.class, "_queue$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, java.lang.Object.class, "_delayed$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.EventLoopImplBase.class, "_isCompleted$volatile");

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.Delay.DefaultImpls.delay(this, j, continuation);
    }

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long j, java.lang.Runnable runnable, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(this, j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
        kotlinx.coroutines.internal.Symbol symbol;
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) getHighSpeedVideoFpsRanges.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.isEmpty()) {
            return false;
        }
        java.lang.Object obj = Camera2StreamConfigurationMap.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore) {
            return ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).isEmpty();
        }
        symbol = kotlinx.coroutines.EventLoop_commonKt.Camera2StreamConfigurationMap;
        return obj == symbol;
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
        kotlinx.coroutines.EventLoopImplBase.DelayedTask peek;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        kotlinx.coroutines.internal.Symbol symbol;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        java.lang.Object obj = Camera2StreamConfigurationMap.get(this);
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                symbol = kotlinx.coroutines.EventLoop_commonKt.Camera2StreamConfigurationMap;
                return obj == symbol ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).isEmpty()) {
                return 0L;
            }
        }
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) getHighSpeedVideoFpsRanges.get(this);
        if (delayedTaskQueue == null || (peek = delayedTaskQueue.peek()) == null) {
            return Long.MAX_VALUE;
        }
        long j = peek.nanoTime;
        abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
        return kotlin.ranges.RangesKt.coerceAtLeast(j - (abstractTimeSource != null ? abstractTimeSource.nanoTime() : java.lang.System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        kotlinx.coroutines.EventLoopImplBase.DelayedTask removeFirstOrNull;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        getHighResolutionOutputSizeshNQ4ISI.set(this, 1);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !getHighSpeedVideoSizes()) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore)) {
                    symbol2 = kotlinx.coroutines.EventLoop_commonKt.Camera2StreamConfigurationMap;
                    if (obj == symbol2) {
                        break;
                    }
                    kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = new kotlinx.coroutines.internal.LockFreeTaskQueueCore(8, true);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    lockFreeTaskQueueCore.addLast((java.lang.Runnable) obj);
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, obj, lockFreeTaskQueueCore)) {
                        break;
                    }
                } else {
                    ((kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj).close();
                    break;
                }
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Camera2StreamConfigurationMap;
                symbol = kotlinx.coroutines.EventLoop_commonKt.Camera2StreamConfigurationMap;
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, null, symbol)) {
                    break;
                }
            }
        }
        while (processNextEvent() <= 0) {
        }
        abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
        long nanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : java.lang.System.nanoTime();
        while (true) {
            kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) getHighSpeedVideoFpsRanges.get(this);
            if (delayedTaskQueue == null || (removeFirstOrNull = delayedTaskQueue.removeFirstOrNull()) == null) {
                return;
            } else {
                reschedule(nanoTime, removeFirstOrNull);
            }
        }
    }

    @Override // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        long delayToNanos = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(timeMillis);
        if (delayToNanos < 4611686018427387903L) {
            abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
            long nanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : java.lang.System.nanoTime();
            kotlinx.coroutines.EventLoopImplBase.DelayedResumeTask delayedResumeTask = new kotlinx.coroutines.EventLoopImplBase.DelayedResumeTask(delayToNanos + nanoTime, continuation);
            schedule(nanoTime, delayedResumeTask);
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(continuation, delayedResumeTask);
        }
    }

    protected final kotlinx.coroutines.DisposableHandle scheduleInvokeOnTimeout(long timeMillis, java.lang.Runnable block) {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        long delayToNanos = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(timeMillis);
        if (delayToNanos < 4611686018427387903L) {
            abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
            long nanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : java.lang.System.nanoTime();
            kotlinx.coroutines.EventLoopImplBase.DelayedRunnableTask delayedRunnableTask = new kotlinx.coroutines.EventLoopImplBase.DelayedRunnableTask(delayToNanos + nanoTime, block);
            schedule(nanoTime, delayedRunnableTask);
            return delayedRunnableTask;
        }
        return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
        if (processUnconfinedEvent()) {
            return 0L;
        }
        getHighSpeedVideoFpsRangesFor();
        java.lang.Runnable highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            highSpeedVideoFpsRanges.run();
            return 0L;
        }
        return getNextTime();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        enqueue(block);
    }

    public void enqueue(java.lang.Runnable task) {
        getHighSpeedVideoFpsRangesFor();
        if (getHighSpeedVideoFpsRangesFor(task)) {
            unpark();
        } else {
            kotlinx.coroutines.DefaultExecutor.INSTANCE.enqueue(task);
        }
    }

    public final void schedule(long now, kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(now, delayedTask);
        if (highSpeedVideoSizes == 0) {
            if (getHighSpeedVideoFpsRanges(delayedTask)) {
                unpark();
            }
        } else if (highSpeedVideoSizes == 1) {
            reschedule(now, delayedTask);
        } else if (highSpeedVideoSizes != 2) {
            throw new java.lang.IllegalStateException("unexpected result".toString());
        }
    }

    private final int getHighSpeedVideoSizes(long j, kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        if (getHighSpeedVideoSizes()) {
            return 1;
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue == null) {
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, null, new kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue(j));
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) obj;
        }
        return delayedTask.scheduleTask(j, delayedTaskQueue, this);
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R0\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020\r8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "compareTo", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "now", "", "timeToExecute", "(J)Z", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "delayed", "Lkotlinx/coroutines/EventLoopImplBase;", "eventLoop", "scheduleTask", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;Lkotlinx/coroutines/EventLoopImplBase;)I", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "J", "_heap", "Ljava/lang/Object;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "heap", "index", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "setIndex", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {
        private volatile java.lang.Object _heap;
        private int index = -1;
        public long nanoTime;

        public DelayedTask(long j) {
            this.nanoTime = j;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
            java.lang.Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.ThreadSafeHeap) {
                return (kotlinx.coroutines.internal.ThreadSafeHeap) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> threadSafeHeap) {
            kotlinx.coroutines.internal.Symbol symbol;
            java.lang.Object obj = this._heap;
            symbol = kotlinx.coroutines.EventLoop_commonKt.getHighSpeedVideoFpsRanges;
            if (obj == symbol) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = threadSafeHeap;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
            return this.index;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int i) {
            this.index = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask other) {
            long j = this.nanoTime - other.nanoTime;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final boolean timeToExecute(long now) {
            return now - this.nanoTime >= 0;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Delayed[nanos=");
            sb.append(this.nanoTime);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }

        public final int scheduleTask(long now, kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayed, kotlinx.coroutines.EventLoopImplBase eventLoop) {
            kotlinx.coroutines.internal.Symbol symbol;
            synchronized (this) {
                java.lang.Object obj = this._heap;
                symbol = kotlinx.coroutines.EventLoop_commonKt.getHighSpeedVideoFpsRanges;
                if (obj == symbol) {
                    return 2;
                }
                kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = delayed;
                synchronized (delayedTaskQueue) {
                    kotlinx.coroutines.EventLoopImplBase.DelayedTask firstImpl = delayedTaskQueue.firstImpl();
                    if (eventLoop.getHighSpeedVideoSizes()) {
                        return 1;
                    }
                    if (firstImpl == null) {
                        delayed.timeNow = now;
                    } else {
                        long j = firstImpl.nanoTime;
                        if (j - now < 0) {
                            now = j;
                        }
                        if (now - delayed.timeNow > 0) {
                            delayed.timeNow = now;
                        }
                    }
                    if (this.nanoTime - delayed.timeNow < 0) {
                        this.nanoTime = delayed.timeNow;
                    }
                    delayedTaskQueue.addImpl(this);
                    return 0;
                }
            }
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            synchronized (this) {
                java.lang.Object obj = this._heap;
                symbol = kotlinx.coroutines.EventLoop_commonKt.getHighSpeedVideoFpsRanges;
                if (obj == symbol) {
                    return;
                }
                kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = obj instanceof kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue ? (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) obj : null;
                if (delayedTaskQueue != null) {
                    delayedTaskQueue.remove(this);
                }
                symbol2 = kotlinx.coroutines.EventLoop_commonKt.getHighSpeedVideoFpsRanges;
                this._heap = symbol2;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "", "p1", "<init>", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CancellableContinuation;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class DelayedResumeTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> getHighSpeedVideoFpsRanges;

        /* JADX WARN: Multi-variable type inference failed */
        public DelayedResumeTask(long j, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation) {
            super(j);
            this.getHighSpeedVideoFpsRanges = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoFpsRanges.resumeUndispatched(kotlinx.coroutines.EventLoopImplBase.this, kotlin.Unit.INSTANCE);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            sb.append(this.getHighSpeedVideoFpsRanges);
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "", "p0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "p1", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Runnable;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class DelayedRunnableTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.Runnable getHighSpeedVideoSizes;

        public DelayedRunnableTask(long j, java.lang.Runnable runnable) {
            super(j);
            this.getHighSpeedVideoSizes = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoSizes.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            sb.append(this.getHighSpeedVideoSizes);
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "", "timeNow", "<init>", "(J)V", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DelayedTaskQueue extends kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long j) {
            this.timeNow = j;
        }
    }

    private final java.lang.Runnable getHighSpeedVideoFpsRanges() {
        kotlinx.coroutines.internal.Symbol symbol;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj;
                java.lang.Object removeFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
                if (removeFirstOrNull != kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN) {
                    return (java.lang.Runnable) removeFirstOrNull;
                }
                androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, obj, lockFreeTaskQueueCore.next());
            } else {
                symbol = kotlinx.coroutines.EventLoop_commonKt.Camera2StreamConfigurationMap;
                if (obj == symbol) {
                    return null;
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, obj, null)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    return (java.lang.Runnable) obj;
                }
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask;
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) getHighSpeedVideoFpsRanges.get(this);
        if (delayedTaskQueue == null || delayedTaskQueue.isEmpty()) {
            return;
        }
        abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
        long nanoTime = abstractTimeSource != null ? abstractTimeSource.nanoTime() : java.lang.System.nanoTime();
        do {
            kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue2 = delayedTaskQueue;
            synchronized (delayedTaskQueue2) {
                kotlinx.coroutines.EventLoopImplBase.DelayedTask firstImpl = delayedTaskQueue2.firstImpl();
                delayedTask = null;
                if (firstImpl != null) {
                    kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask2 = firstImpl;
                    if (delayedTask2.timeToExecute(nanoTime) && getHighSpeedVideoFpsRangesFor(delayedTask2)) {
                        delayedTask = delayedTaskQueue2.removeAtImpl(0);
                    }
                }
            }
        } while (delayedTask != null);
    }

    private final boolean getHighSpeedVideoFpsRangesFor(java.lang.Runnable runnable) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Camera2StreamConfigurationMap;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (getHighSpeedVideoSizes()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) obj;
                int addLast = lockFreeTaskQueueCore.addLast(runnable);
                if (addLast == 0) {
                    return true;
                }
                if (addLast == 1) {
                    androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, obj, lockFreeTaskQueueCore.next());
                } else if (addLast == 2) {
                    return false;
                }
            } else {
                symbol = kotlinx.coroutines.EventLoop_commonKt.Camera2StreamConfigurationMap;
                if (obj == symbol) {
                    return false;
                }
                kotlinx.coroutines.internal.LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore(8, true);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                lockFreeTaskQueueCore2.addLast((java.lang.Runnable) obj);
                lockFreeTaskQueueCore2.addLast(runnable);
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, obj, lockFreeTaskQueueCore2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoSizes() {
        return getHighResolutionOutputSizeshNQ4ISI.get(this) == 1;
    }

    private final boolean getHighSpeedVideoFpsRanges(kotlinx.coroutines.EventLoopImplBase.DelayedTask delayedTask) {
        kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue delayedTaskQueue = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) getHighSpeedVideoFpsRanges.get(this);
        return (delayedTaskQueue != null ? delayedTaskQueue.peek() : null) == delayedTask;
    }

    protected final void resetAll() {
        Camera2StreamConfigurationMap.set(this, null);
        getHighSpeedVideoFpsRanges.set(this, null);
    }
}
