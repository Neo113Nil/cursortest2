package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetTeamDetailsInteractor_Factory implements Factory<GetTeamDetailsInteractor> {
    private final Provider<Context> contextProvider;

    public GetTeamDetailsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetTeamDetailsInteractor get() {
        return new GetTeamDetailsInteractor(this.contextProvider.get());
    }

    public static GetTeamDetailsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetTeamDetailsInteractor_Factory(contextProvider);
    }
}
