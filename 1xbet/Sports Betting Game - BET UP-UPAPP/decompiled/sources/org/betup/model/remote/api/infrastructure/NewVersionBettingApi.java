package org.betup.model.remote.api.infrastructure;

import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.betup.model.remote.api.rest.energy.AcceptChallengeRequestBody;
import org.betup.model.remote.api.rest.energy.NewCreateChallengeModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsResponseModel;
import org.betup.model.remote.api.rest.user.changephoto.model.ChangePhotoModel;
import org.betup.model.remote.entity.achievements.NewAchievementsResponseModel;
import org.betup.model.remote.entity.betslip.V7BetlistPlacementResponse;
import org.betup.model.remote.entity.betslip.V7CreateBetlistRequestModel;
import org.betup.model.remote.entity.betslip.V7GrabbedBetsRequestModel;
import org.betup.model.remote.entity.betslip.V7GrabbedBetsResponse;
import org.betup.model.remote.entity.billing.SubscriptionPurchaseRequestModel;
import org.betup.model.remote.entity.billing.UserOfferRequestModel;
import org.betup.model.remote.entity.billing.UserPurchaseRequestModel;
import org.betup.model.remote.entity.bonus.V7DailyBonusResponse;
import org.betup.model.remote.entity.casino.CasinoAuthTokenModel;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.NewChallengeCreatedModel;
import org.betup.model.remote.entity.challenges.NewChallengesResponseModel;
import org.betup.model.remote.entity.challenges.NewUserBattlesResponseModel;
import org.betup.model.remote.entity.challenges.UserBattleActionCountsModel;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.challenges.V7UserBattlesHistoryResponseModel;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.model.remote.entity.competitions.CompetitionHistoryCountModel;
import org.betup.model.remote.entity.competitions.CompetitionHistoryResponseModel;
import org.betup.model.remote.entity.competitions.NewCompetitionsResponseModel;
import org.betup.model.remote.entity.competitions.PlaceBetRequestModel;
import org.betup.model.remote.entity.competitions.PlaceBetResponseModel;
import org.betup.model.remote.entity.country.CountryResponseModel;
import org.betup.model.remote.entity.followers.NewUserFollowerResponseModel;
import org.betup.model.remote.entity.leagues.NewLeaguesResponse;
import org.betup.model.remote.entity.login.CustomTokenRequestModel;
import org.betup.model.remote.entity.login.CustomTokenResponseModel;
import org.betup.model.remote.entity.login.LoginRequestModel;
import org.betup.model.remote.entity.login.LoginResponseModel;
import org.betup.model.remote.entity.login.UserUpgradeResultModel;
import org.betup.model.remote.entity.matches.NewMatchesResponseModel;
import org.betup.model.remote.entity.matches.championship.specific.NewMatchesForLeagueModel;
import org.betup.model.remote.entity.matches.details.CreateQuizParticipationModel;
import org.betup.model.remote.entity.matches.details.CreateQuizRequestModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsQuizAvailabilityModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsResponseModel;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetsResponseModel;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.QuizModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationListResponseModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationResponseModel;
import org.betup.model.remote.entity.matches.details.QuizTierModel;
import org.betup.model.remote.entity.matches.history.NewMatchHistoryResponseModel;
import org.betup.model.remote.entity.matches.statistics.NewMatchStatisticsResponseModel;
import org.betup.model.remote.entity.matches.statistics.VarietyStatsModel;
import org.betup.model.remote.entity.matches.topmatches.HotMatchesResponseModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.betup.model.remote.entity.quiz.QuizShortParticipationModel;
import org.betup.model.remote.entity.quiz.QuizStateCountModel;
import org.betup.model.remote.entity.rewards.RewardModel;
import org.betup.model.remote.entity.search.TrendingItemsResponse;
import org.betup.model.remote.entity.search.V7SearchLeaguesResponse;
import org.betup.model.remote.entity.search.V7SearchMatchesResponse;
import org.betup.model.remote.entity.search.V7SearchTeamsResponse;
import org.betup.model.remote.entity.search.V7SearchUsersResponse;
import org.betup.model.remote.entity.server.ServerInfoModel;
import org.betup.model.remote.entity.share.BetShareInstallLinkResponse;
import org.betup.model.remote.entity.shop.CancelBetInfoModel;
import org.betup.model.remote.entity.shop.NewShopItemModel;
import org.betup.model.remote.entity.shop.SellBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetRequestModel;
import org.betup.model.remote.entity.shop.SellBetResultModel;
import org.betup.model.remote.entity.shop.ShopEntitlementClaimResultModel;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.model.remote.entity.shop.ShopLayoutModel;
import org.betup.model.remote.entity.sports.NewSportsResponse;
import org.betup.model.remote.entity.subscription.SubscriptionResponseModel;
import org.betup.model.remote.entity.subscription.V7MatchSubscriptionUpdateRequest;
import org.betup.model.remote.entity.support.FAQModel;
import org.betup.model.remote.entity.support.SupportReportRequestModel;
import org.betup.model.remote.entity.support.V7SupportMessageDto;
import org.betup.model.remote.entity.support.V7SupportMessagesPageDto;
import org.betup.model.remote.entity.support.V7SupportUserDto;
import org.betup.model.remote.entity.teams.NewTeamsResponse;
import org.betup.model.remote.entity.teams.TeamDetailsResponseModel;
import org.betup.model.remote.entity.teams.TeamImageUrlModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.NewUserFollowersModel;
import org.betup.model.remote.entity.user.NewUserFollowingModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.model.remote.entity.user.NewUserRankingStatisticsModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.model.remote.entity.user.OneClickBetSettingsModel;
import org.betup.model.remote.entity.user.TourMarketingRewardsModel;
import org.betup.model.remote.entity.user.TutorialCompleteResponseModel;
import org.betup.model.remote.entity.user.UpdateAppVersionRequestModel;
import org.betup.model.remote.entity.user.UpdateCountryRequestModel;
import org.betup.model.remote.entity.user.UpdateDisplayNameRequestModel;
import org.betup.model.remote.entity.user.UpdatePushPreferencesRequestModel;
import org.betup.model.remote.entity.user.UpdatePushTokenAndLangRequestModel;
import org.betup.model.remote.entity.user.UpdateTimezoneRequestModel;
import org.betup.model.remote.entity.user.UpdateTutorialCompleteRequestModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionsConfigModel;
import org.betup.model.remote.entity.user.VarietyVersionGatesConfigModel;
import org.betup.model.remote.entity.user.balance.BalanceModel;
import org.betup.model.remote.entity.user.details.UserBetStatsModel;
import org.betup.model.remote.entity.user.profile.UserProfileStatsResponse;
import org.betup.model.remote.entity.user.referrals.CreateReferralRequestModel;
import org.betup.model.remote.entity.user.referrals.ReferralResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* loaded from: classes2.dex */
public interface NewVersionBettingApi {
    @POST("/api/v7/challenges/{challengeId}/accept")
    Call<V7ChallengeDetailsResponseModel> acceptChallenge(@Header("Auth") String token, @Path("challengeId") long challengeId, @Body AcceptChallengeRequestBody requestBody, @Query("lang") String lang);

