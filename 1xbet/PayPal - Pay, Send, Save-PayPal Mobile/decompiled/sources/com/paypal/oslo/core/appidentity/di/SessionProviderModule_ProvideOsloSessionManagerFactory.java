package com.paypal.oslo.core.appidentity.di;

/* loaded from: classes4.dex */
public final class SessionProviderModule_ProvideOsloSessionManagerFactory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.SessionManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.SessionManager get() {
        return provideOsloSessionManager();
    }

    public static com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideOsloSessionManagerFactory create() {
        return com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideOsloSessionManagerFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.core.appidentity.data.SessionManager provideOsloSessionManager() {
        return (com.paypal.oslo.core.appidentity.data.SessionManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.appidentity.di.SessionProviderModule.INSTANCE.provideOsloSessionManager());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideOsloSessionManagerFactory getHighSpeedVideoSizes = new com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideOsloSessionManagerFactory();

        private InstanceHolder() {
        }
    }
}
