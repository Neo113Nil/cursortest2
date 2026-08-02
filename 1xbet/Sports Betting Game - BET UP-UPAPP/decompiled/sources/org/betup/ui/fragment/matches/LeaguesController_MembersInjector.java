package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class LeaguesController_MembersInjector implements MembersInjector<LeaguesController> {
    private final Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider;
    private final Provider<NewLeaguesInteractor> leaguesInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider;
    private final Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public LeaguesController_MembersInjector(Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider, Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider, Provider<UserService> userServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.leaguesInteractorProvider = leaguesInteractorProvider;
        this.putFavoriteLeaguesInteractorProvider = putFavoriteLeaguesInteractorProvider;
        this.deleteFavoriteLeaguesInteractorProvider = deleteFavoriteLeaguesInteractorProvider;
        this.putFavoriteLeaguesBulkInteractorProvider = putFavoriteLeaguesBulkInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<LeaguesController> create(Provider<NewLeaguesInteractor> leaguesInteractorProvider, Provider<PutFavoriteLeaguesInteractor> putFavoriteLeaguesInteractorProvider, Provider<DeleteFavoriteLeaguesInteractor> deleteFavoriteLeaguesInteractorProvider, Provider<PutFavoriteLeaguesBulkInteractor> putFavoriteLeaguesBulkInteractorProvider, Provider<UserService> userServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new LeaguesController_MembersInjector(leaguesInteractorProvider, putFavoriteLeaguesInteractorProvider, deleteFavoriteLeaguesInteractorProvider, putFavoriteLeaguesBulkInteractorProvider, userServiceProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LeaguesController instance) {
        injectLeaguesInteractor(instance, this.leaguesInteractorProvider.get());
        injectPutFavoriteLeaguesInteractor(instance, this.putFavoriteLeaguesInteractorProvider.get());
        injectDeleteFavoriteLeaguesInteractor(instance, this.deleteFavoriteLeaguesInteractorProvider.get());
        injectPutFavoriteLeaguesBulkInteractor(instance, this.putFavoriteLeaguesBulkInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectLeaguesInteractor(LeaguesController instance, NewLeaguesInteractor leaguesInteractor) {
        instance.leaguesInteractor = leaguesInteractor;
    }

    public static void injectPutFavoriteLeaguesInteractor(LeaguesController instance, PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor) {
        instance.putFavoriteLeaguesInteractor = putFavoriteLeaguesInteractor;
    }

    public static void injectDeleteFavoriteLeaguesInteractor(LeaguesController instance, DeleteFavoriteLeaguesInteractor deleteFavoriteLeaguesInteractor) {
        instance.deleteFavoriteLeaguesInteractor = deleteFavoriteLeaguesInteractor;
    }

    public static void injectPutFavoriteLeaguesBulkInteractor(LeaguesController instance, PutFavoriteLeaguesBulkInteractor putFavoriteLeaguesBulkInteractor) {
        instance.putFavoriteLeaguesBulkInteractor = putFavoriteLeaguesBulkInteractor;
    }

    public static void injectUserService(LeaguesController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectMatchFilterState(LeaguesController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
