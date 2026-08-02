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
import okhttp3.ResponseBody;
import org.betup.BetUpApp;
import org.betup.bus.FavoritesUpdatedMessage;
import org.betup.bus.NavigateToLeaguesByDateMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteSportsInteractor;
import org.betup.model.remote.api.rest.matches.SportsByDateInteractor;
import org.betup.model.remote.entity.sports.NewMatchCount;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.sports.NewSportsItem;
import org.betup.model.remote.entity.sports.NewSportsResponse;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.dialogs.SignInDialogFragment;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.betup.ui.tour.compose.TourComposeHelper;
import org.betup.ui.tour.compose.TourState;
import org.betup.utils.SignInDialogManager;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SportsByDateController.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00105\u001a\u00020\u0002H\u0014J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020;H\u0016J\u0010\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u000204H\u0014J\u000e\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u000200J\u000e\u0010C\u001a\u00020;2\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u00020;2\u0006\u0010D\u001a\u00020EJ*\u0010G\u001a\u00020;2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020J0I2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020;0LH\u0016J8\u0010M\u001a\u00020;2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020J0I2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020J0I2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020;0LH\u0016J\u000e\u0010P\u001a\u00020;2\u0006\u0010D\u001a\u00020EJ\u0010\u0010Q\u001a\u00020;2\u0006\u0010R\u001a\u00020SH\u0007R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u000207X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001c\u0010T\u001a\u0010\u0012\u0004\u0012\u00020V\u0012\u0006\u0012\u0004\u0018\u00010J0UX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lorg/betup/ui/fragment/matches/SportsByDateController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "sportsInteractor", "Lorg/betup/model/remote/api/rest/matches/SportsByDateInteractor;", "getSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/SportsByDateInteractor;", "setSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/SportsByDateInteractor;)V", "putFavoriteSportsInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;", "getPutFavoriteSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;", "setPutFavoriteSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsInteractor;)V", "deleteFavoriteSportsInteractor", "Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;", "getDeleteFavoriteSportsInteractor", "()Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;", "setDeleteFavoriteSportsInteractor", "(Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteSportsInteractor;)V", "putFavoriteSportsBulkInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsBulkInteractor;", "getPutFavoriteSportsBulkInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsBulkInteractor;", "setPutFavoriteSportsBulkInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteSportsBulkInteractor;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "dateFilterState", "Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "getDateFilterState", "()Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "setDateFilterState", "(Lorg/betup/ui/fragment/matches/filter/DateFilterState;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "currentSelectedDate", "", "getCurrentSelectedDate", "()Ljava/lang/String;", "isEventBusRegistered", "", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "bind", "", "context", "Landroid/content/Context;", "unbind", "loadPage", "append", "performDateChange", "newDate", "onDeleteFavoriteSport", "item", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "onAddFavoriteSport", "saveFavorites", "ids", "", "", "onResult", "Lkotlin/Function1;", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "onSportClick", "onSportsFavouriteUpdated", "message", "Lorg/betup/bus/FavoritesUpdatedMessage;", "sportsCallback", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/sports/NewSportsResponse;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SportsByDateController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;

    @Inject
    public DateFilterState dateFilterState;

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
    public SportsByDateInteractor sportsInteractor;

    @Inject
    public UserService userService;

    /* compiled from: SportsByDateController.kt */
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

    @Inject
    public SportsByDateController() {
        super(0, 1, null);
        this.favouriteType = FavouriteTypeK.Sports.INSTANCE;
        this.sportsCallback = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.SportsByDateController$$ExternalSyntheticLambda4
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SportsByDateController.sportsCallback$lambda$11(SportsByDateController.this, fetchedResponseMessage);
            }
        };
    }

    public final SportsByDateInteractor getSportsInteractor() {
        SportsByDateInteractor sportsByDateInteractor = this.sportsInteractor;
        if (sportsByDateInteractor != null) {
            return sportsByDateInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportsInteractor");
        return null;
    }

    public final void setSportsInteractor(SportsByDateInteractor sportsByDateInteractor) {
        Intrinsics.checkNotNullParameter(sportsByDateInteractor, "<set-?>");
        this.sportsInteractor = sportsByDateInteractor;
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

    public final DateFilterState getDateFilterState() {
        DateFilterState dateFilterState = this.dateFilterState;
        if (dateFilterState != null) {
            return dateFilterState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dateFilterState");
        return null;
    }

    public final void setDateFilterState(DateFilterState dateFilterState) {
        Intrinsics.checkNotNullParameter(dateFilterState, "<set-?>");
        this.dateFilterState = dateFilterState;
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

    private final String getCurrentSelectedDate() {
        return getDateFilterState().getSelectedDate().getValue();
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
        Log.d("SportsByDateController", "Binding controller");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        if (getIsActive() && Intrinsics.areEqual(getContext(), context)) {
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
        super.unbind();
        resetSearchState();
        if (this.isEventBusRegistered) {
            EventBus.getDefault().unregister(this);
            this.isEventBusRegistered = false;
        }
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        BaseUserModel userModel;
        if (getIsActive()) {
            ShortUserProfileModel shortProfile = getUserService().getShortProfile();
            if ((shortProfile == null || (userModel = shortProfile.getUserModel()) == null) ? false : userModel.isTutorialComplete()) {
                setLoadingStates(append);
                SportsByDateInteractor sportsInteractor = getSportsInteractor();
                BaseCachedSharedInteractor.OnFetchedListener<NewSportsResponse, Integer> onFetchedListener = this.sportsCallback;
                Bundle bundle = new Bundle();
                bundle.putInt("offset", getOffset());
                bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
                bundle.putString("name", get_query().getValue());
                bundle.putString("date", getCurrentSelectedDate());
                Unit unit = Unit.INSTANCE;
                sportsInteractor.load(onFetchedListener, null, bundle);
                return;
            }
            setLoadingStates(append);
            SportsByDateInteractor sportsInteractor2 = getSportsInteractor();
            BaseCachedSharedInteractor.OnFetchedListener<NewSportsResponse, Integer> onFetchedListener2 = this.sportsCallback;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("offset", getOffset());
            bundle2.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
            bundle2.putString("name", get_query().getValue());
            bundle2.putString("date", getCurrentSelectedDate());
            Unit unit2 = Unit.INSTANCE;
            sportsInteractor2.load(onFetchedListener2, null, bundle2);
        }
    }

    public final void performDateChange(String newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        if (Intrinsics.areEqual(newDate, getCurrentSelectedDate())) {
            return;
        }
        getDateFilterState().selectDate(newDate);
        refresh();
    }

    public final void onDeleteFavoriteSport(SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (getIsActive()) {
            removeFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.SportsByDateController$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onDeleteFavoriteSport$lambda$2;
                    onDeleteFavoriteSport$lambda$2 = SportsByDateController.onDeleteFavoriteSport$lambda$2(((Boolean) obj).booleanValue());
                    return onDeleteFavoriteSport$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeleteFavoriteSport$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    public final void onAddFavoriteSport(SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (getIsActive()) {
            Context context = getContext();
            if (context != null && SignInDialogManager.INSTANCE.shouldForceShow(getUserService())) {
                SignInDialogFragment.Companion.showDialog$default(SignInDialogFragment.INSTANCE, (Activity) context, null, 2, null);
            }
            addFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.SportsByDateController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onAddFavoriteSport$lambda$4;
                    onAddFavoriteSport$lambda$4 = SportsByDateController.onAddFavoriteSport$lambda$4(SportsByDateController.this, ((Boolean) obj).booleanValue());
                    return onAddFavoriteSport$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAddFavoriteSport$lambda$4(SportsByDateController sportsByDateController, boolean z) {
        if (!sportsByDateController.getIsActive()) {
            return Unit.INSTANCE;
        }
        if (!z) {
            sportsByDateController.handleError("Failed to add to favorites");
        }
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        getPutFavoriteSportsBulkInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, List<? extends Integer>>() { // from class: org.betup.ui.fragment.matches.SportsByDateController$saveFavorites$1
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
        getPutFavoriteSportsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.SportsByDateController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                SportsByDateController.saveFavoritesWithDeleteAndPut$lambda$5(Function1.this, fetchedResponseMessage);
            }
        }, newIds, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveFavoritesWithDeleteAndPut$lambda$5(Function1 function1, FetchedResponseMessage fetchedResponseMessage) {
        function1.invoke(Boolean.valueOf(fetchedResponseMessage.getStat() == FetchStat.SUCCESS));
    }

    public final void onSportClick(SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (getIsActive()) {
            Log.d("SportsByDateController", "Sport clicked: " + item.getName() + " (id: " + item.getId() + "), posting NavigateToLeaguesByDateMessage");
            EventBus.getDefault().post(new NavigateToLeaguesByDateMessage(item.getId(), getCurrentSelectedDate()));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onSportsFavouriteUpdated(FavoritesUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (getIsActive() && Intrinsics.areEqual(message.getFavouriteType(), FavouriteTypeK.Sports.INSTANCE)) {
            refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sportsCallback$lambda$11(final SportsByDateController sportsByDateController, FetchedResponseMessage fetchedResponseMessage) {
        ArrayList emptyList;
        TourComposeHelper tourComposeHelper;
        TourState tourState;
        BaseUserModel userModel;
        List<NewSportsItem> items;
        String photoUrl;
        String name;
        if (sportsByDateController.getIsActive()) {
            FetchStat stat = fetchedResponseMessage.getStat();
            int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    sportsByDateController.handleError("No internet connection");
                    return;
                } else {
                    sportsByDateController.handleError("Failed to load sports");
                    return;
                }
            }
            NewSportsResponse newSportsResponse = (NewSportsResponse) fetchedResponseMessage.getModel();
            if (newSportsResponse == null || (items = newSportsResponse.getItems()) == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                List<NewSportsItem> list = items;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (NewSportsItem newSportsItem : list) {
                    NewSport sport = newSportsItem.getSport();
                    int id = sport != null ? sport.getId() : 0;
                    NewSport sport2 = newSportsItem.getSport();
                    String str = (sport2 == null || (name = sport2.getName()) == null) ? "" : name;
                    NewSport sport3 = newSportsItem.getSport();
                    String str2 = (sport3 == null || (photoUrl = sport3.getPhotoUrl()) == null) ? "" : photoUrl;
                    NewMatchCount matchCount = newSportsItem.getMatchCount();
                    int all = matchCount != null ? matchCount.getAll() - newSportsItem.getMatchCount().getLive() : 0;
                    NewMatchCount matchCount2 = newSportsItem.getMatchCount();
                    final SportListItemUiModel sportListItemUiModel = new SportListItemUiModel(id, str, str2, all, matchCount2 != null ? matchCount2.getLive() : 0, newSportsItem.isFavorite(), new Function0() { // from class: org.betup.ui.fragment.matches.SportsByDateController$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    });
                    arrayList.add(SportListItemUiModel.copy$default(sportListItemUiModel, 0, null, null, 0, 0, false, new Function0() { // from class: org.betup.ui.fragment.matches.SportsByDateController$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit sportsCallback$lambda$11$lambda$8$lambda$7;
                            sportsCallback$lambda$11$lambda$8$lambda$7 = SportsByDateController.sportsCallback$lambda$11$lambda$8$lambda$7(SportsByDateController.this, sportListItemUiModel);
                            return sportsCallback$lambda$11$lambda$8$lambda$7;
                        }
                    }, 63, null));
                }
                emptyList = arrayList;
            }
            ShortUserProfileModel shortProfile = sportsByDateController.getUserService().getShortProfile();
            if (!((shortProfile == null || (userModel = shortProfile.getUserModel()) == null) ? false : userModel.isTutorialComplete()) && sportsByDateController.getOffset() == 0) {
                try {
                    Context context = sportsByDateController.getContext();
                    Object obj = null;
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                    Long tourSportId = (mainActivity == null || (tourComposeHelper = mainActivity.tourComposeHelper) == null || (tourState = tourComposeHelper.getTourState()) == null) ? null : tourState.getTourSportId();
                    if (tourSportId != null) {
                        Iterator<T> it = emptyList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((SportListItemUiModel) next).getId() == ((int) tourSportId.longValue())) {
                                obj = next;
                                break;
                            }
                        }
                        SportListItemUiModel sportListItemUiModel2 = (SportListItemUiModel) obj;
                        if (sportListItemUiModel2 != null) {
                            List listOf = CollectionsKt.listOf(sportListItemUiModel2);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : emptyList) {
                                if (((SportListItemUiModel) obj2).getId() != ((int) tourSportId.longValue())) {
                                    arrayList2.add(obj2);
                                }
                            }
                            emptyList = CollectionsKt.plus((Collection) listOf, (Iterable) arrayList2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (sportsByDateController.getOffset() == 0) {
                sportsByDateController.get_items().setValue(emptyList);
            } else {
                sportsByDateController.get_items().setValue(CollectionsKt.plus((Collection) sportsByDateController.get_items().getValue(), (Iterable) emptyList));
            }
            sportsByDateController.get_hasMore().setValue(Boolean.valueOf(emptyList.size() >= 10));
            sportsByDateController.handleSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sportsCallback$lambda$11$lambda$8$lambda$7(SportsByDateController sportsByDateController, SportListItemUiModel sportListItemUiModel) {
        sportsByDateController.onSportClick(sportListItemUiModel);
        return Unit.INSTANCE;
    }
}
