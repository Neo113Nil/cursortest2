package org.betup.ui.dialogs;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class WelcomeDialog_MembersInjector implements MembersInjector<WelcomeDialog> {
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;

    public WelcomeDialog_MembersInjector(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider) {
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
    }

    public static MembersInjector<WelcomeDialog> create(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider) {
        return new WelcomeDialog_MembersInjector(firebaseRemoteConfigProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WelcomeDialog instance) {
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
    }

    public static void injectFirebaseRemoteConfig(WelcomeDialog instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }
}
