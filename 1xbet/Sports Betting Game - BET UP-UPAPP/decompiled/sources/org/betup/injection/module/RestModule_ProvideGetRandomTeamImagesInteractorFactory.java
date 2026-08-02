package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetRandomTeamImagesInteractorFactory implements Factory<GetRandomTeamImagesInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetRandomTeamImagesInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetRandomTeamImagesInteractor get() {
        return (GetRandomTeamImagesInteractor) Preconditions.checkNotNull(this.module.provideGetRandomTeamImagesInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetRandomTeamImagesInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetRandomTeamImagesInteractorFactory(module, contextProvider);
    }

    public static GetRandomTeamImagesInteractor proxyProvideGetRandomTeamImagesInteractor(RestModule instance, Context context) {
        return (GetRandomTeamImagesInteractor) Preconditions.checkNotNull(instance.provideGetRandomTeamImagesInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
