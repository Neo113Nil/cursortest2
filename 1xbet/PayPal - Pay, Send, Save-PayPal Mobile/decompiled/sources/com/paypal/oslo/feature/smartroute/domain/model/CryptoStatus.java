package com.paypal.oslo.feature.smartroute.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/model/CryptoStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPTED_IN", "OPTED_OUT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CryptoStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus OPTED_IN;
    public static final com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus OPTED_OUT;
    public static final com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus[] getHighSpeedVideoFpsRanges;

    private CryptoStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus = new com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus("OPTED_IN", 0);
        OPTED_IN = cryptoStatus;
        com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus2 = new com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus("OPTED_OUT", 1);
        OPTED_OUT = cryptoStatus2;
        com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus cryptoStatus3 = new com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus("UNKNOWN", 2);
        UNKNOWN = cryptoStatus3;
        com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus[] cryptoStatusArr = {cryptoStatus, cryptoStatus2, cryptoStatus3};
        getHighSpeedVideoFpsRanges = cryptoStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cryptoStatusArr);
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus[] values() {
        return (com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
