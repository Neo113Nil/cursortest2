package org.betup.ui.dialogs;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.UnlockOneClickBetInteractor;
import org.betup.model.remote.api.rest.user.V7OneClickBetSettingsInteractor;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes2.dex */
public final class OneClickBetSettingsDialogFragment_MembersInjector implements MembersInjector<OneClickBetSettingsDialogFragment> {
    private final Provider<BetsController> betsControllerProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<UnlockOneClickBetInteractor> unlockOneClickBetInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7OneClickBetSettingsInteractor> v7OneClickBetSettingsInteractorProvider;

    public OneClickBetSettingsDialogFragment_MembersInjector(Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<UserService> userServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UnlockOneClickBetInteractor> unlockOneClickBetInteractorProvider, Provider<V7OneClickBetSettingsInteractor> v7OneClickBetSettingsInteractorProvider, Provider<BetsController> betsControllerProvider) {
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.unlockOneClickBetInteractorProvider = unlockOneClickBetInteractorProvider;
        this.v7OneClickBetSettingsInteractorProvider = v7OneClickBetSettingsInteractorProvider;
        this.betsControllerProvider = betsControllerProvider;
    }

    public static MembersInjector<OneClickBetSettingsDialogFragment> create(Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<UserService> userServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UnlockOneClickBetInteractor> unlockOneClickBetInteractorProvider, Provider<V7OneClickBetSettingsInteractor> v7OneClickBetSettingsInteractorProvider, Provider<BetsController> betsControllerProvider) {
        return new OneClickBetSettingsDialogFragment_MembersInjector(localPreferencesServiceProvider, userServiceProvider, firebaseRemoteConfigProvider, unlockOneClickBetInteractorProvider, v7OneClickBetSettingsInteractorProvider, betsControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OneClickBetSettingsDialogFragment instance) {
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectUnlockOneClickBetInteractor(instance, this.unlockOneClickBetInteractorProvider.get());
        injectV7OneClickBetSettingsInteractor(instance, this.v7OneClickBetSettingsInteractorProvider.get());
        injectBetsController(instance, this.betsControllerProvider.get());
    }

    public static void injectLocalPreferencesService(OneClickBetSettingsDialogFragment instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }

    public static void injectUserService(OneClickBetSettingsDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectFirebaseRemoteConfig(OneClickBetSettingsDialogFragment instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectUnlockOneClickBetInteractor(OneClickBetSettingsDialogFragment instance, UnlockOneClickBetInteractor unlockOneClickBetInteractor) {
        instance.unlockOneClickBetInteractor = unlockOneClickBetInteractor;
    }

    public static void injectV7OneClickBetSettingsInteractor(OneClickBetSettingsDialogFragment instance, V7OneClickBetSettingsInteractor v7OneClickBetSettingsInteractor) {
        instance.v7OneClickBetSettingsInteractor = v7OneClickBetSettingsInteractor;
    }

    public static void injectBetsController(OneClickBetSettingsDialogFragment instance, BetsController betsController) {
        instance.betsController = betsController;
    }
}
