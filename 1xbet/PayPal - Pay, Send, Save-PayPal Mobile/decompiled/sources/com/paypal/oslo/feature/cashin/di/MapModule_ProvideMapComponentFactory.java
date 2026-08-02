package com.paypal.oslo.feature.cashin.di;

/* loaded from: classes11.dex */
public final class MapModule_ProvideMapComponentFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.ui.components.IMapComponent> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.ui.components.IMapComponent get() {
        return provideMapComponent();
    }

    public static com.paypal.oslo.feature.cashin.di.MapModule_ProvideMapComponentFactory create() {
        return com.paypal.oslo.feature.cashin.di.MapModule_ProvideMapComponentFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.cashin.ui.components.IMapComponent provideMapComponent() {
        return (com.paypal.oslo.feature.cashin.ui.components.IMapComponent) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cashin.di.MapModule.INSTANCE.provideMapComponent());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cashin.di.MapModule_ProvideMapComponentFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.cashin.di.MapModule_ProvideMapComponentFactory();

        private InstanceHolder() {
        }
    }
}
