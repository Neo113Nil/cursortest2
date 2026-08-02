package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7UpdatePushTokenAndLangInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7UpdatePushTokenAndLangInteractorFactory implements Factory<V7UpdatePushTokenAndLangInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7UpdatePushTokenAndLangInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7UpdatePushTokenAndLangInteractor get() {
        return (V7UpdatePushTokenAndLangInteractor) Preconditions.checkNotNull(this.module.provideV7UpdatePushTokenAndLangInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7UpdatePushTokenAndLangInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7UpdatePushTokenAndLangInteractorFactory(module, contextProvider);
    }

    public static V7UpdatePushTokenAndLangInteractor proxyProvideV7UpdatePushTokenAndLangInteractor(RestModule instance, Context context) {
        return (V7UpdatePushTokenAndLangInteractor) Preconditions.checkNotNull(instance.provideV7UpdatePushTokenAndLangInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
