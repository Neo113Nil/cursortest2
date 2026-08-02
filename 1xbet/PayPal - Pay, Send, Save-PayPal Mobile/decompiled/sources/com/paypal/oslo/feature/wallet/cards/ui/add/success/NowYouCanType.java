package com.paypal.oslo.feature.wallet.cards.ui.add.success;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/NowYouCanType;", "", "<init>", "(Ljava/lang/String;I)V", "CREDIT_CARD_REWARDS_AUTO", "CREDIT_CARD_REWARDS", "BANK_SAVINGS", "DEBIT_CARD", "DEBIT_CARD_VISA", "DEBIT_CARD_MASTERCARD", "BANK_CHECKING", "DEFAULT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NowYouCanType {
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType BANK_CHECKING;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType BANK_SAVINGS;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType CREDIT_CARD_REWARDS;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType CREDIT_CARD_REWARDS_AUTO;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType DEBIT_CARD;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType DEBIT_CARD_MASTERCARD;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType DEBIT_CARD_VISA;
    public static final com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType DEFAULT;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private NowYouCanType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("CREDIT_CARD_REWARDS_AUTO", 0);
        CREDIT_CARD_REWARDS_AUTO = nowYouCanType;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType2 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("CREDIT_CARD_REWARDS", 1);
        CREDIT_CARD_REWARDS = nowYouCanType2;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType3 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("BANK_SAVINGS", 2);
        BANK_SAVINGS = nowYouCanType3;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType4 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("DEBIT_CARD", 3);
        DEBIT_CARD = nowYouCanType4;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType5 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("DEBIT_CARD_VISA", 4);
        DEBIT_CARD_VISA = nowYouCanType5;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType6 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("DEBIT_CARD_MASTERCARD", 5);
        DEBIT_CARD_MASTERCARD = nowYouCanType6;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType7 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("BANK_CHECKING", 6);
        BANK_CHECKING = nowYouCanType7;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType nowYouCanType8 = new com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType("DEFAULT", 7);
        DEFAULT = nowYouCanType8;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType[] nowYouCanTypeArr = {nowYouCanType, nowYouCanType2, nowYouCanType3, nowYouCanType4, nowYouCanType5, nowYouCanType6, nowYouCanType7, nowYouCanType8};
        getHighSpeedVideoFpsRangesFor = nowYouCanTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(nowYouCanTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType[] values() {
        return (com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
