package org.betup.injection.module;

import android.content.Context;
import androidx.room.Room;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.Module;
import dagger.Provides;
import java.util.Random;
import javax.inject.Singleton;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.AppDatabase;
import org.betup.model.local.interactor.AddEventInteractor;
import org.betup.model.local.interactor.GetNewEventsCountInteractor;
import org.betup.model.local.interactor.GetNewEventsCountInteractorByUUID;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.model.local.interactor.ReadEventInteractor;
import org.betup.model.local.migration.Migration_1_2;
import org.betup.model.local.migration.Migration_2_3;
import org.betup.model.local.migration.Migration_3_4;
import org.betup.model.remote.api.rest.analytics.PostTrackEventInteractor;
import org.betup.model.remote.api.rest.analytics.PostTrackPurchaseInteractor;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;
import org.betup.model.remote.api.rest.messaging.GetUserMessagesInteractor;
import org.betup.services.LocaleService;
import org.betup.services.ads.interstitial.GoogleInterstitialAdController;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.ads.rewarded.GoogleRewardedAdController;
import org.betup.services.ads.rewarded.RewardedAdController;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.DefaultAnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.betlist.BetValidatorImpl;
import org.betup.services.betlist.DefaultBetListAppender;
import org.betup.services.casino.CasinoService;
import org.betup.services.challenge.ChallengeTourInfoProvider;
import org.betup.services.chats.ChatService;
import org.betup.services.chats.DefaultChatService;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.language.DefaultAppLanguageObserver;
import org.betup.services.navigate.DefaultNavigationService;
import org.betup.services.navigate.GamesNavigationService;
import org.betup.services.navigate.NavigationService;
import org.betup.services.push.DefaultPushStorageProvider;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.quiz.QuizTourInfoProvider;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.achievements.controller.AchievementsController;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.BetsPlacedController;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.home.controller.DialogManagerTrackedOverlayDismissRegistry;
import org.betup.ui.fragment.home.controller.DialogTrackedHomeVideoBonusRefreshGate;
import org.betup.ui.fragment.home.controller.HomeVideoBonusRefreshGate;
import org.betup.ui.fragment.home.controller.TrackedOverlayDismissRegistry;
import org.betup.ui.fragment.matches.LeaguesController;
import org.betup.ui.fragment.matches.MatchesController;
import org.betup.ui.fragment.matches.TeamsController;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.TeamDetailsController;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.search.controller.SearchController;
import org.betup.ui.fragment.settings.controller.SettingsController;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;
import org.betup.ui.fragment.user.FollowersDialogController;
import org.betup.ui.fragment.user.UserDetailsController;

@Module
/* loaded from: classes2.dex */
public class AppModule {
    private final Context context;

    @Provides
    @Singleton
    public AppLanguageObserver provideAppLanguageObserver(DefaultAppLanguageObserver impl) {
        return impl;
    }

    @Provides
    @Singleton
    public InterstitialAdController provideInterstitialAdController(GoogleInterstitialAdController controller) {
        return controller;
    }

