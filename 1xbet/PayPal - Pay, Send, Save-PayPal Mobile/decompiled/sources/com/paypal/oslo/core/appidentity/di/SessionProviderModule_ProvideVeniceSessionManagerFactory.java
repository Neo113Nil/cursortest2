package com.paypal.oslo.core.appidentity.di;

/* loaded from: classes4.dex */
public final class SessionProviderModule_ProvideVeniceSessionManagerFactory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.SessionManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.SessionManager get() {
        return provideVeniceSessionManager();
    }

    public static com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideVeniceSessionManagerFactory create() {
        return com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideVeniceSessionManagerFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.core.appidentity.data.SessionManager provideVeniceSessionManager() {
        return (com.paypal.oslo.core.appidentity.data.SessionManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.appidentity.di.SessionProviderModule.INSTANCE.provideVeniceSessionManager());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideVeniceSessionManagerFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideVeniceSessionManagerFactory();

        private InstanceHolder() {
        }
    }
}
