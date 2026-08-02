package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.GetFavoriteTeamIdsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetFavoriteTeamIdsInteractorFactory implements Factory<GetFavoriteTeamIdsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetFavoriteTeamIdsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFavoriteTeamIdsInteractor get() {
        return (GetFavoriteTeamIdsInteractor) Preconditions.checkNotNull(this.module.provideGetFavoriteTeamIdsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetFavoriteTeamIdsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetFavoriteTeamIdsInteractorFactory(module, contextProvider);
    }

    public static GetFavoriteTeamIdsInteractor proxyProvideGetFavoriteTeamIdsInteractor(RestModule instance, Context context) {
        return (GetFavoriteTeamIdsInteractor) Preconditions.checkNotNull(instance.provideGetFavoriteTeamIdsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
