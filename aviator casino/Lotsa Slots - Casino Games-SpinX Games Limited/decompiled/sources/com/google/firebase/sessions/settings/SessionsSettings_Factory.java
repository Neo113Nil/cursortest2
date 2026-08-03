package com.google.firebase.sessions.settings;

/* loaded from: classes3.dex */
public final class SessionsSettings_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.settings.SessionsSettings> {
    private final javax.inject.Provider<com.google.firebase.sessions.settings.SettingsProvider> localOverrideSettingsProvider;
    private final javax.inject.Provider<com.google.firebase.sessions.settings.SettingsProvider> remoteSettingsProvider;

    public SessionsSettings_Factory(javax.inject.Provider<com.google.firebase.sessions.settings.SettingsProvider> provider, javax.inject.Provider<com.google.firebase.sessions.settings.SettingsProvider> provider2) {
        this.localOverrideSettingsProvider = provider;
        this.remoteSettingsProvider = provider2;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.settings.SessionsSettings get() {
        return newInstance(this.localOverrideSettingsProvider.get(), this.remoteSettingsProvider.get());
    }

    public static com.google.firebase.sessions.settings.SessionsSettings_Factory create(javax.inject.Provider<com.google.firebase.sessions.settings.SettingsProvider> provider, javax.inject.Provider<com.google.firebase.sessions.settings.SettingsProvider> provider2) {
        return new com.google.firebase.sessions.settings.SessionsSettings_Factory(provider, provider2);
    }

    public static com.google.firebase.sessions.settings.SessionsSettings newInstance(com.google.firebase.sessions.settings.SettingsProvider settingsProvider, com.google.firebase.sessions.settings.SettingsProvider settingsProvider2) {
        return new com.google.firebase.sessions.settings.SessionsSettings(settingsProvider, settingsProvider2);
    }
}
