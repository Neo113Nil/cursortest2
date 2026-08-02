package org.betup.model.remote.api.rest.quiz;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QuizTiersInteractor_Factory implements Factory<QuizTiersInteractor> {
    private final Provider<Context> contextProvider;

    public QuizTiersInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public QuizTiersInteractor get() {
        return new QuizTiersInteractor(this.contextProvider.get());
    }

    public static QuizTiersInteractor_Factory create(Provider<Context> contextProvider) {
        return new QuizTiersInteractor_Factory(contextProvider);
    }
}
