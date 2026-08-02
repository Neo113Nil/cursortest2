package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.competitions.PlaceBetInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvidePlaceBetInteractorFactory implements Factory<PlaceBetInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvidePlaceBetInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PlaceBetInteractor get() {
        return (PlaceBetInteractor) Preconditions.checkNotNull(this.module.providePlaceBetInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvidePlaceBetInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvidePlaceBetInteractorFactory(module, contextProvider);
    }

    public static PlaceBetInteractor proxyProvidePlaceBetInteractor(RestModule instance, Context context) {
        return (PlaceBetInteractor) Preconditions.checkNotNull(instance.providePlaceBetInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
