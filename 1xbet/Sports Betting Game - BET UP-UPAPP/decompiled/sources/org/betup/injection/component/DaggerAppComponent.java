package org.betup.injection.component;

import android.app.Service;
import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import org.betup.BetUpApp;
import org.betup.BetUpApp_MembersInjector;
import org.betup.bus.NavigateMessage;
import org.betup.games.BaseGameFragment_MembersInjector;
import org.betup.games.GamesListFragment;
import org.betup.games.GamesListFragment_MembersInjector;
import org.betup.games.MiniGameActivity;
import org.betup.games.MiniGameActivity_MembersInjector;
import org.betup.games.common.remote.interactor.WebGameSessionCodeInteractor;
import org.betup.games.common.remote.interactor.WebGameSessionCodeInteractor_Factory;
import org.betup.games.common.remote.interactor.WebGamesListInteractor;
import org.betup.games.common.remote.interactor.WebGamesListInteractor_Factory;
import org.betup.games.dice.model.interactor.GetDiceGameConfigInteractor;
import org.betup.games.dice.model.interactor.GetDiceGameConfigInteractor_Factory;
import org.betup.games.dice.model.interactor.SendDiceGameResultInteractor;
import org.betup.games.dice.model.interactor.SendDiceGameResultInteractor_Factory;
import org.betup.games.dice.ui.DiceFragment;
import org.betup.games.dice.ui.DiceFragment_MembersInjector;
import org.betup.games.doubles.model.interactor.FinishDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.FinishDoubleGameInteractor_Factory;
import org.betup.games.doubles.model.interactor.GetConfigDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.GetConfigDoubleGameInteractor_Factory;
import org.betup.games.doubles.model.interactor.GetHistoryDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.GetHistoryDoubleGameInteractor_Factory;
import org.betup.games.doubles.model.interactor.StartDoubleGameInteractor;
import org.betup.games.doubles.model.interactor.StartDoubleGameInteractor_Factory;
import org.betup.games.doubles.ui.DoubleGameFragment;
import org.betup.games.doubles.ui.DoubleGameFragment_MembersInjector;
import org.betup.games.doubles.ui.ResultDoubleGameDialog;
import org.betup.games.doubles.ui.ResultDoubleGameDialog_MembersInjector;
import org.betup.games.higherLower.model.interactor.ContinueHighLowGameInteractor;
import org.betup.games.higherLower.model.interactor.ContinueHighLowGameInteractor_Factory;
import org.betup.games.higherLower.model.interactor.HigherLowerGameConfigInteractor;
import org.betup.games.higherLower.model.interactor.HigherLowerGameConfigInteractor_Factory;
import org.betup.games.higherLower.model.interactor.StartHighLowGameInteractor;
import org.betup.games.higherLower.model.interactor.StartHighLowGameInteractor_Factory;
import org.betup.games.higherLower.ui.HigherLowerGameFragment;
import org.betup.games.higherLower.ui.HigherLowerGameFragment_MembersInjector;
import org.betup.games.luckyCells.model.interactor.CompleteLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.CompleteLuckyCellsGameInteractor_Factory;
import org.betup.games.luckyCells.model.interactor.ContinueLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.ContinueLuckyCellsGameInteractor_Factory;
import org.betup.games.luckyCells.model.interactor.GetConfigLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.GetConfigLuckyCellsGameInteractor_Factory;
import org.betup.games.luckyCells.model.interactor.StartLuckyCellsGameInteractor;
import org.betup.games.luckyCells.model.interactor.StartLuckyCellsGameInteractor_Factory;
import org.betup.games.luckyCells.ui.LuckyCellsGameFragment;
import org.betup.games.luckyCells.ui.LuckyCellsGameFragment_MembersInjector;
import org.betup.games.warGame.model.interactor.ContinueWarGameInteractor;
import org.betup.games.warGame.model.interactor.ContinueWarGameInteractor_Factory;
import org.betup.games.warGame.model.interactor.GetWarGameConfigInteractor;
import org.betup.games.warGame.model.interactor.GetWarGameConfigInteractor_Factory;
import org.betup.games.warGame.model.interactor.StartWarGameInteractor;
import org.betup.games.warGame.model.interactor.StartWarGameInteractor_Factory;
import org.betup.games.warGame.ui.WarGameFragment;
import org.betup.games.warGame.ui.WarGameFragment_MembersInjector;
import org.betup.injection.module.AppModule;
import org.betup.injection.module.AppModule_ProvideAchievementsControllerFactory;
import org.betup.injection.module.AppModule_ProvideAllSubscriptionsControllerFactory;
import org.betup.injection.module.AppModule_ProvideAnalyticsServiceFactory;
import org.betup.injection.module.AppModule_ProvideAppLanguageObserverFactory;
import org.betup.injection.module.AppModule_ProvideBetListAppenderFactory;
import org.betup.injection.module.AppModule_ProvideBetValidatorFactory;
import org.betup.injection.module.AppModule_ProvideBetsPlacedControllerFactory;
import org.betup.injection.module.AppModule_ProvideChallengeTourInfoProviderFactory;
import org.betup.injection.module.AppModule_ProvideCompetitionsControllerFactory;
import org.betup.injection.module.AppModule_ProvideContextFactory;
import org.betup.injection.module.AppModule_ProvideDailyBonusControllerFactory;
import org.betup.injection.module.AppModule_ProvideDatabaseFactory;
import org.betup.injection.module.AppModule_ProvideDateFilterStateFactory;
import org.betup.injection.module.AppModule_ProvideFirebaseAuthFactory;
import org.betup.injection.module.AppModule_ProvideFirebaseRemoteConfigFactory;
import org.betup.injection.module.AppModule_ProvideFollowersDialogControllerFactory;
import org.betup.injection.module.AppModule_ProvideGamesNavigationControllerFactory;
import org.betup.injection.module.AppModule_ProvideHomeVideoBonusRefreshGateFactory;
import org.betup.injection.module.AppModule_ProvideInterstitialAdControllerFactory;
import org.betup.injection.module.AppModule_ProvideLeaguesControllerFactory;
import org.betup.injection.module.AppModule_ProvideLocaleServiceFactory;
import org.betup.injection.module.AppModule_ProvideMatchControllerFactory;
import org.betup.injection.module.AppModule_ProvideMatchFilterStateFactory;
import org.betup.injection.module.AppModule_ProvideMatchesControllerFactory;
import org.betup.injection.module.AppModule_ProvideMessagingControllerFactory;
import org.betup.injection.module.AppModule_ProvideNavigationControllerFactory;
import org.betup.injection.module.AppModule_ProvideNewBetSlipControllerFactory;
import org.betup.injection.module.AppModule_ProvidePushStorageProviderFactory;
import org.betup.injection.module.AppModule_ProvideQuizTourInfoProviderFactory;
import org.betup.injection.module.AppModule_ProvideRewardedAdControllerFactory;
import org.betup.injection.module.AppModule_ProvideSearchControllerFactory;
import org.betup.injection.module.AppModule_ProvideSettingsControllerFactory;
import org.betup.injection.module.AppModule_ProvideTeamDetailsControllerFactory;
import org.betup.injection.module.AppModule_ProvideTeamsControllerFactory;
import org.betup.injection.module.AppModule_ProvideTrackedOverlayDismissRegistryFactory;
import org.betup.injection.module.AppModule_ProvideUserDetailsControllerFactory;
import org.betup.injection.module.RestModule;
import org.betup.injection.module.RestModule_ProvideCancelBetInteractorFactory;
import org.betup.injection.module.RestModule_ProvideDeleteAllV7SubscriptionsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideDeleteFavoriteLeaguesInteractorFactory;
import org.betup.injection.module.RestModule_ProvideDeleteFavoriteSportsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideDeleteFavoriteTeamsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideDeleteV7AllMatchSubscriptionsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideDeleteV7MatchSubscriptionInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetAllV7SubscriptionsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetBetShareInstallLinkInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetCancelBetInfoInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetFavoriteTeamIdsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetFlashBetCategoriesInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetFlashBetSessionInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetFlashBetSportsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetFlashBetStatsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetPendingFlashBetSessionInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetRandomTeamImagesInteractorFactory;
import org.betup.injection.module.RestModule_ProvideGetSellBetInfoInteractorFactory;
import org.betup.injection.module.RestModule_ProvideLeaveFlashBetSessionInteractorFactory;
import org.betup.injection.module.RestModule_ProvideMatchInfoInteractorFactory;
import org.betup.injection.module.RestModule_ProvideMatchShortInfoInteractorFactory;
import org.betup.injection.module.RestModule_ProvideMatchVarietiesInteractorFactory;
import org.betup.injection.module.RestModule_ProvideNewActiveCompetitionsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideNewCompetitionsHistoryInteractorFactory;
import org.betup.injection.module.RestModule_ProvideNewShopItemsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideNewSportsInteractorFactory;
import org.betup.injection.module.RestModule_ProvidePlaceBetInteractorFactory;
import org.betup.injection.module.RestModule_ProvidePutFavoriteLeaguesBulkInteractorFactory;
import org.betup.injection.module.RestModule_ProvidePutFavoriteLeaguesInteractorFactory;
import org.betup.injection.module.RestModule_ProvidePutFavoriteSportsBulkInteractorFactory;
import org.betup.injection.module.RestModule_ProvidePutFavoriteSportsInteractorFactory;
import org.betup.injection.module.RestModule_ProvidePutFavoriteTeamsBulkInteractorFactory;
import org.betup.injection.module.RestModule_ProvidePutFavoriteTeamsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideSellBetInteractorFactory;
import org.betup.injection.module.RestModule_ProvideShopEntitlementClaimInteractorFactory;
import org.betup.injection.module.RestModule_ProvideShopLayoutInteractorFactory;
import org.betup.injection.module.RestModule_ProvideStartFlashBetGameInteractorFactory;
import org.betup.injection.module.RestModule_ProvideSubmitFlashBetAnswerInteractorFactory;
import org.betup.injection.module.RestModule_ProvideTourFavoriteSportsControllerFactory;
import org.betup.injection.module.RestModule_ProvideUpdateV7PushPreferencesInteractorFactory;
import org.betup.injection.module.RestModule_ProvideUpgradeLoginInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7BalanceHistoryInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7CasinoAuthInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7CreateBetlistInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7DailyBonusInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7GetCustomTokenInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7GetServerInfoInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7GrabbedBetsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7MakeSubscriptionPurchaseInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7MatchHistoryInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7MatchStatisticsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7OneClickBetSettingsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7ReferralInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7TourMarketingRewardsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7UpdateAppVersionInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7UpdatePushTokenAndLangInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7UpdateTimezoneInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7UpdateTutorialCompleteInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7VarietyBetRestrictionsInteractorFactory;
import org.betup.injection.module.RestModule_ProvideV7VarietyVersionGatesInteractorFactory;
import org.betup.injection.module.ServiceModule_ContributeMyFirebaseMessagingService;
import org.betup.injection.provider.BillingClientProvider;
import org.betup.injection.provider.BillingClientProvider_Factory;
import org.betup.injection.provider.PreferencesProvider;
import org.betup.injection.provider.PreferencesProvider_Factory;
import org.betup.interstitial.InterstitialAdCoordinator;
import org.betup.interstitial.InterstitialAdCoordinator_Factory;
import org.betup.model.local.AppDatabase;
import org.betup.model.local.interactor.AddEventInteractor;
import org.betup.model.local.interactor.AddEventInteractor_Factory;
import org.betup.model.local.interactor.GetNewEventsCountInteractor;
import org.betup.model.local.interactor.GetNewEventsCountInteractorByUUID_Factory;
import org.betup.model.local.interactor.GetNewEventsCountInteractor_Factory;
import org.betup.model.local.interactor.LoadEventsInteractor;
import org.betup.model.local.interactor.LoadEventsInteractor_Factory;
import org.betup.model.local.interactor.ReadAllEventsInteractor;
import org.betup.model.local.interactor.ReadAllEventsInteractor_Factory;
import org.betup.model.local.interactor.ReadEventInteractor;
import org.betup.model.local.interactor.ReadEventInteractor_Factory;
import org.betup.model.remote.api.interactor.NewChallengeDetailsInteractor;
import org.betup.model.remote.api.rest.analytics.GetOffersInfoInteractor;
import org.betup.model.remote.api.rest.analytics.GetOffersInfoInteractor_Factory;
import org.betup.model.remote.api.rest.analytics.GetOffersListInteractor;
import org.betup.model.remote.api.rest.analytics.GetPromoBannerForMatchInteractor;
import org.betup.model.remote.api.rest.analytics.GetPromoBannerForMatchInteractor_Factory;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor;
import org.betup.model.remote.api.rest.analytics.GetSignatureForOfferInteractor_Factory;
import org.betup.model.remote.api.rest.analytics.GetSignedPendingOfferInteractor;
import org.betup.model.remote.api.rest.analytics.GetSignedPendingOfferInteractor_Factory;
import org.betup.model.remote.api.rest.analytics.GetSingleOfferInfoInteractor;
import org.betup.model.remote.api.rest.analytics.GetSingleOfferInfoInteractor_Factory;
import org.betup.model.remote.api.rest.analytics.PostFullOfferSignatureInteractor;
import org.betup.model.remote.api.rest.analytics.PostFullOfferSignatureInteractor_Factory;
import org.betup.model.remote.api.rest.analytics.PostTrackEventInteractor;
import org.betup.model.remote.api.rest.analytics.PostTrackEventInteractor_Factory;
import org.betup.model.remote.api.rest.analytics.PostTrackPurchaseInteractor;
import org.betup.model.remote.api.rest.analytics.PostTrackPurchaseInteractor_Factory;
import org.betup.model.remote.api.rest.betslip.V7CreateBetlistInteractor;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;
import org.betup.model.remote.api.rest.bonus.V7DailyBonusInteractor;
import org.betup.model.remote.api.rest.casino.V7CasinoAuthInteractor;
import org.betup.model.remote.api.rest.challenges.NewChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserAvailableChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserAvailableChallengesInteractor_Factory;
import org.betup.model.remote.api.rest.challenges.NewUserBattleActionCountsInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleActionCountsInteractor_Factory;
import org.betup.model.remote.api.rest.challenges.NewUserBattleCountsInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleCountsInteractor_Factory;
import org.betup.model.remote.api.rest.challenges.NewUserChallengesHistoryInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserChallengesHistoryInteractor_Factory;
import org.betup.model.remote.api.rest.challenges.NewUserPrivateChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserPrivateChallengesInteractor_Factory;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionDetailsWithParticipantInteractor;
import org.betup.model.remote.api.rest.competitions.CompetitionHistoryCountInteractor;
import org.betup.model.remote.api.rest.competitions.NewActiveCompetitionsInteractor;
import org.betup.model.remote.api.rest.competitions.NewCompetitionsHistoryInteractor;
import org.betup.model.remote.api.rest.competitions.PlaceBetInteractor;
import org.betup.model.remote.api.rest.country.GetV7CountriesInteractor;
import org.betup.model.remote.api.rest.country.GetV7CountriesInteractor_Factory;
import org.betup.model.remote.api.rest.energy.ChallengeAcceptInteractor;
import org.betup.model.remote.api.rest.energy.ChallengeCancelInteractor;
import org.betup.model.remote.api.rest.energy.NewChallengeCreateInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetCategoriesInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetSportsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetFlashBetStatsInteractor;
import org.betup.model.remote.api.rest.flashbet.GetPendingFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.LeaveFlashBetSessionInteractor;
import org.betup.model.remote.api.rest.flashbet.StartFlashBetGameInteractor;
import org.betup.model.remote.api.rest.flashbet.SubmitFlashBetAnswerInteractor;
import org.betup.model.remote.api.rest.interstitial.GetInterstitialCampaignInteractor;
import org.betup.model.remote.api.rest.interstitial.GetInterstitialCampaignInteractor_Factory;
import org.betup.model.remote.api.rest.interstitial.PostInterstitialActionInteractor;
import org.betup.model.remote.api.rest.interstitial.PostInterstitialActionInteractor_Factory;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteTeamsInteractor;
import org.betup.model.remote.api.rest.matches.GetFavoriteTeamIdsInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.GetTeamDetailsInteractor;
import org.betup.model.remote.api.rest.matches.GetTeamDetailsInteractor_Factory;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor_Factory;
import org.betup.model.remote.api.rest.matches.LeaguesByDateInteractor;
import org.betup.model.remote.api.rest.matches.LeaguesByDateInteractor_Factory;
import org.betup.model.remote.api.rest.matches.MatchInfoInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor_Factory;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.MatchesByDateInteractor;
import org.betup.model.remote.api.rest.matches.MatchesByDateInteractor_Factory;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor_Factory;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor_Factory;
import org.betup.model.remote.api.rest.matches.NewSpecificChampionshipInteractor;
import org.betup.model.remote.api.rest.matches.NewSpecificChampionshipInteractor_Factory;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.NewTeamsInteractor;
import org.betup.model.remote.api.rest.matches.NewTeamsInteractor_Factory;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsInteractor;
import org.betup.model.remote.api.rest.matches.SportsByDateInteractor;
import org.betup.model.remote.api.rest.matches.SportsByDateInteractor_Factory;
import org.betup.model.remote.api.rest.matches.V7MatchHistoryInteractor;
import org.betup.model.remote.api.rest.matches.V7MatchStatisticsInteractor;
import org.betup.model.remote.api.rest.matches.V7StatsByVarietiesInteractor;
import org.betup.model.remote.api.rest.matches.V7StatsByVarietiesInteractor_Factory;
import org.betup.model.remote.api.rest.matches.details.GetParticipationInteractor;
import org.betup.model.remote.api.rest.matches.details.GetParticipationInteractor_Factory;
import org.betup.model.remote.api.rest.matches.details.MatchQuizParticipationInteractor;
import org.betup.model.remote.api.rest.matches.details.MatchQuizParticipationInteractor_Factory;
import org.betup.model.remote.api.rest.matches.details.MatchShortInfoInteractor;
import org.betup.model.remote.api.rest.matches.details.QuizAvailabilityInteractor;
import org.betup.model.remote.api.rest.matches.details.QuizAvailabilityInteractor_Factory;
import org.betup.model.remote.api.rest.matches.details.QuizDetailsInteractor;
import org.betup.model.remote.api.rest.matches.details.QuizDetailsInteractor_Factory;
import org.betup.model.remote.api.rest.messaging.GetChatsInteractor;
import org.betup.model.remote.api.rest.messaging.GetChatsInteractor_Factory;
import org.betup.model.remote.api.rest.messaging.GetPrivateMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.GetPrivateMessagesInteractor_Factory;
import org.betup.model.remote.api.rest.messaging.GetPublicChatMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.GetPublicChatMessagesInteractor_Factory;
import org.betup.model.remote.api.rest.messaging.GetUserMessagesInteractor;
import org.betup.model.remote.api.rest.messaging.GetUserMessagesInteractor_Factory;
import org.betup.model.remote.api.rest.messaging.SendPrivateMessasgesInteractor;
import org.betup.model.remote.api.rest.messaging.SendPrivateMessasgesInteractor_Factory;
import org.betup.model.remote.api.rest.messaging.SendPublicChatMessageInteractor;
import org.betup.model.remote.api.rest.messaging.SendPublicChatMessageInteractor_Factory;
import org.betup.model.remote.api.rest.presentation.GetActivePresentationsInteractor;
import org.betup.model.remote.api.rest.presentation.GetActivePresentationsInteractor_Factory;
import org.betup.model.remote.api.rest.presentation.GetPresentationScreenRegistryInteractor;
import org.betup.model.remote.api.rest.presentation.GetPresentationScreenRegistryInteractor_Factory;
import org.betup.model.remote.api.rest.presentation.PostPresentationActionInteractor;
import org.betup.model.remote.api.rest.presentation.PostPresentationActionInteractor_Factory;
import org.betup.model.remote.api.rest.promo.GetPromoInterstitialSettingsInteractor;
import org.betup.model.remote.api.rest.promo.GetPromoInterstitialSettingsInteractor_Factory;
import org.betup.model.remote.api.rest.quiz.QuizParticipationInteractor;
import org.betup.model.remote.api.rest.quiz.QuizParticipationInteractor_Factory;
import org.betup.model.remote.api.rest.quiz.QuizParticipationsInteractor;
import org.betup.model.remote.api.rest.quiz.QuizParticipationsInteractor_Factory;
import org.betup.model.remote.api.rest.quiz.QuizStateCountInteractor;
import org.betup.model.remote.api.rest.quiz.QuizStateCountInteractor_Factory;
import org.betup.model.remote.api.rest.quiz.QuizTiersInteractor;
import org.betup.model.remote.api.rest.quiz.QuizTiersInteractor_Factory;
import org.betup.model.remote.api.rest.reward.GiveWheelOfFortuneRewardInteractor;
import org.betup.model.remote.api.rest.reward.GiveWheelOfFortuneRewardInteractor_Factory;
import org.betup.model.remote.api.rest.rewardedprompt.GetEligibleRewardedPromptsInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.GetEligibleRewardedPromptsInteractor_Factory;
import org.betup.model.remote.api.rest.rewardedprompt.GetRewardedPromptCampaignInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.GetRewardedPromptCampaignInteractor_Factory;
import org.betup.model.remote.api.rest.rewardedprompt.PostRewardedPromptActionInteractor;
import org.betup.model.remote.api.rest.rewardedprompt.PostRewardedPromptActionInteractor_Factory;
import org.betup.model.remote.api.rest.search.V7SearchLeaguesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchLeaguesInteractor_Factory;
import org.betup.model.remote.api.rest.search.V7SearchMatchesInteractor;
import org.betup.model.remote.api.rest.search.V7SearchMatchesInteractor_Factory;
import org.betup.model.remote.api.rest.search.V7SearchTeamsInteractor;
import org.betup.model.remote.api.rest.search.V7SearchTeamsInteractor_Factory;
import org.betup.model.remote.api.rest.search.V7SearchUsersInteractor;
import org.betup.model.remote.api.rest.search.V7SearchUsersInteractor_Factory;
import org.betup.model.remote.api.rest.search.V7TrendingItemsInteractor;
import org.betup.model.remote.api.rest.search.V7TrendingItemsInteractor_Factory;
import org.betup.model.remote.api.rest.server.V7GetServerInfoInteractor;
import org.betup.model.remote.api.rest.shop.CancelBetInteractor;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.model.remote.api.rest.shop.GetCancelBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.GetSellBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewShopItemsInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor_Factory;
import org.betup.model.remote.api.rest.shop.SellBetInteractor;
import org.betup.model.remote.api.rest.shop.ShopEntitlementClaimInteractor;
import org.betup.model.remote.api.rest.shop.ShopLayoutInteractor;
import org.betup.model.remote.api.rest.shop.ShopPurchaseInteractor;
import org.betup.model.remote.api.rest.shop.ShopPurchaseInteractor_Factory;
import org.betup.model.remote.api.rest.shop.V7MakeSubscriptionPurchaseInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteAllV7SubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7AllMatchSubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.DeleteV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.GetAllV7SubscriptionsInteractor;
import org.betup.model.remote.api.rest.subscription.GetV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.GetV7MatchSubscriptionInteractor_Factory;
import org.betup.model.remote.api.rest.subscription.UpdateV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.UpdateV7MatchSubscriptionInteractor_Factory;
import org.betup.model.remote.api.rest.support.CloseSupportChatInteractor;
import org.betup.model.remote.api.rest.support.CloseSupportChatInteractor_Factory;
import org.betup.model.remote.api.rest.support.CreateSupportChatInteractor;
import org.betup.model.remote.api.rest.support.CreateSupportChatInteractor_Factory;
import org.betup.model.remote.api.rest.support.GetSupportCategoriesInteractor;
import org.betup.model.remote.api.rest.support.GetSupportCategoriesInteractor_Factory;
import org.betup.model.remote.api.rest.support.GetSupportChatInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatInteractor_Factory;
import org.betup.model.remote.api.rest.support.GetSupportChatMessagesInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatMessagesInteractor_Factory;
import org.betup.model.remote.api.rest.support.GetSupportChatsInteractor;
import org.betup.model.remote.api.rest.support.GetSupportChatsInteractor_Factory;
import org.betup.model.remote.api.rest.support.GetV7FAQInteractor;
import org.betup.model.remote.api.rest.support.GetV7FAQInteractor_Factory;
import org.betup.model.remote.api.rest.support.GetV7SupportInfoInteractor;
import org.betup.model.remote.api.rest.support.GetV7SupportInfoInteractor_Factory;
import org.betup.model.remote.api.rest.support.GetV7SupportMessagesInteractor;
import org.betup.model.remote.api.rest.support.GetV7SupportMessagesInteractor_Factory;
import org.betup.model.remote.api.rest.support.SendSupportChatMessageInteractor;
import org.betup.model.remote.api.rest.support.SendSupportChatMessageInteractor_Factory;
import org.betup.model.remote.api.rest.support.SendV7SupportMessageInteractor;
import org.betup.model.remote.api.rest.support.SendV7SupportMessageInteractor_Factory;
import org.betup.model.remote.api.rest.user.CancelAccountDeletionRequestInteractor;
import org.betup.model.remote.api.rest.user.CancelAccountDeletionRequestInteractor_Factory;
import org.betup.model.remote.api.rest.user.ChangeV7CountryInteractor;
import org.betup.model.remote.api.rest.user.ChangeV7CountryInteractor_Factory;
import org.betup.model.remote.api.rest.user.ChangeV7NameInteractor;
import org.betup.model.remote.api.rest.user.ChangeV7NameInteractor_Factory;
import org.betup.model.remote.api.rest.user.ClaimDailyQuestInteractor;
import org.betup.model.remote.api.rest.user.ClaimDailyQuestInteractor_Factory;
import org.betup.model.remote.api.rest.user.GetDailyQuestsInteractor;
import org.betup.model.remote.api.rest.user.GetDailyQuestsInteractor_Factory;
import org.betup.model.remote.api.rest.user.GetDeleteAccountInfoInteractor;
import org.betup.model.remote.api.rest.user.GetDeleteAccountInfoInteractor_Factory;
import org.betup.model.remote.api.rest.user.GetUserTagSlugsInteractor;
import org.betup.model.remote.api.rest.user.GetUserTagSlugsInteractor_Factory;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor;
import org.betup.model.remote.api.rest.user.GetV7MyInfoInteractor_Factory;
import org.betup.model.remote.api.rest.user.MyProgressInteractor;
import org.betup.model.remote.api.rest.user.MyProgressInteractor_Factory;
import org.betup.model.remote.api.rest.user.NewLoginInteractor;
import org.betup.model.remote.api.rest.user.NewLoginInteractor_Factory;
import org.betup.model.remote.api.rest.user.ReportDailyQuestClientEventInteractor;
import org.betup.model.remote.api.rest.user.ReportDailyQuestClientEventInteractor_Factory;
import org.betup.model.remote.api.rest.user.SendDeleteAccountInteractor;
import org.betup.model.remote.api.rest.user.SendDeleteAccountInteractor_Factory;
import org.betup.model.remote.api.rest.user.SendV7ReportInteractor;
import org.betup.model.remote.api.rest.user.SendV7ReportInteractor_Factory;
import org.betup.model.remote.api.rest.user.UnlockOneClickBetInteractor;
import org.betup.model.remote.api.rest.user.UnlockOneClickBetInteractor_Factory;
import org.betup.model.remote.api.rest.user.UpdateV7PushPreferencesInteractor;
import org.betup.model.remote.api.rest.user.UpgradeLoginInteractor;
import org.betup.model.remote.api.rest.user.UserProfileStatisticsInteractor;
import org.betup.model.remote.api.rest.user.UserProfileStatisticsInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7GetCustomTokenInteractor;
import org.betup.model.remote.api.rest.user.V7OneClickBetSettingsInteractor;
import org.betup.model.remote.api.rest.user.V7RanksByTypeInteractor;
import org.betup.model.remote.api.rest.user.V7RanksByTypeInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7ReferralInteractor;
import org.betup.model.remote.api.rest.user.V7TourMarketingRewardsInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateAppVersionInteractor;
import org.betup.model.remote.api.rest.user.V7UpdatePushTokenAndLangInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTimezoneInteractor;
import org.betup.model.remote.api.rest.user.V7UpdateTutorialCompleteInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor;
import org.betup.model.remote.api.rest.user.V7UserAchievementsInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor;
import org.betup.model.remote.api.rest.user.V7UserFavouritesInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserFollowActionInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowActionInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserFollowersInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowersInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserFollowingInteractor;
import org.betup.model.remote.api.rest.user.V7UserFollowingInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserRankingStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserRankingStatisticsInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor_Factory;
import org.betup.model.remote.api.rest.user.V7VarietyBetRestrictionsInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyVersionGatesInteractor;
import org.betup.model.remote.api.rest.user.balance.V7BalanceHistoryInteractor;
import org.betup.model.remote.api.rest.user.bets.BetStatInteractor;
import org.betup.model.remote.api.rest.user.bets.BetStatInteractor_Factory;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor_Factory;
import org.betup.model.remote.api.rest.user.bets.SingleBetInteractor;
import org.betup.model.remote.api.rest.user.bets.SingleBetInteractor_Factory;
import org.betup.model.remote.api.rest.user.changephoto.ChangeV7ProfilePhotoInteractor;
import org.betup.model.remote.api.rest.user.changephoto.ChangeV7ProfilePhotoInteractor_Factory;
import org.betup.model.remote.api.rest.videoRewards.GetVideoRewardForPlacementStateInteractor;
import org.betup.model.remote.api.rest.videoRewards.GetVideoRewardForPlacementStateInteractor_Factory;
import org.betup.model.remote.api.rest.videoRewards.RedeemVideoRewardForPlacementInteractor;
import org.betup.model.remote.api.rest.videoRewards.RedeemVideoRewardForPlacementInteractor_Factory;
import org.betup.presentation.PresentationCoordinator;
import org.betup.presentation.PresentationCoordinator_Factory;
import org.betup.presentation.PresentationScreenRegistryStore;
import org.betup.presentation.PresentationScreenRegistryStore_Factory;
import org.betup.presentation.PresentationScreens;
import org.betup.presentation.PresentationScreens_Factory;
import org.betup.presentation.ScreenTracker;
import org.betup.presentation.ScreenTracker_Factory;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator;
import org.betup.rewardedprompt.RewardedVideoOfferCoordinator_Factory;
import org.betup.services.LocaleService;
import org.betup.services.MyFirebaseMessagingService;
import org.betup.services.MyFirebaseMessagingService_MembersInjector;
import org.betup.services.ads.AdUnitRegistry;
import org.betup.services.ads.AdUnitRegistry_Factory;
import org.betup.services.ads.MobileAdsInitializer;
import org.betup.services.ads.MobileAdsInitializer_Factory;
import org.betup.services.ads.consent.AdsConsentManager;
import org.betup.services.ads.consent.AdsConsentManager_Factory;
import org.betup.services.ads.interstitial.GoogleInterstitialAdController;
import org.betup.services.ads.interstitial.GoogleInterstitialAdController_Factory;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.ads.rewarded.GoogleRewardedAdController;
import org.betup.services.ads.rewarded.GoogleRewardedAdController_Factory;
import org.betup.services.ads.rewarded.RewardedAdController;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.BillingService_Factory;
import org.betup.services.casino.CasinoService;
import org.betup.services.casino.CasinoService_Factory;
import org.betup.services.challenge.ChallengeTourInfoProvider;
import org.betup.services.chats.ChatService;
import org.betup.services.down.ServerErrorsProcessor;
import org.betup.services.down.ServerErrorsProcessor_Factory;
import org.betup.services.experiments.ABTestService;
import org.betup.services.experiments.ABTestService_Factory;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.language.DefaultAppLanguageObserver;
import org.betup.services.language.DefaultAppLanguageObserver_Factory;
import org.betup.services.navigate.NavigationService;
import org.betup.services.offer.AdsInitializer;
import org.betup.services.offer.AdsInitializer_Factory;
import org.betup.services.offer.PromoInterstitialRulesSync;
import org.betup.services.offer.PromoInterstitialRulesSync_Factory;
import org.betup.services.offer.PromoInterstitialSettingsService;
import org.betup.services.offer.PromoInterstitialSettingsService_Factory;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.PromoService_Factory;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.offer.VideoRewardService_Factory;
import org.betup.services.push.PushEventsService;
import org.betup.services.push.PushEventsService_MembersInjector;
import org.betup.services.push.PushStorageProvider;
import org.betup.services.push.PushTokenService;
import org.betup.services.push.PushTokenService_Factory;
import org.betup.services.quiz.QuizTourInfoProvider;
import org.betup.services.scores.SubscoreService;
import org.betup.services.scores.SubscoreService_Factory;
import org.betup.services.search.RecentSearchesService;
import org.betup.services.search.RecentSearchesService_Factory;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.storage.LocalPreferencesService_Factory;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.betup.services.subscription.DefaultSubscriptionService_Factory;
import org.betup.services.subscription.DefaultSubscriptionService_MembersInjector;
import org.betup.services.user.SocialConnectionService;
import org.betup.services.user.SocialConnectionService_Factory;
import org.betup.services.user.UserAnalyticsTagsService;
import org.betup.services.user.UserAnalyticsTagsService_Factory;
import org.betup.services.user.UserService;
import org.betup.services.user.UserServiceAccessor;
import org.betup.services.user.UserServiceAccessor_MembersInjector;
import org.betup.services.user.UserService_Factory;
import org.betup.ui.FullscreenXZoneActivity;
import org.betup.ui.LoginActivity;
import org.betup.ui.LoginActivity_MembersInjector;
import org.betup.ui.MainActivity;
import org.betup.ui.MainActivity_MembersInjector;
import org.betup.ui.dialogs.BetListResultDialogFragment;
import org.betup.ui.dialogs.BetListResultDialogFragment_MembersInjector;
import org.betup.ui.dialogs.BetPlacedDialog;
import org.betup.ui.dialogs.BetPlacedDialog_MembersInjector;
import org.betup.ui.dialogs.BonusOfferWebViewFragment;
import org.betup.ui.dialogs.BonusOfferWebViewFragment_MembersInjector;
import org.betup.ui.dialogs.ChallengeAcceptDialogFragment;
import org.betup.ui.dialogs.ChallengeAcceptDialogFragment_MembersInjector;
import org.betup.ui.dialogs.ChallengePreviewNewDialogFragment;
import org.betup.ui.dialogs.ChallengePreviewNewDialogFragment_MembersInjector;
import org.betup.ui.dialogs.ChangeCountryDialogFragment;
import org.betup.ui.dialogs.ChangeCountryDialogFragment_MembersInjector;
import org.betup.ui.dialogs.ChangeDisplayNameInteractorAccessor;
import org.betup.ui.dialogs.ChangeDisplayNameInteractorAccessor_MembersInjector;
import org.betup.ui.dialogs.ChangeLanguageDialog;
import org.betup.ui.dialogs.ChangeLanguageFragment;
import org.betup.ui.dialogs.ChangeLanguageFragment_MembersInjector;
import org.betup.ui.dialogs.CompetitionsPreviewFragment;
import org.betup.ui.dialogs.CompetitionsPreviewFragment_MembersInjector;
import org.betup.ui.dialogs.CreateBattleDialogFragment;
import org.betup.ui.dialogs.CreateBattleDialogFragment_MembersInjector;
import org.betup.ui.dialogs.DialogConsent;
import org.betup.ui.dialogs.DialogConsent_MembersInjector;
import org.betup.ui.dialogs.FollowersDialog;
import org.betup.ui.dialogs.FollowersDialog_MembersInjector;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialog;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialogFragment_MembersInjector;
import org.betup.ui.dialogs.NotEnoughBetcoinsVideoOfferDialog_MembersInjector;
import org.betup.ui.dialogs.NotificationDialogFragment;
import org.betup.ui.dialogs.NotificationDialogFragment_MembersInjector;
import org.betup.ui.dialogs.OddsDialogFragment;
import org.betup.ui.dialogs.OddsDialogFragment_MembersInjector;
import org.betup.ui.dialogs.OffersDialogFragment;
import org.betup.ui.dialogs.OffersDialogFragment_MembersInjector;
import org.betup.ui.dialogs.OneClickBetSettingsDialogFragment;
import org.betup.ui.dialogs.OneClickBetSettingsDialogFragment_MembersInjector;
import org.betup.ui.dialogs.ReferralCodeInteractorAccessor;
import org.betup.ui.dialogs.ReferralCodeInteractorAccessor_MembersInjector;
import org.betup.ui.dialogs.RewardReceivedDialog;
import org.betup.ui.dialogs.RewardReceivedDialog_MembersInjector;
import org.betup.ui.dialogs.RewardedVideoOfferDialogFragment;
import org.betup.ui.dialogs.RewardedVideoOfferDialogFragment_MembersInjector;
import org.betup.ui.dialogs.SelectBetDialogFragment;
import org.betup.ui.dialogs.SelectBetDialogFragment_MembersInjector;
import org.betup.ui.dialogs.SelectLeagueDialogFragment;
import org.betup.ui.dialogs.SelectLeagueDialogFragment_MembersInjector;
import org.betup.ui.dialogs.SelectMatchDialogFragment;
import org.betup.ui.dialogs.SelectMatchDialogFragment_MembersInjector;
import org.betup.ui.dialogs.ShopDialogFragment;
import org.betup.ui.dialogs.ShopDialogFragment_MembersInjector;
import org.betup.ui.dialogs.SubscriptionDialog;
import org.betup.ui.dialogs.SubscriptionDialog_MembersInjector;
import org.betup.ui.dialogs.TicketsInfoDialog;
import org.betup.ui.dialogs.TicketsInfoDialog_MembersInjector;
import org.betup.ui.dialogs.TourCompletedDialogFragment;
import org.betup.ui.dialogs.TourCompletedDialogFragment_MembersInjector;
import org.betup.ui.dialogs.UnlockBetAmountDialog;
import org.betup.ui.dialogs.UnlockBetAmountDialog_MembersInjector;
import org.betup.ui.dialogs.UnlockBetGroupsDialog;
import org.betup.ui.dialogs.UnlockBetGroupsDialogFragment;
import org.betup.ui.dialogs.UnlockBetGroupsDialogFragment_MembersInjector;
import org.betup.ui.dialogs.UnlockBetGroupsDialog_MembersInjector;
import org.betup.ui.dialogs.WelcomeDialog;
import org.betup.ui.dialogs.WelcomeDialog_MembersInjector;
import org.betup.ui.dialogs.controller.BetSelectionController;
import org.betup.ui.dialogs.controller.BetSelectionController_Factory;
import org.betup.ui.dialogs.controller.BetSelectionController_MembersInjector;
import org.betup.ui.dialogs.controller.ChallengeAcceptController;
import org.betup.ui.dialogs.controller.ChallengeAcceptController_Factory;
import org.betup.ui.dialogs.controller.ChallengeAcceptController_MembersInjector;
import org.betup.ui.dialogs.controller.ChallengePreviewController;
import org.betup.ui.dialogs.controller.ChallengePreviewController_Factory;
import org.betup.ui.dialogs.controller.ChallengePreviewController_MembersInjector;
import org.betup.ui.dialogs.controller.LeagueSelectionController;
import org.betup.ui.dialogs.controller.LeagueSelectionController_Factory;
import org.betup.ui.dialogs.controller.LeagueSelectionController_MembersInjector;
import org.betup.ui.dialogs.controller.MatchSelectionController;
import org.betup.ui.dialogs.controller.MatchSelectionController_Factory;
import org.betup.ui.dialogs.controller.MatchSelectionController_MembersInjector;
import org.betup.ui.dialogs.controller.SportsSelectionController;
import org.betup.ui.dialogs.controller.SportsSelectionController_Factory;
import org.betup.ui.dialogs.controller.SportsSelectionController_MembersInjector;
import org.betup.ui.dialogs.fav.EditFavouritesDialog;
import org.betup.ui.dialogs.fav.EditFavouritesDialog_MembersInjector;
import org.betup.ui.dialogs.offer.ButtonContent;
import org.betup.ui.dialogs.offer.ButtonContent_MembersInjector;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.betup.ui.dialogs.offer.OfferFragment_MembersInjector;
import org.betup.ui.dialogs.offer.PriceContent;
import org.betup.ui.dialogs.offer.PriceContent_MembersInjector;
import org.betup.ui.dialogs.offer.SpecialOfferDialogFragment;
import org.betup.ui.dialogs.offer.SpecialOfferDialogFragment_MembersInjector;
import org.betup.ui.dialogs.offer.SpecialOfferPageFragment;
import org.betup.ui.dialogs.offer.SpecialOfferPageFragment_MembersInjector;
import org.betup.ui.dialogs.offer.TimerContent;
import org.betup.ui.dialogs.offer.TimerContent_MembersInjector;
import org.betup.ui.dialogs.push.PushNotificationDialogFragment;
import org.betup.ui.dialogs.push.PushNotificationDialogFragment_MembersInjector;
import org.betup.ui.dialogs.webgame.WebGameDialogFragment;
import org.betup.ui.dialogs.webgame.WebGameDialogFragment_MembersInjector;
import org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment;
import org.betup.ui.dialogs.webgame.WebGameWinVideoOfferDialogFragment_MembersInjector;
import org.betup.ui.fragment.achievements.NewAchievementsFragment;
import org.betup.ui.fragment.achievements.NewAchievementsFragment_MembersInjector;
import org.betup.ui.fragment.achievements.controller.AchievementsController;
import org.betup.ui.fragment.achievements.controller.AchievementsController_MembersInjector;
import org.betup.ui.fragment.balance.BalanceHistoryFragmentK;
import org.betup.ui.fragment.balance.BalanceHistoryFragmentK_MembersInjector;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.BetsController_MembersInjector;
import org.betup.ui.fragment.bets.BetsFragment;
import org.betup.ui.fragment.bets.BetsFragment_MembersInjector;
import org.betup.ui.fragment.bets.BetsPlacedController;
import org.betup.ui.fragment.bets.BetsPlacedController_MembersInjector;
import org.betup.ui.fragment.bets.betlist.BetsListFragment;
import org.betup.ui.fragment.bets.betlist.BetsListFragment_MembersInjector;
import org.betup.ui.fragment.bets.betlist.details.BetDetailDialog;
import org.betup.ui.fragment.bets.betlist.details.BetDetailDialog_MembersInjector;
import org.betup.ui.fragment.bets.betslip.BetslipFragment;
import org.betup.ui.fragment.bets.betslip.BetslipFragment_MembersInjector;
import org.betup.ui.fragment.bets.quiz.QuizParticipationDialog;
import org.betup.ui.fragment.bets.quiz.QuizParticipationDialog_MembersInjector;
import org.betup.ui.fragment.bets.quiz.QuizResultsController;
import org.betup.ui.fragment.bets.quiz.QuizResultsController_Factory;
import org.betup.ui.fragment.bets.quiz.QuizResultsController_MembersInjector;
import org.betup.ui.fragment.bets.quiz.QuizResultsFragment;
import org.betup.ui.fragment.bets.quiz.QuizResultsFragment_MembersInjector;
import org.betup.ui.fragment.bets.sheet.BettingSheetDialog;
import org.betup.ui.fragment.bets.sheet.BettingSheetDialog_MembersInjector;
import org.betup.ui.fragment.competitions.NewCompetitionsFragment;
import org.betup.ui.fragment.competitions.NewCompetitionsFragment_MembersInjector;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;
import org.betup.ui.fragment.competitions.controller.CompetitionsController_MembersInjector;
import org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment;
import org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment_MembersInjector;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController_Factory;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController_MembersInjector;
import org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment;
import org.betup.ui.fragment.dailybonus.DailyBonusDialogFragment_MembersInjector;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController_MembersInjector;
import org.betup.ui.fragment.flashbet.FlashBetAbandonedSessionDialogFragment;
import org.betup.ui.fragment.flashbet.FlashBetAbandonedSessionDialogFragment_MembersInjector;
import org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment;
import org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment_MembersInjector;
import org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment;
import org.betup.ui.fragment.flashbet.FlashBetDetailsDialogFragment_MembersInjector;
import org.betup.ui.fragment.flashbet.FlashBetFragment;
import org.betup.ui.fragment.flashbet.FlashBetFragment_MembersInjector;
import org.betup.ui.fragment.flashbet.FlashBetGameFragment;
import org.betup.ui.fragment.flashbet.FlashBetGameFragment_MembersInjector;
import org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment;
import org.betup.ui.fragment.flashbet.FlashBetLeaveConfirmDialogFragment_MembersInjector;
import org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment;
import org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment_MembersInjector;
import org.betup.ui.fragment.flashbet.controller.FlashBetCategoriesController;
import org.betup.ui.fragment.flashbet.controller.FlashBetController;
import org.betup.ui.fragment.flashbet.controller.FlashBetGameController;
import org.betup.ui.fragment.flashbet.controller.FlashBetMatchStartController;
import org.betup.ui.fragment.home.HomeFragment;
import org.betup.ui.fragment.home.HomeFragment_MembersInjector;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController_Factory;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController_Factory;
import org.betup.ui.fragment.home.controller.HomeVideoBonusRefreshGate;
import org.betup.ui.fragment.home.controller.TrackedOverlayDismissRegistry;
import org.betup.ui.fragment.login.AuthFragment;
import org.betup.ui.fragment.login.AuthFragment_MembersInjector;
import org.betup.ui.fragment.login.LoginFragment;
import org.betup.ui.fragment.login.LoginFragment_MembersInjector;
import org.betup.ui.fragment.login.controller.AuthController;
import org.betup.ui.fragment.login.controller.AuthController_Factory;
import org.betup.ui.fragment.login.controller.AuthController_MembersInjector;
import org.betup.ui.fragment.matches.LeaguesByDateController;
import org.betup.ui.fragment.matches.LeaguesByDateController_Factory;
import org.betup.ui.fragment.matches.LeaguesByDateController_MembersInjector;
import org.betup.ui.fragment.matches.LeaguesByDateFragment;
import org.betup.ui.fragment.matches.LeaguesByDateFragment_MembersInjector;
import org.betup.ui.fragment.matches.LeaguesController;
import org.betup.ui.fragment.matches.LeaguesController_MembersInjector;
import org.betup.ui.fragment.matches.LeaguesFragment;
import org.betup.ui.fragment.matches.LeaguesFragment_MembersInjector;
import org.betup.ui.fragment.matches.MatchesByDateFragment;
import org.betup.ui.fragment.matches.MatchesByDateFragment_MembersInjector;
import org.betup.ui.fragment.matches.MatchesController;
import org.betup.ui.fragment.matches.MatchesController_MembersInjector;
import org.betup.ui.fragment.matches.MatchesTabsFragment;
import org.betup.ui.fragment.matches.MatchesTabsFragment_MembersInjector;
import org.betup.ui.fragment.matches.SpecificChampionshipFragment;
import org.betup.ui.fragment.matches.SpecificChampionshipFragment_MembersInjector;
import org.betup.ui.fragment.matches.SportsByDateController;
import org.betup.ui.fragment.matches.SportsByDateController_Factory;
import org.betup.ui.fragment.matches.SportsByDateController_MembersInjector;
import org.betup.ui.fragment.matches.SportsByDateFragment;
import org.betup.ui.fragment.matches.SportsByDateFragment_MembersInjector;
import org.betup.ui.fragment.matches.TeamsController;
import org.betup.ui.fragment.matches.TeamsController_MembersInjector;
import org.betup.ui.fragment.matches.TopMatchesFragment;
import org.betup.ui.fragment.matches.TopMatchesFragment_MembersInjector;
import org.betup.ui.fragment.matches.TopMatchesTabFragment;
import org.betup.ui.fragment.matches.TopMatchesTabFragment_MembersInjector;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.MatchDetailsController_MembersInjector;
import org.betup.ui.fragment.matches.details.MatchDetailsFragmentK;
import org.betup.ui.fragment.matches.details.MatchDetailsFragmentK_MembersInjector;
import org.betup.ui.fragment.matches.details.TeamDetailsController;
import org.betup.ui.fragment.matches.details.TeamDetailsController_MembersInjector;
import org.betup.ui.fragment.matches.details.TeamDetailsFragment;
import org.betup.ui.fragment.matches.details.TeamDetailsFragment_MembersInjector;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.notifications.NotificationsFragment;
import org.betup.ui.fragment.notifications.NotificationsFragment_MembersInjector;
import org.betup.ui.fragment.notifications.controller.NotificationsController;
import org.betup.ui.fragment.notifications.controller.NotificationsController_Factory;
import org.betup.ui.fragment.notifications.controller.NotificationsController_MembersInjector;
import org.betup.ui.fragment.search.NewSearchFragment;
import org.betup.ui.fragment.search.NewSearchFragment_MembersInjector;
import org.betup.ui.fragment.search.SearchBottomSheetFragment;
import org.betup.ui.fragment.search.SearchBottomSheetFragment_MembersInjector;
import org.betup.ui.fragment.search.controller.SearchController;
import org.betup.ui.fragment.search.controller.SearchController_MembersInjector;
import org.betup.ui.fragment.settings.NewSettingsFragment;
import org.betup.ui.fragment.settings.NewSettingsFragment_MembersInjector;
import org.betup.ui.fragment.settings.controller.SettingsController;
import org.betup.ui.fragment.settings.controller.SettingsController_MembersInjector;
import org.betup.ui.fragment.settings.subscriptions.AllSubscriptionsFragment;
import org.betup.ui.fragment.settings.subscriptions.AllSubscriptionsFragment_MembersInjector;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController;
import org.betup.ui.fragment.settings.subscriptions.controller.AllSubscriptionsController_MembersInjector;
import org.betup.ui.fragment.shop.ShopBetcoinsFragmentK;
import org.betup.ui.fragment.shop.ShopBetcoinsFragmentK_MembersInjector;
import org.betup.ui.fragment.shop.promo.PromoFragment;
import org.betup.ui.fragment.shop.promo.PromoFragment_MembersInjector;
import org.betup.ui.fragment.support.SupportFragmentK;
import org.betup.ui.fragment.support.SupportFragmentK_MembersInjector;
import org.betup.ui.fragment.support.controller.SupportController;
import org.betup.ui.fragment.support.controller.SupportController_Factory;
import org.betup.ui.fragment.support.controller.SupportController_MembersInjector;
import org.betup.ui.fragment.user.FollowersDialogController;
import org.betup.ui.fragment.user.FollowersDialogController_MembersInjector;
import org.betup.ui.fragment.user.ForeignUserDetailsController;
import org.betup.ui.fragment.user.ForeignUserDetailsController_Factory;
import org.betup.ui.fragment.user.ForeignUserDetailsController_MembersInjector;
import org.betup.ui.fragment.user.ForeignUserDetailsFragmentK;
import org.betup.ui.fragment.user.ForeignUserDetailsFragmentK_MembersInjector;
import org.betup.ui.fragment.user.UserBattlesFragment;
import org.betup.ui.fragment.user.UserBattlesFragment_MembersInjector;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.UserDetailsController_MembersInjector;
import org.betup.ui.fragment.user.UserDetailsFragmentK;
import org.betup.ui.fragment.user.UserDetailsFragmentK_MembersInjector;
import org.betup.ui.fragment.user.UserRankingsFragment;
import org.betup.ui.fragment.user.UserRankingsFragment_MembersInjector;
import org.betup.ui.fragment.user.controller.UserBattlesController;
import org.betup.ui.fragment.user.controller.UserBattlesController_Factory;
import org.betup.ui.fragment.user.controller.UserBattlesController_MembersInjector;
import org.betup.ui.fragment.user.controller.UserRankingsController;
import org.betup.ui.fragment.user.controller.UserRankingsController_Factory;
import org.betup.ui.fragment.user.controller.UserRankingsController_MembersInjector;
import org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment;
import org.betup.ui.fragment.wheeloffortune.WheelOfFortuneFragment_MembersInjector;
import org.betup.ui.fragment.wheeloffortune.controller.WheelOfFortuneRewardController;
import org.betup.ui.fragment.wheeloffortune.controller.WheelOfFortuneRewardController_Factory;
import org.betup.ui.splash.SplashActivity;
import org.betup.ui.splash.SplashActivity_MembersInjector;
import org.betup.ui.splash.load.DefaultLoader;
import org.betup.ui.splash.load.DefaultLoader_MembersInjector;
import org.betup.ui.tour.IntroActivity;
import org.betup.ui.tour.IntroChallengeActivity;
import org.betup.ui.tour.IntroChallengeActivity_MembersInjector;
import org.betup.ui.tour.IntroQuizActivity;
import org.betup.ui.tour.IntroQuizActivity_MembersInjector;
import org.betup.ui.tour.controller.TourFavoriteSportsController;
import org.betup.utils.balance.BalanceHolder;
import org.betup.utils.balance.BalanceHolder_Factory;

