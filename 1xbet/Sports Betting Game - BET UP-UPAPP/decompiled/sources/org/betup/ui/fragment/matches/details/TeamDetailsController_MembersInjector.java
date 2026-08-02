package org.betup.ui.fragment.matches.details;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.GetFavoriteTeamIdsInteractor;
import org.betup.model.remote.api.rest.matches.GetTeamDetailsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsInteractor;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class TeamDetailsController_MembersInjector implements MembersInjector<TeamDetailsController> {
    private final Provider<GetFavoriteTeamIdsInteractor> getFavoriteTeamIdsInteractorProvider;
    private final Provider<GetTeamDetailsInteractor> getTeamDetailsInteractorProvider;
    private final Provider<PutFavoriteTeamsInteractor> putFavoriteTeamsInteractorProvider;
    private final Provider<UserService> userServiceProvider;

    public TeamDetailsController_MembersInjector(Provider<GetTeamDetailsInteractor> getTeamDetailsInteractorProvider, Provider<GetFavoriteTeamIdsInteractor> getFavoriteTeamIdsInteractorProvider, Provider<PutFavoriteTeamsInteractor> putFavoriteTeamsInteractorProvider, Provider<UserService> userServiceProvider) {
        this.getTeamDetailsInteractorProvider = getTeamDetailsInteractorProvider;
        this.getFavoriteTeamIdsInteractorProvider = getFavoriteTeamIdsInteractorProvider;
        this.putFavoriteTeamsInteractorProvider = putFavoriteTeamsInteractorProvider;
        this.userServiceProvider = userServiceProvider;
    }

    public static MembersInjector<TeamDetailsController> create(Provider<GetTeamDetailsInteractor> getTeamDetailsInteractorProvider, Provider<GetFavoriteTeamIdsInteractor> getFavoriteTeamIdsInteractorProvider, Provider<PutFavoriteTeamsInteractor> putFavoriteTeamsInteractorProvider, Provider<UserService> userServiceProvider) {
        return new TeamDetailsController_MembersInjector(getTeamDetailsInteractorProvider, getFavoriteTeamIdsInteractorProvider, putFavoriteTeamsInteractorProvider, userServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TeamDetailsController instance) {
        injectGetTeamDetailsInteractor(instance, this.getTeamDetailsInteractorProvider.get());
        injectGetFavoriteTeamIdsInteractor(instance, this.getFavoriteTeamIdsInteractorProvider.get());
        injectPutFavoriteTeamsInteractor(instance, this.putFavoriteTeamsInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
    }

    public static void injectGetTeamDetailsInteractor(TeamDetailsController instance, GetTeamDetailsInteractor getTeamDetailsInteractor) {
        instance.getTeamDetailsInteractor = getTeamDetailsInteractor;
    }

    public static void injectGetFavoriteTeamIdsInteractor(TeamDetailsController instance, GetFavoriteTeamIdsInteractor getFavoriteTeamIdsInteractor) {
        instance.getFavoriteTeamIdsInteractor = getFavoriteTeamIdsInteractor;
    }

    public static void injectPutFavoriteTeamsInteractor(TeamDetailsController instance, PutFavoriteTeamsInteractor putFavoriteTeamsInteractor) {
        instance.putFavoriteTeamsInteractor = putFavoriteTeamsInteractor;
    }

    public static void injectUserService(TeamDetailsController instance, UserService userService) {
        instance.userService = userService;
    }
}
