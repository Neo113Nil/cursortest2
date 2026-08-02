package org.betup.ui.dialogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.model.remote.api.rest.user.bets.SingleBetInteractor;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class BetListResultDialogFragment_MembersInjector implements MembersInjector<BetListResultDialogFragment> {
    private final Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider;
    private final Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider;
    private final Provider<PromoService> promoServiceProvider;
    private final Provider<SingleBetInteractor> singleBetInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public BetListResultDialogFragment_MembersInjector(Provider<UserService> userServiceProvider, Provider<SingleBetInteractor> singleBetInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider, Provider<PromoService> promoServiceProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider) {
        this.userServiceProvider = userServiceProvider;
        this.singleBetInteractorProvider = singleBetInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.getBetShareInstallLinkInteractorProvider = getBetShareInstallLinkInteractorProvider;
        this.promoServiceProvider = promoServiceProvider;
        this.promoInterstitialRulesSyncProvider = promoInterstitialRulesSyncProvider;
    }

    public static MembersInjector<BetListResultDialogFragment> create(Provider<UserService> userServiceProvider, Provider<SingleBetInteractor> singleBetInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider, Provider<PromoService> promoServiceProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider) {
        return new BetListResultDialogFragment_MembersInjector(userServiceProvider, singleBetInteractorProvider, videoRewardServiceProvider, getBetShareInstallLinkInteractorProvider, promoServiceProvider, promoInterstitialRulesSyncProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetListResultDialogFragment instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectSingleBetInteractor(instance, this.singleBetInteractorProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectGetBetShareInstallLinkInteractor(instance, this.getBetShareInstallLinkInteractorProvider.get());
        injectPromoService(instance, this.promoServiceProvider.get());
        injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
    }

    public static void injectUserService(BetListResultDialogFragment instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectSingleBetInteractor(BetListResultDialogFragment instance, SingleBetInteractor singleBetInteractor) {
        instance.singleBetInteractor = singleBetInteractor;
    }

    public static void injectVideoRewardService(BetListResultDialogFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectGetBetShareInstallLinkInteractor(BetListResultDialogFragment instance, GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor) {
        instance.getBetShareInstallLinkInteractor = getBetShareInstallLinkInteractor;
    }

    public static void injectPromoService(BetListResultDialogFragment instance, PromoService promoService) {
        instance.promoService = promoService;
    }

    public static void injectPromoInterstitialRulesSync(BetListResultDialogFragment instance, PromoInterstitialRulesSync promoInterstitialRulesSync) {
        instance.promoInterstitialRulesSync = promoInterstitialRulesSync;
    }
}
