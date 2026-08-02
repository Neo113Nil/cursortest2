package com.paypal.oslo.feature.verificationcapture.data.repository;

/* loaded from: classes15.dex */
public final class LivenessRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource> getHighSpeedVideoFpsRangesFor;

    private LivenessRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl newInstance(android.content.Context context, com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecLivenessDataSource faceTecLivenessDataSource) {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl(context, faceTecLivenessDataSource);
    }
}
