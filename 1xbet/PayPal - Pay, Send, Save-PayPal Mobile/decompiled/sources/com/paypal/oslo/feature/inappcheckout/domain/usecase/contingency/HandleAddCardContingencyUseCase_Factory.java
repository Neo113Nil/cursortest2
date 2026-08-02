package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

/* loaded from: classes13.dex */
public final class HandleAddCardContingencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> Camera2StreamConfigurationMap;

    private HandleAddCardContingencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase(fundingSelectionUseCase);
    }
}
