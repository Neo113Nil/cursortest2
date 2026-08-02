package org.betup.model.remote.api.rest.shop;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SellBetInteractor_Factory implements Factory<SellBetInteractor> {
    private final Provider<Context> contextProvider;

    public SellBetInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SellBetInteractor get() {
        return new SellBetInteractor(this.contextProvider.get());
    }

    public static SellBetInteractor_Factory create(Provider<Context> contextProvider) {
        return new SellBetInteractor_Factory(contextProvider);
    }
}
