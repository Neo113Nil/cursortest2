package com.paypal.oslo.app.di;

/* loaded from: classes10.dex */
public final class DatabaseClassProviderModule_ProvideDatabaseClassProvider$app_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider get() {
        return provideDatabaseClassProvider$app_prodRelease();
    }

    public static com.paypal.oslo.app.di.DatabaseClassProviderModule_ProvideDatabaseClassProvider$app_prodReleaseFactory create() {
        return com.paypal.oslo.app.di.DatabaseClassProviderModule_ProvideDatabaseClassProvider$app_prodReleaseFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider provideDatabaseClassProvider$app_prodRelease() {
        return (com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.DatabaseClassProviderModule.INSTANCE.provideDatabaseClassProvider$app_prodRelease());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.di.DatabaseClassProviderModule_ProvideDatabaseClassProvider$app_prodReleaseFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.app.di.DatabaseClassProviderModule_ProvideDatabaseClassProvider$app_prodReleaseFactory();

        private InstanceHolder() {
        }
    }
}
