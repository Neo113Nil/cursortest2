package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", i = {}, l = {42, 50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class WorkForegroundKt$workForeground$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Void>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.work.ForegroundUpdater getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.work.ListenableWorker getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.work.impl.model.WorkSpec getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r9 != r0) goto L13;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.google.common.util.concurrent.ListenableFuture<androidx.work.ForegroundInfo> foregroundInfoAsync = this.getHighSpeedVideoFpsRangesFor.getForegroundInfoAsync();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "");
            this.getHighSpeedVideoFpsRanges = 1;
            obj = androidx.work.impl.WorkerWrapperKt.awaitWithin(foregroundInfoAsync, this.getHighSpeedVideoFpsRangesFor, this);
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
        androidx.work.ForegroundInfo foregroundInfo = (androidx.work.ForegroundInfo) obj;
        if (foregroundInfo != null) {
            str = androidx.work.impl.utils.WorkForegroundKt.getHighSpeedVideoFpsRanges;
            androidx.work.impl.model.WorkSpec workSpec = this.getHighSpeedVideoSizes;
            androidx.work.Logger logger = androidx.work.Logger.get();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Updating notification for ");
            sb.append(workSpec.workerClassName);
            logger.debug(str, sb.toString());
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> foregroundAsync = this.getHighResolutionOutputSizeshNQ4ISI.setForegroundAsync(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getId(), foregroundInfo);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(foregroundAsync, "");
            this.getHighSpeedVideoFpsRanges = 2;
            java.lang.Object await = androidx.concurrent.futures.ListenableFutureKt.await(foregroundAsync, this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Worker was marked important (");
        sb2.append(this.getHighSpeedVideoSizes.workerClassName);
        sb2.append(") but did not provide ForegroundInfo");
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Void> continuation) {
        return ((androidx.work.impl.utils.WorkForegroundKt$workForeground$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.work.impl.utils.WorkForegroundKt$workForeground$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkForegroundKt$workForeground$2(androidx.work.ListenableWorker listenableWorker, androidx.work.impl.model.WorkSpec workSpec, androidx.work.ForegroundUpdater foregroundUpdater, android.content.Context context, kotlin.coroutines.Continuation<? super androidx.work.impl.utils.WorkForegroundKt$workForeground$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = listenableWorker;
        this.getHighSpeedVideoSizes = workSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = foregroundUpdater;
        this.Camera2StreamConfigurationMap = context;
    }
}
