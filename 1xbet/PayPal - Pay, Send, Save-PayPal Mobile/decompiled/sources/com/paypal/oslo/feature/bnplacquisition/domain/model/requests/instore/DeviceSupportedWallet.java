package com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceSupportedWallet;", "", "<init>", "(Ljava/lang/String;I)V", "APPLE_WALLET", "GOOGLE_WALLET", "PAYPAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceSupportedWallet {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet APPLE_WALLET;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet GOOGLE_WALLET;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet PAYPAL;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DeviceSupportedWallet(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet("APPLE_WALLET", 0);
        APPLE_WALLET = deviceSupportedWallet;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet("GOOGLE_WALLET", 1);
        GOOGLE_WALLET = deviceSupportedWallet2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet("PAYPAL", 2);
        PAYPAL = deviceSupportedWallet3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet[] deviceSupportedWalletArr = {deviceSupportedWallet, deviceSupportedWallet2, deviceSupportedWallet3};
        getHighResolutionOutputSizeshNQ4ISI = deviceSupportedWalletArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(deviceSupportedWalletArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
