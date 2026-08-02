package org.betup.model.remote.api.rest.promo;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetPromoInterstitialSettingsInteractor_Factory implements Factory<GetPromoInterstitialSettingsInteractor> {
    private final Provider<Context> contextProvider;

    public GetPromoInterstitialSettingsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetPromoInterstitialSettingsInteractor get() {
        return new GetPromoInterstitialSettingsInteractor(this.contextProvider.get());
    }

    public static GetPromoInterstitialSettingsInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetPromoInterstitialSettingsInteractor_Factory(contextProvider);
    }
}
