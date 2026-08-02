package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PutFavoriteTeamsInteractor_Factory implements Factory<PutFavoriteTeamsInteractor> {
    private final Provider<Context> contextProvider;

    public PutFavoriteTeamsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteTeamsInteractor get() {
        return new PutFavoriteTeamsInteractor(this.contextProvider.get());
    }

    public static PutFavoriteTeamsInteractor_Factory create(Provider<Context> contextProvider) {
        return new PutFavoriteTeamsInteractor_Factory(contextProvider);
    }
}
