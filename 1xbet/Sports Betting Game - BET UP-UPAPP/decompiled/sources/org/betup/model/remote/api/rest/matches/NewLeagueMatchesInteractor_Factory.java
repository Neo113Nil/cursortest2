package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes2.dex */
public final class NewLeagueMatchesInteractor_Factory implements Factory<NewLeagueMatchesInteractor> {
    private final Provider<Context> contextProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;

    public NewLeagueMatchesInteractor_Factory(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.contextProvider = contextProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    @Override // javax.inject.Provider
    public NewLeagueMatchesInteractor get() {
        return new NewLeagueMatchesInteractor(this.contextProvider.get(), this.localPreferencesServiceProvider.get());
    }

    public static NewLeagueMatchesInteractor_Factory create(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new NewLeagueMatchesInteractor_Factory(contextProvider, localPreferencesServiceProvider);
    }
}
