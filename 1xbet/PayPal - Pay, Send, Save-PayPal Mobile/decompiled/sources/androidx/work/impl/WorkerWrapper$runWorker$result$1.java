package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, 308}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WorkerWrapper$runWorker$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result>, java.lang.Object> {
    final /* synthetic */ androidx.work.ListenableWorker Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.work.ForegroundUpdater getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.work.impl.WorkerWrapper getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (androidx.work.impl.utils.WorkForegroundKt.workForeground(r4, r5, r6, r7, r8, r10) != r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor;
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            context = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            androidx.work.impl.model.WorkSpec workSpec = this.getHighSpeedVideoFpsRanges.getWorkSpec();
            androidx.work.ListenableWorker listenableWorker = this.Camera2StreamConfigurationMap;
            androidx.work.ForegroundUpdater foregroundUpdater = this.getHighResolutionOutputSizeshNQ4ISI;
            taskExecutor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        str = androidx.work.impl.WorkerWrapperKt.getHighSpeedVideoSizes;
        androidx.work.impl.WorkerWrapper workerWrapper = this.getHighSpeedVideoFpsRanges;
        androidx.work.Logger logger = androidx.work.Logger.get();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Starting work for ");
        sb.append(workerWrapper.getWorkSpec().workerClassName);
        logger.debug(str, sb.toString());
        com.google.common.util.concurrent.ListenableFuture<androidx.work.ListenableWorker.Result> startWork = this.Camera2StreamConfigurationMap.startWork();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(startWork, "");
        this.getHighSpeedVideoFpsRangesFor = 2;
        java.lang.Object awaitWithin = androidx.work.impl.WorkerWrapperKt.awaitWithin(startWork, this.Camera2StreamConfigurationMap, this);
        return awaitWithin == coroutine_suspended ? coroutine_suspended : awaitWithin;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return ((androidx.work.impl.WorkerWrapper$runWorker$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.WorkerWrapper$runWorker$result$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$runWorker$result$1(androidx.work.impl.WorkerWrapper workerWrapper, androidx.work.ListenableWorker listenableWorker, androidx.work.ForegroundUpdater foregroundUpdater, kotlin.coroutines.Continuation<? super androidx.work.impl.WorkerWrapper$runWorker$result$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = workerWrapper;
        this.Camera2StreamConfigurationMap = listenableWorker;
        this.getHighResolutionOutputSizeshNQ4ISI = foregroundUpdater;
    }
}
