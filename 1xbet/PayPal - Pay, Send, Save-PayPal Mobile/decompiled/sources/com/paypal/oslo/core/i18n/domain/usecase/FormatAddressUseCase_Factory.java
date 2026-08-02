package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatAddressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRanges;

    private FormatAddressUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil> provider3) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.AddressRepository addressRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.AddressFormattingUtil addressFormattingUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase(addressRepository, localeResolverCache, addressFormattingUtil);
    }
}
