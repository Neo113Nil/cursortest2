package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class SessionLifecycleObserver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.SessionLifecycleObserver> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener>> getHighResolutionOutputSizeshNQ4ISI;

    private SessionLifecycleObserver_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener>> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.SessionLifecycleObserver get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.appidentity.data.SessionLifecycleObserver_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener>> provider) {
        return new com.paypal.oslo.core.appidentity.data.SessionLifecycleObserver_Factory(provider);
    }

    public static com.paypal.oslo.core.appidentity.data.SessionLifecycleObserver newInstance(java.util.Set<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener> set) {
        return new com.paypal.oslo.core.appidentity.data.SessionLifecycleObserver(set);
    }
}
