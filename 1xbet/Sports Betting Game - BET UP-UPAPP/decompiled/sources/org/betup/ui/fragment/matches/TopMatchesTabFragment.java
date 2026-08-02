package org.betup.ui.fragment.matches;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.BetUpApp;
import org.betup.bus.BetlistUpdatedMessage;
import org.betup.bus.CoefficientUpdatedMessage;
import org.betup.bus.NavigateMessage;
import org.betup.model.local.entity.BetPresentation;
import org.betup.model.local.entity.FullUserProfileModel;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.HotMatchesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.PageOptions;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.NewToOldModelConverter;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.topmatches.HotMatchesResponseModel;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetMatchClickResult;
import org.betup.services.betlist.BetValidator;
import org.betup.services.offer.PromoService;
import org.betup.services.offer.banner.BannerFactory;
import org.betup.services.offer.banner.BannerProvider;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.ui.base.ItemClickListener;
import org.betup.ui.common.Paginator;
import org.betup.ui.fragment.BaseAnimatedFragment;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.matches.adapter.BetClickListener;
import org.betup.ui.fragment.matches.adapter.TopMatchesAdapter;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* compiled from: TopMatchesTabFragment.kt */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 |2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0002|}B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J$\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010Y\u001a\u00020Q2\u0006\u0010Z\u001a\u00020SH\u0016J\u001a\u0010[\u001a\u00020Q2\u0006\u0010\\\u001a\u00020\u001b2\b\u0010R\u001a\u0004\u0018\u00010SH\u0014J\b\u0010]\u001a\u00020KH\u0014J\u001a\u0010^\u001a\u00020Q2\b\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u00020KH\u0014J\n\u0010b\u001a\u0004\u0018\u00010IH\u0002J\b\u0010c\u001a\u00020QH\u0002J\u001c\u0010d\u001a\u00020Q2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020K0fH\u0003J\u0010\u0010g\u001a\u00020Q2\u0006\u0010h\u001a\u00020\u0003H\u0016J\u0010\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020lH\u0016J\u0010\u0010m\u001a\u00020Q2\u0006\u0010n\u001a\u00020oH\u0007J\u0010\u0010p\u001a\u00020Q2\u0006\u0010n\u001a\u00020qH\u0007J\b\u0010r\u001a\u00020QH\u0016J\b\u0010s\u001a\u00020QH\u0016J\b\u0010t\u001a\u00020QH\u0016J\u0006\u0010u\u001a\u00020QJ\b\u0010v\u001a\u00020QH\u0002J\u0018\u0010w\u001a\u00020Q2\u0006\u0010x\u001a\u00020E2\u0006\u0010y\u001a\u00020EH\u0016J\b\u0010z\u001a\u00020KH\u0002J\u0018\u0010{\u001a\u00020S2\u0006\u0010x\u001a\u00020E2\u0006\u0010y\u001a\u00020EH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010F\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020E\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010L\u001a\u001e\u0012\f\u0012\n O*\u0004\u0018\u00010N0N\u0012\f\u0012\n O*\u0004\u0018\u00010K0K0MX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006~"}, d2 = {"Lorg/betup/ui/fragment/matches/TopMatchesTabFragment;", "Lorg/betup/ui/fragment/BaseAnimatedFragment;", "Lorg/betup/ui/base/ItemClickListener;", "Lorg/betup/model/remote/entity/matches/championship/specific/ListedMatchModel;", "Lorg/betup/ui/fragment/matches/adapter/BetClickListener;", "Lorg/betup/ui/common/Paginator$StaticPageContentLoader;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "swipeRefreshLayout", "Lcom/omadahealth/github/swipyrefreshlayout/library/SwipyRefreshLayout;", "getSwipeRefreshLayout", "()Lcom/omadahealth/github/swipyrefreshlayout/library/SwipyRefreshLayout;", "setSwipeRefreshLayout", "(Lcom/omadahealth/github/swipyrefreshlayout/library/SwipyRefreshLayout;)V", "listView", "Landroidx/recyclerview/widget/RecyclerView;", "getListView", "()Landroidx/recyclerview/widget/RecyclerView;", "setListView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "empty", "Landroid/widget/TextView;", "getEmpty", "()Landroid/widget/TextView;", "setEmpty", "(Landroid/widget/TextView;)V", "progressBar", "Landroid/view/View;", "getProgressBar", "()Landroid/view/View;", "setProgressBar", "(Landroid/view/View;)V", "promoService", "Lorg/betup/services/offer/PromoService;", "getPromoService", "()Lorg/betup/services/offer/PromoService;", "setPromoService", "(Lorg/betup/services/offer/PromoService;)V", "hotMatchesInteractor", "Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;", "getHotMatchesInteractor", "()Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;", "setHotMatchesInteractor", "(Lorg/betup/model/remote/api/rest/matches/HotMatchesInteractor;)V", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "getBetListAppender", "()Lorg/betup/services/betlist/BetListAppender;", "setBetListAppender", "(Lorg/betup/services/betlist/BetListAppender;)V", "betValidator", "Lorg/betup/services/betlist/BetValidator;", "getBetValidator", "()Lorg/betup/services/betlist/BetValidator;", "setBetValidator", "(Lorg/betup/services/betlist/BetValidator;)V", "localPreferencesService", "Lorg/betup/services/storage/LocalPreferencesService;", "getLocalPreferencesService", "()Lorg/betup/services/storage/LocalPreferencesService;", "setLocalPreferencesService", "(Lorg/betup/services/storage/LocalPreferencesService;)V", "topMatchesAdapter", "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;", "bannerProvider", "Lorg/betup/services/offer/banner/BannerProvider;", "paginator", "Lorg/betup/ui/common/Paginator;", "tabIndex", "", "pendingScrollRestoreFromConfig", "Lkotlin/Pair;", "pendingListRestoreState", "Lorg/betup/ui/fragment/matches/TopMatchesTabFragment$ListRestoreState;", "initialLoadRetryPending", "", "fetchListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/matches/topmatches/HotMatchesResponseModel;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewReady", ViewHierarchyConstants.VIEW_KEY, "callUserReadyAfterFetch", "onUserReady", "userModel", "Lorg/betup/model/local/entity/FullUserProfileModel;", "success", "saveListStateBeforeRefresh", "applyPendingListRestoreState", "handleApiResponse", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "itemClicked", "item", "onMatchBetClick", "Lorg/betup/services/betlist/BetMatchClickResult;", "bet", "Lorg/betup/ui/fragment/bets/betslip/adapter/model/BetModel;", "processBetsPlaced", "message", "Lorg/betup/bus/BetlistUpdatedMessage;", "onCoefficientUpdated", "Lorg/betup/bus/CoefficientUpdatedMessage;", "onStart", X3.i.u0, "onStop", "refreshList", "initializePagination", "loadItems", "offset", MatchMyBetsInteractor.PARAM_LIMIT, "isLiveTab", "loadRequestBundle", VastTagName.COMPANION, "ListRestoreState", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopMatchesTabFragment extends BaseAnimatedFragment implements ItemClickListener<ListedMatchModel>, BetClickListener, Paginator.StaticPageContentLoader {
    private static final String ARG_TAB_INDEX = "tab_index";
    private static final String KEY_RECYCLER_FIRST_POS = "recycler_first_pos";
    private static final String KEY_RECYCLER_SCROLL_OFFSET = "recycler_scroll_offset";
    private static final String TAG = "TopMatchesTabFragment";
    private BannerProvider bannerProvider;

    @Inject
    public BetListAppender betListAppender;

    @Inject
    public BetValidator betValidator;

    @BindView(R.id.empty)
    public TextView empty;
    private final BaseCachedSharedInteractor.OnFetchedListener<HotMatchesResponseModel, Boolean> fetchListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.TopMatchesTabFragment$$ExternalSyntheticLambda1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
            TopMatchesTabFragment.fetchListener$lambda$0(TopMatchesTabFragment.this, fetchedResponseMessage);
        }
    };

    @Inject
    public HotMatchesInteractor hotMatchesInteractor;
    private boolean initialLoadRetryPending;

    @BindView(org.betup.R.id.listView)
    public RecyclerView listView;

    @Inject
    public LocalPreferencesService localPreferencesService;
    private Paginator paginator;
    private ListRestoreState pendingListRestoreState;
    private Pair<Integer, Integer> pendingScrollRestoreFromConfig;

    @BindView(org.betup.R.id.progressBar)
    public View progressBar;

    @Inject
    public PromoService promoService;

    @BindView(org.betup.R.id.swipeRefreshLayout)
    public SwipyRefreshLayout swipeRefreshLayout;
    private int tabIndex;
    private TopMatchesAdapter topMatchesAdapter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // org.betup.ui.fragment.BaseAnimatedFragment, org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected boolean callUserReadyAfterFetch() {
        return true;
    }

    /* compiled from: TopMatchesTabFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/matches/TopMatchesTabFragment$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "ARG_TAB_INDEX", "KEY_RECYCLER_FIRST_POS", "KEY_RECYCLER_SCROLL_OFFSET", TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, "Lorg/betup/ui/fragment/matches/TopMatchesTabFragment;", "tabIndex", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TopMatchesTabFragment newInstance(int tabIndex) {
            TopMatchesTabFragment topMatchesTabFragment = new TopMatchesTabFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(TopMatchesTabFragment.ARG_TAB_INDEX, tabIndex);
            topMatchesTabFragment.setArguments(bundle);
            return topMatchesTabFragment;
        }
    }

    /* compiled from: TopMatchesTabFragment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/matches/TopMatchesTabFragment$ListRestoreState;", "", "firstVisiblePosition", "", "scrollOffset", "targetItemCount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(III)V", "getFirstVisiblePosition", "()I", "getScrollOffset", "getTargetItemCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public final RecyclerView getListView() {
        RecyclerView recyclerView = this.listView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listView");
        return null;
    }

    public final void setListView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.listView = recyclerView;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchListener$lambda$0(TopMatchesTabFragment topMatchesTabFragment, FetchedResponseMessage fetchedResponseMessage) {
        Intrinsics.checkNotNull(fetchedResponseMessage);
        topMatchesTabFragment.handleApiResponse(fetchedResponseMessage);
    }

    @Override // org.betup.ui.fragment.BaseAnimatedFragment, org.betup.ui.fragment.BaseFragmentWithProfileInfo, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        Bundle arguments = getArguments();
        this.tabIndex = arguments != null ? arguments.getInt(ARG_TAB_INDEX, 0) : 0;
        getLocalPreferencesService().getGlobalExpandedBets();
        BannerProvider defaultBannerProdiver = BannerFactory.getDefaultBannerProdiver(requireActivity(), getPromoService());
        this.bannerProvider = defaultBannerProdiver;
        if (defaultBannerProdiver != null) {
            defaultBannerProdiver.requestNew();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(org.betup.R.layout.fragment_top_matches_page, container, false);
        ButterKnife.bind(this, inflate);
        Intrinsics.checkNotNull(inflate);
        return inflate;
    }

    @Override // org.betup.ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        int findFirstVisibleItemPosition;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.listView != null) {
            RecyclerView.LayoutManager layoutManager = getListView().getLayoutManager();
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
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewReady(view, savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey(KEY_RECYCLER_FIRST_POS)) {
            this.pendingScrollRestoreFromConfig = new Pair<>(Integer.valueOf(savedInstanceState.getInt(KEY_RECYCLER_FIRST_POS)), Integer.valueOf(savedInstanceState.getInt(KEY_RECYCLER_SCROLL_OFFSET)));
        }
        if (getLocalPreferencesService().getGlobalExpandedBets()) {
            BetPresentation betPresentation = BetPresentation.FULL;
        } else {
            BetPresentation betPresentation2 = BetPresentation.SHORT;
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        boolean shouldDisplayPromo = getPromoService().shouldDisplayPromo(PromoService.PromoCase.DEFAULT);
        BannerProvider bannerProvider = this.bannerProvider;
        BetListAppender betListAppender = getBetListAppender();
        OddType oddType = getUserService().getOddType();
        Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
        this.topMatchesAdapter = new TopMatchesAdapter(requireActivity, shouldDisplayPromo, bannerProvider, betListAppender, oddType);
        getListView().setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        getListView().setSaveEnabled(false);
        getListView().setAdapter(this.topMatchesAdapter);
        TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
        if (topMatchesAdapter != null) {
            topMatchesAdapter.setListener(this);
        }
        TopMatchesAdapter topMatchesAdapter2 = this.topMatchesAdapter;
        if (topMatchesAdapter2 != null) {
            topMatchesAdapter2.setBetClickListener(this);
        }
        initializePagination();
        view.post(new Runnable() { // from class: org.betup.ui.fragment.matches.TopMatchesTabFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TopMatchesTabFragment.onViewReady$lambda$2(TopMatchesTabFragment.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewReady$lambda$2(TopMatchesTabFragment topMatchesTabFragment) {
        Paginator paginator = topMatchesTabFragment.paginator;
        if (paginator != null) {
            paginator.refresh();
        }
    }

    @Override // org.betup.ui.fragment.BaseFragmentWithProfileInfo
    protected void onUserReady(FullUserProfileModel userModel, boolean success) {
        if (success && isActive()) {
            TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
            boolean z = false;
            if ((topMatchesAdapter != null ? topMatchesAdapter.getItemCount() : 0) == 0) {
                Paginator paginator = this.paginator;
                if (paginator != null && paginator.isBusy()) {
                    z = true;
                }
                if (z) {
                    return;
                }
                refreshList();
            }
        }
    }

    private final ListRestoreState saveListStateBeforeRefresh() {
        TopMatchesAdapter topMatchesAdapter;
        int itemCount;
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        if (this.listView == null || (topMatchesAdapter = this.topMatchesAdapter) == null || (itemCount = topMatchesAdapter.getItemCount()) == 0) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = getListView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) < 0 || (findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition)) == null) {
            return null;
        }
        return new ListRestoreState(findFirstVisibleItemPosition, findViewByPosition.getTop(), itemCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPendingListRestoreState() {
        ListRestoreState listRestoreState;
        TopMatchesAdapter topMatchesAdapter;
        if (this.listView == null || (listRestoreState = this.pendingListRestoreState) == null || (topMatchesAdapter = this.topMatchesAdapter) == null) {
            return;
        }
        if (topMatchesAdapter.getItemCount() < listRestoreState.getTargetItemCount()) {
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
        RecyclerView.LayoutManager layoutManager = getListView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(RangesKt.coerceIn(listRestoreState.getFirstVisiblePosition(), 0, RangesKt.coerceAtLeast(topMatchesAdapter.getItemCount() - 1, 0)), listRestoreState.getScrollOffset());
    }

    private final void handleApiResponse(FetchedResponseMessage<HotMatchesResponseModel, Boolean> responseMessage) {
        if (isActive()) {
            if (this.listView == null) {
                Paginator paginator = this.paginator;
                if (paginator != null) {
                    paginator.setBusy(false);
                    return;
                }
                return;
            }
            Bundle args = responseMessage.getArgs();
            boolean z = (args != null ? args.getInt("offset", 0) : 0) == 0;
            getProgressBar().setVisibility(8);
            getListView().setVisibility(0);
            getSwipeRefreshLayout().setRefreshing(false);
            if (responseMessage.getStat() != FetchStat.SUCCESS) {
                if (z && !this.initialLoadRetryPending) {
                    this.initialLoadRetryPending = true;
                    Bundle args2 = responseMessage.getArgs();
                    int i = args2 != null ? args2.getInt(MatchMyBetsInteractor.PARAM_LIMIT, 20) : 20;
                    getHotMatchesInteractor().invalidateRequest(isLiveTab(), loadRequestBundle(0, i));
                    loadItems(0, i);
                    return;
                }
                this.initialLoadRetryPending = false;
                if (z) {
                    TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
                    if (topMatchesAdapter != null) {
                        topMatchesAdapter.newItems(CollectionsKt.emptyList());
                    }
                    getEmpty().setVisibility(0);
                }
                Paginator paginator2 = this.paginator;
                if (paginator2 != null) {
                    paginator2.setBusy(false);
                    return;
                }
                return;
            }
            this.initialLoadRetryPending = false;
            HotMatchesResponseModel model = responseMessage.getModel();
            if (model == null) {
                if (z) {
                    TopMatchesAdapter topMatchesAdapter2 = this.topMatchesAdapter;
                    if (topMatchesAdapter2 != null) {
                        topMatchesAdapter2.newItems(CollectionsKt.emptyList());
                    }
                    getEmpty().setVisibility(0);
                }
                Paginator paginator3 = this.paginator;
                if (paginator3 != null) {
                    paginator3.setBusy(false);
                    return;
                }
                return;
            }
            List<ListedMatchModel> matches = NewToOldModelConverter.INSTANCE.convertHotMatchesToOld(model).getResponse().getMatches();
            Intrinsics.checkNotNull(matches);
            if (!matches.isEmpty()) {
                getEmpty().setVisibility(8);
                if (z) {
                    TopMatchesAdapter topMatchesAdapter3 = this.topMatchesAdapter;
                    if (topMatchesAdapter3 != null) {
                        topMatchesAdapter3.newItems(matches);
                    }
                    Pair<Integer, Integer> pair = this.pendingScrollRestoreFromConfig;
                    if (pair != null) {
                        final int intValue = pair.component1().intValue();
                        final int intValue2 = pair.component2().intValue();
                        getListView().post(new Runnable() { // from class: org.betup.ui.fragment.matches.TopMatchesTabFragment$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                TopMatchesTabFragment.handleApiResponse$lambda$5$lambda$4(TopMatchesTabFragment.this, intValue, intValue2);
                            }
                        });
                        this.pendingScrollRestoreFromConfig = null;
                    }
                } else {
                    TopMatchesAdapter topMatchesAdapter4 = this.topMatchesAdapter;
                    if (topMatchesAdapter4 != null) {
                        topMatchesAdapter4.addItems(matches);
                    }
                }
                Paginator paginator4 = this.paginator;
                if (paginator4 != null) {
                    paginator4.setBusy(false);
                    paginator4.setLast(model.getItems().size() < model.getLimit());
                    PageOptions pageOptions = new PageOptions();
                    pageOptions.setPageSize(model.getLimit());
                    pageOptions.setOffset(model.getOffset() + model.getItems().size());
                    paginator4.setPageOptions(pageOptions);
                }
                getListView().post(new Runnable() { // from class: org.betup.ui.fragment.matches.TopMatchesTabFragment$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        TopMatchesTabFragment.this.applyPendingListRestoreState();
                    }
                });
                return;
            }
            if (z) {
                TopMatchesAdapter topMatchesAdapter5 = this.topMatchesAdapter;
                if (topMatchesAdapter5 != null) {
                    topMatchesAdapter5.newItems(CollectionsKt.emptyList());
                }
                getEmpty().setVisibility(0);
            }
            Paginator paginator5 = this.paginator;
            if (paginator5 != null) {
                paginator5.setBusy(false);
                paginator5.setLast(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleApiResponse$lambda$5$lambda$4(TopMatchesTabFragment topMatchesTabFragment, int i, int i2) {
        RecyclerView.LayoutManager layoutManager = topMatchesTabFragment.getListView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(i, i2);
        }
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
            TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
            if (topMatchesAdapter != null) {
                topMatchesAdapter.setBetValidating(bet.getGrabbedBetId(), false);
            }
            TopMatchesAdapter topMatchesAdapter2 = this.topMatchesAdapter;
            if (topMatchesAdapter2 != null) {
                topMatchesAdapter2.refreshBetStates();
            }
            return new BetMatchClickResult(BetMatchClickResult.State.REMOVED, null);
        }
        final long grabbedBetId = bet.getGrabbedBetId();
        MatchDetailsBetDataModel bet2 = bet.getBet();
        if (bet2 != null ? Intrinsics.areEqual((Object) bet2.getIsAvailable(), (Object) false) : false) {
            return new BetMatchClickResult(BetMatchClickResult.State.PUT, null);
        }
        TopMatchesAdapter topMatchesAdapter3 = this.topMatchesAdapter;
        if (topMatchesAdapter3 != null) {
            topMatchesAdapter3.setBetValidating(grabbedBetId, true);
        }
        getBetValidator().validateBet(bet, new BetValidator.ValidationCallback() { // from class: org.betup.ui.fragment.matches.TopMatchesTabFragment$onMatchBetClick$1
            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationSuccess(BetModel validatedBet, boolean coefficientChanged) {
                TopMatchesAdapter topMatchesAdapter4;
                TopMatchesAdapter topMatchesAdapter5;
                Intrinsics.checkNotNullParameter(validatedBet, "validatedBet");
                TopMatchesTabFragment.this.getBetListAppender().addValidatedBetToList(validatedBet);
                topMatchesAdapter4 = TopMatchesTabFragment.this.topMatchesAdapter;
                if (topMatchesAdapter4 != null) {
                    topMatchesAdapter4.setBetValidating(grabbedBetId, false);
                }
                topMatchesAdapter5 = TopMatchesTabFragment.this.topMatchesAdapter;
                if (topMatchesAdapter5 != null) {
                    topMatchesAdapter5.refreshBetStates();
                }
            }

            @Override // org.betup.services.betlist.BetValidator.ValidationCallback
            public void onValidationFailed(BetValidator.ValidationFailureReason reason, int errorMessageId) {
                TopMatchesAdapter topMatchesAdapter4;
                TopMatchesAdapter topMatchesAdapter5;
                Intrinsics.checkNotNullParameter(reason, "reason");
                topMatchesAdapter4 = TopMatchesTabFragment.this.topMatchesAdapter;
                if (topMatchesAdapter4 != null) {
                    topMatchesAdapter4.setBetValidating(grabbedBetId, false);
                }
                topMatchesAdapter5 = TopMatchesTabFragment.this.topMatchesAdapter;
                if (topMatchesAdapter5 != null) {
                    topMatchesAdapter5.refreshBetStates();
                }
                EventBus.getDefault().post(new CoefficientUpdatedMessage());
                EventBus.getDefault().post(new BetlistUpdatedMessage());
                SnackbarHelper.showShortIfForeground(TopMatchesTabFragment.this.requireContext(), errorMessageId);
            }
        });
        return new BetMatchClickResult(BetMatchClickResult.State.PUT, null);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void processBetsPlaced(BetlistUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
        if (topMatchesAdapter != null) {
            topMatchesAdapter.refreshBetStates();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCoefficientUpdated(CoefficientUpdatedMessage message) {
        PageOptions pageOptions;
        Intrinsics.checkNotNullParameter(message, "message");
        if (isActive()) {
            Log.d(TAG, "CoefficientUpdatedMessage received - refreshing list for tab " + this.tabIndex);
            this.pendingListRestoreState = saveListStateBeforeRefresh();
            TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
            if (topMatchesAdapter != null) {
                topMatchesAdapter.clearAll();
            }
            Paginator paginator = this.paginator;
            int pageSize = (paginator == null || (pageOptions = paginator.getPageOptions()) == null) ? 20 : pageOptions.getPageSize();
            getHotMatchesInteractor().invalidateRequest(isLiveTab(), loadRequestBundle(0, pageSize));
            Paginator paginator2 = this.paginator;
            if (paginator2 != null) {
                PageOptions pageOptions2 = new PageOptions();
                pageOptions2.setPageSize(pageSize);
                pageOptions2.setOffset(0);
                paginator2.setPageOptions(pageOptions2);
            }
            Paginator paginator3 = this.paginator;
            if (paginator3 != null) {
                paginator3.refresh();
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
    public void onResume() {
        super.onResume();
        if (isActive()) {
            Paginator paginator = this.paginator;
            if (paginator == null || !paginator.isBusy()) {
                TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
                if ((topMatchesAdapter != null ? topMatchesAdapter.getItemCount() : 0) == 0) {
                    refreshList();
                }
            }
        }
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

    public final void refreshList() {
        PageOptions pageOptions;
        this.pendingListRestoreState = saveListStateBeforeRefresh();
        TopMatchesAdapter topMatchesAdapter = this.topMatchesAdapter;
        if (topMatchesAdapter != null) {
            topMatchesAdapter.clearAll();
        }
        this.initialLoadRetryPending = false;
        Paginator paginator = this.paginator;
        int pageSize = (paginator == null || (pageOptions = paginator.getPageOptions()) == null) ? 20 : pageOptions.getPageSize();
        getHotMatchesInteractor().invalidateRequest(isLiveTab(), loadRequestBundle(0, pageSize));
        Paginator paginator2 = this.paginator;
        if (paginator2 != null) {
            PageOptions pageOptions2 = new PageOptions();
            pageOptions2.setPageSize(pageSize);
            pageOptions2.setOffset(0);
            paginator2.setPageOptions(pageOptions2);
        }
        Paginator paginator3 = this.paginator;
        if (paginator3 != null) {
            paginator3.refresh();
        }
    }

    private final void initializePagination() {
        Paginator paginator = new Paginator(this, getListView(), getSwipeRefreshLayout());
        this.paginator = paginator;
        PageOptions pageOptions = new PageOptions();
        pageOptions.setPageSize(20);
        pageOptions.setOffset(0);
        paginator.setPageOptions(pageOptions);
        Paginator paginator2 = this.paginator;
        if (paginator2 != null) {
            paginator2.init();
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
                getProgressBar().setVisibility(0);
                getListView().setVisibility(4);
                getEmpty().setVisibility(8);
            }
            Bundle loadRequestBundle = loadRequestBundle(offset, limit);
            Log.d(TAG, "Loading items: offset=" + offset + ", limit=" + limit + ", isLive=" + isLiveTab() + ", tabIndex=" + this.tabIndex);
            if (offset == 0) {
                getHotMatchesInteractor().invalidateRequest(isLiveTab(), loadRequestBundle);
            }
            getHotMatchesInteractor().load(this.fetchListener, Boolean.valueOf(isLiveTab()), loadRequestBundle);
        }
    }

    private final boolean isLiveTab() {
        return this.tabIndex == 1;
    }

    private final Bundle loadRequestBundle(int offset, int limit) {
        return HotMatchesInteractor.INSTANCE.requestBundle(offset, limit, getLocalPreferencesService().getGlobalExpandedBets());
    }
}
