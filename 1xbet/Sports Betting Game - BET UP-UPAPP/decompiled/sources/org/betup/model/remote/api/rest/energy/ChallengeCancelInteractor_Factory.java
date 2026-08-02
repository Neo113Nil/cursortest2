package org.betup.model.remote.api.rest.energy;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ChallengeCancelInteractor_Factory implements Factory<ChallengeCancelInteractor> {
    private final Provider<Context> contextProvider;

    public ChallengeCancelInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ChallengeCancelInteractor get() {
        return new ChallengeCancelInteractor(this.contextProvider.get());
    }

    public static ChallengeCancelInteractor_Factory create(Provider<Context> contextProvider) {
        return new ChallengeCancelInteractor_Factory(contextProvider);
    }
}
