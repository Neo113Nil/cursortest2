package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

/* loaded from: classes12.dex */
public final class CryptoProvisioningFlowRouter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;

    private CryptoProvisioningFlowRouter_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter newInstance(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter(featureGateManager);
    }
}
