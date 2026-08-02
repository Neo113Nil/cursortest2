package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewShopItemsInteractor_Factory implements Factory<NewShopItemsInteractor> {
    private final Provider<Context> contextProvider;

    public NewShopItemsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewShopItemsInteractor get() {
        return new NewShopItemsInteractor(this.contextProvider.get());
    }

    public static NewShopItemsInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewShopItemsInteractor_Factory(contextProvider);
    }
}
