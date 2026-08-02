package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

/* loaded from: classes13.dex */
public final class PostEvalContingencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private PostEvalContingencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase(fundingSelectionUseCase);
    }
}
