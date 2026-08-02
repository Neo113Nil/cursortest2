package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetStatsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetFlashBetStatsInteractorFactory implements Factory<GetFlashBetStatsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetFlashBetStatsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetFlashBetStatsInteractor get() {
        return (GetFlashBetStatsInteractor) Preconditions.checkNotNull(this.module.provideGetFlashBetStatsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetFlashBetStatsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetFlashBetStatsInteractorFactory(module, contextProvider);
    }

    public static GetFlashBetStatsInteractor proxyProvideGetFlashBetStatsInteractor(RestModule instance, Context context) {
        return (GetFlashBetStatsInteractor) Preconditions.checkNotNull(instance.provideGetFlashBetStatsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
