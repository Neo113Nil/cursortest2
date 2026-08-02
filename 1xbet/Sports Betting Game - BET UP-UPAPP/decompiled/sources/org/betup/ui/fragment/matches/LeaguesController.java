package org.betup.ui.fragment.matches;

import android.app.Activity;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.ResponseBody;
import org.betup.BetUpApp;
import org.betup.bus.NavigateMessage;
import org.betup.bus.TourActionMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.leagues.NewLeagueItem;
import org.betup.model.remote.entity.leagues.NewLeaguesResponse;
import org.betup.model.remote.entity.sports.NewMatchCount;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.SignInDialogFragment;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.SpecificChampionshipFragment;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.ui.tour.compose.TourStep;
import org.betup.utils.SignInDialogManager;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: LeaguesController.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010:\u001a\u00020\u0002H\u0014J\u001d\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020@H\u0016J\u0010\u0010F\u001a\u00020@2\u0006\u0010G\u001a\u00020*H\u0014J\u000e\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020@2\u0006\u0010I\u001a\u00020JJ*\u0010L\u001a\u00020@2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020,0N2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020@0PH\u0016J8\u0010Q\u001a\u00020@2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020,0N2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020,0N2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020@0PH\u0016J\u000e\u0010T\u001a\u00020@2\u0006\u0010U\u001a\u00020,J\u0006\u0010)\u001a\u00020*J\u0010\u0010V\u001a\u00020@2\u0006\u0010W\u001a\u00020XH\u0007J\u0010\u0010Y\u001a\u00020@2\u0006\u0010W\u001a\u00020ZH\u0007J\b\u0010^\u001a\u00020@H\u0016J\b\u0010_\u001a\u00020@H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020<X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001a\u0010[\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020,0\\X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lorg/betup/ui/fragment/matches/LeaguesController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "leaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;", "getLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;", "setLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewLeaguesInteractor;)V", "putFavoriteLeaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;", "getPutFavoriteLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;", "setPutFavoriteLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;)V", "deleteFavoriteLeaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteLeaguesInteractor;", "getDeleteFavoriteLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteLeaguesInteractor;", "setDeleteFavoriteLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteLeaguesInteractor;)V", "putFavoriteLeaguesBulkInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesBulkInteractor;", "getPutFavoriteLeaguesBulkInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesBulkInteractor;", "setPutFavoriteLeaguesBulkInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesBulkInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "isEventBusRegistered", "", "currentOffset", "", "getCurrentOffset", "()I", "currentQuery", "", "getCurrentQuery", "()Ljava/lang/String;", "currentFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "getCurrentFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "hasMoreData", "getHasMoreData", "()Z", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "bind", "", "context", "Landroid/content/Context;", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "(Landroid/content/Context;Ljava/lang/Integer;)V", "unbind", "loadPage", "append", "onDeleteFavoriteLeague", "item", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "onAddFavoriteLeague", "saveFavorites", "ids", "", "onResult", "Lkotlin/Function1;", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "navigateToMatches", "id", "onLeagueFavoriteChanged", "event", "Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$LeagueFavoriteChangedEvent;", "onFilterChanged", "Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$FilterChangedEvent;", "leaguesCallback", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/leagues/NewLeaguesResponse;", "loadInitial", "loadNextPage", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LeaguesController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;

    @Inject
    public DeleteFavoriteLeaguesInteractor deleteFavoriteLeaguesInteractor;
    private final FavouriteTypeK favouriteType;
    private boolean isEventBusRegistered;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewLeaguesResponse, Integer> leaguesCallback;

    @Inject
    public NewLeaguesInteractor leaguesInteractor;

    @Inject
    public MatchFilterState matchFilterState;

    @Inject
    public PutFavoriteLeaguesBulkInteractor putFavoriteLeaguesBulkInteractor;

    @Inject
    public PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor;

    @Inject
    public UserService userService;

    /* compiled from: LeaguesController.kt */
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

    public LeaguesController() {
        super(0, 1, null);
        this.favouriteType = FavouriteTypeK.Leagues.INSTANCE;
        this.leaguesCallback = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.LeaguesController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                LeaguesController.leaguesCallback$lambda$16(LeaguesController.this, fetchedResponseMessage);
            }
        };
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

    public final DeleteFavoriteLeaguesInteractor getDeleteFavoriteLeaguesInteractor() {
        DeleteFavoriteLeaguesInteractor deleteFavoriteLeaguesInteractor = this.deleteFavoriteLeaguesInteractor;
        if (deleteFavoriteLeaguesInteractor != null) {
            return deleteFavoriteLeaguesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteFavoriteLeaguesInteractor");
        return null;
    }

    public final void setDeleteFavoriteLeaguesInteractor(DeleteFavoriteLeaguesInteractor deleteFavoriteLeaguesInteractor) {
        Intrinsics.checkNotNullParameter(deleteFavoriteLeaguesInteractor, "<set-?>");
        this.deleteFavoriteLeaguesInteractor = deleteFavoriteLeaguesInteractor;
    }

    public final PutFavoriteLeaguesBulkInteractor getPutFavoriteLeaguesBulkInteractor() {
        PutFavoriteLeaguesBulkInteractor putFavoriteLeaguesBulkInteractor = this.putFavoriteLeaguesBulkInteractor;
        if (putFavoriteLeaguesBulkInteractor != null) {
            return putFavoriteLeaguesBulkInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("putFavoriteLeaguesBulkInteractor");
        return null;
    }

    public final void setPutFavoriteLeaguesBulkInteractor(PutFavoriteLeaguesBulkInteractor putFavoriteLeaguesBulkInteractor) {
        Intrinsics.checkNotNullParameter(putFavoriteLeaguesBulkInteractor, "<set-?>");
        this.putFavoriteLeaguesBulkInteractor = putFavoriteLeaguesBulkInteractor;
    }

    public final UserService getUserService() {
        UserService userService = this.userService;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userService");
        return null;
    }

    public final void setUserService(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userService = userService;
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
        Log.d("LeaguesController", "Binding with sportId: " + sportId + ", current offset: " + getOffset() + ", isActive: " + getIsActive() + ", isInitialLoadDone: " + getIsInitialLoadDone());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        boolean areEqual = Intrinsics.areEqual(getSportId(), sportId);
        setSportId(sportId);
        if (getIsActive() && Intrinsics.areEqual(getContext(), context) && areEqual) {
            Log.d("LeaguesController", "Already bound to same context and sportId, skipping");
            return;
        }
        if (!areEqual) {
            Log.d("LeaguesController", "SportId changed from " + getSportId() + " to " + sportId + ", resetting state");
            resetState();
            setInitialLoadDone(false);
            Log.d("LeaguesController", "State reset complete, offset is now: " + getOffset() + ", isInitialLoadDone: " + getIsInitialLoadDone());
        }
        if (!this.isEventBusRegistered) {
            Log.d("LeaguesController", "Registering controller in EventBus");
            EventBus.getDefault().register(this);
            this.isEventBusRegistered = true;
            Log.d("LeaguesController", "Controller registered in EventBus successfully");
        } else {
            Log.d("LeaguesController", "Controller already registered in EventBus");
        }
        Log.d("LeaguesController", "Calling super.bind() with context: " + context);
        super.bind(context);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void unbind() {
        Log.d("LeaguesController", "Unbinding controller, current offset: " + getOffset());
        super.unbind();
        setSportId(null);
        resetSport();
        resetSearchState();
        if (this.isEventBusRegistered) {
            Log.d("LeaguesController", "Unregistering controller from EventBus");
            EventBus.getDefault().unregister(this);
            this.isEventBusRegistered = false;
            Log.d("LeaguesController", "Controller unregistered from EventBus successfully");
            return;
        }
        Log.d("LeaguesController", "Controller was not registered in EventBus");
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        TourComposeHelper tourComposeHelper;
        BaseUserModel userModel;
        if (!getIsActive()) {
            Log.d("LeaguesController", "Controller not active, skipping loadPage");
            return;
        }
        if (getSportId() == null) {
            Log.d("LeaguesController", "sportId is null, skipping loadPage");
            return;
        }
        Log.d("LeaguesController", "loadPage called, append: " + append + ", current offset: " + getCurrentOffset() + ", sportId: " + getSportId() + ", isActive: " + getIsActive());
        setLoadingStates(append);
        ShortUserProfileModel shortProfile = getUserService().getShortProfile();
        if ((shortProfile == null || (userModel = shortProfile.getUserModel()) == null) ? false : userModel.isTutorialComplete()) {
            NewLeaguesInteractor leaguesInteractor = getLeaguesInteractor();
            BaseCachedSharedInteractor.OnFetchedListener<NewLeaguesResponse, Integer> onFetchedListener = this.leaguesCallback;
            Integer sportId = getSportId();
            Bundle bundle = new Bundle();
            bundle.putInt("offset", getCurrentOffset());
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
            bundle.putString("searchTerm", getCurrentQuery());
            bundle.putString("matchDateFilter", getCurrentFilter().getName());
            Unit unit = Unit.INSTANCE;
            leaguesInteractor.load(onFetchedListener, sportId, bundle);
            return;
        }
        Long l = null;
        try {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            TourState tourState = (mainActivity == null || (tourComposeHelper = mainActivity.tourComposeHelper) == null) ? null : tourComposeHelper.getTourState();
            if ((tourState != null ? tourState.getCurrentStep() : null) == TourStep.SELECT_LEAGUE && tourState != null) {
                l = tourState.getTourLeagueId();
            }
        } catch (Exception unused) {
        }
        NewLeaguesInteractor leaguesInteractor2 = getLeaguesInteractor();
        BaseCachedSharedInteractor.OnFetchedListener<NewLeaguesResponse, Integer> onFetchedListener2 = this.leaguesCallback;
        Integer sportId2 = getSportId();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("offset", getCurrentOffset());
        bundle2.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        bundle2.putString("searchTerm", getCurrentQuery());
        bundle2.putString("matchDateFilter", getCurrentFilter().getName());
        if (l != null) {
            bundle2.putLong("tourLeagueId", l.longValue());
            Log.d("LeaguesController", "Adding tourLeagueId=" + l + " to request");
        }
        Unit unit2 = Unit.INSTANCE;
        leaguesInteractor2.load(onFetchedListener2, sportId2, bundle2);
    }

    public final void onDeleteFavoriteLeague(final SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!getIsActive()) {
            Log.d("LeaguesController", "onDeleteFavoriteLeague blocked: not active");
            return;
        }
        Log.d("LeaguesController", "Removing favorite league: " + item.getName() + " (using PUT)");
        removeFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onDeleteFavoriteLeague$lambda$2;
                onDeleteFavoriteLeague$lambda$2 = LeaguesController.onDeleteFavoriteLeague$lambda$2(LeaguesController.this, item, ((Boolean) obj).booleanValue());
                return onDeleteFavoriteLeague$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeleteFavoriteLeague$lambda$2(LeaguesController leaguesController, SportListItemUiModel sportListItemUiModel, boolean z) {
        if (!leaguesController.getIsActive()) {
            return Unit.INSTANCE;
        }
        if (!z) {
            Log.e("LeaguesController", "Failed to remove from favorites: " + sportListItemUiModel.getName());
            leaguesController.handleError("Failed to remove from favorites");
        } else {
            Log.d("LeaguesController", "Successfully removed from favorites: " + sportListItemUiModel.getName());
        }
        return Unit.INSTANCE;
    }

    public final void onAddFavoriteLeague(final SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!getIsActive()) {
            Log.d("LeaguesController", "onAddFavoriteLeague blocked: not active");
            return;
        }
        Context context = getContext();
        if (context != null && SignInDialogManager.INSTANCE.shouldForceShow(getUserService())) {
            SignInDialogFragment.Companion.showDialog$default(SignInDialogFragment.INSTANCE, (Activity) context, null, 2, null);
        }
        Log.d("LeaguesController", "Adding favorite league: " + item.getName());
        addFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onAddFavoriteLeague$lambda$4;
                onAddFavoriteLeague$lambda$4 = LeaguesController.onAddFavoriteLeague$lambda$4(LeaguesController.this, item, ((Boolean) obj).booleanValue());
                return onAddFavoriteLeague$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAddFavoriteLeague$lambda$4(LeaguesController leaguesController, SportListItemUiModel sportListItemUiModel, boolean z) {
        if (!leaguesController.getIsActive()) {
            return Unit.INSTANCE;
        }
        if (z) {
            Log.d("LeaguesController", "Successfully added to favorites: " + sportListItemUiModel.getName());
        } else {
            Log.e("LeaguesController", "Failed to add to favorites: " + sportListItemUiModel.getName());
            leaguesController.handleError("Failed to add to favorites");
        }
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        getPutFavoriteLeaguesBulkInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, List<? extends Integer>>() { // from class: org.betup.ui.fragment.matches.LeaguesController$saveFavorites$1
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
        Log.d("LeaguesController", "Starting PUT approach for leagues (replace)");
        Log.d("LeaguesController", "Replacing favorites with: " + newIds);
        getPutFavoriteLeaguesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.LeaguesController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                LeaguesController.saveFavoritesWithDeleteAndPut$lambda$5(Function1.this, fetchedResponseMessage);
            }
        }, newIds, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveFavoritesWithDeleteAndPut$lambda$5(Function1 function1, FetchedResponseMessage fetchedResponseMessage) {
        boolean z = fetchedResponseMessage.getStat() == FetchStat.SUCCESS;
        Log.d("LeaguesController", "PUT result: " + z);
        function1.invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[EDGE_INSN: B:36:0x00ca->B:29:0x00ca BREAK  A[LOOP:0: B:23:0x00b6->B:35:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void navigateToMatches(int id) {
        TourState tourState;
        Iterator<T> it;
        MainActivity mainActivity;
        TourComposeHelper tourComposeHelper;
        if (!getIsActive()) {
            Log.d("LeaguesController", "navigateToMatches blocked: not active");
            return;
        }
        Log.d("LeaguesController", "Navigating to matches with leagueId: " + id);
        Object obj = null;
        try {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        } catch (Exception unused) {
        }
        if (mainActivity != null && (tourComposeHelper = mainActivity.tourComposeHelper) != null) {
            tourState = tourComposeHelper.getTourState();
            if (tourState != null && tourState.getCurrentStep() == TourStep.SELECT_LEAGUE) {
                EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.LEAGUE_SELECTED, Long.valueOf(id)));
                Log.d("LeaguesController", "Posted TourActionMessage(LEAGUE_SELECTED) for league ID: " + id);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("id", id);
            bundle.putBoolean("isLive", Intrinsics.areEqual(getMatchFilterState().getSelectedFilter().getValue(), NewMatchFilter.Live.INSTANCE));
            bundle.putString("filter", getMatchFilterState().getSelectedFilter().getValue().getName());
            it = get_items().getValue().iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((SportListItemUiModel) next).getId() == id) {
                    obj = next;
                    break;
                }
            }
            SportListItemUiModel sportListItemUiModel = (SportListItemUiModel) obj;
            bundle.putBoolean("isFavorite", sportListItemUiModel == null ? sportListItemUiModel.isFavorite() : false);
            EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUE_MATCHES, bundle));
        }
        tourState = null;
        if (tourState != null) {
            EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.LEAGUE_SELECTED, Long.valueOf(id)));
            Log.d("LeaguesController", "Posted TourActionMessage(LEAGUE_SELECTED) for league ID: " + id);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("id", id);
        bundle2.putBoolean("isLive", Intrinsics.areEqual(getMatchFilterState().getSelectedFilter().getValue(), NewMatchFilter.Live.INSTANCE));
        bundle2.putString("filter", getMatchFilterState().getSelectedFilter().getValue().getName());
        it = get_items().getValue().iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        SportListItemUiModel sportListItemUiModel2 = (SportListItemUiModel) obj;
        bundle2.putBoolean("isFavorite", sportListItemUiModel2 == null ? sportListItemUiModel2.isFavorite() : false);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUE_MATCHES, bundle2));
    }

    public final boolean isEventBusRegistered() {
        boolean isRegistered = EventBus.getDefault().isRegistered(this);
        Log.d("LeaguesController", "EventBus registration check: " + isRegistered);
        return isRegistered;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onLeagueFavoriteChanged(SpecificChampionshipFragment.LeagueFavoriteChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.d("LeaguesController", "=== LEAGUE FAVORITE CHANGED EVENT RECEIVED ===");
        Log.d("LeaguesController", "Event details: leagueId=" + event.getLeagueId() + ", isFavorite=" + event.isFavorite());
        Log.d("LeaguesController", "Controller state: isActive=" + getIsActive() + ", itemsCount=" + get_items().getValue().size());
        if (!getIsActive()) {
            Log.d("LeaguesController", "onLeagueFavoriteChanged blocked: not active");
            return;
        }
        List<SportListItemUiModel> list = CollectionsKt.toList(get_items().getValue());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SportListItemUiModel sportListItemUiModel : list) {
            arrayList.add(sportListItemUiModel.getName() + "(id=" + sportListItemUiModel.getId() + ", fav=" + sportListItemUiModel.isFavorite() + ")");
        }
        Log.d("LeaguesController", "Current items before update: " + arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SportListItemUiModel sportListItemUiModel2 : list) {
            if (sportListItemUiModel2.getId() == event.getLeagueId()) {
                Log.d("LeaguesController", "Updating league " + sportListItemUiModel2.getName() + " (id=" + sportListItemUiModel2.getId() + ") from isFavorite=" + sportListItemUiModel2.isFavorite() + " to " + event.isFavorite());
                sportListItemUiModel2 = SportListItemUiModel.copy$default(sportListItemUiModel2, 0, null, null, 0, 0, event.isFavorite(), null, 95, null);
            }
            arrayList2.add(sportListItemUiModel2);
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList<SportListItemUiModel> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        for (SportListItemUiModel sportListItemUiModel3 : arrayList4) {
            arrayList5.add(sportListItemUiModel3.getName() + "(id=" + sportListItemUiModel3.getId() + ", fav=" + sportListItemUiModel3.isFavorite() + ")");
        }
        Log.d("LeaguesController", "Updated items: " + arrayList5);
        get_items().setValue(arrayList3);
        Log.d("LeaguesController", "=== LEAGUE FAVORITE CHANGED EVENT PROCESSED ===");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFilterChanged(SpecificChampionshipFragment.FilterChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!getIsActive()) {
            Log.d("LeaguesController", "onFilterChanged blocked: not active");
            return;
        }
        Log.d("LeaguesController", "Received FilterChangedEvent: " + event.getNewFilter());
        performFilterChange(event.getNewFilter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void leaguesCallback$lambda$16(final LeaguesController leaguesController, FetchedResponseMessage fetchedResponseMessage) {
        TourComposeHelper tourComposeHelper;
        TourState tourState;
        BaseUserModel userModel;
        NewMatchCount matchCount;
        String photoUrl;
        String name;
        List<NewLeagueItem> items;
        Log.d("LeaguesController", "onFetched callback executed! Stat: " + fetchedResponseMessage.getStat() + ", hasData: " + (fetchedResponseMessage.getModel() != null));
        if (!leaguesController.getIsActive()) {
            Log.d("LeaguesController", "Controller not active, ignoring callback");
            return;
        }
        FetchStat stat = fetchedResponseMessage.getStat();
        int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Log.d("LeaguesController", "ERROR callback: " + fetchedResponseMessage.getStat());
                leaguesController.handleError("Failed to load leagues");
                return;
            } else {
                Log.d("LeaguesController", "NO_CONNECTION callback");
                leaguesController.handleError("No internet connection");
                return;
            }
        }
        NewLeaguesResponse newLeaguesResponse = (NewLeaguesResponse) fetchedResponseMessage.getModel();
        Log.d("LeaguesController", "SUCCESS callback - leagues count: " + ((newLeaguesResponse == null || (items = newLeaguesResponse.getItems()) == null) ? 0 : items.size()));
        NewLeaguesResponse newLeaguesResponse2 = (NewLeaguesResponse) fetchedResponseMessage.getModel();
        if (newLeaguesResponse2 == null) {
            Log.d("LeaguesController", "Response model is null");
            leaguesController.handleError("No data received");
            return;
        }
        List<NewLeagueItem> items2 = newLeaguesResponse2.getItems();
        Log.d("LeaguesController", "Processing " + items2.size() + " leagues, filter: " + leaguesController.getCurrentFilter());
        List<NewLeagueItem> list = items2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (NewLeagueItem newLeagueItem : list) {
            NewLeague league = newLeagueItem.getLeague();
            final int id = league != null ? league.getId() : 0;
            NewMatchCount matchCount2 = newLeagueItem.getMatchCount();
            int live = matchCount2 != null ? matchCount2.getLive() : 0;
            int currentCount = (Intrinsics.areEqual(leaguesController.getCurrentFilter(), NewMatchFilter.Live.INSTANCE) || (matchCount = newLeagueItem.getMatchCount()) == null) ? 0 : matchCount.getCurrentCount(leaguesController.getCurrentFilter());
            NewLeague league2 = newLeagueItem.getLeague();
            String str = (league2 == null || (name = league2.getName()) == null) ? "" : name;
            NewLeague league3 = newLeagueItem.getLeague();
            arrayList.add(new SportListItemUiModel(id, str, (league3 == null || (photoUrl = league3.getPhotoUrl()) == null) ? "" : photoUrl, currentCount, live, newLeagueItem.isFavorite(), new Function0() { // from class: org.betup.ui.fragment.matches.LeaguesController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit leaguesCallback$lambda$16$lambda$14$lambda$11$lambda$10;
                    leaguesCallback$lambda$16$lambda$14$lambda$11$lambda$10 = LeaguesController.leaguesCallback$lambda$16$lambda$14$lambda$11$lambda$10(LeaguesController.this, id);
                    return leaguesCallback$lambda$16$lambda$14$lambda$11$lambda$10;
                }
            }));
        }
        ArrayList arrayList2 = arrayList;
        ShortUserProfileModel shortProfile = leaguesController.getUserService().getShortProfile();
        if (!((shortProfile == null || (userModel = shortProfile.getUserModel()) == null) ? false : userModel.isTutorialComplete()) && leaguesController.getCurrentOffset() == 0) {
            try {
                Context context = leaguesController.getContext();
                Object obj = null;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                Long tourLeagueId = (mainActivity == null || (tourComposeHelper = mainActivity.tourComposeHelper) == null || (tourState = tourComposeHelper.getTourState()) == null) ? null : tourState.getTourLeagueId();
                if (tourLeagueId != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((SportListItemUiModel) next).getId() == ((int) tourLeagueId.longValue())) {
                            obj = next;
                            break;
                        }
                    }
                    SportListItemUiModel sportListItemUiModel = (SportListItemUiModel) obj;
                    if (sportListItemUiModel != null) {
                        List listOf = CollectionsKt.listOf(sportListItemUiModel);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (((SportListItemUiModel) obj2).getId() != ((int) tourLeagueId.longValue())) {
                                arrayList3.add(obj2);
                            }
                        }
                        leaguesController.get_items().setValue(CollectionsKt.plus((Collection) listOf, (Iterable) arrayList3));
                        Integer.valueOf(Log.d("LeaguesController", "Tour league moved to first position: " + sportListItemUiModel.getName()));
                    } else {
                        leaguesController.get_items().setValue(arrayList2);
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    leaguesController.get_items().setValue(arrayList2);
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Exception unused) {
                leaguesController.get_items().setValue(arrayList2);
                Unit unit3 = Unit.INSTANCE;
            }
        } else if (leaguesController.getCurrentOffset() == 0) {
            Log.d("LeaguesController", "Setting leagues: " + arrayList2.size() + " items (reset)");
            leaguesController.get_items().setValue(arrayList2);
        } else {
            Log.d("LeaguesController", "Appending leagues: " + arrayList2.size() + " items (offset=" + leaguesController.getCurrentOffset() + ")");
            MutableStateFlow<List<SportListItemUiModel>> mutableStateFlow = leaguesController.get_items();
            mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
        }
        leaguesController.get_hasMore().setValue(Boolean.valueOf(items2.size() >= 10));
        Log.d("LeaguesController", "hasMore set to: " + leaguesController.get_hasMore().getValue());
        leaguesController.handleSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit leaguesCallback$lambda$16$lambda$14$lambda$11$lambda$10(LeaguesController leaguesController, int i) {
        leaguesController.navigateToMatches(i);
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadInitial() {
        Log.d("LeaguesController", "loadInitial called, current offset: " + getCurrentOffset());
        resetState();
        loadPage(false);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
        Log.d("LeaguesController", "loadNextPage called, current offset: " + getCurrentOffset() + ", hasMore: " + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
        if (!getHasMoreData() || isLoadingMore().getValue().booleanValue() || isLoading().getValue().booleanValue()) {
            Log.d("LeaguesController", "loadNextPage blocked: hasMore=" + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
            return;
        }
        if (!getIsActive()) {
            Log.d("LeaguesController", "loadNextPage blocked: not active");
            return;
        }
        setOffset(getOffset() + 10);
        Log.d("LeaguesController", "Offset incremented to: " + getOffset());
        loadPage(true);
    }
}
