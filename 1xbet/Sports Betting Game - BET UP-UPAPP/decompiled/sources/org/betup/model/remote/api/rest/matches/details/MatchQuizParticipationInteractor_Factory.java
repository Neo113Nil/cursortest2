package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class MatchQuizParticipationInteractor_Factory implements Factory<MatchQuizParticipationInteractor> {
    private final Provider<Context> contextProvider;

    public MatchQuizParticipationInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public MatchQuizParticipationInteractor get() {
        return new MatchQuizParticipationInteractor(this.contextProvider.get());
    }

    public static MatchQuizParticipationInteractor_Factory create(Provider<Context> contextProvider) {
        return new MatchQuizParticipationInteractor_Factory(contextProvider);
    }
}
