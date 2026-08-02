package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.betslip.V7CreateBetlistInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7CreateBetlistInteractorFactory implements Factory<V7CreateBetlistInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7CreateBetlistInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7CreateBetlistInteractor get() {
        return (V7CreateBetlistInteractor) Preconditions.checkNotNull(this.module.provideV7CreateBetlistInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7CreateBetlistInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7CreateBetlistInteractorFactory(module, contextProvider);
    }

    public static V7CreateBetlistInteractor proxyProvideV7CreateBetlistInteractor(RestModule instance, Context context) {
        return (V7CreateBetlistInteractor) Preconditions.checkNotNull(instance.provideV7CreateBetlistInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
