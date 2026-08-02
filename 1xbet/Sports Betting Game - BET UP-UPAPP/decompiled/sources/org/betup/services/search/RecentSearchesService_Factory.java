package org.betup.services.search;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class RecentSearchesService_Factory implements Factory<RecentSearchesService> {
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<UserService> userServiceProvider;

    public RecentSearchesService_Factory(Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<UserService> userServiceProvider) {
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.userServiceProvider = userServiceProvider;
    }

    @Override // javax.inject.Provider
    public RecentSearchesService get() {
        return new RecentSearchesService(this.localPreferencesServiceProvider.get(), this.userServiceProvider.get());
    }

    public static RecentSearchesService_Factory create(Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<UserService> userServiceProvider) {
        return new RecentSearchesService_Factory(localPreferencesServiceProvider, userServiceProvider);
    }
}
