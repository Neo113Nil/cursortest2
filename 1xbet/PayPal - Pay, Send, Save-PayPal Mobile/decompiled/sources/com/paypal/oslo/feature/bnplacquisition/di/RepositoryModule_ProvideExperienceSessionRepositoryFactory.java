package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideExperienceSessionRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideExperienceSessionRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository get() {
        return provideExperienceSessionRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideExperienceSessionRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideExperienceSessionRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository provideExperienceSessionRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl experienceSessionRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideExperienceSessionRepository(experienceSessionRepositoryImpl));
    }
}
