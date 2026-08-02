package org.betup.ui.dialogs.controller;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.Factory;
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
public final class BetSelectionController_Factory implements Factory<BetSelectionController> {
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

    public BetSelectionController_Factory(Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<UserService> userServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
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

    @Override // javax.inject.Provider
    public BetSelectionController get() {
        BetSelectionController betSelectionController = new BetSelectionController();
        BetSelectionController_MembersInjector.injectMatchBetGroupsInteractor(betSelectionController, this.matchBetGroupsInteractorProvider.get());
        BetSelectionController_MembersInjector.injectMatchDetailsInteractor(betSelectionController, this.matchDetailsInteractorProvider.get());
        BetSelectionController_MembersInjector.injectChallengeAcceptInteractor(betSelectionController, this.challengeAcceptInteractorProvider.get());
        BetSelectionController_MembersInjector.injectNewChallengeDetailsInteractor(betSelectionController, this.newChallengeDetailsInteractorProvider.get());
        BetSelectionController_MembersInjector.injectBillingService(betSelectionController, this.billingServiceProvider.get());
        BetSelectionController_MembersInjector.injectFirebaseRemoteConfig(betSelectionController, this.firebaseRemoteConfigProvider.get());
        BetSelectionController_MembersInjector.injectSingleShopInteractor(betSelectionController, this.singleShopInteractorProvider.get());
        BetSelectionController_MembersInjector.injectAnalyticsService(betSelectionController, this.analyticsServiceProvider.get());
        BetSelectionController_MembersInjector.injectUserService(betSelectionController, this.userServiceProvider.get());
        BetSelectionController_MembersInjector.injectVideoRewardService(betSelectionController, this.videoRewardServiceProvider.get());
        BetSelectionController_MembersInjector.injectMatchFilterState(betSelectionController, this.matchFilterStateProvider.get());
        return betSelectionController;
    }

    public static BetSelectionController_Factory create(Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchShortInfoInteractor> matchDetailsInteractorProvider, Provider<ChallengeAcceptInteractor> challengeAcceptInteractorProvider, Provider<NewChallengeDetailsInteractor> newChallengeDetailsInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<UserService> userServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<MatchFilterState> matchFilterStateProvider) {
        return new BetSelectionController_Factory(matchBetGroupsInteractorProvider, matchDetailsInteractorProvider, challengeAcceptInteractorProvider, newChallengeDetailsInteractorProvider, billingServiceProvider, firebaseRemoteConfigProvider, singleShopInteractorProvider, analyticsServiceProvider, userServiceProvider, videoRewardServiceProvider, matchFilterStateProvider);
    }

    public static BetSelectionController newBetSelectionController() {
        return new BetSelectionController();
    }
}
