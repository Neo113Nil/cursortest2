package com.google.firebase.sessions.settings;

/* loaded from: classes3.dex */
public final class RemoteSettings_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.settings.RemoteSettings> {
    private final javax.inject.Provider<com.google.firebase.sessions.ApplicationInfo> appInfoProvider;
    private final javax.inject.Provider<kotlin.coroutines.CoroutineContext> backgroundDispatcherProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher> configsFetcherProvider;
    private final javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> firebaseInstallationsApiProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.settings.SettingsCache> settingsCacheProvider;

    public RemoteSettings_Factory(javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider, javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> provider2, javax.inject.Provider<com.google.firebase.sessions.ApplicationInfo> provider3, javax.inject.Provider<com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher> provider4, javax.inject.Provider<com.google.firebase.sessions.settings.SettingsCache> provider5) {
        this.backgroundDispatcherProvider = provider;
        this.firebaseInstallationsApiProvider = provider2;
        this.appInfoProvider = provider3;
        this.configsFetcherProvider = provider4;
        this.settingsCacheProvider = provider5;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.settings.RemoteSettings get() {
        return newInstance(this.backgroundDispatcherProvider.get(), this.firebaseInstallationsApiProvider.get(), this.appInfoProvider.get(), this.configsFetcherProvider.get(), com.google.firebase.sessions.dagger.internal.DoubleCheck.lazy(this.settingsCacheProvider));
    }

    public static com.google.firebase.sessions.settings.RemoteSettings_Factory create(javax.inject.Provider<kotlin.coroutines.CoroutineContext> provider, javax.inject.Provider<com.google.firebase.installations.FirebaseInstallationsApi> provider2, javax.inject.Provider<com.google.firebase.sessions.ApplicationInfo> provider3, javax.inject.Provider<com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher> provider4, javax.inject.Provider<com.google.firebase.sessions.settings.SettingsCache> provider5) {
        return new com.google.firebase.sessions.settings.RemoteSettings_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.google.firebase.sessions.settings.RemoteSettings newInstance(kotlin.coroutines.CoroutineContext coroutineContext, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.sessions.ApplicationInfo applicationInfo, com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, com.google.firebase.sessions.dagger.Lazy<com.google.firebase.sessions.settings.SettingsCache> lazy) {
        return new com.google.firebase.sessions.settings.RemoteSettings(coroutineContext, firebaseInstallationsApi, applicationInfo, crashlyticsSettingsFetcher, lazy);
    }
}
