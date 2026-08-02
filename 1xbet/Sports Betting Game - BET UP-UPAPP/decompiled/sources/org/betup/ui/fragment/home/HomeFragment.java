package org.betup.ui.fragment.home;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.OffersUpdatedMessage;
import org.betup.bus.ShowDailyBonusDialogMessage;
import org.betup.bus.UserBetStatisticsInvalidatedMessage;
import org.betup.databinding.FragmentHomeBinding;
import org.betup.domain.quest.DailyQuestDestination;
import org.betup.domain.quest.DailyQuestTask;
import org.betup.domain.quest.DailyQuestTaskNavigation;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.analytics.GetOffersInfoInteractor;
import org.betup.model.remote.api.rest.analytics.GetOffersListInteractor;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleActionCountsInteractor;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.MatchVarietiesInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.api.rest.user.V7UserInfoInteractor;
import org.betup.model.remote.api.rest.user.V7UserRanksInteractor;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.analytics.OffersInfoModel;
import org.betup.model.remote.entity.challenges.UserBattleActionCountsModel;
import org.betup.model.remote.entity.matches.topmatches.HotMatchesResponseModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.experiments.ABTestService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.user.UserService;
import org.betup.ui.BackPressedController;
import org.betup.ui.MainActivity;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.TabMenuItem;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.dialogs.InfoDialog;
import org.betup.ui.dialogs.OnDialogButtonClickListener;
import org.betup.ui.dialogs.VideoRewardCollectDialogFragment;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.ui.fragment.BaseAnimatedFragment;
import org.betup.ui.fragment.dailybonus.controller.DailyBonusController;
import org.betup.ui.fragment.home.compose.HomeActiveOfferUiState;
import org.betup.ui.fragment.home.compose.HomeScreenController;
import org.betup.ui.fragment.home.compose.HomeUiState;
import org.betup.ui.fragment.home.controller.HomeDailyQuestController;
import org.betup.ui.fragment.home.controller.HomeMatchBetController;
import org.betup.ui.fragment.home.controller.HomeMatchOddsRefresher;
import org.betup.ui.fragment.home.controller.HomeMatchesPaginationController;
import org.betup.ui.fragment.home.controller.HomeRefreshTracker;
import org.betup.ui.fragment.home.controller.HomeVideoBonusController;
import org.betup.ui.tour.TourHelper;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.utils.ApiUtils;
import org.betup.utils.BillingServiceUtilsKt;
import org.betup.utils.RewardSyncHelper;
import org.betup.utils.VideoRewardCollectDialogHelper;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: KHomeFragment.kt */
@Metadata(d1 = {"\u0000Ê\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0095\u0001\u001a\u00030\u0096\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0016J,\u0010\u0099\u0001\u001a\u00030\u009a\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\n\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009e\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0016J\u0016\u0010\u009f\u0001\u001a\u00030\u0096\u00012\n\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001H\u0014J\n\u0010¢\u0001\u001a\u00030\u0089\u0001H\u0016J \u0010£\u0001\u001a\u00030\u0096\u00012\b\u0010¤\u0001\u001a\u00030\u009a\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0014J\u0011\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010¦\u0001H\u0014J \u0010¨\u0001\u001a\u00030\u0096\u00012\n\u0010©\u0001\u001a\u0005\u0018\u00010ª\u00012\b\u0010«\u0001\u001a\u00030\u0089\u0001H\u0014J\n\u0010®\u0001\u001a\u00030\u0096\u0001H\u0002J1\u0010°\u0001\u001a\u00030\u0096\u00012\n\u0010±\u0001\u001a\u0005\u0018\u00010ª\u00012\u000f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010³\u00012\b\u0010´\u0001\u001a\u00030µ\u0001H\u0016J\n\u0010¶\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010·\u0001\u001a\u00030\u0096\u0001H\u0002J\u0014\u0010¸\u0001\u001a\u00030\u0096\u00012\b\u0010¹\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010º\u0001\u001a\u00030\u0096\u0001H\u0002J\u0016\u0010»\u0001\u001a\u00030\u0096\u00012\n\b\u0002\u0010¼\u0001\u001a\u00030\u0089\u0001H\u0002J \u0010Á\u0001\u001a\u00030\u0096\u00012\b\u0010Â\u0001\u001a\u00030\u0089\u00012\n\b\u0002\u0010¼\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010Ã\u0001\u001a\u00030\u0096\u0001H\u0002J\u0014\u0010Ä\u0001\u001a\u00030\u0096\u00012\b\u0010Â\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010Å\u0001\u001a\u00030\u0096\u0001H\u0002J\"\u0010Í\u0001\u001a\u00030\u0096\u00012\n\b\u0002\u0010Â\u0001\u001a\u00030\u0089\u00012\n\b\u0002\u0010¼\u0001\u001a\u00030\u0089\u0001H\u0002J\u0014\u0010Î\u0001\u001a\u00030\u0098\u00012\b\u0010Ï\u0001\u001a\u00030\u0090\u0001H\u0002J\u0014\u0010Ð\u0001\u001a\u00030\u0096\u00012\b\u0010Ñ\u0001\u001a\u00030\u0089\u0001H\u0002J,\u0010Ò\u0001\u001a\u00030\u0096\u00012\b\u0010Ñ\u0001\u001a\u00030\u0089\u00012\u0016\u0010Ó\u0001\u001a\u0011\u0012\u0005\u0012\u00030Õ\u0001\u0012\u0005\u0012\u00030\u0089\u00010Ô\u0001H\u0002J\u0014\u0010Ö\u0001\u001a\u00030\u0096\u00012\b\u0010Ñ\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010Û\u0001\u001a\u00030\u0098\u0001H\u0002J\n\u0010Þ\u0001\u001a\u00030\u0096\u0001H\u0002J\u0016\u0010ß\u0001\u001a\u00030\u0096\u00012\n\b\u0002\u0010Â\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010ð\u0001\u001a\u00030\u0096\u0001H\u0016J\n\u0010ñ\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010ò\u0001\u001a\u00030\u0096\u0001H\u0016J\u0014\u0010ó\u0001\u001a\u00030\u0096\u00012\b\u0010ô\u0001\u001a\u00030õ\u0001H\u0002J\n\u0010ö\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010÷\u0001\u001a\u00030\u0096\u0001H\u0002J\u0014\u0010ø\u0001\u001a\u00030\u0096\u00012\b\u0010ù\u0001\u001a\u00030\u0090\u0001H\u0002J\n\u0010ü\u0001\u001a\u00030\u0096\u0001H\u0002J\u0014\u0010ÿ\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0002\u001a\u00030À\u0001H\u0002J\u0016\u0010\u0081\u0002\u001a\u00030\u0096\u00012\n\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0083\u0002H\u0007J\u0016\u0010\u0084\u0002\u001a\u00030\u0096\u00012\n\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0085\u0002H\u0007J\u0016\u0010\u0086\u0002\u001a\u00030\u0096\u00012\n\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0087\u0002H\u0007J\u0016\u0010\u0088\u0002\u001a\u00030\u0096\u00012\n\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u008a\u0002H\u0007J\u0016\u0010\u008b\u0002\u001a\u00030\u0096\u00012\n\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u008c\u0002H\u0007J\n\u0010\u008d\u0002\u001a\u00030\u0096\u0001H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010D\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010J\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010P\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001e\u0010V\u001a\u00020W8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001e\u0010\\\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001e\u0010b\u001a\u00020c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001e\u0010h\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001e\u0010n\u001a\u00020o8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001e\u0010t\u001a\u00020u8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001e\u0010z\u001a\u00020{8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0010\u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0082\u0001\u001a\u00030\u0083\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0086\u0001\u001a\u00030\u0087\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008a\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008b\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008c\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008d\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008e\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0091\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0093\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0001\u001a\u00030\u0090\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010\u0093\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010¯\u0001\u001a\u0005\u0018\u00010ª\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010½\u0001\u001a\u0011\u0012\u0005\u0012\u00030¿\u0001\u0012\u0005\u0012\u00030À\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010Æ\u0001\u001a\u0005\u0018\u00010Ç\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010È\u0001\u001a\u0005\u0018\u00010Ç\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010É\u0001\u001a\u0005\u0018\u00010Ê\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Ë\u0001\u001a\u0005\u0018\u00010Ì\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010×\u0001\u001a\u0011\u0012\u0005\u0012\u00030Õ\u0001\u0012\u0005\u0012\u00030\u0089\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ø\u0001\u001a\u0011\u0012\u0005\u0012\u00030Õ\u0001\u0012\u0005\u0012\u00030\u0089\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ù\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ç\u0001\u0012\u0005\u0012\u00030\u0090\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ú\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ç\u0001\u0012\u0005\u0012\u00030\u0090\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ü\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ê\u0001\u0012\u0005\u0012\u00030\u0090\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ý\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ì\u0001\u0012\u0005\u0012\u00030\u0090\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010á\u0001\u001a\u00030\u0089\u00012\b\u0010à\u0001\u001a\u00030\u0089\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R9\u0010é\u0001\u001a\u0005\u0018\u00010è\u00012\n\u0010à\u0001\u001a\u0005\u0018\u00010è\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bî\u0001\u0010ç\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R\u0010\u0010ï\u0001\u001a\u00030\u0089\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010ú\u0001\u001a\u0013\u0012\u0005\u0012\u00030û\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0096\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010ý\u0001\u001a\u0011\u0012\u0005\u0012\u00030þ\u0001\u0012\u0005\u0012\u00030\u0096\u00010¾\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008e\u0002²\u0006\f\u0010\u008f\u0002\u001a\u00030\u00ad\u0001X\u008a\u0084\u0002²\u0006\f\u0010\u0090\u0002\u001a\u00030\u0091\u0002X\u008a\u0084\u0002²\u0006\u000e\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u0093\u0002X\u008a\u0084\u0002²\u0006\f\u0010\u0094\u0002\u001a\u00030\u0095\u0002X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/home/HomeFragment;", "Lorg/betup/ui/fragment/BaseAnimatedFragment;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", "Lorg/betup/services/user/UserService$UserInfoListener;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "binding", "Lorg/betup/databinding/FragmentHomeBinding;", "backPressedController", "Lorg/betup/ui/BackPressedController;", "tourHelper", "Lorg/betup/ui/tour/TourHelper;", "progressDisplay", "Lorg/betup/ui/ProgressDisplay;", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "dailyBonusController", "Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "getDailyBonusController", "()Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;", "setDailyBonusController", "(Lorg/betup/ui/fragment/dailybonus/controller/DailyBonusController;)V", "homeVideoBonusController", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController;", "getHomeVideoBonusController", "()Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController;", "setHomeVideoBonusController", "(Lorg/betup/ui/fragment/home/controller/HomeVideoBonusController;)V", "abTestService", "Lorg/betup/services/experiments/ABTestService;", "getAbTestService", "()Lorg/betup/services/experiments/ABTestService;", "setAbTestService", "(Lorg/betup/services/experiments/ABTestService;)V", "getOffersInfoInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetOffersInfoInteractor;", "getGetOffersInfoInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetOffersInfoInteractor;", "setGetOffersInfoInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetOffersInfoInteractor;)V", "getOffersListInteractor", "Lorg/betup/model/remote/api/rest/analytics/GetOffersListInteractor;", "getGetOffersListInteractor", "()Lorg/betup/model/remote/api/rest/analytics/GetOffersListInteractor;", "setGetOffersListInteractor", "(Lorg/betup/model/remote/api/rest/analytics/GetOffersListInteractor;)V", "homeDailyQuestController", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;", "getHomeDailyQuestController", "()Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;", "setHomeDailyQuestController", "(Lorg/betup/ui/fragment/home/controller/HomeDailyQuestController;)V", "hotMatchesInteractor", "Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;", "getHotMatchesInteractor", "()Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;", "setHotMatchesInteractor", "(Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;)V", "matchVarietiesInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "getMatchVarietiesInteractor", "()Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;", "setMatchVarietiesInteractor", "(Lorg/betup/model/remote/api/rest/matches/MatchVarietiesInteractor;)V", "v7UserBetStatisticsInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;", "getV7UserBetStatisticsInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;", "setV7UserBetStatisticsInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserBetStatisticsInteractor;)V", "v7UserRanksInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;", "getV7UserRanksInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;", "setV7UserRanksInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserRanksInteractor;)V", "v7UserInfoInteractor", "Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;", "getV7UserInfoInteractor", "()Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;", "setV7UserInfoInteractor", "(Lorg/betup/model/remote/api/rest/user/V7UserInfoInteractor;)V", "battleActionCountsInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserBattleActionCountsInteractor;", "getBattleActionCountsInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserBattleActionCountsInteractor;", "setBattleActionCountsInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserBattleActionCountsInteractor;)V", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "getBetListAppender", "()Lorg/betup/services/betlist/BetListAppender;", "setBetListAppender", "(Lorg/betup/services/betlist/BetListAppender;)V", "betValidator", "Lorg/betup/services/betlist/BetValidator;", "getBetValidator", "()Lorg/betup/services/betlist/BetValidator;", "setBetValidator", "(Lorg/betup/services/betlist/BetValidator;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "singleShopInteractor", "Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "getSingleShopInteractor", "()Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "setSingleShopInteractor", "(Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "homeMatchBetController", "Lorg/betup/ui/fragment/home/controller/HomeMatchBetController;", "homeMatchOddsRefresher", "Lorg/betup/ui/fragment/home/controller/HomeMatchOddsRefresher;", "homeMatchesPagination", "Lorg/betup/ui/fragment/home/controller/HomeMatchesPaginationController;", "homeRefreshTracker", "Lorg/betup/ui/fragment/home/controller/HomeRefreshTracker;", "homeLiveInitialCompleted", "", "homeMoreInitialCompleted", "homeMatchesLiveRetryPending", "homeMatchesMoreRetryPending", "statsLoading", "promoLoading", "statsPendingLoads", "", "statsTrackRefresh", "pullRefreshing", "Landroidx/compose/runtime/MutableState;", "battlesBadgeCount", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFragmentAttached", "context", "Landroid/content/Context;", "onBackPressed", "onViewReady", ViewHierarchyConstants.VIEW_KEY, "getMandatoryUserInfoKinds", "", "Lorg/betup/services/user/UserService$InfoKind;", "onUserReady", "userModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "success", "homeUiState", "Lorg/betup/ui/fragment/home/compose/HomeUiState;", "initLayout", "cachedHomeProfile", "onProfileFetched", "fullUserProfileModel", "updated", "", "stat", "Lorg/betup/model/remote/api/FetchStat;", "refreshHomeUiState", "updatePullRefreshIndicator", "refreshAll", "userInitiated", "reloadV7HomeStatsFromApi", "loadBattlesBadgeCount", "bypassCache", "battlesBadgeCountListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/challenges/UserBattleActionCountsModel;", "", "loadV7HomeStats", "trackRefresh", "onV7StatsLoadFinished", "refreshPromo", "finishPromoRefresh", "v7BetStats", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "v7BetStatsRecent", "v7Ranks", "Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "v7UserInfo", "Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "loadHomeFeedData", "homeMatchesRequestBundle", "offset", "loadMoreHomeMatches", "isLive", "handleHotMatchesResponse", "response", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "Lorg/betup/model/remote/entity/matches/topmatches/HotMatchesResponseModel;", "endMatchesRefreshSection", "hotLiveMatchesListener", "hotMoreMatchesListener", "v7BetStatsListener", "v7BetStatsRecentListener", "homeBetStatsRecentParams", "v7RanksListener", "v7UserInfoListener", "syncV7BetStatsFromCache", "loadDailyQuests", "<set-?>", "bonusOfferActive", "getBonusOfferActive", "()Z", "setBonusOfferActive", "(Z)V", "bonusOfferActive$delegate", "Landroidx/compose/runtime/MutableState;", "Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;", "activeHomeOffer", "getActiveHomeOffer", "()Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;", "setActiveHomeOffer", "(Lorg/betup/ui/fragment/home/compose/HomeActiveOfferUiState;)V", "activeHomeOffer$delegate", "isVideoRewardDialogShowing", X3.i.u0, "ensureHomeMatchesLoaded", X3.i.t0, "onDailyQuestTaskClicked", "task", "Lorg/betup/domain/quest/DailyQuestTask;", "isTourBlockingDailyBonusAutoPresentation", "tryScheduleAutoDailyBonusPresentation", "showHomeVideoCollectDialog", "amount", "getOffersInfoListener", "Lorg/betup/model/remote/entity/analytics/OffersInfoModel;", "loadActiveHomeOfferDetails", "getOffersListListener", "", "refreshSingleHomeMatch", "matchId", "processBetsPlaced", "message", "Lorg/betup/bus/BetlistUpdatedMessage;", "onUserBetStatisticsInvalidated", "Lorg/betup/bus/UserBetStatisticsInvalidatedMessage;", "onCoefficientUpdated", "Lorg/betup/bus/CoefficientUpdatedMessage;", "processPurchaseRefresh", "offersUpdatedMessage", "Lorg/betup/bus/OffersUpdatedMessage;", "onBattlesChanged", "Lorg/betup/ui/dialogs/events/ChallengeAcceptedOrCreatedEvent;", "onDestroyView", "app_release", "uiState", "dailyQuestsState", "Lorg/betup/ui/fragment/home/controller/HomeDailyQuestUiState;", "dailyBonusData", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "videoBonusState", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusUiState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeFragment extends BaseAnimatedFragment implements BackPressedController.BackPressedListener, UserService.UserInfoListener {
    public static final int $stable = 8;

    @Inject
    public ABTestService abTestService;

    @Inject
    public AnalyticsService analyticsService;
    private BackPressedController backPressedController;

    @Inject
    public NewUserBattleActionCountsInteractor battleActionCountsInteractor;
    private int battlesBadgeCount;

    @Inject
    public BetListAppender betListAppender;

    @Inject
    public BetValidator betValidator;

    @Inject
    public BillingService billingService;
    private FragmentHomeBinding binding;
    private FullUserProfileModel cachedHomeProfile;

    @Inject
    public DailyBonusController dailyBonusController;

    @Inject
    public FirebaseRemoteConfig firebaseRemoteConfig;

    @Inject
    public GetOffersInfoInteractor getOffersInfoInteractor;

    @Inject
    public GetOffersListInteractor getOffersListInteractor;

    @Inject
    public HomeDailyQuestController homeDailyQuestController;
    private boolean homeLiveInitialCompleted;
    private HomeMatchBetController homeMatchBetController;
    private HomeMatchOddsRefresher homeMatchOddsRefresher;
    private boolean homeMatchesLiveRetryPending;
    private boolean homeMatchesMoreRetryPending;
    private boolean homeMoreInitialCompleted;

    @Inject
    public HomeVideoBonusController homeVideoBonusController;

    @Inject
    public HotMatchesInteractor hotMatchesInteractor;
    private boolean isVideoRewardDialogShowing;

    @Inject
    public MatchVarietiesInteractor matchVarietiesInteractor;
    private ProgressDisplay progressDisplay;
    private boolean promoLoading;

    @Inject
    public NewSingleShopInteractor singleShopInteractor;
    private boolean statsLoading;
    private int statsPendingLoads;
    private boolean statsTrackRefresh;
    private TourHelper tourHelper;
    private NewUserBetStatisticsModel v7BetStats;
    private NewUserBetStatisticsModel v7BetStatsRecent;
    private NewUserRanksModel v7Ranks;

    @Inject
    public V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor;
    private NewUserInfoModel v7UserInfo;

    @Inject
    public V7UserInfoInteractor v7UserInfoInteractor;

    @Inject
    public V7UserRanksInteractor v7UserRanksInteractor;

    @Inject
    public VideoRewardService videoRewardService;
    private final HomeMatchesPaginationController homeMatchesPagination = new HomeMatchesPaginationController();
    private final HomeRefreshTracker homeRefreshTracker = new HomeRefreshTracker();
    private final MutableState<Boolean> pullRefreshing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState<HomeUiState> homeUiState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new HomeUiState(null, null, null, null, false, null, null, null, null, 0, 1023, null), null, 2, null);
    private final BaseCachedSharedInteractor.OnFetchedListener<UserBattleActionCountsModel, Long> battlesBadgeCountListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda9
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.battlesBadgeCountListener$lambda$3(HomeFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<HotMatchesResponseModel, Boolean> hotLiveMatchesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda10
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.hotLiveMatchesListener$lambda$5(HomeFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<HotMatchesResponseModel, Boolean> hotMoreMatchesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda11
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.hotMoreMatchesListener$lambda$6(HomeFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Integer> v7BetStatsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda12
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.v7BetStatsListener$lambda$7(HomeFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBetStatisticsModel, Integer> v7BetStatsRecentListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda13
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.v7BetStatsRecentListener$lambda$8(HomeFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserRanksModel, Integer> v7RanksListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda14
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.v7RanksListener$lambda$10(HomeFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserInfoModel, Integer> v7UserInfoListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.v7UserInfoListener$lambda$11(HomeFragment.this, fetchedResponseMessage);
        }
    };

    /* renamed from: bonusOfferActive$delegate, reason: from kotlin metadata */
    private final MutableState bonusOfferActive = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: activeHomeOffer$delegate, reason: from kotlin metadata */
    private final MutableState activeHomeOffer = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final BaseCachedSharedInteractor.OnFetchedListener<OffersInfoModel, Unit> getOffersInfoListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda2
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.getOffersInfoListener$lambda$17(HomeFragment.this, fetchedResponseMessage);
        }
    };
    private final BaseCachedSharedInteractor.OnFetchedListener<String, Unit> getOffersListListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda3
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            HomeFragment.getOffersListListener$lambda$21(HomeFragment.this, fetchedResponseMessage);
        }
    };

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

    public final DailyBonusController getDailyBonusController() {
        DailyBonusController dailyBonusController = this.dailyBonusController;
        if (dailyBonusController != null) {
            return dailyBonusController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dailyBonusController");
        return null;
    }

    public final void setDailyBonusController(DailyBonusController dailyBonusController) {
        Intrinsics.checkNotNullParameter(dailyBonusController, "<set-?>");
        this.dailyBonusController = dailyBonusController;
    }

    public final HomeVideoBonusController getHomeVideoBonusController() {
        HomeVideoBonusController homeVideoBonusController = this.homeVideoBonusController;
        if (homeVideoBonusController != null) {
            return homeVideoBonusController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeVideoBonusController");
        return null;
    }

    public final void setHomeVideoBonusController(HomeVideoBonusController homeVideoBonusController) {
        Intrinsics.checkNotNullParameter(homeVideoBonusController, "<set-?>");
        this.homeVideoBonusController = homeVideoBonusController;
    }

    public final ABTestService getAbTestService() {
        ABTestService aBTestService = this.abTestService;
        if (aBTestService != null) {
            return aBTestService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("abTestService");
        return null;
    }

    public final void setAbTestService(ABTestService aBTestService) {
        Intrinsics.checkNotNullParameter(aBTestService, "<set-?>");
        this.abTestService = aBTestService;
    }

    public final GetOffersInfoInteractor getGetOffersInfoInteractor() {
        GetOffersInfoInteractor getOffersInfoInteractor = this.getOffersInfoInteractor;
        if (getOffersInfoInteractor != null) {
            return getOffersInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getOffersInfoInteractor");
        return null;
    }

    public final void setGetOffersInfoInteractor(GetOffersInfoInteractor getOffersInfoInteractor) {
        Intrinsics.checkNotNullParameter(getOffersInfoInteractor, "<set-?>");
        this.getOffersInfoInteractor = getOffersInfoInteractor;
    }

    public final GetOffersListInteractor getGetOffersListInteractor() {
        GetOffersListInteractor getOffersListInteractor = this.getOffersListInteractor;
        if (getOffersListInteractor != null) {
            return getOffersListInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getOffersListInteractor");
        return null;
    }

    public final void setGetOffersListInteractor(GetOffersListInteractor getOffersListInteractor) {
        Intrinsics.checkNotNullParameter(getOffersListInteractor, "<set-?>");
        this.getOffersListInteractor = getOffersListInteractor;
    }

    public final HomeDailyQuestController getHomeDailyQuestController() {
        HomeDailyQuestController homeDailyQuestController = this.homeDailyQuestController;
        if (homeDailyQuestController != null) {
            return homeDailyQuestController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeDailyQuestController");
        return null;
    }

    public final void setHomeDailyQuestController(HomeDailyQuestController homeDailyQuestController) {
        Intrinsics.checkNotNullParameter(homeDailyQuestController, "<set-?>");
        this.homeDailyQuestController = homeDailyQuestController;
    }

    public final HotMatchesInteractor getHotMatchesInteractor() {
        HotMatchesInteractor hotMatchesInteractor = this.hotMatchesInteractor;
        if (hotMatchesInteractor != null) {
            return hotMatchesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hotMatchesInteractor");
        return null;
    }

    public final void setHotMatchesInteractor(HotMatchesInteractor hotMatchesInteractor) {
        Intrinsics.checkNotNullParameter(hotMatchesInteractor, "<set-?>");
        this.hotMatchesInteractor = hotMatchesInteractor;
    }

    public final MatchVarietiesInteractor getMatchVarietiesInteractor() {
        MatchVarietiesInteractor matchVarietiesInteractor = this.matchVarietiesInteractor;
        if (matchVarietiesInteractor != null) {
            return matchVarietiesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchVarietiesInteractor");
        return null;
    }

    public final void setMatchVarietiesInteractor(MatchVarietiesInteractor matchVarietiesInteractor) {
        Intrinsics.checkNotNullParameter(matchVarietiesInteractor, "<set-?>");
        this.matchVarietiesInteractor = matchVarietiesInteractor;
    }

    public final V7UserBetStatisticsInteractor getV7UserBetStatisticsInteractor() {
        V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor = this.v7UserBetStatisticsInteractor;
        if (v7UserBetStatisticsInteractor != null) {
            return v7UserBetStatisticsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserBetStatisticsInteractor");
        return null;
    }

    public final void setV7UserBetStatisticsInteractor(V7UserBetStatisticsInteractor v7UserBetStatisticsInteractor) {
        Intrinsics.checkNotNullParameter(v7UserBetStatisticsInteractor, "<set-?>");
        this.v7UserBetStatisticsInteractor = v7UserBetStatisticsInteractor;
    }

    public final V7UserRanksInteractor getV7UserRanksInteractor() {
        V7UserRanksInteractor v7UserRanksInteractor = this.v7UserRanksInteractor;
        if (v7UserRanksInteractor != null) {
            return v7UserRanksInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserRanksInteractor");
        return null;
    }

    public final void setV7UserRanksInteractor(V7UserRanksInteractor v7UserRanksInteractor) {
        Intrinsics.checkNotNullParameter(v7UserRanksInteractor, "<set-?>");
        this.v7UserRanksInteractor = v7UserRanksInteractor;
    }

    public final V7UserInfoInteractor getV7UserInfoInteractor() {
        V7UserInfoInteractor v7UserInfoInteractor = this.v7UserInfoInteractor;
        if (v7UserInfoInteractor != null) {
            return v7UserInfoInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("v7UserInfoInteractor");
        return null;
    }

    public final void setV7UserInfoInteractor(V7UserInfoInteractor v7UserInfoInteractor) {
        Intrinsics.checkNotNullParameter(v7UserInfoInteractor, "<set-?>");
        this.v7UserInfoInteractor = v7UserInfoInteractor;
    }

    public final NewUserBattleActionCountsInteractor getBattleActionCountsInteractor() {
        NewUserBattleActionCountsInteractor newUserBattleActionCountsInteractor = this.battleActionCountsInteractor;
        if (newUserBattleActionCountsInteractor != null) {
            return newUserBattleActionCountsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("battleActionCountsInteractor");
        return null;
    }

    public final void setBattleActionCountsInteractor(NewUserBattleActionCountsInteractor newUserBattleActionCountsInteractor) {
        Intrinsics.checkNotNullParameter(newUserBattleActionCountsInteractor, "<set-?>");
        this.battleActionCountsInteractor = newUserBattleActionCountsInteractor;
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

    @Override // org.betup.ui.fragment.BaseAnimatedFragment, org.betup.ui.fragment.BaseFragmentWithProfileInfo, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentHomeBinding inflate = FragmentHomeBinding.inflate(inflater, container, false);
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        ComposeView root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.ui.fragment.BaseFragment
    protected void onFragmentAttached(Context context) {
        super.onFragmentAttached(context);
        try {
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type org.betup.ui.BackPressedController");
            this.backPressedController = (BackPressedController) context;
            try {
                this.tourHelper = (TourHelper) context;
                try {
                    this.progressDisplay = (ProgressDisplay) context;
                } catch (ClassCastException unused) {
                    throw new ClassCastException(context + " must implement ProgressDisplay");
                }
            } catch (ClassCastException unused2) {
                throw new ClassCastException(context + " must implement TourHelper");
            }
        } catch (ClassCastException unused3) {
            throw new ClassCastException(context + " must implement BackPressedController");
        }
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        if (isActive()) {
            TourHelper tourHelper = this.tourHelper;
            if (tourHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tourHelper");
                tourHelper = null;
            }
            if (!tourHelper.isTour() || tourHelper.isCompleted()) {
                InfoDialog build = new InfoDialog.Builder(requireActivity()).firstButtonTitle(getString(R.string.yes)).secondButtonTitle(getString(R.string.cancel)).subtitle(getString(R.string.sure_exit)).title(getString(R.string.exit_title)).dismissOnSecondButtonClick(true).allowDismiss(true).onFirstButtonClick(new OnDialogButtonClickListener() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda7
                    @Override // org.betup.ui.dialogs.OnDialogButtonClickListener
                    public final void onClick(Dialog dialog) {
                        HomeFragment.onBackPressed$lambda$1(HomeFragment.this, dialog);
                    }
                }).build();
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type org.betup.ui.base.BaseActivity");
                if (!((BaseActivity) requireActivity).isVisible()) {
                    return false;
                }
                build.show();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressed$lambda$1(HomeFragment homeFragment, Dialog dialog) {
        dialog.dismiss();
        homeFragment.requireActivity().finish();
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onViewReady(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewReady(view, savedInstanceState);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HomeFragment$onViewReady$1(this, null), 3, null);
        updateMenuBars(getString(R.string.drawer_home), TabMenuItem.HOME);
        BetListAppender betListAppender = getBetListAppender();
        BetValidator betValidator = getBetValidator();
        BillingService billingService = getBillingService();
        FirebaseRemoteConfig firebaseRemoteConfig = getFirebaseRemoteConfig();
        NewSingleShopInteractor singleShopInteractor = getSingleShopInteractor();
        AnalyticsService analyticsService = getAnalyticsService();
        UserService userService = getUserService();
        Intrinsics.checkNotNullExpressionValue(userService, "getUserService(...)");
        this.homeMatchBetController = new HomeMatchBetController(betListAppender, betValidator, billingService, firebaseRemoteConfig, singleShopInteractor, analyticsService, userService, getVideoRewardService());
        this.homeMatchOddsRefresher = new HomeMatchOddsRefresher(getMatchVarietiesInteractor());
        initLayout();
        DailyBonusController dailyBonusController = getDailyBonusController();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        dailyBonusController.initialize(requireContext);
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        if (getAbTestService().offersEnabled()) {
            getGetOffersInfoInteractor().load(this.getOffersInfoListener, null);
        }
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected List<UserService.InfoKind> getMandatoryUserInfoKinds() {
        return CollectionsKt.listOf((Object[]) new UserService.InfoKind[]{UserService.InfoKind.GENERAL, UserService.InfoKind.RANKS, UserService.InfoKind.STATS});
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onUserReady(FullUserProfileModel userModel, boolean success) {
        ProgressDisplay progressDisplay = null;
        if (!isActive() || !success) {
            ProgressDisplay progressDisplay2 = this.progressDisplay;
            if (progressDisplay2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDisplay");
            } else {
                progressDisplay = progressDisplay2;
            }
            progressDisplay.hideProgress();
            return;
        }
        this.cachedHomeProfile = userModel;
        syncV7BetStatsFromCache();
        getDailyBonusController().updateAvailability();
        if (getAbTestService().offersEnabled()) {
            getGetOffersInfoInteractor().invalidate();
            getGetOffersInfoInteractor().load(this.getOffersInfoListener, null);
        }
        this.homeRefreshTracker.end(HomeRefreshTracker.Section.Profile);
        loadDailyQuests$default(this, false, 1, null);
        loadV7HomeStats$default(this, false, false, 2, null);
        refreshPromo(false);
        loadHomeFeedData$default(this, false, false, 2, null);
        loadBattlesBadgeCount$default(this, false, 1, null);
        refreshHomeUiState();
    }

    private final void initLayout() {
        FragmentHomeBinding fragmentHomeBinding = this.binding;
        if (fragmentHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentHomeBinding = null;
        }
        fragmentHomeBinding.homeComposeRoot.setContent(ComposableLambdaKt.composableLambdaInstance(1187349748, true, new HomeFragment$initLayout$1(this)));
        loadDailyQuests$default(this, false, 1, null);
    }

    @Override // org.betup.services.user.UserService.UserInfoListener
    public void onProfileFetched(FullUserProfileModel fullUserProfileModel, Set<? extends UserService.InfoKind> updated, FetchStat stat) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        Intrinsics.checkNotNullParameter(stat, "stat");
        if (isActive()) {
            this.homeRefreshTracker.end(HomeRefreshTracker.Section.Profile);
            if (stat == FetchStat.SUCCESS && fullUserProfileModel != null && (updated.contains(UserService.InfoKind.RANKS) || updated.contains(UserService.InfoKind.STATS) || updated.contains(UserService.InfoKind.GENERAL))) {
                this.cachedHomeProfile = fullUserProfileModel;
                if (updated.contains(UserService.InfoKind.STATS)) {
                    syncV7BetStatsFromCache();
                }
                refreshHomeUiState();
                return;
            }
            updatePullRefreshIndicator();
        }
    }

    private final void refreshHomeUiState() {
        HomeMatchBetController homeMatchBetController = this.homeMatchBetController;
        if (homeMatchBetController != null) {
            if (homeMatchBetController == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
                homeMatchBetController = null;
            }
            homeMatchBetController.updateListedMatches(this.homeMatchesPagination.getLivePage().getItems(), this.homeMatchesPagination.getMorePage().getItems());
        }
        MutableState<HomeUiState> mutableState = this.homeUiState;
        HomeScreenController homeScreenController = HomeScreenController.INSTANCE;
        FullUserProfileModel fullUserProfileModel = this.cachedHomeProfile;
        if (fullUserProfileModel == null) {
            fullUserProfileModel = getProfileIfFetched();
        }
        mutableState.setValue(homeScreenController.buildUiState(fullUserProfileModel, this.v7BetStats, this.v7BetStatsRecent, this.v7Ranks, this.v7UserInfo, getHomeDailyQuestController().getUiState().getValue(), getHomeVideoBonusController().getUiState().getValue(), getBonusOfferActive(), getActiveHomeOffer(), this.homeMatchesPagination.getLivePage(), this.homeMatchesPagination.getMorePage(), this.statsLoading, this.promoLoading, this.battlesBadgeCount));
        updatePullRefreshIndicator();
    }

    private final void updatePullRefreshIndicator() {
        this.pullRefreshing.setValue(Boolean.valueOf(this.homeRefreshTracker.isRefreshing()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshAll(boolean userInitiated) {
        if (isActive()) {
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(HomeRefreshTracker.Section.Profile);
            createListBuilder.add(HomeRefreshTracker.Section.Stats);
            createListBuilder.add(HomeRefreshTracker.Section.Promo);
            createListBuilder.add(HomeRefreshTracker.Section.DailyQuests);
            createListBuilder.add(HomeRefreshTracker.Section.LiveMatches);
            createListBuilder.add(HomeRefreshTracker.Section.MoreMatches);
            this.homeRefreshTracker.beginAll(CollectionsKt.build(createListBuilder));
            if (userInitiated) {
                updatePullRefreshIndicator();
            }
            getUserService().getProfile(this, UserService.InfoKind.GENERAL, UserService.InfoKind.RANKS, UserService.InfoKind.STATS);
            loadV7HomeStats$default(this, true, false, 2, null);
            refreshPromo(true);
            loadDailyQuests(true);
            getHomeVideoBonusController().refreshAfterVideoWatched();
            loadHomeFeedData(true, true);
            loadBattlesBadgeCount(true);
        }
    }

    private final void reloadV7HomeStatsFromApi() {
        if (!isActive() || this.statsLoading) {
            return;
        }
        loadV7HomeStats(false, true);
    }

    static /* synthetic */ void loadBattlesBadgeCount$default(HomeFragment homeFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        homeFragment.loadBattlesBadgeCount(z);
    }

    private final void loadBattlesBadgeCount(boolean bypassCache) {
        if (!isActive() || !getUserService().isRegistered()) {
            this.battlesBadgeCount = 0;
            refreshHomeUiState();
        } else {
            if (bypassCache) {
                getBattleActionCountsInteractor().invalidate();
            }
            getBattleActionCountsInteractor().load(this.battlesBadgeCountListener, 0L, new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void battlesBadgeCountListener$lambda$3(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (homeFragment.isActive()) {
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                UserBattleActionCountsModel userBattleActionCountsModel = (UserBattleActionCountsModel) fetchedResponseMessage.getModel();
                homeFragment.battlesBadgeCount = userBattleActionCountsModel != null ? RangesKt.coerceAtLeast(userBattleActionCountsModel.getBadgeCount(), 0) : 0;
            }
            homeFragment.refreshHomeUiState();
        }
    }

    static /* synthetic */ void loadV7HomeStats$default(HomeFragment homeFragment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        homeFragment.loadV7HomeStats(z, z2);
    }

    private final void loadV7HomeStats(boolean trackRefresh, boolean bypassCache) {
        if (!getUserService().isRegistered()) {
            if (trackRefresh) {
                this.statsLoading = false;
                this.homeRefreshTracker.end(HomeRefreshTracker.Section.Stats);
                updatePullRefreshIndicator();
            }
            refreshHomeUiState();
            return;
        }
        BaseUserModel userModel = getUserService().getShortProfile().getUserModel();
        Integer id = userModel != null ? userModel.getId() : null;
        if (id == null) {
            if (trackRefresh) {
                this.statsLoading = false;
                this.homeRefreshTracker.end(HomeRefreshTracker.Section.Stats);
                updatePullRefreshIndicator();
            }
            refreshHomeUiState();
            return;
        }
        this.statsTrackRefresh = trackRefresh;
        this.statsLoading = true;
        this.statsPendingLoads = 4;
        Bundle homeBetStatsRecentParams = homeBetStatsRecentParams();
        if (bypassCache || trackRefresh) {
            getV7UserBetStatisticsInteractor().invalidate(id.intValue());
            getV7UserBetStatisticsInteractor().invalidate(id, homeBetStatsRecentParams);
        }
        getV7UserRanksInteractor().invalidate(id.intValue());
        getV7UserInfoInteractor().invalidate(id.intValue());
        getV7UserBetStatisticsInteractor().load(this.v7BetStatsListener, id);
        getV7UserBetStatisticsInteractor().load(this.v7BetStatsRecentListener, id, homeBetStatsRecentParams);
        getV7UserRanksInteractor().load(this.v7RanksListener, id);
        getV7UserInfoInteractor().load(this.v7UserInfoListener, id);
        refreshHomeUiState();
    }

    private final void onV7StatsLoadFinished() {
        int i = this.statsPendingLoads;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.statsPendingLoads = i2;
        if (i2 <= 0) {
            this.statsLoading = false;
            if (this.statsTrackRefresh) {
                this.statsTrackRefresh = false;
                this.homeRefreshTracker.end(HomeRefreshTracker.Section.Stats);
                updatePullRefreshIndicator();
            }
            refreshHomeUiState();
        }
    }

    private final void refreshPromo(boolean trackRefresh) {
        if (!getAbTestService().offersEnabled()) {
            if (trackRefresh) {
                this.promoLoading = false;
                this.homeRefreshTracker.end(HomeRefreshTracker.Section.Promo);
                updatePullRefreshIndicator();
            }
            refreshHomeUiState();
            return;
        }
        if (trackRefresh) {
            this.promoLoading = true;
        }
        getGetOffersInfoInteractor().invalidate();
        getGetOffersInfoInteractor().load(this.getOffersInfoListener, null);
        refreshHomeUiState();
    }

    private final void finishPromoRefresh() {
        this.promoLoading = false;
        this.homeRefreshTracker.end(HomeRefreshTracker.Section.Promo);
        updatePullRefreshIndicator();
        refreshHomeUiState();
    }

    static /* synthetic */ void loadHomeFeedData$default(HomeFragment homeFragment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        homeFragment.loadHomeFeedData(z, z2);
    }

    private final void loadHomeFeedData(boolean trackRefresh, boolean bypassCache) {
        if (isActive()) {
            if (bypassCache || trackRefresh || !this.homeLiveInitialCompleted || !this.homeMoreInitialCompleted) {
                Bundle homeMatchesRequestBundle = homeMatchesRequestBundle(0);
                getHotMatchesInteractor().invalidateRequest(false, homeMatchesRequestBundle);
                getHotMatchesInteractor().invalidateRequest(true, homeMatchesRequestBundle);
            }
            this.homeMatchesPagination.resetForRefresh();
            getHotMatchesInteractor().load(this.hotLiveMatchesListener, true, homeMatchesRequestBundle(0));
            getHotMatchesInteractor().load(this.hotMoreMatchesListener, false, homeMatchesRequestBundle(0));
            refreshHomeUiState();
        }
    }

    private final Bundle homeMatchesRequestBundle(int offset) {
        Bundle bundle = new Bundle();
        bundle.putInt("offset", offset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 20);
        bundle.putBoolean("getExpandedBetsInfo", true);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMoreHomeMatches(boolean isLive) {
        Integer beginLoadMore;
        if (isActive() && (beginLoadMore = this.homeMatchesPagination.beginLoadMore(isLive)) != null) {
            int intValue = beginLoadMore.intValue();
            refreshHomeUiState();
            Bundle homeMatchesRequestBundle = homeMatchesRequestBundle(intValue);
            if (isLive) {
                getHotMatchesInteractor().load(this.hotLiveMatchesListener, true, homeMatchesRequestBundle);
            } else {
                getHotMatchesInteractor().load(this.hotMoreMatchesListener, false, homeMatchesRequestBundle);
            }
        }
    }

    private final void handleHotMatchesResponse(boolean isLive, FetchedResponseMessage<HotMatchesResponseModel, Boolean> response) {
        if (isActive()) {
            Bundle args = response.getArgs();
            int i = args != null ? args.getInt("offset", 0) : 0;
            if (response.getStat() != FetchStat.SUCCESS) {
                if (i == 0) {
                    if (!(isLive ? this.homeMatchesLiveRetryPending : this.homeMatchesMoreRetryPending)) {
                        if (isLive) {
                            this.homeMatchesLiveRetryPending = true;
                        } else {
                            this.homeMatchesMoreRetryPending = true;
                        }
                        Bundle homeMatchesRequestBundle = homeMatchesRequestBundle(0);
                        getHotMatchesInteractor().invalidateRequest(isLive, homeMatchesRequestBundle);
                        if (isLive) {
                            getHotMatchesInteractor().load(this.hotLiveMatchesListener, true, homeMatchesRequestBundle);
                        } else {
                            getHotMatchesInteractor().load(this.hotMoreMatchesListener, false, homeMatchesRequestBundle);
                        }
                        refreshHomeUiState();
                        return;
                    }
                    if (isLive) {
                        this.homeMatchesLiveRetryPending = false;
                    } else {
                        this.homeMatchesMoreRetryPending = false;
                    }
                    this.homeMatchesPagination.finishInitialLoad(isLive);
                    endMatchesRefreshSection(isLive);
                } else {
                    this.homeMatchesPagination.cancelLoadMore(isLive);
                }
                refreshHomeUiState();
                return;
            }
            if (i == 0) {
                if (isLive) {
                    this.homeMatchesLiveRetryPending = false;
                } else {
                    this.homeMatchesMoreRetryPending = false;
                }
            }
            this.homeMatchesPagination.applyPageResponse(isLive, response.getModel(), i);
            if (i == 0) {
                if (isLive) {
                    this.homeLiveInitialCompleted = true;
                } else {
                    this.homeMoreInitialCompleted = true;
                }
                endMatchesRefreshSection(isLive);
            }
            refreshHomeUiState();
        }
    }

    private final void endMatchesRefreshSection(boolean isLive) {
        HomeRefreshTracker.Section section;
        if (isLive) {
            section = HomeRefreshTracker.Section.LiveMatches;
        } else {
            section = HomeRefreshTracker.Section.MoreMatches;
        }
        this.homeRefreshTracker.end(section);
        updatePullRefreshIndicator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hotLiveMatchesListener$lambda$5(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        Intrinsics.checkNotNull(fetchedResponseMessage);
        homeFragment.handleHotMatchesResponse(true, fetchedResponseMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hotMoreMatchesListener$lambda$6(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        Intrinsics.checkNotNull(fetchedResponseMessage);
        homeFragment.handleHotMatchesResponse(false, fetchedResponseMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7BetStatsListener$lambda$7(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (homeFragment.isActive()) {
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                homeFragment.v7BetStats = (NewUserBetStatisticsModel) fetchedResponseMessage.getModel();
            }
            homeFragment.onV7StatsLoadFinished();
            homeFragment.refreshHomeUiState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7BetStatsRecentListener$lambda$8(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (homeFragment.isActive()) {
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                homeFragment.v7BetStatsRecent = (NewUserBetStatisticsModel) fetchedResponseMessage.getModel();
            }
            homeFragment.onV7StatsLoadFinished();
            homeFragment.refreshHomeUiState();
        }
    }

    private final Bundle homeBetStatsRecentParams() {
        Bundle bundle = new Bundle();
        bundle.putString(V7UserBetStatisticsInteractor.PARAM_STATS_TYPE, V7UserBetStatisticsInteractor.STATS_TYPE_THIRTY_DAYS);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7RanksListener$lambda$10(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (homeFragment.isActive()) {
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                homeFragment.v7Ranks = (NewUserRanksModel) fetchedResponseMessage.getModel();
            }
            homeFragment.onV7StatsLoadFinished();
            homeFragment.refreshHomeUiState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v7UserInfoListener$lambda$11(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (homeFragment.isActive()) {
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                homeFragment.v7UserInfo = (NewUserInfoModel) fetchedResponseMessage.getModel();
            }
            homeFragment.onV7StatsLoadFinished();
            homeFragment.refreshHomeUiState();
        }
    }

    private final void syncV7BetStatsFromCache() {
        Integer id;
        BaseUserModel userModel = getUserService().getShortProfile().getUserModel();
        if (userModel == null || (id = userModel.getId()) == null) {
            return;
        }
        int intValue = id.intValue();
        this.v7BetStats = getV7UserBetStatisticsInteractor().getFromCacheIfExists(Integer.valueOf(intValue), null);
        this.v7BetStatsRecent = getV7UserBetStatisticsInteractor().getFromCacheIfExists(Integer.valueOf(intValue), homeBetStatsRecentParams());
        this.v7Ranks = getV7UserRanksInteractor().getFromCacheIfExists(Integer.valueOf(intValue), null);
        this.v7UserInfo = getV7UserInfoInteractor().getFromCacheIfExists(Integer.valueOf(intValue), null);
    }

    static /* synthetic */ void loadDailyQuests$default(HomeFragment homeFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        homeFragment.loadDailyQuests(z);
    }

    private final void loadDailyQuests(final boolean trackRefresh) {
        if (isActive()) {
            HomeDailyQuestController homeDailyQuestController = getHomeDailyQuestController();
            UserService userService = getUserService();
            Intrinsics.checkNotNullExpressionValue(userService, "getUserService(...)");
            homeDailyQuestController.load(userService, new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit loadDailyQuests$lambda$12;
                    loadDailyQuests$lambda$12 = HomeFragment.loadDailyQuests$lambda$12(trackRefresh, this);
                    return loadDailyQuests$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDailyQuests$lambda$12(boolean z, HomeFragment homeFragment) {
        if (z) {
            homeFragment.homeRefreshTracker.end(HomeRefreshTracker.Section.DailyQuests);
            homeFragment.updatePullRefreshIndicator();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getBonusOfferActive() {
        return ((Boolean) this.bonusOfferActive.getValue()).booleanValue();
    }

    private final void setBonusOfferActive(boolean z) {
        this.bonusOfferActive.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HomeActiveOfferUiState getActiveHomeOffer() {
        return (HomeActiveOfferUiState) this.activeHomeOffer.getValue();
    }

    private final void setActiveHomeOffer(HomeActiveOfferUiState homeActiveOfferUiState) {
        this.activeHomeOffer.setValue(homeActiveOfferUiState);
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isActive()) {
            if (!getUserService().isRegistered()) {
                refreshHomeUiState();
                return;
            }
            HomeFragment homeFragment = this;
            getUserService().subscribe(homeFragment, UserService.InfoKind.RANKS, UserService.InfoKind.STATS);
            getUserService().getProfile(homeFragment, UserService.InfoKind.RANKS, UserService.InfoKind.STATS);
            getHomeVideoBonusController().start();
            Integer pendingCollectDialogAmount = getHomeVideoBonusController().getPendingCollectDialogAmount();
            if (pendingCollectDialogAmount != null) {
                final int intValue = pendingCollectDialogAmount.intValue();
                View view = getView();
                if (view != null) {
                    view.post(new Runnable() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            HomeFragment.this.showHomeVideoCollectDialog(intValue);
                        }
                    });
                }
            }
            tryScheduleAutoDailyBonusPresentation();
            loadDailyQuests$default(this, false, 1, null);
            loadV7HomeStats(false, true);
            refreshPromo(false);
            ensureHomeMatchesLoaded();
            loadBattlesBadgeCount$default(this, false, 1, null);
            refreshHomeUiState();
        }
    }

    private final void ensureHomeMatchesLoaded() {
        if (isActive()) {
            HomeMatchesPaginationController.PageState livePage = this.homeMatchesPagination.getLivePage();
            HomeMatchesPaginationController.PageState morePage = this.homeMatchesPagination.getMorePage();
            if (livePage.isInitialLoading() || morePage.isInitialLoading()) {
                return;
            }
            if (this.homeLiveInitialCompleted && this.homeMoreInitialCompleted) {
                return;
            }
            loadHomeFeedData$default(this, false, false, 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        getUserService().unsubscribe(this);
        getHomeVideoBonusController().pausePolling();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDailyQuestTaskClicked(DailyQuestTask task) {
        DailyQuestDestination resolveDestination = DailyQuestTaskNavigation.INSTANCE.resolveDestination(task);
        if (resolveDestination instanceof DailyQuestDestination.Navigate) {
            EventBus.getDefault().post(new NavigateMessage(((DailyQuestDestination.Navigate) resolveDestination).getTarget(), null));
            return;
        }
        if (Intrinsics.areEqual(resolveDestination, DailyQuestDestination.ShowDailyBonus.INSTANCE)) {
            EventBus.getDefault().post(new ShowDailyBonusDialogMessage());
        } else if (Intrinsics.areEqual(resolveDestination, DailyQuestDestination.TriggerVideoReward.INSTANCE)) {
            getHomeVideoBonusController().onAdsButtonClicked();
        } else if (!Intrinsics.areEqual(resolveDestination, DailyQuestDestination.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean isTourBlockingDailyBonusAutoPresentation() {
        TourComposeHelper tourComposeHelper;
        FragmentActivity activity = getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity == null || (tourComposeHelper = mainActivity.tourComposeHelper) == null) {
            return false;
        }
        return tourComposeHelper.isTourActive() || tourComposeHelper.shouldShowTour();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryScheduleAutoDailyBonusPresentation() {
        View view;
        if (isActive() && isAdded() && (view = getView()) != null) {
            view.post(new Runnable() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragment.tryScheduleAutoDailyBonusPresentation$lambda$15(HomeFragment.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryScheduleAutoDailyBonusPresentation$lambda$15(HomeFragment homeFragment) {
        if (homeFragment.isActive() && homeFragment.isResumed() && !homeFragment.isTourBlockingDailyBonusAutoPresentation() && homeFragment.getDailyBonusController().shouldAutoPresentDailyBonus()) {
            homeFragment.getDailyBonusController().markAutoDailyPromptConsumedForProcess();
            EventBus.getDefault().post(new ShowDailyBonusDialogMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHomeVideoCollectDialog(int amount) {
        if (isAdded()) {
            if (this.isVideoRewardDialogShowing) {
                Log.d("HomeFragment", "Video reward dialog already showing, skipping duplicate");
                return;
            }
            FragmentActivity activity = getActivity();
            final FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
            if (getChildFragmentManager().findFragmentByTag(VideoRewardCollectDialogHelper.DIALOG_TAG) == null) {
                if ((supportFragmentManager != null ? supportFragmentManager.findFragmentByTag(VideoRewardCollectDialogHelper.DIALOG_TAG) : null) == null) {
                    this.isVideoRewardDialogShowing = true;
                    FragmentActivity requireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    String string = getString(R.string.home_daily_bonus_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = getString(R.string.home_daily_bonus_got);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    VideoRewardCollectDialogHelper.showSafely$default(requireActivity, childFragmentManager, amount, string, string2, new VideoRewardCollectDialogFragment.OnCollectListener() { // from class: org.betup.ui.fragment.home.HomeFragment$showHomeVideoCollectDialog$1
                        @Override // org.betup.ui.dialogs.VideoRewardCollectDialogFragment.OnCollectListener
                        public void onCollect(int rewardAmount) {
                            HomeFragment.this.isVideoRewardDialogShowing = false;
                            HomeFragment.this.getHomeVideoBonusController().onRewardCollectDialogConfirmed();
                            RewardSyncHelper rewardSyncHelper = RewardSyncHelper.INSTANCE;
                            UserService userService = HomeFragment.this.getUserService();
                            Intrinsics.checkNotNullExpressionValue(userService, "getUserService(...)");
                            RewardSyncHelper.syncProfileAndNotify$default(rewardSyncHelper, userService, 0L, 2, null);
                        }
                    }, new VideoRewardCollectDialogFragment.OnDismissListener() { // from class: org.betup.ui.fragment.home.HomeFragment$showHomeVideoCollectDialog$2
                        @Override // org.betup.ui.dialogs.VideoRewardCollectDialogFragment.OnDismissListener
                        public void onDismiss() {
                            HomeFragment.this.isVideoRewardDialogShowing = false;
                            HomeFragment.this.getHomeVideoBonusController().markCollectDialogShown();
                            HomeFragment.this.getHomeVideoBonusController().refreshAfterVideoWatched();
                        }
                    }, R.drawable.watched_video_prize_img, null, 256, null);
                    getHomeVideoBonusController().markCollectDialogShown();
                    View view = getView();
                    if (view != null) {
                        view.postDelayed(new Runnable() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                HomeFragment.showHomeVideoCollectDialog$lambda$16(HomeFragment.this, supportFragmentManager);
                            }
                        }, 600L);
                        return;
                    }
                    return;
                }
            }
            getHomeVideoBonusController().markCollectDialogShown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHomeVideoCollectDialog$lambda$16(HomeFragment homeFragment, FragmentManager fragmentManager) {
        if (homeFragment.getChildFragmentManager().findFragmentByTag(VideoRewardCollectDialogHelper.DIALOG_TAG) == null) {
            if ((fragmentManager != null ? fragmentManager.findFragmentByTag(VideoRewardCollectDialogHelper.DIALOG_TAG) : null) == null) {
                homeFragment.isVideoRewardDialogShowing = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOffersInfoListener$lambda$17(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (homeFragment.isActive()) {
            boolean z = false;
            int count = fetchedResponseMessage.getStat() == FetchStat.SUCCESS ? ((OffersInfoModel) fetchedResponseMessage.getModel()).getCount() : 0;
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS && count > 0 && homeFragment.getAbTestService().offersEnabled()) {
                z = true;
            }
            homeFragment.setBonusOfferActive(z);
            if (homeFragment.getBonusOfferActive()) {
                homeFragment.loadActiveHomeOfferDetails();
            } else {
                homeFragment.setActiveHomeOffer(null);
                if (homeFragment.promoLoading) {
                    homeFragment.finishPromoRefresh();
                    return;
                }
            }
            homeFragment.refreshHomeUiState();
        }
    }

    private final void loadActiveHomeOfferDetails() {
        if (getAbTestService().offersEnabled()) {
            getGetOffersListInteractor().load(this.getOffersListListener, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOffersListListener$lambda$21(HomeFragment homeFragment, FetchedResponseMessage fetchedResponseMessage) {
        Object m10853constructorimpl;
        Object obj;
        if (homeFragment.isActive()) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS || !homeFragment.getBonusOfferActive()) {
                homeFragment.setActiveHomeOffer(null);
                if (homeFragment.promoLoading) {
                    homeFragment.finishPromoRefresh();
                    return;
                } else {
                    homeFragment.refreshHomeUiState();
                    return;
                }
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Json defaultModel = ApiUtils.INSTANCE.getDefaultModel();
                Object model = fetchedResponseMessage.getModel();
                Intrinsics.checkNotNullExpressionValue(model, "getModel(...)");
                defaultModel.getSerializersModule();
                m10853constructorimpl = Result.m10853constructorimpl((List) defaultModel.decodeFromString(new ArrayListSerializer(OfferModel.INSTANCE.serializer()), (String) model));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            List emptyList = CollectionsKt.emptyList();
            if (Result.m10859isFailureimpl(m10853constructorimpl)) {
                m10853constructorimpl = emptyList;
            }
            Iterator it = ((List) m10853constructorimpl).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (!BillingServiceUtilsKt.isOfferExpired(Long.valueOf(((OfferModel) obj).getExpiresAt().getTime()))) {
                        break;
                    }
                }
            }
            OfferModel offerModel = (OfferModel) obj;
            homeFragment.setActiveHomeOffer(offerModel != null ? new HomeActiveOfferUiState(offerModel.getTitle(), offerModel.getBetcoins(), offerModel.getExpiresAt().getTime()) : null);
            if (homeFragment.promoLoading) {
                homeFragment.finishPromoRefresh();
            } else {
                homeFragment.refreshHomeUiState();
            }
        }
    }

    private final void refreshSingleHomeMatch(long matchId) {
        HomeMatchOddsRefresher homeMatchOddsRefresher;
        if (!isActive() || (homeMatchOddsRefresher = this.homeMatchOddsRefresher) == null) {
            return;
        }
        if (homeMatchOddsRefresher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchOddsRefresher");
            homeMatchOddsRefresher = null;
        }
        homeMatchOddsRefresher.refreshMatchInPlace(matchId, this.homeMatchesPagination, new Function0() { // from class: org.betup.ui.fragment.home.HomeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit refreshSingleHomeMatch$lambda$22;
                refreshSingleHomeMatch$lambda$22 = HomeFragment.refreshSingleHomeMatch$lambda$22(HomeFragment.this);
                return refreshSingleHomeMatch$lambda$22;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshSingleHomeMatch$lambda$22(HomeFragment homeFragment) {
        homeFragment.refreshHomeUiState();
        return Unit.INSTANCE;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processBetsPlaced(BetlistUpdatedMessage message) {
        HomeMatchBetController homeMatchBetController;
        if (!isActive() || (homeMatchBetController = this.homeMatchBetController) == null) {
            return;
        }
        if (homeMatchBetController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
            homeMatchBetController = null;
        }
        homeMatchBetController.notifyBetlistChanged();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onUserBetStatisticsInvalidated(UserBetStatisticsInvalidatedMessage message) {
        if (isActive()) {
            reloadV7HomeStatsFromApi();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCoefficientUpdated(CoefficientUpdatedMessage message) {
        HomeMatchBetController homeMatchBetController;
        Long matchId;
        if (!isActive() || (homeMatchBetController = this.homeMatchBetController) == null) {
            return;
        }
        if (homeMatchBetController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeMatchBetController");
            homeMatchBetController = null;
        }
        homeMatchBetController.notifyBetlistChanged();
        if (message == null || (matchId = message.getMatchId()) == null) {
            return;
        }
        refreshSingleHomeMatch(matchId.longValue());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processPurchaseRefresh(OffersUpdatedMessage offersUpdatedMessage) {
        setBonusOfferActive(true);
        loadActiveHomeOfferDetails();
        refreshHomeUiState();
        getGetOffersInfoInteractor().invalidate();
        if (getAbTestService().offersEnabled()) {
            getGetOffersInfoInteractor().load(this.getOffersInfoListener, null);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBattlesChanged(ChallengeAcceptedOrCreatedEvent message) {
        if (isActive()) {
            loadBattlesBadgeCount(true);
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getHomeVideoBonusController().stop();
        getHomeDailyQuestController().clear();
        this.homeRefreshTracker.clear();
        this.statsLoading = false;
        this.promoLoading = false;
        this.statsTrackRefresh = false;
        super.onDestroyView();
    }
}
