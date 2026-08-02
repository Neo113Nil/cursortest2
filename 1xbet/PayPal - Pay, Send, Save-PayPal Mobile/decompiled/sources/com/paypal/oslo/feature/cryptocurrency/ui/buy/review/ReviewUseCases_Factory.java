package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

/* loaded from: classes12.dex */
public final class ReviewUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase> getOutputFormats;

    private ReviewUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getOutputFormats = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoSizes = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> provider6) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptionsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTradeUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases(evaluateEligibleFundingOptionsUseCase, generateQuoteUseCase, executeTradeUseCase, pollQuoteUseCase, getPYUSDRewardsStatusUseCase, checkCryptoProvisioningUseCase);
    }
}
