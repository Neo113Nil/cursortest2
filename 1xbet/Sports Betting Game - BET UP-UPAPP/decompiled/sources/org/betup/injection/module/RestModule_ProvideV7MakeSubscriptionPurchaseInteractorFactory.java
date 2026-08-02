package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.V7MakeSubscriptionPurchaseInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7MakeSubscriptionPurchaseInteractorFactory implements Factory<V7MakeSubscriptionPurchaseInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7MakeSubscriptionPurchaseInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7MakeSubscriptionPurchaseInteractor get() {
        return (V7MakeSubscriptionPurchaseInteractor) Preconditions.checkNotNull(this.module.provideV7MakeSubscriptionPurchaseInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7MakeSubscriptionPurchaseInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7MakeSubscriptionPurchaseInteractorFactory(module, contextProvider);
    }

    public static V7MakeSubscriptionPurchaseInteractor proxyProvideV7MakeSubscriptionPurchaseInteractor(RestModule instance, Context context) {
        return (V7MakeSubscriptionPurchaseInteractor) Preconditions.checkNotNull(instance.provideV7MakeSubscriptionPurchaseInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
