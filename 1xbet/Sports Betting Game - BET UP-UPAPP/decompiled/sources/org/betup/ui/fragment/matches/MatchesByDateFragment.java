package org.betup.ui.fragment.matches;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.BetPresentation;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.MatchesByDateInteractor;
import org.betup.model.remote.entity.PageOptions;
import org.betup.model.remote.entity.bets.BetGroupSectionModel;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.NewBetGroupModel;
import org.betup.model.remote.entity.matches.NewBetItemModel;
import org.betup.model.remote.entity.matches.NewMatchBetModel;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.model.remote.entity.matches.NewMatchesResponseModel;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetModel;
import org.betup.model.remote.entity.matches.championship.specific.NewBetSectionModel;
import org.betup.model.remote.entity.matches.championship.specific.NewGroupModel;
import org.betup.model.remote.entity.matches.championship.specific.NewLeagueModel;
import org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.NewMatchDetailsDataModel;
import org.betup.model.remote.entity.matches.championship.specific.NewMatchesForLeagueModel;
import org.betup.model.remote.entity.matches.championship.specific.NewSocialModel;
import org.betup.model.remote.entity.matches.championship.specific.NewSportModel;
import org.betup.model.remote.entity.matches.championship.specific.NewTeamModel;
import org.betup.model.remote.entity.matches.championship.specific.NewToOldModelConverter;
import org.betup.model.remote.entity.matches.championship.specific.NewVarietyModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.user.UserProgressModel;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetMatchClickResult;
import org.betup.services.betlist.BetValidator;
import org.betup.services.language.AppLanguageObserver;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.banner.BannerFactory;
import org.betup.services.offer.banner.BannerProvider;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.ui.BackPressedController;
import org.betup.ui.MainActivity;
import org.betup.ui.TabMenuItem;
import org.betup.ui.base.ItemClickListener;
import org.betup.ui.common.Paginator;
import org.betup.ui.dialogs.OneClickBetSettingsDialogFragment;
import org.betup.ui.fragment.BaseAnimatedFragment;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.matches.adapter.BetClickListener;
import org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.utils.PicassoHelper;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: MatchesByDateFragment.kt */
@Metadata(d1 = {"\u0000\u009c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ¶\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006:\u0002¶\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010}\u001a\u00020~2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J!\u0010\u0081\u0001\u001a\u00020~2\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u001f2\u000b\b\u0001\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0014J\t\u0010\u0083\u0001\u001a\u00020~H\u0002J\t\u0010\u0084\u0001\u001a\u00020~H\u0002J\t\u0010\u0085\u0001\u001a\u00020~H\u0002J\t\u0010\u0086\u0001\u001a\u00020~H\u0002J\t\u0010\u0087\u0001\u001a\u00020~H\u0002J\t\u0010\u0088\u0001\u001a\u00020~H\u0002J\u0012\u0010\u0089\u0001\u001a\u00020~2\u0007\u0010\u008a\u0001\u001a\u00020pH\u0002J\u001e\u0010\u008b\u0001\u001a\u00020~2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00020mH\u0014J\u0013\u0010\u008f\u0001\u001a\u00020~2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0014J\u001f\u0010\u0092\u0001\u001a\u00020~2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020i0\u0094\u0001H\u0003J\u0019\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020|H\u0002J\u0013\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u0007\u0010\u0097\u0001\u001a\u00020|H\u0002J\t\u0010\u009a\u0001\u001a\u00020mH\u0016J\t\u0010\u009b\u0001\u001a\u00020~H\u0007J*\u0010\u009c\u0001\u001a\u00020\u001f2\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00012\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0016J\u0012\u0010¡\u0001\u001a\u00020~2\u0007\u0010¢\u0001\u001a\u00020\u0003H\u0016J\u0014\u0010£\u0001\u001a\u00030¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0016J\t\u0010§\u0001\u001a\u00020~H\u0016J\t\u0010¨\u0001\u001a\u00020~H\u0016J\u0013\u0010©\u0001\u001a\u00020~2\b\u0010ª\u0001\u001a\u00030«\u0001H\u0007J\u0013\u0010¬\u0001\u001a\u00020~2\b\u0010ª\u0001\u001a\u00030\u00ad\u0001H\u0007J\t\u0010®\u0001\u001a\u00020~H\u0016J\t\u0010¯\u0001\u001a\u00020~H\u0016J\t\u0010°\u0001\u001a\u00020~H\u0016J\t\u0010±\u0001\u001a\u00020~H\u0007J\t\u0010²\u0001\u001a\u00020~H\u0002J\u001b\u0010³\u0001\u001a\u00020~2\u0007\u0010´\u0001\u001a\u00020i2\u0007\u0010µ\u0001\u001a\u00020iH\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001e\u0010'\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001e\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010N\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010T\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001e\u0010Z\u001a\u00020[8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010f\u001a\u0004\u0018\u00010gX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020kX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020mX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020mX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010o\u001a\u0004\u0018\u00010pX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020iX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010r\u001a\u00020pX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010w\u001a\u00020pX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010t\"\u0004\by\u0010vR\u001a\u0010z\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020i0{X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006·\u0001²\u0006\u000b\u0010¸\u0001\u001a\u00020pX\u008a\u0084\u0002"}, d2 = {"Lorg/betup/ui/fragment/matches/MatchesByDateFragment;", "Lorg/betup/ui/fragment/BaseAnimatedFragment;", "Lorg/betup/ui/base/ItemClickListener;", "Lorg/betup/model/remote/entity/matches/championship/specific/ListedMatchModel;", "Lorg/betup/ui/fragment/matches/adapter/BetClickListener;", "Lorg/betup/ui/BackPressedController$BackPressedListener;", "Lorg/betup/ui/common/Paginator$StaticPageContentLoader;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "leagueIcon", "Landroid/widget/ImageView;", "getLeagueIcon", "()Landroid/widget/ImageView;", "setLeagueIcon", "(Landroid/widget/ImageView;)V", MatchesByDateFragment.ARG_LEAGUE_NAME, "Landroid/widget/TextView;", "getLeagueName", "()Landroid/widget/TextView;", "setLeagueName", "(Landroid/widget/TextView;)V", "matchesListView", "Landroidx/recyclerview/widget/RecyclerView;", "getMatchesListView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMatchesListView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "empty", "getEmpty", "setEmpty", "progressBar", "Landroid/view/View;", "getProgressBar", "()Landroid/view/View;", "setProgressBar", "(Landroid/view/View;)V", "expandButton", "getExpandButton", "setExpandButton", "oneClickBetIv", "getOneClickBetIv", "setOneClickBetIv", "expandContainer", "getExpandContainer", "setExpandContainer", "dateSelectorComposeView", "Landroidx/compose/ui/platform/ComposeView;", "getDateSelectorComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "setDateSelectorComposeView", "(Landroidx/compose/ui/platform/ComposeView;)V", "stateOverlayComposeView", "getStateOverlayComposeView", "setStateOverlayComposeView", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "matchesByDateInteractor", "Lorg/betup/model/remote/api/rest/matches/MatchesByDateInteractor;", "getMatchesByDateInteractor", "()Lorg/betup/model/remote/api/rest/matches/MatchesByDateInteractor;", "setMatchesByDateInteractor", "(Lorg/betup/model/remote/api/rest/matches/MatchesByDateInteractor;)V", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "getBetListAppender", "()Lorg/betup/services/betlist/BetListAppender;", "setBetListAppender", "(Lorg/betup/services/betlist/BetListAppender;)V", "betValidator", "Lorg/betup/services/betlist/BetValidator;", "getBetValidator", "()Lorg/betup/services/betlist/BetValidator;", "setBetValidator", "(Lorg/betup/services/betlist/BetValidator;)V", "dateFilterState", "Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "getDateFilterState", "()Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "setDateFilterState", "(Lorg/betup/ui/fragment/matches/filter/DateFilterState;)V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "appLanguageObserver", "Lorg/betup/services/language/AppLanguageObserver;", "getAppLanguageObserver", "()Lorg/betup/services/language/AppLanguageObserver;", "setAppLanguageObserver", "(Lorg/betup/services/language/AppLanguageObserver;)V", "matchesAdapter", "Lorg/betup/ui/fragment/matches/adapter/SpecificChampionshipAdapter;", "backPressedController", "Lorg/betup/ui/BackPressedController;", "bannerProvider", "Lorg/betup/services/offer/banner/BannerProvider;", "paginator", "Lorg/betup/ui/common/Paginator;", MatchesByDateFragment.ARG_LEAGUE_ID, "", "betPresentation", "Lorg/betup/model/local/entity/BetPresentation;", MatchesByDateFragment.ARG_EXPANDED_BETS, "", "isLoadingMatches", "matchesError", "", "matchesCount", "leagueNameS", "getLeagueNameS", "()Ljava/lang/String;", "setLeagueNameS", "(Ljava/lang/String;)V", "leaguePhotoS", "getLeaguePhotoS", "setLeaguePhotoS", "fetchListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/NewMatchesResponseModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewReady", ViewHierarchyConstants.VIEW_KEY, "syncBetPresentationWithGlobalPreference", "updateExpandButtonIcon", "updateOneClickBetIcon", "setupDateSelector", "setupStateOverlay", "updateUIState", "performDateChange", "newDate", "onUserReady", "userModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "success", "onFragmentAttached", "context", "Landroid/content/Context;", "handleApiResponse", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "convertToListedMatchModels", "", "response", "convertToNewMatchesForLeagueModel", "Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchesForLeagueModel;", "onBackPressed", "onBackClick", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "itemClicked", "item", "onMatchBetClick", "Lorg/betup/services/betlist/BetMatchClickResult;", "bet", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", X3.i.u0, X3.i.t0, "processBetsPlaced", "message", "Lorg/betup/bus/BetlistUpdatedMessage;", "onCoefficientUpdated", "Lorg/betup/bus/CoefficientUpdatedMessage;", "onStart", "onStop", "onDestroy", "onExpandButtonClick", "initializePagination", "loadItems", "offset", MatchMyBetsInteractor.PARAM_LIMIT, VastTagName.COMPANION, "app_release", MatchesByDateFragment.ARG_SELECTED_DATE}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchesByDateFragment extends BaseAnimatedFragment implements ItemClickListener<ListedMatchModel>, BetClickListener, BackPressedController.BackPressedListener, Paginator.StaticPageContentLoader {
    private static final String ARG_EXPANDED_BETS = "expandedBets";
    private static final String ARG_LEAGUE_ID = "leagueId";
    private static final String ARG_LEAGUE_NAME = "leagueName";
    private static final String ARG_LEAGUE_PHOTO = "leaguePhoto";
    private static final String ARG_SELECTED_DATE = "selectedDate";
    private static final String TAG = "MatchesByDateFragment";

    @Inject
    public AppLanguageObserver appLanguageObserver;
    private BackPressedController backPressedController;
    private BannerProvider bannerProvider;

    @Inject
    public BetListAppender betListAppender;

    @Inject
    public BetValidator betValidator;

    @Inject
    public DateFilterState dateFilterState;

    @BindView(R.id.dateSelectorComposeView)
    public ComposeView dateSelectorComposeView;

    @BindView(android.R.id.empty)
    public TextView empty;

    @BindView(R.id.expandButton)
    public ImageView expandButton;

    @BindView(R.id.expandContainer)
    public View expandContainer;
    private boolean expandedBets;
    private boolean isLoadingMatches;

    @BindView(R.id.leagueIcon)
    public ImageView leagueIcon;

    @BindView(R.id.leagueName)
    public TextView leagueName;

    @Inject
    public LocalPreferencesService localPreferencesService;
    private SpecificChampionshipAdapter matchesAdapter;

    @Inject
    public MatchesByDateInteractor matchesByDateInteractor;
    private int matchesCount;
    private String matchesError;

    @BindView(R.id.listView)
    public RecyclerView matchesListView;

    @BindView(R.id.one_click_bet_iv)
    public ImageView oneClickBetIv;
    private Paginator paginator;

    @BindView(R.id.progressBar)
    public View progressBar;

    @Inject
    public PromoService promoService;

    @BindView(R.id.stateOverlayComposeView)
    public ComposeView stateOverlayComposeView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private int leagueId = -1;
    private BetPresentation betPresentation = BetPresentation.SHORT;
    private String leagueNameS = "";
    private String leaguePhotoS = "";
    private final BaseCachedSharedInteractor.OnFetchedListener<NewMatchesResponseModel, Integer> fetchListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment$$ExternalSyntheticLambda0
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            MatchesByDateFragment.fetchListener$lambda$0(MatchesByDateFragment.this, fetchedResponseMessage);
        }
    };

    /* compiled from: MatchesByDateFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FetchStat.values().length];
            try {
                iArr[FetchStat.NO_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MatchesByDateFragment.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/matches/MatchesByDateFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_LEAGUE_ID", "ARG_LEAGUE_NAME", "ARG_LEAGUE_PHOTO", "ARG_EXPANDED_BETS", "ARG_SELECTED_DATE", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/matches/MatchesByDateFragment;", MatchesByDateFragment.ARG_LEAGUE_ID, "", MatchesByDateFragment.ARG_EXPANDED_BETS, "", MatchesByDateFragment.ARG_SELECTED_DATE, MatchesByDateFragment.ARG_LEAGUE_NAME, MatchesByDateFragment.ARG_LEAGUE_PHOTO, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MatchesByDateFragment newInstance(int i, String leagueName, String leaguePhoto) {
            Intrinsics.checkNotNullParameter(leagueName, "leagueName");
            Intrinsics.checkNotNullParameter(leaguePhoto, "leaguePhoto");
            return newInstance$default(this, i, false, null, leagueName, leaguePhoto, 6, null);
        }

        public final MatchesByDateFragment newInstance(int i, boolean z, String leagueName, String leaguePhoto) {
            Intrinsics.checkNotNullParameter(leagueName, "leagueName");
            Intrinsics.checkNotNullParameter(leaguePhoto, "leaguePhoto");
            return newInstance$default(this, i, z, null, leagueName, leaguePhoto, 4, null);
        }

        private Companion() {
        }

        public static /* synthetic */ MatchesByDateFragment newInstance$default(Companion companion, int i, boolean z, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i2 & 4) != 0) {
                str = null;
            }
            return companion.newInstance(i, z2, str, str2, str3);
        }

        public final MatchesByDateFragment newInstance(int leagueId, boolean expandedBets, String selectedDate, String leagueName, String leaguePhoto) {
            Intrinsics.checkNotNullParameter(leagueName, "leagueName");
            Intrinsics.checkNotNullParameter(leaguePhoto, "leaguePhoto");
            MatchesByDateFragment matchesByDateFragment = new MatchesByDateFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(MatchesByDateFragment.ARG_LEAGUE_ID, leagueId);
            bundle.putBoolean(MatchesByDateFragment.ARG_EXPANDED_BETS, expandedBets);
            bundle.putString(MatchesByDateFragment.ARG_LEAGUE_NAME, leagueName);
            bundle.putString(MatchesByDateFragment.ARG_LEAGUE_PHOTO, leaguePhoto);
            if (selectedDate != null) {
                bundle.putString(MatchesByDateFragment.ARG_SELECTED_DATE, selectedDate);
            }
            matchesByDateFragment.setArguments(bundle);
            return matchesByDateFragment;
        }
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
        Intrinsics.throwUninitializedPropertyAccessException(ARG_LEAGUE_NAME);
        return null;
    }

    public final void setLeagueName(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.leagueName = textView;
    }

    public final RecyclerView getMatchesListView() {
        RecyclerView recyclerView = this.matchesListView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchesListView");
        return null;
    }

    public final void setMatchesListView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.matchesListView = recyclerView;
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

    public final ComposeView getDateSelectorComposeView() {
        ComposeView composeView = this.dateSelectorComposeView;
        if (composeView != null) {
            return composeView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dateSelectorComposeView");
        return null;
    }

    public final void setDateSelectorComposeView(ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<set-?>");
        this.dateSelectorComposeView = composeView;
    }

    public final ComposeView getStateOverlayComposeView() {
        ComposeView composeView = this.stateOverlayComposeView;
        if (composeView != null) {
            return composeView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateOverlayComposeView");
        return null;
    }

    public final void setStateOverlayComposeView(ComposeView composeView) {
        Intrinsics.checkNotNullParameter(composeView, "<set-?>");
        this.stateOverlayComposeView = composeView;
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

    public final MatchesByDateInteractor getMatchesByDateInteractor() {
        MatchesByDateInteractor matchesByDateInteractor = this.matchesByDateInteractor;
        if (matchesByDateInteractor != null) {
            return matchesByDateInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchesByDateInteractor");
        return null;
    }

    public final void setMatchesByDateInteractor(MatchesByDateInteractor matchesByDateInteractor) {
        Intrinsics.checkNotNullParameter(matchesByDateInteractor, "<set-?>");
        this.matchesByDateInteractor = matchesByDateInteractor;
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

    public final DateFilterState getDateFilterState() {
        DateFilterState dateFilterState = this.dateFilterState;
        if (dateFilterState != null) {
            return dateFilterState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dateFilterState");
        return null;
    }

    public final void setDateFilterState(DateFilterState dateFilterState) {
        Intrinsics.checkNotNullParameter(dateFilterState, "<set-?>");
        this.dateFilterState = dateFilterState;
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

    public final String getLeagueNameS() {
        return this.leagueNameS;
    }

    public final void setLeagueNameS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.leagueNameS = str;
    }

    public final String getLeaguePhotoS() {
        return this.leaguePhotoS;
    }

    public final void setLeaguePhotoS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.leaguePhotoS = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchListener$lambda$0(MatchesByDateFragment matchesByDateFragment, FetchedResponseMessage fetchedResponseMessage) {
        Intrinsics.checkNotNull(fetchedResponseMessage);
        matchesByDateFragment.handleApiResponse(fetchedResponseMessage);
    }

    @Override // org.betup.ui.fragment.BaseAnimatedFragment, org.betup.ui.fragment.BaseFragmentWithProfileInfo, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new NullPointerException(getClass().getName());
        }
        this.leagueId = arguments.getInt(ARG_LEAGUE_ID);
        this.expandedBets = arguments.getBoolean(ARG_EXPANDED_BETS, getLocalPreferencesService().getGlobalExpandedBets());
        this.betPresentation = getLocalPreferencesService().getGlobalExpandedBets() ? BetPresentation.FULL : BetPresentation.SHORT;
        String string = arguments.getString(ARG_LEAGUE_NAME);
        if (string == null) {
            string = "";
        }
        this.leagueNameS = string;
        String string2 = arguments.getString(ARG_LEAGUE_PHOTO);
        this.leaguePhotoS = string2 != null ? string2 : "";
        String string3 = arguments.getString(ARG_SELECTED_DATE);
        if (string3 == null) {
            string3 = LocalDate.now().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        }
        Log.d(TAG, "onCreate: Setting initial date=" + string3 + ", leagueId=" + this.leagueId);
        getDateFilterState().selectDate(string3);
        setTabMenuType(TabMenuItem.MATCHES);
        BannerProvider defaultBannerProdiver = BannerFactory.getDefaultBannerProdiver(requireActivity(), getPromoService());
        this.bannerProvider = defaultBannerProdiver;
        if (defaultBannerProdiver != null) {
            defaultBannerProdiver.requestNew();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onViewReady(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewReady(view, savedInstanceState);
        Log.d(TAG, "onViewReady called, isActive=" + isActive());
        this.matchesAdapter = new SpecificChampionshipAdapter(requireActivity(), getPromoService().shouldDisplayPromo(PromoService.PromoCase.DEFAULT), this.bannerProvider, getBetListAppender(), getUserService().getOddType());
        getMatchesListView().setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        getMatchesListView().setAdapter(this.matchesAdapter);
        SpecificChampionshipAdapter specificChampionshipAdapter = this.matchesAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.setListener(this);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter2 = this.matchesAdapter;
        if (specificChampionshipAdapter2 != null) {
            specificChampionshipAdapter2.setBetClickListener(this);
        }
        setupDateSelector();
        setupStateOverlay();
        getLeagueName().setText(this.leagueNameS);
        PicassoHelper.with(requireActivity()).setImageView(getLeagueIcon()).setImageUrl(this.leaguePhotoS).load();
        initializePagination();
        updateExpandButtonIcon();
        getOneClickBetIv().setOnClickListener(new View.OnClickListener() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MatchesByDateFragment.onViewReady$lambda$2(MatchesByDateFragment.this, view2);
            }
        });
        updateOneClickBetIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewReady$lambda$2(final MatchesByDateFragment matchesByDateFragment, View view) {
        OneClickBetSettingsDialogFragment.INSTANCE.newInstance(new Function0() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onViewReady$lambda$2$lambda$1;
                onViewReady$lambda$2$lambda$1 = MatchesByDateFragment.onViewReady$lambda$2$lambda$1(MatchesByDateFragment.this);
                return onViewReady$lambda$2$lambda$1;
            }
        }).show(matchesByDateFragment.getChildFragmentManager(), "OneClickBetSettingsDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewReady$lambda$2$lambda$1(MatchesByDateFragment matchesByDateFragment) {
        matchesByDateFragment.updateOneClickBetIcon();
        return Unit.INSTANCE;
    }

    private final void syncBetPresentationWithGlobalPreference() {
        boolean globalExpandedBets = getLocalPreferencesService().getGlobalExpandedBets();
        BetPresentation betPresentation = globalExpandedBets ? BetPresentation.FULL : BetPresentation.SHORT;
        if (this.betPresentation != betPresentation) {
            this.betPresentation = betPresentation;
            this.expandedBets = globalExpandedBets;
        }
    }

    private final void updateExpandButtonIcon() {
        if (this.expandButton == null) {
            return;
        }
        getExpandButton().setImageResource(getLocalPreferencesService().getGlobalExpandedBets() || this.betPresentation == BetPresentation.FULL ? R.drawable.collapse_btn : R.drawable.expand_btn);
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
        getOneClickBetIv().setImageResource(getLocalPreferencesService().isOneClickBetEnabled(getUserService().getBetupUserIdOrZero()) ? R.drawable.flash_selected : R.drawable.flash_unselected);
    }

    private final void setupDateSelector() {
        getDateSelectorComposeView().setContent(ComposableLambdaKt.composableLambdaInstance(1891927917, true, new MatchesByDateFragment$setupDateSelector$1(this)));
    }

    private final void setupStateOverlay() {
        getStateOverlayComposeView().setContent(ComposableLambdaKt.composableLambdaInstance(-1035433025, true, new MatchesByDateFragment$setupStateOverlay$1(this)));
    }

    private final void updateUIState() {
        if (this.isLoadingMatches || this.matchesError != null || this.matchesCount == 0) {
            getStateOverlayComposeView().setVisibility(0);
            getMatchesListView().setVisibility(8);
            getProgressBar().setVisibility(8);
            getEmpty().setVisibility(8);
        } else {
            getStateOverlayComposeView().setVisibility(8);
            getMatchesListView().setVisibility(0);
        }
        setupStateOverlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performDateChange(String newDate) {
        if (Intrinsics.areEqual(newDate, getDateFilterState().getSelectedDate().getValue())) {
            return;
        }
        Log.d(TAG, "Date changed to: " + newDate);
        getDateFilterState().selectDate(newDate);
        SpecificChampionshipAdapter specificChampionshipAdapter = this.matchesAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.clearAll();
        }
        Paginator paginator = this.paginator;
        if (paginator != null) {
            paginator.refresh();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onUserReady(FullUserProfileModel userModel, boolean success) {
        Paginator paginator;
        if (success && isActive() && (paginator = this.paginator) != null) {
            paginator.refresh();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.betup.ui.fragment.BaseFragment
    protected void onFragmentAttached(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onFragmentAttached(context);
        BackPressedController backPressedController = context instanceof BackPressedController ? (BackPressedController) context : null;
        if (backPressedController == null) {
            throw new ClassCastException(context + " should implement BackPressedController");
        }
        this.backPressedController = backPressedController;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[LOOP:1: B:61:0x00fd->B:76:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[LOOP:2: B:78:0x0124->B:93:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleApiResponse(FetchedResponseMessage<NewMatchesResponseModel, Integer> responseMessage) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        FragmentActivity requireActivity;
        TourState tourState;
        if (!isActive()) {
            return;
        }
        NewMatchesResponseModel model = responseMessage.getModel();
        boolean z7 = model != null && model.getOffset() == 0;
        this.isLoadingMatches = false;
        if (responseMessage.getStat() != FetchStat.SUCCESS || getProfileIfFetched() == null) {
            if (z7) {
                FetchStat stat = responseMessage.getStat();
                this.matchesError = (stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()]) == 1 ? getString(R.string.conection_internet_failed) : getString(R.string.error_loading_competitions);
                SpecificChampionshipAdapter specificChampionshipAdapter = this.matchesAdapter;
                if (specificChampionshipAdapter != null) {
                    specificChampionshipAdapter.newItems(CollectionsKt.emptyList());
                }
                this.matchesCount = 0;
                updateUIState();
            }
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.setBusy(false);
                return;
            }
            return;
        }
        NewMatchesResponseModel model2 = responseMessage.getModel();
        if (model2 == null) {
            if (z7) {
                this.matchesError = null;
                SpecificChampionshipAdapter specificChampionshipAdapter2 = this.matchesAdapter;
                if (specificChampionshipAdapter2 != null) {
                    specificChampionshipAdapter2.newItems(CollectionsKt.emptyList());
                }
                this.matchesCount = 0;
                updateUIState();
            }
            Paginator paginator2 = this.paginator;
            if (paginator2 != null) {
                paginator2.setBusy(false);
                return;
            }
            return;
        }
        ArrayList convertToListedMatchModels = convertToListedMatchModels(model2);
        try {
            requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        } catch (Exception e) {
            Log.d("TourFlow", "MatchesByDateFragment - error: " + e.getMessage());
        }
        if (requireActivity instanceof MainActivity) {
            TourComposeHelper tourComposeHelper = ((MainActivity) requireActivity).tourComposeHelper;
            z = (tourComposeHelper == null || (tourState = tourComposeHelper.getTourState()) == null || !tourState.isTourActive()) ? false : true;
            Log.d("TourFlow", "MatchesByDateFragment - isTourActive: " + z);
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : convertToListedMatchModels) {
                    ListedMatchModel listedMatchModel = (ListedMatchModel) obj;
                    List<BetSectionModel> betSections = listedMatchModel.getBetSections();
                    if (betSections != null && (betSections.isEmpty() ^ true)) {
                        List<BetSectionModel> betSections2 = listedMatchModel.getBetSections();
                        Intrinsics.checkNotNullExpressionValue(betSections2, "getBetSections(...)");
                        List<BetSectionModel> list = betSections2;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                List<BetGroupSectionModel> groups = ((BetSectionModel) it.next()).getGroups();
                                if (groups != null) {
                                    List<BetGroupSectionModel> list2 = groups;
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        Iterator<T> it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            List<MatchDetailsBetDataModel> bets = ((BetGroupSectionModel) it2.next()).getBets();
                                            if (bets != null) {
                                                List<MatchDetailsBetDataModel> list3 = bets;
                                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                                    Iterator<T> it3 = list3.iterator();
                                                    while (it3.hasNext()) {
                                                        if (Intrinsics.areEqual((Object) ((MatchDetailsBetDataModel) it3.next()).getIsAvailable(), (Object) true)) {
                                                            z6 = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z6 = false;
                                                if (z6) {
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
                                    z5 = false;
                                    if (z5) {
                                        z2 = true;
                                        if (!z2) {
                                            z3 = true;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                                if (!z2) {
                                }
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                        arrayList.add(obj);
                    }
                }
                convertToListedMatchModels = arrayList;
            }
            if (!convertToListedMatchModels.isEmpty()) {
                if (z7) {
                    this.matchesError = null;
                    SpecificChampionshipAdapter specificChampionshipAdapter3 = this.matchesAdapter;
                    if (specificChampionshipAdapter3 != null) {
                        specificChampionshipAdapter3.newItems(CollectionsKt.emptyList());
                    }
                    this.matchesCount = 0;
                    updateUIState();
                }
                Paginator paginator3 = this.paginator;
                if (paginator3 != null) {
                    paginator3.setBusy(false);
                    paginator3.setLast(true);
                    return;
                }
                return;
            }
            this.matchesError = null;
            if (z7) {
                SpecificChampionshipAdapter specificChampionshipAdapter4 = this.matchesAdapter;
                if (specificChampionshipAdapter4 != null) {
                    specificChampionshipAdapter4.newItems(convertToListedMatchModels);
                }
                this.matchesCount = convertToListedMatchModels.size();
                updateUIState();
            } else {
                SpecificChampionshipAdapter specificChampionshipAdapter5 = this.matchesAdapter;
                if (specificChampionshipAdapter5 != null) {
                    specificChampionshipAdapter5.addItems(convertToListedMatchModels);
                }
                this.matchesCount += convertToListedMatchModels.size();
            }
            getExpandButton().setVisibility(0);
            Paginator paginator4 = this.paginator;
            if (paginator4 != null) {
                paginator4.setBusy(false);
                paginator4.setLast(model2.getItems().size() < model2.getLimit());
                PageOptions pageOptions = new PageOptions();
                pageOptions.setPageSize(model2.getLimit());
                pageOptions.setOffset(model2.getOffset() + model2.getItems().size());
                paginator4.setPageOptions(pageOptions);
                return;
            }
            return;
        }
        Log.d("TourFlow", "MatchesByDateFragment - activity is not MainActivity");
        z = false;
        if (z) {
        }
        if (!convertToListedMatchModels.isEmpty()) {
        }
    }

    private final List<ListedMatchModel> convertToListedMatchModels(NewMatchesResponseModel response) {
        List<ListedMatchModel> matches = NewToOldModelConverter.INSTANCE.convertNewMatchesToOld(convertToNewMatchesForLeagueModel(response)).getResponse().getMatches();
        Intrinsics.checkNotNullExpressionValue(matches, "getMatches(...)");
        return matches;
    }

    private final NewMatchesForLeagueModel convertToNewMatchesForLeagueModel(NewMatchesResponseModel response) {
        List<NewMatchItemModel> items = response.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (NewMatchItemModel newMatchItemModel : items) {
            long id = newMatchItemModel.getMatch().getId();
            int id2 = (int) newMatchItemModel.getMatch().getLeague().getId();
            String photoUrl = newMatchItemModel.getMatch().getLeague().getPhotoUrl();
            if (photoUrl == null) {
                photoUrl = "";
            }
            String name = newMatchItemModel.getMatch().getLeague().getName();
            if (name == null) {
                name = "";
            }
            NewLeagueModel newLeagueModel = new NewLeagueModel(id2, photoUrl, name);
            int id3 = (int) newMatchItemModel.getMatch().getAwayTeam().getId();
            String photoUrl2 = newMatchItemModel.getMatch().getAwayTeam().getPhotoUrl();
            if (photoUrl2 == null) {
                photoUrl2 = "";
            }
            String name2 = newMatchItemModel.getMatch().getAwayTeam().getName();
            if (name2 == null) {
                name2 = "";
            }
            NewTeamModel newTeamModel = new NewTeamModel(id3, photoUrl2, name2);
            int id4 = (int) newMatchItemModel.getMatch().getHomeTeam().getId();
            String photoUrl3 = newMatchItemModel.getMatch().getHomeTeam().getPhotoUrl();
            if (photoUrl3 == null) {
                photoUrl3 = "";
            }
            String name3 = newMatchItemModel.getMatch().getHomeTeam().getName();
            if (name3 == null) {
                name3 = "";
            }
            NewTeamModel newTeamModel2 = new NewTeamModel(id4, photoUrl3, name3);
            int id5 = (int) newMatchItemModel.getMatch().getSport().getId();
            String photoUrl4 = newMatchItemModel.getMatch().getSport().getPhotoUrl();
            String str = photoUrl4 == null ? "" : photoUrl4;
            String name4 = newMatchItemModel.getMatch().getSport().getName();
            String str2 = name4 == null ? "" : name4;
            String period = newMatchItemModel.getMatch().getSport().getPeriod();
            NewSportModel newSportModel = new NewSportModel(id5, str, str2, period == null ? "" : period, null, 16, null);
            int scoreAway = newMatchItemModel.getMatch().getScoreAway();
            int scoreHome = newMatchItemModel.getMatch().getScoreHome();
            String date = newMatchItemModel.getMatch().getDate();
            String str3 = date == null ? "" : date;
            int matchState = newMatchItemModel.getMatch().getMatchState();
            List<Object> submatches = newMatchItemModel.getMatch().getSubmatches();
            if (submatches == null) {
                submatches = CollectionsKt.emptyList();
            }
            NewMatchDetailsDataModel newMatchDetailsDataModel = new NewMatchDetailsDataModel(id, newLeagueModel, newTeamModel, newTeamModel2, newSportModel, scoreAway, scoreHome, str3, matchState, submatches, newMatchItemModel.getMatch().getCurrentPeriod(), newMatchItemModel.getMatch().getCurrentTime());
            NewSocialModel newSocialModel = new NewSocialModel(newMatchItemModel.getSocial().getId(), newMatchItemModel.getSocial().getBetsCount(), newMatchItemModel.getSocial().getLikesCount(), newMatchItemModel.getSocial().getViewsCount(), newMatchItemModel.getSocial().getCommentsCount(), newMatchItemModel.getSocial().isLiked());
            List<NewMatchBetModel> bets = newMatchItemModel.getBets();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets, 10));
            for (NewMatchBetModel newMatchBetModel : bets) {
                long id6 = newMatchBetModel.getVariety().getId();
                int scoreAway2 = newMatchBetModel.getVariety().getScoreAway();
                int scoreHome2 = newMatchBetModel.getVariety().getScoreHome();
                String betsGameType = newMatchBetModel.getVariety().getBetsGameType();
                NewVarietyModel newVarietyModel = new NewVarietyModel(id6, scoreAway2, scoreHome2, betsGameType == null ? "" : betsGameType);
                List<NewBetGroupModel> groups = newMatchBetModel.getGroups();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(groups, 10));
                for (NewBetGroupModel newBetGroupModel : groups) {
                    int id7 = (int) newBetGroupModel.getGroup().getId();
                    int level = newBetGroupModel.getGroup().getLevel();
                    String name5 = newBetGroupModel.getGroup().getName();
                    NewGroupModel newGroupModel = new NewGroupModel(id7, level, name5 == null ? "" : name5, newBetGroupModel.getGroup().getUserAvailable(), newBetGroupModel.getGroup().getDisplayColumns(), newBetGroupModel.getGroup().getExpToNextLevel(), newBetGroupModel.getGroup().getLevelStartExp());
                    List<NewBetItemModel> bets2 = newBetGroupModel.getBets();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bets2, 10));
                    for (NewBetItemModel newBetItemModel : bets2) {
                        long grabbedBetId = newBetItemModel.getGrabbedBetId();
                        double grabbedCoeficient = newBetItemModel.getGrabbedCoeficient();
                        int betTypeId = newBetItemModel.getBetTypeId();
                        boolean isAvailable = newBetItemModel.isAvailable();
                        String betName = newBetItemModel.getBetName();
                        arrayList4.add(new NewBetModel(grabbedBetId, grabbedCoeficient, betTypeId, isAvailable, betName == null ? "" : betName));
                    }
                    arrayList3.add(new org.betup.model.remote.entity.matches.championship.specific.NewBetGroupModel(newGroupModel, arrayList4));
                }
                arrayList2.add(new NewBetSectionModel(newVarietyModel, arrayList3));
            }
            arrayList.add(new NewListedMatchModel(newMatchDetailsDataModel, newSocialModel, arrayList2));
        }
        return new NewMatchesForLeagueModel(arrayList, response.getOffset(), response.getLimit());
    }

    @Override // org.betup.ui.BackPressedController.BackPressedListener
    public boolean onBackPressed() {
        getMatchesByDateInteractor().invalidate();
        return true;
    }

    @OnClick({R.id.back_arrow_iv})
    public final void onBackClick() {
        getMatchesByDateInteractor().invalidate();
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_matches_by_date, container, false);
        bindView(inflate);
        updateExpandButtonIcon();
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    @Override // org.betup.ui.base.ItemClickListener
    public void itemClicked(ListedMatchModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Bundle bundle = new Bundle();
        Integer id = item.getMatch().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        bundle.putInt("matchId", id.intValue());
        bundle.putBoolean("isLive", item.getMatch().getState() == MatchState.LIVE);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MATCH_DETAILS, bundle));
    }

    @Override // org.betup.ui.fragment.matches.adapter.BetClickListener
    public BetMatchClickResult onMatchBetClick(BetModel bet) {
        Intrinsics.checkNotNullParameter(bet, "bet");
        if (getBetListAppender().isSelectedBetAlready(bet.getGrabbedBetId())) {
            getBetListAppender().removeBet(bet.getGrabbedBetId());
            SpecificChampionshipAdapter specificChampionshipAdapter = this.matchesAdapter;
            if (specificChampionshipAdapter != null) {
                specificChampionshipAdapter.setBetValidating(bet.getGrabbedBetId(), false);
            }
            SpecificChampionshipAdapter specificChampionshipAdapter2 = this.matchesAdapter;
            if (specificChampionshipAdapter2 != null) {
                specificChampionshipAdapter2.refreshBetStates();
            }
            return new BetMatchClickResult(BetMatchClickResult.State.REMOVED, null);
        }
        final long grabbedBetId = bet.getGrabbedBetId();
        MatchDetailsBetDataModel bet2 = bet.getBet();
        if (bet2 != null ? Intrinsics.areEqual((Object) bet2.getIsAvailable(), (Object) false) : false) {
            return new BetMatchClickResult(BetMatchClickResult.State.PUT, null);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter3 = this.matchesAdapter;
        if (specificChampionshipAdapter3 != null) {
            specificChampionshipAdapter3.setBetValidating(grabbedBetId, true);
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MatchesByDateFragment.onMatchBetClick$lambda$16(MatchesByDateFragment.this, grabbedBetId);
            }
        };
        handler.postDelayed(runnable, 5000L);
        getBetValidator().validateBet(bet, new BetValidator.ValidationCallback() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment$onMatchBetClick$1
            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationSuccess(BetModel validatedBet, boolean coefficientChanged) {
                SpecificChampionshipAdapter specificChampionshipAdapter4;
                SpecificChampionshipAdapter specificChampionshipAdapter5;
                Intrinsics.checkNotNullParameter(validatedBet, "validatedBet");
                handler.removeCallbacks(runnable);
                this.getBetListAppender().addValidatedBetToList(validatedBet);
                specificChampionshipAdapter4 = this.matchesAdapter;
                if (specificChampionshipAdapter4 != null) {
                    specificChampionshipAdapter4.setBetValidating(grabbedBetId, false);
                }
                specificChampionshipAdapter5 = this.matchesAdapter;
                if (specificChampionshipAdapter5 != null) {
                    specificChampionshipAdapter5.refreshBetStates();
                }
            }

            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationFailed(BetValidator.ValidationFailureReason reason, int errorMessageId) {
                SpecificChampionshipAdapter specificChampionshipAdapter4;
                SpecificChampionshipAdapter specificChampionshipAdapter5;
                Intrinsics.checkNotNullParameter(reason, "reason");
                handler.removeCallbacks(runnable);
                specificChampionshipAdapter4 = this.matchesAdapter;
                if (specificChampionshipAdapter4 != null) {
                    specificChampionshipAdapter4.setBetValidating(grabbedBetId, false);
                }
                specificChampionshipAdapter5 = this.matchesAdapter;
                if (specificChampionshipAdapter5 != null) {
                    specificChampionshipAdapter5.refreshBetStates();
                }
                EventBus.getDefault().post(new CoefficientUpdatedMessage());
                EventBus.getDefault().post(new BetlistUpdatedMessage());
                SnackbarHelper.showShortIfForeground(this.requireContext(), errorMessageId);
            }
        });
        return new BetMatchClickResult(BetMatchClickResult.State.PUT, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMatchBetClick$lambda$16(MatchesByDateFragment matchesByDateFragment, long j) {
        SpecificChampionshipAdapter specificChampionshipAdapter = matchesByDateFragment.matchesAdapter;
        if (specificChampionshipAdapter == null || !specificChampionshipAdapter.isBetValidating(j)) {
            return;
        }
        Log.w(TAG, "Bet validation timeout - resetting loading state for betId: " + j);
        SpecificChampionshipAdapter specificChampionshipAdapter2 = matchesByDateFragment.matchesAdapter;
        if (specificChampionshipAdapter2 != null) {
            specificChampionshipAdapter2.setBetValidating(j, false);
        }
        SpecificChampionshipAdapter specificChampionshipAdapter3 = matchesByDateFragment.matchesAdapter;
        if (specificChampionshipAdapter3 != null) {
            specificChampionshipAdapter3.refreshBetStates();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.setOnBackPressedListener(this);
        }
        if (getAppLanguageObserver().wasLanguageRecentlyChanged()) {
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.refresh();
            }
            getAppLanguageObserver().markLanguageChangeHandled();
        }
        syncBetPresentationWithGlobalPreference();
        updateExpandButtonIcon();
        updateOneClickBetIcon();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BackPressedController backPressedController = this.backPressedController;
        if (backPressedController != null) {
            backPressedController.removeListener();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processBetsPlaced(BetlistUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SpecificChampionshipAdapter specificChampionshipAdapter = this.matchesAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.notifyDataSetChanged();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCoefficientUpdated(CoefficientUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (isActive()) {
            Log.d(TAG, "CoefficientUpdatedMessage received - refreshing list (bet blocked/deleted)");
            getMatchesByDateInteractor().invalidate(Integer.valueOf(this.leagueId));
            SpecificChampionshipAdapter specificChampionshipAdapter = this.matchesAdapter;
            if (specificChampionshipAdapter != null) {
                specificChampionshipAdapter.clearAll();
            }
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.refresh();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
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
        this.paginator = null;
    }

    @OnClick({R.id.expandButton, R.id.expandContainer})
    public final void onExpandButtonClick() {
        BetPresentation betPresentation;
        if (this.betPresentation == BetPresentation.SHORT) {
            betPresentation = BetPresentation.FULL;
        } else {
            betPresentation = BetPresentation.SHORT;
        }
        this.betPresentation = betPresentation;
        getUserService().saveBetPresentation(this.betPresentation);
        getLocalPreferencesService().saveGlobalExpandedBets(this.betPresentation == BetPresentation.FULL);
        this.expandedBets = this.betPresentation == BetPresentation.FULL;
        updateExpandButtonIcon();
        getMatchesByDateInteractor().invalidate(Integer.valueOf(this.leagueId));
        SpecificChampionshipAdapter specificChampionshipAdapter = this.matchesAdapter;
        if (specificChampionshipAdapter != null) {
            specificChampionshipAdapter.clearAll();
        }
        Paginator paginator = this.paginator;
        if (paginator != null) {
            paginator.refresh();
        }
    }

    private final void initializePagination() {
        Log.d(TAG, "initializePagination called, current date=" + ((Object) getDateFilterState().getSelectedDate().getValue()));
        this.paginator = new Paginator(this, getMatchesListView(), (SwipyRefreshLayout) null);
        PageOptions pageOptions = new PageOptions();
        pageOptions.setPageSize(10);
        pageOptions.setOffset(0);
        Paginator paginator = this.paginator;
        if (paginator != null) {
            paginator.setPageOptions(pageOptions);
        }
        Paginator paginator2 = this.paginator;
        if (paginator2 != null) {
            paginator2.init();
        }
        Log.d(TAG, "Starting initial load via paginator.refresh()");
        Paginator paginator3 = this.paginator;
        if (paginator3 != null) {
            paginator3.refresh();
        }
    }

    @Override // org.betup.ui.common.Paginator.StaticPageContentLoader
    public void loadItems(int offset, int limit) {
        if (isActive()) {
            Paginator paginator = this.paginator;
            if (paginator != null) {
                paginator.setBusy(true);
            }
            if (offset == 0) {
                this.isLoadingMatches = true;
                this.matchesError = null;
                updateUIState();
                getExpandButton().setVisibility(8);
            }
            String value = getDateFilterState().getSelectedDate().getValue();
            Log.d(TAG, "loadItems called with offset=" + offset + ", limit=" + limit + ", date=" + value + ", leagueId=" + this.leagueId);
            Bundle bundle = new Bundle();
            bundle.putSerializable("bets", this.betPresentation);
            bundle.putInt("offset", offset);
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, limit);
            bundle.putBoolean("getExpandedBetsInfo", this.expandedBets);
            bundle.putString("date", value);
            getMatchesByDateInteractor().invalidate();
            getMatchesByDateInteractor().load(this.fetchListener, Integer.valueOf(this.leagueId), bundle);
        }
    }
}
