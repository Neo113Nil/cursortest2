package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetExperienceSessionUsecase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository> getHighSpeedVideoFpsRanges;

    private GetExperienceSessionUsecase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository experienceSessionRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase(experienceSessionRepository);
    }
}
