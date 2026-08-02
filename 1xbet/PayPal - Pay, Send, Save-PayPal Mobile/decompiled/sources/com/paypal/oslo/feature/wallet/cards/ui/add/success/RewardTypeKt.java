package com.paypal.oslo.feature.wallet.cards.ui.add.success;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardType;", "", "", "args", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardSectionState;", "toRewardSectionState", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardType;[Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardSectionState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardTypeKt {
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardSectionState toRewardSectionState(com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType rewardType, java.lang.Object... objArr) {
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        int i = com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardTypeKt.WhenMappings.$EnumSwitchMapping$0[rewardType.ordinal()];
        if (i == 1) {
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_points_title, new java.lang.Object[0]);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_miles_title, new java.lang.Object[0]);
        }
        com.paypal.oslo.core.commonui.utils.RefText refText = stringResourceRef;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        int i2 = com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardTypeKt.WhenMappings.$EnumSwitchMapping$0[rewardType.ordinal()];
        if (i2 == 1) {
            stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_points_description, java.util.Arrays.copyOf(copyOf, copyOf.length));
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_miles_description, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        return new com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardSectionState(refText, kotlin.collections.CollectionsKt.listOf(stringResourceRef2), com.paypal.pds.core.Icon.Trophy.INSTANCE, false, null, 16, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType.POINTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardType.MILES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