    @POST("quizzes/{id}/participations")
    Call<QuizParticipationResponseModel> addQuizParticipation(@Header("auth") String token, @Path("id") long quizId, @Body CreateQuizParticipationModel body, @Query("lang") String lang);

    @POST("/api/v7/challenges/{challengeId}/cancel")
    Call<V7ChallengeDetailsResponseModel> cancelChallenge(@Header("Auth") String token, @Path("challengeId") long challengeId, @Query("lang") String lang);

    @POST("/api/v7/shop/entitlements/{id}/claim")
    Call<ShopEntitlementClaimResultModel> claimShopEntitlement(@Header("Auth") String token, @Path("id") long entitlementId);

    @POST("/api/v7/challenges")
    Call<NewChallengeCreatedModel> createChallenge(@Header("Auth") String token, @Body NewCreateChallengeModel createChallengeModel, @Query("lang") String lang);

    @POST("/api/v7/me/betlist")
    Call<V7BetlistPlacementResponse> createV7Betlist(@Header("Auth") String token, @Body V7CreateBetlistRequestModel request, @Query("lang") String lang);

    @HTTP(hasBody = false, method = "DELETE", path = "/api/v7/matches/sub/all")
    Call<Map<String, String>> deleteAllV7Subscriptions(@Header("Auth") String token);

