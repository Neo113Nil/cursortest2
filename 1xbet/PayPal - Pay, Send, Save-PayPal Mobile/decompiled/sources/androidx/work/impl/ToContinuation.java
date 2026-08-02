package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/work/impl/ToContinuation;", "T", "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/ListenableFuture;", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "p1", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlinx/coroutines/CancellableContinuation;)V", "", "run", "()V", "getHighSpeedVideoFpsRanges", "Lcom/google/common/util/concurrent/ListenableFuture;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CancellableContinuation;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ToContinuation<T> implements java.lang.Runnable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CancellableContinuation<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.google.common.util.concurrent.ListenableFuture<T> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(com.google.common.util.concurrent.ListenableFuture<T> listenableFuture, kotlinx.coroutines.CancellableContinuation<? super T> cancellableContinuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listenableFuture, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellableContinuation, "");
        this.getHighSpeedVideoSizes = listenableFuture;
        this.getHighResolutionOutputSizeshNQ4ISI = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object highSpeedVideoFpsRangesFor;
        if (this.getHighSpeedVideoSizes.isCancelled()) {
            kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
            return;
        }
        try {
            kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            highSpeedVideoFpsRangesFor = androidx.work.impl.WorkerWrapperKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(highSpeedVideoFpsRangesFor));
        } catch (java.util.concurrent.ExecutionException e) {
            kotlinx.coroutines.CancellableContinuation<T> cancellableContinuation2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(androidx.work.impl.WorkerWrapperKt.access$nonNullCause(e))));
        }
    }
}
