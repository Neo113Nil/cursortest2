package com.paypal.oslo.feature.verificationcapture.di;

/* loaded from: classes5.dex */
public final class NetworkModule_ProvideDocumentUploadApiFactory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi> {
    private final dagger.internal.Provider<retrofit2.Retrofit> getHighSpeedVideoFpsRanges;

    private NetworkModule_ProvideDocumentUploadApiFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi get() {
        return provideDocumentUploadApi(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.di.NetworkModule_ProvideDocumentUploadApiFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.feature.verificationcapture.di.NetworkModule_ProvideDocumentUploadApiFactory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi provideDocumentUploadApi(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.verificationcapture.di.NetworkModule.INSTANCE.provideDocumentUploadApi(retrofit));
    }
}
