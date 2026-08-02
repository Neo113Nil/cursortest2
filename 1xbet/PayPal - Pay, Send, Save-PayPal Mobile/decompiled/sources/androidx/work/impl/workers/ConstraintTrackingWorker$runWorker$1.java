package androidx.work.impl.workers;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", i = {}, l = {125}, m = "runWorker", n = {}, s = {})
/* loaded from: classes7.dex */
final class ConstraintTrackingWorker$runWorker$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.work.impl.workers.ConstraintTrackingWorker getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.work.impl.workers.ConstraintTrackingWorker.access$runWorker(this.getHighSpeedVideoFpsRangesFor, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$1(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, kotlin.coroutines.Continuation<? super androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = constraintTrackingWorker;
    }
}
