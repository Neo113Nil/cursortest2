package org.betup.ui.fragment.search.controller;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.search.V7SearchLeaguesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchMatchesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchTeamsInteractor;
import org.betup.model.remote.api.rest.search.V7SearchUsersInteractor;
import org.betup.model.remote.api.rest.search.V7TrendingItemsInteractor;

/* loaded from: classes4.dex */
public final class SearchController_MembersInjector implements MembersInjector<SearchController> {
    private final Provider<V7SearchLeaguesInteractor> searchLeaguesInteractorProvider;
    private final Provider<V7SearchMatchesInteractor> searchMatchesInteractorProvider;
    private final Provider<V7SearchTeamsInteractor> searchTeamsInteractorProvider;
    private final Provider<V7SearchUsersInteractor> searchUsersInteractorProvider;
    private final Provider<V7TrendingItemsInteractor> trendingItemsInteractorProvider;

    public SearchController_MembersInjector(Provider<V7SearchMatchesInteractor> searchMatchesInteractorProvider, Provider<V7SearchTeamsInteractor> searchTeamsInteractorProvider, Provider<V7SearchLeaguesInteractor> searchLeaguesInteractorProvider, Provider<V7SearchUsersInteractor> searchUsersInteractorProvider, Provider<V7TrendingItemsInteractor> trendingItemsInteractorProvider) {
        this.searchMatchesInteractorProvider = searchMatchesInteractorProvider;
        this.searchTeamsInteractorProvider = searchTeamsInteractorProvider;
        this.searchLeaguesInteractorProvider = searchLeaguesInteractorProvider;
        this.searchUsersInteractorProvider = searchUsersInteractorProvider;
        this.trendingItemsInteractorProvider = trendingItemsInteractorProvider;
    }

    public static MembersInjector<SearchController> create(Provider<V7SearchMatchesInteractor> searchMatchesInteractorProvider, Provider<V7SearchTeamsInteractor> searchTeamsInteractorProvider, Provider<V7SearchLeaguesInteractor> searchLeaguesInteractorProvider, Provider<V7SearchUsersInteractor> searchUsersInteractorProvider, Provider<V7TrendingItemsInteractor> trendingItemsInteractorProvider) {
        return new SearchController_MembersInjector(searchMatchesInteractorProvider, searchTeamsInteractorProvider, searchLeaguesInteractorProvider, searchUsersInteractorProvider, trendingItemsInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SearchController instance) {
        injectSearchMatchesInteractor(instance, this.searchMatchesInteractorProvider.get());
        injectSearchTeamsInteractor(instance, this.searchTeamsInteractorProvider.get());
        injectSearchLeaguesInteractor(instance, this.searchLeaguesInteractorProvider.get());
        injectSearchUsersInteractor(instance, this.searchUsersInteractorProvider.get());
        injectTrendingItemsInteractor(instance, this.trendingItemsInteractorProvider.get());
    }

    public static void injectSearchMatchesInteractor(SearchController instance, V7SearchMatchesInteractor searchMatchesInteractor) {
        instance.searchMatchesInteractor = searchMatchesInteractor;
    }

    public static void injectSearchTeamsInteractor(SearchController instance, V7SearchTeamsInteractor searchTeamsInteractor) {
        instance.searchTeamsInteractor = searchTeamsInteractor;
    }

    public static void injectSearchLeaguesInteractor(SearchController instance, V7SearchLeaguesInteractor searchLeaguesInteractor) {
        instance.searchLeaguesInteractor = searchLeaguesInteractor;
    }

    public static void injectSearchUsersInteractor(SearchController instance, V7SearchUsersInteractor searchUsersInteractor) {
        instance.searchUsersInteractor = searchUsersInteractor;
    }

    public static void injectTrendingItemsInteractor(SearchController instance, V7TrendingItemsInteractor trendingItemsInteractor) {
        instance.trendingItemsInteractor = trendingItemsInteractor;
    }
}
