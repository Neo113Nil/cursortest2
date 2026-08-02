package org.betup.model.remote.api.rest.competitions;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class CompetitionDetailsWithParticipantInteractor_Factory implements Factory<CompetitionDetailsWithParticipantInteractor> {
    private final Provider<Context> contextProvider;

    public CompetitionDetailsWithParticipantInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public CompetitionDetailsWithParticipantInteractor get() {
        return new CompetitionDetailsWithParticipantInteractor(this.contextProvider.get());
    }

    public static CompetitionDetailsWithParticipantInteractor_Factory create(Provider<Context> contextProvider) {
        return new CompetitionDetailsWithParticipantInteractor_Factory(contextProvider);
    }
}
