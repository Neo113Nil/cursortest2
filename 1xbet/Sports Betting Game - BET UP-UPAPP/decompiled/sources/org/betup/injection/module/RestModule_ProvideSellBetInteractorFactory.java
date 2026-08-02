package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.SellBetInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideSellBetInteractorFactory implements Factory<SellBetInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideSellBetInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SellBetInteractor get() {
        return (SellBetInteractor) Preconditions.checkNotNull(this.module.provideSellBetInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideSellBetInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideSellBetInteractorFactory(module, contextProvider);
    }

    public static SellBetInteractor proxyProvideSellBetInteractor(RestModule instance, Context context) {
        return (SellBetInteractor) Preconditions.checkNotNull(instance.provideSellBetInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
