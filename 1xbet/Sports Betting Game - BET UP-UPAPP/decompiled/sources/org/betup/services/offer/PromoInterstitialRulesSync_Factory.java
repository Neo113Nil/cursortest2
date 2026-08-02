package org.betup.services.offer;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.user.UserAnalyticsTagsService;

/* loaded from: classes2.dex */
public final class PromoInterstitialRulesSync_Factory implements Factory<PromoInterstitialRulesSync> {
    private final Provider<PromoInterstitialSettingsService> promoInterstitialSettingsServiceProvider;
    private final Provider<UserAnalyticsTagsService> userAnalyticsTagsServiceProvider;

    public PromoInterstitialRulesSync_Factory(Provider<UserAnalyticsTagsService> userAnalyticsTagsServiceProvider, Provider<PromoInterstitialSettingsService> promoInterstitialSettingsServiceProvider) {
        this.userAnalyticsTagsServiceProvider = userAnalyticsTagsServiceProvider;
        this.promoInterstitialSettingsServiceProvider = promoInterstitialSettingsServiceProvider;
    }

    @Override // javax.inject.Provider
    public PromoInterstitialRulesSync get() {
        return new PromoInterstitialRulesSync(this.userAnalyticsTagsServiceProvider.get(), this.promoInterstitialSettingsServiceProvider.get());
    }

    public static PromoInterstitialRulesSync_Factory create(Provider<UserAnalyticsTagsService> userAnalyticsTagsServiceProvider, Provider<PromoInterstitialSettingsService> promoInterstitialSettingsServiceProvider) {
        return new PromoInterstitialRulesSync_Factory(userAnalyticsTagsServiceProvider, promoInterstitialSettingsServiceProvider);
    }
}
