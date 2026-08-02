package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QuizDetailsInteractor_Factory implements Factory<QuizDetailsInteractor> {
    private final Provider<Context> contextProvider;

    public QuizDetailsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public QuizDetailsInteractor get() {
        return new QuizDetailsInteractor(this.contextProvider.get());
    }

    public static QuizDetailsInteractor_Factory create(Provider<Context> contextProvider) {
        return new QuizDetailsInteractor_Factory(contextProvider);
    }
}
