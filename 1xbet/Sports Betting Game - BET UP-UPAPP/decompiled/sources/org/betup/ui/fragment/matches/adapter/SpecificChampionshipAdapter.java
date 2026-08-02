package org.betup.ui.fragment.matches.adapter;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
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
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.MatchHolder;
import org.betup.model.remote.entity.SportsHelper;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.betup.model.remote.entity.bets.BetGroupSectionModel;
import org.betup.model.remote.entity.bets.BetSectionModel;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.championship.specific.ListedMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsAwayTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsHomeTeamModel;
import org.betup.services.betlist.BetListAppender;
import org.betup.services.betlist.BetMatchClickResult;
import org.betup.services.offer.banner.BannerController;
import org.betup.services.offer.banner.BannerProvider;
import org.betup.ui.base.ItemClickListener;
import org.betup.ui.base.SingleItemAdapter;
import org.betup.ui.common.BetSelectionState;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter;
import org.betup.ui.views.BetView;
import org.betup.utils.BetHelper;
import org.betup.utils.DateHelper;
import org.betup.utils.FormatHelper;
import org.betup.utils.MatchDisplayState;
import org.betup.utils.MatchUtils;
import org.betup.utils.NameFormatter;
import org.betup.utils.OddHelper;
import org.betup.utils.PicassoHelper;
import org.betup.utils.UiExtensionsKt;

/* loaded from: classes4.dex */
public class SpecificChampionshipAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements BannerController, SingleItemAdapter<ListedMatchModel> {
    private static final int MATCH_TYPE = 1;
    private static final int PROMO_TYPE = 2;
    private static final int RACING_MATCH_TYPE = 3;
    private final BannerProvider bannerProvider;
    private BetClickListener betClickListener;
    private final BetListAppender betListAppender;
    private final RecyclerView.RecycledViewPool betlineViewPool;
    private final Context context;
    private final boolean isPromoEnabled;
    private long lastPosition;
    private ItemClickListener<ListedMatchModel> listener;
    private final LayoutInflater mInflater;
    private OddType oddType;
    private int bannerIndex = -1;
    private Long tourMatchId = null;
    private Consumer<Rect> onTourMatchItemBounds = null;
    private Consumer<Long> onTourMatchItemId = null;
    private Runnable onMatchScrollComplete = null;
    private final Set<Long> validatingBetIds = new HashSet();
    private final List<ViewHolder> activeViewHolders = new ArrayList();
    private List<MatchHolder<ListedMatchModel>> specificChampMatchModels = new ArrayList();
    private final Handler handler = new Handler();

    public class RacingViewHolder_ViewBinding implements Unbinder {
        private RacingViewHolder target;
        private View view7f0a01e7;

