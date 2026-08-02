package com.paypal.oslo.feature.bnplacquisition.data.repository;

/* loaded from: classes11.dex */
public final class DocumentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.repository.DocumentRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient> getHighSpeedVideoSizes;

    private DocumentRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.repository.DocumentRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.DocumentRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.DocumentRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.DocumentRepositoryImpl newInstance(com.paypal.oslo.feature.bnplacquisition.data.document.StaticDocumentClient staticDocumentClient, com.paypal.oslo.feature.bnplacquisition.data.document.DynamicDocumentClient dynamicDocumentClient) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.DocumentRepositoryImpl(staticDocumentClient, dynamicDocumentClient);
    }
}
