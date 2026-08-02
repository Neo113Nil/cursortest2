package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetFlashBetSessionInteractorFactory implements Factory<GetFlashBetSessionInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetFlashBetSessionInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetSessionInteractor get() {
        return (GetFlashBetSessionInteractor) Preconditions.checkNotNull(this.module.provideGetFlashBetSessionInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetFlashBetSessionInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetFlashBetSessionInteractorFactory(module, contextProvider);
    }

    public static GetFlashBetSessionInteractor proxyProvideGetFlashBetSessionInteractor(RestModule instance, Context context) {
        return (GetFlashBetSessionInteractor) Preconditions.checkNotNull(instance.provideGetFlashBetSessionInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
