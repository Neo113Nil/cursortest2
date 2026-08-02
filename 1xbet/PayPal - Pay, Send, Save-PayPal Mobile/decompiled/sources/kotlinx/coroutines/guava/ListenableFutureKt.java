package kotlinx.coroutines.guava;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aZ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/common/util/concurrent/ListenableFuture;", "future", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlinx/coroutines/Deferred;", "asDeferred", "(Lcom/google/common/util/concurrent/ListenableFuture;)Lkotlinx/coroutines/Deferred;", "asListenableFuture", "(Lkotlinx/coroutines/Deferred;)Lcom/google/common/util/concurrent/ListenableFuture;", "await", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListenableFutureKt {
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture future$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> com.google.common.util.concurrent.ListenableFuture<T> future(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        if (coroutineStart.isLazy()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(coroutineStart);
            sb.append(" start is not supported");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        kotlinx.coroutines.guava.ListenableFutureCoroutine listenableFutureCoroutine = new kotlinx.coroutines.guava.ListenableFutureCoroutine(kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext));
        listenableFutureCoroutine.start(coroutineStart, listenableFutureCoroutine, function2);
        return listenableFutureCoroutine.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(final com.google.common.util.concurrent.ListenableFuture<T> listenableFuture) {
        java.lang.Throwable tryInternalFastPathGetFailure;
        if ((listenableFuture instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure((com.google.common.util.concurrent.internal.InternalFutureFailureAccess) listenableFuture)) != null) {
            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default.completeExceptionally(tryInternalFastPathGetFailure);
            return CompletableDeferred$default;
        }
        if (listenableFuture.isDone()) {
            try {
                return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(listenableFuture));
            } catch (java.util.concurrent.CancellationException e) {
                kotlinx.coroutines.CompletableDeferred CompletableDeferred$default2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                CompletableDeferred$default2.cancel(e);
                return CompletableDeferred$default2;
            } catch (java.util.concurrent.ExecutionException e2) {
                kotlinx.coroutines.CompletableDeferred CompletableDeferred$default3 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                java.lang.Throwable cause = e2.getCause();
                kotlin.jvm.internal.Intrinsics.checkNotNull(cause);
                CompletableDeferred$default3.completeExceptionally(cause);
                return CompletableDeferred$default3;
            }
        }
        final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default4 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        com.google.common.util.concurrent.Futures.addCallback(listenableFuture, new com.google.common.util.concurrent.FutureCallback<T>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$asDeferred$4
            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onSuccess(T result) {
                java.lang.Object m23436constructorimpl;
                kotlinx.coroutines.CompletableDeferred<T> completableDeferred = CompletableDeferred$default4;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlinx.coroutines.guava.ListenableFutureKt$asDeferred$4<T> listenableFutureKt$asDeferred$4 = this;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(completableDeferred.complete(result)));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, m23439exceptionOrNullimpl);
                }
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onFailure(java.lang.Throwable t) {
                java.lang.Object m23436constructorimpl;
                kotlinx.coroutines.CompletableDeferred<T> completableDeferred = CompletableDeferred$default4;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    kotlinx.coroutines.guava.ListenableFutureKt$asDeferred$4<T> listenableFutureKt$asDeferred$4 = this;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Boolean.valueOf(completableDeferred.completeExceptionally(t)));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, m23439exceptionOrNullimpl);
                }
            }
        }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        CompletableDeferred$default4.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.coroutines.guava.ListenableFutureKt.$r8$lambda$MAa7Wl7B77dQzaBfRZy9EXTeyKg(com.google.common.util.concurrent.ListenableFuture.this, (java.lang.Throwable) obj);
            }
        });
        return new kotlinx.coroutines.Deferred<T>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$asDeferred$6
            @Override // kotlinx.coroutines.Job
            public final boolean start() {
                return CompletableDeferred$default4.start();
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
            public final kotlinx.coroutines.Job plus(kotlinx.coroutines.Job other) {
                return CompletableDeferred$default4.plus(other);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
                return CompletableDeferred$default4.plus(context);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
                return CompletableDeferred$default4.minusKey(key);
            }

            @Override // kotlinx.coroutines.Job
            public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return CompletableDeferred$default4.join(continuation);
            }

            @Override // kotlinx.coroutines.Job
            public final boolean isCompleted() {
                return CompletableDeferred$default4.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public final boolean isCancelled() {
                return CompletableDeferred$default4.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public final boolean isActive() {
                return CompletableDeferred$default4.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return CompletableDeferred$default4.invokeOnCompletion(onCancelling, invokeImmediately, handler);
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return CompletableDeferred$default4.invokeOnCompletion(handler);
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.Job getParent() {
                return CompletableDeferred$default4.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
                return CompletableDeferred$default4.getOnJoin();
            }

            @Override // kotlinx.coroutines.Deferred
            public final kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
                return CompletableDeferred$default4.getOnAwait();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
                return CompletableDeferred$default4.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public final java.lang.Throwable getCompletionExceptionOrNull() {
                return CompletableDeferred$default4.getCompletionExceptionOrNull();
            }

            @Override // kotlinx.coroutines.Deferred
            public final T getCompleted() {
                return CompletableDeferred$default4.getCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
                return CompletableDeferred$default4.getChildren();
            }

            @Override // kotlinx.coroutines.Job
            public final java.util.concurrent.CancellationException getCancellationException() {
                return CompletableDeferred$default4.getCancellationException();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
                return (E) CompletableDeferred$default4.get(key);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
                return (R) CompletableDeferred$default4.fold(initial, operation);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public final /* synthetic */ boolean cancel(java.lang.Throwable cause2) {
                return CompletableDeferred$default4.cancel(cause2);
            }

            @Override // kotlinx.coroutines.Job
            public final void cancel(java.util.concurrent.CancellationException cause2) {
                CompletableDeferred$default4.cancel(cause2);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public final /* synthetic */ void cancel() {
                CompletableDeferred$default4.cancel();
            }

            @Override // kotlinx.coroutines.Deferred
            public final java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
                return CompletableDeferred$default4.await(continuation);
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child) {
                return CompletableDeferred$default4.attachChild(child);
            }
        };
    }

    public static final <T> com.google.common.util.concurrent.ListenableFuture<T> asListenableFuture(final kotlinx.coroutines.Deferred<? extends T> deferred) {
        final kotlinx.coroutines.guava.JobListenableFuture jobListenableFuture = new kotlinx.coroutines.guava.JobListenableFuture(deferred);
        deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.coroutines.guava.ListenableFutureKt.$r8$lambda$0l7yaaoj6EqQkdR3dlQsAa1osUo(kotlinx.coroutines.guava.JobListenableFuture.this, deferred, (java.lang.Throwable) obj);
            }
        });
        return jobListenableFuture;
    }

    public static final <T> java.lang.Object await(final com.google.common.util.concurrent.ListenableFuture<T> listenableFuture, kotlin.coroutines.Continuation<? super T> continuation) {
        try {
            if (listenableFuture.isDone()) {
                return com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(listenableFuture);
            }
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            listenableFuture.addListener(new kotlinx.coroutines.guava.ToContinuation(listenableFuture, cancellableContinuationImpl2), com.google.common.util.concurrent.MoreExecutors.directExecutor());
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$await$2$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    listenableFuture.cancel(false);
                    return kotlin.Unit.INSTANCE;
                }
            });
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            kotlin.jvm.internal.Intrinsics.checkNotNull(cause);
            throw cause;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0l7yaaoj6EqQkdR3dlQsAa1osUo(kotlinx.coroutines.guava.JobListenableFuture jobListenableFuture, kotlinx.coroutines.Deferred deferred, java.lang.Throwable th) {
        if (th == null) {
            jobListenableFuture.getHighSpeedVideoFpsRanges.set(deferred.getCompleted());
        } else {
            jobListenableFuture.Camera2StreamConfigurationMap(th);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MAa7Wl7B77dQzaBfRZy9EXTeyKg(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Throwable th) {
        listenableFuture.cancel(false);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Throwable access$nonNullCause(java.util.concurrent.ExecutionException executionException) {
        java.lang.Throwable cause = executionException.getCause();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cause);
        return cause;
    }
}
