package org.betup.presentation;

import dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class PresentationScreenRegistryStore_Factory implements Factory<PresentationScreenRegistryStore> {
    private static final PresentationScreenRegistryStore_Factory INSTANCE = new PresentationScreenRegistryStore_Factory();

    @Override // javax.inject.Provider
    public PresentationScreenRegistryStore get() {
        return new PresentationScreenRegistryStore();
    }

    public static PresentationScreenRegistryStore_Factory create() {
        return INSTANCE;
    }
}
