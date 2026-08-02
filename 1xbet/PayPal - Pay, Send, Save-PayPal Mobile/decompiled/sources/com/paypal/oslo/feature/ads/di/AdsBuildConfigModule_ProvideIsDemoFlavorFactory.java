package com.paypal.oslo.feature.ads.di;

/* loaded from: classes11.dex */
public final class AdsBuildConfigModule_ProvideIsDemoFlavorFactory implements dagger.internal.Factory<java.lang.Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Boolean get() {
        return java.lang.Boolean.valueOf(provideIsDemoFlavor());
    }

    public static com.paypal.oslo.feature.ads.di.AdsBuildConfigModule_ProvideIsDemoFlavorFactory create() {
        return com.paypal.oslo.feature.ads.di.AdsBuildConfigModule_ProvideIsDemoFlavorFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static boolean provideIsDemoFlavor() {
        return com.paypal.oslo.feature.ads.di.AdsBuildConfigModule.INSTANCE.provideIsDemoFlavor();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.ads.di.AdsBuildConfigModule_ProvideIsDemoFlavorFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.ads.di.AdsBuildConfigModule_ProvideIsDemoFlavorFactory();

        private InstanceHolder() {
        }
    }
}
