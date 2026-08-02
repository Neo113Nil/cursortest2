package org.betup.model.remote.api.rest.quiz;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QuizParticipationsInteractor_Factory implements Factory<QuizParticipationsInteractor> {
    private final Provider<Context> contextProvider;

    public QuizParticipationsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public QuizParticipationsInteractor get() {
        return new QuizParticipationsInteractor(this.contextProvider.get());
    }

    public static QuizParticipationsInteractor_Factory create(Provider<Context> contextProvider) {
        return new QuizParticipationsInteractor_Factory(contextProvider);
    }
}
