package org.betup.ui.dialogs.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class LeagueSelectionController_Factory implements Factory<LeagueSelectionController> {
    private final Provider<NewLeaguesInteractor> leaguesInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;

    public LeagueSelectionController_Factory(Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.leaguesInteractorProvider = leaguesInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    @Override // javax.inject.Provider
    public LeagueSelectionController get() {
        LeagueSelectionController leagueSelectionController = new LeagueSelectionController();
        LeagueSelectionController_MembersInjector.injectLeaguesInteractor(leagueSelectionController, this.leaguesInteractorProvider.get());
        LeagueSelectionController_MembersInjector.injectMatchFilterState(leagueSelectionController, this.matchFilterStateProvider.get());
        return leagueSelectionController;
    }

    public static LeagueSelectionController_Factory create(Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new LeagueSelectionController_Factory(leaguesInteractorProvider, matchFilterStateProvider);
    }

    public static LeagueSelectionController newLeagueSelectionController() {
        return new LeagueSelectionController();
    }
}
