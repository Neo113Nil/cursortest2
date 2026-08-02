package com.paypal.oslo.feature.checkcapture.manager;

/* loaded from: classes11.dex */
public final class CheckCaptureFeatureManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private CheckCaptureFeatureManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManagerImpl(featureGate);
    }
}
