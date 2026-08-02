package com.paypal.oslo.feature.verificationcapture.ui.widget;

/* loaded from: classes15.dex */
public final class IdScanWidgetFactoryProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetFactoryProvider_Factory();

        private InstanceHolder() {
        }
    }
}
