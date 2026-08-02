package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PutFavoriteLeaguesInteractor_Factory implements Factory<PutFavoriteLeaguesInteractor> {
    private final Provider<Context> contextProvider;

    public PutFavoriteLeaguesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteLeaguesInteractor get() {
        return new PutFavoriteLeaguesInteractor(this.contextProvider.get());
    }

    public static PutFavoriteLeaguesInteractor_Factory create(Provider<Context> contextProvider) {
        return new PutFavoriteLeaguesInteractor_Factory(contextProvider);
    }
}
