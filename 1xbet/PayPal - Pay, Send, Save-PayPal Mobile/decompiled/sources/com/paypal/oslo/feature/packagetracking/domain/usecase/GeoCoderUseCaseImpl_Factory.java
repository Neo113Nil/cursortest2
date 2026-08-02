package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class GeoCoderUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl> {
    private final dagger.internal.Provider<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi> getHighSpeedVideoSizes;

    private GeoCoderUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi> provider, dagger.internal.Provider<java.lang.String> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi> provider, dagger.internal.Provider<java.lang.String> provider2) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi geoCoderApi, java.lang.String str) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl(geoCoderApi, str);
    }
}
