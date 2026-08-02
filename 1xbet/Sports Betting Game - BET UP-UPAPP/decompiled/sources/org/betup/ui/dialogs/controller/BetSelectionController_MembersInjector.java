package org.betup.ui.dialogs.controller;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.billing.BillingService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.matches.filter.MatchFilterState;

/* loaded from: classes2.dex */
public final class BetSelectionController_MembersInjector implements MembersInjector<BetSelectionController> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider;
    private final Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider;
    private final Provider<MatchFilterState> matchFilterStateProvider;
    private final Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider;
    private final Provider<NewSingleShopInteractor> singleShopInteractorProvider;
    private final Provider<UserService> userServiceProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public BetSelectionController_MembersInjector(Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<UserService> userServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        this.matchBetGroupsInteractorProvider = matchBetGroupsInteractorProvider;
        this.matchDetailsInteractorProvider = matchDetailsInteractorProvider;
        this.challengeAcceptInteractorProvider = challengeAcceptInteractorProvider;
        this.newChallengeDetailsInteractorProvider = newChallengeDetailsInteractorProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.singleShopInteractorProvider = singleShopInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.userServiceProvider = userServiceProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.matchFilterStateProvider = matchFilterStateProvider;
    }

    public static MembersInjector<BetSelectionController> create(Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<UserService> userServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new BetSelectionController_MembersInjector(matchBetGroupsInteractorProvider, matchDetailsInteractorProvider, challengeAcceptInteractorProvider, newChallengeDetailsInteractorProvider, billingServiceProvider, firebaseRemoteConfigProvider, singleShopInteractorProvider, analyticsServiceProvider, userServiceProvider, videoRewardServiceProvider, matchFilterStateProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BetSelectionController instance) {
        injectMatchBetGroupsInteractor(instance, this.matchBetGroupsInteractorProvider.get());
        injectMatchDetailsInteractor(instance, this.matchDetailsInteractorProvider.get());
        injectChallengeAcceptInteractor(instance, this.challengeAcceptInteractorProvider.get());
        injectNewChallengeDetailsInteractor(instance, this.newChallengeDetailsInteractorProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectSingleShopInteractor(instance, this.singleShopInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectMatchFilterState(instance, this.matchFilterStateProvider.get());
    }

    public static void injectMatchBetGroupsInteractor(BetSelectionController instance, MatchVarietiesInteractor matchBetGroupsInteractor) {
        instance.matchBetGroupsInteractor = matchBetGroupsInteractor;
    }

    public static void injectMatchDetailsInteractor(BetSelectionController instance, MatchShortInfoInteractor matchDetailsInteractor) {
        instance.matchDetailsInteractor = matchDetailsInteractor;
    }

    public static void injectChallengeAcceptInteractor(BetSelectionController instance, ChallengeAcceptInteractor challengeAcceptInteractor) {
        instance.challengeAcceptInteractor = challengeAcceptInteractor;
    }

    public static void injectNewChallengeDetailsInteractor(BetSelectionController instance, NewChallengeDetailsInteractor newChallengeDetailsInteractor) {
        instance.newChallengeDetailsInteractor = newChallengeDetailsInteractor;
    }

    public static void injectBillingService(BetSelectionController instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectFirebaseRemoteConfig(BetSelectionController instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectSingleShopInteractor(BetSelectionController instance, NewSingleShopInteractor singleShopInteractor) {
        instance.singleShopInteractor = singleShopInteractor;
    }

    public static void injectAnalyticsService(BetSelectionController instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectUserService(BetSelectionController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectVideoRewardService(BetSelectionController instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectMatchFilterState(BetSelectionController instance, MatchFilterState matchFilterState) {
        instance.matchFilterState = matchFilterState;
    }
}
