package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.language.AppLanguageObserver;

/* loaded from: classes4.dex */
public final class MatchesTabsFragment_MembersInjector implements MembersInjector<MatchesTabsFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<MatchesController> controllerProvider;

    public MatchesTabsFragment_MembersInjector(Provider<MatchesController> controllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.controllerProvider = controllerProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<MatchesTabsFragment> create(Provider<MatchesController> controllerProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new MatchesTabsFragment_MembersInjector(controllerProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchesTabsFragment instance) {
        injectController(instance, this.controllerProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectController(MatchesTabsFragment instance, MatchesController controller) {
        instance.controller = controller;
    }

    public static void injectAppLanguageObserver(MatchesTabsFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
