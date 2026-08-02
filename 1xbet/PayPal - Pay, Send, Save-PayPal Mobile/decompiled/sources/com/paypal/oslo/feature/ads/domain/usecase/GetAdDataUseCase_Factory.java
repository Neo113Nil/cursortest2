package com.paypal.oslo.feature.ads.domain.usecase;

/* loaded from: classes11.dex */
public final class GetAdDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.repository.AdRepository> getHighSpeedVideoFpsRanges;

    private GetAdDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.repository.AdRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.repository.AdRepository> provider) {
        return new com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase newInstance(com.paypal.oslo.feature.ads.domain.repository.AdRepository adRepository) {
        return new com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase(adRepository);
    }
}
