package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvidePutFavoriteTeamsInteractorFactory implements Factory<PutFavoriteTeamsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvidePutFavoriteTeamsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteTeamsInteractor get() {
        return (PutFavoriteTeamsInteractor) Preconditions.checkNotNull(this.module.providePutFavoriteTeamsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvidePutFavoriteTeamsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvidePutFavoriteTeamsInteractorFactory(module, contextProvider);
    }

    public static PutFavoriteTeamsInteractor proxyProvidePutFavoriteTeamsInteractor(RestModule instance, Context context) {
        return (PutFavoriteTeamsInteractor) Preconditions.checkNotNull(instance.providePutFavoriteTeamsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
