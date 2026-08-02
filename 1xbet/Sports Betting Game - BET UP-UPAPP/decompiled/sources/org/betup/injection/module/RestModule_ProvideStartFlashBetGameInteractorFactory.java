package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.flashbet.StartFlashBetGameInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideStartFlashBetGameInteractorFactory implements Factory<StartFlashBetGameInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideStartFlashBetGameInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public StartFlashBetGameInteractor get() {
        return (StartFlashBetGameInteractor) Preconditions.checkNotNull(this.module.provideStartFlashBetGameInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideStartFlashBetGameInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideStartFlashBetGameInteractorFactory(module, contextProvider);
    }

    public static StartFlashBetGameInteractor proxyProvideStartFlashBetGameInteractor(RestModule instance, Context context) {
        return (StartFlashBetGameInteractor) Preconditions.checkNotNull(instance.provideStartFlashBetGameInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
