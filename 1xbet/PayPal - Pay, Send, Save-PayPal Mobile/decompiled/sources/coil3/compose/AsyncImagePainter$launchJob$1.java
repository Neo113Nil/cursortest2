package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.compose.AsyncImagePainter$launchJob$1", f = "AsyncImagePainter.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 238}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class AsyncImagePainter$launchJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ coil3.compose.AsyncImagePainter Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ coil3.compose.AsyncImagePainter.Input getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r6 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        coil3.view.ImageRequest Camera2StreamConfigurationMap;
        coil3.compose.AsyncImagePainter asyncImagePainter;
        coil3.view.ImageRequest Camera2StreamConfigurationMap2;
        coil3.compose.AsyncImagePainter.State state;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coil3.compose.AsyncImagePreviewHandler previewHandler = this.Camera2StreamConfigurationMap.getPreviewHandler();
            if (previewHandler != null) {
                Camera2StreamConfigurationMap2 = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getRequest(), true);
                this.getHighSpeedVideoFpsRanges = 1;
                obj = previewHandler.handle(this.getHighSpeedVideoFpsRangesFor.getImageLoader(), Camera2StreamConfigurationMap2, this);
            } else {
                Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getRequest(), false);
                coil3.compose.AsyncImagePainter asyncImagePainter2 = this.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = asyncImagePainter2;
                this.getHighSpeedVideoFpsRanges = 2;
                obj = this.getHighSpeedVideoFpsRangesFor.getImageLoader().execute(Camera2StreamConfigurationMap, this);
                if (obj != coroutine_suspended) {
                    asyncImagePainter = asyncImagePainter2;
                    state = asyncImagePainter.getHighSpeedVideoFpsRanges((coil3.view.ImageResult) obj);
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            state = (coil3.compose.AsyncImagePainter.State) obj;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            asyncImagePainter = (coil3.compose.AsyncImagePainter) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            state = asyncImagePainter.getHighSpeedVideoFpsRanges((coil3.view.ImageResult) obj);
        }
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(state);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((coil3.compose.AsyncImagePainter$launchJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil3.compose.AsyncImagePainter$launchJob$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncImagePainter$launchJob$1(coil3.compose.AsyncImagePainter asyncImagePainter, coil3.compose.AsyncImagePainter.Input input, kotlin.coroutines.Continuation<? super coil3.compose.AsyncImagePainter$launchJob$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = asyncImagePainter;
        this.getHighSpeedVideoFpsRangesFor = input;
    }
}
