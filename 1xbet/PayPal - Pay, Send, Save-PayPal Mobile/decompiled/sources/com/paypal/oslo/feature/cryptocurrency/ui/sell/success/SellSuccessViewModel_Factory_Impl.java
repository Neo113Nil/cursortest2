package com.paypal.oslo.feature.cryptocurrency.ui.sell.success;

/* loaded from: classes12.dex */
public final class SellSuccessViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.sell.success.C0348SellSuccessViewModel_Factory Camera2StreamConfigurationMap;

    private SellSuccessViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.C0348SellSuccessViewModel_Factory c0348SellSuccessViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0348SellSuccessViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel create(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.model.SellSuccessArgs sellSuccessArgs) {
        return this.Camera2StreamConfigurationMap.get(sellSuccessArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.C0348SellSuccessViewModel_Factory c0348SellSuccessViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel_Factory_Impl(c0348SellSuccessViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.sell.success.C0348SellSuccessViewModel_Factory c0348SellSuccessViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.sell.success.SellSuccessViewModel_Factory_Impl(c0348SellSuccessViewModel_Factory));
    }
}
