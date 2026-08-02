package com.paypal.oslo.feature.businessinventory.data.di;

/* loaded from: classes11.dex */
public final class TaxDataModule_ProvideTaxEntityValidatorFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule getHighSpeedVideoFpsRangesFor;

    private TaxDataModule_ProvideTaxEntityValidatorFactory(com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule taxDataModule, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl> provider) {
        this.getHighSpeedVideoFpsRangesFor = taxDataModule;
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator get() {
        return provideTaxEntityValidator(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule_ProvideTaxEntityValidatorFactory create(com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule taxDataModule, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl> provider) {
        return new com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule_ProvideTaxEntityValidatorFactory(taxDataModule, provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator provideTaxEntityValidator(com.paypal.oslo.feature.businessinventory.data.di.TaxDataModule taxDataModule, com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl taxEntityValidatorImpl) {
        return (com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator) dagger.internal.Preconditions.checkNotNullFromProvides(taxDataModule.provideTaxEntityValidator(taxEntityValidatorImpl));
    }
}
