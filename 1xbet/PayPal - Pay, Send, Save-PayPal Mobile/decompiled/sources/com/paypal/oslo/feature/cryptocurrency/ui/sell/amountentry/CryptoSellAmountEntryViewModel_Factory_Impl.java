package com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry;

/* loaded from: classes12.dex */
public final class CryptoSellAmountEntryViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.C0346CryptoSellAmountEntryViewModel_Factory getHighSpeedVideoSizes;

    private CryptoSellAmountEntryViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.C0346CryptoSellAmountEntryViewModel_Factory c0346CryptoSellAmountEntryViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0346CryptoSellAmountEntryViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoSizes.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.C0346CryptoSellAmountEntryViewModel_Factory c0346CryptoSellAmountEntryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel_Factory_Impl(c0346CryptoSellAmountEntryViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.C0346CryptoSellAmountEntryViewModel_Factory c0346CryptoSellAmountEntryViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel_Factory_Impl(c0346CryptoSellAmountEntryViewModel_Factory));
    }
}
