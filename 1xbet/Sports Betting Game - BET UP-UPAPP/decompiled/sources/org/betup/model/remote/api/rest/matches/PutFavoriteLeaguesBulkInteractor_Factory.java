package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PutFavoriteLeaguesBulkInteractor_Factory implements Factory<PutFavoriteLeaguesBulkInteractor> {
    private final Provider<Context> contextProvider;

    public PutFavoriteLeaguesBulkInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteLeaguesBulkInteractor get() {
        return new PutFavoriteLeaguesBulkInteractor(this.contextProvider.get());
    }

    public static PutFavoriteLeaguesBulkInteractor_Factory create(Provider<Context> contextProvider) {
        return new PutFavoriteLeaguesBulkInteractor_Factory(contextProvider);
    }
}
