package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PlaceBetInteractor_Factory implements Factory<PlaceBetInteractor> {
    private final Provider<Context> contextProvider;

    public PlaceBetInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PlaceBetInteractor get() {
        return new PlaceBetInteractor(this.contextProvider.get());
    }

    public static PlaceBetInteractor_Factory create(Provider<Context> contextProvider) {
        return new PlaceBetInteractor_Factory(contextProvider);
    }
}
