package okhttp3.internal.concurrent;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001=B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\r\u0010\u0011J7\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\"R\"\u0010\u001e\u001a\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010 \"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00103\u001a\b\u0012\u0004\u0012\u00020\b028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u00107\u001a\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u0010(\u001a\u0004\b8\u0010 \"\u0004\b9\u0010+R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0:8G¢\u0006\u0006\u001a\u0004\b;\u00106"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "name", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "Lokhttp3/internal/concurrent/Task;", "task", "", "delayNanos", "", "schedule", "(Lokhttp3/internal/concurrent/Task;J)V", "Lkotlin/Function0;", "block", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", "", "cancelable", "execute", "(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;)V", "Ljava/util/concurrent/CountDownLatch;", "idleLatch", "()Ljava/util/concurrent/CountDownLatch;", "recurrence", "scheduleAndDecide$okhttp", "(Lokhttp3/internal/concurrent/Task;JZ)Z", "cancelAll", "()V", "shutdown", "cancelAllAndDecide$okhttp", "()Z", "toString", "()Ljava/lang/String;", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/lang/String;", "getName$okhttp", "Z", "getShutdown$okhttp", "setShutdown$okhttp", "(Z)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "", "futureTasks", "Ljava/util/List;", "getFutureTasks$okhttp", "()Ljava/util/List;", "cancelActiveTask", "getCancelActiveTask$okhttp", "setCancelActiveTask$okhttp", "", "getScheduledTasks", "scheduledTasks", "AwaitIdleTask"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaskQueue {
    private okhttp3.internal.concurrent.Task activeTask;
    private boolean cancelActiveTask;
    private final java.util.List<okhttp3.internal.concurrent.Task> futureTasks;
    private final java.lang.String name;
    private boolean shutdown;
    private final okhttp3.internal.concurrent.TaskRunner taskRunner;

    public TaskQueue(okhttp3.internal.concurrent.TaskRunner taskRunner, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new java.util.ArrayList();
    }

    /* renamed from: getTaskRunner$okhttp, reason: from getter */
    public final okhttp3.internal.concurrent.TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    /* renamed from: getName$okhttp, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: getShutdown$okhttp, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    public final void setShutdown$okhttp(boolean z) {
        this.shutdown = z;
    }

    /* renamed from: getActiveTask$okhttp, reason: from getter */
    public final okhttp3.internal.concurrent.Task getActiveTask() {
        return this.activeTask;
    }

    public final void setActiveTask$okhttp(okhttp3.internal.concurrent.Task task) {
        this.activeTask = task;
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    /* renamed from: getCancelActiveTask$okhttp, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    public final void setCancelActiveTask$okhttp(boolean z) {
        this.cancelActiveTask = z;
    }

    public final java.util.List<okhttp3.internal.concurrent.Task> getScheduledTasks() {
        java.util.List<okhttp3.internal.concurrent.Task> list;
        synchronized (this.taskRunner) {
            list = kotlin.collections.CollectionsKt.toList(this.futureTasks);
        }
        return list;
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue taskQueue, okhttp3.internal.concurrent.Task task, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.schedule(task, j);
    }

    public final void schedule(okhttp3.internal.concurrent.Task task, long delayNanos) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        synchronized (this.taskRunner) {
            if (this.shutdown) {
                if (task.getCancelable()) {
                    java.util.logging.Logger logger = this.taskRunner.getLogger();
                    if (logger.isLoggable(java.util.logging.Level.FINE)) {
                        okhttp3.internal.concurrent.TaskLoggerKt.access$log(logger, task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    java.util.logging.Logger logger2 = this.taskRunner.getLogger();
                    if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                        okhttp3.internal.concurrent.TaskLoggerKt.access$log(logger2, task, this, "schedule failed (queue is shutdown)");
                    }
                    throw new java.util.concurrent.RejectedExecutionException();
                }
            }
            if (scheduleAndDecide$okhttp(task, delayNanos, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void schedule$default(okhttp3.internal.concurrent.TaskQueue taskQueue, java.lang.String str, long j, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        taskQueue.schedule(str, j, function0);
    }

    public final void schedule(final java.lang.String name2, long delayNanos, final kotlin.jvm.functions.Function0<java.lang.Long> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        schedule(new okhttp3.internal.concurrent.Task(name2) { // from class: okhttp3.internal.concurrent.TaskQueue$schedule$2
            {
                int i = 2;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
                boolean z = false;
            }

            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                return block.invoke().longValue();
            }
        }, delayNanos);
    }

    public static /* synthetic */ void execute$default(okhttp3.internal.concurrent.TaskQueue taskQueue, java.lang.String str, long j, boolean z, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = true;
        }
        taskQueue.execute(str, j2, z, function0);
    }

    public final void execute(final java.lang.String name2, long delayNanos, final boolean cancelable, final kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        schedule(new okhttp3.internal.concurrent.Task(name2, cancelable) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                block.invoke();
                return -1L;
            }
        }, delayNanos);
    }

    public final java.util.concurrent.CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new java.util.concurrent.CountDownLatch(0);
            }
            okhttp3.internal.concurrent.Task task = this.activeTask;
            if (task instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) {
                return ((okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) task).getHighSpeedVideoFpsRanges;
            }
            for (okhttp3.internal.concurrent.Task task2 : this.futureTasks) {
                if (task2 instanceof okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) {
                    return ((okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask) task2).getHighSpeedVideoFpsRanges;
                }
            }
            okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask awaitIdleTask = new okhttp3.internal.concurrent.TaskQueue.AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getHighSpeedVideoFpsRanges;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "()V", "", "runOnce", "()J", "Ljava/util/concurrent/CountDownLatch;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/CountDownLatch;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes17.dex */
    static final class AwaitIdleTask extends okhttp3.internal.concurrent.Task {
        final java.util.concurrent.CountDownLatch getHighSpeedVideoFpsRanges;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AwaitIdleTask() {
            super(r0.toString(), false);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(okhttp3.internal._UtilJvmKt.okHttpName);
            sb.append(" awaitIdle");
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long runOnce() {
            this.getHighSpeedVideoFpsRanges.countDown();
            return -1L;
        }
    }

    public final boolean scheduleAndDecide$okhttp(okhttp3.internal.concurrent.Task task, long delayNanos, boolean recurrence) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        task.initQueue$okhttp(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j = nanoTime + delayNanos;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j) {
                java.util.logging.Logger logger = this.taskRunner.getLogger();
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    okhttp3.internal.concurrent.TaskLoggerKt.access$log(logger, task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j);
        java.util.logging.Logger logger2 = this.taskRunner.getLogger();
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            if (recurrence) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("run again after ");
                sb.append(okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(j - nanoTime));
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("scheduled after ");
                sb2.append(okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(j - nanoTime));
                obj = sb2.toString();
            }
            okhttp3.internal.concurrent.TaskLoggerKt.access$log(logger2, task, this, obj);
        }
        java.util.Iterator<okhttp3.internal.concurrent.Task> it = this.futureTasks.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - nanoTime > delayNanos) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.futureTasks.size();
        }
        this.futureTasks.add(i, task);
        return i == 0;
    }

    public final void cancelAll() {
        okhttp3.internal.concurrent.TaskRunner taskRunner = this.taskRunner;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(taskRunner)) {
            synchronized (this.taskRunner) {
                if (cancelAllAndDecide$okhttp()) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(taskRunner);
        throw new java.lang.AssertionError(sb.toString());
    }

    public final void shutdown() {
        okhttp3.internal.concurrent.TaskRunner taskRunner = this.taskRunner;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || !java.lang.Thread.holdsLock(taskRunner)) {
            synchronized (this.taskRunner) {
                this.shutdown = true;
                if (cancelAllAndDecide$okhttp()) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(taskRunner);
        throw new java.lang.AssertionError(sb.toString());
    }

    public final boolean cancelAllAndDecide$okhttp() {
        okhttp3.internal.concurrent.Task task = this.activeTask;
        if (task != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z = false;
        for (int size = this.futureTasks.size() - 1; size >= 0; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                java.util.logging.Logger logger = this.taskRunner.getLogger();
                okhttp3.internal.concurrent.Task task2 = this.futureTasks.get(size);
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    okhttp3.internal.concurrent.TaskLoggerKt.access$log(logger, task2, this, com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.CANCELED);
                }
                this.futureTasks.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final java.lang.String toString() {
        return this.name;
    }
}
