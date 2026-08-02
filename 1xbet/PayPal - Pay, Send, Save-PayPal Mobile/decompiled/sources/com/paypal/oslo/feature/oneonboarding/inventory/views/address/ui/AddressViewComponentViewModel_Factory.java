package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

/* loaded from: classes13.dex */
public final class AddressViewComponentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> getHighSpeedVideoSizes;

    private AddressViewComponentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider3) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase validateAddressUseCase) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel(formatAddressUseCase, getAddressLayoutUseCase, validateAddressUseCase);
    }
}
