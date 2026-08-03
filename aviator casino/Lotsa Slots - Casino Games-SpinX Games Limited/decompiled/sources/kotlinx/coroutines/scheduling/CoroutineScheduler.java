package kotlinx.coroutines.scheduling;

/* compiled from: CoroutineScheduler.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0003IJKB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u0012\u0010\u001b\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000J\u000e\u0010\u001c\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\u0014\u0010\u001d\u001a\u00020\u00042\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000H\u0002J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0086\bJ\t\u0010(\u001a\u00020\u0004H\u0082\bJ\t\u0010)\u001a\u00020\u0004H\u0082\bJ\t\u0010*\u001a\u00020\u0007H\u0082\bJ\t\u0010+\u001a\u00020\u0016H\u0082\bJ\t\u0010,\u001a\u00020\u0010H\u0082\bJ\t\u0010-\u001a\u00020\u0007H\u0082\bJ\u0014\u00102\u001a\u00020\u00162\n\u00103\u001a\u000604j\u0002`5H\u0016J\b\u00106\u001a\u00020\u0016H\u0016J\u000e\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0007J*\u00109\u001a\u00020\u00162\n\u0010:\u001a\u000604j\u0002`52\f\b\u0002\u0010;\u001a\u00060\u0010j\u0002`<2\b\b\u0002\u0010=\u001a\u00020\u0010J\u001e\u0010>\u001a\u00020\u00122\n\u0010:\u001a\u000604j\u0002`52\n\u0010;\u001a\u00060\u0010j\u0002`<J\u0010\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u0007H\u0002J\u0006\u0010A\u001a\u00020\u0016J\u0012\u0010B\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u0007H\u0002J\b\u0010C\u001a\u00020\u0010H\u0002J\b\u0010D\u001a\u00020\u0004H\u0002J$\u0010E\u001a\u0004\u0018\u00010\u0012*\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0010H\u0002J\u000e\u0010F\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\b\u0010G\u001a\u00020\tH\u0016J\u000e\u0010H\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u001a\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u00000\u001f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010 \u001a\u00020\u0014X\u0082\u0004R\u0015\u0010!\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010$\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\t\u0010.\u001a\u00020/X\u0082\u0004R\u0011\u00100\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006L"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "<init>", "(IIJLjava/lang/String;)V", "globalCpuQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "addToGlobalQueue", "", "task", "Lkotlinx/coroutines/scheduling/Task;", "parkedWorkersStack", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStackTopUpdate", "", "worker", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "oldIndex", "newIndex", "parkedWorkersStackPush", "parkedWorkersStackPop", "parkedWorkersStackNextIndex", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "controlState", "createdWorkers", "getCreatedWorkers", "()I", "availableCpuPermits", "getAvailableCpuPermits", "state", "blockingTasks", "incrementCreatedWorkers", "decrementCreatedWorkers", "incrementBlockingTasks", "decrementBlockingTasks", "tryAcquireCpuPermit", "releaseCpuPermit", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "isTerminated", "()Z", "execute", com.ironsource.sdk.controller.f.b.g, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "close", "shutdown", "timeout", "dispatch", "block", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "createTask", "signalBlockingWork", "stateSnapshot", "signalCpuWork", "tryCreateWorker", "tryUnpark", "createNewWorker", "submitToLocalQueue", "currentWorker", "toString", "runSafely", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int corePoolSize;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalBlockingQueue;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final java.lang.String schedulerName;
    public final kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> workers;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater parkedWorkersStack$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "parkedWorkersStack$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$volatile$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "controlState$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isTerminated$volatile$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "_isTerminated$volatile");
    public static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK = new kotlinx.coroutines.internal.Symbol("NOT_IN_STACK");

    /* compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values().length];
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int blockingTasks(long state) {
        return (int) ((state & BLOCKING_MASK) >> 21);
    }

    private final int createdWorkers(long state) {
        return (int) (state & 2097151);
    }

    private final /* synthetic */ long getControlState$volatile() {
        return this.controlState$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getControlState$volatile$FU() {
        return controlState$volatile$FU;
    }

    private final /* synthetic */ long getParkedWorkersStack$volatile() {
        return this.parkedWorkersStack$volatile;
    }

    private final /* synthetic */ int get_isTerminated$volatile() {
        return this._isTerminated$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        while (true) {
            function1.invoke(java.lang.Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(long j) {
        this.controlState$volatile = j;
    }

    private final /* synthetic */ void setParkedWorkersStack$volatile(long j) {
        this.parkedWorkersStack$volatile = j;
    }

    private final /* synthetic */ void set_isTerminated$volatile(int i) {
        this._isTerminated$volatile = i;
    }

    public final int availableCpuPermits(long state) {
        return (int) ((state & CPU_PERMITS_MASK) >> 42);
    }

    public CoroutineScheduler(int i, int i2, long j, java.lang.String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i < 1) {
            throw new java.lang.IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new java.lang.IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.globalCpuQueue = new kotlinx.coroutines.scheduling.GlobalQueue();
        this.globalBlockingQueue = new kotlinx.coroutines.scheduling.GlobalQueue();
        this.workers = new kotlinx.coroutines.internal.ResizableAtomicArray<>((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j, (i3 & 8) != 0 ? kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME : str);
    }

    public final void parkedWorkersStackTopUpdate(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker, int oldIndex, int newIndex) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (2097151 & j);
            long j2 = (2097152 + j) & PARKED_VERSION_MASK;
            if (i == oldIndex) {
                i = newIndex == 0 ? parkedWorkersStackNextIndex(worker) : newIndex;
            }
            if (i >= 0 && parkedWorkersStack$volatile$FU.compareAndSet(this, j, j2 | i)) {
                return;
            }
        }
    }

    public final boolean parkedWorkersStackPush(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
        long j;
        long j2;
        int indexInArray;
        if (worker.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & PARKED_VERSION_MASK;
            indexInArray = worker.getIndexInArray();
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && indexInArray == 0) {
                throw new java.lang.AssertionError();
            }
            worker.setNextParkedWorker(this.workers.get(i));
        } while (!parkedWorkersStack$volatile$FU.compareAndSet(this, j, j2 | indexInArray));
        return true;
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop() {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = parkedWorkersStack$volatile$FU;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers.get((int) (2097151 & j));
            if (worker == null) {
                return null;
            }
            long j2 = (2097152 + j) & PARKED_VERSION_MASK;
            int parkedWorkersStackNextIndex = parkedWorkersStackNextIndex(worker);
            if (parkedWorkersStackNextIndex >= 0 && parkedWorkersStack$volatile$FU.compareAndSet(this, j, parkedWorkersStackNextIndex | j2)) {
                worker.setNextParkedWorker(NOT_IN_STACK);
                return worker;
            }
        }
    }

    private final int parkedWorkersStackNextIndex(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
        java.lang.Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != NOT_IN_STACK) {
            if (nextParkedWorker == null) {
                return 0;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) nextParkedWorker;
            int indexInArray = worker2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = worker2.getNextParkedWorker();
        }
        return -1;
    }

    private final int getCreatedWorkers() {
        return (int) (getControlState$volatile$FU().get(this) & 2097151);
    }

    private final int getAvailableCpuPermits() {
        return (int) ((controlState$volatile$FU.get(this) & CPU_PERMITS_MASK) >> 42);
    }

    private final int incrementCreatedWorkers() {
        return (int) (controlState$volatile$FU.incrementAndGet(this) & 2097151);
    }

    private final int decrementCreatedWorkers() {
        return (int) (getControlState$volatile$FU().getAndDecrement(this) & 2097151);
    }

    private final long incrementBlockingTasks() {
        return controlState$volatile$FU.addAndGet(this, 2097152L);
    }

    private final void decrementBlockingTasks() {
        getControlState$volatile$FU().addAndGet(this, PARKED_VERSION_MASK);
    }

    private final boolean tryAcquireCpuPermit() {
        long j;
        java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$volatile$FU2 = getControlState$volatile$FU();
        do {
            j = controlState$volatile$FU2.get(this);
            if (((int) ((CPU_PERMITS_MASK & j) >> 42)) == 0) {
                return false;
            }
        } while (!getControlState$volatile$FU().compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    private final long releaseCpuPermit() {
        return getControlState$volatile$FU().addAndGet(this, 4398046511104L);
    }

    public final boolean isTerminated() {
        return _isTerminated$volatile$FU.get(this) == 1;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        dispatch$default(this, command, false, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown(10000L);
    }

    public final void shutdown(long timeout) {
        int i;
        kotlinx.coroutines.scheduling.Task removeFirstOrNull;
        if (_isTerminated$volatile$FU.compareAndSet(this, 0, 1)) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker currentWorker = currentWorker();
            synchronized (this.workers) {
                i = (int) (getControlState$volatile$FU().get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers.get(i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(worker);
                    kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = worker;
                    if (worker2 != currentWorker) {
                        while (worker2.getState() != java.lang.Thread.State.TERMINATED) {
                            java.util.concurrent.locks.LockSupport.unpark(worker2);
                            worker2.join(timeout);
                        }
                        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && worker2.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                            throw new java.lang.AssertionError();
                        }
                        worker2.localQueue.offloadAllWorkTo(this.globalBlockingQueue);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.globalBlockingQueue.close();
            this.globalCpuQueue.close();
            while (true) {
                if (currentWorker != null) {
                    removeFirstOrNull = currentWorker.findTask(true);
                    if (removeFirstOrNull != null) {
                        continue;
                        runSafely(removeFirstOrNull);
                    }
                }
                removeFirstOrNull = this.globalCpuQueue.removeFirstOrNull();
                if (removeFirstOrNull == null && (removeFirstOrNull = this.globalBlockingQueue.removeFirstOrNull()) == null) {
                    break;
                }
                runSafely(removeFirstOrNull);
            }
            if (currentWorker != null) {
                currentWorker.tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && ((int) ((controlState$volatile$FU.get(this) & CPU_PERMITS_MASK) >> 42)) != this.corePoolSize) {
                throw new java.lang.AssertionError();
            }
            parkedWorkersStack$volatile$FU.set(this, 0L);
            controlState$volatile$FU.set(this, 0L);
        }
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, java.lang.Runnable runnable, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        coroutineScheduler.dispatch(runnable, z, z2);
    }

    public final void dispatch(java.lang.Runnable block, boolean taskContext, boolean fair) {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.trackTask();
        }
        kotlinx.coroutines.scheduling.Task createTask = createTask(block, taskContext);
        boolean z = createTask.taskContext;
        long addAndGet = z ? controlState$volatile$FU.addAndGet(this, 2097152L) : 0L;
        kotlinx.coroutines.scheduling.Task submitToLocalQueue = submitToLocalQueue(currentWorker(), createTask, fair);
        if (submitToLocalQueue != null && !addToGlobalQueue(submitToLocalQueue)) {
            throw new java.util.concurrent.RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z) {
            signalBlockingWork(addAndGet);
        } else {
            signalCpuWork();
        }
    }

    public final kotlinx.coroutines.scheduling.Task createTask(java.lang.Runnable block, boolean taskContext) {
        long nanoTime = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource.nanoTime();
        if (block instanceof kotlinx.coroutines.scheduling.Task) {
            kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) block;
            task.submissionTime = nanoTime;
            task.taskContext = taskContext;
            return task;
        }
        return kotlinx.coroutines.scheduling.TasksKt.asTask(block, nanoTime, taskContext);
    }

    private final void signalBlockingWork(long stateSnapshot) {
        if (tryUnpark() || tryCreateWorker(stateSnapshot)) {
            return;
        }
        tryUnpark();
    }

    public final void signalCpuWork() {
        if (tryUnpark() || tryCreateWorker$default(this, 0L, 1, null)) {
            return;
        }
        tryUnpark();
    }

    static /* synthetic */ boolean tryCreateWorker$default(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = controlState$volatile$FU.get(coroutineScheduler);
        }
        return coroutineScheduler.tryCreateWorker(j);
    }

    private final boolean tryCreateWorker(long state) {
        if (kotlin.ranges.RangesKt.coerceAtLeast(((int) (2097151 & state)) - ((int) ((state & BLOCKING_MASK) >> 21)), 0) < this.corePoolSize) {
            int createNewWorker = createNewWorker();
            if (createNewWorker == 1 && this.corePoolSize > 1) {
                createNewWorker();
            }
            if (createNewWorker > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean tryUnpark() {
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop;
        do {
            parkedWorkersStackPop = parkedWorkersStackPop();
            if (parkedWorkersStackPop == null) {
                return false;
            }
        } while (!kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$volatile$FU.compareAndSet(parkedWorkersStackPop, -1, 0));
        java.util.concurrent.locks.LockSupport.unpark(parkedWorkersStackPop);
        return true;
    }

    private final int createNewWorker() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            long j = controlState$volatile$FU.get(this);
            int i = (int) (j & 2097151);
            int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i - ((int) ((j & BLOCKING_MASK) >> 21)), 0);
            if (coerceAtLeast >= this.corePoolSize) {
                return 0;
            }
            if (i >= this.maxPoolSize) {
                return 0;
            }
            int i2 = ((int) (getControlState$volatile$FU().get(this) & 2097151)) + 1;
            if (i2 <= 0 || this.workers.get(i2) != null) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = new kotlinx.coroutines.scheduling.CoroutineScheduler.Worker(this, i2);
            this.workers.setSynchronized(i2, worker);
            if (i2 != ((int) (2097151 & controlState$volatile$FU.incrementAndGet(this)))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            int i3 = coerceAtLeast + 1;
            worker.start();
            return i3;
        }
    }

    private final kotlinx.coroutines.scheduling.Task submitToLocalQueue(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker, kotlinx.coroutines.scheduling.Task task, boolean z) {
        if (worker == null || worker.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
            return task;
        }
        if (!task.taskContext && worker.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING) {
            return task;
        }
        worker.mayHaveLocalTasks = true;
        return worker.localQueue.add(task, z);
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker currentWorker() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = currentThread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker ? (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) currentThread : null;
        if (worker == null || !kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.coroutines.scheduling.CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int currentLength = this.workers.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < currentLength; i6++) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers.get(i6);
            if (worker != null) {
                int size$kotlinx_coroutines_core = worker.localQueue.getSize$kotlinx_coroutines_core();
                int i7 = kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0[worker.state.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(size$kotlinx_coroutines_core);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(size$kotlinx_coroutines_core);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (size$kotlinx_coroutines_core > 0) {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(size$kotlinx_coroutines_core);
                        sb3.append(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH);
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = controlState$volatile$FU.get(this);
        return this.schedulerName + '@' + kotlinx.coroutines.DebugStringsKt.getHexAddress(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.getSize() + ", global blocking queue size = " + this.globalBlockingQueue.getSize() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((BLOCKING_MASK & j) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((CPU_PERMITS_MASK & j) >> 42))) + "}]";
    }

    public final void runSafely(kotlinx.coroutines.scheduling.Task task) {
        try {
            task.run();
        } catch (java.lang.Throwable th) {
            try {
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                kotlinx.coroutines.AbstractTimeSource abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource == null) {
                }
            } finally {
                kotlinx.coroutines.AbstractTimeSource abstractTimeSource2 = kotlinx.coroutines.AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource2 != null) {
                    abstractTimeSource2.unTrackTask();
                }
            }
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020(H\u0002J\u0006\u0010+\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020$J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u0014H\u0002J\u000e\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002J\u0010\u00105\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020$J\n\u00106\u001a\u0004\u0018\u00010\u0014H\u0002J\n\u00107\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u00108\u001a\u0004\u0018\u00010\u00142\u0006\u00109\u001a\u00020$H\u0002J\n\u0010:\u001a\u0004\u0018\u00010\u0014H\u0002J\u0016\u0010;\u001a\u0004\u0018\u00010\u00142\n\u0010<\u001a\u00060\u0005j\u0002`=H\u0002R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\r8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "terminationDeadline", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "tryAcquireCpuPermit", "", "tryReleaseCpu", "newState", "run", "", "mayHaveLocalTasks", "runWorker", "runSingleTask", "isIo", "tryPark", "inStack", "executeTask", "task", "nextInt", "upperBound", "park", "tryTerminateWorker", "findTask", "findBlockingTask", "findCpuTask", "findAnyTask", "scanLocalQueue", "pollGlobalQueues", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Worker extends java.lang.Thread {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater workerCtl$volatile$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class, "workerCtl$volatile");
        private volatile int indexInArray;
        public final kotlinx.coroutines.scheduling.WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile java.lang.Object nextParkedWorker;
        private int rngState;
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private final kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> stolenTask;
        private long terminationDeadline;
        private volatile /* synthetic */ int workerCtl$volatile;

        public final /* synthetic */ int getWorkerCtl$volatile() {
            return this.workerCtl$volatile;
        }

        public final /* synthetic */ void setWorkerCtl$volatile(int i) {
            this.workerCtl$volatile = i;
        }

        private Worker() {
            setDaemon(true);
            setContextClassLoader(kotlinx.coroutines.scheduling.CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new kotlinx.coroutines.scheduling.WorkQueue();
            this.stolenTask = new kotlin.jvm.internal.Ref.ObjectRef<>();
            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT;
            this.nextParkedWorker = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK;
            int nanoTime = (int) java.lang.System.nanoTime();
            this.rngState = nanoTime == 0 ? 42 : nanoTime;
        }

        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final void setIndexInArray(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlinx.coroutines.scheduling.CoroutineScheduler.this.schedulerName);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : java.lang.String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public Worker(kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler, int i) {
            this();
            setIndexInArray(i);
        }

        public final kotlinx.coroutines.scheduling.CoroutineScheduler getScheduler() {
            return kotlinx.coroutines.scheduling.CoroutineScheduler.this;
        }

        public final java.lang.Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final void setNextParkedWorker(java.lang.Object obj) {
            this.nextParkedWorker = obj;
        }

        private final boolean tryAcquireCpuPermit() {
            long j;
            if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED) {
                return true;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$volatile$FU = kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU();
            do {
                j = controlState$volatile$FU.get(coroutineScheduler);
                if (((int) ((kotlinx.coroutines.scheduling.CoroutineScheduler.CPU_PERMITS_MASK & j) >> 42)) == 0) {
                    return false;
                }
            } while (!kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU().compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final boolean tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState newState) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            boolean z = workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            if (z) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU().addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            runWorker();
        }

        private final void runWorker() {
            loop0: while (true) {
                boolean z = false;
                while (!kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated() && this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                    kotlinx.coroutines.scheduling.Task findTask = findTask(this.mayHaveLocalTasks);
                    if (findTask != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        executeTask(findTask);
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.minDelayUntilStealableTaskNs == 0) {
                            tryPark();
                        } else if (z) {
                            tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
                            java.lang.Thread.interrupted();
                            java.util.concurrent.locks.LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
        }

        public final long runSingleTask() {
            kotlinx.coroutines.scheduling.Task findBlockingTask;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            boolean z = workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            if (z) {
                findBlockingTask = findCpuTask();
            } else {
                findBlockingTask = findBlockingTask();
            }
            if (findBlockingTask == null) {
                long j = this.minDelayUntilStealableTaskNs;
                if (j == 0) {
                    return -1L;
                }
                return j;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(findBlockingTask);
            if (!z) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU().addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, kotlinx.coroutines.scheduling.CoroutineScheduler.PARKED_VERSION_MASK);
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || this.state == workerState) {
                return 0L;
            }
            throw new java.lang.AssertionError();
        }

        public final boolean isIo() {
            return this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
        }

        private final void tryPark() {
            if (!inStack()) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.this.parkedWorkersStackPush(this);
                return;
            }
            workerCtl$volatile$FU.set(this, -1);
            while (inStack() && workerCtl$volatile$FU.get(this) == -1 && !kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated() && this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
                java.lang.Thread.interrupted();
                park();
            }
        }

        private final boolean inStack() {
            return this.nextParkedWorker != kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK;
        }

        private final void executeTask(kotlinx.coroutines.scheduling.Task task) {
            this.terminationDeadline = 0L;
            if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING) {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !task.taskContext) {
                    throw new java.lang.AssertionError();
                }
                this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
            }
            if (task.taskContext) {
                if (tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING)) {
                    kotlinx.coroutines.scheduling.CoroutineScheduler.this.signalCpuWork();
                }
                kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(task);
                kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU().addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, kotlinx.coroutines.scheduling.CoroutineScheduler.PARKED_VERSION_MASK);
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
                if (workerState != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                    if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && workerState != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING) {
                        throw new java.lang.AssertionError();
                    }
                    this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT;
                    return;
                }
                return;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(task);
        }

        public final int nextInt(int upperBound) {
            int i = this.rngState;
            int i2 = i ^ (i << 13);
            int i3 = i2 ^ (i2 >> 17);
            int i4 = i3 ^ (i3 << 5);
            this.rngState = i4;
            int i5 = upperBound - 1;
            return (i5 & upperBound) == 0 ? i4 & i5 : (i4 & Integer.MAX_VALUE) % upperBound;
        }

        private final void park() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = java.lang.System.nanoTime() + kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs;
            }
            java.util.concurrent.locks.LockSupport.parkNanos(kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs);
            if (java.lang.System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                tryTerminateWorker();
            }
        }

        private final void tryTerminateWorker() {
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> resizableAtomicArray = kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers;
            kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
            synchronized (resizableAtomicArray) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.corePoolSize) {
                    return;
                }
                if (workerCtl$volatile$FU.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    setIndexInArray(0);
                    coroutineScheduler.parkedWorkersStackTopUpdate(this, i, 0);
                    int andDecrement = (int) (kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU().getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i) {
                        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = coroutineScheduler.workers.get(andDecrement);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(worker);
                        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = worker;
                        coroutineScheduler.workers.setSynchronized(i, worker2);
                        worker2.setIndexInArray(i);
                        coroutineScheduler.parkedWorkersStackTopUpdate(worker2, andDecrement, i);
                    }
                    coroutineScheduler.workers.setSynchronized(andDecrement, null);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED;
                }
            }
        }

        public final kotlinx.coroutines.scheduling.Task findTask(boolean mayHaveLocalTasks) {
            return tryAcquireCpuPermit() ? findAnyTask(mayHaveLocalTasks) : findBlockingTask();
        }

        private final kotlinx.coroutines.scheduling.Task findBlockingTask() {
            kotlinx.coroutines.scheduling.Task pollBlocking = this.localQueue.pollBlocking();
            if (pollBlocking != null) {
                return pollBlocking;
            }
            kotlinx.coroutines.scheduling.Task removeFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return removeFirstOrNull == null ? trySteal(1) : removeFirstOrNull;
        }

        private final kotlinx.coroutines.scheduling.Task findCpuTask() {
            kotlinx.coroutines.scheduling.Task pollCpu = this.localQueue.pollCpu();
            if (pollCpu != null) {
                return pollCpu;
            }
            kotlinx.coroutines.scheduling.Task removeFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return removeFirstOrNull == null ? trySteal(2) : removeFirstOrNull;
        }

        private final kotlinx.coroutines.scheduling.Task findAnyTask(boolean scanLocalQueue) {
            kotlinx.coroutines.scheduling.Task pollGlobalQueues;
            kotlinx.coroutines.scheduling.Task pollGlobalQueues2;
            if (scanLocalQueue) {
                boolean z = nextInt(kotlinx.coroutines.scheduling.CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z && (pollGlobalQueues2 = pollGlobalQueues()) != null) {
                    return pollGlobalQueues2;
                }
                kotlinx.coroutines.scheduling.Task poll = this.localQueue.poll();
                if (poll != null) {
                    return poll;
                }
                if (!z && (pollGlobalQueues = pollGlobalQueues()) != null) {
                    return pollGlobalQueues;
                }
            } else {
                kotlinx.coroutines.scheduling.Task pollGlobalQueues3 = pollGlobalQueues();
                if (pollGlobalQueues3 != null) {
                    return pollGlobalQueues3;
                }
            }
            return trySteal(3);
        }

        private final kotlinx.coroutines.scheduling.Task pollGlobalQueues() {
            if (nextInt(2) == 0) {
                kotlinx.coroutines.scheduling.Task removeFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return removeFirstOrNull != null ? removeFirstOrNull : kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            kotlinx.coroutines.scheduling.Task removeFirstOrNull2 = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return removeFirstOrNull2 != null ? removeFirstOrNull2 : kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
        }

        private final kotlinx.coroutines.scheduling.Task trySteal(int stealingMode) {
            int i = (int) (kotlinx.coroutines.scheduling.CoroutineScheduler.getControlState$volatile$FU().get(kotlinx.coroutines.scheduling.CoroutineScheduler.this) & 2097151);
            if (i < 2) {
                return null;
            }
            int nextInt = nextInt(i);
            kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                nextInt++;
                if (nextInt > i) {
                    nextInt = 1;
                }
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = coroutineScheduler.workers.get(nextInt);
                if (worker != null && worker != this) {
                    long trySteal = worker.localQueue.trySteal(stealingMode, this.stolenTask);
                    if (trySteal == -1) {
                        kotlinx.coroutines.scheduling.Task task = this.stolenTask.element;
                        this.stolenTask.element = null;
                        return task;
                    }
                    if (trySteal > 0) {
                        j = java.lang.Math.min(j, trySteal);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.minDelayUntilStealableTaskNs = j;
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WorkerState {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $VALUES;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState CPU_ACQUIRED = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("CPU_ACQUIRED", 0);
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState BLOCKING = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("BLOCKING", 1);
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState PARKING = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("PARKING", 2);
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState DORMANT = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("DORMANT", 3);
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState TERMINATED = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("TERMINATED", 4);

        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $values() {
            return new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        public static kotlin.enums.EnumEntries<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> getEntries() {
            return $ENTRIES;
        }

        private WorkerState(java.lang.String str, int i) {
        }

        static {
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState valueOf(java.lang.String str) {
            return (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) java.lang.Enum.valueOf(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.class, str);
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] values() {
            return (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]) $VALUES.clone();
        }
    }

    private final boolean addToGlobalQueue(kotlinx.coroutines.scheduling.Task task) {
        if (task.taskContext) {
            return this.globalBlockingQueue.addLast(task);
        }
        return this.globalCpuQueue.addLast(task);
    }
}
