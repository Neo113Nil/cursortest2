package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class NameFormatUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> getHighSpeedVideoSizes;

    private NameFormatUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.NameRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.NameUtil> provider3) {
        return new com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.NameRepository nameRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.NameUtil nameUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase(nameRepository, localeResolverCache, nameUtil);
    }
}
