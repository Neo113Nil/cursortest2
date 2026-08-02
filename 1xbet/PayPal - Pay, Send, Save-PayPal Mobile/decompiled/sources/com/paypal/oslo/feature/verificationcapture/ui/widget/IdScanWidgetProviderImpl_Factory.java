package com.paypal.oslo.feature.verificationcapture.ui.widget;

/* loaded from: classes15.dex */
public final class IdScanWidgetProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetProviderImpl_Factory();

        private InstanceHolder() {
        }
    }
}
