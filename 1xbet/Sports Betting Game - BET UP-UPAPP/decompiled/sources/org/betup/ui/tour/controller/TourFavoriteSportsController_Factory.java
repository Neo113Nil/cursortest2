package org.betup.ui.tour.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes4.dex */
public final class TourFavoriteSportsController_Factory implements Factory<TourFavoriteSportsController> {
    private final Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewSportsInteractor> newSportsInteractorProvider;
    private final Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider;

    public TourFavoriteSportsController_Factory(Provider<NewSportsInteractor> newSportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.newSportsInteractorProvider = newSportsInteractorProvider;
        this.putFavoriteSportsInteractorProvider = putFavoriteSportsInteractorProvider;
        this.deleteFavoriteSportsInteractorProvider = deleteFavoriteSportsInteractorProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    @Override // javax.inject.Provider
    public TourFavoriteSportsController get() {
        return new TourFavoriteSportsController(this.newSportsInteractorProvider.get(), this.putFavoriteSportsInteractorProvider.get(), this.deleteFavoriteSportsInteractorProvider.get(), this.matchFilterStateProvider.get());
    }

    public static TourFavoriteSportsController_Factory create(Provider<NewSportsInteractor> newSportsInteractorProvider, Provider<PutFavoriteSportsInteractor> putFavoriteSportsInteractorProvider, Provider<DeleteFavoriteSportsInteractor> deleteFavoriteSportsInteractorProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new TourFavoriteSportsController_Factory(newSportsInteractorProvider, putFavoriteSportsInteractorProvider, deleteFavoriteSportsInteractorProvider, matchFilterStateProvider);
    }
}