        public RacingViewHolder_ViewBinding(final RacingViewHolder target, View source) {
            this.target = target;
            View findRequiredView = Utils.findRequiredView(source, R.id.container, "field 'container' and method 'onMatchContainerClick'");
            target.container = findRequiredView;
            this.view7f0a01e7 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.RacingViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onMatchContainerClick();
                }
            });
            target.arenaName = (TextView) Utils.findRequiredViewAsType(source, R.id.arenaName, "field 'arenaName'", TextView.class);
            target.sportIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.sportIcon, "field 'sportIcon'", ImageView.class);
            target.matchDate = (TextView) Utils.findRequiredViewAsType(source, R.id.matchDate, "field 'matchDate'", TextView.class);
            target.matchTime = (TextView) Utils.findRequiredViewAsType(source, R.id.matchTime, "field 'matchTime'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            RacingViewHolder racingViewHolder = this.target;
            if (racingViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.target = null;
            racingViewHolder.container = null;
            racingViewHolder.arenaName = null;
            racingViewHolder.sportIcon = null;
            racingViewHolder.matchDate = null;
            racingViewHolder.matchTime = null;
            this.view7f0a01e7.setOnClickListener(null);
            this.view7f0a01e7 = null;
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder target;
        private View view7f0a01e7;

        public ViewHolder_ViewBinding(final ViewHolder target, View source) {
            this.target = target;
            target.firstTeamIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.likeIcon, "field 'firstTeamIcon'", ImageView.class);
            target.firstTeamName = (TextView) Utils.findRequiredViewAsType(source, R.id.firstTeamName, "field 'firstTeamName'", TextView.class);
            target.matchDate = (TextView) Utils.findRequiredViewAsType(source, R.id.matchDate, "field 'matchDate'", TextView.class);
            target.matchTime = (TextView) Utils.findRequiredViewAsType(source, R.id.matchTime, "field 'matchTime'", TextView.class);
            target.secondTeamName = (TextView) Utils.findRequiredViewAsType(source, R.id.secondTeamName, "field 'secondTeamName'", TextView.class);
            target.secondTeamIcon = (ImageView) Utils.findRequiredViewAsType(source, R.id.secondTeamIcon, "field 'secondTeamIcon'", ImageView.class);
            target.scoreAwayTv = (TextView) Utils.findRequiredViewAsType(source, R.id.score_away_tv, "field 'scoreAwayTv'", TextView.class);
            target.scoreHomeTv = (TextView) Utils.findRequiredViewAsType(source, R.id.score_home_tv, "field 'scoreHomeTv'", TextView.class);
            target.periodScoresTv = (TextView) Utils.findRequiredViewAsType(source, R.id.period_scores_tv, "field 'periodScoresTv'", TextView.class);
            View findRequiredView = Utils.findRequiredView(source, R.id.container, "field 'container' and method 'onMatchContainerClick'");
            target.container = findRequiredView;
            this.view7f0a01e7 = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.ViewHolder_ViewBinding.1
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
            viewHolder.firstTeamIcon = null;
            viewHolder.firstTeamName = null;
            viewHolder.matchDate = null;
            viewHolder.matchTime = null;
            viewHolder.secondTeamName = null;
            viewHolder.secondTeamIcon = null;
            viewHolder.scoreAwayTv = null;
            viewHolder.scoreHomeTv = null;
            viewHolder.periodScoresTv = null;
            viewHolder.container = null;
            viewHolder.betsList = null;
            this.view7f0a01e7.setOnClickListener(null);
            this.view7f0a01e7 = null;
        }
    }

    public class BetLineViewHolder_ViewBinding implements Unbinder {
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
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.BetLineViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onFirstBetClick();
                }
            });
            View findRequiredView2 = Utils.findRequiredView(source, R.id.second_bet, "field 'secondTeam' and method 'onSecondBetClick'");
            target.secondTeam = (BetView) Utils.castView(findRequiredView2, R.id.second_bet, "field 'secondTeam'", BetView.class);
            this.view7f0a065e = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.BetLineViewHolder_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public void doClick(View p0) {
                    target.onSecondBetClick();
                }
            });
            View findRequiredView3 = Utils.findRequiredView(source, R.id.third_bet, "field 'thirdTeam' and method 'onThirdBetClick'");
            target.thirdTeam = (BetView) Utils.castView(findRequiredView3, R.id.third_bet, "field 'thirdTeam'", BetView.class);
            this.view7f0a074e = findRequiredView3;
            findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.BetLineViewHolder_ViewBinding.3
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

    public SpecificChampionshipAdapter(Context context, boolean isPromoEnabled, BannerProvider bannerProvider, BetListAppender betListAppender, OddType oddType) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.context = context;
        this.betListAppender = betListAppender;
        this.isPromoEnabled = isPromoEnabled;
        this.bannerProvider = bannerProvider;
        this.oddType = oddType;
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        this.betlineViewPool = recycledViewPool;
        recycledViewPool.setMaxRecycledViews(0, 20);
    }

    public void setBetClickListener(BetClickListener betClickListener) {
        this.betClickListener = betClickListener;
    }

    public void setBetValidating(long betId, boolean isValidating) {
        if (isValidating) {
            this.validatingBetIds.add(Long.valueOf(betId));
        } else {
            this.validatingBetIds.remove(Long.valueOf(betId));
        }
    }

    public boolean isBetValidating(long betId) {
        return this.validatingBetIds.contains(Long.valueOf(betId));
    }

    public void refreshBetStatesForMatch(final long matchId) {
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < SpecificChampionshipAdapter.this.specificChampMatchModels.size(); i++) {
                    ListedMatchModel listedMatchModel = (ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(i)).getMatch();
                    if (listedMatchModel != null && listedMatchModel.getMatch() != null && listedMatchModel.getMatch().getId() != null && listedMatchModel.getMatch().getId().longValue() == matchId) {
                        synchronized (SpecificChampionshipAdapter.this.activeViewHolders) {
                            for (ViewHolder viewHolder : SpecificChampionshipAdapter.this.activeViewHolders) {
                                if (viewHolder.getAdapterPosition() == i) {
                                    try {
                                        List<BetSectionModel> betSections = listedMatchModel.getBetSections();
                                        if (betSections != null && !betSections.isEmpty()) {
                                            viewHolder.setGroups(betSections.get(0).getGroups());
                                        } else {
                                            viewHolder.setGroups(new ArrayList());
                                        }
                                    } catch (Exception e) {
                                        Log.e("SpecificChampionshipAdapter", "Error refreshing match item", e);
                                    }
                                }
                            }
                        }
                        SpecificChampionshipAdapter.this.notifyItemChanged(i);
                        return;
                    }
                }
            }
        });
    }

    public void markBetsAsUnavailable(final long matchId, List<Long> betIds) {
        if (betIds == null || betIds.isEmpty()) {
            return;
        }
        final HashSet hashSet = new HashSet(betIds);
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                List<BetSectionModel> betSections;
                for (int i = 0; i < SpecificChampionshipAdapter.this.specificChampMatchModels.size(); i++) {
                    ListedMatchModel listedMatchModel = (ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(i)).getMatch();
                    if (listedMatchModel != null && listedMatchModel.getMatch() != null && listedMatchModel.getMatch().getId() != null && listedMatchModel.getMatch().getId().longValue() == matchId && (betSections = listedMatchModel.getBetSections()) != null) {
                        Iterator<BetSectionModel> it = betSections.iterator();
                        while (it.hasNext()) {
                            List<BetGroupSectionModel> groups = it.next().getGroups();
                            if (groups != null) {
                                Iterator<BetGroupSectionModel> it2 = groups.iterator();
                                while (it2.hasNext()) {
                                    List<MatchDetailsBetDataModel> bets = it2.next().getBets();
                                    if (bets != null) {
                                        for (MatchDetailsBetDataModel matchDetailsBetDataModel : bets) {
                                            Long grabbedBetId = matchDetailsBetDataModel.getGrabbedBetId();
                                            if (grabbedBetId != null && hashSet.contains(grabbedBetId)) {
                                                matchDetailsBetDataModel.setIsAvailable(false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        SpecificChampionshipAdapter.this.notifyItemChanged(i);
                        return;
                    }
                }
            }
        });
    }

    public void removeBetsFromMatch(final long matchId, List<Long> betIds) {
        if (betIds == null || betIds.isEmpty()) {
            return;
        }
        final HashSet hashSet = new HashSet(betIds);
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                List<BetSectionModel> betSections;
                for (int i = 0; i < SpecificChampionshipAdapter.this.specificChampMatchModels.size(); i++) {
                    ListedMatchModel listedMatchModel = (ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(i)).getMatch();
                    if (listedMatchModel != null && listedMatchModel.getMatch() != null && listedMatchModel.getMatch().getId() != null && listedMatchModel.getMatch().getId().longValue() == matchId && (betSections = listedMatchModel.getBetSections()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (BetSectionModel betSectionModel : betSections) {
                            List<BetGroupSectionModel> groups = betSectionModel.getGroups();
                            if (groups != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (BetGroupSectionModel betGroupSectionModel : groups) {
                                    List<MatchDetailsBetDataModel> bets = betGroupSectionModel.getBets();
                                    if (bets != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (MatchDetailsBetDataModel matchDetailsBetDataModel : bets) {
                                            Long grabbedBetId = matchDetailsBetDataModel.getGrabbedBetId();
                                            if (grabbedBetId == null || !hashSet.contains(grabbedBetId)) {
                                                arrayList3.add(matchDetailsBetDataModel);
                                            }
                                        }
                                        betGroupSectionModel.setBets(arrayList3);
                                        if (!arrayList3.isEmpty()) {
                                            arrayList2.add(betGroupSectionModel);
                                        }
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    betSectionModel.setGroups(arrayList2);
                                    arrayList.add(betSectionModel);
                                }
                            }
                        }
                        listedMatchModel.setBetSections(arrayList);
                        SpecificChampionshipAdapter.this.notifyItemChanged(i);
                        return;
                    }
                }
            }
        });
    }

    public void updateMatchBetSections(final long matchId, final List<BetSectionModel> newBetSections) {
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < SpecificChampionshipAdapter.this.specificChampMatchModels.size(); i++) {
                    ListedMatchModel listedMatchModel = (ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(i)).getMatch();
                    if (listedMatchModel != null && listedMatchModel.getMatch() != null && listedMatchModel.getMatch().getId() != null && listedMatchModel.getMatch().getId().longValue() == matchId) {
                        List<BetSectionModel> list = newBetSections;
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        listedMatchModel.setBetSections(list);
                        SpecificChampionshipAdapter.this.notifyItemChanged(i);
                        return;
                    }
                }
            }
        });
    }

    public void refreshBetStates() {
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (SpecificChampionshipAdapter.this.activeViewHolders) {
                    for (ViewHolder viewHolder : new ArrayList(SpecificChampionshipAdapter.this.activeViewHolders)) {
                        try {
                            int adapterPosition = viewHolder.getAdapterPosition();
                            if (adapterPosition != -1 && adapterPosition < SpecificChampionshipAdapter.this.specificChampMatchModels.size()) {
                                ListedMatchModel listedMatchModel = (ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(adapterPosition)).getMatch();
                                if (listedMatchModel.getBetSections() != null && listedMatchModel.getBetSections().size() > 0) {
                                    viewHolder.setGroups(listedMatchModel.getBetSections().get(0).getGroups());
                                } else {
                                    viewHolder.setGroups(new ArrayList());
                                }
                            }
                        } catch (Exception e) {
                            Log.e("SpecificChampionshipAdapter", "Error refreshing ViewHolder", e);
                        }
                    }
                }
                SpecificChampionshipAdapter.this.notifyDataSetChanged();
            }
        });
    }

    public void setTourCallbacks(Long tourMatchId, Consumer<Rect> onTourMatchItemBounds, Consumer<Long> onTourMatchItemId, Runnable onMatchScrollComplete) {
        this.tourMatchId = tourMatchId;
        this.onTourMatchItemBounds = onTourMatchItemBounds;
        this.onTourMatchItemId = onTourMatchItemId;
        this.onMatchScrollComplete = onMatchScrollComplete;
    }

    private void addPromoBanner(List<MatchHolder<ListedMatchModel>> specificChampMatchModels) {
        if (specificChampMatchModels.size() == 0) {
            return;
        }
        if (specificChampMatchModels.size() < 3) {
            specificChampMatchModels.add(new MatchHolder<>(null, true));
            this.bannerIndex = specificChampMatchModels.size() - 1;
        } else {
            specificChampMatchModels.add(2, new MatchHolder<>(null, true));
            this.bannerIndex = 2;
        }
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void newItems(List<ListedMatchModel> items) {
        this.specificChampMatchModels = toHolders(items);
        notifyDataSetChanged();
        if (this.tourMatchId != null && items.size() > 0 && this.onMatchScrollComplete != null) {
            this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.6
                @Override // java.lang.Runnable
                public void run() {
                    SpecificChampionshipAdapter.this.onMatchScrollComplete.run();
                    Log.d("SpecificChampionshipAdapter", "Match scroll complete - first item should be ready, tourMatchId=" + SpecificChampionshipAdapter.this.tourMatchId);
                }
            });
        } else {
            if (this.tourMatchId != null || items.size() <= 0 || this.onMatchScrollComplete == null) {
                return;
            }
            this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.7
                @Override // java.lang.Runnable
                public void run() {
                    SpecificChampionshipAdapter.this.onMatchScrollComplete.run();
                }
            });
        }
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void clearAll() {
        this.specificChampMatchModels.clear();
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void addItems(List<ListedMatchModel> newItems) {
        this.specificChampMatchModels.addAll(toHolders(newItems));
        notifyDataSetChanged();
    }

    @Override // org.betup.ui.base.SingleItemAdapter
    public void setListener(ItemClickListener<ListedMatchModel> listener) {
        this.listener = listener;
    }

    @Override // org.betup.services.offer.banner.BannerController
    public void hideBanner() {
        int i = this.bannerIndex;
        if (i < 0 || i >= this.specificChampMatchModels.size()) {
            return;
        }
        this.handler.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SpecificChampionshipAdapter.this.m13943xf077b6a5();
            }
        });
    }

    /* renamed from: lambda$hideBanner$0$org-betup-ui-fragment-matches-adapter-SpecificChampionshipAdapter, reason: not valid java name */
    /* synthetic */ void m13943xf077b6a5() {
        int i = this.bannerIndex;
        if (i < 0 || i >= this.specificChampMatchModels.size()) {
            return;
        }
        this.specificChampMatchModels.remove(this.bannerIndex);
        notifyItemRemoved(this.bannerIndex);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (this.specificChampMatchModels.get(position).isPromo()) {
            return 2;
        }
        return SportsHelper.hasSpecificMatchItem(this.specificChampMatchModels.get(position).getMatch().getMatch().getSport().getId().intValue()) ? 3 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new ViewHolder(this.mInflater.inflate(R.layout.item_match_list, parent, false));
        }
        if (viewType == 3) {
            return new RacingViewHolder(this.mInflater.inflate(R.layout.item_match_racing, parent, false));
        }
        return new PromoHolder(this.mInflater.inflate(this.bannerProvider.getLayoutId(), parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        if (holder instanceof ViewHolder) {
            synchronized (this.activeViewHolders) {
                if (!this.activeViewHolders.contains((ViewHolder) holder)) {
                    this.activeViewHolders.add((ViewHolder) holder);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof ViewHolder) {
            synchronized (this.activeViewHolders) {
                this.activeViewHolders.remove((ViewHolder) holder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType != 1) {
            if (itemViewType == 3) {
                RacingViewHolder racingViewHolder = (RacingViewHolder) viewHolder;
                MatchDetailsDataModel match = this.specificChampMatchModels.get(position).getMatch().getMatch();
                racingViewHolder.arenaName.setText(match.getHomeTeam().getName());
                racingViewHolder.matchDate.setText(DateHelper.getDate(match.getDate()));
                racingViewHolder.matchTime.setText(DateHelper.getTime(match.getDate()));
                int iconResForMatch = SportsHelper.getIconResForMatch(match.getSport().getId().intValue());
                if (iconResForMatch != 0) {
                    racingViewHolder.sportIcon.setImageResource(iconResForMatch);
                    return;
                } else {
                    PicassoHelper.with(this.context).setImageView(racingViewHolder.sportIcon).setImageUrl(match.getSport().getPhotoUrl()).load();
                    return;
                }
            }
            BannerProvider bannerProvider = this.bannerProvider;
            if (bannerProvider != null) {
                bannerProvider.fillView(this, viewHolder.itemView);
                return;
            }
            return;
        }
        final ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        final MatchDetailsDataModel match2 = this.specificChampMatchModels.get(position).getMatch().getMatch();
        String str = null;
        Integer id = match2.getSport() != null ? match2.getSport().getId() : null;
        int val = match2.getState().getVal();
        boolean isScoreAvailable = MatchDisplayState.isScoreAvailable(val, match2.getDate(), id);
        boolean isLive = MatchDisplayState.isLive(val, match2.getDate(), id);
        if (isScoreAvailable) {
            if (match2.getScoreHome() != null) {
                viewHolder2.scoreHomeTv.setText(FormatHelper.getScoreFormatted(match2.getScoreHome().floatValue()));
                viewHolder2.scoreHomeTv.setTextColor(this.context.getResources().getColor(R.color.primary_text, this.context.getTheme()));
            } else {
                viewHolder2.scoreHomeTv.setText("-");
                viewHolder2.scoreHomeTv.setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            }
            if (match2.getScoreAway() != null) {
                viewHolder2.scoreAwayTv.setText(FormatHelper.getScoreFormatted(match2.getScoreAway().floatValue()));
                viewHolder2.scoreAwayTv.setTextColor(this.context.getResources().getColor(R.color.primary_text, this.context.getTheme()));
            } else {
                viewHolder2.scoreAwayTv.setText("-");
                viewHolder2.scoreAwayTv.setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            }
            if (isLive) {
                String normalizeMatchTime = UiExtensionsKt.normalizeMatchTime(match2.getCurrentTime());
                if (normalizeMatchTime == null || normalizeMatchTime.isEmpty()) {
                    viewHolder2.matchDate.setText("");
                } else {
                    viewHolder2.matchDate.setText(normalizeMatchTime);
                }
                String normalizeMatchTime2 = UiExtensionsKt.normalizeMatchTime(match2.getCurrentPeriod());
                if (normalizeMatchTime2 == null || normalizeMatchTime2.isEmpty()) {
                    viewHolder2.matchTime.setText("");
                } else {
                    viewHolder2.matchTime.setText(normalizeMatchTime2);
                }
            } else {
                viewHolder2.matchDate.setText("-");
                viewHolder2.matchTime.setText(this.context.getString(R.string.toto_finished));
            }
            if ((match2.getState() == MatchState.FINISHED || match2.getState() == MatchState.LIVE) && match2.getResultRow() != null && !match2.getResultRow().trim().isEmpty()) {
                str = MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(match2.getResultRow());
            }
            if (str != null && !str.isEmpty()) {
                viewHolder2.periodScoresTv.setVisibility(0);
                viewHolder2.periodScoresTv.setText("(" + str + ")");
            } else {
                viewHolder2.periodScoresTv.setVisibility(8);
            }
        } else {
            viewHolder2.scoreHomeTv.setText("-");
            viewHolder2.scoreHomeTv.setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            viewHolder2.scoreAwayTv.setText("-");
            viewHolder2.scoreAwayTv.setTextColor(this.context.getResources().getColor(R.color.secondary_text, this.context.getTheme()));
            viewHolder2.periodScoresTv.setVisibility(8);
            if (match2.getDate() == null) {
                viewHolder2.matchDate.setText("");
                viewHolder2.matchTime.setText("");
            } else {
                String formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(match2.getDate());
                String formattedTime = UiExtensionsKt.getFormattedTime(match2.getDate());
                viewHolder2.matchTime.setText(formattedDateWithoutYear);
                viewHolder2.matchDate.setText(formattedTime);
            }
        }
        MatchDetailsHomeTeamModel homeTeam = match2.getHomeTeam();
        MatchDetailsAwayTeamModel awayTeam = match2.getAwayTeam();
        PicassoHelper.with(this.context).setImageView(viewHolder2.firstTeamIcon).setImageUrl(homeTeam.getPhotoUrl()).load();
        NameFormatter.setTeamNameForList(viewHolder2.firstTeamName, homeTeam.getName());
        NameFormatter.setTeamNameForList(viewHolder2.secondTeamName, awayTeam.getName());
        PicassoHelper.with(this.context).setImageView(viewHolder2.secondTeamIcon).setImageUrl(awayTeam.getPhotoUrl()).load();
        ListedMatchModel match3 = this.specificChampMatchModels.get(position).getMatch();
        if (match3.getBetSections() != null && match3.getBetSections().size() > 0) {
            BetSectionModel betSectionModel = match3.getBetSections().get(0);
            BetGroupSectionModel groupByIdIfExists = betSectionModel.getGroupByIdIfExists(BetHelper.BetGroupType.WHO_WILL_WIN.getId());
            if (groupByIdIfExists == null && betSectionModel.getGroups() != null && betSectionModel.getGroups().size() > 0) {
                viewHolder2.setGroups(betSectionModel.getGroups());
            } else if (groupByIdIfExists != null) {
                viewHolder2.setGroups(betSectionModel.getGroups());
            } else {
                Log.d("HOMEBET", "BETS NULL - no groups found");
                viewHolder2.setGroups(new ArrayList());
            }
        } else {
            Log.d("HOMEBET", "BETS NULL - no bet sections");
            viewHolder2.setGroups(new ArrayList());
        }
        long j = position;
        if (j > this.lastPosition) {
            this.lastPosition = j;
            ObjectAnimator.ofFloat(viewHolder2.itemView, "alpha", 0.0f, 1.0f).setDuration(500L).start();
        }
        if (position != 0 || this.tourMatchId == null || this.onTourMatchItemBounds == null) {
            return;
        }
        viewHolder2.itemView.post(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter.8
            @Override // java.lang.Runnable
            public void run() {
                int[] iArr = new int[2];
                viewHolder2.itemView.getLocationOnScreen(iArr);
                int i = iArr[0];
                Rect rect = new Rect(i, iArr[1], viewHolder2.itemView.getWidth() + i, iArr[1] + viewHolder2.itemView.getHeight());
                SpecificChampionshipAdapter.this.onTourMatchItemBounds.accept(rect);
                if (SpecificChampionshipAdapter.this.onTourMatchItemId != null) {
                    SpecificChampionshipAdapter.this.onTourMatchItemId.accept(Long.valueOf(match2.getId().longValue()));
                }
                Log.d("SpecificChampionshipAdapter", "Reported bounds for first match item (tour): bounds=" + rect + ", matchId=" + match2.getId());
            }
        });
    }

    public OddType getOddType() {
        return this.oddType;
    }

    public void setOddType(OddType oddType) {
        this.oddType = oddType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.specificChampMatchModels.size();
    }

    private ArrayList<MatchHolder<ListedMatchModel>> toHolders(List<ListedMatchModel> items) {
        ArrayList<MatchHolder<ListedMatchModel>> arrayList = new ArrayList<>();
        Iterator<ListedMatchModel> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new MatchHolder<>(it.next(), false));
        }
        if (this.isPromoEnabled) {
            addPromoBanner(arrayList);
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.specificChampMatchModels.get(position).hashCode();
    }

    public class PromoHolder extends RecyclerView.ViewHolder {
        PromoHolder(View itemView) {
            super(itemView);
        }
    }

    class RacingViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.arenaName)
        TextView arenaName;

        @BindView(R.id.container)
        View container;

        @BindView(R.id.matchDate)
        TextView matchDate;

        @BindView(R.id.matchTime)
        TextView matchTime;

        @BindView(R.id.sportIcon)
        ImageView sportIcon;

        RacingViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick({R.id.container})
        void onMatchContainerClick() {
            View view = this.container;
            if (view != null) {
                view.animate().scaleX(0.98f).scaleY(0.98f).setDuration(40L).withEndAction(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter$RacingViewHolder$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecificChampionshipAdapter.RacingViewHolder.this.m13945xb9ef5ad9();
                    }
                }).start();
            }
            if (SpecificChampionshipAdapter.this.listener != null) {
                SpecificChampionshipAdapter.this.listener.itemClicked((ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(getAdapterPosition())).getMatch());
            }
        }

        /* renamed from: lambda$onMatchContainerClick$0$org-betup-ui-fragment-matches-adapter-SpecificChampionshipAdapter$RacingViewHolder, reason: not valid java name */
        /* synthetic */ void m13945xb9ef5ad9() {
            this.container.animate().scaleX(1.0f).scaleY(1.0f).setDuration(120L).start();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private BetLineAdapter adapter;

        @BindView(R.id.betsList)
        RecyclerView betsList;

        @BindView(R.id.container)
        View container;

        @BindView(R.id.likeIcon)
        ImageView firstTeamIcon;

        @BindView(R.id.firstTeamName)
        TextView firstTeamName;

        @BindView(R.id.matchDate)
        TextView matchDate;

        @BindView(R.id.matchTime)
        TextView matchTime;

        @BindView(R.id.period_scores_tv)
        TextView periodScoresTv;

        @BindView(R.id.score_away_tv)
        TextView scoreAwayTv;

        @BindView(R.id.score_home_tv)
        TextView scoreHomeTv;

        @BindView(R.id.secondTeamIcon)
        ImageView secondTeamIcon;

        @BindView(R.id.secondTeamName)
        TextView secondTeamName;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            this.betsList.setLayoutManager(new LinearLayoutManager(SpecificChampionshipAdapter.this.context, 1, false));
            this.betsList.setRecycledViewPool(SpecificChampionshipAdapter.this.betlineViewPool);
            RecyclerView recyclerView = this.betsList;
            BetLineAdapter betLineAdapter = SpecificChampionshipAdapter.this.new BetLineAdapter();
            this.adapter = betLineAdapter;
            recyclerView.setAdapter(betLineAdapter);
        }

        public void setGroups(List<BetGroupSectionModel> groups) {
            ListedMatchModel listedMatchModel = (ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(getAdapterPosition())).getMatch();
            if (groups != null && groups.size() > 0 && listedMatchModel.getBetSections() != null && listedMatchModel.getBetSections().size() > 0) {
                this.adapter.setGroups(listedMatchModel, listedMatchModel.getBetSections().get(0).getSection(), groups);
            } else {
                this.adapter.setGroups(listedMatchModel, null, new ArrayList());
            }
        }

        public void refreshBetStates() {
            BetLineAdapter betLineAdapter = this.adapter;
            if (betLineAdapter != null) {
                betLineAdapter.refreshBetStates();
            }
        }

        @OnClick({R.id.container})
        void onMatchContainerClick() {
            View view = this.container;
            if (view != null) {
                view.animate().scaleX(0.98f).scaleY(0.98f).setDuration(40L).withEndAction(new Runnable() { // from class: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter$ViewHolder$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpecificChampionshipAdapter.ViewHolder.this.m13946xdf66046b();
                    }
                }).start();
            }
            if (SpecificChampionshipAdapter.this.listener != null) {
                SpecificChampionshipAdapter.this.listener.itemClicked((ListedMatchModel) ((MatchHolder) SpecificChampionshipAdapter.this.specificChampMatchModels.get(getAdapterPosition())).getMatch());
            }
        }

        /* renamed from: lambda$onMatchContainerClick$0$org-betup-ui-fragment-matches-adapter-SpecificChampionshipAdapter$ViewHolder, reason: not valid java name */
        /* synthetic */ void m13946xdf66046b() {
            this.container.animate().scaleX(1.0f).scaleY(1.0f).setDuration(120L).start();
        }
    }

    class BetLineViewHolder extends RecyclerView.ViewHolder {
        private BetLineAdapter adapter;

        @BindView(R.id.first_bet)
        BetView firstTeam;
        private BetGroupSectionModel group;
        private ListedMatchModel match;

        @BindView(R.id.second_bet)
        BetView secondTeam;
        private SubMatchModel section;

        @BindView(R.id.third_bet)
        BetView thirdTeam;

        @BindView(R.id.title)
        TextView title;

        BetLineViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void setGroup(ListedMatchModel match, SubMatchModel section, BetGroupSectionModel group, BetLineAdapter adapter) {
            this.group = group;
            this.adapter = adapter;
            this.section = section;
            this.match = match;
            int min = Math.min(group.getGroup().getDisplayColumns(), group.getBets().size());
            if (min < 2) {
                this.secondTeam.setVisibility(8);
                this.thirdTeam.setVisibility(8);
                applyBetLayoutParams(this.firstTeam, true);
            } else if (min < 3) {
                this.secondTeam.setVisibility(0);
                this.thirdTeam.setVisibility(8);
                applyBetLayoutParams(this.firstTeam, false);
                applyBetLayoutParams(this.secondTeam, false);
            } else {
                this.secondTeam.setVisibility(0);
                this.thirdTeam.setVisibility(0);
                applyBetLayoutParams(this.firstTeam, false);
                applyBetLayoutParams(this.secondTeam, false);
                applyBetLayoutParams(this.thirdTeam, false);
            }
            this.title.setText(UiExtensionsKt.formatBetNumbersForJava(group.getGroup().getName()));
            boolean isAvailable = group.getGroup().isAvailable();
            initBet(this.firstTeam, group.getBetAtIndexIfHas(0), isAvailable);
            initBet(this.secondTeam, group.getBetAtIndexIfHas(1), isAvailable);
            initBet(this.thirdTeam, group.getBetAtIndexIfHas(2), isAvailable);
        }

        private void applyBetLayoutParams(BetView betView, boolean singleBet) {
            ViewGroup.LayoutParams layoutParams = betView.getLayoutParams();
            if (layoutParams instanceof FlexboxLayout.LayoutParams) {
                FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                if (singleBet) {
                    layoutParams2.width = -2;
                    layoutParams2.setFlexGrow(0.0f);
                } else {
                    layoutParams2.width = 0;
                    layoutParams2.setFlexGrow(1.0f);
                }
                betView.setLayoutParams(layoutParams2);
            }
        }

        private BetModel toBetModelForClick(MatchDetailsBetDataModel betOrNull) {
            if (betOrNull == null && !this.group.getGroup().isAvailable()) {
                betOrNull = new MatchDetailsBetDataModel();
                betOrNull.setGrabbedBetId(0L);
                betOrNull.setBetName("-");
                betOrNull.setGrabbedCoeficient(0.0d);
                betOrNull.setIsAvailable(false);
            }
            if (betOrNull == null) {
                return null;
            }
            betOrNull.setBetGroup(matchDetailsBetGroupFrom(this.group.getGroup()));
            betOrNull.setSubMatch(this.section);
            return new BetModel(betOrNull, this.match.getMatch(), this.section);
        }

        private MatchDetailsBetGroupModel matchDetailsBetGroupFrom(BetGroupModel g) {
            MatchDetailsBetGroupModel matchDetailsBetGroupModel = new MatchDetailsBetGroupModel();
            matchDetailsBetGroupModel.setId(Integer.valueOf(g.getId()));
            matchDetailsBetGroupModel.setName(g.getName());
            matchDetailsBetGroupModel.setAvailable(g.isAvailable());
            matchDetailsBetGroupModel.setDisplayColumns(g.getDisplayColumns());
            return matchDetailsBetGroupModel;
        }

        @OnClick({R.id.first_bet})
        void onFirstBetClick() {
            BetModel betModelForClick = toBetModelForClick(this.group.getBetAtIndexIfHas(0));
            if (betModelForClick == null) {
                return;
            }
            processClick(this.firstTeam, SpecificChampionshipAdapter.this.betClickListener.onMatchBetClick(betModelForClick), betModelForClick.getBet());
        }

        @OnClick({R.id.second_bet})
        void onSecondBetClick() {
            BetModel betModelForClick = toBetModelForClick(this.group.getBetAtIndexIfHas(1));
            if (betModelForClick == null) {
                return;
            }
            processClick(this.secondTeam, SpecificChampionshipAdapter.this.betClickListener.onMatchBetClick(betModelForClick), betModelForClick.getBet());
        }

        @OnClick({R.id.third_bet})
        void onThirdBetClick() {
            BetModel betModelForClick = toBetModelForClick(this.group.getBetAtIndexIfHas(2));
            if (betModelForClick == null) {
                return;
            }
            processClick(this.thirdTeam, SpecificChampionshipAdapter.this.betClickListener.onMatchBetClick(betModelForClick), betModelForClick.getBet());
        }

        private void processClick(BetView betView, BetMatchClickResult resultClick, MatchDetailsBetDataModel betData) {
            int i = AnonymousClass9.$SwitchMap$org$betup$services$betlist$BetMatchClickResult$State[resultClick.getState().ordinal()];
            if (i == 1) {
                if (this.group.getGroup().isAvailable() && betData != null && betData.getIsAvailable().booleanValue()) {
                    this.adapter.parentAdapter.setBetValidating(betData.getGrabbedBetId().longValue(), true);
                    betView.showLoadingIndicator(true);
                    return;
                }
                return;
            }
            if (i == 2) {
                if (betData != null) {
                    this.adapter.parentAdapter.setBetValidating(betData.getGrabbedBetId().longValue(), false);
                    betView.showLoadingIndicator(false);
                }
                initBet(betView, betData, this.group.getGroup().isAvailable());
                return;
            }
            if (i != 3) {
                return;
            }
            if (this.group.getGroup().isAvailable() && betData != null && betData.getIsAvailable().booleanValue()) {
                this.adapter.parentAdapter.setBetValidating(betData.getGrabbedBetId().longValue(), true);
                betView.showLoadingIndicator(true);
            }
            this.adapter.notifyDataSetChanged();
        }

        private double getDisplayCoefficient(MatchDetailsBetDataModel teamInfo) {
            if (teamInfo == null) {
                return 0.0d;
            }
            Long grabbedBetId = teamInfo.getGrabbedBetId();
            Double coefficientForBet = SpecificChampionshipAdapter.this.betListAppender.getCoefficientForBet(grabbedBetId != null ? grabbedBetId.longValue() : 0L);
            return coefficientForBet != null ? coefficientForBet.doubleValue() : teamInfo.getGrabbedCoeficient();
        }

        private void initBet(BetView betView, MatchDetailsBetDataModel teamInfo, boolean isGroupUserAvailable) {
            boolean z;
            if (!isGroupUserAvailable) {
                if (teamInfo != null) {
                    betView.setBetCoef(OddHelper.format(SpecificChampionshipAdapter.this.oddType, getDisplayCoefficient(teamInfo)));
                    betView.setBetName(UiExtensionsKt.formatBetNumbersForJava(teamInfo.getBetName()));
                } else {
                    betView.setBetCoef("-");
                    betView.setBetName("-");
                }
                betView.setBetState(BetSelectionState.BET_LOCKED);
                return;
            }
            long longValue = (teamInfo == null || teamInfo.getGrabbedBetId() == null) ? 0L : teamInfo.getGrabbedBetId().longValue();
            boolean isSelectedBetAlready = SpecificChampionshipAdapter.this.betListAppender.isSelectedBetAlready(longValue);
            if (isSelectedBetAlready) {
                z = SpecificChampionshipAdapter.this.betListAppender.isBetAvailableInSlip(longValue);
            } else {
                z = teamInfo != null && Boolean.TRUE.equals(teamInfo.getIsAvailable());
            }
            if (teamInfo != null && z) {
                betView.setBetCoef(OddHelper.format(SpecificChampionshipAdapter.this.oddType, getDisplayCoefficient(teamInfo)));
                betView.setBetName(UiExtensionsKt.formatBetNumbersForJava(teamInfo.getBetName()));
                betView.showLoadingIndicator(this.adapter.parentAdapter.isBetValidating(longValue));
                if (isSelectedBetAlready) {
                    betView.setBetState(BetSelectionState.BET_PUT);
                    return;
                } else {
                    betView.setBetState(BetSelectionState.BET_AVAILABLE);
                    return;
                }
            }
            betView.showLoadingIndicator(false);
            if (teamInfo != null) {
                betView.setBetCoef(OddHelper.format(SpecificChampionshipAdapter.this.oddType, getDisplayCoefficient(teamInfo)));
                betView.setBetName(UiExtensionsKt.formatBetNumbersForJava(teamInfo.getBetName()));
            } else {
                betView.setBetCoef("-");
                betView.setBetName("-");
            }
            betView.setBetState(BetSelectionState.BET_LOCKED);
        }
    }

    /* renamed from: org.betup.ui.fragment.matches.adapter.SpecificChampionshipAdapter$9, reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$services$betlist$BetMatchClickResult$State;

        static {
            int[] iArr = new int[BetMatchClickResult.State.values().length];
            $SwitchMap$org$betup$services$betlist$BetMatchClickResult$State = iArr;
            try {
                iArr[BetMatchClickResult.State.PUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$services$betlist$BetMatchClickResult$State[BetMatchClickResult.State.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$services$betlist$BetMatchClickResult$State[BetMatchClickResult.State.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class BetLineAdapter extends RecyclerView.Adapter<BetLineViewHolder> {
        private List<BetGroupSectionModel> groups = new ArrayList();
        private ListedMatchModel match;
        private final SpecificChampionshipAdapter parentAdapter;
        private SubMatchModel section;

        BetLineAdapter() {
            this.parentAdapter = SpecificChampionshipAdapter.this;
        }

        void setGroups(ListedMatchModel match, SubMatchModel section, List<BetGroupSectionModel> groups) {
            this.groups = groups;
            this.section = section;
            this.match = match;
            notifyDataSetChanged();
        }

        void refreshBetStates() {
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public BetLineViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SpecificChampionshipAdapter specificChampionshipAdapter = SpecificChampionshipAdapter.this;
            return specificChampionshipAdapter.new BetLineViewHolder(specificChampionshipAdapter.mInflater.inflate(R.layout.item_bets_line, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(BetLineViewHolder betLineViewHolder, int i) {
            betLineViewHolder.setGroup(this.match, this.section, this.groups.get(i), this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.groups.size();
        }
    }
}
