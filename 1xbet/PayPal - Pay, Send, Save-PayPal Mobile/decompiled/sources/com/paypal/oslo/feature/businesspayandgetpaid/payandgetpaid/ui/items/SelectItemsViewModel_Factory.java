package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items;

/* loaded from: classes11.dex */
public final class SelectItemsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private SelectItemsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel newInstance(com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase refreshBusinessInventoryItemsUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel(refreshBusinessInventoryItemsUseCase, userStore);
    }
}
