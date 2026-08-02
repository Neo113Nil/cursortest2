package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class NewSpecificChampionshipInteractor_Factory implements Factory<NewSpecificChampionshipInteractor> {
    private final Provider<Context> contextProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public NewSpecificChampionshipInteractor_Factory(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<UserService> userServiceProvider) {
        this.contextProvider = contextProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public NewSpecificChampionshipInteractor get() {
        return new NewSpecificChampionshipInteractor(this.contextProvider.get(), this.localPreferencesServiceProvider.get(), this.userServiceProvider.get());
    }

    public static NewSpecificChampionshipInteractor_Factory create(Provider<Context> contextProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<UserService> userServiceProvider) {
        return new NewSpecificChampionshipInteractor_Factory(contextProvider, localPreferencesServiceProvider, userServiceProvider);
    }
}
