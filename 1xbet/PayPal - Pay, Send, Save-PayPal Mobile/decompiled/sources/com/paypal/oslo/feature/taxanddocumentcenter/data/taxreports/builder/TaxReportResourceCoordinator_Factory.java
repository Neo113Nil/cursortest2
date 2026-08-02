package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class TaxReportResourceCoordinator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> getHighSpeedVideoSizes;

    private TaxReportResourceCoordinator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider5) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.ReportItemBuilder reportItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionAvailabilityInfoBuilder sectionAvailabilityInfoBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.calculator.ReportExperienceCalculator reportExperienceCalculator, com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator(reportItemBuilder, sectionAvailabilityInfoBuilder, reportExperienceCalculator, taxReportDateUtil, countryConfig);
    }
}
