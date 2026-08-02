package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.language.AppLanguageObserver;
import org.betup.ui.fragment.matches.filter.DateFilterState;

/* loaded from: classes4.dex */
public final class LeaguesByDateFragment_MembersInjector implements MembersInjector<LeaguesByDateFragment> {
    private final Provider<AppLanguageObserver> appLanguageObserverProvider;
    private final Provider<LeaguesByDateController> controllerProvider;
    private final Provider<DateFilterState> dateFilterStateProvider;

    public LeaguesByDateFragment_MembersInjector(Provider<LeaguesByDateController> controllerProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        this.controllerProvider = controllerProvider;
        this.dateFilterStateProvider = dateFilterStateProvider;
        this.appLanguageObserverProvider = appLanguageObserverProvider;
    }

    public static MembersInjector<LeaguesByDateFragment> create(Provider<LeaguesByDateController> controllerProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<AppLanguageObserver> appLanguageObserverProvider) {
        return new LeaguesByDateFragment_MembersInjector(controllerProvider, dateFilterStateProvider, appLanguageObserverProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LeaguesByDateFragment instance) {
        injectController(instance, this.controllerProvider.get());
        injectDateFilterState(instance, this.dateFilterStateProvider.get());
        injectAppLanguageObserver(instance, this.appLanguageObserverProvider.get());
    }

    public static void injectController(LeaguesByDateFragment instance, LeaguesByDateController controller) {
        instance.controller = controller;
    }

    public static void injectDateFilterState(LeaguesByDateFragment instance, DateFilterState dateFilterState) {
        instance.dateFilterState = dateFilterState;
    }

    public static void injectAppLanguageObserver(LeaguesByDateFragment instance, AppLanguageObserver appLanguageObserver) {
        instance.appLanguageObserver = appLanguageObserver;
    }
}
