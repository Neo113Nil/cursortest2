package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_MODE", "LITE_MODE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OpenBankingAggregatorOperationMode {
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode FULL_MODE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode LITE_MODE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private OpenBankingAggregatorOperationMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode = new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode("FULL_MODE", 0);
        FULL_MODE = openBankingAggregatorOperationMode;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode2 = new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode("LITE_MODE", 1);
        LITE_MODE = openBankingAggregatorOperationMode2;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode3 = new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode("UNKNOWN", 2);
        UNKNOWN = openBankingAggregatorOperationMode3;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode[] openBankingAggregatorOperationModeArr = {openBankingAggregatorOperationMode, openBankingAggregatorOperationMode2, openBankingAggregatorOperationMode3};
        getHighResolutionOutputSizeshNQ4ISI = openBankingAggregatorOperationModeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(openBankingAggregatorOperationModeArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
