package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/UiDataMappers;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;", "toOfferProgressType", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/models/OfferProgressType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UiDataMappers {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.UiDataMappers INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.UiDataMappers();

    private UiDataMappers() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType toOfferProgressType(com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress offerProgress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerProgress, "");
        if (offerProgress instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous continuous = (com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous) offerProgress;
            if (continuous.getShowProgressBar()) {
                return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Linear(continuous.getPercentCompleted(), continuous.getPercentRemaining());
            }
            return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.None.INSTANCE;
        }
        if (offerProgress instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet discreet = (com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet) offerProgress;
            return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.Avatar(discreet.getProgressValue(), discreet.getMaxProgressValue());
        }
        if (offerProgress instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.models.OfferProgressType.None.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
