package com.paypal.oslo.feature.wallet.cards.domain.rewards.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardStateReason;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE_DUE_TO_EXPIRY", "INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE", "INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE", "NEARING_EXPIRY", "NOT_APPLICABLE", "INACTIVE_DUE_TO_UNENROLL", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardRewardStateReason {
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason INACTIVE_DUE_TO_EXPIRY;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason INACTIVE_DUE_TO_UNENROLL;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason NEARING_EXPIRY;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason NOT_APPLICABLE;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason[] getHighSpeedVideoSizes;

    private CardRewardStateReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason("INACTIVE_DUE_TO_EXPIRY", 0);
        INACTIVE_DUE_TO_EXPIRY = cardRewardStateReason;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason2 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason("INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE", 1);
        INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE = cardRewardStateReason2;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason3 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason("INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE", 2);
        INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE = cardRewardStateReason3;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason4 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason("NEARING_EXPIRY", 3);
        NEARING_EXPIRY = cardRewardStateReason4;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason5 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason("NOT_APPLICABLE", 4);
        NOT_APPLICABLE = cardRewardStateReason5;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason6 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason("INACTIVE_DUE_TO_UNENROLL", 5);
        INACTIVE_DUE_TO_UNENROLL = cardRewardStateReason6;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason cardRewardStateReason7 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason("UNKNOWN", 6);
        UNKNOWN = cardRewardStateReason7;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason[] cardRewardStateReasonArr = {cardRewardStateReason, cardRewardStateReason2, cardRewardStateReason3, cardRewardStateReason4, cardRewardStateReason5, cardRewardStateReason6, cardRewardStateReason7};
        getHighSpeedVideoSizes = cardRewardStateReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardRewardStateReasonArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason[] values() {
        return (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardStateReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
