package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

/* loaded from: classes15.dex */
public final class ShoppingIABViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase> getOutputMinFrameDuration;

    private ShoppingIABViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher> provider7) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getOutputMinFrameDuration = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
        this.getInputFormats = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher> provider7) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase getOfferDetailsUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase checkFirstTimeMerchantUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase markMerchantAsSeenUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase enrollInOfferUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase generateAffiliateUrlUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetBannerContentUseCase getBannerContentUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher iabDetailsFetcher) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel(getOfferDetailsUseCase, checkFirstTimeMerchantUseCase, markMerchantAsSeenUseCase, enrollInOfferUseCase, generateAffiliateUrlUseCase, getBannerContentUseCase, iabDetailsFetcher);
    }
}
