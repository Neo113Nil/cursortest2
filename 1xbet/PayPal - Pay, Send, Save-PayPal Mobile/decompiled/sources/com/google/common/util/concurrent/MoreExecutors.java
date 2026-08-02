package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public final class MoreExecutors {
    private MoreExecutors() {
    }

    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, java.time.Duration duration) {
        return getExitingExecutorService(threadPoolExecutor, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, long j, java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingExecutorService(threadPoolExecutor, j, timeUnit);
    }

    public static java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingExecutorService(threadPoolExecutor);
    }

    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, java.time.Duration duration) {
        return getExitingScheduledExecutorService(scheduledThreadPoolExecutor, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, java.util.concurrent.TimeUnit timeUnit) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingScheduledExecutorService(scheduledThreadPoolExecutor, j, timeUnit);
    }

    public static java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new com.google.common.util.concurrent.MoreExecutors.Application().getExitingScheduledExecutorService(scheduledThreadPoolExecutor);
    }

    public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService executorService, java.time.Duration duration) {
        addDelayedShutdownHook(executorService, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static void addDelayedShutdownHook(java.util.concurrent.ExecutorService executorService, long j, java.util.concurrent.TimeUnit timeUnit) {
        new com.google.common.util.concurrent.MoreExecutors.Application().addDelayedShutdownHook(executorService, j, timeUnit);
    }

    /* loaded from: classes9.dex */
    static class Application {
        Application() {
        }

        final java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.MoreExecutors.useDaemonThreadFactory(threadPoolExecutor);
            java.util.concurrent.ExecutorService unconfigurableExecutorService = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
            addDelayedShutdownHook(threadPoolExecutor, j, timeUnit);
            return unconfigurableExecutorService;
        }

        final java.util.concurrent.ExecutorService getExitingExecutorService(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            return getExitingExecutorService(threadPoolExecutor, 120L, java.util.concurrent.TimeUnit.SECONDS);
        }

        final java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.MoreExecutors.useDaemonThreadFactory(scheduledThreadPoolExecutor);
            java.util.concurrent.ScheduledExecutorService unconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
            addDelayedShutdownHook(scheduledThreadPoolExecutor, j, timeUnit);
            return unconfigurableScheduledExecutorService;
        }

        final java.util.concurrent.ScheduledExecutorService getExitingScheduledExecutorService(java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
            return getExitingScheduledExecutorService(scheduledThreadPoolExecutor, 120L, java.util.concurrent.TimeUnit.SECONDS);
        }

        final void addDelayedShutdownHook(final java.util.concurrent.ExecutorService executorService, final long j, final java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.base.Preconditions.checkNotNull(executorService);
            com.google.common.base.Preconditions.checkNotNull(timeUnit);
            addShutdownHook(com.google.common.util.concurrent.MoreExecutors.newThread("DelayedShutdownHook-for-".concat(java.lang.String.valueOf(executorService)), new java.lang.Runnable() { // from class: com.google.common.util.concurrent.MoreExecutors$Application$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.MoreExecutors.Application.lambda$addDelayedShutdownHook$0(executorService, j, timeUnit);
                }
            }));
        }

        static /* synthetic */ void lambda$addDelayedShutdownHook$0(java.util.concurrent.ExecutorService executorService, long j, java.util.concurrent.TimeUnit timeUnit) {
            executorService.shutdown();
            try {
                executorService.awaitTermination(j, timeUnit);
            } catch (java.lang.InterruptedException unused) {
            }
        }

        void addShutdownHook(java.lang.Thread thread) {
            java.lang.Runtime.getRuntime().addShutdownHook(thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void useDaemonThreadFactory(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new com.google.common.util.concurrent.ThreadFactoryBuilder().setDaemon(true).setThreadFactory(threadPoolExecutor.getThreadFactory()).build());
    }

    public static com.google.common.util.concurrent.ListeningExecutorService newDirectExecutorService() {
        return new com.google.common.util.concurrent.DirectExecutorService();
    }

    public static java.util.concurrent.Executor directExecutor() {
        return com.google.common.util.concurrent.DirectExecutor.INSTANCE;
    }

    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor executor) {
        return new com.google.common.util.concurrent.SequentialExecutor(executor);
    }

    public static com.google.common.util.concurrent.ListeningExecutorService listeningDecorator(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof com.google.common.util.concurrent.ListeningExecutorService) {
            return (com.google.common.util.concurrent.ListeningExecutorService) executorService;
        }
        if (executorService instanceof java.util.concurrent.ScheduledExecutorService) {
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator((java.util.concurrent.ScheduledExecutorService) executorService);
        }
        return new com.google.common.util.concurrent.MoreExecutors.ListeningDecorator(executorService);
    }

    public static com.google.common.util.concurrent.ListeningScheduledExecutorService listeningDecorator(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof com.google.common.util.concurrent.ListeningScheduledExecutorService) {
            return (com.google.common.util.concurrent.ListeningScheduledExecutorService) scheduledExecutorService;
        }
        return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator(scheduledExecutorService);
    }

    static class ListeningDecorator extends com.google.common.util.concurrent.AbstractListeningExecutorService {
        private final java.util.concurrent.ExecutorService delegate;

        ListeningDecorator(java.util.concurrent.ExecutorService executorService) {
            this.delegate = (java.util.concurrent.ExecutorService) com.google.common.base.Preconditions.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            return this.delegate.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.delegate.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.delegate.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.delegate.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final java.util.List<java.lang.Runnable> shutdownNow() {
            return this.delegate.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            this.delegate.execute(runnable);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            sb.append("[");
            sb.append(this.delegate);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class ScheduledListeningDecorator extends com.google.common.util.concurrent.MoreExecutors.ListeningDecorator implements com.google.common.util.concurrent.ListeningScheduledExecutorService {
        final java.util.concurrent.ScheduledExecutorService delegate;

        ScheduledListeningDecorator(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.delegate = (java.util.concurrent.ScheduledExecutorService) com.google.common.base.Preconditions.checkNotNull(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final com.google.common.util.concurrent.ListenableScheduledFuture<?> schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(runnable, null);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(create, this.delegate.schedule(create, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final <V> com.google.common.util.concurrent.ListenableScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long j, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(callable);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(create, this.delegate.schedule(create, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask(runnable);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public final com.google.common.util.concurrent.ListenableScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.NeverSuccessfulListenableFutureTask(runnable);
            return new com.google.common.util.concurrent.MoreExecutors.ScheduledListeningDecorator.ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.delegate.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j, j2, timeUnit));
        }

        static final class ListenableScheduledTask<V> extends com.google.common.util.concurrent.ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements com.google.common.util.concurrent.ListenableScheduledFuture<V> {
            private final java.util.concurrent.ScheduledFuture<?> scheduledDelegate;

            ListenableScheduledTask(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, java.util.concurrent.ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.scheduledDelegate = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.scheduledDelegate.cancel(z);
                }
                return cancel;
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
                return this.scheduledDelegate.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            public final int compareTo(java.util.concurrent.Delayed delayed) {
                return this.scheduledDelegate.compareTo(delayed);
            }
        }

        static final class NeverSuccessfulListenableFutureTask extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<java.lang.Void> implements java.lang.Runnable {
            private final java.lang.Runnable delegate;

            NeverSuccessfulListenableFutureTask(java.lang.Runnable runnable) {
                this.delegate = (java.lang.Runnable) com.google.common.base.Preconditions.checkNotNull(runnable);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.delegate.run();
                } catch (java.lang.Throwable th) {
                    setException(th);
                    throw th;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            protected final java.lang.String pendingToString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("task=[");
                sb.append(this.delegate);
                sb.append("]");
                return sb.toString();
            }
        }
    }

    static <T> T invokeAnyImpl(com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService, java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, boolean z, java.time.Duration duration) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        return (T) invokeAnyImpl(listeningExecutorService, collection, z, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> T invokeAnyImpl(com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService, java.util.Collection<? extends java.util.concurrent.Callable<T>> collection, boolean z, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        long nanoTime;
        long j2;
        com.google.common.base.Preconditions.checkNotNull(listeningExecutorService);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        int size = collection.size();
        com.google.common.base.Preconditions.checkArgument(size > 0);
        java.util.ArrayList newArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(size);
        java.util.concurrent.LinkedBlockingQueue newLinkedBlockingQueue = com.google.common.collect.Queues.newLinkedBlockingQueue();
        long nanos = timeUnit.toNanos(j);
        if (z) {
            try {
                nanoTime = java.lang.System.nanoTime();
            } catch (java.lang.Throwable th) {
                java.util.Iterator it = newArrayListWithCapacity.iterator();
                while (it.hasNext()) {
                    ((java.util.concurrent.Future) it.next()).cancel(true);
                }
                throw th;
            }
        } else {
            nanoTime = 0;
        }
        java.util.Iterator<? extends java.util.concurrent.Callable<T>> it2 = collection.iterator();
        newArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), newLinkedBlockingQueue));
        int i = size - 1;
        int i2 = 1;
        java.util.concurrent.ExecutionException executionException = null;
        while (true) {
            java.util.concurrent.Future future = (java.util.concurrent.Future) newLinkedBlockingQueue.poll();
            if (future == null) {
                if (i > 0) {
                    i--;
                    newArrayListWithCapacity.add(submitAndAddQueueListener(listeningExecutorService, it2.next(), newLinkedBlockingQueue));
                    i2++;
                } else {
                    if (i2 == 0) {
                        if (executionException == null) {
                            throw new java.util.concurrent.ExecutionException((java.lang.Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z) {
                        future = (java.util.concurrent.Future) newLinkedBlockingQueue.poll(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new java.util.concurrent.TimeoutException();
                        }
                        j2 = java.lang.System.nanoTime();
                        nanos -= j2 - nanoTime;
                        long j3 = nanos;
                        int i3 = i;
                        if (future == null) {
                            i2--;
                            try {
                                T t = (T) future.get();
                                java.util.Iterator it3 = newArrayListWithCapacity.iterator();
                                while (it3.hasNext()) {
                                    ((java.util.concurrent.Future) it3.next()).cancel(true);
                                }
                                return t;
                            } catch (java.lang.InterruptedException e) {
                                throw e;
                            } catch (java.util.concurrent.ExecutionException e2) {
                                executionException = e2;
                            } catch (java.lang.Exception e3) {
                                executionException = new java.util.concurrent.ExecutionException(e3);
                            }
                        }
                        i = i3;
                        nanos = j3;
                        nanoTime = j2;
                    } else {
                        future = (java.util.concurrent.Future) newLinkedBlockingQueue.take();
                    }
                }
            }
            j2 = nanoTime;
            long j32 = nanos;
            int i32 = i;
            if (future == null) {
            }
            i = i32;
            nanos = j32;
            nanoTime = j2;
        }
    }

    private static <T> com.google.common.util.concurrent.ListenableFuture<T> submitAndAddQueueListener(com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService, java.util.concurrent.Callable<T> callable, final java.util.concurrent.BlockingQueue<java.util.concurrent.Future<T>> blockingQueue) {
        final com.google.common.util.concurrent.ListenableFuture<T> submit = listeningExecutorService.submit((java.util.concurrent.Callable) callable);
        submit.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.MoreExecutors$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                blockingQueue.add(submit);
            }
        }, directExecutor());
        return submit;
    }

    public static java.util.concurrent.ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return java.util.concurrent.Executors.defaultThreadFactory();
        }
        try {
            return (java.util.concurrent.ThreadFactory) java.lang.Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException e) {
            e = e;
            throw new java.lang.RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (java.lang.IllegalAccessException e2) {
            e = e2;
            throw new java.lang.RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (java.lang.NoSuchMethodException e3) {
            e = e3;
            throw new java.lang.RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw com.google.common.util.concurrent.SneakyThrows.sneakyThrow(e4.getCause());
        }
    }

    private static boolean isAppEngineWithApiClasses() {
        if (java.lang.System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            java.lang.Class.forName("com.google.appengine.api.utils.SystemProperty");
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        return java.lang.Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]) != null;
    }

    static java.lang.Thread newThread(java.lang.String str, java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkNotNull(str);
        com.google.common.base.Preconditions.checkNotNull(runnable);
        java.lang.Thread thread = (java.lang.Thread) java.util.Objects.requireNonNull(platformThreadFactory().newThread(runnable));
        try {
            thread.setName(str);
        } catch (java.lang.SecurityException unused) {
        }
        return thread;
    }

    static java.util.concurrent.Executor renamingDecorator(final java.util.concurrent.Executor executor, final com.google.common.base.Supplier<java.lang.String> supplier) {
        com.google.common.base.Preconditions.checkNotNull(executor);
        com.google.common.base.Preconditions.checkNotNull(supplier);
        return new java.util.concurrent.Executor() { // from class: com.google.common.util.concurrent.MoreExecutors$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                executor.execute(com.google.common.util.concurrent.Callables.threadRenaming(runnable, (com.google.common.base.Supplier<java.lang.String>) supplier));
            }
        };
    }

    static java.util.concurrent.ExecutorService renamingDecorator(java.util.concurrent.ExecutorService executorService, final com.google.common.base.Supplier<java.lang.String> supplier) {
        com.google.common.base.Preconditions.checkNotNull(executorService);
        com.google.common.base.Preconditions.checkNotNull(supplier);
        return new com.google.common.util.concurrent.WrappingExecutorService(executorService) { // from class: com.google.common.util.concurrent.MoreExecutors.1
            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected <T> java.util.concurrent.Callable<T> wrapTask(java.util.concurrent.Callable<T> callable) {
                return com.google.common.util.concurrent.Callables.threadRenaming(callable, (com.google.common.base.Supplier<java.lang.String>) supplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected java.lang.Runnable wrapTask(java.lang.Runnable runnable) {
                return com.google.common.util.concurrent.Callables.threadRenaming(runnable, (com.google.common.base.Supplier<java.lang.String>) supplier);
            }
        };
    }

    static java.util.concurrent.ScheduledExecutorService renamingDecorator(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, final com.google.common.base.Supplier<java.lang.String> supplier) {
        com.google.common.base.Preconditions.checkNotNull(scheduledExecutorService);
        com.google.common.base.Preconditions.checkNotNull(supplier);
        return new com.google.common.util.concurrent.WrappingScheduledExecutorService(scheduledExecutorService) { // from class: com.google.common.util.concurrent.MoreExecutors.2
            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected <T> java.util.concurrent.Callable<T> wrapTask(java.util.concurrent.Callable<T> callable) {
                return com.google.common.util.concurrent.Callables.threadRenaming(callable, (com.google.common.base.Supplier<java.lang.String>) supplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            protected java.lang.Runnable wrapTask(java.lang.Runnable runnable) {
                return com.google.common.util.concurrent.Callables.threadRenaming(runnable, (com.google.common.base.Supplier<java.lang.String>) supplier);
            }
        };
    }

    public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService executorService, java.time.Duration duration) {
        return shutdownAndAwaitTermination(executorService, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static boolean shutdownAndAwaitTermination(java.util.concurrent.ExecutorService executorService, long j, java.util.concurrent.TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j) / 2;
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(nanos, java.util.concurrent.TimeUnit.NANOSECONDS)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    static java.util.concurrent.Executor rejectionPropagatingExecutor(final java.util.concurrent.Executor executor, final com.google.common.util.concurrent.AbstractFuture<?> abstractFuture) {
        com.google.common.base.Preconditions.checkNotNull(executor);
        com.google.common.base.Preconditions.checkNotNull(abstractFuture);
        return executor == directExecutor() ? executor : new java.util.concurrent.Executor() { // from class: com.google.common.util.concurrent.MoreExecutors$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                com.google.common.util.concurrent.MoreExecutors.lambda$rejectionPropagatingExecutor$0(executor, abstractFuture, runnable);
            }
        };
    }

    static /* synthetic */ void lambda$rejectionPropagatingExecutor$0(java.util.concurrent.Executor executor, com.google.common.util.concurrent.AbstractFuture abstractFuture, java.lang.Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            abstractFuture.setException(e);
        }
    }
}
