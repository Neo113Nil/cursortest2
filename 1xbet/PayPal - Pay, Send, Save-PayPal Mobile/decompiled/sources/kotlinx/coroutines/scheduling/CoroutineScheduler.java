package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0003IJKB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u0012\u0010\u001b\u001a\u00020\u00102\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000J\u000e\u0010\u001c\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\u0014\u0010\u001d\u001a\u00020\u00042\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0000H\u0002J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0082\bJ\u0011\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0007H\u0086\bJ\t\u0010(\u001a\u00020\u0004H\u0082\bJ\t\u0010)\u001a\u00020\u0004H\u0082\bJ\t\u0010*\u001a\u00020\u0007H\u0082\bJ\t\u0010+\u001a\u00020\u0016H\u0082\bJ\t\u0010,\u001a\u00020\u0010H\u0082\bJ\t\u0010-\u001a\u00020\u0007H\u0082\bJ\u0014\u00102\u001a\u00020\u00162\n\u00103\u001a\u000604j\u0002`5H\u0016J\b\u00106\u001a\u00020\u0016H\u0016J\u000e\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u0007J*\u00109\u001a\u00020\u00162\n\u0010:\u001a\u000604j\u0002`52\f\b\u0002\u0010;\u001a\u00060\u0010j\u0002`<2\b\b\u0002\u0010=\u001a\u00020\u0010J\u001e\u0010>\u001a\u00020\u00122\n\u0010:\u001a\u000604j\u0002`52\n\u0010;\u001a\u00060\u0010j\u0002`<J\u0010\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u0007H\u0002J\u0006\u0010A\u001a\u00020\u0016J\u0012\u0010B\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020\u0007H\u0002J\b\u0010C\u001a\u00020\u0010H\u0002J\b\u0010D\u001a\u00020\u0004H\u0002J$\u0010E\u001a\u0004\u0018\u00010\u0012*\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0010H\u0002J\u000e\u0010F\u001a\b\u0018\u00010\u0018R\u00020\u0000H\u0002J\b\u0010G\u001a\u00020\tH\u0016J\u000e\u0010H\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u001a\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u00000\u001f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010 \u001a\u00020\u0014X\u0082\u0004R\u0015\u0010!\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010$\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\t\u0010.\u001a\u00020/X\u0082\u0004R\u0011\u00100\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u0006L"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "<init>", "(IIJLjava/lang/String;)V", "globalCpuQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "addToGlobalQueue", "", "task", "Lkotlinx/coroutines/scheduling/Task;", "parkedWorkersStack", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStackTopUpdate", "", "worker", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "oldIndex", "newIndex", "parkedWorkersStackPush", "parkedWorkersStackPop", "parkedWorkersStackNextIndex", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "controlState", "createdWorkers", "getCreatedWorkers", "()I", "availableCpuPermits", "getAvailableCpuPermits", "state", "blockingTasks", "incrementCreatedWorkers", "decrementCreatedWorkers", "incrementBlockingTasks", "decrementBlockingTasks", "tryAcquireCpuPermit", "releaseCpuPermit", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "isTerminated", "()Z", "execute", "command", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "close", "shutdown", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "dispatch", "block", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "createTask", "signalBlockingWork", "stateSnapshot", "signalCpuWork", "tryCreateWorker", "tryUnpark", "createNewWorker", "submitToLocalQueue", "currentWorker", "toString", "runSafely", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
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
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "parkedWorkersStack$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "controlState$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.class, "_isTerminated$volatile");
    public static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK = new kotlinx.coroutines.internal.Symbol("NOT_IN_STACK");

    public final int availableCpuPermits(long state) {
        return (int) ((state & 9223367638808264704L) >> 42);
    }

    public CoroutineScheduler(int i, int i2, long j, java.lang.String str) {
        this.corePoolSize = i;
        this.maxPoolSize = i2;
        this.idleWorkerKeepAliveNs = j;
        this.schedulerName = str;
        if (i <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Core pool size ");
            sb.append(i);
            sb.append(" should be at least 1");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Max pool size ");
            sb2.append(i2);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(i);
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (i2 > 2097150) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Max pool size ");
            sb3.append(i2);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new java.lang.IllegalArgumentException(sb3.toString().toString());
        }
        if (j <= 0) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Idle worker keep alive time ");
            sb4.append(j);
            sb4.append(" must be positive");
            throw new java.lang.IllegalArgumentException(sb4.toString().toString());
        }
        this.globalCpuQueue = new kotlinx.coroutines.scheduling.GlobalQueue();
        this.globalBlockingQueue = new kotlinx.coroutines.scheduling.GlobalQueue();
        this.workers = new kotlinx.coroutines.internal.ResizableAtomicArray<>((i + 1) * 2);
        this.controlState$volatile = i << 42;
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS : j, (i3 & 8) != 0 ? kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME : str);
    }

    public final boolean parkedWorkersStackPush(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
        long j;
        int indexInArray;
        if (worker.getNextParkedWorker() != NOT_IN_STACK) {
            return false;
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getHighSpeedVideoFpsRangesFor;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (2097151 & j);
            indexInArray = worker.getIndexInArray();
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && indexInArray == 0) {
                throw new java.lang.AssertionError();
            }
            worker.setNextParkedWorker(this.workers.get(i));
        } while (!getHighSpeedVideoFpsRangesFor.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | indexInArray));
        return true;
    }

    private static int getHighSpeedVideoFpsRanges(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker) {
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

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable command) {
        dispatch$default(this, command, false, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown(10000L);
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
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        boolean addLast;
        abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
        if (abstractTimeSource != null) {
            abstractTimeSource.trackTask();
        }
        kotlinx.coroutines.scheduling.Task createTask = createTask(block, taskContext);
        boolean z = createTask.taskContext;
        long addAndGet = z ? getHighResolutionOutputSizeshNQ4ISI.addAndGet(this, 2097152L) : 0L;
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED && (createTask.taskContext || Camera2StreamConfigurationMap.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING)) {
            Camera2StreamConfigurationMap.mayHaveLocalTasks = true;
            createTask = Camera2StreamConfigurationMap.localQueue.add(createTask, fair);
        }
        if (createTask != null) {
            if (createTask.taskContext) {
                addLast = this.globalBlockingQueue.addLast(createTask);
            } else {
                addLast = this.globalCpuQueue.addLast(createTask);
            }
            if (!addLast) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.schedulerName);
                sb.append(" was terminated");
                throw new java.util.concurrent.RejectedExecutionException(sb.toString());
            }
        }
        if (!z) {
            signalCpuWork();
        } else {
            if (getHighSpeedVideoFpsRangesFor() || getHighResolutionOutputSizeshNQ4ISI(addAndGet)) {
                return;
            }
            getHighSpeedVideoFpsRangesFor();
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

    public final void signalCpuWork() {
        if (getHighSpeedVideoFpsRangesFor() || getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI.get(this))) {
            return;
        }
        getHighSpeedVideoFpsRangesFor();
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(long j) {
        if (kotlin.ranges.RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == 1 && this.corePoolSize > 1) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            if (highResolutionOutputSizeshNQ4ISI > 0) {
                return true;
            }
        }
        return false;
    }

    private final int getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (this.workers) {
            if (isTerminated()) {
                return -1;
            }
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getHighResolutionOutputSizeshNQ4ISI;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (coerceAtLeast >= this.corePoolSize) {
                return 0;
            }
            if (i >= this.maxPoolSize) {
                return 0;
            }
            int i2 = ((int) (getHighResolutionOutputSizeshNQ4ISI.get(this) & 2097151)) + 1;
            if (i2 <= 0 || this.workers.get(i2) != null) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = new kotlinx.coroutines.scheduling.CoroutineScheduler.Worker(this, i2);
            this.workers.setSynchronized(i2, worker);
            if (i2 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            worker.start();
            return coerceAtLeast + 1;
        }
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker Camera2StreamConfigurationMap() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = currentThread instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker ? (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) currentThread : null;
        if (worker == null || !kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.coroutines.scheduling.CoroutineScheduler.this, this)) {
            return null;
        }
        return worker;
    }

    public final java.lang.String toString() {
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
        long j = getHighResolutionOutputSizeshNQ4ISI.get(this);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.schedulerName);
        sb4.append('@');
        sb4.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.corePoolSize);
        sb4.append(", max = ");
        sb4.append(this.maxPoolSize);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.globalCpuQueue.getSize());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.globalBlockingQueue.getSize());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.corePoolSize - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void runSafely(kotlinx.coroutines.scheduling.Task task) {
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource;
        kotlinx.coroutines.AbstractTimeSource abstractTimeSource2;
        try {
            task.run();
        } catch (java.lang.Throwable th) {
            try {
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                abstractTimeSource2 = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
                if (abstractTimeSource2 != null) {
                    abstractTimeSource2.unTrackTask();
                }
            } finally {
                abstractTimeSource = kotlinx.coroutines.AbstractTimeSourceKt.getHighSpeedVideoSizes;
                if (abstractTimeSource != null) {
                    abstractTimeSource.unTrackTask();
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010#\u001a\u00020$H\u0002J\u000e\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020(H\u0002J\u0006\u0010+\u001a\u00020\u001aJ\u0006\u0010,\u001a\u00020$J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u0014H\u0002J\u000e\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002J\u0010\u00105\u001a\u0004\u0018\u00010\u00142\u0006\u0010)\u001a\u00020$J\n\u00106\u001a\u0004\u0018\u00010\u0014H\u0002J\n\u00107\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u00108\u001a\u0004\u0018\u00010\u00142\u0006\u00109\u001a\u00020$H\u0002J\n\u0010:\u001a\u0004\u0018\u00010\u0014H\u0002J\u0016\u0010;\u001a\u0004\u0018\u00010\u00142\n\u0010<\u001a\u00060\u0005j\u0002`=H\u0002R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\r8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "index", "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "terminationDeadline", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "tryAcquireCpuPermit", "", "tryReleaseCpu", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "run", "", "mayHaveLocalTasks", "runWorker", "runSingleTask", "isIo", "tryPark", "inStack", "executeTask", "task", "nextInt", "upperBound", com.google.android.libraries.places.api.model.PlaceTypes.PARK, "tryTerminateWorker", "findTask", "findBlockingTask", "findCpuTask", "findAnyTask", "scanLocalQueue", "pollGlobalQueues", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Worker extends java.lang.Thread {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class, "workerCtl$volatile");
        private long Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> getHighSpeedVideoFpsRanges;
        private long getInputSizeshNQ4ISI;
        private volatile int indexInArray;
        public final kotlinx.coroutines.scheduling.WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private volatile java.lang.Object nextParkedWorker;
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private volatile /* synthetic */ int workerCtl$volatile;

        private Worker() {
            setDaemon(true);
            setContextClassLoader(kotlinx.coroutines.scheduling.CoroutineScheduler.this.getClass().getClassLoader());
            this.localQueue = new kotlinx.coroutines.scheduling.WorkQueue();
            this.getHighSpeedVideoFpsRanges = new kotlin.jvm.internal.Ref.ObjectRef<>();
            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT;
            this.nextParkedWorker = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK;
            int nanoTime = (int) java.lang.System.nanoTime();
            this.getHighResolutionOutputSizeshNQ4ISI = nanoTime == 0 ? 42 : nanoTime;
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

        public final boolean tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState newState) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            boolean z = workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            if (z) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState != newState) {
                this.state = newState;
            }
            return z;
        }

        public final long runSingleTask() {
            kotlinx.coroutines.scheduling.Task highSpeedVideoSizes;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
            boolean z = workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            if (!z) {
                highSpeedVideoSizes = getHighSpeedVideoSizes();
            } else {
                highSpeedVideoSizes = this.localQueue.pollCpu();
                if (highSpeedVideoSizes == null && (highSpeedVideoSizes = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull()) == null) {
                    highSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(2);
                }
            }
            if (highSpeedVideoSizes == null) {
                long j = this.Camera2StreamConfigurationMap;
                if (j == 0) {
                    return -1L;
                }
                return j;
            }
            kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(highSpeedVideoSizes);
            if (!z) {
                kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, -2097152L);
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || this.state == workerState) {
                return 0L;
            }
            throw new java.lang.AssertionError();
        }

        public final boolean isIo() {
            return this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
        }

        public final int nextInt(int upperBound) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = i ^ (i << 13);
            int i3 = i2 ^ (i2 >> 17);
            int i4 = i3 ^ (i3 << 5);
            this.getHighResolutionOutputSizeshNQ4ISI = i4;
            int i5 = upperBound - 1;
            return (i5 & upperBound) == 0 ? i4 & i5 : (i4 & Integer.MAX_VALUE) % upperBound;
        }

        private final kotlinx.coroutines.scheduling.Task getHighSpeedVideoSizes() {
            kotlinx.coroutines.scheduling.Task pollBlocking = this.localQueue.pollBlocking();
            if (pollBlocking != null) {
                return pollBlocking;
            }
            kotlinx.coroutines.scheduling.Task removeFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return removeFirstOrNull == null ? getHighResolutionOutputSizeshNQ4ISI(1) : removeFirstOrNull;
        }

        private final kotlinx.coroutines.scheduling.Task getHighResolutionOutputSizeshNQ4ISI() {
            if (nextInt(2) == 0) {
                kotlinx.coroutines.scheduling.Task removeFirstOrNull = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
                return removeFirstOrNull != null ? removeFirstOrNull : kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            }
            kotlinx.coroutines.scheduling.Task removeFirstOrNull2 = kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalBlockingQueue.removeFirstOrNull();
            return removeFirstOrNull2 != null ? removeFirstOrNull2 : kotlinx.coroutines.scheduling.CoroutineScheduler.this.globalCpuQueue.removeFirstOrNull();
        }

        private final kotlinx.coroutines.scheduling.Task getHighResolutionOutputSizeshNQ4ISI(int i) {
            int i2 = (int) (kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI.get(kotlinx.coroutines.scheduling.CoroutineScheduler.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int nextInt = nextInt(i2);
            kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                nextInt++;
                if (nextInt > i2) {
                    nextInt = 1;
                }
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = coroutineScheduler.workers.get(nextInt);
                if (worker != null && worker != this) {
                    long trySteal = worker.localQueue.trySteal(i, this.getHighSpeedVideoFpsRanges);
                    if (trySteal == -1) {
                        kotlinx.coroutines.scheduling.Task task = this.getHighSpeedVideoFpsRanges.element;
                        this.getHighSpeedVideoFpsRanges.element = null;
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
            this.Camera2StreamConfigurationMap = j;
            return null;
        }

        public final kotlinx.coroutines.scheduling.Task findTask(boolean mayHaveLocalTasks) {
            kotlinx.coroutines.scheduling.Task highResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.scheduling.Task highResolutionOutputSizeshNQ4ISI2;
            long j;
            if (this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED) {
                kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
                java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    j = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        return getHighSpeedVideoSizes();
                    }
                } while (!kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
                this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED;
            }
            if (mayHaveLocalTasks) {
                boolean z = nextInt(kotlinx.coroutines.scheduling.CoroutineScheduler.this.corePoolSize * 2) == 0;
                if (z && (highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI()) != null) {
                    return highResolutionOutputSizeshNQ4ISI2;
                }
                kotlinx.coroutines.scheduling.Task poll = this.localQueue.poll();
                if (poll != null) {
                    return poll;
                }
                if (!z && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI()) != null) {
                    return highResolutionOutputSizeshNQ4ISI;
                }
            } else {
                kotlinx.coroutines.scheduling.Task highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI();
                if (highResolutionOutputSizeshNQ4ISI3 != null) {
                    return highResolutionOutputSizeshNQ4ISI3;
                }
            }
            return getHighResolutionOutputSizeshNQ4ISI(3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:113:0x0167, code lost:
        
            tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x016c, code lost:
        
            return;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            loop0: while (true) {
                boolean z = false;
                while (!kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated() && this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                    kotlinx.coroutines.scheduling.Task findTask = findTask(this.mayHaveLocalTasks);
                    if (findTask != null) {
                        this.Camera2StreamConfigurationMap = 0L;
                        this.getInputSizeshNQ4ISI = 0L;
                        if (this.state == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING) {
                            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !findTask.taskContext) {
                                throw new java.lang.AssertionError();
                            }
                            this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING;
                        }
                        if (findTask.taskContext) {
                            if (tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING)) {
                                kotlinx.coroutines.scheduling.CoroutineScheduler.this.signalCpuWork();
                            }
                            kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(findTask);
                            kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI.addAndGet(kotlinx.coroutines.scheduling.CoroutineScheduler.this, -2097152L);
                            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = this.state;
                            if (workerState == kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                                continue;
                            } else {
                                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && workerState != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING) {
                                    throw new java.lang.AssertionError();
                                }
                                this.state = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT;
                            }
                        } else {
                            kotlinx.coroutines.scheduling.CoroutineScheduler.this.runSafely(findTask);
                        }
                    } else {
                        this.mayHaveLocalTasks = false;
                        if (this.Camera2StreamConfigurationMap != 0) {
                            if (z) {
                                tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
                                java.lang.Thread.interrupted();
                                java.util.concurrent.locks.LockSupport.parkNanos(this.Camera2StreamConfigurationMap);
                                this.Camera2StreamConfigurationMap = 0L;
                            } else {
                                z = true;
                            }
                        } else if (this.nextParkedWorker == kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK) {
                            kotlinx.coroutines.scheduling.CoroutineScheduler.this.parkedWorkersStackPush(this);
                        } else {
                            getHighSpeedVideoSizes.set(this, -1);
                            while (this.nextParkedWorker != kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK && getHighSpeedVideoSizes.get(this) == -1 && !kotlinx.coroutines.scheduling.CoroutineScheduler.this.isTerminated() && this.state != kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED) {
                                tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING);
                                java.lang.Thread.interrupted();
                                if (this.getInputSizeshNQ4ISI == 0) {
                                    this.getInputSizeshNQ4ISI = java.lang.System.nanoTime() + kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs;
                                }
                                java.util.concurrent.locks.LockSupport.parkNanos(kotlinx.coroutines.scheduling.CoroutineScheduler.this.idleWorkerKeepAliveNs);
                                if (java.lang.System.nanoTime() - this.getInputSizeshNQ4ISI >= 0) {
                                    this.getInputSizeshNQ4ISI = 0L;
                                    kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> resizableAtomicArray = kotlinx.coroutines.scheduling.CoroutineScheduler.this.workers;
                                    kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler = kotlinx.coroutines.scheduling.CoroutineScheduler.this;
                                    synchronized (resizableAtomicArray) {
                                        if (!coroutineScheduler.isTerminated()) {
                                            if (((int) (kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI.get(coroutineScheduler) & 2097151)) > coroutineScheduler.corePoolSize) {
                                                if (getHighSpeedVideoSizes.compareAndSet(this, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    setIndexInArray(0);
                                                    coroutineScheduler.parkedWorkersStackTopUpdate(this, i, 0);
                                                    int andDecrement = (int) (kotlinx.coroutines.scheduling.CoroutineScheduler.getHighResolutionOutputSizeshNQ4ISI.getAndDecrement(coroutineScheduler) & 2097151);
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        public final /* synthetic */ void setWorkerCtl$volatile(int i) {
            this.workerCtl$volatile = i;
        }

        public final /* synthetic */ int getWorkerCtl$volatile() {
            return this.workerCtl$volatile;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WorkerState {
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState BLOCKING;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState CPU_ACQUIRED;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState DORMANT;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState PARKING;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState TERMINATED;
        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] getHighResolutionOutputSizeshNQ4ISI;

        private WorkerState(java.lang.String str, int i) {
        }

        static {
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("CPU_ACQUIRED", 0);
            CPU_ACQUIRED = workerState;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState2 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("BLOCKING", 1);
            BLOCKING = workerState2;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState3 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("PARKING", 2);
            PARKING = workerState3;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState4 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("DORMANT", 3);
            DORMANT = workerState4;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState workerState5 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState("TERMINATED", 4);
            TERMINATED = workerState5;
            kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            getHighResolutionOutputSizeshNQ4ISI = workerStateArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(workerStateArr);
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState valueOf(java.lang.String str) {
            return (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) java.lang.Enum.valueOf(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.class, str);
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] values() {
            return (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static kotlin.enums.EnumEntries<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker;
        do {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getHighSpeedVideoFpsRangesFor;
            while (true) {
                long j = atomicLongFieldUpdater.get(this);
                worker = this.workers.get((int) (2097151 & j));
                if (worker != null) {
                    int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(worker);
                    if (highSpeedVideoFpsRanges >= 0 && getHighSpeedVideoFpsRangesFor.compareAndSet(this, j, highSpeedVideoFpsRanges | ((2097152 + j) & (-2097152)))) {
                        worker.setNextParkedWorker(NOT_IN_STACK);
                        break;
                    }
                } else {
                    worker = null;
                    break;
                }
            }
            if (worker == null) {
                return false;
            }
        } while (!kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.getHighSpeedVideoSizes.compareAndSet(worker, -1, 0));
        java.util.concurrent.locks.LockSupport.unpark(worker);
        return true;
    }

    public final boolean isTerminated() {
        return getHighSpeedVideoFpsRanges.get(this) == 1;
    }

    public final void parkedWorkersStackTopUpdate(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker, int oldIndex, int newIndex) {
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = getHighSpeedVideoFpsRangesFor;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (2097151 & j);
            if (i == oldIndex) {
                i = newIndex == 0 ? getHighSpeedVideoFpsRanges(worker) : newIndex;
            }
            if (i >= 0 && getHighSpeedVideoFpsRangesFor.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | i)) {
                return;
            }
        }
    }

    public final void shutdown(long timeout) {
        int i;
        kotlinx.coroutines.scheduling.Task removeFirstOrNull;
        if (getHighSpeedVideoFpsRanges.compareAndSet(this, 0, 1)) {
            kotlinx.coroutines.scheduling.CoroutineScheduler.Worker Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            synchronized (this.workers) {
                i = (int) (getHighResolutionOutputSizeshNQ4ISI.get(this) & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker = this.workers.get(i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(worker);
                    kotlinx.coroutines.scheduling.CoroutineScheduler.Worker worker2 = worker;
                    if (worker2 != Camera2StreamConfigurationMap) {
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
                if (Camera2StreamConfigurationMap != null) {
                    removeFirstOrNull = Camera2StreamConfigurationMap.findTask(true);
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
            if (Camera2StreamConfigurationMap != null) {
                Camera2StreamConfigurationMap.tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED);
            }
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && ((int) ((getHighResolutionOutputSizeshNQ4ISI.get(this) & 9223367638808264704L) >> 42)) != this.corePoolSize) {
                throw new java.lang.AssertionError();
            }
            getHighSpeedVideoFpsRangesFor.set(this, 0L);
            getHighResolutionOutputSizeshNQ4ISI.set(this, 0L);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
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
}
