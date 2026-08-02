package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class QrScannerControllerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl_Factory create() {
        return com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl newInstance() {
        return new com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.qrc.di.QrScannerControllerImpl_Factory();

        private InstanceHolder() {
        }
    }
}
