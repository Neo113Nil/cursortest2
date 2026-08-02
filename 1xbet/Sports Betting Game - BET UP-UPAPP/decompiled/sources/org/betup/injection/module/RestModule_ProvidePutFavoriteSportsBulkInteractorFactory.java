package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvidePutFavoriteSportsBulkInteractorFactory implements Factory<PutFavoriteSportsBulkInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvidePutFavoriteSportsBulkInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PutFavoriteSportsBulkInteractor get() {
        return (PutFavoriteSportsBulkInteractor) Preconditions.checkNotNull(this.module.providePutFavoriteSportsBulkInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvidePutFavoriteSportsBulkInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvidePutFavoriteSportsBulkInteractorFactory(module, contextProvider);
    }

    public static PutFavoriteSportsBulkInteractor proxyProvidePutFavoriteSportsBulkInteractor(RestModule instance, Context context) {
        return (PutFavoriteSportsBulkInteractor) Preconditions.checkNotNull(instance.providePutFavoriteSportsBulkInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
