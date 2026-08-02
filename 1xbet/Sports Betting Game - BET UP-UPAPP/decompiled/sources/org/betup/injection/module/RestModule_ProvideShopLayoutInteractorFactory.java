package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.ShopLayoutInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideShopLayoutInteractorFactory implements Factory<ShopLayoutInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideShopLayoutInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ShopLayoutInteractor get() {
        return (ShopLayoutInteractor) Preconditions.checkNotNull(this.module.provideShopLayoutInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideShopLayoutInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideShopLayoutInteractorFactory(module, contextProvider);
    }

    public static ShopLayoutInteractor proxyProvideShopLayoutInteractor(RestModule instance, Context context) {
        return (ShopLayoutInteractor) Preconditions.checkNotNull(instance.provideShopLayoutInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
