package com.paypal.oslo.feature.verificationcapture.di;

/* loaded from: classes15.dex */
public final class ActivityRetainedDataModule_Companion_ProvideDaonDocumentCaptureDataSourceFactory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private ActivityRetainedDataModule_Companion_ProvideDaonDocumentCaptureDataSourceFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource get() {
        return provideDaonDocumentCaptureDataSource(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.di.ActivityRetainedDataModule_Companion_ProvideDaonDocumentCaptureDataSourceFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.verificationcapture.di.ActivityRetainedDataModule_Companion_ProvideDaonDocumentCaptureDataSourceFactory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource provideDaonDocumentCaptureDataSource(android.content.Context context) {
        return (com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.verificationcapture.di.ActivityRetainedDataModule.INSTANCE.provideDaonDocumentCaptureDataSource(context));
    }
}
