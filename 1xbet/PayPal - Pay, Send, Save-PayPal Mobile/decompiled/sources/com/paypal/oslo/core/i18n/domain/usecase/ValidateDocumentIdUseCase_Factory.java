package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class ValidateDocumentIdUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.ValidateDocumentUtil> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DocumentRepository> getHighSpeedVideoSizes;

    private ValidateDocumentIdUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DocumentRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.ValidateDocumentUtil> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DocumentRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.ValidateDocumentUtil> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider3) {
        return new com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.DocumentRepository documentRepository, com.paypal.oslo.core.i18n.domain.util.ValidateDocumentUtil validateDocumentUtil, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        return new com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase(documentRepository, validateDocumentUtil, localeResolverCache);
    }
}
