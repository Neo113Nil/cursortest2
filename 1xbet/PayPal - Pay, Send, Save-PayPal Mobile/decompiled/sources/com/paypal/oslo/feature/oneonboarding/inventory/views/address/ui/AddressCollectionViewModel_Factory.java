package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

/* loaded from: classes13.dex */
public final class AddressCollectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase> getHighSpeedVideoSizes;

    private AddressCollectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider4) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel newInstance(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.AddressSuggestionsUseCase addressSuggestionsUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.usecase.VerifyAddressUseCase verifyAddressUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel(addressSuggestionsUseCase, getAddressLayoutUseCase, verifyAddressUseCase, formatAddressUseCase);
    }
}
