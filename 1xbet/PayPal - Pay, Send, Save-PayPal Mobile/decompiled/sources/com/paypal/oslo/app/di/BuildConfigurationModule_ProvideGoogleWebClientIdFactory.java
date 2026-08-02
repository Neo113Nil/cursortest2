package com.paypal.oslo.app.di;

/* loaded from: classes10.dex */
public final class BuildConfigurationModule_ProvideGoogleWebClientIdFactory implements dagger.internal.Factory<java.lang.String> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.String get() {
        return provideGoogleWebClientId();
    }

    public static com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleWebClientIdFactory create() {
        return com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleWebClientIdFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static java.lang.String provideGoogleWebClientId() {
        return (java.lang.String) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.BuildConfigurationModule.INSTANCE.provideGoogleWebClientId());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleWebClientIdFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleWebClientIdFactory();

        private InstanceHolder() {
        }
    }
}
