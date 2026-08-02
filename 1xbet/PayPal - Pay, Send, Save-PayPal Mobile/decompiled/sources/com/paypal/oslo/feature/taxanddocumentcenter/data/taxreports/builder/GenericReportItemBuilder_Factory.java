package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class GenericReportItemBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> getHighSpeedVideoFpsRanges;

    private GenericReportItemBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder(taxReportResourceCoordinator);
    }
}
