package org.betup.ui.dialogs.controller;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Collection;
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
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewLeagueMatchesInteractor;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.model.remote.entity.matches.NewMatchesResponseModel;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.events.BattleMatchSelectedEvent;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.BasePagingController;
import org.betup.ui.fragment.matches.FavoriteSaver;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchSelectionController.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0002H\u0014J*\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J8\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00170\u001cH\u0016J=\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0017082\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u001a2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0002\u0010?J\u0010\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u001dH\u0014J\u0010\u0010B\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u001dH\u0002J\u000e\u0010C\u001a\u00020\u00172\u0006\u0010D\u001a\u00020#J\u0006\u0010E\u001a\u00020\u0017J\b\u0010F\u001a\u00020\u0017H\u0016J\u000e\u0010G\u001a\u00020\u00172\u0006\u0010H\u001a\u00020+J\u001f\u0010I\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u001a2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0002\u0010JR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u0013X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00190\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00190%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0012\u0010(\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0004\n\u0002\u0010)R\u0012\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0004\n\u0002\u0010,R\u0014\u0010-\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lorg/betup/ui/dialogs/controller/MatchSelectionController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "matchesInteractor", "Lorg/betup/model/remote/api/rest/matches/NewLeagueMatchesInteractor;", "getMatchesInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewLeagueMatchesInteractor;", "setMatchesInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewLeagueMatchesInteractor;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "saveFavorites", "", "ids", "", "", "onResult", "Lkotlin/Function1;", "", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "_matches", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/remote/entity/matches/NewMatchItemModel;", "matches", "Lkotlinx/coroutines/flow/StateFlow;", "getMatches", "()Lkotlinx/coroutines/flow/StateFlow;", "selectedLeagueId", "Ljava/lang/Integer;", "userId", "", "Ljava/lang/Long;", "currentOffset", "getCurrentOffset", "()I", "currentFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "getCurrentFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "hasMoreData", "getHasMoreData", "()Z", "onDismiss", "Lkotlin/Function0;", "bind", "activity", "Lorg/betup/ui/MainActivity;", "context", "Landroid/content/Context;", "leagueId", "(Lorg/betup/ui/MainActivity;Lkotlin/jvm/functions/Function0;Landroid/content/Context;ILjava/lang/Long;)V", "loadPage", "append", "loadMatchesPage", "selectMatch", "match", "dismiss", "loadNextPage", "updateUserId", "newUserId", "resetAndLoad", "(ILjava/lang/Long;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchSelectionController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;
    private final MutableStateFlow<List<NewMatchItemModel>> _matches;
    private final FavouriteTypeK favouriteType;

    @Inject
    public MatchFilterState matchFilterState;
    private final StateFlow<List<NewMatchItemModel>> matches;

    @Inject
    public NewLeagueMatchesInteractor matchesInteractor;
    private Function0<Unit> onDismiss;
    private Integer selectedLeagueId;
    private Long userId;

    @Inject
    public MatchSelectionController() {
        super(0, 1, null);
        this.favouriteType = FavouriteTypeK.Sports.INSTANCE;
        MutableStateFlow<List<NewMatchItemModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._matches = MutableStateFlow;
        this.matches = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final NewLeagueMatchesInteractor getMatchesInteractor() {
        NewLeagueMatchesInteractor newLeagueMatchesInteractor = this.matchesInteractor;
        if (newLeagueMatchesInteractor != null) {
            return newLeagueMatchesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("matchesInteractor");
        return null;
    }

    public final void setMatchesInteractor(NewLeagueMatchesInteractor newLeagueMatchesInteractor) {
        Intrinsics.checkNotNullParameter(newLeagueMatchesInteractor, "<set-?>");
        this.matchesInteractor = newLeagueMatchesInteractor;
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

    public final StateFlow<List<NewMatchItemModel>> getMatches() {
        return this.matches;
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

    public static /* synthetic */ void bind$default(MatchSelectionController matchSelectionController, MainActivity mainActivity, Function0 function0, Context context, int i, Long l, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            l = null;
        }
        matchSelectionController.bind(mainActivity, function0, context, i, l);
    }

    public final void bind(MainActivity activity, Function0<Unit> onDismiss, Context context, int leagueId, Long userId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDismiss = onDismiss;
        this.selectedLeagueId = Integer.valueOf(leagueId);
        this.userId = userId;
        super.bind(context);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        if (!getIsActive()) {
            Log.d("MatchSelectionController", "Controller not active, skipping loadPage");
            return;
        }
        Log.d("MatchSelectionController", "loadPage called, append: " + append + ", offset: " + getCurrentOffset() + ", leagueId: " + this.selectedLeagueId);
        loadMatchesPage(append);
    }

    private final void loadMatchesPage(boolean append) {
        TourComposeHelper tourComposeHelper;
        TourState tourState;
        Log.d("MatchSelectionController", "loadMatchesPage called, append: " + append + ", offset: " + getCurrentOffset() + ", leagueId: " + this.selectedLeagueId);
        setLoadingStates(append);
        Long l = null;
        try {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity != null && (tourComposeHelper = mainActivity.tourComposeHelper) != null && (tourState = tourComposeHelper.getTourState()) != null) {
                l = tourState.getTourMatchId();
            }
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getCurrentOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 50);
        bundle.putString("matchDateFilter", getCurrentFilter().getName());
        bundle.putBoolean("getExpandedBetsInfo", false);
        bundle.putString("type", "FUTURE");
        if (l != null) {
            bundle.putLong("tourMatchId", l.longValue());
        }
        getMatchesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.dialogs.controller.MatchSelectionController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchSelectionController.loadMatchesPage$lambda$2(MatchSelectionController.this, fetchedResponseMessage);
            }
        }, this.selectedLeagueId, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMatchesPage$lambda$2(MatchSelectionController matchSelectionController, FetchedResponseMessage fetchedResponseMessage) {
        List<NewMatchItemModel> emptyList;
        List<NewMatchItemModel> items;
        String name = fetchedResponseMessage.getStat().name();
        NewMatchesResponseModel newMatchesResponseModel = (NewMatchesResponseModel) fetchedResponseMessage.getModel();
        Log.d("MatchSelectionController", "Matches response: " + name + ", matches count: " + ((newMatchesResponseModel == null || (items = newMatchesResponseModel.getItems()) == null) ? 0 : items.size()));
        if (!Intrinsics.areEqual(fetchedResponseMessage.getStat().name(), "SUCCESS")) {
            Log.e("MatchSelectionController", "Failed to load matches: " + fetchedResponseMessage.getStat().name());
            matchSelectionController.handleError("Failed to load matches: " + fetchedResponseMessage.getStat().name());
            return;
        }
        NewMatchesResponseModel newMatchesResponseModel2 = (NewMatchesResponseModel) fetchedResponseMessage.getModel();
        if (newMatchesResponseModel2 == null || (emptyList = newMatchesResponseModel2.getItems()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        if (matchSelectionController.getCurrentOffset() == 0) {
            matchSelectionController._matches.setValue(emptyList);
            Log.d("MatchSelectionController", "Setting matches: " + emptyList.size() + " items (reset)");
        } else {
            MutableStateFlow<List<NewMatchItemModel>> mutableStateFlow = matchSelectionController._matches;
            mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) emptyList));
            Log.d("MatchSelectionController", "Appending matches: " + emptyList.size() + " items (offset=" + matchSelectionController.getCurrentOffset() + ")");
        }
        matchSelectionController.get_hasMore().setValue(Boolean.valueOf(emptyList.size() >= 50));
        Log.d("MatchSelectionController", "hasMore set to: " + matchSelectionController.get_hasMore().getValue());
        matchSelectionController.handleSuccess();
    }

    public final void selectMatch(NewMatchItemModel match) {
        Intrinsics.checkNotNullParameter(match, "match");
        Log.d("MatchSelectionController", "Match selected: " + match.getMatch().getHomeTeam().getName() + " vs " + match.getMatch().getAwayTeam().getName() + " (ID: " + match.getMatch().getId() + "), userId: " + this.userId);
        EventBus.getDefault().post(new BattleMatchSelectedEvent(match.getMatch().getId(), this.userId));
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

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
        Log.d("MatchSelectionController", "loadNextPage called, current offset: " + getCurrentOffset() + ", hasMore: " + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
        if (!getHasMoreData() || isLoadingMore().getValue().booleanValue() || isLoading().getValue().booleanValue()) {
            Log.d("MatchSelectionController", "loadNextPage blocked: hasMore=" + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
            return;
        }
        if (!getIsActive()) {
            Log.d("MatchSelectionController", "loadNextPage blocked: not active");
            return;
        }
        setOffset(getOffset() + 50);
        Log.d("MatchSelectionController", "Offset incremented to: " + getOffset());
        loadPage(true);
    }

    public final void updateUserId(long newUserId) {
        Log.d("MatchSelectionController", "Updating userId to: " + newUserId);
        this.userId = Long.valueOf(newUserId);
    }

    public static /* synthetic */ void resetAndLoad$default(MatchSelectionController matchSelectionController, int i, Long l, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        matchSelectionController.resetAndLoad(i, l);
    }

    public final void resetAndLoad(int leagueId, Long userId) {
        Log.d("MatchSelectionController", "Resetting and loading for leagueId: " + leagueId + ", userId: " + userId);
        this.selectedLeagueId = Integer.valueOf(leagueId);
        this.userId = userId;
        this._matches.setValue(CollectionsKt.emptyList());
        resetState();
        loadPage(false);
    }
}
