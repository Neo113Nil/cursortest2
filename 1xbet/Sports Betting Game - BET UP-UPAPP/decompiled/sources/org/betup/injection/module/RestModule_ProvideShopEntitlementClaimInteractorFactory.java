package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.ShopEntitlementClaimInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideShopEntitlementClaimInteractorFactory implements Factory<ShopEntitlementClaimInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideShopEntitlementClaimInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ShopEntitlementClaimInteractor get() {
        return (ShopEntitlementClaimInteractor) Preconditions.checkNotNull(this.module.provideShopEntitlementClaimInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideShopEntitlementClaimInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideShopEntitlementClaimInteractorFactory(module, contextProvider);
    }

    public static ShopEntitlementClaimInteractor proxyProvideShopEntitlementClaimInteractor(RestModule instance, Context context) {
        return (ShopEntitlementClaimInteractor) Preconditions.checkNotNull(instance.provideShopEntitlementClaimInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
