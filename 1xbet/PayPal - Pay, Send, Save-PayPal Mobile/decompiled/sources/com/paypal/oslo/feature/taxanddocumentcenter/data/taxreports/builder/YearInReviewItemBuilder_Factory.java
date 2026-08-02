package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class YearInReviewItemBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> getHighResolutionOutputSizeshNQ4ISI;

    private YearInReviewItemBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.YearInReviewItemBuilder(taxReportResourceCoordinator);
    }
}
