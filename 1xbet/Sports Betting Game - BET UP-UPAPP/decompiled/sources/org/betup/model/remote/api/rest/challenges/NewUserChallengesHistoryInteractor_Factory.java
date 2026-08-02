package org.betup.model.remote.api.rest.challenges;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewUserChallengesHistoryInteractor_Factory implements Factory<NewUserChallengesHistoryInteractor> {
    private final Provider<Context> contextProvider;

    public NewUserChallengesHistoryInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewUserChallengesHistoryInteractor get() {
        return new NewUserChallengesHistoryInteractor(this.contextProvider.get());
    }

    public static NewUserChallengesHistoryInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewUserChallengesHistoryInteractor_Factory(contextProvider);
    }
}
