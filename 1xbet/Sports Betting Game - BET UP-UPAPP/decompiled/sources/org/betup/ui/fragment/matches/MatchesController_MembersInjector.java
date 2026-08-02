package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class MatchesController_MembersInjector implements MembersInjector<MatchesController> {
    private final Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider;
    private final Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider;
    private final Provider<NewSportsInteractor> sportsInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public MatchesController_MembersInjector(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider, Provider<UserService> userServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.sportsInteractorProvider = sportsInteractorProvider;
        this.putFavoriteSportsInteractorProvider = putFavoriteSportsInteractorProvider;
        this.deleteFavoriteSportsInteractorProvider = deleteFavoriteSportsInteractorProvider;
        this.putFavoriteSportsBulkInteractorProvider = putFavoriteSportsBulkInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<MatchesController> create(Provider<NewSportsInteractor> sportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider, Provider<UserService> userServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new MatchesController_MembersInjector(sportsInteractorProvider, putFavoriteSportsInteractorProvider, deleteFavoriteSportsInteractorProvider, putFavoriteSportsBulkInteractorProvider, userServiceProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchesController instance) {
        injectSportsInteractor(instance, this.sportsInteractorProvider.get());
        injectPutFavoriteSportsInteractor(instance, this.putFavoriteSportsInteractorProvider.get());
        injectDeleteFavoriteSportsInteractor(instance, this.deleteFavoriteSportsInteractorProvider.get());
        injectPutFavoriteSportsBulkInteractor(instance, this.putFavoriteSportsBulkInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectSportsInteractor(MatchesController instance, NewSportsInteractor sportsInteractor) {
        instance.sportsInteractor = sportsInteractor;
    }

    public static void injectPutFavoriteSportsInteractor(MatchesController instance, PutFavoriteSportsInteractor putFavoriteSportsInteractor) {
        instance.putFavoriteSportsInteractor = putFavoriteSportsInteractor;
    }

    public static void injectDeleteFavoriteSportsInteractor(MatchesController instance, DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor) {
        instance.deleteFavoriteSportsInteractor = deleteFavoriteSportsInteractor;
    }

    public static void injectPutFavoriteSportsBulkInteractor(MatchesController instance, PutFavoriteSportsBulkInteractor putFavoriteSportsBulkInteractor) {
        instance.putFavoriteSportsBulkInteractor = putFavoriteSportsBulkInteractor;
    }

    public static void injectUserService(MatchesController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectMatchFilterState(MatchesController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
