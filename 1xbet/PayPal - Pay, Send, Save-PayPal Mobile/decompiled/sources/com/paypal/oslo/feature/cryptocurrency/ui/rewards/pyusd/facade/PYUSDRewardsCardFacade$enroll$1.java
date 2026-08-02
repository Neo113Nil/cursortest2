package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade", f = "PYUSDRewardsCardFacade.kt", i = {0}, l = {119}, m = "enroll", n = {"currentState"}, nl = {121}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PYUSDRewardsCardFacade$enroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.enroll(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PYUSDRewardsCardFacade$enroll$1(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$enroll$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = pYUSDRewardsCardFacade;
    }
}
