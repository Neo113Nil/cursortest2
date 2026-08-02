package com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0369DebitCardWebViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer> getHighResolutionOutputSizeshNQ4ISI;

    private C0369DebitCardWebViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel get(java.lang.String str, boolean z, java.lang.String str2) {
        return newInstance(str, z, str2, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.C0369DebitCardWebViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.C0369DebitCardWebViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel newInstance(java.lang.String str, boolean z, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewReducer debitCardWebViewReducer) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel(str, z, str2, debitCardWebViewReducer);
    }
}
