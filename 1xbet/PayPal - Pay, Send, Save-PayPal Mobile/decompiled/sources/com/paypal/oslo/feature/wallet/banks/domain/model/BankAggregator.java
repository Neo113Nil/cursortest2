package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "", "<init>", "(Ljava/lang/String;I)V", "PLAID", "FINICITY", "YODLEE_FASTLINK", "TINK", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankAggregator {
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator FINICITY;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator PLAID;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator TINK;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator YODLEE_FASTLINK;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BankAggregator(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator("PLAID", 0);
        PLAID = bankAggregator;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator2 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator("FINICITY", 1);
        FINICITY = bankAggregator2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator3 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator("YODLEE_FASTLINK", 2);
        YODLEE_FASTLINK = bankAggregator3;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator4 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator("TINK", 3);
        TINK = bankAggregator4;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator5 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator("UNKNOWN", 4);
        UNKNOWN = bankAggregator5;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator[] bankAggregatorArr = {bankAggregator, bankAggregator2, bankAggregator3, bankAggregator4, bankAggregator5};
        Camera2StreamConfigurationMap = bankAggregatorArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(bankAggregatorArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
