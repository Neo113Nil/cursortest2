package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideDeleteFavoriteLeaguesInteractorFactory implements Factory<DeleteFavoriteLeaguesInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideDeleteFavoriteLeaguesInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteFavoriteLeaguesInteractor get() {
        return (DeleteFavoriteLeaguesInteractor) Preconditions.checkNotNull(this.module.provideDeleteFavoriteLeaguesInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideDeleteFavoriteLeaguesInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideDeleteFavoriteLeaguesInteractorFactory(module, contextProvider);
    }

    public static DeleteFavoriteLeaguesInteractor proxyProvideDeleteFavoriteLeaguesInteractor(RestModule instance, Context context) {
        return (DeleteFavoriteLeaguesInteractor) Preconditions.checkNotNull(instance.provideDeleteFavoriteLeaguesInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
