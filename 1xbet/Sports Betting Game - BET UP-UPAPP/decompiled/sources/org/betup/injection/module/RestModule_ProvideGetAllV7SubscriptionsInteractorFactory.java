package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.subscription.GetAllV7SubscriptionsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideGetAllV7SubscriptionsInteractorFactory implements Factory<GetAllV7SubscriptionsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideGetAllV7SubscriptionsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetAllV7SubscriptionsInteractor get() {
        return (GetAllV7SubscriptionsInteractor) Preconditions.checkNotNull(this.module.provideGetAllV7SubscriptionsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideGetAllV7SubscriptionsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideGetAllV7SubscriptionsInteractorFactory(module, contextProvider);
    }

    public static GetAllV7SubscriptionsInteractor proxyProvideGetAllV7SubscriptionsInteractor(RestModule instance, Context context) {
        return (GetAllV7SubscriptionsInteractor) Preconditions.checkNotNull(instance.provideGetAllV7SubscriptionsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
