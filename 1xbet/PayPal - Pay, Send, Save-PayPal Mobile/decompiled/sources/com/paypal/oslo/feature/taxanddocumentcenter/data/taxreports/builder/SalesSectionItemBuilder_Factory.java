package com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder;

/* loaded from: classes15.dex */
public final class SalesSectionItemBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder> getHighSpeedVideoSizes;

    private SalesSectionItemBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder> provider3) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.Sales1099KItemBuilder sales1099KItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesTransactionStatementItemBuilder salesTransactionStatementItemBuilder, com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.GenericReportItemBuilder genericReportItemBuilder) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.SalesSectionItemBuilder(sales1099KItemBuilder, salesTransactionStatementItemBuilder, genericReportItemBuilder);
    }
}
