package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class JdkFutureAdapters {
    public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> future) {
        if (future instanceof com.google.common.util.concurrent.ListenableFuture) {
            return (com.google.common.util.concurrent.ListenableFuture) future;
        }
        return new com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter(future);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> future, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(executor);
        if (future instanceof com.google.common.util.concurrent.ListenableFuture) {
            return (com.google.common.util.concurrent.ListenableFuture) future;
        }
        return new com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter(future, executor);
    }

    static final class ListenableFutureAdapter<V> extends com.google.common.util.concurrent.ForwardingFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
        private static final java.util.concurrent.Executor defaultAdapterExecutor;
        private static final java.util.concurrent.ThreadFactory threadFactory;
        private final java.util.concurrent.Executor adapterExecutor;
        private final java.util.concurrent.Future<V> delegate;
        private final com.google.common.util.concurrent.ExecutionList executionList;
        private final java.util.concurrent.atomic.AtomicBoolean hasListeners;

        static {
            java.util.concurrent.ThreadFactory build = new com.google.common.util.concurrent.ThreadFactoryBuilder().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            threadFactory = build;
            defaultAdapterExecutor = java.util.concurrent.Executors.newCachedThreadPool(build);
        }

        ListenableFutureAdapter(java.util.concurrent.Future<V> future) {
            this(future, defaultAdapterExecutor);
        }

        ListenableFutureAdapter(java.util.concurrent.Future<V> future, java.util.concurrent.Executor executor) {
            this.executionList = new com.google.common.util.concurrent.ExecutionList();
            this.hasListeners = new java.util.concurrent.atomic.AtomicBoolean(false);
            this.delegate = (java.util.concurrent.Future) com.google.common.base.Preconditions.checkNotNull(future);
            this.adapterExecutor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final java.util.concurrent.Future<V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.executionList.add(runnable, executor);
            if (this.hasListeners.compareAndSet(false, true)) {
                if (this.delegate.isDone()) {
                    this.executionList.execute();
                } else {
                    this.adapterExecutor.execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter.this.m10355x6e801c7a();
                        }
                    });
                }
            }
        }

        /* renamed from: lambda$addListener$0$com-google-common-util-concurrent-JdkFutureAdapters$ListenableFutureAdapter, reason: not valid java name */
        final /* synthetic */ void m10355x6e801c7a() {
            try {
                com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(this.delegate);
            } catch (java.lang.Throwable unused) {
            }
            this.executionList.execute();
        }
    }

    private JdkFutureAdapters() {
    }
}
