package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.storage.LocalPreferencesService;

/* loaded from: classes2.dex */
public final class HotMatchesInteractor_Factory implements Factory<HotMatchesInteractor> {
    private final Provider<Context> contextProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;

    public HotMatchesInteractor_Factory(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        this.contextProvider = contextProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
    }

    @Override // javax.inject.Provider
    public HotMatchesInteractor get() {
        return new HotMatchesInteractor(this.contextProvider.get(), this.localPreferencesServiceProvider.get());
    }

    public static HotMatchesInteractor_Factory create(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider) {
        return new HotMatchesInteractor_Factory(contextProvider, localPreferencesServiceProvider);
    }
}
