package com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning;

/* loaded from: classes12.dex */
public final class ProvisioningGateViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.C0340ProvisioningGateViewModel_Factory Camera2StreamConfigurationMap;

    private ProvisioningGateViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.C0340ProvisioningGateViewModel_Factory c0340ProvisioningGateViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0340ProvisioningGateViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel create(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability) {
        return this.Camera2StreamConfigurationMap.get(flowCapability);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.C0340ProvisioningGateViewModel_Factory c0340ProvisioningGateViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel_Factory_Impl(c0340ProvisioningGateViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.C0340ProvisioningGateViewModel_Factory c0340ProvisioningGateViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel_Factory_Impl(c0340ProvisioningGateViewModel_Factory));
    }
}
