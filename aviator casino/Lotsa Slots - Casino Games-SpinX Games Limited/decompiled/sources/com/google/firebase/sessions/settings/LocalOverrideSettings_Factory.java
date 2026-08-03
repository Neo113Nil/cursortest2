package com.google.firebase.sessions.settings;

/* loaded from: classes3.dex */
public final class LocalOverrideSettings_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.settings.LocalOverrideSettings> {
    private final javax.inject.Provider<android.content.Context> appContextProvider;

    public LocalOverrideSettings_Factory(javax.inject.Provider<android.content.Context> provider) {
        this.appContextProvider = provider;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.settings.LocalOverrideSettings get() {
        return newInstance(this.appContextProvider.get());
    }

    public static com.google.firebase.sessions.settings.LocalOverrideSettings_Factory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.google.firebase.sessions.settings.LocalOverrideSettings_Factory(provider);
    }

    public static com.google.firebase.sessions.settings.LocalOverrideSettings newInstance(android.content.Context context) {
        return new com.google.firebase.sessions.settings.LocalOverrideSettings(context);
    }
}
