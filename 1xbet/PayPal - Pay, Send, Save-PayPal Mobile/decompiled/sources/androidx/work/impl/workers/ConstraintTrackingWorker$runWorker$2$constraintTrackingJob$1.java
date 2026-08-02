package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", f = "ConstraintTrackingWorker.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.work.impl.model.WorkSpec getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.work.impl.constraints.WorkConstraintsTracker getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$awaitConstraintsNotMet(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.Camera2StreamConfigurationMap.set(((java.lang.Number) obj).intValue());
        this.getHighSpeedVideoFpsRanges.cancel(true);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker, androidx.work.impl.model.WorkSpec workSpec, java.util.concurrent.atomic.AtomicInteger atomicInteger, com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> listenableFuture, kotlin.coroutines.Continuation<? super androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = workConstraintsTracker;
        this.getHighResolutionOutputSizeshNQ4ISI = workSpec;
        this.Camera2StreamConfigurationMap = atomicInteger;
        this.getHighSpeedVideoFpsRanges = listenableFuture;
    }
}
