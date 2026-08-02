package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSignedPendingOfferInteractor_Factory implements Factory<GetSignedPendingOfferInteractor> {
    private final Provider<Context> contextProvider;

    public GetSignedPendingOfferInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSignedPendingOfferInteractor get() {
        return new GetSignedPendingOfferInteractor(this.contextProvider.get());
    }

    public static GetSignedPendingOfferInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSignedPendingOfferInteractor_Factory(contextProvider);
    }
}
