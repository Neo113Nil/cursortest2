package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7VarietyVersionGatesInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7VarietyVersionGatesInteractorFactory implements Factory<V7VarietyVersionGatesInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7VarietyVersionGatesInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7VarietyVersionGatesInteractor get() {
        return (V7VarietyVersionGatesInteractor) Preconditions.checkNotNull(this.module.provideV7VarietyVersionGatesInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7VarietyVersionGatesInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7VarietyVersionGatesInteractorFactory(module, contextProvider);
    }

    public static V7VarietyVersionGatesInteractor proxyProvideV7VarietyVersionGatesInteractor(RestModule instance, Context context) {
        return (V7VarietyVersionGatesInteractor) Preconditions.checkNotNull(instance.provideV7VarietyVersionGatesInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
