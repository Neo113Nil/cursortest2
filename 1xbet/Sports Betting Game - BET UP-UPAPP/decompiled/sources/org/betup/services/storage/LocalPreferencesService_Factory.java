package org.betup.services.storage;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.injection.provider.PreferencesProvider;

/* loaded from: classes2.dex */
public final class LocalPreferencesService_Factory implements Factory<LocalPreferencesService> {
    private final Provider<PreferencesProvider> preferencesProvider;

    public LocalPreferencesService_Factory(Provider<PreferencesProvider> preferencesProvider) {
        this.preferencesProvider = preferencesProvider;
    }

    @Override // javax.inject.Provider
    public LocalPreferencesService get() {
        return new LocalPreferencesService(this.preferencesProvider.get());
    }

    public static LocalPreferencesService_Factory create(Provider<PreferencesProvider> preferencesProvider) {
        return new LocalPreferencesService_Factory(preferencesProvider);
    }
}
