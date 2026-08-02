package com.paypal.oslo.feature.taxanddocumentcenter.data.repository;

/* loaded from: classes15.dex */
public final class TaxDocumentsPageRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq.IpsArticleMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor> getHighSpeedVideoSizes;

    private TaxDocumentsPageRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq.IpsArticleMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq.IpsArticleMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor> provider5) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.taxreports.TaxReportsMapper taxReportsMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.faq.IpsArticleMapper ipsArticleMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.mapper.CallErrorToTaxDocumentCenterErrorMapper callErrorToTaxDocumentCenterErrorMapper, com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxReportSectionsProcessor taxReportSectionsProcessor) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.data.repository.TaxDocumentsPageRepositoryImpl(apolloClient, taxReportsMapper, ipsArticleMapper, callErrorToTaxDocumentCenterErrorMapper, taxReportSectionsProcessor);
    }
}
