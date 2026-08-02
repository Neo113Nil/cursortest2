package org.betup.ui.fragment.matches;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.ResponseBody;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteTeamsInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewTeamsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsInteractor;
import org.betup.model.remote.entity.sports.NewMatchCount;
import org.betup.model.remote.entity.teams.NewTeam;
import org.betup.model.remote.entity.teams.NewTeamItem;
import org.betup.model.remote.entity.teams.NewTeamsResponse;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TeamsController.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00103\u001a\u00020\u0002H\u0014J\u001d\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010=J\b\u0010>\u001a\u000209H\u0016J\u0010\u0010?\u001a\u0002092\u0006\u0010@\u001a\u000200H\u0014J\b\u0010D\u001a\u000209H\u0016J\b\u0010E\u001a\u000209H\u0016J*\u0010F\u001a\u0002092\f\u0010G\u001a\b\u0012\u0004\u0012\u00020$0H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002090JH\u0016J8\u0010K\u001a\u0002092\f\u0010L\u001a\b\u0012\u0004\u0012\u00020$0H2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020$0H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002090JH\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u000205X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020$0BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lorg/betup/ui/fragment/matches/TeamsController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "teamsInteractor", "Lorg/betup/model/remote/api/rest/matches/NewTeamsInteractor;", "getTeamsInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewTeamsInteractor;", "setTeamsInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewTeamsInteractor;)V", "putFavoriteTeamsBulkInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsBulkInteractor;", "getPutFavoriteTeamsBulkInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsBulkInteractor;", "setPutFavoriteTeamsBulkInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsBulkInteractor;)V", "putFavoriteTeamsInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsInteractor;", "getPutFavoriteTeamsInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsInteractor;", "setPutFavoriteTeamsInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsInteractor;)V", "deleteFavoriteTeamsInteractor", "Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteTeamsInteractor;", "getDeleteFavoriteTeamsInteractor", "()Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteTeamsInteractor;", "setDeleteFavoriteTeamsInteractor", "(Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteTeamsInteractor;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "currentOffset", "", "getCurrentOffset", "()I", "currentQuery", "", "getCurrentQuery", "()Ljava/lang/String;", "currentFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "getCurrentFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "hasMoreData", "", "getHasMoreData", "()Z", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "bind", "", "context", "Landroid/content/Context;", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "(Landroid/content/Context;Ljava/lang/Integer;)V", "unbind", "loadPage", "append", "teamsCallback", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/teams/NewTeamsResponse;", "loadInitial", "loadNextPage", "saveFavorites", "ids", "", "onResult", "Lkotlin/Function1;", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TeamsController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;

    @Inject
    public DeleteFavoriteTeamsInteractor deleteFavoriteTeamsInteractor;
    private final FavouriteTypeK favouriteType;

    @Inject
    public MatchFilterState matchFilterState;

    @Inject
    public PutFavoriteTeamsBulkInteractor putFavoriteTeamsBulkInteractor;

    @Inject
    public PutFavoriteTeamsInteractor putFavoriteTeamsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewTeamsResponse, Integer> teamsCallback;

    @Inject
    public NewTeamsInteractor teamsInteractor;

    /* compiled from: TeamsController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FetchStat.values().length];
            try {
                iArr[FetchStat.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchStat.NO_CONNECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TeamsController() {
        super(0, 1, null);
        this.favouriteType = FavouriteTypeK.Teams.INSTANCE;
        this.teamsCallback = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.TeamsController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                TeamsController.teamsCallback$lambda$5(TeamsController.this, fetchedResponseMessage);
            }
        };
    }

    public final NewTeamsInteractor getTeamsInteractor() {
        NewTeamsInteractor newTeamsInteractor = this.teamsInteractor;
        if (newTeamsInteractor != null) {
            return newTeamsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("teamsInteractor");
        return null;
    }

    public final void setTeamsInteractor(NewTeamsInteractor newTeamsInteractor) {
        Intrinsics.checkNotNullParameter(newTeamsInteractor, "<set-?>");
        this.teamsInteractor = newTeamsInteractor;
    }

    public final PutFavoriteTeamsBulkInteractor getPutFavoriteTeamsBulkInteractor() {
        PutFavoriteTeamsBulkInteractor putFavoriteTeamsBulkInteractor = this.putFavoriteTeamsBulkInteractor;
        if (putFavoriteTeamsBulkInteractor != null) {
            return putFavoriteTeamsBulkInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("putFavoriteTeamsBulkInteractor");
        return null;
    }

    public final void setPutFavoriteTeamsBulkInteractor(PutFavoriteTeamsBulkInteractor putFavoriteTeamsBulkInteractor) {
        Intrinsics.checkNotNullParameter(putFavoriteTeamsBulkInteractor, "<set-?>");
        this.putFavoriteTeamsBulkInteractor = putFavoriteTeamsBulkInteractor;
    }

    public final PutFavoriteTeamsInteractor getPutFavoriteTeamsInteractor() {
        PutFavoriteTeamsInteractor putFavoriteTeamsInteractor = this.putFavoriteTeamsInteractor;
        if (putFavoriteTeamsInteractor != null) {
            return putFavoriteTeamsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("putFavoriteTeamsInteractor");
        return null;
    }

    public final void setPutFavoriteTeamsInteractor(PutFavoriteTeamsInteractor putFavoriteTeamsInteractor) {
        Intrinsics.checkNotNullParameter(putFavoriteTeamsInteractor, "<set-?>");
        this.putFavoriteTeamsInteractor = putFavoriteTeamsInteractor;
    }

    public final DeleteFavoriteTeamsInteractor getDeleteFavoriteTeamsInteractor() {
        DeleteFavoriteTeamsInteractor deleteFavoriteTeamsInteractor = this.deleteFavoriteTeamsInteractor;
        if (deleteFavoriteTeamsInteractor != null) {
            return deleteFavoriteTeamsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteFavoriteTeamsInteractor");
        return null;
    }

    public final void setDeleteFavoriteTeamsInteractor(DeleteFavoriteTeamsInteractor deleteFavoriteTeamsInteractor) {
        Intrinsics.checkNotNullParameter(deleteFavoriteTeamsInteractor, "<set-?>");
        this.deleteFavoriteTeamsInteractor = deleteFavoriteTeamsInteractor;
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

    private final int getCurrentOffset() {
        return getOffset();
    }

    private final String getCurrentQuery() {
        return get_query().getValue();
    }

    private final NewMatchFilter getCurrentFilter() {
        return getMatchFilterState().getSelectedFilter().getValue();
    }

    private final boolean getHasMoreData() {
        return get_hasMore().getValue().booleanValue();
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavoriteSaver getFavoriteSaver() {
        return this;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected FavouriteTypeK getFavouriteType() {
        return this.favouriteType;
    }

    public final void bind(Context context, Integer sportId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.d("TeamsController", "Binding with sportId: " + sportId + ", current offset: " + getOffset() + ", isActive: " + getIsActive() + ", isInitialLoadDone: " + getIsInitialLoadDone());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        boolean areEqual = Intrinsics.areEqual(getSportId(), sportId);
        setSportId(sportId);
        if (!getIsActive() || !Intrinsics.areEqual(getContext(), context) || !areEqual) {
            if (!areEqual) {
                Log.d("TeamsController", "SportId changed from " + getSportId() + " to " + sportId + ", resetting state");
                resetState();
                setInitialLoadDone(false);
                Log.d("TeamsController", "State reset complete, offset is now: " + getOffset() + ", isInitialLoadDone: " + getIsInitialLoadDone());
            }
            Log.d("TeamsController", "Calling super.bind() with context: " + context);
            super.bind(context);
            return;
        }
        Log.d("TeamsController", "Already bound to same context and sportId, skipping");
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void unbind() {
        Log.d("TeamsController", "Unbinding controller, current offset: " + getOffset());
        super.unbind();
        setSportId(null);
        resetSport();
        resetSearchState();
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        if (!getIsActive()) {
            Log.d("TeamsController", "Controller not active, skipping loadPage");
            return;
        }
        if (getSportId() == null) {
            Log.d("TeamsController", "sportId is null, skipping loadPage");
            return;
        }
        Log.d("TeamsController", "loadPage called, append: " + append + ", current offset: " + getCurrentOffset() + ", sportId: " + getSportId() + ", isActive: " + getIsActive());
        setLoadingStates(append);
        NewTeamsInteractor teamsInteractor = getTeamsInteractor();
        BaseCachedSharedInteractor.OnFetchedListener<NewTeamsResponse, Integer> onFetchedListener = this.teamsCallback;
        Integer sportId = getSportId();
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getCurrentOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        bundle.putString("searchTerm", getCurrentQuery());
        bundle.putString("matchDateFilter", getCurrentFilter().getName());
        Unit unit = Unit.INSTANCE;
        teamsInteractor.load(onFetchedListener, sportId, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void teamsCallback$lambda$5(TeamsController teamsController, FetchedResponseMessage fetchedResponseMessage) {
        String photoUrl;
        String name;
        List<NewTeamItem> items;
        Log.d("TeamsController", "onFetched callback executed! Stat: " + fetchedResponseMessage.getStat() + ", hasData: " + (fetchedResponseMessage.getModel() != null));
        if (!teamsController.getIsActive()) {
            Log.d("TeamsController", "Controller not active, ignoring callback");
            return;
        }
        FetchStat stat = fetchedResponseMessage.getStat();
        int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Log.d("TeamsController", "ERROR callback: " + fetchedResponseMessage.getStat());
                teamsController.handleError("Failed to load teams");
                return;
            } else {
                Log.d("TeamsController", "NO_CONNECTION callback");
                teamsController.handleError("No internet connection");
                return;
            }
        }
        NewTeamsResponse newTeamsResponse = (NewTeamsResponse) fetchedResponseMessage.getModel();
        Log.d("TeamsController", "SUCCESS callback - teams count: " + ((newTeamsResponse == null || (items = newTeamsResponse.getItems()) == null) ? 0 : items.size()));
        NewTeamsResponse newTeamsResponse2 = (NewTeamsResponse) fetchedResponseMessage.getModel();
        if (newTeamsResponse2 == null) {
            Log.d("TeamsController", "Response model is null");
            teamsController.handleError("No data received");
            return;
        }
        List<NewTeamItem> items2 = newTeamsResponse2.getItems();
        Log.d("TeamsController", "Processing " + items2.size() + " teams");
        List<NewTeamItem> list = items2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (NewTeamItem newTeamItem : list) {
            NewTeam team = newTeamItem.getTeam();
            int id = team != null ? team.getId() : 0;
            NewTeam team2 = newTeamItem.getTeam();
            String str = (team2 == null || (name = team2.getName()) == null) ? "" : name;
            NewTeam team3 = newTeamItem.getTeam();
            String str2 = (team3 == null || (photoUrl = team3.getPhotoUrl()) == null) ? "" : photoUrl;
            NewMatchCount matchCount = newTeamItem.getMatchCount();
            int all = matchCount != null ? matchCount.getAll() - newTeamItem.getMatchCount().getLive() : 0;
            NewMatchCount matchCount2 = newTeamItem.getMatchCount();
            arrayList.add(new SportListItemUiModel(id, str, str2, all, matchCount2 != null ? matchCount2.getLive() : 0, newTeamItem.isFavorite(), new Function0() { // from class: org.betup.ui.fragment.matches.TeamsController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }));
        }
        ArrayList arrayList2 = arrayList;
        if (teamsController.getCurrentOffset() == 0) {
            Log.d("TeamsController", "Setting teams: " + arrayList2.size() + " items (reset)");
            teamsController.get_items().setValue(arrayList2);
        } else {
            Log.d("TeamsController", "Appending teams: " + arrayList2.size() + " items (offset=" + teamsController.getCurrentOffset() + ")");
            MutableStateFlow<List<SportListItemUiModel>> mutableStateFlow = teamsController.get_items();
            mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
        }
        teamsController.get_hasMore().setValue(Boolean.valueOf(items2.size() >= 10));
        Log.d("TeamsController", "hasMore set to: " + teamsController.get_hasMore().getValue());
        teamsController.handleSuccess();
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadInitial() {
        Log.d("TeamsController", "loadInitial called, current offset: " + getCurrentOffset());
        resetState();
        loadPage(false);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
        Log.d("TeamsController", "loadNextPage called, current offset: " + getCurrentOffset() + ", hasMore: " + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
        if (!getHasMoreData() || isLoadingMore().getValue().booleanValue() || isLoading().getValue().booleanValue()) {
            Log.d("TeamsController", "loadNextPage blocked: hasMore=" + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
            return;
        }
        if (!getIsActive()) {
            Log.d("TeamsController", "loadNextPage blocked: not active");
            return;
        }
        setOffset(getOffset() + 10);
        Log.d("TeamsController", "Offset incremented to: " + getOffset());
        loadPage(true);
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        getPutFavoriteTeamsBulkInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, List<? extends Integer>>() { // from class: org.betup.ui.fragment.matches.TeamsController$saveFavorites$1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public void onFetched(FetchedResponseMessage<ResponseBody, List<? extends Integer>> response) {
                Intrinsics.checkNotNullParameter(response, "response");
                onResult.invoke(Boolean.valueOf(response.getStat() == FetchStat.SUCCESS));
            }
        }, ids, null);
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavoritesWithDeleteAndPut(List<Integer> initialIds, List<Integer> newIds, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(initialIds, "initialIds");
        Intrinsics.checkNotNullParameter(newIds, "newIds");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Log.d("TeamsController", "Starting PUT approach for teams (replace)");
        Log.d("TeamsController", "Replacing favorites with: " + newIds);
        getPutFavoriteTeamsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.TeamsController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                TeamsController.saveFavoritesWithDeleteAndPut$lambda$6(Function1.this, fetchedResponseMessage);
            }
        }, newIds, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveFavoritesWithDeleteAndPut$lambda$6(Function1 function1, FetchedResponseMessage fetchedResponseMessage) {
        boolean z = fetchedResponseMessage.getStat() == FetchStat.SUCCESS;
        Log.d("TeamsController", "PUT result: " + z);
        function1.invoke(Boolean.valueOf(z));
    }
}
