package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1", f = "SavingsHomeViewModel.kt", i = {0, 0}, l = {459}, m = "getGoalForSuccessSheet", n = {com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "achievedGoals"}, nl = {495}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1 Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1 savingsHomeViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel$sideEffectsMiddleware$1$getGoalForSuccessSheet$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = savingsHomeViewModel$sideEffectsMiddleware$1;
    }
}
