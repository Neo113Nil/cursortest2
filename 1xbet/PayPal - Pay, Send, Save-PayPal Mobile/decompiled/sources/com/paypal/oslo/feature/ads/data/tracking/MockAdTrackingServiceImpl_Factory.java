package com.paypal.oslo.feature.ads.data.tracking;

/* loaded from: classes11.dex */
public final class MockAdTrackingServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl_Factory create() {
        return com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl newInstance() {
        return new com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.ads.data.tracking.MockAdTrackingServiceImpl_Factory();

        private InstanceHolder() {
        }
    }
}
