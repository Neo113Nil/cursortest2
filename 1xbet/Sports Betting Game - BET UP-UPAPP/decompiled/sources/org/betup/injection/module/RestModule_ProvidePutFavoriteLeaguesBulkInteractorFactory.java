package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvidePutFavoriteLeaguesBulkInteractorFactory implements Factory<PutFavoriteLeaguesBulkInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvidePutFavoriteLeaguesBulkInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteLeaguesBulkInteractor get() {
        return (PutFavoriteLeaguesBulkInteractor) Preconditions.checkNotNull(this.module.providePutFavoriteLeaguesBulkInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvidePutFavoriteLeaguesBulkInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvidePutFavoriteLeaguesBulkInteractorFactory(module, contextProvider);
    }

    public static PutFavoriteLeaguesBulkInteractor proxyProvidePutFavoriteLeaguesBulkInteractor(RestModule instance, Context context) {
        return (PutFavoriteLeaguesBulkInteractor) Preconditions.checkNotNull(instance.providePutFavoriteLeaguesBulkInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
