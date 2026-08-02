package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator;

/* loaded from: classes15.dex */
public final class SectionExperienceCalculator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> getHighSpeedVideoSizes;

    private SectionExperienceCalculator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.SectionExperienceCalculator(taxReportDateUtil, countryConfig);
    }
}
