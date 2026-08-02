package com.paypal.oslo.feature.checkcapture.fraudforce;

/* loaded from: classes11.dex */
public final class CheckCaptureFraudForceManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private CheckCaptureFraudForceManager_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper> provider2) {
        return new com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager newInstance(android.content.Context context, com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper fraudForceWrapper) {
        return new com.paypal.oslo.feature.checkcapture.fraudforce.CheckCaptureFraudForceManager(context, fraudForceWrapper);
    }
}
