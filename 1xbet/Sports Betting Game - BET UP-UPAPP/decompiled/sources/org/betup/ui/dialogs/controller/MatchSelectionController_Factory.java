package org.betup.ui.dialogs.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class MatchSelectionController_Factory implements Factory<MatchSelectionController> {
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewLeagueMatchesInteractor> matchesInteractorProvider;

    public MatchSelectionController_Factory(Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.matchesInteractorProvider = matchesInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    @Override // javax.inject.Provider
    public MatchSelectionController get() {
        MatchSelectionController matchSelectionController = new MatchSelectionController();
        MatchSelectionController_MembersInjector.injectMatchesInteractor(matchSelectionController, this.matchesInteractorProvider.get());
        MatchSelectionController_MembersInjector.injectMatchFilterState(matchSelectionController, this.matchFilterStateProvider.get());
        return matchSelectionController;
    }

    public static MatchSelectionController_Factory create(Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new MatchSelectionController_Factory(matchesInteractorProvider, matchFilterStateProvider);
    }

    public static MatchSelectionController newMatchSelectionController() {
        return new MatchSelectionController();
    }
}