    @HTTP(hasBody = true, method = "DELETE", path = "/api/v7/home/favLeagues")
    Call<ResponseBody> deleteFavoriteLeaguesMatches(@Header("Auth") String token, @Body List<Integer> sportsIds, @Query("lang") String lang);

    @HTTP(hasBody = true, method = "DELETE", path = "/api/v7/home/favSports")
    Call<ResponseBody> deleteFavoriteSportsMatches(@Header("Auth") String token, @Body List<Integer> sportsIds, @Query("lang") String lang);

    @HTTP(hasBody = true, method = "DELETE", path = "/api/v7/home/favTeams")
    Call<ResponseBody> deleteFavoriteTeamsMatches(@Header("Auth") String token, @Body List<Integer> teamsIds, @Query("lang") String lang);

    @HTTP(hasBody = false, method = "DELETE", path = "/api/v7/matches/{id}/sub")
    Call<Map<String, Boolean>> deleteV7AllMatchSubscriptions(@Header("Auth") String token, @Path("id") long matchId);

    @HTTP(hasBody = false, method = "DELETE", path = "/api/v7/matches/{id}/sub/{event}")
    Call<Map<String, Boolean>> deleteV7MatchSubscription(@Header("Auth") String token, @Path("id") long matchId, @Path("event") String event);

    @POST("/api/v7/user/follow")
    Call<NewUserFollowerResponseModel> followUser(@Header("Auth") String token, @Query("followerUserId") int userId);

    @GET("/api/v7/matches/sub/all")
    Call<SubscriptionResponseModel> getAllV7Subscriptions(@Header("Auth") String token, @Query("page") int page);

    @GET("/api/v7/challenges/history/count")
    Call<List<BattleCountModel>> getBattleCounts(@Header("Auth") String token, @Query("lang") String lang);

