package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class SalesTransactionStatementItemBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> getHighSpeedVideoSizes;

    private SalesTransactionStatementItemBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportResourceCoordinator taxReportResourceCoordinator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder(taxReportResourceCoordinator);
    }
}
