package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.LeaguesByDateInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class LeaguesByDateController_MembersInjector implements MembersInjector<LeaguesByDateController> {
    private final Provider<DateFilterState> dateFilterStateProvider;
    private final Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider;
    private final Provider<LeaguesByDateInteractor> leaguesInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider;
    private final Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider;

    public LeaguesByDateController_MembersInjector(Provider<LeaguesByDateInteractor> leaguesInteractorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider, Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider) {
        this.leaguesInteractorProvider = leaguesInteractorProvider;
        this.putFavoriteLeaguesInteractorProvider = putFavoriteLeaguesInteractorProvider;
        this.deleteFavoriteLeaguesInteractorProvider = deleteFavoriteLeaguesInteractorProvider;
        this.putFavoriteLeaguesBulkInteractorProvider = putFavoriteLeaguesBulkInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
        this.dateFilterStateProvider = dateFilterStateProvider;
    }

    public static MembersInjector<LeaguesByDateController> create(Provider<LeaguesByDateInteractor> leaguesInteractorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider, Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider) {
        return new LeaguesByDateController_MembersInjector(leaguesInteractorProvider, putFavoriteLeaguesInteractorProvider, deleteFavoriteLeaguesInteractorProvider, putFavoriteLeaguesBulkInteractorProvider, matchFilterStateProvider, dateFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LeaguesByDateController instance) {
        injectLeaguesInteractor(instance, this.leaguesInteractorProvider.get());
        injectPutFavoriteLeaguesInteractor(instance, this.putFavoriteLeaguesInteractorProvider.get());
        injectDeleteFavoriteLeaguesInteractor(instance, this.deleteFavoriteLeaguesInteractorProvider.get());
        injectPutFavoriteLeaguesBulkInteractor(instance, this.putFavoriteLeaguesBulkInteractorProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
        injectDateFilterState(instance, this.dateFilterStateProvider.get());
    }

    public static void injectLeaguesInteractor(LeaguesByDateController instance, LeaguesByDateInteractor leaguesInteractor) {
        instance.leaguesInteractor = leaguesInteractor;
    }

    public static void injectPutFavoriteLeaguesInteractor(LeaguesByDateController instance, PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor) {
        instance.putFavoriteLeaguesInteractor = putFavoriteLeaguesInteractor;
    }

    public static void injectDeleteFavoriteLeaguesInteractor(LeaguesByDateController instance, DeleteFavoriteLeaguesInteractor deleteFavoriteLeaguesInteractor) {
        instance.deleteFavoriteLeaguesInteractor = deleteFavoriteLeaguesInteractor;
    }

    public static void injectPutFavoriteLeaguesBulkInteractor(LeaguesByDateController instance, PutFavoriteLeaguesBulkInteractor putFavoriteLeaguesBulkInteractor) {
        instance.putFavoriteLeaguesBulkInteractor = putFavoriteLeaguesBulkInteractor;
    }

    public static void injectMatchFilterState(LeaguesByDateController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }

    public static void injectDateFilterState(LeaguesByDateController instance, DateFilterState dateFilterState) {
        instance.dateFilterState = dateFilterState;
    }
}
