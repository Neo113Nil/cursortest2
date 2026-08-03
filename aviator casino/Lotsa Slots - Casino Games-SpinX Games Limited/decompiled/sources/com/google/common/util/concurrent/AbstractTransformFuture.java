package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
abstract class AbstractTransformFuture<I, O, F, T> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<O> implements java.lang.Runnable {

    @javax.annotation.CheckForNull
    F function;

    @javax.annotation.CheckForNull
    com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture;

    @com.google.common.util.concurrent.ParametricNullness
    abstract T doTransform(F function, @com.google.common.util.concurrent.ParametricNullness I result) throws java.lang.Exception;

    abstract void setResult(@com.google.common.util.concurrent.ParametricNullness T result);

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> create(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(executor);
        com.google.common.util.concurrent.AbstractTransformFuture.AsyncTransformFuture asyncTransformFuture = new com.google.common.util.concurrent.AbstractTransformFuture.AsyncTransformFuture(input, function);
        input.addListener(asyncTransformFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }

    static <I, O> com.google.common.util.concurrent.ListenableFuture<O> create(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.base.Function<? super I, ? extends O> function, java.util.concurrent.Executor executor) {
        com.google.common.base.Preconditions.checkNotNull(function);
        com.google.common.util.concurrent.AbstractTransformFuture.TransformFuture transformFuture = new com.google.common.util.concurrent.AbstractTransformFuture.TransformFuture(input, function);
        input.addListener(transformFuture, com.google.common.util.concurrent.MoreExecutors.rejectionPropagatingExecutor(executor, transformFuture));
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
    @javax.annotation.CheckForNull
    protected java.lang.String pendingToString() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture<? extends I> listenableFuture = this.inputFuture;
        F f = this.function;
        java.lang.String pendingToString = super.pendingToString();
        if (listenableFuture == null) {
            str = "";
        } else {
            str = "inputFuture=[" + listenableFuture + "], ";
        }
        if (f != null) {
            return str + "function=[" + f + com.ironsource.X3.j.e;
        }
        if (pendingToString == null) {
            return null;
        }
        return str + pendingToString;
    }

    private static final class AsyncTransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends O>> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* bridge */ /* synthetic */ java.lang.Object doTransform(java.lang.Object function, @com.google.common.util.concurrent.ParametricNullness java.lang.Object input) throws java.lang.Exception {
            return doTransform((com.google.common.util.concurrent.AsyncFunction<? super com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>, ? extends O>) function, (com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O>) input);
        }

        AsyncTransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture, com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        com.google.common.util.concurrent.ListenableFuture<? extends O> doTransform(com.google.common.util.concurrent.AsyncFunction<? super I, ? extends O> function, @com.google.common.util.concurrent.ParametricNullness I input) throws java.lang.Exception {
            com.google.common.util.concurrent.ListenableFuture<? extends O> apply = function.apply(input);
            com.google.common.base.Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", function);
            return apply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public void setResult(com.google.common.util.concurrent.ListenableFuture<? extends O> result) {
            setFuture(result);
        }
    }

    private static final class TransformFuture<I, O> extends com.google.common.util.concurrent.AbstractTransformFuture<I, O, com.google.common.base.Function<? super I, ? extends O>, O> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @com.google.common.util.concurrent.ParametricNullness
        /* bridge */ /* synthetic */ java.lang.Object doTransform(java.lang.Object function, @com.google.common.util.concurrent.ParametricNullness java.lang.Object input) throws java.lang.Exception {
            return doTransform((com.google.common.base.Function<? super com.google.common.base.Function<? super I, ? extends O>, ? extends O>) function, (com.google.common.base.Function<? super I, ? extends O>) input);
        }

        TransformFuture(com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture, com.google.common.base.Function<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @com.google.common.util.concurrent.ParametricNullness
        O doTransform(com.google.common.base.Function<? super I, ? extends O> function, @com.google.common.util.concurrent.ParametricNullness I input) {
            return function.apply(input);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        void setResult(@com.google.common.util.concurrent.ParametricNullness O result) {
            set(result);
        }
    }
}
