package org.betup.model.remote.api.rest.challenges;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewChallengesInteractor_Factory implements Factory<NewChallengesInteractor> {
    private final Provider<Context> contextProvider;

    public NewChallengesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewChallengesInteractor get() {
        return new NewChallengesInteractor(this.contextProvider.get());
    }

    public static NewChallengesInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewChallengesInteractor_Factory(contextProvider);
    }
}
