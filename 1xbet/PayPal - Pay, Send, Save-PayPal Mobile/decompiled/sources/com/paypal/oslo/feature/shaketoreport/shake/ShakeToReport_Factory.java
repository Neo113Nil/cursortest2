package com.paypal.oslo.feature.shaketoreport.shake;

/* loaded from: classes14.dex */
public final class ShakeToReport_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks> getHighSpeedVideoSizes;

    private ShakeToReport_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks> provider, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks> provider, dagger.internal.Provider<com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector> provider2) {
        return new com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport newInstance(com.paypal.oslo.feature.shaketoreport.shake.ActivityUiLifecycleCallbacks activityUiLifecycleCallbacks, com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector shakeDetector) {
        return new com.paypal.oslo.feature.shaketoreport.shake.ShakeToReport(activityUiLifecycleCallbacks, shakeDetector);
    }
}
