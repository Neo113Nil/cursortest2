package org.betup.ui;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.bus.NavigateMessage;
import org.betup.interstitial.InterstitialAdCoordinator;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewShopItemsInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.shop.ShopLayoutInteractor;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;
import org.betup.model.remote.api.rest.user.V7TourMarketingRewardsInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateAppVersionInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTimezoneInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.presentation.PresentationCoordinator;
import org.betup.presentation.ScreenTracker;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.billing.BillingService;
import org.betup.services.casino.CasinoService;
import org.betup.services.chats.ChatService;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.experiments.ABTestService;
import org.betup.services.navigate.NavigationService;
import org.betup.services.offer.AdsInitializer;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.push.PushTokenService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.SocialConnectionService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;
import org.betup.ui.tour.controller.TourFavoriteSportsController;
import org.betup.utils.balance.BalanceHolder;

/* loaded from: classes2.dex */
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
    private final Provider<ABTestService> abTestServiceProvider;
    private final Provider<AdUnitRegistry> adUnitRegistryProvider;
    private final Provider<AdsInitializer> adsInitializerProvider;
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BalanceHolder> balanceHolderProvider;
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<BetsController> betsControllerProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<CasinoService> casinoServiceProvider;
    private final Provider<ChatService> chatServiceProvider;
    private final Provider<DailyBonusController> dailyBonusControllerProvider;
    private final Provider<HomeDailyQuestController> homeDailyQuestControllerProvider;
    private final Provider<HomeVideoBonusController> homeVideoBonusControllerProvider;
    private final Provider<InterstitialAdController> interstitialAdControllerProvider;
    private final Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<MatchInfoInteractor> matchInfoInteractorProvider;
    private final Provider<NavigationService<NavigateMessage.Target>> navigationServiceProvider;
    private final Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider;
    private final Provider<NewShopItemsInteractor> newShopItemsInteractorProvider;
    private final Provider<PresentationCoordinator> presentationCoordinatorProvider;
    private final Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider;
    private final Provider<PromoService> promoServiceProvider;
    private final Provider<PushStorageProvider> pushStorageProvider;
    private final Provider<PushTokenService> pushTokenServiceProvider;
    private final Provider<FirebaseRemoteConfig> remoteConfigProvider;
    private final Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider;
    private final Provider<ScreenTracker> screenTrackerProvider;
    private final Provider<ServerErrorsProcessor> serverErrorsProcessorProvider;
    private final Provider<ShopLayoutInteractor> shopLayoutInteractorProvider;
    private final Provider<NewSingleShopInteractor> singleShopInteractorProvider;
    private final Provider<SocialConnectionService> socialConnectionServiceProvider;
    private final Provider<TourFavoriteSportsController> tourFavoriteSportsControllerProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider;
    private final Provider<V7ReferralInteractor> v7ReferralInteractorProvider;
    private final Provider<V7TourMarketingRewardsInteractor> v7TourMarketingRewardsInteractorProvider;
    private final Provider<V7UpdateAppVersionInteractor> v7UpdateAppVersionInteractorProvider;
    private final Provider<V7UpdateTimezoneInteractor> v7UpdateTimezoneInteractorProvider;
    private final Provider<V7UpdateTutorialCompleteInteractor> v7UpdateTutorialCompleteInteractorProvider;
    private final Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider;
    private final Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public MainActivity_MembersInjector(Provider<AdsInitializer> adsInitializerProvider, Provider<UserService> userServiceProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider, Provider<PromoService> promoServiceProvider, Provider<CasinoService> casinoServiceProvider, Provider<V7ReferralInteractor> v7ReferralInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<NavigationService<NavigateMessage.Target>> navigationServiceProvider, Provider<V7UpdateTutorialCompleteInteractor> v7UpdateTutorialCompleteInteractorProvider, Provider<V7TourMarketingRewardsInteractor> v7TourMarketingRewardsInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<MatchInfoInteractor> matchInfoInteractorProvider, Provider<V7UpdateTimezoneInteractor> v7UpdateTimezoneInteractorProvider, Provider<ChatService> chatServiceProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<PushTokenService> pushTokenServiceProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<FirebaseRemoteConfig> remoteConfigProvider, Provider<V7UpdateAppVersionInteractor> v7UpdateAppVersionInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<ServerErrorsProcessor> serverErrorsProcessorProvider, Provider<SocialConnectionService> socialConnectionServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<ABTestService> abTestServiceProvider, Provider<InterstitialAdController> interstitialAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider, Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider, Provider<NewShopItemsInteractor> newShopItemsInteractorProvider, Provider<ShopLayoutInteractor> shopLayoutInteractorProvider, Provider<DailyBonusController> dailyBonusControllerProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<HomeVideoBonusController> homeVideoBonusControllerProvider, Provider<BalanceHolder> balanceHolderProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<TourFavoriteSportsController> tourFavoriteSportsControllerProvider, Provider<BetsController> betsControllerProvider, Provider<PresentationCoordinator> presentationCoordinatorProvider, Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider, Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider, Provider<ScreenTracker> screenTrackerProvider) {
        this.adsInitializerProvider = adsInitializerProvider;
        this.userServiceProvider = userServiceProvider;
        this.promoInterstitialRulesSyncProvider = promoInterstitialRulesSyncProvider;
        this.promoServiceProvider = promoServiceProvider;
        this.casinoServiceProvider = casinoServiceProvider;
        this.v7ReferralInteractorProvider = v7ReferralInteractorProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.navigationServiceProvider = navigationServiceProvider;
        this.v7UpdateTutorialCompleteInteractorProvider = v7UpdateTutorialCompleteInteractorProvider;
        this.v7TourMarketingRewardsInteractorProvider = v7TourMarketingRewardsInteractorProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.matchInfoInteractorProvider = matchInfoInteractorProvider;
        this.v7UpdateTimezoneInteractorProvider = v7UpdateTimezoneInteractorProvider;
        this.chatServiceProvider = chatServiceProvider;
        this.pushStorageProvider = pushStorageProvider;
        this.pushTokenServiceProvider = pushTokenServiceProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.singleShopInteractorProvider = singleShopInteractorProvider;
        this.remoteConfigProvider = remoteConfigProvider;
        this.v7UpdateAppVersionInteractorProvider = v7UpdateAppVersionInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.serverErrorsProcessorProvider = serverErrorsProcessorProvider;
        this.socialConnectionServiceProvider = socialConnectionServiceProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.abTestServiceProvider = abTestServiceProvider;
        this.interstitialAdControllerProvider = interstitialAdControllerProvider;
        this.adUnitRegistryProvider = adUnitRegistryProvider;
        this.v7DailyBonusInteractorProvider = v7DailyBonusInteractorProvider;
        this.v7UserAchievementsInteractorProvider = v7UserAchievementsInteractorProvider;
        this.newActiveCompetitionsInteractorProvider = newActiveCompetitionsInteractorProvider;
        this.newShopItemsInteractorProvider = newShopItemsInteractorProvider;
        this.shopLayoutInteractorProvider = shopLayoutInteractorProvider;
        this.dailyBonusControllerProvider = dailyBonusControllerProvider;
        this.homeDailyQuestControllerProvider = homeDailyQuestControllerProvider;
        this.homeVideoBonusControllerProvider = homeVideoBonusControllerProvider;
        this.balanceHolderProvider = balanceHolderProvider;
        this.v7UserBetStatisticsInteractorProvider = v7UserBetStatisticsInteractorProvider;
        this.tourFavoriteSportsControllerProvider = tourFavoriteSportsControllerProvider;
        this.betsControllerProvider = betsControllerProvider;
        this.presentationCoordinatorProvider = presentationCoordinatorProvider;
        this.interstitialAdCoordinatorProvider = interstitialAdCoordinatorProvider;
        this.rewardedVideoOfferCoordinatorProvider = rewardedVideoOfferCoordinatorProvider;
        this.screenTrackerProvider = screenTrackerProvider;
    }

    public static MembersInjector<MainActivity> create(Provider<AdsInitializer> adsInitializerProvider, Provider<UserService> userServiceProvider, Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider, Provider<PromoService> promoServiceProvider, Provider<CasinoService> casinoServiceProvider, Provider<V7ReferralInteractor> v7ReferralInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<NavigationService<NavigateMessage.Target>> navigationServiceProvider, Provider<V7UpdateTutorialCompleteInteractor> v7UpdateTutorialCompleteInteractorProvider, Provider<V7TourMarketingRewardsInteractor> v7TourMarketingRewardsInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<MatchInfoInteractor> matchInfoInteractorProvider, Provider<V7UpdateTimezoneInteractor> v7UpdateTimezoneInteractorProvider, Provider<ChatService> chatServiceProvider, Provider<PushStorageProvider> pushStorageProvider, Provider<PushTokenService> pushTokenServiceProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<FirebaseRemoteConfig> remoteConfigProvider, Provider<V7UpdateAppVersionInteractor> v7UpdateAppVersionInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<ServerErrorsProcessor> serverErrorsProcessorProvider, Provider<SocialConnectionService> socialConnectionServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<ABTestService> abTestServiceProvider, Provider<InterstitialAdController> interstitialAdControllerProvider, Provider<AdUnitRegistry> adUnitRegistryProvider, Provider<V7DailyBonusInteractor> v7DailyBonusInteractorProvider, Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider, Provider<NewActiveCompetitionsInteractor> newActiveCompetitionsInteractorProvider, Provider<NewShopItemsInteractor> newShopItemsInteractorProvider, Provider<ShopLayoutInteractor> shopLayoutInteractorProvider, Provider<DailyBonusController> dailyBonusControllerProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<HomeVideoBonusController> homeVideoBonusControllerProvider, Provider<BalanceHolder> balanceHolderProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<TourFavoriteSportsController> tourFavoriteSportsControllerProvider, Provider<BetsController> betsControllerProvider, Provider<PresentationCoordinator> presentationCoordinatorProvider, Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider, Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider, Provider<ScreenTracker> screenTrackerProvider) {
        return new MainActivity_MembersInjector(adsInitializerProvider, userServiceProvider, promoInterstitialRulesSyncProvider, promoServiceProvider, casinoServiceProvider, v7ReferralInteractorProvider, betListAppenderProvider, navigationServiceProvider, v7UpdateTutorialCompleteInteractorProvider, v7TourMarketingRewardsInteractorProvider, billingServiceProvider, matchInfoInteractorProvider, v7UpdateTimezoneInteractorProvider, chatServiceProvider, pushStorageProvider, pushTokenServiceProvider, localPreferencesServiceProvider, singleShopInteractorProvider, remoteConfigProvider, v7UpdateAppVersionInteractorProvider, analyticsServiceProvider, serverErrorsProcessorProvider, socialConnectionServiceProvider, videoRewardServiceProvider, abTestServiceProvider, interstitialAdControllerProvider, adUnitRegistryProvider, v7DailyBonusInteractorProvider, v7UserAchievementsInteractorProvider, newActiveCompetitionsInteractorProvider, newShopItemsInteractorProvider, shopLayoutInteractorProvider, dailyBonusControllerProvider, homeDailyQuestControllerProvider, homeVideoBonusControllerProvider, balanceHolderProvider, v7UserBetStatisticsInteractorProvider, tourFavoriteSportsControllerProvider, betsControllerProvider, presentationCoordinatorProvider, interstitialAdCoordinatorProvider, rewardedVideoOfferCoordinatorProvider, screenTrackerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainActivity instance) {
        injectAdsInitializer(instance, this.adsInitializerProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
        injectPromoService(instance, this.promoServiceProvider.get());
        injectCasinoService(instance, this.casinoServiceProvider.get());
        injectV7ReferralInteractor(instance, this.v7ReferralInteractorProvider.get());
        injectBetListAppender(instance, this.betListAppenderProvider.get());
        injectNavigationService(instance, this.navigationServiceProvider.get());
        injectV7UpdateTutorialCompleteInteractor(instance, this.v7UpdateTutorialCompleteInteractorProvider.get());
        injectV7TourMarketingRewardsInteractor(instance, this.v7TourMarketingRewardsInteractorProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectMatchInfoInteractor(instance, this.matchInfoInteractorProvider.get());
        injectV7UpdateTimezoneInteractor(instance, this.v7UpdateTimezoneInteractorProvider.get());
        injectChatService(instance, this.chatServiceProvider.get());
        injectPushStorageProvider(instance, this.pushStorageProvider.get());
        injectPushTokenService(instance, this.pushTokenServiceProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        injectSingleShopInteractor(instance, this.singleShopInteractorProvider.get());
        injectRemoteConfig(instance, this.remoteConfigProvider.get());
        injectV7UpdateAppVersionInteractor(instance, this.v7UpdateAppVersionInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
        injectSocialConnectionService(instance, this.socialConnectionServiceProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectAbTestService(instance, this.abTestServiceProvider.get());
        injectInterstitialAdController(instance, this.interstitialAdControllerProvider.get());
        injectAdUnitRegistry(instance, this.adUnitRegistryProvider.get());
        injectV7DailyBonusInteractor(instance, this.v7DailyBonusInteractorProvider.get());
        injectV7UserAchievementsInteractor(instance, this.v7UserAchievementsInteractorProvider.get());
        injectNewActiveCompetitionsInteractor(instance, this.newActiveCompetitionsInteractorProvider.get());
        injectNewShopItemsInteractor(instance, this.newShopItemsInteractorProvider.get());
        injectShopLayoutInteractor(instance, this.shopLayoutInteractorProvider.get());
        injectDailyBonusController(instance, this.dailyBonusControllerProvider.get());
        injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        injectHomeVideoBonusController(instance, this.homeVideoBonusControllerProvider.get());
        injectBalanceHolder(instance, this.balanceHolderProvider.get());
        injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        injectTourFavoriteSportsController(instance, this.tourFavoriteSportsControllerProvider.get());
        injectBetsController(instance, this.betsControllerProvider.get());
        injectPresentationCoordinator(instance, this.presentationCoordinatorProvider.get());
        injectInterstitialAdCoordinator(instance, this.interstitialAdCoordinatorProvider.get());
        injectRewardedVideoOfferCoordinator(instance, this.rewardedVideoOfferCoordinatorProvider.get());
        injectScreenTracker(instance, this.screenTrackerProvider.get());
    }

    public static void injectAdsInitializer(MainActivity instance, AdsInitializer adsInitializer) {
        instance.adsInitializer = adsInitializer;
    }

    public static void injectUserService(MainActivity instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectPromoInterstitialRulesSync(MainActivity instance, PromoInterstitialRulesSync promoInterstitialRulesSync) {
        instance.promoInterstitialRulesSync = promoInterstitialRulesSync;
    }

    public static void injectPromoService(MainActivity instance, PromoService promoService) {
        instance.promoService = promoService;
    }

    public static void injectCasinoService(MainActivity instance, CasinoService casinoService) {
        instance.casinoService = casinoService;
    }

    public static void injectV7ReferralInteractor(MainActivity instance, V7ReferralInteractor v7ReferralInteractor) {
        instance.v7ReferralInteractor = v7ReferralInteractor;
    }

    public static void injectBetListAppender(MainActivity instance, BetListAppender betListAppender) {
        instance.betListAppender = betListAppender;
    }

    public static void injectNavigationService(MainActivity instance, NavigationService<NavigateMessage.Target> navigationService) {
        instance.navigationService = navigationService;
    }

    public static void injectV7UpdateTutorialCompleteInteractor(MainActivity instance, V7UpdateTutorialCompleteInteractor v7UpdateTutorialCompleteInteractor) {
        instance.v7UpdateTutorialCompleteInteractor = v7UpdateTutorialCompleteInteractor;
    }

    public static void injectV7TourMarketingRewardsInteractor(MainActivity instance, V7TourMarketingRewardsInteractor v7TourMarketingRewardsInteractor) {
        instance.v7TourMarketingRewardsInteractor = v7TourMarketingRewardsInteractor;
    }

    public static void injectBillingService(MainActivity instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectMatchInfoInteractor(MainActivity instance, MatchInfoInteractor matchInfoInteractor) {
        instance.matchInfoInteractor = matchInfoInteractor;
    }

    public static void injectV7UpdateTimezoneInteractor(MainActivity instance, V7UpdateTimezoneInteractor v7UpdateTimezoneInteractor) {
        instance.v7UpdateTimezoneInteractor = v7UpdateTimezoneInteractor;
    }

    public static void injectChatService(MainActivity instance, ChatService chatService) {
        instance.chatService = chatService;
    }

    public static void injectPushStorageProvider(MainActivity instance, PushStorageProvider pushStorageProvider) {
        instance.pushStorageProvider = pushStorageProvider;
    }

    public static void injectPushTokenService(MainActivity instance, PushTokenService pushTokenService) {
        instance.pushTokenService = pushTokenService;
    }

    public static void injectLocalPreferencesService(MainActivity instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }

    public static void injectSingleShopInteractor(MainActivity instance, NewSingleShopInteractor singleShopInteractor) {
        instance.singleShopInteractor = singleShopInteractor;
    }

    public static void injectRemoteConfig(MainActivity instance, FirebaseRemoteConfig remoteConfig) {
        instance.remoteConfig = remoteConfig;
    }

    public static void injectV7UpdateAppVersionInteractor(MainActivity instance, V7UpdateAppVersionInteractor v7UpdateAppVersionInteractor) {
        instance.v7UpdateAppVersionInteractor = v7UpdateAppVersionInteractor;
    }

    public static void injectAnalyticsService(MainActivity instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectServerErrorsProcessor(MainActivity instance, ServerErrorsProcessor serverErrorsProcessor) {
        instance.serverErrorsProcessor = serverErrorsProcessor;
    }

    public static void injectSocialConnectionService(MainActivity instance, SocialConnectionService socialConnectionService) {
        instance.socialConnectionService = socialConnectionService;
    }

    public static void injectVideoRewardService(MainActivity instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectAbTestService(MainActivity instance, ABTestService abTestService) {
        instance.abTestService = abTestService;
    }

    public static void injectInterstitialAdController(MainActivity instance, InterstitialAdController interstitialAdController) {
        instance.interstitialAdController = interstitialAdController;
    }

    public static void injectAdUnitRegistry(MainActivity instance, AdUnitRegistry adUnitRegistry) {
        instance.adUnitRegistry = adUnitRegistry;
    }

    public static void injectV7DailyBonusInteractor(MainActivity instance, V7DailyBonusInteractor v7DailyBonusInteractor) {
        instance.v7DailyBonusInteractor = v7DailyBonusInteractor;
    }

    public static void injectV7UserAchievementsInteractor(MainActivity instance, V7UserAchievementsInteractor v7UserAchievementsInteractor) {
        instance.v7UserAchievementsInteractor = v7UserAchievementsInteractor;
    }

    public static void injectNewActiveCompetitionsInteractor(MainActivity instance, NewActiveCompetitionsInteractor newActiveCompetitionsInteractor) {
        instance.newActiveCompetitionsInteractor = newActiveCompetitionsInteractor;
    }

    public static void injectNewShopItemsInteractor(MainActivity instance, NewShopItemsInteractor newShopItemsInteractor) {
        instance.newShopItemsInteractor = newShopItemsInteractor;
    }

    public static void injectShopLayoutInteractor(MainActivity instance, ShopLayoutInteractor shopLayoutInteractor) {
        instance.shopLayoutInteractor = shopLayoutInteractor;
    }

    public static void injectDailyBonusController(MainActivity instance, DailyBonusController dailyBonusController) {
        instance.dailyBonusController = dailyBonusController;
    }

    public static void injectHomeDailyQuestController(MainActivity instance, HomeDailyQuestController homeDailyQuestController) {
        instance.homeDailyQuestController = homeDailyQuestController;
    }

    public static void injectHomeVideoBonusController(MainActivity instance, HomeVideoBonusController homeVideoBonusController) {
        instance.homeVideoBonusController = homeVideoBonusController;
    }

    public static void injectBalanceHolder(MainActivity instance, BalanceHolder balanceHolder) {
        instance.balanceHolder = balanceHolder;
    }

    public static void injectV7UserBetStatisticsInteractor(MainActivity instance, V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor) {
        instance.v7UserBetStatisticsInteractor = v7UserBetStatisticsInteractor;
    }

    public static void injectTourFavoriteSportsController(MainActivity instance, TourFavoriteSportsController tourFavoriteSportsController) {
        instance.tourFavoriteSportsController = tourFavoriteSportsController;
    }

    public static void injectBetsController(MainActivity instance, BetsController betsController) {
        instance.betsController = betsController;
    }

    public static void injectPresentationCoordinator(MainActivity instance, PresentationCoordinator presentationCoordinator) {
        instance.presentationCoordinator = presentationCoordinator;
    }

    public static void injectInterstitialAdCoordinator(MainActivity instance, InterstitialAdCoordinator interstitialAdCoordinator) {
        instance.interstitialAdCoordinator = interstitialAdCoordinator;
    }

    public static void injectRewardedVideoOfferCoordinator(MainActivity instance, RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator) {
        instance.rewardedVideoOfferCoordinator = rewardedVideoOfferCoordinator;
    }

    public static void injectScreenTracker(MainActivity instance, ScreenTracker screenTracker) {
        instance.screenTracker = screenTracker;
    }
}
