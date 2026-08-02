package org.betup.model.remote.api.rest.interstitial;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetInterstitialCampaignInteractor_Factory implements Factory<GetInterstitialCampaignInteractor> {
    private final Provider<Context> contextProvider;

    public GetInterstitialCampaignInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetInterstitialCampaignInteractor get() {
        return new GetInterstitialCampaignInteractor(this.contextProvider.get());
    }

    public static GetInterstitialCampaignInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetInterstitialCampaignInteractor_Factory(contextProvider);
    }
}
