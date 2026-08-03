package com.google.firebase.sessions.settings;

/* loaded from: classes3.dex */
public final class RemoteSettingsFetcher_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.settings.RemoteSettingsFetcher> {
    private final javax.inject.Provider<com.google.firebase.sessions.ApplicationInfo> appInfoProvider;
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> blockingDispatcherProvider;

    public RemoteSettingsFetcher_Factory(javax.inject.Provider<com.google.firebase.sessions.ApplicationInfo> provider, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider2) {
        this.appInfoProvider = provider;
        this.blockingDispatcherProvider = provider2;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.settings.RemoteSettingsFetcher get() {
        return newInstance(this.appInfoProvider.get(), this.blockingDispatcherProvider.get());
    }

    public static com.google.firebase.sessions.settings.RemoteSettingsFetcher_Factory create(javax.inject.Provider<com.google.firebase.sessions.ApplicationInfo> provider, javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider2) {
        return new com.google.firebase.sessions.settings.RemoteSettingsFetcher_Factory(provider, provider2);
    }

    public static com.google.firebase.sessions.settings.RemoteSettingsFetcher newInstance(com.google.firebase.sessions.ApplicationInfo applicationInfo, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new com.google.firebase.sessions.settings.RemoteSettingsFetcher(applicationInfo, coroutineContext);
    }
}
