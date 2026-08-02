package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoGainOrLossStatusUi;", "", "<init>", "(Ljava/lang/String;I)V", "GAIN", "LOSS", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoGainOrLossStatusUi {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi GAIN;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi LOSS;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi NONE;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private CryptoGainOrLossStatusUi(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi cryptoGainOrLossStatusUi = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi("GAIN", 0);
        GAIN = cryptoGainOrLossStatusUi;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi cryptoGainOrLossStatusUi2 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi("LOSS", 1);
        LOSS = cryptoGainOrLossStatusUi2;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi cryptoGainOrLossStatusUi3 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi("NONE", 2);
        NONE = cryptoGainOrLossStatusUi3;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi[] cryptoGainOrLossStatusUiArr = {cryptoGainOrLossStatusUi, cryptoGainOrLossStatusUi2, cryptoGainOrLossStatusUi3};
        getHighResolutionOutputSizeshNQ4ISI = cryptoGainOrLossStatusUiArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cryptoGainOrLossStatusUiArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoGainOrLossStatusUi> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
