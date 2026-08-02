package com.paypal.oslo.feature.businessinventory.ui.itemslist;

/* loaded from: classes11.dex */
public final class BusinessInventoryItemsListViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase> getHighSpeedVideoSizes;

    private BusinessInventoryItemsListViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase> provider3) {
        return new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel newInstance(com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase getBusinessInventoryItemsListUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase getBusinessInventoryUpdatesUseCase, com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase refreshBusinessInventoryItemsUseCase) {
        return new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel(getBusinessInventoryItemsListUseCase, getBusinessInventoryUpdatesUseCase, refreshBusinessInventoryItemsUseCase);
    }
}
