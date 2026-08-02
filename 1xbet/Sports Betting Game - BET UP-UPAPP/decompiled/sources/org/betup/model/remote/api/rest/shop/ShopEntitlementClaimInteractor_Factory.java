package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ShopEntitlementClaimInteractor_Factory implements Factory<ShopEntitlementClaimInteractor> {
    private final Provider<Context> contextProvider;

    public ShopEntitlementClaimInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ShopEntitlementClaimInteractor get() {
        return new ShopEntitlementClaimInteractor(this.contextProvider.get());
    }

    public static ShopEntitlementClaimInteractor_Factory create(Provider<Context> contextProvider) {
        return new ShopEntitlementClaimInteractor_Factory(contextProvider);
    }
}
