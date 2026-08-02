package org.betup.ui.fragment.bets.betlist.details;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.ui.fragment.bets.BetsController;

/* loaded from: classes4.dex */
public final class BetDetailDialog_MembersInjector implements MembersInjector<BetDetailDialog> {
    private final Provider<BetsController> betControllerProvider;
    private final Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider;
    private final Provider<PromoService> promoServiceProvider;

    public BetDetailDialog_MembersInjector(Provider<BetsController> betControllerProvider, Provider<PromoService> promoServiceProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider) {
        this.betControllerProvider = betControllerProvider;
        this.promoServiceProvider = promoServiceProvider;
        this.promoInterstitialRulesSyncProvider = promoInterstitialRulesSyncProvider;
    }

    public static MembersInjector<BetDetailDialog> create(Provider<BetsController> betControllerProvider, Provider<PromoService> promoServiceProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider) {
        return new BetDetailDialog_MembersInjector(betControllerProvider, promoServiceProvider, promoInterstitialRulesSyncProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetDetailDialog instance) {
        injectBetController(instance, this.betControllerProvider.get());
        injectPromoService(instance, this.promoServiceProvider.get());
        injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
    }

    public static void injectBetController(BetDetailDialog instance, BetsController betController) {
        instance.betController = betController;
    }

    public static void injectPromoService(BetDetailDialog instance, PromoService promoService) {
        instance.promoService = promoService;
    }

    public static void injectPromoInterstitialRulesSync(BetDetailDialog instance, PromoInterstitialRulesSync promoInterstitialRulesSync) {
        instance.promoInterstitialRulesSync = promoInterstitialRulesSync;
    }
}
