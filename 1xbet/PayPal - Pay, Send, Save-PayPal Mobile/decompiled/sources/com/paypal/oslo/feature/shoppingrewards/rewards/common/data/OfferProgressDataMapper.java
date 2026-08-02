package com.paypal.oslo.feature.shoppingrewards.rewards.common.data;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u0005*\u0004\u0018\u00010\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\n*\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/data/OfferProgressDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Discreet;", "getOfferProgress$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/DiscreteRewardSummaryProgressFragment;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Discreet;", "offerProgress", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ContinuousRewardSummaryProgressFragment;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Continuous;", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/ContinuousRewardSummaryProgressFragment;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress$Continuous;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferProgressDataMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.data.OfferProgressDataMapper();

    private OfferProgressDataMapper() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet getOfferProgress$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.DiscreteRewardSummaryProgressFragment discreteRewardSummaryProgressFragment) {
        java.lang.Integer transactionCountCompleted;
        java.lang.Integer transactionCountRemaining;
        int i = 0;
        int intValue = (discreteRewardSummaryProgressFragment == null || (transactionCountRemaining = discreteRewardSummaryProgressFragment.getTransactionCountRemaining()) == null) ? 0 : transactionCountRemaining.intValue();
        if (discreteRewardSummaryProgressFragment != null && (transactionCountCompleted = discreteRewardSummaryProgressFragment.getTransactionCountCompleted()) != null) {
            i = transactionCountCompleted.intValue();
        }
        int i2 = intValue + i;
        if (i2 <= 0) {
            i2 = 3;
        }
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet(i, i2);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous getOfferProgress$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.ContinuousRewardSummaryProgressFragment continuousRewardSummaryProgressFragment) {
        java.lang.String percentRemaining;
        java.lang.Float floatOrNull;
        java.lang.String percentCompleted;
        java.lang.Float floatOrNull2;
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous((continuousRewardSummaryProgressFragment == null || (percentCompleted = continuousRewardSummaryProgressFragment.getPercentCompleted()) == null || (floatOrNull2 = kotlin.text.StringsKt.toFloatOrNull(percentCompleted)) == null) ? 0.0f : floatOrNull2.floatValue(), (continuousRewardSummaryProgressFragment == null || (percentRemaining = continuousRewardSummaryProgressFragment.getPercentRemaining()) == null || (floatOrNull = kotlin.text.StringsKt.toFloatOrNull(percentRemaining)) == null) ? 100.0f : floatOrNull.floatValue(), false, 4, null);
    }
}
