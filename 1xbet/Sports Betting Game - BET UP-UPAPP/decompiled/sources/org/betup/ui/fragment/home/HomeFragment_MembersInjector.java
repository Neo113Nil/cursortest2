package org.betup.ui.fragment.home;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.analytics.GetOffersInfoInteractor;
import org.betup.model.remote.api.rest.analytics.GetOffersListInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleActionCountsInteractor;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.experiments.ABTestService;
import org.betup.services.offer.VideoRewardService;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;

/* loaded from: classes4.dex */
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
    private final Provider<ABTestService> abTestServiceProvider;
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<NewUserBattleActionCountsInteractor> battleActionCountsInteractorProvider;
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<BetValidator> betValidatorProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<DailyBonusController> dailyBonusControllerProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<GetOffersInfoInteractor> getOffersInfoInteractorProvider;
    private final Provider<GetOffersListInteractor> getOffersListInteractorProvider;
    private final Provider<HomeDailyQuestController> homeDailyQuestControllerProvider;
    private final Provider<HomeVideoBonusController> homeVideoBonusControllerProvider;
    private final Provider<HotMatchesInteractor> hotMatchesInteractorProvider;
    private final Provider<MatchVarietiesInteractor> matchVarietiesInteractorProvider;
    private final Provider<NewSingleShopInteractor> singleShopInteractorProvider;
    private final Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider;
    private final Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider;
    private final Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public HomeFragment_MembersInjector(Provider<VideoRewardService> videoRewardServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider, Provider<HomeVideoBonusController> homeVideoBonusControllerProvider, Provider<ABTestService> abTestServiceProvider, Provider<GetOffersInfoInteractor> getOffersInfoInteractorProvider, Provider<GetOffersListInteractor> getOffersListInteractorProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<HotMatchesInteractor> hotMatchesInteractorProvider, Provider<MatchVarietiesInteractor> matchVarietiesInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<NewUserBattleActionCountsInteractor> battleActionCountsInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.dailyBonusControllerProvider = dailyBonusControllerProvider;
        this.homeVideoBonusControllerProvider = homeVideoBonusControllerProvider;
        this.abTestServiceProvider = abTestServiceProvider;
        this.getOffersInfoInteractorProvider = getOffersInfoInteractorProvider;
        this.getOffersListInteractorProvider = getOffersListInteractorProvider;
        this.homeDailyQuestControllerProvider = homeDailyQuestControllerProvider;
        this.hotMatchesInteractorProvider = hotMatchesInteractorProvider;
        this.matchVarietiesInteractorProvider = matchVarietiesInteractorProvider;
        this.v7UserBetStatisticsInteractorProvider = v7UserBetStatisticsInteractorProvider;
        this.v7UserRanksInteractorProvider = v7UserRanksInteractorProvider;
        this.v7UserInfoInteractorProvider = v7UserInfoInteractorProvider;
        this.battleActionCountsInteractorProvider = battleActionCountsInteractorProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.betValidatorProvider = betValidatorProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.singleShopInteractorProvider = singleShopInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
    }

    public static MembersInjector<HomeFragment> create(Provider<VideoRewardService> videoRewardServiceProvider, Provider<DailyBonusController> dailyBonusControllerProvider, Provider<HomeVideoBonusController> homeVideoBonusControllerProvider, Provider<ABTestService> abTestServiceProvider, Provider<GetOffersInfoInteractor> getOffersInfoInteractorProvider, Provider<GetOffersListInteractor> getOffersListInteractorProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<HotMatchesInteractor> hotMatchesInteractorProvider, Provider<MatchVarietiesInteractor> matchVarietiesInteractorProvider, Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider, Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider, Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider, Provider<NewUserBattleActionCountsInteractor> battleActionCountsInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider) {
        return new HomeFragment_MembersInjector(videoRewardServiceProvider, dailyBonusControllerProvider, homeVideoBonusControllerProvider, abTestServiceProvider, getOffersInfoInteractorProvider, getOffersListInteractorProvider, homeDailyQuestControllerProvider, hotMatchesInteractorProvider, matchVarietiesInteractorProvider, v7UserBetStatisticsInteractorProvider, v7UserRanksInteractorProvider, v7UserInfoInteractorProvider, battleActionCountsInteractorProvider, betListAppenderProvider, betValidatorProvider, billingServiceProvider, firebaseRemoteConfigProvider, singleShopInteractorProvider, analyticsServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HomeFragment instance) {
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectDailyBonusController(instance, this.dailyBonusControllerProvider.get());
        injectHomeVideoBonusController(instance, this.homeVideoBonusControllerProvider.get());
        injectAbTestService(instance, this.abTestServiceProvider.get());
        injectGetOffersInfoInteractor(instance, this.getOffersInfoInteractorProvider.get());
        injectGetOffersListInteractor(instance, this.getOffersListInteractorProvider.get());
        injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        injectHotMatchesInteractor(instance, this.hotMatchesInteractorProvider.get());
        injectMatchVarietiesInteractor(instance, this.matchVarietiesInteractorProvider.get());
        injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        injectV7UserRanksInteractor(instance, this.v7UserRanksInteractorProvider.get());
        injectV7UserInfoInteractor(instance, this.v7UserInfoInteractorProvider.get());
        injectBattleActionCountsInteractor(instance, this.battleActionCountsInteractorProvider.get());
        injectBetListAppender(instance, this.betListAppenderProvider.get());
        injectBetValidator(instance, this.betValidatorProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectSingleShopInteractor(instance, this.singleShopInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
    }

    public static void injectVideoRewardService(HomeFragment instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectDailyBonusController(HomeFragment instance, DailyBonusController dailyBonusController) {
        instance.dailyBonusController = dailyBonusController;
    }

    public static void injectHomeVideoBonusController(HomeFragment instance, HomeVideoBonusController homeVideoBonusController) {
        instance.homeVideoBonusController = homeVideoBonusController;
    }

    public static void injectAbTestService(HomeFragment instance, ABTestService abTestService) {
        instance.abTestService = abTestService;
    }

    public static void injectGetOffersInfoInteractor(HomeFragment instance, GetOffersInfoInteractor getOffersInfoInteractor) {
        instance.getOffersInfoInteractor = getOffersInfoInteractor;
    }

    public static void injectGetOffersListInteractor(HomeFragment instance, GetOffersListInteractor getOffersListInteractor) {
        instance.getOffersListInteractor = getOffersListInteractor;
    }

    public static void injectHomeDailyQuestController(HomeFragment instance, HomeDailyQuestController homeDailyQuestController) {
        instance.homeDailyQuestController = homeDailyQuestController;
    }

    public static void injectHotMatchesInteractor(HomeFragment instance, HotMatchesInteractor hotMatchesInteractor) {
        instance.hotMatchesInteractor = hotMatchesInteractor;
    }

    public static void injectMatchVarietiesInteractor(HomeFragment instance, MatchVarietiesInteractor matchVarietiesInteractor) {
        instance.matchVarietiesInteractor = matchVarietiesInteractor;
    }

    public static void injectV7UserBetStatisticsInteractor(HomeFragment instance, V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor) {
        instance.v7UserBetStatisticsInteractor = v7UserBetStatisticsInteractor;
    }

    public static void injectV7UserRanksInteractor(HomeFragment instance, V7UserRanksInteractor v7UserRanksInteractor) {
        instance.v7UserRanksInteractor = v7UserRanksInteractor;
    }

    public static void injectV7UserInfoInteractor(HomeFragment instance, V7UserInfoInteractor v7UserInfoInteractor) {
        instance.v7UserInfoInteractor = v7UserInfoInteractor;
    }

    public static void injectBattleActionCountsInteractor(HomeFragment instance, NewUserBattleActionCountsInteractor battleActionCountsInteractor) {
        instance.battleActionCountsInteractor = battleActionCountsInteractor;
    }

    public static void injectBetListAppender(HomeFragment instance, BetListAppender betListAppender) {
        instance.betListAppender = betListAppender;
    }

    public static void injectBetValidator(HomeFragment instance, BetValidator betValidator) {
        instance.betValidator = betValidator;
    }

    public static void injectBillingService(HomeFragment instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectFirebaseRemoteConfig(HomeFragment instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectSingleShopInteractor(HomeFragment instance, NewSingleShopInteractor singleShopInteractor) {
        instance.singleShopInteractor = singleShopInteractor;
    }

    public static void injectAnalyticsService(HomeFragment instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }
}
