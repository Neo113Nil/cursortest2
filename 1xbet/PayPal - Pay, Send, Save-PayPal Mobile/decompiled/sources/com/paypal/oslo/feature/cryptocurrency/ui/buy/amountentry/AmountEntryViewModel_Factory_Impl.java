package com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry;

/* loaded from: classes12.dex */
public final class AmountEntryViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.C0337AmountEntryViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private AmountEntryViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.C0337AmountEntryViewModel_Factory c0337AmountEntryViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0337AmountEntryViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel create(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.C0337AmountEntryViewModel_Factory c0337AmountEntryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel_Factory_Impl(c0337AmountEntryViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.C0337AmountEntryViewModel_Factory c0337AmountEntryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel_Factory_Impl(c0337AmountEntryViewModel_Factory));
    }
}
