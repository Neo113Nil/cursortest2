package org.betup.ui.fragment.matches;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.LeaguesByDateInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class LeaguesByDateController_Factory implements Factory<LeaguesByDateController> {
    private final Provider<DateFilterState> dateFilterStateProvider;
    private final Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider;
    private final Provider<LeaguesByDateInteractor> leaguesInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider;
    private final Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider;

    public LeaguesByDateController_Factory(Provider<LeaguesByDateInteractor> leaguesInteractorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider, Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider) {
        this.leaguesInteractorProvider = leaguesInteractorProvider;
        this.putFavoriteLeaguesInteractorProvider = putFavoriteLeaguesInteractorProvider;
        this.deleteFavoriteLeaguesInteractorProvider = deleteFavoriteLeaguesInteractorProvider;
        this.putFavoriteLeaguesBulkInteractorProvider = putFavoriteLeaguesBulkInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
        this.dateFilterStateProvider = dateFilterStateProvider;
    }

    @Override // javax.inject.Provider
    public LeaguesByDateController get() {
        LeaguesByDateController leaguesByDateController = new LeaguesByDateController();
        LeaguesByDateController_MembersInjector.injectLeaguesInteractor(leaguesByDateController, this.leaguesInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectPutFavoriteLeaguesInteractor(leaguesByDateController, this.putFavoriteLeaguesInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectDeleteFavoriteLeaguesInteractor(leaguesByDateController, this.deleteFavoriteLeaguesInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectPutFavoriteLeaguesBulkInteractor(leaguesByDateController, this.putFavoriteLeaguesBulkInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectMatchFilterState(leaguesByDateController, this.matchFilterStateProvider.get());
        LeaguesByDateController_MembersInjector.injectDateFilterState(leaguesByDateController, this.dateFilterStateProvider.get());
        return leaguesByDateController;
    }

    public static LeaguesByDateController_Factory create(Provider<LeaguesByDateInteractor> leaguesInteractorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider, Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider) {
        return new LeaguesByDateController_Factory(leaguesInteractorProvider, putFavoriteLeaguesInteractorProvider, deleteFavoriteLeaguesInteractorProvider, putFavoriteLeaguesBulkInteractorProvider, matchFilterStateProvider, dateFilterStateProvider);
    }

    public static LeaguesByDateController newLeaguesByDateController() {
        return new LeaguesByDateController();
    }
}
