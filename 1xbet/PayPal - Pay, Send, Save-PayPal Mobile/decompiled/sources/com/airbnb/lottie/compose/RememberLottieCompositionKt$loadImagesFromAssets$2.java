package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class RememberLottieCompositionKt$loadImagesFromAssets$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.airbnb.lottie.LottieComposition getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        for (com.airbnb.lottie.LottieImageAsset lottieImageAsset : this.getHighSpeedVideoSizes.getImages().values()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(lottieImageAsset);
            com.airbnb.lottie.compose.RememberLottieCompositionKt.getHighSpeedVideoFpsRanges(lottieImageAsset);
            com.airbnb.lottie.compose.RememberLottieCompositionKt.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, lottieImageAsset, this.getHighSpeedVideoFpsRanges);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberLottieCompositionKt$loadImagesFromAssets$2(com.airbnb.lottie.LottieComposition lottieComposition, android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = lottieComposition;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
