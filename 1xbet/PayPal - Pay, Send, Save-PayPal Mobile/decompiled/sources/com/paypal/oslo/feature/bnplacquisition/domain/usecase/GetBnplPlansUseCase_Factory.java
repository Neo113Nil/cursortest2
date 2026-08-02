package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetBnplPlansUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository> getHighSpeedVideoFpsRanges;

    private GetBnplPlansUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository bnplPlansRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase(bnplPlansRepository);
    }
}
