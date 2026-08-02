package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsSummary;", "", "enteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsSummary;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedeemRewardsUiModelMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel toUiModel$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummary rewardsSummary, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return toUiModel(rewardsSummary, str);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel toUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummary rewardsSummary, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount availableRewards = rewardsSummary.getAvailableRewards();
        boolean isPayPalPlusEligible = rewardsSummary.isPayPalPlusEligible();
        java.lang.Boolean isPayPalPlusEnrolled = rewardsSummary.isPayPalPlusEnrolled();
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(availableRewards, isPayPalPlusEligible, java.lang.Boolean.valueOf(isPayPalPlusEnrolled != null ? isPayPalPlusEnrolled.booleanValue() : false), rewardsSummary.getPayPalPlusConversionRate(), null, null, rewardsSummary.getRewardsCalculation(), null, str, null, null, null, 3760, null);
    }
}
