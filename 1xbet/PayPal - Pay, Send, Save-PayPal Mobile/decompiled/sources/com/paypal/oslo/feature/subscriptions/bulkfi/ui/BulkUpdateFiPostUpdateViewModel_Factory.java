package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

/* loaded from: classes15.dex */
public final class BulkUpdateFiPostUpdateViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase> getHighSpeedVideoFpsRangesFor;

    private BulkUpdateFiPostUpdateViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase> provider2) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel newInstance(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.MergeBulkUpdateResultsUseCase mergeBulkUpdateResultsUseCase) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel(bulkUpdateFiNavigationCache, mergeBulkUpdateResultsUseCase);
    }
}
