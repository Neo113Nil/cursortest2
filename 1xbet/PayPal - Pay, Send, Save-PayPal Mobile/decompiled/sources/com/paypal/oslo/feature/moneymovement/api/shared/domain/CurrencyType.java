package com.paypal.oslo.feature.moneymovement.api.shared.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyType;", "", "<init>", "(Ljava/lang/String;I)V", "CASH", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyType {
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType CASH;
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType CRYPTO;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType[] getHighSpeedVideoFpsRanges;

    private CurrencyType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType = new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType("CASH", 0);
        CASH = currencyType;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType currencyType2 = new com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 1);
        CRYPTO = currencyType2;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType[] currencyTypeArr = {currencyType, currencyType2};
        getHighSpeedVideoFpsRanges = currencyTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(currencyTypeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
