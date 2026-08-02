package org.betup.ui.fragment.matches;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.SportsByDateInteractor;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class SportsByDateController_Factory implements Factory<SportsByDateController> {
    private final Provider<DateFilterState> dateFilterStateProvider;
    private final Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider;
    private final Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider;
    private final Provider<SportsByDateInteractor> sportsInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public SportsByDateController_Factory(Provider<SportsByDateInteractor> sportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<UserService> userServiceProvider) {
        this.sportsInteractorProvider = sportsInteractorProvider;
        this.putFavoriteSportsInteractorProvider = putFavoriteSportsInteractorProvider;
        this.deleteFavoriteSportsInteractorProvider = deleteFavoriteSportsInteractorProvider;
        this.putFavoriteSportsBulkInteractorProvider = putFavoriteSportsBulkInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
        this.dateFilterStateProvider = dateFilterStateProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public SportsByDateController get() {
        SportsByDateController sportsByDateController = new SportsByDateController();
        SportsByDateController_MembersInjector.injectSportsInteractor(sportsByDateController, this.sportsInteractorProvider.get());
        SportsByDateController_MembersInjector.injectPutFavoriteSportsInteractor(sportsByDateController, this.putFavoriteSportsInteractorProvider.get());
        SportsByDateController_MembersInjector.injectDeleteFavoriteSportsInteractor(sportsByDateController, this.deleteFavoriteSportsInteractorProvider.get());
        SportsByDateController_MembersInjector.injectPutFavoriteSportsBulkInteractor(sportsByDateController, this.putFavoriteSportsBulkInteractorProvider.get());
        SportsByDateController_MembersInjector.injectMatchFilterState(sportsByDateController, this.matchFilterStateProvider.get());
        SportsByDateController_MembersInjector.injectDateFilterState(sportsByDateController, this.dateFilterStateProvider.get());
        SportsByDateController_MembersInjector.injectUserService(sportsByDateController, this.userServiceProvider.get());
        return sportsByDateController;
    }

    public static SportsByDateController_Factory create(Provider<SportsByDateInteractor> sportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<PutFavoriteSportsBulkInteractor> putFavoriteSportsBulkInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider, Provider<DateFilterState> dateFilterStateProvider, Provider<UserService> userServiceProvider) {
        return new SportsByDateController_Factory(sportsInteractorProvider, putFavoriteSportsInteractorProvider, deleteFavoriteSportsInteractorProvider, putFavoriteSportsBulkInteractorProvider, matchFilterStateProvider, dateFilterStateProvider, userServiceProvider);
    }

    public static SportsByDateController newSportsByDateController() {
        return new SportsByDateController();
    }
}
