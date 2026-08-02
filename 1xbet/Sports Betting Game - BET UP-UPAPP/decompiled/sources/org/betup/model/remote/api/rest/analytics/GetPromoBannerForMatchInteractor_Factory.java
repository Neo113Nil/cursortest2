package org.betup.model.remote.api.rest.analytics;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetPromoBannerForMatchInteractor_Factory implements Factory<GetPromoBannerForMatchInteractor> {
    private final Provider<Context> contextProvider;

    public GetPromoBannerForMatchInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetPromoBannerForMatchInteractor get() {
        return new GetPromoBannerForMatchInteractor(this.contextProvider.get());
    }

    public static GetPromoBannerForMatchInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetPromoBannerForMatchInteractor_Factory(contextProvider);
    }
}
