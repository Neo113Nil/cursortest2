package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetOffersListInteractor_Factory implements Factory<GetOffersListInteractor> {
    private final Provider<Context> contextProvider;

    public GetOffersListInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetOffersListInteractor get() {
        return new GetOffersListInteractor(this.contextProvider.get());
    }

    public static GetOffersListInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetOffersListInteractor_Factory(contextProvider);
    }
}
