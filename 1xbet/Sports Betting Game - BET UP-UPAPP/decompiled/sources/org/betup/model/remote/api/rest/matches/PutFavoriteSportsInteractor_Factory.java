package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PutFavoriteSportsInteractor_Factory implements Factory<PutFavoriteSportsInteractor> {
    private final Provider<Context> contextProvider;

    public PutFavoriteSportsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteSportsInteractor get() {
        return new PutFavoriteSportsInteractor(this.contextProvider.get());
    }

    public static PutFavoriteSportsInteractor_Factory create(Provider<Context> contextProvider) {
        return new PutFavoriteSportsInteractor_Factory(contextProvider);
    }
}
