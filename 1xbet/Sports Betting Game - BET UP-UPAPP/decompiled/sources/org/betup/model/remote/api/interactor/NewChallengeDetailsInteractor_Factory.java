package org.betup.model.remote.api.interactor;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class NewChallengeDetailsInteractor_Factory implements Factory<NewChallengeDetailsInteractor> {
    private final Provider<Context> contextProvider;

    public NewChallengeDetailsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public NewChallengeDetailsInteractor get() {
        return new NewChallengeDetailsInteractor(this.contextProvider.get());
    }

    public static NewChallengeDetailsInteractor_Factory create(Provider<Context> contextProvider) {
        return new NewChallengeDetailsInteractor_Factory(contextProvider);
    }
}
