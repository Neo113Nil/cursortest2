package org.betup.ui.fragment.search;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.search.RecentSearchesService;

/* loaded from: classes4.dex */
public final class SearchBottomSheetFragment_MembersInjector implements MembersInjector<SearchBottomSheetFragment> {
    private final Provider<RecentSearchesService> recentSearchesServiceProvider;
    private final Provider<org.betup.ui.fragment.search.controller.SearchController> searchControllerProvider;

    public SearchBottomSheetFragment_MembersInjector(Provider<org.betup.ui.fragment.search.controller.SearchController> searchControllerProvider, Provider<RecentSearchesService> recentSearchesServiceProvider) {
        this.searchControllerProvider = searchControllerProvider;
        this.recentSearchesServiceProvider = recentSearchesServiceProvider;
    }

    public static MembersInjector<SearchBottomSheetFragment> create(Provider<org.betup.ui.fragment.search.controller.SearchController> searchControllerProvider, Provider<RecentSearchesService> recentSearchesServiceProvider) {
        return new SearchBottomSheetFragment_MembersInjector(searchControllerProvider, recentSearchesServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SearchBottomSheetFragment instance) {
        injectSearchController(instance, this.searchControllerProvider.get());
        injectRecentSearchesService(instance, this.recentSearchesServiceProvider.get());
    }

    public static void injectSearchController(SearchBottomSheetFragment instance, org.betup.ui.fragment.search.controller.SearchController searchController) {
        instance.searchController = searchController;
    }

    public static void injectRecentSearchesService(SearchBottomSheetFragment instance, RecentSearchesService recentSearchesService) {
        instance.recentSearchesService = recentSearchesService;
    }
}
