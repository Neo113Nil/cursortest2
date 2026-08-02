package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class FundingSelectionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository> getHighSpeedVideoFpsRangesFor;

    private FundingSelectionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository fundingSelectionApiRepository, com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.FundingSelectionUseCase(fundingSelectionApiRepository, formatSmartAuthAmountUseCase);
    }
}
