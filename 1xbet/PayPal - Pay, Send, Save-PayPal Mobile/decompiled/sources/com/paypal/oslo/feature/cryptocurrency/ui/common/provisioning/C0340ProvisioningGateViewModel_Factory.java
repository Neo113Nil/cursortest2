package com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0340ProvisioningGateViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> Camera2StreamConfigurationMap;

    private C0340ProvisioningGateViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability) {
        return newInstance(this.Camera2StreamConfigurationMap.get(), flowCapability);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.C0340ProvisioningGateViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.C0340ProvisioningGateViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel(cryptocurrencyProvisioningCoordinator, flowCapability);
    }
}
