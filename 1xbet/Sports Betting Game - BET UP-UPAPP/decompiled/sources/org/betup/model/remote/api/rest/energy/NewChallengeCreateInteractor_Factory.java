package org.betup.model.remote.api.rest.energy;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewChallengeCreateInteractor_Factory implements Factory<NewChallengeCreateInteractor> {
    private final Provider<Context> contextProvider;

    public NewChallengeCreateInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewChallengeCreateInteractor get() {
        return new NewChallengeCreateInteractor(this.contextProvider.get());
    }

    public static NewChallengeCreateInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewChallengeCreateInteractor_Factory(contextProvider);
    }
}
