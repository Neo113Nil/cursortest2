package org.betup.ui.fragment.matches;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes4.dex */
public final class TopMatchesFragment_MembersInjector implements MembersInjector<TopMatchesFragment> {
    private final Provider<HotMatchesInteractor> hotMatchesInteractorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;

    public TopMatchesFragment_MembersInjector(Provider<HotMatchesInteractor> hotMatchesInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.hotMatchesInteractorProvider = hotMatchesInteractorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    public static MembersInjector<TopMatchesFragment> create(Provider<HotMatchesInteractor> hotMatchesInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new TopMatchesFragment_MembersInjector(hotMatchesInteractorProvider, localPreferencesServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TopMatchesFragment instance) {
        injectHotMatchesInteractor(instance, this.hotMatchesInteractorProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
    }

    public static void injectHotMatchesInteractor(TopMatchesFragment instance, HotMatchesInteractor hotMatchesInteractor) {
        instance.hotMatchesInteractor = hotMatchesInteractor;
    }

    public static void injectLocalPreferencesService(TopMatchesFragment instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }
}
