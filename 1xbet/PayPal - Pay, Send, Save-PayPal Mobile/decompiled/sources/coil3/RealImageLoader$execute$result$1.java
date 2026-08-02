package coil3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.RealImageLoader$execute$result$1", f = "RealImageLoader.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class RealImageLoader$execute$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult>, java.lang.Object> {
    final /* synthetic */ coil3.view.Size Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.view.ImageRequest getHighSpeedVideoFpsRanges;
    final /* synthetic */ coil3.EventListener getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ coil3.Image getHighSpeedVideoSizes;
    final /* synthetic */ coil3.RealImageLoader getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
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
        coil3.view.ImageRequest imageRequest = this.getHighSpeedVideoFpsRanges;
        java.util.List<coil3.intercept.Interceptor> interceptors = this.getInputFormats.getCamera2StreamConfigurationMap().getInterceptors();
        coil3.view.ImageRequest imageRequest2 = this.getHighSpeedVideoFpsRanges;
        coil3.view.Size size = this.Camera2StreamConfigurationMap;
        coil3.EventListener eventListener = this.getHighSpeedVideoFpsRangesFor;
        boolean z = this.getHighSpeedVideoSizes != null;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object proceed = new coil3.intercept.RealInterceptorChain(imageRequest, interceptors, 0, imageRequest2, size, eventListener, z).proceed(this);
        return proceed == coroutine_suspended ? coroutine_suspended : proceed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation) {
        return ((coil3.RealImageLoader$execute$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil3.RealImageLoader$execute$result$1(this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$result$1(coil3.view.ImageRequest imageRequest, coil3.RealImageLoader realImageLoader, coil3.view.Size size, coil3.EventListener eventListener, coil3.Image image, kotlin.coroutines.Continuation<? super coil3.RealImageLoader$execute$result$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = imageRequest;
        this.getInputFormats = realImageLoader;
        this.Camera2StreamConfigurationMap = size;
        this.getHighSpeedVideoFpsRangesFor = eventListener;
        this.getHighSpeedVideoSizes = image;
    }
}
