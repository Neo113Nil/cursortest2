package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7MakeSubscriptionPurchaseInteractor_Factory implements Factory<V7MakeSubscriptionPurchaseInteractor> {
    private final Provider<Context> contextProvider;

    public V7MakeSubscriptionPurchaseInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7MakeSubscriptionPurchaseInteractor get() {
        return new V7MakeSubscriptionPurchaseInteractor(this.contextProvider.get());
    }

    public static V7MakeSubscriptionPurchaseInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7MakeSubscriptionPurchaseInteractor_Factory(contextProvider);
    }
}
