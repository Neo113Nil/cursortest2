package androidx.concurrent.futures;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"T", "Lcom/google/common/util/concurrent/ListenableFuture;", "await", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0})
/* loaded from: classes.dex */
public final class ListenableFutureKt {
    public static final <T> java.lang.Object await(final com.google.common.util.concurrent.ListenableFuture<T> listenableFuture, kotlin.coroutines.Continuation<? super T> continuation) {
        try {
            if (listenableFuture.isDone()) {
                return androidx.concurrent.futures.AbstractResolvableFuture.getUninterruptibly(listenableFuture);
            }
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            listenableFuture.addListener(new androidx.concurrent.futures.ToContinuation(listenableFuture, cancellableContinuationImpl2), androidx.concurrent.futures.DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    com.google.common.util.concurrent.ListenableFuture.this.cancel(false);
                    return kotlin.Unit.INSTANCE;
                }

                {
                    super(1);
                }
            });
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            throw cause;
        }
    }

    public static final /* synthetic */ java.lang.Throwable access$nonNullCause(java.util.concurrent.ExecutionException executionException) {
        java.lang.Throwable cause = executionException.getCause();
        if (cause == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return cause;
    }
}
