package androidx.work.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m = "runWorker", n = {"params"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class WorkerWrapper$runWorker$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.work.impl.WorkerWrapper getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$runWorker$1(androidx.work.impl.WorkerWrapper workerWrapper, kotlin.coroutines.Continuation<? super androidx.work.impl.WorkerWrapper$runWorker$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = workerWrapper;
    }
}
