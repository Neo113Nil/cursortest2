package com.paypal.oslo.feature.home.domain.usecase;

/* loaded from: classes12.dex */
public final class RetrySectionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> getHighSpeedVideoFpsRangesFor;

    private RetrySectionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider) {
        return new com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase newInstance(com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository homeFeedRepository) {
        return new com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase(homeFeedRepository);
    }
}
