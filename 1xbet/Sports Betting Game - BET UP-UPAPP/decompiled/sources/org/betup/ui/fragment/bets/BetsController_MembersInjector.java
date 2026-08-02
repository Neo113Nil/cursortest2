package org.betup.ui.fragment.bets;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.betslip.V7CreateBetlistInteractor;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;
import org.betup.model.remote.api.rest.energy.NewChallengeCreateInteractor;
import org.betup.model.remote.api.rest.shop.CancelBetInteractor;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.model.remote.api.rest.shop.GetCancelBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.GetSellBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.shop.SellBetInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyBetRestrictionsInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyVersionGatesInteractor;
import org.betup.model.remote.api.rest.user.bets.BetStatInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.billing.BillingService;
import org.betup.services.challenge.ChallengeTourInfoProvider;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class BetsController_MembersInjector implements MembersInjector<BetsController> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<BetsListInteractor> betsListInteractorProvider;
    private final Provider<BetStatInteractor> betsStatInteractorProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<CancelBetInteractor> cancelBetInteractorProvider;
    private final Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider;
    private final Provider<ChallengeTourInfoProvider> challengeTourInfoProvider;
    private final Provider<V7CreateBetlistInteractor> createBetlistInteractorProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider;
    private final Provider<GetCancelBetInfoInteractor> getCancelBetInfoInteractorProvider;
    private final Provider<GetSellBetInfoInteractor> getSellBetInfoInteractorProvider;
    private final Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<SellBetInteractor> sellBetInteractorProvider;
    private final Provider<NewSingleShopInteractor> singleShopInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<V7VarietyBetRestrictionsInteractor> v7VarietyBetRestrictionsInteractorProvider;
    private final Provider<V7VarietyVersionGatesInteractor> v7VarietyVersionGatesInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public BetsController_MembersInjector(Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider, Provider<V7CreateBetlistInteractor> createBetlistInteractorProvider, Provider<UserService> userServiceProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<BetListAppender> betListAppenderProvider, Provider<ChallengeTourInfoProvider> challengeTourInfoProvider, Provider<BetsListInteractor> betsListInteractorProvider, Provider<BetStatInteractor> betsStatInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<GetCancelBetInfoInteractor> getCancelBetInfoInteractorProvider, Provider<GetSellBetInfoInteractor> getSellBetInfoInteractorProvider, Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider, Provider<CancelBetInteractor> cancelBetInteractorProvider, Provider<SellBetInteractor> sellBetInteractorProvider, Provider<V7VarietyBetRestrictionsInteractor> v7VarietyBetRestrictionsInteractorProvider, Provider<V7VarietyVersionGatesInteractor> v7VarietyVersionGatesInteractorProvider, Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider) {
        this.grabbedBetsInteractorProvider = grabbedBetsInteractorProvider;
        this.createBetlistInteractorProvider = createBetlistInteractorProvider;
        this.userServiceProvider = userServiceProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.singleShopInteractorProvider = singleShopInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.challengeTourInfoProvider = challengeTourInfoProvider;
        this.betsListInteractorProvider = betsListInteractorProvider;
        this.betsStatInteractorProvider = betsStatInteractorProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.getCancelBetInfoInteractorProvider = getCancelBetInfoInteractorProvider;
        this.getSellBetInfoInteractorProvider = getSellBetInfoInteractorProvider;
        this.getBetShareInstallLinkInteractorProvider = getBetShareInstallLinkInteractorProvider;
        this.cancelBetInteractorProvider = cancelBetInteractorProvider;
        this.sellBetInteractorProvider = sellBetInteractorProvider;
        this.v7VarietyBetRestrictionsInteractorProvider = v7VarietyBetRestrictionsInteractorProvider;
        this.v7VarietyVersionGatesInteractorProvider = v7VarietyVersionGatesInteractorProvider;
        this.challengeCreateInteractorProvider = challengeCreateInteractorProvider;
    }

    public static MembersInjector<BetsController> create(Provider<V7GrabbedBetsInteractor> grabbedBetsInteractorProvider, Provider<V7CreateBetlistInteractor> createBetlistInteractorProvider, Provider<UserService> userServiceProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<BetListAppender> betListAppenderProvider, Provider<ChallengeTourInfoProvider> challengeTourInfoProvider, Provider<BetsListInteractor> betsListInteractorProvider, Provider<BetStatInteractor> betsStatInteractorProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<GetCancelBetInfoInteractor> getCancelBetInfoInteractorProvider, Provider<GetSellBetInfoInteractor> getSellBetInfoInteractorProvider, Provider<GetBetShareInstallLinkInteractor> getBetShareInstallLinkInteractorProvider, Provider<CancelBetInteractor> cancelBetInteractorProvider, Provider<SellBetInteractor> sellBetInteractorProvider, Provider<V7VarietyBetRestrictionsInteractor> v7VarietyBetRestrictionsInteractorProvider, Provider<V7VarietyVersionGatesInteractor> v7VarietyVersionGatesInteractorProvider, Provider<NewChallengeCreateInteractor> challengeCreateInteractorProvider) {
        return new BetsController_MembersInjector(grabbedBetsInteractorProvider, createBetlistInteractorProvider, userServiceProvider, localPreferencesServiceProvider, billingServiceProvider, firebaseRemoteConfigProvider, singleShopInteractorProvider, analyticsServiceProvider, betListAppenderProvider, challengeTourInfoProvider, betsListInteractorProvider, betsStatInteractorProvider, videoRewardServiceProvider, getCancelBetInfoInteractorProvider, getSellBetInfoInteractorProvider, getBetShareInstallLinkInteractorProvider, cancelBetInteractorProvider, sellBetInteractorProvider, v7VarietyBetRestrictionsInteractorProvider, v7VarietyVersionGatesInteractorProvider, challengeCreateInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetsController instance) {
        injectGrabbedBetsInteractor(instance, this.grabbedBetsInteractorProvider.get());
        injectCreateBetlistInteractor(instance, this.createBetlistInteractorProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectSingleShopInteractor(instance, this.singleShopInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectBetListAppender(instance, this.betListAppenderProvider.get());
        injectChallengeTourInfoProvider(instance, this.challengeTourInfoProvider.get());
        injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
        injectBetsStatInteractor(instance, this.betsStatInteractorProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectGetCancelBetInfoInteractor(instance, this.getCancelBetInfoInteractorProvider.get());
        injectGetSellBetInfoInteractor(instance, this.getSellBetInfoInteractorProvider.get());
        injectGetBetShareInstallLinkInteractor(instance, this.getBetShareInstallLinkInteractorProvider.get());
        injectCancelBetInteractor(instance, this.cancelBetInteractorProvider.get());
        injectSellBetInteractor(instance, this.sellBetInteractorProvider.get());
        injectV7VarietyBetRestrictionsInteractor(instance, this.v7VarietyBetRestrictionsInteractorProvider.get());
        injectV7VarietyVersionGatesInteractor(instance, this.v7VarietyVersionGatesInteractorProvider.get());
        injectChallengeCreateInteractor(instance, this.challengeCreateInteractorProvider.get());
    }

    public static void injectGrabbedBetsInteractor(BetsController instance, V7GrabbedBetsInteractor grabbedBetsInteractor) {
        instance.grabbedBetsInteractor = grabbedBetsInteractor;
    }

    public static void injectCreateBetlistInteractor(BetsController instance, V7CreateBetlistInteractor createBetlistInteractor) {
        instance.createBetlistInteractor = createBetlistInteractor;
    }

    public static void injectUserService(BetsController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectLocalPreferencesService(BetsController instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }

    public static void injectBillingService(BetsController instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectFirebaseRemoteConfig(BetsController instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectSingleShopInteractor(BetsController instance, NewSingleShopInteractor singleShopInteractor) {
        instance.singleShopInteractor = singleShopInteractor;
    }

    public static void injectAnalyticsService(BetsController instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectBetListAppender(BetsController instance, BetListAppender betListAppender) {
        instance.betListAppender = betListAppender;
    }

    public static void injectChallengeTourInfoProvider(BetsController instance, ChallengeTourInfoProvider challengeTourInfoProvider) {
        instance.challengeTourInfoProvider = challengeTourInfoProvider;
    }

    public static void injectBetsListInteractor(BetsController instance, BetsListInteractor betsListInteractor) {
        instance.betsListInteractor = betsListInteractor;
    }

    public static void injectBetsStatInteractor(BetsController instance, BetStatInteractor betsStatInteractor) {
        instance.betsStatInteractor = betsStatInteractor;
    }

    public static void injectVideoRewardService(BetsController instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectGetCancelBetInfoInteractor(BetsController instance, GetCancelBetInfoInteractor getCancelBetInfoInteractor) {
        instance.getCancelBetInfoInteractor = getCancelBetInfoInteractor;
    }

    public static void injectGetSellBetInfoInteractor(BetsController instance, GetSellBetInfoInteractor getSellBetInfoInteractor) {
        instance.getSellBetInfoInteractor = getSellBetInfoInteractor;
    }

    public static void injectGetBetShareInstallLinkInteractor(BetsController instance, GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor) {
        instance.getBetShareInstallLinkInteractor = getBetShareInstallLinkInteractor;
    }

    public static void injectCancelBetInteractor(BetsController instance, CancelBetInteractor cancelBetInteractor) {
        instance.cancelBetInteractor = cancelBetInteractor;
    }

    public static void injectSellBetInteractor(BetsController instance, SellBetInteractor sellBetInteractor) {
        instance.sellBetInteractor = sellBetInteractor;
    }

    public static void injectV7VarietyBetRestrictionsInteractor(BetsController instance, V7VarietyBetRestrictionsInteractor v7VarietyBetRestrictionsInteractor) {
        instance.v7VarietyBetRestrictionsInteractor = v7VarietyBetRestrictionsInteractor;
    }

    public static void injectV7VarietyVersionGatesInteractor(BetsController instance, V7VarietyVersionGatesInteractor v7VarietyVersionGatesInteractor) {
        instance.v7VarietyVersionGatesInteractor = v7VarietyVersionGatesInteractor;
    }

    public static void injectChallengeCreateInteractor(BetsController instance, NewChallengeCreateInteractor challengeCreateInteractor) {
        instance.challengeCreateInteractor = challengeCreateInteractor;
    }
}
