package org.betup.services.results;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ResultsService_Factory implements Factory<ResultsService> {
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;

    public ResultsService_Factory(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider) {
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
    }

    @Override // javax.inject.Provider
    public ResultsService get() {
        return new ResultsService(this.firebaseRemoteConfigProvider.get());
    }

    public static ResultsService_Factory create(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider) {
        return new ResultsService_Factory(firebaseRemoteConfigProvider);
    }
}
