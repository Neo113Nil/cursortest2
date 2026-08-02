package org.betup.model.remote.api.rest.quiz;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QuizStateCountInteractor_Factory implements Factory<QuizStateCountInteractor> {
    private final Provider<Context> contextProvider;

    public QuizStateCountInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public QuizStateCountInteractor get() {
        return new QuizStateCountInteractor(this.contextProvider.get());
    }

    public static QuizStateCountInteractor_Factory create(Provider<Context> contextProvider) {
        return new QuizStateCountInteractor_Factory(contextProvider);
    }
}
