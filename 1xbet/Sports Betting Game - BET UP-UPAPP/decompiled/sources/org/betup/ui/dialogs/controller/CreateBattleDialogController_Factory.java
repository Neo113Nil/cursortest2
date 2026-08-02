package org.betup.ui.dialogs.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class CreateBattleDialogController_Factory implements Factory<CreateBattleDialogController> {
    private final Provider<NewLeaguesInteractor> leaguesInteractorProvider;
    private final Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider;
    private final Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewLeagueMatchesInteractor> matchesInteractorProvider;
    private final Provider<NewSportsInteractor> sportsInteractorProvider;

    public CreateBattleDialogController_Factory(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.sportsInteractorProvider = sportsInteractorProvider;
        this.leaguesInteractorProvider = leaguesInteractorProvider;
        this.matchesInteractorProvider = matchesInteractorProvider;
        this.matchBetGroupsInteractorProvider = matchBetGroupsInteractorProvider;
        this.matchDetailsInteractorProvider = matchDetailsInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    @Override // javax.inject.Provider
    public CreateBattleDialogController get() {
        CreateBattleDialogController createBattleDialogController = new CreateBattleDialogController();
        CreateBattleDialogController_MembersInjector.injectSportsInteractor(createBattleDialogController, this.sportsInteractorProvider.get());
        CreateBattleDialogController_MembersInjector.injectLeaguesInteractor(createBattleDialogController, this.leaguesInteractorProvider.get());
        CreateBattleDialogController_MembersInjector.injectMatchesInteractor(createBattleDialogController, this.matchesInteractorProvider.get());
        CreateBattleDialogController_MembersInjector.injectMatchBetGroupsInteractor(createBattleDialogController, this.matchBetGroupsInteractorProvider.get());
        CreateBattleDialogController_MembersInjector.injectMatchDetailsInteractor(createBattleDialogController, this.matchDetailsInteractorProvider.get());
        CreateBattleDialogController_MembersInjector.injectMatchFilterState(createBattleDialogController, this.matchFilterStateProvider.get());
        return createBattleDialogController;
    }

    public static CreateBattleDialogController_Factory create(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new CreateBattleDialogController_Factory(sportsInteractorProvider, leaguesInteractorProvider, matchesInteractorProvider, matchBetGroupsInteractorProvider, matchDetailsInteractorProvider, matchFilterStateProvider);
    }

    public static CreateBattleDialogController newCreateBattleDialogController() {
        return new CreateBattleDialogController();
    }
}
