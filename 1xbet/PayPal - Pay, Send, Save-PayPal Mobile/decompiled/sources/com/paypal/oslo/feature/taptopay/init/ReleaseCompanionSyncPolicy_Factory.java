package com.paypal.oslo.feature.taptopay.init;

/* loaded from: classes15.dex */
public final class ReleaseCompanionSyncPolicy_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy_Factory create() {
        return com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy newInstance() {
        return new com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.taptopay.init.ReleaseCompanionSyncPolicy_Factory();

        private InstanceHolder() {
        }
    }
}
