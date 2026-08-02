package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetSignatureForOfferInteractor_Factory implements Factory<GetSignatureForOfferInteractor> {
    private final Provider<Context> contextProvider;

    public GetSignatureForOfferInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetSignatureForOfferInteractor get() {
        return new GetSignatureForOfferInteractor(this.contextProvider.get());
    }

    public static GetSignatureForOfferInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetSignatureForOfferInteractor_Factory(contextProvider);
    }
}