    @GET("me/betlist")
    Call<BetsResponseModel> getBetList(@Header("Auth") String token, @Query("state") String state, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("me/betlist/{id}/share/install-link")
    Call<BetShareInstallLinkResponse> getBetShareInstallLink(@Header("Auth") String token, @Path("id") long betlistId);

    @GET("me/betlist/{id}/cancel")
    Call<CancelBetInfoModel> getCancelBetInfo(@Header("Auth") String token, @Path("id") long betlistId);

    @GET("/api/v7/challenges/{challengeId}")
    Call<V7ChallengeDetailsResponseModel> getChallengeDetails(@Header("Auth") String token, @Path("challengeId") long challengeId, @Query("lang") String lang);

    @GET("/api/v7/competitions/{competitionId}")
    Call<CompetitionDetailsWithParticipantModel> getCompetitionDetails(@Header("Auth") String token, @Path("competitionId") long competitionId, @Query("lang") String lang);

    @GET("/api/v7/competitions/history/{competitionId}/{participantId}")
    Call<CompetitionDetailsWithParticipantModel> getCompetitionDetailsWithParticipant(@Header("Auth") String token, @Path("competitionId") long competitionId, @Path("participantId") long participantId, @Query("lang") String lang);

    @GET("/api/v7/competitions/history/count")
    Call<CompetitionHistoryCountModel> getCompetitionsHistoryCount(@Header("Auth") String token, @Query("lang") String lang);

    @GET("/api/v7/home/favTeamIds")
    Call<List<Long>> getFavouriteTeamIds(@Header("Auth") String token, @Query("sportId") long sportId, @Query("lang") String lang);

    @GET("/api/v7/home/hotLiveMatches")
    Call<HotMatchesResponseModel> getHotLiveMatches(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("getExpandedBetsInfo") boolean getExpandedBetsInfo, @Query("lang") String lang);

    @GET("/api/v7/home/hotMatches")
    Call<HotMatchesResponseModel> getHotMatches(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("getExpandedBetsInfo") boolean getExpandedBetsInfo, @Query("lang") String lang);

    @GET("/api/v7/leagues/{leagueId}/matches/by-date")
    Call<NewMatchesResponseModel> getLeagueMatchesByDate(@Header("Auth") String token, @Path("leagueId") int leagueId, @Query("offset") int offset, @Query("limit") int limit, @Query("getExpandedBetsInfo") boolean getExpandedBetsInfo, @Query("date") String date, @Query("lang") String lang);

    @GET("/api/v7/leagues/by-date")
    Call<NewLeaguesResponse> getLeaguesByDate(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("sportId") int sportId, @Query("searchTerm") String searchTerm, @Query("date") String date, @Query("lang") String lang);

    @GET("/api/v7/quizzes/matches/{matchId}/availability")
    Call<MatchDetailsQuizAvailabilityModel> getMatchDetailsQuizAvailability(@Header("auth") String token, @Path("matchId") int matchId);

    @GET("matches/{userId}/info")
    Call<MatchDetailsResponseModel> getMatchInfo(@Header("Auth") String token, @Path("userId") int matchId, @Query("lang") String lang);

    @GET("/api/v7/quizzes/matches/{matchId}/participation")
    Call<QuizParticipationModel> getMatchQuizParticipation(@Header("auth") String token, @Path("matchId") long matchId, @Query("lang") String lang);

    @GET("matches/{matchId}/short-info")
    Call<MatchShortInfoModel> getMatchShortInfo(@Header("Auth") String token, @Path("matchId") long matchId, @Query("lang") String lang, @Query("appVersion") String appVersion, @Query("appVersionName") String appVersionName);

    @GET("matches/varieties")
    Call<List<MatchVarietyGroupModel>> getMatchVarieties(@Header("Auth") String token, @Query("ids") List<Integer> matchIds, @Query("lang") String lang, @Query("appVersion") String appVersion, @Query("appVersionName") String appVersionName);

    @GET("/user/{userId}/bet/statistics")
    Call<UserBetStatsModel> getMyBetStats(@Header("Auth") String token, @Path("userId") int userId);

    @GET("/api/v7/matches/{id}/info/my-bets")
    Call<MatchPlacedBetsResponseModel> getMyPlacedBetsForMatch(@Header("Auth") String token, @Path("id") long matchId, @Query("offset") int offset, @Query("limit") int limit);

    @GET("me/progress")
    Call<UserProgressModel> getMyProgressInfo(@Header("auth") String token);

    @GET("/api/v7/competitions/active")
    Call<NewCompetitionsResponseModel> getNewActiveCompetitions(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/challenges/matches/{matchId}/pending")
    Call<NewChallengesResponseModel> getNewChallenges(@Header("Auth") String token, @Path("matchId") long matchId, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/competitions/history")
    Call<CompetitionHistoryResponseModel> getNewCompetitionsHistory(@Header("Auth") String token, @Query("filterState") int filterState, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/leagues/{leagueId}/matches")
    Call<NewMatchesResponseModel> getNewLeagueMatches(@Header("Auth") String token, @Path("leagueId") int leagueId, @Query("offset") int offset, @Query("limit") int limit, @Query("getExpandedBetsInfo") boolean getExpandedBetsInfo, @Query("type") String matchType, @Query("lang") String lang, @Query("tourMatchId") Long tourMatchId, @Query("isTour") Boolean isTour);

    @GET("/api/v7/shop/{storeCode}")
    Call<NewShopItemModel> getNewShopItemBySku(@Header("Auth") String token, @Path("storeCode") String storeCode, @Query("lang") String lang);

    @GET("/api/v7/shop/{platform}/all")
    Call<List<NewShopItemModel>> getNewShopItems(@Header("Auth") String token, @Path("platform") String platform, @Query("shopType") String shopType, @Query("filterItemGroup") String filterItemGroup, @Query("lang") String lang);

    @GET("/api/v7/leagues/{leagueId}/matches/")
    Call<NewMatchesForLeagueModel> getNewSpecificChampionship(@Header("Auth") String token, @Path("leagueId") int leagueId, @Query("timestamp") String timestamp, @Query("offset") int offset, @Query("limit") int limit, @Query("getExpandedBetsInfo") boolean getExpandedBetsInfo, @Query("type") String matchType, @Query("lang") String lang, @Query("tourMatchId") Long tourMatchId, @Query("isTour") Boolean isTour);

    @GET("/api/v7/challenges/user/available")
    Call<NewUserBattlesResponseModel> getNewUserAvailableChallenges(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/challenges/history")
    Call<V7UserBattlesHistoryResponseModel> getNewUserChallengesHistory(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/challenges/history")
    Call<V7UserBattlesHistoryResponseModel> getNewUserChallengesHistoryWithState(@Header("Auth") String token, @Query("participantState") int participantState, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/challenges/user/private")
    Call<NewUserBattlesResponseModel> getNewUserPrivateChallenges(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("quizzes/participations")
    Call<QuizParticipationListResponseModel<QuizParticipationModel>> getOldQuizParticipationList(@Header("auth") String token, @Query("offset") Integer offset, @Query("limit") Integer limit, @Query("lang") String lang);

    @GET("/api/v7/quizzes/{id}")
    Call<QuizModel> getQuiz(@Header("auth") String token, @Path("id") long quizId, @Query("lang") String lang);

    @GET("quizzes/participations/{id}")
    Call<QuizParticipationModel> getQuizParticipation(@Header("auth") String token, @Path("id") int participationId, @Query("lang") String lang);

    @GET("/api/v7/quizzes/participations/count")
    Call<List<QuizStateCountModel>> getQuizParticipationCounts(@Header("auth") String token);

    @GET("/api/v7/quizzes/participations")
    Call<QuizParticipationListResponseModel<QuizShortParticipationModel>> getQuizParticipationList(@Header("auth") String token, @Query("state") Integer state, @Query("offset") Integer offset, @Query("limit") Integer limit, @Query("lang") String lang);

    @GET("/api/v7/quizzes/tiers")
    Call<List<QuizTierModel>> getQuizTiers(@Header("auth") String token);

    @GET("/api/v7/teams/random-images")
    Call<List<TeamImageUrlModel>> getRandomTeamImages(@Header("Auth") String token, @Query("limit") int limit, @Query("sportId") Long sportId);

    @GET("/api/v7/leagues/relevant")
    Call<NewLeaguesResponse> getRelevantLeagues(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("sportId") int sportId, @Query("searchTerm") String searchTerm, @Query("matchDateFilter") String matchDateFilter, @Query("lang") String lang, @Query("tourLeagueId") Long tourLeagueId, @Query("forChallenges") boolean forChallenges);

    @GET("/api/v7/sports/relevant/new")
    Call<NewSportsResponse> getRelevantSports(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("name") String name, @Query("matchDateFilter") String matchDateFilter, @Query("lang") String lang, @Query("tourSportId") Long tourSportId);

    @GET("/api/v7/teams/top")
    Call<NewTeamsResponse> getRelevantTeams(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("sportId") Integer sportId, @Query("searchTerm") String searchTerm, @Query("matchDateFilter") String matchDateFilter, @Query("lang") String lang);

    @GET("me/betlist/{id}/sell")
    Call<SellBetInfoModel> getSellBetInfo(@Header("Auth") String token, @Path("id") long betlistId);

    @GET("/api/v7/shop/entitlements")
    Call<List<ShopEntitlementModel>> getShopEntitlements(@Header("Auth") String token);

    @GET("/api/v7/shop/{platform}/layout")
    Call<ShopLayoutModel> getShopLayout(@Header("Auth") String token, @Path("platform") String platform, @Query("shopType") String shopType, @Query("lang") String lang);

    @GET("me/betlist/{id}")
    Call<BetsListModel> getSingleBetlistInfo(@Header("Auth") String token, @Path("id") int betlistId, @Query("lang") String lang);

    @GET("/api/v7/sports/by-date")
    Call<NewSportsResponse> getSportsByDate(@Header("Auth") String token, @Query("offset") int offset, @Query("limit") int limit, @Query("name") String name, @Query("date") String date, @Query("lang") String lang);

    @GET("/api/v7/teams/{id}/details")
    Call<TeamDetailsResponseModel> getTeamDetails(@Header("Auth") String token, @Path("id") Long id, @Query("lang") String lang);

    @GET("/api/v7/search/trending")
    Call<TrendingItemsResponse> getTrendingItems(@Header("Auth") String token, @Query("lang") String lang, @Query("limit") int limit);

    @GET("/api/v7/challenges/user/counts")
    Call<UserBattleActionCountsModel> getUserBattleActionCounts(@Header("Auth") String token, @Query("lang") String lang);

    @GET("/api/v7/user/{userId}/betlist")
    Call<BetsResponseModel> getUserBetList(@Header("Auth") String token, @Path("userId") int userId, @Query("state") String state, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/user/{userId}/profile/statistics")
    Call<UserProfileStatsResponse> getUserProfileStatistics(@Header("Auth") String token, @Path("userId") int userId, @Query("statsType") String statsType);

    @GET("/api/v7/me/balance")
    Call<BalanceModel> getV7BalanceHistory(@Header("Auth") String token, @Query("limit") int limit, @Query("offset") int offset, @Query("lang") String lang);

    @POST("/api/v7/casino/auth")
    Call<CasinoAuthTokenModel> getV7CasinoAuthToken(@Header("Auth") String token);

    @GET("/api/v7/user/country")
    Call<CountryResponseModel> getV7CountryList(@Header("Auth") String token);

    @POST("/api/v7/login/token/get")
    Call<CustomTokenResponseModel> getV7CustomToken(@Header("Auth") String token, @Body CustomTokenRequestModel request);

    @GET("/api/v7/bonus/daily")
    Call<V7DailyBonusResponse> getV7DailyBonus(@Header("Auth") String token, @Query("lang") String lang);

    @GET("/api/v7/me/faq")
    Call<FAQModel> getV7FAQ(@Header("Auth") String token, @Query("lang") String lang);

    @POST("/api/v7/bets/grabbed")
    Call<V7GrabbedBetsResponse> getV7GrabbedBets(@Header("Auth") String token, @Body V7GrabbedBetsRequestModel request, @Query("lang") String lang);

    @GET("/api/v7/matches/{matchId}/stats/history")
    Call<List<NewMatchHistoryResponseModel>> getV7MatchHistory(@Header("Auth") String token, @Path("matchId") long matchId, @Query("lang") String lang);

    @GET("/api/v7/matches/{varietyId}/stats")
    Call<NewMatchStatisticsResponseModel> getV7MatchStatistics(@Header("Auth") String token, @Path("varietyId") long matchId, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/matches/{id}/sub")
    Call<Map<String, Boolean>> getV7MatchSubscription(@Header("Auth") String token, @Path("id") long matchId);

    @GET("/api/v7/me/info")
    Call<BaseUserModel> getV7MeInfo(@Header("Auth") String token);

    @GET("/api/v7/me/one-click-bet-settings")
    Call<OneClickBetSettingsModel> getV7OneClickBetSettings(@Header("Auth") String token);

    @GET("/api/v7/ranks/{type}")
    Call<List<NewUserRankingItemModel>> getV7RanksByType(@Header("Auth") String token, @Path("type") String type, @Query("lang") String lang);

    @GET("/api/v7/server/info")
    Call<ServerInfoModel> getV7ServerInfo(@Header("Auth") String token, @Query("lang") String lang);

    @GET("/api/v7/matches/{id}/stats/by-varieties")
    Call<List<VarietyStatsModel>> getV7StatsByVarieties(@Header("Auth") String token, @Path("id") long matchId);

    @GET("/api/v7/support/info")
    Call<V7SupportUserDto> getV7SupportInfo(@Header("Auth") String token);

    @GET("/api/v7/support/messages")
    Call<V7SupportMessagesPageDto> getV7SupportMessages(@Header("Auth") String token, @Query("pageSize") Integer pageSize, @Query("offset") Integer offset, @Query("headId") Long headId, @Query("searchTerm") String searchTerm, @Query("searchField") String searchField, @Query("sortFields") List<String> sortFields, @Query("direction") String direction, @Query("continuationToken") String continuationToken);

    @GET("/api/v7/me/tour-rewards")
    Call<TourMarketingRewardsModel> getV7TourMarketingRewards(@Header("Auth") String token);

    @GET("/api/v7/user/{userId}/achievements")
    Call<NewAchievementsResponseModel> getV7UserAchievements(@Header("Auth") String token, @Path("userId") int userId, @Query("lang") String lang);

    @GET("/api/v7/user/{userId}/bet/statistics")
    Call<NewUserBetStatisticsModel> getV7UserBetStatistics(@Header("Auth") String token, @Path("userId") int userId, @Query("lang") String lang, @Query("statsType") String statsType);

    @GET("/api/v7/user/{userId}/info/favourites")
    Call<NewUserFavouritesModel> getV7UserFavourites(@Header("Auth") String token, @Path("userId") int userId, @Query("lang") String lang);

    @GET("/api/v7/user/{userId}/info/followers")
    Call<NewUserFollowersModel> getV7UserFollowers(@Header("Auth") String token, @Path("userId") int userId, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/user/{userId}/following")
    Call<List<NewUserFollowingModel>> getV7UserFollowing(@Header("Auth") String token, @Path("userId") int userId, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/user/{userId}/info")
    Call<NewUserInfoModel> getV7UserInfo(@Header("Auth") String token, @Path("userId") int userId, @Query("lang") String lang);

    @GET("/api/v7/user/{userId}/info/ranks/statistics")
    Call<NewUserRankingStatisticsModel> getV7UserRankingStatistics(@Header("Auth") String token, @Path("userId") int userId, @Query("lang") String lang, @Query("limit") Integer limit);

    @GET("/api/v7/user/{userId}/info/ranks")
    Call<NewUserRanksModel> getV7UserRanks(@Header("Auth") String token, @Path("userId") int userId, @Query("lang") String lang);

    @GET("/api/v7/me/variety-bet-restrictions")
    Call<VarietyBetRestrictionsConfigModel> getV7VarietyBetRestrictions(@Header("Auth") String token);

    @GET("/api/v7/me/variety-version-gates")
    Call<VarietyVersionGatesConfigModel> getV7VarietyVersionGates(@Header("Auth") String token);

    @POST("/api/v7/reward/achievement/{achievementId}/{amount}")
    Call<RewardModel> giveAchievementReward(@Header("Auth") String token, @Path("achievementId") long achievementId, @Path("amount") long amount);

    @POST("/api/v7/reward/wheeloffortune/{dailyBonusId}")
    Call<RewardModel> giveWheelOfFortuneReward(@Header("Auth") String token, @Path("dailyBonusId") long dailyBonusId, @Query("multiplier") int multiplier);

    @POST("/api/v7/me/login")
    Call<LoginResponseModel> login(@Header("Auth") String token, @Body LoginRequestModel loginRequest);

    @POST("/api/v7/me/login/upgrade")
    Call<UserUpgradeResultModel> loginUpgrade(@Header("Auth") String token);

    @POST("/api/v7/callback/billing/offer")
    Call<String> makeOfferPurchase(@Body UserOfferRequestModel request, @Header("auth") String apikey);

    @POST("/api/v7/callback/billing")
    Call<String> makePurchase(@Body UserPurchaseRequestModel request, @Header("auth") String apikey);

    @POST("/api/v7/callback/subscription")
    Call<Boolean> makeV7SubscriptionPurchase(@Header("Auth") String token, @Body SubscriptionPurchaseRequestModel request);

    @POST("/api/v7/competitions/{competitionId}")
    Call<PlaceBetResponseModel> placeCompetitionBet(@Header("Auth") String token, @Path("competitionId") long competitionId, @Body PlaceBetRequestModel request);

    @POST("/api/v7/quizzes/{quizId}/participations")
    Call<QuizParticipationResponseModel> placeQuizParticipation(@Header("auth") String token, @Path("quizId") long quizId, @Body CreateQuizRequestModel request, @Query("lang") String lang);

    @POST("me/betlist/{id}/cancel")
    Call<BetsListModel> postCancelBet(@Header("Auth") String token, @Path("id") long betlistId);

    @POST("/api/v7/home/favLeaguesMatches")
    Call<ResponseBody> postFavoriteLeaguesMatches(@Header("Auth") String token, @Body List<Integer> leaguesIds, @Query("lang") String lang);

    @POST("/api/v7/home/favSportsMatches")
    Call<ResponseBody> postFavoriteSportsMatches(@Header("Auth") String token, @Body List<Integer> sportsIds, @Query("lang") String lang);

    @POST("/api/v7/home/favTeamsMatches")
    Call<ResponseBody> postFavoriteTeamsMatches(@Header("Auth") String token, @Body List<Integer> teamsIds, @Query("lang") String lang);

    @POST("me/betlist/{id}/sell")
    Call<SellBetResultModel> postSellBet(@Header("Auth") String token, @Path("id") long betlistId, @Body SellBetRequestModel body);

    @PUT("/api/v7/home/favLeagues")
    Call<ResponseBody> putFavoriteLeaguesMatches(@Header("Auth") String token, @Body List<Integer> sportsIds, @Query("lang") String lang);

    @PUT("/api/v7/home/favSports")
    Call<ResponseBody> putFavoriteSportsMatches(@Header("Auth") String token, @Body List<Integer> sportsIds, @Query("lang") String lang);

    @PUT("/api/v7/home/favTeams")
    Call<ResponseBody> putFavoriteTeamsMatches(@Header("Auth") String token, @Body List<Integer> teamsIds, @Query("lang") String lang);

    @GET("/api/v7/search/leagues")
    Call<V7SearchLeaguesResponse> searchLeagues(@Header("Auth") String token, @Query("query") String query, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/search/matches")
    Call<V7SearchMatchesResponse> searchMatches(@Header("Auth") String token, @Query("query") String query, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/search/teams")
    Call<V7SearchTeamsResponse> searchTeams(@Header("Auth") String token, @Query("query") String query, @Query("offset") int offset, @Query("limit") int limit, @Query("lang") String lang);

    @GET("/api/v7/search/users")
    Call<V7SearchUsersResponse> searchUsers(@Header("Auth") String token, @Query("query") String query, @Query("offset") int offset, @Query("limit") int limit);

    @POST("/api/v7/support/messages")
    Call<V7SupportMessageDto> sendV7SupportMessage(@Header("Auth") String token, @Body String message);

    @POST("/api/v7/support/report")
    Call<ResponseBody> sendV7SupportReport(@Header("Auth") String token, @Body SupportReportRequestModel request);

    @POST("/api/v7/user/referral")
    Call<ReferralResponse> setV7ReferralCode(@Header("Auth") String token, @Body CreateReferralRequestModel request);

    @POST("/api/v7/me/unlock-one-click-bet")
    Call<UserProgressModel> unlockOneClickBet(@Header("auth") String token);

    @HTTP(hasBody = true, method = "PATCH", path = "/api/v7/me/appVersion")
    Call<Boolean> updateV7AppVersion(@Header("Auth") String token, @Body UpdateAppVersionRequestModel request);

    @HTTP(hasBody = true, method = "PATCH", path = "/api/v7/me/country")
    Call<NewUserInfoModel> updateV7Country(@Header("Auth") String token, @Body UpdateCountryRequestModel request);

    @POST("/api/v7/matches/{id}/sub")
    Call<Map<String, Boolean>> updateV7MatchSubscriptionBulk(@Header("Auth") String token, @Path("id") long matchId, @Body V7MatchSubscriptionUpdateRequest bulkRequest);

    @POST("/api/v7/matches/{id}/sub")
    Call<Map<String, Boolean>> updateV7MatchSubscriptionSingle(@Header("Auth") String token, @Path("id") long matchId, @Query("action") int action, @Query("event") String event);

    @HTTP(hasBody = true, method = "PATCH", path = "/api/v7/me/name")
    Call<BaseUserModel> updateV7Name(@Header("Auth") String token, @Body UpdateDisplayNameRequestModel request);

    @HTTP(hasBody = true, method = "PATCH", path = "/api/v7/me/pushPreferences")
    Call<Boolean> updateV7PushPreferences(@Header("Auth") String token, @Body UpdatePushPreferencesRequestModel request);

    @HTTP(hasBody = true, method = "PATCH", path = "/api/v7/me/pushTokenAndLang")
    Call<Boolean> updateV7PushTokenAndLang(@Header("Auth") String token, @Body UpdatePushTokenAndLangRequestModel request);

    @HTTP(hasBody = true, method = "PATCH", path = "/api/v7/me/timezone")
    Call<Boolean> updateV7Timezone(@Header("Auth") String token, @Body UpdateTimezoneRequestModel request);

    @HTTP(hasBody = true, method = "PATCH", path = "/api/v7/me/tutorialComplete")
    Call<TutorialCompleteResponseModel> updateV7TutorialComplete(@Header("Auth") String token, @Body UpdateTutorialCompleteRequestModel request);

    @POST("/api/v7/me/photo")
    @Multipart
    Call<ChangePhotoModel> uploadV7Photo(@Header("Auth") String token, @Part MultipartBody.Part image);
}
