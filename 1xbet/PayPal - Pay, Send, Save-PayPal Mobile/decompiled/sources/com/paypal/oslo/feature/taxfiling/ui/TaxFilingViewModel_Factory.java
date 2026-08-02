package com.paypal.oslo.feature.taxfiling.ui;

/* loaded from: classes15.dex */
public final class TaxFilingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider> getHighSpeedVideoFpsRangesFor;

    private TaxFilingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider> provider) {
        return new com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel newInstance(com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider taxFillingConfigurationProvider) {
        return new com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel(taxFillingConfigurationProvider);
    }
}
