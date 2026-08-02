package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
/* loaded from: classes9.dex */
public final class ClosingFuture<V> {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.ClosingFuture.class);
    private final com.google.common.util.concurrent.ClosingFuture.CloseableList closeables;
    private final com.google.common.util.concurrent.FluentFuture<V> future;
    private final java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture.State> state;

    public interface AsyncClosingCallable<V> {
        com.google.common.util.concurrent.ClosingFuture<V> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser) throws java.lang.Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, T t) throws java.lang.Exception;
    }

    public interface ClosingCallable<V> {
        V call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser) throws java.lang.Exception;
    }

    public interface ClosingFunction<T, U> {
        U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, T t) throws java.lang.Exception;
    }

    enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public interface ValueAndCloserConsumer<V> {
        void accept(com.google.common.util.concurrent.ClosingFuture.ValueAndCloser<V> valueAndCloser);
    }

    public static final class DeferredCloser {
        private final com.google.common.util.concurrent.ClosingFuture.CloseableList list;

        DeferredCloser(com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList) {
            this.list = closeableList;
        }

        public final <C extends java.lang.AutoCloseable> C eventuallyClose(C c, java.util.concurrent.Executor executor) {
            com.google.common.base.Preconditions.checkNotNull(executor);
            if (c != null) {
                this.list.add(c, executor);
            }
            return c;
        }
    }

    public static final class ValueAndCloser<V> {
        private final com.google.common.util.concurrent.ClosingFuture<? extends V> closingFuture;

        ValueAndCloser(com.google.common.util.concurrent.ClosingFuture<? extends V> closingFuture) {
            this.closingFuture = (com.google.common.util.concurrent.ClosingFuture) com.google.common.base.Preconditions.checkNotNull(closingFuture);
        }

        public final V get() throws java.util.concurrent.ExecutionException {
            return (V) com.google.common.util.concurrent.Futures.getDone(((com.google.common.util.concurrent.ClosingFuture) this.closingFuture).future);
        }

        public final void closeAsync() {
            this.closingFuture.close();
        }
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> submit(final com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V> closingCallable, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(closingCallable);
        final com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
        com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(new java.util.concurrent.Callable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.1
            @Override // java.util.concurrent.Callable
            public V call() throws java.lang.Exception {
                return (V) com.google.common.util.concurrent.ClosingFuture.ClosingCallable.this.call(closeableList.closer);
            }

            public java.lang.String toString() {
                return com.google.common.util.concurrent.ClosingFuture.ClosingCallable.this.toString();
            }
        });
        executor.execute(create);
        return new com.google.common.util.concurrent.ClosingFuture<>(create, closeableList);
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> submitAsync(final com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V> asyncClosingCallable, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(asyncClosingCallable);
        final com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
        com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(new com.google.common.util.concurrent.AsyncCallable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.2
            @Override // com.google.common.util.concurrent.AsyncCallable
            public com.google.common.util.concurrent.ListenableFuture<V> call() throws java.lang.Exception {
                com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList2 = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
                try {
                    com.google.common.util.concurrent.ClosingFuture<V> call = com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable.this.call(closeableList2.closer);
                    call.becomeSubsumedInto(closeableList);
                    return ((com.google.common.util.concurrent.ClosingFuture) call).future;
                } finally {
                    closeableList.add(closeableList2, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                }
            }

            public java.lang.String toString() {
                return com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable.this.toString();
            }
        });
        executor.execute(create);
        return new com.google.common.util.concurrent.ClosingFuture<>(create, closeableList);
    }

    public static <V> com.google.common.util.concurrent.ClosingFuture<V> from(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        return new com.google.common.util.concurrent.ClosingFuture<>(listenableFuture);
    }

    @java.lang.Deprecated
    public static <C extends java.lang.AutoCloseable> com.google.common.util.concurrent.ClosingFuture<C> eventuallyClosing(com.google.common.util.concurrent.ListenableFuture<C> listenableFuture, final java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(executor);
        com.google.common.util.concurrent.ClosingFuture<C> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(com.google.common.util.concurrent.Futures.nonCancellationPropagating(listenableFuture));
        com.google.common.util.concurrent.Futures.addCallback(listenableFuture, new com.google.common.util.concurrent.FutureCallback<java.lang.AutoCloseable>() { // from class: com.google.common.util.concurrent.ClosingFuture.3
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(java.lang.Throwable th) {
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(java.lang.AutoCloseable autoCloseable) {
                com.google.common.util.concurrent.ClosingFuture.this.closeables.closer.eventuallyClose(autoCloseable, executor);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return closingFuture;
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> iterable) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner(false, iterable);
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllComplete(com.google.common.util.concurrent.ClosingFuture<?> closingFuture, com.google.common.util.concurrent.ClosingFuture<?>... closingFutureArr) {
        return whenAllComplete(com.google.common.collect.Lists.asList(closingFuture, closingFutureArr));
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> iterable) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner(true, iterable);
    }

    public static <V1, V2> com.google.common.util.concurrent.ClosingFuture.Combiner2<V1, V2> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner2<>(closingFuture2);
    }

    public static <V1, V2, V3> com.google.common.util.concurrent.ClosingFuture.Combiner3<V1, V2, V3> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2, com.google.common.util.concurrent.ClosingFuture<V3> closingFuture3) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner3<>(closingFuture2, closingFuture3);
    }

    public static <V1, V2, V3, V4> com.google.common.util.concurrent.ClosingFuture.Combiner4<V1, V2, V3, V4> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2, com.google.common.util.concurrent.ClosingFuture<V3> closingFuture3, com.google.common.util.concurrent.ClosingFuture<V4> closingFuture4) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner4<>(closingFuture2, closingFuture3, closingFuture4);
    }

    public static <V1, V2, V3, V4, V5> com.google.common.util.concurrent.ClosingFuture.Combiner5<V1, V2, V3, V4, V5> whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2, com.google.common.util.concurrent.ClosingFuture<V3> closingFuture3, com.google.common.util.concurrent.ClosingFuture<V4> closingFuture4, com.google.common.util.concurrent.ClosingFuture<V5> closingFuture5) {
        return new com.google.common.util.concurrent.ClosingFuture.Combiner5<>(closingFuture2, closingFuture3, closingFuture4, closingFuture5);
    }

    public static com.google.common.util.concurrent.ClosingFuture.Combiner whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<?> closingFuture, com.google.common.util.concurrent.ClosingFuture<?> closingFuture2, com.google.common.util.concurrent.ClosingFuture<?> closingFuture3, com.google.common.util.concurrent.ClosingFuture<?> closingFuture4, com.google.common.util.concurrent.ClosingFuture<?> closingFuture5, com.google.common.util.concurrent.ClosingFuture<?> closingFuture6, com.google.common.util.concurrent.ClosingFuture<?>... closingFutureArr) {
        return whenAllSucceed(com.google.common.collect.FluentIterable.of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, closingFuture6).append(closingFutureArr));
    }

    private ClosingFuture(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        this(listenableFuture, new com.google.common.util.concurrent.ClosingFuture.CloseableList());
    }

    private ClosingFuture(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList) {
        this.state = new java.util.concurrent.atomic.AtomicReference<>(com.google.common.util.concurrent.ClosingFuture.State.OPEN);
        this.future = com.google.common.util.concurrent.FluentFuture.from(listenableFuture);
        this.closeables = closeableList;
    }

    public final com.google.common.util.concurrent.ListenableFuture<?> statusFuture() {
        return com.google.common.util.concurrent.Futures.nonCancellationPropagating(this.future.transform(com.google.common.base.Functions.constant(null), com.google.common.util.concurrent.MoreExecutors.directExecutor()));
    }

    public final <U> com.google.common.util.concurrent.ClosingFuture<U> transform(final com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V, U> closingFunction, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(closingFunction);
        return derive(this.future.transformAsync(new com.google.common.util.concurrent.AsyncFunction<V, U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.4
            final /* synthetic */ com.google.common.util.concurrent.ClosingFuture this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture<U> apply(V v) throws java.lang.Exception {
                return this.this$0.closeables.applyClosingFunction(closingFunction, v);
            }

            public java.lang.String toString() {
                return closingFunction.toString();
            }
        }, executor));
    }

    public final <U> com.google.common.util.concurrent.ClosingFuture<U> transformAsync(final com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super V, U> asyncClosingFunction, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(asyncClosingFunction);
        return derive(this.future.transformAsync(new com.google.common.util.concurrent.AsyncFunction<V, U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.5
            final /* synthetic */ com.google.common.util.concurrent.ClosingFuture this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture<U> apply(V v) throws java.lang.Exception {
                return this.this$0.closeables.applyAsyncClosingFunction(asyncClosingFunction, v);
            }

            public java.lang.String toString() {
                return asyncClosingFunction.toString();
            }
        }, executor));
    }

    public static <V, U> com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V, U> withoutCloser(final com.google.common.util.concurrent.AsyncFunction<V, U> asyncFunction) {
        com.google.common.base.Preconditions.checkNotNull(asyncFunction);
        return new com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction() { // from class: com.google.common.util.concurrent.ClosingFuture$$ExternalSyntheticLambda3
            @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
            public final com.google.common.util.concurrent.ClosingFuture apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, java.lang.Object obj) {
                com.google.common.util.concurrent.ClosingFuture from;
                from = com.google.common.util.concurrent.ClosingFuture.from(com.google.common.util.concurrent.AsyncFunction.this.apply(obj));
                return from;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.ClosingFuture<V> catching(java.lang.Class<X> cls, com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X, ? extends V> closingFunction, java.util.concurrent.Executor executor) {
        return catchingMoreGeneric(cls, closingFunction, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <X extends java.lang.Throwable, W extends V> com.google.common.util.concurrent.ClosingFuture<V> catchingMoreGeneric(java.lang.Class<X> cls, final com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X, W> closingFunction, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(closingFunction);
        return (com.google.common.util.concurrent.ClosingFuture<V>) derive(this.future.catchingAsync(cls, new com.google.common.util.concurrent.AsyncFunction<X, W>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.6
            final /* synthetic */ com.google.common.util.concurrent.ClosingFuture this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture apply(java.lang.Throwable th) throws java.lang.Exception {
                return this.this$0.closeables.applyClosingFunction(closingFunction, th);
            }

            public java.lang.String toString() {
                return closingFunction.toString();
            }
        }, executor));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <X extends java.lang.Throwable> com.google.common.util.concurrent.ClosingFuture<V> catchingAsync(java.lang.Class<X> cls, com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X, ? extends V> asyncClosingFunction, java.util.concurrent.Executor executor) {
        return catchingAsyncMoreGeneric(cls, asyncClosingFunction, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <X extends java.lang.Throwable, W extends V> com.google.common.util.concurrent.ClosingFuture<V> catchingAsyncMoreGeneric(java.lang.Class<X> cls, final com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X, W> asyncClosingFunction, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(asyncClosingFunction);
        return (com.google.common.util.concurrent.ClosingFuture<V>) derive(this.future.catchingAsync(cls, new com.google.common.util.concurrent.AsyncFunction<X, W>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.7
            final /* synthetic */ com.google.common.util.concurrent.ClosingFuture this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Incorrect types in method signature: (TX;)Lcom/google/common/util/concurrent/ListenableFuture<TW;>; */
            @Override // com.google.common.util.concurrent.AsyncFunction
            public com.google.common.util.concurrent.ListenableFuture apply(java.lang.Throwable th) throws java.lang.Exception {
                return this.this$0.closeables.applyAsyncClosingFunction(asyncClosingFunction, th);
            }

            public java.lang.String toString() {
                return asyncClosingFunction.toString();
            }
        }, executor));
    }

    public final com.google.common.util.concurrent.FluentFuture<V> finishToFuture() {
        if (compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.OPEN, com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE)) {
            logger.get().log(java.util.logging.Level.FINER, "will close {0}", this);
            this.future.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.ClosingFuture.this.m10353xb7bb09a9();
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        } else {
            int ordinal = this.state.get().ordinal();
            if (ordinal == 0) {
                throw new java.lang.AssertionError();
            }
            if (ordinal == 1) {
                throw new java.lang.IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new java.lang.IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new java.lang.IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.future;
    }

    /* renamed from: lambda$finishToFuture$0$com-google-common-util-concurrent-ClosingFuture, reason: not valid java name */
    final /* synthetic */ void m10353xb7bb09a9() {
        checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE, com.google.common.util.concurrent.ClosingFuture.State.CLOSING);
        close();
        checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.CLOSING, com.google.common.util.concurrent.ClosingFuture.State.CLOSED);
    }

    public final void finishToValueAndCloser(final com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<? super V> valueAndCloserConsumer, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(valueAndCloserConsumer);
        if (!compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.OPEN, com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER)) {
            int ordinal = this.state.get().ordinal();
            if (ordinal == 1) {
                throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
            }
            if (ordinal == 5) {
                throw new java.lang.IllegalStateException("Cannot call finishToValueAndCloser() twice");
            }
            throw new java.lang.AssertionError(this.state);
        }
        this.future.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.ClosingFuture.this.m10354x8bed8f66(valueAndCloserConsumer);
            }
        }, executor);
    }

    /* renamed from: lambda$finishToValueAndCloser$0$com-google-common-util-concurrent-ClosingFuture, reason: not valid java name */
    final /* synthetic */ void m10354x8bed8f66(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer valueAndCloserConsumer) {
        provideValueAndCloser(valueAndCloserConsumer, this);
    }

    private static <C, V extends C> void provideValueAndCloser(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<C> valueAndCloserConsumer, com.google.common.util.concurrent.ClosingFuture<V> closingFuture) {
        valueAndCloserConsumer.accept(new com.google.common.util.concurrent.ClosingFuture.ValueAndCloser<>(closingFuture));
    }

    public final boolean cancel(boolean z) {
        logger.get().log(java.util.logging.Level.FINER, "cancelling {0}", this);
        boolean cancel = this.future.cancel(z);
        if (cancel) {
            close();
        }
        return cancel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void close() {
        logger.get().log(java.util.logging.Level.FINER, "closing {0}", this);
        this.closeables.close();
    }

    private <U> com.google.common.util.concurrent.ClosingFuture<U> derive(com.google.common.util.concurrent.FluentFuture<U> fluentFuture) {
        com.google.common.util.concurrent.ClosingFuture<U> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(fluentFuture);
        becomeSubsumedInto(closingFuture.closeables);
        return closingFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void becomeSubsumedInto(com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList) {
        checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State.OPEN, com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED);
        closeableList.add(this.closeables, com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    public static final class Peeker {
        private volatile boolean beingCalled;
        private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> futures;

        private Peeker(com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> immutableList) {
            this.futures = (com.google.common.collect.ImmutableList) com.google.common.base.Preconditions.checkNotNull(immutableList);
        }

        public final <D> D getDone(com.google.common.util.concurrent.ClosingFuture<D> closingFuture) throws java.util.concurrent.ExecutionException {
            com.google.common.base.Preconditions.checkState(this.beingCalled);
            com.google.common.base.Preconditions.checkArgument(this.futures.contains(closingFuture));
            return (D) com.google.common.util.concurrent.Futures.getDone(((com.google.common.util.concurrent.ClosingFuture) closingFuture).future);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <V> V call(com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<V> combiningCallable, com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList) throws java.lang.Exception {
            this.beingCalled = true;
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList2 = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                return combiningCallable.call(closeableList2.closer, this);
            } finally {
                closeableList.add(closeableList2, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                this.beingCalled = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <V> com.google.common.util.concurrent.FluentFuture<V> callAsync(com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<V> asyncCombiningCallable, com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList) throws java.lang.Exception {
            this.beingCalled = true;
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList2 = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                com.google.common.util.concurrent.ClosingFuture<V> call = asyncCombiningCallable.call(closeableList2.closer, this);
                call.becomeSubsumedInto(closeableList);
                return ((com.google.common.util.concurrent.ClosingFuture) call).future;
            } finally {
                closeableList.add(closeableList2, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                this.beingCalled = false;
            }
        }
    }

    @com.google.errorprone.annotations.DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class Combiner {
        private final boolean allMustSucceed;
        private final com.google.common.util.concurrent.ClosingFuture.CloseableList closeables;
        protected final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ClosingFuture<?>> inputs;

        public interface AsyncCombiningCallable<V> {
            com.google.common.util.concurrent.ClosingFuture<V> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception;
        }

        public interface CombiningCallable<V> {
            V call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception;
        }

        private Combiner(boolean z, java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> iterable) {
            this.closeables = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            this.allMustSucceed = z;
            this.inputs = com.google.common.collect.ImmutableList.copyOf(iterable);
            java.util.Iterator<? extends com.google.common.util.concurrent.ClosingFuture<?>> it = iterable.iterator();
            while (it.hasNext()) {
                it.next().becomeSubsumedInto(this.closeables);
            }
        }

        public <V> com.google.common.util.concurrent.ClosingFuture<V> call(final com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<V> combiningCallable, java.util.concurrent.Executor executor) {
            com.google.common.util.concurrent.ClosingFuture<V> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(futureCombiner().call(new java.util.concurrent.Callable<V>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.1
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.util.concurrent.Callable
                public V call() throws java.lang.Exception {
                    return (V) new com.google.common.util.concurrent.ClosingFuture.Peeker(this.this$0.inputs).call(combiningCallable, this.this$0.closeables);
                }

                public java.lang.String toString() {
                    return combiningCallable.toString();
                }
            }, executor));
            ((com.google.common.util.concurrent.ClosingFuture) closingFuture).closeables.add(this.closeables, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            return closingFuture;
        }

        public <V> com.google.common.util.concurrent.ClosingFuture<V> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<V> asyncCombiningCallable, java.util.concurrent.Executor executor) {
            com.google.common.util.concurrent.ClosingFuture<V> closingFuture = new com.google.common.util.concurrent.ClosingFuture<>(futureCombiner().callAsync(new com.google.common.util.concurrent.AsyncCallable<V>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.2
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.util.concurrent.AsyncCallable
                public com.google.common.util.concurrent.ListenableFuture<V> call() throws java.lang.Exception {
                    return new com.google.common.util.concurrent.ClosingFuture.Peeker(this.this$0.inputs).callAsync(asyncCombiningCallable, this.this$0.closeables);
                }

                public java.lang.String toString() {
                    return asyncCombiningCallable.toString();
                }
            }, executor));
            ((com.google.common.util.concurrent.ClosingFuture) closingFuture).closeables.add(this.closeables, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            return closingFuture;
        }

        private com.google.common.util.concurrent.Futures.FutureCombiner<java.lang.Object> futureCombiner() {
            if (this.allMustSucceed) {
                return com.google.common.util.concurrent.Futures.whenAllSucceed(inputFutures());
            }
            return com.google.common.util.concurrent.Futures.whenAllComplete(inputFutures());
        }

        private com.google.common.collect.ImmutableList<com.google.common.util.concurrent.FluentFuture<?>> inputFutures() {
            return com.google.common.collect.FluentIterable.from(this.inputs).transform(new com.google.common.base.Function() { // from class: com.google.common.util.concurrent.ClosingFuture$Combiner$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    com.google.common.util.concurrent.FluentFuture fluentFuture;
                    fluentFuture = ((com.google.common.util.concurrent.ClosingFuture) obj).future;
                    return fluentFuture;
                }
            }).toList();
        }
    }

    public static final class Combiner2<V1, V2> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;

        public interface AsyncClosingFunction2<V1, V2, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2) throws java.lang.Exception;
        }

        public interface ClosingFunction2<V1, V2, U> {
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2) throws java.lang.Exception;
        }

        private Combiner2(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V2>) closingFuture, closingFuture2));
            this.future1 = closingFuture;
            this.future2 = closingFuture2;
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner2.ClosingFunction2<V1, V2, U> closingFunction2, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.1
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner2 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) closingFunction2.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2));
                }

                public java.lang.String toString() {
                    return closingFunction2.toString();
                }
            }, executor);
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner2.AsyncClosingFunction2<V1, V2, U> asyncClosingFunction2, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.2
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner2 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return asyncClosingFunction2.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2));
                }

                public java.lang.String toString() {
                    return asyncClosingFunction2.toString();
                }
            }, executor);
        }
    }

    public static final class Combiner3<V1, V2, V3> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3) throws java.lang.Exception;
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3) throws java.lang.Exception;
        }

        private Combiner3(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2, com.google.common.util.concurrent.ClosingFuture<V3> closingFuture3) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V3>) closingFuture, (com.google.common.util.concurrent.ClosingFuture<V3>) closingFuture2, closingFuture3));
            this.future1 = closingFuture;
            this.future2 = closingFuture2;
            this.future3 = closingFuture3;
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner3.ClosingFunction3<V1, V2, V3, U> closingFunction3, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.1
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner3 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) closingFunction3.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2), peeker.getDone(this.this$0.future3));
                }

                public java.lang.String toString() {
                    return closingFunction3.toString();
                }
            }, executor);
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner3.AsyncClosingFunction3<V1, V2, V3, U> asyncClosingFunction3, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.2
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner3 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return asyncClosingFunction3.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2), peeker.getDone(this.this$0.future3));
                }

                public java.lang.String toString() {
                    return asyncClosingFunction3.toString();
                }
            }, executor);
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;
        private final com.google.common.util.concurrent.ClosingFuture<V4> future4;

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4) throws java.lang.Exception;
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4) throws java.lang.Exception;
        }

        private Combiner4(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2, com.google.common.util.concurrent.ClosingFuture<V3> closingFuture3, com.google.common.util.concurrent.ClosingFuture<V4> closingFuture4) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V4>) closingFuture, (com.google.common.util.concurrent.ClosingFuture<V4>) closingFuture2, (com.google.common.util.concurrent.ClosingFuture<V4>) closingFuture3, closingFuture4));
            this.future1 = closingFuture;
            this.future2 = closingFuture2;
            this.future3 = closingFuture3;
            this.future4 = closingFuture4;
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner4.ClosingFunction4<V1, V2, V3, V4, U> closingFunction4, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.1
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner4 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) closingFunction4.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2), peeker.getDone(this.this$0.future3), peeker.getDone(this.this$0.future4));
                }

                public java.lang.String toString() {
                    return closingFunction4.toString();
                }
            }, executor);
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner4.AsyncClosingFunction4<V1, V2, V3, V4, U> asyncClosingFunction4, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.2
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner4 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return asyncClosingFunction4.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2), peeker.getDone(this.this$0.future3), peeker.getDone(this.this$0.future4));
                }

                public java.lang.String toString() {
                    return asyncClosingFunction4.toString();
                }
            }, executor);
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends com.google.common.util.concurrent.ClosingFuture.Combiner {
        private final com.google.common.util.concurrent.ClosingFuture<V1> future1;
        private final com.google.common.util.concurrent.ClosingFuture<V2> future2;
        private final com.google.common.util.concurrent.ClosingFuture<V3> future3;
        private final com.google.common.util.concurrent.ClosingFuture<V4> future4;
        private final com.google.common.util.concurrent.ClosingFuture<V5> future5;

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            com.google.common.util.concurrent.ClosingFuture<U> apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) throws java.lang.Exception;
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            U apply(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, V1 v1, V2 v2, V3 v3, V4 v4, V5 v5) throws java.lang.Exception;
        }

        private Combiner5(com.google.common.util.concurrent.ClosingFuture<V1> closingFuture, com.google.common.util.concurrent.ClosingFuture<V2> closingFuture2, com.google.common.util.concurrent.ClosingFuture<V3> closingFuture3, com.google.common.util.concurrent.ClosingFuture<V4> closingFuture4, com.google.common.util.concurrent.ClosingFuture<V5> closingFuture5) {
            super(true, com.google.common.collect.ImmutableList.of((com.google.common.util.concurrent.ClosingFuture<V5>) closingFuture, (com.google.common.util.concurrent.ClosingFuture<V5>) closingFuture2, (com.google.common.util.concurrent.ClosingFuture<V5>) closingFuture3, (com.google.common.util.concurrent.ClosingFuture<V5>) closingFuture4, closingFuture5));
            this.future1 = closingFuture;
            this.future2 = closingFuture2;
            this.future3 = closingFuture3;
            this.future4 = closingFuture4;
            this.future5 = closingFuture5;
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> call(final com.google.common.util.concurrent.ClosingFuture.Combiner5.ClosingFunction5<V1, V2, V3, V4, V5, U> closingFunction5, java.util.concurrent.Executor executor) {
            return call(new com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.1
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner5 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                public U call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return (U) closingFunction5.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2), peeker.getDone(this.this$0.future3), peeker.getDone(this.this$0.future4), peeker.getDone(this.this$0.future5));
                }

                public java.lang.String toString() {
                    return closingFunction5.toString();
                }
            }, executor);
        }

        public final <U> com.google.common.util.concurrent.ClosingFuture<U> callAsync(final com.google.common.util.concurrent.ClosingFuture.Combiner5.AsyncClosingFunction5<V1, V2, V3, V4, V5, U> asyncClosingFunction5, java.util.concurrent.Executor executor) {
            return callAsync(new com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.2
                final /* synthetic */ com.google.common.util.concurrent.ClosingFuture.Combiner5 this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public com.google.common.util.concurrent.ClosingFuture<U> call(com.google.common.util.concurrent.ClosingFuture.DeferredCloser deferredCloser, com.google.common.util.concurrent.ClosingFuture.Peeker peeker) throws java.lang.Exception {
                    return asyncClosingFunction5.apply(deferredCloser, peeker.getDone(this.this$0.future1), peeker.getDone(this.this$0.future2), peeker.getDone(this.this$0.future3), peeker.getDone(this.this$0.future4), peeker.getDone(this.this$0.future5));
                }

                public java.lang.String toString() {
                    return asyncClosingFunction5.toString();
                }
            }, executor);
        }
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("state", this.state.get()).addValue(this.future).toString();
    }

    protected final void finalize() {
        if (this.state.get().equals(com.google.common.util.concurrent.ClosingFuture.State.OPEN)) {
            logger.get().log(java.util.logging.Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            finishToFuture();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(final java.lang.AutoCloseable autoCloseable, java.util.concurrent.Executor executor) {
        while (autoCloseable != null) {
            try {
                executor.execute(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.common.util.concurrent.ClosingFuture.lambda$closeQuietly$0(autoCloseable);
                    }
                });
                return;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                com.google.common.util.concurrent.LazyLogger lazyLogger = logger;
                if (lazyLogger.get().isLoggable(java.util.logging.Level.WARNING)) {
                    lazyLogger.get().log(java.util.logging.Level.WARNING, java.lang.String.format("while submitting close to %s; will close inline", executor), (java.lang.Throwable) e);
                }
                executor = com.google.common.util.concurrent.MoreExecutors.directExecutor();
            }
        }
    }

    static /* synthetic */ void lambda$closeQuietly$0(java.lang.AutoCloseable autoCloseable) {
        try {
            androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) autoCloseable);
        } catch (java.lang.Exception e) {
            com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(e);
            logger.get().log(java.util.logging.Level.WARNING, "thrown by close()", (java.lang.Throwable) e);
        }
    }

    private void checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State state, com.google.common.util.concurrent.ClosingFuture.State state2) {
        com.google.common.base.Preconditions.checkState(compareAndUpdateState(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    private boolean compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State state, com.google.common.util.concurrent.ClosingFuture.State state2) {
        return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.state, state, state2);
    }

    static final class CloseableList extends java.util.IdentityHashMap<java.lang.AutoCloseable, java.util.concurrent.Executor> implements java.lang.AutoCloseable {
        private volatile boolean closed;
        private final com.google.common.util.concurrent.ClosingFuture.DeferredCloser closer;
        private volatile java.util.concurrent.CountDownLatch whenClosed;

        private CloseableList() {
            this.closer = new com.google.common.util.concurrent.ClosingFuture.DeferredCloser(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final <V, U> com.google.common.util.concurrent.ListenableFuture<U> applyClosingFunction(com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V, U> closingFunction, V v) throws java.lang.Exception {
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                return com.google.common.util.concurrent.Futures.immediateFuture(closingFunction.apply(closeableList.closer, v));
            } finally {
                add(closeableList, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            }
        }

        final <V, U> com.google.common.util.concurrent.FluentFuture<U> applyAsyncClosingFunction(com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V, U> asyncClosingFunction, V v) throws java.lang.Exception {
            com.google.common.util.concurrent.ClosingFuture.CloseableList closeableList = new com.google.common.util.concurrent.ClosingFuture.CloseableList();
            try {
                com.google.common.util.concurrent.ClosingFuture<U> apply = asyncClosingFunction.apply(closeableList.closer, v);
                apply.becomeSubsumedInto(closeableList);
                return ((com.google.common.util.concurrent.ClosingFuture) apply).future;
            } finally {
                add(closeableList, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            synchronized (this) {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                for (java.util.Map.Entry<java.lang.AutoCloseable, java.util.concurrent.Executor> entry : entrySet()) {
                    com.google.common.util.concurrent.ClosingFuture.closeQuietly(entry.getKey(), entry.getValue());
                }
                clear();
                if (this.whenClosed != null) {
                    this.whenClosed.countDown();
                }
            }
        }

        final void add(java.lang.AutoCloseable autoCloseable, java.util.concurrent.Executor executor) {
            com.google.common.base.Preconditions.checkNotNull(executor);
            if (autoCloseable == null) {
                return;
            }
            synchronized (this) {
                if (this.closed) {
                    com.google.common.util.concurrent.ClosingFuture.closeQuietly(autoCloseable, executor);
                } else {
                    put(autoCloseable, executor);
                }
            }
        }

        final java.util.concurrent.CountDownLatch whenClosedCountDown() {
            if (this.closed) {
                return new java.util.concurrent.CountDownLatch(0);
            }
            synchronized (this) {
                if (this.closed) {
                    return new java.util.concurrent.CountDownLatch(0);
                }
                com.google.common.base.Preconditions.checkState(this.whenClosed == null);
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                this.whenClosed = countDownLatch;
                return countDownLatch;
            }
        }
    }

    final java.util.concurrent.CountDownLatch whenClosedCountDown() {
        return this.closeables.whenClosedCountDown();
    }
}
