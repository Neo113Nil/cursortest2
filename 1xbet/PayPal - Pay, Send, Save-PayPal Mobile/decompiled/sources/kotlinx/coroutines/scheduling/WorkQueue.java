package kotlinx.coroutines.scheduling;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\"\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eJ\u0016\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001cH\u0002J\b\u0010 \u001a\u0004\u0018\u00010\fJ\b\u0010!\u001a\u0004\u0018\u00010\fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010#\u001a\u00020\u0017H\u0002J\u001a\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0017H\u0002J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J$\u0010*\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eH\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020)H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010.\u001a\u00020'*\u0004\u0018\u00010\fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0011\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¨\u0006/"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "<init>", "()V", "bufferSize", "", "getBufferSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "getSize$kotlinx_coroutines_core", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "Lkotlinx/atomicfu/AtomicInt;", "consumerIndex", "blockingTasksInBuffer", "poll", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "task", "fair", "", "addLast", "trySteal", "", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stealWithExclusiveMode", "pollBlocking", "pollCpu", "pollWithExclusiveMode", "onlyBlocking", "tryExtractFromTheMiddle", "index", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "tryStealLastScheduled", "pollTo", "queue", "pollBuffer", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkQueue {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReferenceArray<>(128);
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, java.lang.Object.class, "lastScheduledTask$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "producerIndex$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "consumerIndex$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.scheduling.WorkQueue.class, "blockingTasksInBuffer$volatile");

    public static /* synthetic */ kotlinx.coroutines.scheduling.Task add$default(kotlinx.coroutines.scheduling.WorkQueue workQueue, kotlinx.coroutines.scheduling.Task task, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return workQueue.add(task, z);
    }

    public final kotlinx.coroutines.scheduling.Task add(kotlinx.coroutines.scheduling.Task task, boolean fair) {
        if (fair) {
            return getHighSpeedVideoFpsRanges(task);
        }
        kotlinx.coroutines.scheduling.Task task2 = (kotlinx.coroutines.scheduling.Task) getHighSpeedVideoFpsRanges.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return getHighSpeedVideoFpsRanges(task2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    public final long trySteal(int stealingMode, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> stolenTaskRef) {
        T t;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r5;
        if (stealingMode == 3) {
            t = Camera2StreamConfigurationMap();
        } else {
            int i = getHighSpeedVideoSizes.get(this);
            boolean z = stealingMode == 1;
            for (int i2 = Camera2StreamConfigurationMap.get(this); i2 != i && (!z || getHighResolutionOutputSizeshNQ4ISI.get(this) != 0); i2++) {
                kotlinx.coroutines.scheduling.Task highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2, z);
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    t = highResolutionOutputSizeshNQ4ISI;
                    break;
                }
            }
            t = 0;
        }
        if (t != 0) {
            stolenTaskRef.element = t;
            return -1L;
        }
        do {
            atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
            r5 = (kotlinx.coroutines.scheduling.Task) atomicReferenceFieldUpdater.get(this);
            if (r5 == 0) {
                return -2L;
            }
            if (((r5.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long nanoTime = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource.nanoTime() - r5.submissionTime;
            if (nanoTime < kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS) {
                return kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS - nanoTime;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, r5, null));
        stolenTaskRef.element = r5;
        return -1L;
    }

    public final kotlinx.coroutines.scheduling.Task pollBlocking() {
        return Camera2StreamConfigurationMap(true);
    }

    public final kotlinx.coroutines.scheduling.Task pollCpu() {
        return Camera2StreamConfigurationMap(false);
    }

    private final kotlinx.coroutines.scheduling.Task getHighResolutionOutputSizeshNQ4ISI(int i, boolean z) {
        int i2 = i & 127;
        kotlinx.coroutines.scheduling.Task task = this.getHighSpeedVideoFpsRangesFor.get(i2);
        if (task == null || task.taskContext != z || !com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, i2, task, null)) {
            return null;
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI.decrementAndGet(this);
        }
        return task;
    }

    private final kotlinx.coroutines.scheduling.Task getHighSpeedVideoFpsRanges(kotlinx.coroutines.scheduling.Task task) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getHighSpeedVideoSizes;
        if (atomicIntegerFieldUpdater.get(this) - Camera2StreamConfigurationMap.get(this) == 127) {
            return task;
        }
        if (task.taskContext) {
            getHighResolutionOutputSizeshNQ4ISI.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (this.getHighSpeedVideoFpsRangesFor.get(i) != null) {
            java.lang.Thread.yield();
        }
        this.getHighSpeedVideoFpsRangesFor.lazySet(i, task);
        getHighSpeedVideoSizes.incrementAndGet(this);
        return null;
    }

    private final kotlinx.coroutines.scheduling.Task Camera2StreamConfigurationMap() {
        kotlinx.coroutines.scheduling.Task andSet;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Camera2StreamConfigurationMap;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - getHighSpeedVideoSizes.get(this) == 0) {
                return null;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.getHighSpeedVideoFpsRangesFor.getAndSet(i & 127, null)) != null) {
                if (andSet != null && andSet.taskContext) {
                    int decrementAndGet = getHighResolutionOutputSizeshNQ4ISI.decrementAndGet(this);
                    if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && decrementAndGet < 0) {
                        throw new java.lang.AssertionError();
                    }
                }
                return andSet;
            }
        }
    }

    private final kotlinx.coroutines.scheduling.Task Camera2StreamConfigurationMap(boolean z) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlinx.coroutines.scheduling.Task task;
        do {
            atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
            task = (kotlinx.coroutines.scheduling.Task) atomicReferenceFieldUpdater.get(this);
            if (task == null || task.taskContext != z) {
                int i = Camera2StreamConfigurationMap.get(this);
                int i2 = getHighSpeedVideoSizes.get(this);
                while (i != i2) {
                    if (z && getHighResolutionOutputSizeshNQ4ISI.get(this) == 0) {
                        return null;
                    }
                    i2--;
                    kotlinx.coroutines.scheduling.Task highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2, z);
                    if (highResolutionOutputSizeshNQ4ISI != null) {
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, task, null));
        return task;
    }

    public final int getSize$kotlinx_coroutines_core() {
        return getHighSpeedVideoFpsRanges.get(this) != null ? (getHighSpeedVideoSizes.get(this) - Camera2StreamConfigurationMap.get(this)) + 1 : getHighSpeedVideoSizes.get(this) - Camera2StreamConfigurationMap.get(this);
    }

    public final void offloadAllWorkTo(kotlinx.coroutines.scheduling.GlobalQueue globalQueue) {
        kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) getHighSpeedVideoFpsRanges.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (true) {
            kotlinx.coroutines.scheduling.Task Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap2 == null) {
                return;
            } else {
                globalQueue.addLast(Camera2StreamConfigurationMap2);
            }
        }
    }

    public final kotlinx.coroutines.scheduling.Task poll() {
        kotlinx.coroutines.scheduling.Task task = (kotlinx.coroutines.scheduling.Task) getHighSpeedVideoFpsRanges.getAndSet(this, null);
        return task == null ? Camera2StreamConfigurationMap() : task;
    }
}
