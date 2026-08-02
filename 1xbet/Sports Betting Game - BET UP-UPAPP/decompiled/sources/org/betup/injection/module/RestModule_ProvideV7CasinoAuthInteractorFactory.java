package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.casino.V7CasinoAuthInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7CasinoAuthInteractorFactory implements Factory<V7CasinoAuthInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7CasinoAuthInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7CasinoAuthInteractor get() {
        return (V7CasinoAuthInteractor) Preconditions.checkNotNull(this.module.provideV7CasinoAuthInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7CasinoAuthInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7CasinoAuthInteractorFactory(module, contextProvider);
    }

    public static V7CasinoAuthInteractor proxyProvideV7CasinoAuthInteractor(RestModule instance, Context context) {
        return (V7CasinoAuthInteractor) Preconditions.checkNotNull(instance.provideV7CasinoAuthInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
