package com.paypal.oslo.feature.notificationcenter.criticalalert.di;

/* loaded from: classes13.dex */
public final class CriticalAlertOverlayProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider_Factory create() {
        return com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider newInstance() {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.notificationcenter.criticalalert.di.CriticalAlertOverlayProvider_Factory();

        private InstanceHolder() {
        }
    }
}
