package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.language.AppLanguageObserver;

/* loaded from: classes4.dex */
public final class LeaguesFragment_MembersInjector implements MembersInjector<LeaguesFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<LeaguesController> controllerProvider;

    public LeaguesFragment_MembersInjector(Provider<LeaguesController> controllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.controllerProvider = controllerProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<LeaguesFragment> create(Provider<LeaguesController> controllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new LeaguesFragment_MembersInjector(controllerProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LeaguesFragment instance) {
        injectController(instance, this.controllerProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectController(LeaguesFragment instance, LeaguesController controller) {
        instance.controller = controller;
    }

    public static void injectAppLanguageObserver(LeaguesFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
