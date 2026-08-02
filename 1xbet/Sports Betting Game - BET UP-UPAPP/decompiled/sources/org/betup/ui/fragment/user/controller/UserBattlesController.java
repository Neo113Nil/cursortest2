package org.betup.ui.fragment.user.controller;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserAvailableChallengesInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserBattleCountsInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserChallengesHistoryInteractor;
import org.betup.model.remote.api.rest.challenges.NewUserPrivateChallengesInteractor;
import org.betup.model.remote.api.rest.matches.MatchMyBetsInteractor;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.ChallengeCreator;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewUserBattleLeagueModel;
import org.betup.model.remote.entity.challenges.NewUserBattleMatchModel;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.model.remote.entity.challenges.NewUserBattleSportModel;
import org.betup.model.remote.entity.challenges.NewUserBattleTeamModel;
import org.betup.model.remote.entity.challenges.NewUserBattlesResponseModel;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsMapperKt;
import org.betup.model.remote.entity.challenges.V7ChallengeDetailsResponseModel;
import org.betup.model.remote.entity.challenges.V7UserBattlesHistoryResponseModel;
import org.betup.model.remote.entity.user.BaseUserModel;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.events.ChallengeAcceptedOrCreatedEvent;
import org.betup.ui.dialogs.events.OpenBetSelectionEvent;
import org.betup.ui.dialogs.events.OpenChallengePreviewDialog;
import org.betup.ui.fragment.user.compose.items.NewUserBattleCreator;
import org.betup.ui.fragment.user.compose.items.NewUserBattleLeague;
import org.betup.ui.fragment.user.compose.items.NewUserBattleMatch;
import org.betup.ui.fragment.user.compose.items.NewUserBattleSport;
import org.betup.ui.fragment.user.compose.items.NewUserBattleTeam;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserBattlesController.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010Z\u001a\u00020[J\u0010\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020^H\u0007J\u0006\u0010_\u001a\u00020[J\u0006\u0010g\u001a\u00020[J\u0006\u0010h\u001a\u00020[J\u0006\u0010i\u001a\u00020[J\u0006\u0010j\u001a\u00020[J\u0017\u0010k\u001a\u00020[2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010:¢\u0006\u0002\u0010mJ\u0006\u0010n\u001a\u00020[J\u001f\u0010o\u001a\u00020[2\u0006\u0010p\u001a\u00020c2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010c¢\u0006\u0002\u0010rJ \u0010s\u001a\u00020[2\u0006\u0010p\u001a\u00020c2\u0010\b\u0002\u0010t\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010$J\u0006\u0010u\u001a\u00020[J\u0015\u0010w\u001a\u00020:2\b\u0010x\u001a\u0004\u0018\u00010:¢\u0006\u0002\u0010yJ\u0010\u0010z\u001a\u00020[2\u0006\u0010{\u001a\u000203H\u0002J\u0006\u0010|\u001a\u00020[J\u0006\u0010}\u001a\u00020[R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030'¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020:X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0'¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u000e\u0010D\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0$0'¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\bK\u0010)R\u0014\u0010L\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\bM\u0010)R\u000e\u0010N\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010O\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0004\n\u0002\u0010PR\u001a\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0$0'¢\u0006\b\n\u0000\u001a\u0004\bT\u0010)R\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020+0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020+0'¢\u0006\b\n\u0000\u001a\u0004\bV\u0010)R\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00020:0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020:0'¢\u0006\b\n\u0000\u001a\u0004\bY\u0010)R\u001a\u0010`\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010d\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020c0aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010e\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020c0aX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010v\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0$\u0012\u0004\u0012\u00020c0aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006~"}, d2 = {"Lorg/betup/ui/fragment/user/controller/UserBattlesController;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "newUserAvailableChallengesInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserAvailableChallengesInteractor;", "getNewUserAvailableChallengesInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserAvailableChallengesInteractor;", "setNewUserAvailableChallengesInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserAvailableChallengesInteractor;)V", "newUserPrivateChallengesInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserPrivateChallengesInteractor;", "getNewUserPrivateChallengesInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserPrivateChallengesInteractor;", "setNewUserPrivateChallengesInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserPrivateChallengesInteractor;)V", "newUserChallengesHistoryInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserChallengesHistoryInteractor;", "getNewUserChallengesHistoryInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserChallengesHistoryInteractor;", "setNewUserChallengesHistoryInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserChallengesHistoryInteractor;)V", "newUserBattleCountsInteractor", "Lorg/betup/model/remote/api/rest/challenges/NewUserBattleCountsInteractor;", "getNewUserBattleCountsInteractor", "()Lorg/betup/model/remote/api/rest/challenges/NewUserBattleCountsInteractor;", "setNewUserBattleCountsInteractor", "(Lorg/betup/model/remote/api/rest/challenges/NewUserBattleCountsInteractor;)V", "userServiceP", "Lorg/betup/services/user/UserService;", "getUserServiceP", "()Lorg/betup/services/user/UserService;", "setUserServiceP", "(Lorg/betup/services/user/UserService;)V", "_availableBattles", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleUiItem;", "availableBattles", "Lkotlinx/coroutines/flow/StateFlow;", "getAvailableBattles", "()Lkotlinx/coroutines/flow/StateFlow;", "_isBattlesLoading", "", "isBattlesLoading", "_hasMoreAvailableBattles", "hasMoreAvailableBattles", "getHasMoreAvailableBattles", "_isLoadMoreAvailableBattles", "isLoadMoreAvailableBattles", "_battlesError", "", "battlesError", "getBattlesError", "_canRetryBattles", "canRetryBattles", "getCanRetryBattles", "availableBattlesOffset", "", "battlesLimit", "_privateBattles", "privateBattles", "getPrivateBattles", "_hasMorePrivateBattles", "hasMorePrivateBattles", "getHasMorePrivateBattles", "_isLoadMorePrivateBattles", "isLoadMorePrivateBattles", "privateBattlesOffset", "_statsBattles", "Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "statsBattles", "getStatsBattles", "_hasMoreStatsBattles", "hasMoreStatsBattles", "getHasMoreStatsBattles", "_isLoadMoreStatsBattles", "isLoadMoreStatsBattles", "statsBattlesOffset", "currentParticipantState", "Ljava/lang/Integer;", "_battleCounts", "Lorg/betup/model/remote/entity/challenges/BattleCountModel;", "battleCounts", "getBattleCounts", "_isLoadingBattleCounts", "isLoadingBattleCounts", "_totalItems", "totalItems", "getTotalItems", "destroy", "", "onChallengesChanged", "message", "Lorg/betup/ui/dialogs/events/ChallengeAcceptedOrCreatedEvent;", "refreshAllBattles", "availableBattlesListener", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/challenges/NewUserBattlesResponseModel;", "", "privateBattlesListener", "statsBattlesListener", "Lorg/betup/model/remote/entity/challenges/V7UserBattlesHistoryResponseModel;", "loadAvailableBattles", "loadMoreAvailableBattles", "loadPrivateBattles", "loadMorePrivateBattles", "loadStatsBattles", "participantState", "(Ljava/lang/Integer;)V", "loadMoreStatsBattles", "acceptBattle", "battleId", "matchId", "(JLjava/lang/Long;)V", "openBattlePreview", "challengeIds", "loadBattleCounts", "battleCountsListener", "getCountForState", "state", "(Ljava/lang/Integer;)I", "handleBattlesError", "errorMessage", "retryBattles", "clearBattlesError", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserBattlesController {
    public static final int $stable = 8;
    private final MutableStateFlow<List<NewUserBattleUiItem>> _availableBattles;
    private final MutableStateFlow<List<BattleCountModel>> _battleCounts;
    private final MutableStateFlow<String> _battlesError;
    private final MutableStateFlow<Boolean> _canRetryBattles;
    private final MutableStateFlow<Boolean> _hasMoreAvailableBattles;
    private final MutableStateFlow<Boolean> _hasMorePrivateBattles;
    private final MutableStateFlow<Boolean> _hasMoreStatsBattles;
    private final MutableStateFlow<Boolean> _isBattlesLoading;
    private final MutableStateFlow<Boolean> _isLoadMoreAvailableBattles;
    private final MutableStateFlow<Boolean> _isLoadMorePrivateBattles;
    private final MutableStateFlow<Boolean> _isLoadMoreStatsBattles;
    private final MutableStateFlow<Boolean> _isLoadingBattleCounts;
    private final MutableStateFlow<List<NewUserBattleUiItem>> _privateBattles;
    private final MutableStateFlow<List<NewUserBattleModel>> _statsBattles;
    private final MutableStateFlow<Integer> _totalItems;
    private final StateFlow<List<NewUserBattleUiItem>> availableBattles;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBattlesResponseModel, Long> availableBattlesListener;
    private int availableBattlesOffset;
    private final StateFlow<List<BattleCountModel>> battleCounts;
    private final BaseCachedSharedInteractor.OnFetchedListener<List<BattleCountModel>, Long> battleCountsListener;
    private final StateFlow<String> battlesError;
    private final int battlesLimit;
    private final StateFlow<Boolean> canRetryBattles;
    private Integer currentParticipantState;
    private final StateFlow<Boolean> hasMoreAvailableBattles;
    private final StateFlow<Boolean> hasMorePrivateBattles;
    private final StateFlow<Boolean> hasMoreStatsBattles;
    private final StateFlow<Boolean> isBattlesLoading;
    private final StateFlow<Boolean> isLoadMoreAvailableBattles;
    private final StateFlow<Boolean> isLoadMorePrivateBattles;
    private final StateFlow<Boolean> isLoadMoreStatsBattles;
    private final StateFlow<Boolean> isLoadingBattleCounts;

    @Inject
    public NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor;

    @Inject
    public NewUserBattleCountsInteractor newUserBattleCountsInteractor;

    @Inject
    public NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor;

    @Inject
    public NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor;
    private final StateFlow<List<NewUserBattleUiItem>> privateBattles;
    private final BaseCachedSharedInteractor.OnFetchedListener<NewUserBattlesResponseModel, Long> privateBattlesListener;
    private int privateBattlesOffset;
    private final StateFlow<List<NewUserBattleModel>> statsBattles;
    private final BaseCachedSharedInteractor.OnFetchedListener<V7UserBattlesHistoryResponseModel, Long> statsBattlesListener;
    private int statsBattlesOffset;
    private final StateFlow<Integer> totalItems;

    @Inject
    public UserService userServiceP;

    @Inject
    public UserBattlesController() {
        MutableStateFlow<List<NewUserBattleUiItem>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._availableBattles = MutableStateFlow;
        this.availableBattles = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._isBattlesLoading = MutableStateFlow2;
        this.isBattlesLoading = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreAvailableBattles = MutableStateFlow3;
        this.hasMoreAvailableBattles = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreAvailableBattles = MutableStateFlow4;
        this.isLoadMoreAvailableBattles = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this._battlesError = MutableStateFlow5;
        this.battlesError = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(false);
        this._canRetryBattles = MutableStateFlow6;
        this.canRetryBattles = FlowKt.asStateFlow(MutableStateFlow6);
        this.battlesLimit = 20;
        MutableStateFlow<List<NewUserBattleUiItem>> MutableStateFlow7 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._privateBattles = MutableStateFlow7;
        this.privateBattles = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(true);
        this._hasMorePrivateBattles = MutableStateFlow8;
        this.hasMorePrivateBattles = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMorePrivateBattles = MutableStateFlow9;
        this.isLoadMorePrivateBattles = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<List<NewUserBattleModel>> MutableStateFlow10 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._statsBattles = MutableStateFlow10;
        this.statsBattles = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow<Boolean> MutableStateFlow11 = StateFlowKt.MutableStateFlow(true);
        this._hasMoreStatsBattles = MutableStateFlow11;
        this.hasMoreStatsBattles = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow<Boolean> MutableStateFlow12 = StateFlowKt.MutableStateFlow(false);
        this._isLoadMoreStatsBattles = MutableStateFlow12;
        this.isLoadMoreStatsBattles = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow<List<BattleCountModel>> MutableStateFlow13 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._battleCounts = MutableStateFlow13;
        this.battleCounts = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow<Boolean> MutableStateFlow14 = StateFlowKt.MutableStateFlow(false);
        this._isLoadingBattleCounts = MutableStateFlow14;
        this.isLoadingBattleCounts = FlowKt.asStateFlow(MutableStateFlow14);
        MutableStateFlow<Integer> MutableStateFlow15 = StateFlowKt.MutableStateFlow(0);
        this._totalItems = MutableStateFlow15;
        this.totalItems = FlowKt.asStateFlow(MutableStateFlow15);
        EventBus.getDefault().register(this);
        Log.d("UserBattlesController", "EventBus registered: " + EventBus.getDefault().isRegistered(this));
        this.availableBattlesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.controller.UserBattlesController$$ExternalSyntheticLambda0
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserBattlesController.availableBattlesListener$lambda$10(UserBattlesController.this, fetchedResponseMessage);
            }
        };
        this.privateBattlesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.controller.UserBattlesController$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserBattlesController.privateBattlesListener$lambda$18(UserBattlesController.this, fetchedResponseMessage);
            }
        };
        this.statsBattlesListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.controller.UserBattlesController$$ExternalSyntheticLambda2
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserBattlesController.statsBattlesListener$lambda$20(UserBattlesController.this, fetchedResponseMessage);
            }
        };
        this.battleCountsListener = new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.ui.fragment.user.controller.UserBattlesController$$ExternalSyntheticLambda3
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                UserBattlesController.battleCountsListener$lambda$25(UserBattlesController.this, fetchedResponseMessage);
            }
        };
    }

    public final NewUserAvailableChallengesInteractor getNewUserAvailableChallengesInteractor() {
        NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor = this.newUserAvailableChallengesInteractor;
        if (newUserAvailableChallengesInteractor != null) {
            return newUserAvailableChallengesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserAvailableChallengesInteractor");
        return null;
    }

    public final void setNewUserAvailableChallengesInteractor(NewUserAvailableChallengesInteractor newUserAvailableChallengesInteractor) {
        Intrinsics.checkNotNullParameter(newUserAvailableChallengesInteractor, "<set-?>");
        this.newUserAvailableChallengesInteractor = newUserAvailableChallengesInteractor;
    }

    public final NewUserPrivateChallengesInteractor getNewUserPrivateChallengesInteractor() {
        NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor = this.newUserPrivateChallengesInteractor;
        if (newUserPrivateChallengesInteractor != null) {
            return newUserPrivateChallengesInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserPrivateChallengesInteractor");
        return null;
    }

    public final void setNewUserPrivateChallengesInteractor(NewUserPrivateChallengesInteractor newUserPrivateChallengesInteractor) {
        Intrinsics.checkNotNullParameter(newUserPrivateChallengesInteractor, "<set-?>");
        this.newUserPrivateChallengesInteractor = newUserPrivateChallengesInteractor;
    }

    public final NewUserChallengesHistoryInteractor getNewUserChallengesHistoryInteractor() {
        NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor = this.newUserChallengesHistoryInteractor;
        if (newUserChallengesHistoryInteractor != null) {
            return newUserChallengesHistoryInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserChallengesHistoryInteractor");
        return null;
    }

    public final void setNewUserChallengesHistoryInteractor(NewUserChallengesHistoryInteractor newUserChallengesHistoryInteractor) {
        Intrinsics.checkNotNullParameter(newUserChallengesHistoryInteractor, "<set-?>");
        this.newUserChallengesHistoryInteractor = newUserChallengesHistoryInteractor;
    }

    public final NewUserBattleCountsInteractor getNewUserBattleCountsInteractor() {
        NewUserBattleCountsInteractor newUserBattleCountsInteractor = this.newUserBattleCountsInteractor;
        if (newUserBattleCountsInteractor != null) {
            return newUserBattleCountsInteractor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newUserBattleCountsInteractor");
        return null;
    }

    public final void setNewUserBattleCountsInteractor(NewUserBattleCountsInteractor newUserBattleCountsInteractor) {
        Intrinsics.checkNotNullParameter(newUserBattleCountsInteractor, "<set-?>");
        this.newUserBattleCountsInteractor = newUserBattleCountsInteractor;
    }

    public final UserService getUserServiceP() {
        UserService userService = this.userServiceP;
        if (userService != null) {
            return userService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userServiceP");
        return null;
    }

    public final void setUserServiceP(UserService userService) {
        Intrinsics.checkNotNullParameter(userService, "<set-?>");
        this.userServiceP = userService;
    }

    public final StateFlow<List<NewUserBattleUiItem>> getAvailableBattles() {
        return this.availableBattles;
    }

    public final StateFlow<Boolean> isBattlesLoading() {
        return this.isBattlesLoading;
    }

    public final StateFlow<Boolean> getHasMoreAvailableBattles() {
        return this.hasMoreAvailableBattles;
    }

    public final StateFlow<Boolean> isLoadMoreAvailableBattles() {
        return this.isLoadMoreAvailableBattles;
    }

    public final StateFlow<String> getBattlesError() {
        return this.battlesError;
    }

    public final StateFlow<Boolean> getCanRetryBattles() {
        return this.canRetryBattles;
    }

    public final StateFlow<List<NewUserBattleUiItem>> getPrivateBattles() {
        return this.privateBattles;
    }

    public final StateFlow<Boolean> getHasMorePrivateBattles() {
        return this.hasMorePrivateBattles;
    }

    public final StateFlow<Boolean> isLoadMorePrivateBattles() {
        return this.isLoadMorePrivateBattles;
    }

    public final StateFlow<List<NewUserBattleModel>> getStatsBattles() {
        return this.statsBattles;
    }

    public final StateFlow<Boolean> getHasMoreStatsBattles() {
        return this.hasMoreStatsBattles;
    }

    public final StateFlow<Boolean> isLoadMoreStatsBattles() {
        return this.isLoadMoreStatsBattles;
    }

    public final StateFlow<List<BattleCountModel>> getBattleCounts() {
        return this.battleCounts;
    }

    public final StateFlow<Boolean> isLoadingBattleCounts() {
        return this.isLoadingBattleCounts;
    }

    public final StateFlow<Integer> getTotalItems() {
        return this.totalItems;
    }

    public final void destroy() {
        EventBus.getDefault().unregister(this);
        Log.d("UserBattlesController", "EventBus unregistered");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onChallengesChanged(ChallengeAcceptedOrCreatedEvent message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("UserBattlesController", "ChallengesChangedMessage received, refreshing battles");
        Log.d("UserBattlesController", "EventBus registration status: " + EventBus.getDefault().isRegistered(this));
        Log.d("UserBattlesController", "Current available battles count: " + this._availableBattles.getValue().size());
        Log.d("UserBattlesController", "Current private battles count: " + this._privateBattles.getValue().size());
        Log.d("UserBattlesController", "Current stats battles count: " + this._statsBattles.getValue().size());
        Log.d("UserBattlesController", "Refreshing all battles lists");
        refreshAllBattles();
    }

    public final void refreshAllBattles() {
        Log.d("UserBattlesController", "refreshAllBattles called");
        this.availableBattlesOffset = 0;
        this.privateBattlesOffset = 0;
        this.statsBattlesOffset = 0;
        this.currentParticipantState = null;
        this._hasMoreAvailableBattles.setValue(true);
        this._hasMorePrivateBattles.setValue(true);
        this._hasMoreStatsBattles.setValue(true);
        this._availableBattles.setValue(CollectionsKt.emptyList());
        this._privateBattles.setValue(CollectionsKt.emptyList());
        this._statsBattles.setValue(CollectionsKt.emptyList());
        this._battlesError.setValue(null);
        this._canRetryBattles.setValue(false);
        getNewUserAvailableChallengesInteractor().invalidate();
        getNewUserPrivateChallengesInteractor().invalidate();
        getNewUserChallengesHistoryInteractor().invalidate();
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.availableBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserAvailableChallengesInteractor().load(this.availableBattlesListener, 0L, bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("offset", this.privateBattlesOffset);
        bundle2.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserPrivateChallengesInteractor().load(this.privateBattlesListener, 0L, bundle2);
        Bundle bundle3 = new Bundle();
        bundle3.putInt("offset", this.statsBattlesOffset);
        bundle3.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserChallengesHistoryInteractor().load(this.statsBattlesListener, 0L, bundle3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [int] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v4, types: [int] */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [int] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [int] */
    /* JADX WARN: Type inference failed for: r37v2 */
    public static final void availableBattlesListener$lambda$10(UserBattlesController userBattlesController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        String str2;
        Iterator it;
        boolean z;
        NewUserBattleMatch newUserBattleMatch;
        NewUserBattleLeague newUserBattleLeague;
        NewUserBattleTeam newUserBattleTeam;
        NewUserBattleTeam newUserBattleTeam2;
        NewUserBattleSport newUserBattleSport;
        int i;
        FetchStat stat2;
        boolean z2 = false;
        userBattlesController._isLoadMoreAvailableBattles.setValue(false);
        userBattlesController._isBattlesLoading.setValue(false);
        String str3 = "UserBattlesController";
        if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat2 = fetchedResponseMessage.getStat()) == null) ? null : stat2.name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            List<NewUserBattleModel> items = ((NewUserBattlesResponseModel) fetchedResponseMessage.getModel()).getItems();
            if (items == null) {
                items = CollectionsKt.emptyList();
            }
            List<NewUserBattleModel> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NewUserBattleModel newUserBattleModel = (NewUserBattleModel) it2.next();
                NewUserBattleMatchModel match = newUserBattleModel.getMatch();
                long id = newUserBattleModel.getId();
                long moneyAccept = newUserBattleModel.getMoneyAccept();
                long enterFee = newUserBattleModel.getEnterFee();
                long moneyToWin = newUserBattleModel.getMoneyToWin();
                ChallengeState state = newUserBattleModel.getState();
                ChallengeCreator creatorOrFromParticipants = newUserBattleModel.getCreatorOrFromParticipants();
                long id2 = creatorOrFromParticipants.getId();
                String name = creatorOrFromParticipants.getName();
                String str4 = name == null ? "" : name;
                String email = creatorOrFromParticipants.getEmail();
                String str5 = email == null ? "" : email;
                String photoUrl = creatorOrFromParticipants.getPhotoUrl();
                NewUserBattleCreator newUserBattleCreator = new NewUserBattleCreator(id2, str4, str5, photoUrl == null ? "" : photoUrl);
                if (match != null) {
                    long id3 = match.getId();
                    NewUserBattleLeagueModel league = match.getLeague();
                    if (league != null) {
                        Integer id4 = league.getId();
                        if (id4 != null) {
                            it = it2;
                            i = id4.intValue();
                        } else {
                            it = it2;
                            i = 0;
                        }
                        String photoUrl2 = league.getPhotoUrl();
                        str2 = str3;
                        String str6 = photoUrl2 == null ? "" : photoUrl2;
                        String name2 = league.getName();
                        if (name2 == null) {
                            name2 = "";
                        }
                        newUserBattleLeague = new NewUserBattleLeague(i, str6, name2);
                    } else {
                        str2 = str3;
                        it = it2;
                        newUserBattleLeague = new NewUserBattleLeague(0, "", "");
                    }
                    NewUserBattleLeague newUserBattleLeague2 = newUserBattleLeague;
                    NewUserBattleTeamModel awayTeam = match.getAwayTeam();
                    if (awayTeam != null) {
                        Integer id5 = awayTeam.getId();
                        int intValue = id5 != null ? id5.intValue() : 0;
                        String photoUrl3 = awayTeam.getPhotoUrl();
                        if (photoUrl3 == null) {
                            photoUrl3 = "";
                        }
                        String name3 = awayTeam.getName();
                        if (name3 == null) {
                            name3 = "";
                        }
                        newUserBattleTeam = new NewUserBattleTeam(intValue, photoUrl3, name3);
                    } else {
                        newUserBattleTeam = new NewUserBattleTeam(0, "", "");
                    }
                    NewUserBattleTeamModel homeTeam = match.getHomeTeam();
                    if (homeTeam != null) {
                        Integer id6 = homeTeam.getId();
                        int intValue2 = id6 != null ? id6.intValue() : 0;
                        String photoUrl4 = homeTeam.getPhotoUrl();
                        if (photoUrl4 == null) {
                            photoUrl4 = "";
                        }
                        String name4 = homeTeam.getName();
                        if (name4 == null) {
                            name4 = "";
                        }
                        newUserBattleTeam2 = new NewUserBattleTeam(intValue2, photoUrl4, name4);
                        z = false;
                    } else {
                        z = false;
                        newUserBattleTeam2 = new NewUserBattleTeam(0, "", "");
                    }
                    NewUserBattleSportModel sport = match.getSport();
                    if (sport != null) {
                        Integer id7 = sport.getId();
                        ?? intValue3 = id7 != null ? id7.intValue() : z;
                        String photoUrl5 = sport.getPhotoUrl();
                        String str7 = photoUrl5 == null ? "" : photoUrl5;
                        String name5 = sport.getName();
                        String str8 = name5 == null ? "" : name5;
                        String period = sport.getPeriod();
                        newUserBattleSport = new NewUserBattleSport(intValue3, str7, str8, period == null ? "" : period, sport.getPhotoBackground());
                    } else {
                        newUserBattleSport = new NewUserBattleSport(0, "", "", "", null);
                    }
                    Integer scoreAway = match.getScoreAway();
                    ?? intValue4 = scoreAway != null ? scoreAway.intValue() : z;
                    Integer scoreHome = match.getScoreHome();
                    ?? intValue5 = scoreHome != null ? scoreHome.intValue() : z;
                    String date = match.getDate();
                    String str9 = date == null ? "" : date;
                    Integer matchState = match.getMatchState();
                    ?? intValue6 = matchState != null ? matchState.intValue() : z;
                    String currentTime = match.getCurrentTime();
                    String str10 = currentTime == null ? "" : currentTime;
                    String currentPeriod = match.getCurrentPeriod();
                    newUserBattleMatch = new NewUserBattleMatch(id3, newUserBattleLeague2, newUserBattleTeam, newUserBattleTeam2, newUserBattleSport, intValue4, intValue5, str9, intValue6, currentPeriod == null ? "" : currentPeriod, str10, match.getResultRaw());
                } else {
                    str2 = str3;
                    it = it2;
                    z = z2;
                    newUserBattleMatch = null;
                }
                ChallengeState.NONE participantState = newUserBattleModel.getParticipantState();
                if (participantState == null) {
                    participantState = ChallengeState.NONE.INSTANCE;
                }
                arrayList.add(new NewUserBattleUiItem(id, moneyAccept, enterFee, moneyToWin, state, participantState, newUserBattleCreator, newUserBattleMatch));
                it2 = it;
                z2 = z;
                str3 = str2;
            }
            String str11 = str3;
            boolean z3 = z2;
            ArrayList arrayList2 = arrayList;
            if (userBattlesController.availableBattlesOffset == 0) {
                userBattlesController._availableBattles.setValue(arrayList2);
            } else {
                MutableStateFlow<List<NewUserBattleUiItem>> mutableStateFlow = userBattlesController._availableBattles;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
            }
            userBattlesController._hasMoreAvailableBattles.setValue(Boolean.valueOf(items.size() >= userBattlesController.battlesLimit ? true : z3));
            userBattlesController._battlesError.setValue(null);
            userBattlesController._canRetryBattles.setValue(false);
            Log.d(str11, "Available battles loaded: " + items.size() + ", limit: " + userBattlesController.battlesLimit + ", hasMore: " + userBattlesController._hasMoreAvailableBattles.getValue() + ", current offset: " + userBattlesController.availableBattlesOffset);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.w("UserBattlesController", "Failed to load available battles: " + str);
        userBattlesController.handleBattlesError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [int] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v4, types: [int] */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [int] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [int] */
    /* JADX WARN: Type inference failed for: r37v2 */
    public static final void privateBattlesListener$lambda$18(UserBattlesController userBattlesController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        String str2;
        Iterator it;
        boolean z;
        NewUserBattleMatch newUserBattleMatch;
        NewUserBattleLeague newUserBattleLeague;
        NewUserBattleTeam newUserBattleTeam;
        NewUserBattleTeam newUserBattleTeam2;
        NewUserBattleSport newUserBattleSport;
        int i;
        FetchStat stat2;
        boolean z2 = false;
        userBattlesController._isLoadMorePrivateBattles.setValue(false);
        userBattlesController._isBattlesLoading.setValue(false);
        String str3 = "UserBattlesController";
        if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat2 = fetchedResponseMessage.getStat()) == null) ? null : stat2.name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            List<NewUserBattleModel> items = ((NewUserBattlesResponseModel) fetchedResponseMessage.getModel()).getItems();
            if (items == null) {
                items = CollectionsKt.emptyList();
            }
            List<NewUserBattleModel> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NewUserBattleModel newUserBattleModel = (NewUserBattleModel) it2.next();
                NewUserBattleMatchModel match = newUserBattleModel.getMatch();
                long id = newUserBattleModel.getId();
                long moneyAccept = newUserBattleModel.getMoneyAccept();
                long enterFee = newUserBattleModel.getEnterFee();
                long moneyToWin = newUserBattleModel.getMoneyToWin();
                ChallengeState state = newUserBattleModel.getState();
                ChallengeCreator creatorOrFromParticipants = newUserBattleModel.getCreatorOrFromParticipants();
                long id2 = creatorOrFromParticipants.getId();
                String name = creatorOrFromParticipants.getName();
                String str4 = name == null ? "" : name;
                String email = creatorOrFromParticipants.getEmail();
                String str5 = email == null ? "" : email;
                String photoUrl = creatorOrFromParticipants.getPhotoUrl();
                NewUserBattleCreator newUserBattleCreator = new NewUserBattleCreator(id2, str4, str5, photoUrl == null ? "" : photoUrl);
                if (match != null) {
                    long id3 = match.getId();
                    NewUserBattleLeagueModel league = match.getLeague();
                    if (league != null) {
                        Integer id4 = league.getId();
                        if (id4 != null) {
                            it = it2;
                            i = id4.intValue();
                        } else {
                            it = it2;
                            i = 0;
                        }
                        String photoUrl2 = league.getPhotoUrl();
                        str2 = str3;
                        String str6 = photoUrl2 == null ? "" : photoUrl2;
                        String name2 = league.getName();
                        if (name2 == null) {
                            name2 = "";
                        }
                        newUserBattleLeague = new NewUserBattleLeague(i, str6, name2);
                    } else {
                        str2 = str3;
                        it = it2;
                        newUserBattleLeague = new NewUserBattleLeague(0, "", "");
                    }
                    NewUserBattleLeague newUserBattleLeague2 = newUserBattleLeague;
                    NewUserBattleTeamModel awayTeam = match.getAwayTeam();
                    if (awayTeam != null) {
                        Integer id5 = awayTeam.getId();
                        int intValue = id5 != null ? id5.intValue() : 0;
                        String photoUrl3 = awayTeam.getPhotoUrl();
                        if (photoUrl3 == null) {
                            photoUrl3 = "";
                        }
                        String name3 = awayTeam.getName();
                        if (name3 == null) {
                            name3 = "";
                        }
                        newUserBattleTeam = new NewUserBattleTeam(intValue, photoUrl3, name3);
                    } else {
                        newUserBattleTeam = new NewUserBattleTeam(0, "", "");
                    }
                    NewUserBattleTeamModel homeTeam = match.getHomeTeam();
                    if (homeTeam != null) {
                        Integer id6 = homeTeam.getId();
                        int intValue2 = id6 != null ? id6.intValue() : 0;
                        String photoUrl4 = homeTeam.getPhotoUrl();
                        if (photoUrl4 == null) {
                            photoUrl4 = "";
                        }
                        String name4 = homeTeam.getName();
                        if (name4 == null) {
                            name4 = "";
                        }
                        newUserBattleTeam2 = new NewUserBattleTeam(intValue2, photoUrl4, name4);
                        z = false;
                    } else {
                        z = false;
                        newUserBattleTeam2 = new NewUserBattleTeam(0, "", "");
                    }
                    NewUserBattleSportModel sport = match.getSport();
                    if (sport != null) {
                        Integer id7 = sport.getId();
                        ?? intValue3 = id7 != null ? id7.intValue() : z;
                        String photoUrl5 = sport.getPhotoUrl();
                        String str7 = photoUrl5 == null ? "" : photoUrl5;
                        String name5 = sport.getName();
                        String str8 = name5 == null ? "" : name5;
                        String period = sport.getPeriod();
                        newUserBattleSport = new NewUserBattleSport(intValue3, str7, str8, period == null ? "" : period, sport.getPhotoBackground());
                    } else {
                        newUserBattleSport = new NewUserBattleSport(0, "", "", "", null);
                    }
                    Integer scoreAway = match.getScoreAway();
                    ?? intValue4 = scoreAway != null ? scoreAway.intValue() : z;
                    Integer scoreHome = match.getScoreHome();
                    ?? intValue5 = scoreHome != null ? scoreHome.intValue() : z;
                    String date = match.getDate();
                    String str9 = date == null ? "" : date;
                    Integer matchState = match.getMatchState();
                    ?? intValue6 = matchState != null ? matchState.intValue() : z;
                    String currentTime = match.getCurrentTime();
                    String str10 = currentTime == null ? "" : currentTime;
                    String currentPeriod = match.getCurrentPeriod();
                    newUserBattleMatch = new NewUserBattleMatch(id3, newUserBattleLeague2, newUserBattleTeam, newUserBattleTeam2, newUserBattleSport, intValue4, intValue5, str9, intValue6, currentPeriod == null ? "" : currentPeriod, str10, match.getResultRaw());
                } else {
                    str2 = str3;
                    it = it2;
                    z = z2;
                    newUserBattleMatch = null;
                }
                ChallengeState.NONE participantState = newUserBattleModel.getParticipantState();
                if (participantState == null) {
                    participantState = ChallengeState.NONE.INSTANCE;
                }
                arrayList.add(new NewUserBattleUiItem(id, moneyAccept, enterFee, moneyToWin, state, participantState, newUserBattleCreator, newUserBattleMatch));
                it2 = it;
                z2 = z;
                str3 = str2;
            }
            String str11 = str3;
            boolean z3 = z2;
            ArrayList arrayList2 = arrayList;
            if (userBattlesController.privateBattlesOffset == 0) {
                userBattlesController._privateBattles.setValue(arrayList2);
            } else {
                MutableStateFlow<List<NewUserBattleUiItem>> mutableStateFlow = userBattlesController._privateBattles;
                mutableStateFlow.setValue(CollectionsKt.plus((Collection) mutableStateFlow.getValue(), (Iterable) arrayList2));
            }
            userBattlesController._hasMorePrivateBattles.setValue(Boolean.valueOf(items.size() >= userBattlesController.battlesLimit ? true : z3));
            userBattlesController._battlesError.setValue(null);
            userBattlesController._canRetryBattles.setValue(false);
            Log.d(str11, "Private battles loaded: " + items.size() + ", limit: " + userBattlesController.battlesLimit + ", hasMore: " + userBattlesController._hasMorePrivateBattles.getValue() + ", current offset: " + userBattlesController.privateBattlesOffset);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.w("UserBattlesController", "Failed to load private battles: " + str);
        userBattlesController.handleBattlesError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void statsBattlesListener$lambda$20(UserBattlesController userBattlesController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        Integer id;
        FetchStat stat2;
        userBattlesController._isLoadMoreStatsBattles.setValue(false);
        userBattlesController._isBattlesLoading.setValue(false);
        if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat2 = fetchedResponseMessage.getStat()) == null) ? null : stat2.name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            BaseUserModel userModel = userBattlesController.getUserServiceP().getShortProfile().getUserModel();
            Long valueOf = (userModel == null || (id = userModel.getId()) == null) ? null : Long.valueOf(id.intValue());
            List<V7ChallengeDetailsResponseModel> items = ((V7UserBattlesHistoryResponseModel) fetchedResponseMessage.getModel()).getItems();
            if (items == null) {
                items = CollectionsKt.emptyList();
            }
            List<V7ChallengeDetailsResponseModel> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(V7ChallengeDetailsMapperKt.toHistoryBattle((V7ChallengeDetailsResponseModel) it.next(), valueOf));
            }
            ArrayList arrayList2 = arrayList;
            if (userBattlesController.statsBattlesOffset == 0) {
                userBattlesController._statsBattles.setValue(arrayList2);
                Integer num = userBattlesController.currentParticipantState;
                if (num == null) {
                    MutableStateFlow<Integer> mutableStateFlow = userBattlesController._totalItems;
                    Integer totalItems = ((V7UserBattlesHistoryResponseModel) fetchedResponseMessage.getModel()).getTotalItems();
                    mutableStateFlow.setValue(Integer.valueOf(totalItems != null ? totalItems.intValue() : 0));
                    Log.d("UserBattlesController", "Storing totalItems: " + ((V7UserBattlesHistoryResponseModel) fetchedResponseMessage.getModel()).getTotalItems() + " (no filter)");
                } else {
                    Log.d("UserBattlesController", "Skipping totalItems update (filtered load with participantState: " + num + ")");
                }
            } else {
                MutableStateFlow<List<NewUserBattleModel>> mutableStateFlow2 = userBattlesController._statsBattles;
                mutableStateFlow2.setValue(CollectionsKt.plus((Collection) mutableStateFlow2.getValue(), (Iterable) arrayList2));
            }
            userBattlesController._hasMoreStatsBattles.setValue(Boolean.valueOf(arrayList2.size() >= userBattlesController.battlesLimit));
            userBattlesController._battlesError.setValue(null);
            userBattlesController._canRetryBattles.setValue(false);
            Log.d("UserBattlesController", "Stats battles loaded: " + arrayList2.size() + ", limit: " + userBattlesController.battlesLimit + ", hasMore: " + userBattlesController._hasMoreStatsBattles.getValue() + ", current offset: " + userBattlesController.statsBattlesOffset + ", participantState: " + userBattlesController.currentParticipantState);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.w("UserBattlesController", "Failed to load stats battles: " + str);
        userBattlesController.handleBattlesError(str);
    }

    public final void loadAvailableBattles() {
        if (this._isBattlesLoading.getValue().booleanValue()) {
            return;
        }
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.availableBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserAvailableChallengesInteractor().load(this.availableBattlesListener, 0L, bundle);
    }

    public final void loadMoreAvailableBattles() {
        Log.d("UserBattlesController", "loadMoreAvailableBattles called - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreAvailableBattles.getValue());
        if (this._isBattlesLoading.getValue().booleanValue() || !this._hasMoreAvailableBattles.getValue().booleanValue()) {
            Log.d("UserBattlesController", "loadMoreAvailableBattles skipped - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreAvailableBattles.getValue());
        } else {
            this._isLoadMoreAvailableBattles.setValue(true);
            int i = this.availableBattlesOffset + this.battlesLimit;
            this.availableBattlesOffset = i;
            Log.d("UserBattlesController", "loadMoreAvailableBattles - new offset: " + i);
            loadAvailableBattles();
        }
    }

    public final void loadPrivateBattles() {
        if (this._isBattlesLoading.getValue().booleanValue()) {
            return;
        }
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.privateBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        getNewUserPrivateChallengesInteractor().load(this.privateBattlesListener, 0L, bundle);
    }

    public final void loadMorePrivateBattles() {
        Log.d("UserBattlesController", "loadMorePrivateBattles called - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMorePrivateBattles.getValue());
        if (this._isBattlesLoading.getValue().booleanValue() || !this._hasMorePrivateBattles.getValue().booleanValue()) {
            Log.d("UserBattlesController", "loadMorePrivateBattles skipped - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMorePrivateBattles.getValue());
        } else {
            this._isLoadMorePrivateBattles.setValue(true);
            int i = this.privateBattlesOffset + this.battlesLimit;
            this.privateBattlesOffset = i;
            Log.d("UserBattlesController", "loadMorePrivateBattles - new offset: " + i);
            loadPrivateBattles();
        }
    }

    public static /* synthetic */ void loadStatsBattles$default(UserBattlesController userBattlesController, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        userBattlesController.loadStatsBattles(num);
    }

    public final void loadStatsBattles(Integer participantState) {
        if (this._isBattlesLoading.getValue().booleanValue()) {
            return;
        }
        if (!Intrinsics.areEqual(this.currentParticipantState, participantState)) {
            this.statsBattlesOffset = 0;
            this._statsBattles.setValue(CollectionsKt.emptyList());
            this._hasMoreStatsBattles.setValue(true);
        }
        this.currentParticipantState = participantState;
        this._isBattlesLoading.setValue(true);
        Bundle bundle = new Bundle();
        bundle.putInt("offset", this.statsBattlesOffset);
        bundle.putInt(MatchMyBetsInteractor.PARAM_LIMIT, this.battlesLimit);
        bundle.putInt("participantState", participantState != null ? participantState.intValue() : 0);
        Log.d("UserBattlesController", "loadStatsBattles - offset: " + this.statsBattlesOffset + ", limit: " + this.battlesLimit + ", participantState: " + participantState);
        getNewUserChallengesHistoryInteractor().load(this.statsBattlesListener, 0L, bundle);
    }

    public final void loadMoreStatsBattles() {
        Log.d("UserBattlesController", "loadMoreStatsBattles called - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreStatsBattles.getValue());
        if (this._isBattlesLoading.getValue().booleanValue() || !this._hasMoreStatsBattles.getValue().booleanValue()) {
            Log.d("UserBattlesController", "loadMoreStatsBattles skipped - isLoading: " + this._isBattlesLoading.getValue() + ", hasMore: " + this._hasMoreStatsBattles.getValue());
        } else {
            this._isLoadMoreStatsBattles.setValue(true);
            int i = this.statsBattlesOffset + this.battlesLimit;
            this.statsBattlesOffset = i;
            Log.d("UserBattlesController", "loadMoreStatsBattles - new offset: " + i + ", participantState: " + this.currentParticipantState);
            loadStatsBattles(this.currentParticipantState);
        }
    }

    public static /* synthetic */ void acceptBattle$default(UserBattlesController userBattlesController, long j, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        userBattlesController.acceptBattle(j, l);
    }

    public final void acceptBattle(long battleId, Long matchId) {
        Log.d("UserBattlesController", "Accepting battle: " + battleId);
        if (matchId != null) {
            EventBus.getDefault().post(new OpenBetSelectionEvent(matchId.longValue(), Long.valueOf(battleId), null, null, null, 24, null));
            Log.d("UserBattlesController", "OpenBetSelectionEvent posted for battleId: " + battleId + ", matchId: " + matchId);
        } else {
            Log.e("UserBattlesController", "Battle not found or missing match data for battleId: " + battleId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openBattlePreview$default(UserBattlesController userBattlesController, long j, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        userBattlesController.openBattlePreview(j, list);
    }

    public final void openBattlePreview(long battleId, List<Long> challengeIds) {
        ArrayList arrayList = null;
        Log.d("UserBattlesController", "Opening battle preview with ID: " + battleId + ", list size: " + (challengeIds != null ? Integer.valueOf(challengeIds.size()) : null));
        EventBus eventBus = EventBus.getDefault();
        Integer valueOf = Integer.valueOf((int) battleId);
        if (challengeIds != null) {
            List<Long> list = challengeIds;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
            }
            arrayList = arrayList2;
        }
        eventBus.post(new OpenChallengePreviewDialog(valueOf, arrayList));
    }

    public final void loadBattleCounts() {
        if (this._isLoadingBattleCounts.getValue().booleanValue()) {
            return;
        }
        Log.d("UserBattlesController", "Loading battle counts");
        this._isLoadingBattleCounts.setValue(true);
        getNewUserBattleCountsInteractor().load(this.battleCountsListener, 0L, new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void battleCountsListener$lambda$25(UserBattlesController userBattlesController, FetchedResponseMessage fetchedResponseMessage) {
        String str;
        FetchStat stat;
        FetchStat stat2;
        userBattlesController._isLoadingBattleCounts.setValue(false);
        if (Intrinsics.areEqual((fetchedResponseMessage == null || (stat2 = fetchedResponseMessage.getStat()) == null) ? null : stat2.name(), "SUCCESS") && fetchedResponseMessage.getModel() != null) {
            List<BattleCountModel> list = (List) fetchedResponseMessage.getModel();
            Log.d("UserBattlesController", "Battle counts loaded: " + list.size());
            MutableStateFlow<List<BattleCountModel>> mutableStateFlow = userBattlesController._battleCounts;
            Intrinsics.checkNotNull(list);
            mutableStateFlow.setValue(list);
            return;
        }
        if (fetchedResponseMessage == null || (stat = fetchedResponseMessage.getStat()) == null || (str = stat.name()) == null) {
            str = "Unknown error";
        }
        Log.e("UserBattlesController", "Failed to load battle counts: " + str);
    }

    public final int getCountForState(Integer state) {
        Object obj;
        if (state == null) {
            return this._totalItems.getValue().intValue();
        }
        Iterator<T> it = this._battleCounts.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int state2 = ((BattleCountModel) obj).getState();
            if (state != null && state2 == state.intValue()) {
                break;
            }
        }
        BattleCountModel battleCountModel = (BattleCountModel) obj;
        if (battleCountModel != null) {
            return battleCountModel.getCount();
        }
        return 0;
    }

    private final void handleBattlesError(String errorMessage) {
        Log.e("UserBattlesController", "Battles error: " + errorMessage);
        this._isBattlesLoading.setValue(false);
        this._isLoadMoreAvailableBattles.setValue(false);
        this._isLoadMorePrivateBattles.setValue(false);
        this._isLoadMoreStatsBattles.setValue(false);
        String str = errorMessage;
        boolean z = StringsKt.contains((CharSequence) str, (CharSequence) "timeout", true) || StringsKt.contains((CharSequence) str, (CharSequence) "connection", true) || StringsKt.contains((CharSequence) str, (CharSequence) "network", true) || StringsKt.contains((CharSequence) str, (CharSequence) "NO_CONNECTION", true);
        this._battlesError.setValue(errorMessage);
        this._canRetryBattles.setValue(Boolean.valueOf(z));
        Log.d("UserBattlesController", "Error handled - retryable: " + z);
    }

    public final void retryBattles() {
        if (!this._canRetryBattles.getValue().booleanValue()) {
            Log.d("UserBattlesController", "Retry not available");
            return;
        }
        Log.d("UserBattlesController", "Retrying battles loading");
        this._battlesError.setValue(null);
        this._canRetryBattles.setValue(false);
        refreshAllBattles();
    }

    public final void clearBattlesError() {
        this._battlesError.setValue(null);
        this._canRetryBattles.setValue(false);
    }
}
