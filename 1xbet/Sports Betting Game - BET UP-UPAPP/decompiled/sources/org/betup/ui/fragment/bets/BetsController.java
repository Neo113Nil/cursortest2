package org.betup.ui.fragment.bets;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.BetPlacedSuccessMessage;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.BettingSheetStateMessage;
import org.betup.bus.ChallengesChangedMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.ShowNotEnoughBetcoinsVideoOfferMessage;
import org.betup.bus.TourCloseMessage;
import org.betup.bus.TourMessage;
import org.betup.bus.UserProfileUpdatedMessage;
import org.betup.model.domain.RemoteConfigConstants;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.betslip.V7CreateBetlistInteractor;
import org.betup.model.remote.api.rest.betslip.V7GrabbedBetsInteractor;
import org.betup.model.remote.api.rest.energy.NewChallengeCreateInteractor;
import org.betup.model.remote.api.rest.energy.NewCreateChallengeModel;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.shop.CancelBetInteractor;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractor;
import org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractorExtKt;
import org.betup.model.remote.api.rest.shop.GetCancelBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.GetSellBetInfoInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.shop.SellBetInteractor;
import org.betup.model.remote.api.rest.shop.SellBetParams;
import org.betup.model.remote.api.rest.user.V7VarietyBetRestrictionsInteractor;
import org.betup.model.remote.api.rest.user.V7VarietyVersionGatesInteractor;
import org.betup.model.remote.api.rest.user.bets.BetStatInteractor;
import org.betup.model.remote.api.rest.user.bets.BetsListInteractor;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsResponseModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.betslip.BetListModel;
import org.betup.model.remote.entity.betslip.GrabbedBetDataModel;
import org.betup.model.remote.entity.betslip.GrabbedBetModel;
import org.betup.model.remote.entity.betslip.V7BetTypeGroupDto;
import org.betup.model.remote.entity.betslip.V7BetlistCreatedDto;
import org.betup.model.remote.entity.betslip.V7BetlistPlacementResponse;
import org.betup.model.remote.entity.betslip.V7CreateBetlistRequestModel;
import org.betup.model.remote.entity.betslip.V7GrabbedBetDto;
import org.betup.model.remote.entity.betslip.V7GrabbedBetsResponse;
import org.betup.model.remote.entity.challenges.NewChallengeCreatedModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsSportModel;
import org.betup.model.remote.entity.shop.CancelBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetResultModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionRuleModel;
import org.betup.model.remote.entity.user.VarietyBetRestrictionsConfigModel;
import org.betup.model.remote.entity.user.VarietyVersionGatesConfigModel;
import org.betup.model.remote.entity.user.details.UserBetStatsModel;
import org.betup.model.remote.entity.videoRewards.VideoRewardPlacementInfo;
import org.betup.presentation.PresentationMatchContext;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.PurchaseCompletedListener;
import org.betup.services.billing.UnlockBetAmountFlow;
import org.betup.services.billing.UnlockBetTypesFlow;
import org.betup.services.challenge.ChallengeTourInfoProvider;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.dialogs.BetPlacedDialog;
import org.betup.ui.dialogs.OddsDialogFragment;
import org.betup.ui.dialogs.PlayerStatsMinStakeComposeDialogFragment;
import org.betup.ui.dialogs.ShopDialogFragment;
import org.betup.ui.dialogs.SignUpDialogFragment;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.ui.dialogs.events.OpenChallengePreviewDialog;
import org.betup.ui.dialogs.events.OpenFollowersDialogForBattleEvent;
import org.betup.ui.fragment.bets.BaseBettingController;
import org.betup.ui.fragment.bets.BattleCreateResult;
import org.betup.ui.fragment.bets.PlaceBetResult;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipUiModel;
import org.betup.ui.tour.Tour;
import org.betup.ui.tour.TourHelper;
import org.betup.ui.tour.TourHelperPosition;
import org.betup.ui.tour.TourHelperSign;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.utils.DialogManager;
import org.betup.utils.FormatHelper;
import org.betup.utils.SharedPrefs;
import org.betup.utils.SignInDialogManager;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.UiExtensionsKt;
import org.betup.utils.VarietyBetRestrictions;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import tourguide.tourguide.Overlay;

