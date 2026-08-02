package kotlinx.coroutines.guava;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/guava/ToContinuation;", "T", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "Lcom/google/common/util/concurrent/ListenableFuture;", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "p1", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlinx/coroutines/CancellableContinuation;)V", "", "run", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/google/common/util/concurrent/ListenableFuture;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ToContinuation<T> implements java.lang.Runnable {
    private final kotlinx.coroutines.CancellableContinuation<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.google.common.util.concurrent.ListenableFuture<T> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(com.google.common.util.concurrent.ListenableFuture<T> listenableFuture, kotlinx.coroutines.CancellableContinuation<? super T> cancellableContinuation) {
        this.Camera2StreamConfigurationMap = listenableFuture;
        this.getHighResolutionOutputSizeshNQ4ISI = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.Camera2StreamConfigurationMap.isCancelled()) {
            kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
            return;
        }
        try {
            kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(this.Camera2StreamConfigurationMap)));
        } catch (java.util.concurrent.ExecutionException e) {
            kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(kotlinx.coroutines.guava.ListenableFutureKt.access$nonNullCause(e))));
        }
    }
}
