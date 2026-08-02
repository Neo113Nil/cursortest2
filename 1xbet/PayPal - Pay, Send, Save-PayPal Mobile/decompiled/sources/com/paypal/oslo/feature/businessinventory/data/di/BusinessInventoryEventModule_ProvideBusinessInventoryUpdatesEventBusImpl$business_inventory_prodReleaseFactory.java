package com.paypal.oslo.feature.businessinventory.data.di;

/* loaded from: classes11.dex */
public final class BusinessInventoryEventModule_ProvideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus get() {
        return provideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodRelease();
    }

    public static com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodReleaseFactory create() {
        return com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodReleaseFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus provideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodRelease() {
        return (com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule.INSTANCE.provideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodRelease());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodReleaseFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodReleaseFactory();

        private InstanceHolder() {
        }
    }
}
