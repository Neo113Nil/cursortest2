package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

/* loaded from: classes15.dex */
public final class FetchBenefitDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder> Camera2StreamConfigurationMap;

    private FetchBenefitDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.FetchBenefitDetailsUseCase(iabBenefitCardBuilder);
    }
}
