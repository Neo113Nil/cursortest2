package org.betup.ui.fragment.matches.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.O6;
import com.vk.sdk.api.model.VKApiUserFull;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.MatchHolder;
import org.betup.model.remote.entity.SportsHelper;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.betup.model.remote.entity.bets.BetGroupSectionModel;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsAwayTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsHomeTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsLeagueModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsSportModel;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetMatchClickResult;
import org.betup.services.offer.banner.BannerController;
import org.betup.services.offer.banner.BannerProvider;
import org.betup.ui.base.ItemClickListener;
import org.betup.ui.base.SingleItemAdapter;
import org.betup.ui.common.BetSelectionState;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.views.BetView;
import org.betup.utils.BetHelper;
import org.betup.utils.DateHelper;
import org.betup.utils.FormatHelper;
import org.betup.utils.MatchDisplayState;
import org.betup.utils.NameFormatter;
import org.betup.utils.OddHelper;
import org.betup.utils.PicassoHelper;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TopMatchesAdapter.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0006HIJKLMB1\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010'\u001a\u00020(2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018H\u0016J\u0010\u0010)\u001a\u00020(2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010*\u001a\u00020(H\u0016J\u0016\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\tJ\u000e\u0010.\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u001cJ\u0006\u0010/\u001a\u00020(J\u0016\u00100\u001a\u00020(2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000502H\u0016J\u0016\u00103\u001a\u00020(2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000502H\u0016J\b\u00104\u001a\u00020(H\u0016J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&H\u0016J\u0018\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020&H\u0016J\u0010\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\u0002H\u0016J\u0010\u0010=\u001a\u00020(2\u0006\u0010<\u001a\u00020\u0002H\u0016J\u0018\u0010>\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00022\u0006\u00106\u001a\u00020&H\u0017J\u0006\u0010?\u001a\u00020\u000fJ\u000e\u0010@\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010A\u001a\u00020&H\u0016J\"\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u00152\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000502H\u0002J\u001c\u0010C\u001a\u00020(2\u0012\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u0015H\u0002J\u000e\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020GR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010#\u001a\f\u0012\b\u0012\u00060$R\u00020\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/betup/services/offer/banner/BannerController;", "Lorg/betup/ui/base/SingleItemAdapter;", "Lorg/betup/model/remote/entity/matches/championship/specific/ListedMatchModel;", "context", "Landroid/content/Context;", "isPromoEnabled", "", "bannerProvider", "Lorg/betup/services/offer/banner/BannerProvider;", "betListAppender", "Lorg/betup/services/betlist/BetListAppender;", "oddType", "Lorg/betup/model/local/entity/OddType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;ZLorg/betup/services/offer/banner/BannerProvider;Lorg/betup/services/betlist/BetListAppender;Lorg/betup/model/local/entity/OddType;)V", "mInflater", "Landroid/view/LayoutInflater;", "matchModels", "", "Lorg/betup/model/remote/entity/MatchHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/ui/base/ItemClickListener;", "betClickListener", "Lorg/betup/ui/fragment/matches/adapter/BetClickListener;", "lastPosition", "", "handler", "Landroid/os/Handler;", "betlineViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "validatingBetIds", "", "activeViewHolders", "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$ViewHolder;", "bannerIndex", "", "setListener", "", "setBetClickListener", "hideBanner", "setBetValidating", "betId", "isValidating", "isBetValidating", "refreshBetStates", "newItems", "items", "", "addItems", "clearAll", "getItemViewType", "position", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "holder", "onViewDetachedFromWindow", "onBindViewHolder", "getOddType", "setOddType", "getItemCount", "toHolders", "addPromoBanner", "holders", "fillView", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", VastTagName.COMPANION, "ViewHolder", "RacingViewHolder", "PromoHolder", "BetLineAdapter", "BetLineViewHolder", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopMatchesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements BannerController, SingleItemAdapter<ListedMatchModel> {
    private static final int MATCH_TYPE = 1;
    private static final int PROMO_TYPE = 2;
    private static final int RACING_MATCH_TYPE = 3;
    private final List<ViewHolder> activeViewHolders;
    private int bannerIndex;
    private final BannerProvider bannerProvider;
    private BetClickListener betClickListener;
    private final BetListAppender betListAppender;
    private final RecyclerView.RecycledViewPool betlineViewPool;
    private final Context context;
    private final Handler handler;
    private final boolean isPromoEnabled;
    private long lastPosition;
    private ItemClickListener<ListedMatchModel> listener;
    private final LayoutInflater mInflater;
    private List<MatchHolder<ListedMatchModel>> matchModels;
    private OddType oddType;
    private final Set<Long> validatingBetIds;
    public static final int $stable = 8;

    public final class RacingViewHolder_ViewBinding implements Unbinder {
        private RacingViewHolder target;
        private View view7f0a01e7;

        public RacingViewHolder_ViewBinding(final RacingViewHolder target, View source) {
            this.target = target;
            target.arenaName = (TextView) Utils.findRequiredViewAsType(source, R.id.arenaName, "field 'arenaName'", TextView.class);
            target.sportIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.sportIcon, "field 'sportIcon'", ImageView.class);
            target.matchDate = (TextView) Utils.findRequiredViewAsType(source, R.id.matchDate, "field 'matchDate'", TextView.class);
            target.matchTime = (TextView) Utils.findRequiredViewAsType(source, R.id.matchTime, "field 'matchTime'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.container, "method 'onMatchContainerClick'");
            this.view7f0a01e7 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.TopMatchesAdapter.RacingViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onMatchContainerClick();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            RacingViewHolder racingViewHolder = this.target;
            if (racingViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            racingViewHolder.arenaName = null;
            racingViewHolder.sportIcon = null;
            racingViewHolder.matchDate = null;
            racingViewHolder.matchTime = null;
            this.view7f0a01e7.setOnClickListener(null);
            this.view7f0a01e7 = null;
        }
    }

    public final class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;
        private View view7f0a01e7;

        public ViewHolder_ViewBinding(final ViewHolder target, View source) {
            this.target = target;
            target.sportIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.sportIcon, "field 'sportIcon'", ImageView.class);
            target.sportName = (TextView) Utils.findRequiredViewAsType(source, R.id.sportName, "field 'sportName'", TextView.class);
            target.leagueIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.leagueIcon, "field 'leagueIcon'", ImageView.class);
            target.leagueName = (TextView) Utils.findRequiredViewAsType(source, R.id.leagueName, "field 'leagueName'", TextView.class);
            target.firstTeamIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.likeIcon, "field 'firstTeamIcon'", ImageView.class);
            target.firstTeamName = (TextView) Utils.findRequiredViewAsType(source, R.id.firstTeamName, "field 'firstTeamName'", TextView.class);
            target.matchDate = (TextView) Utils.findRequiredViewAsType(source, R.id.matchDate, "field 'matchDate'", TextView.class);
            target.matchTime = (TextView) Utils.findRequiredViewAsType(source, R.id.matchTime, "field 'matchTime'", TextView.class);
            target.secondTeamName = (TextView) Utils.findRequiredViewAsType(source, R.id.secondTeamName, "field 'secondTeamName'", TextView.class);
            target.secondTeamIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.secondTeamIcon, "field 'secondTeamIcon'", ImageView.class);
            target.scoreAwayTv = (TextView) Utils.findRequiredViewAsType(source, R.id.score_away_tv, "field 'scoreAwayTv'", TextView.class);
            target.scoreHomeTv = (TextView) Utils.findRequiredViewAsType(source, R.id.score_home_tv, "field 'scoreHomeTv'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.container, "field 'container' and method 'onMatchContainerClick'");
            target.container = findRequiredView;
            this.view7f0a01e7 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.TopMatchesAdapter.ViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onMatchContainerClick();
                }
            });
            target.betsList = (RecyclerView) Utils.findRequiredViewAsType(source, R.id.betsList, "field 'betsList'", RecyclerView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.target;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            viewHolder.sportIcon = null;
            viewHolder.sportName = null;
            viewHolder.leagueIcon = null;
            viewHolder.leagueName = null;
            viewHolder.firstTeamIcon = null;
            viewHolder.firstTeamName = null;
            viewHolder.matchDate = null;
            viewHolder.matchTime = null;
            viewHolder.secondTeamName = null;
            viewHolder.secondTeamIcon = null;
            viewHolder.scoreAwayTv = null;
            viewHolder.scoreHomeTv = null;
            viewHolder.container = null;
            viewHolder.betsList = null;
            this.view7f0a01e7.setOnClickListener(null);
            this.view7f0a01e7 = null;
        }
    }

    public final class BetLineViewHolder_ViewBinding implements Unbinder {
        private BetLineViewHolder target;
        private View view7f0a02f2;
        private View view7f0a065e;
        private View view7f0a074e;

        public BetLineViewHolder_ViewBinding(final BetLineViewHolder target, View source) {
            this.target = target;
            target.title = (TextView) Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.first_bet, "field 'firstTeam' and method 'onFirstBetClick'");
            target.firstTeam = (BetView) Utils.castView(findRequiredView, R.id.first_bet, "field 'firstTeam'", BetView.class);
            this.view7f0a02f2 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.TopMatchesAdapter.BetLineViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onFirstBetClick();
                }
            });
            View findRequiredView2 = Utils.findRequiredView(source, R.id.second_bet, "field 'secondTeam' and method 'onSecondBetClick'");
            target.secondTeam = (BetView) Utils.castView(findRequiredView2, R.id.second_bet, "field 'secondTeam'", BetView.class);
            this.view7f0a065e = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.TopMatchesAdapter.BetLineViewHolder_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onSecondBetClick();
                }
            });
            View findRequiredView3 = Utils.findRequiredView(source, R.id.third_bet, "field 'thirdTeam' and method 'onThirdBetClick'");
            target.thirdTeam = (BetView) Utils.castView(findRequiredView3, R.id.third_bet, "field 'thirdTeam'", BetView.class);
            this.view7f0a074e = findRequiredView3;
            findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.TopMatchesAdapter.BetLineViewHolder_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onThirdBetClick();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            BetLineViewHolder betLineViewHolder = this.target;
            if (betLineViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            betLineViewHolder.title = null;
            betLineViewHolder.firstTeam = null;
            betLineViewHolder.secondTeam = null;
            betLineViewHolder.thirdTeam = null;
            this.view7f0a02f2.setOnClickListener(null);
            this.view7f0a02f2 = null;
            this.view7f0a065e.setOnClickListener(null);
            this.view7f0a065e = null;
            this.view7f0a074e.setOnClickListener(null);
            this.view7f0a074e = null;
        }
    }

    public TopMatchesAdapter(Context context, boolean z, BannerProvider bannerProvider, BetListAppender betListAppender, OddType oddType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(betListAppender, "betListAppender");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        this.isPromoEnabled = z;
        this.bannerProvider = bannerProvider;
        this.betListAppender = betListAppender;
        this.oddType = oddType;
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        this.mInflater = from;
        this.matchModels = new ArrayList();
        this.context = context;
        this.handler = new Handler();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 20);
        this.betlineViewPool = recycledViewPool;
        this.validatingBetIds = new LinkedHashSet();
        this.activeViewHolders = new ArrayList();
        this.bannerIndex = -1;
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void setListener(ItemClickListener<ListedMatchModel> listener) {
        this.listener = listener;
    }

    public final void setBetClickListener(BetClickListener betClickListener) {
        this.betClickListener = betClickListener;
    }

    @Override // org.betup.services.offer.banner.BannerController
    public void hideBanner() {
        int i = this.bannerIndex;
        if (i < 0 || i >= this.matchModels.size()) {
            return;
        }
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.TopMatchesAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TopMatchesAdapter.hideBanner$lambda$1(TopMatchesAdapter.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideBanner$lambda$1(TopMatchesAdapter topMatchesAdapter) {
        int i = topMatchesAdapter.bannerIndex;
        if (i < 0 || i >= topMatchesAdapter.matchModels.size()) {
            return;
        }
        topMatchesAdapter.matchModels.remove(topMatchesAdapter.bannerIndex);
        topMatchesAdapter.notifyItemRemoved(topMatchesAdapter.bannerIndex);
    }

    public final void setBetValidating(long betId, boolean isValidating) {
        if (isValidating) {
            this.validatingBetIds.add(Long.valueOf(betId));
        } else {
            this.validatingBetIds.remove(Long.valueOf(betId));
        }
    }

    public final boolean isBetValidating(long betId) {
        return this.validatingBetIds.contains(Long.valueOf(betId));
    }

    public final void refreshBetStates() {
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.TopMatchesAdapter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TopMatchesAdapter.refreshBetStates$lambda$3(TopMatchesAdapter.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshBetStates$lambda$3(TopMatchesAdapter topMatchesAdapter) {
        synchronized (topMatchesAdapter.activeViewHolders) {
            Iterator it = new ArrayList(topMatchesAdapter.activeViewHolders).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                ViewHolder viewHolder = (ViewHolder) it.next();
                try {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition != -1 && adapterPosition < topMatchesAdapter.matchModels.size()) {
                        ListedMatchModel match = topMatchesAdapter.matchModels.get(adapterPosition).getMatch();
                        if (match.getBetSections() != null) {
                            List<BetSectionModel> betSections = match.getBetSections();
                            Intrinsics.checkNotNullExpressionValue(betSections, "getBetSections(...)");
                            if (!betSections.isEmpty()) {
                                List<BetGroupSectionModel> groups = match.getBetSections().get(0).getGroups();
                                Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
                                viewHolder.setGroups(groups);
                            }
                        }
                        viewHolder.setGroups(CollectionsKt.emptyList());
                    }
                } catch (Exception e) {
                    Log.e("TopMatchesAdapter", "Error refreshing ViewHolder", e);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        topMatchesAdapter.notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void newItems(List<ListedMatchModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.matchModels = toHolders(items);
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void addItems(List<ListedMatchModel> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        int size = this.matchModels.size();
        this.matchModels.addAll(toHolders(items));
        notifyItemRangeInserted(size, items.size());
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void clearAll() {
        int size = this.matchModels.size();
        this.matchModels.clear();
        notifyItemRangeRemoved(0, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Integer id;
        if (this.matchModels.get(position).isPromo()) {
            return 2;
        }
        MatchDetailsSportModel sport = this.matchModels.get(position).getMatch().getMatch().getSport();
        return SportsHelper.hasSpecificMatchItem((sport == null || (id = sport.getId()) == null) ? 0 : id.intValue()) ? 3 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View inflate = this.mInflater.inflate(R.layout.item_top_match, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new ViewHolder(this, inflate);
        }
        if (viewType != 3) {
            LayoutInflater layoutInflater = this.mInflater;
            BannerProvider bannerProvider = this.bannerProvider;
            View inflate2 = layoutInflater.inflate(bannerProvider != null ? bannerProvider.getLayoutId() : R.layout.item_promo, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new PromoHolder(this, inflate2);
        }
        View inflate3 = this.mInflater.inflate(R.layout.item_match_racing, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new RacingViewHolder(this, inflate3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof ViewHolder) {
            synchronized (this.activeViewHolders) {
                if (!this.activeViewHolders.contains(holder)) {
                    this.activeViewHolders.add(holder);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof ViewHolder) {
            synchronized (this.activeViewHolders) {
                this.activeViewHolders.remove(holder);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        long j;
        Integer id;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int itemViewType = holder.getItemViewType();
        if (itemViewType != 1) {
            if (itemViewType == 3) {
                RacingViewHolder racingViewHolder = (RacingViewHolder) holder;
                MatchDetailsDataModel match = this.matchModels.get(position).getMatch().getMatch();
                racingViewHolder.getArenaName().setText(match.getHomeTeam().getName());
                racingViewHolder.getMatchDate().setText(DateHelper.getDate(match.getDate()));
                racingViewHolder.getMatchTime().setText(DateHelper.getTime(match.getDate()));
                MatchDetailsSportModel sport = match.getSport();
                if (sport != null) {
                    Integer id2 = sport.getId();
                    int iconResForMatch = SportsHelper.getIconResForMatch(id2 != null ? id2.intValue() : 0);
                    if (iconResForMatch != 0) {
                        racingViewHolder.getSportIcon().setImageResource(iconResForMatch);
                        return;
                    } else {
                        PicassoHelper.with(this.context).setImageView(racingViewHolder.getSportIcon()).setImageUrl(sport.getPhotoUrl()).load();
                        return;
                    }
                }
                return;
            }
            BannerProvider bannerProvider = this.bannerProvider;
            if (bannerProvider != null) {
                bannerProvider.fillView(this, holder.itemView);
                return;
            }
            return;
        }
        ViewHolder viewHolder = (ViewHolder) holder;
        MatchDetailsDataModel match2 = this.matchModels.get(position).getMatch().getMatch();
        MatchDetailsSportModel sport2 = match2.getSport();
        MatchDetailsLeagueModel league = match2.getLeague();
        if (sport2 != null) {
            PicassoHelper.with(this.context).setImageView(viewHolder.getSportIcon()).setImageUrl(sport2.getPhotoUrl()).load();
            TextView sportName = viewHolder.getSportName();
            String name = sport2.getName();
            if (name == null) {
                name = "";
            }
            String upperCase = name.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sportName.setText(upperCase);
        }
        if (league != null) {
            PicassoHelper.with(this.context).setImageView(viewHolder.getLeagueIcon()).setImageUrl(league.getPhotoUrl()).load();
            TextView leagueName = viewHolder.getLeagueName();
            String name2 = league.getName();
            leagueName.setText(name2 != null ? name2 : "");
        }
        String date = match2.getDate();
        MatchDetailsSportModel sport3 = match2.getSport();
        Integer valueOf = (sport3 == null || (id = sport3.getId()) == null) ? null : Integer.valueOf(id.intValue());
        boolean isScoreAvailable = MatchDisplayState.isScoreAvailable(match2.getState().getVal(), date, valueOf);
        boolean isLive = MatchDisplayState.isLive(match2.getState().getVal(), date, valueOf);
        if (!isScoreAvailable) {
            viewHolder.getScoreHomeTv().setText("-");
            viewHolder.getScoreHomeTv().setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            viewHolder.getScoreAwayTv().setText("-");
            viewHolder.getScoreAwayTv().setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            if (date == null) {
                viewHolder.getMatchDate().setText("");
                viewHolder.getMatchTime().setText("");
            } else {
                String formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(date);
                String formattedTime = UiExtensionsKt.getFormattedTime(date);
                viewHolder.getMatchTime().setText(formattedDateWithoutYear);
                viewHolder.getMatchDate().setText(formattedTime);
            }
        } else {
            if (match2.getScoreHome() == null) {
                viewHolder.getScoreHomeTv().setText("-");
                viewHolder.getScoreHomeTv().setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            } else {
                TextView scoreHomeTv = viewHolder.getScoreHomeTv();
                Float scoreHome = match2.getScoreHome();
                Intrinsics.checkNotNullExpressionValue(scoreHome, "getScoreHome(...)");
                scoreHomeTv.setText(FormatHelper.getScoreFormatted(scoreHome.floatValue()));
                viewHolder.getScoreHomeTv().setTextColor(this.context.getResources().getColor(R.color.primary_text, this.context.getTheme()));
            }
            if (match2.getScoreAway() == null) {
                viewHolder.getScoreAwayTv().setText("-");
                viewHolder.getScoreAwayTv().setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            } else {
                TextView scoreAwayTv = viewHolder.getScoreAwayTv();
                Float scoreAway = match2.getScoreAway();
                Intrinsics.checkNotNullExpressionValue(scoreAway, "getScoreAway(...)");
                scoreAwayTv.setText(FormatHelper.getScoreFormatted(scoreAway.floatValue()));
                viewHolder.getScoreAwayTv().setTextColor(this.context.getResources().getColor(R.color.primary_text, this.context.getTheme()));
            }
            if (!isLive) {
                viewHolder.getMatchDate().setText("-");
                viewHolder.getMatchTime().setText(this.context.getString(R.string.toto_finished));
            } else {
                viewHolder.getMatchDate().setText(UiExtensionsKt.normalizeMatchTime(match2.getCurrentTime()));
                viewHolder.getMatchTime().setText(UiExtensionsKt.normalizeMatchTime(match2.getCurrentPeriod()));
            }
        }
        MatchDetailsHomeTeamModel homeTeam = match2.getHomeTeam();
        MatchDetailsAwayTeamModel awayTeam = match2.getAwayTeam();
        PicassoHelper.with(this.context).setImageView(viewHolder.getFirstTeamIcon()).setImageUrl(homeTeam.getPhotoUrl()).load();
        NameFormatter.setTeamNameForList(viewHolder.getFirstTeamName(), homeTeam.getName());
        NameFormatter.setTeamNameForList(viewHolder.getSecondTeamName(), awayTeam.getName());
        PicassoHelper.with(this.context).setImageView(viewHolder.getSecondTeamIcon()).setImageUrl(awayTeam.getPhotoUrl()).load();
        ListedMatchModel match3 = this.matchModels.get(position).getMatch();
        if (match3.getBetSections() != null) {
            List<BetSectionModel> betSections = match3.getBetSections();
            Intrinsics.checkNotNullExpressionValue(betSections, "getBetSections(...)");
            if (!betSections.isEmpty()) {
                BetSectionModel betSectionModel = match3.getBetSections().get(0);
                BetGroupSectionModel groupByIdIfExists = betSectionModel.getGroupByIdIfExists(BetHelper.BetGroupType.WHO_WILL_WIN.getId());
                if (groupByIdIfExists == null && betSectionModel.getGroups() != null) {
                    List<BetGroupSectionModel> groups = betSectionModel.getGroups();
                    Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
                    if (!groups.isEmpty()) {
                        List<BetGroupSectionModel> groups2 = betSectionModel.getGroups();
                        Intrinsics.checkNotNullExpressionValue(groups2, "getGroups(...)");
                        viewHolder.setGroups(groups2);
                        j = position;
                        if (j > this.lastPosition) {
                            this.lastPosition = j;
                            ObjectAnimator.ofFloat(viewHolder.itemView, "alpha", 0.0f, 1.0f).setDuration(500L).start();
                            return;
                        }
                        return;
                    }
                }
                if (groupByIdIfExists != null) {
                    List<BetGroupSectionModel> groups3 = betSectionModel.getGroups();
                    Intrinsics.checkNotNullExpressionValue(groups3, "getGroups(...)");
                    viewHolder.setGroups(groups3);
                } else {
                    Log.d("TopMatchesAdapter", "BETS NULL - no groups found");
                    viewHolder.setGroups(CollectionsKt.emptyList());
                }
                j = position;
                if (j > this.lastPosition) {
                }
            }
        }
        Log.d("TopMatchesAdapter", "BETS NULL - no bet sections");
        viewHolder.setGroups(CollectionsKt.emptyList());
        j = position;
        if (j > this.lastPosition) {
        }
    }

    public final OddType getOddType() {
        return this.oddType;
    }

    public final void setOddType(OddType oddType) {
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        this.oddType = oddType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.matchModels.size();
    }

    private final List<MatchHolder<ListedMatchModel>> toHolders(List<? extends ListedMatchModel> items) {
        List<? extends ListedMatchModel> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new MatchHolder((ListedMatchModel) it.next(), false));
        }
        List<MatchHolder<ListedMatchModel>> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (this.isPromoEnabled) {
            addPromoBanner(mutableList);
        }
        return mutableList;
    }

    private final void addPromoBanner(List<MatchHolder<ListedMatchModel>> holders) {
        if (holders.isEmpty()) {
            return;
        }
        if (holders.size() < 3) {
            holders.add(new MatchHolder<>(null, true));
            this.bannerIndex = holders.size() - 1;
        } else {
            holders.add(2, new MatchHolder<>(null, true));
            this.bannerIndex = 2;
        }
    }

    public final void fillView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BannerProvider bannerProvider = this.bannerProvider;
        if (bannerProvider != null) {
            bannerProvider.fillView(this, view);
        }
    }

    /* compiled from: TopMatchesAdapter.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010>\u001a\u00020?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AJ\u0006\u0010C\u001a\u00020?J\b\u0010D\u001a\u00020?H\u0007R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001e\u0010\u001b\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001e\u0010!\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001e\u0010$\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001e\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001e\u0010*\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001e\u0010-\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001e\u00100\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0012\u0010;\u001a\u00060<R\u00020=X\u0082.¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;Landroid/view/View;)V", "sportIcon", "Landroid/widget/ImageView;", "getSportIcon", "()Landroid/widget/ImageView;", "setSportIcon", "(Landroid/widget/ImageView;)V", "sportName", "Landroid/widget/TextView;", "getSportName", "()Landroid/widget/TextView;", "setSportName", "(Landroid/widget/TextView;)V", "leagueIcon", "getLeagueIcon", "setLeagueIcon", "leagueName", "getLeagueName", "setLeagueName", "firstTeamIcon", "getFirstTeamIcon", "setFirstTeamIcon", "firstTeamName", "getFirstTeamName", "setFirstTeamName", "matchDate", "getMatchDate", "setMatchDate", "matchTime", "getMatchTime", "setMatchTime", "secondTeamName", "getSecondTeamName", "setSecondTeamName", "secondTeamIcon", "getSecondTeamIcon", "setSecondTeamIcon", "scoreAwayTv", "getScoreAwayTv", "setScoreAwayTv", "scoreHomeTv", "getScoreHomeTv", "setScoreHomeTv", "container", "getContainer", "()Landroid/view/View;", "setContainer", "(Landroid/view/View;)V", "betsList", "Landroidx/recyclerview/widget/RecyclerView;", "getBetsList", "()Landroidx/recyclerview/widget/RecyclerView;", "setBetsList", "(Landroidx/recyclerview/widget/RecyclerView;)V", O6.G1, "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$BetLineAdapter;", "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;", "setGroups", "", "groups", "", "Lorg/betup/model/remote/entity/bets/BetGroupSectionModel;", "refreshBetStates", "onMatchContainerClick", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private BetLineAdapter adapter;

        @BindView(R.id.betsList)
        public RecyclerView betsList;

        @BindView(R.id.container)
        public View container;

        @BindView(R.id.likeIcon)
        public ImageView firstTeamIcon;

        @BindView(R.id.firstTeamName)
        public TextView firstTeamName;

        @BindView(R.id.leagueIcon)
        public ImageView leagueIcon;

        @BindView(R.id.leagueName)
        public TextView leagueName;

        @BindView(R.id.matchDate)
        public TextView matchDate;

        @BindView(R.id.matchTime)
        public TextView matchTime;

        @BindView(R.id.score_away_tv)
        public TextView scoreAwayTv;

        @BindView(R.id.score_home_tv)
        public TextView scoreHomeTv;

        @BindView(R.id.secondTeamIcon)
        public ImageView secondTeamIcon;

        @BindView(R.id.secondTeamName)
        public TextView secondTeamName;

        @BindView(R.id.sportIcon)
        public ImageView sportIcon;

        @BindView(R.id.sportName)
        public TextView sportName;
        final /* synthetic */ TopMatchesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(TopMatchesAdapter topMatchesAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = topMatchesAdapter;
            ButterKnife.bind(this, itemView);
            getBetsList().setLayoutManager(new LinearLayoutManager(topMatchesAdapter.context, 1, false));
            getBetsList().setRecycledViewPool(topMatchesAdapter.betlineViewPool);
            this.adapter = topMatchesAdapter.new BetLineAdapter();
            RecyclerView betsList = getBetsList();
            BetLineAdapter betLineAdapter = this.adapter;
            if (betLineAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException(O6.G1);
                betLineAdapter = null;
            }
            betsList.setAdapter(betLineAdapter);
        }

        public final ImageView getSportIcon() {
            ImageView imageView = this.sportIcon;
            if (imageView != null) {
                return imageView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sportIcon");
            return null;
        }

        public final void setSportIcon(ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.sportIcon = imageView;
        }

        public final TextView getSportName() {
            TextView textView = this.sportName;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sportName");
            return null;
        }

        public final void setSportName(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.sportName = textView;
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

        public final ImageView getFirstTeamIcon() {
            ImageView imageView = this.firstTeamIcon;
            if (imageView != null) {
                return imageView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("firstTeamIcon");
            return null;
        }

        public final void setFirstTeamIcon(ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.firstTeamIcon = imageView;
        }

        public final TextView getFirstTeamName() {
            TextView textView = this.firstTeamName;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("firstTeamName");
            return null;
        }

        public final void setFirstTeamName(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.firstTeamName = textView;
        }

        public final TextView getMatchDate() {
            TextView textView = this.matchDate;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("matchDate");
            return null;
        }

        public final void setMatchDate(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.matchDate = textView;
        }

        public final TextView getMatchTime() {
            TextView textView = this.matchTime;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("matchTime");
            return null;
        }

        public final void setMatchTime(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.matchTime = textView;
        }

        public final TextView getSecondTeamName() {
            TextView textView = this.secondTeamName;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("secondTeamName");
            return null;
        }

        public final void setSecondTeamName(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.secondTeamName = textView;
        }

        public final ImageView getSecondTeamIcon() {
            ImageView imageView = this.secondTeamIcon;
            if (imageView != null) {
                return imageView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("secondTeamIcon");
            return null;
        }

        public final void setSecondTeamIcon(ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.secondTeamIcon = imageView;
        }

        public final TextView getScoreAwayTv() {
            TextView textView = this.scoreAwayTv;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("scoreAwayTv");
            return null;
        }

        public final void setScoreAwayTv(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.scoreAwayTv = textView;
        }

        public final TextView getScoreHomeTv() {
            TextView textView = this.scoreHomeTv;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("scoreHomeTv");
            return null;
        }

        public final void setScoreHomeTv(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.scoreHomeTv = textView;
        }

        public final View getContainer() {
            View view = this.container;
            if (view != null) {
                return view;
            }
            Intrinsics.throwUninitializedPropertyAccessException("container");
            return null;
        }

        public final void setContainer(View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.container = view;
        }

        public final RecyclerView getBetsList() {
            RecyclerView recyclerView = this.betsList;
            if (recyclerView != null) {
                return recyclerView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("betsList");
            return null;
        }

        public final void setBetsList(RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
            this.betsList = recyclerView;
        }

        public final void setGroups(List<? extends BetGroupSectionModel> groups) {
            Intrinsics.checkNotNullParameter(groups, "groups");
            ListedMatchModel listedMatchModel = (ListedMatchModel) ((MatchHolder) this.this$0.matchModels.get(getAdapterPosition())).getMatch();
            BetLineAdapter betLineAdapter = null;
            if (!groups.isEmpty() && listedMatchModel.getBetSections() != null) {
                List<BetSectionModel> betSections = listedMatchModel.getBetSections();
                Intrinsics.checkNotNullExpressionValue(betSections, "getBetSections(...)");
                if (!betSections.isEmpty()) {
                    BetLineAdapter betLineAdapter2 = this.adapter;
                    if (betLineAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(O6.G1);
                    } else {
                        betLineAdapter = betLineAdapter2;
                    }
                    Intrinsics.checkNotNull(listedMatchModel);
                    betLineAdapter.setGroups(listedMatchModel, listedMatchModel.getBetSections().get(0).getSection(), groups);
                    return;
                }
            }
            BetLineAdapter betLineAdapter3 = this.adapter;
            if (betLineAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(O6.G1);
                betLineAdapter3 = null;
            }
            Intrinsics.checkNotNull(listedMatchModel);
            betLineAdapter3.setGroups(listedMatchModel, null, CollectionsKt.emptyList());
        }

        public final void refreshBetStates() {
            BetLineAdapter betLineAdapter = this.adapter;
            if (betLineAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException(O6.G1);
                betLineAdapter = null;
            }
            betLineAdapter.refreshBetStates();
        }

        @OnClick({R.id.container})
        public final void onMatchContainerClick() {
            ItemClickListener itemClickListener = this.this$0.listener;
            if (itemClickListener != null) {
                itemClickListener.itemClicked(((MatchHolder) this.this$0.matchModels.get(getAdapterPosition())).getMatch());
            }
        }
    }

    /* compiled from: TopMatchesAdapter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0007R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001e\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$RacingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;Landroid/view/View;)V", "arenaName", "Landroid/widget/TextView;", "getArenaName", "()Landroid/widget/TextView;", "setArenaName", "(Landroid/widget/TextView;)V", "sportIcon", "Landroid/widget/ImageView;", "getSportIcon", "()Landroid/widget/ImageView;", "setSportIcon", "(Landroid/widget/ImageView;)V", "matchDate", "getMatchDate", "setMatchDate", "matchTime", "getMatchTime", "setMatchTime", "onMatchContainerClick", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RacingViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.arenaName)
        public TextView arenaName;

        @BindView(R.id.matchDate)
        public TextView matchDate;

        @BindView(R.id.matchTime)
        public TextView matchTime;

        @BindView(R.id.sportIcon)
        public ImageView sportIcon;
        final /* synthetic */ TopMatchesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RacingViewHolder(TopMatchesAdapter topMatchesAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = topMatchesAdapter;
            ButterKnife.bind(this, itemView);
        }

        public final TextView getArenaName() {
            TextView textView = this.arenaName;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("arenaName");
            return null;
        }

        public final void setArenaName(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.arenaName = textView;
        }

        public final ImageView getSportIcon() {
            ImageView imageView = this.sportIcon;
            if (imageView != null) {
                return imageView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sportIcon");
            return null;
        }

        public final void setSportIcon(ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.sportIcon = imageView;
        }

        public final TextView getMatchDate() {
            TextView textView = this.matchDate;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("matchDate");
            return null;
        }

        public final void setMatchDate(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.matchDate = textView;
        }

        public final TextView getMatchTime() {
            TextView textView = this.matchTime;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("matchTime");
            return null;
        }

        public final void setMatchTime(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.matchTime = textView;
        }

        @OnClick({R.id.container})
        public final void onMatchContainerClick() {
            ItemClickListener itemClickListener = this.this$0.listener;
            if (itemClickListener != null) {
                itemClickListener.itemClicked(((MatchHolder) this.this$0.matchModels.get(getAdapterPosition())).getMatch());
            }
        }
    }

    /* compiled from: TopMatchesAdapter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$PromoHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;Landroid/view/View;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class PromoHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ TopMatchesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromoHolder(TopMatchesAdapter topMatchesAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = topMatchesAdapter;
        }
    }

    /* compiled from: TopMatchesAdapter.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0006\u0010\u000f\u001a\u00020\u000eJ\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u000e2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$BetLineAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$BetLineViewHolder;", "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;)V", "groups", "", "Lorg/betup/model/remote/entity/bets/BetGroupSectionModel;", "section", "Lorg/betup/model/remote/entity/bets/SubMatchModel;", "match", "Lorg/betup/model/remote/entity/matches/championship/specific/ListedMatchModel;", "setGroups", "", "refreshBetStates", "onCreateViewHolder", VKApiUserFull.RelativeType.PARENT, "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BetLineAdapter extends RecyclerView.Adapter<BetLineViewHolder> {
        private List<? extends BetGroupSectionModel> groups = CollectionsKt.emptyList();
        private ListedMatchModel match;
        private SubMatchModel section;

        public BetLineAdapter() {
        }

        public final void setGroups(ListedMatchModel match, SubMatchModel section, List<? extends BetGroupSectionModel> groups) {
            Intrinsics.checkNotNullParameter(match, "match");
            Intrinsics.checkNotNullParameter(groups, "groups");
            this.groups = groups;
            this.section = section;
            this.match = match;
            notifyDataSetChanged();
        }

        public final void refreshBetStates() {
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public BetLineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            TopMatchesAdapter topMatchesAdapter = TopMatchesAdapter.this;
            View inflate = topMatchesAdapter.mInflater.inflate(R.layout.item_bets_line, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new BetLineViewHolder(topMatchesAdapter, inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(BetLineViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ListedMatchModel listedMatchModel = this.match;
            Intrinsics.checkNotNull(listedMatchModel);
            holder.setGroup(listedMatchModel, this.section, this.groups.get(position), this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.groups.size();
        }
    }

    /* compiled from: TopMatchesAdapter.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001e\u001a\u00060\u001fR\u00020 J\b\u0010#\u001a\u00020\"H\u0007J\b\u0010$\u001a\u00020\"H\u0007J\b\u0010%\u001a\u00020\"H\u0007J\"\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0002J\"\u0010,\u001a\u00020\"2\u0006\u0010'\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010(\u001a\u00020)H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$BetLineViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;Landroid/view/View;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "firstTeam", "Lorg/betup/ui/views/BetView;", "getFirstTeam", "()Lorg/betup/ui/views/BetView;", "setFirstTeam", "(Lorg/betup/ui/views/BetView;)V", "secondTeam", "getSecondTeam", "setSecondTeam", "thirdTeam", "getThirdTeam", "setThirdTeam", "group", "Lorg/betup/model/remote/entity/bets/BetGroupSectionModel;", "section", "Lorg/betup/model/remote/entity/bets/SubMatchModel;", "match", "Lorg/betup/model/remote/entity/matches/championship/specific/ListedMatchModel;", O6.G1, "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter$BetLineAdapter;", "Lorg/betup/ui/fragment/matches/adapter/TopMatchesAdapter;", "setGroup", "", "onFirstBetClick", "onSecondBetClick", "onThirdBetClick", "initBet", "betView", "bet", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsBetDataModel;", "isGroupUserAvailable", "", "processClick", "result", "Lorg/betup/services/betlist/BetMatchClickResult;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class BetLineViewHolder extends RecyclerView.ViewHolder {
        private BetLineAdapter adapter;

        @BindView(R.id.first_bet)
        public BetView firstTeam;
        private BetGroupSectionModel group;
        private ListedMatchModel match;

        @BindView(R.id.second_bet)
        public BetView secondTeam;
        private SubMatchModel section;

        @BindView(R.id.third_bet)
        public BetView thirdTeam;
        final /* synthetic */ TopMatchesAdapter this$0;

        @BindView(R.id.title)
        public TextView title;

        /* compiled from: TopMatchesAdapter.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BetMatchClickResult.State.values().length];
                try {
                    iArr[BetMatchClickResult.State.PUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BetMatchClickResult.State.REMOVED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BetLineViewHolder(TopMatchesAdapter topMatchesAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = topMatchesAdapter;
            ButterKnife.bind(this, itemView);
        }

        public final TextView getTitle() {
            TextView textView = this.title;
            if (textView != null) {
                return textView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("title");
            return null;
        }

        public final void setTitle(TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.title = textView;
        }

        public final BetView getFirstTeam() {
            BetView betView = this.firstTeam;
            if (betView != null) {
                return betView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("firstTeam");
            return null;
        }

        public final void setFirstTeam(BetView betView) {
            Intrinsics.checkNotNullParameter(betView, "<set-?>");
            this.firstTeam = betView;
        }

        public final BetView getSecondTeam() {
            BetView betView = this.secondTeam;
            if (betView != null) {
                return betView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("secondTeam");
            return null;
        }

        public final void setSecondTeam(BetView betView) {
            Intrinsics.checkNotNullParameter(betView, "<set-?>");
            this.secondTeam = betView;
        }

        public final BetView getThirdTeam() {
            BetView betView = this.thirdTeam;
            if (betView != null) {
                return betView;
            }
            Intrinsics.throwUninitializedPropertyAccessException("thirdTeam");
            return null;
        }

        public final void setThirdTeam(BetView betView) {
            Intrinsics.checkNotNullParameter(betView, "<set-?>");
            this.thirdTeam = betView;
        }

        public final void setGroup(ListedMatchModel match, SubMatchModel section, BetGroupSectionModel group, BetLineAdapter adapter) {
            Intrinsics.checkNotNullParameter(match, "match");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.group = group;
            this.adapter = adapter;
            this.section = section;
            this.match = match;
            if (Math.min(group.getGroup().getDisplayColumns(), group.getBets().size()) < 3) {
                getThirdTeam().setVisibility(8);
            } else {
                getThirdTeam().setVisibility(0);
            }
            getTitle().setText(UiExtensionsKt.formatBetNumbersForJava(group.getGroup().getName()));
            boolean isAvailable = group.getGroup().isAvailable();
            initBet(getFirstTeam(), group.getBetAtIndexIfHas(0), isAvailable);
            initBet(getSecondTeam(), group.getBetAtIndexIfHas(1), isAvailable);
            if (getThirdTeam().getVisibility() == 0) {
                initBet(getThirdTeam(), group.getBetAtIndexIfHas(2), isAvailable);
            }
        }

        @OnClick({R.id.first_bet})
        public final void onFirstBetClick() {
            MatchDetailsBetDataModel betAtIndexIfHas;
            BetMatchClickResult betMatchClickResult;
            BetGroupSectionModel betGroupSectionModel = this.group;
            if (betGroupSectionModel == null || (betAtIndexIfHas = betGroupSectionModel.getBetAtIndexIfHas(0)) == null) {
                return;
            }
            BetView firstTeam = getFirstTeam();
            BetClickListener betClickListener = this.this$0.betClickListener;
            if (betClickListener != null) {
                ListedMatchModel listedMatchModel = this.match;
                Intrinsics.checkNotNull(listedMatchModel);
                betMatchClickResult = betClickListener.onMatchBetClick(new BetModel(betAtIndexIfHas, listedMatchModel.getMatch(), this.section));
            } else {
                betMatchClickResult = null;
            }
            processClick(firstTeam, betMatchClickResult, betAtIndexIfHas);
        }

        @OnClick({R.id.second_bet})
        public final void onSecondBetClick() {
            MatchDetailsBetDataModel betAtIndexIfHas;
            BetMatchClickResult betMatchClickResult;
            BetGroupSectionModel betGroupSectionModel = this.group;
            if (betGroupSectionModel == null || (betAtIndexIfHas = betGroupSectionModel.getBetAtIndexIfHas(1)) == null) {
                return;
            }
            BetView secondTeam = getSecondTeam();
            BetClickListener betClickListener = this.this$0.betClickListener;
            if (betClickListener != null) {
                ListedMatchModel listedMatchModel = this.match;
                Intrinsics.checkNotNull(listedMatchModel);
                betMatchClickResult = betClickListener.onMatchBetClick(new BetModel(betAtIndexIfHas, listedMatchModel.getMatch(), this.section));
            } else {
                betMatchClickResult = null;
            }
            processClick(secondTeam, betMatchClickResult, betAtIndexIfHas);
        }

        @OnClick({R.id.third_bet})
        public final void onThirdBetClick() {
            MatchDetailsBetDataModel betAtIndexIfHas;
            BetMatchClickResult betMatchClickResult;
            BetGroupSectionModel betGroupSectionModel = this.group;
            if (betGroupSectionModel == null || (betAtIndexIfHas = betGroupSectionModel.getBetAtIndexIfHas(2)) == null) {
                return;
            }
            BetView thirdTeam = getThirdTeam();
            BetClickListener betClickListener = this.this$0.betClickListener;
            if (betClickListener != null) {
                ListedMatchModel listedMatchModel = this.match;
                Intrinsics.checkNotNull(listedMatchModel);
                betMatchClickResult = betClickListener.onMatchBetClick(new BetModel(betAtIndexIfHas, listedMatchModel.getMatch(), this.section));
            } else {
                betMatchClickResult = null;
            }
            processClick(thirdTeam, betMatchClickResult, betAtIndexIfHas);
        }

        private final void initBet(BetView betView, MatchDetailsBetDataModel bet, boolean isGroupUserAvailable) {
            BetSelectionState betSelectionState;
            if (!isGroupUserAvailable) {
                if (bet != null) {
                    betView.setVisibility(0);
                    betView.setBetCoef(OddHelper.format(this.this$0.oddType, bet.getGrabbedCoeficient()));
                    betView.setBetName(UiExtensionsKt.formatBetNumbersForJava(bet.getBetName()));
                } else {
                    betView.setVisibility(0);
                    betView.setBetCoef("-");
                    betView.setBetName("-");
                }
                betView.showLoadingIndicator(false);
                betView.setBetState(BetSelectionState.BET_LOCKED);
                return;
            }
            if (bet == null || !bet.getIsAvailable().booleanValue()) {
                betView.setVisibility(8);
                return;
            }
            betView.setVisibility(0);
            betView.setBetCoef(OddHelper.format(this.this$0.oddType, bet.getGrabbedCoeficient()));
            betView.setBetName(UiExtensionsKt.formatBetNumbersForJava(bet.getBetName()));
            Long grabbedBetId = bet.getGrabbedBetId();
            TopMatchesAdapter topMatchesAdapter = this.this$0;
            Intrinsics.checkNotNull(grabbedBetId);
            betView.showLoadingIndicator(topMatchesAdapter.isBetValidating(grabbedBetId.longValue()));
            if (this.this$0.betListAppender.isSelectedBetAlready(grabbedBetId.longValue())) {
                betSelectionState = BetSelectionState.BET_PUT;
            } else {
                betSelectionState = BetSelectionState.BET_AVAILABLE;
            }
            betView.setBetState(betSelectionState);
        }

        private final void processClick(BetView betView, BetMatchClickResult result, MatchDetailsBetDataModel bet) {
            BetGroupModel group;
            if (result == null) {
                return;
            }
            BetMatchClickResult.State state = result.getState();
            int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                if (bet.getIsAvailable().booleanValue()) {
                    Long grabbedBetId = bet.getGrabbedBetId();
                    TopMatchesAdapter topMatchesAdapter = this.this$0;
                    Intrinsics.checkNotNull(grabbedBetId);
                    topMatchesAdapter.setBetValidating(grabbedBetId.longValue(), true);
                    betView.showLoadingIndicator(true);
                    betView.setBetState(BetSelectionState.BET_PUT);
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            Long grabbedBetId2 = bet.getGrabbedBetId();
            TopMatchesAdapter topMatchesAdapter2 = this.this$0;
            Intrinsics.checkNotNull(grabbedBetId2);
            long longValue = grabbedBetId2.longValue();
            boolean z = false;
            topMatchesAdapter2.setBetValidating(longValue, false);
            betView.showLoadingIndicator(false);
            BetGroupSectionModel betGroupSectionModel = this.group;
            if (betGroupSectionModel != null && (group = betGroupSectionModel.getGroup()) != null) {
                z = group.isAvailable();
            }
            initBet(betView, bet, z);
        }
    }
}
