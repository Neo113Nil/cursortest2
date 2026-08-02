package org.betup.services.ads;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.ads.consent.AdsConsentManager;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.ads.rewarded.RewardedAdController;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class MobileAdsInitializer_Factory implements Factory<MobileAdsInitializer> {
    private final Provider<AdUnitRegistry> adUnitRegistryProvider;
    private final Provider<AdsConsentManager> adsConsentManagerProvider;
    private final Provider<InterstitialAdController> interstitialAdControllerProvider;
    private final Provider<RewardedAdController> rewardedAdControllerProvider;
    private final Provider<UserService> userServiceProvider;

    public MobileAdsInitializer_Factory(Provider<UserService> userServiceProvider, Provider<AdsConsentManager> adsConsentManagerProvider, Provider<RewardedAdController> rewardedAdControllerProvider, Provider<InterstitialAdController> interstitialAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider) {
        this.userServiceProvider = userServiceProvider;
        this.adsConsentManagerProvider = adsConsentManagerProvider;
        this.rewardedAdControllerProvider = rewardedAdControllerProvider;
        this.interstitialAdControllerProvider = interstitialAdControllerProvider;
        this.adUnitRegistryProvider = adUnitRegistryProvider;
    }

    @Override // javax.inject.Provider
    public MobileAdsInitializer get() {
        return new MobileAdsInitializer(this.userServiceProvider.get(), this.adsConsentManagerProvider.get(), this.rewardedAdControllerProvider.get(), this.interstitialAdControllerProvider.get(), this.adUnitRegistryProvider.get());
    }

    public static MobileAdsInitializer_Factory create(Provider<UserService> userServiceProvider, Provider<AdsConsentManager> adsConsentManagerProvider, Provider<RewardedAdController> rewardedAdControllerProvider, Provider<InterstitialAdController> interstitialAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider) {
        return new MobileAdsInitializer_Factory(userServiceProvider, adsConsentManagerProvider, rewardedAdControllerProvider, interstitialAdControllerProvider, adUnitRegistryProvider);
    }
}
