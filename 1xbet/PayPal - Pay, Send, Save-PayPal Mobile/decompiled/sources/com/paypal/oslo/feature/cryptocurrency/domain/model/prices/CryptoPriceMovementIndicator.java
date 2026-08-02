package com.paypal.oslo.feature.cryptocurrency.domain.model.prices;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "CONSTANT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoPriceMovementIndicator {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator CONSTANT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator DOWN;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator UP;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator[] getHighResolutionOutputSizeshNQ4ISI;

    private CryptoPriceMovementIndicator(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator("UP", 0);
        UP = cryptoPriceMovementIndicator;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator("DOWN", 1);
        DOWN = cryptoPriceMovementIndicator2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator("CONSTANT", 2);
        CONSTANT = cryptoPriceMovementIndicator3;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator[] cryptoPriceMovementIndicatorArr = {cryptoPriceMovementIndicator, cryptoPriceMovementIndicator2, cryptoPriceMovementIndicator3};
        getHighResolutionOutputSizeshNQ4ISI = cryptoPriceMovementIndicatorArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cryptoPriceMovementIndicatorArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
