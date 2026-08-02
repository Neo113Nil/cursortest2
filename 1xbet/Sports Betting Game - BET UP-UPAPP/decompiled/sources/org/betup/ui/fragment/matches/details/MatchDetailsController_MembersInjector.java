package org.betup.ui.fragment.matches.details;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.analytics.GetPromoBannerForMatchInteractor;
import org.betup.model.remote.api.rest.challenges.NewChallengesInteractor;
import org.betup.model.remote.api.rest.matches.GetTeamDetailsInteractor;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.V7MatchHistoryInteractor;
import org.betup.model.remote.api.rest.matches.V7MatchStatisticsInteractor;
import org.betup.model.remote.api.rest.matches.V7StatsByVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchQuizParticipationInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.api.rest.matches.details.QuizAvailabilityInteractor;
import org.betup.model.remote.api.rest.matches.details.QuizDetailsInteractor;
import org.betup.model.remote.api.rest.messaging.GetPublicChatMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.SendPublicChatMessageInteractor;
import org.betup.model.remote.api.rest.quiz.QuizParticipationInteractor;
import org.betup.model.remote.api.rest.quiz.QuizTiersInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyBetRestrictionsInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyVersionGatesInteractor;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.scores.SubscoreService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class MatchDetailsController_MembersInjector implements MembersInjector<MatchDetailsController> {
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<BetListAppender> betListAppenderProvider;
    private final Provider<BetValidator> betValidatorProvider;
    private final Provider<BillingService> billingServiceProvider;
    private final Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider;
    private final Provider<GetPromoBannerForMatchInteractor> getPromoBannerForMatchInteractorProvider;
    private final Provider<GetPublicChatMessagesInteractor> getPublicChatMessagesInteractorProvider;
    private final Provider<GetTeamDetailsInteractor> getTeamDetailsInteractorProvider;
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider;
    private final Provider<MatchInfoInteractor> matchDetailsInteractorProvider;
    private final Provider<MatchMyBetsInteractor> matchMyBetsInteractorProvider;
    private final Provider<MatchQuizParticipationInteractor> matchQuizParticipationInteractorProvider;
    private final Provider<MatchShortInfoInteractor> matchesDetailsRequestInteractorProvider;
    private final Provider<NewChallengesInteractor> newChallengesInteractorProvider;
    private final Provider<QuizAvailabilityInteractor> quizAvailabilityInteractorProvider;
    private final Provider<QuizDetailsInteractor> quizDetailsInteractorProvider;
    private final Provider<QuizParticipationInteractor> quizParticipationInteractorProvider;
    private final Provider<QuizTiersInteractor> quizTiersInteractorProvider;
    private final Provider<SendPublicChatMessageInteractor> sendPublicChatMessageInteractorProvider;
    private final Provider<NewSingleShopInteractor> singleShopInteractorProvider;
    private final Provider<SubscoreService> subscoreServiceProvider;
    private final Provider<DefaultSubscriptionService> subscriptionServiceProvider;
    private final Provider<UserService> userServiceAndUserServicePProvider;
    private final Provider<V7MatchHistoryInteractor> v7MatchHistoryInteractorProvider;
    private final Provider<V7MatchStatisticsInteractor> v7MatchStatisticsInteractorProvider;
    private final Provider<V7StatsByVarietiesInteractor> v7StatsByVarietiesInteractorProvider;
    private final Provider<V7VarietyBetRestrictionsInteractor> v7VarietyBetRestrictionsInteractorProvider;
    private final Provider<V7VarietyVersionGatesInteractor> v7VarietyVersionGatesInteractorProvider;
    private final Provider<VideoRewardService> videoRewardServiceProvider;

    public MatchDetailsController_MembersInjector(Provider<GetPromoBannerForMatchInteractor> getPromoBannerForMatchInteractorProvider, Provider<MatchShortInfoInteractor> matchesDetailsRequestInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<SubscoreService> subscoreServiceProvider, Provider<UserService> userServiceAndUserServicePProvider, Provider<DefaultSubscriptionService> subscriptionServiceProvider, Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchMyBetsInteractor> matchMyBetsInteractorProvider, Provider<GetTeamDetailsInteractor> getTeamDetailsInteractorProvider, Provider<MatchInfoInteractor> matchDetailsInteractorProvider, Provider<V7MatchStatisticsInteractor> v7MatchStatisticsInteractorProvider, Provider<V7StatsByVarietiesInteractor> v7StatsByVarietiesInteractorProvider, Provider<V7MatchHistoryInteractor> v7MatchHistoryInteractorProvider, Provider<NewChallengesInteractor> newChallengesInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<QuizAvailabilityInteractor> quizAvailabilityInteractorProvider, Provider<QuizDetailsInteractor> quizDetailsInteractorProvider, Provider<QuizTiersInteractor> quizTiersInteractorProvider, Provider<QuizParticipationInteractor> quizParticipationInteractorProvider, Provider<GetPublicChatMessagesInteractor> getPublicChatMessagesInteractorProvider, Provider<SendPublicChatMessageInteractor> sendPublicChatMessageInteractorProvider, Provider<MatchQuizParticipationInteractor> matchQuizParticipationInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<V7VarietyBetRestrictionsInteractor> v7VarietyBetRestrictionsInteractorProvider, Provider<V7VarietyVersionGatesInteractor> v7VarietyVersionGatesInteractorProvider) {
        this.getPromoBannerForMatchInteractorProvider = getPromoBannerForMatchInteractorProvider;
        this.matchesDetailsRequestInteractorProvider = matchesDetailsRequestInteractorProvider;
        this.betListAppenderProvider = betListAppenderProvider;
        this.betValidatorProvider = betValidatorProvider;
        this.subscoreServiceProvider = subscoreServiceProvider;
        this.userServiceAndUserServicePProvider = userServiceAndUserServicePProvider;
        this.subscriptionServiceProvider = subscriptionServiceProvider;
        this.matchBetGroupsInteractorProvider = matchBetGroupsInteractorProvider;
        this.matchMyBetsInteractorProvider = matchMyBetsInteractorProvider;
        this.getTeamDetailsInteractorProvider = getTeamDetailsInteractorProvider;
        this.matchDetailsInteractorProvider = matchDetailsInteractorProvider;
        this.v7MatchStatisticsInteractorProvider = v7MatchStatisticsInteractorProvider;
        this.v7StatsByVarietiesInteractorProvider = v7StatsByVarietiesInteractorProvider;
        this.v7MatchHistoryInteractorProvider = v7MatchHistoryInteractorProvider;
        this.newChallengesInteractorProvider = newChallengesInteractorProvider;
        this.billingServiceProvider = billingServiceProvider;
        this.firebaseRemoteConfigProvider = firebaseRemoteConfigProvider;
        this.singleShopInteractorProvider = singleShopInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.videoRewardServiceProvider = videoRewardServiceProvider;
        this.quizAvailabilityInteractorProvider = quizAvailabilityInteractorProvider;
        this.quizDetailsInteractorProvider = quizDetailsInteractorProvider;
        this.quizTiersInteractorProvider = quizTiersInteractorProvider;
        this.quizParticipationInteractorProvider = quizParticipationInteractorProvider;
        this.getPublicChatMessagesInteractorProvider = getPublicChatMessagesInteractorProvider;
        this.sendPublicChatMessageInteractorProvider = sendPublicChatMessageInteractorProvider;
        this.matchQuizParticipationInteractorProvider = matchQuizParticipationInteractorProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.v7VarietyBetRestrictionsInteractorProvider = v7VarietyBetRestrictionsInteractorProvider;
        this.v7VarietyVersionGatesInteractorProvider = v7VarietyVersionGatesInteractorProvider;
    }

    public static MembersInjector<MatchDetailsController> create(Provider<GetPromoBannerForMatchInteractor> getPromoBannerForMatchInteractorProvider, Provider<MatchShortInfoInteractor> matchesDetailsRequestInteractorProvider, Provider<BetListAppender> betListAppenderProvider, Provider<BetValidator> betValidatorProvider, Provider<SubscoreService> subscoreServiceProvider, Provider<UserService> userServiceAndUserServicePProvider, Provider<DefaultSubscriptionService> subscriptionServiceProvider, Provider<MatchVarietiesInteractor> matchBetGroupsInteractorProvider, Provider<MatchMyBetsInteractor> matchMyBetsInteractorProvider, Provider<GetTeamDetailsInteractor> getTeamDetailsInteractorProvider, Provider<MatchInfoInteractor> matchDetailsInteractorProvider, Provider<V7MatchStatisticsInteractor> v7MatchStatisticsInteractorProvider, Provider<V7StatsByVarietiesInteractor> v7StatsByVarietiesInteractorProvider, Provider<V7MatchHistoryInteractor> v7MatchHistoryInteractorProvider, Provider<NewChallengesInteractor> newChallengesInteractorProvider, Provider<BillingService> billingServiceProvider, Provider<FirebaseRemoteConfig> firebaseRemoteConfigProvider, Provider<NewSingleShopInteractor> singleShopInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<VideoRewardService> videoRewardServiceProvider, Provider<QuizAvailabilityInteractor> quizAvailabilityInteractorProvider, Provider<QuizDetailsInteractor> quizDetailsInteractorProvider, Provider<QuizTiersInteractor> quizTiersInteractorProvider, Provider<QuizParticipationInteractor> quizParticipationInteractorProvider, Provider<GetPublicChatMessagesInteractor> getPublicChatMessagesInteractorProvider, Provider<SendPublicChatMessageInteractor> sendPublicChatMessageInteractorProvider, Provider<MatchQuizParticipationInteractor> matchQuizParticipationInteractorProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<V7VarietyBetRestrictionsInteractor> v7VarietyBetRestrictionsInteractorProvider, Provider<V7VarietyVersionGatesInteractor> v7VarietyVersionGatesInteractorProvider) {
        return new MatchDetailsController_MembersInjector(getPromoBannerForMatchInteractorProvider, matchesDetailsRequestInteractorProvider, betListAppenderProvider, betValidatorProvider, subscoreServiceProvider, userServiceAndUserServicePProvider, subscriptionServiceProvider, matchBetGroupsInteractorProvider, matchMyBetsInteractorProvider, getTeamDetailsInteractorProvider, matchDetailsInteractorProvider, v7MatchStatisticsInteractorProvider, v7StatsByVarietiesInteractorProvider, v7MatchHistoryInteractorProvider, newChallengesInteractorProvider, billingServiceProvider, firebaseRemoteConfigProvider, singleShopInteractorProvider, analyticsServiceProvider, videoRewardServiceProvider, quizAvailabilityInteractorProvider, quizDetailsInteractorProvider, quizTiersInteractorProvider, quizParticipationInteractorProvider, getPublicChatMessagesInteractorProvider, sendPublicChatMessageInteractorProvider, matchQuizParticipationInteractorProvider, localPreferencesServiceProvider, v7VarietyBetRestrictionsInteractorProvider, v7VarietyVersionGatesInteractorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchDetailsController instance) {
        injectGetPromoBannerForMatchInteractor(instance, this.getPromoBannerForMatchInteractorProvider.get());
        injectMatchesDetailsRequestInteractor(instance, this.matchesDetailsRequestInteractorProvider.get());
        injectBetListAppender(instance, this.betListAppenderProvider.get());
        injectBetValidator(instance, this.betValidatorProvider.get());
        injectSubscoreService(instance, this.subscoreServiceProvider.get());
        injectUserServiceP(instance, this.userServiceAndUserServicePProvider.get());
        injectSubscriptionService(instance, this.subscriptionServiceProvider.get());
        injectMatchBetGroupsInteractor(instance, this.matchBetGroupsInteractorProvider.get());
        injectMatchMyBetsInteractor(instance, this.matchMyBetsInteractorProvider.get());
        injectGetTeamDetailsInteractor(instance, this.getTeamDetailsInteractorProvider.get());
        injectMatchDetailsInteractor(instance, this.matchDetailsInteractorProvider.get());
        injectV7MatchStatisticsInteractor(instance, this.v7MatchStatisticsInteractorProvider.get());
        injectV7StatsByVarietiesInteractor(instance, this.v7StatsByVarietiesInteractorProvider.get());
        injectV7MatchHistoryInteractor(instance, this.v7MatchHistoryInteractorProvider.get());
        injectNewChallengesInteractor(instance, this.newChallengesInteractorProvider.get());
        injectBillingService(instance, this.billingServiceProvider.get());
        injectFirebaseRemoteConfig(instance, this.firebaseRemoteConfigProvider.get());
        injectSingleShopInteractor(instance, this.singleShopInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectUserService(instance, this.userServiceAndUserServicePProvider.get());
        injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        injectQuizAvailabilityInteractor(instance, this.quizAvailabilityInteractorProvider.get());
        injectQuizDetailsInteractor(instance, this.quizDetailsInteractorProvider.get());
        injectQuizTiersInteractor(instance, this.quizTiersInteractorProvider.get());
        injectQuizParticipationInteractor(instance, this.quizParticipationInteractorProvider.get());
        injectGetPublicChatMessagesInteractor(instance, this.getPublicChatMessagesInteractorProvider.get());
        injectSendPublicChatMessageInteractor(instance, this.sendPublicChatMessageInteractorProvider.get());
        injectMatchQuizParticipationInteractor(instance, this.matchQuizParticipationInteractorProvider.get());
        injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        injectV7VarietyBetRestrictionsInteractor(instance, this.v7VarietyBetRestrictionsInteractorProvider.get());
        injectV7VarietyVersionGatesInteractor(instance, this.v7VarietyVersionGatesInteractorProvider.get());
    }

    public static void injectGetPromoBannerForMatchInteractor(MatchDetailsController instance, GetPromoBannerForMatchInteractor getPromoBannerForMatchInteractor) {
        instance.getPromoBannerForMatchInteractor = getPromoBannerForMatchInteractor;
    }

    public static void injectMatchesDetailsRequestInteractor(MatchDetailsController instance, MatchShortInfoInteractor matchesDetailsRequestInteractor) {
        instance.matchesDetailsRequestInteractor = matchesDetailsRequestInteractor;
    }

    public static void injectBetListAppender(MatchDetailsController instance, BetListAppender betListAppender) {
        instance.betListAppender = betListAppender;
    }

    public static void injectBetValidator(MatchDetailsController instance, BetValidator betValidator) {
        instance.betValidator = betValidator;
    }

    public static void injectSubscoreService(MatchDetailsController instance, SubscoreService subscoreService) {
        instance.subscoreService = subscoreService;
    }

    public static void injectUserServiceP(MatchDetailsController instance, UserService userServiceP) {
        instance.userServiceP = userServiceP;
    }

    public static void injectSubscriptionService(MatchDetailsController instance, DefaultSubscriptionService subscriptionService) {
        instance.subscriptionService = subscriptionService;
    }

    public static void injectMatchBetGroupsInteractor(MatchDetailsController instance, MatchVarietiesInteractor matchBetGroupsInteractor) {
        instance.matchBetGroupsInteractor = matchBetGroupsInteractor;
    }

    public static void injectMatchMyBetsInteractor(MatchDetailsController instance, MatchMyBetsInteractor matchMyBetsInteractor) {
        instance.matchMyBetsInteractor = matchMyBetsInteractor;
    }

    public static void injectGetTeamDetailsInteractor(MatchDetailsController instance, GetTeamDetailsInteractor getTeamDetailsInteractor) {
        instance.getTeamDetailsInteractor = getTeamDetailsInteractor;
    }

    public static void injectMatchDetailsInteractor(MatchDetailsController instance, MatchInfoInteractor matchDetailsInteractor) {
        instance.matchDetailsInteractor = matchDetailsInteractor;
    }

    public static void injectV7MatchStatisticsInteractor(MatchDetailsController instance, V7MatchStatisticsInteractor v7MatchStatisticsInteractor) {
        instance.v7MatchStatisticsInteractor = v7MatchStatisticsInteractor;
    }

    public static void injectV7StatsByVarietiesInteractor(MatchDetailsController instance, V7StatsByVarietiesInteractor v7StatsByVarietiesInteractor) {
        instance.v7StatsByVarietiesInteractor = v7StatsByVarietiesInteractor;
    }

    public static void injectV7MatchHistoryInteractor(MatchDetailsController instance, V7MatchHistoryInteractor v7MatchHistoryInteractor) {
        instance.v7MatchHistoryInteractor = v7MatchHistoryInteractor;
    }

    public static void injectNewChallengesInteractor(MatchDetailsController instance, NewChallengesInteractor newChallengesInteractor) {
        instance.newChallengesInteractor = newChallengesInteractor;
    }

    public static void injectBillingService(MatchDetailsController instance, BillingService billingService) {
        instance.billingService = billingService;
    }

    public static void injectFirebaseRemoteConfig(MatchDetailsController instance, FirebaseRemoteConfig firebaseRemoteConfig) {
        instance.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public static void injectSingleShopInteractor(MatchDetailsController instance, NewSingleShopInteractor singleShopInteractor) {
        instance.singleShopInteractor = singleShopInteractor;
    }

    public static void injectAnalyticsService(MatchDetailsController instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectUserService(MatchDetailsController instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectVideoRewardService(MatchDetailsController instance, VideoRewardService videoRewardService) {
        instance.videoRewardService = videoRewardService;
    }

    public static void injectQuizAvailabilityInteractor(MatchDetailsController instance, QuizAvailabilityInteractor quizAvailabilityInteractor) {
        instance.quizAvailabilityInteractor = quizAvailabilityInteractor;
    }

    public static void injectQuizDetailsInteractor(MatchDetailsController instance, QuizDetailsInteractor quizDetailsInteractor) {
        instance.quizDetailsInteractor = quizDetailsInteractor;
    }

    public static void injectQuizTiersInteractor(MatchDetailsController instance, QuizTiersInteractor quizTiersInteractor) {
        instance.quizTiersInteractor = quizTiersInteractor;
    }

    public static void injectQuizParticipationInteractor(MatchDetailsController instance, QuizParticipationInteractor quizParticipationInteractor) {
        instance.quizParticipationInteractor = quizParticipationInteractor;
    }

    public static void injectGetPublicChatMessagesInteractor(MatchDetailsController instance, GetPublicChatMessagesInteractor getPublicChatMessagesInteractor) {
        instance.getPublicChatMessagesInteractor = getPublicChatMessagesInteractor;
    }

    public static void injectSendPublicChatMessageInteractor(MatchDetailsController instance, SendPublicChatMessageInteractor sendPublicChatMessageInteractor) {
        instance.sendPublicChatMessageInteractor = sendPublicChatMessageInteractor;
    }

    public static void injectMatchQuizParticipationInteractor(MatchDetailsController instance, MatchQuizParticipationInteractor matchQuizParticipationInteractor) {
        instance.matchQuizParticipationInteractor = matchQuizParticipationInteractor;
    }

    public static void injectLocalPreferencesService(MatchDetailsController instance, LocalPreferencesService localPreferencesService) {
        instance.localPreferencesService = localPreferencesService;
    }

    public static void injectV7VarietyBetRestrictionsInteractor(MatchDetailsController instance, V7VarietyBetRestrictionsInteractor v7VarietyBetRestrictionsInteractor) {
        instance.v7VarietyBetRestrictionsInteractor = v7VarietyBetRestrictionsInteractor;
    }

    public static void injectV7VarietyVersionGatesInteractor(MatchDetailsController instance, V7VarietyVersionGatesInteractor v7VarietyVersionGatesInteractor) {
        instance.v7VarietyVersionGatesInteractor = v7VarietyVersionGatesInteractor;
    }
}
