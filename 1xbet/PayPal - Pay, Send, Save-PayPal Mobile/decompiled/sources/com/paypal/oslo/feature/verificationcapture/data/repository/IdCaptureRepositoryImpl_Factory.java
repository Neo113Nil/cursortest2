package com.paypal.oslo.feature.verificationcapture.data.repository;

/* loaded from: classes15.dex */
public final class IdCaptureRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private IdCaptureRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl newInstance(android.content.Context context, com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource daonDocumentCaptureDataSource) {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl(context, daonDocumentCaptureDataSource);
    }
}
