package com.paypal.oslo.feature.bnplacquisition.di;

/* loaded from: classes11.dex */
public final class RepositoryModule_ProvideEvaluateEligibilityAndReplaceCardRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.EvaluateEligibilityAndReplaceCardRepositoryImpl> getHighSpeedVideoFpsRangesFor;

    private RepositoryModule_ProvideEvaluateEligibilityAndReplaceCardRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.EvaluateEligibilityAndReplaceCardRepositoryImpl> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository get() {
        return provideEvaluateEligibilityAndReplaceCardRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideEvaluateEligibilityAndReplaceCardRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.repository.EvaluateEligibilityAndReplaceCardRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule_ProvideEvaluateEligibilityAndReplaceCardRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository provideEvaluateEligibilityAndReplaceCardRepository(com.paypal.oslo.feature.bnplacquisition.data.repository.EvaluateEligibilityAndReplaceCardRepositoryImpl evaluateEligibilityAndReplaceCardRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplacquisition.di.RepositoryModule.INSTANCE.provideEvaluateEligibilityAndReplaceCardRepository(evaluateEligibilityAndReplaceCardRepositoryImpl));
    }
}
