package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

/* loaded from: classes12.dex */
public final class CryptoProvisioningViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0344CryptoProvisioningViewModel_Factory Camera2StreamConfigurationMap;

    private CryptoProvisioningViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0344CryptoProvisioningViewModel_Factory c0344CryptoProvisioningViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0344CryptoProvisioningViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel create(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0344CryptoProvisioningViewModel_Factory c0344CryptoProvisioningViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel_Factory_Impl(c0344CryptoProvisioningViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0344CryptoProvisioningViewModel_Factory c0344CryptoProvisioningViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel_Factory_Impl(c0344CryptoProvisioningViewModel_Factory));
    }
}
