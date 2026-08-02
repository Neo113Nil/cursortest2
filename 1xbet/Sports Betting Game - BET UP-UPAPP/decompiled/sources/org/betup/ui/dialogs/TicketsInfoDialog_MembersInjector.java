package org.betup.ui.dialogs;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class TicketsInfoDialog_MembersInjector implements MembersInjector<TicketsInfoDialog> {
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<UserService> userServiceProvider;

    public TicketsInfoDialog_MembersInjector(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UserService> userServiceProvider) {
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<TicketsInfoDialog> create(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UserService> userServiceProvider) {
        return new TicketsInfoDialog_MembersInjector(firebaseRemoteConfigProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TicketsInfoDialog instance) {
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectFirebaseRemoteConfig(TicketsInfoDialog instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectUserService(TicketsInfoDialog instance, UserService userService) {
        instance.userService = userService;
    }
}
