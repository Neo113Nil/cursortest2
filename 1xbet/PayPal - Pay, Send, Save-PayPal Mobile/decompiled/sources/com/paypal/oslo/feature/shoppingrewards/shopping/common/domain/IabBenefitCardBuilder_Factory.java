package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

/* loaded from: classes15.dex */
public final class IabBenefitCardBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider> getHighSpeedVideoSizes;

    private IabBenefitCardBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder newInstance(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider iabWebBaseUrlProvider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder(stringResourceProvider, iabWebBaseUrlProvider);
    }
}
