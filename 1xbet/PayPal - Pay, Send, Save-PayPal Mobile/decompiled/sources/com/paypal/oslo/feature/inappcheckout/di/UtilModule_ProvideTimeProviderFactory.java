package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class UtilModule_ProvideTimeProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider get() {
        return provideTimeProvider();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.UtilModule_ProvideTimeProviderFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.UtilModule_ProvideTimeProviderFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider provideTimeProvider() {
        return (com.paypal.oslo.feature.inappcheckout.domain.util.TimeProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.UtilModule.INSTANCE.provideTimeProvider());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.UtilModule_ProvideTimeProviderFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.inappcheckout.di.UtilModule_ProvideTimeProviderFactory();

        private InstanceHolder() {
        }
    }
}
