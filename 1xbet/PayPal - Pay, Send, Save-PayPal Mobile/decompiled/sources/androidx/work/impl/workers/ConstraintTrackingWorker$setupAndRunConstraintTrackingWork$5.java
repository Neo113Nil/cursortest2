package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result>, java.lang.Object> {
    final /* synthetic */ androidx.work.impl.workers.ConstraintTrackingWorker Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.work.impl.model.WorkSpec getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.work.ListenableWorker getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.work.impl.constraints.WorkConstraintsTracker getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object access$runWorker = androidx.work.impl.workers.ConstraintTrackingWorker.access$runWorker(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this);
        return access$runWorker == coroutine_suspended ? coroutine_suspended : access$runWorker;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return ((androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, androidx.work.ListenableWorker listenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker, androidx.work.impl.model.WorkSpec workSpec, kotlin.coroutines.Continuation<? super androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = constraintTrackingWorker;
        this.getHighSpeedVideoFpsRanges = listenableWorker;
        this.getHighSpeedVideoSizes = workConstraintsTracker;
        this.getHighResolutionOutputSizeshNQ4ISI = workSpec;
    }
}
