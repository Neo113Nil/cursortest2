package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.NewShopItemsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideNewShopItemsInteractorFactory implements Factory<NewShopItemsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideNewShopItemsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewShopItemsInteractor get() {
        return (NewShopItemsInteractor) Preconditions.checkNotNull(this.module.provideNewShopItemsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideNewShopItemsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideNewShopItemsInteractorFactory(module, contextProvider);
    }

    public static NewShopItemsInteractor proxyProvideNewShopItemsInteractor(RestModule instance, Context context) {
        return (NewShopItemsInteractor) Preconditions.checkNotNull(instance.provideNewShopItemsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
