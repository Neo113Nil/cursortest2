package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware", f = "RewardsDetailSideEffectMiddleware.kt", i = {0}, l = {44}, m = "fetchRewardsDetail", n = {"eventDispatcher"}, nl = {114}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class RewardsDetailSideEffectMiddleware$fetchRewardsDetail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsDetailSideEffectMiddleware$fetchRewardsDetail$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware rewardsDetailSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailSideEffectMiddleware$fetchRewardsDetail$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = rewardsDetailSideEffectMiddleware;
    }
}
