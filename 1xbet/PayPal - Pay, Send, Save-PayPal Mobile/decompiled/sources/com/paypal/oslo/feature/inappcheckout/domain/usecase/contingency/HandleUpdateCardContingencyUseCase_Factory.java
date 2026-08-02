package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

/* loaded from: classes13.dex */
public final class HandleUpdateCardContingencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> Camera2StreamConfigurationMap;

    private HandleUpdateCardContingencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase fundingSelectionUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase(fundingSelectionUseCase);
    }
}
