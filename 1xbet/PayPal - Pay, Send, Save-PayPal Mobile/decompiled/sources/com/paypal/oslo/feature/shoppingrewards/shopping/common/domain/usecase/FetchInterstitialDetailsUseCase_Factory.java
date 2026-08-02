package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

/* loaded from: classes15.dex */
public final class FetchInterstitialDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder> getHighSpeedVideoSizes;

    private FetchInterstitialDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchInterstitialDetailsUseCase(iabBenefitCardBuilder, stringResourceProvider);
    }
}
