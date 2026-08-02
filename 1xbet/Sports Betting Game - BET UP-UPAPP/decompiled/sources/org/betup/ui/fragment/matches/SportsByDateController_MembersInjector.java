package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.SportsByDateInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class SportsByDateController_MembersInjector implements MembersInjector<SportsByDateController> {
    private final Provider<DateFilterState> dateFilterStateProvider;
    private final Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider;
    private final Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider;
    private final Provider<SportsByDateInteractor> sportsInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public SportsByDateController_MembersInjector(Provider<SportsByDateInteractor> sportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<UserService> userServiceProvider) {
        this.sportsInteractorProvider = sportsInteractorProvider;
        this.putFavoriteSportsInteractorProvider = putFavoriteSportsInteractorProvider;
        this.deleteFavoriteSportsInteractorProvider = deleteFavoriteSportsInteractorProvider;
        this.putFavoriteSportsBulkInteractorProvider = putFavoriteSportsBulkInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
        this.dateFilterStateProvider = dateFilterStateProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<SportsByDateController> create(Provider<SportsByDateInteractor> sportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<UserService> userServiceProvider) {
        return new SportsByDateController_MembersInjector(sportsInteractorProvider, putFavoriteSportsInteractorProvider, deleteFavoriteSportsInteractorProvider, putFavoriteSportsBulkInteractorProvider, matchFilterStateProvider, dateFilterStateProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SportsByDateController instance) {
        injectSportsInteractor(instance, this.sportsInteractorProvider.get());
        injectPutFavoriteSportsInteractor(instance, this.putFavoriteSportsInteractorProvider.get());
        injectDeleteFavoriteSportsInteractor(instance, this.deleteFavoriteSportsInteractorProvider.get());
        injectPutFavoriteSportsBulkInteractor(instance, this.putFavoriteSportsBulkInteractorProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
        injectDateFilterState(instance, this.dateFilterStateProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectSportsInteractor(SportsByDateController instance, SportsByDateInteractor sportsInteractor) {
        instance.sportsInteractor = sportsInteractor;
    }

    public static void injectPutFavoriteSportsInteractor(SportsByDateController instance, PutFavoriteSportsInteractor putFavoriteSportsInteractor) {
        instance.putFavoriteSportsInteractor = putFavoriteSportsInteractor;
    }

    public static void injectDeleteFavoriteSportsInteractor(SportsByDateController instance, DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor) {
        instance.deleteFavoriteSportsInteractor = deleteFavoriteSportsInteractor;
    }

    public static void injectPutFavoriteSportsBulkInteractor(SportsByDateController instance, PutFavoriteSportsBulkInteractor putFavoriteSportsBulkInteractor) {
        instance.putFavoriteSportsBulkInteractor = putFavoriteSportsBulkInteractor;
    }

    public static void injectMatchFilterState(SportsByDateController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }

    public static void injectDateFilterState(SportsByDateController instance, DateFilterState dateFilterState) {
        instance.dateFilterState = dateFilterState;
    }

    public static void injectUserService(SportsByDateController instance, UserService userService) {
        instance.userService = userService;
    }
}
