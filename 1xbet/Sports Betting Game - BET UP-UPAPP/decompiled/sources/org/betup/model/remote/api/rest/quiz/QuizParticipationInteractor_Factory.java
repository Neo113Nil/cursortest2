package org.betup.model.remote.api.rest.quiz;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QuizParticipationInteractor_Factory implements Factory<QuizParticipationInteractor> {
    private final Provider<Context> contextProvider;

    public QuizParticipationInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public QuizParticipationInteractor get() {
        return new QuizParticipationInteractor(this.contextProvider.get());
    }

    public static QuizParticipationInteractor_Factory create(Provider<Context> contextProvider) {
        return new QuizParticipationInteractor_Factory(contextProvider);
    }
}
