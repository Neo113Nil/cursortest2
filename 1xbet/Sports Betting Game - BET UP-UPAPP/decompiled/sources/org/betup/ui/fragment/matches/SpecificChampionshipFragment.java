package org.betup.ui.fragment.matches;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.X3;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.BetUpApp;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.BetsUnlockedMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.bus.NavigateMessage;
import org.betup.bus.TourCloseMessage;
import org.betup.bus.TourFinishedMessage;
import org.betup.bus.TourMessage;
import org.betup.bus.UpgradeAccountMessage;
import org.betup.model.local.entity.BetPresentation;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewSpecificChampionshipInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.shop.NewSingleShopInteractor;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.model.remote.entity.PageOptions;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.bets.BetGroupSectionModel;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.MatchesForLeagueModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetGroupModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetSectionModel;
import org.betup.model.remote.entity.matches.championship.specific.NewLeagueModel;
import org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.NewMatchDetailsDataModel;
import org.betup.model.remote.entity.matches.championship.specific.NewMatchesForLeagueModel;
import org.betup.model.remote.entity.matches.championship.specific.NewSportModel;
import org.betup.model.remote.entity.matches.championship.specific.NewToOldModelConverter;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.model.remote.entity.user.UserFavouritesInfoModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetMatchClickResult;
import org.betup.services.betlist.BetValidator;
import org.betup.services.billing.BillingService;
import org.betup.services.billing.PurchaseCompletedListener;
import org.betup.services.billing.UnlockBetTypesFlow;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.VideoRewardService;
import org.betup.services.offer.banner.BannerFactory;
import org.betup.services.offer.banner.BannerProvider;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.ui.BackPressedController;
import org.betup.ui.FilterController;
import org.betup.ui.MainActivity;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.TabMenuItem;
import org.betup.ui.base.ItemClickListener;
import org.betup.ui.common.Paginator;
import org.betup.ui.dialogs.OddsDialogFragment;
import org.betup.ui.dialogs.OneClickBetSettingsDialogFragment;
import org.betup.ui.fragment.BaseAnimatedFragment;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.matches.adapter.BetClickListener;
import org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.betup.ui.tour.Tour;
import org.betup.ui.tour.TourHelper;
import org.betup.ui.tour.TourHelperPosition;
import org.betup.ui.tour.TourHelperSign;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.betup.ui.views.CustomNotScrolledLayoutManager;
import org.betup.ui.views.OvalFloatingButton;
import org.betup.utils.DateHelper;
import org.betup.utils.PicassoHelper;
import org.betup.utils.SnackbarHelper;
import org.betup.utils.TooltipUtil;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import tourguide.tourguide.Overlay;
import tourguide.tourguide.Pointer;
import tourguide.tourguide.ToolTip;
import tourguide.tourguide.TourGuide;

