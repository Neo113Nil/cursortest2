package com.paypal.oslo.feature.identity.shared.data.capability;

/* loaded from: classes13.dex */
public final class BiometricCapabilityCheckerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.data.capability.BiometricCapabilityCheckerImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private BiometricCapabilityCheckerImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.data.capability.BiometricCapabilityCheckerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.shared.data.capability.BiometricCapabilityCheckerImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.identity.shared.data.capability.BiometricCapabilityCheckerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.shared.data.capability.BiometricCapabilityCheckerImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.identity.shared.data.capability.BiometricCapabilityCheckerImpl(context);
    }
}
