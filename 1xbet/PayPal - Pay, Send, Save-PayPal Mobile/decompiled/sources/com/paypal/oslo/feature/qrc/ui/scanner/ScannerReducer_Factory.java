package com.paypal.oslo.feature.qrc.ui.scanner;

/* loaded from: classes14.dex */
public final class ScannerReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer_Factory create() {
        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer newInstance() {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer_Factory();

        private InstanceHolder() {
        }
    }
}
