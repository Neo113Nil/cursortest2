package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper", f = "RedeemUiDataMapper.kt", i = {0, 0, 0, 0}, l = {48}, m = "formatCashEquivalent$shopping_rewards_prodRelease", n = {"currencyCode", "cashValue", "amount", "config"}, nl = {55}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class RedeemUiDataMapper$formatCashEquivalent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.formatCashEquivalent$shopping_rewards_prodRelease(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedeemUiDataMapper$formatCashEquivalent$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper redeemUiDataMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatCashEquivalent$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = redeemUiDataMapper;
    }
}
