package org.betup.injection.component;

import com.google.firebase.messaging.FirebaseMessagingService;
import dagger.Component;
import javax.inject.Singleton;
import org.betup.BetUpApp;
import org.betup.games.GamesListFragment;
import org.betup.games.MiniGameActivity;
import org.betup.games.dice.ui.DiceFragment;
import org.betup.games.doubles.ui.DoubleGameFragment;
import org.betup.games.doubles.ui.ResultDoubleGameDialog;
import org.betup.games.higherLower.ui.HigherLowerGameFragment;
import org.betup.games.luckyCells.ui.LuckyCellsGameFragment;
import org.betup.games.warGame.ui.WarGameFragment;
import org.betup.injection.module.AppModule;
import org.betup.injection.module.RestModule;
import org.betup.injection.module.ServiceModule;
import org.betup.model.remote.api.rest.competitions.PlaceBetInteractor;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.push.PushEventsService;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.betup.services.user.UserServiceAccessor;
import org.betup.ui.FullscreenXZoneActivity;
import org.betup.ui.LoginActivity;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.BetListResultDialogFragment;
import org.betup.ui.dialogs.BetPlacedDialog;
import org.betup.ui.dialogs.BonusOfferWebViewFragment;
import org.betup.ui.dialogs.ChallengeAcceptDialogFragment;
import org.betup.ui.dialogs.ChallengePreviewNewDialogFragment;
import org.betup.ui.dialogs.ChangeCountryDialogFragment;
import org.betup.ui.dialogs.ChangeDisplayNameInteractorAccessor;
import org.betup.ui.dialogs.ChangeLanguageDialog;
import org.betup.ui.dialogs.ChangeLanguageFragment;
import org.betup.ui.dialogs.CompetitionsPreviewFragment;
import org.betup.ui.dialogs.CreateBattleDialogFragment;
import org.betup.ui.dialogs.DialogConsent;
import org.betup.ui.dialogs.FollowersDialog;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialog;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment;
import org.betup.ui.dialogs.NotificationDialogFragment;
import org.betup.ui.dialogs.OddsDialogFragment;
import org.betup.ui.dialogs.OffersDialogFragment;
import org.betup.ui.dialogs.OneClickBetSettingsDialogFragment;
import org.betup.ui.dialogs.ReferralCodeInteractorAccessor;
import org.betup.ui.dialogs.RewardReceivedDialog;
import org.betup.ui.dialogs.RewardedVideoOfferDialogFragment;
import org.betup.ui.dialogs.SelectBetDialogFragment;
import org.betup.ui.dialogs.SelectLeagueDialogFragment;
import org.betup.ui.dialogs.SelectMatchDialogFragment;
import org.betup.ui.dialogs.ShopDialogFragment;
import org.betup.ui.dialogs.SubscriptionDialog;
import org.betup.ui.dialogs.TicketsInfoDialog;
import org.betup.ui.dialogs.TourCompletedDialogFragment;
import org.betup.ui.dialogs.UnlockBetAmountDialog;
import org.betup.ui.dialogs.UnlockBetGroupsDialog;
import org.betup.ui.dialogs.UnlockBetGroupsDialogFragment;
import org.betup.ui.dialogs.WelcomeDialog;
import org.betup.ui.dialogs.fav.EditFavouritesDialog;
import org.betup.ui.dialogs.offer.ButtonContent;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.betup.ui.dialogs.offer.PriceContent;
import org.betup.ui.dialogs.offer.SpecialOfferDialogFragment;
import org.betup.ui.dialogs.offer.SpecialOfferPageFragment;
import org.betup.ui.dialogs.offer.TimerContent;
import org.betup.ui.dialogs.push.PushNotificationDialogFragment;
import org.betup.ui.dialogs.webgame.WebGameDialogFragment;
import org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment;
import org.betup.ui.fragment.achievements.NewAchievementsFragment;
import org.betup.ui.fragment.achievements.controller.AchievementsController;
import org.betup.ui.fragment.balance.BalanceHistoryFragmentK;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.BetsFragment;
import org.betup.ui.fragment.bets.BetsPlacedController;
import org.betup.ui.fragment.bets.betlist.BetsListFragment;
import org.betup.ui.fragment.bets.betlist.details.BetDetailDialog;
import org.betup.ui.fragment.bets.betslip.BetslipFragment;
import org.betup.ui.fragment.bets.quiz.QuizParticipationDialog;
import org.betup.ui.fragment.bets.quiz.QuizResultsController;
import org.betup.ui.fragment.bets.quiz.QuizResultsFragment;
import org.betup.ui.fragment.bets.sheet.BettingSheetDialog;
import org.betup.ui.fragment.competitions.NewCompetitionsFragment;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;
import org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment;
import org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.flashbet.FlashBetAbandonedSessionDialogFragment;
import org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment;
import org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment;
import org.betup.ui.fragment.flashbet.FlashBetFragment;
import org.betup.ui.fragment.flashbet.FlashBetGameFragment;
import org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment;
import org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment;
import org.betup.ui.fragment.home.HomeFragment;
import org.betup.ui.fragment.login.AuthFragment;
import org.betup.ui.fragment.login.LoginFragment;
import org.betup.ui.fragment.login.controller.AuthController;
import org.betup.ui.fragment.matches.LeaguesByDateController;
import org.betup.ui.fragment.matches.LeaguesByDateFragment;
import org.betup.ui.fragment.matches.LeaguesController;
import org.betup.ui.fragment.matches.LeaguesFragment;
import org.betup.ui.fragment.matches.MatchesByDateFragment;
import org.betup.ui.fragment.matches.MatchesController;
import org.betup.ui.fragment.matches.MatchesTabsFragment;
import org.betup.ui.fragment.matches.SpecificChampionshipFragment;
import org.betup.ui.fragment.matches.SportsByDateController;
import org.betup.ui.fragment.matches.SportsByDateFragment;
import org.betup.ui.fragment.matches.TeamsController;
import org.betup.ui.fragment.matches.TopMatchesFragment;
import org.betup.ui.fragment.matches.TopMatchesTabFragment;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.MatchDetailsFragmentK;
import org.betup.ui.fragment.matches.details.TeamDetailsController;
import org.betup.ui.fragment.matches.details.TeamDetailsFragment;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.notifications.NotificationsFragment;
import org.betup.ui.fragment.notifications.controller.NotificationsController;
import org.betup.ui.fragment.search.NewSearchFragment;
import org.betup.ui.fragment.search.SearchBottomSheetFragment;
import org.betup.ui.fragment.search.controller.SearchController;
import org.betup.ui.fragment.settings.NewSettingsFragment;
import org.betup.ui.fragment.settings.controller.SettingsController;
import org.betup.ui.fragment.settings.subscriptions.AllSubscriptionsFragment;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;
import org.betup.ui.fragment.shop.ShopBetcoinsFragmentK;
import org.betup.ui.fragment.shop.promo.PromoFragment;
import org.betup.ui.fragment.support.SupportFragmentK;
import org.betup.ui.fragment.support.controller.SupportController;
import org.betup.ui.fragment.user.FollowersDialogController;
import org.betup.ui.fragment.user.ForeignUserDetailsFragmentK;
import org.betup.ui.fragment.user.UserBattlesFragment;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.UserDetailsFragmentK;
import org.betup.ui.fragment.user.UserRankingsFragment;
import org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment;
import org.betup.ui.splash.SplashActivity;
import org.betup.ui.splash.load.DefaultLoader;
import org.betup.ui.tour.IntroActivity;
import org.betup.ui.tour.IntroChallengeActivity;
import org.betup.ui.tour.IntroQuizActivity;

