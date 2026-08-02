package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase", f = "GetRewardsSummaryUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "resolveRedeemEligibility$shopping_rewards_prodRelease", n = {"combined", "this_$iv", "it", "successResult", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "redeemDataItems", "$i$f$map", "$i$a$-map-GetRewardsSummaryUseCase$resolveRedeemEligibility$2", "$i$a$-let-GetRewardsSummaryUseCase$resolveRedeemEligibility$2$1", "combined", "this_$iv", "it", "successResult", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "redeemDataItems", "$i$f$map", "$i$a$-map-GetRewardsSummaryUseCase$resolveRedeemEligibility$2", "$i$a$-let-GetRewardsSummaryUseCase$resolveRedeemEligibility$2$1"}, nl = {138, 138}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes15.dex */
final class GetRewardsSummaryUseCase$resolveRedeemEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.resolveRedeemEligibility$shopping_rewards_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetRewardsSummaryUseCase$resolveRedeemEligibility$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$resolveRedeemEligibility$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = getRewardsSummaryUseCase;
    }
}
