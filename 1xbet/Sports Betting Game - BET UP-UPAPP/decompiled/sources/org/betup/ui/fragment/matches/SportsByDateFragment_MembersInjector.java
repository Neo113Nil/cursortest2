package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.language.AppLanguageObserver;
import org.betup.ui.fragment.matches.filter.DateFilterState;

/* loaded from: classes4.dex */
public final class SportsByDateFragment_MembersInjector implements MembersInjector<SportsByDateFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<SportsByDateController> controllerProvider;
    private final Provider<DateFilterState> dateFilterStateProvider;

    public SportsByDateFragment_MembersInjector(Provider<SportsByDateController> controllerProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.controllerProvider = controllerProvider;
        this.dateFilterStateProvider = dateFilterStateProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<SportsByDateFragment> create(Provider<SportsByDateController> controllerProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new SportsByDateFragment_MembersInjector(controllerProvider, dateFilterStateProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SportsByDateFragment instance) {
        injectController(instance, this.controllerProvider.get());
        injectDateFilterState(instance, this.dateFilterStateProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectController(SportsByDateFragment instance, SportsByDateController controller) {
        instance.controller = controller;
    }

    public static void injectDateFilterState(SportsByDateFragment instance, DateFilterState dateFilterState) {
        instance.dateFilterState = dateFilterState;
    }

    public static void injectAppLanguageObserver(SportsByDateFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
