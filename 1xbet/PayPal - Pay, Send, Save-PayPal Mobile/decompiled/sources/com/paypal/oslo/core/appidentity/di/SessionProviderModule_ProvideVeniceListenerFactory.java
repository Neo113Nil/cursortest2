package com.paypal.oslo.core.appidentity.di;

/* loaded from: classes4.dex */
public final class SessionProviderModule_ProvideVeniceListenerFactory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionEditor> getHighSpeedVideoFpsRangesFor;

    private SessionProviderModule_ProvideVeniceListenerFactory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionEditor> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.SessionLifecycleListener get() {
        return provideVeniceListener(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideVeniceListenerFactory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionEditor> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider2) {
        return new com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideVeniceListenerFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.appidentity.data.SessionLifecycleListener provideVeniceListener(com.paypal.oslo.core.appidentity.data.SessionEditor sessionEditor, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader) {
        return (com.paypal.oslo.core.appidentity.data.SessionLifecycleListener) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.appidentity.di.SessionProviderModule.INSTANCE.provideVeniceListener(sessionEditor, sessionReader));
    }
}
