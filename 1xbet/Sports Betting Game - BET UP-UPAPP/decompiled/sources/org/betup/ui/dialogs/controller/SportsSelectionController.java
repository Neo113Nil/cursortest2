package org.betup.ui.dialogs.controller;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.events.BattleSportSelectedEvent;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.BasePagingController;
import org.betup.ui.fragment.matches.FavoriteSaver;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SportsSelectionController.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0002H\u0014J*\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u001eH\u0016J8\u0010 \u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00190\u001eH\u0016J5\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020?2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u0019092\u0006\u0010@\u001a\u00020A2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;¢\u0006\u0002\u0010BJ\u0010\u0010C\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u001fH\u0014J\u0010\u0010E\u001a\u00020\u00192\u0006\u0010D\u001a\u00020\u001fH\u0002J\u000e\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u00020+J\u0006\u0010H\u001a\u00020\u0019J\u000e\u0010I\u001a\u00020\u00192\u0006\u0010J\u001a\u00020%J\u000e\u0010K\u001a\u00020\u00192\u0006\u0010J\u001a\u00020%J\u0006\u0010L\u001a\u00020\u0019J\u000e\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020;J\b\u0010O\u001a\u00020\u0019H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001b0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001b0'¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u00108\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0004\n\u0002\u0010<¨\u0006P"}, d2 = {"Lorg/betup/ui/dialogs/controller/SportsSelectionController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "sportsInteractor", "Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;", "getSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;", "setSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "saveFavorites", "", "ids", "", "", "onResult", "Lkotlin/Function1;", "", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "_sportsQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "sportsQuery", "Lkotlinx/coroutines/flow/StateFlow;", "getSportsQuery", "()Lkotlinx/coroutines/flow/StateFlow;", "_sports", "Lorg/betup/model/remote/entity/sports/NewSport;", "sports", "getSports", "currentOffset", "getCurrentOffset", "()I", "currentFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "getCurrentFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "hasMoreData", "getHasMoreData", "()Z", "onDismiss", "Lkotlin/Function0;", "userId", "", "Ljava/lang/Long;", "bind", "activity", "Lorg/betup/ui/MainActivity;", "context", "Landroid/content/Context;", "(Lorg/betup/ui/MainActivity;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Ljava/lang/Long;)V", "loadPage", "append", "loadSportsPage", "selectSport", "sport", "dismiss", "updateSearchQuery", "query", "executeSearch", "clearSearch", "updateUserId", "newUserId", "loadNextPage", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportsSelectionController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;
    private final MutableStateFlow<List<NewSport>> _sports;
    private final MutableStateFlow<String> _sportsQuery;
    private final CoroutineScope controllerScope;
    private final FavouriteTypeK favouriteType;

    @Inject
    public MatchFilterState matchFilterState;
    private Function0<Unit> onDismiss;
    private final StateFlow<List<NewSport>> sports;

    @Inject
    public NewSportsInteractor sportsInteractor;
    private final StateFlow<String> sportsQuery;
    private Long userId;

    @Inject
    public SportsSelectionController() {
        super(0, 1, null);
        this.controllerScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        this.favouriteType = FavouriteTypeK.Sports.INSTANCE;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._sportsQuery = MutableStateFlow;
        this.sportsQuery = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<NewSport>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._sports = MutableStateFlow2;
        this.sports = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final NewSportsInteractor getSportsInteractor() {
        NewSportsInteractor newSportsInteractor = this.sportsInteractor;
        if (newSportsInteractor != null) {
            return newSportsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportsInteractor");
        return null;
    }

    public final void setSportsInteractor(NewSportsInteractor newSportsInteractor) {
        Intrinsics.checkNotNullParameter(newSportsInteractor, "<set-?>");
        this.sportsInteractor = newSportsInteractor;
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

    public final StateFlow<String> getSportsQuery() {
        return this.sportsQuery;
    }

    public final StateFlow<List<NewSport>> getSports() {
        return this.sports;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentOffset() {
        return getOffset();
    }

    private final NewMatchFilter getCurrentFilter() {
        return getMatchFilterState().getSelectedFilter().getValue();
    }

    private final boolean getHasMoreData() {
        return get_hasMore().getValue().booleanValue();
    }

    public static /* synthetic */ void bind$default(SportsSelectionController sportsSelectionController, MainActivity mainActivity, Function0 function0, Context context, Long l, int i, Object obj) {
        if ((i & 8) != 0) {
            l = null;
        }
        sportsSelectionController.bind(mainActivity, function0, context, l);
    }

    public final void bind(MainActivity activity, Function0<Unit> onDismiss, Context context, Long userId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDismiss = onDismiss;
        this.userId = userId;
        super.bind(context);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        if (!getIsActive()) {
            Log.d("SportsSelectionController", "Controller not active, skipping loadPage");
            return;
        }
        Log.d("SportsSelectionController", "loadPage called, append: " + append + ", offset: " + getCurrentOffset());
        loadSportsPage(append);
    }

    private final void loadSportsPage(boolean append) {
        Log.d("SportsSelectionController", "loadSportsPage called, append: " + append + ", offset: " + getCurrentOffset() + ", query: '" + ((Object) this._sportsQuery.getValue()) + "'");
        setLoadingStates(append);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getCurrentOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 50);
        bundle.putString("name", this._sportsQuery.getValue());
        bundle.putString("matchDateFilter", getCurrentFilter().getName());
        getSportsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.SportsSelectionController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SportsSelectionController.loadSportsPage$lambda$1(SportsSelectionController.this, fetchedResponseMessage);
            }
        }, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadSportsPage$lambda$1(SportsSelectionController sportsSelectionController, FetchedResponseMessage fetchedResponseMessage) {
        BuildersKt__Builders_commonKt.launch$default(sportsSelectionController.controllerScope, Dispatchers.getMain(), null, new SportsSelectionController$loadSportsPage$1$1(fetchedResponseMessage, sportsSelectionController, null), 2, null);
    }

    public final void selectSport(NewSport sport) {
        Intrinsics.checkNotNullParameter(sport, "sport");
        Log.d("SportsSelectionController", "Sport selected: " + sport.getName() + " (ID: " + sport.getId() + "), userId: " + this.userId);
        BattleSportSelectedEvent battleSportSelectedEvent = new BattleSportSelectedEvent(sport.getId(), this.userId);
        Log.d("SportsSelectionController", "Posting event: " + battleSportSelectedEvent);
        EventBus.getDefault().post(battleSportSelectedEvent);
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
        this._sportsQuery.setValue(query);
    }

    public final void executeSearch(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._sportsQuery.setValue(query);
        resetState();
        loadInitial();
    }

    public final void clearSearch() {
        this._sportsQuery.setValue("");
        resetState();
        loadInitial();
    }

    public final void updateUserId(long newUserId) {
        Log.d("SportsSelectionController", "Updating userId to: " + newUserId);
        this.userId = Long.valueOf(newUserId);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
        Log.d("SportsSelectionController", "loadNextPage called, current offset: " + getCurrentOffset() + ", hasMore: " + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
        if (!getHasMoreData() || isLoadingMore().getValue().booleanValue() || isLoading().getValue().booleanValue()) {
            Log.d("SportsSelectionController", "loadNextPage blocked: hasMore=" + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
            return;
        }
        if (!getIsActive()) {
            Log.d("SportsSelectionController", "loadNextPage blocked: not active");
            return;
        }
        setOffset(getOffset() + 50);
        Log.d("SportsSelectionController", "Offset incremented to: " + getOffset());
        loadPage(true);
    }
}
