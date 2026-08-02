package com.paypal.oslo.feature.subscriptions.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "BANK_SAVINGS", "BANK_CHECKING", "DEBIT_CARD", "CREDIT_CARD", "PAYPAL_CREDIT", "PAYPAL_BALANCE", "PAYPAL_DEBIT_CARD", "PREPAID_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentType {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType BANK_CHECKING;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType BANK_SAVINGS;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType CREDIT_CARD;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType DEBIT_CARD;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType PAYPAL_BALANCE;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType PAYPAL_CREDIT;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType PAYPAL_DEBIT_CARD;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType PREPAID_CARD;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType[] getHighSpeedVideoSizes;

    private FundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("BANK_SAVINGS", 0);
        BANK_SAVINGS = fundingInstrumentType;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType2 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("BANK_CHECKING", 1);
        BANK_CHECKING = fundingInstrumentType2;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType3 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("DEBIT_CARD", 2);
        DEBIT_CARD = fundingInstrumentType3;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType4 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("CREDIT_CARD", 3);
        CREDIT_CARD = fundingInstrumentType4;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType5 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("PAYPAL_CREDIT", 4);
        PAYPAL_CREDIT = fundingInstrumentType5;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType6 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("PAYPAL_BALANCE", 5);
        PAYPAL_BALANCE = fundingInstrumentType6;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType7 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("PAYPAL_DEBIT_CARD", 6);
        PAYPAL_DEBIT_CARD = fundingInstrumentType7;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType8 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("PREPAID_CARD", 7);
        PREPAID_CARD = fundingInstrumentType8;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType9 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType("UNKNOWN", 8);
        UNKNOWN = fundingInstrumentType9;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType[] fundingInstrumentTypeArr = {fundingInstrumentType, fundingInstrumentType2, fundingInstrumentType3, fundingInstrumentType4, fundingInstrumentType5, fundingInstrumentType6, fundingInstrumentType7, fundingInstrumentType8, fundingInstrumentType9};
        getHighSpeedVideoSizes = fundingInstrumentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentTypeArr);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
