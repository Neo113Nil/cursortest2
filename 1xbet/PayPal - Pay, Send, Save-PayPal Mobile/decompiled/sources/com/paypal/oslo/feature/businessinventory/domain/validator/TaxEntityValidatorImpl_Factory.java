package com.paypal.oslo.feature.businessinventory.domain.validator;

/* loaded from: classes11.dex */
public final class TaxEntityValidatorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase> getHighSpeedVideoFpsRanges;

    private TaxEntityValidatorImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase> provider) {
        return new com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl newInstance(com.paypal.oslo.feature.businessinventory.domain.usecase.GetTaxesCacheUseCase getTaxesCacheUseCase) {
        return new com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl(getTaxesCacheUseCase);
    }
}
