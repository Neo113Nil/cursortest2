package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

/* loaded from: classes12.dex */
public final class CryptoSellReviewUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase> getHighSpeedVideoFpsRangesFor;

    private CryptoSellReviewUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase> provider4) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases newInstance(com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptionsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTradeUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases(evaluateEligibleFundingOptionsUseCase, generateQuoteUseCase, executeTradeUseCase, pollQuoteUseCase);
    }
}
