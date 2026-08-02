package com.paypal.oslo.feature.qrc.domain.model.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/CreditAccountType;", "", "<init>", "(Ljava/lang/String;I)V", "BUYER_CREDIT_VIRTUAL_LINE", "CLOSE_ENDED", "DUAL_CARD_EBAY", "DUAL_CARD_PLUS", "OPEN_ENDED", "TXN_CARD_BML", "TXN_CARD_PAY_LATER", "GENERIC_CREDIT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditAccountType {
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType BUYER_CREDIT_VIRTUAL_LINE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType CLOSE_ENDED;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType DUAL_CARD_EBAY;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType DUAL_CARD_PLUS;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType GENERIC_CREDIT;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType OPEN_ENDED;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType TXN_CARD_BML;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType TXN_CARD_PAY_LATER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType[] getHighSpeedVideoFpsRangesFor;

    private CreditAccountType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("BUYER_CREDIT_VIRTUAL_LINE", 0);
        BUYER_CREDIT_VIRTUAL_LINE = creditAccountType;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType2 = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("CLOSE_ENDED", 1);
        CLOSE_ENDED = creditAccountType2;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType3 = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("DUAL_CARD_EBAY", 2);
        DUAL_CARD_EBAY = creditAccountType3;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType4 = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("DUAL_CARD_PLUS", 3);
        DUAL_CARD_PLUS = creditAccountType4;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType5 = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("OPEN_ENDED", 4);
        OPEN_ENDED = creditAccountType5;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType6 = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("TXN_CARD_BML", 5);
        TXN_CARD_BML = creditAccountType6;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType7 = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("TXN_CARD_PAY_LATER", 6);
        TXN_CARD_PAY_LATER = creditAccountType7;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType creditAccountType8 = new com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType("GENERIC_CREDIT", 7);
        GENERIC_CREDIT = creditAccountType8;
        com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType[] creditAccountTypeArr = {creditAccountType, creditAccountType2, creditAccountType3, creditAccountType4, creditAccountType5, creditAccountType6, creditAccountType7, creditAccountType8};
        getHighSpeedVideoFpsRangesFor = creditAccountTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(creditAccountTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.review.CreditAccountType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
