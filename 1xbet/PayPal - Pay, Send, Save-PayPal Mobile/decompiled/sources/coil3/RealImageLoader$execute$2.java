package coil3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class RealImageLoader$execute$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult>, java.lang.Object> {
    final /* synthetic */ coil3.view.ImageRequest Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.RealImageLoader getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor().getMainCoroutineContextLazy().getValue(), null, new coil3.RealImageLoader$execute$2$job$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, null), 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object await = coil3.RealImageLoader_androidKt.getDisposable(this.Camera2StreamConfigurationMap, async$default).getJob().await(this);
        return await == coroutine_suspended ? coroutine_suspended : await;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation) {
        return ((coil3.RealImageLoader$execute$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        coil3.RealImageLoader$execute$2 realImageLoader$execute$2 = new coil3.RealImageLoader$execute$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        realImageLoader$execute$2.getHighSpeedVideoFpsRangesFor = obj;
        return realImageLoader$execute$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$2(coil3.RealImageLoader realImageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.RealImageLoader$execute$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = realImageLoader;
        this.Camera2StreamConfigurationMap = imageRequest;
    }
}