/* loaded from: classes2.dex */
public final class DaggerAppComponent implements AppComponent {
    private Provider<ABTestService> aBTestServiceProvider;
    private Provider<AdUnitRegistry> adUnitRegistryProvider;
    private Provider<AddEventInteractor> addEventInteractorProvider;
    private Provider<AdsConsentManager> adsConsentManagerProvider;
    private Provider<AdsInitializer> adsInitializerProvider;
    private AppModule appModule;
    private Provider<BalanceHolder> balanceHolderProvider;
    private Provider<BetStatInteractor> betStatInteractorProvider;
    private Provider<BetsListInteractor> betsListInteractorProvider;
    private Provider<BillingClientProvider> billingClientProvider;
    private Provider<BillingService> billingServiceProvider;
    private Provider<CancelAccountDeletionRequestInteractor> cancelAccountDeletionRequestInteractorProvider;
    private Provider<CasinoService> casinoServiceProvider;
    private Provider<ChangeV7CountryInteractor> changeV7CountryInteractorProvider;
    private Provider<ChangeV7NameInteractor> changeV7NameInteractorProvider;
    private Provider<ChangeV7ProfilePhotoInteractor> changeV7ProfilePhotoInteractorProvider;
    private Provider<ClaimDailyQuestInteractor> claimDailyQuestInteractorProvider;
    private Provider<CloseSupportChatInteractor> closeSupportChatInteractorProvider;
    private Provider<CompleteLuckyCellsGameInteractor> completeLuckyCellsGameInteractorProvider;
    private Provider<ContinueHighLowGameInteractor> continueHighLowGameInteractorProvider;
    private Provider<ContinueLuckyCellsGameInteractor> continueLuckyCellsGameInteractorProvider;
    private Provider<ContinueWarGameInteractor> continueWarGameInteractorProvider;
    private Provider<CreateSupportChatInteractor> createSupportChatInteractorProvider;
    private Provider<DefaultAppLanguageObserver> defaultAppLanguageObserverProvider;
    private Provider<DefaultSubscriptionService> defaultSubscriptionServiceProvider;
    private Provider<FinishDoubleGameInteractor> finishDoubleGameInteractorProvider;
    private Provider<GetActivePresentationsInteractor> getActivePresentationsInteractorProvider;
    private Provider<GetChatsInteractor> getChatsInteractorProvider;
    private Provider<GetConfigDoubleGameInteractor> getConfigDoubleGameInteractorProvider;
    private Provider<GetConfigLuckyCellsGameInteractor> getConfigLuckyCellsGameInteractorProvider;
    private Provider<GetDailyQuestsInteractor> getDailyQuestsInteractorProvider;
    private Provider<GetDeleteAccountInfoInteractor> getDeleteAccountInfoInteractorProvider;
    private Provider<GetDiceGameConfigInteractor> getDiceGameConfigInteractorProvider;
    private Provider<GetEligibleRewardedPromptsInteractor> getEligibleRewardedPromptsInteractorProvider;
    private Provider<GetHistoryDoubleGameInteractor> getHistoryDoubleGameInteractorProvider;
    private Provider<GetInterstitialCampaignInteractor> getInterstitialCampaignInteractorProvider;
    private GetNewEventsCountInteractorByUUID_Factory getNewEventsCountInteractorByUUIDProvider;
    private Provider<GetNewEventsCountInteractor> getNewEventsCountInteractorProvider;
    private Provider<GetOffersInfoInteractor> getOffersInfoInteractorProvider;
    private Provider<GetParticipationInteractor> getParticipationInteractorProvider;
    private Provider<GetPresentationScreenRegistryInteractor> getPresentationScreenRegistryInteractorProvider;
    private Provider<GetPrivateMessagesInteractor> getPrivateMessagesInteractorProvider;
    private Provider<GetPromoBannerForMatchInteractor> getPromoBannerForMatchInteractorProvider;
    private Provider<GetPromoInterstitialSettingsInteractor> getPromoInterstitialSettingsInteractorProvider;
    private Provider<GetPublicChatMessagesInteractor> getPublicChatMessagesInteractorProvider;
    private Provider<GetRewardedPromptCampaignInteractor> getRewardedPromptCampaignInteractorProvider;
    private Provider<GetSignatureForOfferInteractor> getSignatureForOfferInteractorProvider;
    private Provider<GetSignedPendingOfferInteractor> getSignedPendingOfferInteractorProvider;
    private Provider<GetSingleOfferInfoInteractor> getSingleOfferInfoInteractorProvider;
    private Provider<GetSupportCategoriesInteractor> getSupportCategoriesInteractorProvider;
    private Provider<GetSupportChatInteractor> getSupportChatInteractorProvider;
    private Provider<GetSupportChatMessagesInteractor> getSupportChatMessagesInteractorProvider;
    private Provider<GetSupportChatsInteractor> getSupportChatsInteractorProvider;
    private Provider<GetTeamDetailsInteractor> getTeamDetailsInteractorProvider;
    private Provider<GetUserMessagesInteractor> getUserMessagesInteractorProvider;
    private Provider<GetUserTagSlugsInteractor> getUserTagSlugsInteractorProvider;
    private Provider<GetV7CountriesInteractor> getV7CountriesInteractorProvider;
    private Provider<GetV7FAQInteractor> getV7FAQInteractorProvider;
    private Provider<GetV7MatchSubscriptionInteractor> getV7MatchSubscriptionInteractorProvider;
    private Provider<GetV7MyInfoInteractor> getV7MyInfoInteractorProvider;
    private Provider<GetV7SupportInfoInteractor> getV7SupportInfoInteractorProvider;
    private Provider<GetV7SupportMessagesInteractor> getV7SupportMessagesInteractorProvider;
    private Provider<GetVideoRewardForPlacementStateInteractor> getVideoRewardForPlacementStateInteractorProvider;
    private Provider<GetWarGameConfigInteractor> getWarGameConfigInteractorProvider;
    private Provider<GiveWheelOfFortuneRewardInteractor> giveWheelOfFortuneRewardInteractorProvider;
    private Provider<GoogleInterstitialAdController> googleInterstitialAdControllerProvider;
    private Provider<GoogleRewardedAdController> googleRewardedAdControllerProvider;
    private Provider<HigherLowerGameConfigInteractor> higherLowerGameConfigInteractorProvider;
    private Provider<HomeDailyQuestController> homeDailyQuestControllerProvider;
    private Provider<HomeVideoBonusController> homeVideoBonusControllerProvider;
    private Provider<HotMatchesInteractor> hotMatchesInteractorProvider;
    private Provider<InterstitialAdCoordinator> interstitialAdCoordinatorProvider;
    private Provider<LeaguesByDateInteractor> leaguesByDateInteractorProvider;
    private Provider<LoadEventsInteractor> loadEventsInteractorProvider;
    private Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private Provider<MatchMyBetsInteractor> matchMyBetsInteractorProvider;
    private Provider<MatchQuizParticipationInteractor> matchQuizParticipationInteractorProvider;
    private Provider<MatchesByDateInteractor> matchesByDateInteractorProvider;
    private Provider<MobileAdsInitializer> mobileAdsInitializerProvider;
    private Provider<ServiceModule_ContributeMyFirebaseMessagingService.MyFirebaseMessagingServiceSubcomponent.Builder> myFirebaseMessagingServiceSubcomponentBuilderProvider;
    private Provider<MyProgressInteractor> myProgressInteractorProvider;
    private Provider<NewLeagueMatchesInteractor> newLeagueMatchesInteractorProvider;
    private Provider<NewLeaguesInteractor> newLeaguesInteractorProvider;
    private Provider<NewLoginInteractor> newLoginInteractorProvider;
    private Provider<NewSingleShopInteractor> newSingleShopInteractorProvider;
    private Provider<NewSpecificChampionshipInteractor> newSpecificChampionshipInteractorProvider;
    private Provider<NewTeamsInteractor> newTeamsInteractorProvider;
    private Provider<NewUserAvailableChallengesInteractor> newUserAvailableChallengesInteractorProvider;
    private Provider<NewUserBattleActionCountsInteractor> newUserBattleActionCountsInteractorProvider;
    private Provider<NewUserBattleCountsInteractor> newUserBattleCountsInteractorProvider;
    private Provider<NewUserChallengesHistoryInteractor> newUserChallengesHistoryInteractorProvider;
    private Provider<NewUserPrivateChallengesInteractor> newUserPrivateChallengesInteractorProvider;
    private Provider<PostFullOfferSignatureInteractor> postFullOfferSignatureInteractorProvider;
    private Provider<PostInterstitialActionInteractor> postInterstitialActionInteractorProvider;
    private Provider<PostPresentationActionInteractor> postPresentationActionInteractorProvider;
    private Provider<PostRewardedPromptActionInteractor> postRewardedPromptActionInteractorProvider;
    private Provider<PostTrackEventInteractor> postTrackEventInteractorProvider;
    private Provider<PostTrackPurchaseInteractor> postTrackPurchaseInteractorProvider;
    private Provider<PreferencesProvider> preferencesProvider;
    private Provider<PresentationCoordinator> presentationCoordinatorProvider;
    private Provider<PresentationScreenRegistryStore> presentationScreenRegistryStoreProvider;
    private Provider<PresentationScreens> presentationScreensProvider;
    private Provider<PromoInterstitialRulesSync> promoInterstitialRulesSyncProvider;
    private Provider<PromoInterstitialSettingsService> promoInterstitialSettingsServiceProvider;
    private Provider<PromoService> promoServiceProvider;
    private Provider<AllSubscriptionsController> provideAllSubscriptionsControllerProvider;
    private Provider<AnalyticsService> provideAnalyticsServiceProvider;
    private Provider<AppLanguageObserver> provideAppLanguageObserverProvider;
    private Provider<BetListAppender> provideBetListAppenderProvider;
    private Provider<BetValidator> provideBetValidatorProvider;
    private Provider<BetsPlacedController> provideBetsPlacedControllerProvider;
    private Provider<CancelBetInteractor> provideCancelBetInteractorProvider;
    private Provider<ChallengeTourInfoProvider> provideChallengeTourInfoProvider;
    private Provider<Context> provideContextProvider;
    private Provider<DailyBonusController> provideDailyBonusControllerProvider;
    private Provider<AppDatabase> provideDatabaseProvider;
    private Provider<DateFilterState> provideDateFilterStateProvider;
    private Provider<DeleteAllV7SubscriptionsInteractor> provideDeleteAllV7SubscriptionsInteractorProvider;
    private Provider<DeleteFavoriteLeaguesInteractor> provideDeleteFavoriteLeaguesInteractorProvider;
    private Provider<DeleteFavoriteSportsInteractor> provideDeleteFavoriteSportsInteractorProvider;
    private Provider<DeleteFavoriteTeamsInteractor> provideDeleteFavoriteTeamsInteractorProvider;
    private Provider<DeleteV7AllMatchSubscriptionsInteractor> provideDeleteV7AllMatchSubscriptionsInteractorProvider;
    private Provider<DeleteV7MatchSubscriptionInteractor> provideDeleteV7MatchSubscriptionInteractorProvider;
    private Provider<FirebaseAuth> provideFirebaseAuthProvider;
    private Provider<FirebaseRemoteConfig> provideFirebaseRemoteConfigProvider;
    private Provider<NavigationService<NavigateMessage.TargetGame>> provideGamesNavigationControllerProvider;
    private Provider<GetAllV7SubscriptionsInteractor> provideGetAllV7SubscriptionsInteractorProvider;
    private Provider<GetBetShareInstallLinkInteractor> provideGetBetShareInstallLinkInteractorProvider;
    private Provider<GetCancelBetInfoInteractor> provideGetCancelBetInfoInteractorProvider;
    private Provider<GetFavoriteTeamIdsInteractor> provideGetFavoriteTeamIdsInteractorProvider;
    private Provider<GetFlashBetCategoriesInteractor> provideGetFlashBetCategoriesInteractorProvider;
    private Provider<GetFlashBetSessionInteractor> provideGetFlashBetSessionInteractorProvider;
    private Provider<GetFlashBetSportsInteractor> provideGetFlashBetSportsInteractorProvider;
    private Provider<GetFlashBetStatsInteractor> provideGetFlashBetStatsInteractorProvider;
    private Provider<GetPendingFlashBetSessionInteractor> provideGetPendingFlashBetSessionInteractorProvider;
    private Provider<GetRandomTeamImagesInteractor> provideGetRandomTeamImagesInteractorProvider;
    private Provider<GetSellBetInfoInteractor> provideGetSellBetInfoInteractorProvider;
    private Provider<HomeVideoBonusRefreshGate> provideHomeVideoBonusRefreshGateProvider;
    private Provider<InterstitialAdController> provideInterstitialAdControllerProvider;
    private Provider<LeaguesController> provideLeaguesControllerProvider;
    private Provider<LeaveFlashBetSessionInteractor> provideLeaveFlashBetSessionInteractorProvider;
    private Provider<LocaleService> provideLocaleServiceProvider;
    private Provider<MatchFilterState> provideMatchFilterStateProvider;
    private Provider<MatchInfoInteractor> provideMatchInfoInteractorProvider;
    private Provider<MatchShortInfoInteractor> provideMatchShortInfoInteractorProvider;
    private Provider<MatchVarietiesInteractor> provideMatchVarietiesInteractorProvider;
    private Provider<MatchesController> provideMatchesControllerProvider;
    private Provider<ChatService> provideMessagingControllerProvider;
    private Provider<NavigationService<NavigateMessage.Target>> provideNavigationControllerProvider;
    private Provider<NewActiveCompetitionsInteractor> provideNewActiveCompetitionsInteractorProvider;
    private Provider<BetsController> provideNewBetSlipControllerProvider;
    private Provider<NewCompetitionsHistoryInteractor> provideNewCompetitionsHistoryInteractorProvider;
    private Provider<NewShopItemsInteractor> provideNewShopItemsInteractorProvider;
    private Provider<NewSportsInteractor> provideNewSportsInteractorProvider;
    private Provider<PlaceBetInteractor> providePlaceBetInteractorProvider;
    private Provider<PushStorageProvider> providePushStorageProvider;
    private Provider<PutFavoriteLeaguesBulkInteractor> providePutFavoriteLeaguesBulkInteractorProvider;
    private Provider<PutFavoriteLeaguesInteractor> providePutFavoriteLeaguesInteractorProvider;
    private Provider<PutFavoriteSportsBulkInteractor> providePutFavoriteSportsBulkInteractorProvider;
    private Provider<PutFavoriteSportsInteractor> providePutFavoriteSportsInteractorProvider;
    private Provider<PutFavoriteTeamsBulkInteractor> providePutFavoriteTeamsBulkInteractorProvider;
    private Provider<PutFavoriteTeamsInteractor> providePutFavoriteTeamsInteractorProvider;
    private Provider<QuizTourInfoProvider> provideQuizTourInfoProvider;
    private Provider<RewardedAdController> provideRewardedAdControllerProvider;
    private Provider<SearchController> provideSearchControllerProvider;
    private Provider<SellBetInteractor> provideSellBetInteractorProvider;
    private Provider<SettingsController> provideSettingsControllerProvider;
    private Provider<ShopEntitlementClaimInteractor> provideShopEntitlementClaimInteractorProvider;
    private Provider<ShopLayoutInteractor> provideShopLayoutInteractorProvider;
    private Provider<StartFlashBetGameInteractor> provideStartFlashBetGameInteractorProvider;
    private Provider<SubmitFlashBetAnswerInteractor> provideSubmitFlashBetAnswerInteractorProvider;
    private Provider<TourFavoriteSportsController> provideTourFavoriteSportsControllerProvider;
    private Provider<TrackedOverlayDismissRegistry> provideTrackedOverlayDismissRegistryProvider;
    private Provider<UpdateV7PushPreferencesInteractor> provideUpdateV7PushPreferencesInteractorProvider;
    private Provider<UpgradeLoginInteractor> provideUpgradeLoginInteractorProvider;
    private Provider<V7BalanceHistoryInteractor> provideV7BalanceHistoryInteractorProvider;
    private Provider<V7CasinoAuthInteractor> provideV7CasinoAuthInteractorProvider;
    private Provider<V7CreateBetlistInteractor> provideV7CreateBetlistInteractorProvider;
    private Provider<V7DailyBonusInteractor> provideV7DailyBonusInteractorProvider;
    private Provider<V7GetCustomTokenInteractor> provideV7GetCustomTokenInteractorProvider;
    private Provider<V7GetServerInfoInteractor> provideV7GetServerInfoInteractorProvider;
    private Provider<V7GrabbedBetsInteractor> provideV7GrabbedBetsInteractorProvider;
    private Provider<V7MakeSubscriptionPurchaseInteractor> provideV7MakeSubscriptionPurchaseInteractorProvider;
    private Provider<V7MatchHistoryInteractor> provideV7MatchHistoryInteractorProvider;
    private Provider<V7MatchStatisticsInteractor> provideV7MatchStatisticsInteractorProvider;
    private Provider<V7OneClickBetSettingsInteractor> provideV7OneClickBetSettingsInteractorProvider;
    private Provider<V7ReferralInteractor> provideV7ReferralInteractorProvider;
    private Provider<V7TourMarketingRewardsInteractor> provideV7TourMarketingRewardsInteractorProvider;
    private Provider<V7UpdateAppVersionInteractor> provideV7UpdateAppVersionInteractorProvider;
    private Provider<V7UpdatePushTokenAndLangInteractor> provideV7UpdatePushTokenAndLangInteractorProvider;
    private Provider<V7UpdateTimezoneInteractor> provideV7UpdateTimezoneInteractorProvider;
    private Provider<V7UpdateTutorialCompleteInteractor> provideV7UpdateTutorialCompleteInteractorProvider;
    private Provider<V7VarietyBetRestrictionsInteractor> provideV7VarietyBetRestrictionsInteractorProvider;
    private Provider<V7VarietyVersionGatesInteractor> provideV7VarietyVersionGatesInteractorProvider;
    private Provider<PushTokenService> pushTokenServiceProvider;
    private Provider<QuizAvailabilityInteractor> quizAvailabilityInteractorProvider;
    private Provider<QuizDetailsInteractor> quizDetailsInteractorProvider;
    private Provider<QuizParticipationInteractor> quizParticipationInteractorProvider;
    private Provider<QuizParticipationsInteractor> quizParticipationsInteractorProvider;
    private Provider<QuizStateCountInteractor> quizStateCountInteractorProvider;
    private Provider<QuizTiersInteractor> quizTiersInteractorProvider;
    private Provider<ReadAllEventsInteractor> readAllEventsInteractorProvider;
    private Provider<ReadEventInteractor> readEventInteractorProvider;
    private Provider<RecentSearchesService> recentSearchesServiceProvider;
    private Provider<RedeemVideoRewardForPlacementInteractor> redeemVideoRewardForPlacementInteractorProvider;
    private Provider<ReportDailyQuestClientEventInteractor> reportDailyQuestClientEventInteractorProvider;
    private Provider<RewardedVideoOfferCoordinator> rewardedVideoOfferCoordinatorProvider;
    private Provider<ScreenTracker> screenTrackerProvider;
    private Provider<SendDeleteAccountInteractor> sendDeleteAccountInteractorProvider;
    private Provider<SendDiceGameResultInteractor> sendDiceGameResultInteractorProvider;
    private Provider<SendPrivateMessasgesInteractor> sendPrivateMessasgesInteractorProvider;
    private Provider<SendPublicChatMessageInteractor> sendPublicChatMessageInteractorProvider;
    private Provider<SendSupportChatMessageInteractor> sendSupportChatMessageInteractorProvider;
    private Provider<SendV7ReportInteractor> sendV7ReportInteractorProvider;
    private Provider<SendV7SupportMessageInteractor> sendV7SupportMessageInteractorProvider;
    private Provider<ServerErrorsProcessor> serverErrorsProcessorProvider;
    private Provider<ShopPurchaseInteractor> shopPurchaseInteractorProvider;
    private Provider<SingleBetInteractor> singleBetInteractorProvider;
    private Provider<SocialConnectionService> socialConnectionServiceProvider;
    private Provider<SportsByDateInteractor> sportsByDateInteractorProvider;
    private Provider<StartDoubleGameInteractor> startDoubleGameInteractorProvider;
    private Provider<StartHighLowGameInteractor> startHighLowGameInteractorProvider;
    private Provider<StartLuckyCellsGameInteractor> startLuckyCellsGameInteractorProvider;
    private Provider<StartWarGameInteractor> startWarGameInteractorProvider;
    private Provider<SubscoreService> subscoreServiceProvider;
    private Provider<UnlockOneClickBetInteractor> unlockOneClickBetInteractorProvider;
    private Provider<UpdateV7MatchSubscriptionInteractor> updateV7MatchSubscriptionInteractorProvider;
    private Provider<UserAnalyticsTagsService> userAnalyticsTagsServiceProvider;
    private Provider<UserProfileStatisticsInteractor> userProfileStatisticsInteractorProvider;
    private Provider<UserService> userServiceProvider;
    private Provider<V7RanksByTypeInteractor> v7RanksByTypeInteractorProvider;
    private Provider<V7SearchLeaguesInteractor> v7SearchLeaguesInteractorProvider;
    private Provider<V7SearchMatchesInteractor> v7SearchMatchesInteractorProvider;
    private Provider<V7SearchTeamsInteractor> v7SearchTeamsInteractorProvider;
    private Provider<V7SearchUsersInteractor> v7SearchUsersInteractorProvider;
    private Provider<V7StatsByVarietiesInteractor> v7StatsByVarietiesInteractorProvider;
    private Provider<V7TrendingItemsInteractor> v7TrendingItemsInteractorProvider;
    private Provider<V7UserAchievementsInteractor> v7UserAchievementsInteractorProvider;
    private Provider<V7UserBetStatisticsInteractor> v7UserBetStatisticsInteractorProvider;
    private Provider<V7UserFavouritesInteractor> v7UserFavouritesInteractorProvider;
    private Provider<V7UserFollowActionInteractor> v7UserFollowActionInteractorProvider;
    private Provider<V7UserFollowersInteractor> v7UserFollowersInteractorProvider;
    private Provider<V7UserFollowingInteractor> v7UserFollowingInteractorProvider;
    private Provider<V7UserInfoInteractor> v7UserInfoInteractorProvider;
    private Provider<V7UserRankingStatisticsInteractor> v7UserRankingStatisticsInteractorProvider;
    private Provider<V7UserRanksInteractor> v7UserRanksInteractorProvider;
    private Provider<VideoRewardService> videoRewardServiceProvider;
    private Provider<WebGameSessionCodeInteractor> webGameSessionCodeInteractorProvider;
    private Provider<WebGamesListInteractor> webGamesListInteractorProvider;
    private Provider<WheelOfFortuneRewardController> wheelOfFortuneRewardControllerProvider;

