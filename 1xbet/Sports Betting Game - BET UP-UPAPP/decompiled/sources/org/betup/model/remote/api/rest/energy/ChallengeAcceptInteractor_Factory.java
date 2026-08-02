package org.betup.model.remote.api.rest.energy;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ChallengeAcceptInteractor_Factory implements Factory<ChallengeAcceptInteractor> {
    private final Provider<Context> contextProvider;

    public ChallengeAcceptInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ChallengeAcceptInteractor get() {
        return new ChallengeAcceptInteractor(this.contextProvider.get());
    }

    public static ChallengeAcceptInteractor_Factory create(Provider<Context> contextProvider) {
        return new ChallengeAcceptInteractor_Factory(contextProvider);
    }
}
