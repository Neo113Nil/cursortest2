package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0338ReviewViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases> getInputFormats;

    private C0338ReviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getInputFormats = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel get(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs) {
        return newInstance(reviewArgs, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.C0338ReviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider6) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.C0338ReviewViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewArgs reviewArgs, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewFormatters reviewFormatters, com.paypal.oslo.feature.cryptocurrency.ui.buy.review.mapper.PaymentMethodMapper paymentMethodMapper, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel(reviewArgs, featureGateManager, reviewUseCases, reviewFormatters, paymentMethodMapper, currencyProvider, getAssetCurrentPriceUseCase);
    }
}
