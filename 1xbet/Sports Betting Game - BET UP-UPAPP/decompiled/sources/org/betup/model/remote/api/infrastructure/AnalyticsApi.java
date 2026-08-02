package org.betup.model.remote.api.infrastructure;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.vk.sdk.api.model.VKScopes;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.betup.model.remote.entity.analytics.HomeMatchAd;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.analytics.OfferType;
import org.betup.model.remote.entity.analytics.OffersInfoModel;
import org.betup.model.remote.entity.analytics.TrackEventModel;
import org.betup.model.remote.entity.analytics.TrackPurchaseModel;
import org.betup.model.remote.entity.interstitial.InterstitialActionRequest;
import org.betup.model.remote.entity.interstitial.InterstitialCampaignDto;
import org.betup.model.remote.entity.interstitial.UserInterstitialStateDto;
import org.betup.model.remote.entity.presentation.PresentationActionRequest;
import org.betup.model.remote.entity.presentation.PresentationCampaignDto;
import org.betup.model.remote.entity.presentation.PresentationScreenRegistryDto;
import org.betup.model.remote.entity.presentation.UserPresentationStateDto;
import org.betup.model.remote.entity.promo.PromoBanner;
import org.betup.model.remote.entity.promo.PromoInterstitialSettingsDto;
import org.betup.model.remote.entity.quest.ClientDailyQuestProgressRequestDto;
import org.betup.model.remote.entity.quest.UserClaimDailyQuestResponseDto;
import org.betup.model.remote.entity.quest.UserDailyQuestInstanceDto;
import org.betup.model.remote.entity.rewardedprompt.RewardedPromptActionRequest;
import org.betup.model.remote.entity.rewardedprompt.RewardedPromptCampaignDto;
import org.betup.model.remote.entity.rewardedprompt.UserRewardedPromptStateDto;
import org.betup.model.remote.entity.user.AccountDeletionRequest;
import org.betup.model.remote.entity.user.CreateAccountDeletionRequest;
import org.betup.model.remote.entity.user.UserAnalyticsTagSlugsDto;
import org.betup.model.remote.entity.videoRewards.VideoRedeemResult;
import org.betup.model.remote.entity.videoRewards.VideoRewardForPlacementState;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AnalyticsApi.kt */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH'J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J>\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u0004H'J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0017H'JJ\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u0004H'JN\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u0004H'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020!H'J,\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020!H'J,\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020!H'J,\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020!H'J,\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020!H'JV\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u0004H'JZ\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u0004H'J,\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020,H'J,\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020,H'J,\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020,H'J,\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020,H'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u000204H'J\"\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u000208H'J\"\u00109\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u00107\u001a\u00020:H'J,\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010<\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J6\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010>\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH'J,\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010A\u001a\u00020\u00042\b\b\u0001\u0010B\u001a\u00020\u0004H'J6\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010E\u001a\u00020F2\b\b\u0001\u0010G\u001a\u00020\u00042\b\b\u0001\u0010H\u001a\u00020\u0004H'J6\u0010I\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010E\u001a\u00020F2\b\b\u0001\u0010G\u001a\u00020\u00042\b\b\u0001\u0010H\u001a\u00020\u0004H'J?\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010L\u001a\u00020\u00042\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010N\u001a\u0004\u0018\u00010FH'¢\u0006\u0002\u0010OJ?\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010L\u001a\u00020\u00042\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010N\u001a\u0004\u0018\u00010FH'¢\u0006\u0002\u0010OJ\u001e\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010T\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010U\u001a\u00020\u0004H'J$\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010G\u001a\u00020\u0004H'J\u0018\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\u0018\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J,\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010^\u001a\u00020\u00042\b\b\u0001\u0010G\u001a\u00020\u0004H'J\"\u0010_\u001a\b\u0012\u0004\u0012\u0002060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010`\u001a\u00020aH'¨\u0006b"}, d2 = {"Lorg/betup/model/remote/api/infrastructure/AnalyticsApi;", "", "getOffersList", "Lretrofit2/Call;", "", "token", "offerType", "Lorg/betup/model/remote/entity/analytics/OfferType;", "osType", "buildNumber", "", "getOffersInfo", "Lorg/betup/model/remote/entity/analytics/OffersInfoModel;", "getPresentationScreenRegistry", "Lorg/betup/model/remote/entity/presentation/PresentationScreenRegistryDto;", "getActivePresentations", "", "Lorg/betup/model/remote/entity/presentation/PresentationCampaignDto;", "screenKey", "markPresentationImpression", "Lorg/betup/model/remote/entity/presentation/UserPresentationStateDto;", "campaignId", "request", "Lorg/betup/model/remote/entity/presentation/PresentationActionRequest;", "markPresentationClose", "markPresentationSkip", "markPresentationLater", "getEligibleInterstitials", "Lorg/betup/model/remote/entity/interstitial/InterstitialCampaignDto;", "eventKey", "getInterstitialCampaign", "markInterstitialImpression", "Lorg/betup/model/remote/entity/interstitial/UserInterstitialStateDto;", "Lorg/betup/model/remote/entity/interstitial/InterstitialActionRequest;", "markInterstitialClick", "markInterstitialClose", "markInterstitialSkip", "markInterstitialVideoComplete", "getEligibleRewardedPrompts", "Lorg/betup/model/remote/entity/rewardedprompt/RewardedPromptCampaignDto;", "contextParams", "getRewardedPromptCampaign", "markRewardedPromptImpression", "Lorg/betup/model/remote/entity/rewardedprompt/UserRewardedPromptStateDto;", "Lorg/betup/model/remote/entity/rewardedprompt/RewardedPromptActionRequest;", "markRewardedPromptDismiss", "markRewardedPromptWatchStarted", "markRewardedPromptWatchCompleted", "getCurrentDeletionRequest", "Lorg/betup/model/remote/entity/user/AccountDeletionRequest;", "cancelCurrentDeletionRequest", "createAccountDeletionRequest", "Lorg/betup/model/remote/entity/user/CreateAccountDeletionRequest;", "postTrackEvent", "Lokhttp3/ResponseBody;", "trackEvent", "Lorg/betup/model/remote/entity/analytics/TrackEventModel;", "postTrackPurchaseEvent", "Lorg/betup/model/remote/entity/analytics/TrackPurchaseModel;", "getSingleOfferInfo", "offerId", "getSignedOffer", "id", "getSignedPendingOffer", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "productId", SDKConstants.PARAM_PURCHASE_TOKEN, "getPromoForMatch", "Lorg/betup/model/remote/entity/promo/PromoBanner;", "matchId", "", "lang", "client", "trackClickForMatch", "getVideoRewardForPlacementState", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardForPlacementState;", X3.k, "referencedId", "referencedValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lretrofit2/Call;", "redeemVideoRewardForPlacement", "Lorg/betup/model/remote/entity/videoRewards/VideoRedeemResult;", "getHomeMatchAds", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "trackHomeMatchAdClick", f.b.c, "getDailyQuests", "Lorg/betup/model/remote/entity/quest/UserDailyQuestInstanceDto;", "getCurrentUserTagSlugs", "Lorg/betup/model/remote/entity/user/UserAnalyticsTagSlugsDto;", "getPromoInterstitialSettings", "Lorg/betup/model/remote/entity/promo/PromoInterstitialSettingsDto;", "claimDailyQuest", "Lorg/betup/model/remote/entity/quest/UserClaimDailyQuestResponseDto;", "questId", "reportDailyQuestClientEvent", "body", "Lorg/betup/model/remote/entity/quest/ClientDailyQuestProgressRequestDto;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AnalyticsApi {
    @PATCH("users/accounts/deletionRequests/cancel")
    Call<AccountDeletionRequest> cancelCurrentDeletionRequest(@Header("auth") String token);

    @POST("users/me/daily-quests/{questId}/claim")
    Call<UserClaimDailyQuestResponseDto> claimDailyQuest(@Header("auth") String token, @Path("questId") String questId, @Query("lang") String lang);

    @POST("users/accounts/deletionRequests")
    Call<AccountDeletionRequest> createAccountDeletionRequest(@Header("auth") String token, @Body CreateAccountDeletionRequest request);

    @GET("presentations/active")
    Call<List<PresentationCampaignDto>> getActivePresentations(@Header("auth") String token, @Query("screenKey") String screenKey, @Query("buildNumber") int buildNumber, @Query("osType") String osType);

    @GET("users/accounts/deletionRequests")
    Call<AccountDeletionRequest> getCurrentDeletionRequest(@Header("auth") String token);

    @GET("users/me/tag-slugs")
    Call<UserAnalyticsTagSlugsDto> getCurrentUserTagSlugs(@Header("auth") String token);

    @GET("users/me/daily-quests")
    Call<UserDailyQuestInstanceDto> getDailyQuests(@Header("auth") String token, @Query("lang") String lang);

    @GET("interstitials/eligible")
    Call<List<InterstitialCampaignDto>> getEligibleInterstitials(@Header("auth") String token, @Query("eventKey") String eventKey, @Query("screenKey") String screenKey, @Query("buildNumber") int buildNumber, @Query("osType") String osType);

    @GET("rewarded-prompts/eligible")
    Call<List<RewardedPromptCampaignDto>> getEligibleRewardedPrompts(@Header("auth") String token, @Query("eventKey") String eventKey, @Query("screenKey") String screenKey, @Query("contextParams") String contextParams, @Query("buildNumber") int buildNumber, @Query("osType") String osType);

    @GET("promo/home/ads")
    Call<List<HomeMatchAd>> getHomeMatchAds(@Header("auth") String token);

    @GET("interstitials/{campaignId}")
    Call<InterstitialCampaignDto> getInterstitialCampaign(@Header("auth") String token, @Path("campaignId") String campaignId, @Query("eventKey") String eventKey, @Query("screenKey") String screenKey, @Query("buildNumber") int buildNumber, @Query("osType") String osType);

    @GET("offers/info")
    Call<OffersInfoModel> getOffersInfo(@Header("auth") String token, @Query("offerType") OfferType offerType, @Query("osType") String osType, @Query("buildNumber") int buildNumber);

    @GET(VKScopes.OFFERS)
    Call<String> getOffersList(@Header("auth") String token, @Query("offerType") OfferType offerType, @Query("osType") String osType, @Query("buildNumber") int buildNumber);

    @GET("presentations/screen-registry")
    Call<PresentationScreenRegistryDto> getPresentationScreenRegistry(@Header("auth") String token);

    @GET("promo/matches/{matchId}")
    Call<PromoBanner> getPromoForMatch(@Header("auth") String token, @Path("matchId") long matchId, @Query("lang") String lang, @Query("client") String client);

    @GET("promo/interstitial-settings")
    Call<PromoInterstitialSettingsDto> getPromoInterstitialSettings(@Header("auth") String token);

    @GET("rewarded-prompts/{campaignId}")
    Call<RewardedPromptCampaignDto> getRewardedPromptCampaign(@Header("auth") String token, @Path("campaignId") String campaignId, @Query("eventKey") String eventKey, @Query("screenKey") String screenKey, @Query("contextParams") String contextParams, @Query("buildNumber") int buildNumber, @Query("osType") String osType);

    @GET("offers/{id}/request")
    Call<String> getSignedOffer(@Header("auth") String token, @Path("id") String id, @Query("osType") String osType, @Query("buildNumber") int buildNumber);

    @GET("offers/pending/products/{productId}/{purchaseToken}/request")
    Call<OfferModel> getSignedPendingOffer(@Header("auth") String token, @Path("productId") String productId, @Path("purchaseToken") String purchaseToken);

    @GET("offers/{id}")
    Call<String> getSingleOfferInfo(@Header("auth") String token, @Path("id") String offerId, @Query("offerType") OfferType offerType);

    @GET("videoRewards/{placementId}/state")
    Call<VideoRewardForPlacementState> getVideoRewardForPlacementState(@Header("auth") String token, @Path("placementId") String placementId, @Query("referencedId") String referencedId, @Query("referencedValue") Long referencedValue);

    @POST("interstitials/{campaignId}/click")
    Call<UserInterstitialStateDto> markInterstitialClick(@Header("auth") String token, @Path("campaignId") String campaignId, @Body InterstitialActionRequest request);

    @POST("interstitials/{campaignId}/close")
    Call<UserInterstitialStateDto> markInterstitialClose(@Header("auth") String token, @Path("campaignId") String campaignId, @Body InterstitialActionRequest request);

    @POST("interstitials/{campaignId}/impression")
    Call<UserInterstitialStateDto> markInterstitialImpression(@Header("auth") String token, @Path("campaignId") String campaignId, @Body InterstitialActionRequest request);

    @POST("interstitials/{campaignId}/skip")
    Call<UserInterstitialStateDto> markInterstitialSkip(@Header("auth") String token, @Path("campaignId") String campaignId, @Body InterstitialActionRequest request);

    @POST("interstitials/{campaignId}/video-complete")
    Call<UserInterstitialStateDto> markInterstitialVideoComplete(@Header("auth") String token, @Path("campaignId") String campaignId, @Body InterstitialActionRequest request);

    @POST("presentations/{campaignId}/close")
    Call<UserPresentationStateDto> markPresentationClose(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("presentations/{campaignId}/impression")
    Call<UserPresentationStateDto> markPresentationImpression(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("presentations/{campaignId}/later")
    Call<UserPresentationStateDto> markPresentationLater(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("presentations/{campaignId}/skip")
    Call<UserPresentationStateDto> markPresentationSkip(@Header("auth") String token, @Path("campaignId") String campaignId, @Body PresentationActionRequest request);

    @POST("rewarded-prompts/{campaignId}/dismiss")
    Call<UserRewardedPromptStateDto> markRewardedPromptDismiss(@Header("auth") String token, @Path("campaignId") String campaignId, @Body RewardedPromptActionRequest request);

    @POST("rewarded-prompts/{campaignId}/impression")
    Call<UserRewardedPromptStateDto> markRewardedPromptImpression(@Header("auth") String token, @Path("campaignId") String campaignId, @Body RewardedPromptActionRequest request);

    @POST("rewarded-prompts/{campaignId}/watch-completed")
    Call<UserRewardedPromptStateDto> markRewardedPromptWatchCompleted(@Header("auth") String token, @Path("campaignId") String campaignId, @Body RewardedPromptActionRequest request);

    @POST("rewarded-prompts/{campaignId}/watch-started")
    Call<UserRewardedPromptStateDto> markRewardedPromptWatchStarted(@Header("auth") String token, @Path("campaignId") String campaignId, @Body RewardedPromptActionRequest request);

    @POST("tracking/events")
    Call<ResponseBody> postTrackEvent(@Header("auth") String token, @Body TrackEventModel trackEvent);

    @POST("tracking/purchases")
    Call<ResponseBody> postTrackPurchaseEvent(@Header("auth") String token, @Body TrackPurchaseModel trackEvent);

    @POST("videoRewards/{placementId}/redeem")
    Call<VideoRedeemResult> redeemVideoRewardForPlacement(@Header("auth") String token, @Path("placementId") String placementId, @Query("referencedId") String referencedId, @Query("referencedValue") Long referencedValue);

    @POST("users/me/daily-quests/events")
    Call<ResponseBody> reportDailyQuestClientEvent(@Header("auth") String token, @Body ClientDailyQuestProgressRequestDto body);

    @POST("promo/matches/{matchId}/tracking/click")
    Call<ResponseBody> trackClickForMatch(@Header("auth") String token, @Path("matchId") long matchId, @Query("lang") String lang, @Query("client") String client);

    @POST("promo/home/ads/{adId}/click")
    Call<ResponseBody> trackHomeMatchAdClick(@Header("auth") String token, @Path("adId") String adId);
}
