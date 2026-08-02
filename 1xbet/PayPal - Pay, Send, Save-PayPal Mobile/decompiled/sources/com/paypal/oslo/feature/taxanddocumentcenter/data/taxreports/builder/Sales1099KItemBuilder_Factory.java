package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class Sales1099KItemBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> getHighSpeedVideoSizes;

    private Sales1099KItemBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator, com.paypal.oslo.feature.taxanddocumentcenter.data.util.TaxReportDateUtil taxReportDateUtil) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder(taxReportResourceCoordinator, taxReportDateUtil);
    }
}
