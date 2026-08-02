package org.betup.model.remote.api.rest.challenges;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewUserPrivateChallengesInteractor_Factory implements Factory<NewUserPrivateChallengesInteractor> {
    private final Provider<Context> contextProvider;

    public NewUserPrivateChallengesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewUserPrivateChallengesInteractor get() {
        return new NewUserPrivateChallengesInteractor(this.contextProvider.get());
    }

    public static NewUserPrivateChallengesInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewUserPrivateChallengesInteractor_Factory(contextProvider);
    }
}