@Component(modules = {AppModule.class, RestModule.class, ServiceModule.class})
@Singleton
/* loaded from: classes2.dex */
public interface AppComponent {
    AdUnitRegistry adUnitRegistry();

    void inject(FirebaseMessagingService firebaseMessagingService);

    void inject(BetUpApp betUpApp);

    void inject(GamesListFragment gamesListFragment);

    void inject(MiniGameActivity miniGameActivity);

    void inject(DiceFragment diceFragment);

    void inject(DoubleGameFragment doubleGameFragment);

    void inject(ResultDoubleGameDialog resultDoubleGameDialog);

    void inject(HigherLowerGameFragment higherLowerGameFragment);

    void inject(LuckyCellsGameFragment luckyCellsGameFragment);

    void inject(WarGameFragment warGameFragment);

    void inject(PlaceBetInteractor placeBetInteractor);

    void inject(PushEventsService pushEventsService);

    void inject(DefaultSubscriptionService subscriptionController);

    void inject(UserServiceAccessor userServiceAccessor);

    void inject(FullscreenXZoneActivity fullscreenXZoneActivity);

    void inject(LoginActivity loginActivity);

    void inject(MainActivity mainActivity);

    void inject(BetListResultDialogFragment betListResultDialogFragment);

    void inject(BetPlacedDialog betPlacedDialog);

    void inject(BonusOfferWebViewFragment bonusOfferWebViewFragment);

    void inject(ChallengeAcceptDialogFragment challengeAcceptDialogFragment);

    void inject(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment);

    void inject(ChangeCountryDialogFragment changeCountryDialogFragment);

    void inject(ChangeDisplayNameInteractorAccessor changeDisplayNameInteractorAccessor);

    void inject(ChangeLanguageDialog changeLanguageDialog);

    void inject(ChangeLanguageFragment changeLanguageFragment);

    void inject(CompetitionsPreviewFragment fragment);

    void inject(CreateBattleDialogFragment createBattleDialogFragment);

    void inject(DialogConsent dialogConsent);

    void inject(FollowersDialog followersDialog);

    void inject(NotEnoughBetcoinsVideoOfferDialog notEnoughBetcoinsVideoOfferDialog);

    void inject(NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment);

    void inject(NotificationDialogFragment fragment);

    void inject(OddsDialogFragment fragment);

    void inject(OffersDialogFragment offersDialogFragment);

    void inject(OneClickBetSettingsDialogFragment fragment);

    void inject(ReferralCodeInteractorAccessor referralCodeInteractorAccessor);

