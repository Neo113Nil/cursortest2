package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/useatcheckout/navigation/UseAtCheckoutDestinationData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/UseAtCheckoutUiData;", "toUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/useatcheckout/navigation/UseAtCheckoutDestinationData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/UseAtCheckoutUiData;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedemptionConfirmationDestinationData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionConfirmationUiData;", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedemptionConfirmationDestinationData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedemptionConfirmationUiData;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedeemFlowTermsUiData;", "toTermsUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedeemFlowTermsUiData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UiDataMappersKt {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData toUiData(com.paypal.oslo.feature.shoppingrewards.api.rewards.useatcheckout.navigation.UseAtCheckoutDestinationData useAtCheckoutDestinationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useAtCheckoutDestinationData, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData(useAtCheckoutDestinationData.getTitle(), useAtCheckoutDestinationData.getDescription(), useAtCheckoutDestinationData.getImageUrl());
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData toUiData(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedemptionConfirmationDestinationData redemptionConfirmationDestinationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionConfirmationDestinationData, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedemptionConfirmationUiData(redemptionConfirmationDestinationData.getRedeemedAmount());
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemFlowTermsUiData toTermsUiData(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
        int i = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UiDataMappersKt.WhenMappings.$EnumSwitchMapping$0[redeemType.ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemFlowTermsUiData(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_balance_terms_title, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_balance_terms_description);
        }
        if (i == 2) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemFlowTermsUiData(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_savings_terms_title, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_savings_terms_description);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemFlowTermsUiData(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_charity_terms_title, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_to_charity_terms);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType.DONATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
