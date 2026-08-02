package com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel;

/* loaded from: classes12.dex */
public final class AddressSelectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase> getHighSpeedVideoFpsRangesFor;

    private AddressSelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder> provider4) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel newInstance(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.mvi.AddressSelectionReducer addressSelectionReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesUseCase getAddressesUseCase, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase saveAddressUseCase, com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.viewmodel.AddressSelectionViewModel(addressSelectionReducer, getAddressesUseCase, saveAddressUseCase, debitCardWebViewUrlBuilder);
    }
}
