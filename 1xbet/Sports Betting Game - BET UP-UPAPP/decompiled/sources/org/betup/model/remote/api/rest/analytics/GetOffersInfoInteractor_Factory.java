package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetOffersInfoInteractor_Factory implements Factory<GetOffersInfoInteractor> {
    private final Provider<Context> contextProvider;

    public GetOffersInfoInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetOffersInfoInteractor get() {
        return new GetOffersInfoInteractor(this.contextProvider.get());
    }

    public static GetOffersInfoInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetOffersInfoInteractor_Factory(contextProvider);
    }
}
