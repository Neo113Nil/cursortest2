package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvidePutFavoriteLeaguesInteractorFactory implements Factory<PutFavoriteLeaguesInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvidePutFavoriteLeaguesInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteLeaguesInteractor get() {
        return (PutFavoriteLeaguesInteractor) Preconditions.checkNotNull(this.module.providePutFavoriteLeaguesInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvidePutFavoriteLeaguesInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvidePutFavoriteLeaguesInteractorFactory(module, contextProvider);
    }

    public static PutFavoriteLeaguesInteractor proxyProvidePutFavoriteLeaguesInteractor(RestModule instance, Context context) {
        return (PutFavoriteLeaguesInteractor) Preconditions.checkNotNull(instance.providePutFavoriteLeaguesInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
