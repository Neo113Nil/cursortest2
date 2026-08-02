package com.paypal.oslo.feature.helpcenter.domain.usecase;

/* loaded from: classes12.dex */
public final class FetchIpsArticlesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository> getHighSpeedVideoFpsRangesFor;

    private FetchIpsArticlesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository> provider) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase newInstance(com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository ipsArticlesRepository) {
        return new com.paypal.oslo.feature.helpcenter.domain.usecase.FetchIpsArticlesUseCase(ipsArticlesRepository);
    }
}
