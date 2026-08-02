package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetFavoriteTeamIdsInteractor_Factory implements Factory<GetFavoriteTeamIdsInteractor> {
    private final Provider<Context> contextProvider;

    public GetFavoriteTeamIdsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFavoriteTeamIdsInteractor get() {
        return new GetFavoriteTeamIdsInteractor(this.contextProvider.get());
    }

    public static GetFavoriteTeamIdsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetFavoriteTeamIdsInteractor_Factory(contextProvider);
    }
}
