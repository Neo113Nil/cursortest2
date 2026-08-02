package com.paypal.oslo.feature.wallet.cards.domain.rewards.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/rewards/model/CardRewardRoundingMode;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "CEILING", "FLOOR", "HALF_UP", "HALF_DOWN", "HALF_EVEN", "UNNECESSARY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardRewardRoundingMode {
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode CEILING;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode DOWN;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode FLOOR;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode HALF_DOWN;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode HALF_EVEN;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode HALF_UP;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode UNNECESSARY;
    public static final com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode UP;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private CardRewardRoundingMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("UP", 0);
        UP = cardRewardRoundingMode;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode2 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("DOWN", 1);
        DOWN = cardRewardRoundingMode2;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode3 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("CEILING", 2);
        CEILING = cardRewardRoundingMode3;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode4 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("FLOOR", 3);
        FLOOR = cardRewardRoundingMode4;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode5 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("HALF_UP", 4);
        HALF_UP = cardRewardRoundingMode5;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode6 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("HALF_DOWN", 5);
        HALF_DOWN = cardRewardRoundingMode6;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode7 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("HALF_EVEN", 6);
        HALF_EVEN = cardRewardRoundingMode7;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode8 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("UNNECESSARY", 7);
        UNNECESSARY = cardRewardRoundingMode8;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode cardRewardRoundingMode9 = new com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode("UNKNOWN", 8);
        UNKNOWN = cardRewardRoundingMode9;
        com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode[] cardRewardRoundingModeArr = {cardRewardRoundingMode, cardRewardRoundingMode2, cardRewardRoundingMode3, cardRewardRoundingMode4, cardRewardRoundingMode5, cardRewardRoundingMode6, cardRewardRoundingMode7, cardRewardRoundingMode8, cardRewardRoundingMode9};
        Camera2StreamConfigurationMap = cardRewardRoundingModeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cardRewardRoundingModeArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode[] values() {
        return (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.rewards.model.CardRewardRoundingMode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
