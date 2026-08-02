package org.betup.ui.fragment.matches.details;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.BillingClient;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C3664q2;
import com.vk.sdk.api.model.VKAttachments;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.BetPlacedSuccessMessage;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.BetsUnlockedMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.analytics.GetPromoBannerForMatchInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
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
import org.betup.model.remote.api.rest.quiz.QuizParticipationRequest;
import org.betup.model.remote.api.rest.quiz.QuizTiersInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyBetRestrictionsInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyVersionGatesInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.challenges.ChallengeCreator;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewChallengesResponseModel;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.VarietyBetRestrictionInfoModel;
import org.betup.model.remote.entity.matches.details.BetSectionModel;
import org.betup.model.remote.entity.matches.details.CreateQuizRequestModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsAwayTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsHomeTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsQuizAvailabilityModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsResponseModel;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetInfoModel;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetModel;
import org.betup.model.remote.entity.matches.details.MatchPlacedBetsResponseModel;
import org.betup.model.remote.entity.matches.details.MatchShortDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.PlaceBetRequestModel;
import org.betup.model.remote.entity.matches.details.QuizModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationResponseModel;
import org.betup.model.remote.entity.matches.details.QuizTierModel;
import org.betup.model.remote.entity.matches.details.SubmatchModelShort;
import org.betup.model.remote.entity.matches.details.TeamModelShort;
import org.betup.model.remote.entity.matches.history.MatchHistoryType;
import org.betup.model.remote.entity.matches.history.NewMatchHistoryMatchModel;
import org.betup.model.remote.entity.matches.history.NewMatchHistoryResponseModel;
import org.betup.model.remote.entity.matches.history.NewMatchHistoryTeamModel;
import org.betup.model.remote.entity.matches.statistics.NewMatchStatisticsItemModel;
import org.betup.model.remote.entity.matches.statistics.NewMatchStatisticsResponseModel;
import org.betup.model.remote.entity.matches.statistics.VarietyStatsModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import org.betup.model.remote.entity.messaging.MessageModel;
import org.betup.model.remote.entity.subscription.SubscriptionType;
import org.betup.model.remote.entity.teams.TeamDetailsResponseModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionRuleModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionsConfigModel;
import org.betup.model.remote.entity.user.VarietyVersionGatesConfigModel;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.PurchaseCompletedListener;
import org.betup.services.billing.UnlockBetTypesFlow;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.scores.SubscoreService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.subscription.DefaultSubscriptionService;
import org.betup.services.subscription.SubscriptionService;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.dialogs.NotificationDialogFragment;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.ui.dialogs.events.OpenBetSelectionEvent;
import org.betup.ui.dialogs.events.OpenChallengePreviewDialog;
import org.betup.ui.fragment.bets.betlist.details.BetDetailDialog;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.MatchTopBaseData;
import org.betup.ui.fragment.matches.details.compose.basetabs.MatchDetailsButtonTabs;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleCreator;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizSelectionState;
import org.betup.ui.fragment.matches.details.compose.tabs.quiz.SelectedAnswer;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryCategoryUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryMatchUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryTeamUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchStatisticsUiSingleItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchStatisticsUiTeamItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchStatsTabs;
import org.betup.utils.BetGroupsSortingUtils;
import org.betup.utils.MatchDisplayState;
import org.betup.utils.MatchUtils;
import org.betup.utils.SharedPrefs;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.UiExtensionsKt;
import org.betup.utils.VarietyBetRestrictions;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\u0084\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\u000e*\u0002¤\u0003\b\u0007\u0018\u0000 \u0097\u00042\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0004\u0097\u0004\u0098\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u008e\u0002\u001a\u00030á\u0001H\u0002J\u0014\u0010\u008f\u0002\u001a\u00030á\u00012\b\u0010\u0090\u0002\u001a\u00030Ø\u0001H\u0002J\"\u0010\u0091\u0002\u001a\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u00012\u000f\u0010\u0092\u0002\u001a\n\u0012\u0005\u0012\u00030\u0093\u00020Ó\u0001H\u0002J&\u0010\u0094\u0002\u001a\u0005\u0018\u00010Ø\u00012\u000f\u0010\u0095\u0002\u001a\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u00012\u0007\u0010\u0096\u0002\u001a\u00020\u0003H\u0002J$\u0010\u0097\u0002\u001a\u00030á\u00012\u000f\u0010\u0095\u0002\u001a\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u00012\u0007\u0010\u0096\u0002\u001a\u00020\u0003H\u0002J\n\u0010\u0098\u0002\u001a\u00030\u0099\u0002H\u0002J\u0016\u0010\u009a\u0002\u001a\u00030\u0099\u00022\n\u0010\u0090\u0002\u001a\u0005\u0018\u00010Ø\u0001H\u0002J\b\u0010\u009b\u0002\u001a\u00030\u0099\u0002J\u000f\u0010\u0082\u0003\u001a\u00030Ã\u0001*\u00030ò\u0002H\u0002J\n\u0010\u0083\u0003\u001a\u00030\u0099\u0002H\u0002J\n\u0010\u0084\u0003\u001a\u00030\u0099\u0002H\u0002J\u000f\u0010\u0085\u0003\u001a\n\u0012\u0005\u0012\u00030\u0086\u00030Ó\u0001J$\u0010\u008f\u0003\u001a\n\u0012\u0005\u0012\u00030ü\u00010Ó\u00012\u0011\u0010\u0090\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008a\u00030Ó\u0001H\u0002J\b\u0010\u0091\u0003\u001a\u00030\u0099\u0002J\b\u0010\u0092\u0003\u001a\u00030\u0099\u0002J\u0014\u0010\u0093\u0003\u001a\u00030\u0099\u00022\b\u0010\u0094\u0003\u001a\u00030á\u0001H\u0002J\u0012\u0010\u0095\u0003\u001a\u00030\u0099\u00022\b\u0010\u0096\u0003\u001a\u00030Ø\u0001J\n\u0010\u009a\u0003\u001a\u00030\u0099\u0002H\u0002J\u001b\u0010\u009d\u0003\u001a\n\u0012\u0005\u0012\u00030¦\u00020Ó\u00012\b\u0010\u0090\u0003\u001a\u00030\u0088\u0003H\u0002J\b\u0010¢\u0003\u001a\u00030\u0099\u0002J\u0011\u0010¦\u0003\u001a\u00030\u0099\u00022\u0007\u0010§\u0003\u001a\u00020\u0003J\b\u0010¨\u0003\u001a\u00030\u0099\u0002J\b\u0010©\u0003\u001a\u00030\u0099\u0002J\b\u0010ª\u0003\u001a\u00030\u0099\u0002J\b\u0010«\u0003\u001a\u00030\u0099\u0002J6\u0010¬\u0003\u001a\u0005\u0018\u00010\u0086\u00032\b\u0010\u00ad\u0003\u001a\u00030ò\u00012\b\u0010®\u0003\u001a\u00030¯\u00032\n\u0010°\u0003\u001a\u0005\u0018\u00010±\u00032\b\u0010²\u0003\u001a\u00030Ø\u0001H\u0002J\n\u0010³\u0003\u001a\u00030\u0099\u0002H\u0002J\u001b\u0010´\u0003\u001a\u00030\u0099\u00022\b\u0010µ\u0003\u001a\u00030Ã\u00012\u0007\u0010¶\u0003\u001a\u00020\u0003J.\u0010·\u0003\u001a\u00030\u0099\u00022\b\u0010¸\u0003\u001a\u00030Ç\u00012\b\u0010¹\u0003\u001a\u00030á\u00012\u0007\u0010º\u0003\u001a\u00020\u00032\u0007\u0010»\u0003\u001a\u00020\u0003J\b\u0010¼\u0003\u001a\u00030\u0099\u0002J\u0011\u0010½\u0003\u001a\u00030\u0099\u00022\u0007\u0010¾\u0003\u001a\u00020\u0003J\b\u0010¿\u0003\u001a\u00030\u0099\u0002J\b\u0010À\u0003\u001a\u00030\u0099\u0002J\u0013\u0010Á\u0003\u001a\u00030\u0099\u00022\u0007\u0010Å\u0001\u001a\u00020\u0003H\u0002J\n\u0010Â\u0003\u001a\u00030\u0099\u0002H\u0002J\b\u0010Ã\u0003\u001a\u00030\u0099\u0002J\"\u0010Ä\u0003\u001a\u00030\u0099\u00022\u0016\u0010Å\u0003\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030Æ\u0003H\u0016J\u0014\u0010Ç\u0003\u001a\u00030\u0099\u00022\b\u0010¾\u0003\u001a\u00030Ã\u0001H\u0002J\n\u0010È\u0003\u001a\u00030\u0099\u0002H\u0002J\u001b\u0010É\u0003\u001a\u00030\u0099\u00022\u000f\u0010Ê\u0003\u001a\n\u0012\u0005\u0012\u00030ö\u00010Ó\u0001H\u0002J6\u0010Ë\u0003\u001a\u0011\u0012\u0005\u0012\u00030Í\u0003\u0012\u0005\u0012\u00030Í\u00030Ì\u00032\b\u0010Î\u0003\u001a\u00030Ø\u00012\b\u0010Ï\u0003\u001a\u00030Í\u00032\b\u0010Ð\u0003\u001a\u00030Í\u0003H\u0002J8\u0010Ñ\u0003\u001a\u00030\u0099\u00022\b\u0010Ò\u0003\u001a\u00030Í\u00032\b\u0010Ó\u0003\u001a\u00030Ã\u00012\u0018\u0010Ô\u0003\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010ü\u0001\u0012\u0005\u0012\u00030\u0099\u00020Õ\u0003H\u0002J\u0012\u0010Ö\u0003\u001a\u00030\u0099\u00022\b\u0010×\u0003\u001a\u00030Ã\u0001J'\u0010Ø\u0003\u001a\u00030\u0099\u00022\u0011\u0010Ù\u0003\u001a\f\u0012\u0005\u0012\u00030Û\u0003\u0018\u00010Ú\u00032\b\u0010Ü\u0003\u001a\u00030á\u0001H\u0016J\u0013\u0010Ý\u0003\u001a\u00030\u0099\u00022\u0007\u0010§\u0003\u001a\u00020\u0003H\u0002J\u0011\u0010Þ\u0003\u001a\u00030\u0099\u00022\u0007\u0010§\u0003\u001a\u00020\u0003J\u001b\u0010ã\u0003\u001a\u00030\u0099\u00022\u0007\u0010ä\u0003\u001a\u00020\u00032\b\u0010µ\u0003\u001a\u00030Ã\u0001J,\u0010å\u0003\u001a\u00030\u0099\u00022\u0007\u0010ä\u0003\u001a\u00020\u00032\b\u0010æ\u0003\u001a\u00030á\u00012\u000f\u0010ç\u0003\u001a\n\u0012\u0005\u0012\u00030Ã\u00010Ó\u0001J\u0014\u0010è\u0003\u001a\u00030\u0099\u00022\b\u0010\u0096\u0003\u001a\u00030é\u0003H\u0007J\u0014\u0010ê\u0003\u001a\u00030\u0099\u00022\b\u0010\u0096\u0003\u001a\u00030ë\u0003H\u0007J\u0014\u0010ì\u0003\u001a\u00030\u0099\u00022\b\u0010\u0096\u0003\u001a\u00030í\u0003H\u0007J\u0014\u0010î\u0003\u001a\u00030\u0099\u00022\b\u0010\u0096\u0003\u001a\u00030ï\u0003H\u0007J\u0014\u0010ð\u0003\u001a\u00030\u0099\u00022\b\u0010\u0096\u0003\u001a\u00030ñ\u0003H\u0007J\b\u0010ò\u0003\u001a\u00030\u0099\u0002J\u0012\u0010ó\u0003\u001a\u00030\u0099\u00022\b\u0010ô\u0003\u001a\u00030¯\u0002J\b\u0010õ\u0003\u001a\u00030\u0099\u0002J\b\u0010ö\u0003\u001a\u00030\u0099\u0002J\b\u0010÷\u0003\u001a\u00030\u0099\u0002J\n\u0010ø\u0003\u001a\u00030\u0099\u0002H\u0002J\u0012\u0010ù\u0003\u001a\u00030\u0099\u00022\b\u0010ú\u0003\u001a\u00030Ã\u0001J'\u0010û\u0003\u001a\u00030\u0099\u00022\b\u0010ú\u0003\u001a\u00030Ã\u00012\u0013\b\u0002\u0010ü\u0003\u001a\f\u0012\u0005\u0012\u00030Ã\u0001\u0018\u00010Ó\u0001J\b\u0010ý\u0003\u001a\u00030\u0099\u0002J\b\u0010þ\u0003\u001a\u00030\u0099\u0002J\n\u0010ÿ\u0003\u001a\u00030\u0099\u0002H\u0002J\u0014\u0010\u0080\u0004\u001a\u00030\u0099\u00022\b\u0010\u0081\u0004\u001a\u00030Ú\u0002H\u0002J\u0014\u0010\u0082\u0004\u001a\u00030\u0099\u00022\b\u0010¾\u0003\u001a\u00030Ã\u0001H\u0002J\b\u0010\u0083\u0004\u001a\u00030\u0099\u0002J\u0014\u0010\u0084\u0004\u001a\u00030\u0099\u00022\b\u0010\u0085\u0004\u001a\u00030Ã\u0001H\u0002J\n\u0010\u0086\u0004\u001a\u00030\u0099\u0002H\u0002J9\u0010\u0087\u0004\u001a\u00030\u0099\u00022\u0007\u0010\u0088\u0004\u001a\u00020\u00032\b\u0010\u0089\u0004\u001a\u00030Ã\u00012\b\u0010Î\u0003\u001a\u00030Ø\u00012\b\u0010\u008a\u0004\u001a\u00030\u008b\u00042\b\u0010\u008c\u0004\u001a\u00030Ø\u0001J\u0012\u0010\u008d\u0004\u001a\u00030\u0099\u00022\b\u0010\u008e\u0004\u001a\u00030Ã\u0001J\u0012\u0010\u008f\u0004\u001a\u00030\u0099\u00022\b\u0010\u0090\u0004\u001a\u00030á\u0001J\u0011\u0010\u0091\u0004\u001a\u00030\u0099\u00022\u0007\u0010§\u0003\u001a\u00020\u0003J\b\u0010\u0092\u0004\u001a\u00030\u0099\u0002J\b\u0010\u0093\u0004\u001a\u00030\u0099\u0002J\n\u0010\u0094\u0004\u001a\u00030\u0099\u0002H\u0016J\n\u0010\u0095\u0004\u001a\u00030\u0099\u0002H\u0016J\n\u0010\u0096\u0004\u001a\u00030\u0099\u0002H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010]\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001e\u0010i\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001e\u0010o\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001e\u0010u\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001e\u0010{\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010*\"\u0004\b}\u0010,R\"\u0010~\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R$\u0010\u0084\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R$\u0010\u008a\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R$\u0010\u0090\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R$\u0010\u0096\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R$\u0010\u009c\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R$\u0010¢\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R$\u0010¨\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R$\u0010®\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R$\u0010´\u0001\u001a\u00030µ\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R$\u0010º\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u0010\u0010À\u0001\u001a\u00030Á\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010Â\u0001\u001a\u0005\u0018\u00010Ã\u0001X\u0082\u000e¢\u0006\u0005\n\u0003\u0010Ä\u0001R\u000f\u0010Å\u0001\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010È\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010Ê\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010Î\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ï\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ð\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ï\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0001\u0010Í\u0001R\u001e\u0010Ò\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010Õ\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010Í\u0001R\u0019\u0010×\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ø\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ù\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ø\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÚ\u0001\u0010Í\u0001R(\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u00012\n\u0010Û\u0001\u001a\u0005\u0018\u00010Ü\u0001@BX\u0086\u000e¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0010\u0010à\u0001\u001a\u00030á\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010â\u0001\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bå\u0001\u0010Í\u0001R\u001e\u0010æ\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ç\u00010Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010è\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ç\u00010Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bé\u0001\u0010Í\u0001R\u0017\u0010ê\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ë\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bë\u0001\u0010Í\u0001R\u0017\u0010ì\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010í\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bî\u0001\u0010Í\u0001R\u0017\u0010ï\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bð\u0001\u0010Í\u0001R\u001e\u0010ñ\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ò\u00010Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010ó\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ò\u00010Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bô\u0001\u0010Í\u0001R\u001e\u0010õ\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ö\u00010Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010÷\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ö\u00010Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bø\u0001\u0010Í\u0001R\u0017\u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ú\u0001\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bú\u0001\u0010Í\u0001R\u001e\u0010û\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ü\u00010Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010ý\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ü\u00010Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bþ\u0001\u0010Í\u0001R\u000f\u0010ÿ\u0001\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0080\u0002\u001a\t\u0012\u0004\u0012\u00020\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0081\u0002\u001a\t\u0012\u0004\u0012\u00020\u00030Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0002\u0010Í\u0001R\u0017\u0010\u0083\u0002\u001a\n\u0012\u0005\u0012\u00030Ã\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0084\u0002\u001a\n\u0012\u0005\u0012\u00030Ã\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0002\u0010Í\u0001R\u0016\u0010\u0086\u0002\u001a\t\u0012\u0004\u0012\u00020\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0087\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0088\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0089\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0002\u0010Í\u0001R\u0015\u0010\u008b\u0002\u001a\u00030á\u00018F¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001e\u0010\u009c\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ï\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0002\u0010Í\u0001R\u001e\u0010\u009e\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ã\u00010\u009f\u00020É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010 \u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ã\u00010\u009f\u00020Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b¡\u0002\u0010Í\u0001R\u001e\u0010¢\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ã\u00010\u009f\u00020É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010£\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ã\u00010\u009f\u00020Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b¤\u0002\u0010Í\u0001R\u001e\u0010¥\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¦\u00020Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010§\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¦\u00020Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b¨\u0002\u0010Í\u0001R\u0017\u0010©\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ª\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bª\u0002\u0010Í\u0001R\u0017\u0010«\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010¬\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0002\u0010Í\u0001R\u001e\u0010®\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¯\u00020Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010°\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¯\u00020Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b±\u0002\u0010Í\u0001R\u0016\u0010²\u0002\u001a\t\u0012\u0004\u0012\u00020\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010³\u0002\u001a\t\u0012\u0004\u0012\u00020\u00030Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b´\u0002\u0010Í\u0001R\u001e\u0010µ\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¶\u00020Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010·\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¶\u00020Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b¸\u0002\u0010Í\u0001R\u0016\u0010¹\u0002\u001a\t\u0012\u0004\u0012\u00020\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010º\u0002\u001a\t\u0012\u0004\u0012\u00020\u00030Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b»\u0002\u0010Í\u0001R\u001e\u0010¼\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ü\u00010Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010½\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ü\u00010Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\b¾\u0002\u0010Í\u0001R\u0017\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010À\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0002\u0010Í\u0001R\u0017\u0010Á\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Â\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0002\u0010Í\u0001R\u0010\u0010Ä\u0002\u001a\u00030á\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010Å\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010Æ\u0002\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010Ç\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030È\u00020Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010É\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030È\u00020Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÊ\u0002\u0010Í\u0001R\u0017\u0010Ë\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Ì\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÌ\u0002\u0010Í\u0001R\u0017\u0010Í\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Î\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÏ\u0002\u0010Í\u0001R\u0017\u0010Ð\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Ñ\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÒ\u0002\u0010Í\u0001R\u000f\u0010Ó\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010Ô\u0002\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u0019\u0010Õ\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ö\u00020É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010×\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ö\u00020Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bØ\u0002\u0010Í\u0001R\u0019\u0010Ù\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ú\u00020É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Û\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Ú\u00020Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÜ\u0002\u0010Í\u0001R\u0017\u0010Ý\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Þ\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0002\u0010Í\u0001R\u0017\u0010ß\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010à\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bà\u0002\u0010Í\u0001R\u0019\u0010á\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010â\u00020É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010ã\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010â\u00020Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bä\u0002\u0010Í\u0001R\u0017\u0010å\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010æ\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bæ\u0002\u0010Í\u0001R\u001e\u0010ç\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030è\u00020Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010é\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030è\u00020Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bê\u0002\u0010Í\u0001R\u0017\u0010ë\u0002\u001a\n\u0012\u0005\u0012\u00030ì\u00020É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010í\u0002\u001a\n\u0012\u0005\u0012\u00030ì\u00020Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bî\u0002\u0010Í\u0001R\u0017\u0010ï\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ð\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bð\u0002\u0010Í\u0001R\u001e\u0010ñ\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ò\u00020Ó\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010ó\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ò\u00020Ó\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bô\u0002\u0010Í\u0001R\u0017\u0010õ\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ö\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bö\u0002\u0010Í\u0001R\u0017\u0010÷\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ø\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bø\u0002\u0010Í\u0001R\u0017\u0010ù\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ú\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bû\u0002\u0010Í\u0001R\u0017\u0010ü\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ý\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00010Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bý\u0002\u0010Í\u0001R\u0014\u0010þ\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0005\n\u0003\u0010ÿ\u0002R\u000f\u0010\u0080\u0003\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0081\u0003\u001a\n\u0012\u0005\u0012\u00030á\u00010É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0087\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u0088\u0003\u0012\u0005\u0012\u00030Ã\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0089\u0003\u001a\u0017\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008a\u00030Ó\u0001\u0012\u0005\u0012\u00030Ã\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u008b\u0003\u001a\u0017\u0012\f\u0012\n\u0012\u0005\u0012\u00030ò\u00020\u008c\u0003\u0012\u0005\u0012\u00030Ã\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u008d\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u008e\u0003\u0012\u0005\u0012\u00030Ã\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0097\u0003\u001a\u00020\u00038F¢\u0006\b\u001a\u0006\b\u0098\u0003\u0010\u0099\u0003R\u001d\u0010\u009b\u0003\u001a\u0010\u0012\u0005\u0012\u00030\u009c\u0003\u0012\u0005\u0012\u00030Ã\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u009e\u0003\u001a\u0010\u0012\u0005\u0012\u00030â\u0002\u0012\u0005\u0012\u00030Ã\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u009f\u0003\u001a\u0017\u0012\f\u0012\n\u0012\u0005\u0012\u00030è\u00020Ó\u0001\u0012\u0005\u0012\u00030\u0099\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010 \u0003\u001a\u001d\u0012\f\u0012\n\u0012\u0005\u0012\u00030¡\u00030Ó\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00030Ó\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010£\u0003\u001a\u00030¤\u0003X\u0082\u0004¢\u0006\u0005\n\u0003\u0010¥\u0003R2\u0010ß\u0003\u001a%\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030Ã\u0001\u0012\u0005\u0012\u00030á\u00010à\u00030à\u00030É\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010á\u0003\u001a%\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u0011\u0012\u0005\u0012\u00030Ã\u0001\u0012\u0005\u0012\u00030á\u00010à\u00030à\u00030Ë\u0001¢\u0006\n\n\u0000\u001a\u0006\bâ\u0003\u0010Í\u0001¨\u0006\u0099\u0004"}, d2 = {"Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "", "Lorg/betup/services/subscription/SubscriptionService$MatchSubscriptionsLoadListener;", "Lorg/betup/services/billing/PurchaseCompletedListener;", "Lorg/betup/ui/ProgressDisplay;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getPromoBannerForMatchInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetPromoBannerForMatchInteractor;", "getGetPromoBannerForMatchInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetPromoBannerForMatchInteractor;", "setGetPromoBannerForMatchInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetPromoBannerForMatchInteractor;)V", "matchesDetailsRequestInteractor", "Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "getMatchesDetailsRequestInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;", "setMatchesDetailsRequestInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/MatchShortInfoInteractor;)V", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "getBetListAppender", "()Lorg/betup/services/betlist/BetListAppender;", "setBetListAppender", "(Lorg/betup/services/betlist/BetListAppender;)V", "betValidator", "Lorg/betup/services/betlist/BetValidator;", "getBetValidator", "()Lorg/betup/services/betlist/BetValidator;", "setBetValidator", "(Lorg/betup/services/betlist/BetValidator;)V", "subscoreService", "Lorg/betup/services/scores/SubscoreService;", "getSubscoreService", "()Lorg/betup/services/scores/SubscoreService;", "setSubscoreService", "(Lorg/betup/services/scores/SubscoreService;)V", "userServiceP", "Lorg/betup/services/user/UserService;", "getUserServiceP", "()Lorg/betup/services/user/UserService;", "setUserServiceP", "(Lorg/betup/services/user/UserService;)V", "subscriptionService", "Lorg/betup/services/subscription/DefaultSubscriptionService;", "getSubscriptionService", "()Lorg/betup/services/subscription/DefaultSubscriptionService;", "setSubscriptionService", "(Lorg/betup/services/subscription/DefaultSubscriptionService;)V", "matchBetGroupsInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "getMatchBetGroupsInteractor", "()Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "setMatchBetGroupsInteractor", "(Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;)V", "matchMyBetsInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchMyBetsInteractor;", "getMatchMyBetsInteractor", "()Lorg/betup/model/remote/api/rest/matches/MatchMyBetsInteractor;", "setMatchMyBetsInteractor", "(Lorg/betup/model/remote/api/rest/matches/MatchMyBetsInteractor;)V", "getTeamDetailsInteractor", "Lorg/betup/model/remote/api/rest/matches/GetTeamDetailsInteractor;", "getGetTeamDetailsInteractor", "()Lorg/betup/model/remote/api/rest/matches/GetTeamDetailsInteractor;", "setGetTeamDetailsInteractor", "(Lorg/betup/model/remote/api/rest/matches/GetTeamDetailsInteractor;)V", "matchDetailsInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchInfoInteractor;", "getMatchDetailsInteractor", "()Lorg/betup/model/remote/api/rest/matches/MatchInfoInteractor;", "setMatchDetailsInteractor", "(Lorg/betup/model/remote/api/rest/matches/MatchInfoInteractor;)V", "v7MatchStatisticsInteractor", "Lorg/betup/model/remote/api/rest/matches/V7MatchStatisticsInteractor;", "getV7MatchStatisticsInteractor", "()Lorg/betup/model/remote/api/rest/matches/V7MatchStatisticsInteractor;", "setV7MatchStatisticsInteractor", "(Lorg/betup/model/remote/api/rest/matches/V7MatchStatisticsInteractor;)V", "v7StatsByVarietiesInteractor", "Lorg/betup/model/remote/api/rest/matches/V7StatsByVarietiesInteractor;", "getV7StatsByVarietiesInteractor", "()Lorg/betup/model/remote/api/rest/matches/V7StatsByVarietiesInteractor;", "setV7StatsByVarietiesInteractor", "(Lorg/betup/model/remote/api/rest/matches/V7StatsByVarietiesInteractor;)V", "v7MatchHistoryInteractor", "Lorg/betup/model/remote/api/rest/matches/V7MatchHistoryInteractor;", "getV7MatchHistoryInteractor", "()Lorg/betup/model/remote/api/rest/matches/V7MatchHistoryInteractor;", "setV7MatchHistoryInteractor", "(Lorg/betup/model/remote/api/rest/matches/V7MatchHistoryInteractor;)V", "newChallengesInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewChallengesInteractor;", "getNewChallengesInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewChallengesInteractor;", "setNewChallengesInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewChallengesInteractor;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "singleShopInteractor", "Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "getSingleShopInteractor", "()Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "setSingleShopInteractor", "(Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "userService", "getUserService", "setUserService", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "quizAvailabilityInteractor", "Lorg/betup/model/remote/api/rest/matches/details/QuizAvailabilityInteractor;", "getQuizAvailabilityInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/QuizAvailabilityInteractor;", "setQuizAvailabilityInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/QuizAvailabilityInteractor;)V", "quizDetailsInteractor", "Lorg/betup/model/remote/api/rest/matches/details/QuizDetailsInteractor;", "getQuizDetailsInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/QuizDetailsInteractor;", "setQuizDetailsInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/QuizDetailsInteractor;)V", "quizTiersInteractor", "Lorg/betup/model/remote/api/rest/quiz/QuizTiersInteractor;", "getQuizTiersInteractor", "()Lorg/betup/model/remote/api/rest/quiz/QuizTiersInteractor;", "setQuizTiersInteractor", "(Lorg/betup/model/remote/api/rest/quiz/QuizTiersInteractor;)V", "quizParticipationInteractor", "Lorg/betup/model/remote/api/rest/quiz/QuizParticipationInteractor;", "getQuizParticipationInteractor", "()Lorg/betup/model/remote/api/rest/quiz/QuizParticipationInteractor;", "setQuizParticipationInteractor", "(Lorg/betup/model/remote/api/rest/quiz/QuizParticipationInteractor;)V", "getPublicChatMessagesInteractor", "Lorg/betup/model/remote/api/rest/messaging/GetPublicChatMessagesInteractor;", "getGetPublicChatMessagesInteractor", "()Lorg/betup/model/remote/api/rest/messaging/GetPublicChatMessagesInteractor;", "setGetPublicChatMessagesInteractor", "(Lorg/betup/model/remote/api/rest/messaging/GetPublicChatMessagesInteractor;)V", "sendPublicChatMessageInteractor", "Lorg/betup/model/remote/api/rest/messaging/SendPublicChatMessageInteractor;", "getSendPublicChatMessageInteractor", "()Lorg/betup/model/remote/api/rest/messaging/SendPublicChatMessageInteractor;", "setSendPublicChatMessageInteractor", "(Lorg/betup/model/remote/api/rest/messaging/SendPublicChatMessageInteractor;)V", "matchQuizParticipationInteractor", "Lorg/betup/model/remote/api/rest/matches/details/MatchQuizParticipationInteractor;", "getMatchQuizParticipationInteractor", "()Lorg/betup/model/remote/api/rest/matches/details/MatchQuizParticipationInteractor;", "setMatchQuizParticipationInteractor", "(Lorg/betup/model/remote/api/rest/matches/details/MatchQuizParticipationInteractor;)V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "v7VarietyBetRestrictionsInteractor", "Lorg/betup/model/remote/api/rest/user/V7VarietyBetRestrictionsInteractor;", "getV7VarietyBetRestrictionsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7VarietyBetRestrictionsInteractor;", "setV7VarietyBetRestrictionsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7VarietyBetRestrictionsInteractor;)V", "v7VarietyVersionGatesInteractor", "Lorg/betup/model/remote/api/rest/user/V7VarietyVersionGatesInteractor;", "getV7VarietyVersionGatesInteractor", "()Lorg/betup/model/remote/api/rest/user/V7VarietyVersionGatesInteractor;", "setV7VarietyVersionGatesInteractor", "(Lorg/betup/model/remote/api/rest/user/V7VarietyVersionGatesInteractor;)V", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "varietyId", "", "Ljava/lang/Long;", "id", "activity", "Lorg/betup/ui/MainActivity;", "_currentMatch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentMatch", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentMatch", "()Lkotlinx/coroutines/flow/StateFlow;", "_baseMatchInfo", "Lorg/betup/ui/fragment/matches/details/compose/MatchTopBaseData;", "baseMatchInfo", "getBaseMatchInfo", "_subMatches", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "subMatches", "getSubMatches", "_error", "", "error", "getError", "value", "Lorg/betup/model/local/entity/OddType;", "oddType", "getOddType", "()Lorg/betup/model/local/entity/OddType;", "bannerTracked", "", "participationId", "_selectedTabIndex", "selectedTabIndex", "getSelectedTabIndex", "_tabItems", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "tabItems", "getTabItems", "_isSubscribed", "isSubscribed", "_oneClickBetEnabled", "oneClickBetEnabled", "getOneClickBetEnabled", "_isLoading", "isLoading", "_betGroups", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "betGroups", "getBetGroups", "_myPlacedBets", "Lorg/betup/model/remote/entity/matches/details/MatchPlacedBetInfoModel;", "myPlacedBets", "getMyPlacedBets", "_isMyPlacedBetsLoading", "isMyPlacedBetsLoading", "_finishedMatchUpcomingCategories", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "finishedMatchUpcomingCategories", "getFinishedMatchUpcomingCategories", "upcomingTeamsLoadGeneration", "_selectedBetGroupTabIndex", "selectedBetGroupTabIndex", "getSelectedBetGroupTabIndex", "_playerStatsMinStake", "playerStatsMinStake", "getPlayerStatsMinStake", "_playerStatsInfoRefreshTick", "_playerStatsMinInfoHelpOpen", "_playerStatsMinInfoAutoDismissed", "showPlayerStatsMinStakeInfo", "getShowPlayerStatsMinStakeInfo", "hasPlayerStatsBetEverPlaced", "getHasPlayerStatsBetEverPlaced", "()Z", "currentUserHasPlayerStatsBetEverPlaced", "currentUserHasVarietyMinStakeBetEverPlaced", "ruleId", "mapSubmatchesToTabs", "submatches", "Lorg/betup/model/remote/entity/matches/details/SubmatchModelShort;", "minStakeRuleIdForTab", BillingClient.ProductType.SUBS, "tabIdx", "isMinStakeEnforcementActiveForTab", "applyMinStakeForCurrentTab", "", "onVarietyMinStakeTabEntered", "togglePlayerStatsMinStakeInfo", "displayBaseMatchInfo", "getDisplayBaseMatchInfo", "_selectedBetIds", "", "selectedBetIds", "getSelectedBetIds", "_validatingBetIds", "validatingBetIds", "getValidatingBetIds", "_statistics", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatisticsUiSingleItem;", "statistics", "getStatistics", "_isStatisticsLoading", "isStatisticsLoading", "_hasMoreStatistics", "hasMoreStatistics", "getHasMoreStatistics", "_statsTabs", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs;", "statsTabs", "getStatsTabs", "_selectedStatsTabIndex", "selectedStatsTabs", "getSelectedStatsTabs", "_varietyStatsTabs", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController$VarietyStatsTab;", "varietyStatsTabs", "getVarietyStatsTabs", "_selectedVarietyIndex", "selectedVarietyIndex", "getSelectedVarietyIndex", "_historyData", "historyData", "getHistoryData", "_isHistoryLoading", "isHistoryLoading", "_hasStatisticsAvailable", "hasStatisticsAvailable", "getHasStatisticsAvailable", "preventAutoSync", "statisticsOffset", "statisticsLimit", "_availableBattles", "Lorg/betup/ui/fragment/matches/details/compose/tabs/battles/items/BattleUiItem;", "availableBattles", "getAvailableBattles", "_isBattlesLoading", "isBattlesLoading", "_hasMoreAvailableBattles", "hasMoreAvailableBattles", "getHasMoreAvailableBattles", "_canCreateBattle", "canCreateBattle", "getCanCreateBattle", "availableBattlesOffset", "battlesLimit", "_quizAvailability", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsQuizAvailabilityModel;", "quizAvailability", "getQuizAvailability", "_quizParticipationDetails", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "quizParticipationDetails", "getQuizParticipationDetails", "_isQuizLoading", "isQuizLoading", "_isQuizParticipationLoading", "isQuizParticipationLoading", "_quizDetails", "Lorg/betup/model/remote/entity/matches/details/QuizModel;", "quizDetails", "getQuizDetails", "_isQuizDetailsLoading", "isQuizDetailsLoading", "_quizTiers", "Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "quizTiers", "getQuizTiers", "_quizSelectionState", "Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/QuizSelectionState;", "quizSelectionState", "getQuizSelectionState", "_isPlacingQuiz", "isPlacingQuiz", "_matchComments", "Lorg/betup/model/remote/entity/messaging/ExtendedMessageModel;", "matchComments", "getMatchComments", "_isMatchCommentsLoading", "isMatchCommentsLoading", "_isMatchCommentsLoadingMore", "isMatchCommentsLoadingMore", "_hasMoreMatchComments", "hasMoreMatchComments", "getHasMoreMatchComments", "_isSendingMatchComment", "isSendingMatchComment", "nextMatchCommentsPage", "Ljava/lang/Integer;", "lastRequestedMatchCommentsPage", "_hasUnreadMatchComments", "commentKey", "updateBetGroupsFromSubMatches", "syncSelectedBetIdsWithBetslip", "getCurrentBets", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "statisticsListener", "Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsResponseModel;", "historyListener", "Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryResponseModel;", "matchCommentsListener", "Lorg/betup/model/remote/entity/PageModel;", "sendMatchCommentListener", "Lorg/betup/model/remote/entity/messaging/MessageModel;", "convertToHistoryUiItems", "response", "refreshMatchComments", "loadMoreMatchComments", "loadMatchComments", "reset", "sendMatchComment", "message", "currentUserId", "getCurrentUserId", "()I", "updateCommentsTabIndicator", "battlesListener", "Lorg/betup/model/remote/entity/challenges/NewChallengesResponseModel;", "convertToUiItems", "quizDetailsListener", "quizTiersListener", "matchBetListener", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupModel;", "loadMatchStatTabs", "groupedStatsListener", "org/betup/ui/fragment/matches/details/MatchDetailsController$groupedStatsListener$1", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController$groupedStatsListener$1;", "selectVariety", "index", "loadMoreStatistics", "refreshStatistics", "loadMatchHistory", "refreshHistory", "toBetModel", "group", "betOption", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyBetOptionModel;", "matchDetails", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsDataModel;", "subMatchName", "loadVarietyMinStakeConfig", "onBetClick", "groupId", "betIndex", "bind", "activityP", "isLive", "idP", "participationIdP", "invokeRefresh", "pollMatchShortInfo", "matchId", "refreshOneClickBetEnabledFromPrefs", "cleanup", "onGetBetInfo", "loadSubscriptions", "onNavigateToSubscriptionAdd", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "loadMyPlacedBetsForMatch", "clearFinishedMatchUpcomingCategories", "maybeLoadUpcomingMatchesForSingleBet", "bets", "resolveBetTeamOrder", "Lkotlin/Pair;", "Lorg/betup/model/remote/entity/matches/details/TeamModelShort;", "betName", "home", "away", "loadTeamUpcomingCategory", "team", "currentMatchId", "onDone", "Lkotlin/Function1;", "onMyPlacedBetClick", "betlistId", "onMatchSubscriptionsGot", "types", "", "Lorg/betup/model/remote/entity/subscription/SubscriptionType;", "success", "onTabSelected", "onBetGroupTabSelected", "_expandedStatesPerTab", "", "expandedStatesPerTab", "getExpandedStatesPerTab", "onExpandToggle", "tabIndex", "setAllExpanded", "expanded", "groupIds", "onBetPlacedSuccess", "Lorg/betup/bus/BetPlacedSuccessMessage;", "onChallengesChanged", "Lorg/betup/ui/dialogs/events/ChallengeAcceptedOrCreatedEvent;", "onBetlistUpdated", "Lorg/betup/bus/BetlistUpdatedMessage;", "onCoefficientUpdated", "Lorg/betup/bus/CoefficientUpdatedMessage;", "onBetsUnlocked", "Lorg/betup/bus/BetsUnlockedMessage;", "refreshBetGroups", "setSelectedStatisticsTab", "tabItem", "loadAvailableBattles", "loadMoreAvailableBattles", "refreshBattles", "loadAvailableBattlesInitial", "acceptBattle", "battleId", "openBattlePreview", "challengeIds", "createBattle", "deactivateBattlesTabIndicator", "loadQuizAvailability", "applyParticipationMatchResultToBaseInfo", "participation", "loadMatchQuizParticipationDetails", "deactivateQuizTabIndicator", "loadQuizDetails", "quizId", "loadQuizTiers", "selectQuizAnswer", "questionIndex", "betId", "coefficient", "", "varietyName", "selectQuizTier", "tierId", "toggleQuizPreview", C3664q2.v, "setQuizQuestionIndex", "placeQuizParticipation", "startUnlockBetTypesFlow", "purchaseCompleted", "displayProgress", "hideProgress", VastTagName.COMPANION, "VarietyStatsTab", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchDetailsController implements BaseCachedSharedInteractor.OnFetchedListener<MatchShortInfoModel, Integer>, SubscriptionService.MatchSubscriptionsLoadListener, PurchaseCompletedListener, ProgressDisplay {
    private static final int COMMENTS_TAB_INDEX = 2;
    private static final String ERROR_LOADING_MATCH = "Error loading match details";
    private static final String ERROR_LOADING_SUBSCRIPTIONS = "Error loading subscriptions";
    private static final String TAG = "MatchDetailsController";
    private final MutableStateFlow<List<BattleUiItem>> _availableBattles;
    private final MutableStateFlow<MatchTopBaseData> _baseMatchInfo;
    private final MutableStateFlow<List<MatchVarietyGroupBetsModel>> _betGroups;
    private final MutableStateFlow<Boolean> _canCreateBattle;
    private final MutableStateFlow<MatchShortInfoModel> _currentMatch;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Map<Integer, Map<Long, Boolean>>> _expandedStatesPerTab;
    private final MutableStateFlow<List<MatchHistoryCategoryUiItem>> _finishedMatchUpcomingCategories;
    private final MutableStateFlow<Boolean> _hasMoreAvailableBattles;
    private final MutableStateFlow<Boolean> _hasMoreMatchComments;
    private final MutableStateFlow<Boolean> _hasMoreStatistics;
    private final MutableStateFlow<Boolean> _hasStatisticsAvailable;
    private final MutableStateFlow<Boolean> _hasUnreadMatchComments;
    private final MutableStateFlow<List<MatchHistoryCategoryUiItem>> _historyData;
    private final MutableStateFlow<Boolean> _isBattlesLoading;
    private final MutableStateFlow<Boolean> _isHistoryLoading;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isMatchCommentsLoading;
    private final MutableStateFlow<Boolean> _isMatchCommentsLoadingMore;
    private final MutableStateFlow<Boolean> _isMyPlacedBetsLoading;
    private final MutableStateFlow<Boolean> _isPlacingQuiz;
    private final MutableStateFlow<Boolean> _isQuizDetailsLoading;
    private final MutableStateFlow<Boolean> _isQuizLoading;
    private final MutableStateFlow<Boolean> _isQuizParticipationLoading;
    private final MutableStateFlow<Boolean> _isSendingMatchComment;
    private final MutableStateFlow<Boolean> _isStatisticsLoading;
    private final MutableStateFlow<Boolean> _isSubscribed;
    private final MutableStateFlow<List<ExtendedMessageModel>> _matchComments;
    private final MutableStateFlow<List<MatchPlacedBetInfoModel>> _myPlacedBets;
    private final MutableStateFlow<Boolean> _oneClickBetEnabled;
    private final MutableStateFlow<Integer> _playerStatsInfoRefreshTick;
    private final MutableStateFlow<Boolean> _playerStatsMinInfoAutoDismissed;
    private final MutableStateFlow<Boolean> _playerStatsMinInfoHelpOpen;
    private final MutableStateFlow<Long> _playerStatsMinStake;
    private final MutableStateFlow<MatchDetailsQuizAvailabilityModel> _quizAvailability;
    private final MutableStateFlow<QuizModel> _quizDetails;
    private final MutableStateFlow<QuizParticipationModel> _quizParticipationDetails;
    private final MutableStateFlow<QuizSelectionState> _quizSelectionState;
    private final MutableStateFlow<List<QuizTierModel>> _quizTiers;
    private final MutableStateFlow<Integer> _selectedBetGroupTabIndex;
    private final MutableStateFlow<Set<Long>> _selectedBetIds;
    private final MutableStateFlow<Integer> _selectedStatsTabIndex;
    private final MutableStateFlow<Integer> _selectedTabIndex;
    private final MutableStateFlow<Integer> _selectedVarietyIndex;
    private final MutableStateFlow<List<MatchStatisticsUiSingleItem>> _statistics;
    private final MutableStateFlow<List<MatchStatsTabs>> _statsTabs;
    private final MutableStateFlow<List<BetGroupsTabs>> _subMatches;
    private final MutableStateFlow<List<MatchDetailsButtonTabs>> _tabItems;
    private final MutableStateFlow<Set<Long>> _validatingBetIds;
    private final MutableStateFlow<List<VarietyStatsTab>> _varietyStatsTabs;
    private MainActivity activity;

    @Inject
    public AnalyticsService analyticsService;
    private final StateFlow<List<BattleUiItem>> availableBattles;
    private int availableBattlesOffset;
    private boolean bannerTracked;
    private final StateFlow<MatchTopBaseData> baseMatchInfo;
    private final int battlesLimit;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewChallengesResponseModel, Long> battlesListener;
    private final StateFlow<List<MatchVarietyGroupBetsModel>> betGroups;

    @Inject
    public BetListAppender betListAppender;

    @Inject
    public BetValidator betValidator;

    @Inject
    public BillingService billingService;
    private final StateFlow<Boolean> canCreateBattle;
    private final CoroutineScope controllerScope;
    private final StateFlow<MatchShortInfoModel> currentMatch;
    private final StateFlow<MatchTopBaseData> displayBaseMatchInfo;
    private final StateFlow<String> error;
    private final StateFlow<Map<Integer, Map<Long, Boolean>>> expandedStatesPerTab;
    private final StateFlow<List<MatchHistoryCategoryUiItem>> finishedMatchUpcomingCategories;

    @Inject
    public FirebaseRemoteConfig firebaseRemoteConfig;

    @Inject
    public GetPromoBannerForMatchInteractor getPromoBannerForMatchInteractor;

    @Inject
    public GetPublicChatMessagesInteractor getPublicChatMessagesInteractor;

    @Inject
    public GetTeamDetailsInteractor getTeamDetailsInteractor;
    private final MatchDetailsController$groupedStatsListener$1 groupedStatsListener;
    private final StateFlow<Boolean> hasMoreAvailableBattles;
    private final StateFlow<Boolean> hasMoreMatchComments;
    private final StateFlow<Boolean> hasMoreStatistics;
    private final StateFlow<Boolean> hasStatisticsAvailable;
    private final StateFlow<List<MatchHistoryCategoryUiItem>> historyData;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<NewMatchHistoryResponseModel>, Long> historyListener;
    private int id;
    private final StateFlow<Boolean> isBattlesLoading;
    private final StateFlow<Boolean> isHistoryLoading;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isMatchCommentsLoading;
    private final StateFlow<Boolean> isMatchCommentsLoadingMore;
    private final StateFlow<Boolean> isMyPlacedBetsLoading;
    private final StateFlow<Boolean> isPlacingQuiz;
    private final StateFlow<Boolean> isQuizDetailsLoading;
    private final StateFlow<Boolean> isQuizLoading;
    private final StateFlow<Boolean> isQuizParticipationLoading;
    private final StateFlow<Boolean> isSendingMatchComment;
    private final StateFlow<Boolean> isStatisticsLoading;
    private final StateFlow<Boolean> isSubscribed;
    private int lastRequestedMatchCommentsPage;

    @Inject
    public LocalPreferencesService localPreferencesService;

    @Inject
    public MatchVarietiesInteractor matchBetGroupsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<MatchVarietyGroupModel>, List<Integer>> matchBetListener;
    private final StateFlow<List<ExtendedMessageModel>> matchComments;
    private final BaseCachedSharedInteractor.OnFetchedListener<PageModel<ExtendedMessageModel>, Long> matchCommentsListener;

    @Inject
    public MatchInfoInteractor matchDetailsInteractor;

    @Inject
    public MatchMyBetsInteractor matchMyBetsInteractor;

    @Inject
    public MatchQuizParticipationInteractor matchQuizParticipationInteractor;

    @Inject
    public MatchShortInfoInteractor matchesDetailsRequestInteractor;
    private final StateFlow<List<MatchPlacedBetInfoModel>> myPlacedBets;

    @Inject
    public NewChallengesInteractor newChallengesInteractor;
    private Integer nextMatchCommentsPage;
    private OddType oddType;
    private final StateFlow<Boolean> oneClickBetEnabled;
    private int participationId;
    private final StateFlow<Long> playerStatsMinStake;
    private boolean preventAutoSync;
    private final StateFlow<MatchDetailsQuizAvailabilityModel> quizAvailability;

    @Inject
    public QuizAvailabilityInteractor quizAvailabilityInteractor;
    private final StateFlow<QuizModel> quizDetails;

    @Inject
    public QuizDetailsInteractor quizDetailsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<QuizModel, Long> quizDetailsListener;
    private final StateFlow<QuizParticipationModel> quizParticipationDetails;

    @Inject
    public QuizParticipationInteractor quizParticipationInteractor;
    private final StateFlow<QuizSelectionState> quizSelectionState;
    private final StateFlow<List<QuizTierModel>> quizTiers;

    @Inject
    public QuizTiersInteractor quizTiersInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<QuizTierModel>, Unit> quizTiersListener;
    private final StateFlow<Integer> selectedBetGroupTabIndex;
    private final StateFlow<Set<Long>> selectedBetIds;
    private final StateFlow<Integer> selectedStatsTabs;
    private final StateFlow<Integer> selectedTabIndex;
    private final StateFlow<Integer> selectedVarietyIndex;
    private final BaseCachedSharedInteractor.OnFetchedListener<MessageModel, Long> sendMatchCommentListener;

    @Inject
    public SendPublicChatMessageInteractor sendPublicChatMessageInteractor;
    private final StateFlow<Boolean> showPlayerStatsMinStakeInfo;

    @Inject
    public NewSingleShopInteractor singleShopInteractor;
    private final StateFlow<List<MatchStatisticsUiSingleItem>> statistics;
    private final int statisticsLimit;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewMatchStatisticsResponseModel, Long> statisticsListener;
    private int statisticsOffset;
    private final StateFlow<List<MatchStatsTabs>> statsTabs;
    private final StateFlow<List<BetGroupsTabs>> subMatches;

    @Inject
    public SubscoreService subscoreService;

    @Inject
    public DefaultSubscriptionService subscriptionService;
    private final StateFlow<List<MatchDetailsButtonTabs>> tabItems;
    private volatile int upcomingTeamsLoadGeneration;

    @Inject
    public UserService userService;

    @Inject
    public UserService userServiceP;

    @Inject
    public V7MatchHistoryInteractor v7MatchHistoryInteractor;

    @Inject
    public V7MatchStatisticsInteractor v7MatchStatisticsInteractor;

    @Inject
    public V7StatsByVarietiesInteractor v7StatsByVarietiesInteractor;

    @Inject
    public V7VarietyBetRestrictionsInteractor v7VarietyBetRestrictionsInteractor;

    @Inject
    public V7VarietyVersionGatesInteractor v7VarietyVersionGatesInteractor;
    private final StateFlow<Set<Long>> validatingBetIds;
    private Long varietyId;
    private final StateFlow<List<VarietyStatsTab>> varietyStatsTabs;

    @Inject
    public VideoRewardService videoRewardService;
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r1v33, types: [org.betup.ui.fragment.matches.details.MatchDetailsController$groupedStatsListener$1] */
    public MatchDetailsController() {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.controllerScope = CoroutineScope;
        MutableStateFlow<MatchShortInfoModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._currentMatch = MutableStateFlow;
        this.currentMatch = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<MatchTopBaseData> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._baseMatchInfo = MutableStateFlow2;
        this.baseMatchInfo = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<BetGroupsTabs>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._subMatches = MutableStateFlow3;
        this.subMatches = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<String> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow4;
        this.error = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Integer> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0);
        this._selectedTabIndex = MutableStateFlow5;
        this.selectedTabIndex = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<List<MatchDetailsButtonTabs>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._tabItems = MutableStateFlow6;
        this.tabItems = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(false);
        this._isSubscribed = MutableStateFlow7;
        this.isSubscribed = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._oneClickBetEnabled = MutableStateFlow8;
        this.oneClickBetEnabled = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow9;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<List<MatchVarietyGroupBetsModel>> MutableStateFlow10 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betGroups = MutableStateFlow10;
        this.betGroups = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<List<MatchPlacedBetInfoModel>> MutableStateFlow11 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._myPlacedBets = MutableStateFlow11;
        this.myPlacedBets = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<Boolean> MutableStateFlow12 = StateFlowKt.MutableStateFlow(false);
        this._isMyPlacedBetsLoading = MutableStateFlow12;
        this.isMyPlacedBetsLoading = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<List<MatchHistoryCategoryUiItem>> MutableStateFlow13 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._finishedMatchUpcomingCategories = MutableStateFlow13;
        this.finishedMatchUpcomingCategories = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<Integer> MutableStateFlow14 = StateFlowKt.MutableStateFlow(0);
        this._selectedBetGroupTabIndex = MutableStateFlow14;
        this.selectedBetGroupTabIndex = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<Long> MutableStateFlow15 = StateFlowKt.MutableStateFlow(0L);
        this._playerStatsMinStake = MutableStateFlow15;
        this.playerStatsMinStake = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow<Integer> MutableStateFlow16 = StateFlowKt.MutableStateFlow(0);
        this._playerStatsInfoRefreshTick = MutableStateFlow16;
        MutableStateFlow<Boolean> MutableStateFlow17 = StateFlowKt.MutableStateFlow(false);
        this._playerStatsMinInfoHelpOpen = MutableStateFlow17;
        MutableStateFlow<Boolean> MutableStateFlow18 = StateFlowKt.MutableStateFlow(false);
        this._playerStatsMinInfoAutoDismissed = MutableStateFlow18;
        this.showPlayerStatsMinStakeInfo = FlowKt.stateIn(FlowKt.combine(MutableStateFlow3, MutableStateFlow14, MutableStateFlow17, MutableStateFlow18, MutableStateFlow16, new MatchDetailsController$showPlayerStatsMinStakeInfo$1(this, null)), CoroutineScope, SharingStarted.INSTANCE.getEagerly(), false);
        this.displayBaseMatchInfo = FlowKt.stateIn(FlowKt.combine(MutableStateFlow2, MutableStateFlow5, MutableStateFlow14, MutableStateFlow3, new MatchDetailsController$displayBaseMatchInfo$1(null)), CoroutineScope, SharingStarted.INSTANCE.getEagerly(), null);
        MutableStateFlow<Set<Long>> MutableStateFlow19 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._selectedBetIds = MutableStateFlow19;
        this.selectedBetIds = FlowKt.asStateFlow(MutableStateFlow19);
        MutableStateFlow<Set<Long>> MutableStateFlow20 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._validatingBetIds = MutableStateFlow20;
        this.validatingBetIds = FlowKt.asStateFlow(MutableStateFlow20);
        MutableStateFlow<List<MatchStatisticsUiSingleItem>> MutableStateFlow21 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._statistics = MutableStateFlow21;
        this.statistics = FlowKt.asStateFlow(MutableStateFlow21);
        MutableStateFlow<Boolean> MutableStateFlow22 = StateFlowKt.MutableStateFlow(false);
        this._isStatisticsLoading = MutableStateFlow22;
        this.isStatisticsLoading = FlowKt.asStateFlow(MutableStateFlow22);
        MutableStateFlow<Boolean> MutableStateFlow23 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreStatistics = MutableStateFlow23;
        this.hasMoreStatistics = FlowKt.asStateFlow(MutableStateFlow23);
        MutableStateFlow<List<MatchStatsTabs>> MutableStateFlow24 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._statsTabs = MutableStateFlow24;
        this.statsTabs = FlowKt.asStateFlow(MutableStateFlow24);
        MutableStateFlow<Integer> MutableStateFlow25 = StateFlowKt.MutableStateFlow(0);
        this._selectedStatsTabIndex = MutableStateFlow25;
        this.selectedStatsTabs = FlowKt.asStateFlow(MutableStateFlow25);
        MutableStateFlow<List<VarietyStatsTab>> MutableStateFlow26 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._varietyStatsTabs = MutableStateFlow26;
        this.varietyStatsTabs = FlowKt.asStateFlow(MutableStateFlow26);
        MutableStateFlow<Integer> MutableStateFlow27 = StateFlowKt.MutableStateFlow(0);
        this._selectedVarietyIndex = MutableStateFlow27;
        this.selectedVarietyIndex = FlowKt.asStateFlow(MutableStateFlow27);
        MutableStateFlow<List<MatchHistoryCategoryUiItem>> MutableStateFlow28 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._historyData = MutableStateFlow28;
        this.historyData = FlowKt.asStateFlow(MutableStateFlow28);
        MutableStateFlow<Boolean> MutableStateFlow29 = StateFlowKt.MutableStateFlow(false);
        this._isHistoryLoading = MutableStateFlow29;
        this.isHistoryLoading = FlowKt.asStateFlow(MutableStateFlow29);
        MutableStateFlow<Boolean> MutableStateFlow30 = StateFlowKt.MutableStateFlow(true);
        this._hasStatisticsAvailable = MutableStateFlow30;
        this.hasStatisticsAvailable = FlowKt.asStateFlow(MutableStateFlow30);
        this.statisticsLimit = 10;
        MutableStateFlow<List<BattleUiItem>> MutableStateFlow31 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._availableBattles = MutableStateFlow31;
        this.availableBattles = FlowKt.asStateFlow(MutableStateFlow31);
        MutableStateFlow<Boolean> MutableStateFlow32 = StateFlowKt.MutableStateFlow(false);
        this._isBattlesLoading = MutableStateFlow32;
        this.isBattlesLoading = FlowKt.asStateFlow(MutableStateFlow32);
        MutableStateFlow<Boolean> MutableStateFlow33 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreAvailableBattles = MutableStateFlow33;
        this.hasMoreAvailableBattles = FlowKt.asStateFlow(MutableStateFlow33);
        MutableStateFlow<Boolean> MutableStateFlow34 = StateFlowKt.MutableStateFlow(true);
        this._canCreateBattle = MutableStateFlow34;
        this.canCreateBattle = FlowKt.asStateFlow(MutableStateFlow34);
        this.battlesLimit = 5;
        MutableStateFlow<MatchDetailsQuizAvailabilityModel> MutableStateFlow35 = StateFlowKt.MutableStateFlow(null);
        this._quizAvailability = MutableStateFlow35;
        this.quizAvailability = FlowKt.asStateFlow(MutableStateFlow35);
        MutableStateFlow<QuizParticipationModel> MutableStateFlow36 = StateFlowKt.MutableStateFlow(null);
        this._quizParticipationDetails = MutableStateFlow36;
        this.quizParticipationDetails = FlowKt.asStateFlow(MutableStateFlow36);
        MutableStateFlow<Boolean> MutableStateFlow37 = StateFlowKt.MutableStateFlow(false);
        this._isQuizLoading = MutableStateFlow37;
        this.isQuizLoading = FlowKt.asStateFlow(MutableStateFlow37);
        MutableStateFlow<Boolean> MutableStateFlow38 = StateFlowKt.MutableStateFlow(false);
        this._isQuizParticipationLoading = MutableStateFlow38;
        this.isQuizParticipationLoading = FlowKt.asStateFlow(MutableStateFlow38);
        MutableStateFlow<QuizModel> MutableStateFlow39 = StateFlowKt.MutableStateFlow(null);
        this._quizDetails = MutableStateFlow39;
        this.quizDetails = FlowKt.asStateFlow(MutableStateFlow39);
        MutableStateFlow<Boolean> MutableStateFlow40 = StateFlowKt.MutableStateFlow(false);
        this._isQuizDetailsLoading = MutableStateFlow40;
        this.isQuizDetailsLoading = FlowKt.asStateFlow(MutableStateFlow40);
        MutableStateFlow<List<QuizTierModel>> MutableStateFlow41 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._quizTiers = MutableStateFlow41;
        this.quizTiers = FlowKt.asStateFlow(MutableStateFlow41);
        MutableStateFlow<QuizSelectionState> MutableStateFlow42 = StateFlowKt.MutableStateFlow(new QuizSelectionState(0, null, null, false, 15, null));
        this._quizSelectionState = MutableStateFlow42;
        this.quizSelectionState = FlowKt.asStateFlow(MutableStateFlow42);
        MutableStateFlow<Boolean> MutableStateFlow43 = StateFlowKt.MutableStateFlow(false);
        this._isPlacingQuiz = MutableStateFlow43;
        this.isPlacingQuiz = FlowKt.asStateFlow(MutableStateFlow43);
        MutableStateFlow<List<ExtendedMessageModel>> MutableStateFlow44 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._matchComments = MutableStateFlow44;
        this.matchComments = FlowKt.asStateFlow(MutableStateFlow44);
        MutableStateFlow<Boolean> MutableStateFlow45 = StateFlowKt.MutableStateFlow(false);
        this._isMatchCommentsLoading = MutableStateFlow45;
        this.isMatchCommentsLoading = FlowKt.asStateFlow(MutableStateFlow45);
        MutableStateFlow<Boolean> MutableStateFlow46 = StateFlowKt.MutableStateFlow(false);
        this._isMatchCommentsLoadingMore = MutableStateFlow46;
        this.isMatchCommentsLoadingMore = FlowKt.asStateFlow(MutableStateFlow46);
        MutableStateFlow<Boolean> MutableStateFlow47 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreMatchComments = MutableStateFlow47;
        this.hasMoreMatchComments = FlowKt.asStateFlow(MutableStateFlow47);
        MutableStateFlow<Boolean> MutableStateFlow48 = StateFlowKt.MutableStateFlow(false);
        this._isSendingMatchComment = MutableStateFlow48;
        this.isSendingMatchComment = FlowKt.asStateFlow(MutableStateFlow48);
        this.nextMatchCommentsPage = 0;
        this._hasUnreadMatchComments = StateFlowKt.MutableStateFlow(false);
        this.statisticsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda6
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.statisticsListener$lambda$7(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.historyListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda7
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.historyListener$lambda$10(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.matchCommentsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda8
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.matchCommentsListener$lambda$13(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.sendMatchCommentListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda9
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.sendMatchCommentListener$lambda$15(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.battlesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda10
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.battlesListener$lambda$29(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.quizDetailsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda12
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.quizDetailsListener$lambda$31(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.quizTiersListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda13
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.quizTiersListener$lambda$32(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.matchBetListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda14
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchDetailsController.matchBetListener$lambda$36(MatchDetailsController.this, fetchedResponseMessage);
            }
        };
        this.groupedStatsListener = new BaseCachedSharedInteractor.OnFetchedListener<List<? extends VarietyStatsModel>, Long>() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$groupedStatsListener$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<List<? extends VarietyStatsModel>, Long> response) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                MutableStateFlow mutableStateFlow4;
                MutableStateFlow mutableStateFlow5;
                MutableStateFlow mutableStateFlow6;
                MutableStateFlow mutableStateFlow7;
                MutableStateFlow mutableStateFlow8;
                MutableStateFlow mutableStateFlow9;
                MutableStateFlow mutableStateFlow10;
                MutableStateFlow mutableStateFlow11;
                MutableStateFlow mutableStateFlow12;
                MutableStateFlow mutableStateFlow13;
                MutableStateFlow mutableStateFlow14;
                MutableStateFlow mutableStateFlow15;
                Intrinsics.checkNotNullParameter(response, "response");
                Log.d("MatchDetailsController", "Grouped stats response - stat: " + response.getStat());
                mutableStateFlow = MatchDetailsController.this._isStatisticsLoading;
                mutableStateFlow.setValue(false);
                if (response.getStat() != FetchStat.SUCCESS || response.getModel() == null) {
                    mutableStateFlow2 = MatchDetailsController.this._hasStatisticsAvailable;
                    mutableStateFlow2.setValue(false);
                    mutableStateFlow3 = MatchDetailsController.this._statistics;
                    mutableStateFlow3.setValue(CollectionsKt.emptyList());
                    mutableStateFlow4 = MatchDetailsController.this._varietyStatsTabs;
                    mutableStateFlow4.setValue(CollectionsKt.emptyList());
                    return;
                }
                List<? extends VarietyStatsModel> model = response.getModel();
                if (model.isEmpty()) {
                    mutableStateFlow13 = MatchDetailsController.this._hasStatisticsAvailable;
                    mutableStateFlow13.setValue(false);
                    mutableStateFlow14 = MatchDetailsController.this._statistics;
                    mutableStateFlow14.setValue(CollectionsKt.emptyList());
                    mutableStateFlow15 = MatchDetailsController.this._varietyStatsTabs;
                    mutableStateFlow15.setValue(CollectionsKt.emptyList());
                    return;
                }
                mutableStateFlow5 = MatchDetailsController.this._hasStatisticsAvailable;
                mutableStateFlow5.setValue(true);
                mutableStateFlow6 = MatchDetailsController.this._hasMoreStatistics;
                mutableStateFlow6.setValue(false);
                Intrinsics.checkNotNull(model);
                List<? extends VarietyStatsModel> list = model;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (VarietyStatsModel varietyStatsModel : list) {
                    List<NewMatchStatisticsItemModel> stats = varietyStatsModel.getStats();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(stats, 10));
                    for (NewMatchStatisticsItemModel newMatchStatisticsItemModel : stats) {
                        float value = newMatchStatisticsItemModel.getHomeStat().getValue();
                        float value2 = newMatchStatisticsItemModel.getAwayStat().getValue();
                        float f = value + value2;
                        arrayList2.add(new MatchStatisticsUiSingleItem(newMatchStatisticsItemModel.getName(), new Pair(new MatchStatisticsUiTeamItem(String.valueOf((int) value), f > 0.0f ? (value / f) * 100 : 50.0f, null, 4, null), new MatchStatisticsUiTeamItem(String.valueOf((int) value2), f > 0.0f ? (value2 / f) * 100 : 50.0f, null, 4, null))));
                    }
                    ArrayList arrayList3 = arrayList2;
                    long varietyId = varietyStatsModel.getVarietyId();
                    String varietyName = varietyStatsModel.getVarietyName();
                    String str = "Full Game";
                    if (varietyName != null) {
                        String str2 = varietyName;
                        if (str2.length() == 0) {
                            str2 = "Full Game";
                        }
                        String str3 = str2;
                        if (str3 != null) {
                            str = str3;
                        }
                    }
                    arrayList.add(new MatchDetailsController.VarietyStatsTab(varietyId, str, arrayList3));
                }
                ArrayList arrayList4 = arrayList;
                mutableStateFlow7 = MatchDetailsController.this._varietyStatsTabs;
                mutableStateFlow7.setValue(arrayList4);
                if (!arrayList4.isEmpty()) {
                    mutableStateFlow11 = MatchDetailsController.this._selectedVarietyIndex;
                    mutableStateFlow11.setValue(0);
                    mutableStateFlow12 = MatchDetailsController.this._statistics;
                    mutableStateFlow12.setValue(((MatchDetailsController.VarietyStatsTab) arrayList4.get(0)).getStats());
                }
                mutableStateFlow8 = MatchDetailsController.this._statsTabs;
                Iterable<MatchStatsTabs> iterable = (Iterable) mutableStateFlow8.getValue();
                MatchDetailsController matchDetailsController = MatchDetailsController.this;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (MatchStatsTabs.MatchStatisticsUiItem matchStatisticsUiItem : iterable) {
                    if (matchStatisticsUiItem instanceof MatchStatsTabs.MatchStatisticsUiItem) {
                        mutableStateFlow10 = matchDetailsController._statistics;
                        matchStatisticsUiItem = ((MatchStatsTabs.MatchStatisticsUiItem) matchStatisticsUiItem).copy((List) mutableStateFlow10.getValue());
                    }
                    arrayList5.add(matchStatisticsUiItem);
                }
                mutableStateFlow9 = MatchDetailsController.this._statsTabs;
                mutableStateFlow9.setValue(arrayList5);
                Log.d("MatchDetailsController", "Variety stats loaded: " + arrayList4.size() + " tabs");
            }
        };
        MutableStateFlow<Map<Integer, Map<Long, Boolean>>> MutableStateFlow49 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this._expandedStatesPerTab = MutableStateFlow49;
        this.expandedStatesPerTab = FlowKt.asStateFlow(MutableStateFlow49);
    }

    public final GetPromoBannerForMatchInteractor getGetPromoBannerForMatchInteractor() {
        GetPromoBannerForMatchInteractor getPromoBannerForMatchInteractor = this.getPromoBannerForMatchInteractor;
        if (getPromoBannerForMatchInteractor != null) {
            return getPromoBannerForMatchInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getPromoBannerForMatchInteractor");
        return null;
    }

    public final void setGetPromoBannerForMatchInteractor(GetPromoBannerForMatchInteractor getPromoBannerForMatchInteractor) {
        Intrinsics.checkNotNullParameter(getPromoBannerForMatchInteractor, "<set-?>");
        this.getPromoBannerForMatchInteractor = getPromoBannerForMatchInteractor;
    }

    public final MatchShortInfoInteractor getMatchesDetailsRequestInteractor() {
        MatchShortInfoInteractor matchShortInfoInteractor = this.matchesDetailsRequestInteractor;
        if (matchShortInfoInteractor != null) {
            return matchShortInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchesDetailsRequestInteractor");
        return null;
    }

    public final void setMatchesDetailsRequestInteractor(MatchShortInfoInteractor matchShortInfoInteractor) {
        Intrinsics.checkNotNullParameter(matchShortInfoInteractor, "<set-?>");
        this.matchesDetailsRequestInteractor = matchShortInfoInteractor;
    }

    public final BetListAppender getBetListAppender() {
        BetListAppender betListAppender = this.betListAppender;
        if (betListAppender != null) {
            return betListAppender;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betListAppender");
        return null;
    }

    public final void setBetListAppender(BetListAppender betListAppender) {
        Intrinsics.checkNotNullParameter(betListAppender, "<set-?>");
        this.betListAppender = betListAppender;
    }

    public final BetValidator getBetValidator() {
        BetValidator betValidator = this.betValidator;
        if (betValidator != null) {
            return betValidator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betValidator");
        return null;
    }

    public final void setBetValidator(BetValidator betValidator) {
        Intrinsics.checkNotNullParameter(betValidator, "<set-?>");
        this.betValidator = betValidator;
    }

    public final SubscoreService getSubscoreService() {
        SubscoreService subscoreService = this.subscoreService;
        if (subscoreService != null) {
            return subscoreService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("subscoreService");
        return null;
    }

    public final void setSubscoreService(SubscoreService subscoreService) {
        Intrinsics.checkNotNullParameter(subscoreService, "<set-?>");
        this.subscoreService = subscoreService;
    }

    public final UserService getUserServiceP() {
        UserService userService = this.userServiceP;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userServiceP");
        return null;
    }

    public final void setUserServiceP(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userServiceP = userService;
    }

    public final DefaultSubscriptionService getSubscriptionService() {
        DefaultSubscriptionService defaultSubscriptionService = this.subscriptionService;
        if (defaultSubscriptionService != null) {
            return defaultSubscriptionService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("subscriptionService");
        return null;
    }

    public final void setSubscriptionService(DefaultSubscriptionService defaultSubscriptionService) {
        Intrinsics.checkNotNullParameter(defaultSubscriptionService, "<set-?>");
        this.subscriptionService = defaultSubscriptionService;
    }

    public final MatchVarietiesInteractor getMatchBetGroupsInteractor() {
        MatchVarietiesInteractor matchVarietiesInteractor = this.matchBetGroupsInteractor;
        if (matchVarietiesInteractor != null) {
            return matchVarietiesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchBetGroupsInteractor");
        return null;
    }

    public final void setMatchBetGroupsInteractor(MatchVarietiesInteractor matchVarietiesInteractor) {
        Intrinsics.checkNotNullParameter(matchVarietiesInteractor, "<set-?>");
        this.matchBetGroupsInteractor = matchVarietiesInteractor;
    }

    public final MatchMyBetsInteractor getMatchMyBetsInteractor() {
        MatchMyBetsInteractor matchMyBetsInteractor = this.matchMyBetsInteractor;
        if (matchMyBetsInteractor != null) {
            return matchMyBetsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchMyBetsInteractor");
        return null;
    }

    public final void setMatchMyBetsInteractor(MatchMyBetsInteractor matchMyBetsInteractor) {
        Intrinsics.checkNotNullParameter(matchMyBetsInteractor, "<set-?>");
        this.matchMyBetsInteractor = matchMyBetsInteractor;
    }

    public final GetTeamDetailsInteractor getGetTeamDetailsInteractor() {
        GetTeamDetailsInteractor getTeamDetailsInteractor = this.getTeamDetailsInteractor;
        if (getTeamDetailsInteractor != null) {
            return getTeamDetailsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getTeamDetailsInteractor");
        return null;
    }

    public final void setGetTeamDetailsInteractor(GetTeamDetailsInteractor getTeamDetailsInteractor) {
        Intrinsics.checkNotNullParameter(getTeamDetailsInteractor, "<set-?>");
        this.getTeamDetailsInteractor = getTeamDetailsInteractor;
    }

    public final MatchInfoInteractor getMatchDetailsInteractor() {
        MatchInfoInteractor matchInfoInteractor = this.matchDetailsInteractor;
        if (matchInfoInteractor != null) {
            return matchInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchDetailsInteractor");
        return null;
    }

    public final void setMatchDetailsInteractor(MatchInfoInteractor matchInfoInteractor) {
        Intrinsics.checkNotNullParameter(matchInfoInteractor, "<set-?>");
        this.matchDetailsInteractor = matchInfoInteractor;
    }

    public final V7MatchStatisticsInteractor getV7MatchStatisticsInteractor() {
        V7MatchStatisticsInteractor v7MatchStatisticsInteractor = this.v7MatchStatisticsInteractor;
        if (v7MatchStatisticsInteractor != null) {
            return v7MatchStatisticsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7MatchStatisticsInteractor");
        return null;
    }

    public final void setV7MatchStatisticsInteractor(V7MatchStatisticsInteractor v7MatchStatisticsInteractor) {
        Intrinsics.checkNotNullParameter(v7MatchStatisticsInteractor, "<set-?>");
        this.v7MatchStatisticsInteractor = v7MatchStatisticsInteractor;
    }

    public final V7StatsByVarietiesInteractor getV7StatsByVarietiesInteractor() {
        V7StatsByVarietiesInteractor v7StatsByVarietiesInteractor = this.v7StatsByVarietiesInteractor;
        if (v7StatsByVarietiesInteractor != null) {
            return v7StatsByVarietiesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7StatsByVarietiesInteractor");
        return null;
    }

    public final void setV7StatsByVarietiesInteractor(V7StatsByVarietiesInteractor v7StatsByVarietiesInteractor) {
        Intrinsics.checkNotNullParameter(v7StatsByVarietiesInteractor, "<set-?>");
        this.v7StatsByVarietiesInteractor = v7StatsByVarietiesInteractor;
    }

    public final V7MatchHistoryInteractor getV7MatchHistoryInteractor() {
        V7MatchHistoryInteractor v7MatchHistoryInteractor = this.v7MatchHistoryInteractor;
        if (v7MatchHistoryInteractor != null) {
            return v7MatchHistoryInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7MatchHistoryInteractor");
        return null;
    }

    public final void setV7MatchHistoryInteractor(V7MatchHistoryInteractor v7MatchHistoryInteractor) {
        Intrinsics.checkNotNullParameter(v7MatchHistoryInteractor, "<set-?>");
        this.v7MatchHistoryInteractor = v7MatchHistoryInteractor;
    }

    public final NewChallengesInteractor getNewChallengesInteractor() {
        NewChallengesInteractor newChallengesInteractor = this.newChallengesInteractor;
        if (newChallengesInteractor != null) {
            return newChallengesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newChallengesInteractor");
        return null;
    }

    public final void setNewChallengesInteractor(NewChallengesInteractor newChallengesInteractor) {
        Intrinsics.checkNotNullParameter(newChallengesInteractor, "<set-?>");
        this.newChallengesInteractor = newChallengesInteractor;
    }

    public final BillingService getBillingService() {
        BillingService billingService = this.billingService;
        if (billingService != null) {
            return billingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("billingService");
        return null;
    }

    public final void setBillingService(BillingService billingService) {
        Intrinsics.checkNotNullParameter(billingService, "<set-?>");
        this.billingService = billingService;
    }

    public final FirebaseRemoteConfig getFirebaseRemoteConfig() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firebaseRemoteConfig");
        return null;
    }

    public final void setFirebaseRemoteConfig(FirebaseRemoteConfig firebaseRemoteConfig) {
        Intrinsics.checkNotNullParameter(firebaseRemoteConfig, "<set-?>");
        this.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public final NewSingleShopInteractor getSingleShopInteractor() {
        NewSingleShopInteractor newSingleShopInteractor = this.singleShopInteractor;
        if (newSingleShopInteractor != null) {
            return newSingleShopInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singleShopInteractor");
        return null;
    }

    public final void setSingleShopInteractor(NewSingleShopInteractor newSingleShopInteractor) {
        Intrinsics.checkNotNullParameter(newSingleShopInteractor, "<set-?>");
        this.singleShopInteractor = newSingleShopInteractor;
    }

    public final AnalyticsService getAnalyticsService() {
        AnalyticsService analyticsService = this.analyticsService;
        if (analyticsService != null) {
            return analyticsService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsService");
        return null;
    }

    public final void setAnalyticsService(AnalyticsService analyticsService) {
        Intrinsics.checkNotNullParameter(analyticsService, "<set-?>");
        this.analyticsService = analyticsService;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
    }

    public final VideoRewardService getVideoRewardService() {
        VideoRewardService videoRewardService = this.videoRewardService;
        if (videoRewardService != null) {
            return videoRewardService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("videoRewardService");
        return null;
    }

    public final void setVideoRewardService(VideoRewardService videoRewardService) {
        Intrinsics.checkNotNullParameter(videoRewardService, "<set-?>");
        this.videoRewardService = videoRewardService;
    }

    public final QuizAvailabilityInteractor getQuizAvailabilityInteractor() {
        QuizAvailabilityInteractor quizAvailabilityInteractor = this.quizAvailabilityInteractor;
        if (quizAvailabilityInteractor != null) {
            return quizAvailabilityInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quizAvailabilityInteractor");
        return null;
    }

    public final void setQuizAvailabilityInteractor(QuizAvailabilityInteractor quizAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(quizAvailabilityInteractor, "<set-?>");
        this.quizAvailabilityInteractor = quizAvailabilityInteractor;
    }

    public final QuizDetailsInteractor getQuizDetailsInteractor() {
        QuizDetailsInteractor quizDetailsInteractor = this.quizDetailsInteractor;
        if (quizDetailsInteractor != null) {
            return quizDetailsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quizDetailsInteractor");
        return null;
    }

    public final void setQuizDetailsInteractor(QuizDetailsInteractor quizDetailsInteractor) {
        Intrinsics.checkNotNullParameter(quizDetailsInteractor, "<set-?>");
        this.quizDetailsInteractor = quizDetailsInteractor;
    }

    public final QuizTiersInteractor getQuizTiersInteractor() {
        QuizTiersInteractor quizTiersInteractor = this.quizTiersInteractor;
        if (quizTiersInteractor != null) {
            return quizTiersInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quizTiersInteractor");
        return null;
    }

    public final void setQuizTiersInteractor(QuizTiersInteractor quizTiersInteractor) {
        Intrinsics.checkNotNullParameter(quizTiersInteractor, "<set-?>");
        this.quizTiersInteractor = quizTiersInteractor;
    }

    public final QuizParticipationInteractor getQuizParticipationInteractor() {
        QuizParticipationInteractor quizParticipationInteractor = this.quizParticipationInteractor;
        if (quizParticipationInteractor != null) {
            return quizParticipationInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quizParticipationInteractor");
        return null;
    }

    public final void setQuizParticipationInteractor(QuizParticipationInteractor quizParticipationInteractor) {
        Intrinsics.checkNotNullParameter(quizParticipationInteractor, "<set-?>");
        this.quizParticipationInteractor = quizParticipationInteractor;
    }

    public final GetPublicChatMessagesInteractor getGetPublicChatMessagesInteractor() {
        GetPublicChatMessagesInteractor getPublicChatMessagesInteractor = this.getPublicChatMessagesInteractor;
        if (getPublicChatMessagesInteractor != null) {
            return getPublicChatMessagesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getPublicChatMessagesInteractor");
        return null;
    }

    public final void setGetPublicChatMessagesInteractor(GetPublicChatMessagesInteractor getPublicChatMessagesInteractor) {
        Intrinsics.checkNotNullParameter(getPublicChatMessagesInteractor, "<set-?>");
        this.getPublicChatMessagesInteractor = getPublicChatMessagesInteractor;
    }

    public final SendPublicChatMessageInteractor getSendPublicChatMessageInteractor() {
        SendPublicChatMessageInteractor sendPublicChatMessageInteractor = this.sendPublicChatMessageInteractor;
        if (sendPublicChatMessageInteractor != null) {
            return sendPublicChatMessageInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sendPublicChatMessageInteractor");
        return null;
    }

    public final void setSendPublicChatMessageInteractor(SendPublicChatMessageInteractor sendPublicChatMessageInteractor) {
        Intrinsics.checkNotNullParameter(sendPublicChatMessageInteractor, "<set-?>");
        this.sendPublicChatMessageInteractor = sendPublicChatMessageInteractor;
    }

    public final MatchQuizParticipationInteractor getMatchQuizParticipationInteractor() {
        MatchQuizParticipationInteractor matchQuizParticipationInteractor = this.matchQuizParticipationInteractor;
        if (matchQuizParticipationInteractor != null) {
            return matchQuizParticipationInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchQuizParticipationInteractor");
        return null;
    }

    public final void setMatchQuizParticipationInteractor(MatchQuizParticipationInteractor matchQuizParticipationInteractor) {
        Intrinsics.checkNotNullParameter(matchQuizParticipationInteractor, "<set-?>");
        this.matchQuizParticipationInteractor = matchQuizParticipationInteractor;
    }

    public final LocalPreferencesService getLocalPreferencesService() {
        LocalPreferencesService localPreferencesService = this.localPreferencesService;
        if (localPreferencesService != null) {
            return localPreferencesService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localPreferencesService");
        return null;
    }

    public final void setLocalPreferencesService(LocalPreferencesService localPreferencesService) {
        Intrinsics.checkNotNullParameter(localPreferencesService, "<set-?>");
        this.localPreferencesService = localPreferencesService;
    }

    public final V7VarietyBetRestrictionsInteractor getV7VarietyBetRestrictionsInteractor() {
        V7VarietyBetRestrictionsInteractor v7VarietyBetRestrictionsInteractor = this.v7VarietyBetRestrictionsInteractor;
        if (v7VarietyBetRestrictionsInteractor != null) {
            return v7VarietyBetRestrictionsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7VarietyBetRestrictionsInteractor");
        return null;
    }

    public final void setV7VarietyBetRestrictionsInteractor(V7VarietyBetRestrictionsInteractor v7VarietyBetRestrictionsInteractor) {
        Intrinsics.checkNotNullParameter(v7VarietyBetRestrictionsInteractor, "<set-?>");
        this.v7VarietyBetRestrictionsInteractor = v7VarietyBetRestrictionsInteractor;
    }

    public final V7VarietyVersionGatesInteractor getV7VarietyVersionGatesInteractor() {
        V7VarietyVersionGatesInteractor v7VarietyVersionGatesInteractor = this.v7VarietyVersionGatesInteractor;
        if (v7VarietyVersionGatesInteractor != null) {
            return v7VarietyVersionGatesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7VarietyVersionGatesInteractor");
        return null;
    }

    public final void setV7VarietyVersionGatesInteractor(V7VarietyVersionGatesInteractor v7VarietyVersionGatesInteractor) {
        Intrinsics.checkNotNullParameter(v7VarietyVersionGatesInteractor, "<set-?>");
        this.v7VarietyVersionGatesInteractor = v7VarietyVersionGatesInteractor;
    }

    public final StateFlow<MatchShortInfoModel> getCurrentMatch() {
        return this.currentMatch;
    }

    public final StateFlow<MatchTopBaseData> getBaseMatchInfo() {
        return this.baseMatchInfo;
    }

    public final StateFlow<List<BetGroupsTabs>> getSubMatches() {
        return this.subMatches;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final OddType getOddType() {
        return this.oddType;
    }

    public final StateFlow<Integer> getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final StateFlow<List<MatchDetailsButtonTabs>> getTabItems() {
        return this.tabItems;
    }

    public final StateFlow<Boolean> isSubscribed() {
        return this.isSubscribed;
    }

    public final StateFlow<Boolean> getOneClickBetEnabled() {
        return this.oneClickBetEnabled;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<List<MatchVarietyGroupBetsModel>> getBetGroups() {
        return this.betGroups;
    }

    public final StateFlow<List<MatchPlacedBetInfoModel>> getMyPlacedBets() {
        return this.myPlacedBets;
    }

    public final StateFlow<Boolean> isMyPlacedBetsLoading() {
        return this.isMyPlacedBetsLoading;
    }

    public final StateFlow<List<MatchHistoryCategoryUiItem>> getFinishedMatchUpcomingCategories() {
        return this.finishedMatchUpcomingCategories;
    }

    public final StateFlow<Integer> getSelectedBetGroupTabIndex() {
        return this.selectedBetGroupTabIndex;
    }

    public final StateFlow<Long> getPlayerStatsMinStake() {
        return this.playerStatsMinStake;
    }

    public final StateFlow<Boolean> getShowPlayerStatsMinStakeInfo() {
        return this.showPlayerStatsMinStakeInfo;
    }

    public final boolean getHasPlayerStatsBetEverPlaced() {
        return currentUserHasPlayerStatsBetEverPlaced();
    }

    private final boolean currentUserHasPlayerStatsBetEverPlaced() {
        String minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
        if (minStakeRuleIdForTab == null) {
            return false;
        }
        return currentUserHasVarietyMinStakeBetEverPlaced(minStakeRuleIdForTab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean currentUserHasVarietyMinStakeBetEverPlaced(String ruleId) {
        long betupUserIdOrZero = getUserService().getBetupUserIdOrZero();
        return betupUserIdOrZero > 0 && getLocalPreferencesService().hasVarietyMinStakeBetEverPlaced(betupUserIdOrZero, ruleId);
    }

    private final List<BetGroupsTabs> mapSubmatchesToTabs(List<SubmatchModelShort> submatches) {
        List<SubmatchModelShort> list = submatches;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (final SubmatchModelShort submatchModelShort : list) {
            String betsGameType = submatchModelShort.getBetsGameType();
            List emptyList = CollectionsKt.emptyList();
            List emptyList2 = CollectionsKt.emptyList();
            int id = (int) submatchModelShort.getId();
            int scoreHome = submatchModelShort.getScoreHome();
            int scoreAway = submatchModelShort.getScoreAway();
            String resultRaw = submatchModelShort.getResultRaw();
            if (StringsKt.isBlank(resultRaw)) {
                resultRaw = null;
            }
            Long paramTId = submatchModelShort.getParamTId();
            VarietyBetRestrictionInfoModel varietyBetRestriction = submatchModelShort.getVarietyBetRestriction();
            arrayList.add(new BetGroupsTabs(betsGameType, emptyList, emptyList2, new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit mapSubmatchesToTabs$lambda$2$lambda$1;
                    mapSubmatchesToTabs$lambda$2$lambda$1 = MatchDetailsController.mapSubmatchesToTabs$lambda$2$lambda$1(MatchDetailsController.this, submatchModelShort);
                    return mapSubmatchesToTabs$lambda$2$lambda$1;
                }
            }, id, false, scoreHome, scoreAway, resultRaw, paramTId, varietyBetRestriction, 32, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapSubmatchesToTabs$lambda$2$lambda$1(MatchDetailsController matchDetailsController, SubmatchModelShort submatchModelShort) {
        matchDetailsController.onGetBetInfo((int) submatchModelShort.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String minStakeRuleIdForTab(List<BetGroupsTabs> subs, int tabIdx) {
        VarietyBetRestrictionRuleModel findEnforcedRuleForVariety;
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(subs, tabIdx);
        if (betGroupsTabs == null || (findEnforcedRuleForVariety = VarietyBetRestrictions.INSTANCE.findEnforcedRuleForVariety(betGroupsTabs.getParamTId(), betGroupsTabs.getVarietyBetRestriction())) == null) {
            return null;
        }
        return findEnforcedRuleForVariety.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMinStakeEnforcementActiveForTab(List<BetGroupsTabs> subs, int tabIdx) {
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(subs, tabIdx);
        return (betGroupsTabs == null || VarietyBetRestrictions.INSTANCE.findEnforcedRuleForVariety(betGroupsTabs.getParamTId(), betGroupsTabs.getVarietyBetRestriction()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMinStakeForCurrentTab() {
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
        this._playerStatsMinStake.setValue(Long.valueOf((betGroupsTabs == null || !isMinStakeEnforcementActiveForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue())) ? 0L : VarietyBetRestrictions.INSTANCE.enforcedMinStakeForVariety(betGroupsTabs.getParamTId(), betGroupsTabs.getVarietyBetRestriction())));
    }

    private final void onVarietyMinStakeTabEntered(String ruleId) {
        applyMinStakeForCurrentTab();
        if (ruleId != null && !currentUserHasVarietyMinStakeBetEverPlaced(ruleId)) {
            this._playerStatsMinInfoAutoDismissed.setValue(false);
            this._playerStatsMinInfoHelpOpen.setValue(false);
        }
        MutableStateFlow<Integer> mutableStateFlow = this._playerStatsInfoRefreshTick;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
    }

    public final void togglePlayerStatsMinStakeInfo() {
        String minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
        if (minStakeRuleIdForTab == null) {
            return;
        }
        if (currentUserHasVarietyMinStakeBetEverPlaced(minStakeRuleIdForTab)) {
            this._playerStatsMinInfoHelpOpen.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
        } else if (!this._playerStatsMinInfoAutoDismissed.getValue().booleanValue() || this._playerStatsMinInfoHelpOpen.getValue().booleanValue()) {
            this._playerStatsMinInfoAutoDismissed.setValue(true);
            this._playerStatsMinInfoHelpOpen.setValue(false);
        } else {
            this._playerStatsMinInfoAutoDismissed.setValue(false);
            this._playerStatsMinInfoHelpOpen.setValue(true);
        }
        MutableStateFlow<Integer> mutableStateFlow = this._playerStatsInfoRefreshTick;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
    }

    public final StateFlow<MatchTopBaseData> getDisplayBaseMatchInfo() {
        return this.displayBaseMatchInfo;
    }

    public final StateFlow<Set<Long>> getSelectedBetIds() {
        return this.selectedBetIds;
    }

    public final StateFlow<Set<Long>> getValidatingBetIds() {
        return this.validatingBetIds;
    }

    public final StateFlow<List<MatchStatisticsUiSingleItem>> getStatistics() {
        return this.statistics;
    }

    public final StateFlow<Boolean> isStatisticsLoading() {
        return this.isStatisticsLoading;
    }

    public final StateFlow<Boolean> getHasMoreStatistics() {
        return this.hasMoreStatistics;
    }

    public final StateFlow<List<MatchStatsTabs>> getStatsTabs() {
        return this.statsTabs;
    }

    public final StateFlow<Integer> getSelectedStatsTabs() {
        return this.selectedStatsTabs;
    }

    /* compiled from: MatchDetailsController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/fragment/matches/details/MatchDetailsController$VarietyStatsTab;", "", "varietyId", "", "varietyName", "", "stats", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatisticsUiSingleItem;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/util/List;)V", "getVarietyId", "()J", "getVarietyName", "()Ljava/lang/String;", "getStats", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VarietyStatsTab {
        public static final int $stable = 8;
        private final List<MatchStatisticsUiSingleItem> stats;
        private final long varietyId;
        private final String varietyName;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VarietyStatsTab copy$default(VarietyStatsTab varietyStatsTab, long j, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = varietyStatsTab.varietyId;
            }
            if ((i & 2) != 0) {
                str = varietyStatsTab.varietyName;
            }
            if ((i & 4) != 0) {
                list = varietyStatsTab.stats;
            }
            return varietyStatsTab.copy(j, str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final long getVarietyId() {
            return this.varietyId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVarietyName() {
            return this.varietyName;
        }

        public final List<MatchStatisticsUiSingleItem> component3() {
            return this.stats;
        }

        public final VarietyStatsTab copy(long varietyId, String varietyName, List<MatchStatisticsUiSingleItem> stats) {
            Intrinsics.checkNotNullParameter(varietyName, "varietyName");
            Intrinsics.checkNotNullParameter(stats, "stats");
            return new VarietyStatsTab(varietyId, varietyName, stats);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VarietyStatsTab)) {
                return false;
            }
            VarietyStatsTab varietyStatsTab = (VarietyStatsTab) other;
            return this.varietyId == varietyStatsTab.varietyId && Intrinsics.areEqual(this.varietyName, varietyStatsTab.varietyName) && Intrinsics.areEqual(this.stats, varietyStatsTab.stats);
        }

        public int hashCode() {
            return (((Long.hashCode(this.varietyId) * 31) + this.varietyName.hashCode()) * 31) + this.stats.hashCode();
        }

        public String toString() {
            return "VarietyStatsTab(varietyId=" + this.varietyId + ", varietyName=" + this.varietyName + ", stats=" + this.stats + ")";
        }

        public VarietyStatsTab(long j, String varietyName, List<MatchStatisticsUiSingleItem> stats) {
            Intrinsics.checkNotNullParameter(varietyName, "varietyName");
            Intrinsics.checkNotNullParameter(stats, "stats");
            this.varietyId = j;
            this.varietyName = varietyName;
            this.stats = stats;
        }

        public final long getVarietyId() {
            return this.varietyId;
        }

        public final String getVarietyName() {
            return this.varietyName;
        }

        public final List<MatchStatisticsUiSingleItem> getStats() {
            return this.stats;
        }
    }

    public final StateFlow<List<VarietyStatsTab>> getVarietyStatsTabs() {
        return this.varietyStatsTabs;
    }

    public final StateFlow<Integer> getSelectedVarietyIndex() {
        return this.selectedVarietyIndex;
    }

    public final StateFlow<List<MatchHistoryCategoryUiItem>> getHistoryData() {
        return this.historyData;
    }

    public final StateFlow<Boolean> isHistoryLoading() {
        return this.isHistoryLoading;
    }

    public final StateFlow<Boolean> getHasStatisticsAvailable() {
        return this.hasStatisticsAvailable;
    }

    public final StateFlow<List<BattleUiItem>> getAvailableBattles() {
        return this.availableBattles;
    }

    public final StateFlow<Boolean> isBattlesLoading() {
        return this.isBattlesLoading;
    }

    public final StateFlow<Boolean> getHasMoreAvailableBattles() {
        return this.hasMoreAvailableBattles;
    }

    public final StateFlow<Boolean> getCanCreateBattle() {
        return this.canCreateBattle;
    }

    public final StateFlow<MatchDetailsQuizAvailabilityModel> getQuizAvailability() {
        return this.quizAvailability;
    }

    public final StateFlow<QuizParticipationModel> getQuizParticipationDetails() {
        return this.quizParticipationDetails;
    }

    public final StateFlow<Boolean> isQuizLoading() {
        return this.isQuizLoading;
    }

    public final StateFlow<Boolean> isQuizParticipationLoading() {
        return this.isQuizParticipationLoading;
    }

    public final StateFlow<QuizModel> getQuizDetails() {
        return this.quizDetails;
    }

    public final StateFlow<Boolean> isQuizDetailsLoading() {
        return this.isQuizDetailsLoading;
    }

    public final StateFlow<List<QuizTierModel>> getQuizTiers() {
        return this.quizTiers;
    }

    public final StateFlow<QuizSelectionState> getQuizSelectionState() {
        return this.quizSelectionState;
    }

    public final StateFlow<Boolean> isPlacingQuiz() {
        return this.isPlacingQuiz;
    }

    public final StateFlow<List<ExtendedMessageModel>> getMatchComments() {
        return this.matchComments;
    }

    public final StateFlow<Boolean> isMatchCommentsLoading() {
        return this.isMatchCommentsLoading;
    }

    public final StateFlow<Boolean> isMatchCommentsLoadingMore() {
        return this.isMatchCommentsLoadingMore;
    }

    public final StateFlow<Boolean> getHasMoreMatchComments() {
        return this.hasMoreMatchComments;
    }

    public final StateFlow<Boolean> isSendingMatchComment() {
        return this.isSendingMatchComment;
    }

    private final long commentKey(ExtendedMessageModel extendedMessageModel) {
        int hashCode;
        Date sendDate;
        MessageModel message = extendedMessageModel.getMessage();
        Long l = null;
        Integer valueOf = message != null ? Integer.valueOf(message.getId()) : null;
        if (valueOf != null) {
            hashCode = valueOf.intValue();
        } else {
            MessageModel message2 = extendedMessageModel.getMessage();
            if (message2 != null && (sendDate = message2.getSendDate()) != null) {
                l = Long.valueOf(sendDate.getTime());
            }
            if (l != null) {
                return l.longValue();
            }
            hashCode = extendedMessageModel.hashCode();
        }
        return hashCode;
    }

    private final void updateBetGroupsFromSubMatches() {
        List<MatchVarietyGroupBetsModel> emptyList;
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this._subMatches.getValue(), this._selectedTabIndex.getValue().intValue());
        if (betGroupsTabs == null || (emptyList = betGroupsTabs.getBets()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        this._betGroups.setValue(emptyList);
        syncSelectedBetIdsWithBetslip();
    }

    private final void syncSelectedBetIdsWithBetslip() {
        if (this.preventAutoSync) {
            Log.d(TAG, "syncSelectedBetIdsWithBetslip skipped due to preventAutoSync flag");
            return;
        }
        List<BetModel> currentBets = getCurrentBets();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentBets, 10));
        Iterator<T> it = currentBets.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((BetModel) it.next()).getGrabbedBetId()));
        }
        Set<Long> set = CollectionsKt.toSet(arrayList);
        Log.d(TAG, "syncSelectedBetIdsWithBetslip called. Current betslip IDs: " + set + ", Previous selectedBetIds: " + this._selectedBetIds.getValue());
        this._selectedBetIds.setValue(set);
        Log.d(TAG, "selectedBetIds updated to: " + this._selectedBetIds.getValue());
    }

    public final List<BetModel> getCurrentBets() {
        ArrayList<BetModel> betslip;
        MainActivity mainActivity = this.activity;
        return (mainActivity == null || (betslip = SharedPrefs.getBetslip(mainActivity)) == null) ? CollectionsKt.emptyList() : betslip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void statisticsListener$lambda$7(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        Log.d(TAG, "Statistics response received - stat: " + fetchedResponseMessage.getStat());
        matchDetailsController._isStatisticsLoading.setValue(false);
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            Log.e(TAG, "Statistics request failed - stat: " + fetchedResponseMessage.getStat());
            return;
        }
        NewMatchStatisticsResponseModel newMatchStatisticsResponseModel = (NewMatchStatisticsResponseModel) fetchedResponseMessage.getModel();
        if (newMatchStatisticsResponseModel != null) {
            Log.d(TAG, "Statistics model received - items count: " + newMatchStatisticsResponseModel.getItems().size());
            List<MatchStatisticsUiSingleItem> convertToUiItems = matchDetailsController.convertToUiItems(newMatchStatisticsResponseModel);
            if (matchDetailsController.statisticsOffset == 0) {
                matchDetailsController._statistics.setValue(convertToUiItems);
            } else {
                MutableStateFlow<List<MatchStatisticsUiSingleItem>> mutableStateFlow = matchDetailsController._statistics;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) convertToUiItems));
            }
            matchDetailsController._hasMoreStatistics.setValue(Boolean.valueOf(convertToUiItems.size() >= matchDetailsController.statisticsLimit));
            List<MatchStatsTabs> value = matchDetailsController._statsTabs.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            for (MatchStatsTabs.MatchStatisticsUiItem matchStatisticsUiItem : value) {
                if (matchStatisticsUiItem instanceof MatchStatsTabs.MatchStatisticsUiItem) {
                    matchStatisticsUiItem = ((MatchStatsTabs.MatchStatisticsUiItem) matchStatisticsUiItem).copy(matchDetailsController._statistics.getValue());
                }
                arrayList.add(matchStatisticsUiItem);
            }
            matchDetailsController._statsTabs.setValue(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void historyListener$lambda$10(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        Log.d(TAG, "History response received - stat: " + fetchedResponseMessage.getStat());
        matchDetailsController._isHistoryLoading.setValue(false);
        try {
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                List<NewMatchHistoryResponseModel> list = (List) fetchedResponseMessage.getModel();
                if (list != null) {
                    Log.d(TAG, "History model received - categories count: " + list.size());
                    List<MatchHistoryCategoryUiItem> convertToHistoryUiItems = matchDetailsController.convertToHistoryUiItems(list);
                    matchDetailsController._historyData.setValue(convertToHistoryUiItems);
                    List<MatchStatsTabs> value = matchDetailsController._statsTabs.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
                    for (MatchStatsTabs.MatchHistoryUiItem matchHistoryUiItem : value) {
                        if (matchHistoryUiItem instanceof MatchStatsTabs.MatchHistoryUiItem) {
                            matchHistoryUiItem = ((MatchStatsTabs.MatchHistoryUiItem) matchHistoryUiItem).copy(convertToHistoryUiItems);
                        }
                        arrayList.add(matchHistoryUiItem);
                    }
                    matchDetailsController._statsTabs.setValue(arrayList);
                    return;
                }
                return;
            }
            Log.e(TAG, "History request failed - stat: " + fetchedResponseMessage.getStat());
        } catch (Exception e) {
            Log.e(TAG, "Error processing history response: " + e.getMessage(), e);
            matchDetailsController._historyData.setValue(CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void matchCommentsListener$lambda$13(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        ArrayList arrayList;
        matchDetailsController._isMatchCommentsLoading.setValue(false);
        matchDetailsController._isMatchCommentsLoadingMore.setValue(false);
        ExtendedMessageModel extendedMessageModel = (ExtendedMessageModel) CollectionsKt.firstOrNull((List) matchDetailsController._matchComments.getValue());
        Long valueOf = extendedMessageModel != null ? Long.valueOf(matchDetailsController.commentKey(extendedMessageModel)) : null;
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            if (matchDetailsController.lastRequestedMatchCommentsPage == 0) {
                matchDetailsController._matchComments.setValue(CollectionsKt.emptyList());
                matchDetailsController._hasMoreMatchComments.setValue(false);
                matchDetailsController.nextMatchCommentsPage = null;
                return;
            }
            return;
        }
        PageModel pageModel = (PageModel) fetchedResponseMessage.getModel();
        List content = pageModel != null ? pageModel.getContent() : null;
        if (content == null) {
            content = CollectionsKt.emptyList();
        }
        MutableStateFlow<List<ExtendedMessageModel>> mutableStateFlow = matchDetailsController._matchComments;
        if (matchDetailsController.lastRequestedMatchCommentsPage != 0) {
            List plus = CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) content);
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : plus) {
                ExtendedMessageModel extendedMessageModel2 = (ExtendedMessageModel) obj;
                Intrinsics.checkNotNull(extendedMessageModel2);
                if (hashSet.add(Long.valueOf(matchDetailsController.commentKey(extendedMessageModel2)))) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : content) {
                ExtendedMessageModel extendedMessageModel3 = (ExtendedMessageModel) obj2;
                Intrinsics.checkNotNull(extendedMessageModel3);
                if (hashSet2.add(Long.valueOf(matchDetailsController.commentKey(extendedMessageModel3)))) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = arrayList3;
        }
        mutableStateFlow.setValue(arrayList);
        ExtendedMessageModel extendedMessageModel4 = (ExtendedMessageModel) CollectionsKt.firstOrNull((List) matchDetailsController._matchComments.getValue());
        Long valueOf2 = extendedMessageModel4 != null ? Long.valueOf(matchDetailsController.commentKey(extendedMessageModel4)) : null;
        if (matchDetailsController._selectedTabIndex.getValue().intValue() != 2 && valueOf2 != null && !Intrinsics.areEqual(valueOf2, valueOf)) {
            matchDetailsController._hasUnreadMatchComments.setValue(true);
            matchDetailsController.updateCommentsTabIndicator();
        }
        PageModel pageModel2 = (PageModel) fetchedResponseMessage.getModel();
        String continuationToken = pageModel2 != null ? pageModel2.getContinuationToken() : null;
        String str = continuationToken;
        if (str == null || str.length() == 0) {
            matchDetailsController._hasMoreMatchComments.setValue(false);
            matchDetailsController.nextMatchCommentsPage = null;
            return;
        }
        matchDetailsController._hasMoreMatchComments.setValue(true);
        Integer intOrNull = StringsKt.toIntOrNull(continuationToken);
        if (intOrNull == null) {
            intOrNull = Integer.valueOf(matchDetailsController.lastRequestedMatchCommentsPage + 1);
        }
        matchDetailsController.nextMatchCommentsPage = intOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendMatchCommentListener$lambda$15(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        MessageModel messageModel;
        matchDetailsController._isSendingMatchComment.setValue(false);
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && (messageModel = (MessageModel) fetchedResponseMessage.getModel()) != null) {
            ExtendedMessageModel extendedMessageModel = new ExtendedMessageModel();
            extendedMessageModel.setMessage(messageModel);
            matchDetailsController._matchComments.setValue(CollectionsKt.plus((Collection) CollectionsKt.listOf(extendedMessageModel), (Iterable) matchDetailsController._matchComments.getValue()));
            if (matchDetailsController._selectedTabIndex.getValue().intValue() != 2) {
                matchDetailsController._hasUnreadMatchComments.setValue(true);
                matchDetailsController.updateCommentsTabIndicator();
            }
        }
    }

    private final List<MatchHistoryCategoryUiItem> convertToHistoryUiItems(List<NewMatchHistoryResponseModel> response) {
        Iterator it;
        MatchHistoryCategoryUiItem matchHistoryCategoryUiItem;
        Iterator it2;
        MatchHistoryMatchUiItem matchHistoryMatchUiItem;
        String str;
        String str2;
        String str3;
        String name;
        String name2;
        Log.d(TAG, "Converting history response with " + response.size() + " categories");
        ArrayList arrayList = new ArrayList();
        Iterator it3 = response.iterator();
        while (it3.hasNext()) {
            NewMatchHistoryResponseModel newMatchHistoryResponseModel = (NewMatchHistoryResponseModel) it3.next();
            if (newMatchHistoryResponseModel != null) {
                MatchHistoryType fromString = MatchHistoryType.INSTANCE.fromString(newMatchHistoryResponseModel.getType());
                Log.d(TAG, "Processing category: type=" + newMatchHistoryResponseModel.getType() + ", additional=" + newMatchHistoryResponseModel.getCategoryTitleAdditional() + ", matches: " + newMatchHistoryResponseModel.getMatches().size());
                String categoryTitle = newMatchHistoryResponseModel.getCategoryTitle();
                if (categoryTitle == null) {
                    categoryTitle = "";
                }
                String categoryTitleAdditional = newMatchHistoryResponseModel.getCategoryTitleAdditional();
                List<NewMatchHistoryMatchModel> matches = newMatchHistoryResponseModel.getMatches();
                ArrayList arrayList2 = new ArrayList();
                for (NewMatchHistoryMatchModel newMatchHistoryMatchModel : matches) {
                    if (newMatchHistoryMatchModel != null) {
                        long matchId = newMatchHistoryMatchModel.getMatchId();
                        NewMatchHistoryTeamModel homeTeam = newMatchHistoryMatchModel.getHomeTeam();
                        String name3 = homeTeam != null ? homeTeam.getName() : null;
                        NewMatchHistoryTeamModel awayTeam = newMatchHistoryMatchModel.getAwayTeam();
                        Log.d(TAG, "Processing match: " + matchId + ", homeTeam: " + name3 + ", awayTeam: " + (awayTeam != null ? awayTeam.getName() : null));
                        NewMatchHistoryTeamModel homeTeam2 = newMatchHistoryMatchModel.getHomeTeam();
                        long id = homeTeam2 != null ? homeTeam2.getId() : 0L;
                        NewMatchHistoryTeamModel homeTeam3 = newMatchHistoryMatchModel.getHomeTeam();
                        if (homeTeam3 == null || (str = homeTeam3.getPhotoUrl()) == null) {
                            str = "";
                        }
                        NewMatchHistoryTeamModel homeTeam4 = newMatchHistoryMatchModel.getHomeTeam();
                        MatchHistoryTeamUiItem matchHistoryTeamUiItem = new MatchHistoryTeamUiItem(id, str, (homeTeam4 == null || (name2 = homeTeam4.getName()) == null) ? "" : name2);
                        NewMatchHistoryTeamModel awayTeam2 = newMatchHistoryMatchModel.getAwayTeam();
                        long id2 = awayTeam2 != null ? awayTeam2.getId() : 0L;
                        NewMatchHistoryTeamModel awayTeam3 = newMatchHistoryMatchModel.getAwayTeam();
                        if (awayTeam3 == null || (str2 = awayTeam3.getPhotoUrl()) == null) {
                            str2 = "";
                        }
                        NewMatchHistoryTeamModel awayTeam4 = newMatchHistoryMatchModel.getAwayTeam();
                        if (awayTeam4 == null || (name = awayTeam4.getName()) == null) {
                            it2 = it3;
                            str3 = "";
                        } else {
                            it2 = it3;
                            str3 = name;
                        }
                        MatchHistoryTeamUiItem matchHistoryTeamUiItem2 = new MatchHistoryTeamUiItem(id2, str2, str3);
                        String date = newMatchHistoryMatchModel.getDate();
                        matchHistoryMatchUiItem = new MatchHistoryMatchUiItem(matchHistoryTeamUiItem, matchHistoryTeamUiItem2, date == null ? "" : date, newMatchHistoryMatchModel.getHomeScore(), newMatchHistoryMatchModel.getAwayScore(), newMatchHistoryMatchModel.getMatchId());
                    } else {
                        it2 = it3;
                        matchHistoryMatchUiItem = null;
                    }
                    if (matchHistoryMatchUiItem != null) {
                        arrayList2.add(matchHistoryMatchUiItem);
                    }
                    it3 = it2;
                }
                it = it3;
                matchHistoryCategoryUiItem = new MatchHistoryCategoryUiItem(fromString, categoryTitle, categoryTitleAdditional, arrayList2);
            } else {
                it = it3;
                matchHistoryCategoryUiItem = null;
            }
            if (matchHistoryCategoryUiItem != null) {
                arrayList.add(matchHistoryCategoryUiItem);
            }
            it3 = it;
        }
        return arrayList;
    }

    public final void refreshMatchComments() {
        loadMatchComments(true);
    }

    public final void loadMoreMatchComments() {
        loadMatchComments(false);
    }

    private final void loadMatchComments(boolean reset) {
        Integer num;
        MatchShortInfoModel value = this.currentMatch.getValue();
        long id = value != null ? value.getId() : this.id;
        if (id <= 0) {
            Log.w(TAG, "Cannot load match comments: invalid match id");
            return;
        }
        int i = 0;
        if (reset) {
            if (this._isMatchCommentsLoading.getValue().booleanValue()) {
                return;
            }
            this._isMatchCommentsLoading.setValue(true);
            this._hasMoreMatchComments.setValue(true);
            this.nextMatchCommentsPage = 0;
            this.lastRequestedMatchCommentsPage = 0;
        } else {
            if (this._isMatchCommentsLoadingMore.getValue().booleanValue() || !this._hasMoreMatchComments.getValue().booleanValue() || (num = this.nextMatchCommentsPage) == null) {
                return;
            }
            int intValue = num.intValue();
            this._isMatchCommentsLoadingMore.setValue(true);
            this.lastRequestedMatchCommentsPage = intValue;
        }
        if (!reset) {
            Integer num2 = this.nextMatchCommentsPage;
            i = num2 != null ? num2.intValue() : this.lastRequestedMatchCommentsPage;
        }
        if (!reset) {
            this.lastRequestedMatchCommentsPage = i;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(VKAttachments.TYPE_WIKI_PAGE, i);
        getGetPublicChatMessagesInteractor().load(this.matchCommentsListener, Long.valueOf(id), bundle);
    }

    public final void sendMatchComment(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String obj = StringsKt.trim((CharSequence) message).toString();
        if (obj.length() == 0 || this._isSendingMatchComment.getValue().booleanValue()) {
            return;
        }
        MatchShortInfoModel value = this.currentMatch.getValue();
        long id = value != null ? value.getId() : this.id;
        if (id <= 0) {
            Log.w(TAG, "Cannot send comment: invalid match id");
            return;
        }
        this._isSendingMatchComment.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putString("message", obj);
        getSendPublicChatMessageInteractor().load(this.sendMatchCommentListener, Long.valueOf(id), bundle);
    }

    public final int getCurrentUserId() {
        Integer id = getUserService().getShortProfile().getUserModel().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        return id.intValue();
    }

    private final void updateCommentsTabIndicator() {
        if (this._tabItems.getValue().isEmpty()) {
            return;
        }
        boolean booleanValue = this._hasUnreadMatchComments.getValue().booleanValue();
        List<MatchDetailsButtonTabs> value = this._tabItems.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        for (MatchDetailsButtonTabs.MatchTabComments matchTabComments : value) {
            if (matchTabComments instanceof MatchDetailsButtonTabs.MatchTabComments) {
                matchTabComments = MatchDetailsButtonTabs.MatchTabComments.copy$default((MatchDetailsButtonTabs.MatchTabComments) matchTabComments, null, booleanValue, false, 0, 13, null);
            }
            arrayList.add(matchTabComments);
        }
        ArrayList arrayList2 = arrayList;
        if (Intrinsics.areEqual(this._tabItems.getValue(), arrayList2)) {
            return;
        }
        this._tabItems.setValue(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void battlesListener$lambda$29(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        BattleCreator battleCreator;
        Log.d(TAG, "Battles response received - stat: " + fetchedResponseMessage.getStat());
        matchDetailsController._isBattlesLoading.setValue(false);
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
            Log.e(TAG, "Battles request failed - stat: " + fetchedResponseMessage.getStat());
            return;
        }
        Log.d(TAG, "Battles response success - model is null: " + (fetchedResponseMessage.getModel() == null));
        NewChallengesResponseModel newChallengesResponseModel = (NewChallengesResponseModel) fetchedResponseMessage.getModel();
        if (newChallengesResponseModel != null) {
            List<NewUserBattleModel> items = newChallengesResponseModel.getItems();
            if (items == null) {
                items = CollectionsKt.emptyList();
            }
            int size = items.size();
            Integer offset = newChallengesResponseModel.getOffset();
            int intValue = offset != null ? offset.intValue() : 0;
            Integer limit = newChallengesResponseModel.getLimit();
            Log.d(TAG, "Battles model received - items count: " + size + ", offset: " + intValue + ", limit: " + (limit != null ? limit.intValue() : 0));
            Log.d(TAG, "Battles items: " + items);
            List<NewUserBattleModel> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NewUserBattleModel) it.next()).getState());
            }
            Log.d(TAG, "Battles states: " + arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (NewUserBattleModel newUserBattleModel : list) {
                long id = newUserBattleModel.getId();
                long moneyAccept = newUserBattleModel.getMoneyAccept();
                long enterFee = newUserBattleModel.getEnterFee();
                long moneyToWin = newUserBattleModel.getMoneyToWin();
                ChallengeState state = newUserBattleModel.getState();
                ChallengeCreator createdBy = newUserBattleModel.getCreatedBy();
                if (createdBy != null) {
                    long id2 = createdBy.getId();
                    String name = createdBy.getName();
                    String str = name == null ? "" : name;
                    String email = createdBy.getEmail();
                    String str2 = email == null ? "" : email;
                    String photoUrl = createdBy.getPhotoUrl();
                    if (photoUrl == null) {
                        photoUrl = "";
                    }
                    battleCreator = new BattleCreator(id2, str, str2, photoUrl);
                } else {
                    battleCreator = new BattleCreator(0L, "", "", "");
                }
                ChallengeState.NONE participantState = newUserBattleModel.getParticipantState();
                if (participantState == null) {
                    participantState = ChallengeState.NONE.INSTANCE;
                }
                ChallengeState challengeState = participantState;
                ChallengeCreator createdBy2 = newUserBattleModel.getCreatedBy();
                arrayList2.add(new BattleUiItem(id, moneyAccept, enterFee, moneyToWin, state, battleCreator, challengeState, Intrinsics.areEqual(createdBy2 != null ? Integer.valueOf((int) createdBy2.getId()) : null, matchDetailsController.getUserServiceP().getShortProfile().getUserModel().getId()), 0, 256, null));
            }
            ArrayList arrayList3 = arrayList2;
            Log.d(TAG, "All battles received: " + arrayList3.size());
            if (matchDetailsController.availableBattlesOffset == 0) {
                matchDetailsController._availableBattles.setValue(arrayList3);
            } else {
                MutableStateFlow<List<BattleUiItem>> mutableStateFlow = matchDetailsController._availableBattles;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList3));
            }
            matchDetailsController._hasMoreAvailableBattles.setValue(Boolean.valueOf(arrayList3.size() >= matchDetailsController.battlesLimit));
            Log.d(TAG, "Battles - received: " + arrayList3.size() + ", limit: " + matchDetailsController.battlesLimit + ", hasMore: " + matchDetailsController._hasMoreAvailableBattles.getValue() + ", current offset: " + matchDetailsController.availableBattlesOffset);
            if (matchDetailsController.availableBattlesOffset == 0) {
                MutableStateFlow<List<MatchDetailsButtonTabs>> mutableStateFlow2 = matchDetailsController._tabItems;
                List<MatchDetailsButtonTabs> value = mutableStateFlow2.getValue();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
                for (MatchDetailsButtonTabs.MatchTabBattles matchTabBattles : value) {
                    if (matchTabBattles instanceof MatchDetailsButtonTabs.MatchTabBattles) {
                        matchTabBattles = MatchDetailsButtonTabs.MatchTabBattles.copy$default((MatchDetailsButtonTabs.MatchTabBattles) matchTabBattles, null, !matchDetailsController._availableBattles.getValue().isEmpty(), false, 0, 13, null);
                    }
                    arrayList4.add(matchTabBattles);
                }
                mutableStateFlow2.setValue(arrayList4);
                return;
            }
            return;
        }
        Log.e(TAG, "Battles model is null despite SUCCESS stat");
    }

    private final List<MatchStatisticsUiSingleItem> convertToUiItems(NewMatchStatisticsResponseModel response) {
        List<NewMatchStatisticsItemModel> items = response.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (NewMatchStatisticsItemModel newMatchStatisticsItemModel : items) {
            float value = newMatchStatisticsItemModel.getHomeStat().getValue() + newMatchStatisticsItemModel.getAwayStat().getValue();
            float f = 0.0f;
            float value2 = value > 0.0f ? (newMatchStatisticsItemModel.getHomeStat().getValue() / value) * 100 : 0.0f;
            if (value > 0.0f) {
                f = (newMatchStatisticsItemModel.getAwayStat().getValue() / value) * 100;
            }
            arrayList.add(new MatchStatisticsUiSingleItem(newMatchStatisticsItemModel.getName(), new Pair(new MatchStatisticsUiTeamItem(String.valueOf((int) newMatchStatisticsItemModel.getHomeStat().getValue()), value2, UiExtensionsKt.convertToUiItem(newMatchStatisticsItemModel.getHomeStat().getUnit())), new MatchStatisticsUiTeamItem(String.valueOf((int) newMatchStatisticsItemModel.getAwayStat().getValue()), f, UiExtensionsKt.convertToUiItem(newMatchStatisticsItemModel.getAwayStat().getUnit())))));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void quizDetailsListener$lambda$31(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        Log.d(TAG, "Quiz details response received - stat: " + fetchedResponseMessage.getStat());
        matchDetailsController._isQuizDetailsLoading.setValue(false);
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            if (fetchedResponseMessage.getModel() != null) {
                Log.d(TAG, "Quiz details loaded - questions count: " + ((QuizModel) fetchedResponseMessage.getModel()).getQuestions().size());
                matchDetailsController._quizDetails.setValue(fetchedResponseMessage.getModel());
                matchDetailsController._quizSelectionState.setValue(new QuizSelectionState(0, null, null, false, 15, null));
                if (matchDetailsController._quizTiers.getValue().isEmpty()) {
                    matchDetailsController.loadQuizTiers();
                    return;
                }
                return;
            }
            Log.e(TAG, "Quiz details load failed - no model in response");
            matchDetailsController._quizDetails.setValue(null);
            return;
        }
        Log.e(TAG, "Quiz details request failed - stat: " + fetchedResponseMessage.getStat());
        matchDetailsController._quizDetails.setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void quizTiersListener$lambda$32(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
            if (fetchedResponseMessage.getModel() != null) {
                Log.d(TAG, "Quiz tiers loaded - count: " + ((List) fetchedResponseMessage.getModel()).size());
                MutableStateFlow<List<QuizTierModel>> mutableStateFlow = matchDetailsController._quizTiers;
                Object model = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                mutableStateFlow.setValue(model);
                return;
            }
            Log.e(TAG, "Quiz tiers load failed - no model in response");
            return;
        }
        Log.e(TAG, "Quiz tiers request failed - stat: " + fetchedResponseMessage.getStat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void matchBetListener$lambda$36(MatchDetailsController matchDetailsController, FetchedResponseMessage fetchedResponseMessage) {
        Object obj;
        try {
            if (fetchedResponseMessage.getModel() == null) {
                Log.w(TAG, "Received empty bet groups response");
                matchDetailsController._error.setValue("Error loading bet groups");
            } else {
                List<BetGroupsTabs> value = matchDetailsController._subMatches.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
                for (BetGroupsTabs betGroupsTabs : value) {
                    Object model = fetchedResponseMessage.getModel();
                    Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                    Iterator it = ((Iterable) model).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((int) ((MatchVarietyGroupModel) obj).getGroup().getId()) == betGroupsTabs.getId()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    MatchVarietyGroupModel matchVarietyGroupModel = (MatchVarietyGroupModel) obj;
                    if (matchVarietyGroupModel != null) {
                        betGroupsTabs = betGroupsTabs.copy((r24 & 1) != 0 ? betGroupsTabs.title : null, (r24 & 2) != 0 ? betGroupsTabs.tabs : null, (r24 & 4) != 0 ? betGroupsTabs.bets : BetGroupsSortingUtils.INSTANCE.sortBetGroups(matchVarietyGroupModel.getBets()), (r24 & 8) != 0 ? betGroupsTabs.onClick : null, (r24 & 16) != 0 ? betGroupsTabs.id : 0, (r24 & 32) != 0 ? betGroupsTabs.isSelected : false, (r24 & 64) != 0 ? betGroupsTabs.scoreHome : 0, (r24 & 128) != 0 ? betGroupsTabs.scoreAway : 0, (r24 & 256) != 0 ? betGroupsTabs.resultRaw : null, (r24 & 512) != 0 ? betGroupsTabs.paramTId : null, (r24 & 1024) != 0 ? betGroupsTabs.varietyBetRestriction : null);
                    }
                    arrayList.add(betGroupsTabs);
                }
                ArrayList<BetGroupsTabs> arrayList2 = arrayList;
                matchDetailsController._subMatches.setValue(arrayList2);
                matchDetailsController.onBetGroupTabSelected(matchDetailsController._selectedBetGroupTabIndex.getValue().intValue());
                matchDetailsController.syncSelectedBetIdsWithBetslip();
                Log.d(TAG, "Total groups after update: " + arrayList2.size());
                for (BetGroupsTabs betGroupsTabs2 : arrayList2) {
                    Log.d(TAG, "Group: " + betGroupsTabs2.getTitle() + ", Tabs: " + betGroupsTabs2.getTabs().size() + ", Bets: " + betGroupsTabs2.getBets().size());
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error processing bet groups: " + e.getMessage(), e);
            matchDetailsController._error.setValue("Error processing bet groups");
        }
        matchDetailsController._isLoading.setValue(false);
    }

    public final void loadMatchStatTabs() {
        if (this._isStatisticsLoading.getValue().booleanValue()) {
            return;
        }
        Log.d(TAG, "loadMatchStatTabs called - matchId: " + this.id);
        if (this.id <= 0) {
            Log.w(TAG, "Invalid match id for statistics - stopping loading");
            this._isStatisticsLoading.setValue(false);
            this._statistics.setValue(CollectionsKt.emptyList());
            this._hasMoreStatistics.setValue(false);
            this._hasStatisticsAvailable.setValue(false);
            this._varietyStatsTabs.setValue(CollectionsKt.emptyList());
            loadMatchHistory();
            return;
        }
        this._isStatisticsLoading.setValue(true);
        getV7StatsByVarietiesInteractor().load(this.groupedStatsListener, Long.valueOf(this.id), null);
        loadMatchHistory();
    }

    public final void selectVariety(int index) {
        List<VarietyStatsTab> value = this._varietyStatsTabs.getValue();
        if (index < 0 || index >= value.size()) {
            return;
        }
        this._selectedVarietyIndex.setValue(Integer.valueOf(index));
        this._statistics.setValue(value.get(index).getStats());
        List<MatchStatsTabs> value2 = this._statsTabs.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value2, 10));
        for (MatchStatsTabs.MatchStatisticsUiItem matchStatisticsUiItem : value2) {
            if (matchStatisticsUiItem instanceof MatchStatsTabs.MatchStatisticsUiItem) {
                matchStatisticsUiItem = ((MatchStatsTabs.MatchStatisticsUiItem) matchStatisticsUiItem).copy(this._statistics.getValue());
            }
            arrayList.add(matchStatisticsUiItem);
        }
        this._statsTabs.setValue(arrayList);
    }

    public final void loadMoreStatistics() {
        if (this._varietyStatsTabs.getValue().isEmpty() && !this._isStatisticsLoading.getValue().booleanValue() && this._hasMoreStatistics.getValue().booleanValue()) {
            this.statisticsOffset += this.statisticsLimit;
            loadMatchStatTabs();
        }
    }

    public final void refreshStatistics() {
        this.statisticsOffset = 0;
        this._hasMoreStatistics.setValue(true);
        this._statistics.setValue(CollectionsKt.emptyList());
        this._varietyStatsTabs.setValue(CollectionsKt.emptyList());
        loadMatchStatTabs();
    }

    public final void loadMatchHistory() {
        if (this._isHistoryLoading.getValue().booleanValue()) {
            return;
        }
        Log.d(TAG, "loadMatchHistory called - matchId: " + this.id);
        this._isHistoryLoading.setValue(true);
        getV7MatchHistoryInteractor().load(this.historyListener, Long.valueOf(this.id));
    }

    public final void refreshHistory() {
        this._historyData.setValue(CollectionsKt.emptyList());
        loadMatchHistory();
    }

    private final BetModel toBetModel(MatchVarietyGroupBetsModel group, MatchVarietyBetOptionModel betOption, MatchDetailsDataModel matchDetails, String subMatchName) {
        Long paramTId;
        if (matchDetails == null) {
            return null;
        }
        MatchDetailsBetDataModel matchDetailsBetDataModel = new MatchDetailsBetDataModel();
        matchDetailsBetDataModel.setBetName(betOption.getBetName());
        matchDetailsBetDataModel.setBetTypeId(Integer.valueOf(betOption.getBetTypeId()));
        matchDetailsBetDataModel.setGrabbedBetId(Long.valueOf(betOption.getGrabbedBetId()));
        matchDetailsBetDataModel.setIsAvailable(Boolean.valueOf(betOption.isAvailable()));
        matchDetailsBetDataModel.setGrabbedCoeficient(betOption.getGrabbedCoefficient());
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
        int id = betGroupsTabs != null ? betGroupsTabs.getId() : (int) group.getGroup().getId();
        long longValue = (betGroupsTabs == null || (paramTId = betGroupsTabs.getParamTId()) == null) ? 0L : paramTId.longValue();
        SubMatchModel subMatchModel = new SubMatchModel();
        subMatchModel.setId(id);
        subMatchModel.setName(subMatchName);
        subMatchModel.setParamTId(longValue);
        return new BetModel(matchDetailsBetDataModel, matchDetails, subMatchModel);
    }

    private final void loadVarietyMinStakeConfig() {
        getV7VarietyVersionGatesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<VarietyVersionGatesConfigModel, Void>() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$loadVarietyMinStakeConfig$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<VarietyVersionGatesConfigModel, Void> responseMessage) {
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
                    VarietyBetRestrictions.INSTANCE.setVersionGatesConfig(responseMessage.getModel());
                } else {
                    VarietyBetRestrictions.INSTANCE.setVersionGatesConfig(null);
                }
            }
        }, null);
        getV7VarietyBetRestrictionsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<VarietyBetRestrictionsConfigModel, Void>() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$loadVarietyMinStakeConfig$2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<VarietyBetRestrictionsConfigModel, Void> responseMessage) {
                MutableStateFlow mutableStateFlow;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
                    VarietyBetRestrictions.INSTANCE.setConfig(responseMessage.getModel());
                } else {
                    VarietyBetRestrictions.INSTANCE.setConfig(null);
                }
                MatchDetailsController.this.applyMinStakeForCurrentTab();
                mutableStateFlow = MatchDetailsController.this._playerStatsInfoRefreshTick;
                mutableStateFlow.setValue(Integer.valueOf(((Number) mutableStateFlow.getValue()).intValue() + 1));
            }
        }, null);
    }

    public final void onBetClick(long groupId, int betIndex) {
        Object obj;
        String name;
        List<MatchVarietyBetOptionModel> bets;
        Iterator<T> it = this.betGroups.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((MatchVarietyGroupBetsModel) obj).getGroup().getId() == groupId) {
                    break;
                }
            }
        }
        final MatchVarietyGroupBetsModel matchVarietyGroupBetsModel = (MatchVarietyGroupBetsModel) obj;
        final MatchVarietyBetOptionModel matchVarietyBetOptionModel = (matchVarietyGroupBetsModel == null || (bets = matchVarietyGroupBetsModel.getBets()) == null) ? null : (MatchVarietyBetOptionModel) CollectionsKt.getOrNull(bets, betIndex);
        Log.d("FirstBetFlow", "MatchDetails [1] onBetClick - groupId=" + groupId + ", betIndex=" + betIndex + ", coefficientAtClick=" + (matchVarietyBetOptionModel != null ? Double.valueOf(matchVarietyBetOptionModel.getGrabbedCoefficient()) : null));
        if (matchVarietyBetOptionModel == null) {
            Log.w(TAG, "Bet option not found for groupId: " + groupId + ", betIndex: " + betIndex);
            return;
        }
        if (!matchVarietyGroupBetsModel.getGroup().getUserAvailable()) {
            Log.w(TAG, "Bet group not user_available - showing unlock dialog");
            MainActivity mainActivity = this.activity;
            if (mainActivity != null) {
                SnackbarHelper.showShortIfForeground(mainActivity, R.string.bet_type_locked);
            }
            startUnlockBetTypesFlow();
            return;
        }
        if (!matchVarietyBetOptionModel.isAvailable()) {
            Log.w(TAG, "Bet not available (is_available == false) - snackbar only, do not add to slip");
            MainActivity mainActivity2 = this.activity;
            if (mainActivity2 != null) {
                SnackbarHelper.showShortIfForeground(mainActivity2, R.string.bet_not_available);
                return;
            }
            return;
        }
        final long grabbedBetId = matchVarietyBetOptionModel.getGrabbedBetId();
        Set<Long> value = this._selectedBetIds.getValue();
        if (value.contains(Long.valueOf(grabbedBetId))) {
            this._selectedBetIds.setValue(SetsKt.minus(value, Long.valueOf(grabbedBetId)));
            getBetListAppender().removeBet(grabbedBetId);
            return;
        }
        MutableStateFlow<Set<Long>> mutableStateFlow = this._validatingBetIds;
        mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), Long.valueOf(grabbedBetId)));
        final Job launch$default = BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onBetClick$timeoutJob$1(this, grabbedBetId, null), 3, null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = this._subMatches.getValue().iterator();
        while (it2.hasNext()) {
            Iterator<T> it3 = ((BetGroupsTabs) it2.next()).getBets().iterator();
            while (it3.hasNext()) {
                Iterator<T> it4 = ((MatchVarietyGroupBetsModel) it3.next()).getBets().iterator();
                while (it4.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((MatchVarietyBetOptionModel) it4.next()).getGrabbedBetId()));
                }
            }
        }
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        Iterator it5 = linkedHashSet2.iterator();
        while (it5.hasNext()) {
            long longValue = ((Number) it5.next()).longValue();
            if (value.contains(Long.valueOf(longValue))) {
                getBetListAppender().removeBet(longValue);
            }
        }
        this._selectedBetIds.setValue(SetsKt.minus((Set) value, (Iterable) linkedHashSet2));
        getMatchDetailsInteractor().invalidate();
        getMatchBetGroupsInteractor().invalidate();
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
        if ((betGroupsTabs == null || (name = betGroupsTabs.getTitle()) == null) && (name = matchVarietyGroupBetsModel.getGroup().getName()) == null) {
            name = "";
        }
        final String str = name;
        MatchShortInfoModel value2 = this.currentMatch.getValue();
        Long valueOf = value2 != null ? Long.valueOf(value2.getId()) : null;
        if (valueOf != null) {
            getMatchDetailsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda0
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    MatchDetailsController.onBetClick$lambda$47(Job.this, this, matchVarietyGroupBetsModel, matchVarietyBetOptionModel, str, grabbedBetId, fetchedResponseMessage);
                }
            }, Integer.valueOf((int) valueOf.longValue()));
            return;
        }
        Job.DefaultImpls.cancel$default(launch$default, (CancellationException) null, 1, (Object) null);
        Log.w(TAG, "Match ID is null - resetting loading state for betId: " + grabbedBetId);
        MutableStateFlow<Set<Long>> mutableStateFlow2 = this._validatingBetIds;
        mutableStateFlow2.setValue(SetsKt.minus(mutableStateFlow2.getValue(), Long.valueOf(grabbedBetId)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBetClick$lambda$47(Job job, final MatchDetailsController matchDetailsController, MatchVarietyGroupBetsModel matchVarietyGroupBetsModel, final MatchVarietyBetOptionModel matchVarietyBetOptionModel, String str, final long j, FetchedResponseMessage fetchedResponseMessage) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        MatchDetailsResponseModel matchDetailsResponseModel = (MatchDetailsResponseModel) fetchedResponseMessage.getModel();
        BetModel betModel = matchDetailsController.toBetModel(matchVarietyGroupBetsModel, matchVarietyBetOptionModel, matchDetailsResponseModel != null ? matchDetailsResponseModel.getMatch() : null, str);
        if (betModel != null) {
            matchDetailsController.getBetValidator().validateBet(betModel, new BetValidator.ValidationCallback() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$onBetClick$5$1
                @Override // org.betup.services.betlist.BetValidator.ValidationCallback
                public void onValidationSuccess(BetModel validatedBet, boolean coefficientChanged) {
                    MutableStateFlow mutableStateFlow;
                    MutableStateFlow mutableStateFlow2;
                    MutableStateFlow mutableStateFlow3;
                    MutableStateFlow mutableStateFlow4;
                    Intrinsics.checkNotNullParameter(validatedBet, "validatedBet");
                    mutableStateFlow = MatchDetailsController.this._validatingBetIds;
                    mutableStateFlow2 = MatchDetailsController.this._validatingBetIds;
                    mutableStateFlow.setValue(SetsKt.minus((Set<? extends Long>) mutableStateFlow2.getValue(), Long.valueOf(j)));
                    boolean z = MatchDetailsController.this.getBetListAppender().getBetsCount() == 0;
                    MatchDetailsBetDataModel bet = validatedBet.getBet();
                    Log.d("FirstBetFlow", "MatchDetails [2] onValidationSuccess - betId=" + j + ", isFirstBet=" + z + ", coefficientAfterValidation=" + (bet != null ? Double.valueOf(bet.getGrabbedCoeficient()) : null));
                    MatchDetailsController.this.getBetListAppender().addValidatedBetWithClickCoefficient(validatedBet, matchVarietyBetOptionModel.getGrabbedCoefficient());
                    mutableStateFlow3 = MatchDetailsController.this._selectedBetIds;
                    Set plus = SetsKt.plus((Set<? extends Long>) mutableStateFlow3.getValue(), Long.valueOf(j));
                    mutableStateFlow4 = MatchDetailsController.this._selectedBetIds;
                    mutableStateFlow4.setValue(plus);
                    Log.d("MatchDetailsController", "Bet validated and added - betId: " + j + ", selectedBetIds: " + plus);
                }

                @Override // org.betup.services.betlist.BetValidator.ValidationCallback
                public void onValidationFailed(BetValidator.ValidationFailureReason reason, int errorMessageId) {
                    MutableStateFlow mutableStateFlow;
                    MutableStateFlow mutableStateFlow2;
                    MainActivity mainActivity;
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    mutableStateFlow = MatchDetailsController.this._validatingBetIds;
                    mutableStateFlow2 = MatchDetailsController.this._validatingBetIds;
                    mutableStateFlow.setValue(SetsKt.minus((Set<? extends Long>) mutableStateFlow2.getValue(), Long.valueOf(j)));
                    Log.w("MatchDetailsController", "Bet validation failed - betId: " + j + ", reason: " + reason);
                    mainActivity = MatchDetailsController.this.activity;
                    if (mainActivity != null) {
                        SnackbarHelper.showShortIfForeground(mainActivity, errorMessageId);
                    }
                    EventBus.getDefault().post(new CoefficientUpdatedMessage());
                    EventBus.getDefault().post(new BetlistUpdatedMessage());
                    if (reason == BetValidator.ValidationFailureReason.BET_TYPE_LOCKED) {
                        MatchDetailsController.this.startUnlockBetTypesFlow();
                    }
                }
            });
            return;
        }
        Log.w(TAG, "Bet model is null - resetting loading state for betId: " + j);
        MutableStateFlow<Set<Long>> mutableStateFlow = matchDetailsController._validatingBetIds;
        mutableStateFlow.setValue(SetsKt.minus(mutableStateFlow.getValue(), Long.valueOf(j)));
    }

    public final void bind(MainActivity activityP, boolean isLive, int idP, int participationIdP) {
        Intrinsics.checkNotNullParameter(activityP, "activityP");
        try {
            Context applicationContext = activityP.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
            ((BetUpApp) applicationContext).getComponent().inject(this);
            this.activity = activityP;
            this.id = idP;
            this.participationId = participationIdP;
            this.bannerTracked = false;
            refreshOneClickBetEnabledFromPrefs();
            loadVarietyMinStakeConfig();
            long betupUserIdOrZero = getUserService().getBetupUserIdOrZero();
            if (betupUserIdOrZero > 0) {
                getLocalPreferencesService().migrateLegacyPlayerStatsBetEverPlacedToUserIfPresent(betupUserIdOrZero);
            }
            MutableStateFlow<Integer> mutableStateFlow = this._playerStatsInfoRefreshTick;
            mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
            Map<Integer, Map<Long, Boolean>> expandedBetGroupsForMatch = getLocalPreferencesService().getExpandedBetGroupsForMatch(this.id);
            Intrinsics.checkNotNull(expandedBetGroupsForMatch);
            if (!expandedBetGroupsForMatch.isEmpty()) {
                this._expandedStatesPerTab.setValue(expandedBetGroupsForMatch);
                Log.d(TAG, "Restored expanded states for match " + this.id + ": " + expandedBetGroupsForMatch);
            }
            EventBus.getDefault().register(this);
            Log.d(TAG, "EventBus registered for MatchDetailsController with id: " + this.id);
            getGetPromoBannerForMatchInteractor().invalidate(Long.valueOf(this.id));
            loadSubscriptions();
            invokeRefresh();
            this.oddType = getUserServiceP().getOddType();
            syncSelectedBetIdsWithBetslip();
            loadAvailableBattlesInitial();
            loadQuizAvailability();
            this._tabItems.setValue(CollectionsKt.listOf((Object[]) new MatchDetailsButtonTabs[]{new MatchDetailsButtonTabs.MatchTabBetGroups(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit bind$lambda$48;
                    bind$lambda$48 = MatchDetailsController.bind$lambda$48(MatchDetailsController.this);
                    return bind$lambda$48;
                }
            }, false, true, 0), new MatchDetailsButtonTabs.MatchTabStatistics(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit bind$lambda$49;
                    bind$lambda$49 = MatchDetailsController.bind$lambda$49(MatchDetailsController.this);
                    return bind$lambda$49;
                }
            }, false, false, 1), new MatchDetailsButtonTabs.MatchTabComments(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit bind$lambda$50;
                    bind$lambda$50 = MatchDetailsController.bind$lambda$50(MatchDetailsController.this);
                    return bind$lambda$50;
                }
            }, false, false, 2), new MatchDetailsButtonTabs.MatchTabBattles(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit bind$lambda$51;
                    bind$lambda$51 = MatchDetailsController.bind$lambda$51(MatchDetailsController.this);
                    return bind$lambda$51;
                }
            }, false, false, 3), new MatchDetailsButtonTabs.MatchTabQuiz(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit bind$lambda$52;
                    bind$lambda$52 = MatchDetailsController.bind$lambda$52(MatchDetailsController.this);
                    return bind$lambda$52;
                }
            }, false, false, 4)}));
            this._statsTabs.setValue(CollectionsKt.listOf((Object[]) new MatchStatsTabs[]{new MatchStatsTabs.MatchStatisticsUiItem(CollectionsKt.emptyList()), new MatchStatsTabs.MatchHistoryUiItem(CollectionsKt.emptyList())}));
            this._selectedStatsTabIndex.setValue(0);
            this._matchComments.setValue(CollectionsKt.emptyList());
            this._hasMoreMatchComments.setValue(true);
            this._isMatchCommentsLoading.setValue(false);
            this._isMatchCommentsLoadingMore.setValue(false);
            this._isSendingMatchComment.setValue(false);
            this.nextMatchCommentsPage = 0;
            this.lastRequestedMatchCommentsPage = 0;
            this._hasUnreadMatchComments.setValue(false);
            updateCommentsTabIndicator();
        } catch (Exception e) {
            Log.e(TAG, "Error in bind: " + e.getMessage(), e);
            this._error.setValue("Error initializing match details");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$48(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$49(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$50(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$51(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$52(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(4);
        return Unit.INSTANCE;
    }

    public final void invokeRefresh() {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$invokeRefresh$1(this, null), 3, null);
    }

    public final void pollMatchShortInfo(int matchId) {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$pollMatchShortInfo$1(this, matchId, null), 3, null);
    }

    public final void refreshOneClickBetEnabledFromPrefs() {
        try {
            UserProgressModel userProgressModel = getUserService().getShortProfile().getUserProgressModel();
            if (userProgressModel != null) {
                userProgressModel.isOneClickBetUnlocked();
            }
        } catch (Exception unused) {
        }
        this._oneClickBetEnabled.setValue(Boolean.valueOf(getLocalPreferencesService().isOneClickBetEnabled(getUserService().getBetupUserIdOrZero())));
    }

    public final void cleanup() {
        try {
            Log.d(TAG, "Cleaning up MatchDetailsController with id: " + this.id);
            EventBus.getDefault().unregister(this);
            Log.d(TAG, "EventBus unregistered for MatchDetailsController");
        } catch (Exception e) {
            Log.e(TAG, "Error during cleanup: " + e.getMessage(), e);
        }
    }

    private final void onGetBetInfo(int id) {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onGetBetInfo$1(this, id, null), 3, null);
    }

    private final void loadSubscriptions() {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$loadSubscriptions$1(this, null), 3, null);
    }

    public final void onNavigateToSubscriptionAdd() {
        try {
            getSubscriptionService().getMatchSubscriptions(this.id, this);
        } catch (Exception e) {
            Log.e(TAG, "Error navigating to subscription: " + e.getMessage(), e);
            this._error.setValue("Error updating subscriptions");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0104 A[Catch: all -> 0x02cb, Exception -> 0x02cd, TryCatch #0 {Exception -> 0x02cd, blocks: (B:3:0x0017, B:6:0x001d, B:8:0x0078, B:11:0x00a6, B:14:0x00ee, B:18:0x00f8, B:20:0x0104, B:24:0x0110, B:26:0x011c, B:30:0x0128, B:32:0x0134, B:36:0x0140, B:62:0x007c, B:64:0x008a, B:67:0x0091), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c A[Catch: all -> 0x02cb, Exception -> 0x02cd, TryCatch #0 {Exception -> 0x02cd, blocks: (B:3:0x0017, B:6:0x001d, B:8:0x0078, B:11:0x00a6, B:14:0x00ee, B:18:0x00f8, B:20:0x0104, B:24:0x0110, B:26:0x011c, B:30:0x0128, B:32:0x0134, B:36:0x0140, B:62:0x007c, B:64:0x008a, B:67:0x0091), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134 A[Catch: all -> 0x02cb, Exception -> 0x02cd, TryCatch #0 {Exception -> 0x02cd, blocks: (B:3:0x0017, B:6:0x001d, B:8:0x0078, B:11:0x00a6, B:14:0x00ee, B:18:0x00f8, B:20:0x0104, B:24:0x0110, B:26:0x011c, B:30:0x0128, B:32:0x0134, B:36:0x0140, B:62:0x007c, B:64:0x008a, B:67:0x0091), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fb A[Catch: Exception -> 0x02c9, all -> 0x02cb, TryCatch #1 {Exception -> 0x02c9, blocks: (B:38:0x01b8, B:41:0x01c7, B:43:0x01fb, B:44:0x01fe, B:46:0x0268, B:47:0x028c, B:49:0x0297, B:50:0x02a1, B:55:0x0276, B:68:0x02b2), top: B:4:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0268 A[Catch: Exception -> 0x02c9, all -> 0x02cb, TryCatch #1 {Exception -> 0x02c9, blocks: (B:38:0x01b8, B:41:0x01c7, B:43:0x01fb, B:44:0x01fe, B:46:0x0268, B:47:0x028c, B:49:0x0297, B:50:0x02a1, B:55:0x0276, B:68:0x02b2), top: B:4:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0297 A[Catch: Exception -> 0x02c9, all -> 0x02cb, TryCatch #1 {Exception -> 0x02c9, blocks: (B:38:0x01b8, B:41:0x01c7, B:43:0x01fb, B:44:0x01fe, B:46:0x0268, B:47:0x028c, B:49:0x0297, B:50:0x02a1, B:55:0x0276, B:68:0x02b2), top: B:4:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0276 A[Catch: Exception -> 0x02c9, all -> 0x02cb, TryCatch #1 {Exception -> 0x02c9, blocks: (B:38:0x01b8, B:41:0x01c7, B:43:0x01fb, B:44:0x01fe, B:46:0x0268, B:47:0x028c, B:49:0x0297, B:50:0x02a1, B:55:0x0276, B:68:0x02b2), top: B:4:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFetched(FetchedResponseMessage<MatchShortInfoModel, Integer> responseMessage) {
        String resultRaw;
        String extractPeriodScoresFromResultRaw;
        TeamModelShort homeTeam;
        String str;
        TeamModelShort awayTeam;
        String str2;
        TeamModelShort homeTeam2;
        String str3;
        TeamModelShort awayTeam2;
        String str4;
        String minStakeRuleIdForTab;
        String photoUrl;
        String photoUrl2;
        String name;
        String name2;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        try {
            try {
            } catch (Exception e) {
                e = e;
            }
            try {
                if (responseMessage.getModel() != null) {
                    this._currentMatch.setValue(responseMessage.getModel());
                    MatchState fromInt = MatchState.fromInt(responseMessage.getModel().getMatchState());
                    int id = responseMessage.getModel().getSport().getId();
                    MatchUtils.INSTANCE.shouldShowLiveTime(responseMessage.getModel().getMatchState(), responseMessage.getModel().getDate(), responseMessage.getModel().getCurrentPeriod(), responseMessage.getModel().getCurrentTime(), Integer.valueOf(id));
                    if ((fromInt == MatchState.FINISHED || fromInt == MatchState.LIVE) && (resultRaw = responseMessage.getModel().getResultRaw()) != null && !StringsKt.isBlank(resultRaw)) {
                        extractPeriodScoresFromResultRaw = MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(responseMessage.getModel().getResultRaw());
                        boolean isScoreAvailable = MatchDisplayState.isScoreAvailable(responseMessage.getModel().getMatchState(), responseMessage.getModel().getDate(), Integer.valueOf(id));
                        boolean isLive = MatchDisplayState.isLive(responseMessage.getModel().getMatchState(), responseMessage.getModel().getDate(), Integer.valueOf(id));
                        MutableStateFlow<MatchTopBaseData> mutableStateFlow = this._baseMatchInfo;
                        homeTeam = responseMessage.getModel().getHomeTeam();
                        if (homeTeam != null && (name2 = homeTeam.getName()) != null) {
                            str = name2;
                            awayTeam = responseMessage.getModel().getAwayTeam();
                            if (awayTeam != null && (name = awayTeam.getName()) != null) {
                                str2 = name;
                                homeTeam2 = responseMessage.getModel().getHomeTeam();
                                if (homeTeam2 != null && (photoUrl2 = homeTeam2.getPhotoUrl()) != null) {
                                    str3 = photoUrl2;
                                    awayTeam2 = responseMessage.getModel().getAwayTeam();
                                    if (awayTeam2 != null && (photoUrl = awayTeam2.getPhotoUrl()) != null) {
                                        str4 = photoUrl;
                                        String valueOf = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                                        String valueOf2 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                                        String date = responseMessage.getModel().getDate();
                                        String normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                                        String normalizeMatchTime2 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                                        int id2 = responseMessage.getModel().getSport().getId();
                                        Intrinsics.checkNotNull(fromInt);
                                        mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf, valueOf2, date, isScoreAvailable, normalizeMatchTime, normalizeMatchTime2, isLive, id2, fromInt, extractPeriodScoresFromResultRaw));
                                        this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                                        this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                                        minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                                        if (minStakeRuleIdForTab != null) {
                                            onVarietyMinStakeTabEntered(minStakeRuleIdForTab);
                                        }
                                        this.varietyId = responseMessage.getModel().getStatVarietyId();
                                        Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                                        Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                                        Log.d(TAG, "Full match model: " + responseMessage.getModel());
                                        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                                        if (fromInt != MatchState.FINISHED) {
                                            loadMyPlacedBetsForMatch(responseMessage.getModel().getId());
                                        } else {
                                            this._myPlacedBets.setValue(CollectionsKt.emptyList());
                                            this._isMyPlacedBetsLoading.setValue(false);
                                            clearFinishedMatchUpcomingCategories();
                                        }
                                        syncSelectedBetIdsWithBetslip();
                                        MatchShortInfoModel model = responseMessage.getModel();
                                        Log.d(TAG, "Match details updated: " + (model == null ? Long.valueOf(model.getId()) : null));
                                    }
                                    str4 = "";
                                    String valueOf3 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                                    String valueOf22 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                                    String date2 = responseMessage.getModel().getDate();
                                    String normalizeMatchTime3 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                                    String normalizeMatchTime22 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                                    int id22 = responseMessage.getModel().getSport().getId();
                                    Intrinsics.checkNotNull(fromInt);
                                    mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf3, valueOf22, date2, isScoreAvailable, normalizeMatchTime3, normalizeMatchTime22, isLive, id22, fromInt, extractPeriodScoresFromResultRaw));
                                    this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                                    this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                                    minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                                    if (minStakeRuleIdForTab != null) {
                                    }
                                    this.varietyId = responseMessage.getModel().getStatVarietyId();
                                    Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                                    Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                                    Log.d(TAG, "Full match model: " + responseMessage.getModel());
                                    BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                                    if (fromInt != MatchState.FINISHED) {
                                    }
                                    syncSelectedBetIdsWithBetslip();
                                    MatchShortInfoModel model2 = responseMessage.getModel();
                                    Log.d(TAG, "Match details updated: " + (model2 == null ? Long.valueOf(model2.getId()) : null));
                                }
                                str3 = "";
                                awayTeam2 = responseMessage.getModel().getAwayTeam();
                                if (awayTeam2 != null) {
                                    str4 = photoUrl;
                                    String valueOf32 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                                    String valueOf222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                                    String date22 = responseMessage.getModel().getDate();
                                    String normalizeMatchTime32 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                                    String normalizeMatchTime222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                                    int id222 = responseMessage.getModel().getSport().getId();
                                    Intrinsics.checkNotNull(fromInt);
                                    mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf32, valueOf222, date22, isScoreAvailable, normalizeMatchTime32, normalizeMatchTime222, isLive, id222, fromInt, extractPeriodScoresFromResultRaw));
                                    this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                                    this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                                    minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                                    if (minStakeRuleIdForTab != null) {
                                    }
                                    this.varietyId = responseMessage.getModel().getStatVarietyId();
                                    Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                                    Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                                    Log.d(TAG, "Full match model: " + responseMessage.getModel());
                                    BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                                    if (fromInt != MatchState.FINISHED) {
                                    }
                                    syncSelectedBetIdsWithBetslip();
                                    MatchShortInfoModel model22 = responseMessage.getModel();
                                    Log.d(TAG, "Match details updated: " + (model22 == null ? Long.valueOf(model22.getId()) : null));
                                }
                                str4 = "";
                                String valueOf322 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                                String valueOf2222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                                String date222 = responseMessage.getModel().getDate();
                                String normalizeMatchTime322 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                                String normalizeMatchTime2222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                                int id2222 = responseMessage.getModel().getSport().getId();
                                Intrinsics.checkNotNull(fromInt);
                                mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf322, valueOf2222, date222, isScoreAvailable, normalizeMatchTime322, normalizeMatchTime2222, isLive, id2222, fromInt, extractPeriodScoresFromResultRaw));
                                this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                                this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                                minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                                if (minStakeRuleIdForTab != null) {
                                }
                                this.varietyId = responseMessage.getModel().getStatVarietyId();
                                Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                                Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                                Log.d(TAG, "Full match model: " + responseMessage.getModel());
                                BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                                if (fromInt != MatchState.FINISHED) {
                                }
                                syncSelectedBetIdsWithBetslip();
                                MatchShortInfoModel model222 = responseMessage.getModel();
                                Log.d(TAG, "Match details updated: " + (model222 == null ? Long.valueOf(model222.getId()) : null));
                            }
                            str2 = "";
                            homeTeam2 = responseMessage.getModel().getHomeTeam();
                            if (homeTeam2 != null) {
                                str3 = photoUrl2;
                                awayTeam2 = responseMessage.getModel().getAwayTeam();
                                if (awayTeam2 != null) {
                                }
                                str4 = "";
                                String valueOf3222 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                                String valueOf22222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                                String date2222 = responseMessage.getModel().getDate();
                                String normalizeMatchTime3222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                                String normalizeMatchTime22222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                                int id22222 = responseMessage.getModel().getSport().getId();
                                Intrinsics.checkNotNull(fromInt);
                                mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf3222, valueOf22222, date2222, isScoreAvailable, normalizeMatchTime3222, normalizeMatchTime22222, isLive, id22222, fromInt, extractPeriodScoresFromResultRaw));
                                this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                                this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                                minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                                if (minStakeRuleIdForTab != null) {
                                }
                                this.varietyId = responseMessage.getModel().getStatVarietyId();
                                Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                                Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                                Log.d(TAG, "Full match model: " + responseMessage.getModel());
                                BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                                if (fromInt != MatchState.FINISHED) {
                                }
                                syncSelectedBetIdsWithBetslip();
                                MatchShortInfoModel model2222 = responseMessage.getModel();
                                Log.d(TAG, "Match details updated: " + (model2222 == null ? Long.valueOf(model2222.getId()) : null));
                            }
                            str3 = "";
                            awayTeam2 = responseMessage.getModel().getAwayTeam();
                            if (awayTeam2 != null) {
                            }
                            str4 = "";
                            String valueOf32222 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                            String valueOf222222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                            String date22222 = responseMessage.getModel().getDate();
                            String normalizeMatchTime32222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                            String normalizeMatchTime222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                            int id222222 = responseMessage.getModel().getSport().getId();
                            Intrinsics.checkNotNull(fromInt);
                            mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf32222, valueOf222222, date22222, isScoreAvailable, normalizeMatchTime32222, normalizeMatchTime222222, isLive, id222222, fromInt, extractPeriodScoresFromResultRaw));
                            this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                            this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                            minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                            if (minStakeRuleIdForTab != null) {
                            }
                            this.varietyId = responseMessage.getModel().getStatVarietyId();
                            Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                            Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                            Log.d(TAG, "Full match model: " + responseMessage.getModel());
                            BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                            if (fromInt != MatchState.FINISHED) {
                            }
                            syncSelectedBetIdsWithBetslip();
                            MatchShortInfoModel model22222 = responseMessage.getModel();
                            Log.d(TAG, "Match details updated: " + (model22222 == null ? Long.valueOf(model22222.getId()) : null));
                        }
                        str = "";
                        awayTeam = responseMessage.getModel().getAwayTeam();
                        if (awayTeam != null) {
                            str2 = name;
                            homeTeam2 = responseMessage.getModel().getHomeTeam();
                            if (homeTeam2 != null) {
                            }
                            str3 = "";
                            awayTeam2 = responseMessage.getModel().getAwayTeam();
                            if (awayTeam2 != null) {
                            }
                            str4 = "";
                            String valueOf322222 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                            String valueOf2222222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                            String date222222 = responseMessage.getModel().getDate();
                            String normalizeMatchTime322222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                            String normalizeMatchTime2222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                            int id2222222 = responseMessage.getModel().getSport().getId();
                            Intrinsics.checkNotNull(fromInt);
                            mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf322222, valueOf2222222, date222222, isScoreAvailable, normalizeMatchTime322222, normalizeMatchTime2222222, isLive, id2222222, fromInt, extractPeriodScoresFromResultRaw));
                            this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                            this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                            minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                            if (minStakeRuleIdForTab != null) {
                            }
                            this.varietyId = responseMessage.getModel().getStatVarietyId();
                            Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                            Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                            Log.d(TAG, "Full match model: " + responseMessage.getModel());
                            BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                            if (fromInt != MatchState.FINISHED) {
                            }
                            syncSelectedBetIdsWithBetslip();
                            MatchShortInfoModel model222222 = responseMessage.getModel();
                            Log.d(TAG, "Match details updated: " + (model222222 == null ? Long.valueOf(model222222.getId()) : null));
                        }
                        str2 = "";
                        homeTeam2 = responseMessage.getModel().getHomeTeam();
                        if (homeTeam2 != null) {
                        }
                        str3 = "";
                        awayTeam2 = responseMessage.getModel().getAwayTeam();
                        if (awayTeam2 != null) {
                        }
                        str4 = "";
                        String valueOf3222222 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                        String valueOf22222222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                        String date2222222 = responseMessage.getModel().getDate();
                        String normalizeMatchTime3222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                        String normalizeMatchTime22222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                        int id22222222 = responseMessage.getModel().getSport().getId();
                        Intrinsics.checkNotNull(fromInt);
                        mutableStateFlow.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf3222222, valueOf22222222, date2222222, isScoreAvailable, normalizeMatchTime3222222, normalizeMatchTime22222222, isLive, id22222222, fromInt, extractPeriodScoresFromResultRaw));
                        this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                        this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                        minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                        if (minStakeRuleIdForTab != null) {
                        }
                        this.varietyId = responseMessage.getModel().getStatVarietyId();
                        Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                        Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                        Log.d(TAG, "Full match model: " + responseMessage.getModel());
                        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                        if (fromInt != MatchState.FINISHED) {
                        }
                        syncSelectedBetIdsWithBetslip();
                        MatchShortInfoModel model2222222 = responseMessage.getModel();
                        Log.d(TAG, "Match details updated: " + (model2222222 == null ? Long.valueOf(model2222222.getId()) : null));
                    }
                    extractPeriodScoresFromResultRaw = null;
                    boolean isScoreAvailable2 = MatchDisplayState.isScoreAvailable(responseMessage.getModel().getMatchState(), responseMessage.getModel().getDate(), Integer.valueOf(id));
                    boolean isLive2 = MatchDisplayState.isLive(responseMessage.getModel().getMatchState(), responseMessage.getModel().getDate(), Integer.valueOf(id));
                    MutableStateFlow<MatchTopBaseData> mutableStateFlow2 = this._baseMatchInfo;
                    homeTeam = responseMessage.getModel().getHomeTeam();
                    if (homeTeam != null) {
                        str = name2;
                        awayTeam = responseMessage.getModel().getAwayTeam();
                        if (awayTeam != null) {
                        }
                        str2 = "";
                        homeTeam2 = responseMessage.getModel().getHomeTeam();
                        if (homeTeam2 != null) {
                        }
                        str3 = "";
                        awayTeam2 = responseMessage.getModel().getAwayTeam();
                        if (awayTeam2 != null) {
                        }
                        str4 = "";
                        String valueOf32222222 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                        String valueOf222222222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                        String date22222222 = responseMessage.getModel().getDate();
                        String normalizeMatchTime32222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                        String normalizeMatchTime222222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                        int id222222222 = responseMessage.getModel().getSport().getId();
                        Intrinsics.checkNotNull(fromInt);
                        mutableStateFlow2.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf32222222, valueOf222222222, date22222222, isScoreAvailable2, normalizeMatchTime32222222, normalizeMatchTime222222222, isLive2, id222222222, fromInt, extractPeriodScoresFromResultRaw));
                        this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                        this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                        minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                        if (minStakeRuleIdForTab != null) {
                        }
                        this.varietyId = responseMessage.getModel().getStatVarietyId();
                        Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                        Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                        Log.d(TAG, "Full match model: " + responseMessage.getModel());
                        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                        if (fromInt != MatchState.FINISHED) {
                        }
                        syncSelectedBetIdsWithBetslip();
                        MatchShortInfoModel model22222222 = responseMessage.getModel();
                        Log.d(TAG, "Match details updated: " + (model22222222 == null ? Long.valueOf(model22222222.getId()) : null));
                    }
                    str = "";
                    awayTeam = responseMessage.getModel().getAwayTeam();
                    if (awayTeam != null) {
                    }
                    str2 = "";
                    homeTeam2 = responseMessage.getModel().getHomeTeam();
                    if (homeTeam2 != null) {
                    }
                    str3 = "";
                    awayTeam2 = responseMessage.getModel().getAwayTeam();
                    if (awayTeam2 != null) {
                    }
                    str4 = "";
                    String valueOf322222222 = String.valueOf(responseMessage.getModel().getScoreHome().intValue());
                    String valueOf2222222222 = String.valueOf(responseMessage.getModel().getScoreAway().intValue());
                    String date222222222 = responseMessage.getModel().getDate();
                    String normalizeMatchTime322222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentTime());
                    String normalizeMatchTime2222222222 = UiExtensionsKt.normalizeMatchTime(responseMessage.getModel().getCurrentPeriod());
                    int id2222222222 = responseMessage.getModel().getSport().getId();
                    Intrinsics.checkNotNull(fromInt);
                    mutableStateFlow2.setValue(new MatchTopBaseData(str, str2, str3, str4, valueOf322222222, valueOf2222222222, date222222222, isScoreAvailable2, normalizeMatchTime322222222, normalizeMatchTime2222222222, isLive2, id2222222222, fromInt, extractPeriodScoresFromResultRaw));
                    this._canCreateBattle.setValue(Boolean.valueOf(fromInt != MatchState.SCHEDULED));
                    this._subMatches.setValue(mapSubmatchesToTabs(responseMessage.getModel().getSubmatches()));
                    minStakeRuleIdForTab = minStakeRuleIdForTab(this._subMatches.getValue(), this._selectedBetGroupTabIndex.getValue().intValue());
                    if (minStakeRuleIdForTab != null) {
                    }
                    this.varietyId = responseMessage.getModel().getStatVarietyId();
                    Log.d(TAG, "statVarietyId from API: " + responseMessage.getModel().getStatVarietyId());
                    Log.d(TAG, "matchId: " + responseMessage.getModel().getId());
                    Log.d(TAG, "Full match model: " + responseMessage.getModel());
                    BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onFetched$2(this, null), 3, null);
                    if (fromInt != MatchState.FINISHED) {
                    }
                    syncSelectedBetIdsWithBetslip();
                    MatchShortInfoModel model222222222 = responseMessage.getModel();
                    Log.d(TAG, "Match details updated: " + (model222222222 == null ? Long.valueOf(model222222222.getId()) : null));
                } else {
                    Log.w(TAG, "Received empty match details");
                    this._error.setValue(ERROR_LOADING_MATCH);
                }
            } catch (Exception e2) {
                e = e2;
                Log.e(TAG, "Error processing match details: " + e.getMessage(), e);
                this._error.setValue(ERROR_LOADING_MATCH);
            }
        } finally {
            this._isLoading.setValue(Boolean.valueOf(false));
        }
    }

    private final void loadMyPlacedBetsForMatch(final long matchId) {
        if (matchId <= 0) {
            this._myPlacedBets.setValue(CollectionsKt.emptyList());
            this._isMyPlacedBetsLoading.setValue(false);
            clearFinishedMatchUpcomingCategories();
            return;
        }
        this._isMyPlacedBetsLoading.setValue(true);
        clearFinishedMatchUpcomingCategories();
        Bundle bundle = new Bundle();
        bundle.putInt("offset", 0);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 20);
        try {
            getMatchMyBetsInteractor().invalidate(matchId);
            getMatchMyBetsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda5
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    MatchDetailsController.loadMyPlacedBetsForMatch$lambda$55(MatchDetailsController.this, matchId, fetchedResponseMessage);
                }
            }, Long.valueOf(matchId), bundle);
        } catch (Exception e) {
            this._isMyPlacedBetsLoading.setValue(false);
            this._myPlacedBets.setValue(CollectionsKt.emptyList());
            clearFinishedMatchUpcomingCategories();
            Log.e(TAG, "Error loading my placed bets: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMyPlacedBetsForMatch$lambda$55(MatchDetailsController matchDetailsController, long j, FetchedResponseMessage fetchedResponseMessage) {
        matchDetailsController._isMyPlacedBetsLoading.setValue(false);
        if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && fetchedResponseMessage.getModel() != null) {
            List<MatchPlacedBetInfoModel> items = ((MatchPlacedBetsResponseModel) fetchedResponseMessage.getModel()).getItems();
            matchDetailsController._myPlacedBets.setValue(items);
            Log.d(TAG, "My placed bets loaded: " + items.size());
            matchDetailsController.maybeLoadUpcomingMatchesForSingleBet(items);
            return;
        }
        matchDetailsController._myPlacedBets.setValue(CollectionsKt.emptyList());
        matchDetailsController.clearFinishedMatchUpcomingCategories();
        Log.w(TAG, "Failed to load my placed bets for match " + j);
    }

    private final void clearFinishedMatchUpcomingCategories() {
        this.upcomingTeamsLoadGeneration++;
        this._finishedMatchUpcomingCategories.setValue(CollectionsKt.emptyList());
    }

    private final void maybeLoadUpcomingMatchesForSingleBet(List<MatchPlacedBetInfoModel> bets) {
        String betName;
        if (bets.size() != 1) {
            clearFinishedMatchUpcomingCategories();
            return;
        }
        MatchShortInfoModel value = this._currentMatch.getValue();
        String str = null;
        TeamModelShort homeTeam = value != null ? value.getHomeTeam() : null;
        TeamModelShort awayTeam = value != null ? value.getAwayTeam() : null;
        if (homeTeam == null || awayTeam == null || homeTeam.getId() <= 0 || awayTeam.getId() <= 0) {
            clearFinishedMatchUpcomingCategories();
            return;
        }
        MatchPlacedBetModel placedBet = ((MatchPlacedBetInfoModel) CollectionsKt.first((List) bets)).getPlacedBet();
        if (placedBet != null && (betName = placedBet.getBetName()) != null) {
            str = StringsKt.trim((CharSequence) betName).toString();
        }
        if (str == null) {
            str = "";
        }
        Pair<TeamModelShort, TeamModelShort> resolveBetTeamOrder = resolveBetTeamOrder(str, homeTeam, awayTeam);
        TeamModelShort component1 = resolveBetTeamOrder.component1();
        TeamModelShort component2 = resolveBetTeamOrder.component2();
        long id = value.getId();
        this.upcomingTeamsLoadGeneration++;
        int i = this.upcomingTeamsLoadGeneration;
        final List<TeamModelShort> listOf = CollectionsKt.listOf((Object[]) new TeamModelShort[]{component1, component2});
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        final AtomicInteger atomicInteger = new AtomicInteger(listOf.size());
        for (final TeamModelShort teamModelShort : listOf) {
            final int i2 = i;
            loadTeamUpcomingCategory(teamModelShort, id, new Function1() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit maybeLoadUpcomingMatchesForSingleBet$lambda$58$lambda$57;
                    maybeLoadUpcomingMatchesForSingleBet$lambda$58$lambda$57 = MatchDetailsController.maybeLoadUpcomingMatchesForSingleBet$lambda$58$lambda$57(i2, this, concurrentHashMap, teamModelShort, atomicInteger, listOf, (MatchHistoryCategoryUiItem) obj);
                    return maybeLoadUpcomingMatchesForSingleBet$lambda$58$lambda$57;
                }
            });
            i = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit maybeLoadUpcomingMatchesForSingleBet$lambda$58$lambda$57(int i, MatchDetailsController matchDetailsController, ConcurrentHashMap concurrentHashMap, TeamModelShort teamModelShort, AtomicInteger atomicInteger, List list, MatchHistoryCategoryUiItem matchHistoryCategoryUiItem) {
        if (i != matchDetailsController.upcomingTeamsLoadGeneration) {
            return Unit.INSTANCE;
        }
        if (matchHistoryCategoryUiItem != null) {
            concurrentHashMap.put(Integer.valueOf(teamModelShort.getId()), matchHistoryCategoryUiItem);
        }
        if (atomicInteger.decrementAndGet() == 0 && i == matchDetailsController.upcomingTeamsLoadGeneration) {
            MutableStateFlow<List<MatchHistoryCategoryUiItem>> mutableStateFlow = matchDetailsController._finishedMatchUpcomingCategories;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MatchHistoryCategoryUiItem matchHistoryCategoryUiItem2 = (MatchHistoryCategoryUiItem) concurrentHashMap.get(Integer.valueOf(((TeamModelShort) it.next()).getId()));
                if (matchHistoryCategoryUiItem2 != null) {
                    arrayList.add(matchHistoryCategoryUiItem2);
                }
            }
            mutableStateFlow.setValue(arrayList);
        }
        return Unit.INSTANCE;
    }

    private final Pair<TeamModelShort, TeamModelShort> resolveBetTeamOrder(String betName, TeamModelShort home, TeamModelShort away) {
        String str = betName;
        if (!StringsKt.isBlank(str)) {
            if (StringsKt.equals(betName, away.getName(), true)) {
                return TuplesKt.to(away, home);
            }
            if (StringsKt.equals(betName, home.getName(), true)) {
                return TuplesKt.to(home, away);
            }
            if (!StringsKt.isBlank(away.getName()) && StringsKt.contains((CharSequence) str, (CharSequence) away.getName(), true)) {
                return TuplesKt.to(away, home);
            }
            if (!StringsKt.isBlank(home.getName()) && StringsKt.contains((CharSequence) str, (CharSequence) home.getName(), true)) {
                return TuplesKt.to(home, away);
            }
        }
        return TuplesKt.to(home, away);
    }

    private final void loadTeamUpcomingCategory(final TeamModelShort team, final long currentMatchId, final Function1<? super MatchHistoryCategoryUiItem, Unit> onDone) {
        long id = team.getId();
        if (id <= 0) {
            onDone.invoke(null);
            return;
        }
        try {
            getGetTeamDetailsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda17
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    MatchDetailsController.loadTeamUpcomingCategory$lambda$61(Function1.this, team, currentMatchId, fetchedResponseMessage);
                }
            }, Long.valueOf(id), null);
        } catch (Exception e) {
            Log.e(TAG, "Error loading upcoming matches for team " + team.getId() + ": " + e.getMessage(), e);
            onDone.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadTeamUpcomingCategory$lambda$61(Function1 function1, TeamModelShort teamModelShort, long j, FetchedResponseMessage fetchedResponseMessage) {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        Integer id;
        Integer id2;
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null) {
            function1.invoke(null);
            return;
        }
        List<MatchDetailsDataModel> futureMatches = ((TeamDetailsResponseModel) fetchedResponseMessage.getModel()).getFutureMatches();
        if (futureMatches != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : futureMatches) {
                if ((((MatchDetailsDataModel) obj).getId() != null ? r6.intValue() : 0) != j) {
                    arrayList.add(obj);
                }
            }
            list = CollectionsKt.take(arrayList, 5);
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list.isEmpty()) {
            function1.invoke(null);
            return;
        }
        List<MatchDetailsDataModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (MatchDetailsDataModel matchDetailsDataModel : list2) {
            MatchDetailsHomeTeamModel homeTeam = matchDetailsDataModel.getHomeTeam();
            long intValue = (homeTeam == null || (id2 = homeTeam.getId()) == null) ? 0 : id2.intValue();
            MatchDetailsHomeTeamModel homeTeam2 = matchDetailsDataModel.getHomeTeam();
            if (homeTeam2 == null || (str = homeTeam2.getPhotoUrl()) == null) {
                str = "";
            }
            MatchDetailsHomeTeamModel homeTeam3 = matchDetailsDataModel.getHomeTeam();
            if (homeTeam3 == null || (str2 = homeTeam3.getName()) == null) {
                str2 = "";
            }
            MatchHistoryTeamUiItem matchHistoryTeamUiItem = new MatchHistoryTeamUiItem(intValue, str, str2);
            MatchDetailsAwayTeamModel awayTeam = matchDetailsDataModel.getAwayTeam();
            long intValue2 = (awayTeam == null || (id = awayTeam.getId()) == null) ? 0 : id.intValue();
            MatchDetailsAwayTeamModel awayTeam2 = matchDetailsDataModel.getAwayTeam();
            if (awayTeam2 == null || (str3 = awayTeam2.getPhotoUrl()) == null) {
                str3 = "";
            }
            MatchDetailsAwayTeamModel awayTeam3 = matchDetailsDataModel.getAwayTeam();
            if (awayTeam3 == null || (str4 = awayTeam3.getName()) == null) {
                str4 = "";
            }
            MatchHistoryTeamUiItem matchHistoryTeamUiItem2 = new MatchHistoryTeamUiItem(intValue2, str3, str4);
            String date = matchDetailsDataModel.getDate();
            String str5 = date == null ? "" : date;
            Float scoreHome = matchDetailsDataModel.getScoreHome();
            int floatValue = (int) (scoreHome != null ? scoreHome.floatValue() : 0.0f);
            Float scoreAway = matchDetailsDataModel.getScoreAway();
            arrayList2.add(new MatchHistoryMatchUiItem(matchHistoryTeamUiItem, matchHistoryTeamUiItem2, str5, floatValue, (int) (scoreAway != null ? scoreAway.floatValue() : 0.0f), matchDetailsDataModel.getId() != null ? r4.intValue() : 0));
        }
        function1.invoke(new MatchHistoryCategoryUiItem(MatchHistoryType.RECENT_GAMES, "next_matches", " (" + teamModelShort.getName() + ")", arrayList2));
    }

    public final void onMyPlacedBetClick(long betlistId) {
        MainActivity mainActivity;
        if (betlistId > 0 && (mainActivity = this.activity) != null) {
            try {
                BetDetailDialog betDetailDialog = new BetDetailDialog();
                Bundle bundle = new Bundle();
                bundle.putInt("betId", (int) betlistId);
                betDetailDialog.setArguments(bundle);
                betDetailDialog.show(mainActivity.getSupportFragmentManager(), "BetDetailDialog");
            } catch (Exception e) {
                Log.e(TAG, "Error opening bet details for betlistId=" + betlistId + ": " + e.getMessage(), e);
            }
        }
    }

    @Override // org.betup.services.subscription.SubscriptionService.MatchSubscriptionsLoadListener
    public void onMatchSubscriptionsGot(List<SubscriptionType> types, boolean success) {
        MainActivity mainActivity = this.activity;
        if (mainActivity != null) {
            try {
                MatchShortInfoModel value = this.currentMatch.getValue();
                if (value == null) {
                    Log.e(TAG, "Current match is null, cannot show notification dialog");
                    return;
                }
                NotificationDialogFragment newInstance = NotificationDialogFragment.INSTANCE.newInstance((int) value.getId(), MatchState.fromInt(value.getMatchState()), types != null ? CollectionsKt.toList(types) : null);
                newInstance.setOnDismissListener(new Function1() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit onMatchSubscriptionsGot$lambda$65$lambda$64;
                        onMatchSubscriptionsGot$lambda$65$lambda$64 = MatchDetailsController.onMatchSubscriptionsGot$lambda$65$lambda$64(MatchDetailsController.this, (List) obj);
                        return onMatchSubscriptionsGot$lambda$65$lambda$64;
                    }
                });
                if (mainActivity instanceof FragmentActivity) {
                    newInstance.show(mainActivity.getSupportFragmentManager(), "NotificationDialog");
                }
            } catch (Exception e) {
                Log.e(TAG, "Error showing subscription dialog: " + e.getMessage(), e);
                this._error.setValue("Error showing subscription options");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMatchSubscriptionsGot$lambda$65$lambda$64(MatchDetailsController matchDetailsController, List selectedTypes) {
        Intrinsics.checkNotNullParameter(selectedTypes, "selectedTypes");
        try {
            matchDetailsController._isSubscribed.setValue(Boolean.valueOf(!selectedTypes.isEmpty()));
            Log.d(TAG, "Subscriptions updated: " + selectedTypes.size());
        } catch (Exception e) {
            Log.e(TAG, "Error updating subscriptions: " + e.getMessage(), e);
            matchDetailsController._error.setValue("Error updating subscriptions");
        }
        return Unit.INSTANCE;
    }

    private final void onTabSelected(int index) {
        MatchDetailsButtonTabs matchTabQuiz;
        QuizModel value;
        if (this._selectedTabIndex.getValue().intValue() == index) {
            return;
        }
        this._selectedTabIndex.setValue(Integer.valueOf(index));
        if (index != 1) {
            if (index == 2) {
                if (this._hasUnreadMatchComments.getValue().booleanValue()) {
                    this._hasUnreadMatchComments.setValue(false);
                    updateCommentsTabIndicator();
                }
                if (this._matchComments.getValue().isEmpty()) {
                    refreshMatchComments();
                }
            } else if (index != 3) {
                if (index == 4) {
                    MatchDetailsQuizAvailabilityModel value2 = this._quizAvailability.getValue();
                    if (value2 != null && value2.getAvailable() && value2.getId() > 0 && (this._quizDetails.getValue() == null || (value = this._quizDetails.getValue()) == null || value.getId() != value2.getId())) {
                        loadQuizDetails(value2.getId());
                    }
                    Log.d(TAG, "Quiz tab selected - availability: " + (value2 != null ? Boolean.valueOf(value2.getAvailable()) : null) + ", quizId: " + (value2 != null ? Integer.valueOf(value2.getId()) : null));
                } else {
                    BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(this._subMatches.getValue(), index);
                    if (betGroupsTabs != null) {
                        onGetBetInfo(betGroupsTabs.getId());
                    }
                }
            } else if (this._availableBattles.getValue().isEmpty()) {
                loadAvailableBattles();
            }
        } else if (!this._isStatisticsLoading.getValue().booleanValue() && this._varietyStatsTabs.getValue().isEmpty()) {
            loadMatchStatTabs();
        }
        MutableStateFlow<List<MatchDetailsButtonTabs>> mutableStateFlow = this._tabItems;
        List<MatchDetailsButtonTabs> value3 = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value3, 10));
        int i = 0;
        for (Object obj : value3) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MatchDetailsButtonTabs matchDetailsButtonTabs = (MatchDetailsButtonTabs) obj;
            if (matchDetailsButtonTabs instanceof MatchDetailsButtonTabs.MatchTabBetGroups) {
                MatchDetailsButtonTabs.MatchTabBetGroups matchTabBetGroups = (MatchDetailsButtonTabs.MatchTabBetGroups) matchDetailsButtonTabs;
                matchTabQuiz = new MatchDetailsButtonTabs.MatchTabBetGroups(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit onTabSelected$lambda$72$lambda$67;
                        onTabSelected$lambda$72$lambda$67 = MatchDetailsController.onTabSelected$lambda$72$lambda$67(MatchDetailsController.this);
                        return onTabSelected$lambda$72$lambda$67;
                    }
                }, matchTabBetGroups.isActive(), i == index, matchTabBetGroups.getId());
            } else if (matchDetailsButtonTabs instanceof MatchDetailsButtonTabs.MatchTabStatistics) {
                MatchDetailsButtonTabs.MatchTabStatistics matchTabStatistics = (MatchDetailsButtonTabs.MatchTabStatistics) matchDetailsButtonTabs;
                matchTabQuiz = new MatchDetailsButtonTabs.MatchTabStatistics(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit onTabSelected$lambda$72$lambda$68;
                        onTabSelected$lambda$72$lambda$68 = MatchDetailsController.onTabSelected$lambda$72$lambda$68(MatchDetailsController.this);
                        return onTabSelected$lambda$72$lambda$68;
                    }
                }, matchTabStatistics.isActive(), i == index, matchTabStatistics.getId());
            } else if (matchDetailsButtonTabs instanceof MatchDetailsButtonTabs.MatchTabComments) {
                matchTabQuiz = new MatchDetailsButtonTabs.MatchTabComments(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit onTabSelected$lambda$72$lambda$69;
                        onTabSelected$lambda$72$lambda$69 = MatchDetailsController.onTabSelected$lambda$72$lambda$69(MatchDetailsController.this);
                        return onTabSelected$lambda$72$lambda$69;
                    }
                }, this._hasUnreadMatchComments.getValue().booleanValue(), i == index, ((MatchDetailsButtonTabs.MatchTabComments) matchDetailsButtonTabs).getId());
            } else if (matchDetailsButtonTabs instanceof MatchDetailsButtonTabs.MatchTabBattles) {
                MatchDetailsButtonTabs.MatchTabBattles matchTabBattles = (MatchDetailsButtonTabs.MatchTabBattles) matchDetailsButtonTabs;
                matchTabQuiz = new MatchDetailsButtonTabs.MatchTabBattles(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit onTabSelected$lambda$72$lambda$70;
                        onTabSelected$lambda$72$lambda$70 = MatchDetailsController.onTabSelected$lambda$72$lambda$70(MatchDetailsController.this);
                        return onTabSelected$lambda$72$lambda$70;
                    }
                }, matchTabBattles.isActive(), i == index, matchTabBattles.getId());
            } else {
                if (!(matchDetailsButtonTabs instanceof MatchDetailsButtonTabs.MatchTabQuiz)) {
                    throw new NoWhenBranchMatchedException();
                }
                MatchDetailsButtonTabs.MatchTabQuiz matchTabQuiz2 = (MatchDetailsButtonTabs.MatchTabQuiz) matchDetailsButtonTabs;
                matchTabQuiz = new MatchDetailsButtonTabs.MatchTabQuiz(new Function0() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit onTabSelected$lambda$72$lambda$71;
                        onTabSelected$lambda$72$lambda$71 = MatchDetailsController.onTabSelected$lambda$72$lambda$71(MatchDetailsController.this);
                        return onTabSelected$lambda$72$lambda$71;
                    }
                }, matchTabQuiz2.isActive(), i == index, matchTabQuiz2.getId());
            }
            arrayList.add(matchTabQuiz);
            i = i2;
        }
        mutableStateFlow.setValue(arrayList);
        updateBetGroupsFromSubMatches();
        updateCommentsTabIndicator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$72$lambda$67(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$72$lambda$68(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$72$lambda$69(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$72$lambda$70(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$72$lambda$71(MatchDetailsController matchDetailsController) {
        matchDetailsController.onTabSelected(4);
        return Unit.INSTANCE;
    }

    public final void onBetGroupTabSelected(int index) {
        List<MatchVarietyGroupBetsModel> emptyList;
        int intValue = this._selectedBetGroupTabIndex.getValue().intValue();
        List<BetGroupsTabs> value = this._subMatches.getValue();
        String minStakeRuleIdForTab = minStakeRuleIdForTab(value, index);
        boolean z = (minStakeRuleIdForTab == null || Intrinsics.areEqual(minStakeRuleIdForTab, minStakeRuleIdForTab(value, intValue))) ? false : true;
        this._selectedBetGroupTabIndex.setValue(Integer.valueOf(index));
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) CollectionsKt.getOrNull(value, index);
        if (betGroupsTabs == null || (emptyList = betGroupsTabs.getBets()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        this._betGroups.setValue(emptyList);
        if (z) {
            onVarietyMinStakeTabEntered(minStakeRuleIdForTab);
        } else if (minStakeRuleIdForTab != null) {
            applyMinStakeForCurrentTab();
            MutableStateFlow<Integer> mutableStateFlow = this._playerStatsInfoRefreshTick;
            mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
        }
    }

    public final StateFlow<Map<Integer, Map<Long, Boolean>>> getExpandedStatesPerTab() {
        return this.expandedStatesPerTab;
    }

    public final void onExpandToggle(int tabIndex, long groupId) {
        Map<Long, Boolean> map = this._expandedStatesPerTab.getValue().get(Integer.valueOf(tabIndex));
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        MutableStateFlow<Map<Integer, Map<Long, Boolean>>> mutableStateFlow = this._expandedStatesPerTab;
        Map<Integer, Map<Long, Boolean>> mutableMap = MapsKt.toMutableMap(mutableStateFlow.getValue());
        Integer valueOf = Integer.valueOf(tabIndex);
        Map<Long, Boolean> mutableMap2 = MapsKt.toMutableMap(map);
        mutableMap2.put(Long.valueOf(groupId), Boolean.valueOf(!(mutableMap2.get(Long.valueOf(groupId)) != null ? r6.booleanValue() : false)));
        mutableMap.put(valueOf, mutableMap2);
        mutableStateFlow.setValue(mutableMap);
        getLocalPreferencesService().saveExpandedBetGroupsForMatch(this.id, this._expandedStatesPerTab.getValue());
    }

    public final void setAllExpanded(int tabIndex, boolean expanded, List<Long> groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        MutableStateFlow<Map<Integer, Map<Long, Boolean>>> mutableStateFlow = this._expandedStatesPerTab;
        Map<Integer, Map<Long, Boolean>> mutableMap = MapsKt.toMutableMap(mutableStateFlow.getValue());
        Integer valueOf = Integer.valueOf(tabIndex);
        List<Long> list = groupIds;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            ((Number) obj).longValue();
            linkedHashMap.put(obj, Boolean.valueOf(expanded));
        }
        mutableMap.put(valueOf, linkedHashMap);
        mutableStateFlow.setValue(mutableMap);
        getLocalPreferencesService().saveExpandedBetGroupsForMatch(this.id, this._expandedStatesPerTab.getValue());
        getLocalPreferencesService().saveGlobalExpandedBets(expanded);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBetPlacedSuccess(BetPlacedSuccessMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, "BetPlacedSuccessMessage received for matchId=" + message.getMatchId() + ", controller id=" + this.id);
        if (message.getMatchId() != this.id) {
            Integer.valueOf(Log.d(TAG, "Match IDs don't match. Ignoring message."));
            return;
        }
        Log.d(TAG, "Match IDs match! Clearing selectedBetIds. Before: " + this._selectedBetIds.getValue());
        if (currentUserHasPlayerStatsBetEverPlaced()) {
            this._playerStatsMinInfoHelpOpen.setValue(false);
            this._playerStatsMinInfoAutoDismissed.setValue(false);
        }
        MutableStateFlow<Integer> mutableStateFlow = this._playerStatsInfoRefreshTick;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
        this.preventAutoSync = true;
        Log.d(TAG, "preventAutoSync flag set to true");
        this._selectedBetIds.setValue(SetsKt.emptySet());
        Log.d(TAG, "selectedBetIds cleared. After: " + this._selectedBetIds.getValue());
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$onBetPlacedSuccess$1(this, null), 3, null);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onChallengesChanged(ChallengeAcceptedOrCreatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, "ChallengesChangedMessage received, refreshing battles list");
        Log.d(TAG, "Current battles count: " + this._availableBattles.getValue().size());
        Log.d(TAG, "Controller ID: " + this.id);
        refreshBattles();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBetlistUpdated(BetlistUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.getMatchId() != null) {
            Long matchId = message.getMatchId();
            long j = this.id;
            if (matchId == null || matchId.longValue() != j) {
                return;
            }
        }
        Log.d(TAG, "BetlistUpdatedMessage received - refreshing bet groups for match id: " + this.id);
        if (currentUserHasPlayerStatsBetEverPlaced()) {
            this._playerStatsMinInfoHelpOpen.setValue(false);
            this._playerStatsMinInfoAutoDismissed.setValue(false);
        }
        MutableStateFlow<Integer> mutableStateFlow = this._playerStatsInfoRefreshTick;
        mutableStateFlow.setValue(Integer.valueOf(mutableStateFlow.getValue().intValue() + 1));
        refreshBetGroups();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCoefficientUpdated(CoefficientUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, "CoefficientUpdatedMessage received - refreshing bet groups for match id: " + this.id);
        refreshBetGroups();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBetsUnlocked(BetsUnlockedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, "BetsUnlockedMessage received - refreshing bet data for match id: " + this.id);
        refreshBetGroups();
    }

    public final void refreshBetGroups() {
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$refreshBetGroups$1(this, null), 3, null);
    }

    public final void setSelectedStatisticsTab(MatchStatsTabs tabItem) {
        Intrinsics.checkNotNullParameter(tabItem, "tabItem");
        int indexOf = this._statsTabs.getValue().indexOf(tabItem);
        if (indexOf != -1) {
            this._selectedStatsTabIndex.setValue(Integer.valueOf(indexOf));
        }
        if (tabItem instanceof MatchStatsTabs.MatchStatisticsUiItem) {
            if (this._isStatisticsLoading.getValue().booleanValue() || !this._varietyStatsTabs.getValue().isEmpty()) {
                return;
            }
            loadMatchStatTabs();
            return;
        }
        if (!(tabItem instanceof MatchStatsTabs.MatchHistoryUiItem)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this._historyData.getValue().isEmpty()) {
            loadMatchHistory();
        }
    }

    public final void loadAvailableBattles() {
        if (this._isBattlesLoading.getValue().booleanValue()) {
            return;
        }
        Log.d(TAG, "loadAvailableBattles called - matchId: " + this.id + ", offset: " + this.availableBattlesOffset + ", limit: " + this.battlesLimit);
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.availableBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewChallengesInteractor().invalidate(this.id);
        Log.d(TAG, "Calling newChallengesInteractor.load with params: " + bundle);
        getNewChallengesInteractor().load(this.battlesListener, this.id, bundle);
    }

    public final void loadMoreAvailableBattles() {
        Log.d(TAG, "loadMoreAvailableBattles called - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreAvailableBattles.getValue());
        if (this._isBattlesLoading.getValue().booleanValue() || !this._hasMoreAvailableBattles.getValue().booleanValue()) {
            Log.d(TAG, "loadMoreAvailableBattles skipped - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreAvailableBattles.getValue());
        } else {
            int i = this.availableBattlesOffset + this.battlesLimit;
            this.availableBattlesOffset = i;
            Log.d(TAG, "loadMoreAvailableBattles - new offset: " + i);
            loadAvailableBattles();
        }
    }

    public final void refreshBattles() {
        this.availableBattlesOffset = 0;
        this._hasMoreAvailableBattles.setValue(true);
        this._availableBattles.setValue(CollectionsKt.emptyList());
        getNewChallengesInteractor().invalidate(this.id);
        loadAvailableBattles();
    }

    private final void loadAvailableBattlesInitial() {
        Log.d(TAG, "loadAvailableBattlesInitial called - matchId: " + this.id);
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", 0);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewChallengesInteractor().invalidate(this.id);
        getNewChallengesInteractor().load(this.battlesListener, this.id, bundle);
    }

    public final void acceptBattle(long battleId) {
        Log.d(TAG, "Opening battle dialog with ID: " + battleId);
        EventBus.getDefault().post(new OpenBetSelectionEvent(this.id, Long.valueOf(battleId), null, null, null, 24, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openBattlePreview$default(MatchDetailsController matchDetailsController, long j, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        matchDetailsController.openBattlePreview(j, list);
    }

    public final void openBattlePreview(long battleId, List<Long> challengeIds) {
        ArrayList arrayList = null;
        Log.d(TAG, "Opening battle preview with ID: " + battleId + ", list size: " + (challengeIds != null ? Integer.valueOf(challengeIds.size()) : null));
        EventBus eventBus = EventBus.getDefault();
        Integer valueOf = Integer.valueOf((int) battleId);
        if (challengeIds != null) {
            List<Long> list = challengeIds;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
            }
            arrayList = arrayList2;
        }
        eventBus.post(new OpenChallengePreviewDialog(valueOf, arrayList));
    }

    public final void createBattle() {
        Log.d(TAG, "Opening create battle dialog with matchId: " + this.id);
        EventBus.getDefault().post(new OpenBetSelectionEvent(this.id, null, null, null, null, 24, null));
    }

    public final void deactivateBattlesTabIndicator() {
        Log.d(TAG, "Deactivating battles tab indicator");
        MutableStateFlow<List<MatchDetailsButtonTabs>> mutableStateFlow = this._tabItems;
        List<MatchDetailsButtonTabs> value = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        for (MatchDetailsButtonTabs.MatchTabBattles matchTabBattles : value) {
            if (matchTabBattles instanceof MatchDetailsButtonTabs.MatchTabBattles) {
                matchTabBattles = MatchDetailsButtonTabs.MatchTabBattles.copy$default((MatchDetailsButtonTabs.MatchTabBattles) matchTabBattles, null, false, false, 0, 13, null);
            }
            arrayList.add(matchTabBattles);
        }
        mutableStateFlow.setValue(arrayList);
    }

    private final void loadQuizAvailability() {
        if (this._isQuizLoading.getValue().booleanValue()) {
            return;
        }
        Log.d(TAG, "loadQuizAvailability called - matchId: " + this.id);
        this._isQuizLoading.setValue(true);
        getQuizAvailabilityInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<MatchDetailsQuizAvailabilityModel, Integer>() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$loadQuizAvailability$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<MatchDetailsQuizAvailabilityModel, Integer> responseMessage) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                MutableStateFlow mutableStateFlow4;
                MutableStateFlow mutableStateFlow5;
                int i;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                mutableStateFlow = MatchDetailsController.this._isQuizLoading;
                mutableStateFlow.setValue(false);
                if (responseMessage.getModel() != null) {
                    Log.d("MatchDetailsController", "Quiz availability loaded - available: " + responseMessage.getModel().getAvailable() + ", quizId: " + responseMessage.getModel().getId());
                    mutableStateFlow2 = MatchDetailsController.this._quizAvailability;
                    mutableStateFlow2.setValue(responseMessage.getModel());
                    if (responseMessage.getModel().getAvailable() || responseMessage.getModel().getParticipation() != null) {
                        mutableStateFlow3 = MatchDetailsController.this._tabItems;
                        mutableStateFlow4 = MatchDetailsController.this._tabItems;
                        Iterable<MatchDetailsButtonTabs> iterable = (Iterable) mutableStateFlow4.getValue();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (MatchDetailsButtonTabs.MatchTabQuiz matchTabQuiz : iterable) {
                            if (matchTabQuiz instanceof MatchDetailsButtonTabs.MatchTabQuiz) {
                                matchTabQuiz = MatchDetailsButtonTabs.MatchTabQuiz.copy$default((MatchDetailsButtonTabs.MatchTabQuiz) matchTabQuiz, null, true, false, 0, 13, null);
                            }
                            arrayList.add(matchTabQuiz);
                        }
                        mutableStateFlow3.setValue(arrayList);
                    }
                    QuizParticipationModel participation = responseMessage.getModel().getParticipation();
                    if (participation != null && participation.getState() != 1) {
                        Log.d("MatchDetailsController", "Loading full participation details for PENDING quiz");
                        MatchDetailsController matchDetailsController = MatchDetailsController.this;
                        i = matchDetailsController.id;
                        matchDetailsController.loadMatchQuizParticipationDetails(i);
                        return;
                    }
                    if (participation != null) {
                        mutableStateFlow5 = MatchDetailsController.this._quizParticipationDetails;
                        mutableStateFlow5.setValue(participation);
                        MatchDetailsController.this.applyParticipationMatchResultToBaseInfo(participation);
                        return;
                    }
                    return;
                }
                Log.e("MatchDetailsController", "Quiz availability load failed - no model in response");
            }
        }, Integer.valueOf(this.id), new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyParticipationMatchResultToBaseInfo(QuizParticipationModel participation) {
        MatchTopBaseData copy;
        MatchTopBaseData value = this._baseMatchInfo.getValue();
        if (value == null) {
            return;
        }
        MatchShortDetailsDataModel match = participation.getQuiz().getMatch();
        MatchState matchState = match.getMatchState();
        if (matchState == MatchState.FINISHED || matchState == MatchState.LIVE) {
            try {
                if (match.getSport().has("id")) {
                    match.getSport().getInt("id");
                } else {
                    value.getSportId();
                }
            } catch (Exception unused) {
                value.getSportId();
            }
            String resultRaw = match.getResultRaw();
            String extractPeriodScoresFromResultRaw = (resultRaw == null || StringsKt.isBlank(resultRaw)) ? null : MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(match.getResultRaw());
            MutableStateFlow<MatchTopBaseData> mutableStateFlow = this._baseMatchInfo;
            copy = value.copy((r30 & 1) != 0 ? value.firstTeamName : null, (r30 & 2) != 0 ? value.secondTeamName : null, (r30 & 4) != 0 ? value.firstTeamImage : null, (r30 & 8) != 0 ? value.secondTeamImage : null, (r30 & 16) != 0 ? value.scoreFirstTeam : String.valueOf((int) match.getScoreHome()), (r30 & 32) != 0 ? value.scoreSecondTeam : String.valueOf((int) match.getScoreAway()), (r30 & 64) != 0 ? value.matchDateTime : null, (r30 & 128) != 0 ? value.isScoreAvailable : true, (r30 & 256) != 0 ? value.playTime : null, (r30 & 512) != 0 ? value.playTimeName : null, (r30 & 1024) != 0 ? value.isLive : matchState == MatchState.LIVE, (r30 & 2048) != 0 ? value.sportId : 0, (r30 & 4096) != 0 ? value.matchStat : matchState, (r30 & 8192) != 0 ? value.periodScoresDisplay : extractPeriodScoresFromResultRaw);
            mutableStateFlow.setValue(copy);
            Log.d(TAG, "Applied participation match result to base info: " + match.getScoreHome() + "-" + match.getScoreAway() + ", result_raw=" + match.getResultRaw());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMatchQuizParticipationDetails(long matchId) {
        if (this._isQuizParticipationLoading.getValue().booleanValue()) {
            return;
        }
        Log.d(TAG, "loadMatchQuizParticipationDetails called - matchId: " + matchId);
        this._isQuizParticipationLoading.setValue(true);
        getMatchQuizParticipationInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<QuizParticipationModel, Long>() { // from class: org.betup.ui.fragment.matches.details.MatchDetailsController$loadMatchQuizParticipationDetails$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<QuizParticipationModel, Long> responseMessage) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                MutableStateFlow mutableStateFlow4;
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                mutableStateFlow = MatchDetailsController.this._isQuizParticipationLoading;
                mutableStateFlow.setValue(false);
                if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
                    int state = responseMessage.getModel().getState();
                    List<BetsPlaceModel> bets = responseMessage.getModel().getBets();
                    Log.d("MatchDetailsController", "Quiz participation details loaded - state: " + state + ", bets count: " + (bets != null ? Integer.valueOf(bets.size()) : null));
                    mutableStateFlow4 = MatchDetailsController.this._quizParticipationDetails;
                    mutableStateFlow4.setValue(responseMessage.getModel());
                    MatchDetailsController matchDetailsController = MatchDetailsController.this;
                    QuizParticipationModel model = responseMessage.getModel();
                    Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                    matchDetailsController.applyParticipationMatchResultToBaseInfo(model);
                    return;
                }
                Log.e("MatchDetailsController", "Quiz participation details load failed");
                mutableStateFlow2 = MatchDetailsController.this._quizAvailability;
                MatchDetailsQuizAvailabilityModel matchDetailsQuizAvailabilityModel = (MatchDetailsQuizAvailabilityModel) mutableStateFlow2.getValue();
                QuizParticipationModel participation = matchDetailsQuizAvailabilityModel != null ? matchDetailsQuizAvailabilityModel.getParticipation() : null;
                mutableStateFlow3 = MatchDetailsController.this._quizParticipationDetails;
                mutableStateFlow3.setValue(participation);
                if (participation != null) {
                    MatchDetailsController.this.applyParticipationMatchResultToBaseInfo(participation);
                }
            }
        }, Long.valueOf(matchId), new Bundle());
    }

    public final void deactivateQuizTabIndicator() {
        Log.d(TAG, "Deactivating quiz tab indicator");
        MutableStateFlow<List<MatchDetailsButtonTabs>> mutableStateFlow = this._tabItems;
        List<MatchDetailsButtonTabs> value = mutableStateFlow.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        for (MatchDetailsButtonTabs.MatchTabQuiz matchTabQuiz : value) {
            if (matchTabQuiz instanceof MatchDetailsButtonTabs.MatchTabQuiz) {
                matchTabQuiz = MatchDetailsButtonTabs.MatchTabQuiz.copy$default((MatchDetailsButtonTabs.MatchTabQuiz) matchTabQuiz, null, false, false, 0, 13, null);
            }
            arrayList.add(matchTabQuiz);
        }
        mutableStateFlow.setValue(arrayList);
    }

    private final void loadQuizDetails(long quizId) {
        if (this._isQuizDetailsLoading.getValue().booleanValue()) {
            Log.d(TAG, "loadQuizDetails skipped - already loading");
            return;
        }
        Log.d(TAG, "loadQuizDetails called - quizId: " + quizId);
        this._isQuizDetailsLoading.setValue(true);
        BuildersKt__Builders_commonKt.launch$default(this.controllerScope, null, null, new MatchDetailsController$loadQuizDetails$1(this, null), 3, null);
        getQuizDetailsInteractor().load(this.quizDetailsListener, Long.valueOf(quizId), new Bundle());
    }

    private final void loadQuizTiers() {
        Log.d(TAG, "loadQuizTiers called");
        getQuizTiersInteractor().load(this.quizTiersListener, Unit.INSTANCE, new Bundle());
    }

    public final void selectQuizAnswer(int questionIndex, long betId, String betName, float coefficient, String varietyName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(varietyName, "varietyName");
        Log.d(TAG, "selectQuizAnswer - Q" + questionIndex + ": " + betName + " (" + coefficient + ")");
        Map mutableMap = MapsKt.toMutableMap(this._quizSelectionState.getValue().getSelectedAnswers());
        mutableMap.put(Integer.valueOf(questionIndex), new SelectedAnswer(betId, betName, coefficient, varietyName));
        MutableStateFlow<QuizSelectionState> mutableStateFlow = this._quizSelectionState;
        mutableStateFlow.setValue(QuizSelectionState.copy$default(mutableStateFlow.getValue(), 0, mutableMap, null, false, 13, null));
        Log.d(TAG, "Total odds after selection: " + this._quizSelectionState.getValue().calculateTotalOdds());
    }

    public final void selectQuizTier(long tierId) {
        Object obj;
        Iterator<T> it = this._quizTiers.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((QuizTierModel) obj).getId() == tierId) {
                    break;
                }
            }
        }
        QuizTierModel quizTierModel = (QuizTierModel) obj;
        Log.d(TAG, "selectQuizTier - " + (quizTierModel != null ? quizTierModel.getName() : null));
        MutableStateFlow<QuizSelectionState> mutableStateFlow = this._quizSelectionState;
        mutableStateFlow.setValue(QuizSelectionState.copy$default(mutableStateFlow.getValue(), 0, null, Long.valueOf(tierId), false, 11, null));
    }

    public final void toggleQuizPreview(boolean show) {
        MutableStateFlow<QuizSelectionState> mutableStateFlow = this._quizSelectionState;
        mutableStateFlow.setValue(QuizSelectionState.copy$default(mutableStateFlow.getValue(), 0, null, null, show, 7, null));
        Log.d(TAG, "Toggle preview: " + show);
    }

    public final void setQuizQuestionIndex(int index) {
        MutableStateFlow<QuizSelectionState> mutableStateFlow = this._quizSelectionState;
        mutableStateFlow.setValue(QuizSelectionState.copy$default(mutableStateFlow.getValue(), index, null, null, false, 14, null));
    }

    public final void placeQuizParticipation() {
        List<BetSectionModel> questions;
        QuizSelectionState value = this._quizSelectionState.getValue();
        MatchDetailsQuizAvailabilityModel value2 = this._quizAvailability.getValue();
        if (value2 != null) {
            int id = value2.getId();
            QuizModel value3 = this._quizDetails.getValue();
            if (!value.allQuestionsAnswered((value3 == null || (questions = value3.getQuestions()) == null) ? 3 : questions.size()) || value.getSelectedTierId() == null) {
                Log.e(TAG, "Cannot place quiz - invalid state");
                this._error.setValue("Please select all answers and a tier");
                return;
            }
            Log.d(TAG, "placeQuizParticipation - quizId: " + id + ", tier: " + value.getSelectedTierId());
            this._isPlacingQuiz.setValue(true);
            Collection<SelectedAnswer> values = value.getSelectedAnswers().values();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(new PlaceBetRequestModel(((SelectedAnswer) it.next()).getBetId(), r4.getCoefficient()));
            }
            Long selectedTierId = value.getSelectedTierId();
            Intrinsics.checkNotNull(selectedTierId);
            getQuizParticipationInteractor().load((BaseCachedSharedInteractor.OnFetchedListener<QuizParticipationResponseModel, QuizParticipationRequest>) new MatchDetailsController$placeQuizParticipation$1(this), new QuizParticipationRequest(id, new CreateQuizRequestModel(selectedTierId.longValue(), arrayList)));
        }
    }

    public final void startUnlockBetTypesFlow() {
        try {
            MainActivity mainActivity = this.activity;
            if (mainActivity == null) {
                return;
            }
            new UnlockBetTypesFlow(mainActivity, getBillingService(), getFirebaseRemoteConfig(), getSingleShopInteractor(), this, PurchasePlacement.BETSLIP, getAnalyticsService(), getUserService(), getVideoRewardService()).start(this, new String[0]);
        } catch (Exception e) {
            Log.e(TAG, "Error starting unlock flow: " + e.getMessage(), e);
        }
    }

    @Override // org.betup.services.billing.PurchaseCompletedListener
    public void purchaseCompleted() {
        Log.d(TAG, "Purchase completed, refreshing bet data");
        refreshBetGroups();
    }

    @Override // org.betup.ui.ProgressDisplay
    public void displayProgress() {
        Log.d(TAG, "Displaying progress");
    }

    @Override // org.betup.ui.ProgressDisplay
    public void hideProgress() {
        Log.d(TAG, "Hiding progress");
    }
}
