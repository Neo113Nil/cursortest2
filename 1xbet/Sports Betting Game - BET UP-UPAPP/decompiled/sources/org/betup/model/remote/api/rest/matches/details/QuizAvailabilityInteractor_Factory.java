package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class QuizAvailabilityInteractor_Factory implements Factory<QuizAvailabilityInteractor> {
    private final Provider<Context> contextProvider;

    public QuizAvailabilityInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public QuizAvailabilityInteractor get() {
        return new QuizAvailabilityInteractor(this.contextProvider.get());
    }

    public static QuizAvailabilityInteractor_Factory create(Provider<Context> contextProvider) {
        return new QuizAvailabilityInteractor_Factory(contextProvider);
    }
}
