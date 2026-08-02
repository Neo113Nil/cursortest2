package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class LottieAnimatableImpl$snapTo$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.airbnb.lottie.LottieComposition getHighSpeedVideoSizes;
    final /* synthetic */ com.airbnb.lottie.compose.LottieAnimatableImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
            com.airbnb.lottie.compose.LottieAnimatableImpl.getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats, this.getHighSpeedVideoFpsRanges);
            this.getOutputFormats.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getOutputFormats.getHighSpeedVideoFpsRanges(false);
            if (this.Camera2StreamConfigurationMap) {
                this.getOutputFormats.getHighSpeedVideoFpsRangesFor(Long.MIN_VALUE);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2(this.getOutputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LottieAnimatableImpl$snapTo$2(com.airbnb.lottie.compose.LottieAnimatableImpl lottieAnimatableImpl, com.airbnb.lottie.LottieComposition lottieComposition, float f, int i, boolean z, kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2> continuation) {
        super(1, continuation);
        this.getOutputFormats = lottieAnimatableImpl;
        this.getHighSpeedVideoSizes = lottieComposition;
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
    }
}
