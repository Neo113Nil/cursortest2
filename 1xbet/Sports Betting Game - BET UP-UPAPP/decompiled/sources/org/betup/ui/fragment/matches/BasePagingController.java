package org.betup.ui.fragment.matches;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.FavoritesUpdatedMessage;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.services.user.UserService;
import org.betup.services.user.UserServiceAccessor;
import org.betup.ui.dialogs.SignInDialogFragment;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.betup.utils.SignInDialogManager;
import org.betup.utils.SnackbarHelper;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BasePagingController.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\b'\u0018\u0000 y2\u00020\u0001:\u0001yB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0003J\u0006\u0010N\u001a\u00020LJ$\u0010O\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00032\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020L0QH\u0004J$\u0010R\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00032\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020L0QH\u0004J\b\u0010S\u001a\u00020\u0003H\u0002J\u001a\u0010T\u001a\u00020L2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020L0QJ\b\u0010U\u001a\u00020VH$J\b\u0010W\u001a\u00020LH\u0002J\b\u0010X\u001a\u00020LH\u0004J\u000e\u0010Y\u001a\u00020!2\u0006\u0010M\u001a\u00020\u0003J\u0006\u0010Z\u001a\u00020\u0003J\u0006\u0010[\u001a\u00020!J\u0006\u0010\\\u001a\u00020LJ\u0010\u0010]\u001a\u00020L2\u0006\u00109\u001a\u00020:H\u0016J\u000e\u0010^\u001a\u00020L2\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010_\u001a\u00020L2\u0006\u0010`\u001a\u00020\u0007J\b\u0010a\u001a\u00020LH\u0016J\b\u0010b\u001a\u00020LH\u0016J\u0006\u0010c\u001a\u00020LJ\u0006\u0010d\u001a\u00020!J\u000e\u0010e\u001a\u00020L2\u0006\u0010\u001e\u001a\u00020\u001cJ\u000e\u0010f\u001a\u00020L2\u0006\u0010g\u001a\u00020hJ\u0006\u0010i\u001a\u00020LJ\b\u0010j\u001a\u00020LH\u0016J\b\u0010k\u001a\u00020LH\u0004J\u0012\u0010l\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020!H$J\u0010\u0010n\u001a\u00020L2\u0006\u0010m\u001a\u00020!H\u0004J\b\u0010o\u001a\u00020LH\u0016J\u0006\u0010p\u001a\u00020LJ\u0010\u0010q\u001a\u00020L2\u0006\u0010r\u001a\u00020\u001cH\u0004J\b\u0010s\u001a\u00020LH\u0004J\b\u0010t\u001a\u00020LH\u0004J\u001a\u0010u\u001a\u00020!2\u0006\u0010v\u001a\u00020w2\b\b\u0002\u0010x\u001a\u00020\u0003H\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00140\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u0018¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020!0\u0018¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020!0\u0018¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0016\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020!0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020!0\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001aR\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001aR\u001a\u00105\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0005R\u001a\u0010C\u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00106\"\u0004\bD\u00108R\u001e\u0010E\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010J\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006z"}, d2 = {"Lorg/betup/ui/fragment/matches/BasePagingController;", "", "pageSize", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "defaultSport", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "getDefaultSport", "()Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "_items", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "get_items", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "items", "Lkotlinx/coroutines/flow/StateFlow;", "getItems", "()Lkotlinx/coroutines/flow/StateFlow;", "_query", "", "get_query", "query", "getQuery", "_hasMore", "", "get_hasMore", "hasMore", "getHasMore", "_isLoading", "isLoading", "_isLoadingMore", "isLoadingMore", "_error", "error", "getError", "_canRetry", "canRetry", "getCanRetry", "_favoriteIds", "", "_initialFavoriteIds", "_selectedSport", "selectedSport", "getSelectedSport", "isActive", "()Z", "setActive", "(Z)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "offset", "getOffset", "()I", "setOffset", "isInitialLoadDone", "setInitialLoadDone", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "getSportId", "()Ljava/lang/Integer;", "setSportId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "toggleFavorite", "", "itemId", "resetSport", "removeFavoriteAndSave", "onResult", "Lkotlin/Function1;", "addFavoriteAndSave", "getMaxFavoritesAllowed", "saveFavorites", "getFavoriteSaver", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", "updateItemsFavoriteStatus", "initializeFavoritesFromItems", "isFavorite", "getFavoriteCount", "hasUnsavedChanges", "clearFavorites", "bind", "onQueryChanged", "onSportChanged", "sport", "resetSearchState", "unbind", "setInactive", "isControllerActive", "performSearch", "performFilterChange", "filter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "refresh", "loadNextPage", "resetState", "loadPage", "append", "setLoadingStates", "loadInitial", "retry", "handleError", "errorMessage", "handleSuccess", "clearError", "isRequestTimedOut", "startTime", "", "timeoutSeconds", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BasePagingController {

    @Deprecated
    public static final int MAX_FAVORITE_LEAGUES_TEAMS = 10;

    @Deprecated
    public static final int MAX_FAVORITE_SPORTS = 3;
    private final MutableStateFlow<Boolean> _canRetry;
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<Set<Integer>> _favoriteIds;
    private final MutableStateFlow<Boolean> _hasMore;
    private final MutableStateFlow<Set<Integer>> _initialFavoriteIds;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<Boolean> _isLoadingMore;
    private final MutableStateFlow<List<SportListItemUiModel>> _items;
    private final MutableStateFlow<String> _query;
    private final MutableStateFlow<SportListItemUiModel> _selectedSport;
    private final StateFlow<Boolean> canRetry;
    private Context context;
    private final SportListItemUiModel defaultSport;
    private final StateFlow<String> error;
    private final StateFlow<Boolean> hasMore;
    private boolean isActive;
    private boolean isInitialLoadDone;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<Boolean> isLoadingMore;
    private final StateFlow<List<SportListItemUiModel>> items;
    private int offset;
    private final int pageSize;
    private final StateFlow<String> query;
    private final StateFlow<SportListItemUiModel> selectedSport;
    private Integer sportId;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public BasePagingController() {
        this(0, 1, null);
    }

    protected abstract FavoriteSaver getFavoriteSaver();

    protected abstract FavouriteTypeK getFavouriteType();

    public abstract MatchFilterState getMatchFilterState();

    protected abstract void loadPage(boolean append);

    public BasePagingController(int i) {
        this.pageSize = i;
        SportListItemUiModel sportListItemUiModel = new SportListItemUiModel(22, "Football", "https://betup.org/uploads_api/sport/22.png", 0, 0, false, new Function0() { // from class: org.betup.ui.fragment.matches.BasePagingController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        });
        this.defaultSport = sportListItemUiModel;
        MutableStateFlow<List<SportListItemUiModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._items = MutableStateFlow;
        this.items = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<String> MutableStateFlow2 = StateFlowKt.MutableStateFlow("");
        this._query = MutableStateFlow2;
        this.query = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._hasMore = MutableStateFlow3;
        this.hasMore = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow4;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingMore = MutableStateFlow5;
        this.isLoadingMore = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow6;
        this.error = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(false);
        this._canRetry = MutableStateFlow7;
        this.canRetry = FlowKt.asStateFlow(MutableStateFlow7);
        this._favoriteIds = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._initialFavoriteIds = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        MutableStateFlow<SportListItemUiModel> MutableStateFlow8 = StateFlowKt.MutableStateFlow(sportListItemUiModel);
        this._selectedSport = MutableStateFlow8;
        this.selectedSport = FlowKt.asStateFlow(MutableStateFlow8);
    }

    public /* synthetic */ BasePagingController(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* compiled from: BasePagingController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/fragment/matches/BasePagingController$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "MAX_FAVORITE_SPORTS", "", "MAX_FAVORITE_LEAGUES_TEAMS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final SportListItemUiModel getDefaultSport() {
        return this.defaultSport;
    }

    protected final MutableStateFlow<List<SportListItemUiModel>> get_items() {
        return this._items;
    }

    public final StateFlow<List<SportListItemUiModel>> getItems() {
        return this.items;
    }

    protected final MutableStateFlow<String> get_query() {
        return this._query;
    }

    public final StateFlow<String> getQuery() {
        return this.query;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MutableStateFlow<Boolean> get_hasMore() {
        return this._hasMore;
    }

    public final StateFlow<Boolean> getHasMore() {
        return this.hasMore;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<Boolean> isLoadingMore() {
        return this.isLoadingMore;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<Boolean> getCanRetry() {
        return this.canRetry;
    }

    public final StateFlow<SportListItemUiModel> getSelectedSport() {
        return this.selectedSport;
    }

    /* renamed from: isActive, reason: from getter */
    protected final boolean getIsActive() {
        return this.isActive;
    }

    protected final void setActive(boolean z) {
        this.isActive = z;
    }

    protected final Context getContext() {
        return this.context;
    }

    protected final void setContext(Context context) {
        this.context = context;
    }

    protected final int getOffset() {
        return this.offset;
    }

    protected final void setOffset(int i) {
        this.offset = i;
    }

    /* renamed from: isInitialLoadDone, reason: from getter */
    protected final boolean getIsInitialLoadDone() {
        return this.isInitialLoadDone;
    }

    protected final void setInitialLoadDone(boolean z) {
        this.isInitialLoadDone = z;
    }

    public final Integer getSportId() {
        return this.sportId;
    }

    public final void setSportId(Integer num) {
        this.sportId = num;
    }

    public final void toggleFavorite(int itemId) {
        if (!this.isActive) {
            Log.d("BasePagingController", "toggleFavorite blocked: not active");
            return;
        }
        Set<Integer> mutableSet = CollectionsKt.toMutableSet(this._favoriteIds.getValue());
        if (mutableSet.contains(Integer.valueOf(itemId))) {
            mutableSet.remove(Integer.valueOf(itemId));
            Log.d("BasePagingController", "Removed favorite: " + itemId);
        } else {
            mutableSet.add(Integer.valueOf(itemId));
            Log.d("BasePagingController", "Added favorite: " + itemId);
        }
        this._favoriteIds.setValue(mutableSet);
        updateItemsFavoriteStatus();
    }

    public final void resetSport() {
        this._selectedSport.setValue(this.defaultSport);
    }

    protected final void removeFavoriteAndSave(final int itemId, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (!this.isActive) {
            onResult.invoke(false);
            return;
        }
        List<Integer> list = CollectionsKt.toList(SetsKt.minus(this._favoriteIds.getValue(), Integer.valueOf(itemId)));
        MutableStateFlow<Set<Integer>> mutableStateFlow = this._favoriteIds;
        mutableStateFlow.setValue(SetsKt.minus(mutableStateFlow.getValue(), Integer.valueOf(itemId)));
        updateItemsFavoriteStatus();
        getFavoriteSaver().saveFavoritesWithDeleteAndPut(CollectionsKt.emptyList(), list, new Function1() { // from class: org.betup.ui.fragment.matches.BasePagingController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFavoriteAndSave$lambda$1;
                removeFavoriteAndSave$lambda$1 = BasePagingController.removeFavoriteAndSave$lambda$1(BasePagingController.this, itemId, onResult, ((Boolean) obj).booleanValue());
                return removeFavoriteAndSave$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFavoriteAndSave$lambda$1(BasePagingController basePagingController, int i, Function1 function1, boolean z) {
        if (!basePagingController.isActive) {
            return Unit.INSTANCE;
        }
        if (z) {
            basePagingController._initialFavoriteIds.setValue(basePagingController._favoriteIds.getValue());
            EventBus.getDefault().post(new FavoritesUpdatedMessage(basePagingController.getFavouriteType(), true));
        } else {
            MutableStateFlow<Set<Integer>> mutableStateFlow = basePagingController._favoriteIds;
            mutableStateFlow.setValue(SetsKt.plus(mutableStateFlow.getValue(), Integer.valueOf(i)));
            basePagingController.updateItemsFavoriteStatus();
            EventBus.getDefault().post(new FavoritesUpdatedMessage(basePagingController.getFavouriteType(), false));
        }
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    protected final void addFavoriteAndSave(final int itemId, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (!this.isActive) {
            onResult.invoke(false);
            return;
        }
        int maxFavoritesAllowed = getMaxFavoritesAllowed();
        if (this._favoriteIds.getValue().size() >= maxFavoritesAllowed) {
            Context context = this.context;
            if (context != null) {
                SnackbarHelper.showShort(context, context.getString(R.string.error_favorites_limit_reached, Integer.valueOf(maxFavoritesAllowed)));
            }
            EventBus.getDefault().post(new FavoritesUpdatedMessage(getFavouriteType(), false));
            onResult.invoke(false);
            return;
        }
        Set<Integer> plus = SetsKt.plus(this._favoriteIds.getValue(), Integer.valueOf(itemId));
        List<Integer> list = CollectionsKt.toList(plus);
        this._favoriteIds.setValue(plus);
        updateItemsFavoriteStatus();
        getFavoriteSaver().saveFavoritesWithDeleteAndPut(CollectionsKt.emptyList(), list, new Function1() { // from class: org.betup.ui.fragment.matches.BasePagingController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addFavoriteAndSave$lambda$3;
                addFavoriteAndSave$lambda$3 = BasePagingController.addFavoriteAndSave$lambda$3(BasePagingController.this, itemId, onResult, ((Boolean) obj).booleanValue());
                return addFavoriteAndSave$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFavoriteAndSave$lambda$3(BasePagingController basePagingController, int i, Function1 function1, boolean z) {
        if (!basePagingController.isActive) {
            return Unit.INSTANCE;
        }
        if (z) {
            basePagingController._initialFavoriteIds.setValue(basePagingController._favoriteIds.getValue());
            EventBus.getDefault().post(new FavoritesUpdatedMessage(basePagingController.getFavouriteType(), true));
        } else {
            MutableStateFlow<Set<Integer>> mutableStateFlow = basePagingController._favoriteIds;
            mutableStateFlow.setValue(SetsKt.minus(mutableStateFlow.getValue(), Integer.valueOf(i)));
            basePagingController.updateItemsFavoriteStatus();
            EventBus.getDefault().post(new FavoritesUpdatedMessage(basePagingController.getFavouriteType(), false));
        }
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private final int getMaxFavoritesAllowed() {
        FavouriteTypeK favouriteType = getFavouriteType();
        if (favouriteType instanceof FavouriteTypeK.Sports) {
            return 3;
        }
        if ((favouriteType instanceof FavouriteTypeK.Leagues) || (favouriteType instanceof FavouriteTypeK.Teams)) {
            return 10;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void saveFavorites(final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (!this.isActive) {
            Log.d("BasePagingController", "saveFavorites blocked: not active");
            onResult.invoke(false);
            return;
        }
        int maxFavoritesAllowed = getMaxFavoritesAllowed();
        if (this._favoriteIds.getValue().size() > maxFavoritesAllowed) {
            Context context = this.context;
            if (context != null) {
                SnackbarHelper.showShort(context, context.getString(R.string.error_favorites_limit_reached, Integer.valueOf(maxFavoritesAllowed)));
            }
            EventBus.getDefault().post(new FavoritesUpdatedMessage(getFavouriteType(), false));
            onResult.invoke(false);
            return;
        }
        Context context2 = this.context;
        if (context2 != null) {
            try {
                UserServiceAccessor userServiceAccessor = new UserServiceAccessor();
                Context applicationContext = context2.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
                ((BetUpApp) applicationContext).getComponent().inject(userServiceAccessor);
                UserService userService = userServiceAccessor.getUserService();
                SignInDialogManager signInDialogManager = SignInDialogManager.INSTANCE;
                Intrinsics.checkNotNull(userService);
                if (signInDialogManager.shouldForceShow(userService)) {
                    if (this._favoriteIds.getValue().size() > this._initialFavoriteIds.getValue().size() && (context2 instanceof Activity)) {
                        SignInDialogFragment.Companion.showDialog$default(SignInDialogFragment.INSTANCE, (Activity) context2, null, 2, null);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                Integer.valueOf(Log.e("BasePagingController", "Error checking anonymous user: " + e.getMessage(), e));
            }
        }
        List<Integer> list = CollectionsKt.toList(this._favoriteIds.getValue());
        List<Integer> list2 = CollectionsKt.toList(this._initialFavoriteIds.getValue());
        Log.d("BasePagingController", "Saving " + list.size() + " favorites: " + list);
        getFavoriteSaver().saveFavoritesWithDeleteAndPut(list2, list, new Function1() { // from class: org.betup.ui.fragment.matches.BasePagingController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit saveFavorites$lambda$6;
                saveFavorites$lambda$6 = BasePagingController.saveFavorites$lambda$6(BasePagingController.this, onResult, ((Boolean) obj).booleanValue());
                return saveFavorites$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveFavorites$lambda$6(BasePagingController basePagingController, Function1 function1, boolean z) {
        if (!basePagingController.isActive) {
            Log.d("BasePagingController", "saveFavorites response ignored: not active");
            return Unit.INSTANCE;
        }
        if (z) {
            Log.d("BasePagingController", "Favorites saved successfully");
            basePagingController._initialFavoriteIds.setValue(basePagingController._favoriteIds.getValue());
            basePagingController.updateItemsFavoriteStatus();
            Log.d("BasePagingController", "Sending FavoritesUpdatedMessage with type: " + basePagingController.getFavouriteType() + ", success: true");
            EventBus.getDefault().post(new FavoritesUpdatedMessage(basePagingController.getFavouriteType(), true));
        } else {
            Log.e("BasePagingController", "Failed to save favorites");
            Log.d("BasePagingController", "Sending FavoritesUpdatedMessage with type: " + basePagingController.getFavouriteType() + ", success: false");
            EventBus.getDefault().post(new FavoritesUpdatedMessage(basePagingController.getFavouriteType(), false));
        }
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    private final void updateItemsFavoriteStatus() {
        Set<Integer> value = this._favoriteIds.getValue();
        List<SportListItemUiModel> value2 = this._items.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value2, 10));
        for (SportListItemUiModel sportListItemUiModel : value2) {
            arrayList.add(SportListItemUiModel.copy$default(sportListItemUiModel, 0, null, null, 0, 0, value.contains(Integer.valueOf(sportListItemUiModel.getId())), null, 95, null));
        }
        this._items.setValue(arrayList);
    }

    protected final void initializeFavoritesFromItems() {
        Set<Integer> plus;
        List<SportListItemUiModel> value = this._items.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((SportListItemUiModel) obj).isFavorite()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((SportListItemUiModel) it.next()).getId()));
        }
        Set<Integer> set = CollectionsKt.toSet(arrayList3);
        FavouriteTypeK favouriteType = getFavouriteType();
        if (favouriteType instanceof FavouriteTypeK.Sports) {
            plus = set;
        } else {
            if (!(favouriteType instanceof FavouriteTypeK.Leagues) && !(favouriteType instanceof FavouriteTypeK.Teams)) {
                throw new NoWhenBranchMatchedException();
            }
            plus = SetsKt.plus((Set) this._favoriteIds.getValue(), (Iterable) set);
        }
        this._favoriteIds.setValue(plus);
        this._initialFavoriteIds.setValue(plus);
        Log.d("BasePagingController", "Initialized " + set.size() + " visible favorites from items");
        Log.d("BasePagingController", "Stored merged favorites: " + plus);
    }

    public final boolean isFavorite(int itemId) {
        return this._favoriteIds.getValue().contains(Integer.valueOf(itemId));
    }

    public final int getFavoriteCount() {
        return this._favoriteIds.getValue().size();
    }

    public final boolean hasUnsavedChanges() {
        Set<Integer> value = this._favoriteIds.getValue();
        Set<Integer> value2 = this._initialFavoriteIds.getValue();
        boolean z = !Intrinsics.areEqual(value, value2);
        Log.d("BasePagingController", "Checking unsaved changes: current=" + value + ", initial=" + value2 + ", hasChanges=" + z);
        return z;
    }

    public final void clearFavorites() {
        this._favoriteIds.setValue(SetsKt.emptySet());
        updateItemsFavoriteStatus();
        Log.d("BasePagingController", "Cleared all favorites");
    }

    public void bind(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.d("BasePagingController", "Binding controller, isInitialLoadDone: " + this.isInitialLoadDone + ", current offset: " + this.offset + ", isActive: " + this.isActive);
        if (this.isActive && Intrinsics.areEqual(this.context, context) && this.isInitialLoadDone) {
            Log.d("BasePagingController", "Already bound to same context and initial load done, skipping");
            return;
        }
        this.context = context;
        this.isActive = true;
        if (!this.isInitialLoadDone) {
            Log.d("BasePagingController", "Loading initial data");
            loadInitial();
            this.isInitialLoadDone = true;
            return;
        }
        Log.d("BasePagingController", "Initial load already done, skipping");
    }

    public final void onQueryChanged(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._query.setValue(query);
    }

    public final void onSportChanged(SportListItemUiModel sport) {
        Intrinsics.checkNotNullParameter(sport, "sport");
        this._selectedSport.setValue(sport);
        this.sportId = Integer.valueOf(sport.getId());
        resetState();
        loadInitial();
    }

    public void resetSearchState() {
        if (!this.isActive) {
            Log.d("BasePagingController", "resetSearchState blocked: not active");
        } else {
            this._query.setValue("");
        }
    }

    public void unbind() {
        Log.d("BasePagingController", "Unbinding controller, current offset: " + this.offset);
        this.isActive = false;
        this.context = null;
    }

    public final void setInactive() {
        Log.d("BasePagingController", "Setting controller inactive");
        this.isActive = false;
    }

    public final boolean isControllerActive() {
        return this.isActive;
    }

    public final void performSearch(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (!this.isActive) {
            Log.d("BasePagingController", "performSearch blocked: not active");
            return;
        }
        Log.d("BasePagingController", "Performing search with query: '" + query + "', current offset: " + this.offset);
        this._query.setValue(query);
        this.isInitialLoadDone = false;
        this.offset = 0;
        Log.d("BasePagingController", "Offset reset to 0 for new search");
        loadInitial();
    }

    public final void performFilterChange(NewMatchFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (!this.isActive) {
            Log.d("BasePagingController", "performFilterChange blocked: not active");
            return;
        }
        Log.d("BasePagingController", "Performing filter change to: " + filter.getName() + ", current offset: " + this.offset);
        getMatchFilterState().selectFilter(filter);
        this.isInitialLoadDone = false;
        this.offset = 0;
        Log.d("BasePagingController", "Offset reset to 0 for new filter");
        loadInitial();
    }

    public final void refresh() {
        if (!this.isActive) {
            Log.d("BasePagingController", "refresh blocked: not active");
            return;
        }
        Log.d("BasePagingController", "Manual refresh requested, current offset: " + this.offset);
        clearError();
        this.offset = 0;
        this.isInitialLoadDone = false;
        Log.d("BasePagingController", "Offset reset to 0 for refresh, isInitialLoadDone reset to false");
        setLoadingStates(false);
        loadPage(false);
    }

    public void loadNextPage() {
        if (!this.isActive || this.isLoadingMore.getValue().booleanValue() || !this._hasMore.getValue().booleanValue() || this._items.getValue().isEmpty() || this._isLoading.getValue().booleanValue()) {
            Log.d("BasePagingController", "loadNextPage blocked: isActive=" + this.isActive + ", isLoadingMore=" + this.isLoadingMore.getValue() + ", hasMore=" + this._hasMore.getValue() + ", itemsEmpty=" + this._items.getValue().isEmpty() + ", isLoading=" + this._isLoading.getValue());
            return;
        }
        Log.d("BasePagingController", "Loading next page, current offset: " + this.offset);
        int i = this.offset + this.pageSize;
        this.offset = i;
        Log.d("BasePagingController", "Offset incremented to: " + i);
        loadPage(true);
    }

    protected final void resetState() {
        Log.d("BasePagingController", "Resetting state, current offset: " + this.offset);
        this.offset = 0;
        Log.d("BasePagingController", "Offset reset to 0");
        this._items.setValue(CollectionsKt.emptyList());
        this._hasMore.setValue(true);
        this._error.setValue(null);
        this._canRetry.setValue(false);
        this._isLoading.setValue(false);
        this._isLoadingMore.setValue(false);
    }

    public static /* synthetic */ void loadPage$default(BasePagingController basePagingController, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPage");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        basePagingController.loadPage(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setLoadingStates(boolean append) {
        if (!this.isActive) {
            Log.d("BasePagingController", "setLoadingStates blocked: not active");
            return;
        }
        Log.d("BasePagingController", "Setting loading states: append=" + append);
        if (append) {
            this._isLoadingMore.setValue(true);
        } else {
            this._isLoading.setValue(true);
            this._isLoadingMore.setValue(false);
        }
        clearError();
    }

    public void loadInitial() {
        if (!this.isActive) {
            Log.d("BasePagingController", "loadInitial blocked: not active");
            return;
        }
        Log.d("BasePagingController", "loadInitial called, current offset: " + this.offset);
        resetState();
        Log.d("BasePagingController", "State reset, offset is now: " + this.offset);
        loadPage$default(this, false, 1, null);
    }

    public final void retry() {
        if (!this.isActive || !this._canRetry.getValue().booleanValue()) {
            Log.d("BasePagingController", "retry blocked");
            return;
        }
        Log.d("BasePagingController", "Retry requested");
        clearError();
        loadInitial();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void handleError(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (!this.isActive) {
            Log.d("BasePagingController", "handleError blocked: not active");
            return;
        }
        Log.e("BasePagingController", "Error: " + errorMessage);
        String str = errorMessage;
        boolean z = true;
        boolean z2 = StringsKt.contains((CharSequence) str, (CharSequence) "timeout", true) || StringsKt.contains((CharSequence) str, (CharSequence) "connection", true) || StringsKt.contains((CharSequence) str, (CharSequence) "network", true);
        this._isLoading.setValue(false);
        this._isLoadingMore.setValue(false);
        this._error.setValue(errorMessage);
        MutableStateFlow<Boolean> mutableStateFlow = this._canRetry;
        if (!z2 && !StringsKt.contains((CharSequence) str, (CharSequence) "connection", true)) {
            z = false;
        }
        mutableStateFlow.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void handleSuccess() {
        if (!this.isActive) {
            Log.d("BasePagingController", "handleSuccess blocked: not active");
            return;
        }
        Log.d("BasePagingController", "Handling success");
        this._isLoading.setValue(false);
        this._isLoadingMore.setValue(false);
        this._error.setValue(null);
        this._canRetry.setValue(false);
        initializeFavoritesFromItems();
    }

    protected final void clearError() {
        if (!this.isActive) {
            Log.d("BasePagingController", "clearError blocked: not active");
        } else {
            this._error.setValue(null);
            this._canRetry.setValue(false);
        }
    }

    public static /* synthetic */ boolean isRequestTimedOut$default(BasePagingController basePagingController, long j, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isRequestTimedOut");
        }
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return basePagingController.isRequestTimedOut(j, i);
    }

    protected final boolean isRequestTimedOut(long startTime, int timeoutSeconds) {
        return System.currentTimeMillis() - startTime > ((long) timeoutSeconds) * 1000;
    }
}