/* compiled from: SpecificChampionshipFragment.kt */
@Metadata(d1 = {"\u0000\u009c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0082\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006:\b\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010®\u0001\u001a\u00030¯\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010±\u0001H\u0016J\u0014\u0010²\u0001\u001a\u00030¯\u00012\b\u0010³\u0001\u001a\u00030±\u0001H\u0016J#\u0010´\u0001\u001a\u00030¯\u00012\t\b\u0001\u0010µ\u0001\u001a\u00020+2\f\b\u0001\u0010°\u0001\u001a\u0005\u0018\u00010±\u0001H\u0014J \u0010¶\u0001\u001a\u00030¯\u00012\n\u0010·\u0001\u001a\u0005\u0018\u00010¸\u00012\b\u0010¹\u0001\u001a\u00030\u009f\u0001H\u0014J\u0014\u0010º\u0001\u001a\u00030¯\u00012\b\u0010»\u0001\u001a\u00030¼\u0001H\u0014J\"\u0010½\u0001\u001a\u00030¯\u00012\u0016\u0010¾\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\u0005\u0012\u00030¡\u00010¿\u0001H\u0003J\f\u0010À\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0002J\n\u0010Á\u0001\u001a\u00030¯\u0001H\u0002J\u0014\u0010Â\u0001\u001a\u00030¯\u00012\b\u0010Ã\u0001\u001a\u00030Ä\u0001H\u0002J\n\u0010Å\u0001\u001a\u00030¯\u0001H\u0002J\n\u0010Æ\u0001\u001a\u00030¯\u0001H\u0002J\n\u0010Ç\u0001\u001a\u00030¯\u0001H\u0002J\n\u0010È\u0001\u001a\u00030¯\u0001H\u0002J\u001a\u0010É\u0001\u001a\u00030¯\u00012\u000e\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030Ë\u0001H\u0002J\n\u0010Ì\u0001\u001a\u00030\u009f\u0001H\u0016J\u0013\u0010Í\u0001\u001a\u00030¯\u00012\u0007\u0010Î\u0001\u001a\u00020+H\u0007J\n\u0010Ï\u0001\u001a\u00030¯\u0001H\u0007J\n\u0010Ð\u0001\u001a\u00030¯\u0001H\u0007J+\u0010Ñ\u0001\u001a\u00020+2\b\u0010Ò\u0001\u001a\u00030Ó\u00012\n\u0010Ô\u0001\u001a\u0005\u0018\u00010Õ\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010±\u0001H\u0016J\n\u0010Ö\u0001\u001a\u00030¯\u0001H\u0002J\u0013\u0010×\u0001\u001a\u00030¯\u00012\u0007\u0010Ø\u0001\u001a\u00020\u0003H\u0016J\u0014\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u0001H\u0016J\n\u0010Ý\u0001\u001a\u00030¯\u0001H\u0016J\n\u0010Þ\u0001\u001a\u00030¯\u0001H\u0002J\n\u0010ß\u0001\u001a\u00030¯\u0001H\u0002J\n\u0010à\u0001\u001a\u00030¯\u0001H\u0002J\n\u0010á\u0001\u001a\u00030¯\u0001H\u0016J\n\u0010â\u0001\u001a\u00030¯\u0001H\u0002J\u0014\u0010ã\u0001\u001a\u00030¯\u00012\b\u0010ä\u0001\u001a\u00030å\u0001H\u0002J\u0014\u0010æ\u0001\u001a\u00030ç\u00012\b\u0010è\u0001\u001a\u00030å\u0001H\u0002J\u0014\u0010é\u0001\u001a\u00030å\u00012\b\u0010ê\u0001\u001a\u00030ç\u0001H\u0002J\u0014\u0010ë\u0001\u001a\u00030¯\u00012\b\u0010ì\u0001\u001a\u00030í\u0001H\u0007J\u0014\u0010î\u0001\u001a\u00030¯\u00012\b\u0010ì\u0001\u001a\u00030ï\u0001H\u0007J\u0014\u0010ð\u0001\u001a\u00030¯\u00012\b\u0010ñ\u0001\u001a\u00030ò\u0001H\u0007J\u0014\u0010ó\u0001\u001a\u00030¯\u00012\b\u0010ì\u0001\u001a\u00030ô\u0001H\u0007J\u0014\u0010õ\u0001\u001a\u00030¯\u00012\b\u0010ì\u0001\u001a\u00030ö\u0001H\u0007J\n\u0010÷\u0001\u001a\u00030¯\u0001H\u0016J\n\u0010ø\u0001\u001a\u00030¯\u0001H\u0016J\n\u0010ù\u0001\u001a\u00030¯\u0001H\u0016J\n\u0010ú\u0001\u001a\u00030¯\u0001H\u0007J\n\u0010û\u0001\u001a\u00030¯\u0001H\u0002J\u001a\u0010ü\u0001\u001a\u00030¯\u00012\u000e\u0010ý\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030Ë\u0001H\u0002J\n\u0010þ\u0001\u001a\u00030¯\u0001H\u0002J\u001e\u0010ÿ\u0001\u001a\u00030¯\u00012\b\u0010\u0080\u0002\u001a\u00030¡\u00012\b\u0010\u0081\u0002\u001a\u00030¡\u0001H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u0014R\u001e\u00103\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u001e\u00106\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\u001e\u00109\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010N\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010Z\u001a\u00020[8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001e\u0010`\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001e\u0010f\u001a\u00020g8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001e\u0010l\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001e\u0010r\u001a\u00020s8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001e\u0010x\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\"\u0010~\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R$\u0010\u0084\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R$\u0010\u008a\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0012\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u009e\u0001\u001a\u00030\u009f\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u0001\u001a\u00030¡\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010¢\u0001\u001a\u00030£\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010¤\u0001\u001a\u00030\u009f\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010¥\u0001\u001a\u00030¦\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010§\u0001\u001a\u0013\u0012\u0005\u0012\u00030¡\u0001\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010¨\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010©\u0001\u001a\u0005\u0018\u00010ª\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010«\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\u0005\u0012\u00030¡\u00010¬\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0086\u0002²\u0006\u0013\u0010\u0087\u0002\u001a\n\u0012\u0005\u0012\u00030å\u00010Ë\u0001X\u008a\u0084\u0002²\u0006\f\u0010\u0088\u0002\u001a\u00030å\u0001X\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment;", "Lorg/betup/ui/fragment/BaseAnimatedFragment;", "Lorg/betup/ui/base/ItemClickListener;", "Lorg/betup/model/remote/entity/matches/championship/specific/ListedMatchModel;", "Lorg/betup/ui/fragment/matches/adapter/BetClickListener;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", "Lorg/betup/ui/common/Paginator$StaticPageContentLoader;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "fab", "Lorg/betup/ui/views/OvalFloatingButton;", "getFab", "()Lorg/betup/ui/views/OvalFloatingButton;", "setFab", "(Lorg/betup/ui/views/OvalFloatingButton;)V", "leagueIcon", "Landroid/widget/ImageView;", "getLeagueIcon", "()Landroid/widget/ImageView;", "setLeagueIcon", "(Landroid/widget/ImageView;)V", "leagueName", "Landroid/widget/TextView;", "getLeagueName", "()Landroid/widget/TextView;", "setLeagueName", "(Landroid/widget/TextView;)V", "swipeRefreshLayout", "Lcom/omadahealth/github/swipyrefreshlayout/library/SwipyRefreshLayout;", "getSwipeRefreshLayout", "()Lcom/omadahealth/github/swipyrefreshlayout/library/SwipyRefreshLayout;", "setSwipeRefreshLayout", "(Lcom/omadahealth/github/swipyrefreshlayout/library/SwipyRefreshLayout;)V", "specificChampionshipListView", "Landroidx/recyclerview/widget/RecyclerView;", "getSpecificChampionshipListView", "()Landroidx/recyclerview/widget/RecyclerView;", "setSpecificChampionshipListView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "empty", "getEmpty", "setEmpty", "progressBar", "Landroid/view/View;", "getProgressBar", "()Landroid/view/View;", "setProgressBar", "(Landroid/view/View;)V", "favorite", "getFavorite", "setFavorite", "expandButton", "getExpandButton", "setExpandButton", "expandContainer", "getExpandContainer", "setExpandContainer", "oneClickBetIv", "getOneClickBetIv", "setOneClickBetIv", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "newSpecificChampionshipInteractor", "Lorg/betup/model/remote/api/rest/matches/NewSpecificChampionshipInteractor;", "getNewSpecificChampionshipInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewSpecificChampionshipInteractor;", "setNewSpecificChampionshipInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewSpecificChampionshipInteractor;)V", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "getBetListAppender", "()Lorg/betup/services/betlist/BetListAppender;", "setBetListAppender", "(Lorg/betup/services/betlist/BetListAppender;)V", "betValidator", "Lorg/betup/services/betlist/BetValidator;", "getBetValidator", "()Lorg/betup/services/betlist/BetValidator;", "setBetValidator", "(Lorg/betup/services/betlist/BetValidator;)V", "putFavoriteLeaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;", "getPutFavoriteLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;", "setPutFavoriteLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;)V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "billingService", "Lorg/betup/services/billing/BillingService;", "getBillingService", "()Lorg/betup/services/billing/BillingService;", "setBillingService", "(Lorg/betup/services/billing/BillingService;)V", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getFirebaseRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setFirebaseRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "singleShopInteractor", "Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "getSingleShopInteractor", "()Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;", "setSingleShopInteractor", "(Lorg/betup/model/remote/api/rest/shop/NewSingleShopInteractor;)V", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "getAnalyticsService", "()Lorg/betup/services/analytics/AnalyticsService;", "setAnalyticsService", "(Lorg/betup/services/analytics/AnalyticsService;)V", "videoRewardService", "Lorg/betup/services/offer/VideoRewardService;", "getVideoRewardService", "()Lorg/betup/services/offer/VideoRewardService;", "setVideoRewardService", "(Lorg/betup/services/offer/VideoRewardService;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "appLanguageObserver", "Lorg/betup/services/language/AppLanguageObserver;", "getAppLanguageObserver", "()Lorg/betup/services/language/AppLanguageObserver;", "setAppLanguageObserver", "(Lorg/betup/services/language/AppLanguageObserver;)V", "matchFilterCompose", "Landroidx/compose/ui/platform/ComposeView;", "getMatchFilterCompose", "()Landroidx/compose/ui/platform/ComposeView;", "setMatchFilterCompose", "(Landroidx/compose/ui/platform/ComposeView;)V", "championshipAdapter", "Lorg/betup/ui/fragment/matches/adapter/SpecificChampionshipAdapter;", "filterController", "Lorg/betup/ui/FilterController;", "tourHelper", "Lorg/betup/ui/tour/TourHelper;", "backPressedController", "Lorg/betup/ui/BackPressedController;", "bannerProvider", "Lorg/betup/services/offer/banner/BannerProvider;", "expandHighlighter", "Ltourguide/tourguide/TourGuide;", "paginator", "Lorg/betup/ui/common/Paginator;", SpecificChampionshipFragment.ARG_IS_LIVE, "", "sid", "", "betPresentation", "Lorg/betup/model/local/entity/BetPresentation;", "isFavorite", "lastFilterChange", "", "pendingScrollRestoreFromConfig", "Lkotlin/Pair;", "pendingListRestoreState", "Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$ListRestoreState;", "fetchListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchesForLeagueModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onViewReady", ViewHierarchyConstants.VIEW_KEY, "onUserReady", "userModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "success", "onFragmentAttached", "context", "Landroid/content/Context;", "handleApiResponse", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "saveListStateBeforeRefresh", "applyPendingListRestoreState", "setLeagueInfo", "leagueInfo", "Lorg/betup/model/remote/entity/matches/championship/specific/NewLeagueModel;", "setFallbackLeagueInfo", "updateFavoriteState", "handleExpandHighlight", "updateExpandButtonVisibility", "handleTourLogic", "matches", "", "onBackPressed", "onLeagueClick", "v", "onBackClick", "favClick", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "updateOneClickBetIcon", "itemClicked", "item", "onMatchBetClick", "Lorg/betup/services/betlist/BetMatchClickResult;", "bet", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", X3.i.u0, "syncBetPresentationWithGlobalPreference", "updateExpandButtonIcon", "refreshBetsPreservingScroll", X3.i.t0, "setupFilterCompose", "onFilterSelectedFromCompose", "newFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "toMatchesFilter", "Lorg/betup/ui/FilterController$MatchesFilter;", SpecificChampionshipFragment.ARG_FILTER, "newMatchFilterFrom", "matchesFilter", "processBetsPlaced", "message", "Lorg/betup/bus/BetlistUpdatedMessage;", "onCoefficientUpdated", "Lorg/betup/bus/CoefficientUpdatedMessage;", "onFilterChanged", "event", "Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$FilterChangedEvent;", "onTourFinished", "Lorg/betup/bus/TourFinishedMessage;", "onBetsUnlocked", "Lorg/betup/bus/BetsUnlockedMessage;", "onStart", "onStop", "onDestroy", "onExpandButtonClick", "highlightExpandButton", "displayTour", "list", "initializePagination", "loadItems", "offset", MatchMyBetsInteractor.PARAM_LIMIT, VastTagName.COMPANION, "LeagueFavoriteChangedEvent", "FilterChangedEvent", "ListRestoreState", "app_release", "filterList", "selectedFilter"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpecificChampionshipFragment extends BaseAnimatedFragment implements ItemClickListener<ListedMatchModel>, BetClickListener, BackPressedController.BackPressedListener, Paginator.StaticPageContentLoader {
    private static final String ARG_FILTER = "filter";
    private static final String ARG_IS_LIVE = "isLive";
    private static final String ARG_SID = "sid";
    private static final long FILTER_DEBOUNCE_MS = 500;
    private static final float HIGHLIGHT_ANIMATION_DISTANCE = 200.0f;
    private static final long HIGHLIGHT_ANIMATION_DURATION = 1000;
    private static final String KEY_RECYCLER_FIRST_POS = "recycler_first_pos";
    private static final String KEY_RECYCLER_SCROLL_OFFSET = "recycler_scroll_offset";
    private static final String TAG = "SpecificChampionshipFragment";
    private static final long TOUR_DELAY_MS = 300;

    @Inject
    public AnalyticsService analyticsService;

    @Inject
    public AppLanguageObserver appLanguageObserver;
    private BackPressedController backPressedController;
    private BannerProvider bannerProvider;

    @Inject
    public BetListAppender betListAppender;

    @Inject
    public BetValidator betValidator;

    @Inject
    public BillingService billingService;
    private SpecificChampionshipAdapter championshipAdapter;

    @BindView(R.id.empty)
    public TextView empty;

    @BindView(org.betup.R.id.expandButton)
    public ImageView expandButton;

    @BindView(org.betup.R.id.expandContainer)
    public View expandContainer;
    private TourGuide expandHighlighter;

    @BindView(org.betup.R.id.fab_new)
    public OvalFloatingButton fab;

    @BindView(org.betup.R.id.fav)
    public ImageView favorite;
    private FilterController filterController;

    @Inject
    public FirebaseRemoteConfig firebaseRemoteConfig;
    private boolean isFavorite;
    private boolean isLive;
    private long lastFilterChange;

    @BindView(org.betup.R.id.specificLeagueIcon)
    public ImageView leagueIcon;

    @BindView(org.betup.R.id.specificLeagueName)
    public TextView leagueName;

    @Inject
    public LocalPreferencesService localPreferencesService;

    @BindView(org.betup.R.id.matchFilterCompose)
    public ComposeView matchFilterCompose;

    @Inject
    public MatchFilterState matchFilterState;

    @Inject
    public NewSpecificChampionshipInteractor newSpecificChampionshipInteractor;

    @BindView(org.betup.R.id.one_click_bet_iv)
    public ImageView oneClickBetIv;
    private Paginator paginator;
    private ListRestoreState pendingListRestoreState;
    private Pair<Integer, Integer> pendingScrollRestoreFromConfig;

    @BindView(org.betup.R.id.progressBar)
    public View progressBar;

    @Inject
    public PromoService promoService;

    @Inject
    public PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor;

    @Inject
    public NewSingleShopInteractor singleShopInteractor;

    @BindView(org.betup.R.id.listView)
    public RecyclerView specificChampionshipListView;

    @BindView(org.betup.R.id.swipeRefreshLayout)
    public SwipyRefreshLayout swipeRefreshLayout;
    private TourHelper tourHelper;

    @Inject
    public VideoRewardService videoRewardService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private int sid = -1;
    private BetPresentation betPresentation = BetPresentation.SHORT;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewMatchesForLeagueModel, Integer> fetchListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            SpecificChampionshipFragment.fetchListener$lambda$0(SpecificChampionshipFragment.this, fetchedResponseMessage);
        }
    };

    /* compiled from: SpecificChampionshipFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterController.MatchesFilter.values().length];
            try {
                iArr[FilterController.MatchesFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterController.MatchesFilter.ONE_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterController.MatchesFilter.LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterController.MatchesFilter.ONE_HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterController.MatchesFilter.THREE_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterController.MatchesFilter.SIX_HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FilterController.MatchesFilter.TWELVE_HOURS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SpecificChampionshipFragment.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_SID", "ARG_IS_LIVE", "ARG_FILTER", "TOUR_DELAY_MS", "", "HIGHLIGHT_ANIMATION_DURATION", "HIGHLIGHT_ANIMATION_DISTANCE", "", "FILTER_DEBOUNCE_MS", "KEY_RECYCLER_FIRST_POS", "KEY_RECYCLER_SCROLL_OFFSET", "setInstance", "Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment;", "sid", "", SpecificChampionshipFragment.ARG_IS_LIVE, "", SpecificChampionshipFragment.ARG_FILTER, "isFavorite", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SpecificChampionshipFragment setInstance$default(Companion companion, int i, boolean z, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            return companion.setInstance(i, z, str, z2);
        }

        public final SpecificChampionshipFragment setInstance(int sid, boolean isLive, String filter, boolean isFavorite) {
            SpecificChampionshipFragment specificChampionshipFragment = new SpecificChampionshipFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("sid", sid);
            bundle.putBoolean(SpecificChampionshipFragment.ARG_IS_LIVE, isLive);
            if (filter != null) {
                bundle.putString(SpecificChampionshipFragment.ARG_FILTER, filter);
            }
            bundle.putBoolean("isFavorite", isFavorite);
            specificChampionshipFragment.setArguments(bundle);
            return specificChampionshipFragment;
        }
    }

    public final OvalFloatingButton getFab() {
        OvalFloatingButton ovalFloatingButton = this.fab;
        if (ovalFloatingButton != null) {
            return ovalFloatingButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fab");
        return null;
    }

    public final void setFab(OvalFloatingButton ovalFloatingButton) {
        Intrinsics.checkNotNullParameter(ovalFloatingButton, "<set-?>");
        this.fab = ovalFloatingButton;
    }

    public final ImageView getLeagueIcon() {
        ImageView imageView = this.leagueIcon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leagueIcon");
        return null;
    }

    public final void setLeagueIcon(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.leagueIcon = imageView;
    }

    public final TextView getLeagueName() {
        TextView textView = this.leagueName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leagueName");
        return null;
    }

    public final void setLeagueName(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.leagueName = textView;
    }

    public final SwipyRefreshLayout getSwipeRefreshLayout() {
        SwipyRefreshLayout swipyRefreshLayout = this.swipeRefreshLayout;
        if (swipyRefreshLayout != null) {
            return swipyRefreshLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
        return null;
    }

    public final void setSwipeRefreshLayout(SwipyRefreshLayout swipyRefreshLayout) {
        Intrinsics.checkNotNullParameter(swipyRefreshLayout, "<set-?>");
        this.swipeRefreshLayout = swipyRefreshLayout;
    }

    public final RecyclerView getSpecificChampionshipListView() {
        RecyclerView recyclerView = this.specificChampionshipListView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("specificChampionshipListView");
        return null;
    }

    public final void setSpecificChampionshipListView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.specificChampionshipListView = recyclerView;
    }

    public final TextView getEmpty() {
        TextView textView = this.empty;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("empty");
        return null;
    }

    public final void setEmpty(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.empty = textView;
    }

    public final View getProgressBar() {
        View view = this.progressBar;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        return null;
    }

    public final void setProgressBar(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.progressBar = view;
    }

    public final ImageView getFavorite() {
        ImageView imageView = this.favorite;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("favorite");
        return null;
    }

    public final void setFavorite(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.favorite = imageView;
    }

    public final ImageView getExpandButton() {
        ImageView imageView = this.expandButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandButton");
        return null;
    }

    public final void setExpandButton(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.expandButton = imageView;
    }

    public final View getExpandContainer() {
        View view = this.expandContainer;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("expandContainer");
        return null;
    }

    public final void setExpandContainer(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.expandContainer = view;
    }

    public final ImageView getOneClickBetIv() {
        ImageView imageView = this.oneClickBetIv;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("oneClickBetIv");
        return null;
    }

    public final void setOneClickBetIv(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.oneClickBetIv = imageView;
    }

    public final PromoService getPromoService() {
        PromoService promoService = this.promoService;
        if (promoService != null) {
            return promoService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("promoService");
        return null;
    }

    public final void setPromoService(PromoService promoService) {
        Intrinsics.checkNotNullParameter(promoService, "<set-?>");
        this.promoService = promoService;
    }

    public final NewSpecificChampionshipInteractor getNewSpecificChampionshipInteractor() {
        NewSpecificChampionshipInteractor newSpecificChampionshipInteractor = this.newSpecificChampionshipInteractor;
        if (newSpecificChampionshipInteractor != null) {
            return newSpecificChampionshipInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newSpecificChampionshipInteractor");
        return null;
    }

    public final void setNewSpecificChampionshipInteractor(NewSpecificChampionshipInteractor newSpecificChampionshipInteractor) {
        Intrinsics.checkNotNullParameter(newSpecificChampionshipInteractor, "<set-?>");
        this.newSpecificChampionshipInteractor = newSpecificChampionshipInteractor;
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

    public final PutFavoriteLeaguesInteractor getPutFavoriteLeaguesInteractor() {
        PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor = this.putFavoriteLeaguesInteractor;
        if (putFavoriteLeaguesInteractor != null) {
            return putFavoriteLeaguesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("putFavoriteLeaguesInteractor");
        return null;
    }

    public final void setPutFavoriteLeaguesInteractor(PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor) {
        Intrinsics.checkNotNullParameter(putFavoriteLeaguesInteractor, "<set-?>");
        this.putFavoriteLeaguesInteractor = putFavoriteLeaguesInteractor;
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

    public final MatchFilterState getMatchFilterState() {
        MatchFilterState matchFilterState = this.matchFilterState;
        if (matchFilterState != null) {
            return matchFilterState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchFilterState");
        return null;
    }

    public final void setMatchFilterState(MatchFilterState matchFilterState) {
        Intrinsics.checkNotNullParameter(matchFilterState, "<set-?>");
        this.matchFilterState = matchFilterState;
    }

    public final AppLanguageObserver getAppLanguageObserver() {
        AppLanguageObserver appLanguageObserver = this.appLanguageObserver;
        if (appLanguageObserver != null) {
            return appLanguageObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appLanguageObserver");
        return null;
    }

    public final void setAppLanguageObserver(AppLanguageObserver appLanguageObserver) {
        Intrinsics.checkNotNullParameter(appLanguageObserver, "<set-?>");
        this.appLanguageObserver = appLanguageObserver;
    }

    public final ComposeView getMatchFilterCompose() {
        ComposeView composeView = this.matchFilterCompose;
        if (composeView != null) {
            return composeView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchFilterCompose");
        return null;
    }

    public final void setMatchFilterCompose(ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<set-?>");
        this.matchFilterCompose = composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchListener$lambda$0(SpecificChampionshipFragment specificChampionshipFragment, FetchedResponseMessage fetchedResponseMessage) {
        Intrinsics.checkNotNull(fetchedResponseMessage);
        specificChampionshipFragment.handleApiResponse(fetchedResponseMessage);
    }

    /* compiled from: SpecificChampionshipFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$LeagueFavoriteChangedEvent;", "", "leagueId", "", "isFavorite", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IZ)V", "getLeagueId", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeagueFavoriteChangedEvent {
        public static final int $stable = 0;
        private final boolean isFavorite;
        private final int leagueId;

        public static /* synthetic */ LeagueFavoriteChangedEvent copy$default(LeagueFavoriteChangedEvent leagueFavoriteChangedEvent, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = leagueFavoriteChangedEvent.leagueId;
            }
            if ((i2 & 2) != 0) {
                z = leagueFavoriteChangedEvent.isFavorite;
            }
            return leagueFavoriteChangedEvent.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getLeagueId() {
            return this.leagueId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFavorite() {
            return this.isFavorite;
        }

        public final LeagueFavoriteChangedEvent copy(int leagueId, boolean isFavorite) {
            return new LeagueFavoriteChangedEvent(leagueId, isFavorite);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeagueFavoriteChangedEvent)) {
                return false;
            }
            LeagueFavoriteChangedEvent leagueFavoriteChangedEvent = (LeagueFavoriteChangedEvent) other;
            return this.leagueId == leagueFavoriteChangedEvent.leagueId && this.isFavorite == leagueFavoriteChangedEvent.isFavorite;
        }

        public int hashCode() {
            return (Integer.hashCode(this.leagueId) * 31) + Boolean.hashCode(this.isFavorite);
        }

        public String toString() {
            return "LeagueFavoriteChangedEvent(leagueId=" + this.leagueId + ", isFavorite=" + this.isFavorite + ")";
        }

        public LeagueFavoriteChangedEvent(int i, boolean z) {
            this.leagueId = i;
            this.isFavorite = z;
        }

        public final int getLeagueId() {
            return this.leagueId;
        }

        public final boolean isFavorite() {
            return this.isFavorite;
        }
    }

    /* compiled from: SpecificChampionshipFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$FilterChangedEvent;", "", "newFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;)V", "getNewFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FilterChangedEvent {
        public static final int $stable = 8;
        private final NewMatchFilter newFilter;

        public static /* synthetic */ FilterChangedEvent copy$default(FilterChangedEvent filterChangedEvent, NewMatchFilter newMatchFilter, int i, Object obj) {
            if ((i & 1) != 0) {
                newMatchFilter = filterChangedEvent.newFilter;
            }
            return filterChangedEvent.copy(newMatchFilter);
        }

        /* renamed from: component1, reason: from getter */
        public final NewMatchFilter getNewFilter() {
            return this.newFilter;
        }

        public final FilterChangedEvent copy(NewMatchFilter newFilter) {
            Intrinsics.checkNotNullParameter(newFilter, "newFilter");
            return new FilterChangedEvent(newFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FilterChangedEvent) && Intrinsics.areEqual(this.newFilter, ((FilterChangedEvent) other).newFilter);
        }

        public int hashCode() {
            return this.newFilter.hashCode();
        }

        public String toString() {
            return "FilterChangedEvent(newFilter=" + this.newFilter + ")";
        }

        public FilterChangedEvent(NewMatchFilter newFilter) {
            Intrinsics.checkNotNullParameter(newFilter, "newFilter");
            this.newFilter = newFilter;
        }

        public final NewMatchFilter getNewFilter() {
            return this.newFilter;
        }
    }

    /* compiled from: SpecificChampionshipFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$ListRestoreState;", "", "firstVisiblePosition", "", "scrollOffset", "targetItemCount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(III)V", "getFirstVisiblePosition", "()I", "getScrollOffset", "getTargetItemCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class ListRestoreState {
        private final int firstVisiblePosition;
        private final int scrollOffset;
        private final int targetItemCount;

        public static /* synthetic */ ListRestoreState copy$default(ListRestoreState listRestoreState, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = listRestoreState.firstVisiblePosition;
            }
            if ((i4 & 2) != 0) {
                i2 = listRestoreState.scrollOffset;
            }
            if ((i4 & 4) != 0) {
                i3 = listRestoreState.targetItemCount;
            }
            return listRestoreState.copy(i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getFirstVisiblePosition() {
            return this.firstVisiblePosition;
        }

        /* renamed from: component2, reason: from getter */
        public final int getScrollOffset() {
            return this.scrollOffset;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTargetItemCount() {
            return this.targetItemCount;
        }

        public final ListRestoreState copy(int firstVisiblePosition, int scrollOffset, int targetItemCount) {
            return new ListRestoreState(firstVisiblePosition, scrollOffset, targetItemCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListRestoreState)) {
                return false;
            }
            ListRestoreState listRestoreState = (ListRestoreState) other;
            return this.firstVisiblePosition == listRestoreState.firstVisiblePosition && this.scrollOffset == listRestoreState.scrollOffset && this.targetItemCount == listRestoreState.targetItemCount;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.firstVisiblePosition) * 31) + Integer.hashCode(this.scrollOffset)) * 31) + Integer.hashCode(this.targetItemCount);
        }

        public String toString() {
            return "ListRestoreState(firstVisiblePosition=" + this.firstVisiblePosition + ", scrollOffset=" + this.scrollOffset + ", targetItemCount=" + this.targetItemCount + ")";
        }

        public ListRestoreState(int i, int i2, int i3) {
            this.firstVisiblePosition = i;
            this.scrollOffset = i2;
            this.targetItemCount = i3;
        }

        public final int getFirstVisiblePosition() {
            return this.firstVisiblePosition;
        }

        public final int getScrollOffset() {
            return this.scrollOffset;
        }

        public final int getTargetItemCount() {
            return this.targetItemCount;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.betup.ui.fragment.BaseAnimatedFragment, org.betup.ui.fragment.BaseFragmentWithProfileInfo, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        UserFavouritesInfoModel userFavouritesInfoModel;
        FilterController.MatchesFilter matchesFilter;
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new NullPointerException(getClass().getName());
        }
        this.sid = arguments.getInt("sid");
        this.isLive = arguments.getBoolean(ARG_IS_LIVE);
        if (getLocalPreferencesService().getGlobalExpandedBets()) {
            this.betPresentation = BetPresentation.FULL;
        } else {
            BetPresentation betPresentationForLeague = getLocalPreferencesService().getBetPresentationForLeague(this.sid);
            Intrinsics.checkNotNullExpressionValue(betPresentationForLeague, "getBetPresentationForLeague(...)");
            this.betPresentation = betPresentationForLeague;
        }
        boolean z = false;
        if (arguments.containsKey("isFavorite")) {
            this.isFavorite = arguments.getBoolean("isFavorite", false);
        } else {
            FullUserProfileModel profileIfFetched = getProfileIfFetched();
            if (profileIfFetched != null && (userFavouritesInfoModel = profileIfFetched.getUserFavouritesInfoModel()) != null && userFavouritesInfoModel.isFavouriteLeague(this.sid)) {
                z = true;
            }
            this.isFavorite = z;
        }
        String string = arguments.getString(ARG_FILTER);
        if (string != null) {
            switch (string.hashCode()) {
                case -2034083534:
                    if (string.equals("SIX_HOURS")) {
                        matchesFilter = FilterController.MatchesFilter.SIX_HOURS;
                        break;
                    }
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
                case -905268791:
                    if (string.equals("TWELVE_HOURS")) {
                        matchesFilter = FilterController.MatchesFilter.TWELVE_HOURS;
                        break;
                    }
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
                case -601958909:
                    if (string.equals("ONE_DAY")) {
                        matchesFilter = FilterController.MatchesFilter.ONE_DAY;
                        break;
                    }
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
                case -174765842:
                    if (string.equals("THREE_HOURS")) {
                        matchesFilter = FilterController.MatchesFilter.THREE_HOURS;
                        break;
                    }
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
                case 64897:
                    if (string.equals(V7UserBetStatisticsInteractor.STATS_TYPE_ALL)) {
                        matchesFilter = FilterController.MatchesFilter.ALL;
                        break;
                    }
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
                case 2223588:
                    if (string.equals("HOUR")) {
                        matchesFilter = FilterController.MatchesFilter.ONE_HOUR;
                        break;
                    }
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
                case 2337004:
                    if (string.equals("LIVE")) {
                        matchesFilter = FilterController.MatchesFilter.LIVE;
                        break;
                    }
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
                default:
                    matchesFilter = FilterController.MatchesFilter.ALL;
                    break;
            }
            try {
                KeyEventDispatcher.Component requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                if (requireActivity instanceof FilterController) {
                    ((FilterController) requireActivity).applyFilter(this.isLive ? FilterController.FilterType.LIVESCORE : FilterController.FilterType.SCHEDULED, matchesFilter);
                }
                getMatchFilterState().selectFilter(newMatchFilterFrom(matchesFilter));
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.e(TAG, "Failed to set filter: " + e.getMessage()));
            }
        } else {
            try {
                KeyEventDispatcher.Component requireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                if (requireActivity2 instanceof FilterController) {
                    FilterController.MatchesFilter filter = ((FilterController) requireActivity2).getFilter(this.isLive ? FilterController.FilterType.LIVESCORE : FilterController.FilterType.SCHEDULED);
                    MatchFilterState matchFilterState = getMatchFilterState();
                    Intrinsics.checkNotNull(filter);
                    matchFilterState.selectFilter(newMatchFilterFrom(filter));
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Exception e2) {
                Integer.valueOf(Log.e(TAG, "Failed to sync filter: " + e2.getMessage()));
            }
        }
        setTabMenuType(TabMenuItem.MATCHES);
        BannerProvider defaultBannerProdiver = BannerFactory.getDefaultBannerProdiver(requireActivity(), getPromoService());
        this.bannerProvider = defaultBannerProdiver;
        if (defaultBannerProdiver != null) {
            defaultBannerProdiver.requestNew();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        int findFirstVisibleItemPosition;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.specificChampionshipListView != null) {
            RecyclerView.LayoutManager layoutManager = getSpecificChampionshipListView().getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) >= 0) {
                outState.putInt(KEY_RECYCLER_FIRST_POS, findFirstVisibleItemPosition);
                View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                outState.putInt(KEY_RECYCLER_SCROLL_OFFSET, findViewByPosition != null ? findViewByPosition.getTop() : 0);
            }
        }
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onViewReady(View view, Bundle savedInstanceState) {
        CustomNotScrolledLayoutManager linearLayoutManager;
        TourHelper tourHelper;
        TourHelper tourHelper2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewReady(view, savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey(KEY_RECYCLER_FIRST_POS)) {
            this.pendingScrollRestoreFromConfig = new Pair<>(Integer.valueOf(savedInstanceState.getInt(KEY_RECYCLER_FIRST_POS)), Integer.valueOf(savedInstanceState.getInt(KEY_RECYCLER_SCROLL_OFFSET)));
        }
        this.championshipAdapter = new SpecificChampionshipAdapter(requireActivity(), getPromoService().shouldDisplayPromo(PromoService.PromoCase.DEFAULT) && ((tourHelper2 = this.tourHelper) == null || !tourHelper2.isTour()), this.bannerProvider, getBetListAppender(), getUserService().getOddType());
        TourHelper tourHelper3 = this.tourHelper;
        if (tourHelper3 != null && tourHelper3.isTour() && ((tourHelper = this.tourHelper) == null || !tourHelper.wasShown(Tour.LIVE_MATCHES_MATCH_SELECT))) {
            linearLayoutManager = new CustomNotScrolledLayoutManager(requireActivity(), 1, false);
        } else {
            linearLayoutManager = new LinearLayoutManager(requireActivity(), 1, false);
        }
        getSpecificChampionshipListView().setLayoutManager(linearLayoutManager);
        getSpecificChampionshipListView().setSaveEnabled(false);
        getSpecificChampionshipListView().setAdapter(this.championshipAdapter);
        SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.setListener(this);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter2 = this.championshipAdapter;
        if (specificChampionshipAdapter2 != null) {
            specificChampionshipAdapter2.setBetClickListener(this);
        }
        getFavorite().setVisibility(8);
        FragmentActivity requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        TourComposeHelper tourComposeHelper = mainActivity != null ? mainActivity.tourComposeHelper : null;
        final TourState tourState = tourComposeHelper != null ? tourComposeHelper.getTourState() : null;
        Long tourMatchId = tourState != null ? tourState.getTourMatchId() : null;
        final Function1<? super Rect, Unit> function1 = tourComposeHelper != null ? tourComposeHelper.setMatchItemBounds : null;
        final Function1<? super Long, Unit> function12 = tourComposeHelper != null ? tourComposeHelper.setMatchItemId : null;
        Runnable runnable = new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                SpecificChampionshipFragment.onViewReady$lambda$2(TourState.this);
            }
        };
        SpecificChampionshipAdapter specificChampionshipAdapter3 = this.championshipAdapter;
        if (specificChampionshipAdapter3 != null) {
            specificChampionshipAdapter3.setTourCallbacks(tourMatchId, new Consumer() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda5
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    SpecificChampionshipFragment.onViewReady$lambda$3(Function1.this, (Rect) obj);
                }
            }, new Consumer() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    SpecificChampionshipFragment.onViewReady$lambda$4(Function1.this, (Long) obj);
                }
            }, runnable);
        }
        initializePagination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewReady$lambda$2(TourState tourState) {
        if (tourState != null) {
            tourState.setMatchScrollComplete(true);
        }
        Log.d(TAG, "Match scroll complete - overlay can be shown");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewReady$lambda$3(Function1 function1, Rect rect) {
        if (function1 != null) {
            function1.invoke(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewReady$lambda$4(Function1 function1, Long l) {
        if (function1 != null) {
            Intrinsics.checkNotNull(l);
            function1.invoke(l);
        }
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onUserReady(FullUserProfileModel userModel, boolean success) {
        Paginator paginator;
        if (success && isActive()) {
            SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
            if ((specificChampionshipAdapter != null ? specificChampionshipAdapter.getItemCount() : 0) != 0 || (paginator = this.paginator) == null) {
                return;
            }
            paginator.refresh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.ui.fragment.BaseFragment
    protected void onFragmentAttached(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onFragmentAttached(context);
        FilterController filterController = context instanceof FilterController ? (FilterController) context : null;
        if (filterController == null) {
            throw new ClassCastException(requireActivity() + " should implement FilterController interface");
        }
        this.filterController = filterController;
        KeyEventDispatcher.Component requireActivity = requireActivity();
        TourHelper tourHelper = requireActivity instanceof TourHelper ? (TourHelper) requireActivity : null;
        if (tourHelper == null) {
            throw new ClassCastException(context + " should implement TourHelper");
        }
        this.tourHelper = tourHelper;
        BackPressedController backPressedController = context instanceof BackPressedController ? (BackPressedController) context : null;
        if (backPressedController == null) {
            throw new ClassCastException(context + " should implement BackPressedController");
        }
        this.backPressedController = backPressedController;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:27|(1:339)(1:33)|34|(3:36|(7:39|(1:41)|42|(7:45|(1:47)|48|(7:51|(1:53)|54|(4:57|(2:59|60)(1:62)|61|55)|63|64|49)|65|66|43)|67|68|37)|69)|70|(8:72|(2:73|(7:75|(1:77)|78|(1:80)(1:120)|81|(5:83|(8:86|(1:88)|89|(1:91)(1:113)|92|(5:94|(6:97|(1:99)|100|(2:102|103)(2:105|106)|104|95)|107|108|109)(2:111|112)|110|84)|114|115|116)(2:118|119)|117)(0))|122|123|124|125|126|(10:128|(1:329)(1:134)|135|136|137|(5:139|(7:142|(1:211)(1:146)|(2:155|(3:159|(6:162|(3:164|(2:176|(2:177|(5:179|(3:181|(2:195|(2:196|(2:198|(2:200|201)(1:202))(2:203|204)))(1:185)|(3:187|188|(2:190|191)(1:192)))(1:205)|193|194|(0)(0))(2:206|207)))(1:168)|(3:170|171|(2:173|174)(1:175)))|208|209|(0)(0)|160)|210))|148|(3:150|151|152)(1:154)|153|140)|212|213|(4:215|(10:218|(1:220)|221|(1:251)(1:225)|(13:231|232|233|234|235|236|237|238|239|240|241|243|230)|227|228|229|230|216)|252|253)(1:326))(1:327)|(1:255)|256|(12:258|(2:259|(3:261|(2:263|264)(2:312|313)|(1:266)(1:311))(2:314|315))|267|(1:310)|273|274|275|(3:277|(1:279)(1:284)|(1:282))|(5:286|(1:288)|289|(1:291)|292)(2:305|(1:307))|293|(3:295|(1:297)(1:299)|298)|300)(4:316|(3:318|(1:320)|321)(1:325)|322|(1:324))|(2:302|303)(1:304))(7:330|331|(0)(0)|(0)|256|(0)(0)|(0)(0)))(0)|121|122|123|124|125|126|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x03f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x03fc, code lost:
    
        android.util.Log.d(r6, "SpecificChampionshipFragment - error: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x03f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x03f4, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x03f7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x03f8, code lost:
    
        r6 = r17;
        r3 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ba A[Catch: Exception -> 0x03f3, TryCatch #5 {Exception -> 0x03f3, blocks: (B:125:0x03b3, B:128:0x03ba, B:130:0x03c0, B:132:0x03c6, B:135:0x03d0), top: B:124:0x03b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[LOOP:8: B:160:0x046f->B:175:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[LOOP:9: B:177:0x0497->B:192:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03e9 A[Catch: Exception -> 0x03f1, TRY_LEAVE, TryCatch #7 {Exception -> 0x03f1, blocks: (B:137:0x03e5, B:330:0x03e9), top: B:126:0x03b8 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23, types: [int] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleApiResponse(FetchedResponseMessage<NewMatchesForLeagueModel, Integer> responseMessage) {
        boolean z;
        boolean z2;
        List<ListedMatchModel> matches;
        boolean z3;
        Object obj;
        NewLeagueModel league;
        final SpecificChampionshipFragment specificChampionshipFragment;
        NewMatchDetailsDataModel match;
        List<ListedMatchModel> list;
        TimeZone timeZone;
        long j;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        FragmentActivity requireActivity;
        TourState tourState;
        Iterator it;
        int i;
        int i2;
        Iterator it2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        NewMatchDetailsDataModel match2;
        NewSportModel sport;
        String str = "requireActivity(...)";
        String str2 = "TourFlow";
        if (!isActive()) {
            return;
        }
        NewMatchesForLeagueModel model = responseMessage.getModel();
        ?? r6 = (model != null ? model.getOffset() : 0) == 0 ? 1 : 0;
        getProgressBar().setVisibility(8);
        getSpecificChampionshipListView().setVisibility(0);
        getFavorite().setVisibility(0);
        updateExpandButtonVisibility();
        getSwipeRefreshLayout().setRefreshing(false);
        if (responseMessage.getStat() != FetchStat.SUCCESS || getProfileIfFetched() == null) {
            if (r6 == true ? 1 : 0) {
                SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
                if (specificChampionshipAdapter != null) {
                    specificChampionshipAdapter.newItems(CollectionsKt.emptyList());
                    Unit unit = Unit.INSTANCE;
                }
                z = false;
                getEmpty().setVisibility(0);
            } else {
                z = false;
            }
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.setBusy(z);
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            return;
        }
        NewMatchesForLeagueModel model2 = responseMessage.getModel();
        if (model2 == null) {
            if (r6 != 0) {
                SpecificChampionshipAdapter specificChampionshipAdapter2 = this.championshipAdapter;
                if (specificChampionshipAdapter2 != null) {
                    specificChampionshipAdapter2.newItems(CollectionsKt.emptyList());
                    Unit unit3 = Unit.INSTANCE;
                }
                getEmpty().setVisibility(0);
            }
            Paginator paginator2 = this.paginator;
            if (paginator2 != null) {
                paginator2.setBusy(false);
                Unit unit4 = Unit.INSTANCE;
                return;
            }
            return;
        }
        NewListedMatchModel newListedMatchModel = (NewListedMatchModel) CollectionsKt.firstOrNull((List) model2.getItems());
        int id = (newListedMatchModel == null || (match2 = newListedMatchModel.getMatch()) == null || (sport = match2.getSport()) == null) ? 0 : sport.getId();
        if (id == 5) {
            Log.d(TAG, "=== BASKETBALL DEBUG - Before Conversion ===");
            Log.d(TAG, "Total matches: " + model2.getItems().size());
            Iterator it3 = model2.getItems().iterator();
            int i8 = 0;
            r6 = r6;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                NewListedMatchModel newListedMatchModel2 = (NewListedMatchModel) next;
                NewMatchDetailsDataModel match3 = newListedMatchModel2.getMatch();
                Iterator it4 = it3;
                boolean z10 = r6 == true ? 1 : 0;
                long id2 = match3.getId();
                String str3 = str2;
                Log.d(TAG, "Match " + i8 + ": id=" + id2 + ", bets count=" + newListedMatchModel2.getBets().size());
                Iterator it5 = newListedMatchModel2.getBets().iterator();
                int i10 = 0;
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    NewBetSectionModel newBetSectionModel = (NewBetSectionModel) next2;
                    Iterator it6 = it5;
                    Log.d(TAG, "  Bet section " + i10 + ": variety=" + newBetSectionModel.getVariety().getBetsGameType() + ", groups=" + newBetSectionModel.getGroups().size());
                    Iterator it7 = newBetSectionModel.getGroups().iterator();
                    int i12 = 0;
                    while (it7.hasNext()) {
                        Object next3 = it7.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        NewBetGroupModel newBetGroupModel = (NewBetGroupModel) next3;
                        Iterator it8 = it7;
                        int i14 = i11;
                        Log.d(TAG, "    Group " + i12 + ": id=" + newBetGroupModel.getGroup().getId() + ", name=" + newBetGroupModel.getGroup().getName() + ", bets=" + newBetGroupModel.getBets().size());
                        Iterator it9 = newBetGroupModel.getBets().iterator();
                        int i15 = 0;
                        while (it9.hasNext()) {
                            Object next4 = it9.next();
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            NewBetModel newBetModel = (NewBetModel) next4;
                            Log.d(TAG, "      Bet " + i15 + ": id=" + newBetModel.getGrabbedBetId() + ", name=" + newBetModel.getBetName() + ", available=" + newBetModel.isAvailable());
                            it9 = it9;
                            i15 = i16;
                            str = str;
                        }
                        i12 = i13;
                        it7 = it8;
                        i11 = i14;
                    }
                    it5 = it6;
                    i10 = i11;
                }
                i8 = i9;
                str2 = str3;
                r6 = z10;
                it3 = it4;
            }
        }
        String str4 = str;
        String str5 = str2;
        boolean z11 = r6;
        MatchesForLeagueModel convertNewMatchesToOld = NewToOldModelConverter.INSTANCE.convertNewMatchesToOld(model2);
        String str6 = r6;
        if (id == 5) {
            Log.d(TAG, "=== BASKETBALL DEBUG - After Conversion ===");
            List<ListedMatchModel> matches2 = convertNewMatchesToOld.getResponse().getMatches();
            Intrinsics.checkNotNullExpressionValue(matches2, "getMatches(...)");
            Iterator it10 = matches2.iterator();
            int i17 = 0;
            String str7 = r6;
            while (true) {
                str6 = str7;
                if (it10.hasNext()) {
                    Object next5 = it10.next();
                    ?? r62 = i17 + 1;
                    if (i17 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ListedMatchModel listedMatchModel = (ListedMatchModel) next5;
                    Integer id3 = listedMatchModel.getMatch().getId();
                    List<BetSectionModel> betSections = listedMatchModel.getBetSections();
                    if (betSections != null) {
                        i = betSections.size();
                        it = it10;
                    } else {
                        it = it10;
                        i = 0;
                    }
                    Log.d(TAG, "Match " + i17 + ": id=" + id3 + ", betSections count=" + i);
                    List<BetSectionModel> betSections2 = listedMatchModel.getBetSections();
                    if (betSections2 != null) {
                        Iterator it11 = betSections2.iterator();
                        int i18 = 0;
                        r62 = r62;
                        while (it11.hasNext()) {
                            Object next6 = it11.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            BetSectionModel betSectionModel = (BetSectionModel) next6;
                            List<BetGroupSectionModel> groups = betSectionModel.getGroups();
                            if (groups != null) {
                                i3 = groups.size();
                                it2 = it11;
                            } else {
                                it2 = it11;
                                i3 = 0;
                            }
                            Log.d(TAG, "  Bet section " + i18 + ": groups=" + i3);
                            List<BetGroupSectionModel> groups2 = betSectionModel.getGroups();
                            if (groups2 != null) {
                                Iterator it12 = groups2.iterator();
                                int i20 = 0;
                                int i21 = r62;
                                while (it12.hasNext()) {
                                    Object next7 = it12.next();
                                    int i22 = i20 + 1;
                                    if (i20 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    BetGroupSectionModel betGroupSectionModel = (BetGroupSectionModel) next7;
                                    Iterator it13 = it12;
                                    int id4 = betGroupSectionModel.getGroup().getId();
                                    int i23 = i21;
                                    String name = betGroupSectionModel.getGroup().getName();
                                    List<MatchDetailsBetDataModel> bets = betGroupSectionModel.getBets();
                                    if (bets != null) {
                                        i7 = bets.size();
                                        i6 = i19;
                                    } else {
                                        i6 = i19;
                                        i7 = 0;
                                    }
                                    Log.d(TAG, "    Group " + i20 + ": id=" + id4 + ", name=" + name + ", bets=" + i7);
                                    i20 = i22;
                                    i19 = i6;
                                    it12 = it13;
                                    i21 = i23;
                                }
                                i4 = i21;
                                i5 = i19;
                                Unit unit5 = Unit.INSTANCE;
                            } else {
                                i4 = r62;
                                i5 = i19;
                            }
                            it11 = it2;
                            i18 = i5;
                            r62 = i4;
                        }
                        i2 = r62;
                        Unit unit6 = Unit.INSTANCE;
                    } else {
                        i2 = r62;
                    }
                    it10 = it;
                    i17 = i2;
                    str7 = r62;
                }
            }
            requireActivity = requireActivity();
            String str8 = str4;
            Intrinsics.checkNotNullExpressionValue(requireActivity, str8);
            if (!(requireActivity instanceof MainActivity)) {
                TourComposeHelper tourComposeHelper = ((MainActivity) requireActivity).tourComposeHelper;
                z2 = (tourComposeHelper == null || (tourState = tourComposeHelper.getTourState()) == null || !tourState.isTourActive()) ? false : true;
                Log.d(str5, "SpecificChampionshipFragment - isTourActive: " + z2);
                if (z2) {
                    List<ListedMatchModel> matches3 = convertNewMatchesToOld.getResponse().getMatches();
                    Intrinsics.checkNotNullExpressionValue(matches3, "getMatches(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : matches3) {
                        ListedMatchModel listedMatchModel2 = (ListedMatchModel) obj2;
                        List<BetSectionModel> betSections3 = listedMatchModel2.getBetSections();
                        if (betSections3 != null && (betSections3.isEmpty() ^ true)) {
                            List<BetSectionModel> betSections4 = listedMatchModel2.getBetSections();
                            Intrinsics.checkNotNullExpressionValue(betSections4, "getBetSections(...)");
                            List<BetSectionModel> list2 = betSections4;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator it14 = list2.iterator();
                                while (it14.hasNext()) {
                                    List<BetGroupSectionModel> groups3 = ((BetSectionModel) it14.next()).getGroups();
                                    if (groups3 != null) {
                                        List<BetGroupSectionModel> list3 = groups3;
                                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                                            z7 = false;
                                            z6 = true;
                                        } else {
                                            Iterator it15 = list3.iterator();
                                            while (true) {
                                                if (!it15.hasNext()) {
                                                    z6 = true;
                                                    z7 = false;
                                                    break;
                                                }
                                                List<MatchDetailsBetDataModel> bets2 = ((BetGroupSectionModel) it15.next()).getBets();
                                                if (bets2 != null) {
                                                    List<MatchDetailsBetDataModel> list4 = bets2;
                                                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                                        Iterator it16 = list4.iterator();
                                                        while (true) {
                                                            if (it16.hasNext()) {
                                                                z6 = true;
                                                                if (Intrinsics.areEqual((Object) ((MatchDetailsBetDataModel) it16.next()).getIsAvailable(), (Object) true)) {
                                                                    z9 = true;
                                                                    break;
                                                                }
                                                            } else {
                                                                z6 = true;
                                                                z9 = false;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        z9 = false;
                                                        z6 = true;
                                                    }
                                                    if (z9 == z6) {
                                                        z8 = z6;
                                                        if (!z8) {
                                                            z7 = z6;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z6 = true;
                                                }
                                                z8 = false;
                                                if (!z8) {
                                                }
                                            }
                                        }
                                        if (z7 == z6) {
                                            z4 = true;
                                            if (!z4) {
                                                z5 = true;
                                                break;
                                            }
                                        }
                                    }
                                    z4 = false;
                                    if (!z4) {
                                    }
                                }
                            }
                        }
                        z5 = false;
                        if (z5) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    if (!arrayList2.isEmpty()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        TimeZone timeZone2 = TimeZone.getDefault();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy, HH:mm", Locale.getDefault());
                        simpleDateFormat.setTimeZone(timeZone2);
                        String format = simpleDateFormat.format(new Date(currentTimeMillis));
                        Log.d(TAG, "In tour - sorting matches from latest to earliest start time");
                        Log.d(TAG, "Current device time: " + format + " (timezone: " + timeZone2.getID() + ")");
                        matches = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$handleApiResponse$$inlined$sortedByDescending$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                long j2;
                                String date;
                                String str9;
                                ListedMatchModel listedMatchModel3 = (ListedMatchModel) t2;
                                String date2 = listedMatchModel3.getMatch().getDate();
                                String str10 = date2;
                                long j3 = Long.MIN_VALUE;
                                if (str10 != null && str10.length() != 0) {
                                    try {
                                        j2 = DateHelper.getTimestamp(date2);
                                    } catch (Exception e) {
                                        Log.e("SpecificChampionshipFragment", "Error calculating match time for " + listedMatchModel3.getMatch().getId() + ": " + e.getMessage());
                                    }
                                    Long valueOf = Long.valueOf(j2);
                                    ListedMatchModel listedMatchModel4 = (ListedMatchModel) t;
                                    date = listedMatchModel4.getMatch().getDate();
                                    str9 = date;
                                    if (str9 != null && str9.length() != 0) {
                                        try {
                                            j3 = DateHelper.getTimestamp(date);
                                        } catch (Exception e2) {
                                            Log.e("SpecificChampionshipFragment", "Error calculating match time for " + listedMatchModel4.getMatch().getId() + ": " + e2.getMessage());
                                        }
                                    }
                                    return ComparisonsKt.compareValues(valueOf, Long.valueOf(j3));
                                }
                                j2 = Long.MIN_VALUE;
                                Long valueOf2 = Long.valueOf(j2);
                                ListedMatchModel listedMatchModel42 = (ListedMatchModel) t;
                                date = listedMatchModel42.getMatch().getDate();
                                str9 = date;
                                if (str9 != null) {
                                    j3 = DateHelper.getTimestamp(date);
                                }
                                return ComparisonsKt.compareValues(valueOf2, Long.valueOf(j3));
                            }
                        });
                        int i24 = 0;
                        for (Object obj3 : matches) {
                            int i25 = i24 + 1;
                            if (i24 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ListedMatchModel listedMatchModel3 = (ListedMatchModel) obj3;
                            String date = listedMatchModel3.getMatch().getDate();
                            String str9 = date;
                            if (!(str9 == null || str9.length() == 0)) {
                                try {
                                    long timestamp = DateHelper.getTimestamp(date);
                                    long j2 = timestamp - currentTimeMillis;
                                    list = matches;
                                    try {
                                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMMM yyyy, HH:mm", Locale.getDefault());
                                        simpleDateFormat2.setTimeZone(timeZone2);
                                        timeZone = timeZone2;
                                        try {
                                            j = currentTimeMillis;
                                            try {
                                                Log.d(TAG, "Match[" + i24 + "] " + listedMatchModel3.getMatch().getId() + " (" + listedMatchModel3.getMatch().getHomeTeam().getName() + " vs " + listedMatchModel3.getMatch().getAwayTeam().getName() + ") - starts: " + simpleDateFormat2.format(new Date(timestamp)) + ", timeUntilStart: " + ((j2 / 1000) / 60) + " min");
                                            } catch (Exception unused) {
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception unused3) {
                                        timeZone = timeZone2;
                                    }
                                } catch (Exception unused4) {
                                }
                                matches = list;
                                i24 = i25;
                                timeZone2 = timeZone;
                                currentTimeMillis = j;
                            }
                            timeZone = timeZone2;
                            list = matches;
                            j = currentTimeMillis;
                            matches = list;
                            i24 = i25;
                            timeZone2 = timeZone;
                            currentTimeMillis = j;
                        }
                    } else {
                        matches = CollectionsKt.emptyList();
                    }
                } else {
                    matches = convertNewMatchesToOld.getResponse().getMatches();
                }
                if (z2) {
                    Log.d(TAG, "In tour - prioritized " + matches.size() + " match(es), first match starts in more than 30 minutes");
                }
                Intrinsics.checkNotNull(matches);
                if (!matches.isEmpty()) {
                    Intrinsics.checkNotNull(matches);
                    long intValue = ((ListedMatchModel) CollectionsKt.first((List) matches)).getMatch().getId().intValue();
                    Iterator it17 = model2.getItems().iterator();
                    while (true) {
                        if (it17.hasNext()) {
                            obj = it17.next();
                            if (((NewListedMatchModel) obj).getMatch().getId() == intValue) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    NewListedMatchModel newListedMatchModel3 = (NewListedMatchModel) obj;
                    if (newListedMatchModel3 == null || (match = newListedMatchModel3.getMatch()) == null || (league = match.getLeague()) == null) {
                        league = ((NewListedMatchModel) CollectionsKt.first((List) model2.getItems())).getMatch().getLeague();
                    }
                    getEmpty().setVisibility(8);
                    try {
                        FragmentActivity requireActivity2 = requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity2, str8);
                        if (requireActivity2 instanceof MainActivity) {
                            TourComposeHelper tourComposeHelper2 = ((MainActivity) requireActivity2).tourComposeHelper;
                            TourState tourState2 = tourComposeHelper2 != null ? tourComposeHelper2.getTourState() : null;
                            if (tourState2 != null && z2) {
                                tourState2.setSelectedMatchId(Long.valueOf(intValue));
                                Log.d(TAG, "Set first match ID in tour state (from sorted list, position 0): " + intValue);
                            }
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Failed to set first match ID in tour state: " + e.getMessage());
                    }
                    if (z11) {
                        specificChampionshipFragment = this;
                        specificChampionshipFragment.setLeagueInfo(league);
                        SpecificChampionshipAdapter specificChampionshipAdapter3 = specificChampionshipFragment.championshipAdapter;
                        if (specificChampionshipAdapter3 != null) {
                            specificChampionshipAdapter3.newItems(matches);
                            Unit unit7 = Unit.INSTANCE;
                        }
                        Pair<Integer, Integer> pair = specificChampionshipFragment.pendingScrollRestoreFromConfig;
                        if (pair != null) {
                            final int intValue2 = pair.component1().intValue();
                            final int intValue3 = pair.component2().intValue();
                            getSpecificChampionshipListView().post(new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda11
                                @Override // java.lang.Runnable
                                public final void run() {
                                    SpecificChampionshipFragment.handleApiResponse$lambda$21$lambda$20(SpecificChampionshipFragment.this, intValue2, intValue3);
                                }
                            });
                            specificChampionshipFragment.pendingScrollRestoreFromConfig = null;
                            Unit unit8 = Unit.INSTANCE;
                            Unit unit9 = Unit.INSTANCE;
                        }
                        Intrinsics.checkNotNull(matches);
                        specificChampionshipFragment.handleTourLogic(matches);
                        Unit unit10 = Unit.INSTANCE;
                    } else {
                        specificChampionshipFragment = this;
                        SpecificChampionshipAdapter specificChampionshipAdapter4 = specificChampionshipFragment.championshipAdapter;
                        if (specificChampionshipAdapter4 != null) {
                            specificChampionshipAdapter4.addItems(matches);
                            Unit unit11 = Unit.INSTANCE;
                        }
                    }
                    Paginator paginator3 = specificChampionshipFragment.paginator;
                    if (paginator3 != null) {
                        paginator3.setBusy(false);
                        paginator3.setLast(model2.getItems().size() < model2.getLimit());
                        PageOptions pageOptions = new PageOptions();
                        pageOptions.setPageSize(model2.getLimit());
                        pageOptions.setOffset(model2.getOffset() + model2.getItems().size());
                        paginator3.setPageOptions(pageOptions);
                        Unit unit12 = Unit.INSTANCE;
                        Unit unit13 = Unit.INSTANCE;
                    }
                    Boolean.valueOf(getSpecificChampionshipListView().post(new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            SpecificChampionshipFragment.this.applyPendingListRestoreState();
                        }
                    }));
                } else {
                    if (z11) {
                        SpecificChampionshipAdapter specificChampionshipAdapter5 = this.championshipAdapter;
                        if (specificChampionshipAdapter5 != null) {
                            specificChampionshipAdapter5.newItems(CollectionsKt.emptyList());
                            Unit unit14 = Unit.INSTANCE;
                        }
                        z3 = false;
                        getEmpty().setVisibility(0);
                        setFallbackLeagueInfo();
                    } else {
                        z3 = false;
                    }
                    Paginator paginator4 = this.paginator;
                    if (paginator4 != null) {
                        paginator4.setBusy(z3);
                        paginator4.setLast(true);
                        Unit unit15 = Unit.INSTANCE;
                        Unit unit16 = Unit.INSTANCE;
                    }
                }
                if (z11) {
                    updateFavoriteState();
                    updateExpandButtonVisibility();
                    return;
                }
                return;
            }
            Log.d(str5, "SpecificChampionshipFragment - activity is not MainActivity");
            z2 = false;
            if (z2) {
            }
            if (z2) {
            }
            Intrinsics.checkNotNull(matches);
            if (!matches.isEmpty()) {
            }
            if (z11) {
            }
        }
        requireActivity = requireActivity();
        String str82 = str4;
        Intrinsics.checkNotNullExpressionValue(requireActivity, str82);
        if (!(requireActivity instanceof MainActivity)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleApiResponse$lambda$21$lambda$20(SpecificChampionshipFragment specificChampionshipFragment, int i, int i2) {
        RecyclerView.LayoutManager layoutManager = specificChampionshipFragment.getSpecificChampionshipListView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, i2);
        }
    }

    private final ListRestoreState saveListStateBeforeRefresh() {
        SpecificChampionshipAdapter specificChampionshipAdapter;
        int itemCount;
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        if (this.specificChampionshipListView == null || (specificChampionshipAdapter = this.championshipAdapter) == null || (itemCount = specificChampionshipAdapter.getItemCount()) == 0) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = getSpecificChampionshipListView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) < 0 || (findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition)) == null) {
            return null;
        }
        return new ListRestoreState(findFirstVisibleItemPosition, findViewByPosition.getTop(), itemCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPendingListRestoreState() {
        SpecificChampionshipAdapter specificChampionshipAdapter;
        ListRestoreState listRestoreState = this.pendingListRestoreState;
        if (listRestoreState == null || (specificChampionshipAdapter = this.championshipAdapter) == null) {
            return;
        }
        if (specificChampionshipAdapter.getItemCount() < listRestoreState.getTargetItemCount()) {
            Paginator paginator = this.paginator;
            if (paginator != null && paginator.isLast()) {
                this.pendingListRestoreState = null;
                return;
            }
            Paginator paginator2 = this.paginator;
            PageOptions pageOptions = paginator2 != null ? paginator2.getPageOptions() : null;
            if (pageOptions != null) {
                Paginator paginator3 = this.paginator;
                Intrinsics.checkNotNull(paginator3);
                if (paginator3.isBusy()) {
                    return;
                }
                Paginator paginator4 = this.paginator;
                if (paginator4 != null) {
                    paginator4.setBusy(true);
                }
                loadItems(pageOptions.getOffset(), pageOptions.getPageSize());
                return;
            }
            return;
        }
        this.pendingListRestoreState = null;
        RecyclerView.LayoutManager layoutManager = getSpecificChampionshipListView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(RangesKt.coerceIn(listRestoreState.getFirstVisiblePosition(), 0, RangesKt.coerceAtLeast(specificChampionshipAdapter.getItemCount() - 1, 0)), listRestoreState.getScrollOffset());
    }

    private final void setLeagueInfo(NewLeagueModel leagueInfo) {
        PicassoHelper.with(requireActivity()).setImageView(getLeagueIcon()).setImageUrl(leagueInfo.getPhotoUrl()).load();
        getLeagueName().setText(leagueInfo.getName());
        updateMenuBars(leagueInfo.getName(), TabMenuItem.MATCHES);
    }

    private final void setFallbackLeagueInfo() {
        int i = this.sid;
        setLeagueInfo(new NewLeagueModel(i, "https://www.betup.org/uploads_api/league/default.png", "League " + i));
    }

    private final void updateFavoriteState() {
        FullUserProfileModel profileIfFetched;
        Bundle arguments = getArguments();
        if ((arguments == null || !arguments.containsKey("isFavorite")) && (profileIfFetched = getProfileIfFetched()) != null) {
            UserFavouritesInfoModel userFavouritesInfoModel = profileIfFetched.getUserFavouritesInfoModel();
            this.isFavorite = userFavouritesInfoModel != null && userFavouritesInfoModel.isFavouriteLeague(this.sid);
        }
        getFavorite().setImageResource(this.isFavorite ? org.betup.R.drawable.star : org.betup.R.drawable.star_empty);
    }

    private final void handleExpandHighlight() {
        boolean z;
        TourHelper tourHelper;
        FragmentActivity requireActivity;
        TourComposeHelper tourComposeHelper;
        boolean z2 = true;
        try {
            requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        } catch (Exception unused) {
        }
        if ((requireActivity instanceof MainActivity) && (tourComposeHelper = ((MainActivity) requireActivity).tourComposeHelper) != null) {
            if (tourComposeHelper.isTourActive()) {
                z = true;
                tourHelper = this.tourHelper;
                if ((tourHelper != null || !tourHelper.isTour()) && !z) {
                    z2 = false;
                }
                if (!getLocalPreferencesService().isExpandMatchesHighlighted() || z2) {
                }
                getLocalPreferencesService().saveExpandMatchesHighlighted();
                highlightExpandButton();
                return;
            }
        }
        z = false;
        tourHelper = this.tourHelper;
        if (tourHelper != null) {
        }
        z2 = false;
        if (getLocalPreferencesService().isExpandMatchesHighlighted()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateExpandButtonVisibility() {
        boolean z;
        TourHelper tourHelper;
        FragmentActivity requireActivity;
        TourComposeHelper tourComposeHelper;
        if (this.expandButton == null || this.expandContainer == null) {
            return;
        }
        boolean z2 = true;
        try {
            requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        } catch (Exception unused) {
        }
        if ((requireActivity instanceof MainActivity) && (tourComposeHelper = ((MainActivity) requireActivity).tourComposeHelper) != null) {
            if (tourComposeHelper.isTourActive()) {
                z = true;
                tourHelper = this.tourHelper;
                if ((tourHelper != null || !tourHelper.isTour()) && !z) {
                    z2 = false;
                }
                int i = z2 ? 8 : 0;
                getExpandButton().setVisibility(i);
                getExpandContainer().setVisibility(i);
                if (z2) {
                    return;
                }
                TourGuide tourGuide = this.expandHighlighter;
                if (tourGuide != null) {
                    tourGuide.cleanUp();
                }
                this.expandHighlighter = null;
                return;
            }
        }
        z = false;
        tourHelper = this.tourHelper;
        if (tourHelper != null) {
        }
        z2 = false;
        if (z2) {
        }
        getExpandButton().setVisibility(i);
        getExpandContainer().setVisibility(i);
        if (z2) {
        }
    }

    private final void handleTourLogic(final List<? extends ListedMatchModel> matches) {
        boolean z;
        TourHelper tourHelper;
        FragmentActivity requireActivity;
        try {
            requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        } catch (Exception unused) {
        }
        if (requireActivity instanceof MainActivity) {
            TourComposeHelper tourComposeHelper = ((MainActivity) requireActivity).tourComposeHelper;
            TourState tourState = tourComposeHelper != null ? tourComposeHelper.getTourState() : null;
            boolean z2 = tourState != null && tourState.isTourActive();
            boolean z3 = (tourState != null ? tourState.getCurrentStep() : null) == TourStep.SELECT_MATCH;
            if (z2 && z3) {
                z = true;
                if (!z && !matches.isEmpty()) {
                    getSpecificChampionshipListView().postDelayed(new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            SpecificChampionshipFragment.handleTourLogic$lambda$26(SpecificChampionshipFragment.this);
                        }
                    }, TOUR_DELAY_MS);
                    return;
                }
                tourHelper = this.tourHelper;
                if (tourHelper == null && tourHelper.isTour() && !z) {
                    OddsDialogFragment newInstance = OddsDialogFragment.INSTANCE.newInstance(false);
                    newInstance.setOddsOnDismissListener(new Function1() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit handleTourLogic$lambda$27;
                            handleTourLogic$lambda$27 = SpecificChampionshipFragment.handleTourLogic$lambda$27(SpecificChampionshipFragment.this, matches, (OddType) obj);
                            return handleTourLogic$lambda$27;
                        }
                    });
                    newInstance.show(getParentFragmentManager(), "OddsDialog");
                    return;
                }
                return;
            }
        }
        z = false;
        if (!z) {
        }
        tourHelper = this.tourHelper;
        if (tourHelper == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleTourLogic$lambda$26(SpecificChampionshipFragment specificChampionshipFragment) {
        TourComposeHelper tourComposeHelper;
        if (specificChampionshipFragment.isActive()) {
            FragmentActivity requireActivity = specificChampionshipFragment.requireActivity();
            TourState tourState = null;
            MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
            if (mainActivity != null && (tourComposeHelper = mainActivity.tourComposeHelper) != null) {
                tourState = tourComposeHelper.getTourState();
            }
            if (tourState != null) {
                tourState.setMatchScrollComplete(true);
            }
            Log.d(TAG, "TourFlow - Match scroll complete - overlay can be shown");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleTourLogic$lambda$27(SpecificChampionshipFragment specificChampionshipFragment, List list, OddType oddType) {
        if (!specificChampionshipFragment.isActive()) {
            return Unit.INSTANCE;
        }
        if (oddType != null) {
            specificChampionshipFragment.getUserService().saveOddType(oddType);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter = specificChampionshipFragment.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.setOddType(oddType);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter2 = specificChampionshipFragment.championshipAdapter;
        if (specificChampionshipAdapter2 != null) {
            specificChampionshipAdapter2.notifyDataSetChanged();
        }
        SpecificChampionshipAdapter specificChampionshipAdapter3 = specificChampionshipFragment.championshipAdapter;
        boolean z = false;
        if ((specificChampionshipAdapter3 != null ? specificChampionshipAdapter3.getItemCount() : 0) > 0) {
            TourHelper tourHelper = specificChampionshipFragment.tourHelper;
            if (tourHelper != null && tourHelper.isTour()) {
                z = true;
            }
            if (z) {
                specificChampionshipFragment.displayTour(list);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        getNewSpecificChampionshipInteractor().invalidate();
        return true;
    }

    @OnClick({org.betup.R.id.specificLeagueName})
    public final void onLeagueClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        TooltipUtil.displayTooltip(v, getLeagueName().getText().toString());
    }

    @OnClick({org.betup.R.id.back_arrow_iv})
    public final void onBackClick() {
        getNewSpecificChampionshipInteractor().invalidate();
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    @OnClick({org.betup.R.id.fav})
    public final void favClick() {
        List<Integer> emptyList;
        UserFavouritesInfoModel userFavouritesInfoModel;
        if (!getUserService().isRegistered() || getUserService().isAnonymous() || getProfileIfFetched() == null) {
            EventBus.getDefault().post(new UpgradeAccountMessage());
            return;
        }
        if (this.isFavorite) {
            FullUserProfileModel profileIfFetched = getProfileIfFetched();
            if (profileIfFetched == null || (userFavouritesInfoModel = profileIfFetched.getUserFavouritesInfoModel()) == null || (emptyList = userFavouritesInfoModel.getFavouriteLeaguesIds()) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : emptyList) {
                Integer num = (Integer) obj;
                int i = this.sid;
                if (num == null || num.intValue() != i) {
                    arrayList.add(obj);
                }
            }
            getPutFavoriteLeaguesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda15
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                    SpecificChampionshipFragment.favClick$lambda$29(SpecificChampionshipFragment.this, fetchedResponseMessage);
                }
            }, arrayList);
            return;
        }
        getPutFavoriteLeaguesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda16
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SpecificChampionshipFragment.favClick$lambda$30(SpecificChampionshipFragment.this, fetchedResponseMessage);
            }
        }, CollectionsKt.listOf(Integer.valueOf(this.sid)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void favClick$lambda$29(SpecificChampionshipFragment specificChampionshipFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (specificChampionshipFragment.isActive()) {
            if (Intrinsics.areEqual(fetchedResponseMessage.getStat().name(), "SUCCESS")) {
                specificChampionshipFragment.getFavorite().setImageResource(org.betup.R.drawable.star_empty);
                specificChampionshipFragment.isFavorite = false;
                EventBus.getDefault().post(new LeagueFavoriteChangedEvent(specificChampionshipFragment.sid, false));
                return;
            }
            SnackbarHelper.showShortIfForeground(specificChampionshipFragment.requireContext(), org.betup.R.string.error_failed_remove_from_favorites);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void favClick$lambda$30(SpecificChampionshipFragment specificChampionshipFragment, FetchedResponseMessage fetchedResponseMessage) {
        if (specificChampionshipFragment.isActive()) {
            if (Intrinsics.areEqual(fetchedResponseMessage.getStat().name(), "SUCCESS")) {
                specificChampionshipFragment.getFavorite().setImageResource(org.betup.R.drawable.star);
                specificChampionshipFragment.getFavorite().startAnimation(AnimationUtils.loadAnimation(specificChampionshipFragment.requireActivity(), org.betup.R.anim.zoom_click));
                specificChampionshipFragment.isFavorite = true;
                EventBus.getDefault().post(new LeagueFavoriteChangedEvent(specificChampionshipFragment.sid, true));
                return;
            }
            SnackbarHelper.showShortIfForeground(specificChampionshipFragment.requireContext(), org.betup.R.string.error_failed_add_to_favorites);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(org.betup.R.layout.fragment_specific_championship, container, false);
        bindView(inflate);
        setupFilterCompose();
        updateExpandButtonIcon();
        updateExpandButtonVisibility();
        getOneClickBetIv().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpecificChampionshipFragment.onCreateView$lambda$32(SpecificChampionshipFragment.this, view);
            }
        });
        updateOneClickBetIcon();
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$32(final SpecificChampionshipFragment specificChampionshipFragment, View view) {
        OneClickBetSettingsDialogFragment.INSTANCE.newInstance(new Function0() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onCreateView$lambda$32$lambda$31;
                onCreateView$lambda$32$lambda$31 = SpecificChampionshipFragment.onCreateView$lambda$32$lambda$31(SpecificChampionshipFragment.this);
                return onCreateView$lambda$32$lambda$31;
            }
        }).show(specificChampionshipFragment.getChildFragmentManager(), "OneClickBetSettingsDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateView$lambda$32$lambda$31(SpecificChampionshipFragment specificChampionshipFragment) {
        specificChampionshipFragment.updateOneClickBetIcon();
        return Unit.INSTANCE;
    }

    private final void updateOneClickBetIcon() {
        if (this.oneClickBetIv == null) {
            return;
        }
        try {
            UserProgressModel userProgressModel = getUserService().getShortProfile().getUserProgressModel();
            if (userProgressModel != null) {
                userProgressModel.isOneClickBetUnlocked();
            }
        } catch (Exception unused) {
        }
        getOneClickBetIv().setImageResource(getLocalPreferencesService().isOneClickBetEnabled(getUserService().getBetupUserIdOrZero()) ? org.betup.R.drawable.flash_selected : org.betup.R.drawable.flash_unselected);
    }

    @Override // org.betup.ui.base.ItemClickListener
    public void itemClicked(ListedMatchModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        EventBus.getDefault().post(new TourCloseMessage());
        Bundle bundle = new Bundle();
        Integer id = item.getMatch().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        bundle.putInt("matchId", id.intValue());
        bundle.putBoolean(ARG_IS_LIVE, item.getMatch().getState() == MatchState.LIVE);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
    }

    @Override // org.betup.ui.fragment.matches.adapter.BetClickListener
    public BetMatchClickResult onMatchBetClick(BetModel bet) {
        Integer id;
        Intrinsics.checkNotNullParameter(bet, "bet");
        MatchDetailsDataModel match = bet.getMatch();
        final long intValue = (match == null || (id = match.getId()) == null) ? 0L : id.intValue();
        if (getBetListAppender().isSelectedBetAlready(bet.getGrabbedBetId())) {
            getBetListAppender().removeBet(bet.getGrabbedBetId());
            SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
            if (specificChampionshipAdapter != null) {
                specificChampionshipAdapter.setBetValidating(bet.getGrabbedBetId(), false);
            }
            SpecificChampionshipAdapter specificChampionshipAdapter2 = this.championshipAdapter;
            if (specificChampionshipAdapter2 != null) {
                specificChampionshipAdapter2.refreshBetStatesForMatch(intValue);
            }
            return new BetMatchClickResult(BetMatchClickResult.State.REMOVED, null);
        }
        final long grabbedBetId = bet.getGrabbedBetId();
        MatchDetailsBetDataModel bet2 = bet.getBet();
        MatchDetailsBetGroupModel betGroup = bet2 != null ? bet2.getBetGroup() : null;
        if (betGroup != null && !betGroup.isAvailable()) {
            Log.d(TAG, "Bet group is unavailable (user_available == false) - showing unlock dialog for betId: " + grabbedBetId);
            try {
                new UnlockBetTypesFlow(requireActivity(), getBillingService(), getFirebaseRemoteConfig(), getSingleShopInteractor(), new ProgressDisplay() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$onMatchBetClick$progressDisplay$1
                    @Override // org.betup.ui.ProgressDisplay
                    public void displayProgress() {
                    }

                    @Override // org.betup.ui.ProgressDisplay
                    public void hideProgress() {
                    }
                }, PurchasePlacement.BETSLIP, getAnalyticsService(), getUserService(), getVideoRewardService()).start(new PurchaseCompletedListener() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda1
                    @Override // org.betup.services.billing.PurchaseCompletedListener
                    public final void purchaseCompleted() {
                        SpecificChampionshipFragment.onMatchBetClick$lambda$34(SpecificChampionshipFragment.this, intValue);
                    }
                }, betGroup.getId().toString());
            } catch (Exception e) {
                Log.e(TAG, "Error starting unlock flow: " + e.getMessage(), e);
                SnackbarHelper.showShortIfForeground(requireContext(), org.betup.R.string.error);
            }
            return new BetMatchClickResult(BetMatchClickResult.State.PUT, null);
        }
        MatchDetailsBetDataModel bet3 = bet.getBet();
        if (bet3 != null ? Intrinsics.areEqual((Object) bet3.getIsAvailable(), (Object) false) : false) {
            bet.setAvailable(false);
            SpecificChampionshipAdapter specificChampionshipAdapter3 = this.championshipAdapter;
            if (specificChampionshipAdapter3 != null) {
                specificChampionshipAdapter3.markBetsAsUnavailable(intValue, CollectionsKt.listOf(Long.valueOf(grabbedBetId)));
            }
            SpecificChampionshipAdapter specificChampionshipAdapter4 = this.championshipAdapter;
            if (specificChampionshipAdapter4 != null) {
                specificChampionshipAdapter4.refreshBetStatesForMatch(intValue);
            }
            SnackbarHelper.showShortIfForeground(requireContext(), org.betup.R.string.bet_not_available);
            return new BetMatchClickResult(BetMatchClickResult.State.PUT, null);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter5 = this.championshipAdapter;
        if (specificChampionshipAdapter5 != null) {
            specificChampionshipAdapter5.setBetValidating(grabbedBetId, true);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SpecificChampionshipFragment.onMatchBetClick$lambda$35(SpecificChampionshipFragment.this, grabbedBetId, intValue);
            }
        };
        handler.postDelayed(runnable, 5000L);
        MatchDetailsBetDataModel bet4 = bet.getBet();
        getBetValidator().validateBet(bet, new SpecificChampionshipFragment$onMatchBetClick$2(handler, runnable, this, bet4 != null ? bet4.getGrabbedCoeficient() : 0.0d, grabbedBetId, intValue, bet));
        return new BetMatchClickResult(BetMatchClickResult.State.PUT, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMatchBetClick$lambda$34(SpecificChampionshipFragment specificChampionshipFragment, long j) {
        Log.d(TAG, "Purchase completed - bet groups unlocked");
        SpecificChampionshipAdapter specificChampionshipAdapter = specificChampionshipFragment.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.refreshBetStatesForMatch(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMatchBetClick$lambda$35(SpecificChampionshipFragment specificChampionshipFragment, long j, long j2) {
        SpecificChampionshipAdapter specificChampionshipAdapter = specificChampionshipFragment.championshipAdapter;
        if (specificChampionshipAdapter == null || !specificChampionshipAdapter.isBetValidating(j)) {
            return;
        }
        Log.w(TAG, "Bet validation timeout - resetting loading state for betId: " + j);
        SpecificChampionshipAdapter specificChampionshipAdapter2 = specificChampionshipFragment.championshipAdapter;
        if (specificChampionshipAdapter2 != null) {
            specificChampionshipAdapter2.setBetValidating(j, false);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter3 = specificChampionshipFragment.championshipAdapter;
        if (specificChampionshipAdapter3 != null) {
            specificChampionshipAdapter3.refreshBetStatesForMatch(j2);
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.setOnBackPressedListener(this);
        }
        syncBetPresentationWithGlobalPreference();
        updateExpandButtonIcon();
        updateOneClickBetIcon();
        if (getAppLanguageObserver().wasLanguageRecentlyChanged()) {
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.refresh();
            }
            getAppLanguageObserver().markLanguageChangeHandled();
        }
    }

    private final void syncBetPresentationWithGlobalPreference() {
        BetPresentation betPresentation = getLocalPreferencesService().getGlobalExpandedBets() ? BetPresentation.FULL : BetPresentation.SHORT;
        if (this.betPresentation != betPresentation) {
            this.betPresentation = betPresentation;
            getLocalPreferencesService().saveBetPresentationForLeague(this.sid, this.betPresentation);
        }
    }

    private final void updateExpandButtonIcon() {
        if (this.expandButton == null) {
            return;
        }
        getExpandButton().setImageResource(getLocalPreferencesService().getGlobalExpandedBets() || this.betPresentation == BetPresentation.FULL ? org.betup.R.drawable.collapse_btn : org.betup.R.drawable.expand_btn);
    }

    private final void refreshBetsPreservingScroll() {
        View findViewByPosition;
        if (!isActive() || this.championshipAdapter == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getSpecificChampionshipListView().getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        final int i = 0;
        final int findFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : 0;
        if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition)) != null) {
            i = findViewByPosition.getTop();
        }
        getNewSpecificChampionshipInteractor().invalidate(this.sid);
        SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.notifyDataSetChanged();
        }
        getSpecificChampionshipListView().post(new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SpecificChampionshipFragment.refreshBetsPreservingScroll$lambda$38(findFirstVisibleItemPosition, this, linearLayoutManager, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshBetsPreservingScroll$lambda$38(final int i, final SpecificChampionshipFragment specificChampionshipFragment, final LinearLayoutManager linearLayoutManager, final int i2) {
        if (i >= 0) {
            SpecificChampionshipAdapter specificChampionshipAdapter = specificChampionshipFragment.championshipAdapter;
            if (i < (specificChampionshipAdapter != null ? specificChampionshipAdapter.getItemCount() : 0)) {
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPosition(i);
                }
                specificChampionshipFragment.getSpecificChampionshipListView().post(new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecificChampionshipFragment.refreshBetsPreservingScroll$lambda$38$lambda$37(LinearLayoutManager.this, i, i2, specificChampionshipFragment);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshBetsPreservingScroll$lambda$38$lambda$37(LinearLayoutManager linearLayoutManager, int i, int i2, SpecificChampionshipFragment specificChampionshipFragment) {
        View findViewByPosition = linearLayoutManager != null ? linearLayoutManager.findViewByPosition(i) : null;
        if (findViewByPosition == null || i2 == 0) {
            return;
        }
        specificChampionshipFragment.getSpecificChampionshipListView().scrollBy(0, findViewByPosition.getTop() - i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    private final void setupFilterCompose() {
        getMatchFilterCompose().setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        getMatchFilterCompose().setContent(ComposableLambdaKt.composableLambdaInstance(1346710300, true, new SpecificChampionshipFragment$setupFilterCompose$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFilterSelectedFromCompose(NewMatchFilter newFilter) {
        if (isActive()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastFilterChange < 500) {
                return;
            }
            this.lastFilterChange = currentTimeMillis;
            FilterController.MatchesFilter matchesFilter = toMatchesFilter(newFilter);
            FilterController.FilterType filterType = this.isLive ? FilterController.FilterType.LIVESCORE : FilterController.FilterType.SCHEDULED;
            FilterController filterController = this.filterController;
            if (filterController != null) {
                filterController.applyFilter(filterType, matchesFilter);
            }
            getMatchFilterState().selectFilter(newFilter);
            EventBus.getDefault().post(new FilterChangedEvent(newFilter));
            this.pendingListRestoreState = saveListStateBeforeRefresh();
            SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
            if (specificChampionshipAdapter != null) {
                specificChampionshipAdapter.clearAll();
            }
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.refresh();
            }
        }
    }

    private final FilterController.MatchesFilter toMatchesFilter(NewMatchFilter filter) {
        if (Intrinsics.areEqual(filter, NewMatchFilter.All.INSTANCE)) {
            return FilterController.MatchesFilter.ALL;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.Today.INSTANCE)) {
            return FilterController.MatchesFilter.ONE_DAY;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.Live.INSTANCE)) {
            return FilterController.MatchesFilter.LIVE;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.OneHour.INSTANCE)) {
            return FilterController.MatchesFilter.ONE_HOUR;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.ThreeHours.INSTANCE)) {
            return FilterController.MatchesFilter.THREE_HOURS;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.SixHours.INSTANCE)) {
            return FilterController.MatchesFilter.SIX_HOURS;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.TwelveHours.INSTANCE)) {
            return FilterController.MatchesFilter.TWELVE_HOURS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final NewMatchFilter newMatchFilterFrom(FilterController.MatchesFilter matchesFilter) {
        switch (WhenMappings.$EnumSwitchMapping$0[matchesFilter.ordinal()]) {
            case 1:
                return NewMatchFilter.All.INSTANCE;
            case 2:
                return NewMatchFilter.Today.INSTANCE;
            case 3:
                return NewMatchFilter.Live.INSTANCE;
            case 4:
                return NewMatchFilter.OneHour.INSTANCE;
            case 5:
                return NewMatchFilter.ThreeHours.INSTANCE;
            case 6:
                return NewMatchFilter.SixHours.INSTANCE;
            case 7:
                return NewMatchFilter.TwelveHours.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processBetsPlaced(BetlistUpdatedMessage message) {
        SpecificChampionshipAdapter specificChampionshipAdapter;
        Intrinsics.checkNotNullParameter(message, "message");
        Long matchId = message.getMatchId();
        if (matchId != null) {
            List<Long> removedBetIds = message.getRemovedBetIds();
            List<Long> unavailableBetIds = message.getUnavailableBetIds();
            Intrinsics.checkNotNull(removedBetIds);
            Intrinsics.checkNotNull(unavailableBetIds);
            List<Long> distinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) removedBetIds, (Iterable) unavailableBetIds));
            if (!distinct.isEmpty() && (specificChampionshipAdapter = this.championshipAdapter) != null) {
                specificChampionshipAdapter.markBetsAsUnavailable(matchId.longValue(), distinct);
            }
            SpecificChampionshipAdapter specificChampionshipAdapter2 = this.championshipAdapter;
            if (specificChampionshipAdapter2 != null) {
                specificChampionshipAdapter2.refreshBetStatesForMatch(matchId.longValue());
                return;
            }
            return;
        }
        SpecificChampionshipAdapter specificChampionshipAdapter3 = this.championshipAdapter;
        if (specificChampionshipAdapter3 != null) {
            specificChampionshipAdapter3.notifyDataSetChanged();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCoefficientUpdated(CoefficientUpdatedMessage message) {
        SpecificChampionshipAdapter specificChampionshipAdapter;
        Intrinsics.checkNotNullParameter(message, "message");
        if (isActive() && (specificChampionshipAdapter = this.championshipAdapter) != null) {
            specificChampionshipAdapter.refreshBetStates();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFilterChanged(FilterChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isActive()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastFilterChange < 500) {
                return;
            }
            this.lastFilterChange = currentTimeMillis;
            this.pendingListRestoreState = saveListStateBeforeRefresh();
            SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
            if (specificChampionshipAdapter != null) {
                specificChampionshipAdapter.clearAll();
            }
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.refresh();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTourFinished(TourFinishedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        updateExpandButtonVisibility();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onBetsUnlocked(BetsUnlockedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (isActive()) {
            Log.d(TAG, "BetsUnlockedMessage received - reloading championship matches");
            getNewSpecificChampionshipInteractor().invalidate(this.sid);
            this.pendingListRestoreState = saveListStateBeforeRefresh();
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.refresh();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        updateExpandButtonVisibility();
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        BannerProvider bannerProvider = this.bannerProvider;
        if (bannerProvider != null) {
            bannerProvider.release();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        TourGuide tourGuide = this.expandHighlighter;
        if (tourGuide != null) {
            tourGuide.cleanUp();
        }
        this.expandHighlighter = null;
        this.paginator = null;
    }

    @OnClick({org.betup.R.id.expandButton, org.betup.R.id.expandContainer})
    public final void onExpandButtonClick() {
        BetPresentation betPresentation;
        TourGuide tourGuide = this.expandHighlighter;
        if (tourGuide != null) {
            tourGuide.cleanUp();
        }
        this.expandHighlighter = null;
        if (this.betPresentation == BetPresentation.SHORT) {
            betPresentation = BetPresentation.FULL;
        } else {
            betPresentation = BetPresentation.SHORT;
        }
        this.betPresentation = betPresentation;
        getLocalPreferencesService().saveBetPresentationForLeague(this.sid, this.betPresentation);
        getUserService().saveBetPresentation(this.betPresentation);
        getLocalPreferencesService().saveGlobalExpandedBets(this.betPresentation == BetPresentation.FULL);
        updateExpandButtonIcon();
        getNewSpecificChampionshipInteractor().invalidate(this.sid);
        this.pendingListRestoreState = saveListStateBeforeRefresh();
        SpecificChampionshipAdapter specificChampionshipAdapter = this.championshipAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.clearAll();
        }
        Paginator paginator = this.paginator;
        if (paginator != null) {
            paginator.refresh();
        }
    }

    private final void highlightExpandButton() {
        if (this.expandHighlighter != null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 200.0f, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new BounceInterpolator());
        ToolTip enterAnimation = new ToolTip().setTitle(getString(org.betup.R.string.more_bets)).setDescription(getString(org.betup.R.string.tap_to_expand)).setTextColor(ContextCompat.getColor(requireActivity(), org.betup.R.color.white)).setBackgroundColor(ContextCompat.getColor(requireActivity(), org.betup.R.color.blue_store)).setShadow(true).setGravity(8388691).setEnterAnimation(translateAnimation);
        this.expandHighlighter = TourGuide.init(requireActivity()).with(TourGuide.Technique.CLICK).setToolTip(enterAnimation).setOverlay(new Overlay().setBackgroundColor(ContextCompat.getColor(requireActivity(), org.betup.R.color.black_transparent)).disableClick(true).setStyle(Overlay.Style.CIRCLE)).setPointer(new Pointer()).playOn(getExpandContainer());
    }

    private final void displayTour(List<? extends ListedMatchModel> list) {
        int size = list.size();
        final int i = 1;
        while (true) {
            if (i >= size) {
                i = 0;
                break;
            } else if (DateHelper.getTimestamp(list.get(i).getMatch().getDate()) > System.currentTimeMillis()) {
                break;
            } else {
                i++;
            }
        }
        getSpecificChampionshipListView().smoothScrollToPosition(i);
        getSpecificChampionshipListView().postDelayed(new Runnable() { // from class: org.betup.ui.fragment.matches.SpecificChampionshipFragment$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                SpecificChampionshipFragment.displayTour$lambda$40(SpecificChampionshipFragment.this, i);
            }
        }, TOUR_DELAY_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayTour$lambda$40(SpecificChampionshipFragment specificChampionshipFragment, int i) {
        if (specificChampionshipFragment.isActive()) {
            View childAt = specificChampionshipFragment.getSpecificChampionshipListView().getChildAt(i);
            View findViewById = childAt != null ? childAt.findViewById(org.betup.R.id.header) : null;
            if (findViewById != null) {
                EventBus.getDefault().post(new TourMessage.Builder(Tour.LIVE_MATCHES_MATCH_SELECT).setPosition(TourHelperPosition.Left).setSign(TourHelperSign.Finger).setTitle(specificChampionshipFragment.getString(org.betup.R.string.tour_matches_match_title)).setSubtitle(specificChampionshipFragment.getString(org.betup.R.string.tour_matches_match_desc)).setStyle(Overlay.Style.RECTANGLE).setView(findViewById).build());
            }
        }
    }

    private final void initializePagination() {
        this.paginator = new Paginator(this, getSpecificChampionshipListView(), getSwipeRefreshLayout());
        PageOptions pageOptions = new PageOptions();
        pageOptions.setPageSize(8);
        pageOptions.setOffset(0);
        Paginator paginator = this.paginator;
        if (paginator != null) {
            paginator.setPageOptions(pageOptions);
        }
        Paginator paginator2 = this.paginator;
        if (paginator2 != null) {
            paginator2.init();
        }
    }

    @Override // org.betup.ui.common.Paginator.StaticPageContentLoader
    public void loadItems(int offset, int limit) {
        FilterController.MatchesFilter filter;
        TourComposeHelper tourComposeHelper;
        TourState tourState;
        BaseUserModel userModel;
        if (isActive()) {
            ShortUserProfileModel shortProfile = getUserService().getShortProfile();
            boolean z = false;
            if ((shortProfile == null || (userModel = shortProfile.getUserModel()) == null) ? false : userModel.isTutorialComplete()) {
                Paginator paginator = this.paginator;
                if (paginator != null) {
                    paginator.setBusy(true);
                }
                if (offset == 0) {
                    getProgressBar().setVisibility(0);
                    getSpecificChampionshipListView().setVisibility(4);
                    getFavorite().setVisibility(8);
                    getEmpty().setVisibility(8);
                    if (this.expandButton != null && this.expandContainer != null) {
                        getExpandButton().setVisibility(8);
                        getExpandContainer().setVisibility(8);
                    }
                }
                Bundle bundle = new Bundle();
                FilterController.FilterType filterType = this.isLive ? FilterController.FilterType.LIVESCORE : FilterController.FilterType.SCHEDULED;
                FilterController filterController = this.filterController;
                filter = filterController != null ? filterController.getFilter(filterType) : null;
                bundle.putSerializable(ARG_FILTER, filter);
                bundle.putSerializable("bets", this.betPresentation);
                bundle.putString("type", filter != FilterController.MatchesFilter.LIVE ? "ALL_CURRENT" : "LIVE");
                bundle.putInt("offset", offset);
                bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, limit);
                getNewSpecificChampionshipInteractor().invalidate(this.sid);
                getNewSpecificChampionshipInteractor().load(this.fetchListener, Integer.valueOf(this.sid), bundle);
                return;
            }
            Paginator paginator2 = this.paginator;
            if (paginator2 != null) {
                paginator2.setBusy(true);
            }
            if (offset == 0) {
                getProgressBar().setVisibility(0);
                getSpecificChampionshipListView().setVisibility(4);
                getFavorite().setVisibility(8);
                getEmpty().setVisibility(8);
                if (this.expandButton != null && this.expandContainer != null) {
                    getExpandButton().setVisibility(8);
                    getExpandContainer().setVisibility(8);
                }
            }
            try {
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                if ((requireActivity instanceof MainActivity) && (tourComposeHelper = ((MainActivity) requireActivity).tourComposeHelper) != null && (tourState = tourComposeHelper.getTourState()) != null) {
                    z = tourState.isTourActive();
                }
            } catch (Exception unused) {
            }
            Bundle bundle2 = new Bundle();
            FilterController.FilterType filterType2 = this.isLive ? FilterController.FilterType.LIVESCORE : FilterController.FilterType.SCHEDULED;
            FilterController filterController2 = this.filterController;
            filter = filterController2 != null ? filterController2.getFilter(filterType2) : null;
            bundle2.putSerializable(ARG_FILTER, filter);
            bundle2.putSerializable("bets", this.betPresentation);
            bundle2.putString("type", filter != FilterController.MatchesFilter.LIVE ? "ALL_CURRENT" : "LIVE");
            bundle2.putInt("offset", offset);
            bundle2.putInt(MatchMyBetsInteractor.PARAM_LIMIT, limit);
            if (z) {
                bundle2.putBoolean("isTour", true);
            }
            getNewSpecificChampionshipInteractor().invalidate(this.sid);
            getNewSpecificChampionshipInteractor().load(this.fetchListener, Integer.valueOf(this.sid), bundle2);
        }
    }
}
