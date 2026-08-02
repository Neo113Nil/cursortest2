package androidx.concurrent.futures;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/concurrent/futures/ToContinuation;", "T", "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/ListenableFuture;", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "p1", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlinx/coroutines/CancellableContinuation;)V", "", "run", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CancellableContinuation;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/google/common/util/concurrent/ListenableFuture;"}, k = 1, mv = {2, 3, 0})
/* loaded from: classes3.dex */
final class ToContinuation<T> implements java.lang.Runnable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CancellableContinuation<T> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.google.common.util.concurrent.ListenableFuture<T> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(com.google.common.util.concurrent.ListenableFuture<T> listenableFuture, kotlinx.coroutines.CancellableContinuation<? super T> cancellableContinuation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(listenableFuture, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cancellableContinuation, "");
        this.getHighResolutionOutputSizeshNQ4ISI = listenableFuture;
        this.Camera2StreamConfigurationMap = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isCancelled()) {
            kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(this.Camera2StreamConfigurationMap, null, 1, null);
            return;
        }
        try {
            kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation = this.Camera2StreamConfigurationMap;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(androidx.concurrent.futures.AbstractResolvableFuture.getUninterruptibly(this.getHighResolutionOutputSizeshNQ4ISI)));
        } catch (java.util.concurrent.ExecutionException e) {
            kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation2 = this.Camera2StreamConfigurationMap;
            java.lang.Throwable access$nonNullCause = androidx.concurrent.futures.ListenableFutureKt.access$nonNullCause(e);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(access$nonNullCause)));
        }
    }
}
