package com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel;

/* loaded from: classes12.dex */
public final class DebitCardWebViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.C0369DebitCardWebViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardWebViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.C0369DebitCardWebViewModel_Factory c0369DebitCardWebViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0369DebitCardWebViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel create(java.lang.String str, boolean z, java.lang.String str2) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str, z, str2);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.Factory> create(com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.C0369DebitCardWebViewModel_Factory c0369DebitCardWebViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel_Factory_Impl(c0369DebitCardWebViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.C0369DebitCardWebViewModel_Factory c0369DebitCardWebViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel_Factory_Impl(c0369DebitCardWebViewModel_Factory));
    }
}
