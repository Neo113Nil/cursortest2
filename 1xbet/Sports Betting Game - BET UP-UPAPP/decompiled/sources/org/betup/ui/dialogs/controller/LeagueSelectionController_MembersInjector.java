package org.betup.ui.dialogs.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class LeagueSelectionController_MembersInjector implements MembersInjector<LeagueSelectionController> {
    private final Provider<NewLeaguesInteractor> leaguesInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;

    public LeagueSelectionController_MembersInjector(Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.leaguesInteractorProvider = leaguesInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<LeagueSelectionController> create(Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new LeagueSelectionController_MembersInjector(leaguesInteractorProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LeagueSelectionController instance) {
        injectLeaguesInteractor(instance, this.leaguesInteractorProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectLeaguesInteractor(LeagueSelectionController instance, NewLeaguesInteractor leaguesInteractor) {
        instance.leaguesInteractor = leaguesInteractor;
    }

    public static void injectMatchFilterState(LeagueSelectionController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
