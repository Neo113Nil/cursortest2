package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7GrabbedBetsInteractorFactory implements Factory<V7GrabbedBetsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7GrabbedBetsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7GrabbedBetsInteractor get() {
        return (V7GrabbedBetsInteractor) Preconditions.checkNotNull(this.module.provideV7GrabbedBetsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7GrabbedBetsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7GrabbedBetsInteractorFactory(module, contextProvider);
    }

    public static V7GrabbedBetsInteractor proxyProvideV7GrabbedBetsInteractor(RestModule instance, Context context) {
        return (V7GrabbedBetsInteractor) Preconditions.checkNotNull(instance.provideV7GrabbedBetsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
