package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
abstract class AbstractCatchingFuture<V, X extends java.lang.Throwable, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> implements java.lang.Runnable {

    @com.google.errorprone.annotations.concurrent.LazyInit
    java.lang.Class<X> exceptionType;

    @com.google.errorprone.annotations.concurrent.LazyInit
    F fallback;

    @com.google.errorprone.annotations.concurrent.LazyInit
    com.google.common.util.concurrent.ListenableFuture<? extends V> inputFuture;

    abstract T doFallback(F f, X x) throws java.lang.Exception;

    abstract void setResult(T t);

    static <V, X extends java.lang.Throwable> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, com.google.common.base.Function<? super X, ? extends V> function, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractCatchingFuture.CatchingFuture catchingFuture = new com.google.common.util.concurrent.AbstractCatchingFuture.CatchingFuture(listenableFuture, cls, function);
        listenableFuture.addListener(catchingFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, catchingFuture));
        return catchingFuture;
    }

    static <X extends java.lang.Throwable, V> com.google.common.util.concurrent.ListenableFuture<V> createAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> asyncFunction, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractCatchingFuture.AsyncCatchingFuture asyncCatchingFuture = new com.google.common.util.concurrent.AbstractCatchingFuture.AsyncCatchingFuture(listenableFuture, cls, asyncFunction);
        listenableFuture.addListener(asyncCatchingFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, asyncCatchingFuture));
        return asyncCatchingFuture;
    }

    AbstractCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, F f) {
        this.inputFuture = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(listenableFuture);
        this.exceptionType = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(cls);
        this.fallback = (F) com.google.common.base.Preconditions.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.lang.Throwable th;
        java.lang.Object obj;
        com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = this.inputFuture;
        java.lang.Class<X> cls = this.exceptionType;
        F f = this.fallback;
        if (((f == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (java.lang.Class<X>) null;
        this.inputFuture = null;
        if (listenableFuture instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess) {
            try {
                th = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure((com.google.common.util.concurrent.internal.InternalFutureFailureAccess) listenableFuture);
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Future type ");
                    sb.append(listenableFuture.getClass());
                    sb.append(" threw ");
                    sb.append(e.getClass());
                    sb.append(" without a cause");
                    cause = new java.lang.NullPointerException(sb.toString());
                }
                th = cause;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
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
            } catch (java.lang.Throwable th3) {
                try {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th3);
                    setException(th3);
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
    protected final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.exceptionType = null;
        this.fallback = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = this.inputFuture;
        java.lang.Class<X> cls = this.exceptionType;
        F f = this.fallback;
        java.lang.String pendingToString = super.pendingToString();
        if (listenableFuture == null) {
            str = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("inputFuture=[");
            sb.append(listenableFuture);
            sb.append("], ");
            str = sb.toString();
        }
        if (cls == null || f == null) {
            if (pendingToString == null) {
                return null;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(pendingToString);
            return sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("exceptionType=[");
        sb3.append(cls);
        sb3.append("], fallback=[");
        sb3.append(f);
        sb3.append("]");
        return sb3.toString();
    }

    static final class AsyncCatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>, com.google.common.util.concurrent.ListenableFuture<? extends V>> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        final /* bridge */ /* synthetic */ java.lang.Object doFallback(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception {
            return doFallback((com.google.common.util.concurrent.AsyncFunction<? super com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>, ? extends V>) obj, (com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V>) th);
        }

        AsyncCatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> asyncFunction) {
            super(listenableFuture, cls, asyncFunction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final com.google.common.util.concurrent.ListenableFuture<? extends V> doFallback(com.google.common.util.concurrent.AsyncFunction<? super X, ? extends V> asyncFunction, X x) throws java.lang.Exception {
            com.google.common.util.concurrent.ListenableFuture<? extends V> apply = asyncFunction.apply(x);
            com.google.common.base.Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public final void setResult(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    static final class CatchingFuture<V, X extends java.lang.Throwable> extends com.google.common.util.concurrent.AbstractCatchingFuture<V, X, com.google.common.base.Function<? super X, ? extends V>, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        final /* bridge */ /* synthetic */ java.lang.Object doFallback(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception {
            return doFallback((com.google.common.base.Function<? super com.google.common.base.Function<? super X, ? extends V>, ? extends V>) obj, (com.google.common.base.Function<? super X, ? extends V>) th);
        }

        CatchingFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture, java.lang.Class<X> cls, com.google.common.base.Function<? super X, ? extends V> function) {
            super(listenableFuture, cls, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final V doFallback(com.google.common.base.Function<? super X, ? extends V> function, X x) throws java.lang.Exception {
            return function.apply(x);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        final void setResult(V v) {
            set(v);
        }
    }
}
