package org.betup.services.experiments;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ABTestService_Factory implements Factory<ABTestService> {
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;

    public ABTestService_Factory(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider) {
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
    }

    @Override // javax.inject.Provider
    public ABTestService get() {
        return new ABTestService(this.firebaseRemoteConfigProvider.get());
    }

    public static ABTestService_Factory create(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider) {
        return new ABTestService_Factory(firebaseRemoteConfigProvider);
    }
}
