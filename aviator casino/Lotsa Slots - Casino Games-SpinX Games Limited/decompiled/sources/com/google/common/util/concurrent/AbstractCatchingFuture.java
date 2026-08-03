package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class AbstractCatchingFuture<V, X extends java.lang.Throwable, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.lang.Runnable {

    @javax.annotation.CheckForNull
    java.lang.Class<X> exceptionType;

    @javax.annotation.CheckForNull
    F fallback;

    @javax.annotation.CheckForNull
    com.google.common.util.concurrent.ListenableFuture<? extends V> inputFuture;

    @com.google.common.util.concurrent.ParametricNullness
    abstract T doFallback(F fallback, X throwable) throws java.lang.Exception;

    abstract void setResult(@com.google.common.util.concurrent.ParametricNullness T result);

    static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.base.Function<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractCatchingFuture.CatchingFuture catchingFuture = new com.google.common.util.concurrent.AbstractCatchingFuture.CatchingFuture(input, exceptionType, fallback);
        input.addListener(catchingFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, catchingFuture));
        return catchingFuture;
    }

    static <X extends java.lang.Throwable, V> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> fallback, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractCatchingFuture.AsyncCatchingFuture asyncCatchingFuture = new com.google.common.util.concurrent.AbstractCatchingFuture.AsyncCatchingFuture(input, exceptionType, fallback);
        input.addListener(asyncCatchingFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, asyncCatchingFuture));
        return asyncCatchingFuture;
    }

    AbstractCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, F f) {
        this.inputFuture = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(listenableFuture);
        this.exceptionType = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(cls);
        this.fallback = (F) com.google.common.base.Preconditions.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.lang.Object obj;
        com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = this.inputFuture;
        java.lang.Class<X> cls = this.exceptionType;
        F f = this.fallback;
        if (((f == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (java.lang.Class<X>) null;
        this.inputFuture = null;
        try {
            th = listenableFuture instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess ? com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure((com.google.common.util.concurrent.internal.InternalFutureFailureAccess) listenableFuture) : null;
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                cause = new java.lang.NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = com.google.common.util.concurrent.Futures.getDone(listenableFuture);
            if (th != null) {
                set(com.google.common.util.concurrent.NullnessCasts.uncheckedCastNullableTToT(obj));
                return;
            }
            if (!com.google.common.util.concurrent.Platform.isInstanceOfThrowableClass(th, cls)) {
                setFuture(listenableFuture);
                return;
            }
            try {
                java.lang.Object doFallback = doFallback(f, th);
                this.exceptionType = null;
                this.fallback = null;
                setResult(doFallback);
                return;
            } catch (java.lang.Throwable th2) {
                try {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th2);
                    setException(th2);
                    return;
                } finally {
                    this.exceptionType = null;
                    this.fallback = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @javax.annotation.CheckForNull
    protected java.lang.String pendingToString() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = this.inputFuture;
        java.lang.Class<X> cls = this.exceptionType;
        F f = this.fallback;
        java.lang.String pendingToString = super.pendingToString();
        if (listenableFuture == null) {
            str = "";
        } else {
            str = "inputFuture=[" + listenableFuture + "], ";
        }
        if (cls == null || f == null) {
            if (pendingToString == null) {
                return null;
            }
            return str + pendingToString;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f + com.ironsource.X3.j.e;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.exceptionType = null;
        this.fallback = null;
    }

    private static final class AsyncCatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>, com.google.common.util.concurrent.ListenableFuture<? extends V>> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* bridge */ /* synthetic */ java.lang.Object doFallback(java.lang.Object fallback, java.lang.Throwable cause) throws java.lang.Exception {
            return doFallback((com.google.common.util.concurrent.AsyncFunction<? super com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>, ? extends V>) fallback, (com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>) cause);
        }

        AsyncCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        com.google.common.util.concurrent.ListenableFuture<? extends V> doFallback(com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> fallback, X cause) throws java.lang.Exception {
            com.google.common.util.concurrent.ListenableFuture<? extends V> apply = fallback.apply(cause);
            com.google.common.base.Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", fallback);
            return apply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public void setResult(com.google.common.util.concurrent.ListenableFuture<? extends V> result) {
            setFuture(result);
        }
    }

    private static final class CatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.base.Function<? super X, ? extends V>, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        @com.google.common.util.concurrent.ParametricNullness
        /* bridge */ /* synthetic */ java.lang.Object doFallback(java.lang.Object fallback, java.lang.Throwable cause) throws java.lang.Exception {
            return doFallback((com.google.common.base.Function<? super com.google.common.base.Function<? super X, ? extends V>, ? extends V>) fallback, (com.google.common.base.Function<? super X, ? extends V>) cause);
        }

        CatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.base.Function<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @com.google.common.util.concurrent.ParametricNullness
        V doFallback(com.google.common.base.Function<? super X, ? extends V> fallback, X cause) throws java.lang.Exception {
            return fallback.apply(cause);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        void setResult(@com.google.common.util.concurrent.ParametricNullness V result) {
            set(result);
        }
    }
}
