package com.paypal.oslo.feature.cryptocurrency.ui.buy.success;

/* loaded from: classes12.dex */
public final class BuySuccessViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.buy.success.C0339BuySuccessViewModel_Factory Camera2StreamConfigurationMap;

    private BuySuccessViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.C0339BuySuccessViewModel_Factory c0339BuySuccessViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0339BuySuccessViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.model.BuySuccessArgs buySuccessArgs) {
        return this.Camera2StreamConfigurationMap.get(buySuccessArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.C0339BuySuccessViewModel_Factory c0339BuySuccessViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel_Factory_Impl(c0339BuySuccessViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.buy.success.C0339BuySuccessViewModel_Factory c0339BuySuccessViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.buy.success.BuySuccessViewModel_Factory_Impl(c0339BuySuccessViewModel_Factory));
    }
}
