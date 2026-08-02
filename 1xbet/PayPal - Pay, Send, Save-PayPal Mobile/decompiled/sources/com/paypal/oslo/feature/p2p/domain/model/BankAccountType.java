package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "SAVINGS", "BUSINESS_CHECKING", "BUSINESS_SAVINGS", "CUSTOM", "NORMAL", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankAccountType {
    public static final com.paypal.oslo.feature.p2p.domain.model.BankAccountType BUSINESS_CHECKING;
    public static final com.paypal.oslo.feature.p2p.domain.model.BankAccountType BUSINESS_SAVINGS;
    public static final com.paypal.oslo.feature.p2p.domain.model.BankAccountType CHECKING;
    public static final com.paypal.oslo.feature.p2p.domain.model.BankAccountType CUSTOM;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.domain.model.BankAccountType NORMAL;
    public static final com.paypal.oslo.feature.p2p.domain.model.BankAccountType SAVINGS;
    public static final com.paypal.oslo.feature.p2p.domain.model.BankAccountType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.BankAccountType[] getHighResolutionOutputSizeshNQ4ISI;

    private BankAccountType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType = new com.paypal.oslo.feature.p2p.domain.model.BankAccountType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 0);
        CHECKING = bankAccountType;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType2 = new com.paypal.oslo.feature.p2p.domain.model.BankAccountType("SAVINGS", 1);
        SAVINGS = bankAccountType2;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType3 = new com.paypal.oslo.feature.p2p.domain.model.BankAccountType("BUSINESS_CHECKING", 2);
        BUSINESS_CHECKING = bankAccountType3;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType4 = new com.paypal.oslo.feature.p2p.domain.model.BankAccountType("BUSINESS_SAVINGS", 3);
        BUSINESS_SAVINGS = bankAccountType4;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType5 = new com.paypal.oslo.feature.p2p.domain.model.BankAccountType("CUSTOM", 4);
        CUSTOM = bankAccountType5;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType6 = new com.paypal.oslo.feature.p2p.domain.model.BankAccountType("NORMAL", 5);
        NORMAL = bankAccountType6;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType7 = new com.paypal.oslo.feature.p2p.domain.model.BankAccountType("UNKNOWN", 6);
        UNKNOWN = bankAccountType7;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType[] bankAccountTypeArr = {bankAccountType, bankAccountType2, bankAccountType3, bankAccountType4, bankAccountType5, bankAccountType6, bankAccountType7};
        getHighResolutionOutputSizeshNQ4ISI = bankAccountTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.BankAccountType[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.BankAccountType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.BankAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.BankAccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.BankAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.BankAccountType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
