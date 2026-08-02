package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0002\u0010\u001aJ2\u0010\u001c\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\u000ej\u0002`\u000f2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u001fR\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u001eH\u0082\b¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0002J\u0015\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0007H\u0016J\u0016\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(H\u0097A¢\u0006\u0002\u0010)J*\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020(2\n\u0010\u0019\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0002\u0010-J\u001f\u0010.\u001a\u00020\u00162\u0006\u0010,\u001a\u00020(2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001600H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u0018\u0010\f\u001a\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u00062"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "name", "", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;ILjava/lang/String;)V", "runningWorkers", "Lkotlinx/atomicfu/AtomicInt;", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Ljava/lang/Object;", "limitedParallelism", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "dispatchInternal", "startWorker", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "(Ljava/lang/Runnable;Lkotlin/jvm/functions/Function1;)V", "tryAllocateWorker", "", "obtainTaskOrDeallocateWorker", "()Ljava/lang/Runnable;", "toString", "delay", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LimitedDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements kotlinx.coroutines.Delay {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.internal.LimitedDispatcher.class, "runningWorkers$volatile");
    private final /* synthetic */ kotlinx.coroutines.Delay getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> getOutputFormats;
    private final java.lang.Object getOutputMinFrameDuration;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, java.lang.String str) {
        kotlinx.coroutines.Delay delay = coroutineDispatcher instanceof kotlinx.coroutines.Delay ? (kotlinx.coroutines.Delay) coroutineDispatcher : null;
        this.getHighResolutionOutputSizeshNQ4ISI = delay == null ? kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay() : delay;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = str;
        this.getOutputFormats = new kotlinx.coroutines.internal.LockFreeTaskQueue<>(false);
        this.getOutputMinFrameDuration = new java.lang.Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name2) {
        kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(parallelism);
        return parallelism >= this.getHighSpeedVideoFpsRanges ? kotlinx.coroutines.internal.LimitedDispatcherKt.namedOrThis(this, name2) : super.limitedParallelism(parallelism, name2);
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        synchronized (this.getOutputMinFrameDuration) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Camera2StreamConfigurationMap;
            if (atomicIntegerFieldUpdater.get(this) >= this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Runnable getHighSpeedVideoSizes() {
        while (true) {
            java.lang.Runnable removeFirstOrNull = this.getOutputFormats.removeFirstOrNull();
            if (removeFirstOrNull != null) {
                return removeFirstOrNull;
            }
            synchronized (this.getOutputMinFrameDuration) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Camera2StreamConfigurationMap;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.getOutputFormats.getSize() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(".limitedParallelism(");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "p0", "<init>", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "", "run", "()V", "Camera2StreamConfigurationMap", "Ljava/lang/Runnable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class Worker implements java.lang.Runnable {
        private java.lang.Runnable Camera2StreamConfigurationMap;

        public Worker(java.lang.Runnable runnable) {
            this.Camera2StreamConfigurationMap = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 0;
            while (true) {
                try {
                    this.Camera2StreamConfigurationMap.run();
                } catch (java.lang.Throwable th) {
                    kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, th);
                }
                java.lang.Runnable highSpeedVideoSizes = kotlinx.coroutines.internal.LimitedDispatcher.this.getHighSpeedVideoSizes();
                if (highSpeedVideoSizes == null) {
                    return;
                }
                try {
                    this.Camera2StreamConfigurationMap = highSpeedVideoSizes;
                    i++;
                    if (i >= 16 && kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(kotlinx.coroutines.internal.LimitedDispatcher.this.getHighSpeedVideoFpsRangesFor, kotlinx.coroutines.internal.LimitedDispatcher.this)) {
                        kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(kotlinx.coroutines.internal.LimitedDispatcher.this.getHighSpeedVideoFpsRangesFor, kotlinx.coroutines.internal.LimitedDispatcher.this, this);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Object obj = kotlinx.coroutines.internal.LimitedDispatcher.this.getOutputMinFrameDuration;
                    kotlinx.coroutines.internal.LimitedDispatcher limitedDispatcher = kotlinx.coroutines.internal.LimitedDispatcher.this;
                    synchronized (obj) {
                        kotlinx.coroutines.internal.LimitedDispatcher.Camera2StreamConfigurationMap.decrementAndGet(limitedDispatcher);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        java.lang.Runnable highSpeedVideoSizes;
        this.getOutputFormats.addLast(block);
        if (Camera2StreamConfigurationMap.get(this) >= this.getHighSpeedVideoFpsRanges || !getHighSpeedVideoFpsRanges() || (highSpeedVideoSizes = getHighSpeedVideoSizes()) == null) {
            return;
        }
        try {
            kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(this.getHighSpeedVideoFpsRangesFor, this, new kotlinx.coroutines.internal.LimitedDispatcher.Worker(highSpeedVideoSizes));
        } catch (java.lang.Throwable th) {
            Camera2StreamConfigurationMap.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        java.lang.Runnable highSpeedVideoSizes;
        this.getOutputFormats.addLast(block);
        if (Camera2StreamConfigurationMap.get(this) >= this.getHighSpeedVideoFpsRanges || !getHighSpeedVideoFpsRanges() || (highSpeedVideoSizes = getHighSpeedVideoSizes()) == null) {
            return;
        }
        try {
            this.getHighSpeedVideoFpsRangesFor.dispatchYield(this, new kotlinx.coroutines.internal.LimitedDispatcher.Worker(highSpeedVideoSizes));
        } catch (java.lang.Throwable th) {
            Camera2StreamConfigurationMap.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        this.getHighResolutionOutputSizeshNQ4ISI.scheduleResumeAfterDelay(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.Delay
    public final kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, java.lang.Runnable block, kotlin.coroutines.CoroutineContext context) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public final java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.delay(j, continuation);
    }
}
