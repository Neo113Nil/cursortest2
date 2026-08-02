package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public abstract class AbstractScheduledService implements com.google.common.util.concurrent.Service {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AbstractScheduledService.class);
    private final com.google.common.util.concurrent.AbstractService delegate = new com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate();

    interface Cancellable {
        void cancel(boolean z);

        boolean isCancelled();
    }

    protected abstract void runOneIteration() throws java.lang.Exception;

    protected abstract com.google.common.util.concurrent.AbstractScheduledService.Scheduler scheduler();

    protected void shutDown() throws java.lang.Exception {
    }

    protected void startUp() throws java.lang.Exception {
    }

    public static abstract class Scheduler {
        abstract com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService abstractService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable);

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(java.time.Duration duration, java.time.Duration duration2) {
            return newFixedDelaySchedule(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), com.google.common.util.concurrent.Internal.toNanosSaturated(duration2), java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedDelaySchedule(final long j, final long j2, final java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.base.Preconditions.checkNotNull(timeUnit);
            com.google.common.base.Preconditions.checkArgument(j2 > 0, "delay must be > 0, found %s", j2);
            return new com.google.common.util.concurrent.AbstractScheduledService.Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService abstractService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable) {
                    return new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit));
                }
            };
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(java.time.Duration duration, java.time.Duration duration2) {
            return newFixedRateSchedule(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), com.google.common.util.concurrent.Internal.toNanosSaturated(duration2), java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        public static com.google.common.util.concurrent.AbstractScheduledService.Scheduler newFixedRateSchedule(final long j, final long j2, final java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.base.Preconditions.checkNotNull(timeUnit);
            com.google.common.base.Preconditions.checkArgument(j2 > 0, "period must be > 0, found %s", j2);
            return new com.google.common.util.concurrent.AbstractScheduledService.Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService abstractService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable) {
                    return new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(scheduledExecutorService.scheduleAtFixedRate(runnable, j, j2, timeUnit));
                }
            };
        }

        private Scheduler() {
        }
    }

    final class ServiceDelegate extends com.google.common.util.concurrent.AbstractService {
        private volatile java.util.concurrent.ScheduledExecutorService executorService;
        private final java.util.concurrent.locks.ReentrantLock lock;
        private volatile com.google.common.util.concurrent.AbstractScheduledService.Cancellable runningTask;
        private final java.lang.Runnable task;

        private ServiceDelegate() {
            this.lock = new java.util.concurrent.locks.ReentrantLock();
            this.task = new com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.Task();
        }

        final class Task implements java.lang.Runnable {
            Task() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.lock.lock();
                try {
                    if (!((com.google.common.util.concurrent.AbstractScheduledService.Cancellable) java.util.Objects.requireNonNull(com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.runningTask)).isCancelled()) {
                        com.google.common.util.concurrent.AbstractScheduledService.this.runOneIteration();
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            this.executorService = com.google.common.util.concurrent.MoreExecutors.renamingDecorator(com.google.common.util.concurrent.AbstractScheduledService.this.executor(), (com.google.common.base.Supplier<java.lang.String>) new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.m10348xcd8af3c3();
                }
            });
            this.executorService.execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.m10349xfa22122();
                }
            });
        }

        /* renamed from: lambda$doStart$0$com-google-common-util-concurrent-AbstractScheduledService$ServiceDelegate, reason: not valid java name */
        final /* synthetic */ java.lang.String m10348xcd8af3c3() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.google.common.util.concurrent.AbstractScheduledService.this.serviceName());
            sb.append(" ");
            sb.append(state());
            return sb.toString();
        }

        /* renamed from: lambda$doStart$1$com-google-common-util-concurrent-AbstractScheduledService$ServiceDelegate, reason: not valid java name */
        final /* synthetic */ void m10349xfa22122() {
            this.lock.lock();
            try {
                com.google.common.util.concurrent.AbstractScheduledService.this.startUp();
                java.util.Objects.requireNonNull(this.executorService);
                this.runningTask = com.google.common.util.concurrent.AbstractScheduledService.this.scheduler().schedule(com.google.common.util.concurrent.AbstractScheduledService.this.delegate, this.executorService, this.task);
                notifyStarted();
            } finally {
                try {
                } finally {
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
            java.util.Objects.requireNonNull(this.runningTask);
            java.util.Objects.requireNonNull(this.executorService);
            this.runningTask.cancel(false);
            this.executorService.execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.AbstractScheduledService.ServiceDelegate.this.m10350xa8d55dd3();
                }
            });
        }

        /* renamed from: lambda$doStop$0$com-google-common-util-concurrent-AbstractScheduledService$ServiceDelegate, reason: not valid java name */
        final /* synthetic */ void m10350xa8d55dd3() {
            try {
                this.lock.lock();
                try {
                    if (state() != com.google.common.util.concurrent.Service.State.STOPPING) {
                        return;
                    }
                    com.google.common.util.concurrent.AbstractScheduledService.this.shutDown();
                    this.lock.unlock();
                    notifyStopped();
                } finally {
                    this.lock.unlock();
                }
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final java.lang.String toString() {
            return com.google.common.util.concurrent.AbstractScheduledService.this.toString();
        }
    }

    protected AbstractScheduledService() {
    }

    protected java.util.concurrent.ScheduledExecutorService executor() {
        final java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new java.util.concurrent.ThreadFactory() { // from class: com.google.common.util.concurrent.AbstractScheduledService.1ThreadFactoryImpl
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return com.google.common.util.concurrent.MoreExecutors.newThread(com.google.common.util.concurrent.AbstractScheduledService.this.serviceName(), runnable);
            }
        });
        addListener(new com.google.common.util.concurrent.Service.Listener(this) { // from class: com.google.common.util.concurrent.AbstractScheduledService.1
            final /* synthetic */ com.google.common.util.concurrent.AbstractScheduledService this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void terminated(com.google.common.util.concurrent.Service.State state) {
                newSingleThreadScheduledExecutor.shutdown();
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void failed(com.google.common.util.concurrent.Service.State state, java.lang.Throwable th) {
                newSingleThreadScheduledExecutor.shutdown();
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return newSingleThreadScheduledExecutor;
    }

    protected java.lang.String serviceName() {
        return getClass().getSimpleName();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(serviceName());
        sb.append(" [");
        sb.append(state());
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final java.lang.Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final com.google.common.util.concurrent.Service stopAsync() {
        this.delegate.stopAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        this.delegate.awaitTerminated(j, timeUnit);
    }

    static final class FutureAsCancellable implements com.google.common.util.concurrent.AbstractScheduledService.Cancellable {
        private final java.util.concurrent.Future<?> delegate;

        FutureAsCancellable(java.util.concurrent.Future<?> future) {
            this.delegate = future;
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public final void cancel(boolean z) {
            this.delegate.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public final boolean isCancelled() {
            return this.delegate.isCancelled();
        }
    }

    public static abstract class CustomScheduler extends com.google.common.util.concurrent.AbstractScheduledService.Scheduler {
        protected abstract com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule getNextSchedule() throws java.lang.Exception;

        public CustomScheduler() {
            super();
        }

        final class ReschedulableCallable implements java.util.concurrent.Callable<java.lang.Void> {
            private com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture cancellationDelegate;
            private final java.util.concurrent.ScheduledExecutorService executor;
            private final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();
            private final com.google.common.util.concurrent.AbstractService service;
            private final java.lang.Runnable wrappedRunnable;

            ReschedulableCallable(com.google.common.util.concurrent.AbstractService abstractService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable) {
                this.wrappedRunnable = runnable;
                this.executor = scheduledExecutorService;
                this.service = abstractService;
            }

            @Override // java.util.concurrent.Callable
            public final java.lang.Void call() throws java.lang.Exception {
                this.wrappedRunnable.run();
                reschedule();
                return null;
            }

            final com.google.common.util.concurrent.AbstractScheduledService.Cancellable reschedule() {
                com.google.common.util.concurrent.AbstractScheduledService.Cancellable futureAsCancellable;
                try {
                    com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule nextSchedule = com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.this.getNextSchedule();
                    this.lock.lock();
                    try {
                        futureAsCancellable = initializeOrUpdateCancellationDelegate(nextSchedule);
                        this.lock.unlock();
                        th = null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            futureAsCancellable = new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(com.google.common.util.concurrent.Futures.immediateCancelledFuture());
                        } finally {
                            this.lock.unlock();
                        }
                    }
                    if (th != null) {
                        this.service.notifyFailed(th);
                    }
                    return futureAsCancellable;
                } catch (java.lang.Throwable th2) {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th2);
                    this.service.notifyFailed(th2);
                    return new com.google.common.util.concurrent.AbstractScheduledService.FutureAsCancellable(com.google.common.util.concurrent.Futures.immediateCancelledFuture());
                }
            }

            private com.google.common.util.concurrent.AbstractScheduledService.Cancellable initializeOrUpdateCancellationDelegate(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule schedule) {
                com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture supplantableFuture = this.cancellationDelegate;
                if (supplantableFuture == null) {
                    com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture supplantableFuture2 = new com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.SupplantableFuture(this.lock, submitToExecutor(schedule));
                    this.cancellationDelegate = supplantableFuture2;
                    return supplantableFuture2;
                }
                if (!supplantableFuture.currentFuture.isCancelled()) {
                    this.cancellationDelegate.currentFuture = submitToExecutor(schedule);
                }
                return this.cancellationDelegate;
            }

            private java.util.concurrent.ScheduledFuture<java.lang.Void> submitToExecutor(com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.Schedule schedule) {
                return this.executor.schedule(this, schedule.delay, schedule.unit);
            }
        }

        static final class SupplantableFuture implements com.google.common.util.concurrent.AbstractScheduledService.Cancellable {
            private java.util.concurrent.Future<java.lang.Void> currentFuture;
            private final java.util.concurrent.locks.ReentrantLock lock;

            SupplantableFuture(java.util.concurrent.locks.ReentrantLock reentrantLock, java.util.concurrent.Future<java.lang.Void> future) {
                this.lock = reentrantLock;
                this.currentFuture = future;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public final void cancel(boolean z) {
                this.lock.lock();
                try {
                    this.currentFuture.cancel(z);
                } finally {
                    this.lock.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public final boolean isCancelled() {
                this.lock.lock();
                try {
                    return this.currentFuture.isCancelled();
                } finally {
                    this.lock.unlock();
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        final com.google.common.util.concurrent.AbstractScheduledService.Cancellable schedule(com.google.common.util.concurrent.AbstractService abstractService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, java.lang.Runnable runnable) {
            return new com.google.common.util.concurrent.AbstractScheduledService.CustomScheduler.ReschedulableCallable(abstractService, scheduledExecutorService, runnable).reschedule();
        }

        protected static final class Schedule {
            private final long delay;
            private final java.util.concurrent.TimeUnit unit;

            public Schedule(long j, java.util.concurrent.TimeUnit timeUnit) {
                this.delay = j;
                this.unit = (java.util.concurrent.TimeUnit) com.google.common.base.Preconditions.checkNotNull(timeUnit);
            }

            public Schedule(java.time.Duration duration) {
                this(com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        }
    }
}
