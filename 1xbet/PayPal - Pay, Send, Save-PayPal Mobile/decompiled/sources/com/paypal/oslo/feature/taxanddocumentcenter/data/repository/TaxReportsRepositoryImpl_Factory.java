package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class TaxReportsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper> getHighSpeedVideoFpsRangesFor;

    private TaxReportsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor> provider4) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper taxReportsMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor taxReportSectionsProcessor) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportsRepositoryImpl(apolloClient, taxReportsMapper, callErrorToTaxDocumentCenterErrorMapper, taxReportSectionsProcessor);
    }
}
