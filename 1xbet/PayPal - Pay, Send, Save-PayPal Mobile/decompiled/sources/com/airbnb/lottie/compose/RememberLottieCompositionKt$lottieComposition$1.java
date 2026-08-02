package com.airbnb.lottie.compose;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, l = {150, 151, 152}, m = "lottieComposition", n = {"context", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "context", "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes7.dex */
final class RememberLottieCompositionKt$lottieComposition$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.airbnb.lottie.compose.RememberLottieCompositionKt.lottieComposition(null, null, null, null, null, null, this);
    }

    RememberLottieCompositionKt$lottieComposition$1(kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.RememberLottieCompositionKt$lottieComposition$1> continuation) {
        super(continuation);
    }
}
