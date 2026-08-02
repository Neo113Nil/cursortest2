package org.betup.ui.fragment.search;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.search.RecentSearchesService;

/* loaded from: classes4.dex */
public final class NewSearchFragment_MembersInjector implements MembersInjector<NewSearchFragment> {
    private final Provider<RecentSearchesService> recentSearchesServiceProvider;
    private final Provider<org.betup.ui.fragment.search.controller.SearchController> searchControllerProvider;

    public NewSearchFragment_MembersInjector(Provider<org.betup.ui.fragment.search.controller.SearchController> searchControllerProvider, Provider<RecentSearchesService> recentSearchesServiceProvider) {
        this.searchControllerProvider = searchControllerProvider;
        this.recentSearchesServiceProvider = recentSearchesServiceProvider;
    }

    public static MembersInjector<NewSearchFragment> create(Provider<org.betup.ui.fragment.search.controller.SearchController> searchControllerProvider, Provider<RecentSearchesService> recentSearchesServiceProvider) {
        return new NewSearchFragment_MembersInjector(searchControllerProvider, recentSearchesServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewSearchFragment instance) {
        injectSearchController(instance, this.searchControllerProvider.get());
        injectRecentSearchesService(instance, this.recentSearchesServiceProvider.get());
    }

    public static void injectSearchController(NewSearchFragment instance, org.betup.ui.fragment.search.controller.SearchController searchController) {
        instance.searchController = searchController;
    }

    public static void injectRecentSearchesService(NewSearchFragment instance, RecentSearchesService recentSearchesService) {
        instance.recentSearchesService = recentSearchesService;
    }
}
