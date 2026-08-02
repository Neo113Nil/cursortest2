package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetInstoreVccDetailsUsecase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository> getHighSpeedVideoFpsRangesFor;

    private GetInstoreVccDetailsUsecase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.EvaluateEligibilityAndReplaceCardRepository evaluateEligibilityAndReplaceCardRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetInstoreVccDetailsUsecase(evaluateEligibilityAndReplaceCardRepository);
    }
}
