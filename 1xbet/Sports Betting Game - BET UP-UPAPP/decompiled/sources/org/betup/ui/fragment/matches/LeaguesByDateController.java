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
import okhttp3.ResponseBody;
import org.betup.BetUpApp;
import org.betup.bus.FavoritesUpdatedMessage;
import org.betup.bus.NavigateToMatchesByDateMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.DeleteFavoriteLeaguesInteractor;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.api.rest.matches.LeaguesByDateInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesBulkInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteLeaguesInteractor;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.leagues.NewLeagueItem;
import org.betup.model.remote.entity.leagues.NewLeaguesResponse;
import org.betup.model.remote.entity.sports.NewMatchCount;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.compose.SportListItemUiModel;
import org.betup.ui.fragment.matches.filter.DateFilterState;
import org.betup.ui.fragment.matches.filter.MatchFilterState;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: LeaguesByDateController.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00102\u001a\u00020\u0002H\u0014J\u001d\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010.¢\u0006\u0002\u0010<J\b\u0010=\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u000201H\u0014J\u000e\u0010@\u001a\u0002082\u0006\u0010A\u001a\u00020*J\u000e\u0010B\u001a\u0002082\u0006\u0010C\u001a\u00020DJ\u000e\u0010E\u001a\u0002082\u0006\u0010C\u001a\u00020DJ*\u0010F\u001a\u0002082\f\u0010G\u001a\b\u0012\u0004\u0012\u00020.0H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002080JH\u0016J8\u0010K\u001a\u0002082\f\u0010L\u001a\b\u0012\u0004\u0012\u00020.0H2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020.0H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002080JH\u0016J\u000e\u0010N\u001a\u0002082\u0006\u0010C\u001a\u00020DJ\u0010\u0010O\u001a\u0002082\u0006\u0010P\u001a\u00020QH\u0007R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0012\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\u000204X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u0010R\u001a\u0010\u0012\u0004\u0012\u00020T\u0012\u0006\u0012\u0004\u0018\u00010.0SX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lorg/betup/ui/fragment/matches/LeaguesByDateController;", "Lorg/betup/ui/fragment/matches/BasePagingController;", "Lorg/betup/ui/fragment/matches/FavoriteSaver;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "leaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/LeaguesByDateInteractor;", "getLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/LeaguesByDateInteractor;", "setLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/LeaguesByDateInteractor;)V", "putFavoriteLeaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;", "getPutFavoriteLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;", "setPutFavoriteLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesInteractor;)V", "deleteFavoriteLeaguesInteractor", "Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteLeaguesInteractor;", "getDeleteFavoriteLeaguesInteractor", "()Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteLeaguesInteractor;", "setDeleteFavoriteLeaguesInteractor", "(Lorg/betup/model/remote/api/rest/matches/DeleteFavoriteLeaguesInteractor;)V", "putFavoriteLeaguesBulkInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesBulkInteractor;", "getPutFavoriteLeaguesBulkInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesBulkInteractor;", "setPutFavoriteLeaguesBulkInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteLeaguesBulkInteractor;)V", "matchFilterState", "Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "getMatchFilterState", "()Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "setMatchFilterState", "(Lorg/betup/ui/fragment/matches/filter/MatchFilterState;)V", "dateFilterState", "Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "getDateFilterState", "()Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "setDateFilterState", "(Lorg/betup/ui/fragment/matches/filter/DateFilterState;)V", "currentSelectedDate", "", "getCurrentSelectedDate", "()Ljava/lang/String;", "leagueSportId", "", "Ljava/lang/Integer;", "isEventBusRegistered", "", "getFavoriteSaver", "favouriteType", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "getFavouriteType", "()Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "bind", "", "context", "Landroid/content/Context;", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "(Landroid/content/Context;Ljava/lang/Integer;)V", "unbind", "loadPage", "append", "performDateChange", "newDate", "onDeleteFavoriteLeague", "item", "Lorg/betup/ui/fragment/matches/compose/SportListItemUiModel;", "onAddFavoriteLeague", "saveFavorites", "ids", "", "onResult", "Lkotlin/Function1;", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "onLeagueClick", "onLeaguesFavouriteUpdated", "message", "Lorg/betup/bus/FavoritesUpdatedMessage;", "leaguesCallback", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/leagues/NewLeaguesResponse;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LeaguesByDateController extends BasePagingController implements FavoriteSaver {
    public static final int $stable = 8;

    @Inject
    public DateFilterState dateFilterState;

    @Inject
    public DeleteFavoriteLeaguesInteractor deleteFavoriteLeaguesInteractor;
    private final FavouriteTypeK favouriteType;
    private boolean isEventBusRegistered;
    private Integer leagueSportId;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewLeaguesResponse, Integer> leaguesCallback;

    @Inject
    public LeaguesByDateInteractor leaguesInteractor;

    @Inject
    public MatchFilterState matchFilterState;

    @Inject
    public PutFavoriteLeaguesBulkInteractor putFavoriteLeaguesBulkInteractor;

    @Inject
    public PutFavoriteLeaguesInteractor putFavoriteLeaguesInteractor;

    /* compiled from: LeaguesByDateController.kt */
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
    public LeaguesByDateController() {
        super(0, 1, null);
        this.favouriteType = FavouriteTypeK.Leagues.INSTANCE;
        this.leaguesCallback = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.LeaguesByDateController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                LeaguesByDateController.leaguesCallback$lambda$7(LeaguesByDateController.this, fetchedResponseMessage);
            }
        };
    }

    public final LeaguesByDateInteractor getLeaguesInteractor() {
        LeaguesByDateInteractor leaguesByDateInteractor = this.leaguesInteractor;
        if (leaguesByDateInteractor != null) {
            return leaguesByDateInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leaguesInteractor");
        return null;
    }

    public final void setLeaguesInteractor(LeaguesByDateInteractor leaguesByDateInteractor) {
        Intrinsics.checkNotNullParameter(leaguesByDateInteractor, "<set-?>");
        this.leaguesInteractor = leaguesByDateInteractor;
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

    public final void bind(Context context, Integer sportId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.d("LeaguesByDateController", "Binding with sportId: " + sportId);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type org.betup.BetUpApp");
        ((BetUpApp) applicationContext).getComponent().inject(this);
        boolean areEqual = Intrinsics.areEqual(this.leagueSportId, sportId);
        this.leagueSportId = sportId;
        if (getIsActive() && Intrinsics.areEqual(getContext(), context) && areEqual) {
            return;
        }
        if (!areEqual) {
            resetState();
            setInitialLoadDone(false);
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
        this.leagueSportId = null;
        resetSearchState();
        if (this.isEventBusRegistered) {
            EventBus.getDefault().unregister(this);
            this.isEventBusRegistered = false;
        }
    }

    @Override // org.betup.ui.fragment.matches.BasePagingController
    protected void loadPage(boolean append) {
        if (!getIsActive() || this.leagueSportId == null) {
            return;
        }
        setLoadingStates(append);
        LeaguesByDateInteractor leaguesInteractor = getLeaguesInteractor();
        BaseCachedSharedInteractor.OnFetchedListener<NewLeaguesResponse, Integer> onFetchedListener = this.leaguesCallback;
        Integer num = this.leagueSportId;
        Bundle bundle = new Bundle();
        bundle.putInt("offset", getOffset());
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, 10);
        Integer num2 = this.leagueSportId;
        Intrinsics.checkNotNull(num2);
        bundle.putInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, num2.intValue());
        bundle.putString("searchTerm", get_query().getValue());
        bundle.putString("date", getCurrentSelectedDate());
        Unit unit = Unit.INSTANCE;
        leaguesInteractor.load(onFetchedListener, num, bundle);
    }

    public final void performDateChange(String newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        if (Intrinsics.areEqual(newDate, getCurrentSelectedDate())) {
            return;
        }
        getDateFilterState().selectDate(newDate);
        refresh();
    }

    public final void onDeleteFavoriteLeague(SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (getIsActive()) {
            removeFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesByDateController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onDeleteFavoriteLeague$lambda$1;
                    onDeleteFavoriteLeague$lambda$1 = LeaguesByDateController.onDeleteFavoriteLeague$lambda$1(((Boolean) obj).booleanValue());
                    return onDeleteFavoriteLeague$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeleteFavoriteLeague$lambda$1(boolean z) {
        return Unit.INSTANCE;
    }

    public final void onAddFavoriteLeague(SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (getIsActive()) {
            addFavoriteAndSave(item.getId(), new Function1() { // from class: org.betup.ui.fragment.matches.LeaguesByDateController$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onAddFavoriteLeague$lambda$2;
                    onAddFavoriteLeague$lambda$2 = LeaguesByDateController.onAddFavoriteLeague$lambda$2(LeaguesByDateController.this, ((Boolean) obj).booleanValue());
                    return onAddFavoriteLeague$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAddFavoriteLeague$lambda$2(LeaguesByDateController leaguesByDateController, boolean z) {
        if (!leaguesByDateController.getIsActive()) {
            return Unit.INSTANCE;
        }
        if (!z) {
            leaguesByDateController.handleError("Failed to add to favorites");
        }
        return Unit.INSTANCE;
    }

    @Override // org.betup.ui.fragment.matches.FavoriteSaver
    public void saveFavorites(List<Integer> ids, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        getPutFavoriteLeaguesBulkInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener<ResponseBody, List<? extends Integer>>() { // from class: org.betup.ui.fragment.matches.LeaguesByDateController$saveFavorites$1
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
        getPutFavoriteLeaguesInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.LeaguesByDateController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                LeaguesByDateController.saveFavoritesWithDeleteAndPut$lambda$3(Function1.this, fetchedResponseMessage);
            }
        }, newIds, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveFavoritesWithDeleteAndPut$lambda$3(Function1 function1, FetchedResponseMessage fetchedResponseMessage) {
        function1.invoke(Boolean.valueOf(fetchedResponseMessage.getStat() == FetchStat.SUCCESS));
    }

    public final void onLeagueClick(SportListItemUiModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (getIsActive()) {
            Log.d("LeaguesByDateController", "League clicked: " + item.getName() + " (id: " + item.getId() + "), posting NavigateToMatchesByDateMessage");
            EventBus.getDefault().post(new NavigateToMatchesByDateMessage(item.getId(), getCurrentSelectedDate(), false, item.getName(), item.getPhotoUrl()));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onLeaguesFavouriteUpdated(FavoritesUpdatedMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (getIsActive() && Intrinsics.areEqual(message.getFavouriteType(), FavouriteTypeK.Leagues.INSTANCE)) {
            refresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void leaguesCallback$lambda$7(final LeaguesByDateController leaguesByDateController, FetchedResponseMessage fetchedResponseMessage) {
        ArrayList emptyList;
        List<NewLeagueItem> items;
        String photoUrl;
        String name;
        if (leaguesByDateController.getIsActive()) {
            FetchStat stat = fetchedResponseMessage.getStat();
            int i = stat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[stat.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    leaguesByDateController.handleError("No internet connection");
                    return;
                } else {
                    leaguesByDateController.handleError("Failed to load leagues");
                    return;
                }
            }
            NewLeaguesResponse newLeaguesResponse = (NewLeaguesResponse) fetchedResponseMessage.getModel();
            if (newLeaguesResponse == null || (items = newLeaguesResponse.getItems()) == null) {
                emptyList = CollectionsKt.emptyList();
            } else {
                List<NewLeagueItem> list = items;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (NewLeagueItem newLeagueItem : list) {
                    NewLeague league = newLeagueItem.getLeague();
                    int id = league != null ? league.getId() : 0;
                    NewLeague league2 = newLeagueItem.getLeague();
                    String str = (league2 == null || (name = league2.getName()) == null) ? "" : name;
                    NewLeague league3 = newLeagueItem.getLeague();
                    String str2 = (league3 == null || (photoUrl = league3.getPhotoUrl()) == null) ? "" : photoUrl;
                    NewMatchCount matchCount = newLeagueItem.getMatchCount();
                    int all = matchCount != null ? matchCount.getAll() - newLeagueItem.getMatchCount().getLive() : 0;
                    NewMatchCount matchCount2 = newLeagueItem.getMatchCount();
                    final SportListItemUiModel sportListItemUiModel = new SportListItemUiModel(id, str, str2, all, matchCount2 != null ? matchCount2.getLive() : 0, newLeagueItem.isFavorite(), new Function0() { // from class: org.betup.ui.fragment.matches.LeaguesByDateController$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    });
                    arrayList.add(SportListItemUiModel.copy$default(sportListItemUiModel, 0, null, null, 0, 0, false, new Function0() { // from class: org.betup.ui.fragment.matches.LeaguesByDateController$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit leaguesCallback$lambda$7$lambda$6$lambda$5;
                            leaguesCallback$lambda$7$lambda$6$lambda$5 = LeaguesByDateController.leaguesCallback$lambda$7$lambda$6$lambda$5(LeaguesByDateController.this, sportListItemUiModel);
                            return leaguesCallback$lambda$7$lambda$6$lambda$5;
                        }
                    }, 63, null));
                }
                emptyList = arrayList;
            }
            if (leaguesByDateController.getOffset() == 0) {
                leaguesByDateController.get_items().setValue(emptyList);
            } else {
                leaguesByDateController.get_items().setValue(CollectionsKt.plus((Collection) leaguesByDateController.get_items().getValue(), (Iterable) emptyList));
            }
            leaguesByDateController.get_hasMore().setValue(Boolean.valueOf(emptyList.size() >= 10));
            leaguesByDateController.handleSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit leaguesCallback$lambda$7$lambda$6$lambda$5(LeaguesByDateController leaguesByDateController, SportListItemUiModel sportListItemUiModel) {
        leaguesByDateController.onLeagueClick(sportListItemUiModel);
        return Unit.INSTANCE;
    }
}
