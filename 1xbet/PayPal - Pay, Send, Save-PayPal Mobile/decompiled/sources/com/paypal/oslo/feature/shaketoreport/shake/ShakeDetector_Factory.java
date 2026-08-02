package com.paypal.oslo.feature.shaketoreport.shake;

/* loaded from: classes14.dex */
public final class ShakeDetector_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector> {
    private final dagger.internal.Provider<android.hardware.SensorManager> getHighSpeedVideoFpsRanges;

    private ShakeDetector_Factory(dagger.internal.Provider<android.hardware.SensorManager> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector_Factory create(dagger.internal.Provider<android.hardware.SensorManager> provider) {
        return new com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector_Factory(provider);
    }

    public static com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector newInstance(android.hardware.SensorManager sensorManager) {
        return new com.paypal.oslo.feature.shaketoreport.shake.ShakeDetector(sensorManager);
    }
}
