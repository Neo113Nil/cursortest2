package org.betup.model.remote.api.rest.matches.details;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetParticipationInteractor_Factory implements Factory<GetParticipationInteractor> {
    private final Provider<Context> contextProvider;

    public GetParticipationInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetParticipationInteractor get() {
        return new GetParticipationInteractor(this.contextProvider.get());
    }

    public static GetParticipationInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetParticipationInteractor_Factory(contextProvider);
    }
}
