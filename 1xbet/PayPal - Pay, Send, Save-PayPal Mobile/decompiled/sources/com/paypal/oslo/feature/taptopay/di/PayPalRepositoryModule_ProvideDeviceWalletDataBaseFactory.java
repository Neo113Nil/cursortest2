package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class PayPalRepositoryModule_ProvideDeviceWalletDataBaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private PayPalRepositoryModule_ProvideDeviceWalletDataBaseFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase get() {
        return provideDeviceWalletDataBase(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvideDeviceWalletDataBaseFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule_ProvideDeviceWalletDataBaseFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase provideDeviceWalletDataBase(android.content.Context context) {
        return (com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.PayPalRepositoryModule.INSTANCE.provideDeviceWalletDataBase(context));
    }
}
