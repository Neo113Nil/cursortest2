package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase", f = "GetRewardsSummaryUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {152, 152}, m = "adjustDebitCardVisibility$shopping_rewards_prodRelease", n = {"rewardsSummary", "this_$iv", "it", "successResult", "earnContent", "$i$f$map", "$i$a$-map-GetRewardsSummaryUseCase$adjustDebitCardVisibility$2", "$i$a$-let-GetRewardsSummaryUseCase$adjustDebitCardVisibility$2$1", "$i$a$-let-GetRewardsSummaryUseCase$adjustDebitCardVisibility$2$1$1", "rewardsSummary", "this_$iv", "it", "successResult", "earnContent", "$i$f$map", "$i$a$-map-GetRewardsSummaryUseCase$adjustDebitCardVisibility$2", "$i$a$-let-GetRewardsSummaryUseCase$adjustDebitCardVisibility$2$1", "$i$a$-let-GetRewardsSummaryUseCase$adjustDebitCardVisibility$2$1$1"}, nl = {156, 156}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class GetRewardsSummaryUseCase$adjustDebitCardVisibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.adjustDebitCardVisibility$shopping_rewards_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetRewardsSummaryUseCase$adjustDebitCardVisibility$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase$adjustDebitCardVisibility$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = getRewardsSummaryUseCase;
    }
}
