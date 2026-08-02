package com.paypal.oslo.feature.onboarding.postonboarding.common;

/* loaded from: classes13.dex */
public final class ImagePrefetcher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher> {
    private final dagger.internal.Provider<android.app.Application> getHighResolutionOutputSizeshNQ4ISI;

    private ImagePrefetcher_Factory(dagger.internal.Provider<android.app.Application> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher_Factory create(dagger.internal.Provider<android.app.Application> provider) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher newInstance(android.app.Application application) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.common.ImagePrefetcher(application);
    }
}
