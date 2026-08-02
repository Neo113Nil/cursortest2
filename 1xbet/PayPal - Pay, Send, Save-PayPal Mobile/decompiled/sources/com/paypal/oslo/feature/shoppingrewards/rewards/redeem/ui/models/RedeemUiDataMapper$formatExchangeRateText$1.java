package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper", f = "RedeemUiDataMapper.kt", i = {0, 0, 0, 0, 0}, l = {33}, m = "formatExchangeRateText", n = {"exchangeRatePoints", "exchangeRateAmount", "currencyCode", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "amount"}, nl = {34}, s = {"L$0", "L$1", "L$2", "I$0", "D$0"}, v = 2)
/* loaded from: classes15.dex */
final class RedeemUiDataMapper$formatExchangeRateText$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    double getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.formatExchangeRateText(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedeemUiDataMapper$formatExchangeRateText$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper redeemUiDataMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatExchangeRateText$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = redeemUiDataMapper;
    }
}
