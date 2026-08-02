package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class ValidateAddressUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.MetadataUtil> getHighSpeedVideoSizes;

    private ValidateAddressUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.MetadataUtil> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.MetadataUtil> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil> provider5) {
        return new com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.AddressRepository addressRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.MetadataUtil metadataUtil, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil, com.paypal.oslo.core.i18n.domain.util.AddressValidationUtil addressValidationUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase(addressRepository, localeResolverCache, metadataUtil, fieldExtractionUtil, addressValidationUtil);
    }
}
