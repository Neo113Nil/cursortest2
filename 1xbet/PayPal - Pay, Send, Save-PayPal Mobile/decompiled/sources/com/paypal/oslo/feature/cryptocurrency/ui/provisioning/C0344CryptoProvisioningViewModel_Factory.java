package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0344CryptoProvisioningViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter> getHighSpeedVideoSizes;

    private C0344CryptoProvisioningViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0344CryptoProvisioningViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.C0344CryptoProvisioningViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter cryptoProvisioningFlowRouter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningViewModel(str, cryptoProvisioningFlowRouter);
    }
}
