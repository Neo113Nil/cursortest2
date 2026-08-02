package com.paypal.oslo.feature.debitcard.api.widget;

/* loaded from: classes12.dex */
public final class DebitCardWidgetBridgeViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider> getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardWidgetBridgeViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider> provider) {
        return new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel newInstance(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider debitCardWidgetProvider) {
        return new com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetBridgeViewModel(debitCardWidgetProvider);
    }
}
