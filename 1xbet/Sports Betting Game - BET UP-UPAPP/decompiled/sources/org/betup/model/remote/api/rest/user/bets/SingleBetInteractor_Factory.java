package org.betup.model.remote.api.rest.user.bets;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class SingleBetInteractor_Factory implements Factory<SingleBetInteractor> {
    private final Provider<Context> contextProvider;

    public SingleBetInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SingleBetInteractor get() {
        return new SingleBetInteractor(this.contextProvider.get());
    }

    public static SingleBetInteractor_Factory create(Provider<Context> contextProvider) {
        return new SingleBetInteractor_Factory(contextProvider);
    }
}
