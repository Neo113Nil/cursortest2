package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

/* loaded from: classes12.dex */
public final class CryptoEopProvisioningViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0343CryptoEopProvisioningViewModel_Factory getHighSpeedVideoFpsRanges;

    private CryptoEopProvisioningViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0343CryptoEopProvisioningViewModel_Factory c0343CryptoEopProvisioningViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0343CryptoEopProvisioningViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0343CryptoEopProvisioningViewModel_Factory c0343CryptoEopProvisioningViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel_Factory_Impl(c0343CryptoEopProvisioningViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0343CryptoEopProvisioningViewModel_Factory c0343CryptoEopProvisioningViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel_Factory_Impl(c0343CryptoEopProvisioningViewModel_Factory));
    }
}
