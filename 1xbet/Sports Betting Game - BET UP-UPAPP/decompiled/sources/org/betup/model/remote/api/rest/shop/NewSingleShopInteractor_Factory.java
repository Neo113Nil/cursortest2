package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewSingleShopInteractor_Factory implements Factory<NewSingleShopInteractor> {
    private final Provider<Context> contextProvider;

    public NewSingleShopInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewSingleShopInteractor get() {
        return new NewSingleShopInteractor(this.contextProvider.get());
    }

    public static NewSingleShopInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewSingleShopInteractor_Factory(contextProvider);
    }
}
