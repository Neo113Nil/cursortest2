package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class GetAddressLayoutUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.MetadataUtil> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> getHighSpeedVideoSizes;

    private GetAddressLayoutUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.MetadataUtil> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.AddressRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.MetadataUtil> provider4) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.AddressRepository addressRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.FieldExtractionUtil fieldExtractionUtil, com.paypal.oslo.core.i18n.domain.util.MetadataUtil metadataUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase(addressRepository, localeResolverCache, fieldExtractionUtil, metadataUtil);
    }
}
