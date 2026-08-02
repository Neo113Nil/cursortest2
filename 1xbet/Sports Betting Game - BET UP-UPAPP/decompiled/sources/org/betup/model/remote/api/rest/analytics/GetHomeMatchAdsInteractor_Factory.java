package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetHomeMatchAdsInteractor_Factory implements Factory<GetHomeMatchAdsInteractor> {
    private final Provider<Context> contextProvider;

    public GetHomeMatchAdsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetHomeMatchAdsInteractor get() {
        return new GetHomeMatchAdsInteractor(this.contextProvider.get());
    }

    public static GetHomeMatchAdsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetHomeMatchAdsInteractor_Factory(contextProvider);
    }
}
