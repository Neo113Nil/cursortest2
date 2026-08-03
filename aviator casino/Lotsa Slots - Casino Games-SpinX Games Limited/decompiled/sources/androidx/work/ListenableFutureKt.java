package androidx.work;

/* compiled from: ListenableFuture.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "R", "Lcom/google/common/util/concurrent/ListenableFuture;", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ListenableFutureKt {
    public static final <R> java.lang.Object await(com.google.common.util.concurrent.ListenableFuture<R> listenableFuture, kotlin.coroutines.Continuation<? super R> continuation) {
        if (listenableFuture.isDone()) {
            try {
                return listenableFuture.get();
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
        listenableFuture.addListener(new androidx.work.ListenableFutureKt$await$2$1(cancellableContinuationImpl2, listenableFuture), androidx.work.DirectExecutor.INSTANCE);
        cancellableContinuationImpl2.invokeOnCancellation(new androidx.work.ListenableFutureKt$await$2$2(listenableFuture));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private static final <R> java.lang.Object await$$forInline(com.google.common.util.concurrent.ListenableFuture<R> listenableFuture, kotlin.coroutines.Continuation<? super R> continuation) {
        if (listenableFuture.isDone()) {
            try {
                return listenableFuture.get();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        }
        kotlin.jvm.internal.InlineMarker.mark(0);
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        listenableFuture.addListener(new androidx.work.ListenableFutureKt$await$2$1(cancellableContinuationImpl2, listenableFuture), androidx.work.DirectExecutor.INSTANCE);
        cancellableContinuationImpl2.invokeOnCancellation(new androidx.work.ListenableFutureKt$await$2$2(listenableFuture));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        kotlin.jvm.internal.InlineMarker.mark(1);
        return result;
    }
}
