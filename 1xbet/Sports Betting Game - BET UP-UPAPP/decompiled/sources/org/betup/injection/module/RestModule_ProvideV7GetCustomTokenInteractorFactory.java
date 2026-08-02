package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7GetCustomTokenInteractorFactory implements Factory<V7GetCustomTokenInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7GetCustomTokenInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7GetCustomTokenInteractor get() {
        return (V7GetCustomTokenInteractor) Preconditions.checkNotNull(this.module.provideV7GetCustomTokenInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7GetCustomTokenInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7GetCustomTokenInteractorFactory(module, contextProvider);
    }

    public static V7GetCustomTokenInteractor proxyProvideV7GetCustomTokenInteractor(RestModule instance, Context context) {
        return (V7GetCustomTokenInteractor) Preconditions.checkNotNull(instance.provideV7GetCustomTokenInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
