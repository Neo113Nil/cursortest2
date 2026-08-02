package com.paypal.oslo.feature.shoppingrewards.rewards.common.domain;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;", "", "isCompleted", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/domain/OfferProgress;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferProgressKt {
    public static final boolean isCompleted(com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress offerProgress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerProgress, "");
        if (offerProgress instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous continuous = (com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Continuous) offerProgress;
            return continuous.getPercentCompleted() == 100.0f && continuous.getPercentRemaining() == 0.0f;
        }
        if (offerProgress instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet) {
            com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet discreet = (com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet) offerProgress;
            return discreet.getProgressValue() == discreet.getMaxProgressValue();
        }
        if (offerProgress instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.None) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
