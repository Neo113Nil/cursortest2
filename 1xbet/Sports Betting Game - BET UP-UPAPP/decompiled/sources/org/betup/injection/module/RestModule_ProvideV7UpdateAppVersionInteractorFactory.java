package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7UpdateAppVersionInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7UpdateAppVersionInteractorFactory implements Factory<V7UpdateAppVersionInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7UpdateAppVersionInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UpdateAppVersionInteractor get() {
        return (V7UpdateAppVersionInteractor) Preconditions.checkNotNull(this.module.provideV7UpdateAppVersionInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7UpdateAppVersionInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7UpdateAppVersionInteractorFactory(module, contextProvider);
    }

    public static V7UpdateAppVersionInteractor proxyProvideV7UpdateAppVersionInteractor(RestModule instance, Context context) {
        return (V7UpdateAppVersionInteractor) Preconditions.checkNotNull(instance.provideV7UpdateAppVersionInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
