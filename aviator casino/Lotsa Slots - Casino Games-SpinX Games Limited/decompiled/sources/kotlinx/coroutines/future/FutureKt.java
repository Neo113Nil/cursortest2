package kotlinx.coroutines.future;

/* compiled from: Future.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f\u001a\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001*\u00020\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u0010*\u00020\u00112\n\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0014\u001a\u001e\u0010\u0015\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"future", "Ljava/util/concurrent/CompletableFuture;", "T", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ljava/util/concurrent/CompletableFuture;", "asCompletableFuture", "Lkotlinx/coroutines/Deferred;", "", "Lkotlinx/coroutines/Job;", "setupCancellation", "asDeferred", "Ljava/util/concurrent/CompletionStage;", "await", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FutureKt {
    public static /* synthetic */ java.util.concurrent.CompletableFuture future$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> java.util.concurrent.CompletableFuture<T> future(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        if (!(!coroutineStart.isLazy())) {
            throw new java.lang.IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        java.util.concurrent.CompletableFuture<T> completableFuture = new java.util.concurrent.CompletableFuture<>();
        kotlinx.coroutines.future.CompletableFutureCoroutine completableFutureCoroutine = new kotlinx.coroutines.future.CompletableFutureCoroutine(newCoroutineContext, completableFuture);
        completableFuture.handle((java.util.function.BiFunction) completableFutureCoroutine);
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, function2);
        return completableFuture;
    }

    public static final <T> java.util.concurrent.CompletableFuture<T> asCompletableFuture(final kotlinx.coroutines.Deferred<? extends T> deferred) {
        final java.util.concurrent.CompletableFuture<T> completableFuture = new java.util.concurrent.CompletableFuture<>();
        setupCancellation(deferred, completableFuture);
        deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit asCompletableFuture$lambda$1;
                asCompletableFuture$lambda$1 = kotlinx.coroutines.future.FutureKt.asCompletableFuture$lambda$1(completableFuture, deferred, (java.lang.Throwable) obj);
                return asCompletableFuture$lambda$1;
            }
        });
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit asCompletableFuture$lambda$1(java.util.concurrent.CompletableFuture completableFuture, kotlinx.coroutines.Deferred deferred, java.lang.Throwable th) {
        try {
            completableFuture.complete(deferred.getCompleted());
        } catch (java.lang.Throwable th2) {
            completableFuture.completeExceptionally(th2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final java.util.concurrent.CompletableFuture<kotlin.Unit> asCompletableFuture(kotlinx.coroutines.Job job) {
        final java.util.concurrent.CompletableFuture<kotlin.Unit> completableFuture = new java.util.concurrent.CompletableFuture<>();
        setupCancellation(job, completableFuture);
        job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit asCompletableFuture$lambda$2;
                asCompletableFuture$lambda$2 = kotlinx.coroutines.future.FutureKt.asCompletableFuture$lambda$2(completableFuture, (java.lang.Throwable) obj);
                return asCompletableFuture$lambda$2;
            }
        });
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit asCompletableFuture$lambda$2(java.util.concurrent.CompletableFuture completableFuture, java.lang.Throwable th) {
        if (th == null) {
            completableFuture.complete(kotlin.Unit.INSTANCE);
        } else {
            completableFuture.completeExceptionally(th);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void setupCancellation(final kotlinx.coroutines.Job job, java.util.concurrent.CompletableFuture<?> completableFuture) {
        final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.future.FutureKt$setupCancellation$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                invoke(obj, (java.lang.Throwable) obj2);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(java.lang.Object obj, java.lang.Throwable th) {
                kotlinx.coroutines.Job job2 = kotlinx.coroutines.Job.this;
                if (th != null) {
                    r0 = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
                    if (r0 == null) {
                        r0 = kotlinx.coroutines.ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th);
                    }
                }
                job2.cancel(r0);
            }
        };
        completableFuture.handle(new java.util.function.BiFunction() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda4
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit unit;
                unit = kotlinx.coroutines.future.FutureKt.setupCancellation$lambda$3(kotlin.jvm.functions.Function2.this, obj, (java.lang.Throwable) obj2);
                return unit;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit setupCancellation$lambda$3(kotlin.jvm.functions.Function2 function2, java.lang.Object obj, java.lang.Throwable th) {
        return (kotlin.Unit) function2.invoke(obj, th);
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(java.util.concurrent.CompletionStage<T> completionStage) {
        java.lang.Throwable cause;
        java.util.concurrent.CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(completableFuture.get());
            } catch (java.lang.Throwable th) {
                th = th;
                java.util.concurrent.ExecutionException executionException = th instanceof java.util.concurrent.ExecutionException ? (java.util.concurrent.ExecutionException) th : null;
                if (executionException != null && (cause = executionException.getCause()) != null) {
                    th = cause;
                }
                kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                CompletableDeferred$default.completeExceptionally(th);
                return CompletableDeferred$default;
            }
        }
        final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object asDeferred$lambda$5;
                asDeferred$lambda$5 = kotlinx.coroutines.future.FutureKt.asDeferred$lambda$5(kotlinx.coroutines.CompletableDeferred.this, obj, (java.lang.Throwable) obj2);
                return asDeferred$lambda$5;
            }
        };
        completionStage.handle(new java.util.function.BiFunction() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda2
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function2.this.invoke(obj, (java.lang.Throwable) obj2);
                return invoke;
            }
        });
        kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(CompletableDeferred$default2, false, new kotlinx.coroutines.future.CancelFutureOnCompletion(completableFuture), 1, null);
        return CompletableDeferred$default2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object asDeferred$lambda$5(kotlinx.coroutines.CompletableDeferred completableDeferred, java.lang.Object obj, java.lang.Throwable th) {
        boolean completeExceptionally;
        java.lang.Throwable cause;
        try {
            if (th == null) {
                completeExceptionally = completableDeferred.complete(obj);
            } else {
                java.util.concurrent.CompletionException completionException = th instanceof java.util.concurrent.CompletionException ? (java.util.concurrent.CompletionException) th : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                completeExceptionally = completableDeferred.completeExceptionally(th);
            }
            return java.lang.Boolean.valueOf(completeExceptionally);
        } catch (java.lang.Throwable th2) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, th2);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final <T> java.lang.Object await(java.util.concurrent.CompletionStage<T> completionStage, kotlin.coroutines.Continuation<? super T> continuation) {
        final java.util.concurrent.CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final kotlinx.coroutines.future.ContinuationHandler continuationHandler = new kotlinx.coroutines.future.ContinuationHandler(cancellableContinuationImpl2);
        completionStage.handle(continuationHandler);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.future.FutureKt$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                completableFuture.cancel(false);
                continuationHandler.cont = null;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
