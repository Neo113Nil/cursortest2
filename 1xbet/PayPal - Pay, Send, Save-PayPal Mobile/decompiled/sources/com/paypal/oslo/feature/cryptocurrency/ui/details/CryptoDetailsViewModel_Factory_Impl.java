package com.paypal.oslo.feature.cryptocurrency.ui.details;

/* loaded from: classes12.dex */
public final class CryptoDetailsViewModel_Factory_Impl implements com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.Factory {
    private final com.paypal.oslo.feature.cryptocurrency.ui.details.C0341CryptoDetailsViewModel_Factory Camera2StreamConfigurationMap;

    private CryptoDetailsViewModel_Factory_Impl(com.paypal.oslo.feature.cryptocurrency.ui.details.C0341CryptoDetailsViewModel_Factory c0341CryptoDetailsViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0341CryptoDetailsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.Factory
    public final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel create(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.Factory> create(com.paypal.oslo.feature.cryptocurrency.ui.details.C0341CryptoDetailsViewModel_Factory c0341CryptoDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel_Factory_Impl(c0341CryptoDetailsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.cryptocurrency.ui.details.C0341CryptoDetailsViewModel_Factory c0341CryptoDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel_Factory_Impl(c0341CryptoDetailsViewModel_Factory));
    }
}
