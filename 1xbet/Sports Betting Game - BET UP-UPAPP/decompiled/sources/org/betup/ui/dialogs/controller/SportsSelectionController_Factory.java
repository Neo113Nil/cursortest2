package org.betup.ui.dialogs.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class SportsSelectionController_Factory implements Factory<SportsSelectionController> {
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewSportsInteractor> sportsInteractorProvider;

    public SportsSelectionController_Factory(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.sportsInteractorProvider = sportsInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    @Override // javax.inject.Provider
    public SportsSelectionController get() {
        SportsSelectionController sportsSelectionController = new SportsSelectionController();
        SportsSelectionController_MembersInjector.injectSportsInteractor(sportsSelectionController, this.sportsInteractorProvider.get());
        SportsSelectionController_MembersInjector.injectMatchFilterState(sportsSelectionController, this.matchFilterStateProvider.get());
        return sportsSelectionController;
    }

    public static SportsSelectionController_Factory create(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new SportsSelectionController_Factory(sportsInteractorProvider, matchFilterStateProvider);
    }

    public static SportsSelectionController newSportsSelectionController() {
        return new SportsSelectionController();
    }
}
