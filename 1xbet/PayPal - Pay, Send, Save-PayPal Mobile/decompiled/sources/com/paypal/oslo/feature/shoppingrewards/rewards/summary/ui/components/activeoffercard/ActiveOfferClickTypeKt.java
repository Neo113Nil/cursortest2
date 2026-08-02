package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/models/ActiveOfferNavigationType;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;", "toClickType", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/activeoffers/domain/models/ActiveOfferNavigationType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveOfferClickTypeKt {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType toClickType(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferNavigationType activeOfferNavigationType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferNavigationType, "");
        int i = com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickTypeKt.WhenMappings.$EnumSwitchMapping$0[activeOfferNavigationType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType.DEFAULT;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType.CATEGORY_CONFIRMATION;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferNavigationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferNavigationType.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.models.ActiveOfferNavigationType.CATEGORY_CONFIRMATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
