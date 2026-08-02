package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware", f = "RedeemRewardsSideEffectMiddleware.kt", i = {0, 0, 0, 0}, l = {59}, m = "processRedemption", n = {"state", "eventDispatcher", "amount", "request"}, nl = {84}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class RedeemRewardsSideEffectMiddleware$processRedemption$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputFormats.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedeemRewardsSideEffectMiddleware$processRedemption$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware redeemRewardsSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsSideEffectMiddleware$processRedemption$1> continuation) {
        super(continuation);
        this.getOutputFormats = redeemRewardsSideEffectMiddleware;
    }
}
