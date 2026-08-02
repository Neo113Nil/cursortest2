package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class BuildConfigurationModule_ProvideGoogleMapsApiKeyFactory implements dagger.internal.Factory<java.lang.String> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.String get() {
        return provideGoogleMapsApiKey();
    }

    public static com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleMapsApiKeyFactory create() {
        return com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleMapsApiKeyFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static java.lang.String provideGoogleMapsApiKey() {
        return (java.lang.String) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.BuildConfigurationModule.INSTANCE.provideGoogleMapsApiKey());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleMapsApiKeyFactory getHighSpeedVideoSizes = new com.paypal.oslo.app.di.BuildConfigurationModule_ProvideGoogleMapsApiKeyFactory();

        private InstanceHolder() {
        }
    }
}
