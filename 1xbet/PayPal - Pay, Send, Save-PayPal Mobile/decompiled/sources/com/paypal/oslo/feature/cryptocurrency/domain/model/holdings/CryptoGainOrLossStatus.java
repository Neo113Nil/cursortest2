package com.paypal.oslo.feature.cryptocurrency.domain.model.holdings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "", "<init>", "(Ljava/lang/String;I)V", "GAIN", "LOSS", "CONSTANT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoGainOrLossStatus {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus CONSTANT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus GAIN;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus LOSS;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus[] getHighSpeedVideoFpsRangesFor;

    private CryptoGainOrLossStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus = new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus("GAIN", 0);
        GAIN = cryptoGainOrLossStatus;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus("LOSS", 1);
        LOSS = cryptoGainOrLossStatus2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus("CONSTANT", 2);
        CONSTANT = cryptoGainOrLossStatus3;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus[] cryptoGainOrLossStatusArr = {cryptoGainOrLossStatus, cryptoGainOrLossStatus2, cryptoGainOrLossStatus3};
        getHighSpeedVideoFpsRangesFor = cryptoGainOrLossStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cryptoGainOrLossStatusArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
