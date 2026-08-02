package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator;

/* loaded from: classes15.dex */
public final class ReportExperienceCalculator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> getHighSpeedVideoFpsRanges;

    private ReportExperienceCalculator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator(taxReportDateUtil, countryConfig);
    }
}
