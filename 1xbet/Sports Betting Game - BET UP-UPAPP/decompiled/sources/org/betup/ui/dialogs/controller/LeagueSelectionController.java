package org.betup.ui.dialogs.controller;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.leagues.NewLeagueItem;
import org.betup.model.remote.entity.leagues.NewLeaguesResponse;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.events.BattleLeagueSelectedEvent;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.BasePagingController;
import org.betup.ui.fragment.matches.FavoriteSaver;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: LeagueSelectionController.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0002H\u0014J*\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J8\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001cH\u0016JG\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020@2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00170=2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001a2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00101\u001a\u00020\u001d¢\u0006\u0002\u0010DJ\u0010\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u00020\u001dH\u0014J\u0010\u0010G\u001a\u00020\u00172\u0006\u0010F\u001a\u00020\u001dH\u0002J\u000e\u0010H\u001a\u00020\u00172\u0006\u0010I\u001a\u00020)J\u0006\u0010J\u001a\u00020\u0017J\u000e\u0010K\u001a\u00020\u00172\u0006\u0010L\u001a\u00020#J\u000e\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020#J\u0006\u0010N\u001a\u00020\u0017J\u000e\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020/J\u000e\u0010Q\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u001dJ)\u0010R\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u001a2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00101\u001a\u00020\u001d¢\u0006\u0002\u0010SJ\b\u0010T\u001a\u00020\u0017H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00190%¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0012\u0010,\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0004\n\u0002\u0010-R\u0012\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0004\n\u0002\u00100R\u000e\u00101\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lorg/betup/ui/dialogs/controller/LeagueSelectionController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "leaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;", "getLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;", "setLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "saveFavorites", "", "ids", "", "", "onResult", "Lkotlin/Function1;", "", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "_leaguesQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "leaguesQuery", "Lkotlinx/coroutines/flow/StateFlow;", "getLeaguesQuery", "()Lkotlinx/coroutines/flow/StateFlow;", "_leagues", "Lorg/betup/model/remote/entity/leagues/NewLeague;", "leagues", "getLeagues", "selectedSportId", "Ljava/lang/Integer;", "userId", "", "Ljava/lang/Long;", "forChallenges", "currentOffset", "getCurrentOffset", "()I", "currentFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "getCurrentFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "hasMoreData", "getHasMoreData", "()Z", "onDismiss", "Lkotlin/Function0;", "bind", "activity", "Lorg/betup/ui/MainActivity;", "context", "Landroid/content/Context;", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "(Lorg/betup/ui/MainActivity;Lkotlin/jvm/functions/Function0;Landroid/content/Context;ILjava/lang/Long;Z)V", "loadPage", "append", "loadLeaguesPage", "selectLeague", "league", "dismiss", "updateSearchQuery", "query", "executeSearch", "clearSearch", "updateUserId", "newUserId", "setForChallenges", "resetAndLoad", "(ILjava/lang/Long;Z)V", "loadNextPage", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LeagueSelectionController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;
    private final MutableStateFlow<List<NewLeague>> _leagues;
    private final MutableStateFlow<String> _leaguesQuery;
    private final FavouriteTypeK favouriteType;
    private boolean forChallenges;
    private final StateFlow<List<NewLeague>> leagues;

    @Inject
    public NewLeaguesInteractor leaguesInteractor;
    private final StateFlow<String> leaguesQuery;

    @Inject
    public MatchFilterState matchFilterState;
    private Function0<Unit> onDismiss;
    private Integer selectedSportId;
    private Long userId;

    @Inject
    public LeagueSelectionController() {
        super(0, 1, null);
        this.favouriteType = FavouriteTypeK.Sports.INSTANCE;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._leaguesQuery = MutableStateFlow;
        this.leaguesQuery = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<NewLeague>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._leagues = MutableStateFlow2;
        this.leagues = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final NewLeaguesInteractor getLeaguesInteractor() {
        NewLeaguesInteractor newLeaguesInteractor = this.leaguesInteractor;
        if (newLeaguesInteractor != null) {
            return newLeaguesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leaguesInteractor");
        return null;
    }

    public final void setLeaguesInteractor(NewLeaguesInteractor newLeaguesInteractor) {
        Intrinsics.checkNotNullParameter(newLeaguesInteractor, "<set-?>");
        this.leaguesInteractor = newLeaguesInteractor;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public MatchFilterState getMatchFilterState() {
        MatchFilterState matchFilterState = this.matchFilterState;
        if (matchFilterState != null) {
            return matchFilterState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchFilterState");
        return null;
    }

    public void setMatchFilterState(MatchFilterState matchFilterState) {
        Intrinsics.checkNotNullParameter(matchFilterState, "<set-?>");
        this.matchFilterState = matchFilterState;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavoriteSaver getFavoriteSaver() {
        return this;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavouriteTypeK getFavouriteType() {
        return this.favouriteType;
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(false);
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavoritesWithDeleteAndPut(List<Integer> initialIds, List<Integer> newIds, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(initialIds, "initialIds");
        Intrinsics.checkNotNullParameter(newIds, "newIds");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        onResult.invoke(false);
    }

    public final StateFlow<String> getLeaguesQuery() {
        return this.leaguesQuery;
    }

    public final StateFlow<List<NewLeague>> getLeagues() {
        return this.leagues;
    }

    private final int getCurrentOffset() {
        return getOffset();
    }

    private final NewMatchFilter getCurrentFilter() {
        return getMatchFilterState().getSelectedFilter().getValue();
    }

    private final boolean getHasMoreData() {
        return get_hasMore().getValue().booleanValue();
    }

    public static /* synthetic */ void bind$default(LeagueSelectionController leagueSelectionController, MainActivity mainActivity, Function0 function0, Context context, int i, Long l, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            l = null;
        }
        Long l2 = l;
        if ((i2 & 32) != 0) {
            z = false;
        }
        leagueSelectionController.bind(mainActivity, function0, context, i, l2, z);
    }

    public final void bind(MainActivity activity, Function0<Unit> onDismiss, Context context, int sportId, Long userId, boolean forChallenges) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDismiss = onDismiss;
        this.selectedSportId = Integer.valueOf(sportId);
        this.userId = userId;
        this.forChallenges = forChallenges;
        super.bind(context);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        if (!getIsActive()) {
            Log.d("LeagueSelectionController", "Controller not active, skipping loadPage");
            return;
        }
        Log.d("LeagueSelectionController", "loadPage called, append: " + append + ", offset: " + getCurrentOffset() + ", sportId: " + this.selectedSportId);
        loadLeaguesPage(append);
    }

    private final void loadLeaguesPage(boolean append) {
        Log.d("LeagueSelectionController", "loadLeaguesPage called, append: " + append + ", offset: " + getCurrentOffset() + ", query: '" + ((Object) this._leaguesQuery.getValue()) + "', sportId: " + this.selectedSportId);
        setLoadingStates(append);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getCurrentOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 50);
        bundle.putString("searchTerm", this._leaguesQuery.getValue());
        bundle.putString("matchDateFilter", getCurrentFilter().getName());
        bundle.putBoolean("forChallenges", this.forChallenges);
        getLeaguesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.LeagueSelectionController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                LeagueSelectionController.loadLeaguesPage$lambda$2(LeagueSelectionController.this, fetchedResponseMessage);
            }
        }, this.selectedSportId, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void loadLeaguesPage$lambda$2(LeagueSelectionController leagueSelectionController, FetchedResponseMessage fetchedResponseMessage) {
        List<NewLeague> emptyList;
        List<NewLeagueItem> items;
        List<NewLeagueItem> items2;
        String name = fetchedResponseMessage.getStat().name();
        NewLeaguesResponse newLeaguesResponse = (NewLeaguesResponse) fetchedResponseMessage.getModel();
        Log.d("LeagueSelectionController", "Leagues response: " + name + ", leagues count: " + ((newLeaguesResponse == null || (items2 = newLeaguesResponse.getItems()) == null) ? 0 : items2.size()));
        if (!Intrinsics.areEqual(fetchedResponseMessage.getStat().name(), "SUCCESS")) {
            Log.e("LeagueSelectionController", "Failed to load leagues: " + fetchedResponseMessage.getStat().name());
            leagueSelectionController.handleError("Failed to load leagues: " + fetchedResponseMessage.getStat().name());
            return;
        }
        NewLeaguesResponse newLeaguesResponse2 = (NewLeaguesResponse) fetchedResponseMessage.getModel();
        if (newLeaguesResponse2 != null && (items = newLeaguesResponse2.getItems()) != null) {
            List<NewLeagueItem> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NewLeagueItem) it.next()).getLeague());
            }
            emptyList = CollectionsKt.filterNotNull(arrayList);
        }
        emptyList = CollectionsKt.emptyList();
        if (leagueSelectionController.getCurrentOffset() == 0) {
            leagueSelectionController._leagues.setValue(emptyList);
            Log.d("LeagueSelectionController", "Setting leagues: " + emptyList.size() + " items (reset)");
        } else {
            MutableStateFlow<List<NewLeague>> mutableStateFlow = leagueSelectionController._leagues;
            mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) emptyList));
            Log.d("LeagueSelectionController", "Appending leagues: " + emptyList.size() + " items (offset=" + leagueSelectionController.getCurrentOffset() + ")");
        }
        leagueSelectionController.get_hasMore().setValue(Boolean.valueOf(emptyList.size() >= 50));
        Log.d("LeagueSelectionController", "hasMore set to: " + leagueSelectionController.get_hasMore().getValue());
        leagueSelectionController.handleSuccess();
    }

    public final void selectLeague(NewLeague league) {
        Intrinsics.checkNotNullParameter(league, "league");
        Log.d("LeagueSelectionController", "League selected: " + league.getName() + " (ID: " + league.getId() + "), userId: " + this.userId);
        EventBus.getDefault().post(new BattleLeagueSelectedEvent(league.getId(), this.userId));
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void dismiss() {
        Function0<Unit> function0 = this.onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void updateSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._leaguesQuery.setValue(query);
    }

    public final void executeSearch(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._leaguesQuery.setValue(query);
        resetState();
        loadInitial();
    }

    public final void clearSearch() {
        this._leaguesQuery.setValue("");
        resetState();
        loadInitial();
    }

    public final void updateUserId(long newUserId) {
        Log.d("LeagueSelectionController", "Updating userId to: " + newUserId);
        this.userId = Long.valueOf(newUserId);
    }

    public final void setForChallenges(boolean forChallenges) {
        Log.d("LeagueSelectionController", "Setting forChallenges to: " + forChallenges);
        this.forChallenges = forChallenges;
    }

    public static /* synthetic */ void resetAndLoad$default(LeagueSelectionController leagueSelectionController, int i, Long l, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        leagueSelectionController.resetAndLoad(i, l, z);
    }

    public final void resetAndLoad(int sportId, Long userId, boolean forChallenges) {
        Log.d("LeagueSelectionController", "Resetting and loading for sportId: " + sportId + ", userId: " + userId + ", forChallenges: " + forChallenges);
        this.selectedSportId = Integer.valueOf(sportId);
        this.userId = userId;
        this.forChallenges = forChallenges;
        this._leagues.setValue(CollectionsKt.emptyList());
        this._leaguesQuery.setValue("");
        resetState();
        loadPage(false);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
        Log.d("LeagueSelectionController", "loadNextPage called, current offset: " + getCurrentOffset() + ", hasMore: " + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
        if (!getHasMoreData() || isLoadingMore().getValue().booleanValue() || isLoading().getValue().booleanValue()) {
            Log.d("LeagueSelectionController", "loadNextPage blocked: hasMore=" + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
            return;
        }
        if (!getIsActive()) {
            Log.d("LeagueSelectionController", "loadNextPage blocked: not active");
            return;
        }
        setOffset(getOffset() + 50);
        Log.d("LeagueSelectionController", "Offset incremented to: " + getOffset());
        loadPage(true);
    }
}
