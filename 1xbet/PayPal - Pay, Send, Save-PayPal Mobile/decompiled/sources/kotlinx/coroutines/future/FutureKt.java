package kotlinx.coroutines.future;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b*\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Ljava/util/concurrent/CompletableFuture;", "future", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/Deferred;", "asCompletableFuture", "(Lkotlinx/coroutines/Deferred;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/Job;", "", "(Lkotlinx/coroutines/Job;)Ljava/util/concurrent/CompletableFuture;", "Ljava/util/concurrent/CompletionStage;", "asDeferred", "(Ljava/util/concurrent/CompletionStage;)Lkotlinx/coroutines/Deferred;", "await", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
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
        if (coroutineStart.isLazy()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(coroutineStart);
            sb.append(" start is not supported");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
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
        completableFuture.handle((java.util.function.BiFunction) new kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda4(new kotlinx.coroutines.future.FutureKt$setupCancellation$1(deferred)));
        deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = kotlinx.coroutines.future.FutureKt.Camera2StreamConfigurationMap(completableFuture, deferred);
                return Camera2StreamConfigurationMap;
            }
        });
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(java.util.concurrent.CompletableFuture completableFuture, kotlinx.coroutines.Deferred deferred) {
        try {
            completableFuture.complete(deferred.getCompleted());
        } catch (java.lang.Throwable th) {
            completableFuture.completeExceptionally(th);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final java.util.concurrent.CompletableFuture<kotlin.Unit> asCompletableFuture(kotlinx.coroutines.Job job) {
        final java.util.concurrent.CompletableFuture<kotlin.Unit> completableFuture = new java.util.concurrent.CompletableFuture<>();
        completableFuture.handle((java.util.function.BiFunction<? super kotlin.Unit, java.lang.Throwable, ? extends U>) new kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda4(new kotlinx.coroutines.future.FutureKt$setupCancellation$1(job)));
        job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.coroutines.future.FutureKt.$r8$lambda$AN3dT8cx6ufJlh05dMC9JT7oKX8(completableFuture, (java.lang.Throwable) obj);
            }
        });
        return completableFuture;
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
                java.lang.Object highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = kotlinx.coroutines.future.FutureKt.getHighSpeedVideoFpsRanges(kotlinx.coroutines.CompletableDeferred.this, obj, (java.lang.Throwable) obj2);
                return highSpeedVideoFpsRanges;
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
    public static final java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.CompletableDeferred completableDeferred, java.lang.Object obj, java.lang.Throwable th) {
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
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoFpsRanges(th);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$AN3dT8cx6ufJlh05dMC9JT7oKX8(java.util.concurrent.CompletableFuture completableFuture, java.lang.Throwable th) {
        if (th == null) {
            completableFuture.complete(kotlin.Unit.INSTANCE);
        } else {
            completableFuture.completeExceptionally(th);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_dp01JYRUxJ_TTIqR53myVSuGfg(kotlin.jvm.functions.Function2 function2, java.lang.Object obj, java.lang.Throwable th) {
        return (kotlin.Unit) function2.invoke(obj, th);
    }
}
