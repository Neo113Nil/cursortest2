package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

/* loaded from: classes15.dex */
public final class IabDetailsFetcher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase> getHighSpeedVideoFpsRangesFor;

    private IabDetailsFetcher_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase fetchInterstitialDetailsUseCase, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase fetchBenefitDetailsUseCase) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabDetailsFetcher(fetchInterstitialDetailsUseCase, fetchBenefitDetailsUseCase);
    }
}
