package org.betup.ui.fragment.search.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.search.V7SearchLeaguesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchMatchesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchTeamsInteractor;
import org.betup.model.remote.api.rest.search.V7SearchUsersInteractor;
import org.betup.model.remote.api.rest.search.V7TrendingItemsInteractor;

/* loaded from: classes4.dex */
public final class SearchController_Factory implements Factory<SearchController> {
    private final Provider<V7SearchLeaguesInteractor> searchLeaguesInteractorProvider;
    private final Provider<V7SearchMatchesInteractor> searchMatchesInteractorProvider;
    private final Provider<V7SearchTeamsInteractor> searchTeamsInteractorProvider;
    private final Provider<V7SearchUsersInteractor> searchUsersInteractorProvider;
    private final Provider<V7TrendingItemsInteractor> trendingItemsInteractorProvider;

    public SearchController_Factory(Provider<V7SearchMatchesInteractor> searchMatchesInteractorProvider, Provider<V7SearchTeamsInteractor> searchTeamsInteractorProvider, Provider<V7SearchLeaguesInteractor> searchLeaguesInteractorProvider, Provider<V7SearchUsersInteractor> searchUsersInteractorProvider, Provider<V7TrendingItemsInteractor> trendingItemsInteractorProvider) {
        this.searchMatchesInteractorProvider = searchMatchesInteractorProvider;
        this.searchTeamsInteractorProvider = searchTeamsInteractorProvider;
        this.searchLeaguesInteractorProvider = searchLeaguesInteractorProvider;
        this.searchUsersInteractorProvider = searchUsersInteractorProvider;
        this.trendingItemsInteractorProvider = trendingItemsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public SearchController get() {
        SearchController searchController = new SearchController();
        SearchController_MembersInjector.injectSearchMatchesInteractor(searchController, this.searchMatchesInteractorProvider.get());
        SearchController_MembersInjector.injectSearchTeamsInteractor(searchController, this.searchTeamsInteractorProvider.get());
        SearchController_MembersInjector.injectSearchLeaguesInteractor(searchController, this.searchLeaguesInteractorProvider.get());
        SearchController_MembersInjector.injectSearchUsersInteractor(searchController, this.searchUsersInteractorProvider.get());
        SearchController_MembersInjector.injectTrendingItemsInteractor(searchController, this.trendingItemsInteractorProvider.get());
        return searchController;
    }

    public static SearchController_Factory create(Provider<V7SearchMatchesInteractor> searchMatchesInteractorProvider, Provider<V7SearchTeamsInteractor> searchTeamsInteractorProvider, Provider<V7SearchLeaguesInteractor> searchLeaguesInteractorProvider, Provider<V7SearchUsersInteractor> searchUsersInteractorProvider, Provider<V7TrendingItemsInteractor> trendingItemsInteractorProvider) {
        return new SearchController_Factory(searchMatchesInteractorProvider, searchTeamsInteractorProvider, searchLeaguesInteractorProvider, searchUsersInteractorProvider, trendingItemsInteractorProvider);
    }

    public static SearchController newSearchController() {
        return new SearchController();
    }
}
