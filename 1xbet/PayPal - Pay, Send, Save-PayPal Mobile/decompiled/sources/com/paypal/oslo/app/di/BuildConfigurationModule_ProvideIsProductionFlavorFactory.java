package com.paypal.oslo.app.di;

/* loaded from: classes10.dex */
public final class BuildConfigurationModule_ProvideIsProductionFlavorFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provideIsProductionFlavor());
    }

    public static com.paypal.oslo.app.di.BuildConfigurationModule_ProvideIsProductionFlavorFactory create() {
        return com.paypal.oslo.app.di.BuildConfigurationModule_ProvideIsProductionFlavorFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static boolean provideIsProductionFlavor() {
        return com.paypal.oslo.app.di.BuildConfigurationModule.INSTANCE.provideIsProductionFlavor();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.di.BuildConfigurationModule_ProvideIsProductionFlavorFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.app.di.BuildConfigurationModule_ProvideIsProductionFlavorFactory();

        private InstanceHolder() {
        }
    }
}
