package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteTeamsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideDeleteFavoriteTeamsInteractorFactory implements Factory<DeleteFavoriteTeamsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideDeleteFavoriteTeamsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteFavoriteTeamsInteractor get() {
        return (DeleteFavoriteTeamsInteractor) Preconditions.checkNotNull(this.module.provideDeleteFavoriteTeamsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideDeleteFavoriteTeamsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideDeleteFavoriteTeamsInteractorFactory(module, contextProvider);
    }

    public static DeleteFavoriteTeamsInteractor proxyProvideDeleteFavoriteTeamsInteractor(RestModule instance, Context context) {
        return (DeleteFavoriteTeamsInteractor) Preconditions.checkNotNull(instance.provideDeleteFavoriteTeamsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
