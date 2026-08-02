package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.tour.controller.TourFavoriteSportsController;

/* loaded from: classes2.dex */
public final class RestModule_ProvideTourFavoriteSportsControllerFactory implements Factory<TourFavoriteSportsController> {
    private final Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final RestModule module;
    private final Provider<NewSportsInteractor> newSportsInteractorProvider;
    private final Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider;

    public RestModule_ProvideTourFavoriteSportsControllerFactory(RestModule module, Provider<NewSportsInteractor> newSportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.module = module;
        this.newSportsInteractorProvider = newSportsInteractorProvider;
        this.putFavoriteSportsInteractorProvider = putFavoriteSportsInteractorProvider;
        this.deleteFavoriteSportsInteractorProvider = deleteFavoriteSportsInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    @Override // javax.inject.Provider
    public TourFavoriteSportsController get() {
        return (TourFavoriteSportsController) Preconditions.checkNotNull(this.module.provideTourFavoriteSportsController(this.newSportsInteractorProvider.get(), this.putFavoriteSportsInteractorProvider.get(), this.deleteFavoriteSportsInteractorProvider.get(), this.matchFilterStateProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideTourFavoriteSportsControllerFactory create(RestModule module, Provider<NewSportsInteractor> newSportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new RestModule_ProvideTourFavoriteSportsControllerFactory(module, newSportsInteractorProvider, putFavoriteSportsInteractorProvider, deleteFavoriteSportsInteractorProvider, matchFilterStateProvider);
    }

    public static TourFavoriteSportsController proxyProvideTourFavoriteSportsController(RestModule instance, NewSportsInteractor newSportsInteractor, PutFavoriteSportsInteractor putFavoriteSportsInteractor, DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor, MatchFilterState matchFilterState) {
        return (TourFavoriteSportsController) Preconditions.checkNotNull(instance.provideTourFavoriteSportsController(newSportsInteractor, putFavoriteSportsInteractor, deleteFavoriteSportsInteractor, matchFilterState), "Cannot return null from a non-@Nullable @Provides method");
    }
}