    @Provides
    @Singleton
    public RewardedAdController provideRewardedAdController(GoogleRewardedAdController controller) {
        return controller;
    }

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.context;
    }

    @Provides
    @Singleton
    public BetsController provideNewBetSlipController() {
        return new BetsController();
    }

    @Provides
    public UserDetailsController provideUserDetailsController() {
        return new UserDetailsController();
    }

    @Provides
    public FollowersDialogController provideFollowersDialogController() {
        return new FollowersDialogController();
    }

    @Provides
    @Singleton
    public MatchesController provideMatchesController() {
        return new MatchesController();
    }

    @Provides
    @Singleton
    public MatchFilterState provideMatchFilterState() {
        return new MatchFilterState();
    }

    @Provides
    @Singleton
    public DateFilterState provideDateFilterState() {
        return new DateFilterState();
    }

    @Provides
    @Singleton
    public LeaguesController provideLeaguesController() {
        return new LeaguesController();
    }

    @Provides
    @Singleton
    public BetsPlacedController provideBetsPlacedController() {
        return new BetsPlacedController();
    }

    @Provides
    public TeamsController provideTeamsController() {
        return new TeamsController();
    }

    @Provides
    public MatchDetailsController provideMatchController() {
        return new MatchDetailsController();
    }

    @Provides
    public TeamDetailsController provideTeamDetailsController() {
        return new TeamDetailsController();
    }

    @Provides
    @Singleton
    public DailyBonusController provideDailyBonusController() {
        return new DailyBonusController();
    }

    @Provides
    @Singleton
    public HomeVideoBonusRefreshGate provideHomeVideoBonusRefreshGate() {
        return new DialogTrackedHomeVideoBonusRefreshGate();
    }

    @Provides
    @Singleton
    public TrackedOverlayDismissRegistry provideTrackedOverlayDismissRegistry() {
        return new DialogManagerTrackedOverlayDismissRegistry();
    }

    @Provides
    public CompetitionsController provideCompetitionsController() {
        return new CompetitionsController();
    }

    @Provides
    @Singleton
    public SearchController provideSearchController() {
        return new SearchController();
    }

    @Provides
    public AchievementsController provideAchievementsController() {
        return new AchievementsController();
    }

    @Provides
    @Singleton
    public SettingsController provideSettingsController() {
        return new SettingsController();
    }

    @Provides
    @Singleton
    public AllSubscriptionsController provideAllSubscriptionsController() {
        return new AllSubscriptionsController();
    }

    @Provides
    @Singleton
    public FirebaseRemoteConfig provideFirebaseRemoteConfig() {
        return FirebaseRemoteConfig.getInstance();
    }

    @Provides
    @Singleton
    public FirebaseAuth provideFirebaseAuth() {
        if (FirebaseApp.getApps(this.context).isEmpty()) {
            FirebaseApp.initializeApp(this.context);
        }
        return FirebaseAuth.getInstance();
    }

    @Provides
    @Singleton
    public LocaleService provideLocaleService() {
        return new LocaleService();
    }

    @Provides
    @Singleton
    public AppDatabase provideDatabase(Context context, UserService userService) {
        return (AppDatabase) Room.databaseBuilder(context, AppDatabase.class, "database-name").addMigrations(new Migration_1_2(userService), new Migration_2_3(), new Migration_3_4()).build();
    }

    @Provides
    @Singleton
    public BetValidator provideBetValidator(Context context, V7GrabbedBetsInteractor grabbedBetsInteractor) {
        return new BetValidatorImpl(context, grabbedBetsInteractor);
    }

    @Provides
    @Singleton
    public BetListAppender provideBetListAppender(Context context, UserService userService, BetValidator betValidator, LocalPreferencesService localPreferencesService) {
        return new DefaultBetListAppender(context, userService, betValidator, localPreferencesService);
    }

    @Provides
    @Singleton
    public NavigationService<NavigateMessage.Target> provideNavigationController(UserService userService, CasinoService casinoService) {
        return new DefaultNavigationService(userService, casinoService);
    }

    @Provides
    @Singleton
    public ChatService provideMessagingController(GetUserMessagesInteractor getUserMessagesInteractor) {
        return new DefaultChatService(getUserMessagesInteractor);
    }

    @Provides
    @Singleton
    public PushStorageProvider providePushStorageProvider(Context context, AddEventInteractor addEventInteractor, GetNewEventsCountInteractor getNewEventsCountInteractor, ReadEventInteractor readEventInteractor, ReadAllEventsInteractor readAllEventsInteractor, GetNewEventsCountInteractorByUUID getNewEventsCountInteractorByUUID) {
        return new DefaultPushStorageProvider(context, addEventInteractor, getNewEventsCountInteractor, readEventInteractor, readAllEventsInteractor, getNewEventsCountInteractorByUUID);
    }

    @Provides
    @Singleton
    public ChallengeTourInfoProvider provideChallengeTourInfoProvider() {
        return new ChallengeTourInfoProvider();
    }

    @Provides
    @Singleton
    public QuizTourInfoProvider provideQuizTourInfoProvider() {
        return new QuizTourInfoProvider();
    }

    @Provides
    @Singleton
    public NavigationService<NavigateMessage.TargetGame> provideGamesNavigationController(UserService userService) {
        return new GamesNavigationService(userService);
    }

    @Provides
    @Singleton
    public AnalyticsService provideAnalyticsService(PostTrackEventInteractor postTrackEventInteractor, PostTrackPurchaseInteractor postTrackPurchaseInteractor) {
        return new DefaultAnalyticsService(postTrackEventInteractor, postTrackPurchaseInteractor);
    }

    @Provides
    public Random provideRandomGenerator() {
        return new Random();
    }
}
