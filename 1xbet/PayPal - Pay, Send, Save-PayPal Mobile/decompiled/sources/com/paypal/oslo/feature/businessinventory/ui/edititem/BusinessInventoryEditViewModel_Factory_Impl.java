package com.paypal.oslo.feature.businessinventory.ui.edititem;

/* loaded from: classes11.dex */
public final class BusinessInventoryEditViewModel_Factory_Impl implements com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory {
    private final com.paypal.oslo.feature.businessinventory.ui.edititem.C0320BusinessInventoryEditViewModel_Factory Camera2StreamConfigurationMap;

    private BusinessInventoryEditViewModel_Factory_Impl(com.paypal.oslo.feature.businessinventory.ui.edititem.C0320BusinessInventoryEditViewModel_Factory c0320BusinessInventoryEditViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0320BusinessInventoryEditViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory
    public final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel create(com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType) {
        return this.Camera2StreamConfigurationMap.get(flowType);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory> create(com.paypal.oslo.feature.businessinventory.ui.edititem.C0320BusinessInventoryEditViewModel_Factory c0320BusinessInventoryEditViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel_Factory_Impl(c0320BusinessInventoryEditViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businessinventory.ui.edititem.C0320BusinessInventoryEditViewModel_Factory c0320BusinessInventoryEditViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel_Factory_Impl(c0320BusinessInventoryEditViewModel_Factory));
    }
}
