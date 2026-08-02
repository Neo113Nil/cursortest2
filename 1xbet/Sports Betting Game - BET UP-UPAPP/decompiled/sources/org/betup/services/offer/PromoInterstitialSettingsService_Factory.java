package org.betup.services.offer;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.promo.GetPromoInterstitialSettingsInteractor;

/* loaded from: classes2.dex */
public final class PromoInterstitialSettingsService_Factory implements Factory<PromoInterstitialSettingsService> {
    private final Provider<GetPromoInterstitialSettingsInteractor> getPromoInterstitialSettingsInteractorProvider;

    public PromoInterstitialSettingsService_Factory(Provider<GetPromoInterstitialSettingsInteractor> getPromoInterstitialSettingsInteractorProvider) {
        this.getPromoInterstitialSettingsInteractorProvider = getPromoInterstitialSettingsInteractorProvider;
    }

    @Override // javax.inject.Provider
    public PromoInterstitialSettingsService get() {
        return new PromoInterstitialSettingsService(this.getPromoInterstitialSettingsInteractorProvider.get());
    }

    public static PromoInterstitialSettingsService_Factory create(Provider<GetPromoInterstitialSettingsInteractor> getPromoInterstitialSettingsInteractorProvider) {
        return new PromoInterstitialSettingsService_Factory(getPromoInterstitialSettingsInteractorProvider);
    }
}
