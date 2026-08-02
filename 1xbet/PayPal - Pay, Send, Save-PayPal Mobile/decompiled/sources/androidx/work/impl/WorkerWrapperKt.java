package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0019\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"T", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker;", "worker", "awaitWithin", "(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/work/ListenableWorker;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoSizes", "Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkerWrapperKt {
    private static final java.lang.String getHighSpeedVideoSizes;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WorkerWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoSizes = tagWithPrefix;
    }

    public static final <T> java.lang.Object awaitWithin(final com.google.common.util.concurrent.ListenableFuture<T> listenableFuture, final androidx.work.ListenableWorker listenableWorker, kotlin.coroutines.Continuation<? super T> continuation) {
        try {
            if (listenableFuture.isDone()) {
                return getHighSpeedVideoFpsRangesFor(listenableFuture);
            }
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            listenableFuture.addListener(new androidx.work.impl.ToContinuation(listenableFuture, cancellableContinuationImpl2), androidx.work.DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    java.lang.Throwable th2 = th;
                    if (th2 instanceof androidx.work.impl.WorkerStoppedException) {
                        androidx.work.ListenableWorker.this.stop(((androidx.work.impl.WorkerStoppedException) th2).getReason());
                    }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V getHighSpeedVideoFpsRangesFor(java.util.concurrent.Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return v;
    }

    public static final /* synthetic */ java.lang.Throwable access$nonNullCause(java.util.concurrent.ExecutionException executionException) {
        java.lang.Throwable cause = executionException.getCause();
        kotlin.jvm.internal.Intrinsics.checkNotNull(cause);
        return cause;
    }
}
