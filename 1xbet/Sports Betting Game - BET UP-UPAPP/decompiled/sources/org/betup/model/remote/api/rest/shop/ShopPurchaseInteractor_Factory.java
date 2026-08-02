package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ShopPurchaseInteractor_Factory implements Factory<ShopPurchaseInteractor> {
    private final Provider<Context> contextProvider;

    public ShopPurchaseInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ShopPurchaseInteractor get() {
        return new ShopPurchaseInteractor(this.contextProvider.get());
    }

    public static ShopPurchaseInteractor_Factory create(Provider<Context> contextProvider) {
        return new ShopPurchaseInteractor_Factory(contextProvider);
    }
}
