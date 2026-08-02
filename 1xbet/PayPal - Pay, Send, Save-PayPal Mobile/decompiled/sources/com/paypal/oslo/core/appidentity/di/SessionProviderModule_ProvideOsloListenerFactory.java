package com.paypal.oslo.core.appidentity.di;

/* loaded from: classes4.dex */
public final class SessionProviderModule_ProvideOsloListenerFactory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionEditor> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> getHighSpeedVideoFpsRangesFor;

    private SessionProviderModule_ProvideOsloListenerFactory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionEditor> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.SessionLifecycleListener get() {
        return provideOsloListener(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideOsloListenerFactory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionEditor> provider, dagger.internal.Provider<com.paypal.oslo.core.appidentity.data.SessionReader> provider2) {
        return new com.paypal.oslo.core.appidentity.di.SessionProviderModule_ProvideOsloListenerFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.appidentity.data.SessionLifecycleListener provideOsloListener(com.paypal.oslo.core.appidentity.data.SessionEditor sessionEditor, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader) {
        return (com.paypal.oslo.core.appidentity.data.SessionLifecycleListener) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.appidentity.di.SessionProviderModule.INSTANCE.provideOsloListener(sessionEditor, sessionReader));
    }
}
