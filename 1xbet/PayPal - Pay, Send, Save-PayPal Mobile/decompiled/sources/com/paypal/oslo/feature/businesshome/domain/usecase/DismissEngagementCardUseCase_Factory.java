package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class DismissEngagementCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository> getHighSpeedVideoFpsRangesFor;

    private DismissEngagementCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository> provider) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase newInstance(com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository engagementCardDismissalRepository) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.DismissEngagementCardUseCase(engagementCardDismissalRepository);
    }
}
