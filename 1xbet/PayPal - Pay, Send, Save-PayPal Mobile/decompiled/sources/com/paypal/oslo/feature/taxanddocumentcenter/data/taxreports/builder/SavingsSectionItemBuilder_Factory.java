package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class SavingsSectionItemBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> getHighSpeedVideoFpsRangesFor;

    private SavingsSectionItemBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator, com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SavingsSectionItemBuilder(taxReportResourceCoordinator, taxReportDateUtil);
    }
}
