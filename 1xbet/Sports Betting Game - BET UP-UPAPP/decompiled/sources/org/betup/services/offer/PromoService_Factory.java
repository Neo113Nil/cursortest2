package org.betup.services.offer;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class PromoService_Factory implements Factory<PromoService> {
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<UserService> userServiceProvider;

    public PromoService_Factory(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UserService> userServiceProvider) {
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public PromoService get() {
        return new PromoService(this.firebaseRemoteConfigProvider.get(), this.userServiceProvider.get());
    }

    public static PromoService_Factory create(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UserService> userServiceProvider) {
        return new PromoService_Factory(firebaseRemoteConfigProvider, userServiceProvider);
    }
}
