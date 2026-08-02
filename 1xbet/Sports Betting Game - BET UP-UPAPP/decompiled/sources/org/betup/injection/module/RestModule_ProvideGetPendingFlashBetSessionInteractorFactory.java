package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetPendingFlashBetSessionInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetPendingFlashBetSessionInteractorFactory implements Factory<GetPendingFlashBetSessionInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetPendingFlashBetSessionInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetPendingFlashBetSessionInteractor get() {
        return (GetPendingFlashBetSessionInteractor) Preconditions.checkNotNull(this.module.provideGetPendingFlashBetSessionInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetPendingFlashBetSessionInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetPendingFlashBetSessionInteractorFactory(module, contextProvider);
    }

    public static GetPendingFlashBetSessionInteractor proxyProvideGetPendingFlashBetSessionInteractor(RestModule instance, Context context) {
        return (GetPendingFlashBetSessionInteractor) Preconditions.checkNotNull(instance.provideGetPendingFlashBetSessionInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
