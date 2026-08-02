package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
abstract class AbstractTransformFuture<I, O, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<O> implements java.lang.Runnable {

    @com.google.errorprone.annotations.concurrent.LazyInit
    F function;

    @com.google.errorprone.annotations.concurrent.LazyInit
    com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture;

    abstract T doTransform(F f, I i) throws java.lang.Exception;

    abstract void setResult(T t);

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> createAsync(com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> asyncFunction, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = new com.google.common.util.concurrent.AbstractTransformFuture.AsyncTransformFuture(listenableFuture, asyncFunction);
        listenableFuture.addListener(asyncTransformFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> create(com.google.common.util.concurrent.ListenableFuture<I> listenableFuture, com.google.common.base.Function<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractTransformFuture.TransformFuture transformFuture = new com.google.common.util.concurrent.AbstractTransformFuture.TransformFuture(listenableFuture, function);
        listenableFuture.addListener(transformFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, transformFuture));
        return transformFuture;
    }

    AbstractTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture, F f) {
        this.inputFuture = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(listenableFuture);
        this.function = (F) com.google.common.base.Preconditions.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f = this.function;
        if ((isCancelled() | (listenableFuture == null)) || (f == null)) {
            return;
        }
        this.inputFuture = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                java.lang.Object doTransform = doTransform(f, com.google.common.util.concurrent.Futures.getDone(listenableFuture));
                this.function = null;
                setResult(doTransform);
            } catch (java.lang.Throwable th) {
                try {
                    com.google.common.util.concurrent.Platform.restoreInterruptIfIsInterruptedException(th);
                    setException(th);
                } finally {
                    this.function = null;
                }
            }
        } catch (java.lang.Error e) {
            setException(e);
        } catch (java.util.concurrent.CancellationException unused) {
            cancel(false);
        } catch (java.util.concurrent.ExecutionException e2) {
            setException(e2.getCause());
        } catch (java.lang.Exception e3) {
            setException(e3);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.function = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected java.lang.String pendingToString() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f = this.function;
        java.lang.String pendingToString = super.pendingToString();
        if (listenableFuture == null) {
            str = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("inputFuture=[");
            sb.append(listenableFuture);
            sb.append("], ");
            str = sb.toString();
        }
        if (f != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(f);
            sb2.append("]");
            return sb2.toString();
        }
        if (pendingToString == null) {
            return null;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(pendingToString);
        return sb3.toString();
    }

    static final class AsyncTransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends O>> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        final /* bridge */ /* synthetic */ java.lang.Object doTransform(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            return doTransform((com.google.common.util.concurrent.AsyncFunction<? super com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>, ? extends O>) obj, (com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>) obj2);
        }

        AsyncTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> asyncFunction) {
            super(listenableFuture, asyncFunction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final com.google.common.util.concurrent.ListenableFuture<? extends O> doTransform(com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> asyncFunction, I i) throws java.lang.Exception {
            com.google.common.util.concurrent.ListenableFuture<? extends O> apply = asyncFunction.apply(i);
            com.google.common.base.Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public final void setResult(com.google.common.util.concurrent.ListenableFuture<? extends O> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    static final class TransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.base.Function<? super I, ? extends O>, O> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        final /* bridge */ /* synthetic */ java.lang.Object doTransform(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            return doTransform((com.google.common.base.Function<? super com.google.common.base.Function<? super I, ? extends O>, ? extends O>) obj, (com.google.common.base.Function<? super I, ? extends O>) obj2);
        }

        TransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture, com.google.common.base.Function<? super I, ? extends O> function) {
            super(listenableFuture, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        final O doTransform(com.google.common.base.Function<? super I, ? extends O> function, I i) {
            return function.apply(i);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        final void setResult(O o2) {
            set(o2);
        }
    }
}
