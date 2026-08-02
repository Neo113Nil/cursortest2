package com.paypal.oslo.feature.pools.ui.pooldetails;

/* loaded from: classes13.dex */
public final class PoolDetailsViewModel_Factory_Impl implements com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.Factory {
    private final com.paypal.oslo.feature.pools.ui.pooldetails.C0380PoolDetailsViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private PoolDetailsViewModel_Factory_Impl(com.paypal.oslo.feature.pools.ui.pooldetails.C0380PoolDetailsViewModel_Factory c0380PoolDetailsViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0380PoolDetailsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.Factory
    public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel create(com.paypal.oslo.feature.pools.api.navigation.PoolDetailsDestination poolDetailsDestination) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(poolDetailsDestination);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.Factory> create(com.paypal.oslo.feature.pools.ui.pooldetails.C0380PoolDetailsViewModel_Factory c0380PoolDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel_Factory_Impl(c0380PoolDetailsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.pools.ui.pooldetails.C0380PoolDetailsViewModel_Factory c0380PoolDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel_Factory_Impl(c0380PoolDetailsViewModel_Factory));
    }
}
