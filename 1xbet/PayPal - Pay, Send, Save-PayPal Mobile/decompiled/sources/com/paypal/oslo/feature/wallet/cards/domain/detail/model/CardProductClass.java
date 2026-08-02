package com.paypal.oslo.feature.wallet.cards.domain.detail.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardProductClass;", "", "<init>", "(Ljava/lang/String;I)V", "CREDIT", "DEBIT", "GIFT", "MIXED", "PAYPAL_PREPAID", "PREPAID", "TOKENIZED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardProductClass {
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass CREDIT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass DEBIT;
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass GIFT;
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass MIXED;
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass PAYPAL_PREPAID;
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass PREPAID;
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass TOKENIZED;
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass[] getHighResolutionOutputSizeshNQ4ISI;

    private CardProductClass(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("CREDIT", 0);
        CREDIT = cardProductClass;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass2 = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("DEBIT", 1);
        DEBIT = cardProductClass2;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass3 = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("GIFT", 2);
        GIFT = cardProductClass3;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass4 = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("MIXED", 3);
        MIXED = cardProductClass4;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass5 = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("PAYPAL_PREPAID", 4);
        PAYPAL_PREPAID = cardProductClass5;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass6 = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("PREPAID", 5);
        PREPAID = cardProductClass6;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass7 = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("TOKENIZED", 6);
        TOKENIZED = cardProductClass7;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass cardProductClass8 = new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass("UNKNOWN", 7);
        UNKNOWN = cardProductClass8;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass[] cardProductClassArr = {cardProductClass, cardProductClass2, cardProductClass3, cardProductClass4, cardProductClass5, cardProductClass6, cardProductClass7, cardProductClass8};
        getHighResolutionOutputSizeshNQ4ISI = cardProductClassArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cardProductClassArr);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass[] values() {
        return (com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
