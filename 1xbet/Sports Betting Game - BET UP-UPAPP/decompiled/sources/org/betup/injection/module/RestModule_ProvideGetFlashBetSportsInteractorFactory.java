package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSportsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetFlashBetSportsInteractorFactory implements Factory<GetFlashBetSportsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetFlashBetSportsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetSportsInteractor get() {
        return (GetFlashBetSportsInteractor) Preconditions.checkNotNull(this.module.provideGetFlashBetSportsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetFlashBetSportsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetFlashBetSportsInteractorFactory(module, contextProvider);
    }

    public static GetFlashBetSportsInteractor proxyProvideGetFlashBetSportsInteractor(RestModule instance, Context context) {
        return (GetFlashBetSportsInteractor) Preconditions.checkNotNull(instance.provideGetFlashBetSportsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
