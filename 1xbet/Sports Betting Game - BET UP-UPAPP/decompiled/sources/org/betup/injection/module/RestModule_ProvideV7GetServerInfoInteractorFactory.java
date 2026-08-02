package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.server.V7GetServerInfoInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7GetServerInfoInteractorFactory implements Factory<V7GetServerInfoInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7GetServerInfoInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7GetServerInfoInteractor get() {
        return (V7GetServerInfoInteractor) Preconditions.checkNotNull(this.module.provideV7GetServerInfoInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7GetServerInfoInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7GetServerInfoInteractorFactory(module, contextProvider);
    }

    public static V7GetServerInfoInteractor proxyProvideV7GetServerInfoInteractor(RestModule instance, Context context) {
        return (V7GetServerInfoInteractor) Preconditions.checkNotNull(instance.provideV7GetServerInfoInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
