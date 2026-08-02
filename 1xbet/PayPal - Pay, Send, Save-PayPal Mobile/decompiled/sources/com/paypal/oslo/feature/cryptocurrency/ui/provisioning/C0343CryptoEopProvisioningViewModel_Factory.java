package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0343CryptoEopProvisioningViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls> Camera2StreamConfigurationMap;

    private C0343CryptoEopProvisioningViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel get(java.lang.String str) {
        return newInstance(str, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0343CryptoEopProvisioningViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0343CryptoEopProvisioningViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningUrls cryptoEopProvisioningUrls) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel(str, cryptoEopProvisioningUrls);
    }
}
