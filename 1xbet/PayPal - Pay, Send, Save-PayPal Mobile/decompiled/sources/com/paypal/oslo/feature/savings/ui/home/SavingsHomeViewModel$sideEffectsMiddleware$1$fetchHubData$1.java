package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1", f = "SavingsHomeViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {336, 357, 360}, m = "fetchHubData", n = {"input", "isFeatureAvailable", "input", "this_$iv", "result", "isFeatureAvailable", "$i$f$fold", "$i$a$-fold-SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$3", "input", "this_$iv", "result", "goalForSuccessSheet", "isFeatureAvailable", "$i$f$fold", "$i$a$-fold-SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$3"}, nl = {529, 360, 361}, s = {"L$0", "Z$0", "L$0", "L$1", "L$3", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1 getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1 savingsHomeViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$fetchHubData$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = savingsHomeViewModel$sideEffectsMiddleware$1;
    }
}
