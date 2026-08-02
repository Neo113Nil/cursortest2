package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class AggregateFuture<InputT, OutputT> extends com.google.common.util.concurrent.AggregateFutureState<OutputT> {
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.AggregateFuture.class);
    private final boolean allMustSucceed;
    private final boolean collectsValues;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> futures;

    enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    abstract void collectOneValue(int i, InputT inputt);

    abstract void handleAllCompleted();

    AggregateFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection, boolean z, boolean z2) {
        super(immutableCollection.size());
        this.futures = (com.google.common.collect.ImmutableCollection) com.google.common.base.Preconditions.checkNotNull(immutableCollection);
        this.allMustSucceed = z;
        this.collectsValues = z2;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
        super.afterDone();
        com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean wasInterrupted = wasInterrupted();
            com.google.common.collect.UnmodifiableIterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(wasInterrupted);
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final java.lang.String pendingToString() {
        com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        if (immutableCollection != null) {
            return "futures=".concat(java.lang.String.valueOf(immutableCollection));
        }
        return super.pendingToString();
    }

    final void init() {
        java.util.Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            handleAllCompleted();
            return;
        }
        if (this.allMustSucceed) {
            com.google.common.collect.UnmodifiableIterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> it = this.futures.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final com.google.common.util.concurrent.ListenableFuture<? extends InputT> next = it.next();
                if (next.isDone()) {
                    m10351lambda$init$0$comgooglecommonutilconcurrentAggregateFuture(i, next);
                } else {
                    next.addListener(new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AggregateFuture$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.google.common.util.concurrent.AggregateFuture.this.m10351lambda$init$0$comgooglecommonutilconcurrentAggregateFuture(i, next);
                        }
                    }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
                }
                i++;
            }
            return;
        }
        com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection = this.futures;
        final com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> immutableCollection2 = this.collectsValues ? immutableCollection : null;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.common.util.concurrent.AggregateFuture$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.AggregateFuture.this.m10352lambda$init$1$comgooglecommonutilconcurrentAggregateFuture(immutableCollection2);
            }
        };
        com.google.common.collect.UnmodifiableIterator<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> it2 = immutableCollection.iterator();
        while (it2.hasNext()) {
            com.google.common.util.concurrent.ListenableFuture<? extends InputT> next2 = it2.next();
            if (next2.isDone()) {
                m10352lambda$init$1$comgooglecommonutilconcurrentAggregateFuture(immutableCollection2);
            } else {
                next2.addListener(runnable, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processAllMustSucceedDoneFuture, reason: merged with bridge method [inline-methods] */
    public void m10351lambda$init$0$comgooglecommonutilconcurrentAggregateFuture(int i, com.google.common.util.concurrent.ListenableFuture<? extends InputT> listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.futures = null;
                cancel(false);
            } else {
                collectValueFromNonCancelledFuture(i, listenableFuture);
            }
        } finally {
            m10352lambda$init$1$comgooglecommonutilconcurrentAggregateFuture(null);
        }
    }

    private void handleException(java.lang.Throwable th) {
        com.google.common.base.Preconditions.checkNotNull(th);
        if (this.allMustSucceed && !setException(th) && addCausalChain(getOrInitSeenExceptions(), th)) {
            log(th);
        } else if (th instanceof java.lang.Error) {
            log(th);
        }
    }

    private static void log(java.lang.Throwable th) {
        java.lang.String str;
        if (th instanceof java.lang.Error) {
            str = "Input Future failed with Error";
        } else {
            str = "Got more than one input Future failure. Logging failures after the first";
        }
        logger.get().log(java.util.logging.Level.SEVERE, str, th);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    final void addInitialException(java.util.Set<java.lang.Throwable> set) {
        com.google.common.base.Preconditions.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        addCausalChain(set, (java.lang.Throwable) java.util.Objects.requireNonNull(tryInternalFastPathGetFailure()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void collectValueFromNonCancelledFuture(int i, java.util.concurrent.Future<? extends InputT> future) {
        try {
            collectOneValue(i, com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(future));
        } catch (java.util.concurrent.ExecutionException e) {
            handleException(e.getCause());
        } catch (java.lang.Throwable th) {
            handleException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decrementCountAndMaybeComplete, reason: merged with bridge method [inline-methods] */
    public void m10352lambda$init$1$comgooglecommonutilconcurrentAggregateFuture(com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> immutableCollection) {
        int decrementRemainingAndGet = decrementRemainingAndGet();
        com.google.common.base.Preconditions.checkState(decrementRemainingAndGet >= 0, "Less than 0 remaining futures");
        if (decrementRemainingAndGet == 0) {
            processCompleted(immutableCollection);
        }
    }

    private void processCompleted(com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> immutableCollection) {
        if (immutableCollection != null) {
            com.google.common.collect.UnmodifiableIterator<? extends java.util.concurrent.Future<? extends InputT>> it = immutableCollection.iterator();
            int i = 0;
            while (it.hasNext()) {
                java.util.concurrent.Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i, next);
                }
                i++;
            }
        }
        clearSeenExceptions();
        handleAllCompleted();
        releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    void releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        com.google.common.base.Preconditions.checkNotNull(releaseResourcesReason);
        this.futures = null;
    }

    private static boolean addCausalChain(java.util.Set<java.lang.Throwable> set, java.lang.Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}
