package com.paypal.oslo.feature.cryptocurrency.ui.sell.review;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0347CryptoSellReviewViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases> getInputSizeshNQ4ISI;

    private C0347CryptoSellReviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getInputSizeshNQ4ISI = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel get(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs) {
        return newInstance(cryptoSellReviewArgs, this.getHighSpeedVideoFpsRanges.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.C0347CryptoSellReviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider6) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.C0347CryptoSellReviewViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellReviewArgs cryptoSellReviewArgs, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewUseCases cryptoSellReviewUseCases, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewFormatters cryptoSellReviewFormatters, com.paypal.oslo.feature.cryptocurrency.ui.sell.review.mapper.CryptoSellPaymentOptionMapper cryptoSellPaymentOptionMapper, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.CryptoSellReviewViewModel(cryptoSellReviewArgs, featureGateManager, cryptoSellReviewUseCases, cryptoSellReviewFormatters, cryptoSellPaymentOptionMapper, currencyProvider, getAssetCurrentPriceUseCase);
    }
}
