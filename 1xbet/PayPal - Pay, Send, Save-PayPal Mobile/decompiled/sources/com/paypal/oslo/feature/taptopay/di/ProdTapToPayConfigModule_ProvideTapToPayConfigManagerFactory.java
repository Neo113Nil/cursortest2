package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class ProdTapToPayConfigModule_ProvideTapToPayConfigManagerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> getHighResolutionOutputSizeshNQ4ISI;

    private ProdTapToPayConfigModule_ProvideTapToPayConfigManagerFactory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager get() {
        return provideTapToPayConfigManager(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.ProdTapToPayConfigModule_ProvideTapToPayConfigManagerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager> provider) {
        return new com.paypal.oslo.feature.taptopay.di.ProdTapToPayConfigModule_ProvideTapToPayConfigManagerFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager provideTapToPayConfigManager(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager) {
        return (com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.ProdTapToPayConfigModule.INSTANCE.provideTapToPayConfigManager(manager));
    }
}
