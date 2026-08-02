package org.betup.services.ads.interstitial;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.ads.consent.AdsConsentManager;

/* loaded from: classes2.dex */
public final class GoogleInterstitialAdController_Factory implements Factory<GoogleInterstitialAdController> {
    private final Provider<AdsConsentManager> adsConsentManagerProvider;

    public GoogleInterstitialAdController_Factory(Provider<AdsConsentManager> adsConsentManagerProvider) {
        this.adsConsentManagerProvider = adsConsentManagerProvider;
    }

    @Override // javax.inject.Provider
    public GoogleInterstitialAdController get() {
        return new GoogleInterstitialAdController(this.adsConsentManagerProvider.get());
    }

    public static GoogleInterstitialAdController_Factory create(Provider<AdsConsentManager> adsConsentManagerProvider) {
        return new GoogleInterstitialAdController_Factory(adsConsentManagerProvider);
    }
}
