package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class PutFavoriteTeamsBulkInteractor_Factory implements Factory<PutFavoriteTeamsBulkInteractor> {
    private final Provider<Context> contextProvider;

    public PutFavoriteTeamsBulkInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteTeamsBulkInteractor get() {
        return new PutFavoriteTeamsBulkInteractor(this.contextProvider.get());
    }

    public static PutFavoriteTeamsBulkInteractor_Factory create(Provider<Context> contextProvider) {
        return new PutFavoriteTeamsBulkInteractor_Factory(contextProvider);
    }
}
