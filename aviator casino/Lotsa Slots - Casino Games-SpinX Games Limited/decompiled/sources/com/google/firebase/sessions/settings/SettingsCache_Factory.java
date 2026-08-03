package com.google.firebase.sessions.settings;

/* loaded from: classes3.dex */
public final class SettingsCache_Factory implements com.google.firebase.sessions.dagger.internal.Factory<com.google.firebase.sessions.settings.SettingsCache> {
    private final javax.inject.Provider<androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> dataStoreProvider;

    public SettingsCache_Factory(javax.inject.Provider<androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> provider) {
        this.dataStoreProvider = provider;
    }

    @Override // javax.inject.Provider
    public com.google.firebase.sessions.settings.SettingsCache get() {
        return newInstance(this.dataStoreProvider.get());
    }

    public static com.google.firebase.sessions.settings.SettingsCache_Factory create(javax.inject.Provider<androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> provider) {
        return new com.google.firebase.sessions.settings.SettingsCache_Factory(provider);
    }

    public static com.google.firebase.sessions.settings.SettingsCache newInstance(androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        return new com.google.firebase.sessions.settings.SettingsCache(dataStore);
    }
}
