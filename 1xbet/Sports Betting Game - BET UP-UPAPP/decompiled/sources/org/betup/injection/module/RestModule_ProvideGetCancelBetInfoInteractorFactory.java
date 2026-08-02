package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.GetCancelBetInfoInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetCancelBetInfoInteractorFactory implements Factory<GetCancelBetInfoInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetCancelBetInfoInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetCancelBetInfoInteractor get() {
        return (GetCancelBetInfoInteractor) Preconditions.checkNotNull(this.module.provideGetCancelBetInfoInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetCancelBetInfoInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetCancelBetInfoInteractorFactory(module, contextProvider);
    }

    public static GetCancelBetInfoInteractor proxyProvideGetCancelBetInfoInteractor(RestModule instance, Context context) {
        return (GetCancelBetInfoInteractor) Preconditions.checkNotNull(instance.provideGetCancelBetInfoInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
