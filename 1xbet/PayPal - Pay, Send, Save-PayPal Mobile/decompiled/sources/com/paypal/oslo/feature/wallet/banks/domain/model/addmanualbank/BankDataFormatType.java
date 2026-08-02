package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDataFormatType;", "", "<init>", "(Ljava/lang/String;I)V", "IBAN", "NORMAL", "WIRE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDataFormatType {
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType IBAN;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType NORMAL;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType WIRE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private BankDataFormatType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType bankDataFormatType = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType("IBAN", 0);
        IBAN = bankDataFormatType;
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType bankDataFormatType2 = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType("NORMAL", 1);
        NORMAL = bankDataFormatType2;
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType bankDataFormatType3 = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType("WIRE", 2);
        WIRE = bankDataFormatType3;
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType bankDataFormatType4 = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType("UNKNOWN", 3);
        UNKNOWN = bankDataFormatType4;
        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType[] bankDataFormatTypeArr = {bankDataFormatType, bankDataFormatType2, bankDataFormatType3, bankDataFormatType4};
        Camera2StreamConfigurationMap = bankDataFormatTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(bankDataFormatTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
