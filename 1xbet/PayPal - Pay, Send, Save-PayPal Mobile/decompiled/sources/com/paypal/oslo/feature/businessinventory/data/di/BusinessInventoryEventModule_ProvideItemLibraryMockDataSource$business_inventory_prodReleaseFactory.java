package com.paypal.oslo.feature.businessinventory.data.di;

/* loaded from: classes11.dex */
public final class BusinessInventoryEventModule_ProvideItemLibraryMockDataSource$business_inventory_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource get() {
        return provideItemLibraryMockDataSource$business_inventory_prodRelease();
    }

    public static com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideItemLibraryMockDataSource$business_inventory_prodReleaseFactory create() {
        return com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideItemLibraryMockDataSource$business_inventory_prodReleaseFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource provideItemLibraryMockDataSource$business_inventory_prodRelease() {
        return (com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule.INSTANCE.provideItemLibraryMockDataSource$business_inventory_prodRelease());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideItemLibraryMockDataSource$business_inventory_prodReleaseFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule_ProvideItemLibraryMockDataSource$business_inventory_prodReleaseFactory();

        private InstanceHolder() {
        }
    }
}
