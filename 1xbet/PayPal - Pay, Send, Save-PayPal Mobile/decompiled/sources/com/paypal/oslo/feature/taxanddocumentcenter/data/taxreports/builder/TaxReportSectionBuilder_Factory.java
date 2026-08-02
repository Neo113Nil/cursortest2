package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class TaxReportSectionBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter> getOutputMinFrameDuration;

    private TaxReportSectionBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider7) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getInputFormats = provider5;
        this.getOutputMinFrameDuration = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getInputFormats.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder> provider5, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter> provider6, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig> provider7) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder salesSectionItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder savingsSectionItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder genericReportItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder yearInReviewItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SectionReportSorter sectionReportSorter, com.paypal.oslo.feature.taxanddocumentcenter.config.CountryConfig countryConfig) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder(taxReportResourceCoordinator, salesSectionItemBuilder, savingsSectionItemBuilder, genericReportItemBuilder, yearInReviewItemBuilder, sectionReportSorter, countryConfig);
    }
}
