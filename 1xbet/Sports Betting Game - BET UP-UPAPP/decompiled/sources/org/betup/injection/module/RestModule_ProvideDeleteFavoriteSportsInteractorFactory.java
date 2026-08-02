package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideDeleteFavoriteSportsInteractorFactory implements Factory<DeleteFavoriteSportsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideDeleteFavoriteSportsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DeleteFavoriteSportsInteractor get() {
        return (DeleteFavoriteSportsInteractor) Preconditions.checkNotNull(this.module.provideDeleteFavoriteSportsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideDeleteFavoriteSportsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideDeleteFavoriteSportsInteractorFactory(module, contextProvider);
    }

    public static DeleteFavoriteSportsInteractor proxyProvideDeleteFavoriteSportsInteractor(RestModule instance, Context context) {
        return (DeleteFavoriteSportsInteractor) Preconditions.checkNotNull(instance.provideDeleteFavoriteSportsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
