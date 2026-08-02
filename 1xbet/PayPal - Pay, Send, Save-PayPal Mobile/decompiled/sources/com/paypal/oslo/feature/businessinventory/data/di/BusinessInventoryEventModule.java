package com.paypal.oslo.feature.businessinventory.data.di;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/data/di/BusinessInventoryEventModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "provideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodRelease", "()Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "Lcom/paypal/oslo/feature/businessinventory/data/repository/ItemLibraryMockNetworkDataSource;", "provideItemLibraryMockDataSource$business_inventory_prodRelease", "()Lcom/paypal/oslo/feature/businessinventory/data/repository/ItemLibraryMockNetworkDataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes11.dex */
public final class BusinessInventoryEventModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule INSTANCE = new com.paypal.oslo.feature.businessinventory.data.di.BusinessInventoryEventModule();

    private BusinessInventoryEventModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus provideBusinessInventoryUpdatesEventBusImpl$business_inventory_prodRelease() {
        return com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryUpdatesEventBusImpl.INSTANCE;
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource provideItemLibraryMockDataSource$business_inventory_prodRelease() {
        return com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl.INSTANCE;
    }
}
