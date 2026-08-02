package com.paypal.oslo.feature.wallet.cards.domain.rewards.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardState;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "BLOCKED", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "ON_HOLD", "REMOVED", "NOT_CREATED", "CLOSED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardRewardState {
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState ACTIVE;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState BLOCKED;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState CLOSED;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState INACTIVE;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState NOT_CREATED;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState ON_HOLD;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState REMOVED;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private CardRewardState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = cardRewardState;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState2 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState("BLOCKED", 1);
        BLOCKED = cardRewardState2;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState3 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 2);
        INACTIVE = cardRewardState3;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState4 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState("ON_HOLD", 3);
        ON_HOLD = cardRewardState4;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState5 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState("REMOVED", 4);
        REMOVED = cardRewardState5;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState6 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState("NOT_CREATED", 5);
        NOT_CREATED = cardRewardState6;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState7 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState("CLOSED", 6);
        CLOSED = cardRewardState7;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState cardRewardState8 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState("UNKNOWN", 7);
        UNKNOWN = cardRewardState8;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState[] cardRewardStateArr = {cardRewardState, cardRewardState2, cardRewardState3, cardRewardState4, cardRewardState5, cardRewardState6, cardRewardState7, cardRewardState8};
        Camera2StreamConfigurationMap = cardRewardStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardRewardStateArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState[] values() {
        return (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
