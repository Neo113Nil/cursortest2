package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetParticipationListInteractor_Factory implements Factory<GetParticipationListInteractor> {
    private final Provider<Context> contextProvider;

    public GetParticipationListInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetParticipationListInteractor get() {
        return new GetParticipationListInteractor(this.contextProvider.get());
    }

    public static GetParticipationListInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetParticipationListInteractor_Factory(contextProvider);
    }
}
