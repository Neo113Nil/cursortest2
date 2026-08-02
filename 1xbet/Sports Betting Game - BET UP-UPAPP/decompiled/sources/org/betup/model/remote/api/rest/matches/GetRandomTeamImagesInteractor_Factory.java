package org.betup.model.remote.api.rest.matches;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetRandomTeamImagesInteractor_Factory implements Factory<GetRandomTeamImagesInteractor> {
    private final Provider<Context> contextProvider;

    public GetRandomTeamImagesInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetRandomTeamImagesInteractor get() {
        return new GetRandomTeamImagesInteractor(this.contextProvider.get());
    }

    public static GetRandomTeamImagesInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetRandomTeamImagesInteractor_Factory(contextProvider);
    }
}
