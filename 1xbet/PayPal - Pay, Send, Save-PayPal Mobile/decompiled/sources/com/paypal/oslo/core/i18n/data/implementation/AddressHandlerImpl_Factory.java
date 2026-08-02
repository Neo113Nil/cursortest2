package com.paypal.oslo.core.i18n.data.implementation;

/* loaded from: classes10.dex */
public final class AddressHandlerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.implementation.AddressHandlerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> getHighSpeedVideoSizes;

    private AddressHandlerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.implementation.AddressHandlerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.data.implementation.AddressHandlerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider3) {
        return new com.paypal.oslo.core.i18n.data.implementation.AddressHandlerImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.data.implementation.AddressHandlerImpl newInstance(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase validateAddressUseCase) {
        return new com.paypal.oslo.core.i18n.data.implementation.AddressHandlerImpl(getAddressLayoutUseCase, formatAddressUseCase, validateAddressUseCase);
    }
}
