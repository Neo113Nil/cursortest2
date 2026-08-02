package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CreateQuizParticipationInteractor_Factory implements Factory<CreateQuizParticipationInteractor> {
    private final Provider<Context> contextProvider;

    public CreateQuizParticipationInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CreateQuizParticipationInteractor get() {
        return new CreateQuizParticipationInteractor(this.contextProvider.get());
    }

    public static CreateQuizParticipationInteractor_Factory create(Provider<Context> contextProvider) {
        return new CreateQuizParticipationInteractor_Factory(contextProvider);
    }
}
