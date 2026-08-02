package com.paypal.oslo.feature.identity.shared.data.capability;

/* loaded from: classes13.dex */
public final class DeviceLockCapabilityCheckerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.shared.data.capability.DeviceLockCapabilityCheckerImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private DeviceLockCapabilityCheckerImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.shared.data.capability.DeviceLockCapabilityCheckerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.shared.data.capability.DeviceLockCapabilityCheckerImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.identity.shared.data.capability.DeviceLockCapabilityCheckerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.shared.data.capability.DeviceLockCapabilityCheckerImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.identity.shared.data.capability.DeviceLockCapabilityCheckerImpl(context);
    }
}
