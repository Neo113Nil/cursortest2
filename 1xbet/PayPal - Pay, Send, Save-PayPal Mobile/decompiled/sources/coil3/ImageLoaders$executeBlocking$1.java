package coil3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.ImageLoaders$executeBlocking$1", f = "imageLoaders.nonJsCommon.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class ImageLoaders$executeBlocking$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult>, java.lang.Object> {
    final /* synthetic */ coil3.ImageLoader getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.view.ImageRequest getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object execute = this.getHighResolutionOutputSizeshNQ4ISI.execute(this.getHighSpeedVideoFpsRanges, this);
        return execute == coroutine_suspended ? coroutine_suspended : execute;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation) {
        return ((coil3.ImageLoaders$executeBlocking$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil3.ImageLoaders$executeBlocking$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageLoaders$executeBlocking$1(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.ImageLoaders$executeBlocking$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = imageLoader;
        this.getHighSpeedVideoFpsRanges = imageRequest;
    }
}
