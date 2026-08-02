package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes2.dex */
public final class MatchesByDateInteractor_Factory implements Factory<MatchesByDateInteractor> {
    private final Provider<Context> contextProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;

    public MatchesByDateInteractor_Factory(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.contextProvider = contextProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    @Override // javax.inject.Provider
    public MatchesByDateInteractor get() {
        return new MatchesByDateInteractor(this.contextProvider.get(), this.localPreferencesServiceProvider.get());
    }

    public static MatchesByDateInteractor_Factory create(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new MatchesByDateInteractor_Factory(contextProvider, localPreferencesServiceProvider);
    }
}
