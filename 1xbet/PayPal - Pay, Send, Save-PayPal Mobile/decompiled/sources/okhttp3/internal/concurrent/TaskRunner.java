package okhttp3.internal.concurrent;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u0003231B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010)\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010!R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "backend", "Ljava/util/logging/Logger;", "logger", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;Ljava/util/logging/Logger;)V", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "", "kickCoordinator$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "Lokhttp3/internal/concurrent/Task;", "awaitTaskToRun", "()Lokhttp3/internal/concurrent/Task;", "getHighSpeedVideoFpsRangesFor", "()V", "newQueue", "()Lokhttp3/internal/concurrent/TaskQueue;", "", "activeQueues", "()Ljava/util/List;", "cancelAll", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "logger$1", "Ljava/util/logging/Logger;", "getLogger$okhttp", "()Ljava/util/logging/Logger;", "", "nextQueueName", com.visa.cbp.getEncExpo.warmup, "", "coordinatorWaiting", "Z", "", "coordinatorWakeUpAt", "J", "executeCallCount", "runCallCount", "", "busyQueues", "Ljava/util/List;", "readyQueues", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "Companion", "Backend", "RealBackend"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskRunner implements okhttp3.internal.concurrent.Lockable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.concurrent.TaskRunner.Companion INSTANCE = new okhttp3.internal.concurrent.TaskRunner.Companion(null);
    public static final okhttp3.internal.concurrent.TaskRunner INSTANCE;
    private static final java.util.logging.Logger logger;
    private final okhttp3.internal.concurrent.TaskRunner.Backend backend;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int executeCallCount;

    /* renamed from: logger$1, reason: from kotlin metadata */
    private final java.util.logging.Logger logger;
    private int nextQueueName;
    private final java.util.List<okhttp3.internal.concurrent.TaskQueue> readyQueues;
    private int runCallCount;
    private final java.lang.Runnable runnable;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "", "nanoTime", "()J", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "coordinatorNotify", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "nanos", "coordinatorWait", "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "decorate", "(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "runnable", "execute", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/Runnable;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public interface Backend {
        void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner taskRunner);

        void coordinatorWait(okhttp3.internal.concurrent.TaskRunner taskRunner, long nanos);

        <T> java.util.concurrent.BlockingQueue<T> decorate(java.util.concurrent.BlockingQueue<T> queue);

        void execute(okhttp3.internal.concurrent.TaskRunner taskRunner, java.lang.Runnable runnable);

        long nanoTime();
    }

    public TaskRunner(okhttp3.internal.concurrent.TaskRunner.Backend backend, java.util.logging.Logger logger2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backend, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger2, "");
        this.backend = backend;
        this.logger = logger2;
        this.nextQueueName = 10000;
        this.busyQueues = new java.util.ArrayList();
        this.readyQueues = new java.util.ArrayList();
        this.runnable = new java.lang.Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                okhttp3.internal.concurrent.Task awaitTaskToRun;
                long j;
                okhttp3.internal.concurrent.TaskRunner taskRunner = okhttp3.internal.concurrent.TaskRunner.this;
                synchronized (taskRunner) {
                    i = taskRunner.runCallCount;
                    taskRunner.runCallCount = i + 1;
                    awaitTaskToRun = taskRunner.awaitTaskToRun();
                }
                if (awaitTaskToRun == null) {
                    return;
                }
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                java.lang.String name2 = currentThread.getName();
                okhttp3.internal.concurrent.Task task = awaitTaskToRun;
                do {
                    try {
                        currentThread.setName(task.getName());
                        java.util.logging.Logger logger3 = okhttp3.internal.concurrent.TaskRunner.this.getLogger();
                        okhttp3.internal.concurrent.TaskQueue queue = task.getQueue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(queue);
                        boolean isLoggable = logger3.isLoggable(java.util.logging.Level.FINE);
                        if (isLoggable) {
                            j = queue.getTaskRunner().getBackend().nanoTime();
                            okhttp3.internal.concurrent.TaskLoggerKt.access$log(logger3, task, queue, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long runOnce = task.runOnce();
                            if (isLoggable) {
                                long nanoTime = queue.getTaskRunner().getBackend().nanoTime();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append("finished run in ");
                                sb.append(okhttp3.internal.concurrent.TaskLoggerKt.formatDuration(nanoTime - j));
                                okhttp3.internal.concurrent.TaskLoggerKt.access$log(logger3, task, queue, sb.toString());
                            }
                            okhttp3.internal.concurrent.TaskRunner taskRunner2 = okhttp3.internal.concurrent.TaskRunner.this;
                            synchronized (taskRunner2) {
                                okhttp3.internal.concurrent.TaskRunner.access$afterRun(taskRunner2, task, runOnce, true);
                                task = taskRunner2.awaitTaskToRun();
                            }
                        } finally {
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            okhttp3.internal.concurrent.TaskRunner taskRunner3 = okhttp3.internal.concurrent.TaskRunner.this;
                            synchronized (taskRunner3) {
                                okhttp3.internal.concurrent.Task task2 = task;
                                okhttp3.internal.concurrent.TaskRunner.access$afterRun(taskRunner3, task, -1L, false);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                if (th instanceof java.lang.InterruptedException) {
                                    java.lang.Thread.currentThread().interrupt();
                                    return;
                                }
                                throw th;
                            }
                        } finally {
                            currentThread.setName(name2);
                        }
                    }
                } while (task != null);
            }
        };
    }

    public final okhttp3.internal.concurrent.TaskRunner.Backend getBackend() {
        return this.backend;
    }

    public /* synthetic */ TaskRunner(okhttp3.internal.concurrent.TaskRunner.Backend backend, java.util.logging.Logger logger2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(backend, (i & 2) != 0 ? logger : logger2);
    }

    /* renamed from: getLogger$okhttp, reason: from getter */
    public final java.util.logging.Logger getLogger() {
        return this.logger;
    }

    public final void kickCoordinator$okhttp(okhttp3.internal.concurrent.TaskQueue taskQueue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskQueue, "");
        okhttp3.internal.concurrent.TaskRunner taskRunner = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(taskRunner)) {
            if (taskQueue.getActiveTask() == null) {
                if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    okhttp3.internal._UtilCommonKt.addIfAbsent(this.readyQueues, taskQueue);
                } else {
                    this.readyQueues.remove(taskQueue);
                }
            }
            if (this.coordinatorWaiting) {
                this.backend.coordinatorNotify(this);
                return;
            } else {
                getHighSpeedVideoFpsRangesFor();
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(taskRunner);
        throw new java.lang.AssertionError(sb.toString());
    }

    public final okhttp3.internal.concurrent.Task awaitTaskToRun() {
        boolean z;
        okhttp3.internal.concurrent.TaskRunner taskRunner = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(taskRunner)) {
            while (!this.readyQueues.isEmpty()) {
                long nanoTime = this.backend.nanoTime();
                java.util.Iterator<okhttp3.internal.concurrent.TaskQueue> it = this.readyQueues.iterator();
                long j = Long.MAX_VALUE;
                okhttp3.internal.concurrent.Task task = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    okhttp3.internal.concurrent.Task task2 = it.next().getFutureTasks$okhttp().get(0);
                    long max = java.lang.Math.max(0L, task2.getNextExecuteNanoTime() - nanoTime);
                    if (max > 0) {
                        j = java.lang.Math.min(max, j);
                    } else {
                        if (task != null) {
                            z = true;
                            break;
                        }
                        task = task2;
                    }
                }
                if (task == null) {
                    if (this.coordinatorWaiting) {
                        if (j < this.coordinatorWakeUpAt - nanoTime) {
                            this.backend.coordinatorNotify(this);
                        }
                        return null;
                    }
                    this.coordinatorWaiting = true;
                    this.coordinatorWakeUpAt = nanoTime + j;
                    try {
                        try {
                            this.backend.coordinatorWait(this, j);
                        } catch (java.lang.InterruptedException unused) {
                            cancelAll();
                        }
                    } finally {
                        this.coordinatorWaiting = false;
                    }
                } else {
                    if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(taskRunner)) {
                        task.setNextExecuteNanoTime$okhttp(-1L);
                        okhttp3.internal.concurrent.TaskQueue queue = task.getQueue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(queue);
                        queue.getFutureTasks$okhttp().remove(task);
                        this.readyQueues.remove(queue);
                        queue.setActiveTask$okhttp(task);
                        this.busyQueues.add(queue);
                        if (z || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                            getHighSpeedVideoFpsRangesFor();
                        }
                        return task;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
                    sb.append(java.lang.Thread.currentThread().getName());
                    sb.append(" MUST hold lock on ");
                    sb.append(taskRunner);
                    throw new java.lang.AssertionError(sb.toString());
                }
            }
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Thread ");
        sb2.append(java.lang.Thread.currentThread().getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(taskRunner);
        throw new java.lang.AssertionError(sb2.toString());
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        okhttp3.internal.concurrent.TaskRunner taskRunner = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(taskRunner)) {
            int i = this.executeCallCount;
            if (i > this.runCallCount) {
                return;
            }
            this.executeCallCount = i + 1;
            this.backend.execute(this, this.runnable);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(taskRunner);
        throw new java.lang.AssertionError(sb.toString());
    }

    public final okhttp3.internal.concurrent.TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new okhttp3.internal.concurrent.TaskQueue(this, com.visa.cbp.getEncExpo.updateVisuals.concat(java.lang.String.valueOf(i)));
    }

    public final void cancelAll() {
        okhttp3.internal.concurrent.TaskRunner taskRunner = this;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(taskRunner)) {
            for (int size = this.busyQueues.size() - 1; size >= 0; size--) {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
            for (int size2 = this.readyQueues.size() - 1; size2 >= 0; size2--) {
                okhttp3.internal.concurrent.TaskQueue taskQueue = this.readyQueues.get(size2);
                taskQueue.cancelAllAndDecide$okhttp();
                if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    this.readyQueues.remove(size2);
                }
            }
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(taskRunner);
        throw new java.lang.AssertionError(sb.toString());
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", "nanoTime", "()J", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "coordinatorNotify", "(Lokhttp3/internal/concurrent/TaskRunner;)V", "nanos", "coordinatorWait", "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "decorate", "(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "runnable", "execute", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/Runnable;)V", "shutdown", "()V", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class RealBackend implements okhttp3.internal.concurrent.TaskRunner.Backend {
        private final java.util.concurrent.ThreadPoolExecutor executor;

        public RealBackend(java.util.concurrent.ThreadFactory threadFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadFactory, "");
            this.executor = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), threadFactory);
        }

        public final java.util.concurrent.ThreadPoolExecutor getExecutor() {
            return this.executor;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final long nanoTime() {
            return java.lang.System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void coordinatorNotify(okhttp3.internal.concurrent.TaskRunner taskRunner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void coordinatorWait(okhttp3.internal.concurrent.TaskRunner taskRunner, long nanos) throws java.lang.InterruptedException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
            okhttp3.internal.concurrent.TaskRunner taskRunner2 = taskRunner;
            if (okhttp3.internal._UtilJvmKt.assertionsEnabled && !java.lang.Thread.holdsLock(taskRunner2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
                sb.append(java.lang.Thread.currentThread().getName());
                sb.append(" MUST hold lock on ");
                sb.append(taskRunner2);
                throw new java.lang.AssertionError(sb.toString());
            }
            if (nanos > 0) {
                long j = nanos / 1000000;
                if (j > 0 || nanos > 0) {
                    taskRunner2.wait(j, (int) (nanos - (1000000 * j)));
                }
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void execute(okhttp3.internal.concurrent.TaskRunner taskRunner, java.lang.Runnable runnable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskRunner, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
            this.executor.execute(runnable);
        }

        public final void shutdown() {
            this.executor.shutdown();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final <T> java.util.concurrent.BlockingQueue<T> decorate(java.util.concurrent.BlockingQueue<T> queue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queue, "");
            return queue;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.util.logging.Logger getLogger() {
            return okhttp3.internal.concurrent.TaskRunner.logger;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(okhttp3.internal.concurrent.TaskRunner.class.getName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logger2, "");
        logger = logger2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(okhttp3.internal._UtilJvmKt.okHttpName);
        sb.append(" TaskRunner");
        INSTANCE = new okhttp3.internal.concurrent.TaskRunner(new okhttp3.internal.concurrent.TaskRunner.RealBackend(okhttp3.internal._UtilJvmKt.threadFactory(sb.toString(), true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public final java.util.List<okhttp3.internal.concurrent.TaskQueue> activeQueues() {
        java.util.List<okhttp3.internal.concurrent.TaskQueue> plus;
        synchronized (this) {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) this.busyQueues, (java.lang.Iterable) this.readyQueues);
        }
        return plus;
    }

    public static final /* synthetic */ void access$afterRun(okhttp3.internal.concurrent.TaskRunner taskRunner, okhttp3.internal.concurrent.Task task, long j, boolean z) {
        okhttp3.internal.concurrent.TaskRunner taskRunner2 = taskRunner;
        if (!okhttp3.internal._UtilJvmKt.assertionsEnabled || java.lang.Thread.holdsLock(taskRunner2)) {
            okhttp3.internal.concurrent.TaskQueue queue = task.getQueue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(queue);
            if (queue.getActiveTask() != task) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            boolean cancelActiveTask = queue.getCancelActiveTask();
            queue.setCancelActiveTask$okhttp(false);
            queue.setActiveTask$okhttp(null);
            taskRunner.busyQueues.remove(queue);
            if (j != -1 && !cancelActiveTask && !queue.getShutdown()) {
                queue.scheduleAndDecide$okhttp(task, j, true);
            }
            if (queue.getFutureTasks$okhttp().isEmpty()) {
                return;
            }
            taskRunner.readyQueues.add(queue);
            if (z) {
                return;
            }
            taskRunner.getHighSpeedVideoFpsRangesFor();
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Thread ");
        sb.append(java.lang.Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(taskRunner2);
        throw new java.lang.AssertionError(sb.toString());
    }
}
