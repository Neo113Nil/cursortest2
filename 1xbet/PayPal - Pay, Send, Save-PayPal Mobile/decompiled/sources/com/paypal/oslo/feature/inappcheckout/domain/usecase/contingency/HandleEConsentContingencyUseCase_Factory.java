package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

/* loaded from: classes13.dex */
public final class HandleEConsentContingencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private HandleEConsentContingencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetBuyerInfoUseCase getBuyerInfoUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase(getBuyerInfoUseCase);
    }
}
