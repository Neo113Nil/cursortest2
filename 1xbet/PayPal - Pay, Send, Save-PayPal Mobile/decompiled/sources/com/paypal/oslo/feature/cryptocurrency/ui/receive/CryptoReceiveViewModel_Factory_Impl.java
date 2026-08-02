package com.paypal.oslo.feature.cryptocurrency.ui.receive;

/* loaded from: classes12.dex */
public final class CryptoReceiveViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.receive.C0345CryptoReceiveViewModel_Factory Camera2StreamConfigurationMap;

    private CryptoReceiveViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.receive.C0345CryptoReceiveViewModel_Factory c0345CryptoReceiveViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0345CryptoReceiveViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel create(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return this.Camera2StreamConfigurationMap.get(str, str2, str3, str4);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.receive.C0345CryptoReceiveViewModel_Factory c0345CryptoReceiveViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_Factory_Impl(c0345CryptoReceiveViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.receive.C0345CryptoReceiveViewModel_Factory c0345CryptoReceiveViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel_Factory_Impl(c0345CryptoReceiveViewModel_Factory));
    }
}
