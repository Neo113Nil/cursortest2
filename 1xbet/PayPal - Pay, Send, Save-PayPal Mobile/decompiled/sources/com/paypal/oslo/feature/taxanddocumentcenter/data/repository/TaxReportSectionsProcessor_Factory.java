package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class TaxReportSectionsProcessor_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder> getHighSpeedVideoFpsRanges;

    private TaxReportSectionsProcessor_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor newInstance(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.builder.TaxReportSectionBuilder taxReportSectionBuilder) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor(taxReportSectionBuilder);
    }
}
