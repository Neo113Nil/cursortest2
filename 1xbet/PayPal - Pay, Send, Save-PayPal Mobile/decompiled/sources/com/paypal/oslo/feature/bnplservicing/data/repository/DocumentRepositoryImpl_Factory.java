package com.paypal.oslo.feature.bnplservicing.data.repository;

/* loaded from: classes11.dex */
public final class DocumentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient> getHighSpeedVideoSizes;

    private DocumentRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl newInstance(com.paypal.oslo.feature.bnplservicing.data.document.StaticDocumentClient staticDocumentClient, com.paypal.oslo.feature.bnplservicing.data.document.DynamicDocumentClient dynamicDocumentClient) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl(staticDocumentClient, dynamicDocumentClient);
    }
}
