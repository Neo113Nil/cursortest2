package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletProvider;", "", "<init>", "(Ljava/lang/String;I)V", "GOOGLE_PAY", "SAMSUNG_PAY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WalletProvider {
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider GOOGLE_PAY;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider SAMSUNG_PAY;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider[] getHighSpeedVideoSizes;

    private WalletProvider(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider walletProvider = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider("GOOGLE_PAY", 0);
        GOOGLE_PAY = walletProvider;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider walletProvider2 = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider("SAMSUNG_PAY", 1);
        SAMSUNG_PAY = walletProvider2;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider walletProvider3 = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider("UNKNOWN", 2);
        UNKNOWN = walletProvider3;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider[] walletProviderArr = {walletProvider, walletProvider2, walletProvider3};
        getHighSpeedVideoSizes = walletProviderArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(walletProviderArr);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider[] values() {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletProvider> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
