package org.betup.ui.fragment.bets.betlist;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes4.dex */
public final class BetsListFragment_MembersInjector implements MembersInjector<BetsListFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<BetsController> betControllerProvider;
    private final Provider<BetsListInteractor> betsListInteractorProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<UserService> userServiceProvider;

    public BetsListFragment_MembersInjector(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UserService> userServiceProvider, Provider<BetsController> betControllerProvider, Provider<BetsListInteractor> betsListInteractorProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.userServiceProvider = userServiceProvider;
        this.betControllerProvider = betControllerProvider;
        this.betsListInteractorProvider = betsListInteractorProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<BetsListFragment> create(Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<UserService> userServiceProvider, Provider<BetsController> betControllerProvider, Provider<BetsListInteractor> betsListInteractorProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new BetsListFragment_MembersInjector(firebaseRemoteConfigProvider, userServiceProvider, betControllerProvider, betsListInteractorProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetsListFragment instance) {
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectBetController(instance, this.betControllerProvider.get());
        injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectFirebaseRemoteConfig(BetsListFragment instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectUserService(BetsListFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectBetController(BetsListFragment instance, BetsController betController) {
        instance.betController = betController;
    }

    public static void injectBetsListInteractor(BetsListFragment instance, BetsListInteractor betsListInteractor) {
        instance.betsListInteractor = betsListInteractor;
    }

    public static void injectAppLanguageObserver(BetsListFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
