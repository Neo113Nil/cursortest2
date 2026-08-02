package org.betup.injection.module;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes2.dex */
public final class AppModule_ProvideFirebaseRemoteConfigFactory implements Factory<FirebaseRemoteConfig> {
    private final AppModule module;

    public AppModule_ProvideFirebaseRemoteConfigFactory(AppModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public FirebaseRemoteConfig get() {
        return (FirebaseRemoteConfig) Preconditions.checkNotNull(this.module.provideFirebaseRemoteConfig(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideFirebaseRemoteConfigFactory create(AppModule module) {
        return new AppModule_ProvideFirebaseRemoteConfigFactory(module);
    }

    public static FirebaseRemoteConfig proxyProvideFirebaseRemoteConfig(AppModule instance) {
        return (FirebaseRemoteConfig) Preconditions.checkNotNull(instance.provideFirebaseRemoteConfig(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
