package org.betup.presentation;

import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PresentationScreens_Factory implements Factory<PresentationScreens> {
    private final Provider<PresentationScreenRegistryStore> registryStoreProvider;

    public PresentationScreens_Factory(Provider<PresentationScreenRegistryStore> registryStoreProvider) {
        this.registryStoreProvider = registryStoreProvider;
    }

    @Override // javax.inject.Provider
    public PresentationScreens get() {
        return new PresentationScreens(this.registryStoreProvider.get());
    }

    public static PresentationScreens_Factory create(Provider<PresentationScreenRegistryStore> registryStoreProvider) {
        return new PresentationScreens_Factory(registryStoreProvider);
    }
}
