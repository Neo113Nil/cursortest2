package org.betup.ui.dialogs.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class MatchSelectionController_MembersInjector implements MembersInjector<MatchSelectionController> {
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewLeagueMatchesInteractor> matchesInteractorProvider;

    public MatchSelectionController_MembersInjector(Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.matchesInteractorProvider = matchesInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<MatchSelectionController> create(Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new MatchSelectionController_MembersInjector(matchesInteractorProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchSelectionController instance) {
        injectMatchesInteractor(instance, this.matchesInteractorProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectMatchesInteractor(MatchSelectionController instance, NewLeagueMatchesInteractor matchesInteractor) {
        instance.matchesInteractor = matchesInteractor;
    }

    public static void injectMatchFilterState(MatchSelectionController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
