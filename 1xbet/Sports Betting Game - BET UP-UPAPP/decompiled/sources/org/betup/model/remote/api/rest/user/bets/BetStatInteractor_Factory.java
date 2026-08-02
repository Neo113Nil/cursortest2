package org.betup.model.remote.api.rest.user.bets;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class BetStatInteractor_Factory implements Factory<BetStatInteractor> {
    private final Provider<Context> contextProvider;

    public BetStatInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public BetStatInteractor get() {
        return new BetStatInteractor(this.contextProvider.get());
    }

    public static BetStatInteractor_Factory create(Provider<Context> contextProvider) {
        return new BetStatInteractor_Factory(contextProvider);
    }
}
