package com.paypal.oslo.feature.oneonboarding.ui.common;

/* loaded from: classes13.dex */
public final class ImagePrefetcher_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher> {
    private final dagger.internal.Provider<android.app.Application> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider>> getHighSpeedVideoSizes;

    private ImagePrefetcher_Factory(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider>> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher_Factory create(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider>> provider2) {
        return new com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher newInstance(android.app.Application application, java.util.Map<java.lang.Class<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig>, com.paypal.oslo.feature.oneonboarding.ui.common.StepImageProvider> map) {
        return new com.paypal.oslo.feature.oneonboarding.ui.common.ImagePrefetcher(application, map);
    }
}
