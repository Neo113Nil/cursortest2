package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7UpdateTutorialCompleteInteractorFactory implements Factory<V7UpdateTutorialCompleteInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7UpdateTutorialCompleteInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UpdateTutorialCompleteInteractor get() {
        return (V7UpdateTutorialCompleteInteractor) Preconditions.checkNotNull(this.module.provideV7UpdateTutorialCompleteInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7UpdateTutorialCompleteInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7UpdateTutorialCompleteInteractorFactory(module, contextProvider);
    }

    public static V7UpdateTutorialCompleteInteractor proxyProvideV7UpdateTutorialCompleteInteractor(RestModule instance, Context context) {
        return (V7UpdateTutorialCompleteInteractor) Preconditions.checkNotNull(instance.provideV7UpdateTutorialCompleteInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
