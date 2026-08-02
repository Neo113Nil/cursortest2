package com.airbnb.lottie.compose;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.LottieRetrySignal", f = "LottieRetrySignal.kt", i = {0}, l = {45}, m = "awaitRetry", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class LottieRetrySignal$awaitRetry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.airbnb.lottie.compose.LottieRetrySignal getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.awaitRetry(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LottieRetrySignal$awaitRetry$1(com.airbnb.lottie.compose.LottieRetrySignal lottieRetrySignal, kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.LottieRetrySignal$awaitRetry$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = lottieRetrySignal;
    }
}
