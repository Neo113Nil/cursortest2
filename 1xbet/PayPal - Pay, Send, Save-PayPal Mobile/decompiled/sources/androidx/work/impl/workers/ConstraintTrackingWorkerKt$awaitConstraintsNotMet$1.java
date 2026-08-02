package androidx.work.impl.workers;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt", f = "ConstraintTrackingWorker.kt", i = {}, l = {160}, m = "awaitConstraintsNotMet", n = {}, s = {})
/* loaded from: classes7.dex */
final class ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$awaitConstraintsNotMet(null, null, this);
    }

    ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1(kotlin.coroutines.Continuation<? super androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$1> continuation) {
        super(continuation);
    }
}
