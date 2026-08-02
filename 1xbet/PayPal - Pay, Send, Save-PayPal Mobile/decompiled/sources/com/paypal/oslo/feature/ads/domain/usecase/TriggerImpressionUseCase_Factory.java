package com.paypal.oslo.feature.ads.domain.usecase;

/* loaded from: classes11.dex */
public final class TriggerImpressionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.repository.AdRepository> getHighSpeedVideoFpsRanges;

    private TriggerImpressionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.repository.AdRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.ads.domain.repository.AdRepository> provider) {
        return new com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase newInstance(com.paypal.oslo.feature.ads.domain.repository.AdRepository adRepository) {
        return new com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase(adRepository);
    }
}
