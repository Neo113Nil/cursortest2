package org.betup.model.remote.api.rest.challenges;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewUserAvailableChallengesInteractor_Factory implements Factory<NewUserAvailableChallengesInteractor> {
    private final Provider<Context> contextProvider;

    public NewUserAvailableChallengesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewUserAvailableChallengesInteractor get() {
        return new NewUserAvailableChallengesInteractor(this.contextProvider.get());
    }

    public static NewUserAvailableChallengesInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewUserAvailableChallengesInteractor_Factory(contextProvider);
    }
}
