package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import javax.inject.a;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.sessions.LocalOverrideSettingsProvider", "com.google.firebase.sessions.RemoteSettingsProvider"})
@DaggerGenerated
/* loaded from: classes4.dex */
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {
    private final a<SettingsProvider> localOverrideSettingsProvider;
    private final a<SettingsProvider> remoteSettingsProvider;

    public SessionsSettings_Factory(a<SettingsProvider> aVar, a<SettingsProvider> aVar2) {
        this.localOverrideSettingsProvider = aVar;
        this.remoteSettingsProvider = aVar2;
    }

    public static SessionsSettings_Factory create(a<SettingsProvider> aVar, a<SettingsProvider> aVar2) {
        return new SessionsSettings_Factory(aVar, aVar2);
    }

    public static SessionsSettings newInstance(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        return new SessionsSettings(settingsProvider, settingsProvider2);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, javax.inject.a
    public SessionsSettings get() {
        return newInstance(this.localOverrideSettingsProvider.get(), this.remoteSettingsProvider.get());
    }
}
