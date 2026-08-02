package com.paypal.oslo.feature.starpay.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/WalletStatus;", "", "<init>", "(Ljava/lang/String;I)V", "READY", "NEEDS_SETUP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WalletStatus {
    public static final com.paypal.oslo.feature.starpay.api.WalletStatus NEEDS_SETUP;
    public static final com.paypal.oslo.feature.starpay.api.WalletStatus READY;
    private static final /* synthetic */ com.paypal.oslo.feature.starpay.api.WalletStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private WalletStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.starpay.api.WalletStatus walletStatus = new com.paypal.oslo.feature.starpay.api.WalletStatus("READY", 0);
        READY = walletStatus;
        com.paypal.oslo.feature.starpay.api.WalletStatus walletStatus2 = new com.paypal.oslo.feature.starpay.api.WalletStatus("NEEDS_SETUP", 1);
        NEEDS_SETUP = walletStatus2;
        com.paypal.oslo.feature.starpay.api.WalletStatus[] walletStatusArr = {walletStatus, walletStatus2};
        getHighResolutionOutputSizeshNQ4ISI = walletStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(walletStatusArr);
    }

    public static com.paypal.oslo.feature.starpay.api.WalletStatus[] values() {
        return (com.paypal.oslo.feature.starpay.api.WalletStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.starpay.api.WalletStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.starpay.api.WalletStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.starpay.api.WalletStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.starpay.api.WalletStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
