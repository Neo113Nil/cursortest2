package org.betup.ui.dialogs.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class SportsSelectionController_MembersInjector implements MembersInjector<SportsSelectionController> {
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewSportsInteractor> sportsInteractorProvider;

    public SportsSelectionController_MembersInjector(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.sportsInteractorProvider = sportsInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<SportsSelectionController> create(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new SportsSelectionController_MembersInjector(sportsInteractorProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SportsSelectionController instance) {
        injectSportsInteractor(instance, this.sportsInteractorProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectSportsInteractor(SportsSelectionController instance, NewSportsInteractor sportsInteractor) {
        instance.sportsInteractor = sportsInteractor;
    }

    public static void injectMatchFilterState(SportsSelectionController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
