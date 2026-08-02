package org.betup.ui.fragment.matches;

import android.app.Activity;
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
import okhttp3.ResponseBody;
import org.betup.BetUpApp;
import org.betup.bus.NavigateMessage;
import org.betup.bus.TourActionMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.NewSportsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.model.remote.entity.sports.NewMatchCount;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.sports.NewSportsItem;
import org.betup.model.remote.entity.sports.NewSportsResponse;
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

/* compiled from: MatchesController.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010:\u001a\u00020\u0002H\u0014J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020@H\u0016J\u0010\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020*H\u0014J\u000e\u0010F\u001a\u00020@2\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020@2\u0006\u0010G\u001a\u00020HJ*\u0010J\u001a\u00020@2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020,0L2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020@0NH\u0016J8\u0010O\u001a\u00020@2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020,0L2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020,0L2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020@0NH\u0016J\u000e\u0010R\u001a\u00020@2\u0006\u0010S\u001a\u00020,J\u0010\u0010T\u001a\u00020@2\u0006\u0010U\u001a\u00020VH\u0007J\b\u0010W\u001a\u00020@H\u0016J\b\u0010X\u001a\u00020@H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020<X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u001c\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020[\u0012\u0006\u0012\u0004\u0018\u00010,0ZX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lorg/betup/ui/fragment/matches/MatchesController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "sportsInteractor", "Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;", "getSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;", "setSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/NewSportsInteractor;)V", "putFavoriteSportsInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;", "getPutFavoriteSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;", "setPutFavoriteSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;)V", "deleteFavoriteSportsInteractor", "Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;", "getDeleteFavoriteSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;", "setDeleteFavoriteSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;)V", "putFavoriteSportsBulkInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsBulkInteractor;", "getPutFavoriteSportsBulkInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsBulkInteractor;", "setPutFavoriteSportsBulkInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsBulkInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "isEventBusRegistered", "", "currentOffset", "", "getCurrentOffset", "()I", "currentQuery", "", "getCurrentQuery", "()Ljava/lang/String;", "currentFilter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "getCurrentFilter", "()Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "hasMoreData", "getHasMoreData", "()Z", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "bind", "", "context", "Landroid/content/Context;", "unbind", "loadPage", "append", "onDeleteFavoriteSport", "item", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "onAddFavoriteSport", "saveFavorites", "ids", "", "onResult", "Lkotlin/Function1;", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "navigateToLeagues", "id", "onFilterChanged", "event", "Lorg/betup/ui/fragment/matches/SpecificChampionshipFragment$FilterChangedEvent;", "loadInitial", "loadNextPage", "sportsCallback", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/sports/NewSportsResponse;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchesController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;

    @Inject
    public DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor;
    private final FavouriteTypeK favouriteType;
    private boolean isEventBusRegistered;

    @Inject
    public MatchFilterState matchFilterState;

    @Inject
    public PutFavoriteSportsBulkInteractor putFavoriteSportsBulkInteractor;

    @Inject
    public PutFavoriteSportsInteractor putFavoriteSportsInteractor;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewSportsResponse, Integer> sportsCallback;

    @Inject
    public NewSportsInteractor sportsInteractor;

    @Inject
    public UserService userService;

    /* compiled from: MatchesController.kt */
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

    public MatchesController() {
        super(0, 1, null);
        this.favouriteType = FavouriteTypeK.Sports.INSTANCE;
        this.sportsCallback = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.MatchesController$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchesController.sportsCallback$lambda$9(MatchesController.this, fetchedResponseMessage);
            }
        };
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

    public final PutFavoriteSportsInteractor getPutFavoriteSportsInteractor() {
        PutFavoriteSportsInteractor putFavoriteSportsInteractor = this.putFavoriteSportsInteractor;
        if (putFavoriteSportsInteractor != null) {
            return putFavoriteSportsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("putFavoriteSportsInteractor");
        return null;
    }

    public final void setPutFavoriteSportsInteractor(PutFavoriteSportsInteractor putFavoriteSportsInteractor) {
        Intrinsics.checkNotNullParameter(putFavoriteSportsInteractor, "<set-?>");
        this.putFavoriteSportsInteractor = putFavoriteSportsInteractor;
    }

    public final DeleteFavoriteSportsInteractor getDeleteFavoriteSportsInteractor() {
        DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor = this.deleteFavoriteSportsInteractor;
        if (deleteFavoriteSportsInteractor != null) {
            return deleteFavoriteSportsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteFavoriteSportsInteractor");
        return null;
    }

    public final void setDeleteFavoriteSportsInteractor(DeleteFavoriteSportsInteractor deleteFavoriteSportsInteractor) {
        Intrinsics.checkNotNullParameter(deleteFavoriteSportsInteractor, "<set-?>");
        this.deleteFavoriteSportsInteractor = deleteFavoriteSportsInteractor;
    }

    public final PutFavoriteSportsBulkInteractor getPutFavoriteSportsBulkInteractor() {
        PutFavoriteSportsBulkInteractor putFavoriteSportsBulkInteractor = this.putFavoriteSportsBulkInteractor;
        if (putFavoriteSportsBulkInteractor != null) {
            return putFavoriteSportsBulkInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("putFavoriteSportsBulkInteractor");
        return null;
    }

    public final void setPutFavoriteSportsBulkInteractor(PutFavoriteSportsBulkInteractor putFavoriteSportsBulkInteractor) {
        Intrinsics.checkNotNullParameter(putFavoriteSportsBulkInteractor, "<set-?>");
        this.putFavoriteSportsBulkInteractor = putFavoriteSportsBulkInteractor;
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

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void bind(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.d("MatchesController", "Binding controller, current offset: " + getOffset() + ", isActive: " + getIsActive());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        if (getIsActive() && Intrinsics.areEqual(getContext(), context)) {
            Log.d("MatchesController", "Already bound to same context, skipping");
            return;
        }
        if (!this.isEventBusRegistered) {
            EventBus.getDefault().register(this);
            this.isEventBusRegistered = true;
        }
        super.bind(context);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void unbind() {
        Log.d("MatchesController", "Unbinding controller, current offset: " + getOffset());
        super.unbind();
        resetSearchState();
        if (this.isEventBusRegistered) {
            EventBus.getDefault().unregister(this);
            this.isEventBusRegistered = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    @Override // org.betup.ui.fragment.matches.BasePagingController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void loadPage(boolean append) {
        Long l;
        TourState tourState;
        TourComposeHelper tourComposeHelper;
        if (!getIsActive()) {
            Log.d("MatchesController", "Controller not active, skipping loadPage");
            return;
        }
        Log.d("MatchesController", "loadPage called, append: " + append + ", current offset: " + getCurrentOffset() + ", isActive: " + getIsActive() + ", query: '" + getCurrentQuery() + "'");
        setLoadingStates(append);
        try {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            tourState = (mainActivity == null || (tourComposeHelper = mainActivity.tourComposeHelper) == null) ? null : tourComposeHelper.getTourState();
        } catch (Exception unused) {
        }
        if ((tourState != null ? tourState.getCurrentStep() : null) == TourStep.SELECT_SPORT && tourState != null) {
            l = tourState.getTourSportId();
            NewSportsInteractor sportsInteractor = getSportsInteractor();
            BaseCachedSharedInteractor.OnFetchedListener<NewSportsResponse, Integer> onFetchedListener = this.sportsCallback;
            Bundle bundle = new Bundle();
            bundle.putInt("offset", getCurrentOffset());
            bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
            bundle.putString("name", getCurrentQuery());
            bundle.putString("matchDateFilter", getCurrentFilter().getName());
            if (l != null) {
                bundle.putLong("tourSportId", l.longValue());
                Log.d("MatchesController", "Adding tourSportId=" + l + " to request");
            }
            Unit unit = Unit.INSTANCE;
            sportsInteractor.load(onFetchedListener, null, bundle);
        }
        l = null;
        NewSportsInteractor sportsInteractor2 = getSportsInteractor();
        BaseCachedSharedInteractor.OnFetchedListener<NewSportsResponse, Integer> onFetchedListener2 = this.sportsCallback;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("offset", getCurrentOffset());
        bundle2.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        bundle2.putString("name", getCurrentQuery());
        bundle2.putString("matchDateFilter", getCurrentFilter().getName());
        if (l != null) {
        }
        Unit unit2 = Unit.INSTANCE;
        sportsInteractor2.load(onFetchedListener2, null, bundle2);
    }

    public final void onDeleteFavoriteSport(final SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!getIsActive()) {
            Log.d("MatchesController", "onDeleteFavoriteSport blocked: not active");
            return;
        }
        Log.d("MatchesController", "Removing favorite sport: " + item.getName() + " (using PUT)");
        removeFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.MatchesController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onDeleteFavoriteSport$lambda$1;
                onDeleteFavoriteSport$lambda$1 = MatchesController.onDeleteFavoriteSport$lambda$1(MatchesController.this, item, ((Boolean) obj).booleanValue());
                return onDeleteFavoriteSport$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeleteFavoriteSport$lambda$1(MatchesController matchesController, SportListItemUiModel sportListItemUiModel, boolean z) {
        if (!matchesController.getIsActive()) {
            return Unit.INSTANCE;
        }
        if (!z) {
            Log.e("MatchesController", "Failed to remove from favorites: " + sportListItemUiModel.getName());
            matchesController.handleError("Failed to remove from favorites");
        } else {
            Log.d("MatchesController", "Successfully removed from favorites: " + sportListItemUiModel.getName());
        }
        return Unit.INSTANCE;
    }

    public final void onAddFavoriteSport(final SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!getIsActive()) {
            Log.d("MatchesController", "onAddFavoriteSport blocked: not active");
            return;
        }
        Context context = getContext();
        if (context != null && SignInDialogManager.INSTANCE.shouldForceShow(getUserService())) {
            SignInDialogFragment.Companion.showDialog$default(SignInDialogFragment.INSTANCE, (Activity) context, null, 2, null);
        }
        Log.d("MatchesController", "Adding favorite sport: " + item.getName());
        addFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.MatchesController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onAddFavoriteSport$lambda$3;
                onAddFavoriteSport$lambda$3 = MatchesController.onAddFavoriteSport$lambda$3(MatchesController.this, item, ((Boolean) obj).booleanValue());
                return onAddFavoriteSport$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAddFavoriteSport$lambda$3(MatchesController matchesController, SportListItemUiModel sportListItemUiModel, boolean z) {
        if (!matchesController.getIsActive()) {
            return Unit.INSTANCE;
        }
        if (z) {
            Log.d("MatchesController", "Successfully added to favorites: " + sportListItemUiModel.getName());
        } else {
            Log.e("MatchesController", "Failed to add to favorites: " + sportListItemUiModel.getName());
            matchesController.handleError("Failed to add to favorites");
        }
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        getPutFavoriteSportsBulkInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, List<? extends Integer>>() { // from class: org.betup.ui.fragment.matches.MatchesController$saveFavorites$1
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
        Log.d("MatchesController", "Starting PUT approach for sports (replace)");
        Log.d("MatchesController", "Replacing favorites with: " + newIds);
        getPutFavoriteSportsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.MatchesController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                MatchesController.saveFavoritesWithDeleteAndPut$lambda$4(Function1.this, fetchedResponseMessage);
            }
        }, newIds, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveFavoritesWithDeleteAndPut$lambda$4(Function1 function1, FetchedResponseMessage fetchedResponseMessage) {
        boolean z = fetchedResponseMessage.getStat() == FetchStat.SUCCESS;
        Log.d("MatchesController", "PUT result: " + z);
        function1.invoke(Boolean.valueOf(z));
    }

    public final void navigateToLeagues(int id) {
        TourComposeHelper tourComposeHelper;
        if (!getIsActive()) {
            Log.d("MatchesController", "navigateToLeagues blocked: not active");
            return;
        }
        Log.d("MatchesController", "Navigating to leagues with sportId: " + id);
        TourState tourState = null;
        try {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity != null && (tourComposeHelper = mainActivity.tourComposeHelper) != null) {
                tourState = tourComposeHelper.getTourState();
            }
        } catch (Exception unused) {
        }
        if (tourState != null && tourState.getCurrentStep() == TourStep.SELECT_SPORT) {
            EventBus.getDefault().post(new TourActionMessage(TourActionMessage.Action.SPORT_SELECTED, Long.valueOf(id)));
            Log.d("MatchesController", "Posted TourActionMessage(SPORT_SELECTED) for sport ID: " + id);
        }
        Bundle bundle = new Bundle();
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, id);
        bundle.putBoolean("isLive", Intrinsics.areEqual(getMatchFilterState().getSelectedFilter().getValue(), NewMatchFilter.Live.INSTANCE));
        bundle.putString("filter", getMatchFilterState().getSelectedFilter().getValue().getName());
        Log.d("MatchesController", "Bundle created: sportId=" + id + ", isLive=" + bundle.getBoolean("isLive") + ", filter=" + bundle.getString("filter"));
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.LEAGUES, bundle));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onFilterChanged(SpecificChampionshipFragment.FilterChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!getIsActive()) {
            Log.d("MatchesController", "onFilterChanged blocked: not active");
            return;
        }
        Log.d("MatchesController", "Received FilterChangedEvent: " + event.getNewFilter());
        performFilterChange(event.getNewFilter());
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadInitial() {
        Log.d("MatchesController", "loadInitial called, current offset: " + getCurrentOffset());
        resetState();
        loadPage(false);
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    public void loadNextPage() {
        Log.d("MatchesController", "loadNextPage called, current offset: " + getCurrentOffset() + ", hasMore: " + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
        if (!getHasMoreData() || isLoadingMore().getValue().booleanValue() || isLoading().getValue().booleanValue()) {
            Log.d("MatchesController", "loadNextPage blocked: hasMore=" + getHasMoreData() + ", isLoadingMore=" + isLoadingMore().getValue() + ", isLoading=" + isLoading().getValue());
            return;
        }
        if (!getIsActive()) {
            Log.d("MatchesController", "loadNextPage blocked: not active");
            return;
        }
        setOffset(getOffset() + 10);
        Log.d("MatchesController", "Offset incremented to: " + getOffset());
        loadPage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sportsCallback$lambda$9(final MatchesController matchesController, FetchedResponseMessage fetchedResponseMessage) {
        NewMatchCount matchCount;
        String photoUrl;
        String name;
        List<NewSportsItem> items;
        Log.d("MatchesController", "onFetched callback executed! Stat: " + fetchedResponseMessage.getStat() + ", hasData: " + (fetchedResponseMessage.getModel() != null));
        Log.d("MatchesController", "Current query: '" + matchesController.getCurrentQuery() + "', offset: " + matchesController.getCurrentOffset());
        if (!matchesController.getIsActive()) {
            Log.d("MatchesController", "Controller not active, ignoring callback");
            return;
        }
        FetchStat stat = fetchedResponseMessage.getStat();
        int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Log.d("MatchesController", "NO_CONNECTION callback");
                matchesController.handleError("No internet connection");
                return;
            } else {
                Log.d("MatchesController", "ERROR callback: " + fetchedResponseMessage.getStat());
                matchesController.handleError("Failed to load sports");
                return;
            }
        }
        NewSportsResponse newSportsResponse = (NewSportsResponse) fetchedResponseMessage.getModel();
        Log.d("MatchesController", "SUCCESS callback - sports count: " + ((newSportsResponse == null || (items = newSportsResponse.getItems()) == null) ? 0 : items.size()));
        NewSportsResponse newSportsResponse2 = (NewSportsResponse) fetchedResponseMessage.getModel();
        if (newSportsResponse2 != null) {
            List<NewSportsItem> items2 = newSportsResponse2.getItems();
            Log.d("MatchesController", "Processing " + items2.size() + " sports for query: '" + matchesController.getCurrentQuery() + "', filter: " + matchesController.getCurrentFilter());
            List<NewSportsItem> list = items2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (final NewSportsItem newSportsItem : list) {
                NewMatchCount matchCount2 = newSportsItem.getMatchCount();
                int live = matchCount2 != null ? matchCount2.getLive() : 0;
                int currentCount = (Intrinsics.areEqual(matchesController.getCurrentFilter(), NewMatchFilter.Live.INSTANCE) || (matchCount = newSportsItem.getMatchCount()) == null) ? 0 : matchCount.getCurrentCount(matchesController.getCurrentFilter());
                NewSport sport = newSportsItem.getSport();
                int id = sport != null ? sport.getId() : 0;
                NewSport sport2 = newSportsItem.getSport();
                String str = (sport2 == null || (name = sport2.getName()) == null) ? "" : name;
                NewSport sport3 = newSportsItem.getSport();
                arrayList.add(new SportListItemUiModel(id, str, (sport3 == null || (photoUrl = sport3.getPhotoUrl()) == null) ? "" : photoUrl, currentCount, live, newSportsItem.isFavorite(), new Function0() { // from class: org.betup.ui.fragment.matches.MatchesController$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit sportsCallback$lambda$9$lambda$7$lambda$6$lambda$5;
                        sportsCallback$lambda$9$lambda$7$lambda$6$lambda$5 = MatchesController.sportsCallback$lambda$9$lambda$7$lambda$6$lambda$5(MatchesController.this, newSportsItem);
                        return sportsCallback$lambda$9$lambda$7$lambda$6$lambda$5;
                    }
                }));
            }
            ArrayList arrayList2 = arrayList;
            if (matchesController.getCurrentOffset() == 0) {
                Log.d("MatchesController", "Setting sports: " + arrayList2.size() + " items (reset) for query: '" + matchesController.getCurrentQuery() + "'");
                matchesController.get_items().setValue(arrayList2);
            } else {
                Log.d("MatchesController", "Appending sports: " + arrayList2.size() + " items (offset=" + matchesController.getCurrentOffset() + ") for query: '" + matchesController.getCurrentQuery() + "'");
                matchesController.get_items().setValue(CollectionsKt.plus((Collection) matchesController.get_items().getValue(), (Iterable) arrayList2));
            }
            matchesController.get_hasMore().setValue(Boolean.valueOf(items2.size() >= 10));
            Log.d("MatchesController", "hasMore set to: " + matchesController.get_hasMore().getValue());
            matchesController.handleSuccess();
            return;
        }
        Log.d("MatchesController", "Response model is null");
        matchesController.handleError("No data received");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sportsCallback$lambda$9$lambda$7$lambda$6$lambda$5(MatchesController matchesController, NewSportsItem newSportsItem) {
        NewSport sport = newSportsItem.getSport();
        matchesController.navigateToLeagues(sport != null ? sport.getId() : 0);
        return Unit.INSTANCE;
    }
}
