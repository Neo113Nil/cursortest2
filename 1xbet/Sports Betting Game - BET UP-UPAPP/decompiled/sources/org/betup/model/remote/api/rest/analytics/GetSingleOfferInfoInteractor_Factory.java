package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSingleOfferInfoInteractor_Factory implements Factory<GetSingleOfferInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetSingleOfferInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSingleOfferInfoInteractor get() {
        return new GetSingleOfferInfoInteractor(this.contextProvider.get());
    }

    public static GetSingleOfferInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSingleOfferInfoInteractor_Factory(contextProvider);
    }
}
