package com.paypal.oslo.feature.wallet.cards.ui.add.success;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/NowYouCanType;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardSectionState;", "toRewardSectionState", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/NowYouCanType;)Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/RewardSectionState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NowYouCanTypeKt {
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardSectionState toRewardSectionState(com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType) {
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nowYouCanType, "");
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_now_you_can, new java.lang.Object[0]);
        switch (com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanTypeKt.WhenMappings.$EnumSwitchMapping$0[nowYouCanType.ordinal()]) {
            case 1:
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.commonui.utils.RefText[]{com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_earn_credit, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_use_your, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_set, new java.lang.Object[0])});
                break;
            case 2:
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.commonui.utils.RefText[]{com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_shop, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_earn_credit, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_set, new java.lang.Object[0])});
                break;
            case 3:
            case 4:
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.commonui.utils.RefText[]{com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_add, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_set_direct, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_send, new java.lang.Object[0])});
                break;
            case 5:
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.commonui.utils.RefText[]{com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_shop, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_set_bill, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_send_money, new java.lang.Object[0])});
                break;
            case 6:
            case 7:
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.commonui.utils.RefText[]{com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_buy, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_add_fast, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_set, new java.lang.Object[0])});
                break;
            case 8:
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.commonui.utils.RefText[]{com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_add, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_shop_securely, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reward_nyc_send, new java.lang.Object[0])});
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardSectionState(stringResourceRef, listOf, com.paypal.pds.core.Icon.Star.INSTANCE, false, null, 16, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.CREDIT_CARD_REWARDS_AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.CREDIT_CARD_REWARDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.BANK_SAVINGS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.BANK_CHECKING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.DEBIT_CARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.DEBIT_CARD_VISA.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.DEBIT_CARD_MASTERCARD.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.DEFAULT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
