package org.betup.services.ads.rewarded;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.ads.consent.AdsConsentManager;

/* loaded from: classes2.dex */
public final class GoogleRewardedAdController_Factory implements Factory<GoogleRewardedAdController> {
    private final Provider<AdsConsentManager> adsConsentManagerProvider;

    public GoogleRewardedAdController_Factory(Provider<AdsConsentManager> adsConsentManagerProvider) {
        this.adsConsentManagerProvider = adsConsentManagerProvider;
    }

    @Override // javax.inject.Provider
    public GoogleRewardedAdController get() {
        return new GoogleRewardedAdController(this.adsConsentManagerProvider.get());
    }

    public static GoogleRewardedAdController_Factory create(Provider<AdsConsentManager> adsConsentManagerProvider) {
        return new GoogleRewardedAdController_Factory(adsConsentManagerProvider);
    }
}
