package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public final class Futures extends com.google.common.util.concurrent.GwtFuturesCatchingSpecialization {
    private Futures() {
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFuture(V v) {
        if (v == null) {
            return (com.google.common.util.concurrent.ListenableFuture<V>) com.google.common.util.concurrent.ImmediateFuture.NULL;
        }
        return new com.google.common.util.concurrent.ImmediateFuture(v);
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Void> immediateVoidFuture() {
        return com.google.common.util.concurrent.ImmediateFuture.NULL;
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateFailedFuture(java.lang.Throwable th) {
        com.google.common.base.Preconditions.checkNotNull(th);
        return new com.google.common.util.concurrent.ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> immediateCancelledFuture() {
        com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture<java.lang.Object> immediateCancelledFuture = com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture.INSTANCE;
        return immediateCancelledFuture != null ? immediateCancelledFuture : new com.google.common.util.concurrent.ImmediateFuture.ImmediateCancelledFuture();
    }

    public static <O> com.google.common.util.concurrent.ListenableFuture<O> submit(java.util.concurrent.Callable<O> callable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(callable);
        executor.execute(create);
        return create;
    }

    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submit(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(runnable, null);
        executor.execute(create);
        return create;
    }

    public static <O> com.google.common.util.concurrent.ListenableFuture<O> submitAsync(com.google.common.util.concurrent.AsyncCallable<O> asyncCallable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(asyncCallable);
        executor.execute(create);
        return create;
    }

    public static <O> com.google.common.util.concurrent.ListenableFuture<O> scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> asyncCallable, java.time.Duration duration, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return scheduleAsync(asyncCallable, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS, scheduledExecutorService);
    }

    public static <O> com.google.common.util.concurrent.ListenableFuture<O> scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> asyncCallable, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.common.util.concurrent.TrustedListenableFutureTask create = com.google.common.util.concurrent.TrustedListenableFutureTask.create(asyncCallable);
        final java.util.concurrent.ScheduledFuture<?> schedule = scheduledExecutorService.schedule(create, j, timeUnit);
        create.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Futures$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                schedule.cancel(false);
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return create;
    }

    public static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> catching(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, com.google.common.base.Function<? super X, ? extends V> function, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractCatchingFuture.create(listenableFuture, cls, function, executor);
    }

    public static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> asyncFunction, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractCatchingFuture.createAsync(listenableFuture, cls, asyncFunction, executor);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, java.time.Duration duration, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return withTimeout(listenableFuture, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS, scheduledExecutorService);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> withTimeout(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : com.google.common.util.concurrent.TimeoutFuture.create(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transformAsync(com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> asyncFunction, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractTransformFuture.createAsync(listenableFuture, asyncFunction, executor);
    }

    public static <I, O> com.google.common.util.concurrent.ListenableFuture<O> transform(com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, com.google.common.base.Function<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        return com.google.common.util.concurrent.AbstractTransformFuture.create(listenableFuture, function, executor);
    }

    public static <I, O> java.util.concurrent.Future<O> lazyTransform(final java.util.concurrent.Future<I> future, final com.google.common.base.Function<? super I, ? extends O> function) {
        com.google.common.base.Preconditions.checkNotNull(future);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new java.util.concurrent.Future<O>() { // from class: com.google.common.util.concurrent.Futures.1
            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z) {
                return future.cancel(z);
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return future.isCancelled();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return future.isDone();
            }

            @Override // java.util.concurrent.Future
            public O get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                return applyTransformation(future.get());
            }

            @Override // java.util.concurrent.Future
            public O get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                return applyTransformation(future.get(j, timeUnit));
            }

            private O applyTransformation(I i) throws java.util.concurrent.ExecutionException {
                try {
                    return (O) function.apply(i);
                } catch (java.lang.Throwable th) {
                    throw new java.util.concurrent.ExecutionException(th);
                }
            }
        };
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... listenableFutureArr) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(listenableFutureArr), true);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> iterable) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(iterable), true);
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllComplete(com.google.common.util.concurrent.ListenableFuture<? extends V>... listenableFutureArr) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(false, com.google.common.collect.ImmutableList.copyOf(listenableFutureArr));
    }

    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> iterable) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(false, com.google.common.collect.ImmutableList.copyOf(iterable));
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllSucceed(com.google.common.util.concurrent.ListenableFuture<? extends V>... listenableFutureArr) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(true, com.google.common.collect.ImmutableList.copyOf(listenableFutureArr));
    }

    public static <V> com.google.common.util.concurrent.Futures.FutureCombiner<V> whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> iterable) {
        return new com.google.common.util.concurrent.Futures.FutureCombiner<>(true, com.google.common.collect.ImmutableList.copyOf(iterable));
    }

    /* loaded from: classes9.dex */
    public static final class FutureCombiner<V> {
        private final boolean allMustSucceed;
        private final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> futures;

        private FutureCombiner(boolean z, com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<? extends V>> immutableList) {
            this.allMustSucceed = z;
            this.futures = immutableList;
        }

        public final <C> com.google.common.util.concurrent.ListenableFuture<C> callAsync(com.google.common.util.concurrent.AsyncCallable<C> asyncCallable, java.util.concurrent.Executor executor) {
            return new com.google.common.util.concurrent.CombinedFuture(this.futures, this.allMustSucceed, executor, asyncCallable);
        }

        public final <C> com.google.common.util.concurrent.ListenableFuture<C> call(java.util.concurrent.Callable<C> callable, java.util.concurrent.Executor executor) {
            return new com.google.common.util.concurrent.CombinedFuture(this.futures, this.allMustSucceed, executor, callable);
        }

        public final com.google.common.util.concurrent.ListenableFuture<?> run(final java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            return call(new java.util.concurrent.Callable<java.lang.Void>(this) { // from class: com.google.common.util.concurrent.Futures.FutureCombiner.1
                final /* synthetic */ com.google.common.util.concurrent.Futures.FutureCombiner this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.util.concurrent.Callable
                public java.lang.Void call() throws java.lang.Exception {
                    runnable.run();
                    return null;
                }
            }, executor);
        }
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        com.google.common.util.concurrent.Futures.NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new com.google.common.util.concurrent.Futures.NonCancellationPropagatingFuture(listenableFuture);
        listenableFuture.addListener(nonCancellationPropagatingFuture, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return nonCancellationPropagatingFuture;
    }

    /* loaded from: classes9.dex */
    static final class NonCancellationPropagatingFuture<V> extends com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V> implements java.lang.Runnable {

        @com.google.errorprone.annotations.concurrent.LazyInit
        private com.google.common.util.concurrent.ListenableFuture<V> delegate;

        NonCancellationPropagatingFuture(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
            this.delegate = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.common.util.concurrent.ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected final java.lang.String pendingToString() {
            com.google.common.util.concurrent.ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture == null) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("delegate=[");
            sb.append(listenableFuture);
            sb.append("]");
            return sb.toString();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected final void afterDone() {
            this.delegate = null;
        }
    }

    @java.lang.SafeVarargs
    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>... listenableFutureArr) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(listenableFutureArr), false);
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<java.util.List<V>> successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> iterable) {
        return new com.google.common.util.concurrent.CollectionFuture.ListFuture(com.google.common.collect.ImmutableList.copyOf(iterable), false);
    }

    public static <T> com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> iterable) {
        com.google.common.util.concurrent.ListenableFuture[] gwtCompatibleToArray = gwtCompatibleToArray(iterable);
        final com.google.common.util.concurrent.Futures.InCompletionOrderState inCompletionOrderState = new com.google.common.util.concurrent.Futures.InCompletionOrderState(gwtCompatibleToArray);
        com.google.common.collect.ImmutableList.Builder builderWithExpectedSize = com.google.common.collect.ImmutableList.builderWithExpectedSize(gwtCompatibleToArray.length);
        for (int i = 0; i < gwtCompatibleToArray.length; i++) {
            builderWithExpectedSize.add((com.google.common.collect.ImmutableList.Builder) new com.google.common.util.concurrent.Futures.InCompletionOrderFuture(inCompletionOrderState));
        }
        final com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>> build = builderWithExpectedSize.build();
        for (final int i2 = 0; i2 < gwtCompatibleToArray.length; i2++) {
            gwtCompatibleToArray[i2].addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Futures$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.common.util.concurrent.Futures.InCompletionOrderState.this.recordInputCompletion(build, i2);
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        }
        return build;
    }

    private static <T> com.google.common.util.concurrent.ListenableFuture<? extends T>[] gwtCompatibleToArray(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> iterable) {
        java.util.Collection copyOf;
        if (iterable instanceof java.util.Collection) {
            copyOf = (java.util.Collection) iterable;
        } else {
            copyOf = com.google.common.collect.ImmutableList.copyOf(iterable);
        }
        return (com.google.common.util.concurrent.ListenableFuture[]) copyOf.toArray(new com.google.common.util.concurrent.ListenableFuture[0]);
    }

    /* loaded from: classes9.dex */
    static final class InCompletionOrderFuture<T> extends com.google.common.util.concurrent.AbstractFuture<T> {
        private com.google.common.util.concurrent.Futures.InCompletionOrderState<T> state;

        private InCompletionOrderFuture(com.google.common.util.concurrent.Futures.InCompletionOrderState<T> inCompletionOrderState) {
            this.state = inCompletionOrderState;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            com.google.common.util.concurrent.Futures.InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (!super.cancel(z)) {
                return false;
            }
            ((com.google.common.util.concurrent.Futures.InCompletionOrderState) java.util.Objects.requireNonNull(inCompletionOrderState)).recordOutputCancellation(z);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected final void afterDone() {
            this.state = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected final java.lang.String pendingToString() {
            com.google.common.util.concurrent.Futures.InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (inCompletionOrderState == null) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("inputCount=[");
            sb.append(((com.google.common.util.concurrent.Futures.InCompletionOrderState) inCompletionOrderState).inputFutures.length);
            sb.append("], remaining=[");
            sb.append(((com.google.common.util.concurrent.Futures.InCompletionOrderState) inCompletionOrderState).incompleteOutputCount.get());
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class InCompletionOrderState<T> {
        private volatile int delegateIndex;
        private final java.util.concurrent.atomic.AtomicInteger incompleteOutputCount;
        private final com.google.common.util.concurrent.ListenableFuture<? extends T>[] inputFutures;
        private boolean shouldInterrupt;
        private boolean wasCancelled;

        private InCompletionOrderState(com.google.common.util.concurrent.ListenableFuture<? extends T>[] listenableFutureArr) {
            this.wasCancelled = false;
            this.shouldInterrupt = true;
            this.delegateIndex = 0;
            this.inputFutures = listenableFutureArr;
            this.incompleteOutputCount = new java.util.concurrent.atomic.AtomicInteger(listenableFutureArr.length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordOutputCancellation(boolean z) {
            this.wasCancelled = true;
            if (!z) {
                this.shouldInterrupt = false;
            }
            recordCompletion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordInputCompletion(com.google.common.collect.ImmutableList<com.google.common.util.concurrent.AbstractFuture<T>> immutableList, int i) {
            com.google.common.util.concurrent.ListenableFuture<? extends T> listenableFuture = (com.google.common.util.concurrent.ListenableFuture) java.util.Objects.requireNonNull(this.inputFutures[i]);
            this.inputFutures[i] = null;
            for (int i2 = this.delegateIndex; i2 < immutableList.size(); i2++) {
                if (immutableList.get(i2).setFuture(listenableFuture)) {
                    recordCompletion();
                    this.delegateIndex = i2 + 1;
                    return;
                }
            }
            this.delegateIndex = immutableList.size();
        }

        private void recordCompletion() {
            if (this.incompleteOutputCount.decrementAndGet() == 0 && this.wasCancelled) {
                for (com.google.common.util.concurrent.ListenableFuture<? extends T> listenableFuture : this.inputFutures) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.shouldInterrupt);
                    }
                }
            }
        }
    }

    public static <V> void addCallback(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, com.google.common.util.concurrent.FutureCallback<? super V> futureCallback, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new com.google.common.util.concurrent.Futures.CallbackListener(listenableFuture, futureCallback), executor);
    }

    static final class CallbackListener<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.FutureCallback<? super V> callback;
        final java.util.concurrent.Future<V> future;

        CallbackListener(java.util.concurrent.Future<V> future, com.google.common.util.concurrent.FutureCallback<? super V> futureCallback) {
            this.future = future;
            this.callback = futureCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Throwable tryInternalFastPathGetFailure;
            java.util.concurrent.Future<V> future = this.future;
            if ((future instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure((com.google.common.util.concurrent.internal.InternalFutureFailureAccess) future)) != null) {
                this.callback.onFailure(tryInternalFastPathGetFailure);
                return;
            }
            try {
                this.callback.onSuccess(com.google.common.util.concurrent.Futures.getDone(this.future));
            } catch (java.util.concurrent.ExecutionException e) {
                this.callback.onFailure(e.getCause());
            } catch (java.lang.Throwable th) {
                this.callback.onFailure(th);
            }
        }

        public final java.lang.String toString() {
            return com.google.common.base.MoreObjects.toStringHelper(this).addValue(this.callback).toString();
        }
    }

    public static <V> V getDone(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(future);
    }

    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls) throws java.lang.Exception {
        return (V) com.google.common.util.concurrent.FuturesGetChecked.getChecked(future, cls);
    }

    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls, java.time.Duration duration) throws java.lang.Exception {
        return (V) getChecked(future, cls, com.google.common.util.concurrent.Internal.toNanosSaturated(duration), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public static <V, X extends java.lang.Exception> V getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> cls, long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.Exception {
        return (V) com.google.common.util.concurrent.FuturesGetChecked.getChecked(future, cls, j, timeUnit);
    }

    public static <V> V getUnchecked(java.util.concurrent.Future<V> future) {
        com.google.common.base.Preconditions.checkNotNull(future);
        try {
            return (V) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(future);
        } catch (java.util.concurrent.ExecutionException e) {
            if (e.getCause() instanceof java.lang.Error) {
                throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) e.getCause());
            }
            throw new com.google.common.util.concurrent.UncheckedExecutionException(e.getCause());
        }
    }
}
