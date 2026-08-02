package com.paypal.oslo.app.di;

/* loaded from: classes10.dex */
public final class BuildConfigurationModule_ProvideDyScanApiKeyFactory implements dagger.internal.Factory<java.lang.String> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.String get() {
        return provideDyScanApiKey();
    }

    public static com.paypal.oslo.app.di.BuildConfigurationModule_ProvideDyScanApiKeyFactory create() {
        return com.paypal.oslo.app.di.BuildConfigurationModule_ProvideDyScanApiKeyFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static java.lang.String provideDyScanApiKey() {
        return (java.lang.String) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.BuildConfigurationModule.INSTANCE.provideDyScanApiKey());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.di.BuildConfigurationModule_ProvideDyScanApiKeyFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.app.di.BuildConfigurationModule_ProvideDyScanApiKeyFactory();

        private InstanceHolder() {
        }
    }
}
