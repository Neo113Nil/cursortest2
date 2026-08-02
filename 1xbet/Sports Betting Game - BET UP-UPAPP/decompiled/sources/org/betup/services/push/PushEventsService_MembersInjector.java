package org.betup.services.push;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.interstitial.InterstitialAdCoordinator;
import org.betup.model.local.AppDatabase;
import org.betup.model.local.interactor.AddEventInteractor;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.model.local.interactor.ReadEventInteractor;
import org.betup.model.remote.api.rest.analytics.GetOffersInfoInteractor;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.experiments.ABTestService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;

/* loaded from: classes2.dex */
public final class PushEventsService_MembersInjector implements MembersInjector<PushEventsService> {
    private final Provider<ABTestService> abTestServiceProvider;
    private final Provider<AddEventInteractor> addEventInteractorProvider;
    private final Provider<AnalyticsService> analyticsServiceProvider;
    private final Provider<AppDatabase> appDatabaseProvider;
    private final Provider<GetOffersInfoInteractor> getOffersInfoInteractorProvider;
    private final Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider;
    private final Provider<HomeDailyQuestController> homeDailyQuestControllerProvider;
    private final Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider;
    private final Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider;
    private final Provider<ReadEventInteractor> readEventInteractorProvider;
    private final Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider;
    private final Provider<UserService> userServiceProvider;

    public PushEventsService_MembersInjector(Provider<AppDatabase> appDatabaseProvider, Provider<UserService> userServiceProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<AddEventInteractor> addEventInteractorProvider, Provider<ReadEventInteractor> readEventInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<GetOffersInfoInteractor> getOffersInfoInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<ABTestService> abTestServiceProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider, Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider) {
        this.appDatabaseProvider = appDatabaseProvider;
        this.userServiceProvider = userServiceProvider;
        this.getV7MyInfoInteractorProvider = getV7MyInfoInteractorProvider;
        this.addEventInteractorProvider = addEventInteractorProvider;
        this.readEventInteractorProvider = readEventInteractorProvider;
        this.readAllEventsInteractorProvider = readAllEventsInteractorProvider;
        this.getOffersInfoInteractorProvider = getOffersInfoInteractorProvider;
        this.analyticsServiceProvider = analyticsServiceProvider;
        this.abTestServiceProvider = abTestServiceProvider;
        this.homeDailyQuestControllerProvider = homeDailyQuestControllerProvider;
        this.interstitialAdCoordinatorProvider = interstitialAdCoordinatorProvider;
        this.rewardedVideoOfferCoordinatorProvider = rewardedVideoOfferCoordinatorProvider;
    }

    public static MembersInjector<PushEventsService> create(Provider<AppDatabase> appDatabaseProvider, Provider<UserService> userServiceProvider, Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider, Provider<AddEventInteractor> addEventInteractorProvider, Provider<ReadEventInteractor> readEventInteractorProvider, Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider, Provider<GetOffersInfoInteractor> getOffersInfoInteractorProvider, Provider<AnalyticsService> analyticsServiceProvider, Provider<ABTestService> abTestServiceProvider, Provider<HomeDailyQuestController> homeDailyQuestControllerProvider, Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider, Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider) {
        return new PushEventsService_MembersInjector(appDatabaseProvider, userServiceProvider, getV7MyInfoInteractorProvider, addEventInteractorProvider, readEventInteractorProvider, readAllEventsInteractorProvider, getOffersInfoInteractorProvider, analyticsServiceProvider, abTestServiceProvider, homeDailyQuestControllerProvider, interstitialAdCoordinatorProvider, rewardedVideoOfferCoordinatorProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PushEventsService instance) {
        injectAppDatabase(instance, this.appDatabaseProvider.get());
        injectUserService(instance, this.userServiceProvider.get());
        injectGetV7MyInfoInteractor(instance, this.getV7MyInfoInteractorProvider.get());
        injectAddEventInteractor(instance, this.addEventInteractorProvider.get());
        injectReadEventInteractor(instance, this.readEventInteractorProvider.get());
        injectReadAllEventsInteractor(instance, this.readAllEventsInteractorProvider.get());
        injectGetOffersInfoInteractor(instance, this.getOffersInfoInteractorProvider.get());
        injectAnalyticsService(instance, this.analyticsServiceProvider.get());
        injectAbTestService(instance, this.abTestServiceProvider.get());
        injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        injectInterstitialAdCoordinator(instance, this.interstitialAdCoordinatorProvider.get());
        injectRewardedVideoOfferCoordinator(instance, this.rewardedVideoOfferCoordinatorProvider.get());
    }

    public static void injectAppDatabase(PushEventsService instance, AppDatabase appDatabase) {
        instance.appDatabase = appDatabase;
    }

    public static void injectUserService(PushEventsService instance, UserService userService) {
        instance.userService = userService;
    }

    public static void injectGetV7MyInfoInteractor(PushEventsService instance, GetV7MyInfoInteractor getV7MyInfoInteractor) {
        instance.getV7MyInfoInteractor = getV7MyInfoInteractor;
    }

    public static void injectAddEventInteractor(PushEventsService instance, AddEventInteractor addEventInteractor) {
        instance.addEventInteractor = addEventInteractor;
    }

    public static void injectReadEventInteractor(PushEventsService instance, ReadEventInteractor readEventInteractor) {
        instance.readEventInteractor = readEventInteractor;
    }

    public static void injectReadAllEventsInteractor(PushEventsService instance, ReadAllEventsInteractor readAllEventsInteractor) {
        instance.readAllEventsInteractor = readAllEventsInteractor;
    }

    public static void injectGetOffersInfoInteractor(PushEventsService instance, GetOffersInfoInteractor getOffersInfoInteractor) {
        instance.getOffersInfoInteractor = getOffersInfoInteractor;
    }

    public static void injectAnalyticsService(PushEventsService instance, AnalyticsService analyticsService) {
        instance.analyticsService = analyticsService;
    }

    public static void injectAbTestService(PushEventsService instance, ABTestService abTestService) {
        instance.abTestService = abTestService;
    }

    public static void injectHomeDailyQuestController(PushEventsService instance, HomeDailyQuestController homeDailyQuestController) {
        instance.homeDailyQuestController = homeDailyQuestController;
    }

    public static void injectInterstitialAdCoordinator(PushEventsService instance, InterstitialAdCoordinator interstitialAdCoordinator) {
        instance.interstitialAdCoordinator = interstitialAdCoordinator;
    }

    public static void injectRewardedVideoOfferCoordinator(PushEventsService instance, RewardedVideoOfferCoordinator rewardedVideoOfferCoordinator) {
        instance.rewardedVideoOfferCoordinator = rewardedVideoOfferCoordinator;
    }
}
