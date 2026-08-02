package org.betup.model.remote.api.infrastructure;

import com.vk.sdk.api.model.VKAttachments;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.List;
import kotlin.Metadata;
import org.betup.games.common.remote.GameConfigModel;
import org.betup.games.common.remote.HigherLowerGameStartRequest;
import org.betup.games.dice.model.rest.DiceGameConfigModel;
import org.betup.games.dice.model.rest.DiceGameRecordModel;
import org.betup.games.dice.model.rest.DicePlayGameRequest;
import org.betup.games.doubles.model.rest.ConfigDoubleGame;
import org.betup.games.doubles.model.rest.DoubleGameFinishRequest;
import org.betup.games.doubles.model.rest.DoubleGameHistoryRequest;
import org.betup.games.doubles.model.rest.DoubleGameStartRequest;
import org.betup.games.doubles.model.rest.SessionDoubleGame;
import org.betup.games.doubles.model.rest.SessionHistoryDoubleGame;
import org.betup.games.flashbet.model.FlashBetAnswerRequest;
import org.betup.games.flashbet.model.FlashBetCategoryDto;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.games.flashbet.model.FlashBetSessionHistoryPageDto;
import org.betup.games.flashbet.model.FlashBetSportDto;
import org.betup.games.higherLower.model.rest.HigherLowerGameCompleteRequest;
import org.betup.games.higherLower.model.rest.HigherLowerGameResultModel;
import org.betup.games.higherLower.model.rest.StartHigherLowerGameModel;
import org.betup.games.luckyCells.model.rest.LuckyCellsGameConfig;
import org.betup.games.luckyCells.model.rest.LuckyCellsGameStartRequest;
import org.betup.games.luckyCells.model.rest.RecordLuckyCellsGameModel;
import org.betup.games.luckyCells.model.rest.SessionLuckyCellsGameModel;
import org.betup.games.luckyCells.model.rest.StartLuckyCellsGameModel;
import org.betup.games.warGame.model.interactor.ActionModel;
import org.betup.games.warGame.model.interactor.StartWarGameBody;
import org.betup.games.warGame.model.rest.WarGameRoundResultDto;
import org.betup.games.webgame.model.WebGameListItemModel;
import org.betup.games.webgame.model.WebGameSessionCodeModel;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.entity.presentation.PresentationActionRequest;
import org.betup.model.remote.entity.presentation.PresentationCampaignDto;
import org.betup.model.remote.entity.presentation.UserPresentationStateDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: MiniGameApi.kt */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J>\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0005H'J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u001fH'J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010$\u001a\u00020%H'J,\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020)H'J\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020-H'J,\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010/\u001a\u00020\u00052\b\b\u0001\u00100\u001a\u000201H'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\"\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010$\u001a\u000206H'J6\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0001\u00109\u001a\u00020\u00102\b\b\u0001\u0010:\u001a\u00020\u0010H'J\"\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u0005H'J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\"\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010A\u001a\u00020BH'J\"\u0010C\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010D\u001a\u00020EH'J(\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010H\u001a\u00020IH'J(\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H'J2\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010N\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H'J,\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010Q\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H'J6\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010T\u001a\u00020\u00102\b\b\u0003\u0010U\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\u0005H'J\"\u0010V\u001a\b\u0012\u0004\u0012\u00020P0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H'J,\u0010W\u001a\b\u0012\u0004\u0012\u00020P0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H'J6\u0010X\u001a\b\u0012\u0004\u0012\u00020P0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020YH'J,\u0010Z\u001a\b\u0012\u0004\u0012\u00020P0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H'¨\u0006["}, d2 = {"Lorg/betup/model/remote/api/infrastructure/MiniGameApi;", "", "getGamesConfig", "Lretrofit2/Call;", "", "", "token", "listWebGames", "Lorg/betup/games/webgame/model/WebGameListItemModel;", "lang", "createWebGameSessionCode", "Lorg/betup/games/webgame/model/WebGameSessionCodeModel;", "getActivePresentations", "Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "screenKey", "buildNumber", "", "osType", "markPresentationImpression", "Lorg/betup/model/remote/entity/presentation/UserPresentationStateDto;", "campaignId", "request", "Lorg/betup/model/remote/entity/presentation/PresentationActionRequest;", "markPresentationClose", "markPresentationSkip", "markPresentationLater", "getDiceGameConfig", "Lorg/betup/games/dice/model/rest/DiceGameConfigModel;", "playDiceGame", "Lorg/betup/games/dice/model/rest/DiceGameRecordModel;", "body", "Lorg/betup/games/dice/model/rest/DicePlayGameRequest;", "getHighLowGameConfig", "Lorg/betup/games/common/remote/GameConfigModel;", "startHighLowGame", "Lorg/betup/games/higherLower/model/rest/StartHigherLowerGameModel;", "betAmount", "Lorg/betup/games/common/remote/HigherLowerGameStartRequest;", "continueHighLowGame", "Lorg/betup/games/higherLower/model/rest/HigherLowerGameResultModel;", "sessionId", "Lorg/betup/games/higherLower/model/rest/HigherLowerGameCompleteRequest;", "getWarGameConfig", "startWarGame", "Lorg/betup/games/warGame/model/rest/WarGameRoundResultDto;", "Lorg/betup/games/warGame/model/interactor/StartWarGameBody;", "continueWarGame", "id", "action", "Lorg/betup/games/warGame/model/interactor/ActionModel;", "getConfigLuckyCellsGame", "Lorg/betup/games/luckyCells/model/rest/LuckyCellsGameConfig;", "startLuckyCellsGame", "Lorg/betup/games/luckyCells/model/rest/StartLuckyCellsGameModel;", "Lorg/betup/games/luckyCells/model/rest/LuckyCellsGameStartRequest;", "continueLuckyCellsGame", "Lorg/betup/games/luckyCells/model/rest/RecordLuckyCellsGameModel;", "coordinateX", "coordinateY", "completeLuckyCellsGame", "Lorg/betup/games/luckyCells/model/rest/SessionLuckyCellsGameModel;", "getConfigDoubleGame", "Lorg/betup/games/doubles/model/rest/ConfigDoubleGame;", "startDoubleGame", "Lorg/betup/games/doubles/model/rest/SessionDoubleGame;", TtmlNode.START, "Lorg/betup/games/doubles/model/rest/DoubleGameStartRequest;", "finishDoubleGame", "finish", "Lorg/betup/games/doubles/model/rest/DoubleGameFinishRequest;", "getHistoryDoubleGame", "Lorg/betup/games/doubles/model/rest/SessionHistoryDoubleGame;", "lastSessionId", "Lorg/betup/games/doubles/model/rest/DoubleGameHistoryRequest;", "getFlashBetSports", "Lorg/betup/games/flashbet/model/FlashBetSportDto;", "getFlashBetCategoriesForSport", "Lorg/betup/games/flashbet/model/FlashBetCategoryDto;", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "startFlashBetGame", "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "categoryId", "getFlashBetSessionHistory", "Lorg/betup/games/flashbet/model/FlashBetSessionHistoryPageDto;", VKAttachments.TYPE_WIKI_PAGE, RRWebVideoEvent.JsonKeys.SIZE, "getFlashBetPendingSession", "getFlashBetSession", "submitFlashBetAnswer", "Lorg/betup/games/flashbet/model/FlashBetAnswerRequest;", "leaveFlashBetSession", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MiniGameApi {
    @POST("games/luckyCells/{id}/complete")
    Call<SessionLuckyCellsGameModel> completeLuckyCellsGame(@Header("auth") String token, @Path("id") String sessionId);

    @POST("games/higherLower/{id}/complete")
    Call<HigherLowerGameResultModel> continueHighLowGame(@Header("auth") String token, @Path("id") String sessionId, @Body HigherLowerGameCompleteRequest body);

    @POST("games/luckyCells/{id}/continue")
    Call<RecordLuckyCellsGameModel> continueLuckyCellsGame(@Header("auth") String token, @Path("id") String sessionId, @Query("coordinateX") int coordinateX, @Query("coordinateY") int coordinateY);

    @POST("games/war/{id}/continue")
    Call<WarGameRoundResultDto> continueWarGame(@Header("auth") String token, @Path("id") String id, @Body ActionModel action);

    @POST("web-games/session-code")
    Call<WebGameSessionCodeModel> createWebGameSessionCode(@Header("auth") String token);

    @POST("games/double/finish")
    Call<SessionDoubleGame> finishDoubleGame(@Header("auth") String token, @Body DoubleGameFinishRequest finish);

    @GET("presentations/active")
    Call<List<PresentationCampaignDto>> getActivePresentations(@Header("auth") String token, @Query("screenKey") String screenKey, @Query("buildNumber") int buildNumber, @Query("osType") String osType);

    @GET("games/double/config")
    Call<ConfigDoubleGame> getConfigDoubleGame(@Header("auth") String token);

    @GET("games/luckyCells/config")
    Call<LuckyCellsGameConfig> getConfigLuckyCellsGame(@Header("auth") String token);

    @GET("games/dice/config")
    Call<DiceGameConfigModel> getDiceGameConfig(@Header("auth") String token);

    @GET("games/flashbet/sports/{sportId}/categories")
    Call<List<FlashBetCategoryDto>> getFlashBetCategoriesForSport(@Header("auth") String token, @Path("sportId") String sportId, @Query("lang") String lang);

    @GET("games/flashbet/sessions/pending")
    Call<FlashBetGameSessionDto> getFlashBetPendingSession(@Header("auth") String token, @Query("lang") String lang);

    @GET("games/flashbet/sessions/{sessionId}")
    Call<FlashBetGameSessionDto> getFlashBetSession(@Header("auth") String token, @Path("sessionId") String sessionId, @Query("lang") String lang);

    @GET("games/flashbet/sessions/history")
    Call<FlashBetSessionHistoryPageDto> getFlashBetSessionHistory(@Header("auth") String token, @Query("page") int page, @Query("size") int size, @Query("lang") String lang);

    @GET("games/flashbet/sports")
    Call<List<FlashBetSportDto>> getFlashBetSports(@Header("auth") String token, @Query("lang") String lang);

    @GET("general/games/list")
    Call<List<String>> getGamesConfig(@Header("auth") String token);

    @GET("games/higherLower/config")
    Call<GameConfigModel> getHighLowGameConfig(@Header("auth") String token);

    @POST("games/double/history")
    Call<List<SessionHistoryDoubleGame>> getHistoryDoubleGame(@Header("auth") String token, @Body DoubleGameHistoryRequest lastSessionId);

    @GET("games/war/config")
    Call<GameConfigModel> getWarGameConfig(@Header("auth") String token);

    @POST("games/flashbet/sessions/{sessionId}/leave")
    Call<FlashBetGameSessionDto> leaveFlashBetSession(@Header("auth") String token, @Path("sessionId") String sessionId, @Query("lang") String lang);

    @GET("web-games")
    Call<List<WebGameListItemModel>> listWebGames(@Header("auth") String token, @Query("lang") String lang);

    @POST("presentations/{campaignId}/close")
    Call<UserPresentationStateDto> markPresentationClose(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("presentations/{campaignId}/impression")
    Call<UserPresentationStateDto> markPresentationImpression(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("presentations/{campaignId}/later")
    Call<UserPresentationStateDto> markPresentationLater(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("presentations/{campaignId}/skip")
    Call<UserPresentationStateDto> markPresentationSkip(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("games/dice/play")
    Call<DiceGameRecordModel> playDiceGame(@Header("auth") String token, @Body DicePlayGameRequest body);

    @POST("games/double/start")
    Call<SessionDoubleGame> startDoubleGame(@Header("auth") String token, @Body DoubleGameStartRequest start);

    @POST("games/flashbet/start")
    Call<FlashBetGameSessionDto> startFlashBetGame(@Header("auth") String token, @Query("categoryId") String categoryId, @Query("lang") String lang);

    @POST("games/higherLower/start")
    Call<StartHigherLowerGameModel> startHighLowGame(@Header("auth") String token, @Body HigherLowerGameStartRequest betAmount);

    @POST("games/luckyCells/start")
    Call<StartLuckyCellsGameModel> startLuckyCellsGame(@Header("auth") String token, @Body LuckyCellsGameStartRequest betAmount);

    @POST("games/war/start")
    Call<WarGameRoundResultDto> startWarGame(@Header("auth") String token, @Body StartWarGameBody body);

    @POST("games/flashbet/sessions/{sessionId}/answer")
    Call<FlashBetGameSessionDto> submitFlashBetAnswer(@Header("auth") String token, @Path("sessionId") String sessionId, @Query("lang") String lang, @Body FlashBetAnswerRequest body);

    /* compiled from: MiniGameApi.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Call getHistoryDoubleGame$default(MiniGameApi miniGameApi, String str, DoubleGameHistoryRequest doubleGameHistoryRequest, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryDoubleGame");
            }
            if ((i & 2) != 0) {
                doubleGameHistoryRequest = new DoubleGameHistoryRequest(null, 1, null);
            }
            return miniGameApi.getHistoryDoubleGame(str, doubleGameHistoryRequest);
        }

        public static /* synthetic */ Call getFlashBetSessionHistory$default(MiniGameApi miniGameApi, String str, int i, int i2, String str2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFlashBetSessionHistory");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 20;
            }
            return miniGameApi.getFlashBetSessionHistory(str, i, i2, str2);
        }
    }
}