/* compiled from: BetsController.kt */
@Metadata(d1 = {"\u0000¶\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0094\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u00020\b:\u0002\u0094\u0003B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010é\u0001\u001a\u00030\u008e\u0001J\b\u0010ê\u0001\u001a\u00030\u008e\u0001J\u0012\u0010\u008a\u0002\u001a\u00030\u008e\u00012\b\u0010\u008b\u0002\u001a\u00030»\u0001J\u001c\u0010\u008c\u0002\u001a\u00030\u008e\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008d\u0002\u001a\u00030¬\u0001J\b\u0010\u008e\u0002\u001a\u00030Ã\u0001J\n\u0010\u008f\u0002\u001a\u00030\u008e\u0001H\u0002J\n\u0010\u0090\u0002\u001a\u00030\u008e\u0001H\u0002J\n\u0010\u0091\u0002\u001a\u00030\u008e\u0001H\u0002J\b\u0010\u0092\u0002\u001a\u00030\u008e\u0001J\b\u0010\u0093\u0002\u001a\u00030\u008e\u0001J\u0013\u0010\u0094\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¬\u00010§\u0001H\u0002J\f\u0010\u0095\u0002\u001a\u0005\u0018\u00010\u0096\u0002H\u0002J\b\u0010\u0097\u0002\u001a\u00030¬\u0001J\b\u0010\u0098\u0002\u001a\u00030Ã\u0001J\n\u0010\u0099\u0002\u001a\u00030\u008e\u0001H\u0002J\b\u0010\u009a\u0002\u001a\u00030¬\u0001J\u0014\u0010\u009b\u0002\u001a\u00030\u008d\u00012\b\u0010\u009c\u0002\u001a\u00030\u009d\u0002H\u0002J\u0014\u0010\u009e\u0002\u001a\u00030\u008d\u00012\b\u0010\u009c\u0002\u001a\u00030\u009d\u0002H\u0002J\u0014\u0010\u009f\u0002\u001a\u00030\u008e\u00012\b\u0010 \u0002\u001a\u00030\u008d\u0001H\u0002J\u0014\u0010¡\u0002\u001a\u00030\u008e\u00012\b\u0010 \u0002\u001a\u00030\u008d\u0001H\u0002J\n\u0010¢\u0002\u001a\u00030¬\u0001H\u0002J\u0014\u0010£\u0002\u001a\u00030Ã\u00012\b\u0010\u008d\u0002\u001a\u00030¬\u0001H\u0002J\u0016\u0010¤\u0002\u001a\u00030\u008e\u00012\n\b\u0002\u0010¥\u0002\u001a\u00030¬\u0001H\u0002JI\u0010¦\u0002\u001a\u00030\u008e\u00012\b\u0010§\u0002\u001a\u00030\u008a\u00012\u000f\u0010¨\u0002\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010¹\u00012\b\u0010©\u0002\u001a\u00030ª\u00022\u001a\b\u0002\u0010\u008b\u0001\u001a\u0013\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u008c\u0001J\u0014\u0010«\u0002\u001a\u00030\u008e\u00012\b\u0010 \u0002\u001a\u00030\u008d\u0001H\u0002J\u0014\u0010«\u0002\u001a\u00030\u008e\u00012\b\u0010¬\u0002\u001a\u00030»\u0001H\u0002J\u001e\u0010\u00ad\u0002\u001a\u00030\u008e\u00012\b\u0010 \u0002\u001a\u00030\u008d\u00012\b\u0010®\u0002\u001a\u00030Ã\u0001H\u0002J\u0012\u0010¯\u0002\u001a\u00030\u008e\u00012\b\u0010°\u0002\u001a\u00030»\u0001J\b\u0010±\u0002\u001a\u00030\u008e\u0001J\u0014\u0010·\u0002\u001a\u00030\u008e\u00012\b\u0010¸\u0002\u001a\u00030¹\u0002H\u0002J\b\u0010º\u0002\u001a\u00030\u008e\u0001J\b\u0010»\u0002\u001a\u00030\u008e\u0001J\u001c\u0010¼\u0002\u001a\u00030\u008e\u00012\f\b\u0002\u0010\u008b\u0002\u001a\u0005\u0018\u00010»\u0001¢\u0006\u0003\u0010½\u0002J\u001c\u0010¾\u0002\u001a\u00030É\u00012\n\u0010\u008b\u0002\u001a\u0005\u0018\u00010»\u0001H\u0002¢\u0006\u0003\u0010¿\u0002J\u0012\u0010À\u0002\u001a\u00030\u008e\u00012\b\u0010\u008b\u0002\u001a\u00030»\u0001J\u0014\u0010Á\u0002\u001a\u00030\u008e\u00012\b\u0010\u008b\u0002\u001a\u00030»\u0001H\u0002J\b\u0010Â\u0002\u001a\u00030\u008e\u0001J\b\u0010Ã\u0002\u001a\u00030Ã\u0001J\b\u0010Ä\u0002\u001a\u00030\u008e\u0001J\u0014\u0010Å\u0002\u001a\u00030\u008e\u00012\b\u0010Æ\u0002\u001a\u00030Ç\u0002H\u0016J \u0010È\u0002\u001a\u00030\u008e\u00012\n\u0010É\u0002\u001a\u0005\u0018\u00010Ê\u00022\b\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0016J\u001a\u0010Í\u0002\u001a\u00030\u008e\u00012\n\u0010Î\u0002\u001a\u0005\u0018\u00010¬\u0001¢\u0006\u0003\u0010Ï\u0002J\u001b\u0010Ð\u0002\u001a\u00030\u008e\u00012\u000f\u0010Ñ\u0002\u001a\n\u0012\u0005\u0012\u00030¨\u00010§\u0001H\u0002J\n\u0010Ò\u0002\u001a\u00030\u008e\u0001H\u0002J\b\u0010Ó\u0002\u001a\u00030\u008e\u0001J\n\u0010Ô\u0002\u001a\u00030\u008e\u0001H\u0002J\b\u0010Õ\u0002\u001a\u00030\u008e\u0001J'\u0010Ö\u0002\u001a\u00030Ã\u00012\u000f\u0010Ñ\u0002\u001a\n\u0012\u0005\u0012\u00030×\u00020§\u00012\n\b\u0002\u0010Ø\u0002\u001a\u00030Ã\u0001H\u0002J\b\u0010Ù\u0002\u001a\u00030\u008e\u0001J\b\u0010Ú\u0002\u001a\u00030\u008e\u0001J\u0012\u0010Û\u0002\u001a\u00030\u008e\u00012\b\u0010Ü\u0002\u001a\u00030¬\u0001J\b\u0010Ý\u0002\u001a\u00030\u008e\u0001J(\u0010Þ\u0002\u001a\u00030\u008e\u00012\b\u0010ß\u0002\u001a\u00030¬\u00012\b\u0010à\u0002\u001a\u00030\u009d\u00022\n\u0010á\u0002\u001a\u0005\u0018\u00010\u009d\u0002J\b\u0010â\u0002\u001a\u00030\u008e\u0001J\b\u0010ã\u0002\u001a\u00030\u008e\u0001J\n\u0010ä\u0002\u001a\u00030\u008e\u0001H\u0002J\b\u0010å\u0002\u001a\u00030\u008e\u0001J\b\u0010æ\u0002\u001a\u00030\u008e\u0001J\u0012\u0010ç\u0002\u001a\u00030\u008e\u00012\b\u0010è\u0002\u001a\u00030¬\u0001J,\u0010é\u0002\u001a\u00030\u008e\u00012\b\u0010è\u0002\u001a\u00030¬\u00012\u0018\u0010ê\u0002\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010\u009d\u0002\u0012\u0005\u0012\u00030\u008e\u00010\u008c\u0001J;\u0010ë\u0002\u001a\u00030\u008e\u00012\b\u0010è\u0002\u001a\u00030¬\u00012\u000f\u0010ì\u0002\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010¹\u00012\u0016\u0010í\u0002\u001a\u0011\u0012\u0005\u0012\u00030»\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u008c\u0001JE\u0010î\u0002\u001a\u00030\u008e\u00012\b\u0010è\u0002\u001a\u00030¬\u00012\b\u0010ï\u0002\u001a\u00030Õ\u00012\u000f\u0010ì\u0002\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010¹\u00012\u0016\u0010í\u0002\u001a\u0011\u0012\u0005\u0012\u00030»\u0001\u0012\u0005\u0012\u00030\u008e\u00010\u008c\u0001J\"\u0010ð\u0002\u001a\u00030»\u00012\n\u0010ñ\u0002\u001a\u0005\u0018\u00010ò\u00022\n\u0010ó\u0002\u001a\u0005\u0018\u00010ô\u0002H\u0002J\b\u0010õ\u0002\u001a\u00030\u008e\u0001J&\u0010ö\u0002\u001a\u00030\u008e\u00012\u001a\u0010÷\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010ø\u0002H\u0016J\n\u0010ù\u0002\u001a\u00030\u008e\u0001H\u0002J\u0012\u0010ú\u0002\u001a\u00030\u008e\u00012\b\u0010ó\u0002\u001a\u00030û\u0002J\u0015\u0010ü\u0002\u001a\u00030\u008e\u00012\u000b\b\u0002\u0010ý\u0002\u001a\u0004\u0018\u00010\u0007J\n\u0010þ\u0002\u001a\u00030Ã\u0001H\u0016J\n\u0010ÿ\u0002\u001a\u00030\u008e\u0001H\u0016J\n\u0010\u0080\u0003\u001a\u00030\u008e\u0001H\u0016J\n\u0010\u0081\u0003\u001a\u00030\u008e\u0001H\u0016J5\u0010\u0082\u0003\u001a\u00030\u008e\u00012\n\u0010\u0083\u0003\u001a\u0005\u0018\u00010¡\u00012\u0011\u0010\u0084\u0003\u001a\f\u0012\u0005\u0012\u00030\u0086\u0003\u0018\u00010\u0085\u00032\n\u0010ñ\u0002\u001a\u0005\u0018\u00010ò\u0002H\u0016J\u0014\u0010\u0087\u0003\u001a\u00030×\u00022\b\u0010\u0088\u0003\u001a\u00030\u0089\u0003H\u0002J\u0014\u0010\u008a\u0003\u001a\u00030¹\u00022\b\u0010\u008b\u0003\u001a\u00030\u008c\u0003H\u0002J\u001c\u0010\u008d\u0003\u001a\u00030\u008e\u00012\b\u0010\u008e\u0003\u001a\u00030»\u00012\b\u0010\u008f\u0003\u001a\u00030\u0090\u0003J\b\u0010\u0091\u0003\u001a\u00030\u008e\u0001J\b\u0010\u0092\u0003\u001a\u00030\u008e\u0001J\b\u0010\u0093\u0003\u001a\u00030\u008e\u0001R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010G\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010M\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001e\u0010S\u001a\u00020T8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001e\u0010Y\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010_\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010e\u001a\u00020f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001e\u0010k\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001e\u0010q\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001e\u0010w\u001a\u00020x8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R!\u0010}\u001a\u00020~8\u0006@\u0006X\u0087.¢\u0006\u0011\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010\u0083\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0012\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u008b\u0001\u001a\u0013\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0005\u0012\u00030\u008e\u0001\u0018\u00010\u008c\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0086.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0010\u0010\u0095\u0001\u001a\u00030\u0096\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0097\u0001\u001a\u00030\u0098\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010\u0099\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010 \u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¡\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010¢\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010£\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010¤\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¥\u00010\u009a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010¦\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¨\u00010§\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010©\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¨\u00010§\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010\u009f\u0001R\u0017\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010\u009f\u0001R\u0017\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010°\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010\u009f\u0001R\u0017\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010\u009f\u0001R\u0010\u0010µ\u0001\u001a\u00030¬\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010¶\u0001\u001a\u00030·\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010¹\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030»\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030»\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010\u009f\u0001R\u001e\u0010¾\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¿\u00010§\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010À\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¿\u00010§\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bÁ\u0001\u0010\u009f\u0001R\u0017\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Ä\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010\u009f\u0001R\u0017\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bÇ\u0001\u0010\u009f\u0001R\u0012\u0010È\u0001\u001a\u0005\u0018\u00010É\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Ê\u0001\u001a\u00030Ã\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Ë\u0001\u001a\u00030¬\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Ì\u0001\u001a\u0005\u0018\u00010Í\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Î\u0001\u001a\u00030¬\u0001X\u0082D¢\u0006\u0002\n\u0000R\u0015\u0010Ï\u0001\u001a\u0005\u0018\u00010»\u0001X\u0082\u000e¢\u0006\u0005\n\u0003\u0010Ð\u0001R\u0010\u0010Ñ\u0001\u001a\u00030Ã\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Ò\u0001\u001a\u00030Ã\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Ó\u0001\u001a\u00030Ã\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010\u009f\u0001R\u0017\u0010×\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010\u009f\u0001R\u0017\u0010Ù\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Ú\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bÚ\u0001\u0010\u009f\u0001R\u0017\u0010Û\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bÜ\u0001\u0010\u009f\u0001R\u0019\u0010Ý\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Þ\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010ß\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010Þ\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bà\u0001\u0010\u009f\u0001R\u0019\u0010á\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010â\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010ã\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010â\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bä\u0001\u0010\u009f\u0001R\u0019\u0010å\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010æ\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010ç\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010æ\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bè\u0001\u0010\u009f\u0001R\u0010\u0010ë\u0001\u001a\u00030»\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010ì\u0001\u001a\u00030Ã\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010í\u0001\u001a\u00030Ã\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010î\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ï\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bï\u0001\u0010\u009f\u0001R\u0017\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ñ\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bñ\u0001\u0010\u009f\u0001R\u0017\u0010ò\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010ó\u0001\u001a\n\u0012\u0005\u0012\u00030Ã\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bô\u0001\u0010\u009f\u0001R\u001e\u0010õ\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ö\u00010§\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010÷\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030ö\u00010§\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bø\u0001\u0010\u009f\u0001R\u0016\u0010ù\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u009a\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010ú\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bû\u0001\u0010\u009f\u0001R\u0019\u0010ü\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ý\u00010\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010þ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ý\u00010\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\bÿ\u0001\u0010\u009f\u0001R\u0019\u0010\u0080\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00020\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0082\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00020\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0002\u0010\u009f\u0001R\u0019\u0010\u0084\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00020\u009a\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0086\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00020\u009d\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0002\u0010\u009f\u0001R\u0010\u0010\u0088\u0002\u001a\u00030»\u0001X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0089\u0002\u001a\u00030»\u0001X\u0082D¢\u0006\u0002\n\u0000R\u001f\u0010²\u0002\u001a\u0012\u0012\u0005\u0012\u00030ý\u0001\u0012\u0007\u0012\u0005\u0018\u00010³\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010´\u0002\u001a\u0010\u0012\u0005\u0012\u00030µ\u0002\u0012\u0005\u0012\u00030¶\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010Ë\u0002\u001a\u0017\u0012\u0005\u0012\u00030Ì\u0002\u0012\f\u0012\n\u0012\u0005\u0012\u00030¬\u00010§\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0095\u0003"}, d2 = {"Lorg/betup/ui/fragment/bets/BetsController;", "Lorg/betup/ui/fragment/bets/BaseBettingController$FragmentCallback;", "Lorg/betup/ui/ProgressDisplay;", "Lorg/betup/services/billing/PurchaseCompletedListener;", "Lorg/betup/services/user/UserService$UserInfoListener;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsResponseModel;", "Lorg/betup/model/remote/entity/bets/BetState;", "Lorg/betup/services/offer/VideoRewardService$VideoRewardServiceClient;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "grabbedBetsInteractor", "Lorg/betup/model/remote/api/rest/betslip/V7GrabbedBetsInteractor;", "getGrabbedBetsInteractor", "()Lorg/betup/model/remote/api/rest/betslip/V7GrabbedBetsInteractor;", "setGrabbedBetsInteractor", "(Lorg/betup/model/remote/api/rest/betslip/V7GrabbedBetsInteractor;)V", "createBetlistInteractor", "Lorg/betup/model/remote/api/rest/betslip/V7CreateBetlistInteractor;", "getCreateBetlistInteractor", "()Lorg/betup/model/remote/api/rest/betslip/V7CreateBetlistInteractor;", "setCreateBetlistInteractor", "(Lorg/betup/model/remote/api/rest/betslip/V7CreateBetlistInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "singleShopInteractor", "Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "getSingleShopInteractor", "()Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "setSingleShopInteractor", "(Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "getBetListAppender", "()Lorg/betup/services/betlist/BetListAppender;", "setBetListAppender", "(Lorg/betup/services/betlist/BetListAppender;)V", "challengeTourInfoProvider", "Lorg/betup/services/challenge/ChallengeTourInfoProvider;", "getChallengeTourInfoProvider", "()Lorg/betup/services/challenge/ChallengeTourInfoProvider;", "setChallengeTourInfoProvider", "(Lorg/betup/services/challenge/ChallengeTourInfoProvider;)V", "betsListInteractor", "Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "getBetsListInteractor", "()Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;", "setBetsListInteractor", "(Lorg/betup/model/remote/api/rest/user/bets/BetsListInteractor;)V", "betsStatInteractor", "Lorg/betup/model/remote/api/rest/user/bets/BetStatInteractor;", "getBetsStatInteractor", "()Lorg/betup/model/remote/api/rest/user/bets/BetStatInteractor;", "setBetsStatInteractor", "(Lorg/betup/model/remote/api/rest/user/bets/BetStatInteractor;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "getCancelBetInfoInteractor", "Lorg/betup/model/remote/api/rest/shop/GetCancelBetInfoInteractor;", "getGetCancelBetInfoInteractor", "()Lorg/betup/model/remote/api/rest/shop/GetCancelBetInfoInteractor;", "setGetCancelBetInfoInteractor", "(Lorg/betup/model/remote/api/rest/shop/GetCancelBetInfoInteractor;)V", "getSellBetInfoInteractor", "Lorg/betup/model/remote/api/rest/shop/GetSellBetInfoInteractor;", "getGetSellBetInfoInteractor", "()Lorg/betup/model/remote/api/rest/shop/GetSellBetInfoInteractor;", "setGetSellBetInfoInteractor", "(Lorg/betup/model/remote/api/rest/shop/GetSellBetInfoInteractor;)V", "getBetShareInstallLinkInteractor", "Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;", "getGetBetShareInstallLinkInteractor", "()Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;", "setGetBetShareInstallLinkInteractor", "(Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;)V", "cancelBetInteractor", "Lorg/betup/model/remote/api/rest/shop/CancelBetInteractor;", "getCancelBetInteractor", "()Lorg/betup/model/remote/api/rest/shop/CancelBetInteractor;", "setCancelBetInteractor", "(Lorg/betup/model/remote/api/rest/shop/CancelBetInteractor;)V", "sellBetInteractor", "Lorg/betup/model/remote/api/rest/shop/SellBetInteractor;", "getSellBetInteractor", "()Lorg/betup/model/remote/api/rest/shop/SellBetInteractor;", "setSellBetInteractor", "(Lorg/betup/model/remote/api/rest/shop/SellBetInteractor;)V", "v7VarietyBetRestrictionsInteractor", "Lorg/betup/model/remote/api/rest/user/V7VarietyBetRestrictionsInteractor;", "getV7VarietyBetRestrictionsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7VarietyBetRestrictionsInteractor;", "setV7VarietyBetRestrictionsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7VarietyBetRestrictionsInteractor;)V", "v7VarietyVersionGatesInteractor", "Lorg/betup/model/remote/api/rest/user/V7VarietyVersionGatesInteractor;", "getV7VarietyVersionGatesInteractor", "()Lorg/betup/model/remote/api/rest/user/V7VarietyVersionGatesInteractor;", "setV7VarietyVersionGatesInteractor", "(Lorg/betup/model/remote/api/rest/user/V7VarietyVersionGatesInteractor;)V", "challengeCreateInteractor", "Lorg/betup/model/remote/api/rest/energy/NewChallengeCreateInteractor;", "getChallengeCreateInteractor", "()Lorg/betup/model/remote/api/rest/energy/NewChallengeCreateInteractor;", "setChallengeCreateInteractor", "(Lorg/betup/model/remote/api/rest/energy/NewChallengeCreateInteractor;)V", "activity", "Lorg/betup/ui/MainActivity;", "onShowMessage", "Lkotlin/Function1;", "", "", "tourHelper", "Lorg/betup/ui/tour/TourHelper;", "getTourHelper", "()Lorg/betup/ui/tour/TourHelper;", "setTourHelper", "(Lorg/betup/ui/tour/TourHelper;)V", "unlockBetAmountFlow", "Lorg/betup/services/billing/UnlockBetAmountFlow;", "unlockBetTypesFlow", "Lorg/betup/services/billing/UnlockBetTypesFlow;", "_oddType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/local/entity/OddType;", "oddType", "Lkotlinx/coroutines/flow/StateFlow;", "getOddType", "()Lkotlinx/coroutines/flow/StateFlow;", "profileModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "betDataModel", "Lorg/betup/model/remote/entity/betslip/GrabbedBetDataModel;", "ids", "", "_betsModel", "", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "betsModel", "getBetsModel", "_amount", "", "amount", "getAmount", "_userAmountFlow", "userAmountFlow", "getUserAmountFlow", "_highScore", "highScore", "getHighScore", "betLimit", "purchasePlacement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", "onDismiss", "Lkotlin/Function0;", "_selectedTabFlow", "", "selectedTabFlow", "getSelectedTabFlow", "_betsUiModel", "Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "betsUiModel", "getBetsUiModel", "_isBonusAvailable", "", "isBonusAvailable", "_videoRewardAmount", "videoRewardAmount", "getVideoRewardAmount", "lastCheckedPlacement", "Lorg/betup/services/offer/PromoService$PromoPlacement;", "skipBetWonCloseInterstitialOnDismiss", "lastCheckedReferencedValue", "videoRewardCheckJob", "Lkotlinx/coroutines/Job;", "VIDEO_REWARD_CHECK_INTERVAL", "lastCheckedBetId", "Ljava/lang/Integer;", "pendingOneClickAutoPlace", "oneClickAutoPlaceSession", "isRefreshingBetData", "totalCoefficientFlow", "", "getTotalCoefficientFlow", "_isLoadingBetSlip", "isLoadingBetSlip", "_isLoadingQickBetInfo", "isLoadingQickBetInfo", "_isFirstBetAvailable", "isFirstBetAvailable", "_battleOpponent", "Lorg/betup/ui/fragment/bets/BattleOpponent;", "battleOpponent", "getBattleOpponent", "_placeBetResult", "Lorg/betup/ui/fragment/bets/PlaceBetResult;", "placeBetResult", "getPlaceBetResult", "_battleCreateResult", "Lorg/betup/ui/fragment/bets/BattleCreateResult;", "battleCreateResult", "getBattleCreateResult", "clearPlaceBetResult", "clearBattleCreateResult", "currentOffset", AppLovinMediationProvider.MAX, "displayTour", "_isLoadingBetsHistory", "isLoadingBetsHistory", "_isLoadMoreHistoryBets", "isLoadMoreHistoryBets", "_hasMoreHistoryBets", "hasMoreHistoryBets", "getHasMoreHistoryBets", "_betList", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "betList", "getBetList", "_betFilterState", "betFilterState", "getBetFilterState", "_betStatus", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "betStatus", "getBetStatus", "_cancelBetInfo", "Lorg/betup/model/remote/entity/shop/CancelBetInfoModel;", "cancelBetInfo", "getCancelBetInfo", "_sellBetInfo", "Lorg/betup/model/remote/entity/shop/SellBetInfoModel;", "sellBetInfo", "getSellBetInfo", "DEFAULT_OFFSET_HISTORY_ITEMS", "DEFAULT_LIMIT_HISTORY_ITEMS", "showBetPlacedDialog", "betId", "startOneClickPlacementAfterBetAdded", "stake", "isOneClickPlacementInProgress", "cancelPendingOneClickPlacement", "openQuickBetSheetAfterOneClickPrepFailed", "hideProgressAfterGrabbedBetFetch", "refreshVarietyMinStakeConfig", "refreshVarietyBetRestrictionsConfig", "slipParamTIds", "primarySlipRestrictionRule", "Lorg/betup/model/remote/entity/user/VarietyBetRestrictionRuleModel;", "getPlayerStatsMinStakeBetcoins", "containsPlayerStatsBetInSlip", "markVarietyMinStakeRulesEverPlaced", "getEffectiveMinBetSize", "minStakeRequiredMessage", "minFormatted", "", "minStakeNotEnoughBalanceMessage", "showPlayerStatsMinStakeInfoDialog", "message", "notifyPlayerStatsMinStakeIssue", "currentUserBalanceBetcoins", "hasInsufficientBalanceForStake", "notifyNotEnoughBetcoinsVideoOffer", "oneClickQuickBetStakeBetcoins", "bind", "activityP", "onDismissP", "context", "Landroid/content/Context;", "showMessage", "stringResId", "showBetFeedback", "longOneClickStyle", "setNewBetsTab", "newBetState", "removeAllBetsClick", "betStatsListener", "Ljava/lang/Void;", "betslipAddListener", "Lorg/betup/model/remote/entity/betslip/V7BetlistPlacementResponse;", "Lorg/betup/model/remote/entity/betslip/V7CreateBetlistRequestModel;", "processBetPlaced", "betListModel", "Lorg/betup/model/remote/entity/betslip/BetListModel;", "syncBetslipFromStorage", "refreshBetData", "onVideoButtonClicked", "(Ljava/lang/Integer;)V", "determinePlacementForBet", "(Ljava/lang/Integer;)Lorg/betup/services/offer/PromoService$PromoPlacement;", "checkVideoRewardForBet", "schedulePeriodicVideoRewardCheck", "stopPeriodicVideoRewardCheck", "consumeSkipBetWonCloseInterstitial", "resetBetWonCloseInterstitialState", "onVideoRewardInfoUpdated", "info", "Lorg/betup/model/remote/entity/videoRewards/VideoRewardPlacementInfo;", "onVideoRewardRequestProcessed", "result", "Lorg/betup/services/offer/VideoRewardService$RewardedVideoResult;", "onGrabbetBetFetched", "Lorg/betup/model/remote/entity/betslip/V7GrabbedBetsResponse;", "onAmountChange", "amountNew", "(Ljava/lang/Long;)V", "updateBetDetails", "bets", "updateOddType", "onSettingsClick", "placeBetFunc", "onPlaceClick", "processBetChangesAndCheckForUpdates", "Lorg/betup/model/remote/entity/betslip/GrabbedBetModel;", "placeBetVerification", "removeAllBetsFromSlip", "removeInvalidBetsFromSlip", "singleBetRemoved", "graddebBetId", "inviteUserToBattleClick", "onBattleOpponentSelected", "id", "name", "photoUrl", "clearBattleOpponent", "challengeClick", "showUnlockMaxDialog", "buyBetcoinsInternal", "reloadBetsHistory", "fetchCancelSellInfo", "betlistId", "fetchBetShareInstallLink", "onResult", "cancelBet", "onSuccess", "onError", "sellBet", "sellCoefficient", "stringResForSellBetFailure", "stat", "Lorg/betup/model/remote/api/FetchStat;", "model", "Lorg/betup/model/remote/entity/shop/SellBetResultModel;", "loadBetsHistory", "onFetched", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "showTourIfAvailable", "onChildClick", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsDataModel;", "setFilterState", "selectedState", "isActive", "displayProgress", "hideProgress", "purchaseCompleted", "onProfileFetched", "fullUserProfileModel", "updated", "", "Lorg/betup/services/user/UserService$InfoKind;", "convertV7ToOldGrabbedBet", "v7Bet", "Lorg/betup/model/remote/entity/betslip/V7GrabbedBetDto;", "convertV7BetlistToLegacy", "v7Betlist", "Lorg/betup/model/remote/entity/betslip/V7BetlistCreatedDto;", "goToMatch", "betModelId", "state", "Lorg/betup/model/remote/entity/matches/MatchState;", "snapshotCoefficientsForArrowBaseline", "forceRefreshBetData", "forceRefreshBetDataSilent", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsController implements BaseBettingController.FragmentCallback, ProgressDisplay, PurchaseCompletedListener, UserService.UserInfoListener, BaseCachedSharedInteractor.OnFetchedListener<BetsResponseModel, BetState>, VideoRewardService.VideoRewardServiceClient {
    private static final int DEFAULT_MIN_BET_SIZE = 100;
    public static final long DEFAULT_MIN_CHALLENGE_SIZE = 500;
    public static final int ERROR_MIN_STAKE_PLAYER_STATS = 10;
    private final int DEFAULT_LIMIT_HISTORY_ITEMS;
    private final int DEFAULT_OFFSET_HISTORY_ITEMS;
    private final long VIDEO_REWARD_CHECK_INTERVAL;
    private final MutableStateFlow<Long> _amount;
    private final MutableStateFlow<BattleCreateResult> _battleCreateResult;
    private final MutableStateFlow<BattleOpponent> _battleOpponent;
    private MutableStateFlow<BetState> _betFilterState;
    private final MutableStateFlow<List<BetsListModel>> _betList;
    private final MutableStateFlow<NewUserBetStatisticsModel> _betStatus;
    private final MutableStateFlow<List<BetModel>> _betsModel;
    private final MutableStateFlow<List<BetSlipUiModel>> _betsUiModel;
    private final MutableStateFlow<CancelBetInfoModel> _cancelBetInfo;
    private final MutableStateFlow<Boolean> _hasMoreHistoryBets;
    private final MutableStateFlow<Long> _highScore;
    private final MutableStateFlow<Boolean> _isBonusAvailable;
    private final MutableStateFlow<Boolean> _isFirstBetAvailable;
    private final MutableStateFlow<Boolean> _isLoadMoreHistoryBets;
    private final MutableStateFlow<Boolean> _isLoadingBetSlip;
    private final MutableStateFlow<Boolean> _isLoadingBetsHistory;
    private final MutableStateFlow<Boolean> _isLoadingQickBetInfo;
    private final MutableStateFlow<OddType> _oddType;
    private final MutableStateFlow<PlaceBetResult> _placeBetResult;
    private final MutableStateFlow<Integer> _selectedTabFlow;
    private final MutableStateFlow<SellBetInfoModel> _sellBetInfo;
    private MutableStateFlow<Long> _userAmountFlow;
    private final MutableStateFlow<Long> _videoRewardAmount;
    private MainActivity activity;
    private final StateFlow<Long> amount;

    @Inject
    public AnalyticsService analyticsService;
    private final StateFlow<BattleCreateResult> battleCreateResult;
    private final StateFlow<BattleOpponent> battleOpponent;
    private final MutableStateFlow<GrabbedBetDataModel> betDataModel;
    private final StateFlow<BetState> betFilterState;
    private final long betLimit;
    private final StateFlow<List<BetsListModel>> betList;

    @Inject
    public BetListAppender betListAppender;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Void> betStatsListener;
    private final StateFlow<NewUserBetStatisticsModel> betStatus;

    @Inject
    public BetsListInteractor betsListInteractor;
    private final StateFlow<List<BetModel>> betsModel;

    @Inject
    public BetStatInteractor betsStatInteractor;
    private final StateFlow<List<BetSlipUiModel>> betsUiModel;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7BetlistPlacementResponse, V7CreateBetlistRequestModel> betslipAddListener;

    @Inject
    public BillingService billingService;
    private final StateFlow<CancelBetInfoModel> cancelBetInfo;

    @Inject
    public CancelBetInteractor cancelBetInteractor;

    @Inject
    public NewChallengeCreateInteractor challengeCreateInteractor;

    @Inject
    public ChallengeTourInfoProvider challengeTourInfoProvider;

    @Inject
    public V7CreateBetlistInteractor createBetlistInteractor;
    private int currentOffset;
    private boolean displayTour;

    @Inject
    public FirebaseRemoteConfig firebaseRemoteConfig;

    @Inject
    public GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor;

    @Inject
    public GetCancelBetInfoInteractor getCancelBetInfoInteractor;

    @Inject
    public GetSellBetInfoInteractor getSellBetInfoInteractor;

    @Inject
    public V7GrabbedBetsInteractor grabbedBetsInteractor;
    private final StateFlow<Boolean> hasMoreHistoryBets;
    private final StateFlow<Long> highScore;
    private MutableStateFlow<long[]> ids;
    private final StateFlow<Boolean> isBonusAvailable;
    private final StateFlow<Boolean> isFirstBetAvailable;
    private final StateFlow<Boolean> isLoadMoreHistoryBets;
    private final StateFlow<Boolean> isLoadingBetSlip;
    private final StateFlow<Boolean> isLoadingBetsHistory;
    private final StateFlow<Boolean> isLoadingQickBetInfo;
    private boolean isRefreshingBetData;
    private Integer lastCheckedBetId;
    private PromoService.PromoPlacement lastCheckedPlacement;
    private long lastCheckedReferencedValue;

    @Inject
    public LocalPreferencesService localPreferencesService;
    private boolean max;
    private final StateFlow<OddType> oddType;
    private Function0<Unit> onDismiss;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7GrabbedBetsResponse, List<Long>> onGrabbetBetFetched;
    private Function1<? super CharSequence, Unit> onShowMessage;
    private boolean oneClickAutoPlaceSession;
    private boolean pendingOneClickAutoPlace;
    private final StateFlow<PlaceBetResult> placeBetResult;
    private final MutableStateFlow<FullUserProfileModel> profileModel;
    private final PurchasePlacement purchasePlacement;
    private final StateFlow<Integer> selectedTabFlow;
    private final StateFlow<SellBetInfoModel> sellBetInfo;

    @Inject
    public SellBetInteractor sellBetInteractor;

    @Inject
    public NewSingleShopInteractor singleShopInteractor;
    private boolean skipBetWonCloseInterstitialOnDismiss;
    private final StateFlow<Double> totalCoefficientFlow;
    public TourHelper tourHelper;
    private UnlockBetAmountFlow unlockBetAmountFlow;
    private UnlockBetTypesFlow unlockBetTypesFlow;
    private final StateFlow<Long> userAmountFlow;

    @Inject
    public UserService userService;

    @Inject
    public V7VarietyBetRestrictionsInteractor v7VarietyBetRestrictionsInteractor;

    @Inject
    public V7VarietyVersionGatesInteractor v7VarietyVersionGatesInteractor;
    private final StateFlow<Long> videoRewardAmount;
    private Job videoRewardCheckJob;

    @Inject
    public VideoRewardService videoRewardService;
    public static final int $stable = 8;

    /* compiled from: BetsController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[PromoService.PromoPlacement.values().length];
            try {
                iArr[PromoService.PromoPlacement.BET_WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BetState.values().length];
            try {
                iArr2[BetState.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BetState.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VideoRewardService.RewardedVideoResult.values().length];
            try {
                iArr3[VideoRewardService.RewardedVideoResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[VideoRewardService.RewardedVideoResult.NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[VideoRewardService.RewardedVideoResult.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[VideoRewardService.RewardedVideoResult.BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BetModel.stat.values().length];
            try {
                iArr4[BetModel.stat.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[BetModel.stat.INCREASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[BetModel.stat.DECREASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[FetchStat.values().length];
            try {
                iArr5[FetchStat.NO_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[FetchStat.FAIL_AFTER_RETRIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[FetchStat.SERVER_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[FetchStat.NO_AUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[FetchStat.NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[FetchStat.NOT_ALLOWED.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[FetchStat.SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[FetchStat.INVALID.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    @Override // org.betup.ui.fragment.bets.BaseBettingController.FragmentCallback
    public boolean isActive() {
        return true;
    }

    public BetsController() {
        MutableStateFlow<OddType> MutableStateFlow = StateFlowKt.MutableStateFlow(OddType.DECIMAL);
        this._oddType = MutableStateFlow;
        this.oddType = FlowKt.asStateFlow(MutableStateFlow);
        this.profileModel = StateFlowKt.MutableStateFlow(null);
        this.betDataModel = StateFlowKt.MutableStateFlow(null);
        this.ids = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<List<BetModel>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betsModel = MutableStateFlow2;
        StateFlow<List<BetModel>> asStateFlow = FlowKt.asStateFlow(MutableStateFlow2);
        this.betsModel = asStateFlow;
        MutableStateFlow<Long> MutableStateFlow3 = StateFlowKt.MutableStateFlow(500L);
        this._amount = MutableStateFlow3;
        this.amount = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Long> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0L);
        this._userAmountFlow = MutableStateFlow4;
        this.userAmountFlow = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Long> MutableStateFlow5 = StateFlowKt.MutableStateFlow(0L);
        this._highScore = MutableStateFlow5;
        this.highScore = FlowKt.asStateFlow(MutableStateFlow5);
        this.betLimit = FirebaseRemoteConfig.getInstance().getLong(RemoteConfigConstants.MAX_BET_LIMIT);
        this.purchasePlacement = PurchasePlacement.BETSLIP;
        this.onDismiss = new Function0() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
        MutableStateFlow<Integer> MutableStateFlow6 = StateFlowKt.MutableStateFlow(0);
        this._selectedTabFlow = MutableStateFlow6;
        this.selectedTabFlow = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<List<BetSlipUiModel>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betsUiModel = MutableStateFlow7;
        this.betsUiModel = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(false);
        this._isBonusAvailable = MutableStateFlow8;
        this.isBonusAvailable = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Long> MutableStateFlow9 = StateFlowKt.MutableStateFlow(0L);
        this._videoRewardAmount = MutableStateFlow9;
        this.videoRewardAmount = FlowKt.asStateFlow(MutableStateFlow9);
        this.VIDEO_REWARD_CHECK_INTERVAL = 5000L;
        final StateFlow<List<BetModel>> stateFlow = asStateFlow;
        this.totalCoefficientFlow = FlowKt.stateIn(new Flow<Double>() { // from class: org.betup.ui.fragment.bets.BetsController$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Double> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: org.betup.ui.fragment.bets.BetsController$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "org.betup.ui.fragment.bets.BetsController$special$$inlined$map$1$2", f = "BetsController.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: org.betup.ui.fragment.bets.BetsController$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    double d;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                List list = (List) obj;
                                if (list.isEmpty()) {
                                    d = 0.0d;
                                } else if (list.size() == 1) {
                                    d = ((BetModel) CollectionsKt.first(list)).getBet().getGrabbedCoeficient();
                                } else {
                                    Iterator<T> it = list.iterator();
                                    d = 1.0d;
                                    while (it.hasNext()) {
                                        d *= ((BetModel) it.next()).getBet().getGrabbedCoeficient();
                                    }
                                }
                                Double boxDouble = Boxing.boxDouble(d);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boxDouble, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }, CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), Double.valueOf(0.0d));
        MutableStateFlow<Boolean> MutableStateFlow10 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingBetSlip = MutableStateFlow10;
        this.isLoadingBetSlip = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Boolean> MutableStateFlow11 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingQickBetInfo = MutableStateFlow11;
        this.isLoadingQickBetInfo = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<Boolean> MutableStateFlow12 = StateFlowKt.MutableStateFlow(false);
        this._isFirstBetAvailable = MutableStateFlow12;
        this.isFirstBetAvailable = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<BattleOpponent> MutableStateFlow13 = StateFlowKt.MutableStateFlow(null);
        this._battleOpponent = MutableStateFlow13;
        this.battleOpponent = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<PlaceBetResult> MutableStateFlow14 = StateFlowKt.MutableStateFlow(null);
        this._placeBetResult = MutableStateFlow14;
        this.placeBetResult = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<BattleCreateResult> MutableStateFlow15 = StateFlowKt.MutableStateFlow(null);
        this._battleCreateResult = MutableStateFlow15;
        this.battleCreateResult = FlowKt.asStateFlow(MutableStateFlow15);
        MutableStateFlow<Boolean> MutableStateFlow16 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingBetsHistory = MutableStateFlow16;
        this.isLoadingBetsHistory = FlowKt.asStateFlow(MutableStateFlow16);
        MutableStateFlow<Boolean> MutableStateFlow17 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreHistoryBets = MutableStateFlow17;
        this.isLoadMoreHistoryBets = FlowKt.asStateFlow(MutableStateFlow17);
        MutableStateFlow<Boolean> MutableStateFlow18 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreHistoryBets = MutableStateFlow18;
        this.hasMoreHistoryBets = FlowKt.asStateFlow(MutableStateFlow18);
        MutableStateFlow<List<BetsListModel>> MutableStateFlow19 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._betList = MutableStateFlow19;
        this.betList = FlowKt.asStateFlow(MutableStateFlow19);
        MutableStateFlow<BetState> MutableStateFlow20 = StateFlowKt.MutableStateFlow(BetState.ALL);
        this._betFilterState = MutableStateFlow20;
        this.betFilterState = FlowKt.asStateFlow(MutableStateFlow20);
        MutableStateFlow<NewUserBetStatisticsModel> MutableStateFlow21 = StateFlowKt.MutableStateFlow(null);
        this._betStatus = MutableStateFlow21;
        this.betStatus = FlowKt.asStateFlow(MutableStateFlow21);
        MutableStateFlow<CancelBetInfoModel> MutableStateFlow22 = StateFlowKt.MutableStateFlow(null);
        this._cancelBetInfo = MutableStateFlow22;
        this.cancelBetInfo = FlowKt.asStateFlow(MutableStateFlow22);
        MutableStateFlow<SellBetInfoModel> MutableStateFlow23 = StateFlowKt.MutableStateFlow(null);
        this._sellBetInfo = MutableStateFlow23;
        this.sellBetInfo = FlowKt.asStateFlow(MutableStateFlow23);
        this.DEFAULT_LIMIT_HISTORY_ITEMS = 15;
        this.betStatsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda13
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetsController.betStatsListener$lambda$12(BetsController.this, fetchedResponseMessage);
            }
        };
        this.betslipAddListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda14
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetsController.betslipAddListener$lambda$22(BetsController.this, fetchedResponseMessage);
            }
        };
        this.onGrabbetBetFetched = new BetsController$onGrabbetBetFetched$1(this);
    }

    public final V7GrabbedBetsInteractor getGrabbedBetsInteractor() {
        V7GrabbedBetsInteractor v7GrabbedBetsInteractor = this.grabbedBetsInteractor;
        if (v7GrabbedBetsInteractor != null) {
            return v7GrabbedBetsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("grabbedBetsInteractor");
        return null;
    }

    public final void setGrabbedBetsInteractor(V7GrabbedBetsInteractor v7GrabbedBetsInteractor) {
        Intrinsics.checkNotNullParameter(v7GrabbedBetsInteractor, "<set-?>");
        this.grabbedBetsInteractor = v7GrabbedBetsInteractor;
    }

    public final V7CreateBetlistInteractor getCreateBetlistInteractor() {
        V7CreateBetlistInteractor v7CreateBetlistInteractor = this.createBetlistInteractor;
        if (v7CreateBetlistInteractor != null) {
            return v7CreateBetlistInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createBetlistInteractor");
        return null;
    }

    public final void setCreateBetlistInteractor(V7CreateBetlistInteractor v7CreateBetlistInteractor) {
        Intrinsics.checkNotNullParameter(v7CreateBetlistInteractor, "<set-?>");
        this.createBetlistInteractor = v7CreateBetlistInteractor;
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

    public final ChallengeTourInfoProvider getChallengeTourInfoProvider() {
        ChallengeTourInfoProvider challengeTourInfoProvider = this.challengeTourInfoProvider;
        if (challengeTourInfoProvider != null) {
            return challengeTourInfoProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challengeTourInfoProvider");
        return null;
    }

    public final void setChallengeTourInfoProvider(ChallengeTourInfoProvider challengeTourInfoProvider) {
        Intrinsics.checkNotNullParameter(challengeTourInfoProvider, "<set-?>");
        this.challengeTourInfoProvider = challengeTourInfoProvider;
    }

    public final BetsListInteractor getBetsListInteractor() {
        BetsListInteractor betsListInteractor = this.betsListInteractor;
        if (betsListInteractor != null) {
            return betsListInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsListInteractor");
        return null;
    }

    public final void setBetsListInteractor(BetsListInteractor betsListInteractor) {
        Intrinsics.checkNotNullParameter(betsListInteractor, "<set-?>");
        this.betsListInteractor = betsListInteractor;
    }

    public final BetStatInteractor getBetsStatInteractor() {
        BetStatInteractor betStatInteractor = this.betsStatInteractor;
        if (betStatInteractor != null) {
            return betStatInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("betsStatInteractor");
        return null;
    }

    public final void setBetsStatInteractor(BetStatInteractor betStatInteractor) {
        Intrinsics.checkNotNullParameter(betStatInteractor, "<set-?>");
        this.betsStatInteractor = betStatInteractor;
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

    public final GetCancelBetInfoInteractor getGetCancelBetInfoInteractor() {
        GetCancelBetInfoInteractor getCancelBetInfoInteractor = this.getCancelBetInfoInteractor;
        if (getCancelBetInfoInteractor != null) {
            return getCancelBetInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getCancelBetInfoInteractor");
        return null;
    }

    public final void setGetCancelBetInfoInteractor(GetCancelBetInfoInteractor getCancelBetInfoInteractor) {
        Intrinsics.checkNotNullParameter(getCancelBetInfoInteractor, "<set-?>");
        this.getCancelBetInfoInteractor = getCancelBetInfoInteractor;
    }

    public final GetSellBetInfoInteractor getGetSellBetInfoInteractor() {
        GetSellBetInfoInteractor getSellBetInfoInteractor = this.getSellBetInfoInteractor;
        if (getSellBetInfoInteractor != null) {
            return getSellBetInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getSellBetInfoInteractor");
        return null;
    }

    public final void setGetSellBetInfoInteractor(GetSellBetInfoInteractor getSellBetInfoInteractor) {
        Intrinsics.checkNotNullParameter(getSellBetInfoInteractor, "<set-?>");
        this.getSellBetInfoInteractor = getSellBetInfoInteractor;
    }

    public final GetBetShareInstallLinkInteractor getGetBetShareInstallLinkInteractor() {
        GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor = this.getBetShareInstallLinkInteractor;
        if (getBetShareInstallLinkInteractor != null) {
            return getBetShareInstallLinkInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getBetShareInstallLinkInteractor");
        return null;
    }

    public final void setGetBetShareInstallLinkInteractor(GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor) {
        Intrinsics.checkNotNullParameter(getBetShareInstallLinkInteractor, "<set-?>");
        this.getBetShareInstallLinkInteractor = getBetShareInstallLinkInteractor;
    }

    public final CancelBetInteractor getCancelBetInteractor() {
        CancelBetInteractor cancelBetInteractor = this.cancelBetInteractor;
        if (cancelBetInteractor != null) {
            return cancelBetInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cancelBetInteractor");
        return null;
    }

    public final void setCancelBetInteractor(CancelBetInteractor cancelBetInteractor) {
        Intrinsics.checkNotNullParameter(cancelBetInteractor, "<set-?>");
        this.cancelBetInteractor = cancelBetInteractor;
    }

    public final SellBetInteractor getSellBetInteractor() {
        SellBetInteractor sellBetInteractor = this.sellBetInteractor;
        if (sellBetInteractor != null) {
            return sellBetInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sellBetInteractor");
        return null;
    }

    public final void setSellBetInteractor(SellBetInteractor sellBetInteractor) {
        Intrinsics.checkNotNullParameter(sellBetInteractor, "<set-?>");
        this.sellBetInteractor = sellBetInteractor;
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

    public final NewChallengeCreateInteractor getChallengeCreateInteractor() {
        NewChallengeCreateInteractor newChallengeCreateInteractor = this.challengeCreateInteractor;
        if (newChallengeCreateInteractor != null) {
            return newChallengeCreateInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("challengeCreateInteractor");
        return null;
    }

    public final void setChallengeCreateInteractor(NewChallengeCreateInteractor newChallengeCreateInteractor) {
        Intrinsics.checkNotNullParameter(newChallengeCreateInteractor, "<set-?>");
        this.challengeCreateInteractor = newChallengeCreateInteractor;
    }

    public final TourHelper getTourHelper() {
        TourHelper tourHelper = this.tourHelper;
        if (tourHelper != null) {
            return tourHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tourHelper");
        return null;
    }

    public final void setTourHelper(TourHelper tourHelper) {
        Intrinsics.checkNotNullParameter(tourHelper, "<set-?>");
        this.tourHelper = tourHelper;
    }

    public final StateFlow<OddType> getOddType() {
        return this.oddType;
    }

    public final StateFlow<List<BetModel>> getBetsModel() {
        return this.betsModel;
    }

    public final StateFlow<Long> getAmount() {
        return this.amount;
    }

    public final StateFlow<Long> getUserAmountFlow() {
        return this.userAmountFlow;
    }

    public final StateFlow<Long> getHighScore() {
        return this.highScore;
    }

    public final StateFlow<Integer> getSelectedTabFlow() {
        return this.selectedTabFlow;
    }

    public final StateFlow<List<BetSlipUiModel>> getBetsUiModel() {
        return this.betsUiModel;
    }

    public final StateFlow<Boolean> isBonusAvailable() {
        return this.isBonusAvailable;
    }

    public final StateFlow<Long> getVideoRewardAmount() {
        return this.videoRewardAmount;
    }

    public final StateFlow<Double> getTotalCoefficientFlow() {
        return this.totalCoefficientFlow;
    }

    public final StateFlow<Boolean> isLoadingBetSlip() {
        return this.isLoadingBetSlip;
    }

    public final StateFlow<Boolean> isLoadingQickBetInfo() {
        return this.isLoadingQickBetInfo;
    }

    public final StateFlow<Boolean> isFirstBetAvailable() {
        return this.isFirstBetAvailable;
    }

    public final StateFlow<BattleOpponent> getBattleOpponent() {
        return this.battleOpponent;
    }

    public final StateFlow<PlaceBetResult> getPlaceBetResult() {
        return this.placeBetResult;
    }

    public final StateFlow<BattleCreateResult> getBattleCreateResult() {
        return this.battleCreateResult;
    }

    public final void clearPlaceBetResult() {
        this._placeBetResult.setValue(null);
    }

    public final void clearBattleCreateResult() {
        this._battleCreateResult.setValue(null);
    }

    public final StateFlow<Boolean> isLoadingBetsHistory() {
        return this.isLoadingBetsHistory;
    }

    public final StateFlow<Boolean> isLoadMoreHistoryBets() {
        return this.isLoadMoreHistoryBets;
    }

    public final StateFlow<Boolean> getHasMoreHistoryBets() {
        return this.hasMoreHistoryBets;
    }

    public final StateFlow<List<BetsListModel>> getBetList() {
        return this.betList;
    }

    public final StateFlow<BetState> getBetFilterState() {
        return this.betFilterState;
    }

    public final StateFlow<NewUserBetStatisticsModel> getBetStatus() {
        return this.betStatus;
    }

    public final StateFlow<CancelBetInfoModel> getCancelBetInfo() {
        return this.cancelBetInfo;
    }

    public final StateFlow<SellBetInfoModel> getSellBetInfo() {
        return this.sellBetInfo;
    }

    public final void showBetPlacedDialog(int betId) {
        MainActivity mainActivity = this.activity;
        if (mainActivity != null) {
            DialogManager.showDialogSafely(BetPlacedDialog.INSTANCE.newInstance(betId), mainActivity, "BetPlacedDialog");
        }
    }

    public final void startOneClickPlacementAfterBetAdded(final MainActivity activity, long stake) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.oneClickAutoPlaceSession = true;
        if (this.activity == null) {
            bind(activity, new Function0() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, activity, new Function1() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit startOneClickPlacementAfterBetAdded$lambda$5;
                    startOneClickPlacementAfterBetAdded$lambda$5 = BetsController.startOneClickPlacementAfterBetAdded$lambda$5(MainActivity.this, (CharSequence) obj);
                    return startOneClickPlacementAfterBetAdded$lambda$5;
                }
            });
        }
        this.pendingOneClickAutoPlace = true;
        syncBetslipFromStorage();
        onAmountChange(Long.valueOf(RangesKt.coerceAtLeast(stake, getEffectiveMinBetSize())));
        displayProgress();
        forceRefreshBetDataSilent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startOneClickPlacementAfterBetAdded$lambda$5(MainActivity mainActivity, CharSequence msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        SnackbarHelper.showWithDuration(mainActivity, msg, 5000L);
        return Unit.INSTANCE;
    }

    public final boolean isOneClickPlacementInProgress() {
        return this.pendingOneClickAutoPlace || this.oneClickAutoPlaceSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelPendingOneClickPlacement() {
        this.pendingOneClickAutoPlace = false;
        this.oneClickAutoPlaceSession = false;
    }

    private final void openQuickBetSheetAfterOneClickPrepFailed() {
        this.oneClickAutoPlaceSession = false;
        this.pendingOneClickAutoPlace = false;
        syncBetslipFromStorage();
        EventBus.getDefault().post(new BettingSheetStateMessage(BettingSheetStateMessage.State.SHOW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideProgressAfterGrabbedBetFetch() {
        if (!this.pendingOneClickAutoPlace) {
            hideProgress();
            return;
        }
        boolean z = this.oneClickAutoPlaceSession;
        if (this.profileModel.getValue() == null) {
            Log.d("FirstBetFlow", "One-click: coefficients ready, waiting for profile");
            return;
        }
        if (this.betDataModel.getValue() == null) {
            Log.d("FirstBetFlow", "One-click: profile ready, refreshing coefficients");
            if (this.isRefreshingBetData) {
                return;
            }
            forceRefreshBetDataSilent();
            return;
        }
        this.pendingOneClickAutoPlace = false;
        List<BetModel> value = this.betsModel.getValue();
        if (!value.isEmpty()) {
            List<BetModel> list = value;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (BetModel betModel : list) {
                    if (!betModel.isDeleted() && betModel.isAvailable()) {
                    }
                }
            }
            hideProgress();
            placeBetFunc();
            return;
        }
        hideProgress();
        MainActivity mainActivity = this.activity;
        List<BetModel> list2 = value;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((BetModel) it.next()).isDeleted()) {
                    if (z && mainActivity != null) {
                        String string = mainActivity.getString(R.string.one_click_bet_prep_failed_removed);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        showBetFeedback(string, true);
                        openQuickBetSheetAfterOneClickPrepFailed();
                        return;
                    }
                    this.oneClickAutoPlaceSession = false;
                    showMessage(R.string.bet_removed);
                    return;
                }
            }
        }
        if (value.isEmpty()) {
            if (z) {
                openQuickBetSheetAfterOneClickPrepFailed();
                return;
            } else {
                this.oneClickAutoPlaceSession = false;
                return;
            }
        }
        if (z && mainActivity != null) {
            String string2 = mainActivity.getString(R.string.one_click_bet_prep_failed_unavailable);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            showBetFeedback(string2, true);
            openQuickBetSheetAfterOneClickPrepFailed();
            return;
        }
        this.oneClickAutoPlaceSession = false;
        showMessage(R.string.bet_not_available);
    }

    public final void refreshVarietyMinStakeConfig() {
        refreshVarietyBetRestrictionsConfig();
    }

    public final void refreshVarietyBetRestrictionsConfig() {
        if (this.activity == null) {
            return;
        }
        getV7VarietyVersionGatesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<VarietyVersionGatesConfigModel, Void>() { // from class: org.betup.ui.fragment.bets.BetsController$refreshVarietyBetRestrictionsConfig$1
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
        getV7VarietyBetRestrictionsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<VarietyBetRestrictionsConfigModel, Void>() { // from class: org.betup.ui.fragment.bets.BetsController$refreshVarietyBetRestrictionsConfig$2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<VarietyBetRestrictionsConfigModel, Void> responseMessage) {
                Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
                if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
                    VarietyBetRestrictions.INSTANCE.setConfig(responseMessage.getModel());
                } else {
                    VarietyBetRestrictions.INSTANCE.setConfig(null);
                }
            }
        }, null);
    }

    private final List<Long> slipParamTIds() {
        SubMatchModel subMatch;
        List<BetModel> value = this.betsModel.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            MatchDetailsBetDataModel bet = ((BetModel) it.next()).getBet();
            Long l = null;
            if (bet != null && (subMatch = bet.getSubMatch()) != null) {
                Long valueOf = Long.valueOf(subMatch.getParamTId());
                if (valueOf.longValue() > 0) {
                    l = valueOf;
                }
            }
            arrayList.add(l);
        }
        return arrayList;
    }

    private final VarietyBetRestrictionRuleModel primarySlipRestrictionRule() {
        Iterator<T> it = slipParamTIds().iterator();
        while (it.hasNext()) {
            VarietyBetRestrictionRuleModel findMatchingRule = VarietyBetRestrictions.INSTANCE.findMatchingRule((Long) it.next());
            if (findMatchingRule != null) {
                return findMatchingRule;
            }
        }
        return null;
    }

    public final long getPlayerStatsMinStakeBetcoins() {
        return VarietyBetRestrictions.INSTANCE.maxMinStakeForSlip(slipParamTIds());
    }

    public final boolean containsPlayerStatsBetInSlip() {
        return VarietyBetRestrictions.INSTANCE.slipHasRestrictedBet(slipParamTIds());
    }

    private final void markVarietyMinStakeRulesEverPlaced() {
        String id;
        if (VarietyBetRestrictions.INSTANCE.slipHasRestrictedBet(slipParamTIds())) {
            long betupUserIdOrZero = getUserService().getBetupUserIdOrZero();
            if (betupUserIdOrZero <= 0) {
                return;
            }
            Iterator<T> it = slipParamTIds().iterator();
            while (it.hasNext()) {
                VarietyBetRestrictionRuleModel findMatchingRule = VarietyBetRestrictions.INSTANCE.findMatchingRule((Long) it.next());
                if (findMatchingRule != null && (id = findMatchingRule.getId()) != null) {
                    getLocalPreferencesService().setVarietyMinStakeBetEverPlaced(betupUserIdOrZero, id);
                }
            }
        }
    }

    public final long getEffectiveMinBetSize() {
        long maxMinStakeForSlip = VarietyBetRestrictions.INSTANCE.maxMinStakeForSlip(slipParamTIds());
        if (maxMinStakeForSlip > 0) {
            return VarietyBetRestrictions.INSTANCE.effectiveMinStake(100L, true, maxMinStakeForSlip);
        }
        return 100L;
    }

    private final CharSequence minStakeRequiredMessage(String minFormatted) {
        MainActivity mainActivity = this.activity;
        if (mainActivity == null) {
            return "";
        }
        VarietyBetRestrictionRuleModel primarySlipRestrictionRule = primarySlipRestrictionRule();
        return VarietyBetRestrictions.INSTANCE.minStakeRequiredMessage(mainActivity, primarySlipRestrictionRule != null ? primarySlipRestrictionRule.getId() : null, minFormatted);
    }

    private final CharSequence minStakeNotEnoughBalanceMessage(String minFormatted) {
        MainActivity mainActivity = this.activity;
        if (mainActivity == null) {
            return "";
        }
        VarietyBetRestrictionRuleModel primarySlipRestrictionRule = primarySlipRestrictionRule();
        return VarietyBetRestrictions.INSTANCE.minStakeNotEnoughBalanceMessage(mainActivity, primarySlipRestrictionRule != null ? primarySlipRestrictionRule.getId() : null, minFormatted);
    }

    private final void showPlayerStatsMinStakeInfoDialog(CharSequence message) {
        MainActivity mainActivity = this.activity;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null) {
            return;
        }
        PlayerStatsMinStakeComposeDialogFragment.INSTANCE.show(mainActivity2, message);
    }

    private final void notifyPlayerStatsMinStakeIssue(CharSequence message) {
        showMessage(message);
        showPlayerStatsMinStakeInfoDialog(message);
    }

    private final long currentUserBalanceBetcoins() {
        UserProgressModel userProgressModel;
        FullUserProfileModel value = this.profileModel.getValue();
        return (value == null || (userProgressModel = value.getUserProgressModel()) == null) ? this._userAmountFlow.getValue().longValue() : userProgressModel.getMoneyBalance();
    }

    private final boolean hasInsufficientBalanceForStake(long stake) {
        return currentUserBalanceBetcoins() < stake;
    }

    static /* synthetic */ void notifyNotEnoughBetcoinsVideoOffer$default(BetsController betsController, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        betsController.notifyNotEnoughBetcoinsVideoOffer(j);
    }

    private final void notifyNotEnoughBetcoinsVideoOffer(long oneClickQuickBetStakeBetcoins) {
        this._placeBetResult.setValue(null);
        EventBus.getDefault().post(new ShowNotEnoughBetcoinsVideoOfferMessage(oneClickQuickBetStakeBetcoins));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(BetsController betsController, MainActivity mainActivity, Function0 function0, Context context, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        betsController.bind(mainActivity, function0, context, function1);
    }

    public final void bind(MainActivity activityP, Function0<Unit> onDismissP, Context context, Function1<? super CharSequence, Unit> onShowMessage) {
        long longValue;
        Intrinsics.checkNotNullParameter(activityP, "activityP");
        Intrinsics.checkNotNullParameter(onDismissP, "onDismissP");
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        this.activity = activityP;
        this.onDismiss = onDismissP;
        this.onShowMessage = onShowMessage;
        Intrinsics.checkNotNull(activityP, "null cannot be cast to non-null type org.betup.ui.tour.TourHelper");
        setTourHelper(activityP);
        updateOddType();
        MutableStateFlow<Long> mutableStateFlow = this._amount;
        if (SharedPrefs.isSelectedDefaultsBetsAmounts(this.activity)) {
            longValue = 100;
        } else {
            Long customBetAmount = SharedPrefs.getCustomBetAmount(this.activity);
            Intrinsics.checkNotNull(customBetAmount);
            longValue = customBetAmount.longValue();
        }
        mutableStateFlow.setValue(Long.valueOf(longValue));
        ArrayList<BetModel> betslip = SharedPrefs.getBetslip(this.activity);
        Intrinsics.checkNotNullExpressionValue(betslip, "getBetslip(...)");
        updateBetDetails(betslip);
        getUserService().getProfile(this, UserService.InfoKind.GENERAL, UserService.InfoKind.PROGRESS, UserService.InfoKind.STATS);
        BetsController betsController = this;
        this.unlockBetAmountFlow = new UnlockBetAmountFlow(this.activity, getBillingService(), getFirebaseRemoteConfig(), getSingleShopInteractor(), betsController, this.purchasePlacement, getAnalyticsService(), getUserService());
        this.unlockBetTypesFlow = new UnlockBetTypesFlow(this.activity, getBillingService(), getFirebaseRemoteConfig(), getSingleShopInteractor(), betsController, this.purchasePlacement, getAnalyticsService(), getUserService(), getVideoRewardService());
        this._selectedTabFlow.setValue(Integer.valueOf(SharedPrefs.getBetslip(this.activity).isEmpty() ? 1 : 0));
        refreshVarietyBetRestrictionsConfig();
    }

    private final void showMessage(CharSequence message) {
        Function1<? super CharSequence, Unit> function1 = this.onShowMessage;
        if (function1 != null) {
            function1.invoke(message);
        } else {
            SnackbarHelper.showShort(this.activity, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(int stringResId) {
        String string;
        MainActivity mainActivity = this.activity;
        if (mainActivity == null || (string = mainActivity.getString(stringResId)) == null) {
            return;
        }
        showMessage(string);
    }

    private final void showBetFeedback(CharSequence message, boolean longOneClickStyle) {
        if (longOneClickStyle) {
            MainActivity mainActivity = this.activity;
            if (mainActivity != null) {
                SnackbarHelper.showWithDuration(mainActivity, message, 5000L);
                return;
            } else {
                showMessage(message);
                return;
            }
        }
        showMessage(message);
    }

    public final void setNewBetsTab(int newBetState) {
        this._selectedTabFlow.setValue(Integer.valueOf(newBetState));
    }

    public final void removeAllBetsClick() {
        this.onDismiss.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void betStatsListener$lambda$12(BetsController betsController, FetchedResponseMessage fetchedResponseMessage) {
        if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || fetchedResponseMessage == null) {
            return;
        }
        betsController._betStatus.setValue(fetchedResponseMessage.getModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ab, code lost:
    
        if (r6.intValue() != 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b5, code lost:
    
        r0 = (org.betup.ui.fragment.bets.betslip.adapter.model.BetModel) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) r16.betsModel.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01bb, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01bd, code lost:
    
        r0 = r0.getMatch();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c1, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c3, code lost:
    
        r0 = r0.getLeague();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01c7, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c9, code lost:
    
        r0 = r0.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01cd, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01cf, code lost:
    
        java.lang.Integer.valueOf(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d8, code lost:
    
        android.util.Log.e("BETSLIPTEST", "Error getting leagueId from bet: " + r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01a1, code lost:
    
        if (r6.intValue() != 4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02d0, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02d2, code lost:
    
        r4 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d8, code lost:
    
        r0 = r0.getString(org.betup.R.string.one_click_bet_err_code_detail, new java.lang.Object[]{java.lang.Integer.valueOf(r4)});
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "getString(...)");
        r16.showBetFeedback(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d7, code lost:
    
        r4 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void betslipAddListener$lambda$22(BetsController betsController, FetchedResponseMessage fetchedResponseMessage) {
        boolean z = betsController.oneClickAutoPlaceSession;
        try {
            try {
                Log.d("BETSLIPTEST", "FetchStat: " + fetchedResponseMessage.getStat());
            } catch (Exception e) {
                betsController._placeBetResult.setValue(PlaceBetResult.Error.INSTANCE);
                Log.e("BETSLIPTEST", "Critical error in betslipAddListener: " + e.getMessage(), e);
                MainActivity mainActivity = betsController.activity;
                if (mainActivity != null) {
                    if (z) {
                        String string = mainActivity.getString(R.string.one_click_bet_place_critical_detail);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        betsController.showBetFeedback(string, true);
                    } else {
                        betsController.showMessage(R.string.error);
                    }
                }
            }
            if (fetchedResponseMessage.getStat() == FetchStat.SERVER_DOWN) {
                betsController._placeBetResult.setValue(PlaceBetResult.Error.INSTANCE);
                Log.e("BETSLIPTEST", "Server is down, showing toast instead of dialog");
                MainActivity mainActivity2 = betsController.activity;
                if (mainActivity2 != null) {
                    if (z) {
                        String string2 = mainActivity2.getString(R.string.one_click_bet_place_server_down);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        betsController.showBetFeedback(string2, true);
                    } else {
                        betsController.showMessage(R.string.works_in_progress);
                    }
                }
                return;
            }
            if (fetchedResponseMessage.getStat() == FetchStat.NO_CONNECTION) {
                betsController._placeBetResult.setValue(PlaceBetResult.Error.INSTANCE);
                Log.e("BETSLIPTEST", "No connection");
                MainActivity mainActivity3 = betsController.activity;
                if (mainActivity3 != null) {
                    if (z) {
                        String string3 = mainActivity3.getString(R.string.one_click_bet_place_no_connection);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        betsController.showBetFeedback(string3, true);
                    } else {
                        betsController.showMessage(R.string.error);
                    }
                }
                return;
            }
            V7BetlistPlacementResponse v7BetlistPlacementResponse = (V7BetlistPlacementResponse) fetchedResponseMessage.getModel();
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                try {
                    if ((v7BetlistPlacementResponse != null ? v7BetlistPlacementResponse.getBetlist() : null) != null) {
                        try {
                            betsController._placeBetResult.setValue(PlaceBetResult.Success.INSTANCE);
                            Log.d("BETSLIPTEST", "Bet placed successfully. BetListModel ID: " + v7BetlistPlacementResponse.getBetlist().getId());
                            if (z) {
                                Iterator<T> it = betsController.betsModel.getValue().iterator();
                                double d = 1.0d;
                                while (it.hasNext()) {
                                    MatchDetailsBetDataModel bet = ((BetModel) it.next()).getBet();
                                    d *= bet != null ? bet.getGrabbedCoeficient() : 1.0d;
                                }
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                MainActivity mainActivity4 = betsController.activity;
                                if (mainActivity4 != null) {
                                    String string4 = mainActivity4.getString(R.string.one_click_bet_placed_success, new Object[]{betsController.amount.getValue(), format});
                                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                    betsController.showBetFeedback(string4, true);
                                }
                            }
                            betsController.processBetPlaced(betsController.convertV7BetlistToLegacy(v7BetlistPlacementResponse.getBetlist()));
                        } catch (Exception e2) {
                            Log.e("BETSLIPTEST", "Error processing bet placed: " + e2.getMessage(), e2);
                            if (betsController.activity != null) {
                                betsController.showMessage(R.string.error);
                            }
                        }
                        return;
                    }
                } finally {
                    betsController.hideProgress();
                }
            }
            if (fetchedResponseMessage.getStat() != FetchStat.INVALID || v7BetlistPlacementResponse == null) {
                betsController._placeBetResult.setValue(PlaceBetResult.Error.INSTANCE);
                Log.e("BETSLIPTEST", "Unhandled fetch result: stat=" + fetchedResponseMessage.getStat() + ", errors=" + (v7BetlistPlacementResponse != null ? v7BetlistPlacementResponse.getErrorCodes() : null));
                MainActivity mainActivity5 = betsController.activity;
                if (mainActivity5 != null) {
                    if (z) {
                        String string5 = mainActivity5.getString(R.string.one_click_bet_place_unhandled_detail);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        betsController.showBetFeedback(string5, true);
                    } else {
                        betsController.showMessage(R.string.error);
                    }
                }
                betsController.hideProgress();
                return;
            }
            betsController._placeBetResult.setValue(PlaceBetResult.Error.INSTANCE);
            try {
                Integer num = (Integer) CollectionsKt.firstOrNull((List) v7BetlistPlacementResponse.getErrorCodes());
                Log.d("BETSLIPTEST", "Bet placement returned INVALID. Error: " + num);
                if (num != null) {
                }
                if (num != null) {
                }
                MainActivity mainActivity6 = betsController.activity;
                if (mainActivity6 != null) {
                    if (num != null && num.intValue() == 8) {
                        if (z) {
                            String string6 = mainActivity6.getString(R.string.one_click_bet_err_only_one_detail);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                            betsController.showBetFeedback(string6, true);
                        } else {
                            betsController.showMessage(R.string.only_one_bet_per_match);
                        }
                    }
                    if (num.intValue() == 32) {
                        if (betsController.containsPlayerStatsBetInSlip()) {
                            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(betsController.getPlayerStatsMinStakeBetcoins());
                            Intrinsics.checkNotNull(shopBetcoinsFormated);
                            CharSequence minStakeNotEnoughBalanceMessage = betsController.minStakeNotEnoughBalanceMessage(shopBetcoinsFormated);
                            if (z) {
                                betsController.showBetFeedback(minStakeNotEnoughBalanceMessage, true);
                            } else {
                                betsController.showMessage(minStakeNotEnoughBalanceMessage);
                            }
                            betsController.showPlayerStatsMinStakeInfoDialog(minStakeNotEnoughBalanceMessage);
                        } else {
                            notifyNotEnoughBetcoinsVideoOffer$default(betsController, 0L, 1, null);
                            if (z) {
                                String string7 = mainActivity6.getString(R.string.one_click_bet_err_not_enough_money_detail);
                                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                                betsController.showBetFeedback(string7, true);
                            }
                        }
                    }
                    if (num != null && num.intValue() == 10) {
                        String shopBetcoinsFormated2 = FormatHelper.getShopBetcoinsFormated(betsController.getPlayerStatsMinStakeBetcoins());
                        Intrinsics.checkNotNull(shopBetcoinsFormated2);
                        CharSequence minStakeRequiredMessage = betsController.minStakeRequiredMessage(shopBetcoinsFormated2);
                        if (z) {
                            betsController.showBetFeedback(minStakeRequiredMessage, true);
                        } else {
                            betsController.showMessage(minStakeRequiredMessage);
                        }
                        betsController.showPlayerStatsMinStakeInfoDialog(minStakeRequiredMessage);
                    }
                    if (num.intValue() == 5) {
                        if (z) {
                            String string8 = mainActivity6.getString(R.string.one_click_bet_err_not_enough_tickets_detail);
                            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                            betsController.showBetFeedback(string8, true);
                        } else {
                            betsController.showMessage(R.string.not_enough_tickets);
                        }
                        betsController.buyBetcoinsInternal();
                    }
                    if (num != null && num.intValue() == 4) {
                        if (z) {
                            String string9 = mainActivity6.getString(R.string.one_click_bet_err_removed_detail);
                            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                            betsController.showBetFeedback(string9, true);
                        } else {
                            betsController.showMessage(R.string.betlist_updated);
                        }
                    }
                    betsController.showMessage(R.string.betlist_updated);
                }
                EventBus.getDefault().post(new CoefficientUpdatedMessage());
                EventBus.getDefault().post(new BetlistUpdatedMessage());
                betsController.forceRefreshBetDataSilent();
            } catch (Exception e3) {
                Log.e("BETSLIPTEST", "Error handling invalid response: " + e3.getMessage(), e3);
                if (betsController.activity != null) {
                    betsController.showMessage(R.string.error);
                }
            }
        } finally {
            betsController.oneClickAutoPlaceSession = false;
        }
    }

    private final void processBetPlaced(BetListModel betListModel) {
        TourComposeHelper tourComposeHelper;
        String str;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putInt;
        UserProgressModel userProgressModel;
        MatchDetailsDataModel match;
        MatchDetailsSportModel sport;
        MatchDetailsDataModel match2;
        Integer id;
        try {
            if (this.profileModel.getValue() == null) {
                Log.w("BETSLIPTEST", "Profile model is null, cannot process bet placed");
                return;
            }
            if (!getUserService().isRegistered()) {
                Log.w("BETSLIPTEST", "User is not registered, cannot process bet placed");
                return;
            }
            markVarietyMinStakeRulesEverPlaced();
            try {
                List<BetModel> value = this.betsModel.getValue();
                BetModel betModel = (BetModel) CollectionsKt.firstOrNull((List) value);
                Map<String, String> fromBetSlip = PresentationMatchContext.INSTANCE.fromBetSlip(value, Integer.valueOf(RangesKt.coerceAtLeast((int) this.amount.getValue().longValue(), 0)));
                String str2 = fromBetSlip.get("match_id");
                if (str2 == null) {
                    str2 = (betModel == null || (match2 = betModel.getMatch()) == null || (id = match2.getId()) == null) ? null : id.toString();
                    if (str2 == null) {
                        str2 = "";
                    }
                }
                String str3 = str2;
                String str4 = fromBetSlip.get("sport");
                if (str4 == null) {
                    String name = (betModel == null || (match = betModel.getMatch()) == null || (sport = match.getSport()) == null) ? null : sport.getName();
                    if (name == null) {
                        name = "unknown";
                    }
                    str = name;
                } else {
                    str = str4;
                }
                int coerceAtLeast = RangesKt.coerceAtLeast((int) this.amount.getValue().longValue(), 0);
                FullUserProfileModel value2 = this.profileModel.getValue();
                int moneyBalance = (value2 == null || (userProgressModel = value2.getUserProgressModel()) == null) ? 0 : (int) userProgressModel.getMoneyBalance();
                MainActivity mainActivity = this.activity;
                SharedPreferences sharedPreferences2 = mainActivity != null ? mainActivity.getSharedPreferences("analytics", 0) : null;
                int i = sharedPreferences2 != null ? sharedPreferences2.getInt("lifetime_bets", 0) : 0;
                boolean z = sharedPreferences2 != null ? sharedPreferences2.getBoolean("tutorial_completed", false) : false;
                long j = sharedPreferences2 != null ? sharedPreferences2.getLong("tutorial_completion_time", 0L) : 0L;
                if (i == 0 && z && j > 0) {
                    sharedPreferences = sharedPreferences2;
                    AnalyticsHelper.INSTANCE.logFirstBetPlaced((System.currentTimeMillis() - j) / 1000, coerceAtLeast, str);
                } else {
                    sharedPreferences = sharedPreferences2;
                }
                AnalyticsHelper analyticsHelper = AnalyticsHelper.INSTANCE;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : fromBetSlip.entrySet()) {
                    String key = entry.getKey();
                    if (!Intrinsics.areEqual(key, "match_id") && !Intrinsics.areEqual(key, "sport") && !Intrinsics.areEqual(key, "bet_amount")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                analyticsHelper.logBetPlaced(str3, coerceAtLeast, str, moneyBalance, i, linkedHashMap);
                if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putInt = edit.putInt("lifetime_bets", i + 1)) != null) {
                    putInt.apply();
                }
            } catch (Exception e) {
                Log.e("BETSLIPTEST", "Error logging bet analytics: " + e.getMessage(), e);
            }
            try {
                List<BetModel> value3 = this.betsModel.getValue();
                if (!value3.isEmpty()) {
                    BetModel betModel2 = (BetModel) CollectionsKt.firstOrNull((List) value3);
                    if (betModel2 != null && betModel2.getMatch() != null) {
                        Integer id2 = betModel2.getMatch().getId();
                        EventBus eventBus = EventBus.getDefault();
                        Intrinsics.checkNotNull(id2);
                        eventBus.post(new BetPlacedSuccessMessage(id2.intValue()));
                        Log.d("BETSLIPTEST", "BetPlacedSuccessMessage sent with matchId: " + id2);
                    }
                } else {
                    Log.d("BETSLIPTEST", "No current bets to send BetPlacedSuccessMessage");
                }
            } catch (Exception e2) {
                Log.e("BETSLIPTEST", "Error sending BetPlacedSuccessMessage: " + e2.getMessage(), e2);
            }
            try {
                getUserService().invalidate(UserService.InfoKind.PROGRESS, UserService.InfoKind.STATS);
                getUserService().getProfile(this, UserService.InfoKind.PROGRESS, UserService.InfoKind.STATS);
            } catch (Exception e3) {
                Log.e("BETSLIPTEST", "Error invalidating/refreshing user profile: " + e3.getMessage(), e3);
            }
            try {
                getBetListAppender().clearBets();
                updateBetDetails(CollectionsKt.emptyList());
            } catch (Exception e4) {
                Log.e("BETSLIPTEST", "Error clearing bets: " + e4.getMessage(), e4);
            }
            try {
                reloadBetsHistory();
            } catch (Exception e5) {
                Log.e("BETSLIPTEST", "Error reloading bets history: " + e5.getMessage(), e5);
            }
            try {
                EventBus.getDefault().post(new BetlistUpdatedMessage());
            } catch (Exception e6) {
                Log.e("BETSLIPTEST", "Error posting BetlistUpdatedMessage: " + e6.getMessage(), e6);
            }
            try {
                if (betListModel != null) {
                    try {
                        MainActivity mainActivity2 = this.activity;
                        if (mainActivity2 != null && (tourComposeHelper = mainActivity2.tourComposeHelper) != null) {
                            if (tourComposeHelper.isTourActive()) {
                                try {
                                    MainActivity mainActivity3 = this.activity;
                                    if (mainActivity3 != null) {
                                        TourComposeHelper tourComposeHelper2 = mainActivity3.tourComposeHelper;
                                        if (tourComposeHelper2 != null) {
                                            tourComposeHelper2.onBetPlaced(Integer.valueOf(betListModel.getId()));
                                        }
                                        Log.d("BETSLIPTEST", "Tour active - notified tour about bet placement, dialog will be shown after congratulation screen");
                                        Unit unit = Unit.INSTANCE;
                                    }
                                } catch (Exception e7) {
                                    Log.e("BETSLIPTEST", "Error notifying tour about bet placement: " + e7.getMessage(), e7);
                                    showBetPlacedDialog(betListModel.getId());
                                    Unit unit2 = Unit.INSTANCE;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    showBetPlacedDialog(betListModel.getId());
                }
            } catch (Exception e8) {
                Log.e("BETSLIPTEST", "Error showing bet placed dialog: " + e8.getMessage(), e8);
            }
            try {
                this.onDismiss.invoke();
                Unit unit3 = Unit.INSTANCE;
            } catch (Exception e9) {
                Integer.valueOf(Log.e("BETSLIPTEST", "Error dismissing: " + e9.getMessage(), e9));
            }
        } catch (Exception e10) {
            Log.e("BETSLIPTEST", "Critical error in processBetPlaced: " + e10.getMessage(), e10);
            if (this.activity != null) {
                showMessage(R.string.error);
            }
        }
    }

    public final void syncBetslipFromStorage() {
        ArrayList<BetModel> emptyList;
        MainActivity mainActivity = this.activity;
        if (mainActivity == null) {
            return;
        }
        try {
            emptyList = SharedPrefs.getBetslip(mainActivity);
        } catch (Exception e) {
            Log.e("BETSLIPTEST", "Error loading betslip from storage: " + e.getMessage(), e);
            emptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList);
        updateBetDetails(emptyList);
        if (!emptyList.isEmpty()) {
            MutableStateFlow<long[]> mutableStateFlow = this.ids;
            List<? extends BetModel> list = emptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BetModel) it.next()).getBet().getGrabbedBetId());
            }
            mutableStateFlow.setValue(CollectionsKt.toLongArray(arrayList));
        } else {
            this.ids.setValue(null);
        }
        this._selectedTabFlow.setValue(Integer.valueOf(emptyList.isEmpty() ? 1 : 0));
        Log.d("BETSLIPTEST", "Synced betslip from storage: " + emptyList.size() + " bets");
    }

    public final void refreshBetData() {
        if (this.isRefreshingBetData) {
            return;
        }
        List<BetModel> value = this.betsModel.getValue();
        if (!value.isEmpty()) {
            List<BetModel> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BetModel) it.next()).getBet().getGrabbedBetId());
            }
            ArrayList arrayList2 = arrayList;
            Log.d("BETSLIPTEST", "Refreshing bet data for " + arrayList2.size() + " bets");
            this.isRefreshingBetData = true;
            getGrabbedBetsInteractor().invalidate(CollectionsKt.emptyList());
            getGrabbedBetsInteractor().load(this.onGrabbetBetFetched, arrayList2);
            return;
        }
        Log.d("BETSLIPTEST", "No bets in list, skipping refresh");
        this.ids.setValue(null);
    }

    public static /* synthetic */ void onVideoButtonClicked$default(BetsController betsController, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        betsController.onVideoButtonClicked(num);
    }

    public final void onVideoButtonClicked(Integer betId) {
        PromoService.PromoPlacement determinePlacementForBet = determinePlacementForBet(betId);
        getVideoRewardService().redeemReward(determinePlacementForBet, WhenMappings.$EnumSwitchMapping$0[determinePlacementForBet.ordinal()] == 1 ? Long.valueOf(this.lastCheckedReferencedValue) : null, null);
    }

    private final PromoService.PromoPlacement determinePlacementForBet(Integer betId) {
        Object obj;
        if (betId == null) {
            Log.w("BetsController", "onVideoButtonClicked called without betId, defaulting to BET_LOST");
            return PromoService.PromoPlacement.BET_LOST;
        }
        Iterator<T> it = this.betList.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((BetsListModel) obj).getId(), betId)) {
                break;
            }
        }
        BetsListModel betsListModel = (BetsListModel) obj;
        BetState state = betsListModel != null ? betsListModel.getState() : null;
        int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
        if (i == 1) {
            Log.d("BetsController", "Bet " + betId + " is WON, using BET_WON placement");
            return PromoService.PromoPlacement.BET_WON;
        }
        if (i != 2) {
            Log.w("BetsController", "Bet " + betId + " has state " + (betsListModel != null ? betsListModel.getState() : null) + ", defaulting to BET_LOST");
            return PromoService.PromoPlacement.BET_LOST;
        }
        Log.d("BetsController", "Bet " + betId + " is LOST, using BET_LOST placement");
        return PromoService.PromoPlacement.BET_LOST;
    }

    public final void checkVideoRewardForBet(int betId) {
        Object obj;
        Long l;
        Iterator<T> it = this.betList.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer id = ((BetsListModel) obj).getId();
            if (id != null && id.intValue() == betId) {
                break;
            }
        }
        BetsListModel betsListModel = (BetsListModel) obj;
        PromoService.PromoPlacement determinePlacementForBet = determinePlacementForBet(Integer.valueOf(betId));
        this.lastCheckedPlacement = determinePlacementForBet;
        this.lastCheckedBetId = Integer.valueOf(betId);
        if (WhenMappings.$EnumSwitchMapping$0[determinePlacementForBet.ordinal()] == 1) {
            l = Long.valueOf(betsListModel != null ? betsListModel.getMoneyPlaced() : 0L);
        } else {
            l = null;
        }
        this.lastCheckedReferencedValue = l != null ? l.longValue() : 0L;
        getVideoRewardService().connectClient(determinePlacementForBet, null, this);
        getVideoRewardService().getVideoRewardInfo(determinePlacementForBet, l, null);
        if (this._isBonusAvailable.getValue().booleanValue()) {
            return;
        }
        schedulePeriodicVideoRewardCheck(betId);
    }

    private final void schedulePeriodicVideoRewardCheck(int betId) {
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        PromoService.PromoPlacement promoPlacement = this.lastCheckedPlacement;
        if (promoPlacement == null) {
            promoPlacement = PromoService.PromoPlacement.BET_LOST;
        }
        PromoService.PromoPlacement promoPlacement2 = promoPlacement;
        this.videoRewardCheckJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BetsController$schedulePeriodicVideoRewardCheck$1(this, betId, promoPlacement2, WhenMappings.$EnumSwitchMapping$0[promoPlacement2.ordinal()] == 1 ? Long.valueOf(this.lastCheckedReferencedValue) : null, null), 3, null);
    }

    public final void stopPeriodicVideoRewardCheck() {
        Job job = this.videoRewardCheckJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.videoRewardCheckJob = null;
        PromoService.PromoPlacement promoPlacement = this.lastCheckedPlacement;
        if (promoPlacement != null) {
            getVideoRewardService().disconnectClient(promoPlacement, null);
        }
        this.lastCheckedPlacement = null;
        this.lastCheckedBetId = null;
        this.lastCheckedReferencedValue = 0L;
        this._isBonusAvailable.setValue(false);
        this._videoRewardAmount.setValue(0L);
    }

    public final boolean consumeSkipBetWonCloseInterstitial() {
        boolean z = this.skipBetWonCloseInterstitialOnDismiss;
        this.skipBetWonCloseInterstitialOnDismiss = false;
        return z;
    }

    public final void resetBetWonCloseInterstitialState() {
        this.skipBetWonCloseInterstitialOnDismiss = false;
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardInfoListener
    public void onVideoRewardInfoUpdated(VideoRewardPlacementInfo info) {
        boolean z;
        Integer num;
        Intrinsics.checkNotNullParameter(info, "info");
        PromoService.PromoPlacement promoPlacement = this.lastCheckedPlacement;
        if (promoPlacement == null) {
            promoPlacement = PromoService.PromoPlacement.BET_LOST;
        }
        this._videoRewardAmount.setValue(Long.valueOf(info.getPrizeAmount()));
        boolean z2 = false;
        try {
            z = getVideoRewardService().isRewardedReady(promoPlacement);
        } catch (Exception e) {
            Log.e("BetsController", "Error checking rewarded ad availability", e);
            z = false;
        }
        boolean z3 = info.isAvailable() && !info.isQuotaExhausted();
        if (z3 && z) {
            z2 = true;
        }
        boolean booleanValue = this._isBonusAvailable.getValue().booleanValue();
        this._isBonusAvailable.setValue(Boolean.valueOf(z2));
        Log.d("BetsController", "Video reward updated: placement=" + promoPlacement + ", backendAvailable=" + z3 + ", adSdkAvailable=" + z + ", finalAvailable=" + z2 + ", wasAvailable=" + booleanValue + ", amount=" + info.getPrizeAmount());
        if (z2 && !booleanValue) {
            Job job = this.videoRewardCheckJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.videoRewardCheckJob = null;
            Log.d("BetsController", "Video reward available, stopping periodic checks");
        } else if (!z2 && booleanValue && (num = this.lastCheckedBetId) != null) {
            schedulePeriodicVideoRewardCheck(num.intValue());
            Log.d("BetsController", "Video reward unavailable, starting periodic checks");
        }
        if (!z3 || getVideoRewardService().isRewardedReady(promoPlacement)) {
            return;
        }
        getVideoRewardService().preloadRewarded();
    }

    @Override // org.betup.services.offer.VideoRewardService.VideoRewardServiceClient
    public void onVideoRewardRequestProcessed(VideoRewardService.RewardedVideoResult result, long amount) {
        Integer id;
        getVideoRewardService().connectClient(PromoService.PromoPlacement.BET_LOST, null, this);
        int i = result == null ? -1 : WhenMappings.$EnumSwitchMapping$2[result.ordinal()];
        if (i == -1) {
            this._isBonusAvailable.setValue(false);
            return;
        }
        if (i == 1) {
            if (this.lastCheckedPlacement == PromoService.PromoPlacement.BET_WON) {
                this.skipBetWonCloseInterstitialOnDismiss = true;
            }
            this._isBonusAvailable.setValue(false);
            getVideoRewardService().triggerCaching();
            BetsListModel betsListModel = (BetsListModel) CollectionsKt.firstOrNull((List) this.betList.getValue());
            id = betsListModel != null ? betsListModel.getId() : null;
            if (id != null) {
                schedulePeriodicVideoRewardCheck(id.intValue());
                return;
            }
            return;
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this._isBonusAvailable.setValue(false);
        Log.e("BetsController", "Video reward failed: " + result);
        getVideoRewardService().triggerCaching();
        BetsListModel betsListModel2 = (BetsListModel) CollectionsKt.firstOrNull((List) this.betList.getValue());
        id = betsListModel2 != null ? betsListModel2.getId() : null;
        if (id != null) {
            schedulePeriodicVideoRewardCheck(id.intValue());
        }
    }

    public final void onAmountChange(Long amountNew) {
        if (amountNew != null) {
            this._amount.setValue(Long.valueOf(RangesKt.coerceAtLeast(amountNew.longValue(), 0L)));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:8|(2:9|10)|(2:(1:121)(1:118)|(13:120|20|21|22|23|24|(6:27|28|29|(2:31|32)(7:34|(4:36|(2:37|(3:39|(2:41|42)(2:53|54)|(2:44|45)(1:52))(2:55|56))|46|(1:51)(1:50))|(1:58)(1:71)|59|(1:61)(2:64|(1:66)(2:67|(1:69)(1:70)))|62|63)|33|25)|76|77|(9:80|81|82|(1:84)(1:105)|(1:104)(2:87|(2:89|(1:91)(3:99|100|102))(1:103))|92|(3:94|95|96)(1:98)|97|78)|108|109|110))(1:18)|19|20|21|22|23|24|(1:25)|76|77|(1:78)|108|109|110) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x009d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x009e, code lost:
    
        android.util.Log.e("BETSLIPTEST", "Error getting old bets: " + r0.getMessage(), r0);
        r0 = kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6 A[Catch: Exception -> 0x0237, TRY_LEAVE, TryCatch #3 {Exception -> 0x0237, blocks: (B:3:0x000a, B:5:0x0011, B:24:0x00b9, B:25:0x00c0, B:27:0x00c6, B:74:0x019c, B:77:0x01bb, B:78:0x01d0, B:80:0x01d6, B:95:0x022d, B:107:0x020e, B:109:0x0231, B:113:0x009e, B:123:0x0072, B:82:0x01dc, B:91:0x01f7, B:92:0x0208, B:99:0x01fc, B:100:0x0201, B:103:0x0202, B:105:0x01e5, B:22:0x0091, B:29:0x00cc, B:31:0x00d2, B:34:0x00d9, B:36:0x00e7, B:37:0x00f1, B:39:0x00f7, B:46:0x0111, B:48:0x0115, B:50:0x011b, B:58:0x0127, B:59:0x0135, B:62:0x015d, B:64:0x0145, B:66:0x014d, B:67:0x0150, B:69:0x0158, B:70:0x015b, B:10:0x0031, B:12:0x003b, B:14:0x0041, B:16:0x0047, B:20:0x0069, B:116:0x0050, B:118:0x0056), top: B:2:0x000a, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6 A[Catch: Exception -> 0x0237, TRY_LEAVE, TryCatch #3 {Exception -> 0x0237, blocks: (B:3:0x000a, B:5:0x0011, B:24:0x00b9, B:25:0x00c0, B:27:0x00c6, B:74:0x019c, B:77:0x01bb, B:78:0x01d0, B:80:0x01d6, B:95:0x022d, B:107:0x020e, B:109:0x0231, B:113:0x009e, B:123:0x0072, B:82:0x01dc, B:91:0x01f7, B:92:0x0208, B:99:0x01fc, B:100:0x0201, B:103:0x0202, B:105:0x01e5, B:22:0x0091, B:29:0x00cc, B:31:0x00d2, B:34:0x00d9, B:36:0x00e7, B:37:0x00f1, B:39:0x00f7, B:46:0x0111, B:48:0x0115, B:50:0x011b, B:58:0x0127, B:59:0x0135, B:62:0x015d, B:64:0x0145, B:66:0x014d, B:67:0x0150, B:69:0x0158, B:70:0x015b, B:10:0x0031, B:12:0x003b, B:14:0x0041, B:16:0x0047, B:20:0x0069, B:116:0x0050, B:118:0x0056), top: B:2:0x000a, inners: #0, #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateBetDetails(List<? extends BetModel> bets) {
        BetSlipUiModel betSlipUiModel;
        Boolean bool;
        Object obj;
        MatchDetailsBetDataModel bet;
        BetModel betModel;
        MutableStateFlow<Boolean> mutableStateFlow;
        boolean z;
        MatchDetailsBetDataModel bet2;
        MatchDetailsBetDataModel bet3;
        MatchDetailsBetGroupModel betGroup;
        try {
            Double d = null;
            if (bets.isEmpty()) {
                this._betsModel.setValue(new ArrayList());
                this._betsUiModel.setValue(new ArrayList());
                this.ids.setValue(null);
                return;
            }
            try {
                betModel = (BetModel) CollectionsKt.firstOrNull((List) bets);
                mutableStateFlow = this._isFirstBetAvailable;
            } catch (Exception e) {
                Log.e("BETSLIPTEST", "Error setting first bet available: " + e.getMessage(), e);
                this._isFirstBetAvailable.setValue(false);
            }
            if (betModel == null || (bet3 = betModel.getBet()) == null || (betGroup = bet3.getBetGroup()) == null || betGroup.isAvailable()) {
                if (!((betModel == null || (bet2 = betModel.getBet()) == null) ? false : Intrinsics.areEqual((Object) bet2.getIsAvailable(), (Object) false))) {
                    z = true;
                    mutableStateFlow.setValue(Boolean.valueOf(z));
                    ArrayList<BetModel> emptyList = SharedPrefs.getBetslip(this.activity);
                    List list = emptyList;
                    for (BetModel betModel2 : bets) {
                        try {
                            if (betModel2.getBet() == null) {
                                Log.w("BETSLIPTEST", "Bet has null bet data, skipping");
                            } else {
                                Double initialCoefficientForBet = getBetListAppender().getInitialCoefficientForBet(betModel2.getGrabbedBetId());
                                if (initialCoefficientForBet == null) {
                                    Intrinsics.checkNotNull(list);
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (((BetModel) obj).getGrabbedBetId() == betModel2.getGrabbedBetId()) {
                                                break;
                                            }
                                        } else {
                                            obj = d;
                                            break;
                                        }
                                    }
                                    BetModel betModel3 = (BetModel) obj;
                                    initialCoefficientForBet = (betModel3 == null || (bet = betModel3.getBet()) == null) ? d : Double.valueOf(bet.getGrabbedCoeficient());
                                }
                                Double valueOf = initialCoefficientForBet != null ? Double.valueOf(UiExtensionsKt.formatTwoDecimals(initialCoefficientForBet.doubleValue())) : d;
                                double formatTwoDecimals = UiExtensionsKt.formatTwoDecimals(betModel2.getBet().getGrabbedCoeficient());
                                BetModel.stat statVar = valueOf == null ? d : formatTwoDecimals > valueOf.doubleValue() ? BetModel.stat.INCREASED : formatTwoDecimals < valueOf.doubleValue() ? BetModel.stat.DECREASED : BetModel.stat.NONE;
                                betModel2.setStatus(statVar);
                                Log.d("FirstBetFlow", "BetsController [6] updateBetDetails - betId=" + betModel2.getGrabbedBetId() + ", baselineCoef=" + valueOf + ", newCoef=" + formatTwoDecimals + ", status=" + statVar);
                            }
                        } catch (Exception e2) {
                            Log.e("BETSLIPTEST", "Error updating bet status: " + e2.getMessage(), e2);
                        }
                        d = null;
                    }
                    this._betsModel.setValue(bets);
                    MutableStateFlow<List<BetSlipUiModel>> mutableStateFlow2 = this._betsUiModel;
                    ArrayList arrayList = new ArrayList();
                    for (BetModel betModel4 : bets) {
                        try {
                            BetModel.stat status = betModel4.getStatus();
                            int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$3[status.ordinal()];
                            if (i == -1 || i == 1) {
                                bool = null;
                            } else if (i == 2) {
                                bool = true;
                            } else {
                                if (i != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bool = false;
                            }
                            betSlipUiModel = UiExtensionsKt.toBetSlipUiModel(betModel4, bool);
                        } catch (Exception e3) {
                            Log.e("BETSLIPTEST", "Error converting bet to UI model: " + e3.getMessage(), e3);
                            betSlipUiModel = null;
                        }
                        if (betSlipUiModel != null) {
                            arrayList.add(betSlipUiModel);
                        }
                    }
                    mutableStateFlow2.setValue(arrayList);
                }
            }
            z = false;
            mutableStateFlow.setValue(Boolean.valueOf(z));
            ArrayList<BetModel> emptyList2 = SharedPrefs.getBetslip(this.activity);
            List list2 = emptyList2;
            while (r5.hasNext()) {
            }
            this._betsModel.setValue(bets);
            MutableStateFlow<List<BetSlipUiModel>> mutableStateFlow22 = this._betsUiModel;
            ArrayList arrayList2 = new ArrayList();
            while (r5.hasNext()) {
            }
            mutableStateFlow22.setValue(arrayList2);
        } catch (Exception e4) {
            Log.e("BETSLIPTEST", "Critical error in updateBetDetails: " + e4.getMessage(), e4);
        }
    }

    private final void updateOddType() {
        MutableStateFlow<OddType> mutableStateFlow = this._oddType;
        OddType oddType = getUserService().getOddType();
        Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
        mutableStateFlow.setValue(oddType);
    }

    public final void onSettingsClick() {
        FragmentManager supportFragmentManager;
        OddsDialogFragment newInstance = OddsDialogFragment.INSTANCE.newInstance(true);
        newInstance.setOddsOnDismissListener(new Function1() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onSettingsClick$lambda$36;
                onSettingsClick$lambda$36 = BetsController.onSettingsClick$lambda$36(BetsController.this, (OddType) obj);
                return onSettingsClick$lambda$36;
            }
        });
        MainActivity mainActivity = this.activity;
        MainActivity mainActivity2 = mainActivity instanceof FragmentActivity ? mainActivity : null;
        if (mainActivity2 == null || (supportFragmentManager = mainActivity2.getSupportFragmentManager()) == null) {
            return;
        }
        DialogManager.showDialogSafely(newInstance, supportFragmentManager, "OddsDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSettingsClick$lambda$36(BetsController betsController, OddType oddType) {
        long longValue;
        if (oddType != null) {
            betsController.getUserService().saveOddType(oddType);
        }
        betsController.updateOddType();
        betsController.refreshBetData();
        MutableStateFlow<Long> mutableStateFlow = betsController._amount;
        if (SharedPrefs.isSelectedDefaultsBetsAmounts(betsController.activity)) {
            longValue = 100;
        } else {
            Long customBetAmount = SharedPrefs.getCustomBetAmount(betsController.activity);
            Intrinsics.checkNotNull(customBetAmount);
            longValue = customBetAmount.longValue();
        }
        mutableStateFlow.setValue(Long.valueOf(longValue));
        return Unit.INSTANCE;
    }

    private final void placeBetFunc() {
        MainActivity mainActivity;
        List<GrabbedBetModel> grabbedBets;
        try {
            if (this.activity == null) {
                Log.e("BETSLIPTEST", "Activity is null, cannot place bet");
                hideProgress();
                return;
            }
            if (this.profileModel.getValue() == null || this.betDataModel.getValue() == null) {
                hideProgress();
                showMessage(R.string.error);
                return;
            }
            try {
                EventBus.getDefault().post(new TourCloseMessage());
            } catch (Exception e) {
                Log.e("BETSLIPTEST", "Error posting TourCloseMessage: " + e.getMessage(), e);
            }
            List<BetModel> value = this.betsModel.getValue();
            if (value.isEmpty()) {
                hideProgress();
                showMessage(R.string.betslip_no_bets_in_list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                BetModel betModel = (BetModel) obj;
                if (betModel.getBet() == null || betModel.getMatch() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Log.e("BETSLIPTEST", "Some bets have null data, cannot place bet");
                hideProgress();
                showMessage(R.string.error_missing_data);
                return;
            }
            GrabbedBetDataModel value2 = this.betDataModel.getValue();
            int i = 0;
            if (((value2 == null || (grabbedBets = value2.getGrabbedBets()) == null) ? 0 : grabbedBets.size()) >= 5 && getUserService().isAnonymous() && (mainActivity = this.activity) != null && SignInDialogManager.INSTANCE.shouldForceShow(getUserService())) {
                hideProgress();
                SignUpDialogFragment.Companion.showDialog$default(SignUpDialogFragment.INSTANCE, mainActivity, null, 2, null);
                return;
            }
            long effectiveMinBetSize = getEffectiveMinBetSize();
            if (this.amount.getValue().longValue() < effectiveMinBetSize) {
                this._amount.setValue(Long.valueOf(effectiveMinBetSize));
            }
            try {
                if (hasInsufficientBalanceForStake(this.amount.getValue().longValue())) {
                    hideProgress();
                    MainActivity mainActivity2 = this.activity;
                    if (!containsPlayerStatsBetInSlip() || mainActivity2 == null) {
                        notifyNotEnoughBetcoinsVideoOffer$default(this, 0L, 1, null);
                        return;
                    }
                    String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(getPlayerStatsMinStakeBetcoins());
                    Intrinsics.checkNotNull(shopBetcoinsFormated);
                    notifyPlayerStatsMinStakeIssue(minStakeNotEnoughBalanceMessage(shopBetcoinsFormated));
                    return;
                }
                try {
                    if (this.betDataModel.getValue() != null) {
                        if (this.amount.getValue().longValue() > r3.getMaxMoneyPlaced()) {
                            hideProgress();
                            showMessage(R.string.amount_exceeds_limits);
                            showUnlockMaxDialog();
                            return;
                        }
                    }
                    try {
                        long[] jArr = new long[value.size()];
                        for (Object obj2 : value) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            BetModel betModel2 = (BetModel) obj2;
                            try {
                                MatchDetailsBetDataModel bet = betModel2.getBet();
                                Long grabbedBetId = bet != null ? bet.getGrabbedBetId() : null;
                                MatchDetailsBetDataModel bet2 = betModel2.getBet();
                                Double valueOf = bet2 != null ? Double.valueOf(bet2.getGrabbedCoeficient()) : null;
                                if (grabbedBetId == null || valueOf == null) {
                                    throw new IllegalArgumentException("Bet " + i + " has null ID or coefficient");
                                }
                                jArr[i] = grabbedBetId.longValue();
                                valueOf.doubleValue();
                                i = i2;
                            } catch (Exception e2) {
                                Log.e("BETSLIPTEST", "Error processing bet " + i + ": " + e2.getMessage(), e2);
                                throw e2;
                            }
                        }
                        this.ids.setValue(jArr);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = value.iterator();
                        while (it.hasNext()) {
                            MatchDetailsBetDataModel bet3 = ((BetModel) it.next()).getBet();
                            Double valueOf2 = bet3 != null ? Double.valueOf(bet3.getGrabbedCoeficient()) : null;
                            if (valueOf2 != null) {
                                arrayList2.add(valueOf2);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (arrayList3.size() != value.size()) {
                            Log.e("BETSLIPTEST", "Coefficient array size mismatch");
                            hideProgress();
                            showMessage(R.string.error_missing_data);
                        } else {
                            try {
                                getCreateBetlistInteractor().placeBet(this.betslipAddListener, this.amount.getValue().longValue(), ArraysKt.toList(jArr), arrayList3, (r18 & 16) != 0 ? false : getTourHelper().isTour(), (r18 & 32) != 0 ? false : false);
                            } catch (Exception e3) {
                                Log.e("BETSLIPTEST", "Error calling placeBet: " + e3.getMessage(), e3);
                                hideProgress();
                                showMessage(R.string.error);
                            }
                        }
                    } catch (Exception e4) {
                        Log.e("BETSLIPTEST", "Error generating bet arrays: " + e4.getMessage(), e4);
                        hideProgress();
                        showMessage(R.string.error);
                    }
                } catch (Exception e5) {
                    Log.e("BETSLIPTEST", "Error checking max allowed: " + e5.getMessage(), e5);
                    hideProgress();
                    showMessage(R.string.error);
                }
            } catch (Exception e6) {
                Log.e("BETSLIPTEST", "Error checking user balance: " + e6.getMessage(), e6);
                hideProgress();
                showMessage(R.string.error);
            }
        } catch (Exception e7) {
            Log.e("BETSLIPTEST", "Critical error in placeBetFunc: " + e7.getMessage(), e7);
            hideProgress();
            if (this.activity != null) {
                showMessage(R.string.error);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0224 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPlaceClick() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        Long l;
        MatchDetailsBetDataModel bet;
        MatchDetailsBetDataModel bet2;
        MatchDetailsBetGroupModel betGroup;
        MatchDetailsBetGroupModel betGroup2;
        try {
            Log.d("BETSLIPTEST", "onPlaceClick called");
        } catch (Exception e) {
            Log.e("BETSLIPTEST", "Critical error in onPlaceClick: " + e.getMessage(), e);
            showMessage(R.string.error);
            hideProgress();
        }
        if (this.activity == null) {
            Log.e("BETSLIPTEST", "Activity is null, cannot place bet");
            return;
        }
        if (this.amount.getValue().longValue() < getEffectiveMinBetSize()) {
            MainActivity mainActivity = this.activity;
            long maxMinStakeForSlip = VarietyBetRestrictions.INSTANCE.maxMinStakeForSlip(slipParamTIds());
            if (maxMinStakeForSlip > 0 && mainActivity != null) {
                String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(maxMinStakeForSlip);
                Intrinsics.checkNotNull(shopBetcoinsFormated);
                notifyPlayerStatsMinStakeIssue(minStakeRequiredMessage(shopBetcoinsFormated));
                return;
            }
            showMessage(R.string.min_bet_required);
            return;
        }
        List<BetModel> value = this.betsModel.getValue();
        if (value.isEmpty()) {
            showMessage(R.string.betslip_no_bets_in_list);
            return;
        }
        try {
            List<BetModel> list = value;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    MatchDetailsBetDataModel bet3 = ((BetModel) it.next()).getBet();
                    if (bet3 != null && (betGroup2 = bet3.getBetGroup()) != null && !betGroup2.isAvailable()) {
                        z = true;
                        break;
                    }
                }
            }
        } catch (Exception e2) {
            Log.e("BETSLIPTEST", "Error checking unavailable bet groups: " + e2.getMessage(), e2);
        }
        z = false;
        try {
            List<BetModel> list2 = value;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((BetModel) it2.next()).isDeleted()) {
                        z2 = true;
                        break;
                    }
                }
            }
        } catch (Exception e3) {
            Log.e("BETSLIPTEST", "Error checking deleted bets: " + e3.getMessage(), e3);
        }
        z2 = false;
        try {
            List<BetModel> list3 = value;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (BetModel betModel : list3) {
                    if (!betModel.isAvailable() && !betModel.isDeleted() && ((bet2 = betModel.getBet()) == null || (betGroup = bet2.getBetGroup()) == null || betGroup.isAvailable())) {
                        z3 = true;
                        break;
                    }
                }
            }
        } catch (Exception e4) {
            Log.e("BETSLIPTEST", "Error checking unavailable bets: " + e4.getMessage(), e4);
        }
        z3 = false;
        UnlockBetTypesFlow unlockBetTypesFlow = null;
        if (z) {
            Log.d("BETSLIPTEST", "Some bet groups are not available, starting unlock flow");
            try {
                UnlockBetTypesFlow unlockBetTypesFlow2 = this.unlockBetTypesFlow;
                if (unlockBetTypesFlow2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("unlockBetTypesFlow");
                } else {
                    unlockBetTypesFlow = unlockBetTypesFlow2;
                }
                unlockBetTypesFlow.start(this, new String[0]);
                return;
            } catch (Exception e5) {
                Log.e("BETSLIPTEST", "Error starting unlock flow: " + e5.getMessage(), e5);
                showMessage(R.string.error);
                return;
            }
        }
        if (z2) {
            Log.d("BETSLIPTEST", "Some bets are deleted, showing error message");
            showMessage(R.string.bet_removed);
            return;
        }
        if (z3) {
            Log.d("BETSLIPTEST", "Some bets are not available (but bet groups are available), showing error message");
            showMessage(R.string.bet_not_available);
            return;
        }
        Log.d("BETSLIPTEST", "All bets available and not deleted, checking for data changes before placement");
        displayProgress();
        try {
            if (hasInsufficientBalanceForStake(this.amount.getValue().longValue())) {
                Log.d("BETSLIPTEST", "Insufficient balance: userBalance=" + currentUserBalanceBetcoins() + ", amount=" + this.amount.getValue());
                hideProgress();
                notifyNotEnoughBetcoinsVideoOffer$default(this, 0L, 1, null);
                return;
            }
            try {
                long[] value2 = this.ids.getValue();
                if (value2 == null || (arrayList = ArraysKt.toList(value2)) == null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it3 = value.iterator();
                    while (it3.hasNext()) {
                        try {
                            bet = ((BetModel) it3.next()).getBet();
                        } catch (Exception e6) {
                            Log.e("BETSLIPTEST", "Error getting bet ID: " + e6.getMessage(), e6);
                        }
                        if (bet != null) {
                            l = bet.getGrabbedBetId();
                            if (l == null) {
                                arrayList2.add(l);
                            }
                        }
                        l = null;
                        if (l == null) {
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    Log.e("BETSLIPTEST", "No bet IDs available for refresh");
                    hideProgress();
                    showMessage(R.string.error);
                    return;
                }
                getGrabbedBetsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda5
                    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                    public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                        BetsController.onPlaceClick$lambda$53(BetsController.this, fetchedResponseMessage);
                    }
                }, arrayList);
                return;
            } catch (Exception e7) {
                Log.e("BETSLIPTEST", "Error refreshing bet data: " + e7.getMessage(), e7);
                hideProgress();
                showMessage(R.string.error);
                return;
            }
        } catch (Exception e8) {
            Log.e("BETSLIPTEST", "Error checking user balance: " + e8.getMessage(), e8);
            hideProgress();
            showMessage(R.string.error);
            return;
        }
        Log.e("BETSLIPTEST", "Critical error in onPlaceClick: " + e.getMessage(), e);
        showMessage(R.string.error);
        hideProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPlaceClick$lambda$53(BetsController betsController, FetchedResponseMessage fetchedResponseMessage) {
        GrabbedBetModel grabbedBetModel;
        try {
            Log.d("BETSLIPTEST", "Bet data refresh completed, processing changes");
            if (fetchedResponseMessage.getStat() == FetchStat.SERVER_DOWN) {
                Log.e("BETSLIPTEST", "Server is down");
                betsController.showMessage(R.string.works_in_progress);
                betsController.hideProgress();
                return;
            }
            V7GrabbedBetsResponse v7GrabbedBetsResponse = (V7GrabbedBetsResponse) fetchedResponseMessage.getModel();
            if (v7GrabbedBetsResponse == null) {
                Log.e("BETSLIPTEST", "Response model is null");
                betsController.hideProgress();
                betsController.showMessage(R.string.invalid_server_response);
                return;
            }
            try {
                boolean z = false;
                if (v7GrabbedBetsResponse.getGrabbedBets().isEmpty()) {
                    Log.d("BETSLIPTEST", "Empty grabbed bets response during bet placement - marking all bets as deleted");
                    processBetChangesAndCheckForUpdates$default(betsController, CollectionsKt.emptyList(), false, 2, null);
                    betsController.showMessage(R.string.bet_deleted);
                    betsController.hideProgress();
                    return;
                }
                List<V7GrabbedBetDto> grabbedBets = v7GrabbedBetsResponse.getGrabbedBets();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = grabbedBets.iterator();
                while (it.hasNext()) {
                    try {
                        grabbedBetModel = betsController.convertV7ToOldGrabbedBet((V7GrabbedBetDto) it.next());
                    } catch (Exception e) {
                        Log.e("BETSLIPTEST", "Error converting bet: " + e.getMessage(), e);
                        grabbedBetModel = null;
                    }
                    if (grabbedBetModel != null) {
                        arrayList.add(grabbedBetModel);
                    }
                }
                boolean processBetChangesAndCheckForUpdates = betsController.processBetChangesAndCheckForUpdates(arrayList, true);
                List<BetModel> value = betsController.betsModel.getValue();
                List<BetModel> list = value;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (BetModel betModel : list) {
                        if (betModel.isDeleted() || !betModel.isAvailable()) {
                            z = true;
                            break;
                        }
                    }
                }
                if (processBetChangesAndCheckForUpdates) {
                    Log.d("BETSLIPTEST", "Data changed after verification - updating display only, not placing");
                    if (!z) {
                        betsController.showMessage(R.string.bet_coefficient_changed);
                    }
                    betsController.hideProgress();
                    return;
                }
                if (z) {
                    Log.d("BETSLIPTEST", "Bet deleted or unavailable after refresh - not placing, showing toast");
                    List<BetModel> list2 = value;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((BetModel) it2.next()).isDeleted()) {
                                betsController.showMessage(R.string.bet_removed);
                                break;
                            }
                        }
                    }
                    betsController.showMessage(R.string.bet_not_available);
                    betsController.hideProgress();
                    return;
                }
                Log.d("BETSLIPTEST", "No changes after verification - proceeding with placement");
                betsController.placeBetFunc();
            } catch (Exception e2) {
                Log.e("BETSLIPTEST", "Error processing bet changes: " + e2.getMessage(), e2);
                betsController.hideProgress();
                betsController.showMessage(R.string.error);
            }
        } catch (Exception e3) {
            Log.e("BETSLIPTEST", "Critical error in bet refresh callback: " + e3.getMessage(), e3);
            betsController.hideProgress();
            betsController.showMessage(R.string.error);
        }
    }

    static /* synthetic */ boolean processBetChangesAndCheckForUpdates$default(BetsController betsController, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return betsController.processBetChangesAndCheckForUpdates(list, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:365:0x06d7, code lost:
    
        if (r6.isEmpty() == false) goto L389;
     */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0638 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x060d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0832 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean processBetChangesAndCheckForUpdates(List<? extends GrabbedBetModel> bets, boolean placeBetVerification) {
        BetsController betsController;
        boolean z;
        Exception exc;
        List<BetModel> mutableList;
        List emptyList;
        List emptyList2;
        Exception exc2;
        BetSlipUiModel betSlipUiModel;
        int i;
        Boolean bool;
        int i2;
        Long l;
        Exception exc3;
        LinkedHashMap linkedHashMap;
        Iterator<? extends GrabbedBetModel> it;
        Exception exc4;
        long grabbedBetId;
        BetModel betModel;
        boolean z2;
        MatchDetailsDataModel match;
        Integer id;
        Long l2;
        Exception exc5;
        try {
            mutableList = CollectionsKt.toMutableList((Collection) this.betsModel.getValue());
        } catch (Exception e) {
            e = e;
            betsController = this;
            z = false;
        }
        if (mutableList.isEmpty()) {
            Log.d("BETSLIPTEST", "No bets to process");
            return false;
        }
        if (bets.isEmpty()) {
            Log.d("BETSLIPTEST", "No grabbed bets in response - marking all as unavailable, keeping in slip");
            boolean z3 = false;
            for (BetModel betModel2 : mutableList) {
                try {
                    if (!betModel2.isDeleted()) {
                        try {
                            betModel2.setDeleted(true);
                            z3 = true;
                        } catch (Exception e2) {
                            exc5 = e2;
                            z3 = true;
                            Integer.valueOf(Log.e("BETSLIPTEST", "Error marking bet as unavailable: " + exc5.getMessage(), exc5));
                        }
                    }
                    betModel2.setAvailable(false);
                    MatchDetailsBetDataModel bet = betModel2.getBet();
                    if (bet != null) {
                        bet.setIsAvailable(false);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e3) {
                    exc5 = e3;
                }
            }
            if (z3 && this.activity != null) {
                showMessage(R.string.bet_not_available);
            }
            updateBetDetails(CollectionsKt.toList(mutableList));
            this._betsModel.setValue(CollectionsKt.toList(mutableList));
            MutableStateFlow<List<BetSlipUiModel>> mutableStateFlow = this._betsUiModel;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = mutableList.iterator();
            while (it2.hasNext()) {
                BetSlipUiModel betSlipUiModel2 = UiExtensionsKt.toBetSlipUiModel((BetModel) it2.next(), null);
                if (betSlipUiModel2 != null) {
                    arrayList.add(betSlipUiModel2);
                }
            }
            mutableStateFlow.setValue(arrayList);
            try {
                getBetListAppender().syncBetslip(CollectionsKt.toList(mutableList));
                getBetListAppender().updateDisplay();
            } catch (Exception e4) {
                Log.e("BETSLIPTEST", "Error syncing betslip: " + e4.getMessage(), e4);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : mutableList) {
                MatchDetailsDataModel match2 = ((BetModel) obj).getMatch();
                if ((match2 != null ? match2.getId() : null) != null) {
                    arrayList2.add(obj);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : arrayList2) {
                MatchDetailsDataModel match3 = ((BetModel) obj2).getMatch();
                Intrinsics.checkNotNull(match3);
                Intrinsics.checkNotNull(match3.getId());
                Long valueOf = Long.valueOf(r7.intValue());
                Object obj3 = linkedHashMap2.get(valueOf);
                if (obj3 == null) {
                    obj3 = (List) new ArrayList();
                    linkedHashMap2.put(valueOf, obj3);
                }
                ((List) obj3).add(obj2);
            }
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                List list = (List) entry.getValue();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    MatchDetailsBetDataModel bet2 = ((BetModel) it3.next()).getBet();
                    if (bet2 == null || (l2 = bet2.getGrabbedBetId()) == null || l2.longValue() <= 0) {
                        l2 = null;
                    }
                    if (l2 != null) {
                        arrayList3.add(l2);
                    }
                }
                ArrayList arrayList4 = arrayList3;
                if (!arrayList4.isEmpty()) {
                    EventBus.getDefault().post(new BetlistUpdatedMessage(Long.valueOf(longValue), CollectionsKt.emptyList(), arrayList4));
                }
            }
            EventBus.getDefault().post(new CoefficientUpdatedMessage());
            return true;
        }
        Log.d("BETSLIPTEST", "Processing " + bets.size() + " grabbed bets against " + mutableList.size() + " current bets");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        for (BetModel betModel3 : mutableList) {
            try {
                if (betModel3.getBet() != null && betModel3.getGrabbedBetId() > 0) {
                    hashMap.put(Long.valueOf(betModel3.getGrabbedBetId()), betModel3);
                }
            } catch (Exception e5) {
                Integer.valueOf(Log.e("BETSLIPTEST", "Error adding bet to map: " + e5.getMessage(), e5));
            }
        }
        Iterator<? extends GrabbedBetModel> it4 = bets.iterator();
        boolean z4 = false;
        while (it4.hasNext()) {
            try {
                GrabbedBetModel next = it4.next();
                try {
                    grabbedBetId = next.getGrabbedBetId();
                    betModel = (BetModel) hashMap.get(Long.valueOf(grabbedBetId));
                } catch (Exception e6) {
                    e = e6;
                    linkedHashMap = linkedHashMap3;
                    it = it4;
                }
                if (betModel != null) {
                    if (betModel.getBet() == null) {
                        try {
                            Log.w("BETSLIPTEST", "Bet model has null bet data for id: " + grabbedBetId);
                        } catch (Exception e7) {
                            exc4 = e7;
                            linkedHashMap = linkedHashMap3;
                            it = it4;
                        }
                    } else {
                        Double initialCoefficientForBet = getBetListAppender().getInitialCoefficientForBet(grabbedBetId);
                        HashMap hashMap2 = hashMap;
                        try {
                            double formatTwoDecimals = UiExtensionsKt.formatTwoDecimals(initialCoefficientForBet != null ? initialCoefficientForBet.doubleValue() : betModel.getBet().getGrabbedCoeficient());
                            double formatTwoDecimals2 = UiExtensionsKt.formatTwoDecimals(betModel.getBet().getGrabbedCoeficient());
                            boolean z5 = z4;
                            try {
                                double formatTwoDecimals3 = UiExtensionsKt.formatTwoDecimals(next.getGrabbedCoefficient());
                                it = it4;
                                if (formatTwoDecimals == formatTwoDecimals3) {
                                    try {
                                        betModel.setStatus(BetModel.stat.NONE);
                                        linkedHashMap = linkedHashMap3;
                                        try {
                                            Log.d("BETSLIPTEST", "Coefficient unchanged (within tolerance): " + formatTwoDecimals + " for bet " + grabbedBetId);
                                        } catch (Exception e8) {
                                            e = e8;
                                            z4 = z5;
                                            exc4 = e;
                                            hashMap = hashMap2;
                                            Integer.valueOf(Log.e("BETSLIPTEST", "Error processing grabbed bet: " + exc4.getMessage(), exc4));
                                            linkedHashMap3 = linkedHashMap;
                                            it4 = it;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        linkedHashMap = linkedHashMap3;
                                    }
                                } else {
                                    linkedHashMap = linkedHashMap3;
                                    if (formatTwoDecimals > formatTwoDecimals3) {
                                        boolean z6 = !placeBetVerification ? true : z5;
                                        try {
                                            betModel.setStatus(BetModel.stat.DECREASED);
                                            z5 = z6;
                                            Log.d("BETSLIPTEST", "Coefficient decreased: " + formatTwoDecimals + " -> " + formatTwoDecimals3 + " for bet " + grabbedBetId);
                                        } catch (Exception e10) {
                                            e = e10;
                                            z5 = z6;
                                            z4 = z5;
                                            exc4 = e;
                                            hashMap = hashMap2;
                                            Integer.valueOf(Log.e("BETSLIPTEST", "Error processing grabbed bet: " + exc4.getMessage(), exc4));
                                            linkedHashMap3 = linkedHashMap;
                                            it4 = it;
                                        }
                                    } else {
                                        boolean z7 = !placeBetVerification ? true : z5;
                                        try {
                                            betModel.setStatus(BetModel.stat.INCREASED);
                                            z5 = z7;
                                        } catch (Exception e11) {
                                            e = e11;
                                            z5 = z7;
                                        }
                                        try {
                                            Log.d("BETSLIPTEST", "Coefficient increased: " + formatTwoDecimals + " -> " + formatTwoDecimals3 + " for bet " + grabbedBetId);
                                        } catch (Exception e12) {
                                            e = e12;
                                            hashMap = hashMap2;
                                            z4 = z5;
                                            exc4 = e;
                                            Integer.valueOf(Log.e("BETSLIPTEST", "Error processing grabbed bet: " + exc4.getMessage(), exc4));
                                            linkedHashMap3 = linkedHashMap;
                                            it4 = it;
                                        }
                                    }
                                }
                                boolean z8 = z5;
                                if (placeBetVerification && formatTwoDecimals2 != formatTwoDecimals3) {
                                    z8 = true;
                                }
                                try {
                                    betModel.getBet().setBetGroup(next.getBetTypeGroup());
                                    betModel.getBet().setGrabbedCoeficient(formatTwoDecimals3);
                                    betModel.getBet().setIsAvailable(Boolean.valueOf(next.isAvailable()));
                                    boolean isAvailable = next.isAvailable();
                                    if (isAvailable != betModel.isAvailable()) {
                                        try {
                                            betModel.setAvailable(next.isAvailable());
                                            Integer.valueOf(Log.d("BETSLIPTEST", "Availability changed: " + betModel.isAvailable() + " -> " + isAvailable + " for bet " + grabbedBetId));
                                            z2 = false;
                                            z4 = true;
                                        } catch (Exception e13) {
                                            exc4 = e13;
                                            hashMap = hashMap2;
                                            z4 = true;
                                        }
                                    } else {
                                        betModel.setAvailable(next.isAvailable());
                                        Unit unit2 = Unit.INSTANCE;
                                        z4 = z8;
                                        z2 = false;
                                    }
                                    try {
                                        betModel.setDeleted(z2);
                                        hashMap = hashMap2;
                                    } catch (Exception e14) {
                                        e = e14;
                                        hashMap = hashMap2;
                                        exc4 = e;
                                        Integer.valueOf(Log.e("BETSLIPTEST", "Error processing grabbed bet: " + exc4.getMessage(), exc4));
                                        linkedHashMap3 = linkedHashMap;
                                        it4 = it;
                                    }
                                    try {
                                        hashMap.remove(Long.valueOf(grabbedBetId));
                                        if (!next.isAvailable() && (match = betModel.getMatch()) != null && (id = match.getId()) != null) {
                                            Long valueOf2 = Long.valueOf(id.intValue());
                                            Object obj4 = linkedHashMap4.get(valueOf2);
                                            if (obj4 == null) {
                                                obj4 = (List) new ArrayList();
                                                linkedHashMap4.put(valueOf2, obj4);
                                            }
                                            ((List) obj4).add(Long.valueOf(grabbedBetId));
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        exc4 = e;
                                        Integer.valueOf(Log.e("BETSLIPTEST", "Error processing grabbed bet: " + exc4.getMessage(), exc4));
                                        linkedHashMap3 = linkedHashMap;
                                        it4 = it;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    hashMap = hashMap2;
                                    z4 = z8;
                                }
                            } catch (Exception e17) {
                                e = e17;
                                linkedHashMap = linkedHashMap3;
                                it = it4;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            linkedHashMap = linkedHashMap3;
                            it = it4;
                        }
                        linkedHashMap3 = linkedHashMap;
                        it4 = it;
                    }
                    Integer.valueOf(Log.e("BETSLIPTEST", "Error processing grabbed bet: " + exc4.getMessage(), exc4));
                    linkedHashMap3 = linkedHashMap;
                    it4 = it;
                }
            } catch (Exception e19) {
                e = e19;
                betsController = this;
                exc = e;
                z = false;
                Log.e("BETSLIPTEST", "Critical error in processBetChangesAndCheckForUpdates: " + exc.getMessage(), exc);
                betsController.showMessage(R.string.error);
                return z;
            }
        }
        LinkedHashMap linkedHashMap5 = linkedHashMap3;
        boolean z9 = z4;
        try {
            boolean z10 = z9;
            for (BetModel betModel4 : mutableList) {
                try {
                    if (hashMap.containsKey(Long.valueOf(betModel4.getGrabbedBetId()))) {
                        betModel4.setAvailable(false);
                        MatchDetailsBetDataModel bet3 = betModel4.getBet();
                        if (bet3 != null) {
                            bet3.setIsAvailable(false);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        if (!betModel4.isDeleted()) {
                            try {
                                betModel4.setDeleted(true);
                                Log.d("BETSLIPTEST", "Bet marked as deleted (not in response): " + betModel4.getGrabbedBetId());
                                z10 = true;
                            } catch (Exception e20) {
                                exc3 = e20;
                                z10 = true;
                                Integer.valueOf(Log.e("BETSLIPTEST", "Error marking bet as deleted: " + exc3.getMessage(), exc3));
                            }
                        }
                    }
                } catch (Exception e21) {
                    exc3 = e21;
                }
            }
            Set keySet = hashMap.keySet();
            Collection values = hashMap.values();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : values) {
                MatchDetailsDataModel match4 = ((BetModel) obj5).getMatch();
                if ((match4 != null ? match4.getId() : null) != null) {
                    arrayList5.add(obj5);
                }
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            for (Object obj6 : arrayList5) {
                MatchDetailsDataModel match5 = ((BetModel) obj6).getMatch();
                Intrinsics.checkNotNull(match5);
                Intrinsics.checkNotNull(match5.getId());
                Long valueOf3 = Long.valueOf(r8.intValue());
                Object obj7 = linkedHashMap6.get(valueOf3);
                if (obj7 == null) {
                    obj7 = (List) new ArrayList();
                    linkedHashMap6.put(valueOf3, obj7);
                }
                ((List) obj7).add(obj6);
            }
            for (Map.Entry entry2 : linkedHashMap6.entrySet()) {
                long longValue2 = ((Number) entry2.getKey()).longValue();
                List list2 = (List) entry2.getValue();
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    MatchDetailsBetDataModel bet4 = ((BetModel) it5.next()).getBet();
                    if (bet4 != null && (l = bet4.getGrabbedBetId()) != null) {
                        if (l.longValue() > 0) {
                            if (l == null) {
                                arrayList6.add(l);
                            }
                        }
                    }
                    l = null;
                    if (l == null) {
                    }
                }
                ArrayList arrayList7 = arrayList6;
                if (!arrayList7.isEmpty()) {
                    Long valueOf4 = Long.valueOf(longValue2);
                    Object obj8 = linkedHashMap4.get(valueOf4);
                    if (obj8 == null) {
                        obj8 = (List) new ArrayList();
                        linkedHashMap4.put(valueOf4, obj8);
                    }
                    ((List) obj8).addAll(arrayList7);
                }
            }
            if (!keySet.isEmpty()) {
                Log.d("BETSLIPTEST", "Bet(s) not in response - marking as unavailable in list: " + keySet);
            }
            Log.d("BETSLIPTEST", "Total changes detected: " + z10);
            if (z10) {
                try {
                    EventBus.getDefault().post(new CoefficientUpdatedMessage());
                    Log.d("BETSLIPTEST", "Posted CoefficientUpdatedMessage to EventBus");
                } catch (Exception e22) {
                    Log.e("BETSLIPTEST", "Error posting CoefficientUpdatedMessage: " + e22.getMessage(), e22);
                }
            }
            if (linkedHashMap5.isEmpty()) {
            }
            try {
                Iterator it6 = CollectionsKt.distinct(SetsKt.plus(linkedHashMap5.keySet(), (Iterable) linkedHashMap4.keySet())).iterator();
                while (it6.hasNext()) {
                    long longValue3 = ((Number) it6.next()).longValue();
                    LinkedHashMap linkedHashMap7 = linkedHashMap5;
                    List list3 = (List) linkedHashMap7.get(Long.valueOf(longValue3));
                    if (list3 == null || (emptyList = CollectionsKt.distinct(list3)) == null) {
                        emptyList = CollectionsKt.emptyList();
                    }
                    List list4 = (List) linkedHashMap4.get(Long.valueOf(longValue3));
                    if (list4 == null || (emptyList2 = CollectionsKt.distinct(list4)) == null) {
                        emptyList2 = CollectionsKt.emptyList();
                    }
                    EventBus.getDefault().post(new BetlistUpdatedMessage(Long.valueOf(longValue3), emptyList, emptyList2));
                    linkedHashMap5 = linkedHashMap7;
                }
                Log.d("BETSLIPTEST", "Posted BetlistUpdatedMessage: removed=" + linkedHashMap5.keySet() + ", unavailable=" + linkedHashMap4.keySet());
            } catch (Exception e23) {
                Log.e("BETSLIPTEST", "Error posting BetlistUpdatedMessage: " + e23.getMessage(), e23);
            }
            if (z10) {
                betsController = this;
                try {
                    if (betsController.activity != null) {
                        try {
                            int size = keySet.size();
                            List<BetModel> list5 = mutableList;
                            if ((list5 instanceof Collection) && list5.isEmpty()) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                                for (BetModel betModel5 : list5) {
                                    if (!betModel5.isAvailable() && !betModel5.isDeleted() && (i2 = i2 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                            if (size > 0) {
                                betsController.showMessage(R.string.bet_removed);
                            } else if (i2 > 0) {
                                betsController.showMessage(R.string.bet_not_available);
                            }
                        } catch (Exception e24) {
                            Integer.valueOf(Log.e("BETSLIPTEST", "Error showing toast: " + e24.getMessage(), e24));
                        }
                    }
                } catch (Exception e25) {
                    e = e25;
                    exc = e;
                    z = false;
                    Log.e("BETSLIPTEST", "Critical error in processBetChangesAndCheckForUpdates: " + exc.getMessage(), exc);
                    betsController.showMessage(R.string.error);
                    return z;
                }
            } else {
                betsController = this;
            }
            try {
                betsController.updateBetDetails(CollectionsKt.toList(mutableList));
                betsController._betsModel.setValue(CollectionsKt.toList(mutableList));
                MutableStateFlow<List<BetSlipUiModel>> mutableStateFlow2 = betsController._betsUiModel;
                ArrayList arrayList8 = new ArrayList();
                for (BetModel betModel6 : mutableList) {
                    try {
                        BetModel.stat status = betModel6.getStatus();
                        i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$3[status.ordinal()];
                    } catch (Exception e26) {
                        e = e26;
                        z = false;
                    }
                    if (i == -1) {
                        z = false;
                    } else if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                z = false;
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                            try {
                                bool = false;
                            } catch (Exception e27) {
                                exc2 = e27;
                            }
                            exc2 = e27;
                            Log.e("BETSLIPTEST", "Error converting bet to UI model: " + exc2.getMessage(), exc2);
                            betSlipUiModel = null;
                            if (betSlipUiModel == null) {
                                try {
                                    arrayList8.add(betSlipUiModel);
                                } catch (Exception e28) {
                                    e = e28;
                                    Exception exc6 = e;
                                    try {
                                        Integer.valueOf(Log.e("BETSLIPTEST", "Error updating bet details: " + exc6.getMessage(), exc6));
                                        return z10;
                                    } catch (Exception e29) {
                                        e = e29;
                                    }
                                }
                            }
                        } else {
                            z = false;
                            try {
                                bool = true;
                            } catch (Exception e30) {
                                e = e30;
                                exc2 = e;
                                Log.e("BETSLIPTEST", "Error converting bet to UI model: " + exc2.getMessage(), exc2);
                                betSlipUiModel = null;
                                if (betSlipUiModel == null) {
                                }
                            }
                        }
                        betSlipUiModel = UiExtensionsKt.toBetSlipUiModel(betModel6, bool);
                        if (betSlipUiModel == null) {
                        }
                    } else {
                        z = false;
                    }
                    bool = null;
                    betSlipUiModel = UiExtensionsKt.toBetSlipUiModel(betModel6, bool);
                    if (betSlipUiModel == null) {
                    }
                }
                z = false;
                mutableStateFlow2.setValue(arrayList8);
                try {
                    getBetListAppender().syncBetslip(CollectionsKt.toList(mutableList));
                    Unit unit4 = Unit.INSTANCE;
                } catch (Exception e31) {
                    Integer.valueOf(Log.e("BETSLIPTEST", "Error syncing betslip after update: " + e31.getMessage(), e31));
                }
            } catch (Exception e32) {
                e = e32;
                z = false;
            }
            return z10;
        } catch (Exception e33) {
            e = e33;
            betsController = this;
            z = false;
        }
        e = e;
        betsController = this;
        z = false;
        exc = e;
        Log.e("BETSLIPTEST", "Critical error in processBetChangesAndCheckForUpdates: " + exc.getMessage(), exc);
        betsController.showMessage(R.string.error);
        return z;
    }

    public final void removeAllBetsFromSlip() {
        Long l;
        try {
            List<BetModel> value = this.betsModel.getValue();
            if (value.isEmpty()) {
                return;
            }
            updateBetDetails(CollectionsKt.emptyList());
            getBetListAppender().syncBetslip(CollectionsKt.emptyList());
            getBetListAppender().updateDisplay();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                MatchDetailsDataModel match = ((BetModel) next).getMatch();
                if ((match != null ? match.getId() : null) != null) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                MatchDetailsDataModel match2 = ((BetModel) obj).getMatch();
                Intrinsics.checkNotNull(match2);
                Intrinsics.checkNotNull(match2.getId());
                Long valueOf = Long.valueOf(r6.intValue());
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = (List) new ArrayList();
                    linkedHashMap.put(valueOf, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                List list = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    MatchDetailsBetDataModel bet = ((BetModel) it2.next()).getBet();
                    if (bet == null || (l = bet.getGrabbedBetId()) == null || l.longValue() <= 0) {
                        l = null;
                    }
                    if (l != null) {
                        arrayList2.add(l);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    EventBus.getDefault().post(new BetlistUpdatedMessage(Long.valueOf(longValue), arrayList3, CollectionsKt.emptyList()));
                } else {
                    EventBus.getDefault().post(new BetlistUpdatedMessage(Long.valueOf(longValue)));
                }
            }
            EventBus.getDefault().post(new CoefficientUpdatedMessage());
            Log.d("BETSLIPTEST", "Removed all " + value.size() + " bet(s) from slip on exit");
        } catch (Exception e) {
            Log.e("BETSLIPTEST", "Error removing all bets: " + e.getMessage(), e);
        }
    }

    public final void removeInvalidBetsFromSlip() {
        Integer id;
        try {
            List<BetModel> value = this.betsModel.getValue();
            if (value.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                BetModel betModel = (BetModel) obj;
                if (betModel.isAvailable() && !betModel.isDeleted()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.size() == value.size()) {
                return;
            }
            updateBetDetails(arrayList2);
            getBetListAppender().syncBetslip(arrayList2);
            getBetListAppender().updateDisplay();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : value) {
                BetModel betModel2 = (BetModel) obj2;
                if (!betModel2.isAvailable() || betModel2.isDeleted()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                MatchDetailsDataModel match = ((BetModel) it.next()).getMatch();
                Long valueOf = (match == null || (id = match.getId()) == null) ? null : Long.valueOf(id.intValue());
                if (valueOf != null) {
                    arrayList4.add(valueOf);
                }
            }
            Iterator it2 = CollectionsKt.distinct(arrayList4).iterator();
            while (it2.hasNext()) {
                EventBus.getDefault().post(new BetlistUpdatedMessage(Long.valueOf(((Number) it2.next()).longValue())));
            }
            EventBus.getDefault().post(new CoefficientUpdatedMessage());
            Log.d("BETSLIPTEST", "Removed " + (value.size() - arrayList2.size()) + " invalid bet(s) on dismiss");
        } catch (Exception e) {
            Log.e("BETSLIPTEST", "Error removing invalid bets: " + e.getMessage(), e);
        }
    }

    public final void singleBetRemoved(final long graddebBetId) {
        this._isLoadingBetSlip.setValue(true);
        getBetListAppender().removeBet(graddebBetId);
        List<? extends BetModel> mutableList = CollectionsKt.toMutableList((Collection) this.betsModel.getValue());
        CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean singleBetRemoved$lambda$74;
                singleBetRemoved$lambda$74 = BetsController.singleBetRemoved$lambda$74(graddebBetId, (BetModel) obj);
                return Boolean.valueOf(singleBetRemoved$lambda$74);
            }
        });
        updateBetDetails(mutableList);
        getGrabbedBetsInteractor().invalidate(CollectionsKt.emptyList());
        List<? extends BetModel> list = mutableList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BetModel) it.next()).getBet().getGrabbedBetId());
        }
        getGrabbedBetsInteractor().load(this.onGrabbetBetFetched, arrayList);
        this._isLoadingBetSlip.setValue(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean singleBetRemoved$lambda$74(long j, BetModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Long grabbedBetId = it.getBet().getGrabbedBetId();
        return grabbedBetId != null && grabbedBetId.longValue() == j;
    }

    public final void inviteUserToBattleClick() {
        EventBus.getDefault().post(new OpenFollowersDialogForBattleEvent(getUserService().getBetupUserIdOrZero()));
    }

    public final void onBattleOpponentSelected(long id, String name, String photoUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        this._battleOpponent.setValue(new BattleOpponent(id, name, photoUrl));
    }

    public final void clearBattleOpponent() {
        this._battleOpponent.setValue(null);
    }

    public final void challengeClick() {
        MatchDetailsBetGroupModel betGroup;
        try {
            if (this.activity == null) {
                Log.e("BETSLIPTEST", "Activity is null, cannot create challenge");
                return;
            }
            BetModel betModel = (BetModel) CollectionsKt.firstOrNull((List) this.betsModel.getValue());
            if (betModel == null) {
                BetsController betsController = this;
                showMessage(R.string.betslip_no_bets_in_list);
                return;
            }
            if (betModel.isDeleted()) {
                showMessage(R.string.bet_removed);
                return;
            }
            if (!betModel.isAvailable()) {
                showMessage(R.string.bet_not_available);
                return;
            }
            MatchDetailsBetDataModel bet = betModel.getBet();
            UnlockBetTypesFlow unlockBetTypesFlow = null;
            if (bet != null && (betGroup = bet.getBetGroup()) != null && !betGroup.isAvailable()) {
                try {
                    UnlockBetTypesFlow unlockBetTypesFlow2 = this.unlockBetTypesFlow;
                    if (unlockBetTypesFlow2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("unlockBetTypesFlow");
                    } else {
                        unlockBetTypesFlow = unlockBetTypesFlow2;
                    }
                    unlockBetTypesFlow.start(this, new String[0]);
                    return;
                } catch (Exception e) {
                    Log.e("BETSLIPTEST", "Error starting unlock flow: " + e.getMessage(), e);
                    showMessage(R.string.error);
                    return;
                }
            }
            MatchDetailsDataModel match = betModel.getMatch();
            if (match == null) {
                BetsController betsController2 = this;
                showMessage(R.string.error_missing_data);
                return;
            }
            MatchDetailsBetDataModel bet2 = betModel.getBet();
            if (bet2 == null) {
                BetsController betsController3 = this;
                showMessage(R.string.error_missing_data);
                return;
            }
            Long grabbedBetId = bet2.getGrabbedBetId();
            if (grabbedBetId == null) {
                BetsController betsController4 = this;
                showMessage(R.string.error_missing_data);
                return;
            }
            long longValue = grabbedBetId.longValue();
            MatchState state = match.getState();
            if (state != null && state.ordinal() == MatchState.LIVE.ordinal()) {
                showMessage(R.string.bet_not_available);
                return;
            }
            long max = Math.max(500L, getEffectiveMinBetSize());
            long longValue2 = this.amount.getValue().longValue();
            if (longValue2 < max) {
                showMessage(R.string.min_bet_required);
                return;
            }
            if (hasInsufficientBalanceForStake(longValue2)) {
                notifyNotEnoughBetcoinsVideoOffer$default(this, 0L, 1, null);
                return;
            }
            BattleOpponent value = this._battleOpponent.getValue();
            Long valueOf = value != null ? Long.valueOf(value.getId()) : null;
            NewCreateChallengeModel newCreateChallengeModel = valueOf == null ? new NewCreateChallengeModel(longValue2, longValue, false, CollectionsKt.emptyList()) : new NewCreateChallengeModel(longValue2, longValue, true, CollectionsKt.listOf(valueOf));
            displayProgress();
            this._battleCreateResult.setValue(null);
            getChallengeCreateInteractor().load((BaseCachedSharedInteractor.OnFetchedListener<T, BaseCachedSharedInteractor.OnFetchedListener>) new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda6
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    BetsController.challengeClick$lambda$82(BetsController.this, fetchedResponseMessage);
                }
            }, (BaseCachedSharedInteractor.OnFetchedListener) newCreateChallengeModel);
        } catch (Exception e2) {
            hideProgress();
            this._battleCreateResult.setValue(BattleCreateResult.Error.INSTANCE);
            Log.e("BETSLIPTEST", "Critical error in challengeClick: " + e2.getMessage(), e2);
            showMessage(R.string.error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void challengeClick$lambda$82(BetsController betsController, FetchedResponseMessage fetchedResponseMessage) {
        betsController.hideProgress();
        if (Intrinsics.areEqual(fetchedResponseMessage.getStat().name(), "SUCCESS")) {
            NewChallengeCreatedModel newChallengeCreatedModel = (NewChallengeCreatedModel) fetchedResponseMessage.getModel();
            if ((newChallengeCreatedModel != null ? Long.valueOf(newChallengeCreatedModel.getId()) : null) != null) {
                final long id = ((NewChallengeCreatedModel) fetchedResponseMessage.getModel()).getId();
                betsController._battleCreateResult.setValue(BattleCreateResult.Success.INSTANCE);
                Log.d("BETSLIPTEST", "Battle created from Quick Bet: " + id);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BetsController.challengeClick$lambda$82$lambda$80(id);
                    }
                }, 500L);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BetsController.challengeClick$lambda$82$lambda$81();
                    }
                }, 3000L);
                betsController.clearBattleOpponent();
                try {
                    betsController.onDismiss.invoke();
                    Unit unit = Unit.INSTANCE;
                    return;
                } catch (Exception e) {
                    Integer.valueOf(Log.e("BETSLIPTEST", "Error dismissing after battle create: " + e.getMessage(), e));
                    return;
                }
            }
        }
        betsController._battleCreateResult.setValue(BattleCreateResult.Error.INSTANCE);
        Log.e("BETSLIPTEST", "Failed to create battle from Quick Bet: " + fetchedResponseMessage.getStat());
        betsController.showMessage(R.string.battles_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void challengeClick$lambda$82$lambda$80(long j) {
        EventBus.getDefault().post(new ChallengeAcceptedOrCreatedEvent(Long.valueOf(j)));
        EventBus.getDefault().post(new OpenChallengePreviewDialog(Integer.valueOf((int) j), null, 2, null));
        EventBus.getDefault().post(new ChallengesChangedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void challengeClick$lambda$82$lambda$81() {
        EventBus.getDefault().post(new UserProfileUpdatedMessage());
    }

    private final void showUnlockMaxDialog() {
        UnlockBetAmountFlow unlockBetAmountFlow = this.unlockBetAmountFlow;
        if (unlockBetAmountFlow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("unlockBetAmountFlow");
            unlockBetAmountFlow = null;
        }
        unlockBetAmountFlow.start(this, new String[0]);
    }

    public final void buyBetcoinsInternal() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("tab", ShopDialogFragment.Tab.PACKS);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.SHOP, bundle));
    }

    public final void reloadBetsHistory() {
        this.currentOffset = this.DEFAULT_OFFSET_HISTORY_ITEMS;
        this._isLoadingBetsHistory.setValue(true);
        this.max = false;
        this._hasMoreHistoryBets.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.DEFAULT_OFFSET_HISTORY_ITEMS);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.DEFAULT_LIMIT_HISTORY_ITEMS);
        Bundle bundle2 = new Bundle();
        Integer id = getUserService().getShortProfile().getUserModel().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        bundle2.putInt("userId", id.intValue());
        getBetsStatInteractor().invalidate(null);
        getBetsListInteractor().invalidate();
        getBetsListInteractor().load(this, this.betFilterState.getValue(), bundle);
        getBetsStatInteractor().load(this.betStatsListener, null, bundle2);
    }

    public final void fetchCancelSellInfo(long betlistId) {
        this._cancelBetInfo.setValue(null);
        this._sellBetInfo.setValue(null);
        getGetCancelBetInfoInteractor().invalidate(betlistId);
        getGetSellBetInfoInteractor().invalidate(betlistId);
        getGetCancelBetInfoInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetsController.fetchCancelSellInfo$lambda$85(BetsController.this, fetchedResponseMessage);
            }
        }, Long.valueOf(betlistId), null);
        getGetSellBetInfoInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                BetsController.fetchCancelSellInfo$lambda$86(BetsController.this, fetchedResponseMessage);
            }
        }, Long.valueOf(betlistId), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fetchCancelSellInfo$lambda$85(BetsController betsController, FetchedResponseMessage fetchedResponseMessage) {
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS) {
            betsController._cancelBetInfo.setValue(fetchedResponseMessage.getModel());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fetchCancelSellInfo$lambda$86(BetsController betsController, FetchedResponseMessage fetchedResponseMessage) {
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) == FetchStat.SUCCESS) {
            betsController._sellBetInfo.setValue(fetchedResponseMessage.getModel());
        }
    }

    public final void fetchBetShareInstallLink(long betlistId, final Function1<? super String, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        final MainActivity mainActivity = this.activity;
        GetBetShareInstallLinkInteractorExtKt.fetchBetInstallUrl(getGetBetShareInstallLinkInteractor(), betlistId, new Function1() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit fetchBetShareInstallLink$lambda$87;
                fetchBetShareInstallLink$lambda$87 = BetsController.fetchBetShareInstallLink$lambda$87(MainActivity.this, (Runnable) obj);
                return fetchBetShareInstallLink$lambda$87;
            }
        }, new Function1() { // from class: org.betup.ui.fragment.bets.BetsController$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit fetchBetShareInstallLink$lambda$88;
                fetchBetShareInstallLink$lambda$88 = BetsController.fetchBetShareInstallLink$lambda$88(Function1.this, mainActivity, (String) obj);
                return fetchBetShareInstallLink$lambda$88;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchBetShareInstallLink$lambda$87(MainActivity mainActivity, Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (mainActivity != null) {
            mainActivity.runOnUiThread(runnable);
        } else {
            runnable.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchBetShareInstallLink$lambda$88(Function1 function1, MainActivity mainActivity, String str) {
        if (mainActivity == null) {
            str = null;
        }
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public final void cancelBet(long betlistId, final Function0<Unit> onSuccess, final Function1<? super Integer, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        getCancelBetInteractor().cancelBet(new BaseCachedSharedInteractor.OnFetchedListener<BetsListModel, Long>() { // from class: org.betup.ui.fragment.bets.BetsController$cancelBet$1

            /* compiled from: BetsController.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FetchStat.values().length];
                    try {
                        iArr[FetchStat.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<BetsListModel, Long> response) {
                FetchStat stat = response != null ? response.getStat() : null;
                if ((stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) == 1) {
                    BetsController.this.reloadBetsHistory();
                    EventBus.getDefault().post(new BetlistUpdatedMessage());
                    EventBus.getDefault().post(new UserProfileUpdatedMessage());
                    onSuccess.invoke();
                    return;
                }
                onError.invoke(Integer.valueOf(R.string.error));
            }
        }, betlistId);
    }

    public final void sellBet(long betlistId, double sellCoefficient, final Function0<Unit> onSuccess, final Function1<? super Integer, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        getSellBetInteractor().sellBet(new BaseCachedSharedInteractor.OnFetchedListener<SellBetResultModel, SellBetParams>() { // from class: org.betup.ui.fragment.bets.BetsController$sellBet$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<SellBetResultModel, SellBetParams> response) {
                int stringResForSellBetFailure;
                SellBetResultModel model;
                if ((response != null ? response.getStat() : null) == FetchStat.SUCCESS && (model = response.getModel()) != null && model.isSellSuccessful()) {
                    BetsController.this.reloadBetsHistory();
                    EventBus.getDefault().post(new BetlistUpdatedMessage());
                    EventBus.getDefault().post(new UserProfileUpdatedMessage());
                    onSuccess.invoke();
                    return;
                }
                Function1<Integer, Unit> function1 = onError;
                stringResForSellBetFailure = BetsController.this.stringResForSellBetFailure(response != null ? response.getStat() : null, response != null ? response.getModel() : null);
                function1.invoke(Integer.valueOf(stringResForSellBetFailure));
            }
        }, betlistId, sellCoefficient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int stringResForSellBetFailure(FetchStat stat, SellBetResultModel model) {
        switch (stat == null ? -1 : WhenMappings.$EnumSwitchMapping$4[stat.ordinal()]) {
            case -1:
            case 8:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                return R.string.conection_internet_failed;
            case 4:
                return R.string.should_login_first;
            case 5:
                return R.string.sell_bet_error_not_found;
            case 6:
                return R.string.sell_bet_not_available;
            case 7:
                if (model != null) {
                    if (!model.isSellAvailable()) {
                        return R.string.sell_bet_not_available;
                    }
                    if (!model.isSellSuccessful()) {
                        return R.string.sell_bet_quote_changed;
                    }
                }
                break;
        }
        return R.string.sell_bet_error_try_later;
    }

    public final void loadBetsHistory() {
        Log.d("BetsController", "loadBetsHistory called - max=" + this.max + ", isLoadMore=" + this._isLoadMoreHistoryBets.getValue() + ", currentOffset=" + this.currentOffset);
        if (!this.max && !this._isLoadMoreHistoryBets.getValue().booleanValue()) {
            Log.d("BetsController", "Loading more bets - offset=" + this.currentOffset);
            this._isLoadMoreHistoryBets.setValue(true);
            Bundle bundle = new Bundle();
            bundle.putInt("offset", this.currentOffset);
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.DEFAULT_LIMIT_HISTORY_ITEMS);
            getBetsListInteractor().load(this, this.betFilterState.getValue(), bundle);
            return;
        }
        Log.d("BetsController", "NOT loading more - max=" + this.max + ", isLoadMore=" + this._isLoadMoreHistoryBets.getValue());
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<BetsResponseModel, BetState> responseMessage) {
        LinkedHashSet linkedHashSet;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putStringSet;
        String str;
        BetsPlaceModel betsPlaceModel;
        MatchDetailsDataModel sportMatch;
        Integer id;
        UserProgressModel userProgressModel;
        Set<String> stringSet;
        Log.d("BetsController", "onFetched called - currentOffset before=" + this.currentOffset);
        this._isLoadingBetsHistory.setValue(false);
        this._isLoadMoreHistoryBets.setValue(false);
        if ((responseMessage != null ? responseMessage.getStat() : null) != FetchStat.SUCCESS) {
            Log.e("BetsController", "onFetched - FAILED response");
            showMessage(R.string.invalid_server_response);
            return;
        }
        BetsResponseModel model = responseMessage.getModel();
        if (model == null) {
            return;
        }
        List<BetsListModel> betlists = model.getBetlists();
        if (betlists == null) {
            betlists = CollectionsKt.emptyList();
        }
        Log.d("BetsController", "onFetched - received " + betlists.size() + " bets, currentOffset=" + this.currentOffset);
        this.currentOffset += this.DEFAULT_LIMIT_HISTORY_ITEMS;
        boolean isEmpty = betlists.isEmpty();
        this.max = isEmpty;
        this._hasMoreHistoryBets.setValue(Boolean.valueOf(!isEmpty));
        int i = this.currentOffset;
        boolean z = this.max;
        Log.d("BetsController", "onFetched - newOffset=" + i + ", max=" + z + ", hasMore=" + (!z) + ", currentListSize=" + this._betList.getValue().size());
        if (this.currentOffset == this.DEFAULT_LIMIT_HISTORY_ITEMS) {
            this._betList.setValue(CollectionsKt.emptyList());
            Log.d("BetsController", "onFetched - Cleared list (first load)");
        }
        MutableStateFlow<List<BetsListModel>> mutableStateFlow = this._betList;
        mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) betlists));
        try {
            MainActivity mainActivity = this.activity;
            SharedPreferences sharedPreferences = mainActivity != null ? mainActivity.getSharedPreferences("analytics", 0) : null;
            if (sharedPreferences == null || (stringSet = sharedPreferences.getStringSet("logged_bet_result_ids", new LinkedHashSet())) == null || (linkedHashSet = CollectionsKt.toMutableSet(stringSet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            FullUserProfileModel value = this.profileModel.getValue();
            int moneyBalance = (value == null || (userProgressModel = value.getUserProgressModel()) == null) ? 0 : (int) userProgressModel.getMoneyBalance();
            for (BetsListModel betsListModel : betlists) {
                if (betsListModel.getState() == BetState.WON || betsListModel.getState() == BetState.LOST) {
                    if (!linkedHashSet.contains(betsListModel.getId().toString())) {
                        List<BetsPlaceModel> placedBets = betsListModel.getPlacedBets();
                        if (placedBets == null || (betsPlaceModel = (BetsPlaceModel) CollectionsKt.firstOrNull((List) placedBets)) == null || (sportMatch = betsPlaceModel.getSportMatch()) == null || (id = sportMatch.getId()) == null || (str = id.toString()) == null) {
                            str = "";
                        }
                        AnalyticsHelper.INSTANCE.logBetResult(str, betsListModel.getState() == BetState.WON, betsListModel.getState() == BetState.WON ? (int) (betsListModel.getMoneyReturned() - betsListModel.getMoneyPlaced()) : -((int) betsListModel.getMoneyPlaced()), moneyBalance);
                        linkedHashSet.add(betsListModel.getId().toString());
                    }
                }
            }
            if (!linkedHashSet.isEmpty() && sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putStringSet = edit.putStringSet("logged_bet_result_ids", linkedHashSet)) != null) {
                putStringSet.apply();
            }
        } catch (Exception e) {
            Log.e("BETSLIPTEST", "Error logging bet_result analytics: " + e.getMessage(), e);
        }
        Log.d("BetsController", "onFetched - received size=" + betlists.size() + ", totalListSize=" + this._betList.getValue().size());
        if (this.displayTour) {
            this.displayTour = false;
            showTourIfAvailable();
        }
    }

    private final void showTourIfAvailable() {
        if (!this.betList.getValue().isEmpty()) {
            EventBus eventBus = EventBus.getDefault();
            TourMessage.Builder position = new TourMessage.Builder(Tour.MY_BETS).setSign(TourHelperSign.Ok).setPosition(TourHelperPosition.Center);
            MainActivity mainActivity = this.activity;
            TourMessage.Builder title = position.setTitle(mainActivity != null ? mainActivity.getString(R.string.tour_my_bet_title) : null);
            MainActivity mainActivity2 = this.activity;
            eventBus.post(title.setSubtitle(mainActivity2 != null ? mainActivity2.getString(R.string.tour_my_bet_desc) : null).setStyle(Overlay.Style.RECTANGLE).build());
            return;
        }
        this.displayTour = true;
    }

    public final void onChildClick(MatchDetailsDataModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getState() != MatchState.CANCELED) {
            Bundle bundle = new Bundle();
            Integer id = model.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            bundle.putInt("matchId", id.intValue());
            bundle.putBoolean("isLive", model.getState() == MatchState.LIVE);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
            return;
        }
        showMessage(R.string.match_not_available);
    }

    public static /* synthetic */ void setFilterState$default(BetsController betsController, BetState betState, int i, Object obj) {
        if ((i & 1) != 0) {
            betState = null;
        }
        betsController.setFilterState(betState);
    }

    public final void setFilterState(BetState selectedState) {
        if (selectedState != null) {
            this._betFilterState.setValue(selectedState);
            reloadBetsHistory();
        }
    }

    @Override // org.betup.ui.ProgressDisplay
    public void displayProgress() {
        this._isLoadingQickBetInfo.setValue(true);
        this._isLoadingBetSlip.setValue(true);
    }

    @Override // org.betup.ui.ProgressDisplay
    public void hideProgress() {
        this._isLoadingBetSlip.setValue(false);
        this._isLoadingQickBetInfo.setValue(false);
    }

    @Override // org.betup.services.billing.PurchaseCompletedListener
    public void purchaseCompleted() {
        Log.d("BETSLIPTEST", "Purchase completed, refreshing bet data");
        refreshBetData();
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<UserService.InfoKind> updated, FetchStat stat) {
        UserBetStatsModel userBetStatsModel;
        UserProgressModel userProgressModel;
        if (this.pendingOneClickAutoPlace && stat != FetchStat.SUCCESS) {
            cancelPendingOneClickPlacement();
            hideProgress();
            MainActivity mainActivity = this.activity;
            if (mainActivity != null) {
                String string = mainActivity.getString(R.string.one_click_bet_prep_failed_data);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                showBetFeedback(string, true);
                openQuickBetSheetAfterOneClickPrepFailed();
                return;
            }
            return;
        }
        if (stat != FetchStat.SUCCESS) {
            return;
        }
        this.profileModel.setValue(fullUserProfileModel);
        long j = 0;
        this._userAmountFlow.setValue(Long.valueOf((fullUserProfileModel == null || (userProgressModel = fullUserProfileModel.getUserProgressModel()) == null) ? 0L : userProgressModel.getMoneyBalance()));
        MutableStateFlow<Long> mutableStateFlow = this._highScore;
        if (fullUserProfileModel != null && (userBetStatsModel = fullUserProfileModel.getUserBetStatsModel()) != null) {
            j = userBetStatsModel.getHighscore();
        }
        mutableStateFlow.setValue(Long.valueOf(j));
        if (this.pendingOneClickAutoPlace) {
            if (this.betDataModel.getValue() != null) {
                hideProgressAfterGrabbedBetFetch();
                return;
            } else {
                if (this.betsModel.getValue().isEmpty() || this.isRefreshingBetData) {
                    return;
                }
                forceRefreshBetDataSilent();
                return;
            }
        }
        if (!this.betsModel.getValue().isEmpty()) {
            List<BetModel> value = this.betsModel.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(((BetModel) it.next()).getBet().getGrabbedBetId());
            }
            ArrayList arrayList2 = arrayList;
            this.ids.setValue(CollectionsKt.toLongArray(arrayList2));
            if (!this.isRefreshingBetData) {
                getGrabbedBetsInteractor().load(this.onGrabbetBetFetched, arrayList2);
            }
        }
        hideProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GrabbedBetModel convertV7ToOldGrabbedBet(V7GrabbedBetDto v7Bet) {
        GrabbedBetModel grabbedBetModel = new GrabbedBetModel();
        grabbedBetModel.setGrabbedBetId(v7Bet.getGrabbedBetId());
        grabbedBetModel.setGrabbedCoefficient(v7Bet.getGrabbedCoeficient());
        grabbedBetModel.setAvailable(v7Bet.isAvailable());
        V7BetTypeGroupDto betTypeGroup = v7Bet.getBetTypeGroup();
        if (betTypeGroup != null) {
            MatchDetailsBetGroupModel matchDetailsBetGroupModel = new MatchDetailsBetGroupModel();
            matchDetailsBetGroupModel.setId(Integer.valueOf((int) betTypeGroup.getId()));
            matchDetailsBetGroupModel.setName(betTypeGroup.getName());
            matchDetailsBetGroupModel.setLevel(0);
            matchDetailsBetGroupModel.setDisplayColumns(betTypeGroup.getDisplayColumns());
            matchDetailsBetGroupModel.setAvailable(betTypeGroup.getUserAvailable());
            grabbedBetModel.setBetTypeGroup(matchDetailsBetGroupModel);
        }
        return grabbedBetModel;
    }

    private final BetListModel convertV7BetlistToLegacy(V7BetlistCreatedDto v7Betlist) {
        BetListModel betListModel = new BetListModel();
        betListModel.setId((int) v7Betlist.getId());
        betListModel.setMoneyPlaced(v7Betlist.getMoneyPlaced());
        betListModel.setExpAdded(v7Betlist.getExpAdded());
        return betListModel;
    }

    public final void goToMatch(int betModelId, MatchState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Bundle bundle = new Bundle();
        bundle.putInt("matchId", betModelId);
        bundle.putBoolean("isLive", state == MatchState.LIVE);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
    }

    public final void snapshotCoefficientsForArrowBaseline() {
        List<BetModel> value = this.betsModel.getValue();
        ArrayList arrayList = new ArrayList();
        for (BetModel betModel : value) {
            MatchDetailsBetDataModel bet = betModel.getBet();
            Pair pair = bet != null ? TuplesKt.to(Long.valueOf(betModel.getGrabbedBetId()), Double.valueOf(bet.getGrabbedCoeficient())) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Log.d("FirstBetFlow", "BetsController [5a] snapshotCoefficientsForArrowBaseline - coefficients=" + arrayList);
        for (BetModel betModel2 : this.betsModel.getValue()) {
            MatchDetailsBetDataModel bet2 = betModel2.getBet();
            if (bet2 != null) {
                getBetListAppender().setInitialCoefficientForBet(betModel2.getGrabbedBetId(), bet2.getGrabbedCoeficient());
            }
        }
    }

    public final void forceRefreshBetData() {
        List<BetModel> value = this.betsModel.getValue();
        if (value.isEmpty()) {
            Log.d("BETSLIPTEST", "No bets to refresh, skipping");
            return;
        }
        Log.d("BETSLIPTEST", "Force refreshing bet data for " + value.size() + " bets");
        displayProgress();
        refreshBetData();
    }

    public final void forceRefreshBetDataSilent() {
        if (this.betsModel.getValue().isEmpty()) {
            return;
        }
        refreshBetData();
    }
}