    @Override // org.betup.injection.component.AppComponent
    public void inject(FirebaseMessagingService firebaseMessagingService) {
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(PlaceBetInteractor placeBetInteractor) {
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FullscreenXZoneActivity fullscreenXZoneActivity) {
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ChangeLanguageDialog changeLanguageDialog) {
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MatchFilterState matchFilterState) {
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(IntroActivity introActivity) {
    }

    private DaggerAppComponent(Builder builder) {
        initialize(builder);
        initialize2(builder);
        initialize3(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetOffersListInteractor getGetOffersListInteractor() {
        return new GetOffersListInteractor(this.provideContextProvider.get());
    }

    private SportsByDateController getSportsByDateController() {
        return injectSportsByDateController(SportsByDateController_Factory.newSportsByDateController());
    }

    private LeaguesByDateController getLeaguesByDateController() {
        return injectLeaguesByDateController(LeaguesByDateController_Factory.newLeaguesByDateController());
    }

    private ForeignUserDetailsController getForeignUserDetailsController() {
        return injectForeignUserDetailsController(ForeignUserDetailsController_Factory.newForeignUserDetailsController());
    }

    private UserBattlesController getUserBattlesController() {
        return injectUserBattlesController(UserBattlesController_Factory.newUserBattlesController());
    }

    private UserRankingsController getUserRankingsController() {
        return injectUserRankingsController(UserRankingsController_Factory.newUserRankingsController());
    }

    private CompetitionDetailsInteractor getCompetitionDetailsInteractor() {
        return new CompetitionDetailsInteractor(this.provideContextProvider.get());
    }

    private CompetitionDetailsWithParticipantInteractor getCompetitionDetailsWithParticipantInteractor() {
        return new CompetitionDetailsWithParticipantInteractor(this.provideContextProvider.get());
    }

    private CompetitionDetailsController getCompetitionDetailsController() {
        return injectCompetitionDetailsController(CompetitionDetailsController_Factory.newCompetitionDetailsController(this.provideContextProvider.get()));
    }

    private AuthController getAuthController() {
        return injectAuthController(AuthController_Factory.newAuthController(this.provideContextProvider.get()));
    }

    private NotificationsController getNotificationsController() {
        return injectNotificationsController(NotificationsController_Factory.newNotificationsController());
    }

    private Map<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>> getMapOfClassOfAndProviderOfFactoryOf() {
        return ImmutableMap.of(MyFirebaseMessagingService.class, this.myFirebaseMessagingServiceSubcomponentBuilderProvider);
    }

    private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
        return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(getMapOfClassOfAndProviderOfFactoryOf());
    }

    private NewChallengeCreateInteractor getNewChallengeCreateInteractor() {
        return new NewChallengeCreateInteractor(this.provideContextProvider.get());
    }

    private NewChallengesInteractor getNewChallengesInteractor() {
        return new NewChallengesInteractor(this.provideContextProvider.get());
    }

    private CompetitionHistoryCountInteractor getCompetitionHistoryCountInteractor() {
        return new CompetitionHistoryCountInteractor(this.provideContextProvider.get());
    }

    private SupportController getSupportController() {
        return injectSupportController(SupportController_Factory.newSupportController());
    }

    private QuizResultsController getQuizResultsController() {
        return injectQuizResultsController(QuizResultsController_Factory.newQuizResultsController());
    }

    private SportsSelectionController getSportsSelectionController() {
        return injectSportsSelectionController(SportsSelectionController_Factory.newSportsSelectionController());
    }

    private LeagueSelectionController getLeagueSelectionController() {
        return injectLeagueSelectionController(LeagueSelectionController_Factory.newLeagueSelectionController());
    }

    private MatchSelectionController getMatchSelectionController() {
        return injectMatchSelectionController(MatchSelectionController_Factory.newMatchSelectionController());
    }

    private ChallengeAcceptInteractor getChallengeAcceptInteractor() {
        return new ChallengeAcceptInteractor(this.provideContextProvider.get());
    }

    private NewChallengeDetailsInteractor getNewChallengeDetailsInteractor() {
        return new NewChallengeDetailsInteractor(this.provideContextProvider.get());
    }

    private BetSelectionController getBetSelectionController() {
        return injectBetSelectionController(BetSelectionController_Factory.newBetSelectionController());
    }

    private ChallengeAcceptController getChallengeAcceptController() {
        return injectChallengeAcceptController(ChallengeAcceptController_Factory.newChallengeAcceptController());
    }

    private ChallengeCancelInteractor getChallengeCancelInteractor() {
        return new ChallengeCancelInteractor(this.provideContextProvider.get());
    }

    private ChallengePreviewController getChallengePreviewController() {
        return injectChallengePreviewController(ChallengePreviewController_Factory.newChallengePreviewController());
    }

    private FlashBetController getFlashBetController() {
        return new FlashBetController(this.provideGetFlashBetSportsInteractorProvider.get(), this.provideGetFlashBetStatsInteractorProvider.get(), this.provideGetPendingFlashBetSessionInteractorProvider.get());
    }

    private FlashBetCategoriesController getFlashBetCategoriesController() {
        return new FlashBetCategoriesController(this.provideGetFlashBetCategoriesInteractorProvider.get());
    }

    private FlashBetMatchStartController getFlashBetMatchStartController() {
        return new FlashBetMatchStartController(this.provideStartFlashBetGameInteractorProvider.get(), this.provideGetRandomTeamImagesInteractorProvider.get(), this.userServiceProvider.get());
    }

    private FlashBetGameController getFlashBetGameController() {
        return new FlashBetGameController(this.provideGetFlashBetSessionInteractorProvider.get(), this.provideSubmitFlashBetAnswerInteractorProvider.get(), this.provideLeaveFlashBetSessionInteractorProvider.get(), this.userServiceProvider.get());
    }

    private void initialize(final Builder builder) {
        this.provideFirebaseAuthProvider = DoubleCheck.provider(AppModule_ProvideFirebaseAuthFactory.create(builder.appModule));
        this.provideFirebaseRemoteConfigProvider = DoubleCheck.provider(AppModule_ProvideFirebaseRemoteConfigFactory.create(builder.appModule));
        Provider<Context> provider = DoubleCheck.provider(AppModule_ProvideContextFactory.create(builder.appModule));
        this.provideContextProvider = provider;
        Provider<PreferencesProvider> provider2 = DoubleCheck.provider(PreferencesProvider_Factory.create(provider));
        this.preferencesProvider = provider2;
        this.localPreferencesServiceProvider = DoubleCheck.provider(LocalPreferencesService_Factory.create(provider2));
        this.getV7MyInfoInteractorProvider = DoubleCheck.provider(GetV7MyInfoInteractor_Factory.create(this.provideContextProvider));
        this.myProgressInteractorProvider = DoubleCheck.provider(MyProgressInteractor_Factory.create(this.provideContextProvider));
        this.v7UserBetStatisticsInteractorProvider = DoubleCheck.provider(V7UserBetStatisticsInteractor_Factory.create(this.provideContextProvider));
        this.v7UserRanksInteractorProvider = DoubleCheck.provider(V7UserRanksInteractor_Factory.create(this.provideContextProvider));
        Provider<V7UserFavouritesInteractor> provider3 = DoubleCheck.provider(V7UserFavouritesInteractor_Factory.create(this.provideContextProvider));
        this.v7UserFavouritesInteractorProvider = provider3;
        this.userServiceProvider = DoubleCheck.provider(UserService_Factory.create(this.provideFirebaseAuthProvider, this.provideFirebaseRemoteConfigProvider, this.localPreferencesServiceProvider, this.getV7MyInfoInteractorProvider, this.myProgressInteractorProvider, this.v7UserBetStatisticsInteractorProvider, this.v7UserRanksInteractorProvider, provider3));
        Provider<AdsConsentManager> provider4 = DoubleCheck.provider(AdsConsentManager_Factory.create());
        this.adsConsentManagerProvider = provider4;
        this.googleRewardedAdControllerProvider = DoubleCheck.provider(GoogleRewardedAdController_Factory.create(provider4));
        this.provideRewardedAdControllerProvider = DoubleCheck.provider(AppModule_ProvideRewardedAdControllerFactory.create(builder.appModule, this.googleRewardedAdControllerProvider));
        this.googleInterstitialAdControllerProvider = DoubleCheck.provider(GoogleInterstitialAdController_Factory.create(this.adsConsentManagerProvider));
        this.provideInterstitialAdControllerProvider = DoubleCheck.provider(AppModule_ProvideInterstitialAdControllerFactory.create(builder.appModule, this.googleInterstitialAdControllerProvider));
        Provider<AdUnitRegistry> provider5 = DoubleCheck.provider(AdUnitRegistry_Factory.create(this.provideContextProvider));
        this.adUnitRegistryProvider = provider5;
        Provider<MobileAdsInitializer> provider6 = DoubleCheck.provider(MobileAdsInitializer_Factory.create(this.userServiceProvider, this.adsConsentManagerProvider, this.provideRewardedAdControllerProvider, this.provideInterstitialAdControllerProvider, provider5));
        this.mobileAdsInitializerProvider = provider6;
        this.adsInitializerProvider = DoubleCheck.provider(AdsInitializer_Factory.create(this.userServiceProvider, this.localPreferencesServiceProvider, provider6));
        Provider<GetUserTagSlugsInteractor> provider7 = DoubleCheck.provider(GetUserTagSlugsInteractor_Factory.create(this.provideContextProvider));
        this.getUserTagSlugsInteractorProvider = provider7;
        this.userAnalyticsTagsServiceProvider = DoubleCheck.provider(UserAnalyticsTagsService_Factory.create(provider7));
        Provider<GetPromoInterstitialSettingsInteractor> provider8 = DoubleCheck.provider(GetPromoInterstitialSettingsInteractor_Factory.create(this.provideContextProvider));
        this.getPromoInterstitialSettingsInteractorProvider = provider8;
        Provider<PromoInterstitialSettingsService> provider9 = DoubleCheck.provider(PromoInterstitialSettingsService_Factory.create(provider8));
        this.promoInterstitialSettingsServiceProvider = provider9;
        this.promoInterstitialRulesSyncProvider = DoubleCheck.provider(PromoInterstitialRulesSync_Factory.create(this.userAnalyticsTagsServiceProvider, provider9));
        this.promoServiceProvider = DoubleCheck.provider(PromoService_Factory.create(this.provideFirebaseRemoteConfigProvider, this.userServiceProvider));
        Provider<V7CasinoAuthInteractor> provider10 = DoubleCheck.provider(RestModule_ProvideV7CasinoAuthInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7CasinoAuthInteractorProvider = provider10;
        this.casinoServiceProvider = DoubleCheck.provider(CasinoService_Factory.create(provider10, this.userServiceProvider));
        this.provideV7ReferralInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7ReferralInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7GrabbedBetsInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7GrabbedBetsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideBetValidatorProvider = DoubleCheck.provider(AppModule_ProvideBetValidatorFactory.create(builder.appModule, this.provideContextProvider, this.provideV7GrabbedBetsInteractorProvider));
        this.provideBetListAppenderProvider = DoubleCheck.provider(AppModule_ProvideBetListAppenderFactory.create(builder.appModule, this.provideContextProvider, this.userServiceProvider, this.provideBetValidatorProvider, this.localPreferencesServiceProvider));
        this.provideNavigationControllerProvider = DoubleCheck.provider(AppModule_ProvideNavigationControllerFactory.create(builder.appModule, this.userServiceProvider, this.casinoServiceProvider));
        this.provideV7UpdateTutorialCompleteInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7UpdateTutorialCompleteInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7TourMarketingRewardsInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7TourMarketingRewardsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.billingClientProvider = DoubleCheck.provider(BillingClientProvider_Factory.create());
        this.shopPurchaseInteractorProvider = DoubleCheck.provider(ShopPurchaseInteractor_Factory.create(this.provideContextProvider));
        this.postFullOfferSignatureInteractorProvider = DoubleCheck.provider(PostFullOfferSignatureInteractor_Factory.create(this.provideContextProvider));
        this.provideV7BalanceHistoryInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7BalanceHistoryInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.getSignedPendingOfferInteractorProvider = DoubleCheck.provider(GetSignedPendingOfferInteractor_Factory.create(this.provideContextProvider));
        Provider<V7MakeSubscriptionPurchaseInteractor> provider11 = DoubleCheck.provider(RestModule_ProvideV7MakeSubscriptionPurchaseInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7MakeSubscriptionPurchaseInteractorProvider = provider11;
        this.billingServiceProvider = DoubleCheck.provider(BillingService_Factory.create(this.provideContextProvider, this.userServiceProvider, this.billingClientProvider, this.shopPurchaseInteractorProvider, this.postFullOfferSignatureInteractorProvider, this.provideV7BalanceHistoryInteractorProvider, this.getSignedPendingOfferInteractorProvider, provider11));
        this.provideMatchInfoInteractorProvider = DoubleCheck.provider(RestModule_ProvideMatchInfoInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7UpdateTimezoneInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7UpdateTimezoneInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.getUserMessagesInteractorProvider = DoubleCheck.provider(GetUserMessagesInteractor_Factory.create(this.provideContextProvider));
        this.provideMessagingControllerProvider = DoubleCheck.provider(AppModule_ProvideMessagingControllerFactory.create(builder.appModule, this.getUserMessagesInteractorProvider));
        Provider<AppDatabase> provider12 = DoubleCheck.provider(AppModule_ProvideDatabaseFactory.create(builder.appModule, this.provideContextProvider, this.userServiceProvider));
        this.provideDatabaseProvider = provider12;
        this.addEventInteractorProvider = DoubleCheck.provider(AddEventInteractor_Factory.create(this.provideContextProvider, provider12));
        this.getNewEventsCountInteractorProvider = DoubleCheck.provider(GetNewEventsCountInteractor_Factory.create(this.provideContextProvider, this.provideDatabaseProvider));
        this.readEventInteractorProvider = DoubleCheck.provider(ReadEventInteractor_Factory.create(this.provideContextProvider, this.provideDatabaseProvider));
        this.readAllEventsInteractorProvider = DoubleCheck.provider(ReadAllEventsInteractor_Factory.create(this.provideContextProvider, this.provideDatabaseProvider));
        this.getNewEventsCountInteractorByUUIDProvider = GetNewEventsCountInteractorByUUID_Factory.create(this.provideContextProvider, this.provideDatabaseProvider);
        this.providePushStorageProvider = DoubleCheck.provider(AppModule_ProvidePushStorageProviderFactory.create(builder.appModule, this.provideContextProvider, this.addEventInteractorProvider, this.getNewEventsCountInteractorProvider, this.readEventInteractorProvider, this.readAllEventsInteractorProvider, this.getNewEventsCountInteractorByUUIDProvider));
        Provider<V7UpdatePushTokenAndLangInteractor> provider13 = DoubleCheck.provider(RestModule_ProvideV7UpdatePushTokenAndLangInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7UpdatePushTokenAndLangInteractorProvider = provider13;
        this.pushTokenServiceProvider = DoubleCheck.provider(PushTokenService_Factory.create(provider13, this.userServiceProvider));
        this.newSingleShopInteractorProvider = DoubleCheck.provider(NewSingleShopInteractor_Factory.create(this.provideContextProvider));
        this.provideV7UpdateAppVersionInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7UpdateAppVersionInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.postTrackEventInteractorProvider = DoubleCheck.provider(PostTrackEventInteractor_Factory.create(this.provideContextProvider));
        this.postTrackPurchaseInteractorProvider = DoubleCheck.provider(PostTrackPurchaseInteractor_Factory.create(this.provideContextProvider));
        Provider<AnalyticsService> provider14 = DoubleCheck.provider(AppModule_ProvideAnalyticsServiceFactory.create(builder.appModule, this.postTrackEventInteractorProvider, this.postTrackPurchaseInteractorProvider));
        this.provideAnalyticsServiceProvider = provider14;
        this.serverErrorsProcessorProvider = DoubleCheck.provider(ServerErrorsProcessor_Factory.create(provider14));
        Provider<V7GetCustomTokenInteractor> provider15 = DoubleCheck.provider(RestModule_ProvideV7GetCustomTokenInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7GetCustomTokenInteractorProvider = provider15;
        this.socialConnectionServiceProvider = DoubleCheck.provider(SocialConnectionService_Factory.create(this.provideContextProvider, this.provideFirebaseAuthProvider, this.userServiceProvider, this.provideMatchInfoInteractorProvider, this.provideBetListAppenderProvider, provider15));
        this.getVideoRewardForPlacementStateInteractorProvider = DoubleCheck.provider(GetVideoRewardForPlacementStateInteractor_Factory.create(this.provideContextProvider));
        Provider<RedeemVideoRewardForPlacementInteractor> provider16 = DoubleCheck.provider(RedeemVideoRewardForPlacementInteractor_Factory.create(this.provideContextProvider));
        this.redeemVideoRewardForPlacementInteractorProvider = provider16;
        this.videoRewardServiceProvider = DoubleCheck.provider(VideoRewardService_Factory.create(this.userServiceProvider, this.getVideoRewardForPlacementStateInteractorProvider, provider16, this.provideRewardedAdControllerProvider, this.adUnitRegistryProvider));
        this.aBTestServiceProvider = DoubleCheck.provider(ABTestService_Factory.create(this.provideFirebaseRemoteConfigProvider));
        this.provideV7DailyBonusInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7DailyBonusInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.v7UserAchievementsInteractorProvider = DoubleCheck.provider(V7UserAchievementsInteractor_Factory.create(this.provideContextProvider));
        this.provideNewActiveCompetitionsInteractorProvider = DoubleCheck.provider(RestModule_ProvideNewActiveCompetitionsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideNewShopItemsInteractorProvider = DoubleCheck.provider(RestModule_ProvideNewShopItemsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideShopLayoutInteractorProvider = DoubleCheck.provider(RestModule_ProvideShopLayoutInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideDailyBonusControllerProvider = DoubleCheck.provider(AppModule_ProvideDailyBonusControllerFactory.create(builder.appModule));
        this.getDailyQuestsInteractorProvider = DoubleCheck.provider(GetDailyQuestsInteractor_Factory.create(this.provideContextProvider));
        Provider<ClaimDailyQuestInteractor> provider17 = DoubleCheck.provider(ClaimDailyQuestInteractor_Factory.create(this.provideContextProvider));
        this.claimDailyQuestInteractorProvider = provider17;
        this.homeDailyQuestControllerProvider = DoubleCheck.provider(HomeDailyQuestController_Factory.create(this.getDailyQuestsInteractorProvider, provider17));
        this.provideHomeVideoBonusRefreshGateProvider = DoubleCheck.provider(AppModule_ProvideHomeVideoBonusRefreshGateFactory.create(builder.appModule));
        Provider<TrackedOverlayDismissRegistry> provider18 = DoubleCheck.provider(AppModule_ProvideTrackedOverlayDismissRegistryFactory.create(builder.appModule));
        this.provideTrackedOverlayDismissRegistryProvider = provider18;
        this.homeVideoBonusControllerProvider = DoubleCheck.provider(HomeVideoBonusController_Factory.create(this.videoRewardServiceProvider, this.provideHomeVideoBonusRefreshGateProvider, provider18));
        this.balanceHolderProvider = DoubleCheck.provider(BalanceHolder_Factory.create(this.userServiceProvider));
        this.provideNewSportsInteractorProvider = DoubleCheck.provider(RestModule_ProvideNewSportsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.providePutFavoriteSportsInteractorProvider = DoubleCheck.provider(RestModule_ProvidePutFavoriteSportsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideDeleteFavoriteSportsInteractorProvider = DoubleCheck.provider(RestModule_ProvideDeleteFavoriteSportsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideMatchFilterStateProvider = DoubleCheck.provider(AppModule_ProvideMatchFilterStateFactory.create(builder.appModule));
        this.provideTourFavoriteSportsControllerProvider = DoubleCheck.provider(RestModule_ProvideTourFavoriteSportsControllerFactory.create(builder.restModule, this.provideNewSportsInteractorProvider, this.providePutFavoriteSportsInteractorProvider, this.provideDeleteFavoriteSportsInteractorProvider, this.provideMatchFilterStateProvider));
        this.provideNewBetSlipControllerProvider = DoubleCheck.provider(AppModule_ProvideNewBetSlipControllerFactory.create(builder.appModule));
        this.getActivePresentationsInteractorProvider = DoubleCheck.provider(GetActivePresentationsInteractor_Factory.create(this.provideContextProvider));
        this.getPresentationScreenRegistryInteractorProvider = DoubleCheck.provider(GetPresentationScreenRegistryInteractor_Factory.create(this.provideContextProvider));
        Provider<PresentationScreenRegistryStore> provider19 = DoubleCheck.provider(PresentationScreenRegistryStore_Factory.create());
        this.presentationScreenRegistryStoreProvider = provider19;
        Provider<PresentationScreens> provider20 = DoubleCheck.provider(PresentationScreens_Factory.create(provider19));
        this.presentationScreensProvider = provider20;
        this.screenTrackerProvider = DoubleCheck.provider(ScreenTracker_Factory.create(provider20));
        Provider<PostPresentationActionInteractor> provider21 = DoubleCheck.provider(PostPresentationActionInteractor_Factory.create(this.provideContextProvider));
        this.postPresentationActionInteractorProvider = provider21;
        this.presentationCoordinatorProvider = DoubleCheck.provider(PresentationCoordinator_Factory.create(this.getActivePresentationsInteractorProvider, this.getPresentationScreenRegistryInteractorProvider, this.presentationScreenRegistryStoreProvider, this.presentationScreensProvider, this.screenTrackerProvider, provider21));
        this.getInterstitialCampaignInteractorProvider = DoubleCheck.provider(GetInterstitialCampaignInteractor_Factory.create(this.provideContextProvider));
        Provider<PostInterstitialActionInteractor> provider22 = DoubleCheck.provider(PostInterstitialActionInteractor_Factory.create(this.provideContextProvider));
        this.postInterstitialActionInteractorProvider = provider22;
        this.interstitialAdCoordinatorProvider = DoubleCheck.provider(InterstitialAdCoordinator_Factory.create(this.getInterstitialCampaignInteractorProvider, provider22, this.screenTrackerProvider));
        this.getEligibleRewardedPromptsInteractorProvider = DoubleCheck.provider(GetEligibleRewardedPromptsInteractor_Factory.create(this.provideContextProvider));
        this.getRewardedPromptCampaignInteractorProvider = DoubleCheck.provider(GetRewardedPromptCampaignInteractor_Factory.create(this.provideContextProvider));
        Provider<PostRewardedPromptActionInteractor> provider23 = DoubleCheck.provider(PostRewardedPromptActionInteractor_Factory.create(this.provideContextProvider));
        this.postRewardedPromptActionInteractorProvider = provider23;
        this.rewardedVideoOfferCoordinatorProvider = DoubleCheck.provider(RewardedVideoOfferCoordinator_Factory.create(this.getEligibleRewardedPromptsInteractorProvider, this.getRewardedPromptCampaignInteractorProvider, provider23, this.getVideoRewardForPlacementStateInteractorProvider, this.videoRewardServiceProvider, this.screenTrackerProvider));
        this.provideChallengeTourInfoProvider = DoubleCheck.provider(AppModule_ProvideChallengeTourInfoProviderFactory.create(builder.appModule));
    }

    private void initialize2(final Builder builder) {
        this.provideQuizTourInfoProvider = DoubleCheck.provider(AppModule_ProvideQuizTourInfoProviderFactory.create(builder.appModule));
        this.provideSettingsControllerProvider = DoubleCheck.provider(AppModule_ProvideSettingsControllerFactory.create(builder.appModule));
        this.changeV7ProfilePhotoInteractorProvider = DoubleCheck.provider(ChangeV7ProfilePhotoInteractor_Factory.create(this.provideContextProvider));
        this.provideUpdateV7PushPreferencesInteractorProvider = DoubleCheck.provider(RestModule_ProvideUpdateV7PushPreferencesInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.changeV7NameInteractorProvider = DoubleCheck.provider(ChangeV7NameInteractor_Factory.create(this.provideContextProvider));
        this.provideAllSubscriptionsControllerProvider = DoubleCheck.provider(AppModule_ProvideAllSubscriptionsControllerFactory.create(builder.appModule));
        this.provideGetAllV7SubscriptionsInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetAllV7SubscriptionsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideDeleteAllV7SubscriptionsInteractorProvider = DoubleCheck.provider(RestModule_ProvideDeleteAllV7SubscriptionsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideDeleteV7MatchSubscriptionInteractorProvider = DoubleCheck.provider(RestModule_ProvideDeleteV7MatchSubscriptionInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideDeleteV7AllMatchSubscriptionsInteractorProvider = DoubleCheck.provider(RestModule_ProvideDeleteV7AllMatchSubscriptionsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.appModule = builder.appModule;
        this.defaultAppLanguageObserverProvider = DoubleCheck.provider(DefaultAppLanguageObserver_Factory.create());
        this.provideAppLanguageObserverProvider = DoubleCheck.provider(AppModule_ProvideAppLanguageObserverFactory.create(builder.appModule, this.defaultAppLanguageObserverProvider));
        this.getTeamDetailsInteractorProvider = DoubleCheck.provider(GetTeamDetailsInteractor_Factory.create(this.provideContextProvider));
        this.provideGetFavoriteTeamIdsInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetFavoriteTeamIdsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.providePutFavoriteTeamsInteractorProvider = DoubleCheck.provider(RestModule_ProvidePutFavoriteTeamsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.getOffersInfoInteractorProvider = DoubleCheck.provider(GetOffersInfoInteractor_Factory.create(this.provideContextProvider));
        this.hotMatchesInteractorProvider = DoubleCheck.provider(HotMatchesInteractor_Factory.create(this.provideContextProvider, this.localPreferencesServiceProvider));
        this.provideMatchVarietiesInteractorProvider = DoubleCheck.provider(RestModule_ProvideMatchVarietiesInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.v7UserInfoInteractorProvider = DoubleCheck.provider(V7UserInfoInteractor_Factory.create(this.provideContextProvider));
        this.newUserBattleActionCountsInteractorProvider = DoubleCheck.provider(NewUserBattleActionCountsInteractor_Factory.create(this.provideContextProvider));
        this.betsListInteractorProvider = DoubleCheck.provider(BetsListInteractor_Factory.create(this.provideContextProvider));
        this.provideMatchesControllerProvider = DoubleCheck.provider(AppModule_ProvideMatchesControllerFactory.create(builder.appModule));
        this.provideLeaguesControllerProvider = DoubleCheck.provider(AppModule_ProvideLeaguesControllerFactory.create(builder.appModule));
        this.newSpecificChampionshipInteractorProvider = DoubleCheck.provider(NewSpecificChampionshipInteractor_Factory.create(this.provideContextProvider, this.localPreferencesServiceProvider, this.userServiceProvider));
        this.providePutFavoriteLeaguesInteractorProvider = DoubleCheck.provider(RestModule_ProvidePutFavoriteLeaguesInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.sportsByDateInteractorProvider = DoubleCheck.provider(SportsByDateInteractor_Factory.create(this.provideContextProvider));
        this.providePutFavoriteSportsBulkInteractorProvider = DoubleCheck.provider(RestModule_ProvidePutFavoriteSportsBulkInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideDateFilterStateProvider = DoubleCheck.provider(AppModule_ProvideDateFilterStateFactory.create(builder.appModule));
        this.leaguesByDateInteractorProvider = DoubleCheck.provider(LeaguesByDateInteractor_Factory.create(this.provideContextProvider));
        this.provideDeleteFavoriteLeaguesInteractorProvider = DoubleCheck.provider(RestModule_ProvideDeleteFavoriteLeaguesInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.providePutFavoriteLeaguesBulkInteractorProvider = DoubleCheck.provider(RestModule_ProvidePutFavoriteLeaguesBulkInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.matchesByDateInteractorProvider = DoubleCheck.provider(MatchesByDateInteractor_Factory.create(this.provideContextProvider, this.localPreferencesServiceProvider));
        this.v7UserRankingStatisticsInteractorProvider = DoubleCheck.provider(V7UserRankingStatisticsInteractor_Factory.create(this.provideContextProvider));
        this.v7UserFollowActionInteractorProvider = DoubleCheck.provider(V7UserFollowActionInteractor_Factory.create(this.provideContextProvider));
        this.getPrivateMessagesInteractorProvider = DoubleCheck.provider(GetPrivateMessagesInteractor_Factory.create(this.provideContextProvider));
        this.sendPrivateMessasgesInteractorProvider = DoubleCheck.provider(SendPrivateMessasgesInteractor_Factory.create(this.provideContextProvider));
        this.newUserAvailableChallengesInteractorProvider = DoubleCheck.provider(NewUserAvailableChallengesInteractor_Factory.create(this.provideContextProvider));
        this.newUserPrivateChallengesInteractorProvider = DoubleCheck.provider(NewUserPrivateChallengesInteractor_Factory.create(this.provideContextProvider));
        this.newUserChallengesHistoryInteractorProvider = DoubleCheck.provider(NewUserChallengesHistoryInteractor_Factory.create(this.provideContextProvider));
        this.newUserBattleCountsInteractorProvider = DoubleCheck.provider(NewUserBattleCountsInteractor_Factory.create(this.provideContextProvider));
        this.v7RanksByTypeInteractorProvider = DoubleCheck.provider(V7RanksByTypeInteractor_Factory.create(this.provideContextProvider));
        this.providePlaceBetInteractorProvider = DoubleCheck.provider(RestModule_ProvidePlaceBetInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.newLoginInteractorProvider = DoubleCheck.provider(NewLoginInteractor_Factory.create(this.provideContextProvider));
        this.provideUpgradeLoginInteractorProvider = DoubleCheck.provider(RestModule_ProvideUpgradeLoginInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.loadEventsInteractorProvider = DoubleCheck.provider(LoadEventsInteractor_Factory.create(this.provideContextProvider, this.provideDatabaseProvider));
        this.webGamesListInteractorProvider = DoubleCheck.provider(WebGamesListInteractor_Factory.create(this.provideContextProvider));
        this.provideShopEntitlementClaimInteractorProvider = DoubleCheck.provider(RestModule_ProvideShopEntitlementClaimInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideLocaleServiceProvider = DoubleCheck.provider(AppModule_ProvideLocaleServiceFactory.create(builder.appModule));
        this.myFirebaseMessagingServiceSubcomponentBuilderProvider = new Provider<ServiceModule_ContributeMyFirebaseMessagingService.MyFirebaseMessagingServiceSubcomponent.Builder>() { // from class: org.betup.injection.component.DaggerAppComponent.1
            @Override // javax.inject.Provider
            public ServiceModule_ContributeMyFirebaseMessagingService.MyFirebaseMessagingServiceSubcomponent.Builder get() {
                return new MyFirebaseMessagingServiceSubcomponentBuilder();
            }
        };
        this.getV7MatchSubscriptionInteractorProvider = DoubleCheck.provider(GetV7MatchSubscriptionInteractor_Factory.create(this.provideContextProvider));
        Provider<UpdateV7MatchSubscriptionInteractor> provider = DoubleCheck.provider(UpdateV7MatchSubscriptionInteractor_Factory.create(this.provideContextProvider));
        this.updateV7MatchSubscriptionInteractorProvider = provider;
        this.defaultSubscriptionServiceProvider = DoubleCheck.provider(DefaultSubscriptionService_Factory.create(this.provideContextProvider, this.getV7MatchSubscriptionInteractorProvider, provider));
        this.v7UserFollowersInteractorProvider = DoubleCheck.provider(V7UserFollowersInteractor_Factory.create(this.provideContextProvider));
        this.getChatsInteractorProvider = DoubleCheck.provider(GetChatsInteractor_Factory.create(this.provideContextProvider));
        this.userProfileStatisticsInteractorProvider = DoubleCheck.provider(UserProfileStatisticsInteractor_Factory.create(this.provideContextProvider));
        this.v7UserFollowingInteractorProvider = DoubleCheck.provider(V7UserFollowingInteractor_Factory.create(this.provideContextProvider));
        this.newLeaguesInteractorProvider = DoubleCheck.provider(NewLeaguesInteractor_Factory.create(this.provideContextProvider));
        this.newTeamsInteractorProvider = DoubleCheck.provider(NewTeamsInteractor_Factory.create(this.provideContextProvider));
        this.providePutFavoriteTeamsBulkInteractorProvider = DoubleCheck.provider(RestModule_ProvidePutFavoriteTeamsBulkInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideDeleteFavoriteTeamsInteractorProvider = DoubleCheck.provider(RestModule_ProvideDeleteFavoriteTeamsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7CreateBetlistInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7CreateBetlistInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.betStatInteractorProvider = DoubleCheck.provider(BetStatInteractor_Factory.create(this.provideContextProvider));
        this.provideGetCancelBetInfoInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetCancelBetInfoInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideGetSellBetInfoInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetSellBetInfoInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideGetBetShareInstallLinkInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetBetShareInstallLinkInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideCancelBetInteractorProvider = DoubleCheck.provider(RestModule_ProvideCancelBetInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideSellBetInteractorProvider = DoubleCheck.provider(RestModule_ProvideSellBetInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7VarietyBetRestrictionsInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7VarietyBetRestrictionsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideV7VarietyVersionGatesInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7VarietyVersionGatesInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.singleBetInteractorProvider = DoubleCheck.provider(SingleBetInteractor_Factory.create(this.provideContextProvider));
        this.getPromoBannerForMatchInteractorProvider = DoubleCheck.provider(GetPromoBannerForMatchInteractor_Factory.create(this.provideContextProvider));
        this.provideMatchShortInfoInteractorProvider = DoubleCheck.provider(RestModule_ProvideMatchShortInfoInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.subscoreServiceProvider = DoubleCheck.provider(SubscoreService_Factory.create());
        this.matchMyBetsInteractorProvider = DoubleCheck.provider(MatchMyBetsInteractor_Factory.create(this.provideContextProvider));
        this.provideV7MatchStatisticsInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7MatchStatisticsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.v7StatsByVarietiesInteractorProvider = DoubleCheck.provider(V7StatsByVarietiesInteractor_Factory.create(this.provideContextProvider));
        this.provideV7MatchHistoryInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7MatchHistoryInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.quizAvailabilityInteractorProvider = DoubleCheck.provider(QuizAvailabilityInteractor_Factory.create(this.provideContextProvider));
        this.quizDetailsInteractorProvider = DoubleCheck.provider(QuizDetailsInteractor_Factory.create(this.provideContextProvider));
        this.quizTiersInteractorProvider = DoubleCheck.provider(QuizTiersInteractor_Factory.create(this.provideContextProvider));
        this.quizParticipationInteractorProvider = DoubleCheck.provider(QuizParticipationInteractor_Factory.create(this.provideContextProvider));
        this.getPublicChatMessagesInteractorProvider = DoubleCheck.provider(GetPublicChatMessagesInteractor_Factory.create(this.provideContextProvider));
        this.sendPublicChatMessageInteractorProvider = DoubleCheck.provider(SendPublicChatMessageInteractor_Factory.create(this.provideContextProvider));
        this.matchQuizParticipationInteractorProvider = DoubleCheck.provider(MatchQuizParticipationInteractor_Factory.create(this.provideContextProvider));
        this.provideNewCompetitionsHistoryInteractorProvider = DoubleCheck.provider(RestModule_ProvideNewCompetitionsHistoryInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.getV7CountriesInteractorProvider = DoubleCheck.provider(GetV7CountriesInteractor_Factory.create(this.provideContextProvider));
        this.changeV7CountryInteractorProvider = DoubleCheck.provider(ChangeV7CountryInteractor_Factory.create(this.provideContextProvider));
        this.getV7FAQInteractorProvider = DoubleCheck.provider(GetV7FAQInteractor_Factory.create(this.provideContextProvider));
        this.getV7SupportInfoInteractorProvider = DoubleCheck.provider(GetV7SupportInfoInteractor_Factory.create(this.provideContextProvider));
        this.getV7SupportMessagesInteractorProvider = DoubleCheck.provider(GetV7SupportMessagesInteractor_Factory.create(this.provideContextProvider));
        this.sendV7SupportMessageInteractorProvider = DoubleCheck.provider(SendV7SupportMessageInteractor_Factory.create(this.provideContextProvider));
        this.sendV7ReportInteractorProvider = DoubleCheck.provider(SendV7ReportInteractor_Factory.create(this.provideContextProvider));
        this.getSupportChatsInteractorProvider = DoubleCheck.provider(GetSupportChatsInteractor_Factory.create(this.provideContextProvider));
        this.createSupportChatInteractorProvider = DoubleCheck.provider(CreateSupportChatInteractor_Factory.create(this.provideContextProvider));
        this.getSupportChatInteractorProvider = DoubleCheck.provider(GetSupportChatInteractor_Factory.create(this.provideContextProvider));
        this.getSupportChatMessagesInteractorProvider = DoubleCheck.provider(GetSupportChatMessagesInteractor_Factory.create(this.provideContextProvider));
        this.sendSupportChatMessageInteractorProvider = DoubleCheck.provider(SendSupportChatMessageInteractor_Factory.create(this.provideContextProvider));
        this.closeSupportChatInteractorProvider = DoubleCheck.provider(CloseSupportChatInteractor_Factory.create(this.provideContextProvider));
        this.getSupportCategoriesInteractorProvider = DoubleCheck.provider(GetSupportCategoriesInteractor_Factory.create(this.provideContextProvider));
    }

    private void initialize3(final Builder builder) {
        this.getDeleteAccountInfoInteractorProvider = DoubleCheck.provider(GetDeleteAccountInfoInteractor_Factory.create(this.provideContextProvider));
        this.sendDeleteAccountInteractorProvider = DoubleCheck.provider(SendDeleteAccountInteractor_Factory.create(this.provideContextProvider));
        this.cancelAccountDeletionRequestInteractorProvider = DoubleCheck.provider(CancelAccountDeletionRequestInteractor_Factory.create(this.provideContextProvider));
        this.unlockOneClickBetInteractorProvider = DoubleCheck.provider(UnlockOneClickBetInteractor_Factory.create(this.provideContextProvider));
        this.provideV7OneClickBetSettingsInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7OneClickBetSettingsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.quizParticipationsInteractorProvider = DoubleCheck.provider(QuizParticipationsInteractor_Factory.create(this.provideContextProvider));
        this.quizStateCountInteractorProvider = DoubleCheck.provider(QuizStateCountInteractor_Factory.create(this.provideContextProvider));
        this.getParticipationInteractorProvider = DoubleCheck.provider(GetParticipationInteractor_Factory.create(this.provideContextProvider));
        this.provideGetFlashBetSessionInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetFlashBetSessionInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.reportDailyQuestClientEventInteractorProvider = DoubleCheck.provider(ReportDailyQuestClientEventInteractor_Factory.create(this.provideContextProvider));
        this.provideSearchControllerProvider = DoubleCheck.provider(AppModule_ProvideSearchControllerFactory.create(builder.appModule));
        this.recentSearchesServiceProvider = DoubleCheck.provider(RecentSearchesService_Factory.create(this.localPreferencesServiceProvider, this.userServiceProvider));
        this.v7SearchMatchesInteractorProvider = DoubleCheck.provider(V7SearchMatchesInteractor_Factory.create(this.provideContextProvider));
        this.v7SearchTeamsInteractorProvider = DoubleCheck.provider(V7SearchTeamsInteractor_Factory.create(this.provideContextProvider));
        this.v7SearchLeaguesInteractorProvider = DoubleCheck.provider(V7SearchLeaguesInteractor_Factory.create(this.provideContextProvider));
        this.v7SearchUsersInteractorProvider = DoubleCheck.provider(V7SearchUsersInteractor_Factory.create(this.provideContextProvider));
        this.v7TrendingItemsInteractorProvider = DoubleCheck.provider(V7TrendingItemsInteractor_Factory.create(this.provideContextProvider));
        this.provideBetsPlacedControllerProvider = DoubleCheck.provider(AppModule_ProvideBetsPlacedControllerFactory.create(builder.appModule));
        this.provideGamesNavigationControllerProvider = DoubleCheck.provider(AppModule_ProvideGamesNavigationControllerFactory.create(builder.appModule, this.userServiceProvider));
        this.getDiceGameConfigInteractorProvider = DoubleCheck.provider(GetDiceGameConfigInteractor_Factory.create(this.provideContextProvider));
        this.sendDiceGameResultInteractorProvider = DoubleCheck.provider(SendDiceGameResultInteractor_Factory.create(this.provideContextProvider));
        this.webGameSessionCodeInteractorProvider = DoubleCheck.provider(WebGameSessionCodeInteractor_Factory.create(this.provideContextProvider));
        this.higherLowerGameConfigInteractorProvider = DoubleCheck.provider(HigherLowerGameConfigInteractor_Factory.create(this.provideContextProvider));
        this.startHighLowGameInteractorProvider = DoubleCheck.provider(StartHighLowGameInteractor_Factory.create(this.provideContextProvider));
        this.continueHighLowGameInteractorProvider = DoubleCheck.provider(ContinueHighLowGameInteractor_Factory.create(this.provideContextProvider));
        this.getWarGameConfigInteractorProvider = DoubleCheck.provider(GetWarGameConfigInteractor_Factory.create(this.provideContextProvider));
        this.startWarGameInteractorProvider = DoubleCheck.provider(StartWarGameInteractor_Factory.create(this.provideContextProvider));
        this.continueWarGameInteractorProvider = DoubleCheck.provider(ContinueWarGameInteractor_Factory.create(this.provideContextProvider));
        this.getSingleOfferInfoInteractorProvider = DoubleCheck.provider(GetSingleOfferInfoInteractor_Factory.create(this.provideContextProvider));
        this.getSignatureForOfferInteractorProvider = DoubleCheck.provider(GetSignatureForOfferInteractor_Factory.create(this.provideContextProvider));
        this.getConfigLuckyCellsGameInteractorProvider = DoubleCheck.provider(GetConfigLuckyCellsGameInteractor_Factory.create(this.provideContextProvider));
        this.startLuckyCellsGameInteractorProvider = DoubleCheck.provider(StartLuckyCellsGameInteractor_Factory.create(this.provideContextProvider));
        this.continueLuckyCellsGameInteractorProvider = DoubleCheck.provider(ContinueLuckyCellsGameInteractor_Factory.create(this.provideContextProvider));
        this.completeLuckyCellsGameInteractorProvider = DoubleCheck.provider(CompleteLuckyCellsGameInteractor_Factory.create(this.provideContextProvider));
        this.getConfigDoubleGameInteractorProvider = DoubleCheck.provider(GetConfigDoubleGameInteractor_Factory.create(this.provideContextProvider));
        this.startDoubleGameInteractorProvider = DoubleCheck.provider(StartDoubleGameInteractor_Factory.create(this.provideContextProvider));
        this.finishDoubleGameInteractorProvider = DoubleCheck.provider(FinishDoubleGameInteractor_Factory.create(this.provideContextProvider));
        this.getHistoryDoubleGameInteractorProvider = DoubleCheck.provider(GetHistoryDoubleGameInteractor_Factory.create(this.provideContextProvider));
        this.provideV7GetServerInfoInteractorProvider = DoubleCheck.provider(RestModule_ProvideV7GetServerInfoInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.newLeagueMatchesInteractorProvider = DoubleCheck.provider(NewLeagueMatchesInteractor_Factory.create(this.provideContextProvider, this.localPreferencesServiceProvider));
        Provider<GiveWheelOfFortuneRewardInteractor> provider = DoubleCheck.provider(GiveWheelOfFortuneRewardInteractor_Factory.create(this.provideContextProvider));
        this.giveWheelOfFortuneRewardInteractorProvider = provider;
        this.wheelOfFortuneRewardControllerProvider = DoubleCheck.provider(WheelOfFortuneRewardController_Factory.create(provider, this.userServiceProvider, this.provideDailyBonusControllerProvider));
        this.provideGetFlashBetSportsInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetFlashBetSportsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideGetFlashBetStatsInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetFlashBetStatsInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideGetPendingFlashBetSessionInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetPendingFlashBetSessionInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideGetFlashBetCategoriesInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetFlashBetCategoriesInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideStartFlashBetGameInteractorProvider = DoubleCheck.provider(RestModule_ProvideStartFlashBetGameInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideGetRandomTeamImagesInteractorProvider = DoubleCheck.provider(RestModule_ProvideGetRandomTeamImagesInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideSubmitFlashBetAnswerInteractorProvider = DoubleCheck.provider(RestModule_ProvideSubmitFlashBetAnswerInteractorFactory.create(builder.restModule, this.provideContextProvider));
        this.provideLeaveFlashBetSessionInteractorProvider = DoubleCheck.provider(RestModule_ProvideLeaveFlashBetSessionInteractorFactory.create(builder.restModule, this.provideContextProvider));
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MainActivity mainActivity) {
        injectMainActivity(mainActivity);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(LoginActivity loginActivity) {
        injectLoginActivity(loginActivity);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SplashActivity splashActivity) {
        injectSplashActivity(splashActivity);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(IntroChallengeActivity introChallengeActivity) {
        injectIntroChallengeActivity(introChallengeActivity);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(IntroQuizActivity introQuizActivity) {
        injectIntroQuizActivity(introQuizActivity);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NewSettingsFragment fragment) {
        injectNewSettingsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SettingsController controller) {
        injectSettingsController(controller);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(AllSubscriptionsFragment fragment) {
        injectAllSubscriptionsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(AllSubscriptionsController controller) {
        injectAllSubscriptionsController(controller);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MatchDetailsFragmentK fragment) {
        injectMatchDetailsFragmentK(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TeamDetailsFragment fragment) {
        injectTeamDetailsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TeamDetailsController controller) {
        injectTeamDetailsController(controller);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetslipFragment fragment) {
        injectBetslipFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(HomeFragment fragment) {
        injectHomeFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetsListFragment fragment) {
        injectBetsListFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MatchesTabsFragment fragment) {
        injectMatchesTabsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(LeaguesFragment fragment) {
        injectLeaguesFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SpecificChampionshipFragment fragment) {
        injectSpecificChampionshipFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TopMatchesFragment fragment) {
        injectTopMatchesFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TopMatchesTabFragment fragment) {
        injectTopMatchesTabFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SportsByDateFragment fragment) {
        injectSportsByDateFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(LeaguesByDateFragment fragment) {
        injectLeaguesByDateFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MatchesByDateFragment fragment) {
        injectMatchesByDateFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UserDetailsFragmentK fragment) {
        injectUserDetailsFragmentK(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ForeignUserDetailsFragmentK fragment) {
        injectForeignUserDetailsFragmentK(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UserBattlesFragment fragment) {
        injectUserBattlesFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UserRankingsFragment fragment) {
        injectUserRankingsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NewCompetitionsFragment fragment) {
        injectNewCompetitionsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(CompetitionDetailsFragment fragment) {
        injectCompetitionDetailsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(CompetitionsPreviewFragment fragment) {
        injectCompetitionsPreviewFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(LoginFragment fragment) {
        injectLoginFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(AuthFragment fragment) {
        injectAuthFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(AuthController authController) {
        injectAuthController(authController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NewAchievementsFragment fragment) {
        injectNewAchievementsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(AchievementsController achievementsController) {
        injectAchievementsController(achievementsController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NotificationsFragment fragment) {
        injectNotificationsFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NotificationsController notificationsController) {
        injectNotificationsController(notificationsController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BalanceHistoryFragmentK fragment) {
        injectBalanceHistoryFragmentK(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(DefaultLoader loader) {
        injectDefaultLoader(loader);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ShopBetcoinsFragmentK fragment) {
        injectShopBetcoinsFragmentK(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(PushEventsService pushEventsService) {
        injectPushEventsService(pushEventsService);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetUpApp betUpApp) {
        injectBetUpApp(betUpApp);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(OddsDialogFragment fragment) {
        injectOddsDialogFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NotificationDialogFragment fragment) {
        injectNotificationDialogFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MatchesController matchesController) {
        injectMatchesController(matchesController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UserDetailsController userDetailsController) {
        injectUserDetailsController(userDetailsController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FollowersDialogController followersDialogController) {
        injectFollowersDialogController(followersDialogController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(LeaguesController leaguesController) {
        injectLeaguesController(leaguesController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TeamsController teamsController) {
        injectTeamsController(teamsController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SportsByDateController sportsByDateController) {
        injectSportsByDateController(sportsByDateController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(LeaguesByDateController leaguesByDateController) {
        injectLeaguesByDateController(leaguesByDateController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetsController newBetSlipController) {
        injectBetsController(newBetSlipController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetsPlacedController newBetsPlacedController) {
        injectBetsPlacedController(newBetsPlacedController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MatchDetailsController matchController) {
        injectMatchDetailsController(matchController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(CompetitionsController competitionsController) {
        injectCompetitionsController(competitionsController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ChangeCountryDialogFragment changeCountryDialogFragment) {
        injectChangeCountryDialogFragment(changeCountryDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ChangeLanguageFragment changeLanguageFragment) {
        injectChangeLanguageFragment(changeLanguageFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(DefaultSubscriptionService subscriptionController) {
        injectDefaultSubscriptionService(subscriptionController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SupportFragmentK fragment) {
        injectSupportFragmentK(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SupportController controller) {
        injectSupportController(controller);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(PromoFragment fragment) {
        injectPromoFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(DailyBonusDialogFragment fragment) {
        injectDailyBonusDialogFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(DailyBonusController controller) {
        injectDailyBonusController(controller);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BettingSheetDialog bettingSheetDialog) {
        injectBettingSheetDialog(bettingSheetDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(OneClickBetSettingsDialogFragment fragment) {
        injectOneClickBetSettingsDialogFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(EditFavouritesDialog editFavouritesDialog) {
        injectEditFavouritesDialog(editFavouritesDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FollowersDialog followersDialog) {
        injectFollowersDialog(followersDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetsFragment betsFragment) {
        injectBetsFragment(betsFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(QuizResultsFragment quizResultsFragment) {
        injectQuizResultsFragment(quizResultsFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(QuizResultsController quizResultsController) {
        injectQuizResultsController(quizResultsController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(QuizParticipationDialog quizParticipationDialog) {
        injectQuizParticipationDialog(quizParticipationDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FlashBetDetailsDialogFragment flashBetDetailsDialogFragment) {
        injectFlashBetDetailsDialogFragment(flashBetDetailsDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FlashBetAbandonedSessionDialogFragment flashBetAbandonedSessionDialogFragment) {
        injectFlashBetAbandonedSessionDialogFragment(flashBetAbandonedSessionDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetDetailDialog betDetailDialog) {
        injectBetDetailDialog(betDetailDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ShopDialogFragment shopDialogFragment) {
        injectShopDialogFragment(shopDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UserServiceAccessor userServiceAccessor) {
        injectUserServiceAccessor(userServiceAccessor);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NewSearchFragment newSearchFragment) {
        injectNewSearchFragment(newSearchFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SearchBottomSheetFragment searchBottomSheetFragment) {
        injectSearchBottomSheetFragment(searchBottomSheetFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SearchController searchController) {
        injectSearchController(searchController);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetListResultDialogFragment betListResultDialogFragment) {
        injectBetListResultDialogFragment(betListResultDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(WelcomeDialog dialog) {
        injectWelcomeDialog(dialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BetPlacedDialog betPlacedDialog) {
        injectBetPlacedDialog(betPlacedDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TourCompletedDialogFragment tourCompletedDialogFragment) {
        injectTourCompletedDialogFragment(tourCompletedDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NotEnoughBetcoinsVideoOfferDialog notEnoughBetcoinsVideoOfferDialog) {
        injectNotEnoughBetcoinsVideoOfferDialog(notEnoughBetcoinsVideoOfferDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(NotEnoughBetcoinsVideoOfferDialogFragment notEnoughBetcoinsVideoOfferDialogFragment) {
        injectNotEnoughBetcoinsVideoOfferDialogFragment(notEnoughBetcoinsVideoOfferDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(RewardedVideoOfferDialogFragment rewardedVideoOfferDialogFragment) {
        injectRewardedVideoOfferDialogFragment(rewardedVideoOfferDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UnlockBetAmountDialog unlockBetAmountDialog) {
        injectUnlockBetAmountDialog(unlockBetAmountDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UnlockBetGroupsDialog unlockBetGroupsDialog) {
        injectUnlockBetGroupsDialog(unlockBetGroupsDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(UnlockBetGroupsDialogFragment unlockBetGroupsDialogFragment) {
        injectUnlockBetGroupsDialogFragment(unlockBetGroupsDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(DialogConsent dialogConsent) {
        injectDialogConsent(dialogConsent);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(MiniGameActivity miniGameActivity) {
        injectMiniGameActivity(miniGameActivity);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(DiceFragment diceFragment) {
        injectDiceFragment(diceFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TicketsInfoDialog ticketsInfoDialog) {
        injectTicketsInfoDialog(ticketsInfoDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(GamesListFragment gamesListFragment) {
        injectGamesListFragment(gamesListFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(HigherLowerGameFragment higherLowerGameFragment) {
        injectHigherLowerGameFragment(higherLowerGameFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(WarGameFragment warGameFragment) {
        injectWarGameFragment(warGameFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(OffersDialogFragment offersDialogFragment) {
        injectOffersDialogFragment(offersDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SpecialOfferDialogFragment specialOfferDialogFragment) {
        injectSpecialOfferDialogFragment(specialOfferDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SpecialOfferPageFragment specialOfferPageFragment) {
        injectSpecialOfferPageFragment(specialOfferPageFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(WebGameDialogFragment webGameDialogFragment) {
        injectWebGameDialogFragment(webGameDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(WebGameWinVideoOfferDialogFragment webGameWinVideoOfferDialogFragment) {
        injectWebGameWinVideoOfferDialogFragment(webGameWinVideoOfferDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(BonusOfferWebViewFragment bonusOfferWebViewFragment) {
        injectBonusOfferWebViewFragment(bonusOfferWebViewFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SubscriptionDialog subscriptionDialog) {
        injectSubscriptionDialog(subscriptionDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(RewardReceivedDialog dialog) {
        injectRewardReceivedDialog(dialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(LuckyCellsGameFragment luckyCellsGameFragment) {
        injectLuckyCellsGameFragment(luckyCellsGameFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(DoubleGameFragment doubleGameFragment) {
        injectDoubleGameFragment(doubleGameFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ResultDoubleGameDialog resultDoubleGameDialog) {
        injectResultDoubleGameDialog(resultDoubleGameDialog);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(OfferFragment offerFragment) {
        injectOfferFragment(offerFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(TimerContent offerItemContent) {
        injectTimerContent(offerItemContent);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(PriceContent offerItemContent) {
        injectPriceContent(offerItemContent);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ButtonContent offerItemContent) {
        injectButtonContent(offerItemContent);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(CreateBattleDialogFragment createBattleDialogFragment) {
        injectCreateBattleDialogFragment(createBattleDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SelectLeagueDialogFragment selectLeagueDialogFragment) {
        injectSelectLeagueDialogFragment(selectLeagueDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SelectMatchDialogFragment selectMatchDialogFragment) {
        injectSelectMatchDialogFragment(selectMatchDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(SelectBetDialogFragment selectBetDialogFragment) {
        injectSelectBetDialogFragment(selectBetDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ChallengeAcceptDialogFragment challengeAcceptDialogFragment) {
        injectChallengeAcceptDialogFragment(challengeAcceptDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ChallengePreviewNewDialogFragment challengePreviewNewDialogFragment) {
        injectChallengePreviewNewDialogFragment(challengePreviewNewDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(PushNotificationDialogFragment pushNotificationDialogFragment) {
        injectPushNotificationDialogFragment(pushNotificationDialogFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(WheelOfFortuneFragment wheelOfFortuneFragment) {
        injectWheelOfFortuneFragment(wheelOfFortuneFragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ChangeDisplayNameInteractorAccessor changeDisplayNameInteractorAccessor) {
        injectChangeDisplayNameInteractorAccessor(changeDisplayNameInteractorAccessor);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(ReferralCodeInteractorAccessor referralCodeInteractorAccessor) {
        injectReferralCodeInteractorAccessor(referralCodeInteractorAccessor);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FlashBetFragment fragment) {
        injectFlashBetFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FlashBetCategoriesFragment fragment) {
        injectFlashBetCategoriesFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FlashBetMatchStartFragment fragment) {
        injectFlashBetMatchStartFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FlashBetGameFragment fragment) {
        injectFlashBetGameFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public void inject(FlashBetLeaveConfirmDialogFragment fragment) {
        injectFlashBetLeaveConfirmDialogFragment(fragment);
    }

    @Override // org.betup.injection.component.AppComponent
    public AdUnitRegistry adUnitRegistry() {
        return this.adUnitRegistryProvider.get();
    }

    private MainActivity injectMainActivity(MainActivity instance) {
        MainActivity_MembersInjector.injectAdsInitializer(instance, this.adsInitializerProvider.get());
        MainActivity_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        MainActivity_MembersInjector.injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
        MainActivity_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        MainActivity_MembersInjector.injectCasinoService(instance, this.casinoServiceProvider.get());
        MainActivity_MembersInjector.injectV7ReferralInteractor(instance, this.provideV7ReferralInteractorProvider.get());
        MainActivity_MembersInjector.injectBetListAppender(instance, this.provideBetListAppenderProvider.get());
        MainActivity_MembersInjector.injectNavigationService(instance, this.provideNavigationControllerProvider.get());
        MainActivity_MembersInjector.injectV7UpdateTutorialCompleteInteractor(instance, this.provideV7UpdateTutorialCompleteInteractorProvider.get());
        MainActivity_MembersInjector.injectV7TourMarketingRewardsInteractor(instance, this.provideV7TourMarketingRewardsInteractorProvider.get());
        MainActivity_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        MainActivity_MembersInjector.injectMatchInfoInteractor(instance, this.provideMatchInfoInteractorProvider.get());
        MainActivity_MembersInjector.injectV7UpdateTimezoneInteractor(instance, this.provideV7UpdateTimezoneInteractorProvider.get());
        MainActivity_MembersInjector.injectChatService(instance, this.provideMessagingControllerProvider.get());
        MainActivity_MembersInjector.injectPushStorageProvider(instance, this.providePushStorageProvider.get());
        MainActivity_MembersInjector.injectPushTokenService(instance, this.pushTokenServiceProvider.get());
        MainActivity_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        MainActivity_MembersInjector.injectSingleShopInteractor(instance, this.newSingleShopInteractorProvider.get());
        MainActivity_MembersInjector.injectRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        MainActivity_MembersInjector.injectV7UpdateAppVersionInteractor(instance, this.provideV7UpdateAppVersionInteractorProvider.get());
        MainActivity_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        MainActivity_MembersInjector.injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
        MainActivity_MembersInjector.injectSocialConnectionService(instance, this.socialConnectionServiceProvider.get());
        MainActivity_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        MainActivity_MembersInjector.injectAbTestService(instance, this.aBTestServiceProvider.get());
        MainActivity_MembersInjector.injectInterstitialAdController(instance, this.provideInterstitialAdControllerProvider.get());
        MainActivity_MembersInjector.injectAdUnitRegistry(instance, this.adUnitRegistryProvider.get());
        MainActivity_MembersInjector.injectV7DailyBonusInteractor(instance, this.provideV7DailyBonusInteractorProvider.get());
        MainActivity_MembersInjector.injectV7UserAchievementsInteractor(instance, this.v7UserAchievementsInteractorProvider.get());
        MainActivity_MembersInjector.injectNewActiveCompetitionsInteractor(instance, this.provideNewActiveCompetitionsInteractorProvider.get());
        MainActivity_MembersInjector.injectNewShopItemsInteractor(instance, this.provideNewShopItemsInteractorProvider.get());
        MainActivity_MembersInjector.injectShopLayoutInteractor(instance, this.provideShopLayoutInteractorProvider.get());
        MainActivity_MembersInjector.injectDailyBonusController(instance, this.provideDailyBonusControllerProvider.get());
        MainActivity_MembersInjector.injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        MainActivity_MembersInjector.injectHomeVideoBonusController(instance, this.homeVideoBonusControllerProvider.get());
        MainActivity_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        MainActivity_MembersInjector.injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        MainActivity_MembersInjector.injectTourFavoriteSportsController(instance, this.provideTourFavoriteSportsControllerProvider.get());
        MainActivity_MembersInjector.injectBetsController(instance, this.provideNewBetSlipControllerProvider.get());
        MainActivity_MembersInjector.injectPresentationCoordinator(instance, this.presentationCoordinatorProvider.get());
        MainActivity_MembersInjector.injectInterstitialAdCoordinator(instance, this.interstitialAdCoordinatorProvider.get());
        MainActivity_MembersInjector.injectRewardedVideoOfferCoordinator(instance, this.rewardedVideoOfferCoordinatorProvider.get());
        MainActivity_MembersInjector.injectScreenTracker(instance, this.screenTrackerProvider.get());
        return instance;
    }

    private LoginActivity injectLoginActivity(LoginActivity instance) {
        LoginActivity_MembersInjector.injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
        LoginActivity_MembersInjector.injectSocialConnectionService(instance, this.socialConnectionServiceProvider.get());
        return instance;
    }

    private SplashActivity injectSplashActivity(SplashActivity instance) {
        SplashActivity_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        SplashActivity_MembersInjector.injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
        return instance;
    }

    private IntroChallengeActivity injectIntroChallengeActivity(IntroChallengeActivity instance) {
        IntroChallengeActivity_MembersInjector.injectChallengeTourInfoProvider(instance, this.provideChallengeTourInfoProvider.get());
        return instance;
    }

    private IntroQuizActivity injectIntroQuizActivity(IntroQuizActivity instance) {
        IntroQuizActivity_MembersInjector.injectQuizTourInfoProvider(instance, this.provideQuizTourInfoProvider.get());
        return instance;
    }

    private NewSettingsFragment injectNewSettingsFragment(NewSettingsFragment instance) {
        NewSettingsFragment_MembersInjector.injectSettingsController(instance, this.provideSettingsControllerProvider.get());
        return instance;
    }

    private SettingsController injectSettingsController(SettingsController instance) {
        SettingsController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        SettingsController_MembersInjector.injectChangeV7ProfilePhotoInteractor(instance, this.changeV7ProfilePhotoInteractorProvider.get());
        SettingsController_MembersInjector.injectV7ReferralInteractor(instance, this.provideV7ReferralInteractorProvider.get());
        SettingsController_MembersInjector.injectGetV7MyInfoInteractor(instance, this.getV7MyInfoInteractorProvider.get());
        SettingsController_MembersInjector.injectUpdateV7PushPreferencesInteractor(instance, this.provideUpdateV7PushPreferencesInteractorProvider.get());
        SettingsController_MembersInjector.injectChangeV7NameInteractor(instance, this.changeV7NameInteractorProvider.get());
        SettingsController_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        return instance;
    }

    private AllSubscriptionsFragment injectAllSubscriptionsFragment(AllSubscriptionsFragment instance) {
        AllSubscriptionsFragment_MembersInjector.injectController(instance, this.provideAllSubscriptionsControllerProvider.get());
        return instance;
    }

    private AllSubscriptionsController injectAllSubscriptionsController(AllSubscriptionsController instance) {
        AllSubscriptionsController_MembersInjector.injectGetAllSubscriptionsInteractor(instance, this.provideGetAllV7SubscriptionsInteractorProvider.get());
        AllSubscriptionsController_MembersInjector.injectDeleteAllSubscriptionsInteractor(instance, this.provideDeleteAllV7SubscriptionsInteractorProvider.get());
        AllSubscriptionsController_MembersInjector.injectDeleteMatchSubscriptionInteractor(instance, this.provideDeleteV7MatchSubscriptionInteractorProvider.get());
        AllSubscriptionsController_MembersInjector.injectDeleteAllMatchSubscriptionsInteractor(instance, this.provideDeleteV7AllMatchSubscriptionsInteractorProvider.get());
        return instance;
    }

    private MatchDetailsFragmentK injectMatchDetailsFragmentK(MatchDetailsFragmentK instance) {
        MatchDetailsFragmentK_MembersInjector.injectController(instance, AppModule_ProvideMatchControllerFactory.proxyProvideMatchController(this.appModule));
        MatchDetailsFragmentK_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        MatchDetailsFragmentK_MembersInjector.injectScreenTracker(instance, this.screenTrackerProvider.get());
        return instance;
    }

    private TeamDetailsFragment injectTeamDetailsFragment(TeamDetailsFragment instance) {
        TeamDetailsFragment_MembersInjector.injectController(instance, AppModule_ProvideTeamDetailsControllerFactory.proxyProvideTeamDetailsController(this.appModule));
        return instance;
    }

    private TeamDetailsController injectTeamDetailsController(TeamDetailsController instance) {
        TeamDetailsController_MembersInjector.injectGetTeamDetailsInteractor(instance, this.getTeamDetailsInteractorProvider.get());
        TeamDetailsController_MembersInjector.injectGetFavoriteTeamIdsInteractor(instance, this.provideGetFavoriteTeamIdsInteractorProvider.get());
        TeamDetailsController_MembersInjector.injectPutFavoriteTeamsInteractor(instance, this.providePutFavoriteTeamsInteractorProvider.get());
        TeamDetailsController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private BetslipFragment injectBetslipFragment(BetslipFragment instance) {
        BetslipFragment_MembersInjector.injectBetsController(instance, this.provideNewBetSlipControllerProvider.get());
        BetslipFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private HomeFragment injectHomeFragment(HomeFragment instance) {
        HomeFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        HomeFragment_MembersInjector.injectDailyBonusController(instance, this.provideDailyBonusControllerProvider.get());
        HomeFragment_MembersInjector.injectHomeVideoBonusController(instance, this.homeVideoBonusControllerProvider.get());
        HomeFragment_MembersInjector.injectAbTestService(instance, this.aBTestServiceProvider.get());
        HomeFragment_MembersInjector.injectGetOffersInfoInteractor(instance, this.getOffersInfoInteractorProvider.get());
        HomeFragment_MembersInjector.injectGetOffersListInteractor(instance, getGetOffersListInteractor());
        HomeFragment_MembersInjector.injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        HomeFragment_MembersInjector.injectHotMatchesInteractor(instance, this.hotMatchesInteractorProvider.get());
        HomeFragment_MembersInjector.injectMatchVarietiesInteractor(instance, this.provideMatchVarietiesInteractorProvider.get());
        HomeFragment_MembersInjector.injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        HomeFragment_MembersInjector.injectV7UserRanksInteractor(instance, this.v7UserRanksInteractorProvider.get());
        HomeFragment_MembersInjector.injectV7UserInfoInteractor(instance, this.v7UserInfoInteractorProvider.get());
        HomeFragment_MembersInjector.injectBattleActionCountsInteractor(instance, this.newUserBattleActionCountsInteractorProvider.get());
        HomeFragment_MembersInjector.injectBetListAppender(instance, this.provideBetListAppenderProvider.get());
        HomeFragment_MembersInjector.injectBetValidator(instance, this.provideBetValidatorProvider.get());
        HomeFragment_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        HomeFragment_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        HomeFragment_MembersInjector.injectSingleShopInteractor(instance, this.newSingleShopInteractorProvider.get());
        HomeFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        return instance;
    }

    private BetsListFragment injectBetsListFragment(BetsListFragment instance) {
        BetsListFragment_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        BetsListFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        BetsListFragment_MembersInjector.injectBetController(instance, this.provideNewBetSlipControllerProvider.get());
        BetsListFragment_MembersInjector.injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
        BetsListFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private MatchesTabsFragment injectMatchesTabsFragment(MatchesTabsFragment instance) {
        MatchesTabsFragment_MembersInjector.injectController(instance, this.provideMatchesControllerProvider.get());
        MatchesTabsFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private LeaguesFragment injectLeaguesFragment(LeaguesFragment instance) {
        LeaguesFragment_MembersInjector.injectController(instance, this.provideLeaguesControllerProvider.get());
        LeaguesFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private SpecificChampionshipFragment injectSpecificChampionshipFragment(SpecificChampionshipFragment instance) {
        SpecificChampionshipFragment_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectNewSpecificChampionshipInteractor(instance, this.newSpecificChampionshipInteractorProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectBetListAppender(instance, this.provideBetListAppenderProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectBetValidator(instance, this.provideBetValidatorProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectPutFavoriteLeaguesInteractor(instance, this.providePutFavoriteLeaguesInteractorProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectSingleShopInteractor(instance, this.newSingleShopInteractorProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        SpecificChampionshipFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private TopMatchesFragment injectTopMatchesFragment(TopMatchesFragment instance) {
        TopMatchesFragment_MembersInjector.injectHotMatchesInteractor(instance, this.hotMatchesInteractorProvider.get());
        TopMatchesFragment_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        return instance;
    }

    private TopMatchesTabFragment injectTopMatchesTabFragment(TopMatchesTabFragment instance) {
        TopMatchesTabFragment_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        TopMatchesTabFragment_MembersInjector.injectHotMatchesInteractor(instance, this.hotMatchesInteractorProvider.get());
        TopMatchesTabFragment_MembersInjector.injectBetListAppender(instance, this.provideBetListAppenderProvider.get());
        TopMatchesTabFragment_MembersInjector.injectBetValidator(instance, this.provideBetValidatorProvider.get());
        TopMatchesTabFragment_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        return instance;
    }

    private SportsByDateController injectSportsByDateController(SportsByDateController instance) {
        SportsByDateController_MembersInjector.injectSportsInteractor(instance, this.sportsByDateInteractorProvider.get());
        SportsByDateController_MembersInjector.injectPutFavoriteSportsInteractor(instance, this.providePutFavoriteSportsInteractorProvider.get());
        SportsByDateController_MembersInjector.injectDeleteFavoriteSportsInteractor(instance, this.provideDeleteFavoriteSportsInteractorProvider.get());
        SportsByDateController_MembersInjector.injectPutFavoriteSportsBulkInteractor(instance, this.providePutFavoriteSportsBulkInteractorProvider.get());
        SportsByDateController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        SportsByDateController_MembersInjector.injectDateFilterState(instance, this.provideDateFilterStateProvider.get());
        SportsByDateController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private SportsByDateFragment injectSportsByDateFragment(SportsByDateFragment instance) {
        SportsByDateFragment_MembersInjector.injectController(instance, getSportsByDateController());
        SportsByDateFragment_MembersInjector.injectDateFilterState(instance, this.provideDateFilterStateProvider.get());
        SportsByDateFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private LeaguesByDateController injectLeaguesByDateController(LeaguesByDateController instance) {
        LeaguesByDateController_MembersInjector.injectLeaguesInteractor(instance, this.leaguesByDateInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectPutFavoriteLeaguesInteractor(instance, this.providePutFavoriteLeaguesInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectDeleteFavoriteLeaguesInteractor(instance, this.provideDeleteFavoriteLeaguesInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectPutFavoriteLeaguesBulkInteractor(instance, this.providePutFavoriteLeaguesBulkInteractorProvider.get());
        LeaguesByDateController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        LeaguesByDateController_MembersInjector.injectDateFilterState(instance, this.provideDateFilterStateProvider.get());
        return instance;
    }

    private LeaguesByDateFragment injectLeaguesByDateFragment(LeaguesByDateFragment instance) {
        LeaguesByDateFragment_MembersInjector.injectController(instance, getLeaguesByDateController());
        LeaguesByDateFragment_MembersInjector.injectDateFilterState(instance, this.provideDateFilterStateProvider.get());
        LeaguesByDateFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private MatchesByDateFragment injectMatchesByDateFragment(MatchesByDateFragment instance) {
        MatchesByDateFragment_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        MatchesByDateFragment_MembersInjector.injectMatchesByDateInteractor(instance, this.matchesByDateInteractorProvider.get());
        MatchesByDateFragment_MembersInjector.injectBetListAppender(instance, this.provideBetListAppenderProvider.get());
        MatchesByDateFragment_MembersInjector.injectBetValidator(instance, this.provideBetValidatorProvider.get());
        MatchesByDateFragment_MembersInjector.injectDateFilterState(instance, this.provideDateFilterStateProvider.get());
        MatchesByDateFragment_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        MatchesByDateFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private UserDetailsFragmentK injectUserDetailsFragmentK(UserDetailsFragmentK instance) {
        UserDetailsFragmentK_MembersInjector.injectController(instance, AppModule_ProvideUserDetailsControllerFactory.proxyProvideUserDetailsController(this.appModule));
        UserDetailsFragmentK_MembersInjector.injectBetListController(instance, this.provideNewBetSlipControllerProvider.get());
        UserDetailsFragmentK_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private ForeignUserDetailsController injectForeignUserDetailsController(ForeignUserDetailsController instance) {
        ForeignUserDetailsController_MembersInjector.injectV7UserInfoInteractor(instance, this.v7UserInfoInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserRanksInteractor(instance, this.v7UserRanksInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserAchievementsInteractor(instance, this.v7UserAchievementsInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserFavouritesInteractor(instance, this.v7UserFavouritesInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserRankingStatisticsInteractor(instance, this.v7UserRankingStatisticsInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectV7UserFollowActionInteractor(instance, this.v7UserFollowActionInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectGetPrivateMessagesInteractor(instance, this.getPrivateMessagesInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectSendPrivateMessagesInteractor(instance, this.sendPrivateMessasgesInteractorProvider.get());
        ForeignUserDetailsController_MembersInjector.injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
        return instance;
    }

    private ForeignUserDetailsFragmentK injectForeignUserDetailsFragmentK(ForeignUserDetailsFragmentK instance) {
        ForeignUserDetailsFragmentK_MembersInjector.injectController(instance, getForeignUserDetailsController());
        ForeignUserDetailsFragmentK_MembersInjector.injectBetListController(instance, this.provideNewBetSlipControllerProvider.get());
        ForeignUserDetailsFragmentK_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private UserBattlesController injectUserBattlesController(UserBattlesController instance) {
        UserBattlesController_MembersInjector.injectNewUserAvailableChallengesInteractor(instance, this.newUserAvailableChallengesInteractorProvider.get());
        UserBattlesController_MembersInjector.injectNewUserPrivateChallengesInteractor(instance, this.newUserPrivateChallengesInteractorProvider.get());
        UserBattlesController_MembersInjector.injectNewUserChallengesHistoryInteractor(instance, this.newUserChallengesHistoryInteractorProvider.get());
        UserBattlesController_MembersInjector.injectNewUserBattleCountsInteractor(instance, this.newUserBattleCountsInteractorProvider.get());
        UserBattlesController_MembersInjector.injectUserServiceP(instance, this.userServiceProvider.get());
        return instance;
    }

    private UserBattlesFragment injectUserBattlesFragment(UserBattlesFragment instance) {
        UserBattlesFragment_MembersInjector.injectUserBattlesController(instance, getUserBattlesController());
        return instance;
    }

    private UserRankingsController injectUserRankingsController(UserRankingsController instance) {
        UserRankingsController_MembersInjector.injectV7RanksByTypeInteractor(instance, this.v7RanksByTypeInteractorProvider.get());
        return instance;
    }

    private UserRankingsFragment injectUserRankingsFragment(UserRankingsFragment instance) {
        UserRankingsFragment_MembersInjector.injectUserRankingsController(instance, getUserRankingsController());
        return instance;
    }

    private NewCompetitionsFragment injectNewCompetitionsFragment(NewCompetitionsFragment instance) {
        NewCompetitionsFragment_MembersInjector.injectCompetitionsController(instance, AppModule_ProvideCompetitionsControllerFactory.proxyProvideCompetitionsController(this.appModule));
        return instance;
    }

    private CompetitionDetailsController injectCompetitionDetailsController(CompetitionDetailsController instance) {
        CompetitionDetailsController_MembersInjector.injectCompetitionDetailsInteractor(instance, getCompetitionDetailsInteractor());
        CompetitionDetailsController_MembersInjector.injectCompetitionDetailsWithParticipantInteractor(instance, getCompetitionDetailsWithParticipantInteractor());
        CompetitionDetailsController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        CompetitionDetailsController_MembersInjector.injectPlaceBetInteractor(instance, this.providePlaceBetInteractorProvider.get());
        return instance;
    }

    private CompetitionDetailsFragment injectCompetitionDetailsFragment(CompetitionDetailsFragment instance) {
        CompetitionDetailsFragment_MembersInjector.injectCompetitionDetailsController(instance, getCompetitionDetailsController());
        return instance;
    }

    private CompetitionsPreviewFragment injectCompetitionsPreviewFragment(CompetitionsPreviewFragment instance) {
        CompetitionsPreviewFragment_MembersInjector.injectController(instance, getCompetitionDetailsController());
        return instance;
    }

    private LoginFragment injectLoginFragment(LoginFragment instance) {
        LoginFragment_MembersInjector.injectNewLoginInteractor(instance, this.newLoginInteractorProvider.get());
        LoginFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        LoginFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        LoginFragment_MembersInjector.injectV7GetCustomTokenInteractor(instance, this.provideV7GetCustomTokenInteractorProvider.get());
        return instance;
    }

    private AuthController injectAuthController(AuthController instance) {
        AuthController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        AuthController_MembersInjector.injectSocialConnectionService(instance, this.socialConnectionServiceProvider.get());
        return instance;
    }

    private AuthFragment injectAuthFragment(AuthFragment instance) {
        AuthFragment_MembersInjector.injectAuthController(instance, getAuthController());
        AuthFragment_MembersInjector.injectNewLoginInteractor(instance, this.newLoginInteractorProvider.get());
        AuthFragment_MembersInjector.injectUpgradeLoginInteractor(instance, this.provideUpgradeLoginInteractorProvider.get());
        AuthFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        AuthFragment_MembersInjector.injectV7GetCustomTokenInteractor(instance, this.provideV7GetCustomTokenInteractorProvider.get());
        AuthFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        return instance;
    }

    private NewAchievementsFragment injectNewAchievementsFragment(NewAchievementsFragment instance) {
        NewAchievementsFragment_MembersInjector.injectAchievementsController(instance, AppModule_ProvideAchievementsControllerFactory.proxyProvideAchievementsController(this.appModule));
        NewAchievementsFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private AchievementsController injectAchievementsController(AchievementsController instance) {
        AchievementsController_MembersInjector.injectAchievementsInteractor(instance, this.v7UserAchievementsInteractorProvider.get());
        return instance;
    }

    private NotificationsController injectNotificationsController(NotificationsController instance) {
        NotificationsController_MembersInjector.injectLoadEventsInteractor(instance, this.loadEventsInteractorProvider.get());
        NotificationsController_MembersInjector.injectReadAllEventsInteractor(instance, this.readAllEventsInteractorProvider.get());
        NotificationsController_MembersInjector.injectPushStorageProvider(instance, this.providePushStorageProvider.get());
        NotificationsController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private NotificationsFragment injectNotificationsFragment(NotificationsFragment instance) {
        NotificationsFragment_MembersInjector.injectNotificationsController(instance, getNotificationsController());
        NotificationsFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private BalanceHistoryFragmentK injectBalanceHistoryFragmentK(BalanceHistoryFragmentK instance) {
        BalanceHistoryFragmentK_MembersInjector.injectV7BalanceHistoryInteractor(instance, this.provideV7BalanceHistoryInteractorProvider.get());
        BalanceHistoryFragmentK_MembersInjector.injectWebGamesListInteractor(instance, this.webGamesListInteractorProvider.get());
        return instance;
    }

    private DefaultLoader injectDefaultLoader(DefaultLoader instance) {
        DefaultLoader_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        DefaultLoader_MembersInjector.injectNewLoginInteractor(instance, this.newLoginInteractorProvider.get());
        return instance;
    }

    private ShopBetcoinsFragmentK injectShopBetcoinsFragmentK(ShopBetcoinsFragmentK instance) {
        ShopBetcoinsFragmentK_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        ShopBetcoinsFragmentK_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        ShopBetcoinsFragmentK_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        ShopBetcoinsFragmentK_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        ShopBetcoinsFragmentK_MembersInjector.injectShopLayoutInteractor(instance, this.provideShopLayoutInteractorProvider.get());
        ShopBetcoinsFragmentK_MembersInjector.injectShopEntitlementClaimInteractor(instance, this.provideShopEntitlementClaimInteractorProvider.get());
        ShopBetcoinsFragmentK_MembersInjector.injectDailyBonusController(instance, this.provideDailyBonusControllerProvider.get());
        ShopBetcoinsFragmentK_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        return instance;
    }

    private PushEventsService injectPushEventsService(PushEventsService instance) {
        PushEventsService_MembersInjector.injectAppDatabase(instance, this.provideDatabaseProvider.get());
        PushEventsService_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        PushEventsService_MembersInjector.injectGetV7MyInfoInteractor(instance, this.getV7MyInfoInteractorProvider.get());
        PushEventsService_MembersInjector.injectAddEventInteractor(instance, this.addEventInteractorProvider.get());
        PushEventsService_MembersInjector.injectReadEventInteractor(instance, this.readEventInteractorProvider.get());
        PushEventsService_MembersInjector.injectReadAllEventsInteractor(instance, this.readAllEventsInteractorProvider.get());
        PushEventsService_MembersInjector.injectGetOffersInfoInteractor(instance, this.getOffersInfoInteractorProvider.get());
        PushEventsService_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        PushEventsService_MembersInjector.injectAbTestService(instance, this.aBTestServiceProvider.get());
        PushEventsService_MembersInjector.injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        PushEventsService_MembersInjector.injectInterstitialAdCoordinator(instance, this.interstitialAdCoordinatorProvider.get());
        PushEventsService_MembersInjector.injectRewardedVideoOfferCoordinator(instance, this.rewardedVideoOfferCoordinatorProvider.get());
        return instance;
    }

    private BetUpApp injectBetUpApp(BetUpApp instance) {
        BetUpApp_MembersInjector.injectChatService(instance, DoubleCheck.lazy(this.provideMessagingControllerProvider));
        BetUpApp_MembersInjector.injectUserService(instance, DoubleCheck.lazy(this.userServiceProvider));
        BetUpApp_MembersInjector.injectPushStorageProvider(instance, DoubleCheck.lazy(this.providePushStorageProvider));
        BetUpApp_MembersInjector.injectLocaleService(instance, DoubleCheck.lazy(this.provideLocaleServiceProvider));
        BetUpApp_MembersInjector.injectBalanceHolder(instance, DoubleCheck.lazy(this.balanceHolderProvider));
        BetUpApp_MembersInjector.injectDispatchingServiceInjector(instance, getDispatchingAndroidInjectorOfService());
        return instance;
    }

    private OddsDialogFragment injectOddsDialogFragment(OddsDialogFragment instance) {
        OddsDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private NotificationDialogFragment injectNotificationDialogFragment(NotificationDialogFragment instance) {
        NotificationDialogFragment_MembersInjector.injectSubscriptionService(instance, this.defaultSubscriptionServiceProvider.get());
        return instance;
    }

    private MatchesController injectMatchesController(MatchesController instance) {
        MatchesController_MembersInjector.injectSportsInteractor(instance, this.provideNewSportsInteractorProvider.get());
        MatchesController_MembersInjector.injectPutFavoriteSportsInteractor(instance, this.providePutFavoriteSportsInteractorProvider.get());
        MatchesController_MembersInjector.injectDeleteFavoriteSportsInteractor(instance, this.provideDeleteFavoriteSportsInteractorProvider.get());
        MatchesController_MembersInjector.injectPutFavoriteSportsBulkInteractor(instance, this.providePutFavoriteSportsBulkInteractorProvider.get());
        MatchesController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        MatchesController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        return instance;
    }

    private UserDetailsController injectUserDetailsController(UserDetailsController instance) {
        UserDetailsController_MembersInjector.injectV7UserInfoInteractor(instance, this.v7UserInfoInteractorProvider.get());
        UserDetailsController_MembersInjector.injectV7UserRanksInteractor(instance, this.v7UserRanksInteractorProvider.get());
        UserDetailsController_MembersInjector.injectV7UserBetStatisticsInteractor(instance, this.v7UserBetStatisticsInteractorProvider.get());
        UserDetailsController_MembersInjector.injectV7UserFollowersInteractor(instance, this.v7UserFollowersInteractorProvider.get());
        UserDetailsController_MembersInjector.injectV7UserAchievementsInteractor(instance, this.v7UserAchievementsInteractorProvider.get());
        UserDetailsController_MembersInjector.injectV7UserFavouritesInteractor(instance, this.v7UserFavouritesInteractorProvider.get());
        UserDetailsController_MembersInjector.injectV7UserRankingStatisticsInteractor(instance, this.v7UserRankingStatisticsInteractorProvider.get());
        UserDetailsController_MembersInjector.injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
        UserDetailsController_MembersInjector.injectUserServiceP(instance, this.userServiceProvider.get());
        UserDetailsController_MembersInjector.injectGetChatsInteractor(instance, this.getChatsInteractorProvider.get());
        UserDetailsController_MembersInjector.injectGetPrivateMessagesInteractor(instance, this.getPrivateMessagesInteractorProvider.get());
        UserDetailsController_MembersInjector.injectSendPrivateMessagesInteractor(instance, this.sendPrivateMessasgesInteractorProvider.get());
        UserDetailsController_MembersInjector.injectNewUserAvailableChallengesInteractor(instance, this.newUserAvailableChallengesInteractorProvider.get());
        UserDetailsController_MembersInjector.injectNewUserPrivateChallengesInteractor(instance, this.newUserPrivateChallengesInteractorProvider.get());
        UserDetailsController_MembersInjector.injectNewUserChallengesHistoryInteractor(instance, this.newUserChallengesHistoryInteractorProvider.get());
        UserDetailsController_MembersInjector.injectNewUserBattleCountsInteractor(instance, this.newUserBattleCountsInteractorProvider.get());
        UserDetailsController_MembersInjector.injectUserProfileStatisticsInteractor(instance, this.userProfileStatisticsInteractorProvider.get());
        return instance;
    }

    private FollowersDialogController injectFollowersDialogController(FollowersDialogController instance) {
        FollowersDialogController_MembersInjector.injectV7UserFollowersInteractor(instance, this.v7UserFollowersInteractorProvider.get());
        FollowersDialogController_MembersInjector.injectV7UserFollowingInteractor(instance, this.v7UserFollowingInteractorProvider.get());
        FollowersDialogController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private LeaguesController injectLeaguesController(LeaguesController instance) {
        LeaguesController_MembersInjector.injectLeaguesInteractor(instance, this.newLeaguesInteractorProvider.get());
        LeaguesController_MembersInjector.injectPutFavoriteLeaguesInteractor(instance, this.providePutFavoriteLeaguesInteractorProvider.get());
        LeaguesController_MembersInjector.injectDeleteFavoriteLeaguesInteractor(instance, this.provideDeleteFavoriteLeaguesInteractorProvider.get());
        LeaguesController_MembersInjector.injectPutFavoriteLeaguesBulkInteractor(instance, this.providePutFavoriteLeaguesBulkInteractorProvider.get());
        LeaguesController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        LeaguesController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        return instance;
    }

    private TeamsController injectTeamsController(TeamsController instance) {
        TeamsController_MembersInjector.injectTeamsInteractor(instance, this.newTeamsInteractorProvider.get());
        TeamsController_MembersInjector.injectPutFavoriteTeamsBulkInteractor(instance, this.providePutFavoriteTeamsBulkInteractorProvider.get());
        TeamsController_MembersInjector.injectPutFavoriteTeamsInteractor(instance, this.providePutFavoriteTeamsInteractorProvider.get());
        TeamsController_MembersInjector.injectDeleteFavoriteTeamsInteractor(instance, this.provideDeleteFavoriteTeamsInteractorProvider.get());
        TeamsController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        return instance;
    }

    private BetsController injectBetsController(BetsController instance) {
        BetsController_MembersInjector.injectGrabbedBetsInteractor(instance, this.provideV7GrabbedBetsInteractorProvider.get());
        BetsController_MembersInjector.injectCreateBetlistInteractor(instance, this.provideV7CreateBetlistInteractorProvider.get());
        BetsController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        BetsController_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        BetsController_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        BetsController_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        BetsController_MembersInjector.injectSingleShopInteractor(instance, this.newSingleShopInteractorProvider.get());
        BetsController_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        BetsController_MembersInjector.injectBetListAppender(instance, this.provideBetListAppenderProvider.get());
        BetsController_MembersInjector.injectChallengeTourInfoProvider(instance, this.provideChallengeTourInfoProvider.get());
        BetsController_MembersInjector.injectBetsListInteractor(instance, this.betsListInteractorProvider.get());
        BetsController_MembersInjector.injectBetsStatInteractor(instance, this.betStatInteractorProvider.get());
        BetsController_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        BetsController_MembersInjector.injectGetCancelBetInfoInteractor(instance, this.provideGetCancelBetInfoInteractorProvider.get());
        BetsController_MembersInjector.injectGetSellBetInfoInteractor(instance, this.provideGetSellBetInfoInteractorProvider.get());
        BetsController_MembersInjector.injectGetBetShareInstallLinkInteractor(instance, this.provideGetBetShareInstallLinkInteractorProvider.get());
        BetsController_MembersInjector.injectCancelBetInteractor(instance, this.provideCancelBetInteractorProvider.get());
        BetsController_MembersInjector.injectSellBetInteractor(instance, this.provideSellBetInteractorProvider.get());
        BetsController_MembersInjector.injectV7VarietyBetRestrictionsInteractor(instance, this.provideV7VarietyBetRestrictionsInteractorProvider.get());
        BetsController_MembersInjector.injectV7VarietyVersionGatesInteractor(instance, this.provideV7VarietyVersionGatesInteractorProvider.get());
        BetsController_MembersInjector.injectChallengeCreateInteractor(instance, getNewChallengeCreateInteractor());
        return instance;
    }

    private BetsPlacedController injectBetsPlacedController(BetsPlacedController instance) {
        BetsPlacedController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        BetsPlacedController_MembersInjector.injectBetsSingleBetInteractor(instance, this.singleBetInteractorProvider.get());
        return instance;
    }

    private MatchDetailsController injectMatchDetailsController(MatchDetailsController instance) {
        MatchDetailsController_MembersInjector.injectGetPromoBannerForMatchInteractor(instance, this.getPromoBannerForMatchInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectMatchesDetailsRequestInteractor(instance, this.provideMatchShortInfoInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectBetListAppender(instance, this.provideBetListAppenderProvider.get());
        MatchDetailsController_MembersInjector.injectBetValidator(instance, this.provideBetValidatorProvider.get());
        MatchDetailsController_MembersInjector.injectSubscoreService(instance, this.subscoreServiceProvider.get());
        MatchDetailsController_MembersInjector.injectUserServiceP(instance, this.userServiceProvider.get());
        MatchDetailsController_MembersInjector.injectSubscriptionService(instance, this.defaultSubscriptionServiceProvider.get());
        MatchDetailsController_MembersInjector.injectMatchBetGroupsInteractor(instance, this.provideMatchVarietiesInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectMatchMyBetsInteractor(instance, this.matchMyBetsInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectGetTeamDetailsInteractor(instance, this.getTeamDetailsInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectMatchDetailsInteractor(instance, this.provideMatchInfoInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectV7MatchStatisticsInteractor(instance, this.provideV7MatchStatisticsInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectV7StatsByVarietiesInteractor(instance, this.v7StatsByVarietiesInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectV7MatchHistoryInteractor(instance, this.provideV7MatchHistoryInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectNewChallengesInteractor(instance, getNewChallengesInteractor());
        MatchDetailsController_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        MatchDetailsController_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        MatchDetailsController_MembersInjector.injectSingleShopInteractor(instance, this.newSingleShopInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        MatchDetailsController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        MatchDetailsController_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        MatchDetailsController_MembersInjector.injectQuizAvailabilityInteractor(instance, this.quizAvailabilityInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectQuizDetailsInteractor(instance, this.quizDetailsInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectQuizTiersInteractor(instance, this.quizTiersInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectQuizParticipationInteractor(instance, this.quizParticipationInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectGetPublicChatMessagesInteractor(instance, this.getPublicChatMessagesInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectSendPublicChatMessageInteractor(instance, this.sendPublicChatMessageInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectMatchQuizParticipationInteractor(instance, this.matchQuizParticipationInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        MatchDetailsController_MembersInjector.injectV7VarietyBetRestrictionsInteractor(instance, this.provideV7VarietyBetRestrictionsInteractorProvider.get());
        MatchDetailsController_MembersInjector.injectV7VarietyVersionGatesInteractor(instance, this.provideV7VarietyVersionGatesInteractorProvider.get());
        return instance;
    }

    private CompetitionsController injectCompetitionsController(CompetitionsController instance) {
        CompetitionsController_MembersInjector.injectNewActiveCompetitionsInteractor(instance, this.provideNewActiveCompetitionsInteractorProvider.get());
        CompetitionsController_MembersInjector.injectNewCompetitionsHistoryInteractor(instance, this.provideNewCompetitionsHistoryInteractorProvider.get());
        CompetitionsController_MembersInjector.injectCompetitionHistoryCountInteractor(instance, getCompetitionHistoryCountInteractor());
        return instance;
    }

    private ChangeCountryDialogFragment injectChangeCountryDialogFragment(ChangeCountryDialogFragment instance) {
        ChangeCountryDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        ChangeCountryDialogFragment_MembersInjector.injectGetCountriesInteractor(instance, this.getV7CountriesInteractorProvider.get());
        ChangeCountryDialogFragment_MembersInjector.injectChangeCountryInteractor(instance, this.changeV7CountryInteractorProvider.get());
        return instance;
    }

    private ChangeLanguageFragment injectChangeLanguageFragment(ChangeLanguageFragment instance) {
        ChangeLanguageFragment_MembersInjector.injectPushTokenService(instance, this.pushTokenServiceProvider.get());
        ChangeLanguageFragment_MembersInjector.injectAppLanguageObserver(instance, this.provideAppLanguageObserverProvider.get());
        return instance;
    }

    private DefaultSubscriptionService injectDefaultSubscriptionService(DefaultSubscriptionService instance) {
        DefaultSubscriptionService_MembersInjector.injectGetV7MatchSubscriptionInteractor(instance, this.getV7MatchSubscriptionInteractorProvider.get());
        DefaultSubscriptionService_MembersInjector.injectUpdateV7MatchSubscriptionInteractor(instance, this.updateV7MatchSubscriptionInteractorProvider.get());
        return instance;
    }

    private SupportController injectSupportController(SupportController instance) {
        SupportController_MembersInjector.injectGetV7FAQInteractor(instance, this.getV7FAQInteractorProvider.get());
        SupportController_MembersInjector.injectGetV7SupportInfoInteractor(instance, this.getV7SupportInfoInteractorProvider.get());
        SupportController_MembersInjector.injectGetV7SupportMessagesInteractor(instance, this.getV7SupportMessagesInteractorProvider.get());
        SupportController_MembersInjector.injectSendV7SupportMessageInteractor(instance, this.sendV7SupportMessageInteractorProvider.get());
        SupportController_MembersInjector.injectSendV7ReportInteractor(instance, this.sendV7ReportInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportChatsInteractor(instance, this.getSupportChatsInteractorProvider.get());
        SupportController_MembersInjector.injectCreateSupportChatInteractor(instance, this.createSupportChatInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportChatInteractor(instance, this.getSupportChatInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportChatMessagesInteractor(instance, this.getSupportChatMessagesInteractorProvider.get());
        SupportController_MembersInjector.injectSendSupportChatMessageInteractor(instance, this.sendSupportChatMessageInteractorProvider.get());
        SupportController_MembersInjector.injectCloseSupportChatInteractor(instance, this.closeSupportChatInteractorProvider.get());
        SupportController_MembersInjector.injectGetSupportCategoriesInteractor(instance, this.getSupportCategoriesInteractorProvider.get());
        SupportController_MembersInjector.injectGetDeleteAccountInfoInteractor(instance, this.getDeleteAccountInfoInteractorProvider.get());
        SupportController_MembersInjector.injectSendDeleteAccountInteractor(instance, this.sendDeleteAccountInteractorProvider.get());
        SupportController_MembersInjector.injectCancelAccountDeletionRequestInteractor(instance, this.cancelAccountDeletionRequestInteractorProvider.get());
        SupportController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private SupportFragmentK injectSupportFragmentK(SupportFragmentK instance) {
        SupportFragmentK_MembersInjector.injectController(instance, getSupportController());
        return instance;
    }

    private PromoFragment injectPromoFragment(PromoFragment instance) {
        PromoFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private DailyBonusDialogFragment injectDailyBonusDialogFragment(DailyBonusDialogFragment instance) {
        DailyBonusDialogFragment_MembersInjector.injectController(instance, this.provideDailyBonusControllerProvider.get());
        DailyBonusDialogFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        return instance;
    }

    private DailyBonusController injectDailyBonusController(DailyBonusController instance) {
        DailyBonusController_MembersInjector.injectV7DailyBonusInteractor(instance, this.provideV7DailyBonusInteractorProvider.get());
        DailyBonusController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private BettingSheetDialog injectBettingSheetDialog(BettingSheetDialog instance) {
        BettingSheetDialog_MembersInjector.injectBetsSlipController(instance, this.provideNewBetSlipControllerProvider.get());
        return instance;
    }

    private OneClickBetSettingsDialogFragment injectOneClickBetSettingsDialogFragment(OneClickBetSettingsDialogFragment instance) {
        OneClickBetSettingsDialogFragment_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        OneClickBetSettingsDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        OneClickBetSettingsDialogFragment_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        OneClickBetSettingsDialogFragment_MembersInjector.injectUnlockOneClickBetInteractor(instance, this.unlockOneClickBetInteractorProvider.get());
        OneClickBetSettingsDialogFragment_MembersInjector.injectV7OneClickBetSettingsInteractor(instance, this.provideV7OneClickBetSettingsInteractorProvider.get());
        OneClickBetSettingsDialogFragment_MembersInjector.injectBetsController(instance, this.provideNewBetSlipControllerProvider.get());
        return instance;
    }

    private EditFavouritesDialog injectEditFavouritesDialog(EditFavouritesDialog instance) {
        EditFavouritesDialog_MembersInjector.injectMatchesController(instance, this.provideMatchesControllerProvider.get());
        EditFavouritesDialog_MembersInjector.injectLeaguesController(instance, this.provideLeaguesControllerProvider.get());
        EditFavouritesDialog_MembersInjector.injectTeamsController(instance, AppModule_ProvideTeamsControllerFactory.proxyProvideTeamsController(this.appModule));
        return instance;
    }

    private FollowersDialog injectFollowersDialog(FollowersDialog instance) {
        FollowersDialog_MembersInjector.injectFollowersDialogController(instance, AppModule_ProvideFollowersDialogControllerFactory.proxyProvideFollowersDialogController(this.appModule));
        return instance;
    }

    private BetsFragment injectBetsFragment(BetsFragment instance) {
        BetsFragment_MembersInjector.injectController(instance, this.provideNewBetSlipControllerProvider.get());
        return instance;
    }

    private QuizResultsController injectQuizResultsController(QuizResultsController instance) {
        QuizResultsController_MembersInjector.injectQuizParticipationsInteractor(instance, this.quizParticipationsInteractorProvider.get());
        QuizResultsController_MembersInjector.injectQuizStateCountInteractor(instance, this.quizStateCountInteractorProvider.get());
        return instance;
    }

    private QuizResultsFragment injectQuizResultsFragment(QuizResultsFragment instance) {
        QuizResultsFragment_MembersInjector.injectController(instance, getQuizResultsController());
        return instance;
    }

    private QuizParticipationDialog injectQuizParticipationDialog(QuizParticipationDialog instance) {
        QuizParticipationDialog_MembersInjector.injectGetParticipationInteractor(instance, this.getParticipationInteractorProvider.get());
        return instance;
    }

    private FlashBetDetailsDialogFragment injectFlashBetDetailsDialogFragment(FlashBetDetailsDialogFragment instance) {
        FlashBetDetailsDialogFragment_MembersInjector.injectGetFlashBetSessionInteractor(instance, this.provideGetFlashBetSessionInteractorProvider.get());
        FlashBetDetailsDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private FlashBetAbandonedSessionDialogFragment injectFlashBetAbandonedSessionDialogFragment(FlashBetAbandonedSessionDialogFragment instance) {
        FlashBetAbandonedSessionDialogFragment_MembersInjector.injectGetFlashBetSessionInteractor(instance, this.provideGetFlashBetSessionInteractorProvider.get());
        return instance;
    }

    private BetDetailDialog injectBetDetailDialog(BetDetailDialog instance) {
        BetDetailDialog_MembersInjector.injectBetController(instance, this.provideNewBetSlipControllerProvider.get());
        BetDetailDialog_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        BetDetailDialog_MembersInjector.injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
        return instance;
    }

    private ShopDialogFragment injectShopDialogFragment(ShopDialogFragment instance) {
        ShopDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        ShopDialogFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        return instance;
    }

    private UserServiceAccessor injectUserServiceAccessor(UserServiceAccessor instance) {
        UserServiceAccessor_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        UserServiceAccessor_MembersInjector.injectReportDailyQuestClientEventInteractor(instance, this.reportDailyQuestClientEventInteractorProvider.get());
        return instance;
    }

    private NewSearchFragment injectNewSearchFragment(NewSearchFragment instance) {
        NewSearchFragment_MembersInjector.injectSearchController(instance, this.provideSearchControllerProvider.get());
        NewSearchFragment_MembersInjector.injectRecentSearchesService(instance, this.recentSearchesServiceProvider.get());
        return instance;
    }

    private SearchBottomSheetFragment injectSearchBottomSheetFragment(SearchBottomSheetFragment instance) {
        SearchBottomSheetFragment_MembersInjector.injectSearchController(instance, this.provideSearchControllerProvider.get());
        SearchBottomSheetFragment_MembersInjector.injectRecentSearchesService(instance, this.recentSearchesServiceProvider.get());
        return instance;
    }

    private SearchController injectSearchController(SearchController instance) {
        SearchController_MembersInjector.injectSearchMatchesInteractor(instance, this.v7SearchMatchesInteractorProvider.get());
        SearchController_MembersInjector.injectSearchTeamsInteractor(instance, this.v7SearchTeamsInteractorProvider.get());
        SearchController_MembersInjector.injectSearchLeaguesInteractor(instance, this.v7SearchLeaguesInteractorProvider.get());
        SearchController_MembersInjector.injectSearchUsersInteractor(instance, this.v7SearchUsersInteractorProvider.get());
        SearchController_MembersInjector.injectTrendingItemsInteractor(instance, this.v7TrendingItemsInteractorProvider.get());
        return instance;
    }

    private BetListResultDialogFragment injectBetListResultDialogFragment(BetListResultDialogFragment instance) {
        BetListResultDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        BetListResultDialogFragment_MembersInjector.injectSingleBetInteractor(instance, this.singleBetInteractorProvider.get());
        BetListResultDialogFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        BetListResultDialogFragment_MembersInjector.injectGetBetShareInstallLinkInteractor(instance, this.provideGetBetShareInstallLinkInteractorProvider.get());
        BetListResultDialogFragment_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        BetListResultDialogFragment_MembersInjector.injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
        return instance;
    }

    private WelcomeDialog injectWelcomeDialog(WelcomeDialog instance) {
        WelcomeDialog_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        return instance;
    }

    private BetPlacedDialog injectBetPlacedDialog(BetPlacedDialog instance) {
        BetPlacedDialog_MembersInjector.injectBetsPlacedController(instance, this.provideBetsPlacedControllerProvider.get());
        BetPlacedDialog_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        BetPlacedDialog_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        BetPlacedDialog_MembersInjector.injectGetBetShareInstallLinkInteractor(instance, this.provideGetBetShareInstallLinkInteractorProvider.get());
        BetPlacedDialog_MembersInjector.injectScreenTracker(instance, this.screenTrackerProvider.get());
        return instance;
    }

    private TourCompletedDialogFragment injectTourCompletedDialogFragment(TourCompletedDialogFragment instance) {
        TourCompletedDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private NotEnoughBetcoinsVideoOfferDialog injectNotEnoughBetcoinsVideoOfferDialog(NotEnoughBetcoinsVideoOfferDialog instance) {
        NotEnoughBetcoinsVideoOfferDialog_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        return instance;
    }

    private NotEnoughBetcoinsVideoOfferDialogFragment injectNotEnoughBetcoinsVideoOfferDialogFragment(NotEnoughBetcoinsVideoOfferDialogFragment instance) {
        NotEnoughBetcoinsVideoOfferDialogFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        NotEnoughBetcoinsVideoOfferDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private RewardedVideoOfferDialogFragment injectRewardedVideoOfferDialogFragment(RewardedVideoOfferDialogFragment instance) {
        RewardedVideoOfferDialogFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        RewardedVideoOfferDialogFragment_MembersInjector.injectRewardedVideoOfferCoordinator(instance, this.rewardedVideoOfferCoordinatorProvider.get());
        return instance;
    }

    private UnlockBetAmountDialog injectUnlockBetAmountDialog(UnlockBetAmountDialog instance) {
        UnlockBetAmountDialog_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private UnlockBetGroupsDialog injectUnlockBetGroupsDialog(UnlockBetGroupsDialog instance) {
        UnlockBetGroupsDialog_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private UnlockBetGroupsDialogFragment injectUnlockBetGroupsDialogFragment(UnlockBetGroupsDialogFragment instance) {
        UnlockBetGroupsDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private DialogConsent injectDialogConsent(DialogConsent instance) {
        DialogConsent_MembersInjector.injectLocalPreferencesService(instance, this.localPreferencesServiceProvider.get());
        return instance;
    }

    private MiniGameActivity injectMiniGameActivity(MiniGameActivity instance) {
        MiniGameActivity_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        MiniGameActivity_MembersInjector.injectGamesNavigationService(instance, this.provideGamesNavigationControllerProvider.get());
        MiniGameActivity_MembersInjector.injectNavigationService(instance, this.provideNavigationControllerProvider.get());
        MiniGameActivity_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        MiniGameActivity_MembersInjector.injectServerErrorsProcessor(instance, this.serverErrorsProcessorProvider.get());
        MiniGameActivity_MembersInjector.injectAbTestService(instance, this.aBTestServiceProvider.get());
        MiniGameActivity_MembersInjector.injectInterstitialAdController(instance, this.provideInterstitialAdControllerProvider.get());
        MiniGameActivity_MembersInjector.injectAdUnitRegistry(instance, this.adUnitRegistryProvider.get());
        MiniGameActivity_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        MiniGameActivity_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        MiniGameActivity_MembersInjector.injectInterstitialAdCoordinator(instance, this.interstitialAdCoordinatorProvider.get());
        MiniGameActivity_MembersInjector.injectPromoInterstitialRulesSync(instance, this.promoInterstitialRulesSyncProvider.get());
        return instance;
    }

    private DiceFragment injectDiceFragment(DiceFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        DiceFragment_MembersInjector.injectGetDiceGameConfigInteractor(instance, this.getDiceGameConfigInteractorProvider.get());
        DiceFragment_MembersInjector.injectSendDiceGameResultInteractor(instance, this.sendDiceGameResultInteractorProvider.get());
        DiceFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        return instance;
    }

    private TicketsInfoDialog injectTicketsInfoDialog(TicketsInfoDialog instance) {
        TicketsInfoDialog_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        TicketsInfoDialog_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private GamesListFragment injectGamesListFragment(GamesListFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        GamesListFragment_MembersInjector.injectWebGamesListInteractor(instance, this.webGamesListInteractorProvider.get());
        GamesListFragment_MembersInjector.injectWebGameSessionCodeInteractor(instance, this.webGameSessionCodeInteractorProvider.get());
        return instance;
    }

    private HigherLowerGameFragment injectHigherLowerGameFragment(HigherLowerGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        HigherLowerGameFragment_MembersInjector.injectConfigInteractor(instance, this.higherLowerGameConfigInteractorProvider.get());
        HigherLowerGameFragment_MembersInjector.injectStartGameInteractor(instance, this.startHighLowGameInteractorProvider.get());
        HigherLowerGameFragment_MembersInjector.injectContinueGameInteractor(instance, this.continueHighLowGameInteractorProvider.get());
        HigherLowerGameFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        HigherLowerGameFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private WarGameFragment injectWarGameFragment(WarGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        WarGameFragment_MembersInjector.injectGetWarGameConfigInteractor(instance, this.getWarGameConfigInteractorProvider.get());
        WarGameFragment_MembersInjector.injectStarWarInteractor(instance, this.startWarGameInteractorProvider.get());
        WarGameFragment_MembersInjector.injectContinueWarGameInteractor(instance, this.continueWarGameInteractorProvider.get());
        WarGameFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        return instance;
    }

    private OffersDialogFragment injectOffersDialogFragment(OffersDialogFragment instance) {
        OffersDialogFragment_MembersInjector.injectGetOffersListInteractor(instance, getGetOffersListInteractor());
        OffersDialogFragment_MembersInjector.injectSingleSingleOfferInteractor(instance, this.getSingleOfferInfoInteractorProvider.get());
        OffersDialogFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        return instance;
    }

    private SpecialOfferDialogFragment injectSpecialOfferDialogFragment(SpecialOfferDialogFragment instance) {
        SpecialOfferDialogFragment_MembersInjector.injectGetSingleOfferInteractor(instance, this.getSingleOfferInfoInteractorProvider.get());
        SpecialOfferDialogFragment_MembersInjector.injectGetSignatureForOfferInteractor(instance, this.getSignatureForOfferInteractorProvider.get());
        SpecialOfferDialogFragment_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        SpecialOfferDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        SpecialOfferDialogFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        SpecialOfferDialogFragment_MembersInjector.injectDailyBonusController(instance, this.provideDailyBonusControllerProvider.get());
        return instance;
    }

    private SpecialOfferPageFragment injectSpecialOfferPageFragment(SpecialOfferPageFragment instance) {
        SpecialOfferPageFragment_MembersInjector.injectGetSignatureForOfferInteractor(instance, this.getSignatureForOfferInteractorProvider.get());
        SpecialOfferPageFragment_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        SpecialOfferPageFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        SpecialOfferPageFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        SpecialOfferPageFragment_MembersInjector.injectDailyBonusController(instance, this.provideDailyBonusControllerProvider.get());
        return instance;
    }

    private WebGameDialogFragment injectWebGameDialogFragment(WebGameDialogFragment instance) {
        WebGameDialogFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        WebGameDialogFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        WebGameDialogFragment_MembersInjector.injectReportDailyQuestClientEventInteractor(instance, this.reportDailyQuestClientEventInteractorProvider.get());
        WebGameDialogFragment_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        return instance;
    }

    private WebGameWinVideoOfferDialogFragment injectWebGameWinVideoOfferDialogFragment(WebGameWinVideoOfferDialogFragment instance) {
        WebGameWinVideoOfferDialogFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        WebGameWinVideoOfferDialogFragment_MembersInjector.injectPromoService(instance, this.promoServiceProvider.get());
        return instance;
    }

    private BonusOfferWebViewFragment injectBonusOfferWebViewFragment(BonusOfferWebViewFragment instance) {
        BonusOfferWebViewFragment_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        return instance;
    }

    private SubscriptionDialog injectSubscriptionDialog(SubscriptionDialog instance) {
        SubscriptionDialog_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        SubscriptionDialog_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private RewardReceivedDialog injectRewardReceivedDialog(RewardReceivedDialog instance) {
        RewardReceivedDialog_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        return instance;
    }

    private LuckyCellsGameFragment injectLuckyCellsGameFragment(LuckyCellsGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        LuckyCellsGameFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        LuckyCellsGameFragment_MembersInjector.injectGetGameConfigInteractor(instance, this.getConfigLuckyCellsGameInteractorProvider.get());
        LuckyCellsGameFragment_MembersInjector.injectStartGameInteractor(instance, this.startLuckyCellsGameInteractorProvider.get());
        LuckyCellsGameFragment_MembersInjector.injectContinueGameInteractor(instance, this.continueLuckyCellsGameInteractorProvider.get());
        LuckyCellsGameFragment_MembersInjector.injectCompleteLuckyCellsGameInteractor(instance, this.completeLuckyCellsGameInteractorProvider.get());
        LuckyCellsGameFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private DoubleGameFragment injectDoubleGameFragment(DoubleGameFragment instance) {
        BaseGameFragment_MembersInjector.injectBalanceHolder(instance, this.balanceHolderProvider.get());
        DoubleGameFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        DoubleGameFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        DoubleGameFragment_MembersInjector.injectGetConfigDoubleGameInteractor(instance, this.getConfigDoubleGameInteractorProvider.get());
        DoubleGameFragment_MembersInjector.injectStartGameInteractor(instance, this.startDoubleGameInteractorProvider.get());
        DoubleGameFragment_MembersInjector.injectFinishGameInteractor(instance, this.finishDoubleGameInteractorProvider.get());
        DoubleGameFragment_MembersInjector.injectGetHistoryGameInteractor(instance, this.getHistoryDoubleGameInteractorProvider.get());
        return instance;
    }

    private ResultDoubleGameDialog injectResultDoubleGameDialog(ResultDoubleGameDialog instance) {
        ResultDoubleGameDialog_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        return instance;
    }

    private OfferFragment injectOfferFragment(OfferFragment instance) {
        OfferFragment_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        OfferFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        OfferFragment_MembersInjector.injectGetSignatureForOfferInteractor(instance, this.getSignatureForOfferInteractorProvider.get());
        OfferFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        OfferFragment_MembersInjector.injectDailyBonusController(instance, this.provideDailyBonusControllerProvider.get());
        return instance;
    }

    private TimerContent injectTimerContent(TimerContent instance) {
        TimerContent_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        TimerContent_MembersInjector.injectServerInfoInteractor(instance, this.provideV7GetServerInfoInteractorProvider.get());
        return instance;
    }

    private PriceContent injectPriceContent(PriceContent instance) {
        PriceContent_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        return instance;
    }

    private ButtonContent injectButtonContent(ButtonContent instance) {
        ButtonContent_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        return instance;
    }

    private SportsSelectionController injectSportsSelectionController(SportsSelectionController instance) {
        SportsSelectionController_MembersInjector.injectSportsInteractor(instance, this.provideNewSportsInteractorProvider.get());
        SportsSelectionController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        return instance;
    }

    private CreateBattleDialogFragment injectCreateBattleDialogFragment(CreateBattleDialogFragment instance) {
        CreateBattleDialogFragment_MembersInjector.injectController(instance, getSportsSelectionController());
        return instance;
    }

    private LeagueSelectionController injectLeagueSelectionController(LeagueSelectionController instance) {
        LeagueSelectionController_MembersInjector.injectLeaguesInteractor(instance, this.newLeaguesInteractorProvider.get());
        LeagueSelectionController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        return instance;
    }

    private SelectLeagueDialogFragment injectSelectLeagueDialogFragment(SelectLeagueDialogFragment instance) {
        SelectLeagueDialogFragment_MembersInjector.injectController(instance, getLeagueSelectionController());
        return instance;
    }

    private MatchSelectionController injectMatchSelectionController(MatchSelectionController instance) {
        MatchSelectionController_MembersInjector.injectMatchesInteractor(instance, this.newLeagueMatchesInteractorProvider.get());
        MatchSelectionController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        return instance;
    }

    private SelectMatchDialogFragment injectSelectMatchDialogFragment(SelectMatchDialogFragment instance) {
        SelectMatchDialogFragment_MembersInjector.injectController(instance, getMatchSelectionController());
        return instance;
    }

    private BetSelectionController injectBetSelectionController(BetSelectionController instance) {
        BetSelectionController_MembersInjector.injectMatchBetGroupsInteractor(instance, this.provideMatchVarietiesInteractorProvider.get());
        BetSelectionController_MembersInjector.injectMatchDetailsInteractor(instance, this.provideMatchShortInfoInteractorProvider.get());
        BetSelectionController_MembersInjector.injectChallengeAcceptInteractor(instance, getChallengeAcceptInteractor());
        BetSelectionController_MembersInjector.injectNewChallengeDetailsInteractor(instance, getNewChallengeDetailsInteractor());
        BetSelectionController_MembersInjector.injectBillingService(instance, this.billingServiceProvider.get());
        BetSelectionController_MembersInjector.injectFirebaseRemoteConfig(instance, this.provideFirebaseRemoteConfigProvider.get());
        BetSelectionController_MembersInjector.injectSingleShopInteractor(instance, this.newSingleShopInteractorProvider.get());
        BetSelectionController_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        BetSelectionController_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        BetSelectionController_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        BetSelectionController_MembersInjector.injectMatchFilterState(instance, this.provideMatchFilterStateProvider.get());
        return instance;
    }

    private SelectBetDialogFragment injectSelectBetDialogFragment(SelectBetDialogFragment instance) {
        SelectBetDialogFragment_MembersInjector.injectController(instance, getBetSelectionController());
        return instance;
    }

    private ChallengeAcceptController injectChallengeAcceptController(ChallengeAcceptController instance) {
        ChallengeAcceptController_MembersInjector.injectChallengeCreateInteractor(instance, getNewChallengeCreateInteractor());
        ChallengeAcceptController_MembersInjector.injectChallengeAcceptInteractor(instance, getChallengeAcceptInteractor());
        ChallengeAcceptController_MembersInjector.injectUserServiceP(instance, this.userServiceProvider.get());
        ChallengeAcceptController_MembersInjector.injectNewChallengeDetailsInteractor(instance, getNewChallengeDetailsInteractor());
        ChallengeAcceptController_MembersInjector.injectMatchShortInfoInteractor(instance, this.provideMatchShortInfoInteractorProvider.get());
        ChallengeAcceptController_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        return instance;
    }

    private ChallengeAcceptDialogFragment injectChallengeAcceptDialogFragment(ChallengeAcceptDialogFragment instance) {
        ChallengeAcceptDialogFragment_MembersInjector.injectController(instance, getChallengeAcceptController());
        ChallengeAcceptDialogFragment_MembersInjector.injectBetController(instance, this.provideNewBetSlipControllerProvider.get());
        return instance;
    }

    private ChallengePreviewController injectChallengePreviewController(ChallengePreviewController instance) {
        ChallengePreviewController_MembersInjector.injectUserServiceP(instance, this.userServiceProvider.get());
        ChallengePreviewController_MembersInjector.injectNewChallengeDetailsInteractor(instance, getNewChallengeDetailsInteractor());
        ChallengePreviewController_MembersInjector.injectChallengeCancelInteractor(instance, getChallengeCancelInteractor());
        return instance;
    }

    private ChallengePreviewNewDialogFragment injectChallengePreviewNewDialogFragment(ChallengePreviewNewDialogFragment instance) {
        ChallengePreviewNewDialogFragment_MembersInjector.injectController(instance, getChallengePreviewController());
        return instance;
    }

    private PushNotificationDialogFragment injectPushNotificationDialogFragment(PushNotificationDialogFragment instance) {
        PushNotificationDialogFragment_MembersInjector.injectAnalyticsService(instance, this.provideAnalyticsServiceProvider.get());
        PushNotificationDialogFragment_MembersInjector.injectHomeDailyQuestController(instance, this.homeDailyQuestControllerProvider.get());
        PushNotificationDialogFragment_MembersInjector.injectUserService(instance, this.userServiceProvider.get());
        return instance;
    }

    private WheelOfFortuneFragment injectWheelOfFortuneFragment(WheelOfFortuneFragment instance) {
        WheelOfFortuneFragment_MembersInjector.injectVideoRewardService(instance, this.videoRewardServiceProvider.get());
        WheelOfFortuneFragment_MembersInjector.injectRewardController(instance, this.wheelOfFortuneRewardControllerProvider.get());
        WheelOfFortuneFragment_MembersInjector.injectHomeVideoBonusController(instance, this.homeVideoBonusControllerProvider.get());
        return instance;
    }

    private ChangeDisplayNameInteractorAccessor injectChangeDisplayNameInteractorAccessor(ChangeDisplayNameInteractorAccessor instance) {
        ChangeDisplayNameInteractorAccessor_MembersInjector.injectChangeV7NameInteractor(instance, this.changeV7NameInteractorProvider.get());
        return instance;
    }

    private ReferralCodeInteractorAccessor injectReferralCodeInteractorAccessor(ReferralCodeInteractorAccessor instance) {
        ReferralCodeInteractorAccessor_MembersInjector.injectV7ReferralInteractor(instance, this.provideV7ReferralInteractorProvider.get());
        return instance;
    }

    private FlashBetFragment injectFlashBetFragment(FlashBetFragment instance) {
        FlashBetFragment_MembersInjector.injectFlashBetController(instance, getFlashBetController());
        return instance;
    }

    private FlashBetCategoriesFragment injectFlashBetCategoriesFragment(FlashBetCategoriesFragment instance) {
        FlashBetCategoriesFragment_MembersInjector.injectFlashBetCategoriesController(instance, getFlashBetCategoriesController());
        return instance;
    }

    private FlashBetMatchStartFragment injectFlashBetMatchStartFragment(FlashBetMatchStartFragment instance) {
        FlashBetMatchStartFragment_MembersInjector.injectController(instance, getFlashBetMatchStartController());
        return instance;
    }

    private FlashBetGameFragment injectFlashBetGameFragment(FlashBetGameFragment instance) {
        FlashBetGameFragment_MembersInjector.injectController(instance, getFlashBetGameController());
        return instance;
    }

    private FlashBetLeaveConfirmDialogFragment injectFlashBetLeaveConfirmDialogFragment(FlashBetLeaveConfirmDialogFragment instance) {
        FlashBetLeaveConfirmDialogFragment_MembersInjector.injectLeaveFlashBetSessionInteractor(instance, this.provideLeaveFlashBetSessionInteractorProvider.get());
        return instance;
    }

    public static final class Builder {
        private AppModule appModule;
        private RestModule restModule;

        private Builder() {
        }

        public AppComponent build() {
            if (this.appModule == null) {
                throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
            }
            if (this.restModule == null) {
                this.restModule = new RestModule();
            }
            return new DaggerAppComponent(this);
        }

        public Builder appModule(AppModule appModule) {
            this.appModule = (AppModule) Preconditions.checkNotNull(appModule);
            return this;
        }

        public Builder restModule(RestModule restModule) {
            this.restModule = (RestModule) Preconditions.checkNotNull(restModule);
            return this;
        }
    }

    private final class MyFirebaseMessagingServiceSubcomponentBuilder extends ServiceModule_ContributeMyFirebaseMessagingService.MyFirebaseMessagingServiceSubcomponent.Builder {
        private MyFirebaseMessagingService seedInstance;

        private MyFirebaseMessagingServiceSubcomponentBuilder() {
        }

        @Override // dagger.android.AndroidInjector.Builder
        public AndroidInjector<MyFirebaseMessagingService> build() {
            if (this.seedInstance == null) {
                throw new IllegalStateException(MyFirebaseMessagingService.class.getCanonicalName() + " must be set");
            }
            return new MyFirebaseMessagingServiceSubcomponentImpl(this);
        }

        @Override // dagger.android.AndroidInjector.Builder
        public void seedInstance(MyFirebaseMessagingService arg0) {
            this.seedInstance = (MyFirebaseMessagingService) Preconditions.checkNotNull(arg0);
        }
    }

    private final class MyFirebaseMessagingServiceSubcomponentImpl implements ServiceModule_ContributeMyFirebaseMessagingService.MyFirebaseMessagingServiceSubcomponent {
        private MyFirebaseMessagingServiceSubcomponentImpl(MyFirebaseMessagingServiceSubcomponentBuilder builder) {
        }

        @Override // dagger.android.AndroidInjector
        public void inject(MyFirebaseMessagingService arg0) {
            injectMyFirebaseMessagingService(arg0);
        }

        private MyFirebaseMessagingService injectMyFirebaseMessagingService(MyFirebaseMessagingService instance) {
            MyFirebaseMessagingService_MembersInjector.injectUserService(instance, (UserService) DaggerAppComponent.this.userServiceProvider.get());
            MyFirebaseMessagingService_MembersInjector.injectAbTestService(instance, (ABTestService) DaggerAppComponent.this.aBTestServiceProvider.get());
            return instance;
        }
    }
}
