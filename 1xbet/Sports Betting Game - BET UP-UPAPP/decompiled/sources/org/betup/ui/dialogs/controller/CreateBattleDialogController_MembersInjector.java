package org.betup.ui.dialogs.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class CreateBattleDialogController_MembersInjector implements MembersInjector<CreateBattleDialogController> {
    private final Provider<NewLeaguesInteractor> leaguesInteractorProvider;
    private final Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider;
    private final Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewLeagueMatchesInteractor> matchesInteractorProvider;
    private final Provider<NewSportsInteractor> sportsInteractorProvider;

    public CreateBattleDialogController_MembersInjector(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.sportsInteractorProvider = sportsInteractorProvider;
        this.leaguesInteractorProvider = leaguesInteractorProvider;
        this.matchesInteractorProvider = matchesInteractorProvider;
        this.matchBetGroupsInteractorProvider = matchBetGroupsInteractorProvider;
        this.matchDetailsInteractorProvider = matchDetailsInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<CreateBattleDialogController> create(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<NewLeagueMatchesInteractor> matchesInteractorProvider, Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new CreateBattleDialogController_MembersInjector(sportsInteractorProvider, leaguesInteractorProvider, matchesInteractorProvider, matchBetGroupsInteractorProvider, matchDetailsInteractorProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateBattleDialogController instance) {
        injectSportsInteractor(instance, this.sportsInteractorProvider.get());
        injectLeaguesInteractor(instance, this.leaguesInteractorProvider.get());
        injectMatchesInteractor(instance, this.matchesInteractorProvider.get());
        injectMatchBetGroupsInteractor(instance, this.matchBetGroupsInteractorProvider.get());
        injectMatchDetailsInteractor(instance, this.matchDetailsInteractorProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectSportsInteractor(CreateBattleDialogController instance, NewSportsInteractor sportsInteractor) {
        instance.sportsInteractor = sportsInteractor;
    }

    public static void injectLeaguesInteractor(CreateBattleDialogController instance, NewLeaguesInteractor leaguesInteractor) {
        instance.leaguesInteractor = leaguesInteractor;
    }

    public static void injectMatchesInteractor(CreateBattleDialogController instance, NewLeagueMatchesInteractor matchesInteractor) {
        instance.matchesInteractor = matchesInteractor;
    }

    public static void injectMatchBetGroupsInteractor(CreateBattleDialogController instance, MatchVarietiesInteractor matchBetGroupsInteractor) {
        instance.matchBetGroupsInteractor = matchBetGroupsInteractor;
    }

    public static void injectMatchDetailsInteractor(CreateBattleDialogController instance, MatchShortInfoInteractor matchDetailsInteractor) {
        instance.matchDetailsInteractor = matchDetailsInteractor;
    }

    public static void injectMatchFilterState(CreateBattleDialogController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