    void inject(RewardReceivedDialog dialog);

    void inject(RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment);

    void inject(SelectBetDialogFragment selectBetDialogFragment);

    void inject(SelectLeagueDialogFragment selectLeagueDialogFragment);

    void inject(SelectMatchDialogFragment selectMatchDialogFragment);

    void inject(ShopDialogFragment shopDialogFragment);

    void inject(SubscriptionDialog subscriptionDialog);

    void inject(TicketsInfoDialog ticketsInfoDialog);

    void inject(TourCompletedDialogFragment tourCompletedDialogFragment);

    void inject(UnlockBetAmountDialog unlockBetAmountDialog);

    void inject(UnlockBetGroupsDialog unlockBetGroupsDialog);

    void inject(UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment);

    void inject(WelcomeDialog dialog);

    void inject(EditFavouritesDialog editFavouritesDialog);

    void inject(ButtonContent offerItemContent);

    void inject(OfferFragment offerFragment);

    void inject(PriceContent offerItemContent);

    void inject(SpecialOfferDialogFragment specialOfferDialogFragment);

    void inject(SpecialOfferPageFragment specialOfferPageFragment);

    void inject(TimerContent offerItemContent);

    void inject(PushNotificationDialogFragment pushNotificationDialogFragment);

    void inject(WebGameDialogFragment webGameDialogFragment);

    void inject(WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment);

    void inject(NewAchievementsFragment fragment);

    void inject(AchievementsController achievementsController);

    void inject(BalanceHistoryFragmentK fragment);

    void inject(BetsController newBetSlipController);

    void inject(BetsFragment betsFragment);

    void inject(BetsPlacedController newBetsPlacedController);

    void inject(BetsListFragment fragment);

    void inject(BetDetailDialog betDetailDialog);

    void inject(BetslipFragment fragment);

    void inject(QuizParticipationDialog quizParticipationDialog);

    void inject(QuizResultsController quizResultsController);

    void inject(QuizResultsFragment quizResultsFragment);

    void inject(BettingSheetDialog bettingSheetDialog);

    void inject(NewCompetitionsFragment fragment);

    void inject(CompetitionsController competitionsController);

    void inject(CompetitionDetailsFragment fragment);

    void inject(DailyBonusDialogFragment fragment);

    void inject(DailyBonusController controller);

    void inject(FlashBetAbandonedSessionDialogFragment flashBetAbandonedSessionDialogFragment);

    void inject(FlashBetCategoriesFragment fragment);

    void inject(FlashBetDetailsDialogFragment flashBetDetailsDialogFragment);

    void inject(FlashBetFragment fragment);

    void inject(FlashBetGameFragment fragment);

    void inject(FlashBetLeaveConfirmDialogFragment fragment);

    void inject(FlashBetMatchStartFragment fragment);

    void inject(HomeFragment fragment);

    void inject(AuthFragment fragment);

    void inject(LoginFragment fragment);

    void inject(AuthController authController);

    void inject(LeaguesByDateController leaguesByDateController);

    void inject(LeaguesByDateFragment fragment);

    void inject(LeaguesController leaguesController);

    void inject(LeaguesFragment fragment);

    void inject(MatchesByDateFragment fragment);

    void inject(MatchesController matchesController);

    void inject(MatchesTabsFragment fragment);

    void inject(SpecificChampionshipFragment fragment);

    void inject(SportsByDateController sportsByDateController);

    void inject(SportsByDateFragment fragment);

    void inject(TeamsController teamsController);

    void inject(TopMatchesFragment fragment);

    void inject(TopMatchesTabFragment fragment);

    void inject(MatchDetailsController matchController);

    void inject(MatchDetailsFragmentK fragment);

    void inject(TeamDetailsController controller);

    void inject(TeamDetailsFragment fragment);

    void inject(MatchFilterState matchFilterState);

    void inject(NotificationsFragment fragment);

    void inject(NotificationsController notificationsController);

    void inject(NewSearchFragment newSearchFragment);

    void inject(SearchBottomSheetFragment searchBottomSheetFragment);

    void inject(SearchController searchController);

    void inject(NewSettingsFragment fragment);

    void inject(SettingsController controller);

    void inject(AllSubscriptionsFragment fragment);

    void inject(AllSubscriptionsController controller);

    void inject(ShopBetcoinsFragmentK fragment);

    void inject(PromoFragment fragment);

    void inject(SupportFragmentK fragment);

    void inject(SupportController controller);

    void inject(FollowersDialogController followersDialogController);

    void inject(ForeignUserDetailsFragmentK fragment);

    void inject(UserBattlesFragment fragment);

    void inject(UserDetailsController userDetailsController);

    void inject(UserDetailsFragmentK fragment);

    void inject(UserRankingsFragment fragment);

    void inject(WheelOfFortuneFragment wheelOfFortuneFragment);

    void inject(SplashActivity splashActivity);

    void inject(DefaultLoader loader);

    void inject(IntroActivity introActivity);

    void inject(IntroChallengeActivity introChallengeActivity);

    void inject(IntroQuizActivity introQuizActivity);
}
