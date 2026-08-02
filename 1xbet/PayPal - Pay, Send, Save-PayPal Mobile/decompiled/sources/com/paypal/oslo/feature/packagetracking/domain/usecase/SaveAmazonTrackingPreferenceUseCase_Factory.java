package com.paypal.oslo.feature.packagetracking.domain.usecase;

/* loaded from: classes13.dex */
public final class SaveAmazonTrackingPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> getHighResolutionOutputSizeshNQ4ISI;

    private SaveAmazonTrackingPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository> provider) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase newInstance(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository) {
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.SaveAmazonTrackingPreferenceUseCase(packageRepository);
    }
}
