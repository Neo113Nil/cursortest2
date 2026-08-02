package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class ShouldShowEngagementCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository> getHighSpeedVideoSizes;

    private ShouldShowEngagementCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository> provider) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase newInstance(com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository engagementCardDismissalRepository) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase(engagementCardDismissalRepository);
    }
}
