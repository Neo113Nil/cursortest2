package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7VarietyBetRestrictionsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7VarietyBetRestrictionsInteractorFactory implements Factory<V7VarietyBetRestrictionsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7VarietyBetRestrictionsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7VarietyBetRestrictionsInteractor get() {
        return (V7VarietyBetRestrictionsInteractor) Preconditions.checkNotNull(this.module.provideV7VarietyBetRestrictionsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7VarietyBetRestrictionsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7VarietyBetRestrictionsInteractorFactory(module, contextProvider);
    }

    public static V7VarietyBetRestrictionsInteractor proxyProvideV7VarietyBetRestrictionsInteractor(RestModule instance, Context context) {
        return (V7VarietyBetRestrictionsInteractor) Preconditions.checkNotNull(instance.provideV7VarietyBetRestrictionsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
