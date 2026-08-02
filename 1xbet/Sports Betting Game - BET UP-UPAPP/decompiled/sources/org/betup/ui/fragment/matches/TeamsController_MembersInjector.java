package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteTeamsInteractor;
import org.betup.model.remote.api.rest.matches.NewTeamsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class TeamsController_MembersInjector implements MembersInjector<TeamsController> {
    private final Provider<DeleteFavoriteTeamsInteractor> deleteFavoriteTeamsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<PutFavoriteTeamsBulkInteractor> putFavoriteTeamsBulkInteractorProvider;
    private final Provider<PutFavoriteTeamsInteractor> putFavoriteTeamsInteractorProvider;
    private final Provider<NewTeamsInteractor> teamsInteractorProvider;

    public TeamsController_MembersInjector(Provider<NewTeamsInteractor> teamsInteractorProvider, Provider<PutFavoriteTeamsBulkInteractor> putFavoriteTeamsBulkInteractorProvider, Provider<PutFavoriteTeamsInteractor> putFavoriteTeamsInteractorProvider, Provider<DeleteFavoriteTeamsInteractor> deleteFavoriteTeamsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.teamsInteractorProvider = teamsInteractorProvider;
        this.putFavoriteTeamsBulkInteractorProvider = putFavoriteTeamsBulkInteractorProvider;
        this.putFavoriteTeamsInteractorProvider = putFavoriteTeamsInteractorProvider;
        this.deleteFavoriteTeamsInteractorProvider = deleteFavoriteTeamsInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<TeamsController> create(Provider<NewTeamsInteractor> teamsInteractorProvider, Provider<PutFavoriteTeamsBulkInteractor> putFavoriteTeamsBulkInteractorProvider, Provider<PutFavoriteTeamsInteractor> putFavoriteTeamsInteractorProvider, Provider<DeleteFavoriteTeamsInteractor> deleteFavoriteTeamsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new TeamsController_MembersInjector(teamsInteractorProvider, putFavoriteTeamsBulkInteractorProvider, putFavoriteTeamsInteractorProvider, deleteFavoriteTeamsInteractorProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TeamsController instance) {
        injectTeamsInteractor(instance, this.teamsInteractorProvider.get());
        injectPutFavoriteTeamsBulkInteractor(instance, this.putFavoriteTeamsBulkInteractorProvider.get());
        injectPutFavoriteTeamsInteractor(instance, this.putFavoriteTeamsInteractorProvider.get());
        injectDeleteFavoriteTeamsInteractor(instance, this.deleteFavoriteTeamsInteractorProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectTeamsInteractor(TeamsController instance, NewTeamsInteractor teamsInteractor) {
        instance.teamsInteractor = teamsInteractor;
    }

    public static void injectPutFavoriteTeamsBulkInteractor(TeamsController instance, PutFavoriteTeamsBulkInteractor putFavoriteTeamsBulkInteractor) {
        instance.putFavoriteTeamsBulkInteractor = putFavoriteTeamsBulkInteractor;
    }

    public static void injectPutFavoriteTeamsInteractor(TeamsController instance, PutFavoriteTeamsInteractor putFavoriteTeamsInteractor) {
        instance.putFavoriteTeamsInteractor = putFavoriteTeamsInteractor;
    }

    public static void injectDeleteFavoriteTeamsInteractor(TeamsController instance, DeleteFavoriteTeamsInteractor deleteFavoriteTeamsInteractor) {
        instance.deleteFavoriteTeamsInteractor = deleteFavoriteTeamsInteractor;
    }

    public static void injectMatchFilterState(TeamsController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
