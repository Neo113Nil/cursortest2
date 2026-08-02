package com.paypal.oslo.feature.subscriptions.updatefi.ui;

/* renamed from: com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0436UpdateFiViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase> getHighSpeedVideoSizes;

    private C0436UpdateFiViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider4, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    public final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel get(java.util.List<java.lang.String> list, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> map, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource updateFiSource) {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), list, agreementType, map, str, updateFiSource);
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.ui.C0436UpdateFiViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider4, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper> provider5) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.ui.C0436UpdateFiViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel newInstance(com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase getFundingInstrumentsUseCase, com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase getUserCountryCodeUseCase, com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase updatePreferredFundingInstrumentUseCase, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, java.util.List<java.lang.String> list, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> map, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource updateFiSource) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel(getFundingInstrumentsUseCase, getUserCountryCodeUseCase, updatePreferredFundingInstrumentUseCase, bulkUpdateFiNavigationCache, formatHelper, list, agreementType, map, str, updateFiSource);
    }
}
