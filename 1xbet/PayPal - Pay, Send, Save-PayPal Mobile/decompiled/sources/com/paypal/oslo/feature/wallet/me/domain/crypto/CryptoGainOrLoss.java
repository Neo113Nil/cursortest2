package com.paypal.oslo.feature.wallet.me.domain.crypto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "", "<init>", "(Ljava/lang/String;I)V", "GAIN", "LOSS", "NEITHER", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CryptoGainOrLoss {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss GAIN;
    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss LOSS;
    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss NEITHER;
    public static final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss[] getHighSpeedVideoSizes;

    private CryptoGainOrLoss(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss = new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss("GAIN", 0);
        GAIN = cryptoGainOrLoss;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss2 = new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss("LOSS", 1);
        LOSS = cryptoGainOrLoss2;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss3 = new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss("NEITHER", 2);
        NEITHER = cryptoGainOrLoss3;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss4 = new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss("UNKNOWN", 3);
        UNKNOWN = cryptoGainOrLoss4;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss[] cryptoGainOrLossArr = {cryptoGainOrLoss, cryptoGainOrLoss2, cryptoGainOrLoss3, cryptoGainOrLoss4};
        getHighSpeedVideoSizes = cryptoGainOrLossArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cryptoGainOrLossArr);
    }

    public static com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss[] values() {
        return (com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
