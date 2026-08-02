package org.betup.games;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.bus.NavigateMessage;
import org.betup.interstitial.InterstitialAdCoordinator;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.experiments.ABTestService;
import org.betup.services.navigate.NavigationService;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class MiniGameActivity_MembersInjector implements MembersInjector<MiniGameActivity> {
    private final Provider<ABTestService> abTestServiceProvider;
    private final Provider<AdUnitRegistry> adUnitRegistryProvider;
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<NavigationService<NavigateMessage.TargetGame>> gamesNavigationServiceProvider;
    private final Provider<InterstitialAdController> interstitialAdControllerProvider;
    private final Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider;
    private final Provider<NavigationService<NavigateMessage.Target>> navigationServiceProvider;
    private final Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider;
    private final Provider<PromoService> promoServiceProvider;
    private final Provider<ServerErrorsProcessor> serverErrorsProcessorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public MiniGameActivity_MembersInjector(Provider<UserService> userServiceProvider, Provider<NavigationService<NavigateMessage.TargetGame>> gamesNavigationServiceProvider, Provider<NavigationService<NavigateMessage.Target>> navigationServiceProvider, Provider<PromoService> promoServiceProvider, Provider<ServerErrorsProcessor> serverErrorsProcessorProvider, Provider<ABTestService> abTestServiceProvider, Provider<InterstitialAdController> interstitialAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider, Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider) {
        this.userServiceProvider = userServiceProvider;
        this.gamesNavigationServiceProvider = gamesNavigationServiceProvider;
        this.navigationServiceProvider = navigationServiceProvider;
        this.promoServiceProvider = promoServiceProvider;
        this.serverErrorsProcessorProvider = serverErrorsProcessorProvider;
        this.abTestServiceProvider = abTestServiceProvider;
        this.interstitialAdControllerProvider = interstitialAdControllerProvider;
        this.adUnitRegistryProvider = adUnitRegistryProvider;
        this.balanceHolderProvider = balanceHolderProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.interstitialAdCoordinatorProvider = interstitialAdCoordinatorProvider;
        this.promoInterstitialRulesSyncProvider = promoInterstitialRulesSyncProvider;
    }

    public static MembersInjector<MiniGameActivity> create(Provider<UserService> userServiceProvider, Provider<NavigationService<NavigateMessage.TargetGame>> gamesNavigationServiceProvider, Provider<NavigationService<NavigateMessage.Target>> navigationServiceProvider, Provider<PromoService> promoServiceProvider, Provider<ServerErrorsProcessor> serverErrorsProcessorProvider, Provider<ABTestService> abTestServiceProvider, Provider<InterstitialAdController> interstitialAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider, Provider<BalanceHolder> balanceHolderProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider) {
        return new MiniGameActivity_MembersInjector(userServiceProvider, gamesNavigationServiceProvider, navigationServiceProvider, promoServiceProvider, serverErrorsProcessorProvider, abTestServiceProvider, interstitialAdControllerProvider, adUnitRegistryProvider, balanceHolderProvider, videoRewardServiceProvider, interstitialAdCoordinatorProvider, promoInterstitialRulesSyncProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MiniGameActivity instance) {
        injectUserService(instance, this.userServiceProvider.get());
        injectGamesNavigationService(instance, this.gamesNavigationServiceProvider.get());
        injectNavigationService(instance, this.navigationServiceProvider.get());
        injectPromoService(instance, this.promoServiceProvider.get());
        injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
        injectAbTestService(instance, this.abTestServiceProvider.get());
        injectInterstitialAdController(instance, this.interstitialAdControllerProvider.get());
        injectAdUnitRegistry(instance, this.adUnitRegistryProvider.get());
        injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectInterstitialAdCoordinator(instance, this.interstitialAdCoordinatorProvider.get());
        injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
    }

    public static void injectUserService(MiniGameActivity instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectGamesNavigationService(MiniGameActivity instance, NavigationService<NavigateMessage.TargetGame> gamesNavigationService) {
        instance.gamesNavigationService = gamesNavigationService;
    }

    public static void injectNavigationService(MiniGameActivity instance, NavigationService<NavigateMessage.Target> navigationService) {
        instance.navigationService = navigationService;
    }

    public static void injectPromoService(MiniGameActivity instance, PromoService promoService) {
        instance.promoService = promoService;
    }

    public static void injectServerErrorsProcessor(MiniGameActivity instance, ServerErrorsProcessor serverErrorsProcessor) {
        instance.serverErrorsProcessor = serverErrorsProcessor;
    }

    public static void injectAbTestService(MiniGameActivity instance, ABTestService abTestService) {
        instance.abTestService = abTestService;
    }

    public static void injectInterstitialAdController(MiniGameActivity instance, InterstitialAdController interstitialAdController) {
        instance.interstitialAdController = interstitialAdController;
    }

    public static void injectAdUnitRegistry(MiniGameActivity instance, AdUnitRegistry adUnitRegistry) {
        instance.adUnitRegistry = adUnitRegistry;
    }

    public static void injectBalanceHolder(MiniGameActivity instance, BalanceHolder balanceHolder) {
        instance.balanceHolder = balanceHolder;
    }

    public static void injectVideoRewardService(MiniGameActivity instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectInterstitialAdCoordinator(MiniGameActivity instance, InterstitialAdCoordinator interstitialAdCoordinator) {
        instance.interstitialAdCoordinator = interstitialAdCoordinator;
    }

    public static void injectPromoInterstitialRulesSync(MiniGameActivity instance, PromoInterstitialRulesSync promoInterstitialRulesSync) {
        instance.promoInterstitialRulesSync = promoInterstitialRulesSync;
    }
}
