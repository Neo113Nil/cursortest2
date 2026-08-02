package org.betup.ui.fragment.matches.details;

import android.content.Context;
import android.util.Log;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.FavoritesUpdatedMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.matches.GetFavoriteTeamIdsInteractor;
import org.betup.model.remote.api.rest.matches.GetTeamDetailsInteractor;
import org.betup.model.remote.api.rest.matches.PutFavoriteTeamsInteractor;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchDetailsAwayTeamModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsHomeTeamModel;
import org.betup.model.remote.entity.matches.history.MatchHistoryType;
import org.betup.model.remote.entity.sports.SportsDataModel;
import org.betup.model.remote.entity.teams.SingleTeamDataModel;
import org.betup.model.remote.entity.teams.TeamDetailsResponseModel;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryCategoryUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryMatchUiItem;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchHistoryTeamUiItem;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TeamDetailsController.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002TUB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010G\u001a\u00020H2\u0006\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010I\u001a\u00020HJ\b\u0010J\u001a\u00020HH\u0002J\u001c\u0010K\u001a\u00020H2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030MH\u0016J\u0016\u0010N\u001a\u00020H2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\b\u0010P\u001a\u00020HH\u0002J\u0006\u0010Q\u001a\u00020HJ\u0006\u0010R\u001a\u00020HJ\u0006\u0010S\u001a\u00020HR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0)¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0)¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020$0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020$0)¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020$0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020$0)¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0016\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090)¢\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0016\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090)¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u001a\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0-0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0-0)¢\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u001a\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0-0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0-0)¢\u0006\b\n\u0000\u001a\u0004\bF\u0010+¨\u0006V"}, d2 = {"Lorg/betup/ui/fragment/matches/details/TeamDetailsController;", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/teams/TeamDetailsResponseModel;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "getTeamDetailsInteractor", "Lorg/betup/model/remote/api/rest/matches/GetTeamDetailsInteractor;", "getGetTeamDetailsInteractor", "()Lorg/betup/model/remote/api/rest/matches/GetTeamDetailsInteractor;", "setGetTeamDetailsInteractor", "(Lorg/betup/model/remote/api/rest/matches/GetTeamDetailsInteractor;)V", "getFavoriteTeamIdsInteractor", "Lorg/betup/model/remote/api/rest/matches/GetFavoriteTeamIdsInteractor;", "getGetFavoriteTeamIdsInteractor", "()Lorg/betup/model/remote/api/rest/matches/GetFavoriteTeamIdsInteractor;", "setGetFavoriteTeamIdsInteractor", "(Lorg/betup/model/remote/api/rest/matches/GetFavoriteTeamIdsInteractor;)V", "putFavoriteTeamsInteractor", "Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsInteractor;", "getPutFavoriteTeamsInteractor", "()Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsInteractor;", "setPutFavoriteTeamsInteractor", "(Lorg/betup/model/remote/api/rest/matches/PutFavoriteTeamsInteractor;)V", "userService", "Lorg/betup/services/user/UserService;", "getUserService", "()Lorg/betup/services/user/UserService;", "setUserService", "(Lorg/betup/services/user/UserService;)V", "controllerScope", "Lkotlinx/coroutines/CoroutineScope;", "teamId", "context", "Landroid/content/Context;", "isActive", "", "_team", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/betup/model/remote/entity/teams/SingleTeamDataModel;", "team", "Lkotlinx/coroutines/flow/StateFlow;", "getTeam", "()Lkotlinx/coroutines/flow/StateFlow;", "_pastMatches", "", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsDataModel;", "pastMatches", "getPastMatches", "_futureMatches", "futureMatches", "getFutureMatches", "_isFavourite", "isFavourite", "_isLoading", "isLoading", "_error", "", "error", "getError", "_favoriteError", "favoriteError", "getFavoriteError", "_formResults", "Lorg/betup/ui/fragment/matches/details/TeamDetailsController$MatchFormResult;", "formResults", "getFormResults", "_historyCategories", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "historyCategories", "getHistoryCategories", "bind", "", "unbind", "loadTeamDetails", "onFetched", "response", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "calculateFormResults", "matches", "convertToHistoryCategories", "toggleFavorite", "clearFavoriteError", "refresh", VastTagName.COMPANION, "MatchFormResult", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TeamDetailsController implements BaseCachedSharedInteractor.OnFetchedListener<TeamDetailsResponseModel, Long> {
    private static final String TAG = "TeamDetailsController";
    private final MutableStateFlow<String> _error;
    private final MutableStateFlow<String> _favoriteError;
    private final MutableStateFlow<List<MatchFormResult>> _formResults;
    private final MutableStateFlow<List<MatchDetailsDataModel>> _futureMatches;
    private final MutableStateFlow<List<MatchHistoryCategoryUiItem>> _historyCategories;
    private final MutableStateFlow<Boolean> _isFavourite;
    private final MutableStateFlow<Boolean> _isLoading;
    private final MutableStateFlow<List<MatchDetailsDataModel>> _pastMatches;
    private final MutableStateFlow<SingleTeamDataModel> _team;
    private Context context;
    private final CoroutineScope controllerScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    private final StateFlow<String> error;
    private final StateFlow<String> favoriteError;
    private final StateFlow<List<MatchFormResult>> formResults;
    private final StateFlow<List<MatchDetailsDataModel>> futureMatches;

    @Inject
    public GetFavoriteTeamIdsInteractor getFavoriteTeamIdsInteractor;

    @Inject
    public GetTeamDetailsInteractor getTeamDetailsInteractor;
    private final StateFlow<List<MatchHistoryCategoryUiItem>> historyCategories;
    private boolean isActive;
    private final StateFlow<Boolean> isFavourite;
    private final StateFlow<Boolean> isLoading;
    private final StateFlow<List<MatchDetailsDataModel>> pastMatches;

    @Inject
    public PutFavoriteTeamsInteractor putFavoriteTeamsInteractor;
    private final StateFlow<SingleTeamDataModel> team;
    private long teamId;

    @Inject
    public UserService userService;
    public static final int $stable = 8;

    public TeamDetailsController() {
        MutableStateFlow<SingleTeamDataModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._team = MutableStateFlow;
        this.team = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<MatchDetailsDataModel>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._pastMatches = MutableStateFlow2;
        this.pastMatches = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<MatchDetailsDataModel>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._futureMatches = MutableStateFlow3;
        this.futureMatches = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isFavourite = MutableStateFlow4;
        this.isFavourite = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(false);
        this._isLoading = MutableStateFlow5;
        this.isLoading = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<String> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this._error = MutableStateFlow6;
        this.error = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<String> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this._favoriteError = MutableStateFlow7;
        this.favoriteError = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<List<MatchFormResult>> MutableStateFlow8 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._formResults = MutableStateFlow8;
        this.formResults = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<List<MatchHistoryCategoryUiItem>> MutableStateFlow9 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._historyCategories = MutableStateFlow9;
        this.historyCategories = FlowKt.asStateFlow(MutableStateFlow9);
    }

    public final GetTeamDetailsInteractor getGetTeamDetailsInteractor() {
        GetTeamDetailsInteractor getTeamDetailsInteractor = this.getTeamDetailsInteractor;
        if (getTeamDetailsInteractor != null) {
            return getTeamDetailsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getTeamDetailsInteractor");
        return null;
    }

    public final void setGetTeamDetailsInteractor(GetTeamDetailsInteractor getTeamDetailsInteractor) {
        Intrinsics.checkNotNullParameter(getTeamDetailsInteractor, "<set-?>");
        this.getTeamDetailsInteractor = getTeamDetailsInteractor;
    }

    public final GetFavoriteTeamIdsInteractor getGetFavoriteTeamIdsInteractor() {
        GetFavoriteTeamIdsInteractor getFavoriteTeamIdsInteractor = this.getFavoriteTeamIdsInteractor;
        if (getFavoriteTeamIdsInteractor != null) {
            return getFavoriteTeamIdsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getFavoriteTeamIdsInteractor");
        return null;
    }

    public final void setGetFavoriteTeamIdsInteractor(GetFavoriteTeamIdsInteractor getFavoriteTeamIdsInteractor) {
        Intrinsics.checkNotNullParameter(getFavoriteTeamIdsInteractor, "<set-?>");
        this.getFavoriteTeamIdsInteractor = getFavoriteTeamIdsInteractor;
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

    public final StateFlow<SingleTeamDataModel> getTeam() {
        return this.team;
    }

    public final StateFlow<List<MatchDetailsDataModel>> getPastMatches() {
        return this.pastMatches;
    }

    public final StateFlow<List<MatchDetailsDataModel>> getFutureMatches() {
        return this.futureMatches;
    }

    public final StateFlow<Boolean> isFavourite() {
        return this.isFavourite;
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final StateFlow<String> getError() {
        return this.error;
    }

    public final StateFlow<String> getFavoriteError() {
        return this.favoriteError;
    }

    /* compiled from: TeamDetailsController.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/fragment/matches/details/TeamDetailsController$MatchFormResult;", "", "result", "Lorg/betup/ui/fragment/matches/details/TeamDetailsController$MatchFormResult$ResultType;", "matchId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/details/TeamDetailsController$MatchFormResult$ResultType;J)V", "getResult", "()Lorg/betup/ui/fragment/matches/details/TeamDetailsController$MatchFormResult$ResultType;", "getMatchId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ResultType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchFormResult {
        public static final int $stable = 0;
        private final long matchId;
        private final ResultType result;

        public static /* synthetic */ MatchFormResult copy$default(MatchFormResult matchFormResult, ResultType resultType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                resultType = matchFormResult.result;
            }
            if ((i & 2) != 0) {
                j = matchFormResult.matchId;
            }
            return matchFormResult.copy(resultType, j);
        }

        /* renamed from: component1, reason: from getter */
        public final ResultType getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final long getMatchId() {
            return this.matchId;
        }

        public final MatchFormResult copy(ResultType result, long matchId) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new MatchFormResult(result, matchId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchFormResult)) {
                return false;
            }
            MatchFormResult matchFormResult = (MatchFormResult) other;
            return this.result == matchFormResult.result && this.matchId == matchFormResult.matchId;
        }

        public int hashCode() {
            return (this.result.hashCode() * 31) + Long.hashCode(this.matchId);
        }

        public String toString() {
            return "MatchFormResult(result=" + this.result + ", matchId=" + this.matchId + ")";
        }

        public MatchFormResult(ResultType result, long j) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.matchId = j;
        }

        public final ResultType getResult() {
            return this.result;
        }

        public final long getMatchId() {
            return this.matchId;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TeamDetailsController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/matches/details/TeamDetailsController$MatchFormResult$ResultType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WIN", "DRAW", "LOSS", "CANCELED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ResultType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ResultType[] $VALUES;
            public static final ResultType WIN = new ResultType("WIN", 0);
            public static final ResultType DRAW = new ResultType("DRAW", 1);
            public static final ResultType LOSS = new ResultType("LOSS", 2);
            public static final ResultType CANCELED = new ResultType("CANCELED", 3);

            private static final /* synthetic */ ResultType[] $values() {
                return new ResultType[]{WIN, DRAW, LOSS, CANCELED};
            }

            public static EnumEntries<ResultType> getEntries() {
                return $ENTRIES;
            }

            private ResultType(String str, int i) {
            }

            static {
                ResultType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static ResultType valueOf(String str) {
                return (ResultType) Enum.valueOf(ResultType.class, str);
            }

            public static ResultType[] values() {
                return (ResultType[]) $VALUES.clone();
            }
        }
    }

    public final StateFlow<List<MatchFormResult>> getFormResults() {
        return this.formResults;
    }

    public final StateFlow<List<MatchHistoryCategoryUiItem>> getHistoryCategories() {
        return this.historyCategories;
    }

    public final void bind(Context context, long teamId) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.teamId = teamId;
        this.isActive = true;
        Context applicationContext = context.getApplicationContext();
        BetUpApp betUpApp = applicationContext instanceof BetUpApp ? (BetUpApp) applicationContext : null;
        if (betUpApp == null) {
            return;
        }
        betUpApp.getComponent().inject(this);
        loadTeamDetails();
    }

    public final void unbind() {
        this.isActive = false;
        this.context = null;
    }

    private final void loadTeamDetails() {
        long j = this.teamId;
        if (j <= 0) {
            Log.w(TAG, "Invalid teamId: " + j);
            return;
        }
        this._isLoading.setValue(true);
        this._error.setValue(null);
        getGetTeamDetailsInteractor().load(this, Long.valueOf(this.teamId), null);
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<TeamDetailsResponseModel, Long> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.isActive) {
            this._isLoading.setValue(false);
            if (response.getStat() != FetchStat.SUCCESS) {
                this._error.setValue("Failed to load team details");
                Log.e(TAG, "Failed to load team details: " + response.getStat());
                return;
            }
            TeamDetailsResponseModel model = response.getModel();
            if (model == null) {
                this._error.setValue("No team data received");
                return;
            }
            this._team.setValue(model.getTeam());
            MutableStateFlow<List<MatchDetailsDataModel>> mutableStateFlow = this._pastMatches;
            List<MatchDetailsDataModel> pastMatches = model.getPastMatches();
            if (pastMatches == null) {
                pastMatches = CollectionsKt.emptyList();
            }
            mutableStateFlow.setValue(pastMatches);
            MutableStateFlow<List<MatchDetailsDataModel>> mutableStateFlow2 = this._futureMatches;
            List<MatchDetailsDataModel> futureMatches = model.getFutureMatches();
            if (futureMatches == null) {
                futureMatches = CollectionsKt.emptyList();
            }
            mutableStateFlow2.setValue(futureMatches);
            MutableStateFlow<Boolean> mutableStateFlow3 = this._isFavourite;
            Boolean isFavourite = model.getIsFavourite();
            mutableStateFlow3.setValue(Boolean.valueOf(isFavourite != null ? isFavourite.booleanValue() : false));
            List<MatchDetailsDataModel> pastMatches2 = model.getPastMatches();
            if (pastMatches2 == null) {
                pastMatches2 = CollectionsKt.emptyList();
            }
            calculateFormResults(pastMatches2);
            convertToHistoryCategories();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
    
        if (r6 <= (r7 != null ? r7.floatValue() : 0.0f)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        r1 = org.betup.ui.fragment.matches.details.TeamDetailsController.MatchFormResult.ResultType.WIN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
    
        if (r3 > (r1 != null ? r1.floatValue() : 0.0f)) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void calculateFormResults(List<? extends MatchDetailsDataModel> matches) {
        MatchFormResult.ResultType resultType;
        MatchFormResult matchFormResult;
        Integer id;
        Integer id2;
        List<MatchDetailsDataModel> take = CollectionsKt.take(matches, 5);
        ArrayList arrayList = new ArrayList();
        for (MatchDetailsDataModel matchDetailsDataModel : take) {
            Integer id3 = matchDetailsDataModel.getId();
            boolean z = false;
            long intValue = id3 != null ? id3.intValue() : 0;
            if (intValue <= 0) {
                matchFormResult = null;
            } else {
                MatchState state = matchDetailsDataModel.getState();
                if (state == MatchState.CANCELED || state == MatchState.PROCESSING) {
                    resultType = MatchFormResult.ResultType.CANCELED;
                } else if (state == MatchState.FINISHED) {
                    int i = (int) this.teamId;
                    MatchDetailsHomeTeamModel homeTeam = matchDetailsDataModel.getHomeTeam();
                    boolean z2 = (homeTeam == null || (id2 = homeTeam.getId()) == null || id2.intValue() != i) ? false : true;
                    MatchDetailsAwayTeamModel awayTeam = matchDetailsDataModel.getAwayTeam();
                    if (awayTeam != null && (id = awayTeam.getId()) != null && id.intValue() == i) {
                        z = true;
                    }
                    if (!z2 && !z) {
                        resultType = MatchFormResult.ResultType.CANCELED;
                    } else {
                        Float scoreHome = matchDetailsDataModel.getScoreHome();
                        if (scoreHome == null || !scoreHome.equals(matchDetailsDataModel.getScoreAway())) {
                            if (z2) {
                                Float scoreHome2 = matchDetailsDataModel.getScoreHome();
                                float floatValue = scoreHome2 != null ? scoreHome2.floatValue() : 0.0f;
                                Float scoreAway = matchDetailsDataModel.getScoreAway();
                            }
                            if (z) {
                                Float scoreAway2 = matchDetailsDataModel.getScoreAway();
                                float floatValue2 = scoreAway2 != null ? scoreAway2.floatValue() : 0.0f;
                                Float scoreHome3 = matchDetailsDataModel.getScoreHome();
                            }
                            resultType = MatchFormResult.ResultType.LOSS;
                        } else {
                            resultType = MatchFormResult.ResultType.DRAW;
                        }
                    }
                } else {
                    resultType = MatchFormResult.ResultType.CANCELED;
                }
                matchFormResult = new MatchFormResult(resultType, intValue);
            }
            if (matchFormResult != null) {
                arrayList.add(matchFormResult);
            }
        }
        this._formResults.setValue(arrayList);
    }

    private final void convertToHistoryCategories() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer id;
        Integer id2;
        String str6;
        String str7;
        int i;
        String str8;
        String str9;
        Integer id3;
        String name;
        Integer id4;
        ArrayList arrayList = new ArrayList();
        String str10 = "";
        if (this._pastMatches.getValue().isEmpty()) {
            str = "";
        } else {
            List<MatchDetailsDataModel> take = CollectionsKt.take(this._pastMatches.getValue(), 5);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
            for (MatchDetailsDataModel matchDetailsDataModel : take) {
                MatchDetailsHomeTeamModel homeTeam = matchDetailsDataModel.getHomeTeam();
                long intValue = (homeTeam == null || (id4 = homeTeam.getId()) == null) ? 0 : id4.intValue();
                MatchDetailsHomeTeamModel homeTeam2 = matchDetailsDataModel.getHomeTeam();
                if (homeTeam2 == null || (str6 = homeTeam2.getPhotoUrl()) == null) {
                    str6 = str10;
                }
                MatchDetailsHomeTeamModel homeTeam3 = matchDetailsDataModel.getHomeTeam();
                MatchHistoryTeamUiItem matchHistoryTeamUiItem = new MatchHistoryTeamUiItem(intValue, str6, (homeTeam3 == null || (name = homeTeam3.getName()) == null) ? str10 : name);
                MatchDetailsAwayTeamModel awayTeam = matchDetailsDataModel.getAwayTeam();
                if (awayTeam == null || (id3 = awayTeam.getId()) == null) {
                    str7 = str10;
                    i = 0;
                } else {
                    i = id3.intValue();
                    str7 = str10;
                }
                long j = i;
                MatchDetailsAwayTeamModel awayTeam2 = matchDetailsDataModel.getAwayTeam();
                if (awayTeam2 == null || (str8 = awayTeam2.getPhotoUrl()) == null) {
                    str8 = str7;
                }
                MatchDetailsAwayTeamModel awayTeam3 = matchDetailsDataModel.getAwayTeam();
                if (awayTeam3 == null || (str9 = awayTeam3.getName()) == null) {
                    str9 = str7;
                }
                MatchHistoryTeamUiItem matchHistoryTeamUiItem2 = new MatchHistoryTeamUiItem(j, str8, str9);
                String date = matchDetailsDataModel.getDate();
                String str11 = date == null ? str7 : date;
                Float scoreHome = matchDetailsDataModel.getScoreHome();
                int floatValue = (int) (scoreHome != null ? scoreHome.floatValue() : 0.0f);
                Float scoreAway = matchDetailsDataModel.getScoreAway();
                arrayList2.add(new MatchHistoryMatchUiItem(matchHistoryTeamUiItem, matchHistoryTeamUiItem2, str11, floatValue, (int) (scoreAway != null ? scoreAway.floatValue() : 0.0f), matchDetailsDataModel.getId() != null ? r8.intValue() : 0));
                str10 = str7;
            }
            str = str10;
            arrayList.add(new MatchHistoryCategoryUiItem(MatchHistoryType.RECENT_GAMES, "last_matches", null, arrayList2));
        }
        if (!this._futureMatches.getValue().isEmpty()) {
            List<MatchDetailsDataModel> take2 = CollectionsKt.take(this._futureMatches.getValue(), 5);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(take2, 10));
            for (MatchDetailsDataModel matchDetailsDataModel2 : take2) {
                MatchDetailsHomeTeamModel homeTeam4 = matchDetailsDataModel2.getHomeTeam();
                long intValue2 = (homeTeam4 == null || (id2 = homeTeam4.getId()) == null) ? 0 : id2.intValue();
                MatchDetailsHomeTeamModel homeTeam5 = matchDetailsDataModel2.getHomeTeam();
                if (homeTeam5 == null || (str2 = homeTeam5.getPhotoUrl()) == null) {
                    str2 = str;
                }
                MatchDetailsHomeTeamModel homeTeam6 = matchDetailsDataModel2.getHomeTeam();
                if (homeTeam6 == null || (str3 = homeTeam6.getName()) == null) {
                    str3 = str;
                }
                MatchHistoryTeamUiItem matchHistoryTeamUiItem3 = new MatchHistoryTeamUiItem(intValue2, str2, str3);
                MatchDetailsAwayTeamModel awayTeam4 = matchDetailsDataModel2.getAwayTeam();
                long intValue3 = (awayTeam4 == null || (id = awayTeam4.getId()) == null) ? 0 : id.intValue();
                MatchDetailsAwayTeamModel awayTeam5 = matchDetailsDataModel2.getAwayTeam();
                if (awayTeam5 == null || (str4 = awayTeam5.getPhotoUrl()) == null) {
                    str4 = str;
                }
                MatchDetailsAwayTeamModel awayTeam6 = matchDetailsDataModel2.getAwayTeam();
                if (awayTeam6 == null || (str5 = awayTeam6.getName()) == null) {
                    str5 = str;
                }
                MatchHistoryTeamUiItem matchHistoryTeamUiItem4 = new MatchHistoryTeamUiItem(intValue3, str4, str5);
                String date2 = matchDetailsDataModel2.getDate();
                String str12 = date2 == null ? str : date2;
                Float scoreHome2 = matchDetailsDataModel2.getScoreHome();
                int floatValue2 = (int) (scoreHome2 != null ? scoreHome2.floatValue() : 0.0f);
                Float scoreAway2 = matchDetailsDataModel2.getScoreAway();
                arrayList3.add(new MatchHistoryMatchUiItem(matchHistoryTeamUiItem3, matchHistoryTeamUiItem4, str12, floatValue2, (int) (scoreAway2 != null ? scoreAway2.floatValue() : 0.0f), matchDetailsDataModel2.getId() != null ? r4.intValue() : 0));
            }
            arrayList.add(new MatchHistoryCategoryUiItem(MatchHistoryType.RECENT_GAMES, "next_matches", null, arrayList3));
        }
        this._historyCategories.setValue(arrayList);
    }

    public final void toggleFavorite() {
        String str;
        SportsDataModel sport;
        Integer id;
        String str2;
        if (!getUserService().isRegistered() || getUserService().isAnonymous()) {
            Log.w(TAG, "User not registered or anonymous, cannot toggle favorite");
            MutableStateFlow<String> mutableStateFlow = this._favoriteError;
            Context context = this.context;
            if (context == null || (str = context.getString(R.string.auth_failed)) == null) {
                str = "User not registered";
            }
            mutableStateFlow.setValue(str);
            return;
        }
        if (this._isLoading.getValue().booleanValue()) {
            Log.w(TAG, "Still loading team details, cannot toggle favorite");
            MutableStateFlow<String> mutableStateFlow2 = this._favoriteError;
            Context context2 = this.context;
            if (context2 == null || (str2 = context2.getString(R.string.loading)) == null) {
                str2 = "Please wait, data is loading";
            }
            mutableStateFlow2.setValue(str2);
            return;
        }
        final boolean booleanValue = this._isFavourite.getValue().booleanValue();
        final int i = (int) this.teamId;
        SingleTeamDataModel value = this._team.getValue();
        getGetFavoriteTeamIdsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.TeamDetailsController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                TeamDetailsController.toggleFavorite$lambda$6(TeamDetailsController.this, booleanValue, i, fetchedResponseMessage);
            }
        }, Integer.valueOf((value == null || (sport = value.getSport()) == null || (id = sport.getId()) == null) ? 22 : id.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleFavorite$lambda$6(final TeamDetailsController teamDetailsController, final boolean z, int i, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        if (teamDetailsController.isActive) {
            if (fetchedResponseMessage.getStat() != FetchStat.SUCCESS) {
                MutableStateFlow<String> mutableStateFlow = teamDetailsController._favoriteError;
                Context context = teamDetailsController.context;
                if (context == null || (str = context.getString(R.string.unknown_error)) == null) {
                    str = "Failed to load favorites";
                }
                mutableStateFlow.setValue(str);
                Log.e(TAG, "Failed to load favorite team ids: " + fetchedResponseMessage.getStat());
                return;
            }
            List list = (List) fetchedResponseMessage.getModel();
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
            }
            List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            if (z) {
                mutableList.remove(Integer.valueOf(i));
            } else if (!mutableList.contains(Integer.valueOf(i))) {
                mutableList.add(Integer.valueOf(i));
            }
            teamDetailsController.getPutFavoriteTeamsInteractor().load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.matches.details.TeamDetailsController$$ExternalSyntheticLambda1
                @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
                public final void onFetched(FetchedResponseMessage fetchedResponseMessage2) {
                    TeamDetailsController.toggleFavorite$lambda$6$lambda$5(TeamDetailsController.this, z, fetchedResponseMessage2);
                }
            }, mutableList, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toggleFavorite$lambda$6$lambda$5(TeamDetailsController teamDetailsController, boolean z, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        if (teamDetailsController.isActive) {
            if (fetchedResponseMessage.getStat() == FetchStat.SUCCESS) {
                teamDetailsController._isFavourite.setValue(Boolean.valueOf(!z));
                teamDetailsController._favoriteError.setValue(null);
                EventBus.getDefault().post(new FavoritesUpdatedMessage(FavouriteTypeK.Teams.INSTANCE, true));
                Log.d(TAG, z ? "Team removed from favorites" : "Team added to favorites");
                return;
            }
            MutableStateFlow<String> mutableStateFlow = teamDetailsController._favoriteError;
            Context context = teamDetailsController.context;
            if (context == null || (str = context.getString(R.string.unknown_error)) == null) {
                str = z ? "Failed to remove from favorites" : "Failed to add to favorites";
            }
            mutableStateFlow.setValue(str);
            Log.e(TAG, "Failed to update favorites: " + fetchedResponseMessage.getStat());
            EventBus.getDefault().post(new FavoritesUpdatedMessage(FavouriteTypeK.Teams.INSTANCE, false));
        }
    }

    public final void clearFavoriteError() {
        this._favoriteError.setValue(null);
    }

    public final void refresh() {
        loadTeamDetails();
    }
}
