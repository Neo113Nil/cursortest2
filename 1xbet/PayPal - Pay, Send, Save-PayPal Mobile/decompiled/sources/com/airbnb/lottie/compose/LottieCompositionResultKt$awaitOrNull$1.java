package com.airbnb.lottie.compose;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.LottieCompositionResultKt", f = "LottieCompositionResult.kt", i = {}, l = {85}, m = "awaitOrNull", n = {}, s = {})
/* loaded from: classes7.dex */
final class LottieCompositionResultKt$awaitOrNull$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.airbnb.lottie.compose.LottieCompositionResultKt.awaitOrNull(null, this);
    }

    LottieCompositionResultKt$awaitOrNull$1(kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.LottieCompositionResultKt$awaitOrNull$1> continuation) {
        super(continuation);
    }
}
