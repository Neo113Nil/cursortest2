package coil3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class RealImageLoader$enqueue$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.RealImageLoader getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ coil3.view.ImageRequest getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
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
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, 0, this);
        return Camera2StreamConfigurationMap == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation) {
        return ((coil3.RealImageLoader$enqueue$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil3.RealImageLoader$enqueue$job$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$enqueue$job$1(coil3.RealImageLoader realImageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.RealImageLoader$enqueue$job$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = realImageLoader;
        this.getHighSpeedVideoSizes = imageRequest;
    }
}
