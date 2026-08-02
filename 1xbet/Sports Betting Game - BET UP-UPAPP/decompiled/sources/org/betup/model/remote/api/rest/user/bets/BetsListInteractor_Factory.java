package org.betup.model.remote.api.rest.user.bets;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class BetsListInteractor_Factory implements Factory<BetsListInteractor> {
    private final Provider<Context> contextProvider;

    public BetsListInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public BetsListInteractor get() {
        return new BetsListInteractor(this.contextProvider.get());
    }

    public static BetsListInteractor_Factory create(Provider<Context> contextProvider) {
        return new BetsListInteractor_Factory(contextProvider);
    }
}
