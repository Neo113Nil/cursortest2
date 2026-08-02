package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

/* loaded from: classes15.dex */
public final class BulkUpdateFiViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> getHighSpeedVideoFpsRangesFor;

    private BulkUpdateFiViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel newInstance(com.paypal.oslo.feature.subscriptions.bulkfi.domain.usecase.GetConsumerAgreementsByFundingInstrumentUseCase getConsumerAgreementsByFundingInstrumentUseCase, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel(getConsumerAgreementsByFundingInstrumentUseCase, formatHelper, bulkUpdateFiNavigationCache);
    }
}
