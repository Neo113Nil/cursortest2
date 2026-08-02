package com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi;

/* loaded from: classes12.dex */
public final class DebitCardWebViewReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer_Factory create() {
        return com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer newInstance() {
        return new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer_Factory();

        private InstanceHolder() {
        }
    }
}
