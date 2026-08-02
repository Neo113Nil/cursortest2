package com.paypal.oslo.feature.verificationcapture.data.datasource;

/* loaded from: classes15.dex */
public final class DaonDocumentCaptureDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper> getHighSpeedVideoSizes;

    private DaonDocumentCaptureDataSource_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource newInstance(android.content.Context context, com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapper daonSdkWrapper) {
        return new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource(context, daonSdkWrapper);
    }
}
